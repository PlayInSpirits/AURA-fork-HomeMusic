package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements q81 {
    public final /* synthetic */ aw n;
    public final /* synthetic */ int o;

    public a60(aw r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.q81
    public final Object b(Object r8, vd0 r9) {
        if ((r9 instanceof z50) == false) goto L7;
        z50 r0 = (z50) r9;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r10 = r0.n;
        int r2 = r0.p;
        mr0 r3 = null;
        j15 r4 = j15.a;
        xe0 r6 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        kb4.X(r10);
    L34:
        return r4;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        kb4.X(r10);
    L19:
        r0.p = 2;
        ne0 r7 = r0.getContext();
        gb.u(r7);
        vd0 r11 = ya4.x(r0);
        if ((r11 instanceof mr0) == false) goto L22;
        r3 = (mr0) r11;
    L22:
        if (r3 != null) goto L24;
        Object r12 = r4;
    L29:
        if (r12 == r6) goto L32;
        r12 = r4;
    L32:
        if (r12 != r6) goto L34;
    L33:
        return r6;
    L24:
        pe0 r13 = r3.q;
        if (r13.Y(r7) == false) goto L27;
        r3.s = r4;
        r3.p = 1;
        r13.X(r7, r3);
    L28:
        r12 = r6;
        goto L29
    L27:
        ne0 r14 = r7.J(new le5(le5.o));
        r3.s = r4;
        r3.p = 1;
        r13.X(r14, r3);
        goto L28
    L16:
        kb4.X(r10);
        yx1 r15 = new yx1(this.o, r8);
        r0.p = 1;
        if (this.n.a(r0, r15) != r6) goto L19;
    L7:
        r0 = new z50(this, r9);
        goto L8
    }
}
