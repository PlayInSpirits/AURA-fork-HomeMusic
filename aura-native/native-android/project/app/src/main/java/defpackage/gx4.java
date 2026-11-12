package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx4 extends fx4 {
    public final /* synthetic */ oi a;
    public final /* synthetic */ hx4 b;

    public gx4(hx4 hx4Var, oi oiVar) {
        this.b = hx4Var;
        this.a = oiVar;
    }

    @Override // defpackage.bx4
    public final void c(dx4 dx4Var) {
        ((ArrayList) this.a.get(this.b.o)).remove(dx4Var);
        dx4Var.u(this);
    }
}
