package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sa5 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public sa5(int r1, Interpolator r2, long r3) {
        this.a = r1;
        this.c = r2;
        this.d = r3;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float r0 = this.b;
        Interpolator r1 = this.c;
        if (r1 != null) goto L5;
        return r0;
    L5:
        return r1.getInterpolation(r0);
    }

    public int d() {
        return this.a;
    }

    public void e(float r1) {
        this.b = r1;
    }
}
