package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class hd3 {
    public gc a;
    public dt b;
    public float c = 1.0f;
    public r62 d = r62.n;

    public abstract void a(float f);

    public abstract void b(dt dtVar);

    public final void c(e72 e72Var, long j, float f, dt dtVar) {
        mz mzVar = e72Var.n;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!h12.c(this.b, dtVar)) {
            b(dtVar);
            this.b = dtVar;
        }
        r62 layoutDirection = e72Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (mzVar.P() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((zg5) mzVar.o.o).v(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(e72Var);
                }
            } finally {
                ((zg5) mzVar.o.o).v(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(e72 e72Var);
}
