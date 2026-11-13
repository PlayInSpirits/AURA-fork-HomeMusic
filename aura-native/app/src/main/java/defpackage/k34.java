package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k34 implements ac4 {
    public final lu0 a;
    public final lu0 b;
    public final lu0 c;
    public final lu0 d;

    public k34(lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, lu0 lu0Var4) {
        this.a = lu0Var;
        this.b = lu0Var2;
        this.c = lu0Var3;
        this.d = lu0Var4;
    }

    @Override // defpackage.ac4
    public final ya4 a(long j, r62 r62Var, oo0 oo0Var) {
        float a = this.a.a(j, oo0Var);
        float a2 = this.b.a(j, oo0Var);
        float a3 = this.c.a(j, oo0Var);
        float a4 = this.d.a(j, oo0Var);
        float min = Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
        float f = a + a4;
        if (f > min) {
            float f2 = min / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > min) {
            float f4 = min / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            StringBuilder r = b11.r("Corner size in Px can't be negative(topStart = ", a, ", topEnd = ", a2, ", bottomEnd = ");
            r.append(a3);
            r.append(", bottomStart = ");
            r.append(a4);
            r.append(")!");
            fz1.a(r.toString());
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new nb3(bu.d(0L, j));
        }
        wv3 d = bu.d(0L, j);
        r62 r62Var2 = r62.n;
        float f5 = r62Var == r62Var2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (r62Var == r62Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f6 = r62Var == r62Var2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (r62Var != r62Var2) {
            a4 = a3;
        }
        return new ob3(new g34(d.a, d.b, d.c, d.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k34)) {
            return false;
        }
        k34 k34Var = (k34) obj;
        return this.a.equals(k34Var.a) && this.b.equals(k34Var.b) && this.c.equals(k34Var.c) && this.d.equals(k34Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
