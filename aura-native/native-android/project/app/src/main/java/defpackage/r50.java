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
    public static final ColorSpace a(p50 p50Var) {
        ColorSpace colorSpace;
        if (h12.c(p50Var, s50.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (h12.c(p50Var, s50.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (h12.c(p50Var, s50.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (h12.c(p50Var, s50.o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (h12.c(p50Var, s50.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (h12.c(p50Var, s50.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (h12.c(p50Var, s50.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (h12.c(p50Var, s50.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (h12.c(p50Var, s50.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (h12.c(p50Var, s50.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (h12.c(p50Var, s50.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (h12.c(p50Var, s50.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (h12.c(p50Var, s50.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (h12.c(p50Var, s50.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (h12.c(p50Var, s50.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (h12.c(p50Var, s50.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (h12.c(p50Var, s50.v)) {
                colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
            } else {
                colorSpace = h12.c(p50Var, s50.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (i >= 36) {
            ColorSpace colorSpace2 = h12.c(p50Var, s50.x) ? ColorSpace.get(ColorSpace.Named.OK_LAB) : null;
            if (colorSpace2 != null) {
                return colorSpace2;
            }
        }
        if (!(p50Var instanceof k24)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = p50Var.a;
        k24 k24Var = (k24) p50Var;
        float[] fArrA = k24Var.d.a();
        sw4 sw4Var = k24Var.g;
        ColorSpace.Rgb.TransferParameters transferParameters = sw4Var != null ? new ColorSpace.Rgb.TransferParameters(sw4Var.b, sw4Var.c, sw4Var.d, sw4Var.e, sw4Var.f, sw4Var.g, sw4Var.a) : null;
        float[] fArr = k24Var.i;
        final int i2 = 0;
        if (transferParameters != null) {
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, k24Var.h, fArrA, transferParameters);
            return (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = k24Var.h;
        final j24 j24Var = k24Var.l;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: q50
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i3 = i2;
                if1 if1Var = j24Var;
                switch (i3) {
                    case 0:
                        break;
                }
                return ((Number) if1Var.invoke(Double.valueOf(d))).doubleValue();
            }
        };
        final j24 j24Var2 = k24Var.o;
        final int i3 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: q50
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i4 = i3;
                if1 if1Var = j24Var2;
                switch (i4) {
                    case 0:
                        break;
                }
                return ((Number) if1Var.invoke(Double.valueOf(d))).doubleValue();
            }
        }, k24Var.e, k24Var.f);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId d(View view) {
        return view.getAutofillId();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, ud3.d0(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
    }

    public static void k(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void l(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void n(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void o(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void p(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void q(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void r(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void s(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void t(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void u(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void v(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
