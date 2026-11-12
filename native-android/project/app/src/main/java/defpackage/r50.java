package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r50 {
    public static final ColorSpace a(p50 r23) {
        if (h12.c(r23, s50.e) == false) goto L7;
        return ColorSpace.get(ColorSpace.Named.SRGB);
    L7:
        if (h12.c(r23, s50.q) == false) goto L11;
        return ColorSpace.get(ColorSpace.Named.ACES);
    L11:
        if (h12.c(r23, s50.r) == false) goto L15;
        return ColorSpace.get(ColorSpace.Named.ACESCG);
    L15:
        if (h12.c(r23, s50.o) == false) goto L19;
        return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
    L19:
        if (h12.c(r23, s50.j) == false) goto L23;
        return ColorSpace.get(ColorSpace.Named.BT2020);
    L23:
        if (h12.c(r23, s50.i) == false) goto L27;
        return ColorSpace.get(ColorSpace.Named.BT709);
    L27:
        if (h12.c(r23, s50.t) == false) goto L31;
        return ColorSpace.get(ColorSpace.Named.CIE_LAB);
    L31:
        if (h12.c(r23, s50.s) == false) goto L35;
        return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
    L35:
        if (h12.c(r23, s50.k) == false) goto L39;
        return ColorSpace.get(ColorSpace.Named.DCI_P3);
    L39:
        if (h12.c(r23, s50.l) == false) goto L43;
        return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
    L43:
        if (h12.c(r23, s50.g) == false) goto L47;
        return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
    L47:
        if (h12.c(r23, s50.h) == false) goto L51;
        return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
    L51:
        if (h12.c(r23, s50.f) == false) goto L55;
        return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
    L55:
        if (h12.c(r23, s50.m) == false) goto L59;
        return ColorSpace.get(ColorSpace.Named.NTSC_1953);
    L59:
        if (h12.c(r23, s50.p) == false) goto L63;
        return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
    L63:
        if (h12.c(r23, s50.n) == true) goto L65;
        int r1 = Build.VERSION.SDK_INT;
        ColorSpace.Rgb.TransferParameters r3 = null;
        if (r1 < 34) goto L79;
        if (h12.c(r23, s50.v) == false) goto L72;
        ColorSpace r2 = ColorSpace.get(bn.p());
    L75:
        if (r2 == null) goto L79;
        return r2;
    L72:
        if (h12.c(r23, s50.w) == false) goto L74;
        r2 = ColorSpace.get(bn.A());
        goto L75
    L74:
        r2 = null;
    L79:
        if (r1 < 36) goto L88;
        if (h12.c(r23, s50.x) == false) goto L83;
        ColorSpace r4 = ColorSpace.get(no.c());
    L84:
        if (r4 == null) goto L88;
        return r4;
    L83:
        r4 = null;
    L88:
        if ((r23 instanceof k24) == false) goto L106;
        String r5 = r23.a;
        k24 r0 = (k24) r23;
        float[] r7 = r0.d.a();
        sw4 r6 = r0.g;
        if (r6 == null) goto L92;
        r3 = new ColorSpace.Rgb.TransferParameters(r6.b, r6.c, r6.d, r6.e, r6.f, r6.g, r6.a);
    L92:
        float[] r8 = r0.i;
        final int r9 = 0;
        if (r3 == null) goto L103;
        ColorSpace.Rgb r10 = new ColorSpace.Rgb(r5, r0.h, r7, r3);
        if (Float.isNaN(r8[0]) == true) goto L100;
        if (Arrays.equals(r10.getTransform(), r8) == true) goto L100;
        return new ColorSpace.Rgb(r5, r8, r3);
    L100:
        return r10;
    L103:
        float[] r11 = r0.h;
        final j24 r12 = r0.l;
        DoubleUnaryOperator r13 = new q50(r12, r9);
        final j24 r14 = r0.o;
        final int r15 = 1;
        return new ColorSpace.Rgb(r5, r11, r7, r13, new q50(r14, r15), r0.e, r0.f);
    L106:
        return ColorSpace.get(ColorSpace.Named.SRGB);
    L65:
        return ColorSpace.get(ColorSpace.Named.SMPTE_C);
    }

    public static Notification.Builder b(Context r1, String r2) {
        return new Notification.Builder(r1, r2);
    }

    public static Icon c(Bitmap r0) {
        return Icon.createWithAdaptiveBitmap(r0);
    }

    public static AutofillId d(View r0) {
        return r0.getAutofillId();
    }

    public static float e(ViewConfiguration r0) {
        return r0.getScaledHorizontalScrollFactor();
    }

    public static float f(ViewConfiguration r0) {
        return r0.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration r0) {
        return r0.getScaledVerticalScrollFactor();
    }

    public static float h(ViewConfiguration r0) {
        return r0.getScaledVerticalScrollFactor();
    }

    public static Intent i(Context r6, BroadcastReceiver r7, IntentFilter r8, int r9) {
        if ((r9 & 4) == 0) goto L7;
        return r6.registerReceiver(r7, r8, ud3.d0(r6), null);
    L7:
        return r6.registerReceiver(r7, r8, null, null, 0);
    }

    public static Intent j(Context r6, BroadcastReceiver r7, IntentFilter r8, int r9) {
        return r6.registerReceiver(r7, r8, null, null, r9);
    }

    public static void k(MenuItem r0, char r1, int r2) {
        r0.setAlphabeticShortcut(r1, r2);
    }

    public static void l(Notification.Builder r1) {
        r1.setBadgeIconType(0);
    }

    public static void m(MenuItem r0, CharSequence r1) {
        r0.setContentDescription(r1);
    }

    public static void n(Notification.Builder r0, int r1) {
        r0.setGroupAlertBehavior(r1);
    }

    public static void o(MenuItem r0, ColorStateList r1) {
        r0.setIconTintList(r1);
    }

    public static void p(MenuItem r0, PorterDuff.Mode r1) {
        r0.setIconTintMode(r1);
    }

    public static void q(MenuItem r0, char r1, int r2) {
        r0.setNumericShortcut(r1, r2);
    }

    public static void r(Notification.Builder r1) {
        r1.setSettingsText(null);
    }

    public static void s(Notification.Builder r1) {
        r1.setShortcutId(null);
    }

    public static void t(Notification.Builder r2) {
        r2.setTimeoutAfter(0);
    }

    public static void u(MenuItem r0, CharSequence r1) {
        r0.setTooltipText(r1);
    }

    public static void v(Context r0, Intent r1) {
        r0.startForegroundService(r1);
    }
}
