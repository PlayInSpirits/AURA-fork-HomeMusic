package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zs4 {
    public final ij4 a;
    public final sd3 b;
    public final eh3 c;

    static {
        new zs4(16777215, 0L, 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zs4(int i, long j, long j2) {
        long j3 = (i & 1) != 0 ? x40.g : j;
        long j4 = (i & 2) != 0 ? bt4.c : j2;
        long j5 = bt4.c;
        this(new ij4(j3, j4, null, null, null, null, null, j5, null, null, null, x40.g, null, null), new sd3((i & 32768) != 0 ? 0 : 3, 0, j5, null, null, null, 0, 0, null), (eh3) null);
    }

    public static zs4 a(zs4 zs4Var, long j) {
        long j2 = bt4.c;
        ij4 ij4VarA = jj4.a(zs4Var.a, j, null, Float.NaN, j2, null, null, null, null, null, j2, null, null, null, x40.g, null, null, null);
        sd3 sd3VarA = td3.a(zs4Var.b, 0, 0, j2, null, null, null, 0, 0, null);
        return (zs4Var.a == ij4VarA && zs4Var.b == sd3VarA) ? zs4Var : new zs4(ij4VarA, sd3VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs4)) {
            return false;
        }
        zs4 zs4Var = (zs4) obj;
        return h12.c(this.a, zs4Var.a) && h12.c(this.b, zs4Var.b) && h12.c(this.c, zs4Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        eh3 eh3Var = this.c;
        return iHashCode + (eh3Var != null ? eh3Var.hashCode() : 0);
    }

    public final String toString() {
        ij4 ij4Var = this.a;
        String strH = x40.h(ij4Var.a.c());
        uo uoVarF = ij4Var.a.f();
        float fB = ij4Var.a.b();
        String strD = bt4.d(ij4Var.b);
        gb1 gb1Var = ij4Var.c;
        eb1 eb1Var = ij4Var.d;
        fb1 fb1Var = ij4Var.e;
        vk0 vk0Var = ij4Var.f;
        String str = ij4Var.g;
        String strD2 = bt4.d(ij4Var.h);
        hr hrVar = ij4Var.i;
        bs4 bs4Var = ij4Var.j;
        vd2 vd2Var = ij4Var.k;
        String strH2 = x40.h(ij4Var.l);
        sr4 sr4Var = ij4Var.m;
        xb4 xb4Var = ij4Var.n;
        q05 q05Var = ij4Var.o;
        sd3 sd3Var = this.b;
        String strA = mr4.a(sd3Var.a);
        String strA2 = ur4.a(sd3Var.b);
        String strD3 = bt4.d(sd3Var.c);
        cs4 cs4Var = sd3Var.d;
        ra2 ra2Var = sd3Var.f;
        String strA3 = ma2.a(sd3Var.g);
        String strA4 = du1.a(sd3Var.h);
        qs4 qs4Var = sd3Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(uoVarF);
        sb.append(", alpha=");
        sb.append(fB);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(gb1Var);
        sb.append(", fontStyle=");
        sb.append(eb1Var);
        sb.append(", fontSynthesis=");
        sb.append(fb1Var);
        sb.append(", fontFamily=");
        sb.append(vk0Var);
        sb.append(", fontFeatureSettings=");
        f34.n(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(hrVar);
        sb.append(", textGeometricTransform=");
        sb.append(bs4Var);
        sb.append(", localeList=");
        sb.append(vd2Var);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(sr4Var);
        sb.append(", shadow=");
        sb.append(xb4Var);
        sb.append(", drawStyle=");
        sb.append(q05Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        f34.n(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(cs4Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(ra2Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(qs4Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zs4(ij4 ij4Var, sd3 sd3Var) {
        ij4Var.getClass();
        zg3 zg3Var = sd3Var.e;
        this(ij4Var, sd3Var, zg3Var == null ? null : new eh3(zg3Var));
    }

    public zs4(ij4 ij4Var, sd3 sd3Var, eh3 eh3Var) {
        this.a = ij4Var;
        this.b = sd3Var;
        this.c = eh3Var;
    }
}
