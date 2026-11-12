package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x50 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ x50(jg3[] r2, y50 r3, int r4, cf2 r5, int[] r6) {
        this.n = 0;
        this.p = r2;
        this.q = r3;
        this.o = r4;
        this.r = r5;
        this.s = r6;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r13) {
        int r0 = this.n;
        Object r2 = this.s;
        int r3 = this.o;
        Object r4 = this.r;
        Object r5 = this.q;
        Object r12 = this.p;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        ba1 r6 = (ba1) r5;
        wv3 r7 = (wv3) r4;
        dd0 r8 = (dd0) r2;
        es r14 = (es) r13;
        if (((ba1) r12) != ((ey) ((ra) j51.P(r6)).getFocusOwner()).f()) goto L28;
        boolean r15 = kb4.R(r3, r8, r6, r7);
        Boolean r1 = Boolean.valueOf(r15);
        if (r15 == true) goto L12;
        if (r14.a() == false) goto L12;
        return null;
    L12:
        return r1;
    L28:
        return Boolean.TRUE;
    L13:
        ba1 r9 = (ba1) r5;
        ba1 r10 = (ba1) r4;
        dd0 r11 = (dd0) r2;
        es r16 = (es) r13;
        if (((ba1) r12) != ((ey) ((ra) j51.P(r9)).getFocusOwner()).f()) goto L30;
        boolean r17 = zz1.H(r9, r10, r3, r11);
        Boolean r18 = Boolean.valueOf(r17);
        if (r17 == true) goto L21;
        if (r16.a() == false) goto L21;
        return null;
    L21:
        return r18;
    L30:
        return Boolean.TRUE;
    L22:
        jg3[] r19 = (jg3[]) r12;
        y50 r20 = (y50) r5;
        cf2 r21 = (cf2) r4;
        int[] r22 = (int[]) r2;
        ig3 r110 = (ig3) r13;
        int r23 = r19.length;
        int r24 = 0;
        int r25 = 0;
    L23:
        if (r24 >= r23) goto L26;
        jg3 r26 = r19[r24];
        r26.getClass();
        r26.t();
        ig3.f(r110, r26, r20.a.a(r26.n, r3, r21.getLayoutDirection()), r22[r25]);
        r24 = r24 + 1;
        r25 = r25 + 1;
        goto L23
    L26:
        return j15.a;
    }

    public /* synthetic */ x50(ba1 r1, ba1 r2, Object r3, int r4, dd0 r5, int r6) {
        this.n = r6;
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.o = r4;
        this.s = r5;
    }
}
