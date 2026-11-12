package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u84 extends p90 implements o63 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = null;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    static {
        f = AtomicIntegerFieldUpdater.newUpdater(u84.class, "cleanedAndPointers$volatile");
    }

    public u84(long r1, u84 r3, int r4) {
        super(r3);
        this.e = r1;
        this.cleanedAndPointers$volatile = r4 << 16;
    }

    @Override // defpackage.p90
    public final boolean f() {
        if (f.get(this) == k()) goto L5;
        return false;
    L5:
        if (c() == null) goto L11;
        return true;
    L11:
        return false;
    }

    public final boolean j() {
        if (f.addAndGet(this, -65536) == k()) goto L5;
        return false;
    L5:
        if (c() == null) goto L11;
        return true;
    L11:
        return false;
    }

    public abstract int k();

    public abstract void l(int r1, ne0 r2);

    public final void m() {
        if (f.incrementAndGet(this) != k()) goto L6;
        h();
        return;
    }

    public final boolean n() {
    L2:
        AtomicIntegerFieldUpdater r0 = f;
        int r1 = r0.get(this);
        if (r1 != k()) goto L10;
        if (c() == null) goto L10;
        return false;
    L10:
        if (r0.compareAndSet(this, r1, 65536 + r1) == false) goto L2;
        return true;
    }
}
