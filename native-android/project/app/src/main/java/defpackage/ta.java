package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta {
    public static final void a(i94 r2, AccessibilityEvent r3) {
        e94 r4 = r2.d;
        Object r0 = r4.n.g(n94.I);
        Object r1 = null;
        if (r0 != null) goto L5;
        r0 = null;
    L5:
        if (r0 != null) goto L16;
        Object r5 = r4.n.g(n94.F);
        if (r5 == null) goto L11;
        r1 = r5;
    L11:
        if (((ss4) r1) == null) goto L13;
        int r6 = 1;
    L14:
        r3.setTextChangeTypes(r6 | r3.getTextChangeTypes());
        return;
    L13:
        r6 = 0;
        goto L14
    L16:
        kf2.k();
    }
}
