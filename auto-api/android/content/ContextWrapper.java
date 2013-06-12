package android.content;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ContextWrapper extends Context {
    Context mBase;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.285 -0400", hash_original_method = "10030D2DB2A8F36EE12AB3354BCBF9E2", hash_generated_method = "88F3FF385AF7AB6AF727F0787FD743CE")
    @DSModeled(DSC.SAFE)
    public ContextWrapper(Context base) {
        dsTaint.addTaint(base.dsTaint);
        // ---------- Original Method ----------
        //mBase = base;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.296 -0400", hash_original_method = "C93782FE26B0F4F6F9B761D03AD74E79", hash_generated_method = "E462716CDD9481F2F565EF51AC66E8CC")
    @DSModeled(DSC.SAFE)
    protected void attachBaseContext(Context base) {
        dsTaint.addTaint(base.dsTaint);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Base context already set");
        } //End block
        // ---------- Original Method ----------
        //if (mBase != null) {
            //throw new IllegalStateException("Base context already set");
        //}
        //mBase = base;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.302 -0400", hash_original_method = "348D9A1AC27363C49C4D9EF878F36A33", hash_generated_method = "DBA18414DB140026966A0E3645556039")
    @DSModeled(DSC.SAFE)
    public Context getBaseContext() {
        return (Context)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase;
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public AssetManager getAssets() {
        AssetManager var4F205B831168D2859D757D1E92DDBB14_667621800 = (mBase.getAssets());
        return (AssetManager)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getAssets();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Resources getResources() {
        Resources var60B9A655590DD2DA32D8FC5248D54CA3_1198767204 = (mBase.getResources());
        return (Resources)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getResources();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public PackageManager getPackageManager() {
        PackageManager varCD60AACF723DE7FEF0F28834B33D3788_1869701394 = (mBase.getPackageManager());
        return (PackageManager)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getPackageManager();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public ContentResolver getContentResolver() {
        ContentResolver varDEC45C6FE41EA3E170F078DAEF66DE75_408971528 = (mBase.getContentResolver());
        return (ContentResolver)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getContentResolver();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Looper getMainLooper() {
        Looper var69ADB12DA7C17482EA26ED5BC8C6D811_1388575056 = (mBase.getMainLooper());
        return (Looper)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getMainLooper();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Context getApplicationContext() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Context var1360198B75C4FA904434BC0D8AA48CBD_756186148 = (mBase.getApplicationContext());
        return (Context)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getApplicationContext();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.337 -0400", hash_original_method = "52BC053E8452DD327B93F4A2F04B45DF", hash_generated_method = "3710187D8430F12D07995B146903DB08")
    @DSModeled(DSC.SAFE)
    @Override
    public void setTheme(int resid) {
        dsTaint.addTaint(resid);
        mBase.setTheme(resid);
        // ---------- Original Method ----------
        //mBase.setTheme(resid);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int getThemeResId() {
        int var7AC95F797AB08594A077B70F1A8CCEE7_1128288863 = (mBase.getThemeResId());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.getThemeResId();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Resources.Theme getTheme() {
        Resources.Theme varCF49010CA6154F28DEA5BFC80231478F_804717380 = (mBase.getTheme());
        return (Resources.Theme)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getTheme();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.361 -0400", hash_original_method = "325690D530E21A0AB255EE9D69D84488", hash_generated_method = "9CF6E4387982011CAC72C549C60C52AE")
    @DSModeled(DSC.BAN)
    @Override
    public ClassLoader getClassLoader() {
        ClassLoader var7430431A6894715AAF16CE61CB881D98_235410863 = (mBase.getClassLoader());
        return (ClassLoader)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getClassLoader();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public String getPackageName() {
        String var1A9937FA3520EB03A15C4381B3409B5F_1139831904 = (mBase.getPackageName());
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return mBase.getPackageName();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public ApplicationInfo getApplicationInfo() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        ApplicationInfo varE1D800969C3C6EC770932C1F17EFA6A9_2123518680 = (mBase.getApplicationInfo());
        return (ApplicationInfo)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getApplicationInfo();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public String getPackageResourcePath() {
        String var4C5A6FC4F8E3F88190DD89206BADAC65_712790399 = (mBase.getPackageResourcePath());
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return mBase.getPackageResourcePath();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public String getPackageCodePath() {
        String var9B9AFA1AA59E35100E3DF4494362FD51_1261807587 = (mBase.getPackageCodePath());
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return mBase.getPackageCodePath();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getSharedPrefsFile(String name) {
        dsTaint.addTaint(name);
        File var8A06EA91FF6F284659309A032DBCD73C_500863825 = (mBase.getSharedPrefsFile(name));
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getSharedPrefsFile(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        dsTaint.addTaint(name);
        dsTaint.addTaint(mode);
        SharedPreferences var7D2609DAE3A4A43B5E3F15D3F4A1D1FF_2039846636 = (mBase.getSharedPreferences(name, mode));
        return (SharedPreferences)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getSharedPreferences(name, mode);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        dsTaint.addTaint(name);
        FileInputStream varAEE276D082FE5465128DC98EAEC46E86_916449040 = (mBase.openFileInput(name));
        return (FileInputStream)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.openFileInput(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        dsTaint.addTaint(name);
        dsTaint.addTaint(mode);
        FileOutputStream varADDD7477690DD865F8C44D7D268648FB_345668602 = (mBase.openFileOutput(name, mode));
        return (FileOutputStream)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.openFileOutput(name, mode);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public boolean deleteFile(String name) {
        dsTaint.addTaint(name);
        boolean var14AF3FE5F23FD23E2C2EAF5A63873DB5_1773119586 = (mBase.deleteFile(name));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.deleteFile(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getFileStreamPath(String name) {
        dsTaint.addTaint(name);
        File var84B977E1CCD82A335554E38A2600337F_881713125 = (mBase.getFileStreamPath(name));
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getFileStreamPath(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public String[] fileList() {
        String[] var6F5381480E894ED954B172672A6FA14B_1572906785 = (mBase.fileList());
        String[] retVal = new String[1];
        retVal[0] = dsTaint.getTaintString();
        return retVal;
        // ---------- Original Method ----------
        //return mBase.fileList();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getFilesDir() {
        File var2CFDC4BB999665F0BBA4730F0B3F0945_1255991736 = (mBase.getFilesDir());
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getFilesDir();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getExternalFilesDir(String type) {
        dsTaint.addTaint(type);
        File varE984D8D8897547BB06108DF498D8FC99_2145132110 = (mBase.getExternalFilesDir(type));
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getExternalFilesDir(type);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getObbDir() {
        File varBDCEE8F1E697C5B5E6F123C95A6F2A0E_1742951391 = (mBase.getObbDir());
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getObbDir();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getCacheDir() {
        File var88100E6CE907B25E04CE4973DFCCEF34_30414582 = (mBase.getCacheDir());
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getCacheDir();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getExternalCacheDir() {
        File var2215BD8324C8F0EAC132C1771A7246CC_2057989738 = (mBase.getExternalCacheDir());
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getExternalCacheDir();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getDir(String name, int mode) {
        dsTaint.addTaint(name);
        dsTaint.addTaint(mode);
        File var385F4B6E0DA02AFF9DB74FC3D54CA9CD_860649228 = (mBase.getDir(name, mode));
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getDir(name, mode);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory) {
        dsTaint.addTaint(name);
        dsTaint.addTaint(factory.dsTaint);
        dsTaint.addTaint(mode);
        SQLiteDatabase var241540ABF655844395772919923CD9EE_2137416503 = (mBase.openOrCreateDatabase(name, mode, factory));
        return (SQLiteDatabase)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.openOrCreateDatabase(name, mode, factory);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory,
            DatabaseErrorHandler errorHandler) {
        dsTaint.addTaint(name);
        dsTaint.addTaint(errorHandler.dsTaint);
        dsTaint.addTaint(factory.dsTaint);
        dsTaint.addTaint(mode);
        SQLiteDatabase var5135080D1419AC5FB2EA75CBF36D7927_190596352 = (mBase.openOrCreateDatabase(name, mode, factory, errorHandler));
        return (SQLiteDatabase)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public boolean deleteDatabase(String name) {
        dsTaint.addTaint(name);
        boolean var1201E6487C2E2ECBC3C1937591CAB600_564524395 = (mBase.deleteDatabase(name));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.deleteDatabase(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public File getDatabasePath(String name) {
        dsTaint.addTaint(name);
        File var856BDB13BABFDCB220C430BD539CC0A6_251968758 = (mBase.getDatabasePath(name));
        return (File)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getDatabasePath(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public String[] databaseList() {
        String[] varA00359C0AE769853BC15D43D5F05C2EE_632453609 = (mBase.databaseList());
        String[] retVal = new String[1];
        retVal[0] = dsTaint.getTaintString();
        return retVal;
        // ---------- Original Method ----------
        //return mBase.databaseList();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Drawable getWallpaper() {
        Drawable var7166B67D63CFB5E5C8537F137DA6DC9B_619787539 = (mBase.getWallpaper());
        return (Drawable)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getWallpaper();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Drawable peekWallpaper() {
        Drawable var9C8138D14C291AE0750CAA786DCA3915_1353400230 = (mBase.peekWallpaper());
        return (Drawable)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.peekWallpaper();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int getWallpaperDesiredMinimumWidth() {
        int varAADE4DC8942D82E82A9B42B92539E4A5_1469471516 = (mBase.getWallpaperDesiredMinimumWidth());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.getWallpaperDesiredMinimumWidth();
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int getWallpaperDesiredMinimumHeight() {
        int varB7C2E2DEB0713543A3A0442CBAC5C5E5_1667784589 = (mBase.getWallpaperDesiredMinimumHeight());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.getWallpaperDesiredMinimumHeight();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.459 -0400", hash_original_method = "A836F480E829D8C861FB92C4C9146FF3", hash_generated_method = "52C23E6115FA9C80A00D4F80FCAE93A1")
    @DSModeled(DSC.SAFE)
    @Override
    public void setWallpaper(Bitmap bitmap) throws IOException {
        dsTaint.addTaint(bitmap.dsTaint);
        mBase.setWallpaper(bitmap);
        // ---------- Original Method ----------
        //mBase.setWallpaper(bitmap);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.464 -0400", hash_original_method = "D6DB0F01F771FA9EFE610782CC61AF10", hash_generated_method = "8E227CB7CCF4DB962C80026783083612")
    @DSModeled(DSC.SAFE)
    @Override
    public void setWallpaper(InputStream data) throws IOException {
        dsTaint.addTaint(data.dsTaint);
        mBase.setWallpaper(data);
        // ---------- Original Method ----------
        //mBase.setWallpaper(data);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.472 -0400", hash_original_method = "707333CAD350B1F9359277B8D6F8C031", hash_generated_method = "8E57A440DAEF5C7E7767E960CEA90CC6")
    @DSModeled(DSC.SAFE)
    @Override
    public void clearWallpaper() throws IOException {
        mBase.clearWallpaper();
        // ---------- Original Method ----------
        //mBase.clearWallpaper();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.477 -0400", hash_original_method = "130F62140951A945508EBFB32B94A765", hash_generated_method = "FE6C42C0904F0F764804E93FCCD04FCC")
    @DSModeled(DSC.SPEC)
    @Override
    public void startActivity(Intent intent) {
        dsTaint.addTaint(intent.dsTaint);
        mBase.startActivity(intent);
        // ---------- Original Method ----------
        //mBase.startActivity(intent);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@DSModeled(DSC.SAFE)
    @Override
    public void startActivities(Intent[] intents) {
        dsTaint.addTaint(intents[0].dsTaint);
        mBase.startActivities(intents);
        // ---------- Original Method ----------
        //mBase.startActivities(intents);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.484 -0400", hash_original_method = "D7C74DA04A5B79EC6630FAD526B70ED6", hash_generated_method = "18015FC0F9A5CCF7A441558F06EF40AB")
    @DSModeled(DSC.SPEC)
    @Override
    public void startIntentSender(IntentSender intent,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        dsTaint.addTaint(flagsMask);
        dsTaint.addTaint(flagsValues);
        dsTaint.addTaint(extraFlags);
        dsTaint.addTaint(intent.dsTaint);
        dsTaint.addTaint(fillInIntent.dsTaint);
        mBase.startIntentSender(intent, fillInIntent, flagsMask,
                flagsValues, extraFlags);
        // ---------- Original Method ----------
        //mBase.startIntentSender(intent, fillInIntent, flagsMask,
                //flagsValues, extraFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.489 -0400", hash_original_method = "CD7D57CF51FEE3E0548133C9C2D084D1", hash_generated_method = "CC2C56FEA5AFE20C24709BA41869ADA9")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendBroadcast(Intent intent) {
        dsTaint.addTaint(intent.dsTaint);
        mBase.sendBroadcast(intent);
        // ---------- Original Method ----------
        //mBase.sendBroadcast(intent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.495 -0400", hash_original_method = "0D532949C3012CD33C142E9B5D03BB61", hash_generated_method = "5A466BD0CA77A25B9D4C867515D5E144")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {
        dsTaint.addTaint(receiverPermission);
        dsTaint.addTaint(intent.dsTaint);
        mBase.sendBroadcast(intent, receiverPermission);
        // ---------- Original Method ----------
        //mBase.sendBroadcast(intent, receiverPermission);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.506 -0400", hash_original_method = "F587D697CC21A22CF1C16322E48A38D4", hash_generated_method = "A34EC3EEFF44FD77E99BD2077F0F5743")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendOrderedBroadcast(Intent intent,
            String receiverPermission) {
        dsTaint.addTaint(receiverPermission);
        dsTaint.addTaint(intent.dsTaint);
        mBase.sendOrderedBroadcast(intent, receiverPermission);
        // ---------- Original Method ----------
        //mBase.sendOrderedBroadcast(intent, receiverPermission);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.519 -0400", hash_original_method = "DEE55BD129D883E4F2F6F72EA9382082", hash_generated_method = "9D64BE8E177A36EF8566AFB9974E5DDD")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendOrderedBroadcast(
        Intent intent, String receiverPermission, BroadcastReceiver resultReceiver,
        Handler scheduler, int initialCode, String initialData,
        Bundle initialExtras) {
        dsTaint.addTaint(receiverPermission);
        dsTaint.addTaint(scheduler.dsTaint);
        dsTaint.addTaint(initialExtras.dsTaint);
        dsTaint.addTaint(resultReceiver.dsTaint);
        dsTaint.addTaint(intent.dsTaint);
        dsTaint.addTaint(initialCode);
        dsTaint.addTaint(initialData);
        mBase.sendOrderedBroadcast(intent, receiverPermission,
                resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
        // ---------- Original Method ----------
        //mBase.sendOrderedBroadcast(intent, receiverPermission,
                //resultReceiver, scheduler, initialCode,
                //initialData, initialExtras);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.524 -0400", hash_original_method = "E4D0FD66C31D49EF8A28B259CA31F5AB", hash_generated_method = "6CCC204AADF36C20A11F3D0E2465A773")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendStickyBroadcast(Intent intent) {
        dsTaint.addTaint(intent.dsTaint);
        mBase.sendStickyBroadcast(intent);
        // ---------- Original Method ----------
        //mBase.sendStickyBroadcast(intent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.533 -0400", hash_original_method = "7E21CD2A51D6CF22EBBD91300928AE98", hash_generated_method = "E1D1C57F5D6CDB5ABDEDFC93BEB13B41")
    @DSModeled(DSC.SPEC)
    @Override
    public void sendStickyOrderedBroadcast(
        Intent intent, BroadcastReceiver resultReceiver,
        Handler scheduler, int initialCode, String initialData,
        Bundle initialExtras) {
        dsTaint.addTaint(scheduler.dsTaint);
        dsTaint.addTaint(initialExtras.dsTaint);
        dsTaint.addTaint(resultReceiver.dsTaint);
        dsTaint.addTaint(intent.dsTaint);
        dsTaint.addTaint(initialCode);
        dsTaint.addTaint(initialData);
        mBase.sendStickyOrderedBroadcast(intent,
                resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
        // ---------- Original Method ----------
        //mBase.sendStickyOrderedBroadcast(intent,
                //resultReceiver, scheduler, initialCode,
                //initialData, initialExtras);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.537 -0400", hash_original_method = "F6F4D7B74D392C087E12FF2E322B2B45", hash_generated_method = "562CFE3F41EFC674B96C5FF055ABC147")
    @DSModeled(DSC.SPEC)
    @Override
    public void removeStickyBroadcast(Intent intent) {
        dsTaint.addTaint(intent.dsTaint);
        mBase.removeStickyBroadcast(intent);
        // ---------- Original Method ----------
        //mBase.removeStickyBroadcast(intent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.542 -0400", hash_original_method = "D33A933E89CAAB59BCB5CB9CA20F9A5A", hash_generated_method = "2FC2911B0FF953D7E0E86C0412C4B7A0")
    @DSModeled(DSC.SPEC)
    @Override
    public Intent registerReceiver(
        BroadcastReceiver receiver, IntentFilter filter) {
        //DSFIXME: CODE0010: Possible callback registration function detected
        dsTaint.addTaint(receiver.dsTaint);
        dsTaint.addTaint(filter.dsTaint);
        Intent var890901CBB2C421F45947910AA3405EFB_841246827 = (mBase.registerReceiver(receiver, filter));
        return (Intent)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.registerReceiver(receiver, filter);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.548 -0400", hash_original_method = "C498ADCED351E80E96A53362B4745838", hash_generated_method = "ED4AEA9151CFD5BC763F27B5EF5102FF")
    @DSModeled(DSC.SPEC)
    @Override
    public Intent registerReceiver(
        BroadcastReceiver receiver, IntentFilter filter,
        String broadcastPermission, Handler scheduler) {
        //DSFIXME: CODE0010: Possible callback registration function detected
        dsTaint.addTaint(broadcastPermission);
        dsTaint.addTaint(receiver.dsTaint);
        dsTaint.addTaint(scheduler.dsTaint);
        dsTaint.addTaint(filter.dsTaint);
        Intent var1A5E9A47B3981BD24574530A7F5F54B2_1269973992 = (mBase.registerReceiver(receiver, filter, broadcastPermission,
                scheduler));
        return (Intent)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.registerReceiver(receiver, filter, broadcastPermission,
                //scheduler);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.552 -0400", hash_original_method = "D3936D1C8F9D43BCF113D4D92126FE25", hash_generated_method = "3FCF3DA73C9E595CC01351C02818950C")
    @DSModeled(DSC.SAFE)
    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        //DSFIXME: CODE0010: Possible callback registration function detected
        dsTaint.addTaint(receiver.dsTaint);
        mBase.unregisterReceiver(receiver);
        // ---------- Original Method ----------
        //mBase.unregisterReceiver(receiver);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.557 -0400", hash_original_method = "460FA5078659EEF29B84A9C36C1BA43F", hash_generated_method = "111B11FE5FA07CE24BAC3B4F3D89BB73")
    @DSModeled(DSC.SPEC)
    @Override
    public ComponentName startService(Intent service) {
        dsTaint.addTaint(service.dsTaint);
        ComponentName var1BF8FF46BC5C825890F8DFD41D7ECEC1_1878193792 = (mBase.startService(service));
        return (ComponentName)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.startService(service);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.564 -0400", hash_original_method = "2538E8D6E7BE6E9AB177EECCCE1CB620", hash_generated_method = "F04CE88A219CB97FCEE403691104632C")
    @DSModeled(DSC.SPEC)
    @Override
    public boolean stopService(Intent name) {
        dsTaint.addTaint(name.dsTaint);
        boolean var79E09432295B6E81E775BAA1429D1742_767340949 = (mBase.stopService(name));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.stopService(name);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.569 -0400", hash_original_method = "67132A5BC1B8EF0B15B0E872390898A0", hash_generated_method = "4230EE099185DFEA336598BEC9482880")
    @DSModeled(DSC.SPEC)
    @Override
    public boolean bindService(Intent service, ServiceConnection conn,
            int flags) {
        dsTaint.addTaint(conn.dsTaint);
        dsTaint.addTaint(flags);
        dsTaint.addTaint(service.dsTaint);
        boolean varB449E6D6F4ECBAA56F7BEB7D0560F07C_1677327805 = (mBase.bindService(service, conn, flags));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.bindService(service, conn, flags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.575 -0400", hash_original_method = "78D7D650BB4D5279C2DB8316AB02503B", hash_generated_method = "1E65FD6FEC2D145EA4A94E1EC92E0DCB")
    @DSModeled(DSC.SAFE)
    @Override
    public void unbindService(ServiceConnection conn) {
        dsTaint.addTaint(conn.dsTaint);
        mBase.unbindService(conn);
        // ---------- Original Method ----------
        //mBase.unbindService(conn);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public boolean startInstrumentation(ComponentName className,
            String profileFile, Bundle arguments) {
        dsTaint.addTaint(arguments.dsTaint);
        dsTaint.addTaint(className.dsTaint);
        dsTaint.addTaint(profileFile);
        boolean var7847DE7C5C74BB7E9D8EF837B1629B88_934580682 = (mBase.startInstrumentation(className, profileFile, arguments));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.startInstrumentation(className, profileFile, arguments);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Object getSystemService(String name) {
        dsTaint.addTaint(name);
        Object var775837DC306FA3421E42286960084F37_812597782 = (mBase.getSystemService(name));
        return (Object)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.getSystemService(name);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int checkPermission(String permission, int pid, int uid) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(permission);
        dsTaint.addTaint(pid);
        int var0B5D93936231AC00BB3EB885AB5DD216_1850190129 = (mBase.checkPermission(permission, pid, uid));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkPermission(permission, pid, uid);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int checkCallingPermission(String permission) {
        dsTaint.addTaint(permission);
        int var085AD305D9EE5D54D148F8FAB5BCD242_735104171 = (mBase.checkCallingPermission(permission));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkCallingPermission(permission);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public int checkCallingOrSelfPermission(String permission) {
        dsTaint.addTaint(permission);
        int var74DBDAA10225909C76130339398AA057_1778063717 = (mBase.checkCallingOrSelfPermission(permission));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkCallingOrSelfPermission(permission);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.585 -0400", hash_original_method = "62A2576537CC71D60C1F63F5056773AE", hash_generated_method = "A3963E3358F21AC4E0F465610E3C243F")
    @DSModeled(DSC.SAFE)
    @Override
    public void enforcePermission(
            String permission, int pid, int uid, String message) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(message);
        dsTaint.addTaint(permission);
        dsTaint.addTaint(pid);
        mBase.enforcePermission(permission, pid, uid, message);
        // ---------- Original Method ----------
        //mBase.enforcePermission(permission, pid, uid, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.601 -0400", hash_original_method = "81E2CA4E96042AEDAEF02FD92A2A1A67", hash_generated_method = "9A9A534522EAC3C868932783FF0D4A00")
    @DSModeled(DSC.SAFE)
    @Override
    public void enforceCallingPermission(String permission, String message) {
        dsTaint.addTaint(message);
        dsTaint.addTaint(permission);
        mBase.enforceCallingPermission(permission, message);
        // ---------- Original Method ----------
        //mBase.enforceCallingPermission(permission, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.623 -0400", hash_original_method = "4C72B3FC5896AFE13143126AEF9E54CC", hash_generated_method = "29DE7985B4DE7F751C18674324E7FACC")
    @DSModeled(DSC.SAFE)
    @Override
    public void enforceCallingOrSelfPermission(
            String permission, String message) {
        dsTaint.addTaint(message);
        dsTaint.addTaint(permission);
        mBase.enforceCallingOrSelfPermission(permission, message);
        // ---------- Original Method ----------
        //mBase.enforceCallingOrSelfPermission(permission, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.637 -0400", hash_original_method = "C92445D33E31E73A915DF30F0CA49E37", hash_generated_method = "530152735D33B0E06B2032B95D71F882")
    @DSModeled(DSC.SPEC)
    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(toPackage);
        dsTaint.addTaint(uri.dsTaint);
        mBase.grantUriPermission(toPackage, uri, modeFlags);
        // ---------- Original Method ----------
        //mBase.grantUriPermission(toPackage, uri, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.641 -0400", hash_original_method = "10A2FB283E31FE469317FAE71C7AF4F8", hash_generated_method = "E084722AA7E904A38219A9017575DBAA")
    @DSModeled(DSC.SPEC)
    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(uri.dsTaint);
        mBase.revokeUriPermission(uri, modeFlags);
        // ---------- Original Method ----------
        //mBase.revokeUriPermission(uri, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.648 -0400", hash_original_method = "F52277BFC8F41FE72798C9E8418C1E24", hash_generated_method = "0F8AC14397C75C94047596F05EE09883")
    @DSModeled(DSC.SPEC)
    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(pid);
        dsTaint.addTaint(uri.dsTaint);
        int var4BA59D5FCB145B56552A926363D08843_1395434336 = (mBase.checkUriPermission(uri, pid, uid, modeFlags));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkUriPermission(uri, pid, uid, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.655 -0400", hash_original_method = "43D2E9446750BEAA21B381D934BB37A3", hash_generated_method = "2983883C170C2E18A823CEFD5D30A1B8")
    @DSModeled(DSC.SPEC)
    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(uri.dsTaint);
        int var32F95911BC4A7B4DB8535C3F25E383D2_473332960 = (mBase.checkCallingUriPermission(uri, modeFlags));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkCallingUriPermission(uri, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.660 -0400", hash_original_method = "4761F75E9F6B51877289AE555068D313", hash_generated_method = "C6B53E0FC6F57663AEB71B914932AD40")
    @DSModeled(DSC.SPEC)
    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(uri.dsTaint);
        int varBF497F120043DE15F7549BECCC4FD74C_1990603681 = (mBase.checkCallingOrSelfUriPermission(uri, modeFlags));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.665 -0400", hash_original_method = "2B7D942FC66EB790715A21C2BF13434D", hash_generated_method = "ACE3F235CDF27217B99C70DB8C3F2B7F")
    @DSModeled(DSC.SPEC)
    @Override
    public int checkUriPermission(Uri uri, String readPermission,
            String writePermission, int pid, int uid, int modeFlags) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(writePermission);
        dsTaint.addTaint(readPermission);
        dsTaint.addTaint(pid);
        dsTaint.addTaint(uri.dsTaint);
        int varE86989A776CE237B6A5E3024ADB23E65_1284264550 = (mBase.checkUriPermission(uri, readPermission, writePermission,
                pid, uid, modeFlags));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return mBase.checkUriPermission(uri, readPermission, writePermission,
                //pid, uid, modeFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.670 -0400", hash_original_method = "BB196C48EA062CF760A21CBEDF203044", hash_generated_method = "6371DD6B41C4C124FACF30CCE4B8BAE4")
    @DSModeled(DSC.SPEC)
    @Override
    public void enforceUriPermission(
            Uri uri, int pid, int uid, int modeFlags, String message) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(message);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(pid);
        dsTaint.addTaint(uri.dsTaint);
        mBase.enforceUriPermission(uri, pid, uid, modeFlags, message);
        // ---------- Original Method ----------
        //mBase.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.676 -0400", hash_original_method = "B8C6D02BD75567C0C6C58E522F178982", hash_generated_method = "B8DFDEB148DE2CE9A65A472C97D63C8D")
    @DSModeled(DSC.SPEC)
    @Override
    public void enforceCallingUriPermission(
            Uri uri, int modeFlags, String message) {
        dsTaint.addTaint(message);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(uri.dsTaint);
        mBase.enforceCallingUriPermission(uri, modeFlags, message);
        // ---------- Original Method ----------
        //mBase.enforceCallingUriPermission(uri, modeFlags, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.681 -0400", hash_original_method = "7C2103EAC397ACBBFFA65707A1212FAD", hash_generated_method = "7EFD9987B64DFAE0F6A91E783EA1BD39")
    @DSModeled(DSC.SPEC)
    @Override
    public void enforceCallingOrSelfUriPermission(
            Uri uri, int modeFlags, String message) {
        dsTaint.addTaint(message);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(uri.dsTaint);
        mBase.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
        // ---------- Original Method ----------
        //mBase.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-12 12:17:30.687 -0400", hash_original_method = "2C0B32E644AD3E21F1765D96680E56CD", hash_generated_method = "058E95DC062341F7013EAFAE32FC02F5")
    @DSModeled(DSC.SPEC)
    @Override
    public void enforceUriPermission(
            Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags, String message) {
        dsTaint.addTaint(uid);
        dsTaint.addTaint(message);
        dsTaint.addTaint(modeFlags);
        dsTaint.addTaint(writePermission);
        dsTaint.addTaint(readPermission);
        dsTaint.addTaint(pid);
        dsTaint.addTaint(uri.dsTaint);
        mBase.enforceUriPermission(
                uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
        // ---------- Original Method ----------
        //mBase.enforceUriPermission(
                //uri, readPermission, writePermission, pid, uid, modeFlags,
                //message);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException {
        dsTaint.addTaint(flags);
        dsTaint.addTaint(packageName);
        Context varB5A7A42C55604B8B11296B08E013768F_536105424 = (mBase.createPackageContext(packageName, flags));
        return (Context)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return mBase.createPackageContext(packageName, flags);
    }

    
    @DSGenerator(tool_name="Doppelganger",tool_version="0.4",generated_on="2013-06-11 11:14:59.515 -0400",hash_original_method="B09C0B118B70B22456444DDECE846C9F",hash_generated_method="F9019DFF9D4F3240E91D44EDC17E8AE6")
@Override
    public boolean isRestricted() {
        boolean var5B1D49D9F4C840BADBDE433A4848080A_635035592 = (mBase.isRestricted());
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return mBase.isRestricted();
    }

    
}


