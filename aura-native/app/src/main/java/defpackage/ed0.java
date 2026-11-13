package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ed0 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ b25 q;
    public final /* synthetic */ gd0 r;
    public final /* synthetic */ fv s;
    public final /* synthetic */ long t;
    public final /* synthetic */ s22 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(b25 b25Var, gd0 gd0Var, fv fvVar, long j, s22 s22Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = b25Var;
        this.r = gd0Var;
        this.s = fvVar;
        this.t = j;
        this.u = s22Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        ed0 ed0Var = new ed0(this.q, this.r, this.s, this.t, this.u, vd0Var);
        ed0Var.p = obj;
        return ed0Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((ed0) create((e74) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i == 0) {
            kb4.X(obj);
            e74 e74Var = (e74) this.p;
            long j = this.t;
            gd0 gd0Var = this.r;
            fv fvVar = this.s;
            float q0 = gd0.q0(gd0Var, fvVar, j);
            b25 b25Var = this.q;
            b25Var.e = q0;
            dd0 dd0Var = new dd0(gd0Var, b25Var, this.u, e74Var);
            jo joVar = new jo(gd0Var, b25Var, fvVar, 2);
            this.o = 1;
            Object a = b25Var.a(dd0Var, joVar, this);
            xe0 xe0Var = xe0.n;
            if (a == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return j15.a;
    }
}
