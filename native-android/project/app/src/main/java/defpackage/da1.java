package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da1 extends ig1 implements wf1 {
    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        z91 z91Var = (z91) obj;
        z91 z91Var2 = (z91) obj2;
        ea1 ea1Var = (ea1) this.receiver;
        if (ea1Var.A && (zA = z91Var2.a()) != z91Var.a()) {
            q qVar = ea1Var.E;
            if (qVar != null) {
                qVar.invoke(Boolean.valueOf(zA));
            }
            vd0 vd0Var = null;
            if (zA) {
                fu.G(ea1Var.e0(), null, ze0.q, new ac0(ea1Var, vd0Var, 3), 1);
                jx3 jx3Var = new jx3();
                j51.F(ea1Var, new fa(6, jx3Var, ea1Var));
                l82 l82Var = (l82) jx3Var.n;
                if (l82Var != null) {
                    l82Var.a();
                } else {
                    l82Var = null;
                }
                ea1Var.G = l82Var;
                f63 f63Var = ea1Var.H;
                if (f63Var != null && f63Var.A0().A) {
                    ea1Var.u0();
                }
            } else {
                l82 l82Var2 = ea1Var.G;
                if (l82Var2 != null) {
                    l82Var2.b();
                }
                ea1Var.G = null;
                ea1Var.u0();
            }
            fu.C(ea1Var);
            rm2 rm2Var = ea1Var.D;
            if (rm2Var != null) {
                p91 p91Var = ea1Var.F;
                if (zA) {
                    if (p91Var != null) {
                        ea1Var.t0(rm2Var, new q91());
                        ea1Var.F = null;
                    }
                    p91 p91Var2 = new p91();
                    ea1Var.t0(rm2Var, p91Var2);
                    ea1Var.F = p91Var2;
                } else if (p91Var != null) {
                    ea1Var.t0(rm2Var, new q91());
                    ea1Var.F = null;
                }
            }
        }
        return j15.a;
    }
}
