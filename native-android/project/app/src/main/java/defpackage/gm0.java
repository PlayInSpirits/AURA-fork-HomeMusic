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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gm0 {
    public static /* bridge */ /* synthetic */ void A(BitmapFactory.Options r1) {
        r1.outColorSpace = null;
    }

    public static /* bridge */ /* synthetic */ boolean B(PackageManager r0) {
        return r0.isInstantApp();
    }

    public static /* synthetic */ NotificationChannel C(String r3) {
        return new NotificationChannel("lan_receiver", r3, 2);
    }

    public static /* bridge */ /* synthetic */ void D(BitmapFactory.Options r1) {
        r1.outConfig = null;
    }

    public static /* bridge */ /* synthetic */ long a(FileTime r2) {
        return r2.toMillis();
    }

    public static /* bridge */ /* synthetic */ NotificationChannel b(NotificationManager r1) {
        return r1.getNotificationChannel("com.google.android.gms.availability");
    }

    public static /* synthetic */ NotificationChannel c(String r3) {
        return new NotificationChannel("com.google.android.gms.availability", r3, 4);
    }

    public static /* synthetic */ NotificationChannel d(String r2, String r3) {
        return new NotificationChannel(r2, r3, 2);
    }

    public static /* bridge */ /* synthetic */ PendingIntent e(MediaService r1, Intent r2, int r3) {
        return PendingIntent.getForegroundService(r1, 0, r2, r3);
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config f(BitmapFactory.Options r0) {
        return r0.outConfig;
    }

    public static /* bridge */ /* synthetic */ ColorSpace g() {
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    public static /* bridge */ /* synthetic */ ColorSpace h(BitmapFactory.Options r0) {
        return r0.outColorSpace;
    }

    public static /* bridge */ /* synthetic */ StrictMode.ThreadPolicy.Builder i(StrictMode.ThreadPolicy.Builder r0) {
        return r0.permitUnbufferedIo();
    }

    public static /* bridge */ /* synthetic */ AutofillManager j(Object r0) {
        return (AutofillManager) r0;
    }

    public static /* bridge */ /* synthetic */ CharSequence k(NotificationChannel r0) {
        return r0.getName();
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ Path m(String r0, String[] r1) {
        return Paths.get(r0, r1);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ void o(k33 r0, boolean r1) {
        r0.setDefaultFocusHighlightEnabled(r1);
    }

    public static /* bridge */ /* synthetic */ void p(NotificationChannel r0, String r1) {
        r0.setName(r1);
    }

    public static /* bridge */ /* synthetic */ void q(NotificationManager r0, NotificationChannel r1) {
        r0.createNotificationChannel(r1);
    }

    public static /* bridge */ /* synthetic */ void r(BitmapFactory.Options r1) {
        r1.inPreferredColorSpace = null;
    }

    public static /* bridge */ /* synthetic */ void s(BitmapFactory.Options r0, ColorSpace r1) {
        r0.inPreferredColorSpace = r1;
    }

    public static /* bridge */ /* synthetic */ void t(AutofillManager r0) {
        r0.commit();
    }

    public static /* bridge */ /* synthetic */ void u(AutofillManager r0, ra r1, int r2) {
        r0.notifyViewExited(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void v(AutofillManager r0, ra r1, int r2, AutofillValue r3) {
        r0.notifyValueChanged(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ boolean w(PackageManager r0) {
        return r0.canRequestPackageInstalls();
    }

    public static /* bridge */ /* synthetic */ boolean x(Display r0) {
        return r0.isHdr();
    }

    public static /* synthetic */ NotificationChannel y(String r3) {
        return new NotificationChannel("homemusic_hub", r3, 3);
    }

    public static /* bridge */ /* synthetic */ void z(NotificationChannel r0, String r1) {
        r0.setDescription(r1);
    }
}
