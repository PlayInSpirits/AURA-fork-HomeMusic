package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 implements as0 {
    public final ScheduledFuture n;

    public zr0(ScheduledFuture scheduledFuture) {
        this.n = scheduledFuture;
    }

    @Override // defpackage.as0
    public final void a() {
        this.n.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.n + ']';
    }
}
