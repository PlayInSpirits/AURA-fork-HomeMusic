package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a91 extends ep4 implements xf1 {
    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ wf1 r;

    public a91(wf1 r1, vd0 r2) {
        this.r = r1;
        super(3, r2);
    }

    @Override // defpackage.xf1
    public final Object a(Object r2, Object r3, Object r4) {
        wf1 r1 = this.r;
        a91 r0 = new a91(r1, (vd0) r4);
        r0.p = (q81) r2;
        r0.q = r3;
        return r0.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r6) {
        int r0 = this.o;
        xe0 r4 = xe0.n;
        if (r0 == 0) goto L10;
        if (r0 == 1) goto L9;
        if (r0 != 2) goto L7;
        kb4.X(r6);
    L17:
        return j15.a;
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        q81 r1 = this.p;
        kb4.X(r6);
    L13:
        this.p = null;
        this.o = 2;
        if (r1.b(r6, this) != r4) goto L17;
    L15:
        return r4;
    L10:
        kb4.X(r6);
        r1 = this.p;
        Object r7 = this.q;
        this.p = r1;
        this.o = 1;
        r6 = this.r.invoke(r7, this);
        if (r6 != r4) goto L13;
        goto L13
    }
}
