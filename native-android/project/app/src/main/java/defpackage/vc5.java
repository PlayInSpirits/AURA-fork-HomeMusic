package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vc5 implements Executor {
    public final /* synthetic */ int n = 1;
    public final Object o;

    public vc5() {
        zw2 zw2Var = new zw2(Looper.getMainLooper(), 3, false);
        Looper.getMainLooper();
        this.o = zw2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((Handler) ((bq4) obj).p).post(runnable);
                break;
            default:
                ((zw2) obj).post(runnable);
                break;
        }
    }

    public vc5(bq4 bq4Var) {
        this.o = bq4Var;
    }
}
