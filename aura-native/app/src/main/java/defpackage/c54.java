package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c54 implements w92, AutoCloseable {
    public final String n;
    public final b54 o;
    public boolean p;

    public c54(String str, b54 b54Var) {
        this.n = str;
        this.o = b54Var;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        if (q92Var == q92.ON_DESTROY) {
            this.p = false;
            ba2Var.h().f(this);
        }
    }

    public final void f(rm3 rm3Var, ea2 ea2Var) {
        rm3Var.getClass();
        ea2Var.getClass();
        if (this.p) {
            kf2.o("Already attached to lifecycleOwner");
            return;
        }
        this.p = true;
        ea2Var.a(this);
        rm3Var.L(this.n, (cs0) this.o.a.r);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
