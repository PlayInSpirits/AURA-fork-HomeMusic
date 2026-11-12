package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class mx2 extends AbstractExecutorService implements AutoCloseable, ExecutorService {
    public final ExecutorService n;

    public mx2(ExecutorService r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, TimeUnit r3) {
        return this.n.awaitTermination(r1, r3);
    }

    public final ic2 b(Callable r1) {
        return (ic2) super.submit(r1);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) goto L26;
        boolean r0 = isTerminated();
        if (r0 == true) goto L24;
        shutdown();
        boolean r1 = false;
    L8:
        if (r0 == true) goto L13;
        r0 = awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L11:
        if (r1 == true) goto L8;
        shutdownNow();
        r1 = true;
        goto L8
    L13:
        if (r1 == false) goto L25;
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
    public final boolean isShutdown() {
        return this.n.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.n.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable r1, Object r2) {
        return new py4(Executors.callable(r1, r2));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.n.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.n.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable r1) {
        return (ic2) super.submit(r1);
    }

    public final String toString() {
        return super.toString() + "[" + this.n + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable r1, Object r2) {
        return (ic2) super.submit(r1, r2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable r1) {
        return (ic2) super.submit(r1);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable r1) {
        return new py4(r1);
    }
}
