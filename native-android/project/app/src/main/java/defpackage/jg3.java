package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg3 {
    public int n;
    public int o;
    public long p = 0;
    public long q = kg3.b;
    public long r = 0;

    public int F() {
        return (int) (this.p & 4294967295L);
    }

    public int G() {
        return (int) (this.p >> 32);
    }

    public final void L() {
        this.n = gb.m((int) (this.p >> 32), nc0.j(this.q), nc0.h(this.q));
        int iM = gb.m((int) (this.p & 4294967295L), nc0.i(this.q), nc0.g(this.q));
        this.o = iM;
        int i = this.n;
        long j = this.p;
        this.r = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void N(long j, float f, if1 if1Var);

    public final void Q(long j) {
        if (n02.a(this.p, j)) {
            return;
        }
        this.p = j;
        L();
    }

    public final void R(long j) {
        if (nc0.b(this.q, j)) {
            return;
        }
        this.q = j;
        L();
    }

    public abstract Object t();
}
