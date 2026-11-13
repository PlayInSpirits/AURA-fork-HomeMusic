package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class h41 implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ h41(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((yp4) obj).d(runnable);
                break;
            case 1:
                f35.W(((bl2) obj).u, runnable);
                break;
            case 2:
                f35.W(((lo2) obj).q, runnable);
                break;
            default:
                yp4 yp4Var = ((qe4) obj).e;
                if (yp4Var.a.getLooper() != Looper.myLooper()) {
                    yp4Var.d(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }
}
