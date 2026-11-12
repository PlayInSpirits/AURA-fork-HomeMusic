package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq1 implements Closeable {
    public static final pb4 M = null;
    public long A;
    public long B;
    public final r81 C;
    public final pb4 D;
    public pb4 E;
    public final os F;
    public long G;
    public long H;
    public final Socket I;
    public final zq1 J;
    public final mq1 K;
    public final LinkedHashSet L;
    public final kq1 n;
    public final LinkedHashMap o;
    public final String p;
    public int q;
    public int r;
    public boolean s;
    public final gr4 t;
    public final fr4 u;
    public final fr4 v;
    public final fr4 w;
    public final rv2 x;
    public long y;
    public long z;

    static {
        pb4 r0 = new pb4();
        r0.b(7, 65535);
        r0.b(5, 16384);
        M = r0;
    }

    public rq1(lv4 r5) {
        this.n = (kq1) r5.s;
        this.o = new LinkedHashMap();
        String r0 = (String) r5.p;
        if (r0 == null) goto L18;
        this.p = r0;
        this.r = 3;
        gr4 r1 = (gr4) r5.n;
        this.t = r1;
        this.u = r1.e();
        this.v = r1.e();
        this.w = r1.e();
        this.x = rv2.z;
        this.C = (r81) r5.t;
        pb4 r2 = new pb4();
        r2.b(7, 16777216);
        this.D = r2;
        pb4 r3 = M;
        this.E = r3;
        this.F = new os(0);
        this.H = r3.a();
        Socket r4 = (Socket) r5.o;
        if (r4 == null) goto L16;
        this.I = r4;
        ew r6 = (ew) r5.r;
        if (r6 == null) goto L14;
        this.J = new zq1(r6);
        fw r7 = (fw) r5.q;
        if (r7 == null) goto L12;
        this.K = new mq1(this, new uq1(r7));
        this.L = new LinkedHashSet();
        return;
    L12:
        h12.Q("source");
        throw null;
    L14:
        h12.Q("sink");
        throw null;
    L16:
        h12.Q("socket");
        throw null;
    L18:
        h12.Q("connectionName");
        throw null;
    }

    public final void F(int r3, long r4) {
        fr4.c(this.u, this.p + '[' + r3 + "] windowUpdate", new qq1(this, r3, r4));
    }

    public final void b(b21 r4, b21 r5, IOException r6) {
        tl1 r0 = ze5.a;
        q(r4);     // Catch: IOException -> L26
    L4:
        monitor-enter(this);
        int r1 = 0;
        if (this.o.isEmpty() == true) goto L11;
        Object[] r7 = this.o.values().toArray(new yq1[0]);     // Catch: Throwable -> L9
        this.o.clear();     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
        yq1[] r8 = (yq1[]) r7;
        if (r8 == null) goto L30;
        int r2 = r8.length;
    L16:
        if (r1 >= r2) goto L30;
        r8[r1].c(r5, r6);     // Catch: IOException -> L27
    L19:
        r1 = r1 + 1;
    L30:
        this.J.close();     // Catch: IOException -> L28
    L38:
        this.I.close();     // Catch: IOException -> L29
    L22:
        this.u.g();
        this.v.g();
        this.w.g();
        return;
    L11:
        r7 = null;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b21 r0 = b21.u;
        b(b21.p, r0, null);
    }

    public final void f(IOException r2) {
        b21 r0 = b21.q;
        b(r0, r0, r2);
    }

    public final void flush() {
        this.J.flush();
    }

    public final synchronized yq1 j(int r2) {
        monitor-enter(this);
        yq1 r3 = (yq1) this.o.get(Integer.valueOf(r2));     // Catch: Throwable -> L6
        monitor-exit(this);
        return r3;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized yq1 n(int r2) {
        monitor-enter(this);
        yq1 r3 = (yq1) this.o.remove(Integer.valueOf(r2));     // Catch: Throwable -> L6
        notifyAll();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r3;
    L6:
        th = move-exception;
        throw th;
    }

    public final void q(b21 r4) {
        zq1 r0 = this.J;
        monitor-enter(r0);
        monitor-enter(this);     // Catch: Throwable -> L10
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L6:
        if (this.s == false) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L10
        monitor-exit(r0);
        return;
    L13:
        this.s = true;     // Catch: Throwable -> L18
        int r1 = this.q;     // Catch: Throwable -> L18
        monitor-exit(this);     // Catch: Throwable -> L10
        this.J.n(r1, r4, xe5.a);     // Catch: Throwable -> L10
        monitor-exit(r0);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized void s(long r7) {
        monitor-enter(this);
        os.c(this.F, r7, 0, 2);     // Catch: Throwable -> L6
        long r3 = this.F.b();     // Catch: Throwable -> L6
        if (r3 < (this.D.a() / 2)) goto L8;
        F(0, r3);     // Catch: Throwable -> L6
        os.c(this.F, 0, r3, 1);     // Catch: Throwable -> L6
    L8:
        r81 r8 = this.C;     // Catch: Throwable -> L6
        os r9 = this.F;     // Catch: Throwable -> L6
        r8.getClass();     // Catch: Throwable -> L6
        r9.getClass();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final void u(int r9, boolean r10, tv r11, long r12) {
        if (r12 != 0) goto L7;
        this.J.f(r10, r9, r11, 0);
        return;
    L7:
        if (r12 <= 0) goto L32;
        monitor-enter(this);
    L33:
        long r4 = this.G;     // Catch: Throwable -> L14 InterruptedException -> L28
        long r6 = this.H;     // Catch: Throwable -> L14 InterruptedException -> L28
        if (r4 < r6) goto L19;
        if (this.o.containsKey(Integer.valueOf(r9)) == false) goto L17;
        wait();     // Catch: Throwable -> L14 InterruptedException -> L28
        goto L33
    L17:
        throw new IOException("stream closed");     // Catch: Throwable -> L14 InterruptedException -> L28
    L19:
        int r2 = Math.min((int) Math.min(r12, r6 - r4), this.J.p);     // Catch: Throwable -> L14
        long r7 = r2;
        this.G += r7;     // Catch: Throwable -> L14
        monitor-exit(this);
        r12 = r12 - r7;
        zq1 r5 = this.J;
        if (r10 == true) goto L24;
    L26:
        boolean r8 = false;
    L27:
        r5.f(r8, r9, r11, r2);
        goto L7
    L24:
        if (r12 != 0) goto L26;
        r8 = true;
    L14:
        th = move-exception;
        throw th;
    L28:
        Thread.currentThread().interrupt();     // Catch: Throwable -> L14
        throw new InterruptedIOException();     // Catch: Throwable -> L14
    }

    public final void v(int r3, b21 r4) {
        fr4.c(this.u, this.p + '[' + r3 + "] writeSynReset", new pq1(this, r3, r4));
    }
}
