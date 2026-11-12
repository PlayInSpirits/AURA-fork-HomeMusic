package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 extends ep4 implements wf1 {
    public /* synthetic */ float o;

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        sy1 r1 = new sy1(2, r3);
        r1.o = ((Number) r2).floatValue();
        return r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        Float r3 = Float.valueOf(((Number) r1).floatValue());
        return ((sy1) create(r3, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r1) {
        kb4.X(r1);
        if (this.o <= 0.0f) goto L5;
        boolean r0 = true;
    L7:
        return Boolean.valueOf(r0);
    L5:
        r0 = false;
        goto L7
    }
}
