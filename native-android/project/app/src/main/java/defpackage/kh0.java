package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh0 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ s24 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ if1 r;

    public kh0(vd0 r1, if1 r2, s24 r3, boolean r4) {
        this.p = r3;
        this.q = r4;
        this.r = r2;
        super(2, r1);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        boolean r0 = this.q;
        return new kh0(r4, this.r, this.p, r0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((kh0) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r6) {
        int r0 = this.o;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L7;
        kb4.X(r6);
        return r6;
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r6);
        if1 r1 = this.r;
        s24 r3 = this.p;
        boolean r4 = this.q;
        mh0 r7 = new mh0(null, r1, r3, r4);
        this.o = 1;
        Object r5 = r3.u(r4, r7, this);
        xe0 r8 = xe0.n;
        if (r5 != r8) goto L12;
        return r8;
    L12:
        return r5;
    }
}
