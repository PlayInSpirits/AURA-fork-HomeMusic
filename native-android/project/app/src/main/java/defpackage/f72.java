package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 {
    public final c72 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public if2 q;
    public y62 d = y62.r;
    public final ti2 p = new ti2(this);

    public f72(c72 c72Var) {
        this.a = c72Var;
    }

    public final f63 a() {
        return (f63) this.a.Q.e;
    }

    public final void b() {
        y62 y62Var = this.a.R.d;
        y62 y62Var2 = y62.p;
        y62 y62Var3 = y62.q;
        if (y62Var == y62Var2 || y62Var == y62Var3) {
            if (this.p.K) {
                g(true);
            } else {
                f(true);
            }
        }
        if (y62Var == y62Var3) {
            if2 if2Var = this.q;
            if (if2Var == null || !if2Var.G) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        if2 if2Var = this.q;
        if (if2Var != null) {
            f72 f72Var = if2Var.s;
            f72Var.d = y62.o;
            c72 c72Var = f72Var.a;
            f72Var.e = false;
            if2Var.I = j;
            wb3 snapshotObserver = ((ra) h12.L(c72Var)).getSnapshotObserver();
            gf2 gf2Var = if2Var.J;
            snapshotObserver.a.e(c72Var, snapshotObserver.b, gf2Var);
            f72Var.f = true;
            f72Var.g = true;
            boolean zA = h12.A(c72Var);
            ti2 ti2Var = f72Var.p;
            if (zA) {
                ti2Var.F = true;
                ti2Var.G = true;
            } else {
                ti2Var.E = true;
            }
            f72Var.d = y62.r;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            c72 c72VarT = this.a.t();
            f72 f72Var = c72VarT != null ? c72VarT.R : null;
            if (f72Var != null) {
                int i3 = f72Var.l;
                if (i == 0) {
                    f72Var.d(i3 - 1);
                } else {
                    f72Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            c72 c72VarT = this.a.t();
            f72 f72Var = c72VarT != null ? c72VarT.R : null;
            if (f72Var != null) {
                int i3 = f72Var.o;
                if (i == 0) {
                    f72Var.e(i3 - 1);
                } else {
                    f72Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        this.p.s.a().t();
        if2 if2Var = this.q;
        if (if2Var != null) {
            ef2 ef2VarY0 = if2Var.s.a().y0();
            ef2VarY0.getClass();
            ef2VarY0.t();
        }
    }
}
