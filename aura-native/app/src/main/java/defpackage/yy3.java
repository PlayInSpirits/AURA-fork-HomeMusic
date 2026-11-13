package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yy3 implements we0, vy3 {
    public static final iz q = new iz(0);
    public final ne0 n;
    public final yy3 o = this;
    public volatile ne0 p;

    public yy3(ne0 ne0Var) {
        this.n = ne0Var;
    }

    @Override // defpackage.vy3
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.o) {
            try {
                ne0 ne0Var = this.p;
                if (ne0Var == null) {
                    this.p = q;
                } else {
                    pb1 pb1Var = new pb1(0);
                    s22 s22Var = (s22) ne0Var.K(fz0.h0);
                    if (s22Var != null) {
                        s22Var.f(pb1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vy3
    public final void c() {
        b();
    }

    @Override // defpackage.we0
    public final ne0 e() {
        ne0 ne0Var;
        ne0 ne0Var2 = this.p;
        if (ne0Var2 == null || ne0Var2 == q) {
            x80 x80Var = (x80) this.n.K(x80.o);
            ne0 xy3Var = x80Var != null ? new xy3(x80Var, this) : q01.n;
            synchronized (this.o) {
                try {
                    ne0 ne0Var3 = this.p;
                    if (ne0Var3 == null) {
                        ne0 ne0Var4 = this.n;
                        ne0Var = ne0Var4.J(new t22((s22) ne0Var4.K(fz0.h0))).J(q01.n).J(xy3Var);
                    } else if (ne0Var3 == q) {
                        ne0 ne0Var5 = this.n;
                        t22 t22Var = new t22((s22) ne0Var5.K(fz0.h0));
                        t22Var.o(new pb1(0));
                        ne0Var = ne0Var5.J(t22Var).J(q01.n).J(xy3Var);
                    } else {
                        ne0Var = ne0Var3;
                    }
                    this.p = ne0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ne0Var2 = ne0Var;
        }
        ne0Var2.getClass();
        return ne0Var2;
    }

    @Override // defpackage.vy3
    public final void d() {
    }
}
