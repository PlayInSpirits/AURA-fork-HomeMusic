package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f80 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ h80 o;
    public final /* synthetic */ ra p;
    public final /* synthetic */ r70 q;

    public /* synthetic */ f80(ra r2, h80 r3, r70 r4) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
        this.q = r4;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r8, Object r9) {
        int r0 = this.n;
        j15 r1 = j15.a;
        r70 r3 = this.q;
        ra r4 = this.p;
        h80 r7 = this.o;
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
        r10.R(866651995);
        g90.a(r4, r7.l, r3, r10, 0);
        r10.o(false);
    L14:
        return r1;
    L13:
        r10.N();
        goto L14
    L9:
        r2 = false;
        goto L11
    }

    public /* synthetic */ f80(h80 r1, ra r2, r70 r3, int r4) {
        this.n = 1;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
