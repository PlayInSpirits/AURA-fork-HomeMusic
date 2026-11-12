package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public oe3(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe3)) {
            return false;
        }
        oe3 oe3Var = (oe3) obj;
        return Float.compare(this.c, oe3Var.c) == 0 && Float.compare(this.d, oe3Var.d) == 0 && Float.compare(this.e, oe3Var.e) == 0 && Float.compare(this.f, oe3Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbR = b11.r("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbR.append(this.e);
        sbR.append(", y2=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
