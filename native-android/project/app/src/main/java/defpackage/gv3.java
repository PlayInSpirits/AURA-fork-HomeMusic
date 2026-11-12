package defpackage;

import java.io.IOException;
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

    public gv3(gr4 gr4Var, dv3 dv3Var, int i, int i2, int i3, int i4, boolean z, boolean z2, f6 f6Var, rm2 rm2Var, hy hyVar) {
        gr4Var.getClass();
        dv3Var.getClass();
        f6Var.getClass();
        rm2Var.getClass();
        hyVar.getClass();
        this.n = gr4Var;
        this.o = dv3Var;
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = z;
        this.u = z2;
        this.v = f6Var;
        this.w = rm2Var;
        this.x = hyVar;
        this.B = new ii();
    }

    public final x90 a() throws IOException {
        String hostAddress;
        int port;
        List listF;
        boolean zContains;
        o34 o34Var = this.A;
        if (o34Var != null) {
            this.A = null;
            return b(o34Var, null);
        }
        x7 x7Var = this.y;
        if (x7Var != null && x7Var.o < ((ArrayList) x7Var.p).size()) {
            int i = x7Var.o;
            ArrayList arrayList = (ArrayList) x7Var.p;
            if (i >= arrayList.size()) {
                tb4.k();
                return null;
            }
            int i2 = x7Var.o;
            x7Var.o = i2 + 1;
            return b((o34) arrayList.get(i2), null);
        }
        s34 s34Var = this.z;
        if (s34Var == null) {
            s34Var = new s34(this.v, this.w, this.x, this.u);
            this.z = s34Var;
        }
        if (!s34Var.a()) {
            mj0.i("exhausted all routes");
            return null;
        }
        if (!s34Var.a()) {
            tb4.k();
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (s34Var.f < s34Var.e.size()) {
            f6 f6Var = s34Var.a;
            if (s34Var.f >= s34Var.e.size()) {
                throw new SocketException("No route to " + f6Var.h.d + "; exhausted proxy configurations: " + s34Var.e);
            }
            List list = s34Var.e;
            int i3 = s34Var.f;
            s34Var.f = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            hy hyVar = s34Var.c;
            ArrayList arrayList3 = new ArrayList();
            s34Var.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                gr1 gr1Var = f6Var.h;
                hostAddress = gr1Var.d;
                port = gr1Var.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    nz2.l(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                    return null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    hostAddress.getClass();
                } else {
                    hostAddress = address.getHostAddress();
                    hostAddress.getClass();
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                ux3 ux3Var = ue5.a;
                hostAddress.getClass();
                if (ue5.a.a(hostAddress)) {
                    listF = gb.O(InetAddress.getByName(hostAddress));
                } else {
                    hyVar.getClass();
                    f6Var.a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        allByName.getClass();
                        List listR0 = ti.r0(allByName);
                        if (listR0.isEmpty()) {
                            throw new UnknownHostException(f6Var.a + " returned no addresses for " + hostAddress);
                        }
                        listF = listR0;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                if (s34Var.d && listF.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listF) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = xe5.a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        qb2 qb2VarR = gb.r();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                qb2VarR.add(it.next());
                            }
                            if (it2.hasNext()) {
                                qb2VarR.add(it2.next());
                            }
                        }
                        listF = gb.f(qb2VarR);
                    }
                }
                Iterator it3 = listF.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = s34Var.g.iterator();
            while (it4.hasNext()) {
                o34 o34Var2 = new o34(s34Var.a, proxy, (InetSocketAddress) it4.next());
                rm2 rm2Var = s34Var.b;
                synchronized (rm2Var) {
                    zContains = ((LinkedHashSet) rm2Var.o).contains(o34Var2);
                }
                if (zContains) {
                    s34Var.h.add(o34Var2);
                } else {
                    arrayList2.add(o34Var2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            v40.n0(s34Var.h, arrayList2);
            s34Var.h.clear();
        }
        x7 x7Var2 = new x7(arrayList2);
        this.y = x7Var2;
        if (this.x.m()) {
            mj0.i("Canceled");
            return null;
        }
        if (x7Var2.o >= arrayList2.size()) {
            tb4.k();
            return null;
        }
        int i4 = x7Var2.o;
        x7Var2.o = i4 + 1;
        return b((o34) arrayList2.get(i4), arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    public final x90 b(o34 o34Var, ArrayList arrayList) throws UnknownServiceException {
        oz3 oz3Var;
        pr3 pr3Var = pr3.t;
        o34Var.getClass();
        f6 f6Var = o34Var.a;
        if (f6Var.c == null) {
            if (!f6Var.j.contains(ma0.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = o34Var.a.h.d;
            qg3 qg3Var = qg3.a;
            if (!qg3.a.h(str)) {
                throw new UnknownServiceException(xa3.h("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (f6Var.i.contains(pr3Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (o34Var.b.type() != Proxy.Type.HTTP) {
            oz3Var = null;
        } else {
            f6 f6Var2 = o34Var.a;
            if (f6Var2.c != null || f6Var2.i.contains(pr3Var)) {
                nz3 nz3Var = new nz3();
                gr1 gr1Var = o34Var.a.h;
                gr1Var.getClass();
                nz3Var.a = gr1Var;
                nz3Var.b("CONNECT", null);
                f6 f6Var3 = o34Var.a;
                nz3Var.a("Host", ze5.j(f6Var3.h, true));
                nz3Var.a("Proxy-Connection", "Keep-Alive");
                nz3Var.a("User-Agent", "okhttp/5.0.0-alpha.14");
                oz3Var = new oz3(nz3Var);
                fv3 fv3Var = xe5.e;
                gq1 gq1Var = gq1.q;
                sl1 sl1Var = new sl1();
                pr3 pr3Var2 = pr3.q;
                e35.G("Proxy-Authenticate");
                e35.H("OkHttp-Preemptive", "Proxy-Authenticate");
                sl1Var.e("Proxy-Authenticate");
                e35.p(sl1Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                new k14(oz3Var, pr3Var2, "Preemptive Authenticate", 407, null, sl1Var.c(), fv3Var, null, null, null, -1L, -1L, null, gq1Var);
                f6Var3.f.getClass();
            } else {
                oz3Var = null;
            }
        }
        return new x90(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.x, this, o34Var, arrayList, oz3Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x003b, B:22:0x0048, B:25:0x004f), top: B:51:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x003b, B:22:0x0048, B:25:0x004f), top: B:51:0x003b }] */
    public final c24 c(x90 x90Var, List list) {
        cv3 cv3Var;
        boolean z;
        Socket socketO;
        dv3 dv3Var = this.o;
        boolean zL = this.x.l();
        f6 f6Var = this.v;
        hy hyVar = this.x;
        boolean z2 = x90Var != null && x90Var.c();
        dv3Var.getClass();
        f6Var.getClass();
        hyVar.getClass();
        Iterator it = dv3Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                cv3Var = null;
                break;
            }
            cv3Var = (cv3) it.next();
            cv3Var.getClass();
            synchronized (cv3Var) {
                if (z2) {
                    try {
                        if (!(cv3Var.l != null)) {
                            z = false;
                        } else if (cv3Var.f(f6Var, list)) {
                            hyVar.a(cv3Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (cv3Var.f(f6Var, list)) {
                    z = false;
                } else {
                    hyVar.a(cv3Var);
                    z = true;
                }
            }
            if (z) {
                if (cv3Var.g(zL)) {
                    break;
                }
                synchronized (cv3Var) {
                    cv3Var.m = true;
                    socketO = hyVar.o();
                }
                if (socketO != null) {
                    ze5.c(socketO);
                }
            }
        }
        if (cv3Var == null) {
            return null;
        }
        if (x90Var != null) {
            this.A = x90Var.j;
            Socket socket = x90Var.q;
            if (socket != null) {
                ze5.c(socket);
            }
        }
        this.x.e(cv3Var);
        this.x.f(cv3Var);
        return new c24(cv3Var);
    }

    @Override // defpackage.r34
    public final boolean f(gr1 gr1Var) {
        gr1Var.getClass();
        gr1 gr1Var2 = this.v.h;
        return gr1Var.e == gr1Var2.e && h12.c(gr1Var.d, gr1Var2.d);
    }

    @Override // defpackage.r34
    public final boolean isCanceled() {
        return this.x.m();
    }

    @Override // defpackage.r34
    public final boolean m(cv3 cv3Var) {
        s34 s34Var;
        o34 o34Var;
        if (this.B.isEmpty() && this.A == null) {
            if (cv3Var != null) {
                synchronized (cv3Var) {
                    o34Var = null;
                    if (cv3Var.o == 0 && cv3Var.m && ze5.a(cv3Var.d.a.h, this.v.h)) {
                        o34Var = cv3Var.d;
                    }
                }
                if (o34Var != null) {
                    this.A = o34Var;
                    return true;
                }
            }
            x7 x7Var = this.y;
            if ((x7Var == null || x7Var.o >= ((ArrayList) x7Var.p).size()) && (s34Var = this.z) != null) {
                return s34Var.a();
            }
        }
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
        boolean z;
        Socket socketO;
        c24 c24Var;
        cv3 cv3VarC = this.x.c();
        if (cv3VarC == null) {
            c24Var = null;
        } else {
            boolean zG = cv3VarC.g(this.x.l());
            synchronized (cv3VarC) {
                boolean z2 = cv3VarC.m;
                try {
                    if (!zG) {
                        z = !z2;
                        cv3VarC.m = true;
                        socketO = this.x.o();
                    } else if (z2 || !f(cv3VarC.d.a.h)) {
                        z = false;
                        socketO = this.x.o();
                    } else {
                        z = false;
                        socketO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.x.c() == null) {
                if (socketO != null) {
                    ze5.c(socketO);
                }
                this.x.getClass();
                this.x.getClass();
                if (socketO != null || z) {
                    this.x.getClass();
                }
                c24Var = null;
            } else {
                if (socketO != null) {
                    kf2.o("Check failed.");
                    return null;
                }
                c24Var = new c24(cv3VarC);
            }
        }
        if (c24Var != null) {
            return c24Var;
        }
        c24 c24VarC = c(null, null);
        if (c24VarC != null) {
            return c24VarC;
        }
        if (!this.B.isEmpty()) {
            return (q34) this.B.removeFirst();
        }
        x90 x90VarA = a();
        c24 c24VarC2 = c(x90VarA, x90VarA.k);
        return c24VarC2 != null ? c24VarC2 : x90VarA;
    }
}
