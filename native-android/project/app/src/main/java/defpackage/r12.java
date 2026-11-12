package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r12 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ s12 q;

    public /* synthetic */ r12(s12 r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        s12 r1 = this.q;
        switch(r4) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new r12(r1, r3, 2);
    L7:
        return new r12(r1, r3, 1);
    L9:
        return new r12(r1, r3, 0);
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
        return ((r12) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((r12) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((r12) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r8) {
        int r0 = this.o;
        j15 r1 = j15.a;
        s12 r2 = this.q;
        xe0 r5 = xe0.n;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L13;
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
        this.p = 1;
        if (r2.b(this) == r5) goto L12;
        return r1;
    L12:
        return r5;
    L13:
        int r4 = this.p;
        if (r4 == 0) goto L18;
        if (r4 != 1) goto L17;
        kb4.X(r8);
        return r1;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r8);
        jy4 r9 = r2.b;
        this.p = 1;
        if (r9.f(this) == r5) goto L21;
        return r1;
    L21:
        return r5;
    L22:
        int r6 = this.p;
        if (r6 == 0) goto L27;
        if (r6 != 1) goto L26;
        kb4.X(r8);
        return r1;
    L26:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L27:
        kb4.X(r8);
        jy4 r10 = r2.b;
        this.p = 1;
        if (r10.f(this) == r5) goto L30;
        return r1;
    L30:
        return r5;
    }
}
