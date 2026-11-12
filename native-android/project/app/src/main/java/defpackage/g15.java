package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g15 extends ep4 implements yf1 {
    public int o;
    public /* synthetic */ Throwable p;
    public /* synthetic */ long q;

    @Override // defpackage.yf1
    public final Object d(Object r2, Object r3, Object r4, Object r5) {
        q81 r6 = (q81) r2;
        long r1 = ((Number) r4).longValue();
        g15 r7 = new g15(4, (vd0) r5);
        r7.p = (Throwable) r3;
        r7.q = r1;
        return r7.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        int r0 = this.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r7);
    L12:
        return Boolean.TRUE;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r7);
        Throwable r8 = this.p;
        long r2 = this.q;
        cx.f().e(i15.a, "Cannot check for unfinished work", r8);
        long r3 = Math.min(r2 * 30000, i15.b);
        this.o = 1;
        Object r6 = au0.j(r3, this);
        xe0 r9 = xe0.n;
        if (r6 != r9) goto L12;
        return r9;
    }
}
