package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g25 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final HashMap e;
    public final String f;

    public g25(String str, String str2, String str3, String str4, HashMap hashMap, String str5) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hashMap;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g25)) {
            return false;
        }
        g25 g25Var = (g25) obj;
        return this.a.equals(g25Var.a) && this.b.equals(g25Var.b) && this.c.equals(g25Var.c) && this.d.equals(g25Var.d) && this.e.equals(g25Var.e) && h12.c(this.f, g25Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + f34.e(this.d, f34.e(this.c, f34.e(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = b11.u("UpnpDevice(udn=", this.a, ", friendlyName=", this.b, ", manufacturer=");
        f34.n(u, this.c, ", modelName=", this.d, ", controlUrls=");
        u.append(this.e);
        u.append(", location=");
        u.append(this.f);
        u.append(")");
        return u.toString();
    }
}
