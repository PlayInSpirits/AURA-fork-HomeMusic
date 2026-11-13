package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zt2 implements st2, tw0 {
    public final bu2 n;
    public final /* synthetic */ fo1 o;

    public zt2(fo1 fo1Var, bu2 bu2Var) {
        this.o = fo1Var;
        this.n = bu2Var;
    }

    @Override // defpackage.tw0
    public final void D(int i, mt2 mt2Var, tv1 tv1Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new qo2(this, a, tv1Var, 3));
        }
    }

    @Override // defpackage.tw0
    public final void M(int i, mt2 mt2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new xt2(this, a, 0));
        }
    }

    @Override // defpackage.st2
    public final void U(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var, int i2) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new fm2(this, a, ed2Var, un2Var, i2, 2));
        }
    }

    public final Pair a(int i, mt2 mt2Var) {
        mt2 mt2Var2;
        bu2 bu2Var = this.n;
        mt2 mt2Var3 = null;
        if (mt2Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= bu2Var.c.size()) {
                    mt2Var2 = null;
                    break;
                }
                if (((mt2) bu2Var.c.get(i2)).d == mt2Var.d) {
                    Object obj = mt2Var.a;
                    Object obj2 = bu2Var.b;
                    int i3 = tm3.n;
                    mt2Var2 = mt2Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (mt2Var2 == null) {
                return null;
            }
            mt2Var3 = mt2Var2;
        }
        return Pair.create(Integer.valueOf(i + bu2Var.d), mt2Var3);
    }

    @Override // defpackage.tw0
    public final void c(int i, mt2 mt2Var, Exception exc) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new qo2(this, a, exc, 4));
        }
    }

    @Override // defpackage.st2
    public final void l(int i, mt2 mt2Var, un2 un2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new vt2(this, a, un2Var, 1));
        }
    }

    @Override // defpackage.st2
    public final void m(int i, mt2 mt2Var, un2 un2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new vt2(this, a, un2Var, 0));
        }
    }

    @Override // defpackage.tw0
    public final void p(int i, mt2 mt2Var, int i2) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new gk(this, a, i2, 8));
        }
    }

    @Override // defpackage.st2
    public final void u(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new wt2(this, a, ed2Var, un2Var, 0));
        }
    }

    @Override // defpackage.st2
    public final void w(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new wt2(this, a, ed2Var, un2Var, 1));
        }
    }

    @Override // defpackage.st2
    public final void y(int i, mt2 mt2Var, final ed2 ed2Var, final un2 un2Var, final IOException iOException, final boolean z) {
        final Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new Runnable() { // from class: yt2
                @Override // java.lang.Runnable
                public final void run() {
                    nj0 nj0Var = (nj0) zt2.this.o.i;
                    Pair pair = a;
                    nj0Var.y(((Integer) pair.first).intValue(), (mt2) pair.second, ed2Var, un2Var, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.tw0
    public final void z(int i, mt2 mt2Var) {
        Pair a = a(i, mt2Var);
        if (a != null) {
            ((yp4) this.o.j).d(new xt2(this, a, 1));
        }
    }
}
