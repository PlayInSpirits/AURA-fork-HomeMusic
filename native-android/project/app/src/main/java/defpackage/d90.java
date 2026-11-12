package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d90 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ d90(Object r1, Object r2, wf1 r3, int r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r10, Object r11) {
        int r0 = this.n;
        j15 r1 = j15.a;
        int r2 = 1;
        Object r3 = this.q;
        Object r4 = this.p;
        Object r9 = this.o;
        switch(r0) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            default: goto L4;
        };
    L4:
        wd5 r12 = (wd5) r9;
        h80 r5 = (h80) r4;
        r70 r6 = (r70) r3;
        rg1 r13 = (rg1) r10;
        int r14 = ((Integer) r11).intValue();
        int r7 = 0;
        if ((r14 & 3) == 2) goto L7;
        boolean r8 = true;
    L9:
        if (r13.K(r14 & 1, r8) == false) goto L19;
        ra r15 = r12.n;
        boolean r16 = r13.g(r12);
        Object r17 = r13.H();
        vd0 r18 = null;
        i80 r19 = j80.a;
        if (r16 == true) goto L13;
        if (r17 == r19) goto L13;
    L14:
        bu.c((wf1) r17, r13, r15);
        boolean r20 = r13.g(r12);
        Object r21 = r13.H();
        if (r20 == true) goto L17;
        if (r21 == r19) goto L17;
    L18:
        bu.c((wf1) r21, r13, r15);
        r5.a(r15, r6, r13, 0);
    L20:
        return r1;
    L17:
        r21 = new vd5(r12, r18, r2);
        r13.b0(r21);
    L13:
        r17 = new vd5(r12, r18, r7);
        r13.b0(r17);
        goto L14
    L19:
        r13.N();
        goto L20
    L7:
        r8 = false;
        goto L9
    L21:
        ((Integer) r11).getClass();
        gn4.a((kn4) r9, (dx2) r4, (wf1) r3, (rg1) r10, xl.O(9));
        return r1;
    L23:
        gx3 r22 = (gx3) r9;
        g74 r23 = (g74) r4;
        float r110 = ((Float) r10).floatValue();
        ((Float) r11).getClass();
        long r111 = r23.i(r23.e(r110 - r22.n));
        g74 r24 = ((e74) r3).a;
        r22.n += r23.e(r23.h(r24.d(r24.k, r111, 1)));
        return r1;
    L25:
        ((Integer) r11).getClass();
        g90.a((ub3) r9, (pa) r4, (r70) r3, (rg1) r10, xl.O(1));
        return r1;
    }

    public /* synthetic */ d90(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
