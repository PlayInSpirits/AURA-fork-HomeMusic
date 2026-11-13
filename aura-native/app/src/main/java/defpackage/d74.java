package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d74 extends ep4 implements wf1 {
    public g74 o;
    public ix3 p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g74 t;
    public final /* synthetic */ ix3 u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d74(g74 g74Var, ix3 ix3Var, long j, vd0 vd0Var) {
        super(2, vd0Var);
        this.t = g74Var;
        this.u = ix3Var;
        this.v = j;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        d74 d74Var = new d74(this.t, this.u, this.v, vd0Var);
        d74Var.s = obj;
        return d74Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((d74) create((e74) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        g74 g74Var;
        ix3 ix3Var;
        g74 g74Var2;
        long j;
        int i = this.r;
        hb3 hb3Var = hb3.o;
        if (i == 0) {
            kb4.X(obj);
            e74 e74Var = (e74) this.s;
            g74Var = this.t;
            c74 c74Var = new c74(g74Var, e74Var);
            y71 y71Var = g74Var.c;
            ix3 ix3Var2 = this.u;
            long j2 = ix3Var2.n;
            hb3 hb3Var2 = g74Var.d;
            long j3 = this.v;
            float e = g74Var.e(hb3Var2 == hb3Var ? k45.b(j3) : k45.c(j3));
            this.s = g74Var;
            this.o = g74Var;
            this.p = ix3Var2;
            this.q = j2;
            this.r = 1;
            obj = y71Var.a(c74Var, e, this);
            xe0 xe0Var = xe0.n;
            if (obj == xe0Var) {
                return xe0Var;
            }
            ix3Var = ix3Var2;
            g74Var2 = g74Var;
            j = j2;
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.q;
            ix3Var = this.p;
            g74Var = this.o;
            g74Var2 = (g74) this.s;
            kb4.X(obj);
        }
        float e2 = g74Var2.e(((Number) obj).floatValue());
        ix3Var.n = g74Var.d == hb3Var ? k45.a(j, e2, 0.0f, 2) : k45.a(j, 0.0f, e2, 1);
        return j15.a;
    }
}
