package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e73 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public e73(b13 r2, b13 r3, vd0 r4) {
        this.o = 0;
        this.p = r2;
        this.q = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        Object r1 = this.q;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        e73 r2 = new e73((wf1) r1, r4);
        r2.p = r3;
        return r2;
    L7:
        return new e73((b13) this.p, (b13) r1, r4);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ((e73) create(r5, r6)).invokeSuspend(r1);
        return r1;
    L5:
        return ((e73) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        int r0 = this.o;
        Object r1 = this.q;
        switch(r0) {
            case 0: goto L23;
            default: goto L4;
        };
    L4:
        kb4.X(r7);
        ne0 r6 = ((we0) this.p).e();
        fz0 r8 = fz0.R;
        le0 r9 = r6.K(r8);
        r9.getClass();
        pe0 r10 = (pe0) r9;
        x60 r2 = new x60(true);
        vd0 r3 = null;
        r2.N(null);
        r r4 = new r(r2, (wf1) r1, r3, 11);
        ne0 r5 = jz4.t(q01.n, r10, true);
        rm0 r11 = rr0.a;
        if (r5 != r11) goto L7;
    L9:
        c0 r12 = new sk4(r5, true);
        r12.l0(ze0.q, r12, r4);
    L11:
        if ((r2.H() instanceof mx1) == false) goto L14;
        return fu.L(r10, new ac0(r2, r3, 6));
    L14:
        Object r13 = r2.H();
        if ((r13 instanceof mx1) == false) goto L17;
        kf2.o("This job has not completed yet");
        return r3;
    L17:
        if ((r13 instanceof a70) == true) goto L20;
        return zz1.M(r13);
    L20:
        throw ((a70) r13).a;
    L7:
        if (r5.K(r8) != null) goto L9;
        r5 = r5.J(r11);
        goto L9
    L23:
        kb4.X(r7);
        if (((Boolean) ((b13) this.p).getValue()).booleanValue() == false) goto L27;
        ((b13) r1).setValue(Boolean.TRUE);
    L27:
        return j15.a;
    }

    public e73(wf1 r2, vd0 r3) {
        this.o = 1;
        this.q = r2;
        super(2, r3);
    }
}
