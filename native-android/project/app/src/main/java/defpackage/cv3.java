package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cv3 extends kq1 implements q21 {
    public final gr4 b;
    public final dv3 c;
    public final o34 d;
    public final Socket e;
    public final Socket f;
    public final jl1 g;
    public final pr3 h;
    public final fw i;
    public final ew j;
    public final fz0 k;
    public rq1 l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final ArrayList s;
    public long t;

    public cv3(gr4 gr4Var, dv3 dv3Var, o34 o34Var, Socket socket, Socket socket2, jl1 jl1Var, pr3 pr3Var, xu3 xu3Var, wu3 wu3Var, fz0 fz0Var) {
        gr4Var.getClass();
        dv3Var.getClass();
        o34Var.getClass();
        this.b = gr4Var;
        this.c = dv3Var;
        this.d = o34Var;
        this.e = socket;
        this.f = socket2;
        this.g = jl1Var;
        this.h = pr3Var;
        this.i = xu3Var;
        this.j = wu3Var;
        this.k = fz0Var;
        this.r = 1;
        this.s = new ArrayList();
        this.t = Long.MAX_VALUE;
    }

    public static void e(o83 o83Var, o34 o34Var, IOException iOException) {
        o83Var.getClass();
        o34Var.getClass();
        iOException.getClass();
        if (o34Var.b.type() != Proxy.Type.DIRECT) {
            f6 f6Var = o34Var.a;
            f6Var.g.connectFailed(f6Var.h.j(), o34Var.b.address(), iOException);
        }
        rm2 rm2Var = o83Var.C;
        synchronized (rm2Var) {
            ((LinkedHashSet) rm2Var.o).add(o34Var);
        }
    }

    @Override // defpackage.q21
    public final void a() {
        synchronized (this) {
            this.m = true;
        }
    }

    @Override // defpackage.q21
    public final void b(bv3 bv3Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.l != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.m = true;
                        if (this.p == 0) {
                            if (iOException != null) {
                                e(bv3Var.n, this.d, iOException);
                            }
                            this.o++;
                        }
                    }
                } else if (((StreamResetException) iOException).n == b21.REFUSED_STREAM) {
                    int i = this.q + 1;
                    this.q = i;
                    if (i > 1) {
                        this.m = true;
                        this.o++;
                    }
                } else if (((StreamResetException) iOException).n != b21.CANCEL || !bv3Var.A) {
                    this.m = true;
                    this.o++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kq1
    public final synchronized void c(rq1 rq1Var, pb4 pb4Var) {
        try {
            pb4Var.getClass();
            int i = this.r;
            int i2 = (pb4Var.a & 16) != 0 ? pb4Var.b[4] : Integer.MAX_VALUE;
            this.r = i2;
            if (i2 < i) {
                dv3 dv3Var = this.c;
                f6 f6Var = this.d.a;
                dv3Var.getClass();
                f6Var.getClass();
                if (dv3Var.c.get(f6Var) != null) {
                    throw new ClassCastException();
                }
            } else if (i2 > i) {
                dv3 dv3Var2 = this.c;
                dv3Var2.d.d(dv3Var2.e, 0L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q21
    public final void cancel() {
        Socket socket = this.e;
        if (socket != null) {
            ze5.c(socket);
        }
    }

    @Override // defpackage.kq1
    public final void d(yq1 yq1Var) {
        yq1Var.c(b21.REFUSED_STREAM, null);
    }

    public final boolean f(f6 f6Var, List list) {
        f6Var.getClass();
        gr1 gr1Var = f6Var.h;
        tl1 tl1Var = ze5.a;
        if (this.s.size() < this.r && !this.m) {
            o34 o34Var = this.d;
            f6 f6Var2 = o34Var.a;
            f6 f6Var3 = o34Var.a;
            if (f6Var2.a(f6Var)) {
                String str = gr1Var.d;
                String str2 = gr1Var.d;
                if (!h12.c(str, f6Var3.h.d)) {
                    if (this.l != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            o34 o34Var2 = (o34) it.next();
                            Proxy.Type type = o34Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && o34Var.b.type() == type2 && h12.c(o34Var.c, o34Var2.c)) {
                                if (f6Var.d != m83.a) {
                                    break;
                                }
                                tl1 tl1Var2 = ze5.a;
                                gr1 gr1Var2 = f6Var3.h;
                                if (gr1Var.e != gr1Var2.e) {
                                    break;
                                }
                                boolean zC = h12.c(str2, gr1Var2.d);
                                jl1 jl1Var = this.g;
                                if (!zC) {
                                    if (!this.n && jl1Var != null) {
                                        List listA = jl1Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!m83.c(str2, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    o00 o00Var = f6Var.e;
                                    o00Var.getClass();
                                    jl1Var.getClass();
                                    List listA2 = jl1Var.a();
                                    str2.getClass();
                                    listA2.getClass();
                                    Iterator it2 = o00Var.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(boolean z) {
        long j;
        tl1 tl1Var = ze5.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.e;
        socket.getClass();
        Socket socket2 = this.f;
        socket2.getClass();
        fw fwVar = this.i;
        fwVar.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        rq1 rq1Var = this.l;
        if (rq1Var != null) {
            synchronized (rq1Var) {
                if (rq1Var.s) {
                    return false;
                }
                return rq1Var.A >= rq1Var.z || jNanoTime < rq1Var.B;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.t;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !fwVar.l();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.q21
    public final o34 h() {
        return this.d;
    }

    public final void i() throws SocketException {
        int i;
        this.t = System.nanoTime();
        pr3 pr3Var = this.h;
        if (pr3Var == pr3.s || pr3Var == pr3.t) {
            Socket socket = this.f;
            socket.getClass();
            fw fwVar = this.i;
            fwVar.getClass();
            ew ewVar = this.j;
            ewVar.getClass();
            socket.setSoTimeout(0);
            r81 r81Var = r81.a;
            lv4 lv4Var = new lv4(this.b);
            String str = this.d.a.h.d;
            str.getClass();
            lv4Var.o = socket;
            lv4Var.p = ze5.c + ' ' + str;
            lv4Var.q = fwVar;
            lv4Var.r = ewVar;
            lv4Var.s = this;
            lv4Var.t = r81Var;
            rq1 rq1Var = new rq1(lv4Var);
            this.l = rq1Var;
            pb4 pb4Var = rq1.M;
            this.r = (pb4Var.a & 16) != 0 ? pb4Var.b[4] : Integer.MAX_VALUE;
            zq1 zq1Var = rq1Var.J;
            synchronized (zq1Var) {
                try {
                    if (zq1Var.q) {
                        throw new IOException("closed");
                    }
                    Logger logger = zq1.s;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ze5.d(">> CONNECTION " + iq1.a.e(), new Object[0]));
                    }
                    zq1Var.n.A(iq1.a);
                    zq1Var.n.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zq1 zq1Var2 = rq1Var.J;
            pb4 pb4Var2 = rq1Var.D;
            synchronized (zq1Var2) {
                try {
                    pb4Var2.getClass();
                    if (zq1Var2.q) {
                        throw new IOException("closed");
                    }
                    zq1Var2.j(0, Integer.bitCount(pb4Var2.a) * 6, 4, 0);
                    int i2 = 0;
                    while (i2 < 10) {
                        boolean z = true;
                        if (((1 << i2) & pb4Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            if (i2 != 4) {
                                i = i2 != 7 ? i2 : 4;
                            } else {
                                i = 3;
                            }
                            zq1Var2.n.writeShort(i);
                            zq1Var2.n.writeInt(pb4Var2.b[i2]);
                        }
                        i2++;
                    }
                    zq1Var2.n.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = rq1Var.D.a();
            if (iA != 65535) {
                rq1Var.J.v(0, iA - 65535);
            }
            fr4.c(rq1Var.t.e(), rq1Var.p, rq1Var.K);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        o34 o34Var = this.d;
        sb.append(o34Var.a.h.d);
        sb.append(':');
        sb.append(o34Var.a.h.e);
        sb.append(", proxy=");
        sb.append(o34Var.b);
        sb.append(" hostAddress=");
        sb.append(o34Var.c);
        sb.append(" cipherSuite=");
        jl1 jl1Var = this.g;
        sb.append(jl1Var != null ? jl1Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }
}
