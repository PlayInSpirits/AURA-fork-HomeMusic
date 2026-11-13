package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mk1 extends ja4 {
    public bz4 a;

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) {
        bz4 bz4Var = this.a;
        if (bz4Var != null) {
            return bz4Var.a(l32Var);
        }
        kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) {
        bz4 bz4Var = this.a;
        if (bz4Var != null) {
            bz4Var.b(q32Var, obj);
        } else {
            kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.ja4
    public final bz4 c() {
        bz4 bz4Var = this.a;
        if (bz4Var != null) {
            return bz4Var;
        }
        kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
