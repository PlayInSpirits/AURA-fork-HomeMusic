package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf4 extends rp {
    public Object b;
    public Object c;
    public x03 d;
    public x03 e;
    public y94 f;
    public final kl3 g;
    public final ss2 h;

    public jf4() {
        super(4);
        this.g = new kl3(10, this);
        z zVar = new z(12, this);
        jh4.e(jh4.a);
        synchronized (jh4.c) {
            jh4.h = q40.F0(zVar, jh4.h);
        }
        this.h = new ss2(18, zVar);
    }

    @Override // defpackage.rp
    public final void e(y94 y94Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.rp
    public final void f() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        x03 x03Var = w54.a;
                        this.d = new x03();
                    }
                    x03 x03Var2 = this.d;
                    this.d = this.e;
                    this.e = x03Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rp
    public final void h() {
        this.h.d();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.rp
    public final if1 m(y94 y94Var) {
        y94 y94Var2 = this.f;
        if (y94Var2 != null && !y94Var2.equals(y94Var)) {
            oo3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = y94Var;
        return this.g;
    }

    @Override // defpackage.rp
    public final void n(y00 y00Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        f();
    }
}
