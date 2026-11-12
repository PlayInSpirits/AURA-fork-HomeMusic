package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vd5 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ wd5 q;

    public /* synthetic */ vd5(wd5 r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        wd5 r1 = this.q;
        switch(r4) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new vd5(r1, r3, 1);
    L7:
        return new vd5(r1, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((vd5) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((vd5) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r8) {
        int r0 = this.o;
        wd5 r1 = this.q;
        xe0 r4 = xe0.n;
        j15 r6 = j15.a;
        switch(r0) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        int r2 = this.p;
        if (r2 == 0) goto L10;
        if (r2 != 1) goto L9;
        kb4.X(r8);
    L30:
        return r6;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        kb4.X(r8);
        ra r9 = r1.n;
        this.p = 1;
        Object r7 = r9.K.a(this);
        if (r7 == r4) goto L14;
        r7 = r6;
    L14:
        if (r7 != r4) goto L30;
        return r4;
    L17:
        int r3 = this.p;
        if (r3 == 0) goto L23;
        if (r3 != 1) goto L22;
        kb4.X(r8);
    L32:
        return r6;
    L22:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L23:
        kb4.X(r8);
        ra r10 = r1.n;
        this.p = 1;
        Object r11 = r10.J.l(this);
        if (r11 == r4) goto L27;
        r11 = r6;
    L27:
        if (r11 != r4) goto L32;
        return r4;
    }
}
