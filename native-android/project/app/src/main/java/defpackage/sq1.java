package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sq1 implements r21 {
    public static final List g = null;
    public static final List h = null;
    public final cv3 a;
    public final ev3 b;
    public final rq1 c;
    public volatile yq1 d;
    public final pr3 e;
    public volatile boolean f;

    static {
        g = ze5.f(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
        h = ze5.f(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    }

    public sq1(o83 r1, cv3 r2, ev3 r3, rq1 r4) {
        r1.getClass();
        r4.getClass();
        this.a = r2;
        this.b = r3;
        this.c = r4;
        List r5 = r1.s;
        pr3 r6 = pr3.t;
        if (r5.contains(r6) == true) goto L6;
        r6 = pr3.s;
    L6:
        this.e = r6;
    }

    @Override // defpackage.r21
    public final ej4 a(k14 r1) {
        yq1 r0 = this.d;
        r0.getClass();
        return r0.h;
    }

    @Override // defpackage.r21
    public final void b(oz3 r15) {
        r15.getClass();
        if (this.d == null) goto L5;
        return;
    L5:
        boolean r1 = false;
        if (r15.d == null) goto L8;
        boolean r0 = true;
    L9:
        tl1 r3 = r15.c;
        ArrayList r4 = new ArrayList(r3.size() + 4);
        r4.add(new pl1(pl1.f, r15.b));
        yw r6 = pl1.g;
        gr1 r16 = r15.a;
        r16.getClass();
        String r7 = r16.b();
        String r8 = r16.d();
        if (r8 == null) goto L12;
        r7 = r7 + '?' + r8;
    L12:
        r4.add(new pl1(r6, r7));
        String r5 = r3.a("Host");
        if (r5 == null) goto L15;
        r4.add(new pl1(pl1.i, r5));
    L15:
        r4.add(new pl1(pl1.h, r16.a));
        int r17 = r3.size();
        int r9 = 0;
    L16:
        if (r9 >= r17) goto L25;
        String r10 = r3.b(r9);
        Locale r11 = Locale.US;
        r11.getClass();
        String r12 = r10.toLowerCase(r11);
        r12.getClass();
        if (g.contains(r12) == true) goto L20;
    L23:
        r4.add(new pl1(r12, r3.e(r9)));
    L24:
        r9 = r9 + 1;
        goto L16
    L20:
        if (r12.equals("te") == false) goto L24;
        if (r3.e(r9).equals("trailers") == false) goto L24;
    L25:
        rq1 r13 = this.c;
        r13.getClass();
        boolean r14 = !r0;
        zq1 r18 = r13.J;
        monitor-enter(r18);
        monitor-enter(r13);     // Catch: Throwable -> L56
    L31:
        th = move-exception;
        throw th;     // Catch: Throwable -> L56
    L29:
        if (r13.r <= 1073741823) goto L34;
        r13.q(b21.t);     // Catch: Throwable -> L31
    L34:
        if (r13.s == true) goto L59;
        int r19 = r13.r;     // Catch: Throwable -> L31
        r13.r = r19 + 2;     // Catch: Throwable -> L31
        yq1 r20 = new yq1(r19, r13, r14, false, null);     // Catch: Throwable -> L31
        if (r0 == true) goto L38;
    L41:
        r1 = true;
    L43:
        if (r20.h() == false) goto L45;
        r13.o.put(Integer.valueOf(r19), r20);     // Catch: Throwable -> L31
    L45:
        monitor-exit(r13);     // Catch: Throwable -> L56
        r13.J.q(r14, r19, r4);     // Catch: Throwable -> L56
        monitor-exit(r18);
        if (r1 == false) goto L50;
        r13.J.flush();
    L50:
        this.d = r20;
        boolean r110 = this.f;
        yq1 r2 = this.d;
        if (r110 == true) goto L54;
        r2.getClass();
        xq1 r111 = r2.j;
        long r21 = this.b.g;
        TimeUnit r22 = TimeUnit.MILLISECONDS;
        r111.g(r21, r22);
        yq1 r112 = this.d;
        r112.getClass();
        r112.k.g(this.b.h, r22);
        return;
    L54:
        r2.getClass();
        r2.e(b21.u);
        mj0.i("Canceled");
        return;
    L38:
        if (r13.G >= r13.H) goto L41;
        if (r20.d < r20.e) goto L43;
    L59:
        throw new ConnectionShutdownException();     // Catch: Throwable -> L31
    L56:
        th = move-exception;
        throw th;
    L8:
        r0 = false;
        goto L9
    }

    @Override // defpackage.r21
    public final void c() {
        yq1 r0 = this.d;
        r0.getClass();
        r0.f().close();
    }

    @Override // defpackage.r21
    public final void cancel() {
        this.f = true;
        yq1 r1 = this.d;
        if (r1 == null) goto L6;
        r1.e(b21.u);
        return;
    }

    @Override // defpackage.r21
    public final long d(k14 r1) {
        if (br1.a(r1) == true) goto L7;
        return 0;
    L7:
        return ze5.e(r1);
    }

    @Override // defpackage.r21
    public final of4 e(oz3 r1, long r2) {
        r1.getClass();
        yq1 r0 = this.d;
        r0.getClass();
        return r0.f();
    }

    @Override // defpackage.r21
    public final j14 f(boolean r11) {
        yq1 r0 = this.d;
        if (r0 == null) goto L65;
        monitor-enter(r0);
    L70:
        boolean r3 = false;
        if (r0.f.isEmpty() == false) goto L37;
        if (r0.l != null) goto L37;
        if (r11 == true) goto L19;
        r0.b.getClass();     // Catch: Throwable -> L23
        vq1 r4 = r0.i;     // Catch: Throwable -> L23
        if (r4.p == false) goto L14;
    L17:
        boolean r5 = true;
    L18:
        if (r5 == true) goto L19;
    L20:
        if (r3 == false) goto L67;
        r0.j.h();     // Catch: Throwable -> L23
    L67:
        r0.wait();     // Catch: Throwable -> L29 InterruptedException -> L31
        if (r3 == false) goto L70;
        r0.j.k();     // Catch: Throwable -> L23
        goto L70
    L31:
        Thread.currentThread().interrupt();     // Catch: Throwable -> L29
        throw new InterruptedIOException();     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        if (r3 == false) goto L35;
        r0.j.k();     // Catch: Throwable -> L23
    L35:
        throw th;     // Catch: Throwable -> L23
    L14:
        if (r4.n == true) goto L17;
        r5 = false;
    L19:
        r3 = true;
    L37:
        if (r0.f.isEmpty() == true) goto L58;
        Object r2 = r0.f.removeFirst();     // Catch: Throwable -> L23
        r2.getClass();     // Catch: Throwable -> L23
        tl1 r6 = (tl1) r2;     // Catch: Throwable -> L23
        monitor-exit(r0);
        pr3 r10 = this.e;
        r10.getClass();
        ArrayList r1 = new ArrayList(20);
        int r7 = r6.size();
        ue1 r8 = null;
        int r9 = 0;
    L41:
        if (r9 >= r7) goto L49;
        String r12 = r6.b(r9);
        String r13 = r6.e(r9);
        if (r12.equals(":status") == false) goto L46;
        r8 = hw.C("HTTP/1.1 ".concat(r13));
    L48:
        r9 = r9 + 1;
        goto L41
    L46:
        if (h.contains(r12) == true) goto L48;
        r1.add(r12);
        r1.add(qm4.K0(r13).toString());
        goto L48
    L49:
        if (r8 == null) goto L57;
        j14 r14 = new j14();
        r14.b = r10;
        r14.c = r8.o;
        r14.d = (String) r8.q;
        String[] r15 = (String[]) r1.toArray(new String[0]);
        r15.getClass();
        sl1 r16 = new sl1();
        ArrayList r17 = r16.a;
        r17.getClass();
        List r18 = Arrays.asList(r15);
        r18.getClass();
        r17.addAll(r18);
        r14.f = r16;
        r14.n = gq1.p;
        if (r11 == true) goto L53;
    L55:
        return r14;
    L53:
        if (r14.c != 100) goto L55;
        return null;
    L57:
        throw new ProtocolException("Expected ':status' header not present");
    L58:
        IOException r19 = r0.m;     // Catch: Throwable -> L23
        if (r19 != null) goto L81;
        b21 r110 = r0.l;     // Catch: Throwable -> L23
        r110.getClass();     // Catch: Throwable -> L23
        throw new StreamResetException(r110);     // Catch: Throwable -> L23
    L81:
        throw r19;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    L65:
        mj0.i("stream wasn't created");
        return null;
    }

    @Override // defpackage.r21
    public final void g() {
        this.c.flush();
    }

    @Override // defpackage.r21
    public final q21 h() {
        return this.a;
    }

    @Override // defpackage.r21
    public final tl1 i() {
        yq1 r2 = this.d;
        r2.getClass();
        monitor-enter(r2);
        wq1 r0 = r2.h;     // Catch: Throwable -> L14
        if (r0.o == true) goto L7;
    L18:
        b21 r1 = r2.l;     // Catch: Throwable -> L14
        if (r1 == null) goto L26;
        IOException r3 = r2.m;     // Catch: Throwable -> L14
        if (r3 == null) goto L24;
        throw r3;     // Catch: Throwable -> L14
    L24:
        throw new StreamResetException(r1);     // Catch: Throwable -> L14
    L26:
        throw new IllegalStateException("too early; can't read the trailers yet");     // Catch: Throwable -> L14
    L7:
        if (r0.p.l() == false) goto L18;
        if (r2.h.q.l() == false) goto L18;
        tl1 r4 = r2.h.r;     // Catch: Throwable -> L14
        if (r4 != null) goto L16;
        r4 = ze5.a;     // Catch: Throwable -> L14
    L16:
        monitor-exit(r2);
        return r4;
    L14:
        th = move-exception;
        throw th;
    }
}
