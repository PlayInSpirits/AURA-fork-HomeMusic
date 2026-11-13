package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ij4 implements fe {
    public final as4 a;
    public final long b;
    public final gb1 c;
    public final eb1 d;
    public final fb1 e;
    public final vk0 f;
    public final String g;
    public final long h;
    public final hr i;
    public final bs4 j;
    public final vd2 k;
    public final long l;
    public final sr4 m;
    public final xb4 n;
    public final q05 o;

    public ij4(long j, long j2, gb1 gb1Var, eb1 eb1Var, fb1 fb1Var, vk0 vk0Var, String str, long j3, hr hrVar, bs4 bs4Var, vd2 vd2Var, long j4, sr4 sr4Var, xb4 xb4Var, int i) {
        this((i & 1) != 0 ? x40.g : j, (i & 2) != 0 ? bt4.c : j2, (i & 4) != 0 ? null : gb1Var, (i & 8) != 0 ? null : eb1Var, (i & 16) != 0 ? null : fb1Var, (i & 32) != 0 ? null : vk0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? bt4.c : j3, (i & 256) != 0 ? null : hrVar, (i & 512) != 0 ? null : bs4Var, (i & 1024) != 0 ? null : vd2Var, (i & 2048) != 0 ? x40.g : j4, (i & 4096) != 0 ? null : sr4Var, (i & 8192) != 0 ? null : xb4Var);
    }

    public final boolean a(ij4 ij4Var) {
        if (this == ij4Var) {
            return true;
        }
        return bt4.a(this.b, ij4Var.b) && h12.c(this.c, ij4Var.c) && h12.c(this.d, ij4Var.d) && h12.c(this.e, ij4Var.e) && h12.c(this.f, ij4Var.f) && h12.c(this.g, ij4Var.g) && bt4.a(this.h, ij4Var.h) && h12.c(this.i, ij4Var.i) && h12.c(this.j, ij4Var.j) && h12.c(this.k, ij4Var.k) && x40.c(this.l, ij4Var.l);
    }

    public final boolean b(ij4 ij4Var) {
        return h12.c(this.a, ij4Var.a) && h12.c(this.m, ij4Var.m) && h12.c(this.n, ij4Var.n) && h12.c(this.o, ij4Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij4)) {
            return false;
        }
        ij4 ij4Var = (ij4) obj;
        return a(ij4Var) && b(ij4Var);
    }

    public final int hashCode() {
        as4 as4Var = this.a;
        long c = as4Var.c();
        int i = x40.h;
        int hashCode = Long.hashCode(c) * 31;
        uo f = as4Var.f();
        int hashCode2 = (Float.hashCode(as4Var.b()) + ((hashCode + (f != null ? f.hashCode() : 0)) * 31)) * 31;
        ct4[] ct4VarArr = bt4.b;
        int b = xa3.b(hashCode2, 31, this.b);
        gb1 gb1Var = this.c;
        int i2 = (b + (gb1Var != null ? gb1Var.n : 0)) * 31;
        eb1 eb1Var = this.d;
        int hashCode3 = (i2 + (eb1Var != null ? Integer.hashCode(eb1Var.a) : 0)) * 31;
        fb1 fb1Var = this.e;
        int hashCode4 = (hashCode3 + (fb1Var != null ? Integer.hashCode(fb1Var.a) : 0)) * 31;
        vk0 vk0Var = this.f;
        int hashCode5 = (hashCode4 + (vk0Var != null ? vk0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int b2 = xa3.b((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        hr hrVar = this.i;
        int hashCode6 = (b2 + (hrVar != null ? Float.hashCode(hrVar.a) : 0)) * 31;
        bs4 bs4Var = this.j;
        int hashCode7 = (hashCode6 + (bs4Var != null ? bs4Var.hashCode() : 0)) * 31;
        vd2 vd2Var = this.k;
        int b3 = xa3.b((hashCode7 + (vd2Var != null ? vd2Var.n.hashCode() : 0)) * 31, 31, this.l);
        sr4 sr4Var = this.m;
        int i3 = (b3 + (sr4Var != null ? sr4Var.a : 0)) * 31;
        xb4 xb4Var = this.n;
        int hashCode8 = (i3 + (xb4Var != null ? xb4Var.hashCode() : 0)) * 961;
        q05 q05Var = this.o;
        return hashCode8 + (q05Var != null ? q05Var.hashCode() : 0);
    }

    public final String toString() {
        as4 as4Var = this.a;
        String h = x40.h(as4Var.c());
        uo f = as4Var.f();
        float b = as4Var.b();
        String d = bt4.d(this.b);
        String d2 = bt4.d(this.h);
        String h2 = x40.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(h);
        sb.append(", brush=");
        sb.append(f);
        sb.append(", alpha=");
        sb.append(b);
        sb.append(", fontSize=");
        sb.append(d);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        f34.n(sb, this.g, ", letterSpacing=", d2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(h2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public ij4(as4 as4Var, long j, gb1 gb1Var, eb1 eb1Var, fb1 fb1Var, vk0 vk0Var, String str, long j2, hr hrVar, bs4 bs4Var, vd2 vd2Var, long j3, sr4 sr4Var, xb4 xb4Var, q05 q05Var) {
        this.a = as4Var;
        this.b = j;
        this.c = gb1Var;
        this.d = eb1Var;
        this.e = fb1Var;
        this.f = vk0Var;
        this.g = str;
        this.h = j2;
        this.i = hrVar;
        this.j = bs4Var;
        this.k = vd2Var;
        this.l = j3;
        this.m = sr4Var;
        this.n = xb4Var;
        this.o = q05Var;
    }

    public ij4(long j, long j2, gb1 gb1Var, eb1 eb1Var, fb1 fb1Var, vk0 vk0Var, String str, long j3, hr hrVar, bs4 bs4Var, vd2 vd2Var, long j4, sr4 sr4Var, xb4 xb4Var) {
        this(j != 16 ? new u50(j) : rv2.F, j2, gb1Var, eb1Var, fb1Var, vk0Var, str, j3, hrVar, bs4Var, vd2Var, j4, sr4Var, xb4Var, (q05) null);
    }
}
