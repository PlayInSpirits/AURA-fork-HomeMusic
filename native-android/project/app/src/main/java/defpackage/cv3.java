package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
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

    public cv3(gr4 r1, dv3 r2, o34 r3, Socket r4, Socket r5, jl1 r6, pr3 r7, xu3 r8, wu3 r9, fz0 r10) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r9;
        this.k = r10;
        this.r = 1;
        this.s = new ArrayList();
        this.t = Long.MAX_VALUE;
    }

    public static void e(o83 r3, o34 r4, IOException r5) {
        r3.getClass();
        r4.getClass();
        r5.getClass();
        if (r4.b.type() == Proxy.Type.DIRECT) goto L5;
        f6 r0 = r4.a;
        r0.g.connectFailed(r0.h.j(), r4.b.address(), r5);
    L5:
        rm2 r6 = r3.C;
        monitor-enter(r6);
        ((LinkedHashSet) r6.o).add(r4);     // Catch: Throwable -> L10
        monitor-exit(r6);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q21
    public final void a() {
        monitor-enter(this);
        this.m = true;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q21
    public final void b(bv3 r4, IOException r5) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if ((r5 instanceof StreamResetException) == false) goto L18;
        if (((StreamResetException) r5).n != b21.t) goto L13;
        int r6 = this.q + 1;     // Catch: Throwable -> L10
        this.q = r6;     // Catch: Throwable -> L10
        if (r6 <= 1) goto L29;
        this.m = true;     // Catch: Throwable -> L10
        this.o++;     // Catch: Throwable -> L10
    L29:
        monitor-exit(this);
        return;
    L13:
        if (((StreamResetException) r5).n == b21.u) goto L15;
    L16:
        this.m = true;     // Catch: Throwable -> L10
        this.o++;     // Catch: Throwable -> L10
        goto L29
    L15:
        if (r4.A == true) goto L29;
    L18:
        if (this.l == null) goto L20;
        boolean r0 = true;
    L21:
        if (r0 == true) goto L23;
    L24:
        this.m = true;     // Catch: Throwable -> L10
        if (this.p != 0) goto L29;
        if (r5 == null) goto L28;
        e(r4.n, this.d, r5);     // Catch: Throwable -> L10
    L28:
        this.o++;     // Catch: Throwable -> L10
        goto L29
    L23:
        if ((r5 instanceof ConnectionShutdownException) == false) goto L29;
    L20:
        r0 = false;
        goto L21
    }

    @Override // defpackage.kq1
    public final synchronized void c(rq1 r2, pb4 r3) {
        monitor-enter(this);
        r3.getClass();     // Catch: Throwable -> L14
        int r4 = this.r;     // Catch: Throwable -> L14
        if ((r3.a & 16) == 0) goto L6;
        int r5 = r3.b[4];     // Catch: Throwable -> L14
    L7:
        this.r = r5;     // Catch: Throwable -> L14
        if (r5 >= r4) goto L16;
        dv3 r6 = this.c;     // Catch: Throwable -> L14
        f6 r7 = this.d.a;     // Catch: Throwable -> L14
        r6.getClass();     // Catch: Throwable -> L14
        r7.getClass();     // Catch: Throwable -> L14
        if (r6.c.get(r7) != null) goto L13;
    L18:
        monitor-exit(this);
        return;
    L13:
        throw new ClassCastException();     // Catch: Throwable -> L14
    L16:
        if (r5 <= r4) goto L18;
        dv3 r8 = this.c;     // Catch: Throwable -> L14
        fr4.e(r8.d, r8.e);     // Catch: Throwable -> L14
        goto L18
    L6:
        r5 = Integer.MAX_VALUE;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q21
    public final void cancel() {
        Socket r0 = this.e;
        if (r0 == null) goto L6;
        ze5.c(r0);
        return;
    }

    @Override // defpackage.kq1
    public final void d(yq1 r2) {
        r2.c(b21.t, null);
    }

    public final boolean f(f6 r9, List r10) {
        r9.getClass();
        gr1 r0 = r9.h;
        tl1 r1 = ze5.a;
        if (this.s.size() < this.r) goto L5;
    L51:
        return false;
    L5:
        if (this.m == true) goto L51;
        o34 r2 = this.d;
        f6 r3 = r2.a;
        f6 r4 = r2.a;
        if (r3.a(r9) == false) goto L51;
        String r5 = r0.d;
        String r6 = r0.d;
        if (h12.c(r5, r4.h.d) == false) goto L14;
        return true;
    L14:
        if (this.l == null) goto L51;
        if (r10 == null) goto L51;
        if (r10.isEmpty() == true) goto L51;
        Iterator r11 = r10.iterator();
    L22:
        if (r11.hasNext() == false) goto L51;
        o34 r7 = (o34) r11.next();
        Proxy.Type r8 = r7.b.type();
        Proxy.Type r12 = Proxy.Type.DIRECT;
        if (r8 != r12) goto L22;
        if (r2.b.type() != r12) goto L22;
        if (h12.c(r2.c, r7.c) == false) goto L22;
        if (r9.d != m83.a) goto L51;
        tl1 r13 = ze5.a;
        gr1 r14 = r4.h;
        if (r0.e != r14.e) goto L51;
        boolean r15 = h12.c(r6, r14.d);
        jl1 r16 = this.g;
        if (r15 == false) goto L39;
    L53:
        o00 r17 = r9.e;     // Catch: SSLPeerUnverifiedException -> L52
        r17.getClass();     // Catch: SSLPeerUnverifiedException -> L52
        r16.getClass();     // Catch: SSLPeerUnverifiedException -> L52
        List r18 = r16.a();     // Catch: SSLPeerUnverifiedException -> L52
        r6.getClass();     // Catch: SSLPeerUnverifiedException -> L52
        r18.getClass();     // Catch: SSLPeerUnverifiedException -> L52
        Iterator r19 = r17.a.iterator();     // Catch: SSLPeerUnverifiedException -> L52
        if (r19.hasNext() == true) goto L49;
        return true;
    L49:
        r19.next().getClass();     // Catch: SSLPeerUnverifiedException -> L52
        throw new ClassCastException();     // Catch: SSLPeerUnverifiedException -> L52
        goto L51
    L39:
        if (this.n == true) goto L51;
        if (r16 == null) goto L51;
        List r20 = r16.a();
        if (r20.isEmpty() == true) goto L51;
        Object r21 = r20.get(0);
        r21.getClass();
        if (m83.c(r6, (X509Certificate) r21) == false) goto L51;
        goto L51
    }

    public final boolean g(boolean r10) {
        tl1 r0 = ze5.a;
        long r1 = System.nanoTime();
        Socket r2 = this.e;
        r2.getClass();
        Socket r3 = this.f;
        r3.getClass();
        fw r4 = this.i;
        r4.getClass();
        if (r2.isClosed() == false) goto L5;
    L52:
        return false;
    L5:
        if (r3.isClosed() == true) goto L52;
        if (r3.isInputShutdown() == true) goto L52;
        if (r3.isOutputShutdown() == true) goto L52;
        rq1 r5 = this.l;
        if (r5 == null) goto L31;
        monitor-enter(r5);
    L25:
        th = move-exception;
        throw th;
    L15:
        if (r5.s == false) goto L19;
        monitor-exit(r5);
        return false;
    L19:
        if (r5.A >= r5.z) goto L27;
        if (r1 < r5.B) goto L27;
        monitor-exit(r5);
        return false;
    L27:
        monitor-exit(r5);
        return true;
    L31:
        monitor-enter(this);
        long r6 = r1 - this.t;
        monitor-exit(this);
        if (r6 < 10000000000L) goto L48;
        if (r10 == false) goto L48;
        int r9 = r3.getSoTimeout();     // Catch: SocketTimeoutException -> L46 IOException -> L53
        r3.setSoTimeout(1);     // Catch: Throwable -> L43
        boolean r11 = !r4.l();
        r3.setSoTimeout(r9);     // Catch: SocketTimeoutException -> L46 IOException -> L53
        return r11;
    L43:
        th = move-exception;
        r3.setSoTimeout(r9);     // Catch: SocketTimeoutException -> L46 IOException -> L53
        throw th;     // Catch: SocketTimeoutException -> L46 IOException -> L53
    L47:
        return true;
    L61:
        return false;
    L48:
        return true;
    L49:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q21
    public final o34 h() {
        return this.d;
    }

    public final void i() {
        this.t = System.nanoTime();
        pr3 r0 = this.h;
        if (r0 != pr3.s) goto L5;
    L8:
        Socket r1 = this.f;
        r1.getClass();
        fw r2 = this.i;
        r2.getClass();
        ew r3 = this.j;
        r3.getClass();
        r1.setSoTimeout(0);
        r81 r4 = r81.a;
        lv4 r5 = new lv4(this.b);
        String r6 = this.d.a.h.d;
        r6.getClass();
        r5.o = r1;
        r5.p = ze5.c + ' ' + r6;
        r5.q = r2;
        r5.r = r3;
        r5.s = this;
        r5.t = r4;
        rq1 r7 = new rq1(r5);
        this.l = r7;
        pb4 r8 = rq1.M;
        if ((r8.a & 16) == 0) goto L11;
        int r9 = r8.b[4];
    L12:
        this.r = r9;
        zq1 r10 = r7.J;
        monitor-enter(r10);
    L19:
        th = move-exception;
        throw th;
    L15:
        if (r10.q == true) goto L57;
        Logger r11 = zq1.s;     // Catch: Throwable -> L19
        if (r11.isLoggable(Level.FINE) == false) goto L21;
        r11.fine(ze5.d(">> CONNECTION " + iq1.a.e(), new Object[0]));     // Catch: Throwable -> L19
    L21:
        r10.n.A(iq1.a);     // Catch: Throwable -> L19
        r10.n.flush();     // Catch: Throwable -> L19
        monitor-exit(r10);
        zq1 r12 = r7.J;
        pb4 r13 = r7.D;
        monitor-enter(r12);
        r13.getClass();     // Catch: Throwable -> L42
        if (r12.q == true) goto L53;
        r12.j(0, Integer.bitCount(r13.a) * 6, 4, 0);     // Catch: Throwable -> L42
        int r14 = 0;
    L29:
        if (r14 >= 10) goto L45;
        boolean r15 = true;
        if (((1 << r14) & r13.a) != 0) goto L34;
        r15 = false;
    L34:
        if (r15 == false) goto L44;
        if (r14 != 4) goto L37;
        int r16 = 3;
    L41:
        r12.n.writeShort(r16);     // Catch: Throwable -> L42
        r12.n.writeInt(r13.b[r14]);     // Catch: Throwable -> L42
        goto L44
    L37:
        if (r14 == 7) goto L39;
        r16 = r14;
        goto L41
    L39:
        r16 = 4;
    L44:
        r14 = r14 + 1;     // Catch: Throwable -> L42
        goto L29
    L45:
        r12.n.flush();     // Catch: Throwable -> L42
        monitor-exit(r12);
        int r17 = r7.D.a();
        if (r17 == 65535) goto L50;
        r7.J.v(0, r17 - 65535);
    L50:
        fr4.c(r7.t.e(), r7.p, r7.K);
        return;
    L53:
        throw new IOException("closed");     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        throw th;
    L57:
        throw new IOException("closed");     // Catch: Throwable -> L19
    L11:
        r9 = Integer.MAX_VALUE;
        goto L12
    L5:
        if (r0 == pr3.t) goto L8;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Connection{");
        o34 r1 = this.d;
        r0.append(r1.a.h.d);
        r0.append(':');
        r0.append(r1.a.h.e);
        r0.append(", proxy=");
        r0.append(r1.b);
        r0.append(" hostAddress=");
        r0.append(r1.c);
        r0.append(" cipherSuite=");
        jl1 r2 = this.g;
        if (r2 == null) goto L5;
        Object r3 = r2.b;
    L6:
        r0.append(r3);
        r0.append(" protocol=");
        r0.append(this.h);
        r0.append('}');
        return r0.toString();
    L5:
        r3 = "none";
        goto L6
    }
}
