package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ym4 extends q05 {
    public final float d;
    public final float e;
    public final int f;
    public final int g;

    public ym4(float f, float f2, int i, int i2) {
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym4)) {
            return false;
        }
        ym4 ym4Var = (ym4) obj;
        return this.d == ym4Var.d && this.e == ym4Var.e && this.f == ym4Var.f && this.g == ym4Var.g;
    }

    public final int hashCode() {
        return f34.d(this.g, f34.d(this.f, b11.d(Float.hashCode(this.d) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.f;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.g;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbR = b11.r("Stroke(width=", this.d, ", miter=", this.e, ", cap=");
        sbR.append(str);
        sbR.append(", join=");
        sbR.append(str2);
        sbR.append(", pathEffect=null)");
        return sbR.toString();
    }
}
