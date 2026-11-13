package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n83 {
    public int A;
    public int B;
    public long C;
    public rm2 D;
    public gr4 E;
    public d34 b;
    public tb4 e;
    public boolean f;
    public boolean g;
    public fz0 h;
    public boolean i;
    public boolean j;
    public be0 k;
    public hx l;
    public fz0 m;
    public ProxySelector n;
    public fz0 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public m83 u;
    public o00 v;
    public rr2 w;
    public int x;
    public int y;
    public int z;
    public na4 a = new na4(4);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public n83() {
        tl1 tl1Var = ze5.a;
        this.e = new tb4(19);
        this.f = true;
        this.g = true;
        fz0 fz0Var = fz0.A;
        this.h = fz0Var;
        this.i = true;
        this.j = true;
        this.k = be0.g;
        this.m = fz0.W;
        this.o = fz0Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = o83.G;
        this.t = o83.F;
        this.u = m83.a;
        this.v = o00.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.B = 60000;
        this.C = 1024L;
    }

    public final void a(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.x = ze5.b(j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.y = ze5.b(j, timeUnit);
    }

    public final void c(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        sSLSocketFactory.getClass();
        x509TrustManager.getClass();
        if (!sSLSocketFactory.equals(this.q) || !x509TrustManager.equals(this.r)) {
            this.D = null;
        }
        this.q = sSLSocketFactory;
        qg3 qg3Var = qg3.a;
        this.w = qg3.a.b(x509TrustManager);
        this.r = x509TrustManager;
    }
}
