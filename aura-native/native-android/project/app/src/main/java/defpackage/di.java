package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements Executor {
    public final /* synthetic */ int n;

    public /* synthetic */ di(int i) {
        this.n = i;
    }

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.n) {
            case 0:
                ei.V().j.k.execute(runnable);
                break;
            case 1:
                break;
            case 2:
                u52.a.post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
