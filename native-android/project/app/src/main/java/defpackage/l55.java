package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l55 {
    public final gp3 a;
    public final e55 b;
    public final pu c;
    public final tu d;
    public final tu e;
    public final uu f;
    public final f55 g;
    public long h;
    public long i;
    public long j;
    public s55 k;
    public long l;

    public l55(gp3 r3, e55 r4, f55 r5) {
        this.a = r3;
        this.b = r4;
        this.g = r5;
        this.c = new pu();
        this.d = new tu();
        this.e = new tu();
        uu r6 = new uu();
        int r7 = 16;
        if (Integer.bitCount(16) == 1) goto L5;
        r7 = Integer.highestOneBit(15) << 1;
    L5:
        r6.n = 0;
        r6.o = -1;
        r6.p = 0;
        r6.r = new long[r7];
        r6.q = r7 - 1;
        this.f = r6;
        this.h = -9223372036854775807L;
        this.k = s55.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long r23, long r25) {
        final gp3 r1 = this.a;
        tn0 r2 = (tn0) r1.p;
    L3:
        uu r3 = this.f;
        int r4 = r3.p;
        if (r4 == 0) goto L5;
        if (r4 == 0) goto L57;
        long r7 = ((long[]) r3.r)[r3.n];
        Long r5 = (Long) this.e.f(r7);
        e55 r6 = this.b;
        if (r5 != null) goto L10;
    L12:
        long r13 = this.l;
        e55 r8 = this.b;
        pu r9 = this.c;
        int r10 = r8.a(r7, r23, r25, r13, false, false, r9);
        if (r10 == 5) goto L16;
        if (r10 == 4) goto L16;
        this.g.a(r7, r9.a);
    L16:
        final int r14 = 0;
        final int r15 = 1;
        if (r10 == 0) goto L28;
        if (r10 == 1) goto L28;
        if (r10 == 2) goto L27;
        if (r10 == 3) goto L27;
        if (r10 != 4) goto L22;
        this.i = r7;
        goto L3
    L22:
        if (r10 != 5) goto L24;
        return;
    L24:
        kf2.o(String.valueOf(r10));
        return;
    L27:
        this.i = r7;
        r3.a();
        r2.i.execute(new sn0(r1, r15));
        lk2 r11 = (lk2) r2.d.remove();
        ok2 r12 = r11.c;
        ak2 r16 = r11.a;
        int r17 = r11.b;
        Trace.beginSection("dropVideoBuffer");
        r16.g(r17);
        Trace.endSection();
        r12.S0(0, 1);
    L28:
        this.i = r7;
        if (r10 != 0) goto L31;
        boolean r18 = true;
    L32:
        long r19 = r3.a();
        s55 r20 = (s55) this.d.f(r19);
        if (r20 != null) goto L35;
    L39:
        if (r18 == false) goto L42;
        long r21 = System.nanoTime();
    L41:
        long r110 = r21;
        if (r6.e != 3) goto L47;
        r15 = 0;
    L47:
        r6.e = 3;
        r6.l.getClass();
        r6.g = f35.Q(SystemClock.elapsedRealtime());
        if (r15 != 0) goto L50;
    L52:
        tb1 r22 = (tb1) r1.o;
        if (r22 != null) goto L55;
        tb1 r24 = new tb1(new sb1());
    L56:
        r2.j.d(r19, r110, r24, null);
        lk2 r26 = (lk2) r2.d.remove();
        r26.c.N0(r26.a, r26.b, r110);
        goto L3
    L55:
        r24 = r22;
        goto L56
    L50:
        if (r2.e == null) goto L52;
        r2.i.execute(new sn0(r1, r14));
        goto L52
    L42:
        r21 = r9.b;
        goto L41
    L35:
        if (r20.equals(s55.d) == true) goto L39;
        if (r20.equals(this.k) == true) goto L39;
        this.k = r20;
        sb1 r27 = new sb1();
        r27.t = r20.a;
        r27.u = r20.b;
        r27.m = lw2.m("video/raw");
        r1.o = new tb1(r27);
        r2.i.execute(new k6(21, r1, r20));
        goto L39
    L31:
        r18 = false;
        goto L32
    L10:
        if (r5.longValue() == this.l) goto L12;
        this.l = r5.longValue();
        r6.e(2);
        goto L12
    L57:
        tb4.k();
        return;
    }
}
