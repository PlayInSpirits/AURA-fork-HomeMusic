package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk extends Thread {
    public final /* synthetic */ int n = 1;

    public /* synthetic */ rk(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = uk.h;
                ReentrantLock reentrantLock2 = uk.h;
                reentrantLock2.lock();
                try {
                    uk ukVarQ = pa.q();
                    if (ukVarQ == uk.l) {
                        uk.l = null;
                        reentrantLock2.unlock();
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (ukVarQ != null) {
                            ukVarQ.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }

    public /* synthetic */ rk(String str) {
        super(str);
    }
}
