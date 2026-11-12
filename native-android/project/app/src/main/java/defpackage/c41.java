package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c41 implements qc2, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;

    public /* synthetic */ c41(List r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.it2
    public Object h(tn2 r1, fr2 r2, int r3) {
        int r4 = this.n;
        List r0 = this.o;
        switch(r4) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return r1.o(r2, r0);
    L7:
        return r1.o(r2, r0);
    }

    @Override // defpackage.qc2
    public void invoke(Object r1) {
        oi3 r2 = (oi3) r1;
        r2.K(this.o);
    }
}
