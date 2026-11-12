package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.homemusic.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fj1 {
    public static final int a = 0;

    static {
        int r0 = lj1.e;
        a = 12451000;
    }

    public Intent a(int r3, Context r4, String r5) {
        if (r3 != 1) goto L5;
    L11:
        if (r4 != null) goto L13;
    L17:
        StringBuilder r2 = new StringBuilder("gcore_");
        r2.append(a);
        r2.append("-");
        if (TextUtils.isEmpty(r5) == true) goto L20;
        r2.append(r5);
    L20:
        r2.append("-");
        if (r4 == null) goto L23;
        r2.append(r4.getPackageName());
    L23:
        r2.append("-");
        if (r4 != null) goto L32;
    L26:
        String r6 = r2.toString();
        Intent r7 = new Intent("android.intent.action.VIEW");
        Uri.Builder r8 = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (TextUtils.isEmpty(r6) == true) goto L29;
        r8.appendQueryParameter("pcampaignid", r6);
    L29:
        r7.setData(r8.build());
        r7.setPackage("com.android.vending");
        r7.addFlags(524288);
        return r7;
    L32:
        si1 r9 = ae5.a(r4);     // Catch: PackageManager.NameNotFoundException -> L31
        String r10 = r4.getPackageName();     // Catch: PackageManager.NameNotFoundException -> L31
        r2.append(((Context) r9.o).getPackageManager().getPackageInfo(r10, 0).versionCode);     // Catch: PackageManager.NameNotFoundException -> L31
        goto L26
    L13:
        if (kb4.J(r4) == false) goto L17;
        Intent r11 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        r11.setPackage("com.google.android.wearable.app");
        return r11;
    L5:
        if (r3 == 2) goto L11;
        if (r3 == 3) goto L9;
        return null;
    L9:
        Uri r12 = Uri.fromParts("package", "com.google.android.gms", null);
        Intent r13 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        r13.setData(r12);
        return r13;
    }

    public int b(Context r9, int r10) {
        int r8 = lj1.e;
        r9.getResources().getString(R.string.common_google_play_services_unknown_issue);     // Catch: Throwable -> L5
    L6:
        boolean r0 = true;
        if ("com.google.android.gms".equals(r9.getPackageName()) == true) goto L41;
        if (lj1.d.get() == true) goto L41;
        Object r11 = j51.h;
        monitor-enter(r11);
    L17:
        th = move-exception;
        throw th;
    L14:
        if (j51.i == false) goto L19;
        monitor-exit(r11);     // Catch: Throwable -> L17
    L29:
        int r12 = j51.j;
        if (r12 == 0) goto L37;
        if (r12 == 12451000) goto L41;
        throw new GooglePlayServicesIncorrectManifestValueException(b11.n("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", a, r12, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    L37:
        throw new GooglePlayServicesMissingManifestValueException();
    L19:
        j51.i = true;     // Catch: Throwable -> L17
        Bundle r1 = ((Context) ae5.a(r9).o).getPackageManager().getApplicationInfo(r9.getPackageName(), 128).metaData;     // Catch: Throwable -> L17 PackageManager.NameNotFoundException -> L26
        if (r1 != null) goto L24;
        monitor-exit(r11);     // Catch: Throwable -> L17
        goto L29
    L24:
        r1.getString("com.google.app.id");     // Catch: Throwable -> L17 PackageManager.NameNotFoundException -> L26
        j51.j = r1.getInt("com.google.android.gms.version");     // Catch: Throwable -> L17 PackageManager.NameNotFoundException -> L26
    L28:
        monitor-exit(r11);     // Catch: Throwable -> L17
        goto L29
    L26:
        e = move-exception;
        Log.wtf("MetadataValueReader", "This should never happen.", e);     // Catch: Throwable -> L17
    L41:
        if (kb4.J(r9) == false) goto L43;
    L54:
        boolean r13 = false;
    L55:
        if (r10 < 0) goto L57;
        boolean r2 = true;
    L58:
        ji2.i(r2);
        String r3 = r9.getPackageName();
        PackageManager r4 = r9.getPackageManager();
        int r5 = 9;
        if (r13 == true) goto L110;
        PackageInfo r6 = null;
    L114:
        PackageInfo r7 = r4.getPackageInfo("com.google.android.gms", 64);     // Catch: PackageManager.NameNotFoundException -> L97
        oj1.b(r9);
        if (oj1.d(r7, true) == true) goto L68;
        Log.w("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires Google Play services, but their signature is invalid."));
    L99:
        if (r5 == 18) goto L104;
        if (r5 != 1) goto L103;
        r0 = lj1.a(r9);
        goto L104
    L103:
        r0 = false;
    L104:
        if (r0 == false) goto L106;
        return 18;
    L106:
        return r5;
    L68:
        if (r13 == false) goto L72;
        ji2.m(r6);
        if (oj1.d(r6, true) == true) goto L72;
        Log.w("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires Google Play Store, but its signature is invalid."));
    L72:
        if (r13 == false) goto L77;
        if (r6 == null) goto L77;
        if (r6.signatures[0].equals(r7.signatures[0]) == true) goto L77;
        Log.w("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
    L77:
        int r14 = r7.versionCode;
        int r15 = -1;
        if (r14 != (-1)) goto L80;
        int r16 = -1;
    L81:
        if (r10 == (-1)) goto L84;
        r15 = r10 / 1000;
    L84:
        if (r16 >= r15) goto L86;
        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + r3 + ".  Requires " + r10 + " but found " + r14);
        r5 = 2;
        goto L99
    L86:
        ApplicationInfo r17 = r7.applicationInfo;
        if (r17 != null) goto L94;
        r17 = r4.getApplicationInfo("com.google.android.gms", 0);     // Catch: PackageManager.NameNotFoundException -> L90
    L90:
        e = move-exception;
        Log.wtf("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires Google Play services, but they're missing when getting application info."), e);
    L92:
        r5 = 1;
    L94:
        if (r17.enabled == true) goto L96;
        r5 = 3;
        goto L99
    L96:
        r5 = 0;
        goto L99
    L80:
        r16 = r14 / 1000;
    L97:
        Log.w("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
        goto L92
    L110:
        r6 = r4.getPackageInfo("com.android.vending", 8256);     // Catch: PackageManager.NameNotFoundException -> L62
    L62:
        Log.w("GooglePlayServicesUtil", String.valueOf(r3).concat(" requires the Google Play Store, but it is missing."));
        goto L99
    L57:
        r2 = false;
        goto L58
    L43:
        if (kb4.g != null) goto L52;
        if (r9.getPackageManager().hasSystemFeature("android.hardware.type.iot") == false) goto L47;
    L48:
        boolean r18 = true;
    L50:
        kb4.g = Boolean.valueOf(r18);
        goto L52
    L47:
        if (r9.getPackageManager().hasSystemFeature("android.hardware.type.embedded") == true) goto L48;
        r18 = false;
    L52:
        if (kb4.g.booleanValue() == true) goto L54;
        r13 = true;
    L5:
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        goto L6
    }
}
