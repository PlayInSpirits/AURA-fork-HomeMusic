package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class of implements Executor {
    public final /* synthetic */ int n;

    public /* synthetic */ of(int r1) {
        this.n = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        switch(this.n) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r1.run();
        return;
    L6:
        e35.C().post(r1);
        return;
    L8:
        new Thread(r1).start();
    }
}
