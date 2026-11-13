package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ro0 implements oo0 {
    public final float n;
    public final float o;

    public ro0(float f, float f2) {
        this.n = f;
        this.o = f2;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro0)) {
            return false;
        }
        ro0 ro0Var = (ro0) obj;
        return Float.compare(this.n, ro0Var.n) == 0 && Float.compare(this.o, ro0Var.o) == 0;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n;
    }

    public final int hashCode() {
        return Float.hashCode(this.o) + (Float.hashCode(this.n) * 31);
    }

    public final String toString() {
        return xa3.f("DensityImpl(density=", this.n, ", fontScale=", this.o, ")");
    }
}
