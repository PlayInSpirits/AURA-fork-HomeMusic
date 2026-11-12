package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 extends bu {
    public final /* synthetic */ bu h;
    public final /* synthetic */ ThreadPoolExecutor i;

    public vz0(bu r1, ThreadPoolExecutor r2) {
        this.h = r1;
        this.i = r2;
    }

    @Override // defpackage.bu
    public final void u(Throwable r2) {
        ThreadPoolExecutor r0 = this.i;
        this.h.u(r2);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }

    @Override // defpackage.bu
    public final void v(na4 r2) {
        ThreadPoolExecutor r0 = this.i;
        this.h.v(r2);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }
}
