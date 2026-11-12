package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f73 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ lm0 r;
    public final /* synthetic */ b13 s;

    public f73(int r1, int r2, lm0 r3, b13 r4, vd0 r5) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        lm0 r3 = this.r;
        b13 r4 = this.s;
        return new f73(this.p, this.q, r3, r4, r8);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((f73) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r6) {
        int r0 = this.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r6);
    L20:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r6);
        if (((Boolean) this.s.getValue()).booleanValue() == true) goto L20;
        int r7 = this.p;
        if (r7 < 0) goto L20;
        if (r7 >= this.q) goto L20;
        lm0 r1 = this.r;
        if (r7 == ((Number) r1.s.getValue()).intValue()) goto L20;
        yy4 r2 = au0.T(300, null, 6);
        this.o = 1;
        Object r5 = ad3.g(r1, r7, r2, this, 2);
        xe0 r8 = xe0.n;
        if (r5 != r8) goto L20;
        return r8;
    }
}
