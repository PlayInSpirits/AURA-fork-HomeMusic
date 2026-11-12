package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qq1 extends q42 implements gf1 {
    public final /* synthetic */ rq1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    public qq1(rq1 r1, int r2, long r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        rq1 r0 = this.n;
        r0.J.v(this.o, this.p);     // Catch: IOException -> L5
    L8:
        return j15.a;
    L5:
        e = move-exception;
        r0.f(e);
        goto L8
    }
}
