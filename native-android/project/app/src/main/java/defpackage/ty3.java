package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ty3 implements Executor {
    public final /* synthetic */ Executor n;
    public final /* synthetic */ er1 o;

    public ty3(ExecutorService r1, er1 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        this.n.execute(r1);
    }
}
