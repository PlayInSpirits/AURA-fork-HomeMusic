package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qq1 extends q42 implements gf1 {
    public final /* synthetic */ rq1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq1(rq1 rq1Var, int i, long j) {
        super(0);
        this.n = rq1Var;
        this.o = i;
        this.p = j;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        rq1 rq1Var = this.n;
        try {
            rq1Var.J.v(this.o, this.p);
        } catch (IOException e) {
            rq1Var.f(e);
        }
        return j15.a;
    }
}
