package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ke3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ke3(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return Float.compare(this.c, ke3Var.c) == 0 && Float.compare(this.d, ke3Var.d) == 0 && Float.compare(this.e, ke3Var.e) == 0 && Float.compare(this.f, ke3Var.f) == 0 && Float.compare(this.g, ke3Var.g) == 0 && Float.compare(this.h, ke3Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + b11.d(b11.d(b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder r = b11.r("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        r.append(this.e);
        r.append(", y2=");
        r.append(this.f);
        r.append(", x3=");
        r.append(this.g);
        r.append(", y3=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
