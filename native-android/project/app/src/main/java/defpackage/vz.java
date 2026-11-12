package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public vz(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return h12.c(this.a, vzVar.a) && h12.c(this.b, vzVar.b) && this.c.equals(vzVar.c) && this.d == vzVar.d && this.e == vzVar.e && this.f.equals(vzVar.f) && this.g.equals(vzVar.g) && this.h.equals(vzVar.h) && this.i.equals(vzVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + f34.e(this.h, f34.e(this.g, f34.e(this.f, xa3.c(xa3.c(f34.e(this.c, f34.e(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = b11.u("CatalogCommand(account=", this.a, ", user=", this.b, ", ref=");
        sbU.append(this.c);
        sbU.append(", starred=");
        sbU.append(this.d);
        sbU.append(", before=");
        sbU.append(this.e);
        sbU.append(", eventId=");
        sbU.append(this.f);
        sbU.append(", timestamp=");
        f34.n(sbU, this.g, ", client=", this.h, ", context=");
        return b11.q(sbU, this.i, ")");
    }
}
