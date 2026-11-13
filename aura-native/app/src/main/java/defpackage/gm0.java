/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.StrictMode;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import com.eddyizm.tempus.service.MediaService;
import defpackage.k33;
import defpackage.ra;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public abstract class gm0 {
    public static void A(BitmapFactory.Options options) {
        options.outColorSpace = null;
    }

    public static boolean B(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    public static NotificationChannel C(String string) {
        return new NotificationChannel("lan_receiver", string, 2);
    }

    public static void D(BitmapFactory.Options options) {
        options.outConfig = null;
    }

    public static long a(FileTime fileTime) {
        return fileTime.toMillis();
    }

    public static NotificationChannel b(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("com.google.android.gms.availability");
    }

    public static NotificationChannel c(String string) {
        return new NotificationChannel("com.google.android.gms.availability", string, 4);
    }

    public static NotificationChannel d(String string, String string2) {
        return new NotificationChannel(string, string2, 2);
    }

    public static PendingIntent e(MediaService mediaService, Intent intent, int n16) {
        return PendingIntent.getForegroundService(mediaService, 0, intent, n16);
    }

    public static Bitmap.Config f(BitmapFactory.Options options) {
        return options.outConfig;
    }

    public static ColorSpace g() {
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    public static ColorSpace h(BitmapFactory.Options options) {
        return options.outColorSpace;
    }

    public static StrictMode.ThreadPolicy.Builder i(StrictMode.ThreadPolicy.Builder builder) {
        return builder.permitUnbufferedIo();
    }

    public static AutofillManager j(Object object) {
        return (AutofillManager)object;
    }

    public static CharSequence k(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static Class l() {
        return AutofillManager.class;
    }

    public static Path m(String string, String[] stringArray) {
        return Paths.get(string, stringArray);
    }

    public static void n() {
    }

    public static void o(k33 k332, boolean bl5) {
        k332.setDefaultFocusHighlightEnabled(bl5);
    }

    public static void p(NotificationChannel notificationChannel, String string) {
        notificationChannel.setName(string);
    }

    public static void q(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void r(BitmapFactory.Options options) {
        options.inPreferredColorSpace = null;
    }

    public static void s(BitmapFactory.Options options, ColorSpace colorSpace) {
        options.inPreferredColorSpace = colorSpace;
    }

    public static void t(AutofillManager autofillManager) {
        autofillManager.commit();
    }

    public static void u(AutofillManager autofillManager, ra ra6, int n16) {
        autofillManager.notifyViewExited(ra6, n16);
    }

    public static void v(AutofillManager autofillManager, ra ra6, int n16, AutofillValue autofillValue) {
        autofillManager.notifyValueChanged(ra6, n16, autofillValue);
    }

    public static boolean w(PackageManager packageManager) {
        return packageManager.canRequestPackageInstalls();
    }

    public static boolean x(Display display) {
        return display.isHdr();
    }

    public static NotificationChannel y(String string) {
        return new NotificationChannel("homemusic_hub", string, 3);
    }

    public static void z(NotificationChannel notificationChannel, String string) {
        notificationChannel.setDescription(string);
    }
}

