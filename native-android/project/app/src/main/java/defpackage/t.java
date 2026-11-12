package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ rm2 q;
    public final /* synthetic */ bq3 r;

    public t(bq3 r2, rm2 r3, vd0 r4) {
        this.o = 0;
        this.r = r2;
        this.q = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r5 = this.o;
        bq3 r0 = this.r;
        rm2 r2 = this.q;
        switch(r5) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new t(r2, r0, r4, 2);
    L7:
        return new t(r2, r0, r4, 1);
    L9:
        return new t(r0, r2, r4);
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
        return ((t) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((t) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((t) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        bq3 r1 = this.r;
        j15 r2 = j15.a;
        rm2 r3 = this.q;
        xe0 r6 = xe0.n;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        int r4 = this.p;
        if (r4 == 0) goto L9;
        if (r4 != 1) goto L8;
        kb4.X(r9);
        return r2;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r9);
        this.p = 1;
        if (r3.e(r1, this) == r6) goto L12;
        return r2;
    L12:
        return r6;
    L13:
        int r5 = this.p;
        if (r5 == 0) goto L18;
        if (r5 != 1) goto L17;
        kb4.X(r9);
        return r2;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r9);
        this.p = 1;
        if (r3.e(r1, this) == r6) goto L21;
        return r2;
    L21:
        return r6;
    L22:
        int r7 = this.p;
        if (r7 == 0) goto L27;
        if (r7 != 1) goto L26;
        kb4.X(r9);
        return r2;
    L26:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L27:
        kb4.X(r9);
        cq3 r10 = new cq3();
        this.p = 1;
        if (r3.e(r10, this) == r6) goto L30;
        return r2;
    L30:
        return r6;
    }

    public /* synthetic */ t(rm2 r1, bq3 r2, vd0 r3, int r4) {
        this.o = r4;
        this.q = r1;
        this.r = r2;
        super(2, r3);
    }
}
