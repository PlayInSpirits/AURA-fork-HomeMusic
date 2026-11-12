package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o83 implements fy {
    public static final List F = null;
    public static final List G = null;
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

    static {
        F = ze5.f(new pr3[]{pr3.s, pr3.q});
        G = ze5.f(new ma0[]{ma0.e, ma0.f});
    }

    public o83(n83 r11) {
        this.a = r11.a;
        this.b = ze5.k(r11.c);
        this.c = ze5.k(r11.d);
        this.d = r11.e;
        boolean r6 = r11.f;
        this.e = r6;
        boolean r7 = r11.g;
        this.f = r7;
        this.g = r11.h;
        this.h = r11.i;
        this.i = r11.j;
        this.j = r11.k;
        this.k = r11.l;
        this.l = r11.m;
        ProxySelector r0 = r11.n;
        if (r0 != null) goto L5;
        r0 = ProxySelector.getDefault();
    L5:
        if (r0 != null) goto L7;
        r0 = l73.a;
    L7:
        this.m = r0;
        this.n = r11.o;
        this.o = r11.p;
        List r1 = r11.s;
        this.r = r1;
        this.s = r11.t;
        this.t = r11.u;
        this.w = r11.x;
        int r4 = r11.y;
        this.x = r4;
        int r2 = r11.z;
        this.y = r2;
        int r3 = r11.A;
        this.z = r3;
        this.A = r11.B;
        this.B = r11.C;
        rm2 r5 = r11.D;
        if (r5 != null) goto L10;
        r5 = new rm2(14);
    L10:
        rm2 r8 = r5;
        this.C = r8;
        gr4 r9 = r11.E;
        if (r9 != null) goto L13;
        r9 = gr4.l;
    L13:
        this.D = r9;
        d34 r10 = r11.b;
        if (r10 != null) goto L16;
        r10 = new d34(r2, r3, r4, r2, r6, r7, r8);
        r11.b = r10;
    L16:
        this.E = r10;
        if (r1 != null) goto L19;
    L21:
        Iterator r12 = r1.iterator();
    L23:
        if (r12.hasNext() == false) goto L38;
        if (((ma0) r12.next()).a == false) goto L23;
        SSLSocketFactory r13 = r11.q;
        if (r13 == null) goto L33;
        this.p = r13;
        rr2 r14 = r11.w;
        r14.getClass();
        this.v = r14;
        X509TrustManager r15 = r11.r;
        r15.getClass();
        this.q = r15;
        o00 r16 = r11.v;
        r16.getClass();
        if (h12.c(r16.b, r14) == true) goto L32;
        r16 = new o00(r16.a, r14);
    L32:
        this.u = r16;
    L39:
        X509TrustManager r17 = this.q;
        rr2 r18 = this.v;
        SSLSocketFactory r19 = this.p;
        List r20 = this.c;
        List r21 = this.b;
        r21.getClass();
        if (r21.contains(null) == true) goto L80;
        r20.getClass();
        if (r20.contains(null) == true) goto L78;
        List r22 = this.r;
        if (r22 != null) goto L46;
    L48:
        Iterator r23 = r22.iterator();
    L50:
        if (r23.hasNext() == false) goto L64;
        if (((ma0) r23.next()).a == false) goto L50;
        if (r19 == null) goto L61;
        if (r18 == null) goto L59;
        if (r17 != null) goto L88;
        kf2.o("x509TrustManager == null");
        throw null;
    L88:
        return;
    L59:
        kf2.o("certificateChainCleaner == null");
        throw null;
    L61:
        kf2.o("sslSocketFactory == null");
        throw null;
    L64:
        if (r19 != null) goto L76;
        if (r18 != null) goto L74;
        if (r17 == null) goto L68;
        kf2.o("Check failed.");
        throw null;
    L68:
        if (h12.c(this.u, o00.c) == false) goto L70;
        return;
    L70:
        kf2.o("Check failed.");
        throw null;
    L74:
        kf2.o("Check failed.");
        throw null;
    L76:
        kf2.o("Check failed.");
        throw null;
    L46:
        if (r22.isEmpty() == false) goto L48;
    L78:
        nz2.u(r20, "Null network interceptor: ");
        throw null;
    L80:
        nz2.u(r21, "Null interceptor: ");
        throw null;
    L33:
        qg3 r24 = qg3.a;
        X509TrustManager r25 = qg3.a.m();
        this.q = r25;
        this.p = qg3.a.l(r25);
        rr2 r26 = qg3.a.b(r25);
        this.v = r26;
        o00 r110 = r11.v;
        r110.getClass();
        if (h12.c(r110.b, r26) == true) goto L37;
        r110 = new o00(r110.a, r26);
    L37:
        this.u = r110;
    L38:
        this.p = null;
        this.v = null;
        this.q = null;
        this.u = o00.c;
        goto L39
    L19:
        if (r1.isEmpty() == false) goto L21;
        goto L21
    }

    public final n83 a() {
        n83 r0 = new n83();
        r0.a = this.a;
        r0.b = this.E;
        ArrayList r1 = r0.c;
        v40.n0(this.b, r1);
        ArrayList r2 = r0.d;
        v40.n0(this.c, r2);
        r0.e = this.d;
        r0.f = this.e;
        r0.g = this.f;
        r0.h = this.g;
        r0.i = this.h;
        r0.j = this.i;
        r0.k = this.j;
        r0.l = this.k;
        r0.m = this.l;
        r0.n = this.m;
        r0.o = this.n;
        r0.p = this.o;
        r0.q = this.p;
        r0.r = this.q;
        r0.s = this.r;
        r0.t = this.s;
        r0.u = this.t;
        r0.v = this.u;
        r0.w = this.v;
        r0.x = this.w;
        r0.y = this.x;
        r0.z = this.y;
        r0.A = this.z;
        r0.B = this.A;
        r0.C = this.B;
        r0.D = this.C;
        r0.E = this.D;
        return r0;
    }
}
