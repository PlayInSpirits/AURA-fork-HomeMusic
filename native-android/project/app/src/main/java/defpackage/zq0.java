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

    public /* synthetic */ zq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((kr0) this.b)) {
                    try {
                        kr0 kr0Var = (kr0) this.b;
                        if (kr0Var.v != null) {
                            kr0Var.R();
                            if (((kr0) this.b).u()) {
                                ((kr0) this.b).K();
                                ((kr0) this.b).x = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            case 1:
                ((qa1) this.b).run();
                return null;
            default:
                qk qkVar = (qk) this.b;
                AtomicBoolean atomicBoolean = qkVar.q;
                qkVar.r.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        qkVar.t.c();
                        break;
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    qkVar.a(null);
                    return null;
                } catch (Throwable th2) {
                    try {
                        atomicBoolean.set(true);
                        throw th2;
                    } catch (Throwable th3) {
                        qkVar.a(null);
                        throw th3;
                    }
                }
        }
    }
}
