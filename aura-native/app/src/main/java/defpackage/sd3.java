package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        int d = f34.d(this.b, Integer.hashCode(this.a) * 31, 31);
        ct4[] ct4VarArr = bt4.b;
        int b = xa3.b(d, 31, this.c);
        cs4 cs4Var = this.d;
        int hashCode = (b + (cs4Var != null ? cs4Var.hashCode() : 0)) * 31;
        zg3 zg3Var = this.e;
        int hashCode2 = (hashCode + (zg3Var != null ? zg3Var.hashCode() : 0)) * 31;
        ra2 ra2Var = this.f;
        int d2 = f34.d(this.h, f34.d(this.g, (hashCode2 + (ra2Var != null ? ra2Var.hashCode() : 0)) * 31, 31), 31);
        qs4 qs4Var = this.i;
        return d2 + (qs4Var != null ? qs4Var.hashCode() : 0);
    }

    public final String toString() {
        String a = mr4.a(this.a);
        String a2 = ur4.a(this.b);
        String d = bt4.d(this.c);
        String a3 = ma2.a(this.g);
        String a4 = du1.a(this.h);
        StringBuilder u = b11.u("ParagraphStyle(textAlign=", a, ", textDirection=", a2, ", lineHeight=");
        u.append(d);
        u.append(", textIndent=");
        u.append(this.d);
        u.append(", platformStyle=");
        u.append(this.e);
        u.append(", lineHeightStyle=");
        u.append(this.f);
        u.append(", lineBreak=");
        f34.n(u, a3, ", hyphens=", a4, ", textMotion=");
        u.append(this.i);
        u.append(")");
        return u.toString();
    }
}
