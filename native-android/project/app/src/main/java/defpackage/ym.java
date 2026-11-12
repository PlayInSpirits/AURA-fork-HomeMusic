package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ym implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ Handler o;

    public /* synthetic */ ym(Handler r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        int r0 = this.n;
        this.o.post(r2);
    }
}
