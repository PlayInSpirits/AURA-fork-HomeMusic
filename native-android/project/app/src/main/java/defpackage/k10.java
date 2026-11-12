package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k10 extends u84 {
    public final aw g;
    public final /* synthetic */ AtomicReferenceArray h;

    public k10(long j, k10 k10Var, aw awVar, int i) {
        super(j, k10Var, i);
        this.g = awVar;
        this.h = new AtomicReferenceArray(cw.b * 2);
    }

    @Override // defpackage.u84
    public final int k() {
        return cw.b;
    }

    @Override // defpackage.u84
    public final void l(int i, ne0 ne0Var) {
        aw awVar;
        int i2 = cw.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objP = p(i);
            boolean z2 = objP instanceof t85;
            awVar = this.g;
            if (z2 || (objP instanceof u85)) {
                if (o(i, objP, z ? cw.j : cw.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        awVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objP == cw.j || objP == cw.k) {
                    break;
                }
                if (objP != cw.g && objP != cw.f) {
                    if (objP == cw.i || objP == cw.d || objP == cw.l) {
                        return;
                    }
                    mj0.g(objP, "unexpected state: ");
                    return;
                }
            }
        }
        r(i, null);
        if (z) {
            awVar.getClass();
        }
    }

    public final boolean o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            aw awVar = this.g;
            awVar.getClass();
            awVar.R((this.e * ((long) cw.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
