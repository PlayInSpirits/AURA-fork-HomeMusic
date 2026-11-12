package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la2 extends pe0 implements ao0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = null;
    public final /* synthetic */ ao0 p;
    public final pe0 q;
    public final int r;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final ae2 s;
    public final Object t;

    static {
        u = AtomicIntegerFieldUpdater.newUpdater(la2.class, "runningWorkers$volatile");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public la2(pe0 r2, int r3) {
        if ((r2 instanceof ao0) == false) goto L5;
        ao0 r0 = (ao0) r2;
    L6:
        if (r0 != null) goto L8;
        r0 = qk0.a;
    L8:
        this.p = r0;
        this.q = r2;
        this.r = r3;
        this.s = new ae2();
        this.t = new Object();
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.ao0
    public final as0 F(long r1, gu4 r3, ne0 r4) {
        return this.p.F(r1, r3, r4);
    }

    @Override // defpackage.ao0
    public final void H(long r1, cz r3) {
        this.p.H(r1, r3);
    }

    @Override // defpackage.pe0
    public final void W(ne0 r3, Runnable r4) {
        this.s.a(r4);
        if (u.get(this) < this.r) goto L5;
        return;
    L5:
        if (b0() == false) goto L12;
        Runnable r5 = a0();
        if (r5 == null) goto L13;
        boolean r1 = false;
        lg1 r6 = new lg1(this, r5, r1, 17);
        this.q.W(this, r6);
        return;
    L13:
        return;
    }

    @Override // defpackage.pe0
    public final void X(ne0 r3, Runnable r4) {
        this.s.a(r4);
        if (u.get(this) < this.r) goto L5;
        return;
    L5:
        if (b0() == false) goto L12;
        Runnable r5 = a0();
        if (r5 == null) goto L13;
        boolean r1 = false;
        lg1 r6 = new lg1(this, r5, r1, 17);
        this.q.X(this, r6);
        return;
    L13:
        return;
    }

    public final Runnable a0() {
    L2:
        Runnable r0 = (Runnable) this.s.d();
        if (r0 != null) goto L17;
        Object r1 = this.t;
        monitor-enter(r1);
        AtomicIntegerFieldUpdater r2 = u;     // Catch: Throwable -> L14
        r2.decrementAndGet(this);     // Catch: Throwable -> L14
        if (this.s.c() == 0) goto L8;
        r2.incrementAndGet(this);     // Catch: Throwable -> L14
        monitor-exit(r1);
        goto L2
    L8:
        monitor-exit(r1);
        return null;
    L14:
        th = move-exception;
        throw th;
    L17:
        return r0;
    }

    public final boolean b0() {
        Object r0 = this.t;
        monitor-enter(r0);
        AtomicIntegerFieldUpdater r1 = u;     // Catch: Throwable -> L13
        if (r1.get(this) < this.r) goto L9;
        monitor-exit(r0);
        return false;
    L9:
        r1.incrementAndGet(this);     // Catch: Throwable -> L13
        monitor-exit(r0);
        return true;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pe0
    public final String toString() {
        return this.q + ".limitedParallelism(" + this.r + ')';
    }
}
