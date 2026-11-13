package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wr0 implements vy3 {
    public final if1 n;
    public xr0 o;

    public wr0(if1 if1Var) {
        this.n = if1Var;
    }

    @Override // defpackage.vy3
    public final void c() {
        xr0 xr0Var = this.o;
        if (xr0Var != null) {
            xr0Var.a();
        }
        this.o = null;
    }

    @Override // defpackage.vy3
    public final void d() {
        this.o = (xr0) this.n.invoke(bu.b);
    }

    @Override // defpackage.vy3
    public final void a() {
    }
}
