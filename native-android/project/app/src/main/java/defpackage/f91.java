package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f91 extends ep4 implements wf1 {
    public /* synthetic */ int o;

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        f91 f91Var = new f91(2, vd0Var);
        f91Var.o = ((Number) obj).intValue();
        return f91Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((f91) create(Integer.valueOf(((Number) obj).intValue()), (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        kb4.X(obj);
        return Boolean.valueOf(this.o > 0);
    }
}
