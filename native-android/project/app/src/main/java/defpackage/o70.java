package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o70 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ o70(r70 r2, Object r3, Object r4, int r5) {
        this.n = 0;
        this.r = r2;
        this.o = r3;
        this.q = r4;
        this.p = r5;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r14, Object r15) {
        int r0 = this.n;
        int r1 = this.p;
        Object r2 = this.o;
        Object r3 = this.q;
        j15 r4 = j15.a;
        Object r6 = this.r;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((Integer) r15).getClass();
        ((w44) r3).e(r2, (r70) r6, (rg1) r14, xl.O(r1 | 1));
        return r4;
    L6:
        ((Integer) r15).getClass();
        ((z82) r3).e(r2, (r70) r6, (rg1) r14, xl.O(r1 | 1));
        return r4;
    L8:
        ((Integer) r15).getClass();
        int r12 = xl.O(1);
        Object r8 = this.o;
        int r9 = this.p;
        Object r10 = this.q;
        l93.b((nc3) r6, r8, r9, r10, (rg1) r14, r12);
        return r4;
    L10:
        ((Integer) r15).getClass();
        ((r70) r6).e(r2, r3, (rg1) r14, xl.O(r1) | 1);
        return r4;
    }

    public /* synthetic */ o70(nc3 r1, Object r2, int r3, Object r4, int r5) {
        this.n = 1;
        this.r = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public /* synthetic */ o70(u44 r1, Object r2, r70 r3, int r4, int r5) {
        this.n = r5;
        this.q = r1;
        this.o = r2;
        this.r = r3;
        this.p = r4;
    }
}
