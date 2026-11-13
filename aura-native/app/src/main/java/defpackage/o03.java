package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o03 extends dg2 implements z32 {
    public final rf3 q;
    public Object r;

    public o03(rf3 rf3Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.q = rf3Var;
        this.r = obj2;
    }

    @Override // defpackage.dg2, java.util.Map.Entry
    public final Object getValue() {
        return this.r;
    }

    @Override // defpackage.dg2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.r;
        this.r = obj;
        pf3 pf3Var = (pf3) this.q.o;
        lf3 lf3Var = pf3Var.q;
        Object obj3 = this.o;
        if (!lf3Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = pf3Var.p;
        if (!z) {
            lf3Var.put(obj3, obj);
        } else {
            if (!z) {
                tb4.k();
                return null;
            }
            yx4 yx4Var = pf3Var.n[pf3Var.o];
            Object obj4 = yx4Var.n[yx4Var.p];
            lf3Var.put(obj3, obj);
            pf3Var.c(obj4 != null ? obj4.hashCode() : 0, lf3Var.o, obj4, 0);
        }
        pf3Var.t = lf3Var.q;
        return obj2;
    }
}
