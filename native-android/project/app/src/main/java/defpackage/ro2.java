package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 {
    public final zt4 a;
    public final bu4 b;
    public final nj0 c;
    public final yp4 d;
    public final cn e;
    public long f;
    public int g;
    public boolean h;
    public oo2 i;
    public oo2 j;
    public oo2 k;
    public oo2 l;
    public oo2 m;
    public int n;
    public Object o;
    public long p;
    public ArrayList q;

    public ro2(nj0 r1, yp4 r2, cn r3) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
        this.a = new zt4();
        this.b = new bu4();
        this.q = new ArrayList();
    }

    public static mt2 p(cu4 r14, Object r15, long r16, long r18, bu4 r20, zt4 r21) {
        r14.g(r15, r21);
        r14.n(r21.c, r20);
        int r5 = r14.b(r15);
        Object r7 = r15;
    L3:
        int r3 = r21.g.a;
        if (r3 == 0) goto L29;
        int r9 = 0;
        if (r3 != 1) goto L10;
        if (r21.g(0) == true) goto L29;
    L10:
        if (r21.h(r21.g.d) == false) goto L29;
        long r10 = 0;
        if (r21.c(0) != (-1)) goto L29;
        if (r21.d == 0) goto L27;
        if (r21.g(r3 - 1) == false) goto L20;
        int r12 = 2;
    L21:
        int r4 = r3 - r12;
    L22:
        if (r9 > r4) goto L25;
        r10 = r10 + r21.g.a(r9).j;
        r9 = r9 + 1;
        goto L22
    L25:
        if (r21.d > r10) goto L29;
    L20:
        r12 = 1;
    L27:
        if (r5 > r20.n) goto L29;
        r14.f(r5, r21, true);
        r7 = r21.b;
        r7.getClass();
        r5 = r5 + 1;
    L29:
        r14.g(r7, r21);
        int r8 = r21.c(r16);
        if (r8 != (-1)) goto L34;
        return new mt2(r7, r18, r21.b(r16));
    L34:
        return new mt2(r7, r8, r21.f(r8), r18, -1);
    }

    public final oo2 a() {
        oo2 r0 = this.i;
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0 != this.j) goto L9;
        this.j = r0.m;
    L9:
        if (r0 != this.k) goto L11;
        this.k = r0.m;
    L11:
        r0.i();
        int r1 = this.n - 1;
        this.n = r1;
        if (r1 != 0) goto L14;
        this.l = null;
        oo2 r2 = this.i;
        this.o = r2.b;
        this.p = r2.g.a.d;
    L14:
        this.i = this.i.m;
        m();
        return this.i;
    }

    public final void b() {
        if (this.n != 0) goto L5;
        return;
    L5:
        oo2 r0 = this.i;
        r0.getClass();
        this.o = r0.b;
        this.p = r0.g.a.d;
    L6:
        if (r0 == null) goto L8;
        r0.i();
        r0 = r0.m;
        goto L6
    L8:
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    public final po2 c(cu4 r19, oo2 r20, long r21) {
        po2 r2 = r20.g;
        mt2 r10 = r2.a;
        long r11 = r2.c;
        int r3 = r19.d(r19.b(r10.a), this.a, this.b, this.g, this.h);
        if (r3 == (-1)) goto L46;
        zt4 r13 = this.a;
        int r4 = r19.f(r3, r13, true).c;
        Object r5 = r13.b;
        r5.getClass();
        long r6 = r10.d;
        long r14 = 0;
        if (r19.m(r4, this.b, 0).m != r3) goto L21;
        Pair r7 = r19.j(this.b, this.a, r4, -9223372036854775807L, Math.max(0, r21));
        if (r7 != null) goto L11;
        return null;
    L11:
        Object r8 = r7.first;
        long r15 = ((Long) r7.second).longValue();
        oo2 r1 = r20.m;
        if (r1 != null) goto L14;
    L17:
        long r9 = r(r8);
        if (r9 != (-1)) goto L20;
        r9 = this.f;
        this.f = 1 + r9;
    L20:
        r6 = r9;
    L16:
        Object r12 = r8;
        long r16 = r15;
        r14 = -9223372036854775807L;
    L22:
        mt2 r17 = p(r19, r12, r16, r6, this.b, this.a);
        if (r14 != (-9223372036854775807L)) goto L25;
    L43:
        long r18 = r16;
    L42:
        long r22 = r14;
    L45:
        return e(r19, r17, r22, r18);
    L25:
        if (r11 == (-9223372036854775807L)) goto L43;
        int r23 = r19.g(r10.a, r13).g.a;
        int r24 = r13.g.d;
        if (r23 > 0) goto L29;
    L35:
        boolean r25 = false;
    L37:
        if (r17.b() == false) goto L40;
        if (r25 == false) goto L40;
        r18 = r16;
        r22 = r11;
    L40:
        if (r25 == false) goto L43;
        r18 = r11;
        goto L42
    L29:
        if (r13.h(r24) == false) goto L35;
        if (r23 <= 1) goto L33;
    L34:
        r25 = true;
        goto L37
    L33:
        if (r13.d(r24) == Long.MIN_VALUE) goto L35;
    L14:
        if (r1.b.equals(r8) == false) goto L17;
        r6 = r1.g.a.d;
        goto L16
    L21:
        r12 = r5;
        r16 = 0;
        goto L22
    L46:
        return null;
    }

    public final po2 d(cu4 r16, oo2 r17, long r18) {
        po2 r8 = r17.g;
        long r3 = (r17.p + r8.e) - r18;
        if (r8.h == true) goto L5;
        mt2 r9 = r8.a;
        Object r10 = r9.a;
        int r5 = r9.e;
        zt4 r2 = this.a;
        r16.g(r10, r2);
        boolean r7 = r8.g;
        if (r9.b() == false) goto L30;
        int r4 = r9.b;
        int r6 = r2.g.a(r4).b;
        if (r6 == (-1)) goto L54;
        int r11 = r9.c;
        int r12 = r2.g.a(r4).a(r11);
        if (r12 < r6) goto L14;
        long r0 = r8.c;
        if (r0 != (-9223372036854775807L)) goto L22;
        int r13 = r2.c;
        long r14 = Math.max(0, r3);
        Pair r1 = r16.j(this.b, r2, r13, -9223372036854775807L, r14);
        cu4 r15 = r16;
        if (r1 != null) goto L21;
        return null;
    L21:
        r0 = ((Long) r1.second).longValue();
    L23:
        int r19 = r9.b;
        r15.g(r10, r2);
        long r20 = r2.d(r19);
        if (r20 != Long.MIN_VALUE) goto L26;
        long r21 = r2.d;
    L28:
        return g(r16, r9.a, Math.max(r21, r0), r8.c, r9.d, r7);
    L26:
        r21 = r2.g.a(r19).j + r20;
        goto L28
    L22:
        r15 = r16;
        goto L23
    L14:
        return f(r16, r9.a, r4, r12, r8.c, r9.d, r7);
    L54:
        return null;
    L30:
        if (r5 != (-1)) goto L32;
    L35:
        int r22 = r2.f(r5);
        if (r2.h(r5) == true) goto L38;
    L40:
        boolean r23 = false;
    L42:
        if (r22 == r2.g.a(r5).b) goto L47;
        if (r23 == true) goto L47;
        return f(r16, r9.a, r9.e, r22, r8.e, r9.d, r7);
    L47:
        r16.g(r10, r2);
        long r24 = r2.d(r5);
        if (r24 != Long.MIN_VALUE) goto L51;
        long r25 = r2.d;
    L50:
        long r26 = r25;
        return g(r16, r9.a, r26, r8.e, r9.d, false);
    L51:
        r25 = r2.g.a(r5).j + r24;
        goto L50
    L38:
        if (r2.e(r5, r22) != 3) goto L40;
        r23 = true;
        goto L42
    L32:
        if (r2.g(r5) == false) goto L35;
        return c(r16, r17, r3);
    L5:
        return c(r16, r17, r3);
    }

    public final po2 e(cu4 r12, mt2 r13, long r14, long r16) {
        r12.g(r13.a, this.a);
        boolean r0 = r13.b();
        Object r3 = r13.a;
        if (r0 == false) goto L7;
        return f(r12, r3, r13.b, r13.c, r14, r13.d, false);
    L7:
        return g(r12, r3, r16, r14, r13.d, false);
    }

    public final po2 f(cu4 r16, Object r17, int r18, int r19, long r20, long r22, boolean r24) {
        mt2 r0 = new mt2(r17, r18, r19, r22, -1);
        zt4 r15 = this.a;
        long r8 = r16.g(r17, r15).a(r18, r19);
        if (r19 != r15.f(r18)) goto L5;
        long r6 = r15.g.b;
    L6:
        boolean r11 = r15.h(r18);
        if (r8 == (-9223372036854775807L)) goto L12;
        if (r6 < r8) goto L12;
        r6 = Math.max(0, r8 - 1);
    L12:
        return new po2(r0, r6, r20, -9223372036854775807L, r8, r24, r11, false, false, false);
    L5:
        r6 = 0;
        goto L6
    }

    public final po2 g(cu4 r27, Object r28, long r29, long r31, long r33, boolean r35) {
        zt4 r5 = this.a;
        r27.g(r28, r5);
        int r6 = r5.b(r29);
        int r7 = 1;
        if (r6 != (-1)) goto L10;
        z5 r10 = r5.g;
        if (r10.a > 0) goto L7;
    L26:
        boolean r11 = false;
    L27:
        mt2 r12 = new mt2(r28, r33, r6);
        if (r12.b() == true) goto L31;
        if (r6 != (-1)) goto L31;
        boolean r2 = true;
    L32:
        boolean r24 = k(r27, r12);
        boolean r25 = j(r27, r12, r2);
        if (r6 != (-1)) goto L35;
    L39:
        boolean r22 = false;
    L40:
        if (r6 != (-1)) goto L42;
    L46:
        boolean r0 = false;
    L48:
        if (r6 == (-1)) goto L52;
        if (r0 == true) goto L52;
        long r1 = r5.d(r6);
    L51:
        long r17 = r1;
    L56:
        if (r17 != (-9223372036854775807L)) goto L58;
    L61:
        long r19 = r5.d;
    L63:
        if (r19 != (-9223372036854775807L)) goto L65;
    L71:
        long r13 = r29;
    L73:
        return new po2(r12, r13, r31, r17, r19, r35, r22, r2, r24, r25);
    L65:
        if (r29 < r19) goto L71;
        if (r25 == true) goto L70;
        if (r11 == false) goto L70;
        r7 = 0;
    L70:
        r13 = Math.max(0, r19 - ((long) r7));
        goto L73
    L58:
        if (r17 == Long.MIN_VALUE) goto L61;
        r19 = r17;
    L52:
        if (r11 == false) goto L54;
        r1 = r5.d;
        goto L51
    L54:
        r17 = -9223372036854775807L;
        goto L56
    L42:
        if (r5.g(r6) == false) goto L46;
        if (r5.h(r6) == false) goto L46;
        r0 = true;
        goto L48
    L35:
        if (r5.h(r6) == false) goto L39;
        if (r5.g(r6) == true) goto L39;
        r22 = true;
    L31:
        r2 = false;
        goto L32
    L7:
        if (r5.h(r10.d) == false) goto L26;
        r11 = true;
        goto L27
    L10:
        if (r5.h(r6) == false) goto L26;
        if (r5.d(r6) != r5.d) goto L26;
        x5 r14 = r5.g.a(r6);
        int r15 = r14.b;
        if (r15 != (-1)) goto L16;
    L15:
        boolean r16 = true;
    L24:
        if (r16 == true) goto L26;
        r11 = true;
        r6 = -1;
        goto L27
    L16:
        int r18 = 0;
    L17:
        if (r18 >= r15) goto L23;
        int r110 = r14.f[r18];
        if (r110 == 0) goto L15;
        if (r110 == 1) goto L15;
        r18 = r18 + 1;
        goto L17
    L23:
        r16 = false;
        goto L24
    }

    public final oo2 h() {
        return this.k;
    }

    public final po2 i(cu4 r18, po2 r19) {
        mt2 r3 = r19.a;
        boolean r4 = r3.b();
        int r5 = r3.e;
        boolean r6 = false;
        if (r4 == true) goto L6;
        if (r5 != (-1)) goto L6;
        boolean r12 = true;
    L7:
        int r7 = r3.b;
        boolean r13 = k(r18, r3);
        boolean r14 = j(r18, r3, r12);
        Object r9 = r3.a;
        zt4 r0 = this.a;
        r18.g(r9, r0);
        if (r3.b() == true) goto L12;
        if (r5 == (-1)) goto L12;
        long r15 = r0.d(r5);
    L14:
        if (r3.b() == false) goto L17;
        long r10 = r0.a(r7, r3.c);
    L24:
        if (r3.b() == false) goto L27;
        r6 = r0.h(r7);
    L26:
        boolean r11 = r6;
    L32:
        return new po2(r3, r19.b, r19.c, r15, r10, r19.f, r11, r12, r13, r14);
    L27:
        if (r5 == (-1)) goto L26;
        if (r0.h(r5) == false) goto L26;
        r11 = true;
        goto L32
    L17:
        if (r15 != (-9223372036854775807L)) goto L19;
    L22:
        r10 = r0.d;
        goto L24
    L19:
        if (r15 == Long.MIN_VALUE) goto L22;
        r10 = r15;
    L12:
        r15 = -9223372036854775807L;
    L6:
        r12 = false;
        goto L7
    }

    public final boolean j(cu4 r8, mt2 r9, boolean r10) {
        int r1 = r8.b(r9.a);
        if (r8.m(r8.f(r1, this.a, false).c, this.b, 0).h == true) goto L9;
        int r4 = this.g;
        boolean r5 = this.h;
        if (r8.d(r1, this.a, this.b, r4, r5) != (-1)) goto L9;
        if (r10 == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean k(cu4 r6, mt2 r7) {
        if (r7.b() == false) goto L5;
    L7:
        boolean r0 = false;
    L8:
        Object r8 = r7.a;
        if (r0 == false) goto L14;
        int r1 = r6.g(r8, this.a).c;
        if (r6.m(r1, this.b, 0).n != r6.b(r8)) goto L14;
        return true;
    L14:
        return false;
    L5:
        if (r7.e != (-1)) goto L7;
        r0 = true;
        goto L8
    }

    public final void l() {
        oo2 r0 = this.m;
        if (r0 != null) goto L5;
    L7:
        this.m = null;
        int r1 = 0;
    L9:
        if (r1 >= this.q.size()) goto L18;
        oo2 r2 = (oo2) this.q.get(r1);
        if (r2.h() == false) goto L12;
        r1 = r1 + 1;
        goto L9
    L12:
        this.m = r2;
        return;
    L18:
        return;
    L5:
        if (r0.h() == true) goto L7;
    }

    public final void m() {
        uw1 r0 = yw1.j();
        oo2 r1 = this.i;
    L3:
        if (r1 == null) goto L5;
        r0.c(r1.g.a);
        r1 = r1.m;
        goto L3
    L5:
        oo2 r2 = this.j;
        if (r2 != null) goto L8;
        mt2 r3 = null;
    L9:
        qo2 r4 = new qo2(this, r0, r3, 0);
        this.d.d(r4);
        return;
    L8:
        r3 = r2.g.a;
        goto L9
    }

    public final void n(long r4) {
        oo2 r3 = this.l;
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.m != null) goto L7;
        boolean r0 = true;
    L8:
        rr2.w(r0);
        if (r3.e == false) goto L13;
        r3.a.u(r4 - r3.p);
        return;
    L13:
        return;
    L7:
        r0 = false;
        goto L8
    }

    public final int o(oo2 r3) {
        r3.getClass();
        int r1 = 0;
        if (r3 == this.l) goto L19;
        this.l = r3;
    L5:
        r3 = r3.m;
        if (r3 == null) goto L14;
        if (r3 != this.j) goto L11;
        oo2 r0 = this.i;
        this.j = r0;
        this.k = r0;
        r1 = 3;
    L11:
        if (r3 != this.k) goto L13;
        this.k = this.j;
        r1 = r1 | 2;
    L13:
        r3.i();
        this.n--;
        goto L5
    L14:
        oo2 r4 = this.l;
        r4.getClass();
        if (r4.m == null) goto L18;
        r4.b();
        r4.m = null;
        r4.c();
    L18:
        m();
    L19:
        return r1;
    }

    public final mt2 q(cu4 r15, Object r16, long r17) {
        Object r1 = r16;
        zt4 r2 = this.a;
        int r3 = r15.g(r1, r2).c;
        Object r4 = this.o;
        if (r4 == null) goto L9;
        int r5 = r15.b(r4);
        if (r5 == (-1)) goto L9;
        if (r15.f(r5, r2, false).c != r3) goto L9;
        long r6 = this.p;
    L29:
        r15.g(r1, r2);
        int r7 = r2.c;
        bu4 r8 = this.b;
        r15.n(r7, r8);
        int r9 = r15.b(r16);
        boolean r10 = false;
    L31:
        if (r9 < r8.m) goto L46;
        boolean r11 = true;
        r15.f(r9, r2, true);
        if (r2.g.a > 0) goto L36;
        r11 = false;
    L36:
        r10 = r10 | r11;
        if (r2.c(r2.d) == (-1)) goto L39;
        r1 = r2.b;
        r1.getClass();
    L39:
        if (r10 == false) goto L44;
        if (r11 == false) goto L46;
        if (r2.d != 0) goto L46;
    L44:
        r9 = r9 - 1;
    L46:
        return p(r15, r1, r17, r6, this.b, this.a);
    L9:
        oo2 r12 = this.i;
    L10:
        if (r12 == null) goto L15;
        if (r12.b.equals(r1) == true) goto L13;
        r12 = r12.m;
        goto L10
    L13:
        r6 = r12.g.a.d;
        goto L29
    L15:
        oo2 r13 = this.i;
    L16:
        if (r13 == null) goto L23;
        int r14 = r15.b(r13.b);
        if (r14 == (-1)) goto L22;
        if (r15.f(r14, r2, false).c != r3) goto L22;
        r6 = r13.g.a.d;
    L22:
        r13 = r13.m;
        goto L16
    L23:
        r6 = r(r1);
        if (r6 != (-1)) goto L29;
        r6 = this.f;
        this.f = 1 + r6;
        if (this.i != null) goto L29;
        this.o = r1;
        this.p = r6;
        goto L29
    }

    public final long r(Object r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.q.size()) goto L10;
        oo2 r1 = (oo2) this.q.get(r0);
        if (r1.b.equals(r4) == true) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        return r1.g.a.d;
    L10:
        return -1;
    }

    public final int s(cu4 r8) {
        oo2 r0 = this.i;
        if (r0 != null) goto L6;
        return 0;
    L6:
        int r2 = r8.b(r0.b);
    L7:
        int r5 = this.g;
        boolean r6 = this.h;
        cu4 r1 = r8;
        r2 = r1.d(r2, this.a, this.b, r5, r6);
    L8:
        oo2 r9 = r0.m;
        if (r9 == null) goto L14;
        if (r0.g.h == true) goto L14;
        r0 = r9;
    L14:
        if (r2 == (-1)) goto L21;
        if (r9 == null) goto L21;
        if (r1.b(r9.b) != r2) goto L21;
        r0 = r9;
        r8 = r1;
    L21:
        int r10 = o(r0);
        r0.g = i(r1, r0.g);
        return r10;
    }

    public final int t(cu4 r18, long r19, long r21, long r23) {
        oo2 r2 = this.i;
        oo2 r3 = null;
    L3:
        int r4 = 0;
        if (r2 == null) goto L63;
        po2 r5 = r2.g;
        if (r3 != null) goto L8;
        po2 r6 = i(r18, r5);
    L15:
        long r8 = r6.e;
        long r10 = r5.c;
        long r12 = r5.e;
        r2.g = r6.a(r10);
        if (r12 != r8) goto L17;
        r3 = r2;
        r2 = r2.m;
        goto L3
    L17:
        r2.k();
        if (r8 != (-9223372036854775807L)) goto L20;
        long r9 = Long.MAX_VALUE;
    L22:
        if (r2 == this.j) goto L24;
    L30:
        boolean r1 = false;
    L32:
        if (r2 == this.k) goto L34;
    L38:
        boolean r11 = false;
    L39:
        int r0 = o(r2);
        if (r0 == 0) goto L43;
        return r0;
    L43:
        if (r12 == (-9223372036854775807L)) goto L45;
    L51:
        boolean r7 = false;
    L52:
        if (r1 == false) goto L56;
        if (r12 != (-9223372036854775807L)) goto L55;
        if (r7 == false) goto L56;
    L55:
        r4 = 1;
    L56:
        if (r11 == true) goto L58;
        return r4;
    L58:
        return r4 | 2;
    L45:
        if (r5.d != Long.MIN_VALUE) goto L51;
        long r13 = r6.d;
        if (r13 == (-9223372036854775807L)) goto L51;
        if (r13 == Long.MIN_VALUE) goto L51;
        r7 = true;
        goto L52
    L34:
        if (r23 != Long.MIN_VALUE) goto L36;
    L37:
        r11 = true;
        goto L39
    L36:
        if (r23 < r9) goto L38;
    L24:
        if (r2.g.g == true) goto L30;
        if (r21 != Long.MIN_VALUE) goto L28;
    L29:
        r1 = true;
        goto L32
    L28:
        if (r21 < r9) goto L30;
    L20:
        r9 = r8 + r2.p;
        goto L22
    L8:
        po2 r14 = d(r18, r3, r19);
        if (r14 == null) goto L62;
        if (r5.b != r14.b) goto L62;
        if (r5.a.equals(r14.a) == false) goto L62;
        r6 = r14;
    L62:
        return o(r3);
    L63:
        return 0;
    }
}
