package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 {
    public final ue1 a;

    public lc3(yf1 yf1Var, if1 if1Var, int i) {
        ue1 ue1Var = new ue1();
        wo0 wo0Var = new wo0(if1Var, yf1Var);
        if (i < 0) {
            fz1.a("size should be >=0");
        }
        if (i != 0) {
            f12 f12Var = new f12(ue1Var.o, i, wo0Var);
            ue1Var.o += i;
            ((f13) ue1Var.p).b(f12Var);
        }
        this.a = ue1Var;
    }
}
