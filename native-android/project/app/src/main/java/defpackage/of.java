package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class of implements Executor {
    public final /* synthetic */ int n;

    public /* synthetic */ of(int i) {
        this.n = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.n) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                e35.C().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
