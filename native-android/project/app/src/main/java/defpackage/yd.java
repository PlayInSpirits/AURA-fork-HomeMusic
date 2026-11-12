package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yd {
    public static final LinearInterpolator a = null;
    public static final a61 b = null;
    public static final a61 c = null;
    public static final a61 d = null;
    public static final DecelerateInterpolator e = null;

    static {
        a = new LinearInterpolator();
        b = new a61(1);
        c = new a61(0);
        d = new a61(a61.e);
        e = new DecelerateInterpolator();
    }

    public static float a(float r0, float r1, float r2) {
        return xa3.a(r1, r0, r2, r0);
    }

    public static float b(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return a(r1, r2, (r5 - r3) / (r4 - r3));
    }

    public static int c(int r0, float r1, int r2) {
        return Math.round(r1 * (r2 - r0)) + r0;
    }
}
