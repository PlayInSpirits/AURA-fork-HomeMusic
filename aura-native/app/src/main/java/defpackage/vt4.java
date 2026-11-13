package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vt4 implements q44 {
    public final q44 n;
    public final long o;

    public vt4(q44 q44Var, long j) {
        this.n = q44Var;
        this.o = j;
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
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        int t = this.n.t(gp3Var, cj0Var, i);
        if (t == -4) {
            cj0Var.t += this.o;
        }
        return t;
    }

    @Override // defpackage.q44
    public final int u(long j) {
        return this.n.u(j - this.o);
    }
}
