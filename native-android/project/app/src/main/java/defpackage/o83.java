package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o83 implements fy {
    public static final List F = ze5.f(pr3.s, pr3.q);
    public static final List G = ze5.f(ma0.e, ma0.f);
    public final int A;
    public final long B;
    public final rm2 C;
    public final gr4 D;
    public final d34 E;
    public final na4 a;
    public final List b;
    public final List c;
    public final tb4 d;
    public final boolean e;
    public final boolean f;
    public final fz0 g;
    public final boolean h;
    public final boolean i;
    public final be0 j;
    public final hx k;
    public final fz0 l;
    public final ProxySelector m;
    public final fz0 n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final m83 t;
    public final o00 u;
    public final rr2 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public o83(n83 n83Var) {
        this.a = n83Var.a;
        this.b = ze5.k(n83Var.c);
        this.c = ze5.k(n83Var.d);
        this.d = n83Var.e;
        boolean z = n83Var.f;
        this.e = z;
        boolean z2 = n83Var.g;
        this.f = z2;
        this.g = n83Var.h;
        this.h = n83Var.i;
        this.i = n83Var.j;
        this.j = n83Var.k;
        this.k = n83Var.l;
        this.l = n83Var.m;
        ProxySelector proxySelector = n83Var.n;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.m = proxySelector == null ? l73.a : proxySelector;
        this.n = n83Var.o;
        this.o = n83Var.p;
        List list = n83Var.s;
        this.r = list;
        this.s = n83Var.t;
        this.t = n83Var.u;
        this.w = n83Var.x;
        int i = n83Var.y;
        this.x = i;
        int i2 = n83Var.z;
        this.y = i2;
        int i3 = n83Var.A;
        this.z = i3;
        this.A = n83Var.B;
        this.B = n83Var.C;
        rm2 rm2Var = n83Var.D;
        rm2 rm2Var2 = rm2Var == null ? new rm2(14) : rm2Var;
        this.C = rm2Var2;
        gr4 gr4Var = n83Var.E;
        this.D = gr4Var == null ? gr4.l : gr4Var;
        d34 d34Var = n83Var.b;
        if (d34Var == null) {
            d34Var = new d34(i2, i3, i, i2, z, z2, rm2Var2);
            n83Var.b = d34Var;
        }
        this.E = d34Var;
        if (list != null && list.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = o00.c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.p = null;
                this.v = null;
                this.q = null;
                this.u = o00.c;
                break;
            }
            if (((ma0) it.next()).a) {
                SSLSocketFactory sSLSocketFactory = n83Var.q;
                if (sSLSocketFactory == null) {
                    qg3 qg3Var = qg3.a;
                    X509TrustManager x509TrustManagerM = qg3.a.m();
                    this.q = x509TrustManagerM;
                    this.p = qg3.a.l(x509TrustManagerM);
                    rr2 rr2VarB = qg3.a.b(x509TrustManagerM);
                    this.v = rr2VarB;
                    o00 o00Var = n83Var.v;
                    o00Var.getClass();
                    this.u = h12.c(o00Var.b, rr2VarB) ? o00Var : new o00(o00Var.a, rr2VarB);
                    break;
                }
                this.p = sSLSocketFactory;
                rr2 rr2Var = n83Var.w;
                rr2Var.getClass();
                this.v = rr2Var;
                X509TrustManager x509TrustManager = n83Var.r;
                x509TrustManager.getClass();
                this.q = x509TrustManager;
                o00 o00Var2 = n83Var.v;
                o00Var2.getClass();
                this.u = h12.c(o00Var2.b, rr2Var) ? o00Var2 : new o00(o00Var2.a, rr2Var);
                break;
            }
        }
        X509TrustManager x509TrustManager2 = this.q;
        rr2 rr2Var2 = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.p;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            nz2.u(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            nz2.u(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ma0) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        kf2.o("sslSocketFactory == null");
                        throw null;
                    }
                    if (rr2Var2 == null) {
                        kf2.o("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager2 != null) {
                        return;
                    }
                    kf2.o("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            kf2.o("Check failed.");
            throw null;
        }
        if (rr2Var2 != null) {
            kf2.o("Check failed.");
            throw null;
        }
        if (x509TrustManager2 != null) {
            kf2.o("Check failed.");
            throw null;
        }
        if (h12.c(this.u, o00.c)) {
            return;
        }
        kf2.o("Check failed.");
        throw null;
    }

    public final n83 a() {
        n83 n83Var = new n83();
        n83Var.a = this.a;
        n83Var.b = this.E;
        v40.n0(this.b, n83Var.c);
        v40.n0(this.c, n83Var.d);
        n83Var.e = this.d;
        n83Var.f = this.e;
        n83Var.g = this.f;
        n83Var.h = this.g;
        n83Var.i = this.h;
        n83Var.j = this.i;
        n83Var.k = this.j;
        n83Var.l = this.k;
        n83Var.m = this.l;
        n83Var.n = this.m;
        n83Var.o = this.n;
        n83Var.p = this.o;
        n83Var.q = this.p;
        n83Var.r = this.q;
        n83Var.s = this.r;
        n83Var.t = this.s;
        n83Var.u = this.t;
        n83Var.v = this.u;
        n83Var.w = this.v;
        n83Var.x = this.w;
        n83Var.y = this.x;
        n83Var.z = this.y;
        n83Var.A = this.z;
        n83Var.B = this.A;
        n83Var.C = this.B;
        n83Var.D = this.C;
        n83Var.E = this.D;
        return n83Var;
    }
}
