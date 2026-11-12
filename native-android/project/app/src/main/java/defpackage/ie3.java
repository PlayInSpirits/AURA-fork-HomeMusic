package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ie3(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return Float.compare(this.c, ie3Var.c) == 0 && Float.compare(this.d, ie3Var.d) == 0 && Float.compare(this.e, ie3Var.e) == 0 && this.f == ie3Var.f && this.g == ie3Var.g && Float.compare(this.h, ie3Var.h) == 0 && Float.compare(this.i, ie3Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + b11.d(xa3.c(xa3.c(b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbR = b11.r("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbR.append(this.e);
        sbR.append(", isMoreThanHalf=");
        sbR.append(this.f);
        sbR.append(", isPositiveArc=");
        sbR.append(this.g);
        sbR.append(", arcStartX=");
        sbR.append(this.h);
        sbR.append(", arcStartY=");
        sbR.append(this.i);
        sbR.append(")");
        return sbR.toString();
    }
}
