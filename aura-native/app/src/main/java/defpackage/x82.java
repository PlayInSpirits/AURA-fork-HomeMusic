package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x82 extends cx2 implements g94 {
    public gf1 B;
    public s82 C;
    public boolean D;
    public h64 E;
    public final u82 F = new u82(this, 0);
    public u82 G;

    public x82(gf1 gf1Var, s82 s82Var, boolean z) {
        this.B = gf1Var;
        this.C = s82Var;
        this.D = z;
        q0();
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        c42[] c42VarArr = o94.a;
        p94 p94Var = n94.m;
        c42[] c42VarArr2 = o94.a;
        c42 c42Var = c42VarArr2[6];
        Boolean bool = Boolean.TRUE;
        p94Var.getClass();
        q94Var.a(p94Var, bool);
        q94Var.a(n94.L, this.F);
        h64 h64Var = this.E;
        if (h64Var == null) {
            h12.Q("scrollAxisRange");
            throw null;
        }
        p94 p94Var2 = n94.u;
        c42 c42Var2 = c42VarArr2[12];
        p94Var2.getClass();
        q94Var.a(p94Var2, h64Var);
        u82 u82Var = this.G;
        if (u82Var != null) {
            q94Var.a(d94.f, new w2(null, u82Var));
        }
        q94Var.a(d94.B, new w2(null, new kl3(7, new v82(this, 2))));
        s82 s82Var = this.C;
        boolean z = s82Var.b;
        lm0 lm0Var = s82Var.a;
        o40 o40Var = z ? new o40(lm0Var.n(), 1) : new o40(1, lm0Var.n());
        p94 p94Var3 = n94.f;
        c42 c42Var3 = c42VarArr2[24];
        p94Var3.getClass();
        q94Var.a(p94Var3, o40Var);
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final void q0() {
        this.E = new h64(new v82(this, 0), new v82(this, 1));
        this.G = this.D ? new u82(this, 1) : null;
    }
}
