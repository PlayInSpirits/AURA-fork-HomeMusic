package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nq1 extends q42 implements gf1 {
    public final /* synthetic */ rq1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ tv p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq1(rq1 rq1Var, int i, tv tvVar, int i2, boolean z) {
        super(0);
        this.n = rq1Var;
        this.o = i;
        this.p = tvVar;
        this.q = i2;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        rq1 rq1Var = this.n;
        int i = this.o;
        tv tvVar = this.p;
        int i2 = this.q;
        try {
            rq1Var.x.getClass();
            tvVar.skip(i2);
            rq1Var.J.u(i, b21.CANCEL);
            synchronized (rq1Var) {
                rq1Var.L.remove(Integer.valueOf(i));
            }
        } catch (IOException unused) {
        }
        return j15.a;
    }
}
