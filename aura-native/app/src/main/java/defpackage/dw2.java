package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dw2 implements nt2 {
    public final rm2 a = new rm2(3, this);
    public final gj0 b = new gj0();
    public boolean c;
    public final /* synthetic */ ew2 d;

    public dw2(ew2 ew2Var) {
        this.d = ew2Var;
    }

    @Override // defpackage.nt2
    public final void a(bq bqVar, cu4 cu4Var) {
        ew2 ew2Var = this.d;
        ew2Var.q = cu4Var;
        if (this.c) {
            return;
        }
        this.c = true;
        no2 b = bqVar.b(new mt2(cu4Var.l(0)), this.b, 0L);
        ew2Var.p = b;
        b.m(this.a, 0L);
    }
}
