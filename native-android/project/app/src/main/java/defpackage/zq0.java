package defpackage;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zq0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.a) {
            case 0: goto L24;
            case 1: goto L22;
            default: goto L4;
        };
    L4:
        qk r5 = (qk) this.b;
        AtomicBoolean r0 = r5.q;
        r5.r.set(true);
        Process.setThreadPriority(10);     // Catch: Throwable -> L14
        r5.t.c();     // Catch: OperationCanceledException -> L8 Throwable -> L14
    L11:
        Binder.flushPendingCommands();     // Catch: Throwable -> L14
        r5.a(null);
        return null;
    L8:
        e = move-exception;
        if (r0.get() == true) goto L11;
        throw e;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r0.set(true);     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r5.a(null);
        throw th;
    L22:
        ((qa1) this.b).run();
        return null;
    L24:
        kr0 r1 = (kr0) this.b;
        monitor-enter(r1);
        kr0 r2 = (kr0) this.b;     // Catch: Throwable -> L30
        if (r2.v != null) goto L32;
        monitor-exit(r1);     // Catch: Throwable -> L30
    L36:
        return null;
    L32:
        r2.R();     // Catch: Throwable -> L30
        if (((kr0) this.b).u() == false) goto L35;
        ((kr0) this.b).K();     // Catch: Throwable -> L30
        ((kr0) this.b).x = 0;     // Catch: Throwable -> L30
    L35:
        monitor-exit(r1);     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        throw th;
    }
}
