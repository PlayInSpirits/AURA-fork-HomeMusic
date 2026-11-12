package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w34 implements RunnableFuture {
    public final q90 n = new q90();
    public final q90 o = new q90();
    public final Object p = new Object();
    public Exception q;
    public Object r;
    public Thread s;
    public boolean t;

    public final void a() {
        this.o.b();
    }

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this.p) {
            try {
                if (!this.t) {
                    q90 q90Var = this.o;
                    synchronized (q90Var) {
                        z2 = q90Var.b;
                    }
                    if (!z2) {
                        this.t = true;
                        b();
                        Thread thread = this.s;
                        if (thread == null) {
                            this.n.d();
                            this.o.d();
                        } else if (z) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        q90 q90Var = this.o;
        synchronized (q90Var) {
            try {
                if (jConvert <= 0) {
                    z = q90Var.b;
                } else {
                    q90Var.a.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = jConvert + jElapsedRealtime;
                    if (j2 < jElapsedRealtime) {
                        q90Var.a();
                    } else {
                        while (!q90Var.b && jElapsedRealtime < j2) {
                            q90Var.a.getClass();
                            q90Var.wait(j2 - jElapsedRealtime);
                            q90Var.a.getClass();
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z = q90Var.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            throw new TimeoutException();
        }
        if (this.t) {
            throw new CancellationException();
        }
        Exception exc = this.q;
        if (exc == null) {
            return this.r;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.t;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        q90 q90Var = this.o;
        synchronized (q90Var) {
            z = q90Var.b;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.p) {
            try {
                if (this.t) {
                    return;
                }
                this.s = Thread.currentThread();
                this.n.d();
                try {
                    try {
                        this.r = c();
                        synchronized (this.p) {
                            this.o.d();
                            this.s = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.p) {
                            this.o.d();
                            this.s = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.q = e;
                    synchronized (this.p) {
                        this.o.d();
                        this.s = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.o.a();
        if (!this.t) {
            Exception exc = this.q;
            if (exc == null) {
                return this.r;
            }
            throw new ExecutionException(exc);
        }
        throw new CancellationException();
    }
}
