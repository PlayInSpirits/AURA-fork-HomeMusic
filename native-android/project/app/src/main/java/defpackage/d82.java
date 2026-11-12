package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d82 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ nc3 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ d82(int r2, nc3 r3, Object r4) {
        this.n = 0;
        this.o = r3;
        this.p = r2;
        this.q = r4;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r8, Object r9) {
        int r0 = this.n;
        j15 r1 = j15.a;
        Object r3 = this.q;
        int r4 = this.p;
        nc3 r7 = this.o;
        rg1 r10 = (rg1) r8;
        Integer r11 = (Integer) r9;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r11.getClass();
        r7.a(r4, r3, r10, xl.O(1));
        return r1;
    L6:
        int r12 = r11.intValue();
        if ((r12 & 3) == 2) goto L9;
        boolean r2 = true;
    L11:
        if (r10.K(r12 & 1, r2) == false) goto L13;
        r7.a(r4, r3, r10, 0);
    L14:
        return r1;
    L13:
        r10.N();
        goto L14
    L9:
        r2 = false;
        goto L11
    }

    public /* synthetic */ d82(nc3 r1, int r2, Object r3, int r4) {
        this.n = 1;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
