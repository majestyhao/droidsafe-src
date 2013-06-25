package droidsafe.android.app;


import droidsafe.main.Config;
import droidsafe.main.Main;
import droidsafe.main.SootConfig;

import droidsafe.utils.Utils;

import java.io.File;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.SootClass;

/** 
 * Represent an Android project including the source files, resource files,
 * android manifest, etc.
 * 
 * @author mgordon
 *
 */
public class Project {
    /** Logger field */
    private static final Logger logger = LoggerFactory.getLogger(Project.class);
    /** relative directory (from app home) of application source */
    public static final String SRC_DIR = "src";
    /** relative directory (from app home) of compiled classes */
    public static final String CLASSES_DIR = "bin" + File.separator + "classes";
    /** relative directory (from app home) of included jar libraries */
    public static final String LIBS_DIR = "libs";
    /** relative directory (from app home) of resources xml files */
    public static final String RES_DIR = "res";
    /** relative directory (from app home) of generated java files */
    public static final String GEN_DIR = "gen";
    /** relative directory (from app home) of  layout xml files */
    public static final String LAYOUTS_DIR = RES_DIR + File.separator + "layout";
    /** relative directory (from app home) of manifest */
    public static final String MANIFEST_FILE = "AndroidManifest.xml";
    /** relative directory (from app home) of droidsafe output */
    public static final String OUTPUT_DIR = "droidsafe-gen";
    /** singleton for this class */
    private static final Project project;
    /** File object for application source directory */
    private File appSrcDir;
    /** File object for generated classes directory */
    private File appClassesDir;
    /** File object for included libraries directory */
    private File appLibDir;
    /** File object for generated droidsafe output directory */
    private File outputDir;
    /** File object for android generated java files (from xml resources) */
    private File appGenDir;
    /** Set of all src class names (fully qualified) */
    private Set<String> srcClasses;
    /** Set of all lib class names (fully qualified) */
    private Set<String> libClasses = new LinkedHashSet<String>();

    /** Set of all gen class names (fully qualified) */
    private Set<String> genClasses;
    /** Class loader for loading modeled classes */
    private ClassLoader javaAppClassLoader;

    static {
        project = new Project();
    }

    /**
     * Return the singleton project object the current run of DroidSafe.
     */
    public static Project v() {
        return project;
    }

    /**
     * Initialize the Project object by creating File objects and directories
     */
    public void init() {
        this.appSrcDir = new File(Config.v().APP_ROOT_DIR + File.separator + SRC_DIR);

        this.appClassesDir = new File(Config.v().APP_ROOT_DIR + File.separator + CLASSES_DIR);
        logger.info("Setting application class directory to {}.", appClassesDir.toString());
        if (!this.appClassesDir.exists()) {
            logger.error("Project not configured properly. Directory does not exist: " + this.appClassesDir);
            System.exit(1);
        }

        this.appLibDir = new File(Config.v().APP_ROOT_DIR + File.separator + LIBS_DIR);

        this.appGenDir = new File(Config.v().APP_ROOT_DIR + File.separator + GEN_DIR);

        this.outputDir = new File(getOutputDir());
        if (!outputDir.exists()) {
            try {
                outputDir.mkdirs();
            } catch (Exception e) {
                logger.error("Cannot create output directory", e);
                System.exit(1);
            }
        }

        setSrcClasses();
        setLibClasses();
        setGenClasses();

        createJavaClassLoader();
    }

    /** 
     * Returns the java.lang.class for an application class, represented by string s.
     */
    public Class<?> getAppJavaClass(String s) throws ClassNotFoundException {
        return javaAppClassLoader.loadClass(s);
    }

    /**
     * Initialize the java class loader used to load application classes
     */
    private void createJavaClassLoader() {
        List<URL> urls = new ArrayList<URL>();
        try {
            File classesDir = new File(Config.v().APP_ROOT_DIR, CLASSES_DIR);
            urls.add(classesDir.toURI().toURL());
            File androidJar = new File(Config.v().ANDROID_LIB_DIR, Config.v().ANDROID_JAR);
            urls.add(androidJar.toURI().toURL());
            for(File f : getAppLibJars()) {
                urls.add(f.toURI().toURL());
            }
        } catch(MalformedURLException e) {
            logger.error("Encountered a malformed url when creating java class laoder for application: {}", e);
            System.exit(1);
        }
        javaAppClassLoader = new URLClassLoader(urls.toArray(new URL[0]));
    }

