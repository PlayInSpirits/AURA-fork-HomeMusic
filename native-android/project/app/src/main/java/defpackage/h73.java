package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h73 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ lm0 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ b13 r;
    public final /* synthetic */ b13 s;
    public final /* synthetic */ b13 t;
    public final /* synthetic */ b13 u;

    public h73(lm0 r1, boolean r2, b13 r3, b13 r4, b13 r5, b13 r6, vd0 r7) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        this.t = r5;
        this.u = r6;
        super(2, r7);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r9, vd0 r10) {
        b13 r5 = this.t;
        b13 r6 = this.u;
        return new h73(this.p, this.q, this.r, this.s, r5, r6, r10);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((h73) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r11);
    L12:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r11);
        lm0 r4 = this.p;
        gc0 r12 = new gc0(1, new qv3(new h82(r4, 2), null));
        b13 r8 = this.t;
        b13 r9 = this.u;
        g73 r3 = new g73(r4, this.q, this.r, this.s, r8, r9);
        this.o = 1;
        Object r10 = r12.a(r3, this);
        xe0 r13 = xe0.n;
        if (r10 != r13) goto L12;
        return r13;
    }
}
