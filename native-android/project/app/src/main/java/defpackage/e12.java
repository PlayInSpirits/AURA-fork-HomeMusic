package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e12 extends AtomicReference implements Runnable {
    public static final wz0 n;
    public static final wz0 o;

    static {
        int i = 1;
        n = new wz0(i);
        o = new wz0(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        wz0 wz0Var = o;
        wz0 wz0Var2 = n;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            d12 d12Var = new d12(this);
            d12.a(d12Var, Thread.currentThread());
            if (compareAndSet(runnable, d12Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(wz0Var2)) == wz0Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        d12 d12Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof d12;
            wz0 wz0Var = o;
            if (!z2 && runnable != wz0Var) {
                break;
            }
            if (z2) {
                d12Var = (d12) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == wz0Var || compareAndSet(runnable, wz0Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(d12Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            wz0 wz0Var = n;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, wz0Var)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, wz0Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, wz0Var)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == n) {
            str = "running=[DONE]";
        } else if (runnable instanceof d12) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbS = b11.s(str, ", ");
        sbS.append(f());
        return sbS.toString();
    }
}
