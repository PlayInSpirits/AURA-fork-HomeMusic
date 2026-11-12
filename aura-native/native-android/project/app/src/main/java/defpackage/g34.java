package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g34 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        wr1.a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public g34(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g34)) {
            return false;
        }
        g34 g34Var = (g34) obj;
        return Float.compare(this.a, g34Var.a) == 0 && Float.compare(this.b, g34Var.b) == 0 && Float.compare(this.c, g34Var.c) == 0 && Float.compare(this.d, g34Var.d) == 0 && ud3.g(this.e, g34Var.e) && ud3.g(this.f, g34Var.f) && ud3.g(this.g, g34Var.g) && ud3.g(this.h, g34Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + xa3.b(xa3.b(xa3.b(b11.d(b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strF = gh0.F(this.a);
        String strF2 = gh0.F(this.b);
        String strF3 = gh0.F(this.c);
        String strF4 = gh0.F(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strF);
        sb.append(", ");
        sb.append(strF2);
        sb.append(", ");
        sb.append(strF3);
        String strQ = b11.q(sb, ", ", strF4);
        long j = this.e;
        long j2 = this.f;
        boolean zG = ud3.g(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zG && ud3.g(j2, j3) && ud3.g(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return f34.h("RoundRect(rect=", strQ, ", radius=", gh0.F(Float.intBitsToFloat(i)), ")");
            }
            String strF5 = gh0.F(Float.intBitsToFloat(i));
            return b11.q(b11.u("RoundRect(rect=", strQ, ", x=", strF5, ", y="), gh0.F(Float.intBitsToFloat(i2)), ")");
        }
        String strI0 = ud3.I0(j);
        String strI1 = ud3.I0(j2);
        String strI2 = ud3.I0(j3);
        String strI3 = ud3.I0(j4);
        StringBuilder sbU = b11.u("RoundRect(rect=", strQ, ", topLeft=", strI0, ", topRight=");
        f34.n(sbU, strI1, ", bottomRight=", strI2, ", bottomLeft=");
        return b11.q(sbU, strI3, ")");
    }
}
