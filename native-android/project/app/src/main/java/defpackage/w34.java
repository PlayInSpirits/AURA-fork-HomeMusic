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
    public final q90 n;
    public final q90 o;
    public final Object p;
    public Exception q;
    public Object r;
    public Thread s;
    public boolean t;

    public w34() {
        this.n = new q90();
        this.o = new q90();
        this.p = new Object();
    }

    public final void a() {
        this.o.b();
    }

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r4) {
        Object r0 = this.p;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L5:
        if (this.t == true) goto L25;
        q90 r1 = this.o;     // Catch: Throwable -> L16
        monitor-enter(r1);     // Catch: Throwable -> L16
        boolean r2 = r1.b;     // Catch: Throwable -> L21
        monitor-exit(r1);     // Catch: Throwable -> L16
        if (r2 == true) goto L25;
        this.t = true;     // Catch: Throwable -> L16
        b();     // Catch: Throwable -> L16
        Thread r3 = this.s;     // Catch: Throwable -> L16
        if (r3 == null) goto L18;
        if (r4 == false) goto L19;
        r3.interrupt();     // Catch: Throwable -> L16
    L19:
        monitor-exit(r0);     // Catch: Throwable -> L16
        return true;
    L18:
        this.n.d();     // Catch: Throwable -> L16
        this.o.d();     // Catch: Throwable -> L16
        goto L19
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L25:
        monitor-exit(r0);     // Catch: Throwable -> L16
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r4, TimeUnit r6) {
        long r5 = TimeUnit.MILLISECONDS.convert(r4, r6);
        q90 r7 = this.o;
        monitor-enter(r7);
        if (r5 > 0) goto L11;
        boolean r8 = r7.b;     // Catch: Throwable -> L9
        monitor-exit(r7);
    L21:
        if (r8 == false) goto L33;
        if (this.t == true) goto L31;
        Exception r9 = this.q;
        if (r9 != null) goto L29;
        return this.r;
    L29:
        throw new ExecutionException(r9);
    L31:
        throw new CancellationException();
    L33:
        throw new TimeoutException();
    L11:
        r7.a.getClass();     // Catch: Throwable -> L9
        long r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L9
        long r10 = r5 + r0;     // Catch: Throwable -> L9
        if (r10 >= r0) goto L15;
        r7.a();     // Catch: Throwable -> L9
    L19:
        r8 = r7.b;     // Catch: Throwable -> L9
        monitor-exit(r7);
    L15:
        if (r7.b == true) goto L19;
        if (r0 >= r10) goto L19;
        r7.a.getClass();     // Catch: Throwable -> L9
        r7.wait(r10 - r0);     // Catch: Throwable -> L9
        r7.a.getClass();     // Catch: Throwable -> L9
        r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.t;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        q90 r1 = this.o;
        monitor-enter(r1);
        boolean r0 = r1.b;     // Catch: Throwable -> L7
        monitor-exit(r1);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Object r0 = this.p;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.t == false) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        this.s = Thread.currentThread();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        this.n.d();
        this.r = c();     // Catch: Throwable -> L22 Exception -> L24
        Object r1 = this.p;
        monitor-enter(r1);
        this.o.d();     // Catch: Throwable -> L19
        this.s = null;     // Catch: Throwable -> L19
        Thread.interrupted();     // Catch: Throwable -> L19
        monitor-exit(r1);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    L22:
        th = move-exception;
        monitor-enter(this.p);
        this.o.d();     // Catch: Throwable -> L39
        this.s = null;     // Catch: Throwable -> L39
        Thread.interrupted();     // Catch: Throwable -> L39
        throw th;
    L39:
        th = move-exception;
        throw th;
    L24:
        e = move-exception;
        this.q = e;     // Catch: Throwable -> L22
        monitor-enter(this.p);
        this.o.d();     // Catch: Throwable -> L31
        this.s = null;     // Catch: Throwable -> L31
        Thread.interrupted();     // Catch: Throwable -> L31
        return;
    L31:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.o.a();
        if (this.t == true) goto L11;
        Exception r0 = this.q;
        if (r0 != null) goto L9;
        return this.r;
    L9:
        throw new ExecutionException(r0);
    L11:
        throw new CancellationException();
    }
}
