package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a40 implements q44 {
    public final q44 n;
    public boolean o;
    public final /* synthetic */ b40 p;

    public a40(b40 b40Var, q44 q44Var) {
        this.p = b40Var;
        this.n = q44Var;
    }

    @Override // defpackage.q44
    public final boolean c() {
        return !this.p.a() && this.n.c();
    }

    @Override // defpackage.q44
    public final void s() {
        this.n.s();
    }

    @Override // defpackage.q44
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        b40 b40Var = this.p;
        if (b40Var.a()) {
            return -3;
        }
        if (this.o) {
            cj0Var.o = 4;
            return -4;
        }
        long q = b40Var.q();
        int t = this.n.t(gp3Var, cj0Var, i);
        if (t != -5) {
            long j = b40Var.t;
            if (j == Long.MIN_VALUE || ((t != -4 || cj0Var.t < j) && !(t == -3 && q == Long.MIN_VALUE && !cj0Var.s))) {
                return t;
            }
            cj0Var.r();
            cj0Var.o = 4;
            this.o = true;
            return -4;
        }
        tb1 tb1Var = (tb1) gp3Var.p;
        tb1Var.getClass();
        int i2 = tb1Var.J;
        int i3 = tb1Var.I;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (b40Var.s != 0) {
            i3 = 0;
        }
        if (b40Var.t != Long.MIN_VALUE) {
            i2 = 0;
        }
        sb1 a = tb1Var.a();
        a.H = i3;
        a.I = i2;
        gp3Var.p = new tb1(a);
        return -5;
    }

    @Override // defpackage.q44
    public final int u(long j) {
        if (this.p.a()) {
            return -3;
        }
        return this.n.u(j);
    }
}
