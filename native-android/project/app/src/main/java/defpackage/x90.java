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

    public x90(gr4 gr4Var, dv3 dv3Var, int i, int i2, int i3, int i4, boolean z, hy hyVar, gv3 gv3Var, o34 o34Var, List list, oz3 oz3Var, int i5, boolean z2) {
        gr4Var.getClass();
        dv3Var.getClass();
        hyVar.getClass();
        o34Var.getClass();
        this.a = gr4Var;
        this.b = dv3Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = hyVar;
        this.i = gv3Var;
        this.j = o34Var;
        this.k = list;
        this.l = oz3Var;
        this.m = i5;
        this.n = z2;
    }

    @Override // defpackage.q21
    public final void a() {
    }

    @Override // defpackage.q21
    public final void b(bv3 bv3Var, IOException iOException) {
    }

    @Override // defpackage.q34
    public final boolean c() {
        return this.s != null;
    }

    @Override // defpackage.q34
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            ze5.c(socket);
        }
    }

    @Override // defpackage.q34
    public final q34 d() {
        return new x90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // defpackage.q34
    public final cv3 e() {
        hy hyVar = this.h;
        o34 o34Var = this.j;
        hyVar.getClass();
        o34Var.getClass();
        rm2 rm2Var = hyVar.a.n.C;
        synchronized (rm2Var) {
            ((LinkedHashSet) rm2Var.o).remove(o34Var);
        }
        cv3 cv3Var = this.v;
        cv3Var.getClass();
        hy hyVar2 = this.h;
        o34 o34Var2 = this.j;
        hyVar2.getClass();
        cv3Var.getClass();
        o34Var2.getClass();
        c24 c24VarC = this.i.c(this, this.k);
        if (c24VarC != null) {
            return c24VarC.a;
        }
        synchronized (cv3Var) {
            dv3 dv3Var = this.b;
            dv3Var.getClass();
            tl1 tl1Var = ze5.a;
            dv3Var.f.add(cv3Var);
            dv3Var.d.d(dv3Var.e, 0L);
            this.h.a(cv3Var);
        }
        this.h.e(cv3Var);
        this.h.f(cv3Var);
        return cv3Var;
    }

    @Override // defpackage.q34
    public final p34 f() {
        Socket socket;
        Socket socket2;
        o34 o34Var = this.j;
        if (this.p != null) {
            kf2.o("TCP already connected");
            return null;
        }
        hy hyVar = this.h;
        hyVar.b(this);
        boolean z = false;
        try {
            try {
                o34Var.getClass();
                o34Var.c.getClass();
                i();
                z = true;
                p34 p34Var = new p34(this, (Throwable) null, 6);
                hyVar.p(this);
                return p34Var;
            } catch (IOException e) {
                hyVar.d(o34Var, e);
                p34 p34Var2 = new p34(this, e, 2);
                hyVar.p(this);
                if (!z && (socket = this.p) != null) {
                    ze5.c(socket);
                }
                return p34Var2;
            }
        } catch (Throwable th) {
            hyVar.p(this);
            if (!z && (socket2 = this.p) != null) {
                ze5.c(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    @Override // defpackage.q34
    public final p34 g() throws Throwable {
        x90 x90VarL;
        boolean z;
        Socket socket;
        Socket socket2;
        Socket socket3;
        Socket socket4;
        wu3 wu3Var;
        x90 x90Var = null;
        if (this.p == null) {
            kf2.o("TCP not connected");
            return null;
        }
        if (c()) {
            kf2.o("already connected");
            return null;
        }
        o34 o34Var = this.j;
        f6 f6Var = o34Var.a;
        f6 f6Var2 = o34Var.a;
        List list = f6Var.j;
        hy hyVar = this.h;
        hyVar.b(this);
        try {
            try {
                if (this.l != null) {
                    p34 p34VarK = k();
                    if (p34VarK.c != null) {
                        hyVar.p(this);
                        Socket socket5 = this.q;
                        if (socket5 != null) {
                            ze5.c(socket5);
                        }
                        Socket socket6 = this.p;
                        if (socket6 != null) {
                            ze5.c(socket6);
                        }
                        return p34VarK;
                    }
                }
                if (f6Var2.c != null) {
                    xu3 xu3Var = this.t;
                    if ((xu3Var != null && !xu3Var.o.l()) || ((wu3Var = this.u) != null && !wu3Var.o.l())) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    SSLSocketFactory sSLSocketFactory = f6Var2.c;
                    Socket socket7 = this.p;
                    gr1 gr1Var = f6Var2.h;
                    Socket socketCreateSocket = sSLSocketFactory.createSocket(socket7, gr1Var.d, gr1Var.e, true);
                    socketCreateSocket.getClass();
                    SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                    x90 x90VarM = m(list, sSLSocket);
                    ma0 ma0Var = (ma0) list.get(x90VarM.m);
                    x90VarL = x90VarM.l(list, sSLSocket);
                    try {
                        ma0Var.a(sSLSocket, x90VarM.n);
                        j(sSLSocket, ma0Var);
                    } catch (IOException e) {
                        e = e;
                        z = false;
                        try {
                            hyVar.d(o34Var, e);
                            if (this.g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                x90Var = x90VarL;
                            }
                            p34 p34Var = new p34(this, x90Var, e);
                            hyVar.p(this);
                            if (!z) {
                                socket3 = this.q;
                                if (socket3 != null) {
                                    ze5.c(socket3);
                                }
                                socket4 = this.p;
                                if (socket4 != null) {
                                    ze5.c(socket4);
                                }
                            }
                            return p34Var;
                        } catch (Throwable th) {
                            th = th;
                            hyVar.p(this);
                            if (!z) {
                                socket = this.q;
                                if (socket != null) {
                                    ze5.c(socket);
                                }
                                socket2 = this.p;
                                if (socket2 != null) {
                                    ze5.c(socket2);
                                }
                            }
                            throw th;
                        }
                    }
                } else {
                    this.q = this.p;
                    List list2 = f6Var2.i;
                    pr3 pr3Var = pr3.t;
                    if (!list2.contains(pr3Var)) {
                        pr3Var = pr3.q;
                    }
                    this.s = pr3Var;
                    x90VarL = null;
                }
                gr4 gr4Var = this.a;
                dv3 dv3Var = this.b;
                cv3 cv3Var = new cv3(gr4Var, dv3Var, this.j, this.p, this.q, this.r, this.s, this.t, this.u, dv3Var.a);
                this.v = cv3Var;
                cv3Var.i();
                o34Var.getClass();
                o34Var.c.getClass();
                try {
                    p34 p34Var2 = new p34(this, (Throwable) null, 6);
                    hyVar.p(this);
                    return p34Var2;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    hyVar.d(o34Var, e);
                    if (this.g) {
                        x90Var = x90VarL;
                    }
                    p34 p34Var3 = new p34(this, x90Var, e);
                    hyVar.p(this);
                    if (!z) {
                        socket3 = this.q;
                        if (socket3 != null) {
                            ze5.c(socket3);
                        }
                        socket4 = this.p;
                        if (socket4 != null) {
                            ze5.c(socket4);
                        }
                    }
                    return p34Var3;
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    hyVar.p(this);
                    if (!z) {
                        socket = this.q;
                        if (socket != null) {
                            ze5.c(socket);
                        }
                        socket2 = this.p;
                        if (socket2 != null) {
                            ze5.c(socket2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
        } catch (IOException e3) {
            e = e3;
            x90VarL = null;
        }
    }

    @Override // defpackage.q21
    public final o34 h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : v90.a[type.ordinal()];
        int i2 = 1;
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.p = socketCreateSocket;
        if (this.o) {
            mj0.i("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            qg3 qg3Var = qg3.a;
            qg3.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                Logger logger = p83.a;
                vh4 vh4Var = new vh4(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                int i3 = 0;
                this.t = new xu3(new tk(i3, vh4Var, new tk(i2, inputStream, vh4Var)));
                vh4 vh4Var2 = new vh4(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                this.u = new wu3(new sk(i3, vh4Var2, new sk(i2, outputStream, vh4Var2)));
            } catch (NullPointerException e) {
                if (h12.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ma0 ma0Var) {
        String strF;
        pr3 pr3VarI;
        f6 f6Var = this.j.a;
        try {
            if (ma0Var.b) {
                qg3 qg3Var = qg3.a;
                qg3.a.d(sSLSocket, f6Var.h.d, f6Var.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            jl1 jl1VarQ = zz1.q(session);
            HostnameVerifier hostnameVerifier = f6Var.d;
            hostnameVerifier.getClass();
            boolean zVerify = hostnameVerifier.verify(f6Var.h.d, session);
            int i = 0;
            if (!zVerify) {
                List listA = jl1VarQ.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + f6Var.h.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(f6Var.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                o00 o00Var = o00.c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                yw ywVar = yw.q;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                encoded.getClass();
                sb2.append(pa.A(encoded).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(q40.G0(m83.a(x509Certificate, 7), m83.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(rm4.d0(sb.toString()));
            }
            o00 o00Var2 = f6Var.e;
            o00Var2.getClass();
            this.r = new jl1(jl1VarQ.a, jl1VarQ.b, jl1VarQ.c, new w90(o00Var2, jl1VarQ, f6Var, i));
            f6Var.h.d.getClass();
            Iterator it = o00Var2.a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (ma0Var.b) {
                qg3 qg3Var2 = qg3.a;
                strF = qg3.a.f(sSLSocket);
            } else {
                strF = null;
            }
            this.q = sSLSocket;
            Logger logger = p83.a;
            vh4 vh4Var = new vh4(sSLSocket);
            InputStream inputStream = sSLSocket.getInputStream();
            inputStream.getClass();
            int i2 = 1;
            this.t = new xu3(new tk(i, vh4Var, new tk(i2, inputStream, vh4Var)));
            vh4 vh4Var2 = new vh4(sSLSocket);
            OutputStream outputStream = sSLSocket.getOutputStream();
            outputStream.getClass();
            this.u = new wu3(new sk(i, vh4Var2, new sk(i2, outputStream, vh4Var2)));
            if (strF != null) {
                pr3.o.getClass();
                pr3VarI = hh3.i(strF);
            } else {
                pr3VarI = pr3.q;
            }
            this.s = pr3VarI;
            qg3 qg3Var3 = qg3.a;
            qg3.a.a(sSLSocket);
        } catch (Throwable th) {
            qg3 qg3Var4 = qg3.a;
            qg3.a.a(sSLSocket);
            ze5.c(sSLSocket);
            throw th;
        }
    }

    public final p34 k() throws IOException {
        oz3 oz3Var = this.l;
        oz3Var.getClass();
        o34 o34Var = this.j;
        String str = "CONNECT " + ze5.j(o34Var.a.h, true) + " HTTP/1.1";
        xu3 xu3Var = this.t;
        xu3Var.getClass();
        wu3 wu3Var = this.u;
        wu3Var.getClass();
        hq1 hq1Var = new hq1(null, this, xu3Var, wu3Var);
        fu4 fu4VarTimeout = xu3Var.n.timeout();
        long j = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fu4VarTimeout.g(j, timeUnit);
        wu3Var.n.timeout().g(this.d, timeUnit);
        hq1Var.n(oz3Var.c, str);
        hq1Var.c();
        j14 j14VarF = hq1Var.f(false);
        j14VarF.getClass();
        j14VarF.a = oz3Var;
        k14 k14VarA = j14VarF.a();
        int i = k14VarA.q;
        long jE = ze5.e(k14VarA);
        if (jE != -1) {
            eq1 eq1VarK = hq1Var.k(jE);
            ze5.h(eq1VarK, Integer.MAX_VALUE);
            eq1VarK.close();
        }
        if (i == 200) {
            return new p34(this, (Throwable) null, 6);
        }
        if (i != 407) {
            mj0.i(f34.f(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        o34Var.a.f.getClass();
        mj0.i("Failed to authenticate with proxy");
        return null;
    }

    public final x90 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ma0 ma0Var = (ma0) list.get(i2);
            ma0Var.getClass();
            if (ma0Var.a && (((strArr = ma0Var.d) == null || xe5.g(strArr, sSLSocket.getEnabledProtocols(), w13.o)) && ((strArr2 = ma0Var.c) == null || xe5.g(strArr2, sSLSocket.getEnabledCipherSuites(), v20.c)))) {
                return new x90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, i != -1);
            }
        }
        return null;
    }

    public final x90 m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        x90 x90VarL = l(list, sSLSocket);
        if (x90VarL != null) {
            return x90VarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
