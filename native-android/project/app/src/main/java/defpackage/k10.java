package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k10 extends u84 {
    public final aw g;
    public final /* synthetic */ AtomicReferenceArray h;

    public k10(long r1, k10 r3, aw r4, int r5) {
        super(r1, r3, r5);
        this.g = r4;
        this.h = new AtomicReferenceArray(cw.b * 2);
    }

    @Override // defpackage.u84
    public final int k() {
        return cw.b;
    }

    @Override // defpackage.u84
    public final void l(int r5, ne0 r6) {
        int r7 = cw.b;
        if (r5 < r7) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        r5 = r5 - r7;
    L8:
        this.h.get(r5 * 2);
    L9:
        Object r8 = p(r5);
        boolean r1 = r8 instanceof t85;
        aw r2 = this.g;
        if (r1 == true) goto L38;
        if ((r8 instanceof u85) == true) goto L38;
        if (r8 == cw.j) goto L34;
        if (r8 == cw.k) goto L34;
        if (r8 == cw.g) goto L9;
        if (r8 == cw.f) goto L9;
        if (r8 != cw.i) goto L27;
        return;
    L27:
        if (r8 != cw.d) goto L30;
        return;
    L30:
        if (r8 == cw.l) goto L63;
        mj0.g(r8, "unexpected state: ");
        return;
    L63:
        return;
    L34:
        r(r5, null);
        if (r0 == false) goto L60;
        r2.getClass();
        return;
    L60:
        return;
    L38:
        if (r0 == false) goto L40;
        f01 r3 = cw.j;
    L42:
        if (o(r5, r8, r3) == false) goto L9;
        r(r5, null);
        q(r5, !r0);
        if (r0 == false) goto L61;
        r2.getClass();
        return;
    L61:
        return;
    L40:
        r3 = cw.k;
        goto L42
    L5:
        r0 = false;
        goto L6
    }

    public final boolean o(int r4, Object r5, Object r6) {
        int r7 = (r4 * 2) + 1;
    L3:
        AtomicReferenceArray r1 = this.h;
        if (r1.compareAndSet(r7, r5, r6) == true) goto L5;
        if (r1.get(r7) == r5) goto L3;
        return false;
    L5:
        return true;
    }

    public final Object p(int r1) {
        AtomicReferenceArray r0 = this.h;
        return r0.get((r1 * 2) + 1);
    }

    public final void q(int r5, boolean r6) {
        if (r6 == false) goto L4;
        aw r7 = this.g;
        r7.getClass();
        r7.R((this.e * cw.b) + ((long) r5));
    L4:
        m();
    }

    public final void r(int r1, Object r2) {
        AtomicReferenceArray r0 = this.h;
        r0.set(r1 * 2, r2);
    }

    public final void s(int r1, Object r2) {
        AtomicReferenceArray r0 = this.h;
        r0.set((r1 * 2) + 1, r2);
    }
}
