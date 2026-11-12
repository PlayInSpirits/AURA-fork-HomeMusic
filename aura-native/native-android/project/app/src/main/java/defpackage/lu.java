package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lu {
    public static final w03 a;

    static {
        b(true);
        a = b(false);
    }

    public static final void a(ig3 ig3Var, jg3 jg3Var, pi2 pi2Var, r62 r62Var, int i, int i2, hs hsVar) {
        pi2Var.t();
        ig3.j(ig3Var, jg3Var, hsVar.a((((long) jg3Var.n) << 32) | (((long) jg3Var.o) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), r62Var));
    }

    public static final w03 b(boolean z) {
        w03 w03Var = new w03(9);
        hs hsVar = fz0.o;
        w03Var.l(hsVar, new ou(hsVar, z));
        hs hsVar2 = fz0.p;
        w03Var.l(hsVar2, new ou(hsVar2, z));
        hs hsVar3 = fz0.q;
        w03Var.l(hsVar3, new ou(hsVar3, z));
        hs hsVar4 = fz0.r;
        w03Var.l(hsVar4, new ou(hsVar4, z));
        hs hsVar5 = fz0.s;
        w03Var.l(hsVar5, new ou(hsVar5, z));
        hs hsVar6 = fz0.t;
        w03Var.l(hsVar6, new ou(hsVar6, z));
        hs hsVar7 = fz0.u;
        w03Var.l(hsVar7, new ou(hsVar7, z));
        hs hsVar8 = fz0.v;
        w03Var.l(hsVar8, new ou(hsVar8, z));
        hs hsVar9 = fz0.w;
        w03Var.l(hsVar9, new ou(hsVar9, z));
        return w03Var;
    }
}
