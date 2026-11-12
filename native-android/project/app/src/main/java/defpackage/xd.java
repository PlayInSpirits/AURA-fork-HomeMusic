package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd implements kl4 {
    public final zd3 n;
    public final ce o;
    public long p;
    public long q;
    public boolean r;

    public xd(Float r1, ce r2, long r3, long r5, boolean r7) {
        this.n = uc5.B(r1);
        this.o = kb4.n(r2);
        this.p = r3;
        this.q = r5;
        this.r = r7;
    }

    public final Object a() {
        return ((if1) p35.a.p).invoke(this.o);
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return this.n.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.n.getValue() + ", velocity=" + a() + ", isRunning=" + this.r + ", lastFrameTimeNanos=" + this.p + ", finishedTimeNanos=" + this.q + ")";
    }
}
