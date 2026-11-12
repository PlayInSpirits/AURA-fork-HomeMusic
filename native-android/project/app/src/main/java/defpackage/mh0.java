package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 extends ep4 implements wf1 {
    public lw4 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ s24 s;
    public final /* synthetic */ if1 t;

    public mh0(vd0 r1, if1 r2, s24 r3, boolean r4) {
        this.r = r4;
        this.s = r3;
        this.t = r2;
        super(2, r1);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r4, vd0 r5) {
        s24 r1 = this.s;
        mh0 r0 = new mh0(r5, this.t, r1, this.r);
        r0.q = r4;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((mh0) create((mw4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r12) {
        int r0 = this.p;
        if1 r1 = this.t;
        if (r0 == 0) goto L36;
        vd0 r2 = null;
        s24 r3 = this.s;
        int r7 = 1;
        xe0 r8 = xe0.n;
        if (r0 == 1) goto L14;
        if (r0 == 2) goto L13;
        if (r0 == 3) goto L12;
        if (r0 != 4) goto L10;
        Object r11 = this.q;
        kb4.X(r12);
    L32:
        if (((Boolean) r12).booleanValue() == true) goto L34;
        s12 r13 = r3.i();
        r13.b.e(r13.e, r13.f);
    L34:
        return r11;
    L10:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L12:
        mw4 r4 = (mw4) this.q;
        kb4.X(r12);
    L26:
        if (this.r == true) goto L35;
        this.q = r12;
        this.p = 4;
        Object r14 = r4.d(this);
        if (r14 != r8) goto L30;
    L29:
        return r8;
    L30:
        Object r10 = r12;
        r12 = r14;
        r11 = r10;
        goto L32
    L35:
        return r12;
    L13:
        lw4 r5 = this.o;
        mw4 r6 = (mw4) this.q;
        kb4.X(r12);
    L20:
        lw4 r15 = r5;
        r4 = r6;
    L22:
        hh0 r9 = new hh0(r2, r1, r7);
        this.q = r4;
        this.o = null;
        this.p = 3;
        r12 = r4.a(r15, r9, this);
        if (r12 != r8) goto L26;
    L14:
        r5 = this.o;
        mw4 r16 = (mw4) this.q;
        kb4.X(r12);
        if (((Boolean) r12).booleanValue() == true) goto L21;
        s12 r17 = r3.i();
        this.q = r16;
        this.o = r5;
        this.p = 2;
        if (r17.b(this) == r8) goto L29;
        r6 = r16;
        goto L20
    L21:
        r15 = r5;
        r4 = r16;
        goto L22
    L36:
        kb4.X(r12);
        mw4 r18 = (mw4) this.q;
        r18.getClass();
        return r1.invoke(((qu3) r18).c());
    }
}
