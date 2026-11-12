package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ z64 q;
    public /* synthetic */ long r;

    public /* synthetic */ j2(z64 r1, long r2, vd0 r4, int r5) {
        this.o = r5;
        this.q = r1;
        this.r = r2;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r9, vd0 r10) {
        switch(this.o) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        z64 r2 = this.q;
        return new j2(r2, this.r, r10, 3);
    L6:
        z64 r3 = this.q;
        return new j2(r3, this.r, r10, 2);
    L8:
        z64 r4 = this.q;
        return new j2(r4, this.r, r10, 1);
    L10:
        j2 r11 = new j2(this.q, r10);
        r11.r = ((g83) r9).a;
        return r11;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r5, Object r6) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L10:
        long r2 = ((g83) r5).a;
        z64 r4 = this.q;
        j2 r7 = new j2(r4, (vd0) r6);
        r7.r = r2;
        return r7.invokeSuspend(r1);
    L5:
        return ((j2) create((we0) r5, (vd0) r6)).invokeSuspend(r1);
    L7:
        return ((j2) create((we0) r5, (vd0) r6)).invokeSuspend(r1);
    L9:
        return ((j2) create((we0) r5, (vd0) r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r8) {
        int r0 = this.o;
        j15 r1 = j15.a;
        z64 r2 = this.q;
        xe0 r4 = xe0.n;
        switch(r0) {
            case 0: goto L31;
            case 1: goto L22;
            case 2: goto L13;
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
        g74 r9 = r2.e0;
        long r5 = this.r;
        this.p = 1;
        if (r9.c(r5, false, this) == r4) goto L12;
        return r1;
    L12:
        return r4;
    L13:
        int r6 = this.p;
        if (r6 == 0) goto L18;
        if (r6 != 1) goto L17;
        kb4.X(r8);
        return r1;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r8);
        g74 r10 = r2.e0;
        long r7 = this.r;
        this.p = 1;
        if (r10.c(r7, true, this) == r4) goto L21;
        return r1;
    L21:
        return r4;
    L22:
        int r11 = this.p;
        if (r11 == 0) goto L27;
        if (r11 != 1) goto L26;
        kb4.X(r8);
        return r1;
    L26:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L27:
        kb4.X(r8);
        g74 r12 = r2.e0;
        y64 r13 = new y64(this.r, null);
        this.p = 1;
        if (r12.g(h13.o, r13, this) == r4) goto L30;
        return r1;
    L30:
        return r4;
    L31:
        int r14 = this.p;
        if (r14 == 0) goto L36;
        if (r14 != 1) goto L35;
        kb4.X(r8);
        return r8;
    L35:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L36:
        kb4.X(r8);
        long r15 = this.r;
        this.p = 1;
        Object r16 = v64.a(r2.e0, r15, this);
        if (r16 == r4) goto L39;
        return r16;
    L39:
        return r4;
    }

    public j2(z64 r2, vd0 r3) {
        this.o = 0;
        this.q = r2;
        super(2, r3);
    }
}
