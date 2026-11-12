package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ List p;

    public /* synthetic */ fl2(bm2 r1, List r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.xl2
    public final void d(pu1 r7, int r8) {
        int r0 = this.n;
        int r1 = 0;
        List r3 = this.p;
        bm2 r6 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        mm2 r9 = r6.c;
        uw1 r4 = yw1.j();
    L6:
        if (r1 >= r3.size()) goto L8;
        r4.c(((gn2) r3.get(r1)).c(true));
        r1 = r1 + 1;
        goto L6
    L8:
        r7.T(r9, r8, new iw(r4.f()));
        return;
    L10:
        mm2 r10 = r6.c;
        uw1 r5 = yw1.j();
    L12:
        if (r1 >= r3.size()) goto L14;
        r5.c(((gn2) r3.get(r1)).c(true));
        r1 = r1 + 1;
        goto L12
    L14:
        r7.L(r10, r8, new iw(r5.f()), true);
    }
}
