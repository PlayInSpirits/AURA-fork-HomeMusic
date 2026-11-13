package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xe3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public xe3(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3Var = (xe3) obj;
        return Float.compare(this.c, xe3Var.c) == 0 && Float.compare(this.d, xe3Var.d) == 0 && Float.compare(this.e, xe3Var.e) == 0 && Float.compare(this.f, xe3Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder r = b11.r("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        r.append(this.e);
        r.append(", dy2=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
