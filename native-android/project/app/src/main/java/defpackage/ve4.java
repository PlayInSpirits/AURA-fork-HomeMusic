package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve4 implements zi0 {
    public final ue4 a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final cj0[] e;
    public final dj0[] f;
    public int g;
    public int h;
    public cj0 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public int m;
    public long n;

    public ve4(cj0[] r4, dj0[] r5) {
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = r4;
        this.g = r4.length;
        int r6 = 0;
        int r0 = 0;
    L4:
        if (r0 >= this.g) goto L6;
        this.e[r0] = g();
        r0 = r0 + 1;
        goto L4
    L6:
        this.f = r5;
        this.h = r5.length;
    L8:
        if (r6 >= this.h) goto L10;
        this.f[r6] = h();
        r6 = r6 + 1;
        goto L8
    L10:
        ue4 r7 = new ue4(this);
        this.a = r7;
        r7.start();
    }

    @Override // defpackage.zi0
    public void a() {
        Object r0 = this.b;
        monitor-enter(r0);
        this.l = true;     // Catch: Throwable -> L11
        this.b.notify();     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        this.a.join();     // Catch: InterruptedException -> L9
        return;
    L9:
        Thread.currentThread().interrupt();
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.zi0
    public final void b(long r4) {
        Object r0 = this.b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.g != this.e.length) goto L7;
    L12:
        boolean r1 = true;
    L13:
        rr2.w(r1);     // Catch: Throwable -> L10
        this.n = r4;     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L7:
        if (this.k == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // defpackage.zi0
    public final /* bridge */ /* synthetic */ Object d() {
        return l();
    }

    @Override // defpackage.zi0
    public final Object e() {
        Object r0 = this.b;
        monitor-enter(r0);
        DecoderException r1 = this.j;     // Catch: Throwable -> L17
        if (r1 == null) goto L7;
        throw r1;     // Catch: Throwable -> L17
    L7:
        if (this.i != null) goto L9;
        boolean r2 = true;
    L10:
        rr2.w(r2);     // Catch: Throwable -> L17
        int r3 = this.g;     // Catch: Throwable -> L17
        if (r3 != 0) goto L13;
        cj0 r4 = null;
    L14:
        this.i = r4;     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        return r4;
    L13:
        cj0[] r5 = this.e;     // Catch: Throwable -> L17
        int r6 = r3 - 1;     // Catch: Throwable -> L17
        this.g = r6;     // Catch: Throwable -> L17
        r4 = r5[r6];     // Catch: Throwable -> L17
        goto L14
    L9:
        r2 = false;
    L17:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.zi0
    public final /* bridge */ /* synthetic */ void f(vn4 r1) {
        m(r1);
    }

    @Override // defpackage.zi0
    public final void flush() {
        Object r0 = this.b;
        monitor-enter(r0);
        this.k = true;     // Catch: Throwable -> L8
        this.m = 0;     // Catch: Throwable -> L8
        cj0 r1 = this.i;     // Catch: Throwable -> L8
        if (r1 == null) goto L11;
        r1.r();     // Catch: Throwable -> L8
        cj0[] r2 = this.e;     // Catch: Throwable -> L8
        int r3 = this.g;     // Catch: Throwable -> L8
        this.g = r3 + 1;     // Catch: Throwable -> L8
        r2[r3] = r1;     // Catch: Throwable -> L8
        this.i = null;     // Catch: Throwable -> L8
    L11:
        if (this.c.isEmpty() == true) goto L14;
        cj0 r4 = (cj0) this.c.removeFirst();     // Catch: Throwable -> L8
        r4.r();     // Catch: Throwable -> L8
        cj0[] r5 = this.e;     // Catch: Throwable -> L8
        int r6 = this.g;     // Catch: Throwable -> L8
        this.g = r6 + 1;     // Catch: Throwable -> L8
        r5[r6] = r4;     // Catch: Throwable -> L8
    L14:
        if (this.d.isEmpty() == true) goto L16;
        ((dj0) this.d.removeFirst()).s();     // Catch: Throwable -> L8
        goto L14
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public abstract cj0 g();

    public abstract dj0 h();

    public abstract DecoderException i(Throwable r1);

    public abstract DecoderException j(cj0 r1, dj0 r2, boolean r3);

    public final boolean k() {
        Object r0 = this.b;
        monitor-enter(r0);
    L78:
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.l == true) goto L17;
        if (this.c.isEmpty() == false) goto L9;
    L11:
        boolean r1 = false;
    L12:
        if (r1 == true) goto L17;
        this.b.wait();     // Catch: Throwable -> L14
        goto L78
    L9:
        if (this.h <= 0) goto L11;
        r1 = true;
    L17:
        if (this.l == false) goto L20;
        monitor-exit(r0);     // Catch: Throwable -> L14
        return false;
    L20:
        cj0 r2 = (cj0) this.c.removeFirst();     // Catch: Throwable -> L14
        dj0[] r4 = this.f;     // Catch: Throwable -> L14
        int r5 = this.h - 1;     // Catch: Throwable -> L14
        this.h = r5;     // Catch: Throwable -> L14
        dj0 r6 = r4[r5];     // Catch: Throwable -> L14
        boolean r7 = this.k;     // Catch: Throwable -> L14
        this.k = false;     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        if (r2.d(4) == false) goto L25;
        r6.a(4);
    L55:
        Object r3 = this.b;
        monitor-enter(r3);
    L60:
        th = move-exception;
        throw th;
    L58:
        if (this.k == false) goto L62;
        r6.s();     // Catch: Throwable -> L60
    L68:
        r2.r();     // Catch: Throwable -> L60
        cj0[] r8 = this.e;     // Catch: Throwable -> L60
        int r9 = this.g;     // Catch: Throwable -> L60
        this.g = r9 + 1;     // Catch: Throwable -> L60
        r8[r9] = r2;     // Catch: Throwable -> L60
        monitor-exit(r3);     // Catch: Throwable -> L60
        return true;
    L62:
        boolean r10 = r6.r;     // Catch: Throwable -> L60
        int r11 = this.m;
        if (r10 == true) goto L66;
        r6.q = r11;     // Catch: Throwable -> L60
        this.m = 0;     // Catch: Throwable -> L60
        this.d.addLast(r6);     // Catch: Throwable -> L60
        goto L68
    L66:
        this.m = r11 + 1;     // Catch: Throwable -> L60
        r6.s();     // Catch: Throwable -> L60
        goto L68
    L25:
        r6.p = r2.t;
        if (r2.d(134217728) == false) goto L28;
        r6.a(134217728);
    L28:
        long r12 = r2.t;
        Object r13 = this.b;
        monitor-enter(r13);
        long r14 = this.n;     // Catch: Throwable -> L73
        if (r14 != (-9223372036854775807L)) goto L33;
    L36:
        boolean r15 = true;
    L37:
        monitor-exit(r13);     // Catch: Throwable -> L73
        if (r15 == true) goto L85;
        r6.r = true;
    L85:
        DecoderException r16 = j(r2, r6, r7);     // Catch: OutOfMemoryError -> L42 RuntimeException -> L44
    L46:
        if (r16 == null) goto L55;
        Object r17 = this.b;
        monitor-enter(r17);
        this.j = r16;     // Catch: Throwable -> L52
        monitor-exit(r17);     // Catch: Throwable -> L52
        return false;
    L52:
        th = move-exception;
        throw th;
    L42:
        e = move-exception;
        r16 = i(e);
    L44:
        e = move-exception;
        r16 = i(e);
        goto L46
    L33:
        if (r12 >= r14) goto L36;
        r15 = false;
    L73:
        th = move-exception;
        throw th;
    }

    public final dj0 l() {
        Object r0 = this.b;
        monitor-enter(r0);
        DecoderException r1 = this.j;     // Catch: Throwable -> L11
        if (r1 == null) goto L7;
        throw r1;     // Catch: Throwable -> L11
    L7:
        if (this.d.isEmpty() == true) goto L9;
        dj0 r2 = (dj0) this.d.removeFirst();     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r2;
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return null;
    L11:
        th = move-exception;
        throw th;
    }

    public final void m(cj0 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
        DecoderException r1 = this.j;     // Catch: Throwable -> L18
        if (r1 == null) goto L7;
        throw r1;     // Catch: Throwable -> L18
    L7:
        if (r3 != this.i) goto L9;
        boolean r2 = true;
    L10:
        rr2.l(r2);     // Catch: Throwable -> L18
        this.c.addLast(r3);     // Catch: Throwable -> L18
        if (this.c.isEmpty() == false) goto L13;
    L15:
        this.i = null;     // Catch: Throwable -> L18
        monitor-exit(r0);     // Catch: Throwable -> L18
        return;
    L13:
        if (this.h <= 0) goto L15;
        this.b.notify();     // Catch: Throwable -> L18
        goto L15
    L9:
        r2 = false;
    L18:
        th = move-exception;
        throw th;
    }

    public final void n(dj0 r5) {
        Object r0 = this.b;
        monitor-enter(r0);
        r5.r();     // Catch: Throwable -> L11
        dj0[] r1 = this.f;     // Catch: Throwable -> L11
        int r2 = this.h;     // Catch: Throwable -> L11
        this.h = r2 + 1;     // Catch: Throwable -> L11
        r1[r2] = r5;     // Catch: Throwable -> L11
        if (this.c.isEmpty() == false) goto L7;
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L7:
        if (this.h <= 0) goto L9;
        this.b.notify();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }
}
