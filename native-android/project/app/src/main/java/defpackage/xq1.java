package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq1 extends uk {
    public final /* synthetic */ yq1 m;

    public xq1(yq1 yq1Var) {
        this.m = yq1Var;
    }

    @Override // defpackage.uk
    public final void j() {
        this.m.e(b21.CANCEL);
        rq1 rq1Var = this.m.b;
        synchronized (rq1Var) {
            long j = rq1Var.A;
            long j2 = rq1Var.z;
            if (j < j2) {
                return;
            }
            rq1Var.z = j2 + 1;
            rq1Var.B = System.nanoTime() + 1000000000;
            fr4.c(rq1Var.u, b11.q(new StringBuilder(), rq1Var.p, " ping"), new zf0(1, rq1Var));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
