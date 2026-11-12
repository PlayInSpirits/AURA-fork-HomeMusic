package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ lm0 q;

    public /* synthetic */ kc3(lm0 r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        lm0 r1 = this.q;
        switch(r4) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new kc3(r1, r3, 2);
    L7:
        return new kc3(r1, r3, 1);
    L9:
        return new kc3(r1, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((kc3) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((kc3) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((kc3) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        lm0 r2 = this.q;
        xe0 r4 = xe0.n;
        j15 r5 = j15.a;
        int r6 = 1;
        vd0 r7 = null;
        switch(r0) {
            case 0: goto L30;
            case 1: goto L16;
            default: goto L4;
        };
    L4:
        int r1 = this.p;
        if (r1 == 0) goto L10;
        if (r1 != 1) goto L9;
        kb4.X(r9);
    L15:
        return r5;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        kb4.X(r9);
        this.p = 1;
        yc r10 = new yc(2, r7, r6);
        Object r8 = ad3.s(r2, h13.n, r10, this);
        if (r8 == r4) goto L14;
        r8 = r5;
    L14:
        if (r8 != r4) goto L15;
        return r4;
    L16:
        int r3 = this.p;
        if (r3 == 0) goto L22;
        if (r3 != 1) goto L21;
        kb4.X(r9);
    L29:
        return r5;
    L21:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L22:
        kb4.X(r9);
        this.p = 1;
        dd3 r11 = ed3.a;
        if ((r2.k() + 1) >= r2.n()) goto L27;
        Object r12 = ad3.g(r2, r2.k() + 1, null, this, 6);
        if (r12 != r4) goto L27;
    L28:
        if (r12 != r4) goto L29;
        return r4;
    L27:
        r12 = r5;
        goto L28
    L30:
        int r13 = this.p;
        if (r13 == 0) goto L36;
        if (r13 != 1) goto L35;
        kb4.X(r9);
    L43:
        return r5;
    L35:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L36:
        kb4.X(r9);
        this.p = 1;
        dd3 r14 = ed3.a;
        if ((r2.k() - 1) < 0) goto L41;
        Object r15 = ad3.g(r2, r2.k() - 1, null, this, 6);
        if (r15 != r4) goto L41;
    L42:
        if (r15 != r4) goto L43;
        return r4;
    L41:
        r15 = r5;
        goto L42
    }
}
