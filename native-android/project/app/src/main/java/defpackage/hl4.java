package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hl4 extends ep4 implements xf1 {
    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ int q;
    public final /* synthetic */ il4 r;

    public hl4(il4 r1, vd0 r2) {
        this.r = r1;
        super(3, r2);
    }

    @Override // defpackage.xf1
    public final Object a(Object r2, Object r3, Object r4) {
        int r5 = ((Number) r3).intValue();
        il4 r1 = this.r;
        hl4 r0 = new hl4(r1, (vd0) r4);
        r0.p = (q81) r2;
        r0.q = r5;
        return r0.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        xe0 r7 = xe0.n;
        if (r0 == 0) goto L16;
        if (r0 == 1) goto L15;
        if (r0 == 2) goto L14;
        if (r0 == 3) goto L13;
        if (r0 == 4) goto L12;
        if (r0 == 5) goto L15;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L12:
        q81 r1 = this.p;
        kb4.X(r9);
    L30:
        this.p = null;
        this.o = 5;
        if (r1.b(gd4.p, this) != r7) goto L34;
    L32:
        return r7;
    L34:
        return j15.a;
    L13:
        r1 = this.p;
        kb4.X(r9);
    L27:
        this.p = r1;
        this.o = 4;
        if (au0.j(Long.MAX_VALUE, this) != r7) goto L30;
    L14:
        r1 = this.p;
        kb4.X(r9);
    L24:
        this.p = r1;
        this.o = 3;
        if (r1.b(gd4.o, this) != r7) goto L27;
    L15:
        kb4.X(r9);
        goto L34
    L16:
        kb4.X(r9);
        r1 = this.p;
        if (this.q <= 0) goto L21;
        this.o = 1;
        if (r1.b(gd4.n, this) != r7) goto L34;
    L21:
        this.p = r1;
        this.o = 2;
        if (au0.j(0, this) != r7) goto L24;
        goto L24
    }
}
