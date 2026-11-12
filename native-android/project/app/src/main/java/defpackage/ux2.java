package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux2 {
    public static final ux2 a = null;

    static {
        a = new ux2();
    }

    public final boolean a(MotionEvent r3, int r4) {
        if ((Float.floatToRawIntBits(ek2.b(r3, r4)) & Integer.MAX_VALUE) < 2139095040) goto L5;
        return false;
    L5:
        if ((Float.floatToRawIntBits(ek2.A(r3, r4)) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        return true;
    L10:
        return false;
    }
}
