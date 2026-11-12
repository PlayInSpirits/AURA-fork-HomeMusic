package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ok implements Executor {
    public final /* synthetic */ int n;
    public final Handler o;

    public ok() {
        this.n = 0;
        this.o = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        int r0 = this.n;
        Handler r2 = this.o;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r2.post(r3);
        return;
    L6:
        r3.getClass();
        if (r2.post(r3) == false) goto L10;
        return;
    L10:
        throw new RejectedExecutionException(r2 + " is shutting down");
    L11:
        r3.getClass();
        if (r2.post(r3) == false) goto L15;
        return;
    L15:
        throw new RejectedExecutionException(r2 + " is shutting down");
    L16:
        r2.post(r3);
    }

    public /* synthetic */ ok(Handler r1, int r2) {
        this.n = r2;
        this.o = r1;
    }
}
