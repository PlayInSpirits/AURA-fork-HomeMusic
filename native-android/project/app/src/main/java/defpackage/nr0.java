package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 extends e64 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
        t = AtomicIntegerFieldUpdater.newUpdater(nr0.class, "_decision$volatile");
    }

    @Override // defpackage.e64, defpackage.a32
    public final void l(Object r1) {
        m(r1);
    }

    @Override // defpackage.e64, defpackage.a32
    public final void m(Object r4) {
    L2:
        AtomicIntegerFieldUpdater r0 = t;
        int r1 = r0.get(this);
        if (r1 != 0) goto L5;
        if (r0.compareAndSet(this, 0, 2) == false) goto L2;
        return;
    L5:
        if (r1 != 1) goto L8;
        uc5.T(ya4.x(this.s), hw.I(r4));
        return;
    L8:
        kf2.o("Already resumed");
    }
}
