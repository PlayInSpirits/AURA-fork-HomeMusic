package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v82 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ x82 o;

    public /* synthetic */ v82(x82 x82Var, int i) {
        this.n = i;
        this.o = x82Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        x82 x82Var = this.o;
        switch (i) {
            case 0:
                return Float.valueOf(e35.t(x82Var.C.a));
            case 1:
                lm0 lm0Var = x82Var.C.a;
                return Float.valueOf(ed3.a(lm0Var.m(), lm0Var.n()));
            default:
                lm0 lm0Var2 = x82Var.C.a;
                int i2 = (int) (lm0Var2.m().e == hb3.n ? lm0Var2.m().i() & 4294967295L : lm0Var2.m().i() >> 32);
                lm0 lm0Var3 = x82Var.C.a;
                return Float.valueOf(i2 - ((-lm0Var3.m().f) + lm0Var3.m().d));
        }
    }
}
