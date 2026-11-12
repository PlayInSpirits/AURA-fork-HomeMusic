package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta {
    public static final void a(i94 i94Var, AccessibilityEvent accessibilityEvent) {
        e94 e94Var = i94Var.d;
        Object objG = e94Var.n.g(n94.I);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            kf2.k();
        } else {
            Object objG2 = e94Var.n.g(n94.F);
            accessibilityEvent.setTextChangeTypes((((ss4) (objG2 != null ? objG2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }
}
