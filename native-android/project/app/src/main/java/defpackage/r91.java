package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r91 {
    public static final int[] a = null;
    public static final Rect b = null;

    static {
        a = new int[2];
        b = new Rect();
    }

    public static final wv3 a(View r5, ra r6) {
        int[] r0 = a;
        r5.getLocationInWindow(r0);
        int r2 = r0[0];
        int r4 = r0[1];
        r6.getLocationInWindow(r0);
        int r7 = r0[0];
        float r1 = r4 - r0[1];
        Rect r3 = b;
        r5.getFocusedRect(r3);
        float r8 = (r2 - r7) + r3.left;
        return new wv3(r8, r3.top + r1, r3.width() + r8, (r1 + r3.top) + r3.height());
    }

    public static final Integer b(int r2) {
        if (r2 != 5) goto L7;
        return 33;
    L7:
        if (r2 != 6) goto L11;
        return 130;
    L11:
        if (r2 != 3) goto L15;
        return 17;
    L15:
        if (r2 != 4) goto L19;
        return 66;
    L19:
        if (r2 == 1) goto L21;
        if (r2 == 2) goto L24;
        return null;
    L24:
        return 1;
    L21:
        return 2;
    }

    public static final o91 c(int r2) {
        if (r2 == 1) goto L26;
        if (r2 == 2) goto L24;
        if (r2 == 17) goto L22;
        if (r2 == 33) goto L20;
        if (r2 == 66) goto L18;
        if (r2 == 130) goto L16;
        return null;
    L16:
        return new o91(6);
    L18:
        return new o91(4);
    L20:
        return new o91(5);
    L22:
        return new o91(3);
    L24:
        return new o91(1);
    L26:
        return new o91(2);
    }
}
