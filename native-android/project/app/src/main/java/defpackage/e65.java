package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e65 {
    public static CharSequence a(View r0) {
        return r0.getAccessibilityPaneTitle();
    }

    public static boolean b(View r0) {
        return r0.isAccessibilityHeading();
    }

    public static boolean c(View r0) {
        return r0.isScreenReaderFocusable();
    }

    public static void d(View r0, boolean r1) {
        r0.setAccessibilityHeading(r1);
    }

    public static void e(View r0, CharSequence r1) {
        r0.setAccessibilityPaneTitle(r1);
    }

    public static void f(View r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }
}
