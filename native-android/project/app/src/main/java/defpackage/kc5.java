package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc5 extends ep4 implements xf1 {
    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ Object[] q;

    @Override // defpackage.xf1
    public final Object a(Object r2, Object r3, Object r4) {
        kc5 r1 = new kc5(3, (vd0) r4);
        r1.p = (q81) r2;
        r1.q = (Object[]) r3;
        return r1.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        tc0 r1 = null;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r9);
    L22:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r9);
        q81 r10 = this.p;
        tc0[] r2 = (tc0[]) this.q;
        int r3 = r2.length;
        int r4 = 0;
    L9:
        tc0 r5 = rc0.a;
        if (r4 >= r3) goto L15;
        tc0 r6 = r2[r4];
        if (h12.c(r6, r5) == false) goto L13;
        r4 = r4 + 1;
        goto L9
    L13:
        r1 = r6;
    L15:
        if (r1 == null) goto L18;
        r5 = r1;
    L18:
        this.o = 1;
        Object r8 = r10.b(r5, this);
        xe0 r11 = xe0.n;
        if (r8 != r11) goto L22;
        return r11;
    }
}
