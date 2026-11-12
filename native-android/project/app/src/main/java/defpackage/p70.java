package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p70 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ r70 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ p70(r70 r2, Object r3, int r4) {
        this.n = 0;
        this.o = r2;
        this.q = r3;
        this.p = r4;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r5, Object r6) {
        int r0 = this.n;
        j15 r1 = j15.a;
        int r2 = this.p;
        r70 r3 = this.o;
        Object r4 = this.q;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((Integer) r6).getClass();
        gi1.a((rr3) r4, r3, (rg1) r5, xl.O(r2 | 1));
        return r1;
    L6:
        ((Integer) r6).getClass();
        gi1.b((rr3[]) r4, r3, (rg1) r5, xl.O(r2 | 1));
        return r1;
    L8:
        ((Integer) r6).getClass();
        r3.c(r4, (rg1) r5, xl.O(r2) | 1);
        return r1;
    }

    public /* synthetic */ p70(Object r1, r70 r2, int r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }
}
