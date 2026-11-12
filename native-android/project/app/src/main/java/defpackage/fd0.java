package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ gd0 q;
    public final /* synthetic */ b25 r;
    public final /* synthetic */ fv s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(gd0 gd0Var, b25 b25Var, fv fvVar, long j, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = gd0Var;
        this.r = b25Var;
        this.s = fvVar;
        this.t = j;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        fd0 fd0Var = new fd0(this.q, this.r, this.s, this.t, vd0Var);
        fd0Var.p = obj;
        return fd0Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((fd0) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        gd0 gd0Var = this.q;
        zg5 zg5Var = gd0Var.G;
        int i = this.o;
        try {
            try {
                if (i == 0) {
                    kb4.X(obj);
                    s22 s22VarD = gb.D(((we0) this.p).e());
                    gd0Var.J = true;
                    g74 g74Var = gd0Var.C;
                    h13 h13Var = h13.n;
                    ed0 ed0Var = new ed0(this.r, gd0Var, this.s, this.t, s22VarD, null);
                    this.o = 1;
                    Object objG = g74Var.g(h13Var, ed0Var, this);
                    xe0 xe0Var = xe0.n;
                    if (objG == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                zg5Var.z();
                gd0Var.J = false;
                zg5Var.q(null);
                gd0Var.H = false;
                return j15.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            gd0Var.J = false;
            zg5Var.q(null);
            gd0Var.H = false;
            throw th;
        }
    }
}
