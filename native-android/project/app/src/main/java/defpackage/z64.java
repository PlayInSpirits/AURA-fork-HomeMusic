package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z64 extends fo0 implements j42, g94, rn3, my1, a90, mv0 {
    public hb3 D;
    public k2 E;
    public boolean F;
    public rm2 G;
    public aw H;
    public jv0 I;
    public boolean J;
    public boolean K;
    public su0 L;
    public long M;
    public jh1 N;
    public jh1 O;
    public vu0 P;
    public uu0 Q;
    public tu0 R;
    public ya4 S;
    public rm2 T;
    public e20 U;
    public ly1 V;
    public final na4 W;
    public z X;
    public j2 Y;
    public boolean Z;
    public boolean a0;
    public hy2 b0;
    public hw4 c0;
    public final uk0 d0;
    public final g74 e0;
    public final xk0 f0;
    public final ba1 g0;
    public final gd0 h0;

    public z64(tb r12, fv r13, y71 r14, rm2 r15, hb3 r16, a74 r17, boolean r18, boolean r19) {
        k2 r1 = uo.p;
        this.D = r16;
        this.E = r1;
        this.F = r18;
        this.G = r15;
        this.M = 0;
        this.W = new na4(10);
        uk0 r110 = new uk0(new ui0(new rm2(v64.c)));
        this.d0 = r110;
        if (r14 != null) goto L5;
        y71 r5 = r110;
    L6:
        g74 r2 = new g74(r17, r12, r5, r16, r19, this.W, this, new x64(this, 0));
        this.e0 = r2;
        xk0 r111 = new xk0(r2, r18, 7);
        this.f0 = r111;
        ba1 r112 = new ba1(2, null, 10);
        q0(r112);
        this.g0 = r112;
        gd0 r3 = new gd0(r16, r2, r19, r13, new x64(this, 1));
        q0(r3);
        this.h0 = r3;
        q0(new e53(r111, this.W));
        cv r113 = new cv();
        r113.B = r3;
        q0(r113);
        return;
    L5:
        r5 = r14;
        goto L6
    }

    public static final Object t0(z64 r5, wd0 r6) {
        if ((r6 instanceof ev0) == false) goto L7;
        ev0 r0 = (ev0) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.n;
        int r2 = r0.p;
        vd0 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r7);
    L21:
        r5.I = null;
    L22:
        zu0 r8 = new zu0(false, 0);
        if (r5.A == false) goto L27;
        fu.G(r5.W.x(), null, null, new p(r8, r5, r3, 16), 3);
    L27:
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r7);
        jv0 r9 = r5.I;
        if (r9 == null) goto L22;
        rm2 r4 = r5.G;
        if (r4 == null) goto L21;
        iv0 r10 = new iv0(r9);
        r0.p = 1;
        Object r11 = r4.e(r10, r0);
        xe0 r12 = xe0.n;
        if (r11 != r12) goto L21;
        return r12;
    L7:
        r0 = new ev0(r5, r6);
        goto L8
    }

    public static final Object u0(z64 r6, yu0 r7, wd0 r8) {
        if ((r8 instanceof fv0) == false) goto L7;
        fv0 r0 = (fv0) r8;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.p;
        int r2 = r0.r;
        xe0 r4 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        jv0 r10 = r0.o;
        yu0 r3 = r0.n;
        kb4.X(r9);
    L29:
        jv0 r11 = r10;
        r7 = r3;
    L30:
        r6.I = r11;
        long r12 = r7.a;
        return j15.a;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        r7 = r0.n;
        kb4.X(r9);
    L23:
        r11 = new jv0();
        rm2 r5 = r6.G;
        if (r5 == null) goto L30;
        r0.n = r7;
        r0.o = r11;
        r0.r = 2;
        if (r5.e(r11, r0) != r4) goto L28;
    L27:
        return r4;
    L28:
        r3 = r7;
        r10 = r11;
        goto L29
    L16:
        kb4.X(r9);
        jv0 r13 = r6.I;
        if (r13 == null) goto L23;
        rm2 r14 = r6.G;
        if (r14 == null) goto L23;
        iv0 r15 = new iv0(r13);
        r0.n = r7;
        r0.r = 1;
        if (r14.e(r15, r0) != r4) goto L23;
    L7:
        r0 = new fv0(r6, r8);
        goto L8
    }

    public static final Object v0(z64 r5, zu0 r6, wd0 r7) {
        if ((r7 instanceof gv0) == false) goto L7;
        gv0 r0 = (gv0) r7;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.o;
        int r2 = r0.q;
        vd0 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        r6 = r0.n;
        kb4.X(r8);
    L21:
        r5.I = null;
    L23:
        if (r5.A == false) goto L27;
        fu.G(r5.W.x(), null, null, new p(r6, r5, r3, 16), 3);
    L27:
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r8);
        jv0 r9 = r5.I;
        if (r9 == null) goto L23;
        rm2 r4 = r5.G;
        if (r4 == null) goto L21;
        kv0 r10 = new kv0(r9);
        r0.n = r6;
        r0.q = 1;
        Object r11 = r4.e(r10, r0);
        xe0 r12 = xe0.n;
        if (r11 != r12) goto L21;
        return r12;
    L7:
        r0 = new gv0(r5, r7);
        goto L8
    }

    public static void z0(z64 r3, on3 r4, long r5, long r7, int r9) {
        if ((r9 & 4) == 0) goto L5;
        r7 = 0;
    L5:
        uu0 r10 = r3.Q;
        if (r10 != null) goto L8;
        r10 = new uu0();
        r10.f = null;
        r10.g = Long.MAX_VALUE;
        r10.h = false;
        r3.Q = r10;
    L8:
        r10.f = r4;
        r10.g = r5;
        e20 r6 = r3.U;
        hb3 r8 = r3.D;
        if (r6 != null) goto L11;
        r3.U = new e20(r8, 0);
    L12:
        r10.h = false;
        r3.S = r10;
        return;
    L11:
        r6.p = r8;
        r6.o = r7;
        goto L12
    }

    @Override // defpackage.ih1
    public final String A() {
        if (this.F == false) goto L20;
        ya4 r1 = this.S;
        if ((r1 instanceof su0) == false) goto L10;
        if (((su0) r1).h == false) goto L24;
        return "waiting";
    L24:
        return "idle";
    L10:
        if ((r1 instanceof uu0) == false) goto L13;
        return "waiting";
    L13:
        if ((r1 instanceof tu0) == false) goto L17;
        return "waiting";
    L17:
        if ((r1 instanceof vu0) == false) goto L25;
        return "recognized";
    L25:
        return "idle";
    L20:
        return "idle";
    }

    public final void A0(av0 r2) {
        if ((r2 instanceof yu0) == true) goto L5;
    L7:
        B0().d(r2);
        return;
    L5:
        if (this.J == true) goto L7;
        this.J = true;
        F0();
        goto L7
    }

    public final y00 B0() {
        aw r0 = this.H;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.n("Events channel not initialized.");
        return null;
    }

    public final rm2 C0() {
        rm2 r0 = this.T;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void D0(on3 r3, long r4) {
        this.M = g83.e(this.M, r4);
        xl.e(C0(), r3);
        B0().d(new xu0(false, r4));
    }

    public final void E0(on3 r3, on3 r4, long r5) {
        if (this.T != null) goto L5;
        this.T = new rm2(28);
    L5:
        xl.e(C0(), r3);
        long r6 = g83.d(r4.c, r5);
        k2 r7 = this.E;
        int r8 = r3.i;
        r7.getClass();
        if (r8 != 2) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == false) goto L11;
        return;
    L11:
        if (this.J == false) goto L13;
    L16:
        B0().d(new yu0(r6));
        return;
    L13:
        if (this.H != null) goto L15;
        this.H = su3.a(Integer.MAX_VALUE, 6, null);
    L15:
        F0();
        goto L16
    L8:
        r9 = false;
        goto L9
    }

    @Override // defpackage.mv0
    public final hb3 F() {
        return this.D;
    }

    public final void F0() {
        this.J = true;
        if (this.H != null) goto L5;
        this.H = su3.a(Integer.MAX_VALUE, 6, null);
    L5:
        fu.G(e0(), null, null, new hv0(this, null), 3);
    }

    @Override // defpackage.my1
    public final void G(ue1 r21, ln3 r22) {
        int r3 = r21.o;
        ArrayList r1 = (ArrayList) r21.p;
        if (this.F == true) goto L5;
        return;
    L5:
        if (this.V != null) goto L8;
        this.V = new ly1(this);
    L8:
        if (this.O != null) goto L10;
        ly1 r4 = this.V;
        r4.getClass();
        jh1 r5 = new jh1(r4);
        q0(r5);
        this.O = r5;
    L10:
        ly1 r6 = this.V;
        if (r6 == null) goto L273;
        z64 r0 = r6.n;
        if (r6.s != null) goto L18;
        gy1 r7 = r6.o;
        if (r7 != null) goto L17;
        r7 = new gy1();
        r7.j = fy1.p;
        r7.k = false;
        r7.l = false;
        r6.o = r7;
    L17:
        r6.s = r7;
    L18:
        wr1 r8 = r6.s;
        if (r8 == null) goto L252;
        boolean r9 = r8 instanceof gy1;
        ln3 r10 = ln3.n;
        ln3 r11 = ln3.o;
        if (r9 == false) goto L60;
        gy1 r12 = (gy1) r8;
        if (r1.isEmpty() == true) goto L279;
        int r13 = r1.size();
        int r14 = 0;
    L26:
        if (r14 >= r13) goto L31;
        if (zz1.h((ey1) r1.get(r14)) == false) goto L285;
        r14 = r14 + 1;
        goto L26
    L285:
        return;
    L31:
        ey1 r15 = (ey1) q40.w0(r1);
        int r2 = ky1.a[r12.j.ordinal()];
        fy1 r16 = fy1.o;
        fy1 r17 = fy1.n;
        if (r2 != 1) goto L43;
        g74 r18 = r0.e0;
        if (r18.a.a() == true) goto L42;
        tb r19 = r18.b;
        if (r19 == null) goto L38;
        boolean r20 = r19.e();
    L39:
        if (r20 == true) goto L42;
        fy1 r23 = r17;
    L44:
        r12.j = r23;
        if (r22 != r10) goto L49;
        if (r23 != r16) goto L48;
        r15.i = true;
        r12.k = true;
    L48:
        r12.l = true;
    L49:
        if (r22 != r11) goto L274;
        if (r23 != r17) goto L54;
        ly1.c(r6, r15, r15.a, 0, 12);
        return;
    L54:
        if (r12.k == false) goto L275;
        r6.f(r15, r15, new dy1(r3), 0);
        r6.e(r15, new dy1(r3), 0);
        long r24 = r15.a;
        jy1 r25 = r6.p;
        if (r25 != null) goto L58;
        r25 = new jy1();
        r25.j = Long.MAX_VALUE;
        r6.p = r25;
    L58:
        r25.j = r24;
        r6.s = r25;
        return;
    L275:
        return;
    L274:
        return;
    L38:
        r20 = false;
    L42:
        r23 = r16;
        goto L44
    L43:
        r23 = r12.j;
        goto L44
    L279:
        return;
    L60:
        boolean r26 = r8 instanceof iy1;
        ln3 r27 = ln3.p;
        if (r26 == false) goto L142;
        iy1 r28 = (iy1) r8;
        if (r22 == r10) goto L280;
        int r29 = r1.size();
        int r30 = 0;
    L66:
        if (r30 >= r29) goto L71;
        Object r110 = r1.get(r30);
        ln3 r111 = r11;
        if (vr1.n(((ey1) r110).a, r28.k) == true) goto L72;
        r30 = r30 + 1;
        r11 = r111;
    L72:
        ey1 r112 = (ey1) r110;
        if (r112 != null) goto L86;
        int r31 = r1.size();
        int r32 = 0;
    L75:
        if (r32 >= r31) goto L80;
        Object r33 = r1.get(r32);
        if (((ey1) r33).d == true) goto L81;
        r32 = r32 + 1;
    L81:
        r112 = (ey1) r33;
        if (r112 != null) goto L85;
        r6.a();
        return;
    L85:
        r28.k = r112.a;
        goto L86
    L80:
        r33 = null;
    L86:
        ey1 r34 = r112;
        if (r22 != r111) goto L124;
        if (r34.i == false) goto L91;
        ey1 r35 = r28.j;
        if (r35 == null) goto L122;
        long r36 = r28.k;
        e20 r37 = r6.u;
        if (r37 == null) goto L120;
        r6.b(r35, r36, r37);
        goto L124
    L120:
        kf2.n("AwaitTouchSlop.touchSlopDetector was not initialized");
        return;
    L122:
        kf2.n("AwaitTouchSlop.initialDown was not initialized");
        return;
    L91:
        if (zz1.b(r34) == false) goto L104;
        int r38 = r1.size();
        int r39 = 0;
    L93:
        if (r39 >= r38) goto L98;
        Object r40 = r1.get(r39);
        if (((ey1) r40).d == true) goto L96;
        r39 = r39 + 1;
        goto L93
    L96:
        Object r113 = r40;
    L99:
        ey1 r114 = (ey1) r113;
        if (r114 != null) goto L103;
        r6.a();
        goto L124
    L103:
        r28.k = r114.a;
        goto L124
    L98:
        r113 = null;
        goto L99
    L104:
        m65 r41 = (m65) kb4.q(r0, g90.t);
        float r42 = bv0.a;
        float r43 = r41.c();
        e20 r44 = r6.u;
        if (r44 == null) goto L113;
        long r115 = e20.u(r44, zz1.A(r34, r0.D, new dy1(r3), true), r43);
        if ((9223372034707292159L & r115) == 9205357640488583168L) goto L112;
        r34.i = true;
        ey1 r45 = r28.j;
        r45.getClass();
        r6.f(r45, r34, new dy1(r3), r115);
        r6.e(r34, new dy1(r3), r115);
        long r46 = r34.a;
        jy1 r47 = r6.p;
        if (r47 != null) goto L111;
        r47 = new jy1();
        r47.j = Long.MAX_VALUE;
        r6.p = r47;
    L111:
        r47.j = r46;
        r6.s = r47;
        goto L124
    L112:
        r28.l = true;
        goto L124
    L113:
        kf2.n("Touch slop detector not initialized.");
        return;
    L124:
        if (r22 == r27) goto L126;
        return;
    L126:
        if (r28.l == true) goto L128;
        return;
    L128:
        if (r34.i == false) goto L139;
        ey1 r48 = r28.j;
        if (r48 == null) goto L137;
        long r49 = r28.k;
        e20 r50 = r6.u;
        if (r50 == null) goto L135;
        r6.b(r48, r49, r50);
        return;
    L135:
        kf2.n("AwaitTouchSlop.touchSlopDetector was not initialized");
        return;
    L137:
        kf2.n("AwaitTouchSlop.initialDown was not initialized");
        return;
    L139:
        r28.l = false;
        return;
    L71:
        r111 = r11;
        r110 = null;
        goto L72
    L280:
        return;
    L142:
        if ((r8 instanceof hy1) == false) goto L171;
        hy1 r51 = (hy1) r8;
        if (r22 != r27) goto L281;
        int r52 = r1.size();
        int r53 = 0;
    L147:
        if (r53 >= r52) goto L152;
        if (((ey1) r1.get(r53)).i == true) goto L150;
        r53 = r53 + 1;
        goto L147
    L150:
        boolean r54 = false;
    L153:
        int r55 = r1.size();
        int r56 = 0;
    L154:
        if (r56 >= r55) goto L168;
        if (((ey1) r1.get(r56)).d == true) goto L158;
        r56 = r56 + 1;
        goto L154
    L158:
        if (r1.isEmpty() == true) goto L168;
        if (r54 == false) goto L278;
        long r57 = zz1.B((ey1) q40.w0(r1), r0.D, new dy1(r3));
        ey1 r58 = r51.j;
        r58.getClass();
        long r116 = g83.d(r57, zz1.B(r58, r0.D, new dy1(r3)));
        ey1 r59 = r51.j;
        if (r59 == null) goto L165;
        ly1.c(r6, r59, r51.k, r116, 8);
        return;
    L165:
        kf2.n("AwaitGesturePickup.initialDown was not initialized.");
        return;
    L278:
        return;
    L168:
        r6.a();
        return;
    L152:
        r54 = true;
        goto L153
    L281:
        return;
    L171:
        if ((r8 instanceof jy1) == false) goto L250;
        jy1 r60 = (jy1) r8;
        if (r22 != r11) goto L282;
        long r61 = r60.j;
        int r62 = r1.size();
        int r63 = 0;
    L176:
        if (r63 >= r62) goto L181;
        Object r64 = r1.get(r63);
        if (vr1.n(((ey1) r64).a, r61) == true) goto L182;
        r63 = r63 + 1;
    L182:
        ey1 r65 = (ey1) r64;
        if (r65 == null) goto L283;
        long r66 = r65.c;
        boolean r67 = zz1.b(r65);
        wu0 r68 = wu0.a;
        if (r67 == false) goto L242;
        int r69 = r1.size();
        int r117 = 0;
    L188:
        if (r117 >= r69) goto L193;
        Object r118 = r1.get(r117);
        float r210 = 0.0f;
        if (((ey1) r118).d == true) goto L194;
        r117 = r117 + 1;
    L194:
        ey1 r119 = (ey1) r118;
        if (r119 == null) goto L197;
        r60.j = r119.a;
        return;
    L197:
        if (r65.i == false) goto L199;
    L236:
        r0.A0(r68);
    L237:
        r6.a();
        return;
    L199:
        if (zz1.b(r65) == false) goto L236;
        rm2 r70 = r6.d();
        hb3 r71 = r0.D;
        x7 r72 = r6.v;
        q03 r73 = (q03) r72.p;
        char r120 = ' ';
        float r121 = Float.intBitsToFloat((int) (r66 >> 32));
        float r74 = Float.intBitsToFloat((int) (r66 & 4294967295L));
        if (zz1.h(r65) == false) goto L204;
        r72.o = 0;
        r73.d();
    L204:
        if (zz1.b(r65) == false) goto L206;
    L221:
        char r122 = ' ';
    L222:
        long r75 = (Float.floatToRawIntBits(r121) << r122) | (((long) Float.floatToRawIntBits(r74)) & 4294967295L);
        if (r71 != null) goto L226;
    L235:
        ((qf2) r70.o).a(r65.b, r75);
        float r76 = ((m65) kb4.q(r0, g90.t)).b();
        long r77 = r6.d().c(e35.h(r76, r76));
        qf2 r78 = (qf2) r6.d().o;
        m45 r79 = r78.a;
        ti.h0(r79.d, null);
        r79.e = 0;
        m45 r80 = r78.b;
        ti.h0(r80.d, null);
        r80.e = 0;
        r78.c = 0;
        r0.A0(new zu0(true, ov0.a(r77)));
        goto L237
    L226:
        if (r3 != 1) goto L229;
        float r81 = Float.intBitsToFloat((int) (r75 >> r122));
    L232:
        if (r71 != hb3.o) goto L234;
        long r82 = Float.floatToRawIntBits(r81);
        r75 = (((long) Float.floatToRawIntBits(r210)) & 4294967295L) | (r82 << r122);
        goto L235
    L234:
        r75 = (Float.floatToRawIntBits(r210) << r122) | (((long) Float.floatToRawIntBits(r81)) & 4294967295L);
        goto L235
    L229:
        if (r3 != 2) goto L235;
        r81 = Float.intBitsToFloat((int) (r75 & 4294967295L));
        goto L232
    L206:
        if (zz1.h(r65) == true) goto L221;
        if (r73.b != 3) goto L210;
        int r83 = r72.o;
        r72.o = r83 + 1;
        r73.n(r83, r65);
    L212:
        if (r72.o != 3) goto L214;
        r72.o = 0;
    L214:
        Object[] r84 = r73.a;
        int r85 = r73.b;
        float r123 = r210;
        int r86 = 0;
    L215:
        if (r86 >= r85) goto L217;
        char r124 = r120;
        r123 = Float.intBitsToFloat((int) (((ey1) r84[r86]).c >> r124)) + r123;
        r86 = r86 + 1;
        r120 = r124;
        goto L215
    L217:
        r122 = r120;
        int r87 = r73.b;
        r121 = r123 / r87;
        Object[] r88 = r73.a;
        float r125 = r210;
        int r89 = 0;
    L218:
        if (r89 >= r87) goto L220;
        r125 = r125 + Float.intBitsToFloat((int) (((ey1) r88[r89]).c & 4294967295L));
        r89 = r89 + 1;
        goto L218
    L220:
        r74 = r125 / r73.b;
        goto L222
    L210:
        r73.a(r65);
        goto L212
    L193:
        r210 = 0.0f;
        r118 = null;
        goto L194
    L242:
        if (r65.i == false) goto L246;
        r0.A0(r68);
        return;
    L246:
        if (g83.c(zz1.A(r65, r0.D, new dy1(r3), true)) == 0.0f) goto L284;
        r6.e(r65, new dy1(r3), zz1.A(r65, r0.D, new dy1(r3), false));
        r65.i = true;
        return;
    L284:
        return;
    L283:
        return;
    L181:
        r64 = null;
        goto L182
    L282:
        return;
    L250:
        er1.n();
        return;
    L252:
        kf2.n("currentDragState should not be null");
        return;
    }

    public final void G0(tb r6, fv r7, y71 r8, rm2 r9, hb3 r10, a74 r11, boolean r12, boolean r13) {
        if (this.F == r12) goto L5;
        this.f0.o = r12;
        this.X = null;
        this.Y = null;
        fu.C(this);
    L5:
        if (r8 != null) goto L7;
        r8 = this.d0;
    L7:
        g74 r0 = this.e0;
        boolean r4 = true;
        if (h12.c(r0.a, r11) == true) goto L10;
        r0.a = r11;
        boolean r14 = true;
    L11:
        r0.b = r6;
        if (r0.d == r10) goto L15;
        r0.d = r10;
        r14 = true;
    L15:
        if (r0.e == r13) goto L17;
        r0.e = r13;
        r14 = true;
    L17:
        r0.c = r8;
        r0.f = this.W;
        gd0 r15 = this.h0;
        r15.B = r10;
        r15.D = r13;
        r15.E = r7;
        k2 r16 = uo.p;
        hb3 r17 = r0.d;
        hb3 r18 = hb3.n;
        if (r17 == r18) goto L21;
        r18 = hb3.o;
    L21:
        this.E = r16;
        if (this.F == r12) goto L34;
        this.F = r12;
        if (r12 == true) goto L32;
        jh1 r19 = this.O;
        if (r19 == null) goto L28;
        r0(r19);
    L28:
        jh1 r20 = this.N;
        if (r20 == null) goto L31;
        r0(r20);
    L31:
        this.O = null;
        this.N = null;
        w0();
        this.V = null;
    L32:
        r14 = true;
    L34:
        if (h12.c(this.G, r9) == true) goto L37;
        w0();
        this.G = r9;
    L37:
        if (this.D == r18) goto L39;
        this.D = r18;
    L40:
        if (r4 == false) goto L54;
        boolean r21 = this.K;
        wu0 r22 = wu0.a;
        if (r21 == false) goto L47;
        x0();
        if (this.J == false) goto L46;
        B0().d(r22);
    L46:
        this.T = null;
    L47:
        ly1 r5 = this.V;
        if (r5 == null) goto L55;
        r5.a();
        z64 r23 = r5.n;
        if (r23.J == false) goto L52;
        r23.A0(r22);
    L52:
        r5.t = null;
        x7 r24 = r5.w;
        r24.o = 0;
        ((l03) r24.p).b = 0;
        return;
    L55:
        return;
    L54:
        return;
    L39:
        r4 = r14;
        goto L40
    L10:
        r14 = false;
        goto L11
    }

    @Override // defpackage.my1
    public final void N() {
        ly1 r2 = this.V;
        if (r2 == null) goto L9;
        r2.a();
        z64 r0 = r2.n;
        if (r0.J == false) goto L7;
        r0.A0(wu0.a);
    L7:
        r2.t = null;
        x7 r3 = r2.w;
        r3.o = 0;
        ((l03) r3.p).b = 0;
        return;
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
        t();
        hy2 r0 = this.b0;
        if (r0 == null) goto L5;
        r0.d = j51.O(this).J;
    L5:
        hw4 r1 = this.c0;
        if (r1 == null) goto L8;
        r1.d = j51.O(this).J;
    L8:
        t();
        if (this.A == true) goto L11;
        return;
    L11:
        oo0 r2 = j51.O(this).J;
        uk0 r3 = this.d0;
        r3.getClass();
        r3.a = new ui0(new rm2(r2));
    }

    @Override // defpackage.g94
    public final void c0(q94 r5) {
        if (this.F == true) goto L5;
    L9:
        z r0 = this.X;
        if (r0 == null) goto L12;
        c42[] r2 = o94.a;
        r5.a(d94.d, new w2(null, r0));
    L12:
        j2 r4 = this.Y;
        if (r4 == null) goto L16;
        c42[] r1 = o94.a;
        r5.a(d94.e, r4);
        return;
    L16:
        return;
    L5:
        if (this.X != null) goto L7;
    L8:
        this.X = new z(1, this);
        this.Y = new j2(this, null);
        goto L9
    L7:
        if (this.Y != null) goto L9;
        goto L8
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
        hy2 r0 = this.b0;
        if (r0 == null) goto L5;
        r0.d = j51.O(this).J;
    L5:
        hw4 r1 = this.c0;
        if (r1 == null) goto L9;
        r1.d = j51.O(this).J;
    L9:
        if (this.A == true) goto L11;
        return;
    L11:
        oo0 r2 = j51.O(this).J;
        uk0 r3 = this.d0;
        r3.getClass();
        r3.a = new ui0(new rm2(r2));
    }

    @Override // defpackage.cx2
    public final void j0() {
        this.J = false;
        w0();
        jh1 r0 = this.O;
        if (r0 == null) goto L5;
        r0(r0);
    L5:
        jh1 r1 = this.N;
        if (r1 == null) goto L8;
        r0(r1);
    L8:
        this.O = null;
        this.N = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [f13] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [f13] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // defpackage.rn3
    public final void n(kn3 r24, ln3 r25, long r26) {
        z64 r0 = this;
        kn3 r8 = r24;
        List r1 = r8.a;
        int r2 = r1.size();
        int r3 = 0;
    L3:
        ln3 r11 = ln3.o;
        ln3 r12 = ln3.n;
        if (r3 >= r2) goto L295;
        on3 r4 = (on3) r1.get(r3);
        k2 r5 = r0.E;
        int r6 = r4.i;
        r5.getClass();
        if (r6 != 2) goto L8;
        boolean r7 = true;
    L9:
        if (r7 == false) goto L10;
        r3 = r3 + 1;
        r8 = r24;
        goto L3
    L10:
        r0.K = true;
        if (r0.F == false) goto L295;
        if (r0.N != null) goto L16;
        jh1 r9 = new jh1(r0);
        r0.q0(r9);
        r0.N = r9;
    L16:
        if (r0.S != null) goto L21;
        su0 r10 = r0.L;
        if (r10 != null) goto L20;
        r10 = new su0();
        r10.f = ru0.p;
        r10.g = false;
        r10.h = false;
        r0.L = r10;
    L20:
        r0.S = r10;
    L21:
        ya4 r13 = r0.S;
        if (r13 != null) goto L24;
        kf2.n("currentDragState should not be null");
        return;
    L24:
        if ((r13 instanceof su0) == false) goto L58;
        su0 r14 = (su0) r13;
        if (r1.isEmpty() == true) goto L295;
        if (vq4.b(r8, false) == false) goto L295;
        on3 r15 = (on3) q40.w0(r1);
        int r16 = dv0.a[r14.f.ordinal()];
        ru0 r17 = ru0.o;
        ru0 r18 = ru0.n;
        if (r16 != 1) goto L43;
        g74 r19 = r0.e0;
        if (r19.a.a() == true) goto L42;
        tb r20 = r19.b;
        if (r20 == null) goto L38;
        boolean r21 = r20.e();
    L39:
        if (r21 == true) goto L42;
        ru0 r22 = r18;
    L44:
        r14.f = r22;
        if (r25 != r12) goto L49;
        if (r22 != r17) goto L48;
        r15.a();
        r14.g = true;
    L48:
        r14.h = true;
    L49:
        if (r25 != r11) goto L295;
        if (r22 != r18) goto L53;
        z0(r0, r15, r15.a, 0, 12);
        goto L295
    L53:
        if (r14.g == false) goto L295;
        r0.E0(r15, r15, 0);
        r0.D0(r15, 0);
        long r23 = r15.a;
        vu0 r27 = r0.P;
        if (r27 != null) goto L57;
        r27 = new vu0();
        r27.f = Long.MAX_VALUE;
        r0.P = r27;
    L57:
        r27.f = r23;
        r0.S = r27;
        goto L295
    L38:
        r21 = false;
    L42:
        r22 = r17;
        goto L44
    L43:
        r22 = r14.f;
        goto L44
    L58:
        boolean r28 = r13 instanceof uu0;
        ln3 r29 = ln3.p;
        if (r28 == false) goto L222;
        uu0 r30 = (uu0) r13;
        if (r25 == r12) goto L295;
        int r31 = r1.size();
        int r32 = 0;
    L64:
        if (r32 >= r31) goto L69;
        Object r33 = r1.get(r32);
        ln3 r110 = r11;
        if (vr1.n(((on3) r33).a, r30.g) == true) goto L70;
        r32 = r32 + 1;
        r11 = r110;
    L70:
        on3 r34 = (on3) r33;
        if (r34 != null) goto L83;
        int r35 = r1.size();
        int r36 = 0;
    L73:
        if (r36 >= r35) goto L78;
        Object r37 = r1.get(r36);
        if (((on3) r37).d == true) goto L79;
        r36 = r36 + 1;
    L79:
        r34 = (on3) r37;
        if (r34 != null) goto L82;
        r0.x0();
        ln3 r210 = r12;
        ln3 r111 = r110;
    L297:
        if (r0.F == true) goto L299;
        return;
    L299:
        if (r0.N != null) goto L301;
        jh1 r38 = new jh1(r0);
        r0.q0(r38);
        r0.N = r38;
    L301:
        int r112 = 12;
        ln3 r113 = r210;
        if (r25 == r113) goto L304;
    L316:
        hy2 r39 = r0.b0;
        if (r39 == null) goto L337;
        if (r24.c != 6) goto L337;
        List r40 = r24.a;
        int r41 = r40.size();
        int r42 = 0;
    L321:
        if (r42 >= r41) goto L326;
        if (((on3) r40.get(r42)).c() == true) goto L337;
        r42 = r42 + 1;
        goto L321
    L326:
        if (r25 == r113) goto L328;
    L330:
        if (r25 != r111) goto L337;
        if (r39.a == true) goto L337;
        if (r39.H(r24) == false) goto L337;
        ir2.a(r24);
        goto L337
    L328:
        if (r39.a == false) goto L330;
        r39.H(r24);
        ir2.a(r24);
    L337:
        if (r25 != r113) goto L352;
        int r43 = r24.c;
        if (r43 == 10) goto L345;
        if (r43 == 11) goto L345;
        if (r43 != 12) goto L352;
    L345:
        if (r0.a0 == true) goto L347;
        r0 = this;
        r0.c0 = new hw4(r0.e0, new q70(2, this, z64.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), j51.O(r0).J);
        r0.a0 = true;
    L347:
        hw4 r44 = r0.c0;
        if (r44 == null) goto L352;
        we0 r45 = r0.e0();
        if (r44.g != null) goto L352;
        r44.g = fu.G(r45, null, null, new x70(r44, null), 3);
    L352:
        hw4 r46 = r0.c0;
        if (r46 == null) goto L413;
        int r47 = r24.c;
        if (r47 == 10) goto L361;
        if (r47 == 11) goto L361;
        if (r47 == 12) goto L361;
        return;
    L361:
        List r48 = r24.a;
        int r49 = r48.size();
        int r50 = 0;
    L362:
        if (r50 >= r49) goto L367;
        if (((on3) r48.get(r50)).c() == true) goto L418;
        r50 = r50 + 1;
        goto L362
    L418:
        return;
    L367:
        if (r25 == r113) goto L369;
    L371:
        if (r25 == r111) goto L373;
        return;
    L373:
        if (r46.a == false) goto L375;
        return;
    L375:
        if (r46.F(r24) == false) goto L417;
        ir2.a(r24);
        return;
    L417:
        return;
    L369:
        if (r46.a == false) goto L371;
        r46.F(r24);
        ir2.a(r24);
        goto L371
    L413:
        return;
    L304:
        if (r24.c != 6) goto L316;
        if (r0.Z == false) goto L308;
    L311:
        hy2 r51 = r0.b0;
        if (r51 == null) goto L316;
        we0 r52 = r0.e0();
        if (r51.h != null) goto L316;
        r51.h = fu.G(r52, null, null, new p(r51, null, r112), 3);
        goto L316
    L308:
        if (r0.n.A == true) goto L310;
        cz1.b("Cannot get View because the Modifier node is not currently attached.");
    L310:
        r0 = this;
        r0.b0 = new hy2(r0.e0, new zh0(4, ViewConfiguration.get(((View) h12.L(j51.O(r0))).getContext())), new q70(2, this, z64.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, 1), j51.O(r0).J);
        r0.Z = true;
        goto L311
    L82:
        r30.g = r34.a;
        goto L83
    L78:
        r37 = null;
    L83:
        String r53 = "AwaitTouchSlop.touchSlopDetector was not initialized";
        String r54 = "AwaitTouchSlop.initialDown was not initialized";
        r111 = r110;
        if (r25 == r111) goto L86;
    L99:
        String r114 = "AwaitTouchSlop.touchSlopDetector was not initialized";
        String r211 = "AwaitTouchSlop.initialDown was not initialized";
        r210 = r12;
    L206:
        if (r25 != r29) goto L297;
        if (r30.h == false) goto L297;
        if (r34.c() == false) goto L220;
        on3 r55 = r30.f;
        if (r55 == null) goto L218;
        long r56 = r30.g;
        e20 r57 = r0.U;
        if (r57 == null) goto L216;
        r0.y0(r55, r56, r57);
        goto L297
    L216:
        kf2.n(r114);
        return;
    L218:
        kf2.n(r211);
        return;
    L220:
        r30.h = false;
        goto L297
    L86:
        if (r34.c() == false) goto L88;
        r114 = "AwaitTouchSlop.touchSlopDetector was not initialized";
        r211 = "AwaitTouchSlop.initialDown was not initialized";
        r210 = r12;
        on3 r58 = r30.f;
        if (r58 == null) goto L204;
        long r59 = r30.g;
        e20 r60 = r0.U;
        if (r60 == null) goto L202;
        r0.y0(r58, r59, r60);
        goto L206
    L202:
        kf2.n(r114);
        return;
    L204:
        kf2.n(r211);
        return;
    L88:
        if (gi1.i(r34) == false) goto L101;
        int r61 = r1.size();
        int r115 = 0;
    L90:
        if (r115 >= r61) goto L95;
        Object r116 = r1.get(r115);
        if (((on3) r116).d == true) goto L96;
        r115 = r115 + 1;
    L96:
        on3 r117 = (on3) r116;
        if (r117 != null) goto L100;
        r0.x0();
        goto L99
    L100:
        r30.g = r117.a;
        goto L99
    L95:
        r116 = null;
        goto L96
    L101:
        m65 r62 = (m65) kb4.q(r0, g90.t);
        int r63 = r34.i;
        float r118 = bv0.a;
        if (r63 != 2) goto L104;
        float r64 = r62.c() * bv0.a;
    L105:
        e20 r65 = r0.U;
        if (r65 == null) goto L195;
        long r119 = e20.u(r65, gi1.S(r34, true), r64);
        if ((r119 & 9223372034707292159L) == 9205357640488583168L) goto L194;
        r210 = r12;
        long r66 = g83.e(r0.M, gi1.S(r34, false));
        r0.M = r66;
        final float r67 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (r0.M & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r66 >> 32))))) * 57.29578f;
        hb3 r68 = r0.D;
        if (r68 != null) goto L112;
    L111:
        boolean r69 = true;
    L123:
        final fx3 r70 = new fx3();
        if1 r120 = new cv0(r67, r70);
        int r71 = ov0.a;
        if (r0.n.A == true) goto L126;
        cz1.b("visitAncestors called on an unattached node");
    L126:
        cx2 r72 = r0.n.r;
        c72 r121 = j51.O(r0);
    L127:
        if (r121 == null) goto L185;
        if ((((cx2) r121.Q.g).q & 262144) == 0) goto L178;
    L130:
        if (r72 == null) goto L178;
        r114 = r53;
        if ((r72.p & 262144) == 0) goto L177;
        ?? r122 = 0;
        ?? r73 = r72;
    L134:
        if (r73 == 0) goto L177;
        r211 = r54;
        if ((r73 instanceof rx4) == false) goto L156;
        rx4 r74 = (rx4) r73;
        boolean r212 = r69;
        if (jh1.C == r74.f()) goto L141;
    L139:
        boolean r75 = true;
    L151:
        if (r75 == false) goto L186;
    L153:
        if1 r213 = r120;
        ?? r123 = r122;
    L176:
        ?? r76 = j51.c(r123);
    L175:
        r54 = r211;
        r69 = r212;
        r120 = r213;
        r73 = r76;
        r122 = r123;
    L186:
        if (r212 == false) goto L188;
    L190:
        r34.a();
        on3 r77 = r30.f;
        r77.getClass();
        r0.E0(r77, r34, r119);
        r0.D0(r34, r119);
        long r78 = r34.a;
        vu0 r79 = r0.P;
        if (r79 != null) goto L193;
        r79 = new vu0();
        r79.f = Long.MAX_VALUE;
        r0.P = r79;
    L193:
        r79.f = r78;
        r0.S = r79;
        goto L206
    L188:
        if (r70.n == false) goto L190;
        r30.h = true;
        goto L206
    L141:
        if ((r74 instanceof jh1) == false) goto L154;
        ih1 r80 = ((jh1) r74).B;
        if (r80 != null) goto L146;
        r80 = null;
    L146:
        if (r80 == null) goto L139;
        if ((r80 instanceof mv0) == false) goto L139;
        r75 = ((Boolean) r120.invoke(r80)).booleanValue();
        goto L151
    L154:
        kf2.o("Node is not a GestureNode instance");
        return;
    L156:
        r212 = r69;
        if ((r73.p & 262144) == 0) goto L153;
        if ((r73 instanceof fo0) == false) goto L153;
        cx2 r81 = ((fo0) r73).C;
        int r82 = 0;
        r76 = r73;
        r123 = r122;
    L161:
        if (r81 == null) goto L173;
        if1 r214 = r120;
        if ((r81.p & 262144) == 0) goto L172;
        r82 = r82 + 1;
        r123 = r123;
        if (r82 != 1) goto L167;
        r76 = r81;
        goto L172
    L167:
        if (r123 != 0) goto L169;
        r123 = new f13(new cx2[16]);
    L169:
        if (r76 == 0) goto L171;
        r123.b(r76);
        r76 = 0;
    L171:
        r123.b(r81);
    L172:
        r81 = r81.s;
        r120 = r214;
        r76 = r76;
        r123 = r123;
        goto L161
    L173:
        r213 = r120;
        r123 = r123;
        if (r82 != 1) goto L176;
    L177:
        r72 = r72.r;
        r53 = r114;
        r54 = r54;
        r69 = r69;
        r120 = r120;
    L178:
        String r124 = r53;
        String r215 = r54;
        boolean r216 = r69;
        if1 r217 = r120;
        r121 = r121.t();
        if (r121 == null) goto L183;
        w12 r83 = r121.Q;
        if (r83 == null) goto L183;
        r72 = (sq4) r83.f;
    L184:
        r53 = r124;
        r54 = r215;
        r69 = r216;
        r120 = r217;
    L183:
        r72 = null;
        goto L184
    L185:
        r114 = r53;
        r211 = r54;
        r212 = r69;
        goto L186
    L112:
        int r84 = ov0.a;
        if (r68 != hb3.o) goto L118;
        if (r67 <= 30.0f) goto L111;
    L122:
        r69 = false;
        goto L123
    L118:
        if (r67 <= 30.0f) goto L122;
        if (r67 > 90.0f) goto L122;
    L194:
        r114 = "AwaitTouchSlop.touchSlopDetector was not initialized";
        r211 = "AwaitTouchSlop.initialDown was not initialized";
        r210 = r12;
        r30.h = true;
        r0.M = g83.e(r0.M, gi1.S(r34, true));
        goto L206
    L195:
        kf2.n("Touch slop detector not initialized.");
        return;
    L104:
        r64 = r62.c();
        goto L105
    L69:
        r110 = r11;
        r33 = null;
        goto L70
    L222:
        r111 = r11;
        r210 = r12;
        if ((r13 instanceof tu0) == false) goto L250;
        tu0 r85 = (tu0) r13;
        if (r25 != r29) goto L297;
        int r86 = r1.size();
        int r87 = 0;
    L228:
        if (r87 >= r86) goto L233;
        if (((on3) r1.get(r87)).c() == true) goto L231;
        r87 = r87 + 1;
        goto L228
    L231:
        boolean r88 = false;
    L234:
        int r89 = r1.size();
        int r90 = 0;
    L235:
        if (r90 >= r89) goto L248;
        if (((on3) r1.get(r90)).d == true) goto L239;
        r90 = r90 + 1;
        goto L235
    L239:
        if (r1.isEmpty() == true) goto L248;
        if (r88 == false) goto L297;
        long r91 = ((on3) q40.w0(r1)).c;
        on3 r92 = r85.f;
        r92.getClass();
        long r93 = g83.d(r91, r92.c);
        on3 r94 = r85.f;
        if (r94 == null) goto L245;
        z0(r0, r94, r85.g, r93, 8);
        goto L297
    L245:
        kf2.n("AwaitGesturePickup.initialDown was not initialized.");
        return;
    L248:
        r0.x0();
        goto L297
    L233:
        r88 = true;
        goto L234
    L250:
        if ((r13 instanceof vu0) == false) goto L290;
        vu0 r95 = (vu0) r13;
        if (r25 != r111) goto L297;
        long r96 = r95.f;
        int r97 = r1.size();
        int r98 = 0;
    L255:
        if (r98 >= r97) goto L260;
        Object r125 = r1.get(r98);
        if (vr1.n(((on3) r125).a, r96) == true) goto L261;
        r98 = r98 + 1;
    L261:
        on3 r126 = (on3) r125;
        if (r126 == null) goto L297;
        boolean r99 = gi1.i(r126);
        wu0 r100 = wu0.a;
        if (r99 == false) goto L284;
        int r101 = r1.size();
        int r102 = 0;
    L267:
        if (r102 >= r101) goto L272;
        Object r103 = r1.get(r102);
        if (((on3) r103).d == true) goto L273;
        r102 = r102 + 1;
    L273:
        on3 r104 = (on3) r103;
        if (r104 == null) goto L276;
        r95.f = r104.a;
        goto L297
    L276:
        if (r126.c() == false) goto L278;
    L280:
        r0.B0().d(r100);
    L281:
        r0.x0();
        goto L297
    L278:
        if (gi1.i(r126) == false) goto L280;
        float r105 = ((m65) kb4.q(r0, g90.t)).b();
        xl.e(r0.C0(), r126);
        long r106 = r0.C0().c(e35.h(r105, r105));
        qf2 r107 = (qf2) r0.C0().o;
        m45 r108 = r107.a;
        ti.h0(r108.d, null);
        r108.e = 0;
        m45 r109 = r107.b;
        ti.h0(r109.d, null);
        r109.e = 0;
        r107.c = 0;
        r0.B0().d(new zu0(false, ov0.a(r106)));
        r0.K = false;
        goto L281
    L272:
        r103 = null;
        goto L273
    L284:
        if (r126.c() == false) goto L287;
        r0.B0().d(r100);
        goto L297
    L287:
        if (g83.c(gi1.S(r126, true)) == 0.0f) goto L297;
        r0.D0(r126, gi1.S(r126, false));
        r126.a();
        goto L297
    L260:
        r125 = null;
        goto L261
    L290:
        er1.n();
        return;
    L8:
        r7 = false;
    L295:
        r111 = r11;
        r210 = r12;
        goto L297
    }

    @Override // defpackage.j42
    public final boolean q(KeyEvent r11) {
        boolean r1 = false;
        if (this.F == true) goto L5;
    L30:
        return false;
    L5:
        if (g42.a(fh0.a(r11.getKeyCode()), g42.n) == true) goto L9;
        if (g42.a(fh0.a(r11.getKeyCode()), g42.m) == false) goto L30;
    L9:
        if (hw.n(r11) != 2) goto L30;
        if (r11.isCtrlPressed() == true) goto L30;
        if (this.e0.d != hb3.n) goto L15;
        r1 = true;
    L15:
        gd0 r6 = this.h0;
        if (r1 == false) goto L23;
        int r2 = (int) (r6.r0() & 4294967295L);
        if (g42.a(fh0.a(r11.getKeyCode()), g42.m) == false) goto L20;
        float r12 = r2;
    L21:
        long r0 = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(r12)));
    L28:
        fu.G(e0(), null, null, new j2(this, r0, null, 1), 3);
        return true;
    L20:
        r12 = -r2;
        goto L21
    L23:
        int r3 = (int) (r6.r0() >> 32);
        if (g42.a(fh0.a(r11.getKeyCode()), g42.m) == false) goto L26;
        float r13 = r3;
    L27:
        long r7 = Float.floatToRawIntBits(r13);
        r0 = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (r7 << 32);
        goto L28
    L26:
        r13 = -r3;
        goto L27
    }

    @Override // defpackage.rn3
    public final void t() {
        if (this.K == false) goto L8;
        x0();
        if (this.J == false) goto L7;
        B0().d(wu0.a);
    L7:
        this.T = null;
    L8:
        this.K = false;
    }

    public final void w0() {
        jv0 r0 = this.I;
        if (r0 == null) goto L9;
        rm2 r1 = this.G;
        if (r1 == null) goto L7;
        r1.l(new iv0(r0));
    L7:
        this.I = null;
        return;
    }

    public final void x0() {
        this.M = 0;
        su0 r0 = this.L;
        ru0 r1 = ru0.p;
        if (r0 != null) goto L5;
        r0 = new su0();
        r0.f = r1;
        r0.g = false;
        r0.h = false;
        this.L = r0;
    L5:
        r0.f = r1;
        r0.g = false;
        r0.h = false;
        this.S = r0;
    }

    public final void y0(on3 r4, long r5, e20 r7) {
        tu0 r0 = this.R;
        if (r0 != null) goto L5;
        r0 = new tu0();
        r0.f = null;
        r0.g = Long.MAX_VALUE;
        this.R = r0;
    L5:
        r0.f = r4;
        r0.g = r5;
        r7.o = 0;
        this.S = r0;
    }
}
