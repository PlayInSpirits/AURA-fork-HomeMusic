package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends ji2 {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;

    public d2(AtomicReferenceFieldUpdater r1, AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
        this.f = r4;
        this.g = r5;
    }

    @Override // defpackage.ji2
    public final void B(f2 r1, f2 r2) {
        this.d.lazySet(r1, r2);
    }

    @Override // defpackage.ji2
    public final void C(f2 r1, Thread r2) {
        this.c.lazySet(r1, r2);
    }

    @Override // defpackage.ji2
    public final boolean d(g2 r3, c2 r4, c2 r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.f;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.ji2
    public final boolean e(g2 r3, Object r4, Object r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.g;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.ji2
    public final boolean f(g2 r3, f2 r4, f2 r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.e;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }
}
