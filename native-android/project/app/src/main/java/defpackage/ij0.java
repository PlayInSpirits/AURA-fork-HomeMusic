package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij0 implements qc2, eg1, lm2, wc0, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ ij0(String r1, int r2, int r3, jn2 r4) {
        this.n = 9;
        this.o = r3;
    }

    @Override // defpackage.wc0
    public void accept(Object r2) {
        int r0 = this.n;
        int r1 = this.o;
        al3 r3 = (al3) r2;
        switch(r0) {
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        r3.G0(r1);
        return;
    L6:
        r3.p0(r1);
        return;
    L8:
        r3.J(r1);
        return;
    L10:
        r3.d0(r1);
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r1) {
        Integer r2 = (Integer) r1;
        return Integer.valueOf(this.o);
    }

    @Override // defpackage.lm2
    public void c(bm2 r2) {
        if (r2.Y() == true) goto L6;
        return;
    L6:
        if (r2.l.get(this.o) != null) goto L8;
        return;
    L8:
        kf2.k();
    }

    @Override // defpackage.it2
    public Object h(tn2 r7, fr2 r8, int r9) {
        pq r10 = r7.D;
        r7.B(r8);
        r10.getClass();
        mw1 r2 = new mw1(m92.b(-6));
        r2.f(new qn2(r7, r2, r8, this.o, 1), new rn2(r7, 0));
        return r2;
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        int r0 = this.n;
        int r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r2).f(r1);
        return;
    L6:
        ((oi3) r2).b(r1);
        return;
    L8:
        ((oi3) r2).f(r1);
        return;
    L10:
        ho2 r3 = (ho2) r2;
        r3.getClass();
        if (r1 != 1) goto L13;
        r3.v = true;
    L13:
        r3.l = r1;
    }

    public /* synthetic */ ij0(int r1, va4 r2, Bundle r3, Bundle r4) {
        this.n = 5;
        this.o = r1;
    }

    public /* synthetic */ ij0(q9 r1, int r2, pi3 r3, pi3 r4) {
        this.n = 0;
        this.o = r2;
    }

    public /* synthetic */ ij0(int r1, int r2) {
        this.n = r2;
        this.o = r1;
    }
}
