package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends l21 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final pk0 y;
    public static final long z;

    static {
        Long l;
        pk0 pk0Var = new pk0();
        y = pk0Var;
        pk0Var.c0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.l21, defpackage.ao0
    public final as0 F(long j, gu4 gu4Var, ne0 ne0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return k63.n;
        }
        long jNanoTime = System.nanoTime();
        i21 i21Var = new i21(j2 + jNanoTime, gu4Var);
        q0(jNanoTime, i21Var);
        return i21Var;
    }

    @Override // defpackage.l21
    public final void h0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.h0(runnable);
    }

    @Override // defpackage.l21
    public final Thread l0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(y.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.l21
    public final void n0(long j, j21 j21Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        it4.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    t0();
                    if (m0()) {
                        return;
                    }
                    l0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jD0 = d0();
                    if (jD0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            t0();
                            if (m0()) {
                                return;
                            }
                            l0();
                            return;
                        }
                        if (jD0 > j2) {
                            jD0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jD0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            t0();
                            if (m0()) {
                                return;
                            }
                            l0();
                            return;
                        }
                        LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            t0();
            if (!m0()) {
                l0();
            }
            throw th;
        }
    }

    @Override // defpackage.l21, defpackage.g21
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            p0();
            notifyAll();
        }
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "DefaultExecutor";
    }
}
