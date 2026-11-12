package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gc4 extends ic4 {
    public static final RectF h = null;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    static {
        h = new RectF();
    }

    public gc4(float r1, float r2, float r3, float r4) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    @Override // defpackage.ic4
    public final void a(Matrix r6, Path r7) {
        Matrix r0 = this.a;
        r6.invert(r0);
        r7.transform(r0);
        float r1 = this.d;
        float r2 = this.e;
        RectF r3 = h;
        r3.set(this.b, this.c, r1, r2);
        r7.arcTo(r3, this.f, this.g, false);
        r7.transform(r6);
    }
}
