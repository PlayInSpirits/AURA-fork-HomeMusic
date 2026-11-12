package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ s24 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ if1 s;

    public jh0(vd0 r1, if1 r2, s24 r3, boolean r4, boolean r5) {
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r2;
        super(2, r1);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        boolean r5 = this.r;
        return new jh0(r8, this.s, this.p, this.q, r5);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((jh0) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L7;
        kb4.X(r9);
        return r9;
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r9);
        if1 r4 = this.s;
        s24 r5 = this.p;
        boolean r6 = this.r;
        boolean r7 = this.q;
        ih0 r2 = new ih0(null, r4, r5, r6, r7);
        this.o = 1;
        Object r8 = r5.u(r7, r2, this);
        xe0 r10 = xe0.n;
        if (r8 != r10) goto L12;
        return r10;
    L12:
        return r8;
    }
}
