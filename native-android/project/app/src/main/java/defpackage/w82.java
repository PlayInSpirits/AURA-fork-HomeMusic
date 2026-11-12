package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w82 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ w82(Object r1, int r2, vd0 r3, int r4) {
        this.o = r4;
        this.r = r1;
        this.q = r2;
        super(2, r3);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r5 = this.o;
        int r0 = this.q;
        Object r2 = this.r;
        switch(r5) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new w82((lm0) r2, r0, r4, 1);
    L7:
        return new w82((x82) r2, r0, r4, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((w82) create((q64) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((w82) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        j15 r1 = j15.a;
        int r2 = this.q;
        xe0 r4 = xe0.n;
        Object r5 = this.r;
        vd0 r6 = null;
        int r7 = 1;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        lm0 r8 = (lm0) r5;
        int r3 = this.p;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        kb4.X(r9);
    L12:
        r8.t(0.0f, r8.j(r2), true);
        return r1;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r9);
        this.p = 1;
        if (r8.i(this) != r4) goto L12;
        return r4;
    L14:
        int r10 = this.p;
        if (r10 == 0) goto L19;
        if (r10 != 1) goto L18;
        kb4.X(r9);
        return r1;
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        kb4.X(r9);
        s82 r11 = ((x82) r5).C;
        this.p = 1;
        lm0 r12 = r11.a;
        w82 r13 = new w82(r12, r2, r6, r7);
        Object r14 = ad3.s(r12, h13.n, r13, this);
        if (r14 == r4) goto L23;
        r14 = r1;
    L23:
        if (r14 == r4) goto L26;
        r14 = r1;
    L26:
        if (r14 == r4) goto L28;
        return r1;
    L28:
        return r4;
    }
}
