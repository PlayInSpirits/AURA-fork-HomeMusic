package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w14 extends u22 {
    public final x22 u;

    public w14(x22 x22Var) {
        this.u = x22Var;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return false;
    }

    @Override // defpackage.u22
    public final void s(Throwable th) {
        Object H = q().H();
        boolean z = H instanceof a70;
        x22 x22Var = this.u;
        if (z) {
            x22Var.resumeWith(kb4.o(((a70) H).a));
        } else {
            x22Var.resumeWith(zz1.M(H));
        }
    }
}
