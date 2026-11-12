package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us2 implements gt2, ht2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ kt2 o;
    public final /* synthetic */ int p;

    public /* synthetic */ us2(kt2 r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.ht2
    public void b(al3 r4, fr2 r5, List r6) {
        int r0 = this.n;
        int r1 = this.p;
        kt2 r3 = this.o;
        switch(r0) {
            case 1: goto L11;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        r4.N0(r6, r3.L0(r5, r4, r1));
        return;
    L11:
        r4.N0(r6, r3.L0(r5, r4, r1));
        return;
    L7:
        if (r6.size() != 1) goto L9;
        r4.z0(r3.L0(r5, r4, r1), (gn2) r6.get(0));
        return;
    L9:
        r4.L(r3.L0(r5, r4, r1), r3.L0(r5, r4, r1 + 1), r6);
    }

    @Override // defpackage.gt2
    public void e(al3 r3, fr2 r4) {
        int r0 = this.n;
        int r1 = this.p;
        kt2 r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.N(r2.L0(r4, r3, r1));
        return;
    L6:
        r3.W(r2.L0(r4, r3, r1));
    }
}
