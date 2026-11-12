package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq1 extends uk {
    public final /* synthetic */ yq1 m;

    public xq1(yq1 r1) {
        this.m = r1;
    }

    @Override // defpackage.uk
    public final void j() {
        this.m.e(b21.u);
        rq1 r4 = this.m.b;
        monitor-enter(r4);
        long r0 = r4.A;     // Catch: Throwable -> L14
        long r2 = r4.z;     // Catch: Throwable -> L14
        if (r0 >= r2) goto L10;
        monitor-exit(r4);
        return;
    L10:
        r4.z = r2 + 1;     // Catch: Throwable -> L14
        r4.B = System.nanoTime() + 1000000000;     // Catch: Throwable -> L14
        monitor-exit(r4);
        fr4.c(r4.u, b11.q(new StringBuilder(), r4.p, " ping"), new zf0(1, r4));
        return;
    L14:
        th = move-exception;
        throw th;
    }

    public final void k() {
        if (i() == true) goto L6;
        return;
    L6:
        throw new SocketTimeoutException("timeout");
    }
}
