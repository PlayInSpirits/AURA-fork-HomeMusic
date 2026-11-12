package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w43 extends a13 {
    public final a13 o;
    public boolean p;

    public w43(long r1, gh4 r3, if1 r4, if1 r5, a13 r6) {
        super(r1, r3, r4, r5);
        this.o = r6;
        r6.k();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        if (this.c == true) goto L8;
        super.c();
        if (this.p == true) goto L9;
        this.p = true;
        this.o.l();
        return;
    L9:
        return;
    }

    @Override // defpackage.a13
    public final jz4 w() {
        a13 r0 = this.o;
        if (r0.m == true) goto L61;
        if (r0.c == true) goto L61;
        x03 r5 = this.h;
        long r8 = this.b;
        if (r5 == null) goto L10;
        HashMap r6 = jh4.b(r0.g(), this, this.o.d());
    L11:
        Object r10 = jh4.c;
        monitor-enter(r10);
        jh4.c(this);     // Catch: Throwable -> L25
        if (r5 != null) goto L16;
    L17:
        w43 r2 = this;
        r2.a();     // Catch: Throwable -> L25
    L30:
        if (h12.k(r2.o.g(), r8) >= 0) goto L32;
        r2.o.v();     // Catch: Throwable -> L25
    L32:
        a13 r11 = r2.o;     // Catch: Throwable -> L25
        r11.r(r11.d().b(r8).a(r2.j));     // Catch: Throwable -> L25
        r2.o.A(r8);     // Catch: Throwable -> L25
        a13 r12 = r2.o;     // Catch: Throwable -> L25
        int r1 = r2.d;     // Catch: Throwable -> L25
        r2.d = -1;     // Catch: Throwable -> L25
        if (r1 < 0) goto L35;
        int[] r3 = r12.k;     // Catch: Throwable -> L25
        r3.getClass();     // Catch: Throwable -> L25
        int r4 = r3.length;     // Catch: Throwable -> L25
        int[] r7 = Arrays.copyOf(r3, r4 + 1);     // Catch: Throwable -> L25
        r7[r4] = r1;     // Catch: Throwable -> L25
        r12.k = r7;     // Catch: Throwable -> L25
    L36:
        a13 r13 = r2.o;     // Catch: Throwable -> L25
        gh4 r9 = r2.j;     // Catch: Throwable -> L25
        r13.getClass();     // Catch: Throwable -> L25
        monitor-enter(r10);     // Catch: Throwable -> L25
        r13.j = r13.j.e(r9);     // Catch: Throwable -> L54
        monitor-exit(r10);     // Catch: Throwable -> L25
        a13 r14 = r2.o;     // Catch: Throwable -> L25
        int[] r15 = r2.k;     // Catch: Throwable -> L25
        r14.getClass();     // Catch: Throwable -> L25
        if (r15.length == 0) goto L48;
        int[] r16 = r14.k;     // Catch: Throwable -> L25
        if (r16.length == 0) goto L47;
        int r17 = r16.length;     // Catch: Throwable -> L25
        int r18 = r15.length;     // Catch: Throwable -> L25
        int[] r19 = Arrays.copyOf(r16, r17 + r18);     // Catch: Throwable -> L25
        System.arraycopy(r15, 0, r19, r17, r18);     // Catch: Throwable -> L25
        r15 = r19;
    L47:
        r14.k = r15;     // Catch: Throwable -> L25
    L48:
        monitor-exit(r10);
        r2.m = true;
        if (r2.p == true) goto L53;
        r2.p = true;
        r2.o.l();
    L53:
        return eh4.j;
    L54:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L35:
        r12.getClass();     // Catch: Throwable -> L25
        goto L36
    L16:
        if (r5.d == 0) goto L17;
        r2 = this;
        jz4 r110 = r2.z(this.o.g(), r5, r6, this.o.d());     // Catch: Throwable -> L25
        if (r110.equals(eh4.j) == true) goto L22;
        monitor-exit(r10);
        return r110;
    L22:
        x03 r111 = r2.o.x();     // Catch: Throwable -> L25
        if (r111 == null) goto L27;
        r111.j(r5);     // Catch: Throwable -> L25
        goto L30
    L27:
        r2.o.B(r5);     // Catch: Throwable -> L25
        r2.h = null;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L10:
        r6 = null;
    L61:
        return new dh4(this);
    }
}
