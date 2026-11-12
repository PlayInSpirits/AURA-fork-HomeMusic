package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b24 implements oo0 {
    public r62 A;
    public int B;
    public ya4 C;
    public int n;
    public float o = 1.0f;
    public float p = 1.0f;
    public float q = 1.0f;
    public long r;
    public long s;
    public float t;
    public long u;
    public ac4 v;
    public boolean w;
    public long x;
    public m62 y;
    public oo0 z;

    public b24() {
        long j = wj1.a;
        this.r = j;
        this.s = j;
        this.t = 8.0f;
        this.u = tw4.a;
        this.v = kb4.b;
        this.x = 9205357640488583168L;
        this.y = m62.a;
        this.z = new ro0(1.0f, 1.0f);
        this.A = r62.n;
        this.B = 3;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.z.J();
    }

    public final void a() {
        c(1.0f);
        e(1.0f);
        b(1.0f);
        long j = wj1.a;
        if (!x40.c(this.r, j)) {
            this.n |= 64;
            this.r = j;
        }
        if (!x40.c(this.s, j)) {
            this.n |= 128;
            this.s = j;
        }
        if (this.t != 8.0f) {
            this.n |= 2048;
            this.t = 8.0f;
        }
        long j2 = tw4.a;
        if (this.u != j2) {
            this.n |= 4096;
            this.u = j2;
        }
        sp1 sp1Var = kb4.b;
        if (!h12.c(this.v, sp1Var)) {
            this.n |= 8192;
            this.v = sp1Var;
        }
        if (this.w) {
            this.n |= 16384;
            this.w = false;
        }
        if (this.B != 3) {
            this.n |= 524288;
            this.B = 3;
        }
        m62 m62Var = m62.a;
        if (!h12.c(this.y, m62Var)) {
            this.n |= 1048576;
            this.y = m62Var;
        }
        this.x = 9205357640488583168L;
        this.C = null;
        this.n = 0;
    }

    public final void b(float f) {
        if (this.q == f) {
            return;
        }
        this.n |= 4;
        this.q = f;
    }

    public final void c(float f) {
        if (this.o == f) {
            return;
        }
        this.n |= 1;
        this.o = f;
    }

    public final void e(float f) {
        if (this.p == f) {
            return;
        }
        this.n |= 2;
        this.p = f;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.z.g();
    }
}