    /** 
     * Load the app's src and lib classes into soot scene. 
     */
    public void loadClasses() {
        //load into soot the src classes and lib jars classes
        SootConfig.loadAppClasses(getSrcClasses());
        SootConfig.loadAppClasses(getLibClasses());
    }

    /**
     * Add all classes from in bin/classes to the appClasses
     */
    private void setSrcClasses() {
        srcClasses = new LinkedHashSet<String>();
        for (File clazz : FileUtils.listFiles(this.appClassesDir, new String[]{"class"}, true)) {

            String clzName = 
                    Utils.fromFileToClass(clazz.toString().substring(this.appClassesDir.toString().length() + 1));
            logger.info("Application class: {}", clzName);
            srcClasses.add(clzName);
        }
    }

    /**
     * Scan the gen directory for generated classes of the android build.
     */
    private void setGenClasses() {
        genClasses = new LinkedHashSet<String>();
        for (File clazz : FileUtils.listFiles(this.appGenDir, new String[]{"class"}, true)) {

            String clzName = Utils.fromFileToClass(clazz.toString().substring(this.appGenDir.toString().length() + 1));
            logger.info("Generated class: {}", clzName);
            genClasses.add(clzName);
        }
    }

    /**
     * Add all classes from any jar files into the set for library classes.
     */
    private void setLibClasses() {
        for (File f : getAppLibJars()) {
            JarFile jarFile = null;
            try {
                jarFile = new JarFile(f);
            } catch (IOException e1) {
                logger.error("Error opening jar file", e1);
                System.exit(1);
            }

            for (Enumeration<JarEntry> e = jarFile.entries() ; e.hasMoreElements() ;) {
                JarEntry entry = e.nextElement();
                if (!entry.getName().endsWith(".class"))
                    continue;

                libClasses.add(Utils.fromFileToClass(entry.getName()));
            }
        }
    }

    /**
     * Return the application's library directory. 
     */
    public File getAppLibDir() {
        return appLibDir;
    }

    /**
     * Returns a collection of files, one for each of the jar files in the app's lib folder
     */
    public Collection<File> getAppLibJars() {
        Collection<File> appLibJars = new ArrayList<File>();
        if (this.appLibDir.exists())
            appLibJars = FileUtils.listFiles(this.appLibDir, new String[]{"jar"}, true);
        return appLibJars;
    }

    /**
     * Return the application's source directory. 
     */
    public File getAppSrcDir() {
        return appSrcDir;
    }
    
    /**
     * Return the application's compiled classes directory. 
     */
    public File getAppClassesDir() {
        return appClassesDir;
    }

    /**
     * Return the droidsafe output directory for this run. 
     */
    public String getOutputDir() {
        return Config.v().APP_ROOT_DIR + File.separator + OUTPUT_DIR;
    }

    /**
     * Return set of all classes defined in the all jar files 
     * in the libs directory of the application.
     */
    public Set<String> getLibClasses() {
        return libClasses;
    }

    /**
     * Return true if arg class name is a class from a jar file located
     * in the libs directory of the application. 
     */
    public boolean isLibClass(String clz) {
        return libClasses.contains(clz);
    }

    /**
     * Return true if arg class name is a class from a jar file located
     * in the libs directory of the application. 
     */
    public boolean isLibClass(SootClass clz) {
        return libClasses.contains(clz.getName());
    }

    /**
     * Return true if the class was loaded from the application src/ directory.
     * 
     * @param clz
     * @return
     */
    public boolean isSrcClass(String clz) {
        return srcClasses.contains(clz);
    }

    /**
     * Return true if the class was loaded from the application src/ directory.
     * 
     * @param clz
     * @return
     */
    public boolean isSrcClass(SootClass clz) {
        return srcClasses.contains(clz.getName());
    }

    /**
     * Return set of all classes defined in bin/classes of app.
     */
    public Set<String> getSrcClasses() {
        return srcClasses;
    }

    /**
     * Return true if this class is defined in gen/ directory of android application. 
     */
    public boolean isGenClass(String clz) {
        return genClasses.contains(clz);
    }
}
