package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends g12 {
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public j0(AtomicReferenceFieldUpdater r1, AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5) {
        this.i = r1;
        this.j = r2;
        this.k = r3;
        this.l = r4;
        this.m = r5;
    }

    @Override // defpackage.g12
    public final void K(t0 r1, t0 r2) {
        this.j.lazySet(r1, r2);
    }

    @Override // defpackage.g12
    public final void L(t0 r1, Thread r2) {
        this.i.lazySet(r1, r2);
    }

    @Override // defpackage.g12
    public final boolean g(u0 r3, i0 r4, i0 r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.l;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.g12
    public final boolean h(u0 r3, Object r4, Object r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.m;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.g12
    public final boolean i(u0 r3, t0 r4, t0 r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.k;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.g12
    public final i0 p(u0 r2) {
        i0 r0 = i0.d;
        return (i0) this.l.getAndSet(r2, r0);
    }

    @Override // defpackage.g12
    public final t0 q(u0 r2) {
        t0 r0 = t0.c;
        return (t0) this.k.getAndSet(r2, r0);
    }
}
