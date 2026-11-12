package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl2 implements xl2, ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ float p;

    public /* synthetic */ rl2(Object r1, float r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.ks2
    public void b(fr2 r1) {
        ((ls2) this.o).g.s.e(this.p);
    }

    @Override // defpackage.xl2
    public void d(pu1 r4, int r5) {
        int r0 = this.n;
        float r1 = this.p;
        bm2 r3 = (bm2) this.o;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        cb4 r2 = r3.n;
        r2.getClass();
        int r6 = r2.a.f();
        mm2 r7 = r3.c;
        if (r6 < 6) goto L7;
        r4.p(r7, r5);
        return;
    L7:
        r4.x(r7, r5, r1);
        return;
    L9:
        r4.x(r3.c, r5, r1);
        return;
    L11:
        r4.w(r3.c, r5, r1);
    }
}
