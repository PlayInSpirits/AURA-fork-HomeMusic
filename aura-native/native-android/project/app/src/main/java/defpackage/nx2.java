package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nx2 extends uo implements ScheduledFuture, ic2, Future {
    public final u0 u;
    public final ScheduledFuture v;

    public nx2(u0 u0Var, ScheduledFuture scheduledFuture) {
        super(10);
        this.u = u0Var;
        this.v = scheduledFuture;
    }

    public final boolean W(boolean z) {
        return this.u.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zW = W(z);
        if (zW) {
            this.v.cancel(z);
        }
        return zW;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.v.compareTo(delayed);
    }

    @Override // defpackage.ic2
    public final void f(Runnable runnable, Executor executor) {
        this.u.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.u.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.u.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.u.isDone();
    }

    @Override // defpackage.uo
    public final Object o() {
        return this.u;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.u.get(j, timeUnit);
    }
}
