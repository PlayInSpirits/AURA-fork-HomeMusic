package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a91 extends ep4 implements xf1 {
    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ wf1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a91(wf1 wf1Var, vd0 vd0Var) {
        super(3, vd0Var);
        this.r = wf1Var;
    }

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        a91 a91Var = new a91(this.r, (vd0) obj3);
        a91Var.p = (q81) obj;
        a91Var.q = obj2;
        return a91Var.invokeSuspend(j15.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r0.b(r6, r5) == r4) goto L15;
     */
    @Override // defpackage.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q81 q81Var;
        int i = this.o;
        xe0 xe0Var = xe0.n;
        if (i != 0) {
            if (i == 1) {
                q81Var = this.p;
                kb4.X(obj);
            } else {
                if (i != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
            }
            return j15.a;
        }
        kb4.X(obj);
        q81Var = this.p;
        Object obj2 = this.q;
        this.p = q81Var;
        this.o = 1;
        obj = this.r.invoke(obj2, this);
        if (obj != xe0Var) {
        }
        return xe0Var;
        this.p = null;
        this.o = 2;
    }
}
