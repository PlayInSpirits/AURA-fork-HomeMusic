package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zk3 extends cu4 {
    public static final Object j = new Object();
    public final gn2 e;
    public final boolean f;
    public final boolean g;
    public final an2 h;
    public final long i;

    public zk3(al3 al3Var) {
        this.e = al3Var.a();
        this.f = al3Var.R0();
        this.g = al3Var.T0();
        this.h = al3Var.V0() ? an2.f : null;
        this.i = f35.Q(al3Var.x());
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        zt4Var.getClass();
        z5 z5Var = z5.f;
        Object obj = j;
        zt4Var.i(obj, obj, 0, this.i, 0L, z5Var, false);
        zt4Var.f = false;
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return 1;
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        return j;
    }

    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j2) {
        bu4Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        bu4Var.j = false;
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return 1;
    }
}
