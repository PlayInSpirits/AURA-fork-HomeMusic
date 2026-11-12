package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pg2 extends bc1 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public pg2(cu4 cu4Var, Object obj, Object obj2) {
        super(cu4Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        this.e.f(i, zt4Var, z);
        if (Objects.equals(zt4Var.b, this.g) && z) {
            zt4Var.b = h;
        }
        return zt4Var;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        this.e.m(i, bu4Var, j);
        if (Objects.equals(bu4Var.a, this.f)) {
            bu4Var.a = bu4.p;
        }
        return bu4Var;
    }
}
