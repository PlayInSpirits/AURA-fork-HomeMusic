package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g15 extends ep4 implements yf1 {
    public g15(int a0, defpackage.vd0 a1) {
        super(a0, a1);
    }

    public int o;
    public /* synthetic */ Throwable p;
    public /* synthetic */ long q;

    @Override // defpackage.yf1
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        g15 g15Var = new g15(4, (vd0) obj4);
        g15Var.p = (Throwable) obj2;
        g15Var.q = longValue;
        return g15Var.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i == 0) {
            kb4.X(obj);
            Throwable th = this.p;
            long j = this.q;
            cx.f().e(i15.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, i15.b);
            this.o = 1;
            Object j2 = au0.j(min, this);
            xe0 xe0Var = xe0.n;
            if (j2 == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return Boolean.TRUE;
    }
}
