package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class p50 {
    public final String a;
    public final long b;
    public final int c;

    public p50(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            kf2.n("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            kf2.n("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p50 p50Var = (p50) obj;
        if (this.c == p50Var.c && this.a.equals(p50Var.a)) {
            return xl.m(this.b, p50Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, p50 p50Var);

    public int hashCode() {
        return xa3.b(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        long j = this.b;
        return this.a + " (id=" + this.c + ", model=" + (xl.m(j, 12884901888L) ? "Rgb" : xl.m(j, 12884901889L) ? "Xyz" : xl.m(j, 12884901890L) ? "Lab" : xl.m(j, 17179869187L) ? "Cmyk" : "Unknown") + ")";
    }
}
