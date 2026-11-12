package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y21 extends x21 implements ao0 {
    public final Executor p;

    public y21(Executor r1) {
        this.p = r1;
        if ((r1 instanceof ScheduledThreadPoolExecutor) == false) goto L6;
        ((ScheduledThreadPoolExecutor) r1).setRemoveOnCancelPolicy(true);
        return;
    }

    @Override // defpackage.ao0
    public final as0 F(long r4, gu4 r6, ne0 r7) {
        Executor r3 = this.p;
        ScheduledFuture<?> r1 = null;
        if ((r3 instanceof ScheduledExecutorService) == false) goto L5;
        ScheduledExecutorService r5 = (ScheduledExecutorService) r3;
    L6:
        if (r5 != null) goto L18;
    L13:
        if (r1 == null) goto L17;
        return new zr0(r1);
    L17:
        return pk0.y.F(r4, r6, r7);
    L18:
        r1 = r5.schedule(r6, r4, TimeUnit.MILLISECONDS);     // Catch: RejectedExecutionException -> L9
    L9:
        e = move-exception;
        CancellationException r0 = new CancellationException("The task was rejected");
        r0.initCause(e);
        s22 r8 = (s22) r7.K(fz0.h0);
        if (r8 == null) goto L13;
        r8.f(r0);
        goto L13
    L5:
        r5 = null;
        goto L6
    }

    @Override // defpackage.ao0
    public final void H(long r5, cz r7) {
        Executor r0 = this.p;
        ScheduledFuture<?> r2 = null;
        if ((r0 instanceof ScheduledExecutorService) == false) goto L5;
        ScheduledExecutorService r1 = (ScheduledExecutorService) r0;
    L6:
        if (r1 == null) goto L14;
        lg1 r3 = new lg1(25, this, r7);
        ne0 r4 = r7.r;
        r2 = r1.schedule(r3, r5, TimeUnit.MILLISECONDS);     // Catch: RejectedExecutionException -> L10
    L10:
        e = move-exception;
        CancellationException r6 = new CancellationException("The task was rejected");
        r6.initCause(e);
        s22 r8 = (s22) r4.K(fz0.h0);
        if (r8 == null) goto L14;
        r8.f(r6);
    L14:
        if (r2 == null) goto L17;
        r7.x(new wy(0, r2));
        return;
    L17:
        pk0.y.H(r5, r7);
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.pe0
    public final void W(ne0 r3, Runnable r4) {
        this.p.execute(r4);     // Catch: RejectedExecutionException -> L4
        return;
    L4:
        e = move-exception;
        CancellationException r0 = new CancellationException("The task was rejected");
        r0.initCause(e);
        s22 r2 = (s22) r3.K(fz0.h0);
        if (r2 == null) goto L8;
        r2.f(r0);
    L8:
        rm0 r5 = rr0.a;
        il0.p.W(r3, r4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor r1 = this.p;
        if ((r1 instanceof ExecutorService) == false) goto L5;
        ExecutorService r2 = (ExecutorService) r1;
    L6:
        if (r2 == null) goto L9;
        r2.shutdown();
        return;
    L9:
        return;
    L5:
        r2 = null;
        goto L6
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof y21) == true) goto L5;
        return false;
    L5:
        if (((y21) r2).p != this.p) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.p);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return this.p.toString();
    }
}
