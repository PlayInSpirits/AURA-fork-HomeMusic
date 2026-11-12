package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vt4 implements q44 {
    public final q44 n;
    public final long o;

    public vt4(q44 r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.q44
    public final boolean c() {
        return this.n.c();
    }

    @Override // defpackage.q44
    public final void s() {
        this.n.s();
    }

    @Override // defpackage.q44
    public final int t(gp3 r5, cj0 r6, int r7) {
        int r8 = this.n.t(r5, r6, r7);
        if (r8 != (-4)) goto L5;
        r6.t += this.o;
    L5:
        return r8;
    }

    @Override // defpackage.q44
    public final int u(long r3) {
        long r4 = r3 - this.o;
        return this.n.u(r4);
    }
}
