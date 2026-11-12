package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ad3 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ wd t;

    public xc3(ad3 r1, int r2, float r3, wd r4, vd0 r5) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        float r3 = this.s;
        wd r4 = this.t;
        xc3 r0 = new xc3(this.q, this.r, r3, r4, r8);
        r0.p = r7;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((xc3) create((q64) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r15) {
        int r0 = this.o;
        j15 r1 = j15.a;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L7;
        kb4.X(r15);
        return r1;
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r15);
        q64 r16 = (q64) this.p;
        ad3 r3 = this.q;
        sm0 r2 = new sm0(r16, r3);
        this.o = 1;
        dd3 r17 = ed3.a;
        int r4 = this.r;
        r3.q.h(r3.j(new Integer(r4).intValue()));
        if (r4 <= r3.e) goto L12;
        boolean r18 = true;
    L13:
        int r5 = (((xi2) q40.C0(r3.m().a)).a - r3.e) + 1;
        if (r18 == true) goto L16;
    L17:
        if (r18 == false) goto L19;
    L37:
        Object r14 = j51.f(((int) (gb.n(e35.t(r3) + ((long) ji2.L(((r3.p() * (r4 - r3.k())) - (r3.l() * r3.p())) + 0.0f)), r3.h, r3.g) - e35.t(r3))) + this.s, this.t, new ib(9, new gx3(), r2), this, 4);
        xe0 r19 = xe0.n;
        if (r14 == r19) goto L41;
        r14 = r1;
    L41:
        if (r14 != r19) goto L43;
        return r19;
    L43:
        return r1;
    L19:
        if (r4 >= r3.e) goto L37;
    L21:
        if (Math.abs(r4 - r3.e) < 3) goto L37;
        int r7 = r3.e;
        if (r18 == false) goto L28;
        int r110 = r4 - r5;
        if (r110 < r7) goto L32;
        r7 = r110;
    L32:
        float r111 = r3.p();
        if (r111 != 0.0f) goto L35;
        float r112 = 0.0f;
    L36:
        r3.t(r112, r7, true);
        goto L37
    L35:
        r112 = 0.0f / r111;
        goto L36
    L28:
        int r6 = r5 + r4;
        if (r6 > r7) goto L32;
        r7 = r6;
        goto L32
    L16:
        if (r4 > ((xi2) q40.C0(r3.m().a)).a) goto L21;
    L12:
        r18 = false;
        goto L13
    }
}
