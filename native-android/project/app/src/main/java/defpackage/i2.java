package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ z64 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z64 z64Var, float f, float f2, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = z64Var;
        this.q = f;
        this.r = f2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new i2(this.p, this.q, this.r, vd0Var);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i == 0) {
            kb4.X(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.q)) << 32) | (((long) Float.floatToRawIntBits(this.r)) & 4294967295L);
            this.o = 1;
            Object objA = v64.a(this.p.e0, jFloatToRawIntBits, this);
            xe0 xe0Var = xe0.n;
            if (objA == xe0Var) {
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
