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

    public px2(ScheduledExecutorService r1) {
        super(r1);
        this.o = r1;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable r3, long r4, TimeUnit r6) {
        py4 r0 = new py4(Executors.callable(r3, null));
        return new nx2(r0, this.o.schedule(r0, r4, r6));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable r2, long r3, long r5, TimeUnit r7) {
        ox2 r4 = new ox2(r2);
        return new nx2(r4, this.o.scheduleAtFixedRate(r4, r3, r5, r7));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable r2, long r3, long r5, TimeUnit r7) {
        ox2 r4 = new ox2(r2);
        return new nx2(r4, this.o.scheduleWithFixedDelay(r4, r3, r5, r7));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable r2, long r3, TimeUnit r5) {
        py4 r0 = new py4(r2);
        return new nx2(r0, this.o.schedule(r0, r3, r5));
    }
}
