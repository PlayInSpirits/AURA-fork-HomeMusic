package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(kq kqVar) {
        int i = kqVar.u;
        if (i == 2) {
            rr2.w(i == 2);
            kqVar.u = 1;
            kqVar.w();
        }
    }

    public static boolean h(kq kqVar) {
        return kqVar.u != 0;
    }

    public static void l(kq kqVar, long j) {
        kqVar.A = true;
        if (kqVar instanceof ts4) {
            ts4 ts4Var = (ts4) kqVar;
            rr2.w(ts4Var.A);
            ts4Var.X = j;
        }
    }

    public void a(kq kqVar, xl0 xl0Var) {
        rr2.w(((kq) this.e) == kqVar || ((kq) this.f) == kqVar);
        if (h(kqVar)) {
            if (kqVar == xl0Var.p) {
                xl0Var.q = null;
                xl0Var.p = null;
                xl0Var.r = true;
            }
            b(kqVar);
            rr2.w(kqVar.u == 1);
            kqVar.p.d();
            kqVar.u = 0;
            kqVar.v = null;
            kqVar.w = null;
            kqVar.A = false;
            kqVar.p();
            kqVar.D = null;
        }
    }

    public int c() {
        boolean zH = h((kq) this.e);
        kq kqVar = (kq) this.f;
        return (zH ? 1 : 0) + ((kqVar == null || !h(kqVar)) ? 0 : 1);
    }

    public kq d(oo2 oo2Var) {
        q44 q44Var;
        if (oo2Var != null && (q44Var = oo2Var.c[this.c]) != null) {
            kq kqVar = (kq) this.e;
            if (kqVar.v == q44Var) {
                return kqVar;
            }
            kq kqVar2 = (kq) this.f;
            if (kqVar2 != null && kqVar2.v == q44Var) {
                return kqVar2;
            }
        }
        return null;
    }

    public boolean e(oo2 oo2Var, kq kqVar) {
        int i = this.c;
        if (kqVar == null) {
            return true;
        }
        q44 q44Var = oo2Var.c[i];
        q44 q44Var2 = kqVar.v;
        if (q44Var2 == null) {
            return true;
        }
        if (q44Var2 == q44Var) {
            if (q44Var == null || kqVar.l()) {
                return true;
            }
            oo2 oo2Var2 = oo2Var.m;
            if (oo2Var.g.g && oo2Var2 != null && oo2Var2.e && ((kqVar instanceof ts4) || (kqVar instanceof yv2) || kqVar.z >= oo2Var2.e())) {
                return true;
            }
        }
        oo2 oo2Var3 = oo2Var.m;
        return oo2Var3 != null && oo2Var3.c[i] == kqVar.v;
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((kq) this.e);
        }
        kq kqVar = (kq) this.f;
        kqVar.getClass();
        return kqVar.u != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.a) {
                kq kqVar = (kq) this.e;
                rr2.w(kqVar.u == 0);
                kqVar.p.d();
                kqVar.u();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            kq kqVar2 = (kq) this.f;
            kqVar2.getClass();
            rr2.w(kqVar2.u == 0);
            kqVar2.p.d();
            kqVar2.u();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(kq kqVar, oo2 oo2Var, ew4 ew4Var, xl0 xl0Var) {
        int i;
        kq kqVar2 = (kq) this.e;
        int i2 = this.c;
        if (kqVar == null || kqVar.u == 0 || (kqVar == kqVar2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (kqVar == ((kq) this.f) && this.d == 3) {
            return 1;
        }
        Object[] objArr = kqVar.v != oo2Var.c[i2];
        boolean zN = ew4Var.n(i2);
        if (!zN || objArr != false) {
            if (!kqVar.A) {
                t41 t41Var = ((t41[]) ew4Var.q)[i2];
                int length = t41Var != null ? t41Var.length() : 0;
                tb1[] tb1VarArr = new tb1[length];
                for (int i3 = 0; i3 < length; i3++) {
                    t41Var.getClass();
                    tb1VarArr[i3] = t41Var.g(i3);
                }
                q44 q44Var = oo2Var.c[i2];
                q44Var.getClass();
                kqVar.B(tb1VarArr, q44Var, oo2Var.e(), oo2Var.p, oo2Var.g.a);
                return 3;
            }
            if (!kqVar.m()) {
                return 0;
            }
            a(kqVar, xl0Var);
            if (!zN || f()) {
                i(kqVar == kqVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((kq) this.e)) {
            i(true);
        }
        kq kqVar = (kq) this.f;
        if (kqVar == null || kqVar.u != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        kq kqVar = (kq) this.e;
        int i2 = kqVar.u;
        if (i2 == 1 && this.d != 4) {
            rr2.w(i2 == 1);
            kqVar.u = 2;
            kqVar.v();
            return;
        }
        kq kqVar2 = (kq) this.f;
        if (kqVar2 == null || (i = kqVar2.u) != 1 || this.d == 3) {
            return;
        }
        rr2.w(i == 1);
        kqVar2.u = 2;
        kqVar2.v();
    }
}
