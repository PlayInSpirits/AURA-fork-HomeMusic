package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd3 implements fe {
    public final int a;
    public final int b;
    public final long c;
    public final cs4 d;
    public final zg3 e;
    public final ra2 f;
    public final int g;
    public final int h;
    public final qs4 i;

    public sd3(int i, int i2, long j, cs4 cs4Var, zg3 zg3Var, ra2 ra2Var, int i3, int i4, qs4 qs4Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = cs4Var;
        this.e = zg3Var;
        this.f = ra2Var;
        this.g = i3;
        this.h = i4;
        this.i = qs4Var;
        if (bt4.a(j, bt4.c) || bt4.c(j) >= 0.0f) {
            return;
        }
        dz1.b("lineHeight can't be negative (" + bt4.c(j) + ")");
    }

    public final sd3 a(sd3 sd3Var) {
        return sd3Var == null ? this : td3.a(this, sd3Var.a, sd3Var.b, sd3Var.c, sd3Var.d, sd3Var.e, sd3Var.f, sd3Var.g, sd3Var.h, sd3Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return this.a == sd3Var.a && this.b == sd3Var.b && bt4.a(this.c, sd3Var.c) && h12.c(this.d, sd3Var.d) && h12.c(this.e, sd3Var.e) && h12.c(this.f, sd3Var.f) && this.g == sd3Var.g && this.h == sd3Var.h && h12.c(this.i, sd3Var.i);
    }

    public final int hashCode() {
        int iD = f34.d(this.b, Integer.hashCode(this.a) * 31, 31);
        ct4[] ct4VarArr = bt4.b;
        int iB = xa3.b(iD, 31, this.c);
        cs4 cs4Var = this.d;
        int iHashCode = (iB + (cs4Var != null ? cs4Var.hashCode() : 0)) * 31;
        zg3 zg3Var = this.e;
        int iHashCode2 = (iHashCode + (zg3Var != null ? zg3Var.hashCode() : 0)) * 31;
        ra2 ra2Var = this.f;
        int iD2 = f34.d(this.h, f34.d(this.g, (iHashCode2 + (ra2Var != null ? ra2Var.hashCode() : 0)) * 31, 31), 31);
        qs4 qs4Var = this.i;
        return iD2 + (qs4Var != null ? qs4Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = mr4.a(this.a);
        String strA2 = ur4.a(this.b);
        String strD = bt4.d(this.c);
        String strA3 = ma2.a(this.g);
        String strA4 = du1.a(this.h);
        StringBuilder sbU = b11.u("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbU.append(strD);
        sbU.append(", textIndent=");
        sbU.append(this.d);
        sbU.append(", platformStyle=");
        sbU.append(this.e);
        sbU.append(", lineHeightStyle=");
        sbU.append(this.f);
        sbU.append(", lineBreak=");
        f34.n(sbU, strA3, ", hyphens=", strA4, ", textMotion=");
        sbU.append(this.i);
        sbU.append(")");
        return sbU.toString();
    }
}
