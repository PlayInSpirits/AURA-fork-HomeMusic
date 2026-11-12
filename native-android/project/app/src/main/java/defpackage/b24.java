package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b24 implements oo0 {
    public r62 A;
    public int B;
    public ya4 C;
    public int n;
    public float o;
    public float p;
    public float q;
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
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = 1.0f;
        long r1 = wj1.a;
        this.r = r1;
        this.s = r1;
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
        long r0 = wj1.a;
        if (x40.c(this.r, r0) == true) goto L6;
        this.n |= 64;
        this.r = r0;
    L6:
        if (x40.c(this.s, r0) == true) goto L9;
        this.n |= 128;
        this.s = r0;
    L9:
        if (this.t == 8.0f) goto L12;
        this.n |= 2048;
        this.t = 8.0f;
    L12:
        long r1 = tw4.a;
        if (this.u == r1) goto L16;
        this.n |= 4096;
        this.u = r1;
    L16:
        sp1 r2 = kb4.b;
        if (h12.c(this.v, r2) == true) goto L20;
        this.n |= 8192;
        this.v = r2;
    L20:
        if (this.w == false) goto L23;
        this.n |= 16384;
        this.w = false;
    L23:
        if (this.B == 3) goto L26;
        this.n |= 524288;
        this.B = 3;
    L26:
        m62 r3 = m62.a;
        if (h12.c(this.y, r3) == true) goto L29;
        this.n |= 1048576;
        this.y = r3;
    L29:
        this.x = 9205357640488583168L;
        this.C = null;
        this.n = 0;
    }

    public final void b(float r2) {
        if (this.q != r2) goto L5;
        return;
    L5:
        this.n |= 4;
        this.q = r2;
    }

    public final void c(float r2) {
        if (this.o != r2) goto L5;
        return;
    L5:
        this.n |= 1;
        this.o = r2;
    }

    public final void e(float r2) {
        if (this.p != r2) goto L5;
        return;
    L5:
        this.n |= 2;
        this.p = r2;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.z.g();
    }
}
