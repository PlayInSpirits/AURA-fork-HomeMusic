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

    public y21(Executor executor) {
        this.p = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.ao0
    public final as0 F(long j, gu4 gu4Var, ne0 ne0Var) {
        Executor executor = this.p;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(gu4Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                s22 s22Var = (s22) ne0Var.K(fz0.h0);
                if (s22Var != null) {
                    s22Var.f(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new zr0(scheduledFutureSchedule) : pk0.y.F(j, gu4Var, ne0Var);
    }

    @Override // defpackage.ao0
    public final void H(long j, cz czVar) {
        Executor executor = this.p;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            lg1 lg1Var = new lg1(25, this, czVar);
            ne0 ne0Var = czVar.r;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(lg1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                s22 s22Var = (s22) ne0Var.K(fz0.h0);
                if (s22Var != null) {
                    s22Var.f(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            czVar.x(new wy(0, scheduledFutureSchedule));
        } else {
            pk0.y.H(j, czVar);
        }
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        try {
            this.p.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            s22 s22Var = (s22) ne0Var.K(fz0.h0);
            if (s22Var != null) {
                s22Var.f(cancellationException);
            }
            rm0 rm0Var = rr0.a;
            il0.p.W(ne0Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.p;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y21) && ((y21) obj).p == this.p;
    }

    public final int hashCode() {
        return System.identityHashCode(this.p);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return this.p.toString();
    }
}
