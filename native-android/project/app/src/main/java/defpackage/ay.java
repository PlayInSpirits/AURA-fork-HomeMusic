package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay {
    public static final ay a = null;

    static {
        a = new ay();
    }

    public final void a(View r4, float[] r5, Matrix r6, int[] r7) {
        r6.reset();
        z9.s(r4, r6);
        ViewParent r3 = r4.getParent();
    L4:
        if ((r3 instanceof View) == false) goto L6;
        r4 = r3;
        r3 = r4.getParent();
        goto L4
    L6:
        r4.getLocationOnScreen(r7);
        int r0 = r7[0];
        int r2 = r7[1];
        r4.getLocationInWindow(r7);
        r6.postTranslate(r7[0] - r0, r7[1] - r2);
        hw.L(r5, r6);
    }
}
