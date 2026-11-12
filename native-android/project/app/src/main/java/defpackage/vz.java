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

    public vz(String r1, String r2, String r3, boolean r4, boolean r5, String r6, String r7, String r8, String r9) {
        r1.getClass();
        r2.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof vz) == false) goto L37;
        vz r4 = (vz) r3;
        if (h12.c(this.a, r4.a) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c.equals(r4.c) == true) goto L17;
        return false;
    L17:
        if (this.d == r4.d) goto L20;
        return false;
    L20:
        if (this.e == r4.e) goto L23;
        return false;
    L23:
        if (this.f.equals(r4.f) == true) goto L26;
        return false;
    L26:
        if (this.g.equals(r4.g) == true) goto L29;
        return false;
    L29:
        if (this.h.equals(r4.h) == true) goto L32;
        return false;
    L32:
        if (this.i.equals(r4.i) == true) goto L35;
        return false;
    L35:
        return true;
    L37:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        int r2 = xa3.c(xa3.c(f34.e(this.c, r1, 31), 31, this.d), 31, this.e);
        int r3 = f34.e(this.f, r2, 31);
        int r4 = f34.e(this.g, r3, 31);
        int r5 = f34.e(this.h, r4, 31);
        return this.i.hashCode() + r5;
    }

    public final String toString() {
        StringBuilder r0 = b11.u("CatalogCommand(account=", this.a, ", user=", this.b, ", ref=");
        r0.append(this.c);
        r0.append(", starred=");
        r0.append(this.d);
        r0.append(", before=");
        r0.append(this.e);
        r0.append(", eventId=");
        r0.append(this.f);
        r0.append(", timestamp=");
        f34.n(r0, this.g, ", client=", this.h, ", context=");
        return b11.q(r0, this.i, ")");
    }
}
