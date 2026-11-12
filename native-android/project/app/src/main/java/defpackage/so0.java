package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements oo0 {
    public final float n;
    public final float o;
    public final bb1 p;

    public so0(float f, float f2, bb1 bb1Var) {
        this.n = f;
        this.o = f2;
        this.p = bb1Var;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so0)) {
            return false;
        }
        so0 so0Var = (so0) obj;
        return Float.compare(this.n, so0Var.n) == 0 && Float.compare(this.o, so0Var.o) == 0 && this.p.equals(so0Var.p);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n;
    }

    @Override // defpackage.oo0
    public final long h(float f) {
        return su3.z(4294967296L, this.p.a(f));
    }

    public final int hashCode() {
        return this.p.hashCode() + b11.d(Float.hashCode(this.n) * 31, this.o, 31);
    }

    @Override // defpackage.oo0
    public final float o(long j) {
        if (ct4.a(bt4.b(j), 4294967296L)) {
            return this.p.b(bt4.c(j));
        }
        kf2.o("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        StringBuilder sbR = b11.r("DensityWithConverter(density=", this.n, ", fontScale=", this.o, ", converter=");
        sbR.append(this.p);
        sbR.append(")");
        return sbR.toString();
    }
}
