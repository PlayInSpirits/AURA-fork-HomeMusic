package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i34 extends Drawable {
    public static final double a = 0.0d;

    static {
        a = Math.cos(Math.toRadians(45.0d));
    }

    public static float a(float r6, float r7, boolean r8) {
        if (r8 == true) goto L4;
        return r6;
    L4:
        return (float) (((1.0d - a) * ((double) r7)) + r6);
    }

    public static float b(float r6, float r7, boolean r8) {
        if (r8 == false) goto L7;
        return (float) (((1.0d - a) * ((double) r7)) + (r6 * 1.5f));
    L7:
        return r6 * 1.5f;
    }
}
