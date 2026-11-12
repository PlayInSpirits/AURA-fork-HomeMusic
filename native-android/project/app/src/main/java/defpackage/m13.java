package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m13 implements az, t85 {
    public final cz n;
    public final /* synthetic */ n13 o;

    public m13(n13 r1, cz r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.t85
    public final void a(u84 r1, int r2) {
        this.n.a(r1, r2);
    }

    @Override // defpackage.az
    public final f01 c(Object r2, xf1 r3) {
        n13 r0 = this.o;
        bz r4 = new bz(r0, this);
        cz r1 = this.n;
        f01 r5 = r1.G((j15) r2, r4);
        if (r5 == null) goto L5;
        n13.w.set(r0, null);
    L5:
        return r5;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.n.r;
    }

    @Override // defpackage.az
    public final void k(Object r3, xf1 r4) {
        AtomicReferenceFieldUpdater r5 = n13.w;
        n13 r0 = this.o;
        r5.set(r0, null);
        x r6 = new x(25, r0, this);
        cz r2 = this.n;
        int r7 = r2.p;
        bz r1 = new bz(0, r6);
        r2.D(j15.a, r7, r1);
    }

    @Override // defpackage.az
    public final boolean r(Throwable r1) {
        return this.n.r(r1);
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r1) {
        this.n.resumeWith(r1);
    }

    @Override // defpackage.az
    public final void t(Object r1) {
        this.n.t(r1);
    }
}
