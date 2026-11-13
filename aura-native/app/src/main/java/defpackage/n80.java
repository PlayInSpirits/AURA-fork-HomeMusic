package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n80 implements st2, tw0 {
    public final Object n;
    public ue1 o;
    public sw0 p;
    public final /* synthetic */ p80 q;

    public n80(p80 p80Var, Object obj) {
        this.q = p80Var;
        this.o = new ue1((CopyOnWriteArrayList) p80Var.c.q, 0, (Object) null, 8);
        this.p = new sw0(p80Var.d.c, 0, null);
        this.n = obj;
    }

    @Override // defpackage.tw0
    public final void D(int i, mt2 mt2Var, tv1 tv1Var) {
        if (a(i, mt2Var)) {
            this.p.a(tv1Var);
        }
    }

    @Override // defpackage.tw0
    public final void M(int i, mt2 mt2Var) {
        if (a(i, mt2Var)) {
            this.p.e();
        }
    }

    @Override // defpackage.st2
    public final void U(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var, int i2) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            ue1Var.getClass();
            ue1Var.i(new ot2(ue1Var, ed2Var, b, i2));
        }
    }

    public final boolean a(int i, mt2 mt2Var) {
        mt2 mt2Var2;
        Object obj = this.n;
        p80 p80Var = this.q;
        if (mt2Var != null) {
            mt2Var2 = p80Var.t(obj, mt2Var);
            if (mt2Var2 == null) {
                return false;
            }
        } else {
            mt2Var2 = null;
        }
        int v = p80Var.v(i, obj);
        ue1 ue1Var = this.o;
        if (ue1Var.o != v || !Objects.equals((mt2) ue1Var.p, mt2Var2)) {
            this.o = new ue1((CopyOnWriteArrayList) p80Var.c.q, v, mt2Var2, 8);
        }
        sw0 sw0Var = this.p;
        if (sw0Var.a == v && Objects.equals(sw0Var.b, mt2Var2)) {
            return true;
        }
        this.p = new sw0(p80Var.d.c, v, mt2Var2);
        return true;
    }

    public final un2 b(un2 un2Var, mt2 mt2Var) {
        long j = un2Var.f;
        p80 p80Var = this.q;
        Object obj = this.n;
        long u = p80Var.u(j, obj);
        long j2 = un2Var.g;
        long u2 = p80Var.u(j2, obj);
        return (u == j && u2 == j2) ? un2Var : new un2(un2Var.a, un2Var.b, un2Var.c, un2Var.d, un2Var.e, u, u2);
    }

    @Override // defpackage.tw0
    public final void c(int i, mt2 mt2Var, Exception exc) {
        if (a(i, mt2Var)) {
            this.p.d(exc);
        }
    }

    @Override // defpackage.st2
    public final void l(int i, mt2 mt2Var, un2 un2Var) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            ue1Var.getClass();
            ue1Var.i(new bt2(ue1Var, b));
        }
    }

    @Override // defpackage.st2
    public final void m(int i, mt2 mt2Var, un2 un2Var) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            mt2 mt2Var2 = (mt2) ue1Var.p;
            mt2Var2.getClass();
            ue1Var.i(new eg0(ue1Var, mt2Var2, b, 10));
        }
    }

    @Override // defpackage.tw0
    public final void p(int i, mt2 mt2Var, int i2) {
        if (a(i, mt2Var)) {
            this.p.c(i2);
        }
    }

    @Override // defpackage.st2
    public final void u(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            ue1Var.getClass();
            ue1Var.i(new pt2(ue1Var, ed2Var, b, 1));
        }
    }

    @Override // defpackage.st2
    public final void w(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            ue1Var.getClass();
            ue1Var.i(new pt2(ue1Var, ed2Var, b, 0));
        }
    }

    @Override // defpackage.st2
    public final void y(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var, IOException iOException, boolean z) {
        if (a(i, mt2Var)) {
            ue1 ue1Var = this.o;
            un2 b = b(un2Var, mt2Var);
            ue1Var.getClass();
            ue1Var.i(new qt2(ue1Var, ed2Var, b, iOException, z));
        }
    }

    @Override // defpackage.tw0
    public final void z(int i, mt2 mt2Var) {
        if (a(i, mt2Var)) {
            this.p.b();
        }
    }
}
