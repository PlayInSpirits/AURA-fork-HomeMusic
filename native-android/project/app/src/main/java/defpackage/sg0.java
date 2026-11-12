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
    public static oz b;
    public static WeakReference c;

    static {
        b = new oz();
        new ArrayDeque(50);
        c = new WeakReference(null);
    }

    public static String a(String r2) {
        if (r2 != null) goto L4;
        return "";
    L4:
        if (r2.length() == 0) goto L13;
        char r0 = r2.charAt(0);
        if (Character.isUpperCase(r0) == false) goto L10;
        return r2;
    L10:
        return Character.toUpperCase(r0) + r2.substring(1);
    L13:
        return "";
    }

    public static String b(Context r7, Intent r8) {
        Date r0 = new Date();
        SimpleDateFormat r1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        ZipFile r4 = new ZipFile(r7.getPackageManager().getApplicationInfo(r7.getPackageName(), 0).sourceDir);     // Catch: Exception -> L5
        long r5 = r4.getEntry("classes.dex").getTime();     // Catch: Exception -> L5
        r4.close();     // Catch: Exception -> L5
    L7:
        if (r5 <= 631152000000L) goto L9;
        String r3 = r1.format(new Date(r5));
    L29:
        String r9 = r7.getPackageManager().getPackageInfo(r7.getPackageName(), 0).versionName;     // Catch: Exception -> L12
    L13:
        String r10 = xa3.h("Build version: ", r9, " \n");
        if (r3 == null) goto L16;
        r10 = r10 + "Build date: " + r3 + " \n";
    L16:
        StringBuilder r11 = b11.s(r10, "Current date: ");
        r11.append(r1.format(r0));
        r11.append(" \n");
        StringBuilder r12 = b11.s(r11.toString(), "Device: ");
        String r2 = Build.MANUFACTURER;
        String r6 = Build.MODEL;
        if (r6.startsWith(r2) == false) goto L19;
        String r13 = a(r6);
    L20:
        StringBuilder r14 = b11.s(b11.q(r12, r13, " \n"), "OS version: Android ");
        r14.append(Build.VERSION.RELEASE);
        r14.append(" (SDK ");
        r14.append(Build.VERSION.SDK_INT);
        r14.append(") \n \n");
        StringBuilder r15 = xa3.i(r14.toString().concat("Stack trace:  \n"));
        r15.append(r8.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String r16 = r15.toString();
        String r17 = r8.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        if (r17 == null) goto L23;
        r16 = r16.concat("\nUser actions: \n").concat(r17);
    L23:
        String r18 = r8.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_CUSTOM_CRASH_DATA");
        if (r18 != null) goto L26;
        return r16;
    L26:
        return r16.concat("\nAdditional data: \n").concat(r18);
    L19:
        r13 = a(r2) + " " + r6;
    L12:
        r9 = "Unknown";
        goto L13
    L9:
        r3 = null;
    L5:
        r5 = 0;
        goto L7
    }

    public static oz c(Intent r4) {
        oz r0 = (oz) r4.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (r0 != null) goto L5;
    L7:
        return r0;
    L5:
        if (r4.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") == null) goto L7;
        Log.e("CustomActivityOnCrash", "The previous app process crashed. This is the stack trace of the crash:\n" + r4.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        goto L7
    }

    public static void d(Activity r1, oz r2) {
        Intent r0 = new Intent(r1, r2.p);
        r0.addFlags(270565376);
        if (r0.getComponent() == null) goto L5;
        r0.setAction("android.intent.action.MAIN");
        r0.addCategory("android.intent.category.LAUNCHER");
    L5:
        r1.finish();
        r1.startActivity(r0);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
