package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 extends bu {
    public final /* synthetic */ bu h;
    public final /* synthetic */ ThreadPoolExecutor i;

    public vz0(bu buVar, ThreadPoolExecutor threadPoolExecutor) {
        this.h = buVar;
        this.i = threadPoolExecutor;
    }

    @Override // defpackage.bu
    public final void u(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.i;
        try {
            this.h.u(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.bu
    public final void v(na4 na4Var) {
        ThreadPoolExecutor threadPoolExecutor = this.i;
        try {
            this.h.v(na4Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
