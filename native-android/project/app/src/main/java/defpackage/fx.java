package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fx {
    public static final String k = null;
    public static final String l = null;
    public final gr1 a;
    public final tl1 b;
    public final String c;
    public final pr3 d;
    public final int e;
    public final String f;
    public final tl1 g;
    public final jl1 h;
    public final long i;
    public final long j;

    static {
        qg3 r0 = qg3.a;
        qg3.a.getClass();
        k = "OkHttp-Sent-Millis";
        qg3.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public fx(ej4 r13) {
        r13.getClass();
        xu3 r1 = new xu3(r13);     // Catch: Throwable -> L12
        String r4 = r1.t(Long.MAX_VALUE);     // Catch: Throwable -> L12
        fr1 r6 = new fr1();     // Catch: IllegalArgumentException -> L7 Throwable -> L12
        r6.e(null, r4);     // Catch: IllegalArgumentException -> L7 Throwable -> L12
        gr1 r7 = r6.b();     // Catch: IllegalArgumentException -> L7 Throwable -> L12
    L8:
        if (r7 == null) goto L38;
        this.a = r7;     // Catch: Throwable -> L12
        this.c = r1.t(Long.MAX_VALUE);     // Catch: Throwable -> L12
        sl1 r0 = new sl1();     // Catch: Throwable -> L12
        int r5 = si0.H(r1);     // Catch: Throwable -> L12
        int r8 = 0;
    L10:
        if (r8 >= r5) goto L14;
        r0.b(r1.t(Long.MAX_VALUE));     // Catch: Throwable -> L12
        r8 = r8 + 1;     // Catch: Throwable -> L12
        goto L10
    L14:
        this.b = r0.c();     // Catch: Throwable -> L12
        ue1 r2 = hw.C(r1.t(Long.MAX_VALUE));     // Catch: Throwable -> L12
        this.d = (pr3) r2.p;     // Catch: Throwable -> L12
        this.e = r2.o;     // Catch: Throwable -> L12
        this.f = (String) r2.q;     // Catch: Throwable -> L12
        sl1 r3 = new sl1();     // Catch: Throwable -> L12
        int r9 = si0.H(r1);     // Catch: Throwable -> L12
        int r10 = 0;
    L15:
        if (r10 >= r9) goto L17;
        r3.b(r1.t(Long.MAX_VALUE));     // Catch: Throwable -> L12
        r10 = r10 + 1;     // Catch: Throwable -> L12
        goto L15
    L17:
        String r11 = k;     // Catch: Throwable -> L12
        String r12 = r3.d(r11);     // Catch: Throwable -> L12
        String r14 = l;     // Catch: Throwable -> L12
        String r15 = r3.d(r14);     // Catch: Throwable -> L12
        r3.e(r11);     // Catch: Throwable -> L12
        r3.e(r14);     // Catch: Throwable -> L12
        long r16 = 0;
        if (r12 == null) goto L20;
        long r17 = Long.parseLong(r12);     // Catch: Throwable -> L12
    L21:
        this.i = r17;     // Catch: Throwable -> L12
        if (r15 == null) goto L24;
        r16 = Long.parseLong(r15);     // Catch: Throwable -> L12
    L24:
        this.j = r16;     // Catch: Throwable -> L12
        this.g = r3.c();     // Catch: Throwable -> L12
        if (this.a.f() == false) goto L35;
        String r18 = r1.t(Long.MAX_VALUE);     // Catch: Throwable -> L12
        if (r18.length() > 0) goto L34;
        v20 r19 = v20.b.u(r1.t(Long.MAX_VALUE));     // Catch: Throwable -> L12
        List r20 = a(r1);     // Catch: Throwable -> L12
        List r21 = a(r1);     // Catch: Throwable -> L12
        if (r1.l() == true) goto L31;
        xi4 r22 = mu4.o;     // Catch: Throwable -> L12
        String r23 = r1.t(Long.MAX_VALUE);     // Catch: Throwable -> L12
        r22.getClass();     // Catch: Throwable -> L12
        mu4 r24 = xi4.m(r23);     // Catch: Throwable -> L12
    L32:
        this.h = new jl1(r24, r19, ze5.k(r21), new hl1(ze5.k(r20), 0));     // Catch: Throwable -> L12
    L36:
        r13.close();
        return;
    L31:
        r24 = mu4.t;     // Catch: Throwable -> L12
        goto L32
    L34:
        throw new IOException("expected \"\" but was \"" + r18 + '\"');     // Catch: Throwable -> L12
    L35:
        this.h = null;     // Catch: Throwable -> L12
        goto L36
    L20:
        r17 = 0;
        goto L21
    L38:
        IOException r110 = new IOException("Cache corruption for ".concat(r4));     // Catch: Throwable -> L12
        qg3 r25 = qg3.a;     // Catch: Throwable -> L12
        qg3.a.getClass();     // Catch: Throwable -> L12
        qg3.i("cache corruption", 5, r110);     // Catch: Throwable -> L12
        throw r110;     // Catch: Throwable -> L12
    L7:
        r7 = null;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        q05.h(r13, th);
        throw th;
    }

    public static List a(xu3 r8) {
        int r0 = si0.H(r8);
        if (r0 == (-1)) goto L5;
        CertificateFactory r1 = CertificateFactory.getInstance("X.509");     // Catch: CertificateException -> L14
        ArrayList r2 = new ArrayList(r0);     // Catch: CertificateException -> L14
        int r4 = 0;
    L7:
        if (r4 >= r0) goto L13;
        String r5 = r8.t(Long.MAX_VALUE);     // Catch: CertificateException -> L14
        tv r6 = new tv();     // Catch: CertificateException -> L14
        yw r7 = yw.q;     // Catch: CertificateException -> L14
        yw r9 = pa.r(r5);     // Catch: CertificateException -> L14
        if (r9 == null) goto L12;
        r6.X(r9);     // Catch: CertificateException -> L14
        r2.add(r1.generateCertificate(new rv(r6, 0)));     // Catch: CertificateException -> L14
        r4 = r4 + 1;     // Catch: CertificateException -> L14
        goto L7
    L12:
        throw new IOException("Corrupt certificate in cache entry");     // Catch: CertificateException -> L14
    L13:
        return r2;
    L14:
        e = move-exception;
        mj0.i(e.getMessage());
        return null;
    L5:
        return u01.n;
    }

    public static void b(wu3 r3, List r4) {
        r3.Q(r4.size());     // Catch: CertificateEncodingException -> L8
        r3.writeByte(10);     // Catch: CertificateEncodingException -> L8
        Iterator r5 = r4.iterator();     // Catch: CertificateEncodingException -> L8
    L4:
        if (r5.hasNext() == false) goto L7;
        byte[] r1 = ((Certificate) r5.next()).getEncoded();     // Catch: CertificateEncodingException -> L8
        yw r2 = yw.q;     // Catch: CertificateEncodingException -> L8
        r1.getClass();     // Catch: CertificateEncodingException -> L8
        r3.y(pa.A(r1).a());     // Catch: CertificateEncodingException -> L8
        r3.writeByte(10);     // Catch: CertificateEncodingException -> L8
        goto L4
    L7:
        return;
    L8:
        e = move-exception;
        mj0.i(e.getMessage());
    }

    public final void c(ll r12) {
        gr1 r0 = this.a;
        jl1 r1 = this.h;
        tl1 r2 = this.g;
        tl1 r3 = this.b;
        int r4 = 0;
        wu3 r5 = new wu3(r12.i(0));
        r5.y(r0.i);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r5.y(this.c);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r5.Q(r3.size());     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        int r6 = r3.size();     // Catch: Throwable -> L8
        int r7 = 0;
    L6:
        if (r7 >= r6) goto L10;
        r5.y(r3.b(r7));     // Catch: Throwable -> L8
        r5.y(": ");     // Catch: Throwable -> L8
        r5.y(r3.e(r7));     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r7 = r7 + 1;     // Catch: Throwable -> L8
        goto L6
    L10:
        pr3 r8 = this.d;     // Catch: Throwable -> L8
        int r9 = this.e;     // Catch: Throwable -> L8
        String r10 = this.f;     // Catch: Throwable -> L8
        r8.getClass();     // Catch: Throwable -> L8
        r10.getClass();     // Catch: Throwable -> L8
        StringBuilder r11 = new StringBuilder();     // Catch: Throwable -> L8
        if (r8 != pr3.p) goto L13;
        r11.append("HTTP/1.0");     // Catch: Throwable -> L8
    L14:
        r11.append(' ');     // Catch: Throwable -> L8
        r11.append(r9);     // Catch: Throwable -> L8
        r11.append(' ');     // Catch: Throwable -> L8
        r11.append(r10);     // Catch: Throwable -> L8
        r5.y(r11.toString());     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r5.Q(r2.size() + 2);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        int r13 = r2.size();     // Catch: Throwable -> L8
    L15:
        if (r4 >= r13) goto L17;
        r5.y(r2.b(r4));     // Catch: Throwable -> L8
        r5.y(": ");     // Catch: Throwable -> L8
        r5.y(r2.e(r4));     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
        goto L15
    L17:
        r5.y(k);     // Catch: Throwable -> L8
        r5.y(": ");     // Catch: Throwable -> L8
        r5.Q(this.i);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        r5.y(l);     // Catch: Throwable -> L8
        r5.y(": ");     // Catch: Throwable -> L8
        r5.Q(this.j);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        if (r0.f() == false) goto L20;
        r5.writeByte(10);     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        r5.y(r1.b.a);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
        b(r5, r1.a());     // Catch: Throwable -> L8
        b(r5, r1.c);     // Catch: Throwable -> L8
        r5.y(r1.a.n);     // Catch: Throwable -> L8
        r5.writeByte(10);     // Catch: Throwable -> L8
    L20:
        r5.close();
        return;
    L13:
        r11.append("HTTP/1.1");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        q05.h(r5, th);
        throw th;
    }

    public fx(k14 r10) {
        oz3 r0 = r10.n;
        this.a = r0.a;
        k14 r1 = r10.u;
        r1.getClass();
        tl1 r2 = r1.n.c;
        tl1 r3 = r10.s;
        Set r4 = si0.U(r3);
        if (r4.isEmpty() == false) goto L5;
        tl1 r5 = ze5.a;
    L12:
        this.b = r5;
        this.c = r0.b;
        this.d = r10.o;
        this.e = r10.q;
        this.f = r10.p;
        this.g = r3;
        this.h = r10.r;
        this.i = r10.x;
        this.j = r10.y;
        return;
    L5:
        sl1 r6 = new sl1();
        int r7 = r2.size();
        int r8 = 0;
    L6:
        if (r8 >= r7) goto L11;
        String r9 = r2.b(r8);
        if (r4.contains(r9) == false) goto L10;
        r6.a(r9, r2.e(r8));
    L10:
        r8 = r8 + 1;
        goto L6
    L11:
        r5 = r6.c();
        goto L12
    }
}
