package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class se3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public se3(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return Float.compare(this.c, se3Var.c) == 0 && Float.compare(this.d, se3Var.d) == 0 && Float.compare(this.e, se3Var.e) == 0 && Float.compare(this.f, se3Var.f) == 0 && Float.compare(this.g, se3Var.g) == 0 && Float.compare(this.h, se3Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + b11.d(b11.d(b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbR = b11.r("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbR.append(this.e);
        sbR.append(", dy2=");
        sbR.append(this.f);
        sbR.append(", dx3=");
        sbR.append(this.g);
        sbR.append(", dy3=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
