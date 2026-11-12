package defpackage;

import android.os.Looper;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qe4 extends fq {
    public final tc2 c;
    public final Looper d;
    public final yp4 e;
    public final HashSet f;
    public final zt4 g;
    public pe4 h;
    public boolean i;

    public qe4(Looper r5) {
        this.d = r5;
        vp4 r1 = vp4.a;
        this.e = r1.a(r5, null);
        this.f = new HashSet();
        this.g = new zt4();
        this.c = new tc2(r5, r1, new ss2(16, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static ArrayList Z0(pe4 r21, zt4 r22, bu4 r23) {
        cu4 r3 = r21.w;
        if ((r3 instanceof le4) == true) goto L5;
        ArrayList r4 = new ArrayList(r3.o());
        boolean r5 = false;
        int r6 = 0;
    L8:
        if (r6 >= r3.o()) goto L56;
        int r7 = r21.A;
        ?? r8 = r7;
        if (r7 != (-1)) goto L13;
        r8 = r5;
    L13:
        boolean r9 = true;
        if (r8 != r6) goto L16;
        boolean r10 = true;
    L17:
        r3.n(r6, r23);
        uw1 r11 = yw1.j();
        int r12 = r23.m;
    L18:
        long r13 = -9223372036854775807L;
        if (r12 > r23.n) goto L28;
        r3.f(r12, r22, r9);
        boolean r16 = r9;
        Object r14 = r22.b;
        r14.getClass();
        ie4 r15 = new ie4();
        r15.a = r14;
        r15.b = 0;
        z5 r17 = z5.f;
        r15.d = r5;
        r15.c = r22.g;
        int r18 = r6;
        long r19 = r22.d;
        if (r19 != (-9223372036854775807L)) goto L23;
    L26:
        boolean r110 = r16;
    L27:
        rr2.l(r110);
        r15.b = r19;
        r15.d = r22.f;
        r11.c(new je4(r15));
        r12 = r12 + 1;
        r9 = r16;
        r6 = r18;
        r5 = false;
        goto L18
    L23:
        if (r19 >= 0) goto L26;
        r110 = false;
        goto L27
    L28:
        int r111 = r6;
        boolean r112 = r9;
        ge4 r20 = new ge4(r23.a);
        long r113 = r23.k;
        if (r113 < 0) goto L31;
        boolean r24 = r112;
    L32:
        rr2.l(r24);
        r20.l = r113;
        r20.a(r23.l);
        r20.i = r23.f;
        r20.k = r23.h;
        r20.o = r23.j;
        r20.j = r23.g;
        r20.f = r23.i;
        r20.e = r23.c;
        r20.c = r23.b;
        if (r10 == false) goto L35;
        do2 r25 = r21.y;
    L36:
        r20.d = r25;
        gy3 r26 = r11.f();
        int r27 = r26.q;
        int r114 = 0;
    L38:
        if (r114 >= (r27 - 1)) goto L47;
        long r115 = r13;
        if (((je4) r26.get(r114)).b == r115) goto L42;
        boolean r116 = r112;
    L43:
        rr2.k("Periods other than last need a duration", r116);
        int r117 = r114 + 1;
        int r118 = r117;
    L44:
        if (r118 >= r27) goto L46;
        rr2.k("Duplicate PeriodData UIDs in period list", !((je4) r26.get(r114)).a.equals(((je4) r26.get(r118)).a));
        r118 = r118 + 1;
        goto L44
    L46:
        r114 = r117;
        r13 = r115;
        goto L38
    L42:
        r116 = false;
        goto L43
    L47:
        r20.p = yw1.k(r26);
        long r28 = r23.o;
        if (r28 >= 0) goto L51;
        r112 = false;
    L51:
        rr2.l(r112);
        r20.n = r28;
        r20.g = r23.d;
        if (r10 == false) goto L54;
        jw4 r29 = r21.x;
    L55:
        r20.b = r29;
        r20.h = r23.e;
        r4.add(new he4(r20));
        r6 = r111 + 1;
        r5 = false;
        goto L8
    L54:
        r29 = jw4.b;
        goto L55
    L35:
        r25 = null;
        goto L36
    L31:
        r24 = false;
        goto L32
    L16:
        r10 = r5;
        goto L17
    L56:
        return r4;
    L5:
        return new ArrayList(((le4) r3).e);
    }

    public static pe4 a1(oe4 r16, pe4 r17, long r18, cu4 r20, int r21, long r22, boolean r24, bu4 r25) {
        int r3 = r21;
        long r4 = h1(r18, r17, r25);
        if (r20.p() == true) goto L8;
        if (r3 != (-1)) goto L6;
    L7:
        long r12 = -9223372036854775807L;
        r3 = 0;
    L10:
        if (r20.p() == false) goto L12;
    L14:
        cu4 r7 = r17.w;
        xm r8 = r17.F;
        if (r7.p() == false) goto L17;
    L20:
        boolean r9 = true;
    L21:
        if (r9 == true) goto L29;
        cu4 r10 = r17.w;
        int r11 = r17.A;
        if (r11 != (-1)) goto L27;
        r11 = 0;
    L27:
        if (r10.m(r11, r25, 0).a.equals(r20.m(r3, r25, 0).a) == true) goto L29;
        boolean r13 = true;
    L31:
        if (r20.p() == false) goto L34;
        jw4 r14 = jw4.b;
        r16.w = null;
        r16.x = r20;
        r16.y = r14;
        r16.z = null;
    L47:
        if (r9 == true) goto L59;
        if (r13 == true) goto L59;
        if (r12 < r4) goto L59;
        if (r12 != r4) goto L58;
        r16.B = r3;
        if (r17.B == (-1)) goto L57;
        if (r24 == false) goto L57;
        r16.J = new xm(r17.G.n - r17.E.n);
    L61:
        return new pe4(r16);
    L57:
        r16.a();
        r16.J = new xm(h1(r8.n, r17, r25) - r4);
        goto L61
    L58:
        long r6 = Math.max(h1(r8.n, r17, r25), r12);
        long r1 = Math.max(0, r17.H.n - (r12 - r4));
        r16.B = r3;
        r16.a();
        r16.E = Long.valueOf(r12);
        r16.H = new xm(r6);
        r16.J = new xm(r1);
    L59:
        r16.B = r3;
        r16.a();
        r16.E = Long.valueOf(r12);
        r16.H = new xm(r12);
        r16.J = ne4.k;
        goto L61
    L34:
        if ((r20 instanceof le4) == false) goto L36;
        he4 r15 = (he4) ((le4) r20).e.get(r3);
        jw4 r19 = r15.b;
        do2 r110 = r15.d;
        r16.w = null;
        r16.x = r20;
        r16.y = r19;
        r16.z = r110;
        goto L47
    L36:
        if (r9 == true) goto L39;
        if (r13 == true) goto L39;
        boolean r111 = true;
    L40:
        if (r111 == false) goto L42;
        jw4 r112 = r17.x;
    L43:
        if (r111 == false) goto L45;
        do2 r113 = r17.y;
    L46:
        r16.w = null;
        r16.x = r20;
        r16.y = r112;
        r16.z = r113;
        goto L47
    L45:
        r113 = null;
        goto L46
    L42:
        r112 = jw4.b;
    L39:
        r111 = false;
    L29:
        r13 = false;
        goto L31
    L17:
        if (r20.p() == true) goto L20;
        r9 = false;
        goto L21
    L12:
        if (r12 != (-9223372036854775807L)) goto L14;
        r12 = f35.i0(r20.m(r3, r25, 0).k);
        goto L14
    L6:
        if (r3 >= r20.o()) goto L7;
    L8:
        r12 = r22;
        goto L10
    }

    public static int b1(pe4 r7, zt4 r8, bu4 r9) {
        int r0 = r7.A;
        if (r0 == (-1)) goto L5;
    L4:
        int r4 = r0;
        if (r7.w.p() == false) goto L9;
        return r4;
    L9:
        cu4 r1 = r7.w;
        return r1.b(r1.i(r9, r8, r4, f35.Q(h1(r7.D.get(), r7, r9))).first);
    L5:
        r0 = 0;
        goto L4
    }

    public static long c1(pe4 r2, Object r3, zt4 r4, bu4 r5) {
        if (r2.B == (-1)) goto L7;
        return r2.E.n;
    L7:
        return h1(r2.D.get(), r2, r5) - f35.i0(r2.w.g(r3, r4).e);
    }

    public static int d1(cu4 r4, le4 r5, int r6, zt4 r7, bu4 r8) {
        if (r4.p() == true) goto L5;
        Object r9 = r4.f(r4.m(r6, r8, 0).m, r7, true).b;
        r9.getClass();
        if (r5.b(r9) != (-1)) goto L10;
    L9:
        return -1;
    L10:
        r5.g(r9, r7);
        return r7.c;
    L5:
        if (r6 >= r5.e.size()) goto L9;
        return r6;
    }

    public static he4 e1(gn2 r2) {
        ge4 r0 = new ge4(new ke4());
        r0.c = r2;
        r0.k = true;
        r0.o = true;
        return new he4(r0);
    }

    public static pi3 g1(pe4 r17, boolean r18, bu4 r19, zt4 r20) {
        int r3 = r17.A;
        if (r3 == (-1)) goto L5;
    L4:
        int r7 = r3;
        ne4 r4 = r17.D;
        int r5 = r17.B;
        int r10 = b1(r17, r20, r19);
        cu4 r6 = r17.w;
        if (r6.p() == true) goto L9;
        Object r2 = r6.f(r10, r20, true).b;
        Object r8 = r6.m(r7, r19, 0).a;
        gn2 r9 = r19.b;
        Object r11 = r2;
    L10:
        if (r18 == false) goto L16;
        long r12 = r17.K;
        if (r5 != (-1)) goto L14;
        long r1 = r12;
    L21:
        return new pi3(r8, r7, r9, r11, r10, r12, r1, r17.B, r17.C);
    L14:
        r1 = h1(r4.get(), r17, r19);
        goto L21
    L16:
        r1 = h1(r4.get(), r17, r19);
        if (r5 == (-1)) goto L19;
        r12 = r17.E.n;
        goto L21
    L19:
        r12 = r1;
        goto L21
    L9:
        r8 = null;
        r9 = null;
        r11 = null;
        goto L10
    L5:
        r3 = 0;
        goto L4
    }

    public static long h1(long r2, pe4 r4, bu4 r5) {
        if (r2 == (-9223372036854775807L)) goto L6;
        return r2;
    L6:
        if (r4.w.p() == false) goto L8;
        return 0;
    L8:
        cu4 r3 = r4.w;
        int r6 = r4.A;
        if (r6 != (-1)) goto L13;
        r6 = 0;
    L13:
        return f35.i0(r3.m(r6, r5, 0).k);
    }

    public static pe4 j1(pe4 r11, ArrayList r12, zt4 r13, bu4 r14) {
        oe4 r0 = r11.a();
        le4 r4 = new le4(r12);
        cu4 r15 = r11.w;
        long r2 = r11.D.get();
        int r1 = r11.A;
        if (r1 != (-1)) goto L6;
        r1 = 0;
    L6:
        int r6 = d1(r15, r4, r1, r13, r14);
        if (r6 != (-1)) goto L9;
        long r7 = -9223372036854775807L;
    L10:
        int r3 = r1 + 1;
    L11:
        if (r6 != (-1)) goto L16;
        if (r3 >= r15.o()) goto L16;
        r6 = d1(r15, r4, r3, r13, r14);
        r3 = r3 + 1;
    L16:
        if (r11.d == 1) goto L20;
        if (r6 != (-1)) goto L20;
        r0.d = 4;
    L20:
        return a1(r0, r11, r2, r4, r6, r7, true, r14);
    L9:
        r7 = r2;
        goto L10
    }

    public static pe4 k1(pe4 r10, ArrayList r11, int r12, long r13, bu4 r15) {
        oe4 r0 = r10.a();
        if (r11 != null) goto L5;
        cu4 r4 = r10.w;
    L7:
        if (r10.d == 1) goto L18;
        if (r4.p() == false) goto L11;
    L16:
        r0.d = 4;
        goto L18
    L11:
        if (r12 != (-1)) goto L13;
    L15:
        r0.d = 2;
        goto L18
    L13:
        if (r12 < r4.o()) goto L15;
    L18:
        return a1(r0, r10, r10.D.get(), r4, r12, r13, false, r15);
    L5:
        r4 = new le4(r11);
        goto L7
    }

    public static boolean z1(pe4 r2) {
        if (r2.b == true) goto L5;
        return false;
    L5:
        if (r2.d == 3) goto L7;
        return false;
    L7:
        if (r2.e != 0) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.qi3
    public final void A0() {
        F1();
        pe4 r0 = this.h;
        if (C1(24) == true) goto L6;
        return;
    L6:
        if (this.h.o == 0.0f) goto L15;
        ic2 r1 = x1(0.0f);
        boolean r3 = r1.isDone();
        HashSet r5 = this.f;
        if (r3 == true) goto L10;
    L13:
        r5.add(r1);
        oe4 r2 = r0.a();
        r2.c(0.0f);
        D1(f1(new pe4(r2)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L10:
        if (r5.isEmpty() == false) goto L13;
        D1(i1(), false, false);
        return;
    }

    public final void A1() {
        F1();
        pe4 r0 = this.h;
        if (C1(32) == true) goto L5;
        return;
    L5:
        ic2 r1 = o1();
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L8;
    L10:
        r4.add(r1);
        D1(f1(r0), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
    L11:
        this.i = true;
        this.c.d();
        oe4 r3 = this.h.a();
        r3.d = 1;
        r3.J = ne4.k;
        r3.H = new xm(h1(r0.D.get(), r0, this.b));
        r3.I = r0.E;
        this.h = new pe4(r3);
        return;
    L8:
        if (r4.isEmpty() == false) goto L10;
        D1(i1(), false, false);
        goto L11
    }

    @Override // defpackage.qi3
    public final float B() {
        F1();
        return this.h.o;
    }

    public final void B1(final List r11, final int r12, final long r13) {
        if (r12 == (-1)) goto L7;
        if (r12 >= 0) goto L7;
        boolean r0 = false;
    L8:
        rr2.l(r0);
        final pe4 r6 = this.h;
        if (C1(20) == false) goto L11;
    L15:
        E1(s1(r11, r12, r13), new zd4(this, r11, r6, r12, r13), false, false);
        return;
    L11:
        if (r11.size() == 1) goto L13;
        return;
    L13:
        if (C1(31) == true) goto L15;
        return;
    L7:
        r0 = true;
        goto L8
    }

    @Override // defpackage.qi3
    public final void C0() {
        F1();
        if (C1(26) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public final boolean C1(int r2) {
        if (this.i == false) goto L5;
        return false;
    L5:
        if (this.h.a.a(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final il D() {
        F1();
        return this.h.n;
    }

    @Override // defpackage.qi3
    public final boolean D0() {
        F1();
        return this.h.h;
    }

    public final void D1(final pe4 r30, boolean r31, boolean r32) {
        pe4 r2 = this.h;
        this.h = r30;
        boolean r3 = r30.I;
        qv2 r4 = r30.v;
        PlaybackException r5 = r30.f;
        int r6 = r30.A;
        cu4 r7 = r30.w;
        if (r3 == false) goto L6;
        oe4 r9 = r30.a();
        r9.K = false;
        this.h = new pe4(r9);
    L6:
        boolean r10 = r2.b;
        int r11 = r2.C;
        int r12 = r2.B;
        cu4 r13 = r2.w;
        if (r10 == r30.b) goto L9;
        boolean r14 = true;
    L11:
        if (r2.d == r30.d) goto L13;
        boolean r15 = true;
    L14:
        zt4 r16 = this.g;
        bu4 r17 = this.b;
        if (r3 == false) goto L17;
        boolean r21 = r14;
        int r8 = r30.J;
        boolean r22 = r15;
    L65:
        boolean r18 = r13.equals(r7);
        if (r7.p() == false) goto L72;
        if (r13.p() == false) goto L72;
        qv2 r19 = r4;
        PlaybackException r25 = r5;
    L70:
        int r20 = -1;
    L104:
        tc2 r0 = this.c;
        if (r18 == false) goto L107;
        qv2 r26 = r19;
        boolean r23 = false;
    L128:
        if (r8 == (-1)) goto L130;
        r0.c(11, new z31(r8, g1(r2, r23, r17, r16), g1(r30, r3, r17, r16), 1));
    L130:
        if (r20 != (-1)) goto L132;
    L139:
        final int r24 = 18;
        final int r27 = 17;
        final int r28 = 10;
        PlaybackException r29 = r25;
        if (r2.f == r29) goto L145;
        r0.c(10, new ae4(r30, r27));
        if (r29 == null) goto L145;
        r0.c(10, new ae4(r30, r24));
    L145:
        if (r2.m.equals(r30.m) == true) goto L147;
        final int r33 = 19;
        r0.c(19, new ae4(r30, r33));
    L147:
        final int r34 = 20;
        if (r2.x.equals(r30.x) == true) goto L151;
        r0.c(2, new ae4(r30, r34));
    L151:
        if (r2.y.equals(r30.y) == true) goto L153;
        final int r110 = 21;
        r0.c(14, new ae4(r30, r110));
    L153:
        final int r35 = 22;
        if (r21 == true) goto L156;
        if (r22 == true) goto L156;
    L157:
        if (r22 == false) goto L159;
        final int r111 = 23;
        r0.c(4, new ae4(r30, r111));
    L159:
        final int r112 = 24;
        if (r21 == false) goto L162;
    L163:
        r0.c(5, new ae4(r30, r112));
    L164:
        final int r113 = 25;
        final int r114 = 6;
        if (r2.e == r30.e) goto L168;
        r0.c(6, new ae4(r30, r113));
    L168:
        if (z1(r2) == z1(r30)) goto L171;
        final int r115 = 0;
        r0.c(7, new ae4(r30, r115));
    L171:
        if (r2.l.equals(r30.l) == true) goto L173;
        final int r116 = 1;
        r0.c(12, new ae4(r30, r116));
    L173:
        final int r36 = 8;
        if (r2.g == r30.g) goto L176;
        final int r117 = 2;
        r0.c(8, new ae4(r30, r117));
    L176:
        final int r37 = 9;
        if (r2.h == r30.h) goto L180;
        final int r118 = 3;
        r0.c(9, new ae4(r30, r118));
    L180:
        if (r2.i == r30.i) goto L183;
        final int r119 = 4;
        r0.c(16, new ae4(r30, r119));
    L183:
        if (r2.j == r30.j) goto L186;
        final int r120 = 5;
        r0.c(17, new ae4(r30, r120));
    L186:
        if (r2.k == r30.k) goto L189;
        r0.c(18, new ae4(r30, r114));
    L189:
        if (r2.n.equals(r30.n) == true) goto L192;
        final int r121 = 7;
        r0.c(20, new ae4(r30, r121));
    L192:
        if (r2.q.equals(r30.q) == true) goto L195;
        r0.c(25, new ae4(r30, r36));
    L195:
        if (r2.s.equals(r30.s) == true) goto L198;
        r0.c(29, new ae4(r30, r37));
    L198:
        if (r2.z.equals(r30.z) == true) goto L201;
        r0.c(15, new ae4(r30, r28));
    L201:
        if (r2.u.equals(r30.u) == true) goto L204;
        final int r38 = 11;
        r0.c(24, new ae4(r30, r38));
    L204:
        if (r2.o == r30.o) goto L207;
        final int r122 = 12;
        r0.c(22, new ae4(r30, r122));
    L207:
        if (r2.t == r30.t) goto L211;
        final int r39 = 13;
        r0.c(30, new ae4(r30, r39));
    L211:
        if (r2.r.equals(r30.r) == true) goto L213;
        final int r40 = 14;
        r0.c(27, new ae4(r30, r40));
    L213:
        qv2 r123 = r26;
        if (r2.v.equals(r123) == true) goto L219;
        if (r123.b == (-9223372036854775807L)) goto L219;
        final int r41 = 15;
        r0.c(28, new ae4(r30, r41));
    L219:
        if (r2.a.equals(r30.a) == true) goto L221;
        final int r42 = 16;
        r0.c(13, new ae4(r30, r42));
    L221:
        r0.b();
        return;
    L162:
        if (r2.c == r30.c) goto L164;
    L156:
        r0.c(-1, new ae4(r30, r35));
        goto L157
    L132:
        if (r7.p() == false) goto L134;
        gn2 r43 = null;
    L138:
        r0.c(1, new a41(r43, r20, 1));
        goto L139
    L134:
        if (r6 != (-1)) goto L137;
        r6 = 0;
    L137:
        r43 = r7.m(r6, r17, 0).b;
        goto L138
    L107:
        if (r13.o() == r7.o()) goto L110;
        r26 = r19;
    L109:
        int r44 = 0;
    L125:
        q31 r45 = new q31(r44, 7, r30);
        r23 = false;
        r0.c(0, r45);
        goto L128
    L110:
        int r46 = 0;
    L112:
        if (r46 >= r13.o()) goto L124;
        Object r47 = r13.m(r46, r17, 0).a;
        r26 = r19;
        Object r124 = r7.m(r46, r17, 0).a;
        if ((r47 instanceof ke4) == true) goto L116;
    L118:
        boolean r125 = false;
    L120:
        if (r47.equals(r124) == true) goto L123;
        if (r125 == false) goto L109;
    L123:
        r46 = r46 + 1;
        r19 = r26;
        goto L112
    L116:
        if ((r124 instanceof ke4) == true) goto L118;
        r125 = true;
        goto L120
    L124:
        r26 = r19;
        r44 = 1;
    L72:
        if (r7.p() == r13.p()) goto L75;
        r19 = r4;
        r25 = r5;
    L74:
        r20 = 3;
        goto L104
    L75:
        int r126 = r2.A;
        if (r126 != (-1)) goto L79;
        r126 = 0;
    L79:
        Object r127 = r13.m(r126, r17, 0).a;
        if (r6 == (-1)) goto L83;
        int r128 = r6;
    L82:
        r19 = r4;
        r25 = r5;
        Object r48 = r7.m(r128, r17, 0).a;
        if ((r127 instanceof ke4) == false) goto L90;
        if ((r48 instanceof ke4) == false) goto L70;
    L90:
        if (r127.equals(r48) == true) goto L96;
        if (r8 != 0) goto L94;
        r20 = 1;
        goto L104
    L94:
        if (r8 != 1) goto L74;
    L95:
        r20 = 2;
        goto L104
    L96:
        if (r8 != 0) goto L101;
        if (h1(r2.D.get(), r2, r17) <= h1(r30.D.get(), r30, r17)) goto L101;
        r20 = 0;
    L101:
        if (r8 != 1) goto L70;
        if (r32 == false) goto L70;
    L83:
        r128 = 0;
        goto L82
    L17:
        if (r31 == false) goto L20;
        r21 = r14;
        r22 = r15;
        r8 = 1;
        goto L65
    L20:
        if (r13.p() == false) goto L24;
        r21 = r14;
        r22 = r15;
    L22:
        r8 = -1;
        goto L65
    L24:
        if (r7.p() == false) goto L27;
        r21 = r14;
        r22 = r15;
    L26:
        r8 = 4;
        goto L65
    L27:
        Object r49 = r13.l(b1(r2, r16, r17));
        r21 = r14;
        Object r50 = r7.l(b1(r30, r16, r17));
        r22 = r15;
        if ((r49 instanceof ke4) == false) goto L33;
        if ((r50 instanceof ke4) == false) goto L22;
    L33:
        if (r50.equals(r49) == false) goto L53;
        if (r12 != r30.B) goto L53;
        if (r11 != r30.C) goto L53;
        long r210 = c1(r2, r49, r16, r17);
        if (Math.abs(r210 - c1(r30, r50, r16, r17)) < 1000) goto L22;
        r13.g(r49, r16);
        if (r12 != (-1)) goto L45;
        long r51 = r16.d;
    L46:
        long r52 = f35.i0(r51);
        if (r52 != (-9223372036854775807L)) goto L49;
    L51:
        r8 = 5;
        goto L65
    L49:
        if (r210 < r52) goto L51;
    L50:
        r8 = 0;
        goto L65
    L45:
        r51 = r16.a(r12, r11);
    L53:
        if (r7.b(r49) == (-1)) goto L26;
        long r211 = c1(r2, r49, r16, r17);
        r13.g(r49, r16);
        if (r12 != (-1)) goto L58;
        long r53 = r16.d;
    L59:
        long r54 = f35.i0(r53);
        if (r54 != (-9223372036854775807L)) goto L62;
    L64:
        r8 = 3;
        goto L65
    L62:
        if (r211 < r54) goto L64;
    L58:
        r53 = r16.a(r12, r11);
        goto L59
    L13:
        r15 = false;
        goto L14
    L9:
        r14 = false;
        goto L11
    }

    @Override // defpackage.qi3
    public final void E(int r1, boolean r2) {
        F1();
        if (C1(34) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        F1();
        return this.h.m;
    }

    public final void E1(ic2 r3, go4 r4, boolean r5, boolean r6) {
        boolean r0 = r3.isDone();
        HashSet r1 = this.f;
        if (r0 == true) goto L5;
    L8:
        r1.add(r3);
        D1(f1((pe4) r4.get()), r5, r6);
        r3.f(new ur2(21, this, r3), new h41(3, this));
        return;
    L5:
        if (r1.isEmpty() == false) goto L8;
        D1(i1(), r5, r6);
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        F1();
        return this.h.s;
    }

    @Override // defpackage.qi3
    public final long F0() {
        F1();
        pe4 r0 = this.h;
        long r1 = r0.F.n;
        bu4 r3 = this.b;
        long r2 = h1(r1, r0, r3);
        pe4 r6 = this.h;
        return Math.max(r2, h1(r6.D.get(), r6, r3));
    }

    public final void F1() {
        Thread r0 = Thread.currentThread();
        Looper r1 = this.d;
        if (r0 == r1.getThread()) goto L5;
        String r4 = Thread.currentThread().getName();
        String r2 = r1.getThread().getName();
        String r3 = f35.a;
        Locale r5 = Locale.US;
        kf2.o(f34.h("Player is accessed on the wrong thread.\nCurrent thread: '", r4, "'\nExpected thread: '", r2, "'\n"));
        return;
    L5:
        if (this.h != null) goto L10;
        this.h = i1();
        return;
    }

    @Override // defpackage.qi3
    public final void G() {
        F1();
        if (C1(26) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final void G0(int r1) {
        F1();
        if (C1(25) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final void H(int r1, int r2) {
        F1();
        if (C1(33) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final void J(int r1) {
        F1();
        if (C1(34) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final int K() {
        F1();
        return this.h.C;
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        F1();
        return this.h.y;
    }

    @Override // defpackage.qi3
    public final void L(final int r9, int r10, final List r11) {
        F1();
        if (r9 < 0) goto L6;
        if (r9 > r10) goto L6;
        boolean r1 = true;
    L7:
        rr2.l(r1);
        final pe4 r4 = this.h;
        int r2 = r4.w.o();
        if (C1(20) == false) goto L13;
        if (r9 > r2) goto L14;
        final int r6 = Math.min(r10, r2);
        E1(q1(r9, r6, r11), new be4(this, r4, r11, r6, r9), false, false);
        return;
    L14:
        return;
    L13:
        return;
    L6:
        r1 = false;
        goto L7
    }

    @Override // defpackage.qi3
    public final void L0(List r4) {
        F1();
        B1(r4, -1, -9223372036854775807L);
    }

    @Override // defpackage.qi3
    public final void M(cw4 r1) {
        F1();
        if (C1(29) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @Override // defpackage.qi3
    public final long M0() {
        F1();
        if (k() == false) goto L7;
        return this.h.E.n;
    L7:
        return Z();
    }

    @Override // defpackage.qi3
    public final void N0(final List r5, int r6) {
        F1();
        if (r6 < 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        final pe4 r2 = this.h;
        int r3 = r2.w.o();
        if (C1(20) == true) goto L9;
        return;
    L9:
        if (r5.isEmpty() == true) goto L14;
        final int r7 = Math.min(r6, r3);
        E1(l1(r5, r7), new ce4(this, r2, r5, r7), false, false);
        return;
    L14:
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.qi3
    public final long O0() {
        F1();
        return this.h.i;
    }

    @Override // defpackage.qi3
    public final void P(final int r5, int r6) {
        F1();
        if (r5 < 0) goto L6;
        if (r6 < r5) goto L6;
        boolean r1 = true;
    L7:
        rr2.l(r1);
        final pe4 r2 = this.h;
        int r3 = r2.w.o();
        if (C1(20) == false) goto L17;
        if (r3 == 0) goto L18;
        if (r5 >= r3) goto L19;
        final int r7 = Math.min(r6, r3);
        if (r5 == r7) goto L20;
        E1(p1(r5, r7), new fe4(this, r2, r5, r7), false, false);
        return;
    L20:
        return;
    L19:
        return;
    L18:
        return;
    L17:
        return;
    L6:
        r1 = false;
        goto L7
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder r3) {
        F1();
        if (C1(27) == true) goto L6;
        return;
    L6:
        if (r3 != null) goto L12;
        F1();
        if (C1(27) == true) goto L10;
        return;
    L10:
        kf2.o("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
        return;
    L12:
        kf2.o("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Override // defpackage.qi3
    public final void R(float r6) {
        F1();
        pe4 r0 = this.h;
        if (C1(24) == true) goto L5;
        return;
    L5:
        ic2 r1 = x1(r6);
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L8;
    L11:
        r4.add(r1);
        oe4 r3 = r0.a();
        r3.c(r6);
        D1(f1(new pe4(r3)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L8:
        if (r4.isEmpty() == false) goto L11;
        D1(i1(), false, false);
    }

    @Override // defpackage.qi3
    public final void T(List r3, int r4, long r5) {
        F1();
        if (r4 != (-1)) goto L5;
        pe4 r6 = this.h;
        int r7 = r6.A;
        long r0 = r6.D.get();
        r4 = r7;
        r5 = r0;
    L5:
        B1(r3, r4, r5);
    }

    @Override // defpackage.qi3
    public final PlaybackException U() {
        F1();
        return this.h.f;
    }

    @Override // defpackage.qi3
    public final Looper U0() {
        return this.d;
    }

    @Override // defpackage.qi3
    public final void V(boolean r7) {
        F1();
        pe4 r0 = this.h;
        if (C1(1) == true) goto L5;
        return;
    L5:
        ic2 r2 = t1(r7);
        boolean r3 = r2.isDone();
        HashSet r5 = this.f;
        if (r3 == true) goto L8;
    L11:
        r5.add(r2);
        oe4 r1 = r0.a();
        r1.b = r7;
        r1.c = 1;
        D1(f1(new pe4(r1)), false, false);
        r2.f(new ur2(21, this, r2), new h41(3, this));
        return;
    L8:
        if (r5.isEmpty() == false) goto L11;
        D1(i1(), false, false);
    }

    @Override // defpackage.qi3
    public final long X() {
        F1();
        return this.h.j;
    }

    @Override // defpackage.fq
    public final void X0(final int r10, int r11, final long r12, boolean r14) {
        F1();
        if (r10 == (-1)) goto L7;
        if (r10 >= 0) goto L7;
        boolean r3 = false;
    L8:
        rr2.l(r3);
        final pe4 r4 = this.h;
        if (C1(r11) == true) goto L11;
        return;
    L11:
        if (r10 != (-1)) goto L13;
    L20:
        final boolean r2 = true;
    L21:
        E1(r1(r10, r11, r12), new ee4(this, r2, r4, r10, r12), !r2, r14);
        return;
    L13:
        if (k() == true) goto L20;
        if (r4.w.p() == false) goto L17;
    L19:
        r2 = false;
        goto L21
    L17:
        if (r10 < r4.w.o()) goto L19;
    L7:
        r3 = true;
        goto L8
    }

    @Override // defpackage.qi3
    public final long Z() {
        F1();
        pe4 r0 = this.h;
        return h1(r0.D.get(), r0, this.b);
    }

    @Override // defpackage.qi3
    public final void a0() {
        F1();
        pe4 r0 = this.h;
        if (C1(24) == true) goto L6;
        return;
    L6:
        if (this.h.o != 0.0f) goto L15;
        ic2 r1 = x1(r0.p);
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L10;
    L13:
        r4.add(r1);
        oe4 r3 = r0.a();
        r3.c(r0.p);
        D1(f1(new pe4(r3)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L10:
        if (r4.isEmpty() == false) goto L13;
        D1(i1(), false, false);
        return;
    }

    @Override // defpackage.qi3
    public final void b() {
        F1();
        pe4 r0 = this.h;
        if (C1(2) == true) goto L5;
        return;
    L5:
        E1(n1(), new sl(5, r0), false, false);
    }

    @Override // defpackage.qi3
    public final long b0() {
        F1();
        if (k() == false) goto L7;
        pe4 r4 = this.h;
        return Math.max(r4.G.n, r4.E.n);
    L7:
        return F0();
    }

    @Override // defpackage.qi3
    public final void d(qh3 r6) {
        F1();
        pe4 r0 = this.h;
        if (C1(13) == true) goto L5;
        return;
    L5:
        ic2 r1 = u1(r6);
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L8;
    L11:
        r4.add(r1);
        oe4 r3 = r0.a();
        r3.l = r6;
        D1(f1(new pe4(r3)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L8:
        if (r4.isEmpty() == false) goto L11;
        D1(i1(), false, false);
    }

    @Override // defpackage.qi3
    public final void d0(int r1) {
        F1();
        if (C1(34) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        F1();
        return this.h.x;
    }

    @Override // defpackage.qi3
    public final boolean f() {
        F1();
        this.h.getClass();
        return false;
    }

    public pe4 f1(pe4 r1) {
        return r1;
    }

    @Override // defpackage.qi3
    public final int g() {
        F1();
        return this.h.d;
    }

    @Override // defpackage.qi3
    public final do2 g0() {
        F1();
        return this.h.z;
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        F1();
        if (k() == false) goto L7;
        cu4 r0 = this.h.w;
        int r1 = y();
        zt4 r3 = this.g;
        r0.f(r1, r3, false);
        pe4 r4 = this.h;
        return f35.i0(r3.a(r4.B, r4.C));
    L7:
        return x();
    }

    @Override // defpackage.qi3
    public final int h() {
        F1();
        return this.h.g;
    }

    @Override // defpackage.qi3
    public final qh3 i() {
        F1();
        return this.h.l;
    }

    @Override // defpackage.qi3
    public final jg0 i0() {
        F1();
        return this.h.r;
    }

    public abstract pe4 i1();

    @Override // defpackage.qi3
    public final int j() {
        F1();
        return this.h.t;
    }

    @Override // defpackage.qi3
    public final boolean k() {
        F1();
        if (this.h.B == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.qi3
    public final void k0(il r1, boolean r2) {
        F1();
        if (C1(35) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @Override // defpackage.qi3
    public final void l0(do2 r1) {
        F1();
        if (C1(19) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    public ic2 l1(List r1, int r2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final long m() {
        F1();
        return this.h.H.n;
    }

    public ic2 m1(int r1, int r2, int r3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final int n0() {
        F1();
        return this.h.B;
    }

    public ic2 n1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        F1();
        return this.h.a;
    }

    @Override // defpackage.qi3
    public final int o0() {
        F1();
        int r1 = this.h.A;
        if (r1 == (-1)) goto L5;
        return r1;
    L5:
        return 0;
    }

    public ic2 o1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @Override // defpackage.qi3
    public final void p0(int r6) {
        F1();
        pe4 r0 = this.h;
        if (C1(15) == true) goto L5;
        return;
    L5:
        ic2 r1 = v1(r6);
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L8;
    L11:
        r4.add(r1);
        oe4 r3 = r0.a();
        r3.g = r6;
        D1(f1(new pe4(r3)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L8:
        if (r4.isEmpty() == false) goto L11;
        D1(i1(), false, false);
    }

    public ic2 p1(int r1, int r2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final boolean q() {
        F1();
        return this.h.b;
    }

    @Override // defpackage.qi3
    public final void q0(boolean r1) {
        F1();
        if (C1(26) == true) goto L5;
        return;
    L5:
        kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public ic2 q1(int r1, int r2, List r3) {
        ic2 r4 = l1(r3, r2);
        if (r1 != r2) goto L6;
        return r4;
    L6:
        return f35.h0(r4, new ss2(15, p1(r1, r2)));
    }

    @Override // defpackage.qi3
    public final void r0(oi3 r1) {
        F1();
        this.c.e(r1);
    }

    public abstract ic2 r1(int r1, int r2, long r3);

    @Override // defpackage.qi3
    public final void s(boolean r6) {
        F1();
        pe4 r0 = this.h;
        if (C1(14) == true) goto L5;
        return;
    L5:
        ic2 r1 = w1(r6);
        boolean r2 = r1.isDone();
        HashSet r4 = this.f;
        if (r2 == true) goto L8;
    L11:
        r4.add(r1);
        oe4 r3 = r0.a();
        r3.h = r6;
        D1(f1(new pe4(r3)), false, false);
        r1.f(new ur2(21, this, r1), new h41(3, this));
        return;
    L8:
        if (r4.isEmpty() == false) goto L11;
        D1(i1(), false, false);
    }

    public ic2 s1(List r1, int r2, long r3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @Override // defpackage.qi3
    public final void stop() {
        F1();
        pe4 r0 = this.h;
        if (C1(3) == true) goto L5;
        return;
    L5:
        E1(y1(), new bm0(1, this, r0), false, false);
    }

    public abstract ic2 t1(boolean r1);

    @Override // defpackage.qi3
    public final long u() {
        F1();
        return this.h.k;
    }

    @Override // defpackage.qi3
    public final void u0(final int r9, int r10, int r11) {
        F1();
        if (r9 < 0) goto L7;
        if (r10 < r9) goto L7;
        if (r11 < 0) goto L7;
        boolean r1 = true;
    L8:
        rr2.l(r1);
        final pe4 r4 = this.h;
        int r2 = r4.w.o();
        if (C1(20) == false) goto L19;
        if (r2 == 0) goto L20;
        if (r9 >= r2) goto L22;
        final int r6 = Math.min(r10, r2);
        final int r7 = Math.min(r11, r2 - (r6 - r9));
        if (r9 == r6) goto L21;
        if (r7 == r9) goto L23;
        E1(m1(r9, r6, r7), new de4(this, r4, r9, r6, r7), false, false);
        return;
    L23:
        return;
    L21:
        return;
    L22:
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r1 = false;
        goto L8
    }

    public ic2 u1(qh3 r1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @Override // defpackage.qi3
    public final void v(oi3 r1) {
        r1.getClass();
        this.c.a(r1);
    }

    @Override // defpackage.qi3
    public final int v0() {
        F1();
        return this.h.e;
    }

    public ic2 v1(int r1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    public ic2 w1(boolean r1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        F1();
        return this.h.w;
    }

    public ic2 x1(float r1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @Override // defpackage.qi3
    public final int y() {
        F1();
        pe4 r0 = this.h;
        bu4 r1 = this.b;
        return b1(r0, this.g, r1);
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        F1();
        this.h.getClass();
        return false;
    }

    public ic2 y1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // defpackage.qi3
    public final s55 z() {
        F1();
        return this.h.q;
    }
}
