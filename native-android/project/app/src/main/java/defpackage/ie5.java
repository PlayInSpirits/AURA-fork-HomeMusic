package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie5 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ke5 o;

    public ie5(ke5 ke5Var, int i) {
        this.o = ke5Var;
        this.n = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nh2 nh2Var = this.o.q;
        ix2 ix2VarB = ix2.b(this.n, nh2Var.p0.o);
        dy dyVar = nh2Var.o0;
        ix2 ix2Var = dyVar.o;
        ix2 ix2Var2 = dyVar.n;
        if (ix2VarB.compareTo(ix2Var2) < 0) {
            ix2VarB = ix2Var2;
        } else if (ix2VarB.compareTo(ix2Var) > 0) {
            ix2VarB = ix2Var;
        }
        nh2Var.i0(ix2VarB);
        nh2Var.j0(1);
    }
}
