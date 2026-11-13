/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;

public abstract class hb5 {
    public static int a() {
        return WindowInsets.Type.statusBars();
    }

    public static int b(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsAppearance();
    }

    public static Insets c(WindowInsets windowInsets, int n16) {
        return windowInsets.getInsets(n16);
    }

    public static Rect d(WindowMetrics windowMetrics) {
        return windowMetrics.getBounds();
    }

    public static WindowInsets e() {
        return WindowInsets.CONSUMED;
    }

    public static WindowInsetsController f(Window window) {
        return window.getInsetsController();
    }

    public static WindowMetrics g(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics();
    }

    public static void h(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 0);
    }

    public static void i(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.setSystemBarsBehavior(n16);
    }

    public static void j(WindowInsetsController windowInsetsController, int n16, int n17) {
        windowInsetsController.setSystemBarsAppearance(n16, n17);
    }

    public static boolean k(WindowInsets windowInsets, int n16) {
        return windowInsets.isVisible(n16);
    }

    public static int l() {
        return WindowInsets.Type.navigationBars();
    }

    public static void m(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.setSystemBarsAppearance(0, n16);
    }

    public static int n() {
        return WindowInsets.Type.captionBar();
    }

    public static void o(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.show(n16);
    }

    public static int p() {
        return WindowInsets.Type.systemGestures();
    }

    public static void q(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.hide(n16);
    }

    public static int r() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    public static void s(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.setSystemBarsAppearance(n16, 16);
    }

    public static int t() {
        return WindowInsets.Type.tappableElement();
    }

    public static void u(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.setSystemBarsAppearance(n16, 8);
    }

    public static int v() {
        return WindowInsets.Type.displayCutout();
    }
}

