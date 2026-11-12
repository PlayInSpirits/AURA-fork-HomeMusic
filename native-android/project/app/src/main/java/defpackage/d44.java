package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d44 implements vd0, ye0 {
    public static final AtomicReferenceFieldUpdater o = null;
    public final vd0 n;
    private volatile Object result;

    static {
        o = AtomicReferenceFieldUpdater.newUpdater(d44.class, Object.class, "result");
    }

    public d44(vd0 r2) {
        xe0 r0 = xe0.n;
        this.n = r2;
        this.result = r0;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 r1 = this.n;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.n.getContext();
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r5) {
    L2:
        Object r0 = this.result;
        xe0 r1 = xe0.o;
        if (r0 == r1) goto L4;
        xe0 r2 = xe0.n;
        if (r0 != r2) goto L21;
        AtomicReferenceFieldUpdater r3 = o;
        xe0 r4 = xe0.p;
    L15:
        if (r3.compareAndSet(this, r2, r4) == true) goto L16;
        if (r3.get(this) == r2) goto L15;
    L16:
        this.n.resumeWith(r5);
        return;
    L21:
        kf2.o("Already resumed");
        return;
    L4:
        AtomicReferenceFieldUpdater r6 = o;
    L6:
        if (r6.compareAndSet(this, r1, r5) == true) goto L7;
        if (r6.get(this) == r1) goto L6;
    }

    public final String toString() {
        return "SafeContinuation for " + this.n;
    }
}
