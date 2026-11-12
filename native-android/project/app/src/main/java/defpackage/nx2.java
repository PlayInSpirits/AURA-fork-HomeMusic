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

    public nx2(u0 r2, ScheduledFuture r3) {
        super(10);
        this.u = r2;
        this.v = r3;
    }

    public final boolean W(boolean r1) {
        return this.u.cancel(r1);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
        boolean r0 = W(r2);
        if (r0 == false) goto L5;
        this.v.cancel(r2);
    L5:
        return r0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed r1) {
        ScheduledFuture r0 = this.v;
        return r0.compareTo(r1);
    }

    @Override // defpackage.ic2
    public final void f(Runnable r1, Executor r2) {
        this.u.f(r1, r2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.u.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit r1) {
        return this.v.getDelay(r1);
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
    public final Object get(long r1, TimeUnit r3) {
        return this.u.get(r1, r3);
    }
}
