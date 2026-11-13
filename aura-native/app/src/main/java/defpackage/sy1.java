package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sy1 extends ep4 implements wf1 {
    public sy1(int a0, defpackage.vd0 a1) {
        super(a0, a1);
    }

    public /* synthetic */ float o;

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        sy1 sy1Var = new sy1(2, vd0Var);
        sy1Var.o = ((Number) obj).floatValue();
        return sy1Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((sy1) create(Float.valueOf(((Number) obj).floatValue()), (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        kb4.X(obj);
        return Boolean.valueOf(this.o > 0.0f);
    }
}
