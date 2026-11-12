package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.media3.session.MediaLibraryService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tn {
    public static /* bridge */ /* synthetic */ ColorSpace.Named A() {
        return ColorSpace.Named.SRGB;
    }

    public static /* bridge */ /* synthetic */ boolean B(AutofillValue r0) {
        return r0.isList();
    }

    public static /* bridge */ /* synthetic */ boolean C(AutofillValue r0) {
        return r0.isText();
    }

    public static /* bridge */ /* synthetic */ boolean D(AutofillValue r0) {
        return r0.isDate();
    }

    public static /* bridge */ /* synthetic */ NotificationChannel a(NotificationManager r1) {
        return r1.getNotificationChannel("default_channel_id");
    }

    public static /* synthetic */ NotificationChannel b(String r3) {
        return new NotificationChannel("default_channel_id", r3, 2);
    }

    public static /* bridge */ /* synthetic */ PendingIntent c(MediaLibraryService r1, int r2, Intent r3) {
        return PendingIntent.getForegroundService(r1, r2, r3, 67108864);
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named d() {
        return ColorSpace.Named.DISPLAY_P3;
    }

    public static /* bridge */ /* synthetic */ ColorSpace e(ColorSpace.Named r0) {
        return ColorSpace.get(r0);
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object r0) {
        return (AutofillId) r0;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(CharSequence r0) {
        return AutofillValue.forText(r0);
    }

    public static /* bridge */ /* synthetic */ AutofillValue h(boolean r0) {
        return AutofillValue.forToggle(r0);
    }

    public static /* bridge */ /* synthetic */ CharSequence i(AutofillValue r0) {
        return r0.getTextValue();
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ Object k(MethodHandle r0, Object[] r1) {
        return r0.invokeWithArguments(r1);
    }

    public static /* bridge */ /* synthetic */ MethodHandle l(MethodHandle r0, Object r1) {
        return r0.bindTo(r1);
    }

    public static /* bridge */ /* synthetic */ MethodHandle m(MethodHandles.Lookup r0, Method r1, Class r2) {
        return r0.unreflectSpecial(r1, r2);
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup n(Object r0) {
        return (MethodHandles.Lookup) r0;
    }

    public static /* bridge */ /* synthetic */ void o(NotificationChannel r1) {
        r1.setShowBadge(false);
    }

    public static /* bridge */ /* synthetic */ void p(NotificationManager r0, NotificationChannel r1) {
        r0.createNotificationChannel(r1);
    }

    public static /* bridge */ /* synthetic */ void q(Canvas r0, RectF r1) {
        r0.clipOutRect(r1);
    }

    public static /* bridge */ /* synthetic */ void r(ViewStructure r0, int r1) {
        r0.setAutofillType(r1);
    }

    public static /* bridge */ /* synthetic */ void s(ViewStructure r0, String[] r1) {
        r0.setAutofillHints(r1);
    }

    public static /* bridge */ /* synthetic */ boolean t(Canvas r0, float r1, float r2, float r3, float r4) {
        return r0.clipOutRect(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ boolean u(Canvas r0, int r1, int r2, int r3, int r4) {
        return r0.clipOutRect(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ boolean v(Canvas r0, Path r1) {
        return r0.clipOutPath(r1);
    }

    public static /* bridge */ /* synthetic */ boolean w(Canvas r0, Rect r1) {
        return r0.clipOutRect(r1);
    }

    public static /* bridge */ /* synthetic */ boolean x(Canvas r0, RectF r1) {
        return r0.clipOutRect(r1);
    }

    public static /* bridge */ /* synthetic */ boolean y(ColorSpace r0) {
        return r0.isWideGamut();
    }

    public static /* bridge */ /* synthetic */ boolean z(AutofillValue r0) {
        return r0.isToggle();
    }
}
