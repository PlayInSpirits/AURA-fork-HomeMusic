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
    public static final Object b = new Object();
    public static final ej1 c = new ej1();

    public static AlertDialog d(Activity activity, int i, sf5 sf5Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(lf5.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(app.homemusic.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(app.homemusic.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(app.homemusic.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, sf5Var);
        }
        String strC = lf5.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", f34.f(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof nc1) {
                md1 md1VarK = ((nc1) activity).k();
                ko4 ko4Var = new ko4();
                ji2.n(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ko4Var.B0 = alertDialog;
                if (onCancelListener != null) {
                    ko4Var.C0 = onCancelListener;
                }
                ko4Var.m0(md1VarK, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        d21 d21Var = new d21();
        ji2.n(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        d21Var.n = alertDialog;
        if (onCancelListener != null) {
            d21Var.o = onCancelListener;
        }
        d21Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new sf5(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", b11.j(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new uf5(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? lf5.e(context, "common_google_play_services_resolution_required_title") : lf5.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(app.homemusic.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? lf5.d(context, "common_google_play_services_resolution_required_text", lf5.a(context)) : lf5.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ji2.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s63 s63Var = new s63(context, null);
        s63Var.p = true;
        s63Var.c(16, true);
        s63Var.e = s63.b(strE);
        r63 r63Var = new r63();
        r63Var.b = s63.b(strD);
        s63Var.e(r63Var);
        PackageManager packageManager = context.getPackageManager();
        if (kb4.e == null) {
            kb4.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (kb4.e.booleanValue()) {
            s63Var.v.icon = context.getApplicationInfo().icon;
            s63Var.i = 2;
            if (kb4.J(context)) {
                s63Var.b.add(new q63(IconCompat.b(null, "", app.homemusic.R.drawable.common_full_open_on_phone), resources.getString(app.homemusic.R.string.common_open_on_phone), pendingIntent));
            } else {
                s63Var.g = pendingIntent;
            }
        } else {
            s63Var.v.icon = R.drawable.stat_sys_warning;
            s63Var.v.tickerText = s63.b(resources.getString(app.homemusic.R.string.common_google_play_services_notification_ticker));
            s63Var.v.when = System.currentTimeMillis();
            s63Var.g = pendingIntent;
            s63Var.f = s63.b(strD);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            if (i3 < 26) {
                tb4.a();
                return;
            }
            synchronized (b) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(app.homemusic.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(gm0.c(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            s63Var.s = "com.google.android.gms.availability";
        }
        Notification notificationA = s63Var.a();
        if (i == 1 || i == 2 || i == 3) {
            lj1.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void g(Activity activity, x92 x92Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new sf5(super.a(i, activity, "d"), x92Var, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
