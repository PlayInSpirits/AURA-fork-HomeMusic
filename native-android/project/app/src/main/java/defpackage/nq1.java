package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nq1 extends q42 implements gf1 {
    public final /* synthetic */ rq1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ tv p;
    public final /* synthetic */ int q;

    public nq1(rq1 r1, int r2, tv r3, int r4, boolean r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        rq1 r0 = this.n;
        int r1 = this.o;
        tv r2 = this.p;
        int r5 = this.q;
        r0.x.getClass();     // Catch: IOException -> L13
        r2.skip(r5);     // Catch: IOException -> L13
        r0.J.u(r1, b21.u);     // Catch: IOException -> L13
        monitor-enter(r0);     // Catch: IOException -> L13
        r0.L.remove(Integer.valueOf(r1));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: IOException -> L13
        goto L12
    L8:
        th = move-exception;
        throw th;     // Catch: IOException -> L13
    L12:
        return j15.a;
    }
}
