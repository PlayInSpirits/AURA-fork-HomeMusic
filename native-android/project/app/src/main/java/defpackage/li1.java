package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class li1 implements ExecutorService, AutoCloseable {
    public static volatile int o;
    public final ThreadPoolExecutor n;

    public li1(ThreadPoolExecutor r1) {
        this.n = r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, TimeUnit r3) {
        return this.n.awaitTermination(r1, r3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this == ForkJoinPool.commonPool()) goto L26;
        ThreadPoolExecutor r0 = this.n;
        boolean r1 = r0.isTerminated();
        if (r1 == true) goto L24;
        shutdown();
        boolean r2 = false;
    L8:
        if (r1 == true) goto L13;
        r1 = r0.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L11:
        if (r2 == true) goto L8;
        shutdownNow();
        r2 = true;
        goto L8
    L13:
        if (r2 == false) goto L25;
        Thread.currentThread().interrupt();
        return;
    L25:
        return;
    L24:
        return;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        this.n.execute(r1);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r1) {
        return this.n.invokeAll(r1);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r1) {
        return this.n.invokeAny(r1);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.n.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.n.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.n.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.n.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r1) {
        return this.n.submit(r1);
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r1, long r2, TimeUnit r4) {
        return this.n.invokeAll(r1, r2, r4);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r1, long r2, TimeUnit r4) {
        return this.n.invokeAny(r1, r2, r4);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r1, Object r2) {
        return this.n.submit(r1, r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable r1) {
        return this.n.submit(r1);
    }
}
