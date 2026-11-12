package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ u30 q;
    public final /* synthetic */ bq3 r;

    public /* synthetic */ v(u30 r1, bq3 r2, vd0 r3, int r4) {
        this.o = r4;
        this.q = r1;
        this.r = r2;
        super(2, r3);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r5 = this.o;
        bq3 r0 = this.r;
        u30 r2 = this.q;
        switch(r5) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return new v(r2, r0, r4, 3);
    L7:
        return new v(r2, r0, r4, 2);
    L9:
        return new v(r2, r0, r4, 1);
    L11:
        return new v(r2, r0, r4, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return ((v) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((v) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((v) create(r5, r6)).invokeSuspend(r1);
    L11:
        return ((v) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r8) {
        int r0 = this.o;
        j15 r1 = j15.a;
        u30 r2 = this.q;
        xe0 r5 = xe0.n;
        switch(r0) {
            case 0: goto L37;
            case 1: goto L26;
            case 2: goto L15;
            default: goto L4;
        };
    L4:
        int r3 = this.p;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        kb4.X(r8);
        return r1;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r8);
        rm2 r9 = r2.D;
        if (r9 == null) goto L50;
        cq3 r4 = new cq3();
        this.p = 1;
        if (r9.e(r4, this) == r5) goto L14;
        return r1;
    L14:
        return r5;
    L50:
        return r1;
    L15:
        int r6 = this.p;
        if (r6 == 0) goto L20;
        if (r6 != 1) goto L19;
        kb4.X(r8);
        return r1;
    L19:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        kb4.X(r8);
        rm2 r10 = r2.D;
        if (r10 == null) goto L54;
        this.p = 1;
        if (r10.e(this.r, this) == r5) goto L25;
        return r1;
    L25:
        return r5;
    L54:
        return r1;
    L26:
        int r7 = this.p;
        if (r7 == 0) goto L31;
        if (r7 != 1) goto L30;
        kb4.X(r8);
        return r1;
    L30:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L31:
        kb4.X(r8);
        rm2 r11 = r2.D;
        if (r11 == null) goto L58;
        aq3 r12 = new aq3();
        this.p = 1;
        if (r11.e(r12, this) == r5) goto L36;
        return r1;
    L36:
        return r5;
    L58:
        return r1;
    L37:
        int r13 = this.p;
        if (r13 == 0) goto L42;
        if (r13 != 1) goto L41;
        kb4.X(r8);
        return r1;
    L41:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L42:
        kb4.X(r8);
        rm2 r14 = r2.D;
        if (r14 == null) goto L62;
        aq3 r15 = new aq3();
        this.p = 1;
        if (r14.e(r15, this) == r5) goto L47;
        return r1;
    L47:
        return r5;
    L62:
        return r1;
    }
}
