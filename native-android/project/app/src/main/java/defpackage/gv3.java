package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gv3 implements r34 {
    public o34 A;
    public final ii B;
    public final gr4 n;
    public final dv3 o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final f6 v;
    public final rm2 w;
    public final hy x;
    public x7 y;
    public s34 z;

    public gv3(gr4 r1, dv3 r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, f6 r9, rm2 r10, hy r11) {
        r1.getClass();
        r2.getClass();
        r9.getClass();
        r10.getClass();
        r11.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        this.w = r10;
        this.x = r11;
        this.B = new ii();
    }

    public final x90 a() {
        o34 r0 = this.A;
        if (r0 == null) goto L6;
        this.A = null;
        return b(r0, null);
    L6:
        x7 r1 = this.y;
        if (r1 != null) goto L9;
    L16:
        s34 r2 = this.z;
        if (r2 != null) goto L20;
        r2 = new s34(this.v, this.w, this.x, this.u);
        this.z = r2;
    L20:
        if (r2.a() == true) goto L22;
        mj0.i("exhausted all routes");
        return null;
    L22:
        if (r2.a() == false) goto L130;
        ArrayList r3 = new ArrayList();
    L25:
        if (r2.f >= r2.e.size()) goto L118;
        f6 r4 = r2.a;
        if (r2.f >= r2.e.size()) goto L116;
        List r5 = r2.e;
        int r6 = r2.f;
        r2.f = r6 + 1;
        Proxy r7 = (Proxy) r5.get(r6);
        hy r8 = r2.c;
        ArrayList r9 = new ArrayList();
        r2.g = r9;
        if (r7.type() != Proxy.Type.DIRECT) goto L31;
    L42:
        gr1 r10 = r4.h;
        String r11 = r10.d;
        int r12 = r10.e;
    L44:
        if (1 > r12) goto L114;
        if (r12 >= 65536) goto L114;
        if (r7.type() != Proxy.Type.SOCKS) goto L50;
        r9.add(InetSocketAddress.createUnresolved(r11, r12));
    L92:
        Iterator r13 = r2.g.iterator();
    L94:
        if (r13.hasNext() == false) goto L106;
        o34 r14 = new o34(r2.a, r7, (InetSocketAddress) r13.next());
        rm2 r15 = r2.b;
        monitor-enter(r15);
        boolean r16 = ((LinkedHashSet) r15.o).contains(r14);     // Catch: Throwable -> L102
        monitor-exit(r15);
        if (r16 == true) goto L100;
        r3.add(r14);
        goto L94
    L100:
        r2.h.add(r14);
    L102:
        th = move-exception;
        throw th;
    L106:
        if (r3.isEmpty() == true) goto L25;
    L50:
        ux3 r17 = ue5.a;
        r11.getClass();
        if (ue5.a.a(r11) == false) goto L53;
        List r18 = gb.O(InetAddress.getByName(r11));
    L59:
        if (r2.d == true) goto L61;
    L88:
        Iterator r19 = r18.iterator();
    L90:
        if (r19.hasNext() == false) goto L92;
        r9.add(new InetSocketAddress((InetAddress) r19.next(), r12));
        goto L90
    L61:
        if (r18.size() < 2) goto L88;
        ArrayList r20 = new ArrayList();
        ArrayList r21 = new ArrayList();
        Iterator r22 = r18.iterator();
    L65:
        if (r22.hasNext() == false) goto L71;
        Object r110 = r22.next();
        if ((((InetAddress) r110) instanceof Inet6Address) == true) goto L68;
        r21.add(r110);
        goto L65
    L68:
        r20.add(r110);
        goto L65
    L71:
        if (r20.isEmpty() == true) goto L88;
        if (r21.isEmpty() == true) goto L88;
        byte[] r23 = xe5.a;
        Iterator r24 = r20.iterator();
        Iterator r25 = r21.iterator();
        qb2 r26 = gb.r();
    L77:
        if (r24.hasNext() == true) goto L83;
        if (r25.hasNext() == true) goto L83;
        r18 = gb.f(r26);
    L83:
        if (r24.hasNext() == false) goto L86;
        r26.add(r24.next());
    L86:
        if (r25.hasNext() == false) goto L77;
        r26.add(r25.next());
        goto L77
    L53:
        r8.getClass();
        r4.a.getClass();
        InetAddress[] r27 = InetAddress.getAllByName(r11);     // Catch: NullPointerException -> L110
        r27.getClass();     // Catch: NullPointerException -> L110
        List r28 = ti.r0(r27);     // Catch: NullPointerException -> L110
        if (r28.isEmpty() == true) goto L109;
        r18 = r28;
        goto L59
    L109:
        throw new UnknownHostException(r4.a + " returned no addresses for " + r11);
    L110:
        e = move-exception;
        UnknownHostException r29 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(r11));
        r29.initCause(e);
        throw r29;
    L114:
        throw new SocketException("No route to " + r11 + ':' + r12 + "; port is out of range");
    L31:
        if (r7.type() == Proxy.Type.SOCKS) goto L42;
        SocketAddress r30 = r7.address();
        if ((r30 instanceof InetSocketAddress) == false) goto L40;
        InetSocketAddress r31 = (InetSocketAddress) r30;
        InetAddress r32 = r31.getAddress();
        if (r32 != null) goto L38;
        r11 = r31.getHostName();
        r11.getClass();
    L39:
        r12 = r31.getPort();
        goto L44
    L38:
        r11 = r32.getHostAddress();
        r11.getClass();
        goto L39
    L40:
        nz2.l(r30.getClass(), "Proxy.address() is not an InetSocketAddress: ");
        return null;
    L116:
        throw new SocketException("No route to " + r4.h.d + "; exhausted proxy configurations: " + r2.e);
    L118:
        if (r3.isEmpty() == false) goto L120;
        v40.n0(r2.h, r3);
        r2.h.clear();
    L120:
        x7 r33 = new x7(r3);
        this.y = r33;
        if (this.x.m() == false) goto L123;
        mj0.i("Canceled");
        return null;
    L123:
        if (r33.o >= r3.size()) goto L126;
        int r34 = r33.o;
        r33.o = r34 + 1;
        return b((o34) r3.get(r34), r3);
    L126:
        tb4.k();
        return null;
    L130:
        tb4.k();
        return null;
    L9:
        if (r1.o >= ((ArrayList) r1.p).size()) goto L16;
        int r35 = r1.o;
        ArrayList r36 = (ArrayList) r1.p;
        if (r35 >= r36.size()) goto L14;
        int r37 = r1.o;
        r1.o = r37 + 1;
        return b((o34) r36.get(r37), null);
    L14:
        tb4.k();
        return null;
    }

    public final x90 b(o34 r29, ArrayList r30) {
        pr3 r0 = pr3.t;
        r29.getClass();
        f6 r1 = r29.a;
        if (r1.c != null) goto L14;
        if (r1.j.contains(ma0.f) == false) goto L12;
        String r2 = r29.a.h.d;
        qg3 r3 = qg3.a;
        if (qg3.a.h(r2) == true) goto L16;
        throw new UnknownServiceException(xa3.h("CLEARTEXT communication to ", r2, " not permitted by network security policy"));
    L16:
        if (r29.b.type() != Proxy.Type.HTTP) goto L23;
        f6 r4 = r29.a;
        if (r4.c == null) goto L21;
    L24:
        nz3 r5 = new nz3();
        gr1 r6 = r29.a.h;
        r6.getClass();
        r5.a = r6;
        r5.b("CONNECT", null);
        f6 r7 = r29.a;
        r5.a("Host", ze5.j(r7.h, true));
        r5.a("Proxy-Connection", "Keep-Alive");
        r5.a("User-Agent", "okhttp/5.0.0-alpha.14");
        oz3 r12 = new oz3(r5);
        fv3 r18 = xe5.e;
        gq1 r27 = gq1.q;
        sl1 r8 = new sl1();
        pr3 r13 = pr3.q;
        e35.G("Proxy-Authenticate");
        e35.H("OkHttp-Preemptive", "Proxy-Authenticate");
        r8.e("Proxy-Authenticate");
        e35.p(r8, "Proxy-Authenticate", "OkHttp-Preemptive");
        new k14(r12, r13, "Preemptive Authenticate", 407, null, r8.c(), r18, null, null, null, -1, -1, null, r27);
        r7.f.getClass();
    L26:
        return new x90(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.x, this, r29, r30, r12, -1, false);
    L21:
        if (r4.i.contains(r0) == true) goto L24;
    L23:
        r12 = null;
        goto L26
    L12:
        throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
    L14:
        if (r1.i.contains(r0) == false) goto L16;
        throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
    }

    public final c24 c(x90 r11, List r12) {
        dv3 r0 = this.o;
        boolean r1 = this.x.l();
        f6 r2 = this.v;
        hy r3 = this.x;
        if (r11 != null) goto L5;
    L7:
        boolean r6 = false;
    L8:
        r0.getClass();
        r2.getClass();
        r3.getClass();
        Iterator r4 = r0.f.iterator();
    L10:
        if (r4.hasNext() == false) goto L42;
        cv3 r7 = (cv3) r4.next();
        r7.getClass();
        monitor-enter(r7);
        if (r6 == false) goto L23;
        if (r7.l == null) goto L17;
        boolean r9 = true;
    L18:
        if (r9 == true) goto L23;
    L19:
        boolean r10 = false;
    L27:
        monitor-exit(r7);
        if (r10 == false) goto L10;
        if (r7.g(r1) == true) goto L43;
        monitor-enter(r7);
        r7.m = true;     // Catch: Throwable -> L37
        Socket r8 = r3.o();     // Catch: Throwable -> L37
        monitor-exit(r7);
        if (r8 == null) goto L10;
        ze5.c(r8);
    L37:
        th = move-exception;
        throw th;
    L43:
        if (r7 != null) goto L45;
        return null;
    L45:
        if (r11 == null) goto L49;
        this.A = r11.j;
        Socket r13 = r11.q;
        if (r13 == null) goto L49;
        ze5.c(r13);
    L49:
        this.x.e(r7);
        this.x.f(r7);
        return new c24(r7);
    L17:
        r9 = false;
    L20:
        th = move-exception;
        throw th;
    L23:
        if (r7.f(r2, r12) == false) goto L19;
        r3.a(r7);     // Catch: Throwable -> L20
        r10 = true;
        goto L27
    L42:
        r7 = null;
        goto L43
    L5:
        if (r11.c() == false) goto L7;
        r6 = true;
        goto L8
    }

    @Override // defpackage.r34
    public final boolean f(gr1 r3) {
        r3.getClass();
        gr1 r2 = this.v.h;
        if (r3.e == r2.e) goto L5;
        return false;
    L5:
        if (h12.c(r3.d, r2.d) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.r34
    public final boolean isCanceled() {
        return this.x.m();
    }

    @Override // defpackage.r34
    public final boolean m(cv3 r5) {
        if (this.B.isEmpty() == true) goto L6;
    L34:
        return true;
    L6:
        if (this.A != null) goto L34;
        if (r5 == null) goto L27;
        monitor-enter(r5);
        o34 r2 = null;
        if (r5.o == 0) goto L14;
    L20:
        monitor-exit(r5);
        if (r2 == null) goto L27;
        this.A = r2;
        return true;
    L14:
        if (r5.m == false) goto L20;
        if (ze5.a(r5.d.a.h, this.v.h) == false) goto L20;
        r2 = r5.d;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        throw th;
    L27:
        x7 r6 = this.y;
        if (r6 != null) goto L30;
    L32:
        s34 r4 = this.z;
        if (r4 == null) goto L34;
        return r4.a();
    L30:
        if (r6.o >= ((ArrayList) r6.p).size()) goto L32;
        return true;
    }

    @Override // defpackage.r34
    public final f6 n() {
        return this.v;
    }

    @Override // defpackage.r34
    public final ii v() {
        return this.B;
    }

    @Override // defpackage.r34
    public final q34 w() {
        cv3 r0 = this.x.c();
        if (r0 != null) goto L5;
    L4:
        c24 r2 = null;
    L35:
        if (r2 == null) goto L37;
        return r2;
    L37:
        c24 r1 = c(null, null);
        if (r1 == null) goto L41;
        return r1;
    L41:
        if (this.B.isEmpty() == false) goto L43;
        x90 r3 = a();
        c24 r6 = c(r3, r3.k);
        if (r6 == null) goto L47;
        return r6;
    L47:
        return r3;
    L43:
        return (q34) this.B.removeFirst();
    L5:
        boolean r4 = r0.g(this.x.l());
        monitor-enter(r0);
        boolean r5 = r0.m;
        if (r4 == true) goto L14;
        boolean r7 = !r5;
        r0.m = true;     // Catch: Throwable -> L11
        Socket r8 = this.x.o();     // Catch: Throwable -> L11
    L21:
        monitor-exit(r0);
        if (this.x.c() == null) goto L28;
        if (r8 != null) goto L26;
        r2 = new c24(r0);
        goto L35
    L26:
        kf2.o("Check failed.");
        return null;
    L28:
        if (r8 == null) goto L30;
        ze5.c(r8);
    L30:
        this.x.getClass();
        this.x.getClass();
        if (r8 == null) goto L33;
        this.x.getClass();
        goto L4
    L33:
        if (r7 == false) goto L4;
        this.x.getClass();
        goto L4
    L14:
        if (r5 == true) goto L20;
        if (f(r0.d.a.h) == false) goto L20;
        r7 = false;
        r8 = null;
    L20:
        r7 = false;
        r8 = this.x.o();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }
}
