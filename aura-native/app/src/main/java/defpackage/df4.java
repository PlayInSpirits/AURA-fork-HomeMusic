package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class df4 implements k51 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public m51 f;
    public wv4 g;

    public df4(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            tb4.a();
            return 0;
        }
        wv4 wv4Var = this.g;
        wv4Var.getClass();
        int f = wv4Var.f(l51Var, 1024, true);
        if (f != -1) {
            this.d += f;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        int i = this.b;
        int i2 = this.a;
        rr2.w((i2 == -1 || i == -1) ? false : true);
        be3 be3Var = new be3(i);
        ((rk0) l51Var).e(be3Var.a, 0, i, false);
        return be3Var.H() == i2;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.f = m51Var;
        wv4 t = m51Var.t(1024, 4);
        this.g = t;
        sb1 sb1Var = new sb1();
        String str = this.c;
        sb1Var.l = lw2.m(str);
        sb1Var.m = lw2.m(str);
        f34.l(sb1Var, t);
        this.f.p();
        this.f.w(new if4());
        this.e = 1;
    }

    @Override // defpackage.k51
    public final void a() {
    }
}
