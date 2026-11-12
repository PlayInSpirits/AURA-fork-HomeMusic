package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class uf4 extends gx2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public uf4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        vf4 vf4Var = new vf4();
        vf4Var.B = this.a;
        vf4Var.C = this.b;
        vf4Var.D = this.c;
        vf4Var.E = this.d;
        vf4Var.F = true;
        return vf4Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        vf4 vf4Var = (vf4) cx2Var;
        vf4Var.B = this.a;
        vf4Var.C = this.b;
        vf4Var.D = this.c;
        vf4Var.E = this.d;
        vf4Var.F = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf4)) {
            return false;
        }
        uf4 uf4Var = (uf4) obj;
        return ku0.b(this.a, uf4Var.a) && ku0.b(this.b, uf4Var.b) && ku0.b(this.c, uf4Var.c) && ku0.b(this.d, uf4Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b11.d(b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
