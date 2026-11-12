package defpackage;

import android.app.Notification;
import android.app.Service;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lm4 {
    public static /* bridge */ /* synthetic */ void A(WindowInsets.Builder r0, Insets r1) {
        r0.setStableInsets(r1);
    }

    public static /* bridge */ /* synthetic */ void B(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemGestureInsets(r1);
    }

    public static /* bridge */ /* synthetic */ void C(WindowInsets.Builder r0, Insets r1) {
        r0.setMandatorySystemGestureInsets(r1);
    }

    public static /* bridge */ /* synthetic */ void D(WindowInsets.Builder r0, Insets r1) {
        r0.setTappableElementInsets(r1);
    }

    public static /* bridge */ /* synthetic */ float a(View r0) {
        return r0.getTransitionAlpha();
    }

    public static /* bridge */ /* synthetic */ Insets b(WindowInsets r0) {
        return r0.getTappableElementInsets();
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder c(FontFamily r1) {
        return new Typeface.CustomFallbackBuilder(r1);
    }

    public static /* bridge */ /* synthetic */ Typeface d(Typeface.CustomFallbackBuilder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ Drawable e(EditText r0) {
        return r0.getTextCursorDrawable();
    }

    public static /* bridge */ /* synthetic */ Font.Builder f(Font.Builder r0, String r1) {
        return r0.setFontVariationSettings(r1);
    }

    public static /* bridge */ /* synthetic */ Font g(Font.Builder r0) {
        return r0.build();
    }

    public static /* synthetic */ FontFamily.Builder h(Font r1) {
        return new FontFamily.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ FontFamily i(FontFamily.Builder r0) {
        return r0.build();
    }

    public static /* synthetic */ WindowInsets.Builder j(WindowInsets r1) {
        return new WindowInsets.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ WindowInsets k(WindowInsets.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ WindowInsets l(WindowInsets r0, int r1, int r2, int r3, int r4) {
        return r0.inset(r1, r2, r3, r4);
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ void n(Service r0, int r1, Notification r2, int r3) {
        r0.startForeground(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ void o(Canvas r0, RenderNode r1) {
        r0.drawRenderNode(r1);
    }

    public static /* bridge */ /* synthetic */ void p(Typeface.CustomFallbackBuilder r0, FontFamily r1) {
        r0.addCustomFallback(r1);
    }

    public static /* bridge */ /* synthetic */ void q(Typeface.CustomFallbackBuilder r0, String r1) {
        r0.setSystemFallback(r1);
    }

    public static /* bridge */ /* synthetic */ void r(View r0, float r1) {
        r0.setTransitionAlpha(r1);
    }

    public static /* bridge */ /* synthetic */ void s(View r0, int r1) {
        r0.setTransitionVisibility(r1);
    }

    public static /* bridge */ /* synthetic */ void t(View r0, int r1, int r2, int r3, int r4) {
        r0.setLeftTopRightBottom(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void u(View r0, Matrix r1) {
        r0.transformMatrixToLocal(r1);
    }

    public static /* bridge */ /* synthetic */ void v(ViewGroup r0, boolean r1) {
        r0.suppressLayout(r1);
    }

    public static /* bridge */ /* synthetic */ void w(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemWindowInsets(r1);
    }

    public static /* bridge */ /* synthetic */ Insets x(WindowInsets r0) {
        return r0.getMandatorySystemGestureInsets();
    }

    public static /* synthetic */ FontFamily.Builder y(Font r1) {
        return new FontFamily.Builder(r1);
    }

    public static /* synthetic */ void z() {
    }
}
