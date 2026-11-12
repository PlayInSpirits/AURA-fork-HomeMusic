package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g25 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final HashMap e;
    public final String f;

    public g25(String r1, String r2, String r3, String r4, HashMap r5, String r6) {
        r6.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof g25) == false) goto L28;
        g25 r4 = (g25) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c.equals(r4.c) == true) goto L17;
        return false;
    L17:
        if (this.d.equals(r4.d) == true) goto L20;
        return false;
    L20:
        if (this.e.equals(r4.e) == true) goto L23;
        return false;
    L23:
        if (h12.c(this.f, r4.f) == true) goto L26;
        return false;
    L26:
        return true;
    L28:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        int r2 = f34.e(this.c, r1, 31);
        int r3 = f34.e(this.d, r2, 31);
        int r4 = (this.e.hashCode() + r3) * 31;
        return this.f.hashCode() + r4;
    }

    public final String toString() {
        StringBuilder r0 = b11.u("UpnpDevice(udn=", this.a, ", friendlyName=", this.b, ", manufacturer=");
        f34.n(r0, this.c, ", modelName=", this.d, ", controlUrls=");
        r0.append(this.e);
        r0.append(", location=");
        r0.append(this.f);
        r0.append(")");
        return r0.toString();
    }
}
