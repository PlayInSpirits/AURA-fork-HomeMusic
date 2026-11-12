package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sg0 {
    public static Application a;
    public static oz b = new oz();
    public static WeakReference c;

    static {
        new ArrayDeque(50);
        c = new WeakReference(null);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static String b(Context context, Intent intent) {
        long time;
        String str;
        String strA;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            time = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            time = 0;
        }
        String str2 = time > 631152000000L ? simpleDateFormat.format(new Date(time)) : null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
            str = "Unknown";
        }
        String strH = xa3.h("Build version: ", str, " \n");
        if (str2 != null) {
            strH = strH + "Build date: " + str2 + " \n";
        }
        StringBuilder sbS = b11.s(strH, "Current date: ");
        sbS.append(simpleDateFormat.format(date));
        sbS.append(" \n");
        StringBuilder sbS2 = b11.s(sbS.toString(), "Device: ");
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (str4.startsWith(str3)) {
            strA = a(str4);
        } else {
            strA = a(str3) + " " + str4;
        }
        StringBuilder sbS3 = b11.s(b11.q(sbS2, strA, " \n"), "OS version: Android ");
        sbS3.append(Build.VERSION.RELEASE);
        sbS3.append(" (SDK ");
        sbS3.append(Build.VERSION.SDK_INT);
        sbS3.append(") \n \n");
        StringBuilder sbI = xa3.i(sbS3.toString().concat("Stack trace:  \n"));
        sbI.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String string = sbI.toString();
        String stringExtra = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        if (stringExtra != null) {
            string = string.concat("\nUser actions: \n").concat(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_CUSTOM_CRASH_DATA");
        return stringExtra2 != null ? string.concat("\nAdditional data: \n").concat(stringExtra2) : string;
    }

    public static oz c(Intent intent) {
        oz ozVar = (oz) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (ozVar != null && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            Log.e("CustomActivityOnCrash", "The previous app process crashed. This is the stack trace of the crash:\n" + intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        }
        return ozVar;
    }

    public static void d(Activity activity, oz ozVar) {
        Intent intent = new Intent(activity, (Class<?>) ozVar.p);
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        activity.finish();
        activity.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
