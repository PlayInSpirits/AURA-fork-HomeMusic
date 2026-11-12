package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 implements q34, q21 {
    public final gr4 a;
    public final dv3 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final hy h;
    public final gv3 i;
    public final o34 j;
    public final List k;
    public final oz3 l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public jl1 r;
    public pr3 s;
    public xu3 t;
    public wu3 u;
    public cv3 v;

    public x90(gr4 r1, dv3 r2, int r3, int r4, int r5, int r6, boolean r7, hy r8, gv3 r9, o34 r10, List r11, oz3 r12, int r13, boolean r14) {
        r1.getClass();
        r2.getClass();
        r8.getClass();
        r10.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
    }

    @Override // defpackage.q21
    public final void a() {
    }

    @Override // defpackage.q21
    public final void b(bv3 r1, IOException r2) {
    }

    @Override // defpackage.q34
    public final boolean c() {
        if (this.s == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.q34
    public final void cancel() {
        this.o = true;
        Socket r1 = this.p;
        if (r1 == null) goto L6;
        ze5.c(r1);
        return;
    }

    @Override // defpackage.q34
    public final q34 d() {
        int r13 = this.m;
        boolean r14 = this.n;
        return new x90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r13, r14);
    }

    @Override // defpackage.q34
    public final cv3 e() {
        hy r0 = this.h;
        o34 r1 = this.j;
        r0.getClass();
        r1.getClass();
        rm2 r2 = r0.a.n.C;
        monitor-enter(r2);
        ((LinkedHashSet) r2.o).remove(r1);     // Catch: Throwable -> L18
        monitor-exit(r2);
        cv3 r3 = this.v;
        r3.getClass();
        hy r4 = this.h;
        o34 r5 = this.j;
        r4.getClass();
        r3.getClass();
        r5.getClass();
        c24 r6 = this.i.c(this, this.k);
        if (r6 != null) goto L9;
        monitor-enter(r3);
        dv3 r7 = this.b;     // Catch: Throwable -> L15
        r7.getClass();     // Catch: Throwable -> L15
        tl1 r8 = ze5.a;     // Catch: Throwable -> L15
        r7.f.add(r3);     // Catch: Throwable -> L15
        fr4.e(r7.d, r7.e);     // Catch: Throwable -> L15
        this.h.a(r3);     // Catch: Throwable -> L15
        monitor-exit(r3);
        this.h.e(r3);
        this.h.f(r3);
        return r3;
    L15:
        th = move-exception;
        throw th;
    L9:
        return r6.a;
    L18:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q34
    public final p34 f() {
        o34 r0 = this.j;
        if (this.p != null) goto L24;
        hy r1 = this.h;
        r1.b(this);
        boolean r3 = false;
        r0.getClass();     // Catch: Throwable -> L8 IOException -> L10
        r0.c.getClass();     // Catch: Throwable -> L8 IOException -> L10
        i();     // Catch: Throwable -> L8 IOException -> L10
        r3 = true;
        p34 r4 = new p34(this, null, 6);     // Catch: Throwable -> L8 IOException -> L10
        r1.p(this);
        return r4;
    L8:
        th = move-exception;
        r1.p(this);
        if (r3 == true) goto L23;
        Socket r6 = this.p;
        if (r6 == null) goto L23;
        ze5.c(r6);
    L23:
        throw th;
    L10:
        e = move-exception;
        r1.d(r0, e);     // Catch: Throwable -> L8
        p34 r2 = new p34(this, e, 2);     // Catch: Throwable -> L8
        r1.p(this);
        if (r3 == true) goto L17;
        Socket r7 = this.p;
        if (r7 == null) goto L17;
        ze5.c(r7);
    L17:
        return r2;
    L24:
        kf2.o("TCP already connected");
        return null;
    }

    @Override // defpackage.q34
    public final p34 g() {
        x90 r2 = null;
        if (this.p != null) goto L5;
        kf2.o("TCP not connected");
        return null;
    L5:
        if (c() == true) goto L94;
        o34 r3 = this.j;
        f6 r0 = r3.a;
        f6 r4 = r3.a;
        List r1 = r0.j;
        hy r5 = this.h;
        r5.b(this);
    L18:
        th = th;
        boolean r6 = false;
    L85:
        r5.p(this);
        if (r6 == true) goto L93;
        Socket r7 = this.q;
        if (r7 == null) goto L90;
        ze5.c(r7);
    L90:
        Socket r8 = this.p;
        if (r8 == null) goto L93;
        ze5.c(r8);
    L93:
        throw th;
    L20:
        e = e;
        x90 r10 = null;
    L22:
        r6 = false;
    L101:
        r5.d(r3, e);     // Catch: Throwable -> L84
        if (this.g == true) goto L58;
    L74:
        p34 r9 = new p34(this, r2, e);     // Catch: Throwable -> L84
        r5.p(this);
        if (r6 == true) goto L83;
        Socket r11 = this.q;
        if (r11 == null) goto L80;
        ze5.c(r11);
    L80:
        Socket r12 = this.p;
        if (r12 == null) goto L83;
        ze5.c(r12);
    L83:
        return r9;
    L58:
        if ((e instanceof ProtocolException) == true) goto L74;
        if ((e instanceof InterruptedIOException) == true) goto L74;
        if ((e instanceof SSLHandshakeException) == false) goto L69;
        if ((e.getCause() instanceof CertificateException) == true) goto L74;
    L69:
        if ((e instanceof SSLPeerUnverifiedException) == true) goto L74;
        if ((e instanceof SSLException) == false) goto L74;
        r2 = r10;
    L84:
        th = th;
        goto L85
    L8:
        if (this.l == null) goto L24;
        p34 r13 = k();     // Catch: Throwable -> L18 IOException -> L20
        if (r13.c == null) goto L24;
        r5.p(this);
        Socket r14 = this.q;
        if (r14 == null) goto L14;
        ze5.c(r14);
    L14:
        Socket r15 = this.p;
        if (r15 == null) goto L17;
        ze5.c(r15);
    L17:
        return r13;
    L24:
        if (r4.c == null) goto L41;
        xu3 r16 = this.t;     // Catch: Throwable -> L18 IOException -> L20
        if (r16 != null) goto L28;
    L29:
        wu3 r17 = this.u;     // Catch: Throwable -> L18 IOException -> L20
        if (r17 != null) goto L32;
    L36:
        SSLSocketFactory r18 = r4.c;     // Catch: Throwable -> L18 IOException -> L20
        Socket r19 = this.p;     // Catch: Throwable -> L18 IOException -> L20
        gr1 r20 = r4.h;     // Catch: Throwable -> L18 IOException -> L20
        Socket r21 = r18.createSocket(r19, r20.d, r20.e, true);     // Catch: Throwable -> L18 IOException -> L20
        r21.getClass();     // Catch: Throwable -> L18 IOException -> L20
        SSLSocket r22 = (SSLSocket) r21;     // Catch: Throwable -> L18 IOException -> L20
        x90 r23 = m(r1, r22);     // Catch: Throwable -> L18 IOException -> L20
        ma0 r24 = (ma0) r1.get(r23.m);     // Catch: Throwable -> L18 IOException -> L20
        r10 = r23.l(r1, r22);     // Catch: Throwable -> L18 IOException -> L20
        r24.a(r22, r23.n);     // Catch: Throwable -> L18 IOException -> L39
        j(r22, r24);     // Catch: Throwable -> L18 IOException -> L39
    L47:
        gr4 r110 = this.a;     // Catch: Throwable -> L18 IOException -> L39
        dv3 r111 = this.b;     // Catch: Throwable -> L18 IOException -> L39
        cv3 r112 = new cv3(r110, r111, this.j, this.p, this.q, this.r, this.s, this.t, this.u, r111.a);     // Catch: Throwable -> L18 IOException -> L39
        this.v = r112;     // Catch: Throwable -> L18 IOException -> L39
        r112.i();     // Catch: Throwable -> L18 IOException -> L39
        r3.getClass();     // Catch: Throwable -> L18 IOException -> L39
        r3.c.getClass();     // Catch: Throwable -> L18 IOException -> L39
        p34 r25 = new p34(this, null, 6);     // Catch: Throwable -> L51 IOException -> L53
        r5.p(this);
        return r25;
    L53:
        e = e;
        r6 = true;
    L51:
        th = th;
        r6 = true;
    L39:
        e = e;
        goto L22
    L32:
        if (r17.o.l() == true) goto L36;
    L35:
        throw new IOException("TLS tunnel buffered too many bytes!");     // Catch: Throwable -> L18 IOException -> L20
    L28:
        if (r16.o.l() == false) goto L35;
    L41:
        this.q = this.p;     // Catch: Throwable -> L18 IOException -> L20
        List r26 = r4.i;     // Catch: Throwable -> L18 IOException -> L20
        pr3 r27 = pr3.t;     // Catch: Throwable -> L18 IOException -> L20
        if (r26.contains(r27) == true) goto L45;
        r27 = pr3.q;     // Catch: Throwable -> L18 IOException -> L20
    L45:
        this.s = r27;     // Catch: Throwable -> L18 IOException -> L20
        r10 = null;
        goto L47
    L94:
        kf2.o("already connected");
        return null;
    }

    @Override // defpackage.q21
    public final o34 h() {
        return this.j;
    }

    public final void i() {
        Proxy.Type r0 = this.j.b.type();
        if (r0 != null) goto L5;
        int r1 = -1;
    L6:
        int r2 = 1;
        if (r1 != 1) goto L9;
    L11:
        Socket r3 = this.j.a.b.createSocket();
        r3.getClass();
    L12:
        this.p = r3;
        if (this.o == true) goto L27;
        r3.setSoTimeout(this.f);
        qg3 r4 = qg3.a;     // Catch: ConnectException -> L24
        qg3.a.e(r3, this.j.c, this.e);     // Catch: ConnectException -> L24
        Logger r5 = p83.a;     // Catch: NullPointerException -> L18
        vh4 r6 = new vh4(r3);     // Catch: NullPointerException -> L18
        InputStream r7 = r3.getInputStream();     // Catch: NullPointerException -> L18
        r7.getClass();     // Catch: NullPointerException -> L18
        int r8 = 0;
        this.t = new xu3(new tk(r8, r6, new tk(r2, r7, r6)));     // Catch: NullPointerException -> L18
        vh4 r9 = new vh4(r3);     // Catch: NullPointerException -> L18
        OutputStream r10 = r3.getOutputStream();     // Catch: NullPointerException -> L18
        r10.getClass();     // Catch: NullPointerException -> L18
        this.u = new wu3(new sk(r8, r9, new sk(r2, r10, r9)));     // Catch: NullPointerException -> L18
        return;
    L18:
        e = move-exception;
        if (h12.c(e.getMessage(), "throw with null exception") == true) goto L23;
        return;
    L23:
        throw new IOException(e);
    L24:
        e = move-exception;
        ConnectException r11 = new ConnectException("Failed to connect to " + this.j.c);
        r11.initCause(e);
        throw r11;
    L27:
        mj0.i("canceled");
        return;
    L9:
        if (r1 == 2) goto L11;
        r3 = new Socket(this.j.b);
        goto L12
    L5:
        r1 = v90.a[r0.ordinal()];
        goto L6
    }

    public final void j(SSLSocket r10, ma0 r11) {
        f6 r2 = this.j.a;
    L6:
        th = move-exception;
        qg3 r12 = qg3.a;
        qg3.a.a(r10);
        ze5.c(r10);
        throw th;
    L4:
        if (r11.b == false) goto L8;
        qg3 r3 = qg3.a;     // Catch: Throwable -> L6
        qg3.a.d(r10, r2.h.d, r2.i);     // Catch: Throwable -> L6
    L8:
        r10.startHandshake();     // Catch: Throwable -> L6
        SSLSession r4 = r10.getSession();     // Catch: Throwable -> L6
        r4.getClass();     // Catch: Throwable -> L6
        jl1 r5 = zz1.q(r4);     // Catch: Throwable -> L6
        HostnameVerifier r6 = r2.d;     // Catch: Throwable -> L6
        r6.getClass();     // Catch: Throwable -> L6
        boolean r7 = r6.verify(r2.h.d, r4);     // Catch: Throwable -> L6
        int r8 = 0;
        if (r7 == true) goto L16;
        List r9 = r5.a();     // Catch: Throwable -> L6
        if (r9.isEmpty() == true) goto L15;
        Object r13 = r9.get(0);     // Catch: Throwable -> L6
        r13.getClass();     // Catch: Throwable -> L6
        X509Certificate r14 = (X509Certificate) r13;     // Catch: Throwable -> L6
        StringBuilder r0 = new StringBuilder("\n            |Hostname ");     // Catch: Throwable -> L6
        r0.append(r2.h.d);     // Catch: Throwable -> L6
        r0.append(" not verified:\n            |    certificate: ");     // Catch: Throwable -> L6
        o00 r1 = o00.c;     // Catch: Throwable -> L6
        StringBuilder r15 = new StringBuilder("sha256/");     // Catch: Throwable -> L6
        yw r16 = yw.q;     // Catch: Throwable -> L6
        byte[] r17 = r14.getPublicKey().getEncoded();     // Catch: Throwable -> L6
        r17.getClass();     // Catch: Throwable -> L6
        r15.append(pa.A(r17).c("SHA-256").a());     // Catch: Throwable -> L6
        r0.append(r15.toString());     // Catch: Throwable -> L6
        r0.append("\n            |    DN: ");     // Catch: Throwable -> L6
        r0.append(r14.getSubjectDN().getName());     // Catch: Throwable -> L6
        r0.append("\n            |    subjectAltNames: ");     // Catch: Throwable -> L6
        r0.append(q40.G0(m83.a(r14, 7), m83.a(r14, 2)));     // Catch: Throwable -> L6
        r0.append("\n            ");     // Catch: Throwable -> L6
        throw new SSLPeerUnverifiedException(rm4.d0(r0.toString()));     // Catch: Throwable -> L6
    L15:
        throw new SSLPeerUnverifiedException("Hostname " + r2.h.d + " not verified (no certificates)");     // Catch: Throwable -> L6
    L16:
        o00 r18 = r2.e;     // Catch: Throwable -> L6
        r18.getClass();     // Catch: Throwable -> L6
        this.r = new jl1(r5.a, r5.b, r5.c, new w90(r18, r5, r2, r8));     // Catch: Throwable -> L6
        r2.h.d.getClass();     // Catch: Throwable -> L6
        Iterator r19 = r18.a.iterator();     // Catch: Throwable -> L6
        if (r19.hasNext() == false) goto L19;
        r19.next().getClass();     // Catch: Throwable -> L6
        throw new ClassCastException();     // Catch: Throwable -> L6
    L19:
        if (r11.b == false) goto L21;
        qg3 r110 = qg3.a;     // Catch: Throwable -> L6
        String r111 = qg3.a.f(r10);     // Catch: Throwable -> L6
    L22:
        this.q = r10;     // Catch: Throwable -> L6
        Logger r20 = p83.a;     // Catch: Throwable -> L6
        vh4 r21 = new vh4(r10);     // Catch: Throwable -> L6
        InputStream r22 = r10.getInputStream();     // Catch: Throwable -> L6
        r22.getClass();     // Catch: Throwable -> L6
        int r23 = 1;
        this.t = new xu3(new tk(r8, r21, new tk(r23, r22, r21)));     // Catch: Throwable -> L6
        vh4 r24 = new vh4(r10);     // Catch: Throwable -> L6
        OutputStream r25 = r10.getOutputStream();     // Catch: Throwable -> L6
        r25.getClass();     // Catch: Throwable -> L6
        this.u = new wu3(new sk(r8, r24, new sk(r23, r25, r24)));     // Catch: Throwable -> L6
        if (r111 == null) goto L25;
        pr3.o.getClass();     // Catch: Throwable -> L6
        pr3 r112 = hh3.i(r111);     // Catch: Throwable -> L6
    L26:
        this.s = r112;     // Catch: Throwable -> L6
        qg3 r26 = qg3.a;
        qg3.a.a(r10);
        return;
    L25:
        r112 = pr3.q;     // Catch: Throwable -> L6
        goto L26
    L21:
        r111 = null;
        goto L22
    }

    public final p34 k() {
        oz3 r0 = this.l;
        r0.getClass();
        o34 r1 = this.j;
        String r2 = "CONNECT " + ze5.j(r1.a.h, true) + " HTTP/1.1";
        xu3 r3 = this.t;
        r3.getClass();
        wu3 r4 = this.u;
        r4.getClass();
        hq1 r5 = new hq1(null, this, r3, r4);
        fu4 r6 = r3.n.timeout();
        long r7 = this.c;
        TimeUnit r9 = TimeUnit.MILLISECONDS;
        r6.g(r7, r9);
        r4.n.timeout().g(this.d, r9);
        r5.n(r0.c, r2);
        r5.c();
        j14 r8 = r5.f(false);
        r8.getClass();
        r8.a = r0;
        k14 r10 = r8.a();
        int r11 = r10.q;
        long r12 = ze5.e(r10);
        if (r12 == (-1)) goto L7;
        eq1 r13 = r5.k(r12);
        ze5.h(r13, Integer.MAX_VALUE);
        r13.close();
    L7:
        if (r11 == 200) goto L15;
        if (r11 != 407) goto L12;
        r1.a.f.getClass();
        mj0.i("Failed to authenticate with proxy");
        return null;
    L12:
        mj0.i(f34.f(r11, "Unexpected response code for CONNECT: "));
        return null;
    L15:
        return new p34(this, null, 6);
    }

    public final x90 l(List r20, SSLSocket r21) {
        r20.getClass();
        int r1 = this.m;
        int r2 = r1 + 1;
        int r3 = r20.size();
    L3:
        if (r2 >= r3) goto L24;
        ma0 r5 = (ma0) r20.get(r2);
        r5.getClass();
        if (r5.a == false) goto L16;
        String[] r6 = r5.d;
        if (r6 != null) goto L10;
    L12:
        String[] r7 = r5.c;
        if (r7 == null) goto L18;
        if (xe5.g(r7, r21.getEnabledCipherSuites(), v20.c) == false) goto L16;
    L18:
        if (r1 == (-1)) goto L21;
        boolean r4 = true;
    L20:
        boolean r18 = r4;
        o34 r14 = this.j;
        List r15 = this.k;
        return new x90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, r14, r15, this.l, r2, r18);
    L21:
        r4 = false;
        goto L20
    L10:
        if (xe5.g(r6, r21.getEnabledProtocols(), w13.o) == true) goto L12;
    L16:
        r2 = r2 + 1;
        goto L3
    L24:
        return null;
    }

    public final x90 m(List r4, SSLSocket r5) {
        r4.getClass();
        if (this.m == (-1)) goto L5;
        return this;
    L5:
        x90 r0 = l(r4, r5);
        if (r0 == null) goto L8;
        return r0;
    L8:
        StringBuilder r1 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        r1.append(this.n);
        r1.append(", modes=");
        r1.append(r4);
        String[] r3 = r5.getEnabledProtocols();
        r3.getClass();
        String r6 = Arrays.toString(r3);
        r6.getClass();
        r1.append(", supported protocols=");
        r1.append(r6);
        throw new UnknownServiceException(r1.toString());
    }
}
