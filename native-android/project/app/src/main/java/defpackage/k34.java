package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        float fA = this.a.a(j, oo0Var);
        float fA2 = this.b.a(j, oo0Var);
        float fA3 = this.c.a(j, oo0Var);
        float fA4 = this.d.a(j, oo0Var);
        float fMin = Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
        float f = fA + fA4;
        if (f > fMin) {
            float f2 = fMin / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fMin) {
            float f4 = fMin / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbR = b11.r("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbR.append(fA3);
            sbR.append(", bottomStart = ");
            sbR.append(fA4);
            sbR.append(")!");
            fz1.a(sbR.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new nb3(bu.d(0L, j));
        }
        wv3 wv3VarD = bu.d(0L, j);
        r62 r62Var2 = r62.n;
        float f5 = r62Var == r62Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (r62Var == r62Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = r62Var == r62Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (r62Var != r62Var2) {
            fA4 = fA3;
        }
        return new ob3(new g34(wv3VarD.a, wv3VarD.b, wv3VarD.c, wv3VarD.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
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
