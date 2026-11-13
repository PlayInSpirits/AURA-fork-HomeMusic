package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public f6(String str, int i, fz0 fz0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, o00 o00Var, fz0 fz0Var2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        fz0Var.getClass();
        socketFactory.getClass();
        fz0Var2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = fz0Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = o00Var;
        this.f = fz0Var2;
        this.g = proxySelector;
        fr1 fr1Var = new fr1();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            fr1Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                kf2.n("unexpected scheme: ".concat(str2));
                throw null;
            }
            fr1Var.a = "https";
        }
        fr1Var.d(str);
        if (1 > i || i >= 65536) {
            kf2.e(f34.f(i, "unexpected port: "));
            throw null;
        }
        fr1Var.e = i;
        this.h = fr1Var.b();
        this.i = ze5.k(list);
        this.j = ze5.k(list2);
    }

    public final boolean a(f6 f6Var) {
        f6Var.getClass();
        return h12.c(this.a, f6Var.a) && h12.c(this.f, f6Var.f) && h12.c(this.i, f6Var.i) && h12.c(this.j, f6Var.j) && h12.c(this.g, f6Var.g) && h12.c(this.c, f6Var.c) && h12.c(this.d, f6Var.d) && h12.c(this.e, f6Var.e) && this.h.e == f6Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return h12.c(this.h, f6Var.h) && a(f6Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + f34.e(this.h.i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        gr1 gr1Var = this.h;
        sb.append(gr1Var.d);
        sb.append(':');
        sb.append(gr1Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
