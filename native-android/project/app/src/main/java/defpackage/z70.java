package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z70 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ float p;
    public final /* synthetic */ a80 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(a80 a80Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = a80Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        z70 z70Var = new z70(this.q, vd0Var);
        z70Var.p = ((Number) obj).floatValue();
        return z70Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((z70) create(Float.valueOf(((Number) obj).floatValue()), (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i == 0) {
            kb4.X(obj);
            float f = this.p;
            a80 a80Var = this.q;
            Object objG = a80Var.a.d.n.g(d94.e);
            wf1 wf1Var = (wf1) (objG != null ? objG : null);
            if (wf1Var == null) {
                throw xa3.l("Required value was null.");
            }
            g83 g83Var = new g83((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.o = 1;
            obj = wf1Var.invoke(g83Var, this);
            xe0 xe0Var = xe0.n;
            if (obj == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((g83) obj).a & 4294967295L)));
    }
}
