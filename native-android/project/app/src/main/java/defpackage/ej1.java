package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej1 extends fj1 {
    public static final Object b = null;
    public static final ej1 c = null;

    static {
        b = new Object();
        c = new ej1();
    }

    public static AlertDialog d(Activity r5, int r6, sf5 r7, DialogInterface.OnCancelListener r8) {
        AlertDialog.Builder r0 = null;
        if (r6 != 0) goto L5;
        return null;
    L5:
        TypedValue r1 = new TypedValue();
        r5.getTheme().resolveAttribute(R.attr.alertDialogTheme, r1, true);
        if ("Theme.Dialog.Alert".equals(r5.getResources().getResourceEntryName(r1.resourceId)) == false) goto L8;
        r0 = new AlertDialog.Builder(r5, 5);
    L8:
        if (r0 != null) goto L10;
        r0 = new AlertDialog.Builder(r5);
    L10:
        r0.setMessage(lf5.b(r5, r6));
        if (r8 == null) goto L13;
        r0.setOnCancelListener(r8);
    L13:
        Resources r9 = r5.getResources();
        if (r6 != 1) goto L16;
        String r10 = r9.getString(app.homemusic.R.string.common_google_play_services_install_button);
    L23:
        if (r10 == null) goto L25;
        r0.setPositiveButton(r10, r7);
    L25:
        String r11 = lf5.c(r5, r6);
        if (r11 == null) goto L28;
        r0.setTitle(r11);
    L28:
        Log.w("GoogleApiAvailability", f34.f(r6, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return r0.create();
    L16:
        if (r6 != 2) goto L18;
        r10 = r9.getString(app.homemusic.R.string.common_google_play_services_update_button);
        goto L23
    L18:
        if (r6 == 3) goto L20;
        r10 = r9.getString(R.string.ok);
        goto L23
    L20:
        r10 = r9.getString(app.homemusic.R.string.common_google_play_services_enable_button);
        goto L23
    }

    public static void e(Activity r3, AlertDialog r4, String r5, DialogInterface.OnCancelListener r6) {
        if ((r3 instanceof nc1) == false) goto L10;
        md1 r7 = ((nc1) r3).k();
        ko4 r2 = new ko4();
        ji2.n(r4, "Cannot display null dialog");
        r4.setOnCancelListener(null);
        r4.setOnDismissListener(null);
        r2.B0 = r4;
        if (r6 == null) goto L8;
        r2.C0 = r6;
    L8:
        r2.m0(r7, r5);
        return;
    L10:
        FragmentManager r8 = r3.getFragmentManager();
        d21 r9 = new d21();
        ji2.n(r4, "Cannot display null dialog");
        r4.setOnCancelListener(null);
        r4.setOnDismissListener(null);
        r9.n = r4;
        if (r6 == null) goto L13;
        r9.o = r6;
    L13:
        r9.show(r8, r5);
    }

    public final void c(GoogleApiActivity r3, int r4, GoogleApiActivity r5) {
        AlertDialog r2 = d(r3, r4, new sf5(super.a(r4, r3, "d"), r3, 0), r5);
        if (r2 != null) goto L5;
        return;
    L5:
        e(r3, r2, "GooglePlayServicesErrorDialog", r5);
    }

    public final void f(Context r10, int r11, PendingIntent r12) {
        Log.w("GoogleApiAvailability", b11.j(r11, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (r11 != 18) goto L7;
        new uf5(this, r10).sendEmptyMessageDelayed(1, 120000);
        return;
    L7:
        if (r12 != null) goto L11;
        if (r11 != 6) goto L62;
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        return;
    L62:
        return;
    L11:
        if (r11 != 6) goto L13;
        String r0 = lf5.e(r10, "common_google_play_services_resolution_required_title");
    L15:
        if (r0 != null) goto L17;
        r0 = r10.getResources().getString(app.homemusic.R.string.common_google_play_services_notification_ticker);
    L17:
        if (r11 != 6) goto L19;
    L22:
        String r9 = lf5.d(r10, "common_google_play_services_resolution_required_text", lf5.a(r10));
    L23:
        Resources r3 = r10.getResources();
        Object r4 = r10.getSystemService("notification");
        ji2.m(r4);
        NotificationManager r5 = (NotificationManager) r4;
        s63 r6 = new s63(r10, null);
        r6.p = true;
        r6.c(16, true);
        r6.e = s63.b(r0);
        r63 r1 = new r63();
        r1.b = s63.b(r9);
        r6.e(r1);
        PackageManager r2 = r10.getPackageManager();
        if (kb4.e != null) goto L27;
        kb4.e = Boolean.valueOf(r2.hasSystemFeature("android.hardware.type.watch"));
    L27:
        if (kb4.e.booleanValue() == false) goto L32;
        r6.v.icon = r10.getApplicationInfo().icon;
        r6.i = 2;
        if (kb4.J(r10) == false) goto L31;
        String r13 = r3.getString(app.homemusic.R.string.common_open_on_phone);
        r6.b.add(new q63(IconCompat.b(null, "", app.homemusic.R.drawable.common_full_open_on_phone), r13, r12));
    L33:
        int r14 = Build.VERSION.SDK_INT;
        if (r14 < 26) goto L51;
        if (r14 < 26) goto L49;
        Object r15 = b;
        monitor-enter(r15);
        monitor-exit(r15);     // Catch: Throwable -> L46
        NotificationChannel r16 = gm0.b(r5);
        String r17 = r10.getResources().getString(app.homemusic.R.string.common_google_play_services_notification_channel_name);
        if (r16 != null) goto L43;
        gm0.q(r5, gm0.c(r17));
    L45:
        r6.s = "com.google.android.gms.availability";
        goto L51
    L43:
        if (r17.contentEquals(gm0.k(r16)) == true) goto L45;
        gm0.p(r16, r17);
        gm0.q(r5, r16);
    L46:
        th = move-exception;
        throw th;
    L49:
        tb4.a();
        return;
    L51:
        Notification r18 = r6.a();
        if (r11 == 1) goto L57;
        if (r11 == 2) goto L57;
        if (r11 == 3) goto L57;
        int r19 = 39789;
    L58:
        r5.notify(r19, r18);
        return;
    L57:
        lj1.a.set(false);
        r19 = 10436;
        goto L58
    L31:
        r6.g = r12;
        goto L33
    L32:
        r6.v.icon = R.drawable.stat_sys_warning;
        String r7 = r3.getString(app.homemusic.R.string.common_google_play_services_notification_ticker);
        Notification r8 = r6.v;
        r8.tickerText = s63.b(r7);
        r6.v.when = System.currentTimeMillis();
        r6.g = r12;
        r6.f = s63.b(r9);
        goto L33
    L19:
        if (r11 == 19) goto L22;
        r9 = lf5.b(r10, r11);
        goto L23
    L13:
        r0 = lf5.c(r10, r11);
        goto L15
    }

    public final void g(Activity r3, x92 r4, int r5, DialogInterface.OnCancelListener r6) {
        AlertDialog r2 = d(r3, r5, new sf5(super.a(r5, r3, "d"), r4, 1), r6);
        if (r2 != null) goto L5;
        return;
    L5:
        e(r3, r2, "GooglePlayServicesErrorDialog", r6);
    }
}
