package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hb5 {
    public static /* bridge */ /* synthetic */ int a() {
        return WindowInsets.Type.statusBars();
    }

    public static /* bridge */ /* synthetic */ int b(WindowInsetsController r0) {
        return r0.getSystemBarsAppearance();
    }

    public static /* bridge */ /* synthetic */ Insets c(WindowInsets r0, int r1) {
        return r0.getInsets(r1);
    }

    public static /* bridge */ /* synthetic */ Rect d(WindowMetrics r0) {
        return r0.getBounds();
    }

    public static /* bridge */ /* synthetic */ WindowInsets e() {
        return WindowInsets.CONSUMED;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController f(Window r0) {
        return r0.getInsetsController();
    }

    public static /* bridge */ /* synthetic */ WindowMetrics g(WindowManager r0) {
        return r0.getCurrentWindowMetrics();
    }

    public static /* bridge */ /* synthetic */ void h(WindowInsetsController r1) {
        r1.setSystemBarsAppearance(0, 0);
    }

    public static /* bridge */ /* synthetic */ void i(WindowInsetsController r0, int r1) {
        r0.setSystemBarsBehavior(r1);
    }

    public static /* bridge */ /* synthetic */ void j(WindowInsetsController r0, int r1, int r2) {
        r0.setSystemBarsAppearance(r1, r2);
    }

    public static /* bridge */ /* synthetic */ boolean k(WindowInsets r0, int r1) {
        return r0.isVisible(r1);
    }

    public static /* bridge */ /* synthetic */ int l() {
        return WindowInsets.Type.navigationBars();
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsController r1, int r2) {
        r1.setSystemBarsAppearance(0, r2);
    }

    public static /* bridge */ /* synthetic */ int n() {
        return WindowInsets.Type.captionBar();
    }

    public static /* bridge */ /* synthetic */ void o(WindowInsetsController r0, int r1) {
        r0.show(r1);
    }

    public static /* bridge */ /* synthetic */ int p() {
        return WindowInsets.Type.systemGestures();
    }

    public static /* bridge */ /* synthetic */ void q(WindowInsetsController r0, int r1) {
        r0.hide(r1);
    }

    public static /* bridge */ /* synthetic */ int r() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    public static /* bridge */ /* synthetic */ void s(WindowInsetsController r1, int r2) {
        r1.setSystemBarsAppearance(r2, 16);
    }

    public static /* bridge */ /* synthetic */ int t() {
        return WindowInsets.Type.tappableElement();
    }

    public static /* bridge */ /* synthetic */ void u(WindowInsetsController r1, int r2) {
        r1.setSystemBarsAppearance(r2, 8);
    }

    public static /* bridge */ /* synthetic */ int v() {
        return WindowInsets.Type.displayCutout();
    }
}
