package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq1 {
    public final int a;
    public final rq1 b;
    public final os c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final wq1 h;
    public final vq1 i;
    public final xq1 j;
    public final xq1 k;
    public b21 l;
    public IOException m;

    public yq1(int r4, rq1 r5, boolean r6, boolean r7, tl1 r8) {
        r5.getClass();
        this.a = r4;
        this.b = r5;
        this.c = new os(r4);
        this.e = r5.E.a();
        ArrayDeque r9 = new ArrayDeque();
        this.f = r9;
        this.h = new wq1(this, r5.D.a(), r7);
        this.i = new vq1(this, r6);
        this.j = new xq1(this);
        this.k = new xq1(this);
        if (r8 == null) goto L11;
        if (g() == true) goto L8;
        r9.add(r8);
        return;
    L8:
        kf2.o("locally-initiated streams shouldn't have headers yet");
        throw null;
    L11:
        if (g() == false) goto L13;
        return;
    L13:
        kf2.o("remotely-initiated streams should have headers");
        throw null;
    }

    public final void a() {
        tl1 r0 = ze5.a;
        monitor-enter(this);
        wq1 r1 = this.h;     // Catch: Throwable -> L13
        if (r1.o == false) goto L7;
    L16:
        boolean r2 = false;
    L17:
        boolean r3 = h();     // Catch: Throwable -> L13
        monitor-exit(this);
        if (r2 == false) goto L22;
        c(b21.u, null);
        return;
    L22:
        if (r3 == true) goto L29;
        this.b.n(this.a);
        return;
    L29:
        return;
    L7:
        if (r1.s == false) goto L16;
        vq1 r4 = this.i;     // Catch: Throwable -> L13
        if (r4.n == false) goto L11;
    L15:
        r2 = true;
        goto L17
    L11:
        if (r4.p == false) goto L16;
    L13:
        th = move-exception;
        throw th;
    }

    public final void b() {
        vq1 r0 = this.i;
        if (r0.p == false) goto L5;
        mj0.i("stream closed");
        return;
    L5:
        if (r0.n == true) goto L14;
        b21 r1 = this.l;
        if (r1 == null) goto L13;
        IOException r2 = this.m;
        if (r2 == null) goto L12;
        throw r2;
    L12:
        throw new StreamResetException(r1);
    L13:
        return;
    L14:
        mj0.i("stream finished");
    }

    public final void c(b21 r1, IOException r2) {
        if (d(r1, r2) == true) goto L5;
        return;
    L5:
        rq1 r3 = this.b;
        r3.getClass();
        r3.J.u(this.a, r1);
    }

    public final boolean d(b21 r3, IOException r4) {
        tl1 r0 = ze5.a;
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L6:
        if (this.l == null) goto L9;
        monitor-exit(this);
        return false;
    L9:
        this.l = r3;     // Catch: Throwable -> L15
        this.m = r4;     // Catch: Throwable -> L15
        notifyAll();     // Catch: Throwable -> L15
        if (this.h.o == false) goto L17;
        if (this.i.n == false) goto L17;
        monitor-exit(this);
        return false;
    L17:
        monitor-exit(this);
        this.b.n(this.a);
        return true;
    }

    public final void e(b21 r2) {
        if (d(r2, null) == true) goto L5;
        return;
    L5:
        this.b.v(this.a, r2);
    }

    public final vq1 f() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.g == false) goto L6;
    L12:
        monitor-exit(this);
        return this.i;
    L6:
        if (g() == true) goto L12;
        throw new IllegalStateException("reply before requesting the sink");     // Catch: Throwable -> L10
    }

    public final boolean g() {
        if ((this.a & 1) != 1) goto L5;
        boolean r0 = true;
    L6:
        this.b.getClass();
        if (true != r0) goto L9;
        return true;
    L9:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public final synchronized boolean h() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.l == null) goto L8;
        monitor-exit(this);
        return false;
    L8:
        wq1 r0 = this.h;     // Catch: Throwable -> L13
        if (r0.o == false) goto L11;
    L15:
        vq1 r1 = this.i;     // Catch: Throwable -> L13
        if (r1.n == false) goto L18;
    L19:
        if (this.g == false) goto L23;
        monitor-exit(this);
        return false;
    L23:
        monitor-exit(this);
        return true;
    L18:
        if (r1.p == false) goto L23;
    L11:
        if (r0.s == false) goto L23;
        goto L23
    }

    public final void i(tl1 r3, boolean r4) {
        r3.getClass();
        tl1 r0 = ze5.a;
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L5:
        if (this.g == true) goto L7;
    L14:
        this.g = true;     // Catch: Throwable -> L12
        this.f.add(r3);     // Catch: Throwable -> L12
    L15:
        if (r4 == false) goto L17;
        this.h.o = true;     // Catch: Throwable -> L12
    L17:
        boolean r5 = h();     // Catch: Throwable -> L12
        notifyAll();     // Catch: Throwable -> L12
        monitor-exit(this);
        if (r5 == true) goto L26;
        this.b.n(this.a);
        return;
    L26:
        return;
    L7:
        if (r3.a(":status") != null) goto L14;
        if (r3.a(":method") != null) goto L14;
        this.h.r = r3;     // Catch: Throwable -> L12
        goto L15
    }
}
