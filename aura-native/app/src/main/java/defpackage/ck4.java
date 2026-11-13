package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ck4 implements wd {
    public final float a;
    public final Object b;

    public ck4(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.wd
    public final g45 a() {
        Object obj = this.b;
        ce ceVar = obj == null ? null : (ce) ((if1) p35.a.o).invoke(obj);
        int i = i45.a;
        float f = this.a;
        Object rm2Var = (ceVar == null && f == 1500.0f) ? ym0.n : ceVar != null ? new rm2(ceVar, f) : new h45(f);
        c05 c05Var = new c05();
        c05Var.n = new ss0(rm2Var);
        return c05Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ck4)) {
            return false;
        }
        ck4 ck4Var = (ck4) obj;
        return ck4Var.a == this.a && h12.c(ck4Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return Float.hashCode(this.a) + b11.d((obj != null ? obj.hashCode() : 0) * 31, 1.0f, 31);
    }
}
