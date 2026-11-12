package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs2 implements gt2, ht2, wc0 {
    public final /* synthetic */ kt2 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ rs2(kt2 r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.wc0
    public void accept(Object r2) {
        al3 r3 = (al3) r2;
        kt2 r4 = this.n;
        ((tn2) r4.e.get()).getClass();
        jt2 r5 = r4.j;
        if (r5 == null) goto L6;
        r5.setFixedSize(this.o, this.p);
        return;
    }

    @Override // defpackage.ht2
    public void b(al3 r3, fr2 r4, List r5) {
        kt2 r0 = this.n;
        r3.L(r0.L0(r4, r3, this.o), r0.L0(r4, r3, this.p), r5);
    }

    @Override // defpackage.gt2
    public void e(al3 r3, fr2 r4) {
        kt2 r0 = this.n;
        r3.P(r0.L0(r4, r3, this.o), r0.L0(r4, r3, this.p));
    }
}
