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

    public j0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.i = atomicReferenceFieldUpdater;
        this.j = atomicReferenceFieldUpdater2;
        this.k = atomicReferenceFieldUpdater3;
        this.l = atomicReferenceFieldUpdater4;
        this.m = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.g12
    public final void K(t0 t0Var, t0 t0Var2) {
        this.j.lazySet(t0Var, t0Var2);
    }

    @Override // defpackage.g12
    public final void L(t0 t0Var, Thread thread) {
        this.i.lazySet(t0Var, thread);
    }

    @Override // defpackage.g12
    public final boolean g(u0 u0Var, i0 i0Var, i0 i0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, i0Var, i0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == i0Var);
        return false;
    }

    @Override // defpackage.g12
    public final boolean h(u0 u0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == obj);
        return false;
    }

    @Override // defpackage.g12
    public final boolean i(u0 u0Var, t0 t0Var, t0 t0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, t0Var, t0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == t0Var);
        return false;
    }

    @Override // defpackage.g12
    public final i0 p(u0 u0Var) {
        return (i0) this.l.getAndSet(u0Var, i0.d);
    }

    @Override // defpackage.g12
    public final t0 q(u0 u0Var) {
        return (t0) this.k.getAndSet(u0Var, t0.c);
    }
}
