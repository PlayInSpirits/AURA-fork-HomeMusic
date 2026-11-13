package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g73 implements q81 {
    public final /* synthetic */ lm0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ b13 p;
    public final /* synthetic */ b13 q;
    public final /* synthetic */ b13 r;
    public final /* synthetic */ b13 s;

    public g73(lm0 lm0Var, boolean z, b13 b13Var, b13 b13Var2, b13 b13Var3, b13 b13Var4) {
        this.n = lm0Var;
        this.o = z;
        this.p = b13Var;
        this.q = b13Var2;
        this.r = b13Var3;
        this.s = b13Var4;
    }

    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        j15 j15Var = j15.a;
        if (!booleanValue) {
            b13 b13Var = this.p;
            if (((Boolean) b13Var.getValue()).booleanValue()) {
                b13Var.setValue(Boolean.FALSE);
                int k = this.n.k();
                if (!this.o && k >= 0 && k < ((Number) this.q.getValue()).intValue() && k != ((Number) this.r.getValue()).intValue()) {
                    ((if1) this.s.getValue()).invoke(new Integer(k));
                }
            }
        }
        return j15Var;
    }
}
