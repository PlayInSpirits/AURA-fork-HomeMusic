package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class va5 extends bb5 {
    public final WindowInsets.Builder e;

    public va5(pb5 pb5Var) {
        super(pb5Var);
        WindowInsets windowInsetsF = pb5Var.f();
        this.e = windowInsetsF != null ? lm4.j(windowInsetsF) : ek2.k();
    }

    @Override // defpackage.bb5
    public pb5 b() {
        a();
        pb5 pb5VarG = pb5.g(this.e.build(), null);
        vz1[] vz1VarArr = this.b;
        mb5 mb5Var = pb5VarG.a;
        mb5Var.v(vz1VarArr);
        mb5Var.u(null);
        mb5Var.z(this.c);
        mb5Var.A(this.d);
        return pb5VarG;
    }

    @Override // defpackage.bb5
    public void e(vz1 vz1Var) {
        this.e.setMandatorySystemGestureInsets(vz1Var.d());
    }

    @Override // defpackage.bb5
    public void f(vz1 vz1Var) {
        this.e.setStableInsets(vz1Var.d());
    }

    @Override // defpackage.bb5
    public void g(vz1 vz1Var) {
        this.e.setSystemGestureInsets(vz1Var.d());
    }

    @Override // defpackage.bb5
    public void h(vz1 vz1Var) {
        this.e.setSystemWindowInsets(vz1Var.d());
    }

    @Override // defpackage.bb5
    public void i(vz1 vz1Var) {
        this.e.setTappableElementInsets(vz1Var.d());
    }

    public va5() {
        this.e = ek2.k();
    }
}
