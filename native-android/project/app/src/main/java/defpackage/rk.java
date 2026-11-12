package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk extends Thread {
    public final /* synthetic */ int n;

    public /* synthetic */ rk(Runnable r2) {
        this.n = 1;
        super(r2);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L22;
            default: goto L4;
        };
    L4:
        Process.setThreadPriority(9);
        super.run();
        return;
    L22:
        ReentrantLock r2 = uk.h;     // Catch: InterruptedException -> L19
        ReentrantLock r3 = uk.h;     // Catch: InterruptedException -> L19
        r3.lock();     // Catch: InterruptedException -> L19
        uk r0 = pa.q();     // Catch: Throwable -> L12
        if (r0 != uk.l) goto L14;
        uk.l = null;     // Catch: Throwable -> L12
        goto L22
    L10:
        r3.unlock();     // Catch: InterruptedException -> L19
        return;
    L14:
        r3.unlock();     // Catch: InterruptedException -> L19
        if (r0 == null) goto L22;
        r0.j();     // Catch: InterruptedException -> L19
    L12:
        th = move-exception;
        r3.unlock();     // Catch: InterruptedException -> L19
        throw th;     // Catch: InterruptedException -> L19
    }

    public /* synthetic */ rk(String r2) {
        this.n = 0;
        super(r2);
    }
}
