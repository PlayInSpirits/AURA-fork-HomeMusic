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

    public d2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ji2
    public final void B(f2 f2Var, f2 f2Var2) {
        this.d.lazySet(f2Var, f2Var2);
    }

    @Override // defpackage.ji2
    public final void C(f2 f2Var, Thread thread) {
        this.c.lazySet(f2Var, thread);
    }

    @Override // defpackage.ji2
    public final boolean d(g2 g2Var, c2 c2Var, c2 c2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(g2Var, c2Var, c2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g2Var) == c2Var);
        return false;
    }

    @Override // defpackage.ji2
    public final boolean e(g2 g2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(g2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g2Var) == obj);
        return false;
    }

    @Override // defpackage.ji2
    public final boolean f(g2 g2Var, f2 f2Var, f2 f2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(g2Var, f2Var, f2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g2Var) == f2Var);
        return false;
    }
}
