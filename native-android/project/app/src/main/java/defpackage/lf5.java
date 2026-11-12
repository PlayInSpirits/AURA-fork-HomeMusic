package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import app.homemusic.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lf5 {
    public static final yd4 a = null;
    public static Locale b;

    static {
        a = new yd4(0);
    }

    public static String a(Context r4) {
        String r0 = r4.getPackageName();
        Context r1 = (Context) ae5.a(r4).o;     // Catch: Throwable -> L5
        return r1.getPackageManager().getApplicationLabel(r1.getPackageManager().getApplicationInfo(r0, 0)).toString();
    L5:
        String r5 = r4.getApplicationInfo().name;
        if (TextUtils.isEmpty(r5) == false) goto L8;
        return r0;
    L8:
        return r5;
    }

    public static String b(Context r3, int r4) {
        Resources r0 = r3.getResources();
        String r1 = a(r3);
        if (r4 == 1) goto L42;
        if (r4 == 2) goto L36;
        if (r4 == 3) goto L34;
        if (r4 == 5) goto L32;
        if (r4 == 7) goto L30;
        if (r4 == 9) goto L28;
        if (r4 == 20) goto L26;
        switch(r4) {
            case 16: goto L24;
            case 17: goto L22;
            case 18: goto L20;
            default: goto L18;
        };
    L18:
        return r0.getString(R.string.common_google_play_services_unknown_issue, new Object[]{r1});
    L20:
        return r0.getString(R.string.common_google_play_services_updating_text, new Object[]{r1});
    L22:
        return d(r3, "common_google_play_services_sign_in_failed_text", r1);
    L24:
        return d(r3, "common_google_play_services_api_unavailable_text", r1);
    L26:
        return d(r3, "common_google_play_services_restricted_profile_text", r1);
    L28:
        return r0.getString(R.string.common_google_play_services_unsupported_text, new Object[]{r1});
    L30:
        return d(r3, "common_google_play_services_network_error_text", r1);
    L32:
        return d(r3, "common_google_play_services_invalid_account_text", r1);
    L34:
        return r0.getString(R.string.common_google_play_services_enable_text, new Object[]{r1});
    L36:
        if (kb4.J(r3) == false) goto L40;
        return r0.getString(R.string.common_google_play_services_wear_update_text);
    L40:
        return r0.getString(R.string.common_google_play_services_update_text, new Object[]{r1});
    L42:
        return r0.getString(R.string.common_google_play_services_install_text, new Object[]{r1});
    }

    public static String c(Context r3, int r4) {
        Resources r0 = r3.getResources();
        switch(r4) {
            case 1: goto L30;
            case 2: goto L28;
            case 3: goto L26;
            case 4: goto L24;
            case 5: goto L22;
            case 6: goto L24;
            case 7: goto L20;
            case 8: goto L18;
            case 9: goto L16;
            case 10: goto L14;
            case 11: goto L12;
            case 12: goto L4;
            case 13: goto L4;
            case 14: goto L4;
            case 15: goto L4;
            case 16: goto L10;
            case 17: goto L8;
            case 18: goto L24;
            case 19: goto L4;
            case 20: goto L6;
            default: goto L4;
        };
    L4:
        Log.e("GoogleApiAvailability", "Unexpected error code " + r4);
        return null;
    L6:
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return e(r3, "common_google_play_services_restricted_profile_title");
    L8:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return e(r3, "common_google_play_services_sign_in_failed_title");
    L10:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        return null;
    L12:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        return null;
    L14:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        return null;
    L16:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        return null;
    L18:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        return null;
    L20:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return e(r3, "common_google_play_services_network_error_title");
    L22:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return e(r3, "common_google_play_services_invalid_account_title");
    L24:
        return null;
    L26:
        return r0.getString(R.string.common_google_play_services_enable_title);
    L28:
        return r0.getString(R.string.common_google_play_services_update_title);
    L30:
        return r0.getString(R.string.common_google_play_services_install_title);
    }

    public static String d(Context r1, String r2, String r3) {
        Resources r0 = r1.getResources();
        String r4 = e(r1, r2);
        if (r4 != null) goto L6;
        r4 = r0.getString(R.string.common_google_play_services_unknown_issue);
    L6:
        return String.format(r0.getConfiguration().locale, r4, new Object[]{r3});
    }

    public static String e(Context r6, String r7) {
        yd4 r2 = a;
        monitor-enter(r2);
        Locale r3 = r6.getResources().getConfiguration().getLocales().get(0);     // Catch: Throwable -> L7
        if (r3.equals(b) == true) goto L9;
        r2.clear();     // Catch: Throwable -> L7
        b = r3;     // Catch: Throwable -> L7
    L9:
        String r4 = (String) r2.get(r7);     // Catch: Throwable -> L7
        if (r4 == null) goto L13;
        monitor-exit(r2);     // Catch: Throwable -> L7
        return r4;
    L13:
        int r5 = lj1.e;     // Catch: Throwable -> L7
        Resources r8 = r6.getPackageManager().getResourcesForApplication("com.google.android.gms");     // Catch: Throwable -> L7 PackageManager.NameNotFoundException -> L17
    L18:
        if (r8 != null) goto L21;
        monitor-exit(r2);     // Catch: Throwable -> L7
    L30:
        return null;
    L21:
        int r9 = r8.getIdentifier(r7, "string", "com.google.android.gms");     // Catch: Throwable -> L7
        if (r9 != 0) goto L26;
        Log.w("GoogleApiAvailability", "Missing resource: ".concat(r7));     // Catch: Throwable -> L7
        monitor-exit(r2);     // Catch: Throwable -> L7
        goto L30
    L26:
        String r10 = r8.getString(r9);     // Catch: Throwable -> L7
        if (TextUtils.isEmpty(r10) == false) goto L31;
        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(r7));     // Catch: Throwable -> L7
        monitor-exit(r2);     // Catch: Throwable -> L7
        goto L30
    L31:
        a.put(r7, r10);     // Catch: Throwable -> L7
        monitor-exit(r2);     // Catch: Throwable -> L7
        return r10;
    L17:
        r8 = null;
    L7:
        th = move-exception;
        throw th;
    }
}
