package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 extends ep4 implements wf1 {
    public lw4 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ s24 t;
    public final /* synthetic */ if1 u;

    public ih0(vd0 r1, if1 r2, s24 r3, boolean r4, boolean r5) {
        this.r = r4;
        this.s = r5;
        this.t = r3;
        this.u = r2;
        super(2, r1);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        s24 r3 = this.t;
        ih0 r0 = new ih0(r8, this.u, r3, this.r, this.s);
        r0.q = r7;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((ih0) create((mw4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r12) {
        int r0 = this.p;
        if1 r1 = this.u;
        s24 r3 = this.t;
        boolean r4 = this.s;
        xe0 r9 = xe0.n;
        if (r0 == 0) goto L14;
        if (r0 == 1) goto L13;
        if (r0 == 2) goto L12;
        if (r0 == 3) goto L11;
        if (r0 != 4) goto L9;
        Object r11 = this.q;
        kb4.X(r12);
    L42:
        if (((Boolean) r12).booleanValue() == true) goto L44;
        s12 r13 = r3.i();
        r13.b.e(r13.e, r13.f);
    L44:
        return r11;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L11:
        mw4 r2 = (mw4) this.q;
        kb4.X(r12);
    L36:
        if (r4 == true) goto L45;
        this.q = r12;
        this.p = 4;
        Object r14 = r2.d(this);
        if (r14 != r9) goto L40;
    L39:
        return r9;
    L40:
        Object r10 = r12;
        r12 = r14;
        r11 = r10;
        goto L42
    L45:
        return r12;
    L12:
        lw4 r5 = this.o;
        mw4 r7 = (mw4) this.q;
        kb4.X(r12);
    L30:
        lw4 r15 = r5;
        r2 = r7;
    L33:
        hh0 r8 = new hh0(null, r1, 0);
        this.q = r2;
        this.o = null;
        this.p = 3;
        r12 = r2.a(r15, r8, this);
        if (r12 != r9) goto L36;
    L13:
        r5 = this.o;
        mw4 r16 = (mw4) this.q;
        kb4.X(r12);
    L25:
        if (((Boolean) r12).booleanValue() == true) goto L31;
        s12 r17 = r3.i();
        this.q = r16;
        this.o = r5;
        this.p = 2;
        if (r17.b(this) == r9) goto L39;
        r7 = r16;
        goto L30
    L31:
        r15 = r5;
        r2 = r16;
        goto L33
    L14:
        kb4.X(r12);
        mw4 r18 = (mw4) this.q;
        if (this.r == false) goto L46;
        if (r4 == false) goto L18;
        r5 = lw4.n;
    L19:
        if (r4 == true) goto L32;
        this.q = r18;
        this.o = r5;
        this.p = 1;
        Object r19 = r18.d(this);
        if (r19 == r9) goto L39;
        r16 = r18;
        r12 = r19;
        goto L25
    L32:
        lw4 r110 = r5;
        r2 = r18;
        r15 = r110;
        goto L33
    L18:
        r5 = lw4.o;
        goto L19
    L46:
        r18.getClass();
        return r1.invoke(((qu3) r18).c());
    }
}
