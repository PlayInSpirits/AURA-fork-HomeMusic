package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class px2 extends mx2 implements ScheduledExecutorService {
    public final ScheduledExecutorService o;

    public px2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.o = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        py4 py4Var = new py4(Executors.callable(runnable, null));
        return new nx2(py4Var, this.o.schedule(py4Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ox2 ox2Var = new ox2(runnable);
        return new nx2(ox2Var, this.o.scheduleAtFixedRate(ox2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ox2 ox2Var = new ox2(runnable);
        return new nx2(ox2Var, this.o.scheduleWithFixedDelay(ox2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        py4 py4Var = new py4(callable);
        return new nx2(py4Var, this.o.schedule(py4Var, j, timeUnit));
    }
}
