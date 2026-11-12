package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh4 {
    public static final o54 a = null;
    public static final z05 b = null;
    public static final Object c = null;
    public static gh4 d;
    public static long e;
    public static final fd f = null;
    public static final ue1 g = null;
    public static List h;
    public static List i;
    public static final yi1 j = null;
    public static final fl k = null;

    static {
        a = new o54(15);
        b = new z05(9);
        c = new Object();
        gh4 r4 = gh4.r;
        d = r4;
        e = 2;
        fd r0 = new fd();
        r0.c = new long[16];
        r0.d = new int[16];
        int[] r2 = new int[16];
        byte r7 = 0;
        int r3 = 0;
    L3:
        if (r3 >= 16) goto L5;
        int r5 = r3 + 1;
        r2[r3] = r5;
        r3 = r5;
        goto L3
    L5:
        r0.e = r2;
        f = r0;
        ue1 r1 = new ue1(12, r7);
        r1.p = new int[16];
        r1.q = new i95[16];
        g = r1;
        u01 r6 = u01.n;
        h = r6;
        i = r6;
        long r8 = e;
        e = 1 + r8;
        yi1 r9 = new yi1(r8, r4, null, new k2(20, r7));
        d = d.f(r9.b);
        j = r9;
        k = new fl(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long r22, a13 r24, gh4 r25) {
        x03 r0 = r24.x();
        if (r0 != null) goto L5;
    L4:
        return null;
    L5:
        long r2 = r24.g();
        gh4 r4 = r24.d().f(r2).e(r24.j);
        Object[] r6 = r0.b;
        long[] r1 = r0.a;
        int r7 = r1.length - 2;
        if (r7 < 0) goto L4;
        int r9 = 0;
        HashMap r10 = null;
    L8:
        long r11 = r1[r9];
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L38;
        int r14 = 8;
        int r13 = 8 - ((~(r9 - r7)) >>> 31);
        int r15 = 0;
    L11:
        if (r15 >= r13) goto L34;
        if ((r11 & 255) >= 128) goto L32;
        rl4 r3 = (rl4) r6[(r9 << 3) + r15];
        tl4 r8 = r3.a();
        long[] r20 = r1;
        int r18 = r14;
        int r19 = r15;
        tl4 r5 = s(r8, r22, r25);
        if (r5 == null) goto L33;
        tl4 r12 = s(r8, r2, r4);
        if (r12 == null) goto L33;
        if (r5.equals(r12) == true) goto L33;
        tl4 r16 = s(r8, r2, r24.d());
        if (r16 == null) goto L29;
        tl4 r17 = r3.b(r12, r5, r16);
        if (r17 == null) goto L51;
        if (r10 != null) goto L28;
        r10 = new HashMap();
    L28:
        r10.put(r5, r17);
        r10 = r10;
        goto L33
    L51:
        return null;
    L29:
        r();
        throw null;
    L33:
        r11 = r11 >> r18;
        r15 = r19 + 1;
        r14 = r18;
        r1 = r20;
        r4 = r4;
        goto L11
    L32:
        r20 = r1;
        r18 = r14;
        r19 = r15;
        goto L33
    L34:
        long[] r21 = r1;
        gh4 r23 = r4;
        if (r13 != r14) goto L37;
    L39:
        if (r9 == r7) goto L41;
        r9 = r9 + 1;
        r1 = r21;
        r4 = r23;
        goto L8
    L41:
        return r10;
    L37:
        return r10;
    L38:
        r21 = r1;
        r23 = r4;
        goto L39
    }

    public static final void c(ch4 r7) {
        if (d.d(r7.g()) == true) goto L24;
        long r0 = r7.g();
        boolean r2 = r7.c;
        if ((r7 instanceof a13) == false) goto L7;
        a13 r8 = (a13) r7;
    L8:
        if (r8 == null) goto L10;
        Object r9 = Boolean.valueOf(r8.m);
    L11:
        Object r3 = c;
        monitor-enter(r3);
        fd r4 = f;     // Catch: Throwable -> L21
        if (r4.a <= 0) goto L16;
        long r5 = ((long[]) r4.c)[0];     // Catch: Throwable -> L21
    L17:
        Long r6 = Long.valueOf(r5);     // Catch: Throwable -> L21
        monitor-exit(r3);
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + r0 + ", disposed=" + r2 + ", applied=" + r9 + ", lowestPin=" + r6).toString());
    L16:
        r5 = -1;
    L21:
        th = move-exception;
        throw th;
    L10:
        r9 = "read-only";
        goto L11
    L7:
        r8 = null;
        goto L8
    }

    public static final gh4 d(gh4 r2, long r3, long r5) {
    L3:
        if (h12.k(r3, r5) >= 0) goto L5;
        r2 = r2.f(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    public static final Object e(if1 r15) {
        yi1 r0 = j;
        Object r1 = c;
        monitor-enter(r1);
        x03 r2 = r0.h;     // Catch: Throwable -> L7
        if (r2 == null) goto L9;
        k.addAndGet(1);     // Catch: Throwable -> L7
    L9:
        Object r16 = v(r0, r15);     // Catch: Throwable -> L7
        monitor-exit(r1);
        if (r2 != null) goto L54;
    L23:
        Object r3 = c;
        monitor-enter(r3);
        f();     // Catch: Throwable -> L38
        if (r2 == null) goto L44;
        Object[] r4 = r2.b;     // Catch: Throwable -> L38
        long[] r5 = r2.a;     // Catch: Throwable -> L38
        int r6 = r5.length - 2;     // Catch: Throwable -> L38
        if (r6 < 0) goto L44;
        int r7 = 0;
    L30:
        long r8 = r5[r7];     // Catch: Throwable -> L38
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L42;
        int r9 = 8 - ((~(r7 - r6)) >>> 31);     // Catch: Throwable -> L38
        int r10 = 0;
    L33:
        if (r10 >= r9) goto L41;
        if ((255 & r8) >= 128) goto L40;
        q((rl4) r4[(r7 << 3) + r10]);     // Catch: Throwable -> L38
    L40:
        r8 = r8 >> 8;
        r10 = r10 + 1;
        goto L33
    L41:
        if (r9 != 8) goto L44;
    L42:
        if (r7 == r6) goto L44;
        r7 = r7 + 1;
    L44:
        monitor-exit(r3);
        return r16;
    L38:
        th = move-exception;
        throw th;
    L54:
        List r11 = h;     // Catch: Throwable -> L18
        x54 r12 = new x54(r2);     // Catch: Throwable -> L18
        int r13 = r11.size();     // Catch: Throwable -> L18
        int r14 = 0;
    L15:
        if (r14 >= r13) goto L20;
        ((wf1) r11.get(r14)).invoke(r12, r0);     // Catch: Throwable -> L18
        r14 = r14 + 1;
        goto L15
    L20:
        k.addAndGet(-1);
    L18:
        th = move-exception;
        k.addAndGet(-1);
        throw th;
    L7:
        th = move-exception;
        throw th;
    }

    public static final void f() {
        ue1 r0 = g;
        int r1 = r0.o;
        int r3 = 0;
        int r4 = 0;
    L3:
        Object r5 = null;
        if (r3 >= r1) goto L15;
        i95 r6 = ((i95[]) r0.q)[r3];
        if (r6 == null) goto L8;
        r5 = r6.get();
    L8:
        if (r5 == null) goto L14;
        if (p((rl4) r5) == false) goto L14;
        if (r4 == r3) goto L13;
        ((i95[]) r0.q)[r4] = r6;
        int[] r7 = (int[]) r0.p;
        r7[r4] = r7[r3];
    L13:
        r4 = r4 + 1;
    L14:
        r3 = r3 + 1;
        goto L3
    L15:
        int r8 = r4;
    L16:
        if (r8 >= r1) goto L18;
        ((i95[]) r0.q)[r8] = null;
        ((int[]) r0.p)[r8] = 0;
        r8 = r8 + 1;
        goto L16
    L18:
        if (r4 == r1) goto L26;
        r0.o = r4;
        return;
    }

    public static final ch4 g(ch4 r8, if1 r9, boolean r10) {
        boolean r0 = r8 instanceof a13;
        if (r0 == true) goto L9;
        if (r8 == null) goto L9;
        return new px4(r8, r9, false, r10);
    L9:
        if (r0 == false) goto L12;
        a13 r11 = (a13) r8;
    L14:
        return new ox4(r11, r9, null, false, r10);
    L12:
        r11 = null;
        goto L14
    }

    public static final tl4 h(tl4 r4) {
        ch4 r0 = j();
        tl4 r1 = s(r4, r0.g(), r0.d());
        if (r1 != null) goto L15;
        Object r2 = c;
        monitor-enter(r2);
        ch4 r3 = j();     // Catch: Throwable -> L12
        tl4 r5 = s(r4, r3.g(), r3.d());     // Catch: Throwable -> L12
        monitor-exit(r2);
        if (r5 == null) goto L10;
        return r5;
    L10:
        r();
        throw null;
    L12:
        th = move-exception;
        throw th;
    L15:
        return r1;
    }

    public static final tl4 i(tl4 r3, ch4 r4) {
        tl4 r0 = s(r3, r4.g(), r4.d());
        if (r0 != null) goto L15;
        Object r1 = c;
        monitor-enter(r1);
        tl4 r5 = s(r3, r4.g(), r4.d());     // Catch: Throwable -> L12
        monitor-exit(r1);
        if (r5 == null) goto L10;
        return r5;
    L10:
        r();
        throw null;
    L12:
        th = move-exception;
        throw th;
    L15:
        return r0;
    }

    public static final ch4 j() {
        ch4 r0 = (ch4) b.f();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return j;
    }

    public static final if1 k(if1 r1, if1 r2, boolean r3) {
        if (r3 == true) goto L5;
        r2 = null;
    L5:
        if (r1 == null) goto L10;
        if (r2 == null) goto L10;
        if (r1 == r2) goto L10;
        return new hh4(r1, r2, 0);
    L10:
        if (r1 != null) goto L12;
        return r2;
    L12:
        return r1;
    }

    public static final if1 l(if1 r2, if1 r3) {
        if (r2 == null) goto L7;
        if (r3 == null) goto L7;
        if (r2 == r3) goto L7;
        return new hh4(r2, r3, 1);
    L7:
        if (r2 != null) goto L9;
        return r3;
    L9:
        return r2;
    }

    public static final tl4 m(tl4 r10, rl4 r11) {
        tl4 r0 = r11.a();
        long r1 = e;
        fd r3 = f;
        if (r3.a <= 0) goto L5;
        r1 = ((long[]) r3.c)[0];
    L5:
        long r2 = r1 - 1;
        tl4 r4 = null;
        tl4 r5 = null;
    L6:
        if (r0 == null) goto L24;
        long r6 = r0.a;
        if (r6 == 0) goto L20;
        if (r6 == 0) goto L22;
        if (h12.k(r6, r2) > 0) goto L22;
        if (gh4.r.d(r6) == true) goto L22;
        if (r5 != null) goto L19;
        r5 = r0;
        goto L22
    L19:
        if (h12.k(r0.a, r5.a) < 0) goto L20;
        r4 = r5;
    L22:
        r0 = r0.b;
    L20:
        r4 = r0;
    L24:
        if (r4 == null) goto L27;
        r4.a = Long.MAX_VALUE;
        return r4;
    L27:
        tl4 r12 = r10.b(Long.MAX_VALUE);
        r12.b = r11.a();
        r11.d(r12);
        return r12;
    }

    public static final void n(ch4 r1, rl4 r2) {
        r1.t(r1.h() + 1);
        if1 r3 = r1.i();
        if (r3 == null) goto L6;
        r3.invoke(r2);
        return;
    }

    public static final tl4 o(tl4 r4, sl4 r5, ch4 r6, tl4 r7) {
        if (r6.f() == false) goto L5;
        r6.n(r5);
    L5:
        long r0 = r6.g();
        if (r7.a != r0) goto L8;
        return r7;
    L8:
        Object r8 = c;
        monitor-enter(r8);
        tl4 r9 = m(r4, r5);     // Catch: Throwable -> L14
        monitor-exit(r8);
        r9.a = r0;
        r6.n(r5);
        return r9;
    L14:
        th = move-exception;
        throw th;
    }

    public static final boolean p(rl4 r15) {
        tl4 r0 = r15.a();
        long r1 = e;
        fd r3 = f;
        if (r3.a <= 0) goto L5;
        r1 = ((long[]) r3.c)[0];
    L5:
        tl4 r4 = null;
        tl4 r5 = null;
        int r6 = 0;
    L6:
        if (r0 == null) goto L32;
        long r7 = r0.a;
        if (r7 == 0) goto L30;
        if (h12.k(r7, r1) >= 0) goto L29;
        if (r4 != null) goto L14;
        r6 = r6 + 1;
        r4 = r0;
        goto L30
    L14:
        if (h12.k(r0.a, r4.a) >= 0) goto L16;
        tl4 r8 = r4;
        r4 = r0;
    L17:
        if (r5 != null) goto L28;
        r5 = r15.a();
        tl4 r9 = r5;
    L19:
        if (r5 == null) goto L27;
        if (h12.k(r5.a, r1) >= 0) goto L28;
        if (h12.k(r9.a, r5.a) >= 0) goto L26;
        r9 = r5;
    L26:
        r5 = r5.b;
        goto L19
    L27:
        r5 = r9;
    L28:
        r4.a = 0;
        r4.a(r5);
        r4 = r8;
        goto L30
    L16:
        r8 = r0;
        goto L17
    L29:
        r6 = r6 + 1;
    L30:
        r0 = r0.b;
        goto L6
    L32:
        if (r6 <= 1) goto L34;
        return true;
    L34:
        return false;
    }

    public static final void q(rl4 r10) {
        if (p(r10) == false) goto L66;
        ue1 r0 = g;
        int r1 = r0.o;
        int r2 = System.identityHashCode(r10);
        int r4 = -1;
        if (r1 <= 0) goto L47;
        int r5 = r0.o - 1;
        int r6 = 0;
    L7:
        if (r6 > r5) goto L44;
        int r7 = (r6 + r5) >>> 1;
        int r8 = ((int[]) r0.p)[r7];
        if (r8 < r2) goto L10;
        if (r8 <= r2) goto L13;
        r5 = r7 - 1;
        goto L7
    L13:
        i95 r9 = ((i95[]) r0.q)[r7];
        if (r9 == null) goto L16;
        Object r11 = r9.get();
    L17:
        if (r10 != r11) goto L19;
    L18:
        r4 = r7;
    L45:
        if (r4 < 0) goto L47;
        return;
    L19:
        int r12 = r7 - 1;
    L20:
        if ((-1) >= r12) goto L31;
        if (((int[]) r0.p)[r12] != r2) goto L31;
        i95 r13 = ((i95[]) r0.q)[r12];
        if (r13 == null) goto L27;
        Object r14 = r13.get();
    L28:
        if (r14 == r10) goto L29;
        r12 = r12 - 1;
        goto L20
    L29:
        r4 = r12;
        goto L45
    L27:
        r14 = null;
    L31:
        r7 = r7 + 1;
        int r15 = r0.o;
    L32:
        if (r7 >= r15) goto L43;
        if (((int[]) r0.p)[r7] != r2) goto L35;
        i95 r16 = ((i95[]) r0.q)[r7];
        if (r16 == null) goto L39;
        Object r17 = r16.get();
    L40:
        if (r17 == r10) goto L18;
        r7 = r7 + 1;
        goto L32
    L39:
        r17 = null;
        goto L40
    L35:
        r4 = -(r7 + 1);
        goto L45
    L43:
        r4 = -(r0.o + 1);
        goto L45
    L16:
        r11 = null;
        goto L17
    L10:
        r6 = r7 + 1;
        goto L7
    L44:
        r4 = -(r6 + 1);
    L47:
        int r18 = -(r4 + 1);
        i95[] r19 = (i95[]) r0.q;
        int r20 = r19.length;
        if (r1 != r20) goto L50;
        int r21 = r20 * 2;
        i95[] r22 = new i95[r21];
        int[] r23 = new int[r21];
        int r24 = r18 + 1;
        System.arraycopy(r19, r18, r22, r24, r1 - r18);
        System.arraycopy((i95[]) r0.q, 0, r22, 0, r18);
        ti.Y(r24, r18, r1, (int[]) r0.p, r23);
        ti.b0(0, r18, 6, (int[]) r0.p, r23);
        r0.q = r22;
        r0.p = r23;
    L51:
        ((i95[]) r0.q)[r18] = new i95(r10);
        ((int[]) r0.p)[r18] = r2;
        r0.o++;
        return;
    L50:
        int r3 = r18 + 1;
        System.arraycopy(r19, r18, r19, r3, r1 - r18);
        int[] r25 = (int[]) r0.p;
        ti.Y(r3, r18, r1, r25, r25);
        goto L51
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final tl4 s(tl4 r6, long r7, gh4 r9) {
        tl4 r1 = null;
    L3:
        if (r6 == null) goto L16;
        long r2 = r6.a;
        if (r2 == 0) goto L15;
        if (h12.k(r2, r7) > 0) goto L15;
        if (r9.d(r2) == true) goto L15;
        if (r1 != null) goto L13;
    L14:
        r1 = r6;
        goto L15
    L13:
        if (h12.k(r1.a, r6.a) < 0) goto L14;
    L15:
        r6 = r6.b;
        goto L3
    L16:
        if (r1 == null) goto L18;
        return r1;
    L18:
        return null;
    }

    public static final tl4 t(tl4 r3, rl4 r4) {
        ch4 r0 = j();
        if1 r1 = r0.e();
        if (r1 == null) goto L5;
        r1.invoke(r4);
    L5:
        tl4 r5 = s(r3, r0.g(), r0.d());
        if (r5 != null) goto L18;
        Object r6 = c;
        monitor-enter(r6);
        ch4 r2 = j();     // Catch: Throwable -> L15
        tl4 r7 = r4.a();     // Catch: Throwable -> L15
        r7.getClass();     // Catch: Throwable -> L15
        tl4 r8 = s(r7, r2.g(), r2.d());     // Catch: Throwable -> L15
        if (r8 == null) goto L13;
        monitor-exit(r6);
        return r8;
    L13:
        r();     // Catch: Throwable -> L15
        throw null;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L18:
        return r5;
    }

    public static final void u(int r10) {
        fd r0 = f;
        int r1 = ((int[]) r0.e)[r10];
        r0.d(r1, r0.a - 1);
        r0.a--;
        long[] r2 = (long[]) r0.c;
        long r3 = r2[r1];
        int r5 = r1;
    L3:
        if (r5 <= 0) goto L7;
        int r6 = ((r5 + 1) >> 1) - 1;
        if (h12.k(r2[r6], r3) <= 0) goto L7;
        r0.d(r6, r5);
        r5 = r6;
    L7:
        long[] r4 = (long[]) r0.c;
        int r7 = r0.a >> 1;
    L8:
        if (r1 >= r7) goto L19;
        int r8 = (r1 + 1) << 1;
        int r9 = r8 - 1;
        if (r8 >= r0.a) goto L17;
        if (h12.k(r4[r8], r4[r9]) >= 0) goto L17;
        if (h12.k(r4[r8], r4[r1]) >= 0) goto L19;
        r0.d(r8, r1);
        r1 = r8;
    L17:
        if (h12.k(r4[r9], r4[r1]) >= 0) goto L19;
        r0.d(r9, r1);
        r1 = r9;
    L19:
        ((int[]) r0.e)[r10] = r0.b;
        r0.b = r10;
    }

    public static final Object v(yi1 r6, if1 r7) {
        long r0 = r6.b;
        Object r8 = r7.invoke(d.b(r0));
        long r2 = e;
        e = 1 + r2;
        gh4 r1 = d.b(r0);
        d = r1;
        r6.b = r2;
        r6.a = r1;
        r6.g = 0;
        r6.h = null;
        r6.o();
        d = d.f(r2);
        return r8;
    }

    public static final tl4 w(tl4 r7, rl4 r8, ch4 r9) {
        if (r9.f() == false) goto L5;
        r9.n(r8);
    L5:
        long r0 = r9.g();
        tl4 r10 = s(r7, r0, r9.d());
        if (r10 != null) goto L19;
        Object r11 = c;
        monitor-enter(r11);
        ch4 r3 = j();     // Catch: Throwable -> L15
        tl4 r4 = r8.a();     // Catch: Throwable -> L15
        r4.getClass();     // Catch: Throwable -> L15
        tl4 r5 = s(r4, r3.g(), r3.d());     // Catch: Throwable -> L15
        if (r5 == null) goto L13;
        monitor-exit(r11);
        r10 = r5;
        goto L19
    L13:
        r();     // Catch: Throwable -> L15
        throw null;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L19:
        if (r10.a != r9.g()) goto L21;
        return r10;
    L21:
        Object r12 = c;
        monitor-enter(r12);
        tl4 r6 = s(r8.a(), r0, r9.d());     // Catch: Throwable -> L33
        if (r6 != null) goto L26;
        r();     // Catch: Throwable -> L33
        throw null;     // Catch: Throwable -> L33
    L26:
        if (r6.a == r0) goto L30;
        tl4 r1 = m(r6, r8);     // Catch: Throwable -> L33
        r1.a(r6);     // Catch: Throwable -> L33
        r1.a = r9.g();     // Catch: Throwable -> L33
        r6 = r1;
    L30:
        monitor-exit(r12);
        r9.n(r8);
        return r6;
    L33:
        th = move-exception;
        throw th;
    }
}
