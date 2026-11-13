package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j12 extends wd0 {
    public int n;
    public final /* synthetic */ wf1 o;
    public final /* synthetic */ vd0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j12(vd0 vd0Var, ne0 ne0Var, wf1 wf1Var, vd0 vd0Var2) {
        super(vd0Var, ne0Var);
        this.o = wf1Var;
        this.p = vd0Var2;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.n;
        if (i != 0) {
            if (i != 1) {
                kf2.o("This coroutine had already completed");
                return null;
            }
            this.n = 2;
            kb4.X(obj);
            return obj;
        }
        this.n = 1;
        kb4.X(obj);
        wf1 wf1Var = this.o;
        wf1Var.getClass();
        jz4.j(2, wf1Var);
        return wf1Var.invoke(this.p, this);
    }
}
