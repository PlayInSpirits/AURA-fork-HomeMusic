package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends bq1 {
    public final gr1 q;
    public long r;
    public boolean s;
    public final /* synthetic */ hq1 t;

    public dq1(hq1 r1, gr1 r2) {
        r2.getClass();
        this.t = r1;
        super(r1);
        this.q = r2;
        this.r = -1;
        this.s = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o == false) goto L6;
        return;
    L6:
        if (this.s == false) goto L13;
        tl1 r0 = ze5.a;
        TimeUnit.MILLISECONDS.getClass();
        boolean r1 = ze5.h(this, 100);     // Catch: IOException -> L10
    L11:
        if (r1 == true) goto L13;
        ((q21) this.t.c).a();
        b();
    L10:
        r1 = false;
    L13:
        this.o = true;
    }

    @Override // defpackage.bq1, defpackage.ej4
    public final long read(tv r12, long r13) {
        hq1 r0 = this.t;
        fw r1 = (fw) r0.d;
        r12.getClass();
        if (r13 >= 0) goto L5;
        kf2.e(b11.k("byteCount < 0: ", r13));
        return 0;
    L5:
        if (this.o == false) goto L7;
        kf2.o("closed");
        return 0;
    L7:
        if (this.s == false) goto L31;
        long r7 = this.r;
        if (r7 == 0) goto L14;
        if (r7 == (-1)) goto L14;
    L32:
        long r14 = super.read(r12, Math.min(r13, this.r));
        if (r14 == (-1)) goto L36;
        this.r -= r14;
        return r14;
    L36:
        ((q21) r0.c).a();
        ProtocolException r15 = new ProtocolException("unexpected end of stream");
        b();
        throw r15;
    L14:
        if (r7 == (-1)) goto L47;
        r1.I();
    L47:
        this.r = r1.S();     // Catch: NumberFormatException -> L40
        String r2 = qm4.K0(r1.I()).toString();     // Catch: NumberFormatException -> L40
        if (this.r < 0) goto L39;
        if (r2.length() <= 0) goto L23;
        if (xm4.k0(r2, ";", false) == false) goto L39;
    L23:
        if (this.r != 0) goto L30;
        this.s = false;
        e20 r3 = (e20) r0.f;
        r3.getClass();
        sl1 r4 = new sl1();
    L25:
        String r5 = ((fw) r3.p).t(r3.o);
        r3.o -= (long) r5.length();
        if (r5.length() == 0) goto L27;
        r4.b(r5);
        goto L25
    L27:
        r0.g = r4.c();
        o83 r6 = (o83) r0.b;
        r6.getClass();
        be0 r8 = r6.j;
        tl1 r9 = (tl1) r0.g;
        r9.getClass();
        br1.b(r8, this.q, r9);
        b();
    L30:
        if (this.s == true) goto L32;
    L39:
        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.r + r2 + '\"');     // Catch: NumberFormatException -> L40
    L40:
        e = move-exception;
        throw new ProtocolException(e.getMessage());
    L31:
        return -1;
    }
}
