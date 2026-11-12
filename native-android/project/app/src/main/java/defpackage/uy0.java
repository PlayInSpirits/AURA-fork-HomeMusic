package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uy0 {
    public static final float a = 0.0f;
    public static final double b = 0.0d;
    public static final double c = 0.0d;

    static {
        a = ViewConfiguration.getScrollFriction();
        double r0 = Math.log(0.78d) / Math.log(0.9d);
        b = r0;
        c = r0 - 1.0d;
    }
}
