package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg3 {
    public int n;
    public int o;
    public long p;
    public long q;
    public long r;

    public jg3() {
        this.p = 0;
        this.q = kg3.b;
        this.r = 0;
    }

    public int F() {
        return (int) (this.p & 4294967295L);
    }

    public int G() {
        return (int) (this.p >> 32);
    }

    public final void L() {
        this.n = gb.m((int) (this.p >> 32), nc0.j(this.q), nc0.h(this.q));
        int r0 = gb.m((int) (this.p & 4294967295L), nc0.i(this.q), nc0.g(this.q));
        this.o = r0;
        int r1 = this.n;
        long r5 = this.p;
        int r2 = (r1 - ((int) (r5 >> 32))) / 2;
        int r3 = (r0 - ((int) (r5 & 4294967295L))) / 2;
        this.r = (((long) r2) << 32) | (4294967295L & ((long) r3));
    }

    public abstract void N(long r1, float r3, if1 r4);

    public final void Q(long r3) {
        if (n02.a(this.p, r3) == true) goto L6;
        this.p = r3;
        L();
        return;
    }

    public final void R(long r3) {
        if (nc0.b(this.q, r3) == true) goto L6;
        this.q = r3;
        L();
        return;
    }

    public abstract Object t();
}
