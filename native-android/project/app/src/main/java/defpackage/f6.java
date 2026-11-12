package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 {
    public final fz0 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final o00 e;
    public final fz0 f;
    public final ProxySelector g;
    public final gr1 h;
    public final List i;
    public final List j;

    public f6(String r1, int r2, fz0 r3, SocketFactory r4, SSLSocketFactory r5, HostnameVerifier r6, o00 r7, fz0 r8, List r9, List r10, ProxySelector r11) {
        r1.getClass();
        r3.getClass();
        r4.getClass();
        r8.getClass();
        r9.getClass();
        r10.getClass();
        r11.getClass();
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r6;
        this.e = r7;
        this.f = r8;
        this.g = r11;
        fr1 r12 = new fr1();
        if (r5 == null) goto L5;
        String r13 = "https";
    L7:
        if (r13.equalsIgnoreCase("http") == false) goto L10;
        r12.a = "http";
    L12:
        r12.d(r1);
        if (1 <= r2) goto L15;
    L18:
        kf2.e(f34.f(r2, "unexpected port: "));
        throw null;
    L15:
        if (r2 >= 65536) goto L18;
        r12.e = r2;
        this.h = r12.b();
        this.i = ze5.k(r9);
        this.j = ze5.k(r10);
        return;
    L10:
        if (r13.equalsIgnoreCase("https") == false) goto L20;
        r12.a = "https";
        goto L12
    L20:
        kf2.n("unexpected scheme: ".concat(r13));
        throw null;
    L5:
        r13 = "http";
        goto L7
    }

    public final boolean a(f6 r3) {
        r3.getClass();
        if (h12.c(this.a, r3.a) == true) goto L5;
        return false;
    L5:
        if (h12.c(this.f, r3.f) == true) goto L7;
        return false;
    L7:
        if (h12.c(this.i, r3.i) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.j, r3.j) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.g, r3.g) == true) goto L13;
        return false;
    L13:
        if (h12.c(this.c, r3.c) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.d, r3.d) == true) goto L17;
        return false;
    L17:
        if (h12.c(this.e, r3.e) == true) goto L19;
        return false;
    L19:
        if (this.h.e != r3.h.e) goto L31;
        return true;
    L31:
        return false;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof f6) == false) goto L10;
        f6 r4 = (f6) r3;
        gr1 r0 = r4.h;
        if (h12.c(this.h, r0) == true) goto L7;
        return false;
    L7:
        if (a(r4) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = f34.e(this.h.i, 527, 31);
        int r1 = (this.a.hashCode() + r0) * 31;
        int r2 = (this.f.hashCode() + r1) * 31;
        int r3 = (this.i.hashCode() + r2) * 31;
        int r4 = (this.j.hashCode() + r3) * 31;
        int r5 = (this.g.hashCode() + r4) * 961;
        int r6 = (Objects.hashCode(this.c) + r5) * 31;
        int r7 = (Objects.hashCode(this.d) + r6) * 31;
        return Objects.hashCode(this.e) + r7;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Address{");
        gr1 r1 = this.h;
        r0.append(r1.d);
        r0.append(':');
        r0.append(r1.e);
        r0.append(", ");
        r0.append("proxySelector=" + this.g);
        r0.append('}');
        return r0.toString();
    }
}
