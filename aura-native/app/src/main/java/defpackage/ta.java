package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ta {
    public static final void a(i94 i94Var, AccessibilityEvent accessibilityEvent) {
        e94 e94Var = i94Var.d;
        Object g = e94Var.n.g(n94.I);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            kf2.k();
        } else {
            Object g2 = e94Var.n.g(n94.F);
            accessibilityEvent.setTextChangeTypes((((ss4) (g2 != null ? g2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }
}
