package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class t22 extends a32 {
    public final boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t22(s22 s22Var) {
        super(true);
        boolean z = true;
        N(s22Var);
        c20 c20VarG = G();
        d20 d20Var = c20VarG instanceof d20 ? (d20) c20VarG : null;
        if (d20Var == null) {
            z = false;
            break;
        }
        a32 a32VarQ = d20Var.q();
        while (!a32VarQ.D()) {
            c20 c20VarG2 = a32VarQ.G();
            d20 d20Var2 = c20VarG2 instanceof d20 ? (d20) c20VarG2 : null;
            if (d20Var2 == null) {
                z = false;
                break;
            }
            a32VarQ = d20Var2.q();
        }
        this.r = z;
    }

    @Override // defpackage.a32
    public final boolean D() {
        return this.r;
    }

    @Override // defpackage.a32
    public final boolean E() {
        return true;
    }
}
