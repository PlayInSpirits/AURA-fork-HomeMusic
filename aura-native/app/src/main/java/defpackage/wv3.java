package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wv3 {
    public static final wv3 e = new wv3(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public wv3(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long b() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final wv3 c(wv3 wv3Var) {
        return new wv3(Math.max(this.a, wv3Var.a), Math.max(this.b, wv3Var.b), Math.min(this.c, wv3Var.c), Math.min(this.d, wv3Var.d));
    }

    public final boolean d() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final wv3 e(float f, float f2) {
        return new wv3(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3)) {
            return false;
        }
        wv3 wv3Var = (wv3) obj;
        return Float.compare(this.a, wv3Var.a) == 0 && Float.compare(this.b, wv3Var.b) == 0 && Float.compare(this.c, wv3Var.c) == 0 && Float.compare(this.d, wv3Var.d) == 0;
    }

    public final wv3 f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new wv3(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String F = gh0.F(this.a);
        String F2 = gh0.F(this.b);
        String F3 = gh0.F(this.c);
        String F4 = gh0.F(this.d);
        StringBuilder u = b11.u("Rect.fromLTRB(", F, ", ", F2, ", ");
        u.append(F3);
        u.append(", ");
        u.append(F4);
        u.append(")");
        return u.toString();
    }
}
