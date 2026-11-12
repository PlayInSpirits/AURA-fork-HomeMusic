package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 implements uh0, rh0 {
    public final List n;
    public final wi0 o;
    public final th0 p;
    public int q = -1;
    public f42 r;
    public List s;
    public int t;
    public volatile tw2 u;
    public File v;

    public ph0(List list, wi0 wi0Var, th0 th0Var) {
        this.n = list;
        this.o = wi0Var;
        this.p = th0Var;
    }

    @Override // defpackage.rh0
    public final void b(Exception exc) {
        this.p.b(this.r, exc, this.u.c, 3);
    }

    @Override // defpackage.uh0
    public final boolean c() {
        while (true) {
            List list = this.s;
            boolean z = false;
            if (list != null && this.t < list.size()) {
                this.u = null;
                while (!z && this.t < this.s.size()) {
                    List list2 = this.s;
                    int i = this.t;
                    this.t = i + 1;
                    uw2 uw2Var = (uw2) list2.get(i);
                    File file = this.v;
                    wi0 wi0Var = this.o;
                    this.u = uw2Var.b(file, wi0Var.e, wi0Var.f, wi0Var.i);
                    if (this.u != null && this.o.c(this.u.c.a()) != null) {
                        this.u.c.d(this.o.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.q + 1;
            this.q = i2;
            if (i2 >= this.n.size()) {
                return false;
            }
            f42 f42Var = (f42) this.n.get(this.q);
            wi0 wi0Var2 = this.o;
            File fileM = wi0Var2.h.a().m(new qh0(f42Var, wi0Var2.n));
            this.v = fileM;
            if (fileM != null) {
                this.r = f42Var;
                this.s = this.o.c.a().f(fileM);
                this.t = 0;
            }
        }
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 tw2Var = this.u;
        if (tw2Var != null) {
            tw2Var.c.cancel();
        }
    }

    @Override // defpackage.rh0
    public final void f(Object obj) {
        this.p.a(this.r, obj, this.u.c, 3, this.r);
    }
}
