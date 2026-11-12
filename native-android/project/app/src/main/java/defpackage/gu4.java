package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gu4 extends e64 implements Runnable {
    public final long t;

    public gu4(long r2, wd0 r4) {
        super(r4, r4.getContext());
        this.t = r2;
    }

    @Override // defpackage.a32
    public final String U() {
        return super.U() + "(timeMillis=" + this.t + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        au0.t(this.r);
        o(new TimeoutCancellationException("Timed out waiting for " + this.t + " ms", this));
    }
}
