package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class d71 extends gx2 {
    public final lq0 a;

    public d71(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        e71 e71Var = new e71();
        e71Var.B = this.a;
        e71Var.C = 1.0f;
        return e71Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        e71 e71Var = (e71) cx2Var;
        e71Var.B = this.a;
        e71Var.C = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d71) {
            return this.a == ((d71) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
