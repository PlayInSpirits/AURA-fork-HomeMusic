package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sp3 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;

    public sp3(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp3)) {
            return false;
        }
        sp3 sp3Var = (sp3) obj;
        return h12.c(this.a, sp3Var.a) && this.b == sp3Var.b && h12.c(this.c, sp3Var.c) && h12.c(this.d, sp3Var.d) && h12.c(this.e, sp3Var.e) && h12.c(this.f, sp3Var.f) && h12.c(this.g, sp3Var.g) && h12.c(this.h, sp3Var.h) && this.i == sp3Var.i;
    }

    public final int hashCode() {
        int b = xa3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return Long.hashCode(this.i) + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumePoint(id=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        f34.n(sb, ", title=", this.c, ", album=", this.d);
        f34.n(sb, ", artist=", this.e, ", albumId=", this.f);
        f34.n(sb, ", coverArtId=", this.g, ", type=", this.h);
        sb.append(", timestamp=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
