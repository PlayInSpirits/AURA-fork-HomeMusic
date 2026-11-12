package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hd3 {
    public gc a;
    public dt b;
    public float c;
    public r62 d;

    public hd3() {
        this.c = 1.0f;
        this.d = r62.n;
    }

    public abstract void a(float r1);

    public abstract void b(dt r1);

    public final void c(e72 r7, long r8, float r10, dt r11) {
        mz r0 = r7.n;
        if (this.c == r10) goto L7;
        a(r10);
        this.c = r10;
    L7:
        if (h12.c(this.b, r11) == true) goto L9;
        b(r11);
        this.b = r11;
    L9:
        r62 r12 = r7.getLayoutDirection();
        if (this.d == r12) goto L12;
        this.d = r12;
    L12:
        int r13 = (int) (r8 >> 32);
        float r1 = Float.intBitsToFloat((int) (r0.P() >> 32)) - Float.intBitsToFloat(r13);
        int r9 = (int) (r8 & 4294967295L);
        float r2 = Float.intBitsToFloat((int) (r0.P() & 4294967295L)) - Float.intBitsToFloat(r9);
        ((zg5) r0.o.o).v(0.0f, 0.0f, r1, r2);
        if (r10 > 0.0f) goto L25;
    L23:
        ((zg5) r0.o.o).v(-0.0f, -0.0f, -r1, -r2);
        return;
    L25:
    L20:
        th = move-exception;
        ((zg5) r0.o.o).v(-0.0f, -0.0f, -r1, -r2);
        throw th;
    L15:
        if (Float.intBitsToFloat(r13) <= 0.0f) goto L23;
        if (Float.intBitsToFloat(r9) <= 0.0f) goto L23;
        e(r7);     // Catch: Throwable -> L20
        goto L23
    }

    public abstract long d();

    public abstract void e(e72 r1);
}
