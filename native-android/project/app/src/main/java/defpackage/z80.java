package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z80 implements t80 {
    public w03 A;
    public boolean B;
    public md4 C;
    public ef3 D;
    public z80 E;
    public int F;
    public final zg5 G;
    public final uy3 H;
    public final rg1 I;
    public int J;
    public final u80 n;
    public final d15 o;
    public final AtomicReference p;
    public final Object q;
    public final z03 r;
    public final ig4 s;
    public final w03 t;
    public final x03 u;
    public final x03 v;
    public final w03 w;
    public final w00 x;
    public final w00 y;
    public final w03 z;

    public z80(u80 r11, d15 r12) {
        this.n = r11;
        this.o = r12;
        this.p = new AtomicReference(null);
        this.q = new Object();
        z03 r5 = new z03(new x03());
        this.r = r5;
        ig4 r0 = new ig4();
        if (r11.d() == false) goto L6;
        r0.x = new i03();
    L6:
        if (r11.f() == false) goto L8;
        r0.b();
    L8:
        this.s = r0;
        this.t = te5.i();
        this.u = new x03();
        this.v = new x03();
        this.w = te5.i();
        w00 r6 = new w00();
        this.x = r6;
        w00 r7 = new w00();
        this.y = r7;
        this.z = te5.i();
        this.A = te5.i();
        zg5 r8 = new zg5(r11);
        this.G = r8;
        this.H = new uy3();
        rg1 r1 = new rg1(r12, r11, kg4.d(r0), r5, r6, r7, r8, this);
        r11.p(r1);
        this.I = r1;
    }

    public final void A(wf1 r5) {
        boolean r0 = i();
        q();
        u80 r1 = this.n;
        if (r0 == false) goto L12;
        rg1 r2 = this.I;
        r2.z = 0;
        r2.y = true;
        r1.a(this, r5);
        if (r2.F == false) goto L7;
    L9:
        oo3.a("Cannot disable reuse from root if it was caused by other groups");
    L10:
        r2.z = -1;
        r2.y = false;
        return;
    L7:
        if (r2.z != 0) goto L9;
    L12:
        r1.a(this, r5);
    }

    public final void a() {
        this.p.set(null);
        this.x.n.u0();
        this.y.n.u0();
        z03 r0 = this.r;
        if (r0.n.g() == true) goto L11;
        uy3 r1 = this.H;
        r1.g(r0, this.I.v());     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L8
        r1.a();
        return;
    L8:
        th = move-exception;
        r1.a();
        throw th;
    }

    public final void b(Object r20, boolean r21) {
        Object r2 = this.t.g(r20);
        if (r2 == null) goto L47;
        boolean r3 = r2 instanceof x03;
        p12 r4 = p12.n;
        x03 r5 = this.u;
        x03 r6 = this.v;
        w03 r0 = this.z;
        if (r3 == false) goto L28;
        x03 r7 = (x03) r2;
        Object[] r8 = r7.b;
        long[] r9 = r7.a;
        int r10 = r9.length - 2;
        if (r10 < 0) goto L48;
        int r11 = 0;
    L9:
        long r12 = r9[r11];
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r13 = 8 - ((~(r11 - r10)) >>> 31);
        int r14 = 0;
    L12:
        if (r14 >= r13) goto L25;
        if ((255 & r12) >= 128) goto L24;
        lv3 r15 = (lv3) r8[(r11 << 3) + r14];
        if (te5.I(r0, r20, r15) == true) goto L24;
        if (r15.b(r20) == r4) goto L24;
        if (r15.g == null) goto L23;
        if (r21 == true) goto L23;
        r6.a(r15);
    L23:
        r5.a(r15);
    L24:
        r12 = r12 >> 8;
        r14 = r14 + 1;
        goto L12
    L25:
        if (r13 == 8) goto L26;
        return;
    L26:
        if (r11 == r10) goto L52;
        r11 = r11 + 1;
        goto L9
    L52:
        return;
    L48:
        return;
    L28:
        lv3 r16 = (lv3) r2;
        if (te5.I(r0, r20, r16) == false) goto L31;
        return;
    L31:
        if (r16.b(r20) != r4) goto L33;
        return;
    L33:
        if (r16.g == null) goto L37;
        if (r21 == true) goto L37;
        r6.a(r16);
        return;
    L37:
        r5.a(r16);
        return;
    }

    public final void c(Set r32, boolean r33) {
        boolean r3 = r32 instanceof x54;
        w03 r4 = this.w;
        Object r5 = null;
        int r14 = 8;
        if (r3 == false) goto L50;
        x03 r1 = ((x54) r32).n;
        Object[] r6 = r1.b;
        long[] r2 = r1.a;
        int r15 = r2.length - 2;
        if (r15 < 0) goto L49;
        int r7 = 0;
        long r16 = 128;
        long r18 = 255;
    L7:
        long r8 = r2[r7];
        char r9 = 7;
        long r20 = -9187201950435737472L;
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
        int r10 = 8 - ((~(r7 - r15)) >>> 31);
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L43;
        if ((r8 & 255) >= 128) goto L41;
        Object r12 = r6[(r7 << 3) + r11];
        char r22 = r9;
        if ((r12 instanceof lv3) == false) goto L17;
        ((lv3) r12).b(r5);
    L16:
        long[] r29 = r2;
        long r26 = r8;
        int r34 = r15;
    L40:
        int r13 = 8;
    L42:
        r8 = r26 >> r13;
        r11 = r11 + 1;
        r15 = r34;
        r14 = r13;
        r9 = r22;
        r2 = r29;
        r5 = null;
        goto L10
    L17:
        b(r12, r33);
        Object r17 = r4.g(r12);
        if (r17 == null) goto L16;
        if ((r17 instanceof x03) == false) goto L39;
        x03 r19 = (x03) r17;
        Object[] r110 = r19.b;
        long[] r21 = r19.a;
        int r111 = r21.length - 2;
        if (r111 < 0) goto L16;
        int r25 = r14;
        r34 = r15;
        int r23 = 0;
    L24:
        long r112 = r21[r23];
        r26 = r8;
        long[] r24 = r21;
        if (((((~r112) << r22) & r112) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L36;
        int r27 = 8 - ((~(r23 - r111)) >>> 31);
        int r28 = 0;
    L27:
        if (r28 >= r27) goto L33;
        if ((r112 & 255) >= 128) goto L32;
        b((dp0) r110[(r23 << 3) + r28], r33);
    L32:
        r112 = r112 >> r25;
        r28 = r28 + 1;
        r2 = r2;
        goto L27
    L33:
        r29 = r2;
        if (r27 != r25) goto L40;
    L37:
        if (r23 == r111) goto L40;
        r23 = r23 + 1;
        r21 = r24;
        r8 = r26;
        r2 = r29;
        r25 = 8;
        goto L24
    L36:
        r29 = r2;
        goto L37
    L39:
        r29 = r2;
        r26 = r8;
        r34 = r15;
        b((dp0) r17, r33);
        goto L40
    L41:
        r29 = r2;
        r22 = r9;
        r26 = r8;
        r34 = r15;
        r13 = r14;
        goto L42
    L43:
        long[] r210 = r2;
        char r211 = r9;
        int r35 = r15;
        if (r10 != r14) goto L76;
        r15 = r35;
    L47:
        if (r7 == r15) goto L76;
        r7 = r7 + 1;
        r2 = r210;
        r5 = null;
        r14 = 8;
    L76:
        w03 r30 = this.t;
        x03 r31 = this.u;
        if (r33 == false) goto L137;
        x03 r36 = this.v;
        if (r36.h() == false) goto L137;
        long[] r37 = r30.a;
        int r38 = r37.length - 2;
        if (r38 < 0) goto L134;
        int r39 = 0;
    L83:
        long r40 = r37[r39];
        if (((((~r40) << r211) & r40) & r20) == r20) goto L131;
        int r113 = 8 - ((~(r39 - r38)) >>> 31);
        int r41 = 0;
    L86:
        if (r41 >= r113) goto L128;
        if ((r40 & r18) >= r16) goto L126;
        int r114 = (r39 << 3) + r41;
        Object r115 = r30.b[r114];
        Object r116 = r30.c[r114];
        if ((r116 instanceof x03) == false) goto L116;
        x03 r117 = (x03) r116;
        Object[] r118 = r117.b;
        long[] r119 = r117.a;
        int r120 = r119.length - 2;
        if (r120 < 0) goto L114;
        long r310 = r40;
        int r0 = 0;
    L94:
        long r42 = r119[r0];
        Object[] r212 = r118;
        long[] r213 = r119;
        if (((((~r42) << r211) & r42) & r20) == r20) goto L111;
        int r121 = 8 - ((~(r0 - r120)) >>> 31);
        int r122 = 0;
    L97:
        if (r122 >= r121) goto L108;
        if ((r42 & r18) >= r16) goto L106;
        long[] r214 = r37;
        int r43 = (r0 << 3) + r122;
        long r215 = r42;
        lv3 r44 = (lv3) r212[r43];
        if (r36.c(r44) == false) goto L103;
    L104:
        r117.m(r43);
    L107:
        r42 = r215 >> 8;
        r122 = r122 + 1;
        r37 = r214;
        goto L97
    L103:
        if (r31.c(r44) == false) goto L107;
    L106:
        r214 = r37;
        r215 = r42;
        goto L107
    L108:
        long[] r216 = r37;
        if (r121 != 8) goto L115;
    L112:
        if (r0 == r120) goto L115;
        r0 = r0 + 1;
        r118 = r212;
        r119 = r213;
        r37 = r216;
    L115:
        boolean r45 = r117.g();
    L123:
        if (r45 == false) goto L127;
        r30.k(r114);
    L127:
        r40 = r310 >> 8;
        r41 = r41 + 1;
        r37 = r216;
        goto L86
    L111:
        r216 = r37;
        goto L112
    L114:
        r216 = r37;
        r310 = r40;
        goto L115
    L116:
        r216 = r37;
        r310 = r40;
        r116.getClass();
        lv3 r123 = (lv3) r116;
        if (r36.c(r123) == false) goto L119;
    L122:
        r45 = true;
        goto L123
    L119:
        if (r31.c(r123) == true) goto L122;
        r45 = false;
        goto L123
    L126:
        r216 = r37;
        r310 = r40;
        goto L127
    L128:
        long[] r217 = r37;
        if (r113 != 8) goto L134;
    L132:
        if (r39 == r38) goto L134;
        r39 = r39 + 1;
        r37 = r217;
        goto L83
    L131:
        r217 = r37;
    L134:
        r36.b();
        h();
        return;
    L137:
        if (r31.h() == false) goto L225;
        long[] r46 = r30.a;
        int r47 = r46.length - 2;
        if (r47 < 0) goto L184;
        int r48 = 0;
    L141:
        long r49 = r46[r48];
        if (((((~r49) << r211) & r49) & r20) == r20) goto L181;
        int r124 = 8 - ((~(r48 - r47)) >>> 31);
        int r50 = 0;
    L144:
        if (r50 >= r124) goto L178;
        if ((r49 & r18) >= r16) goto L176;
        int r51 = (r48 << 3) + r50;
        Object r52 = r30.b[r51];
        Object r53 = r30.c[r51];
        if ((r53 instanceof x03) == false) goto L172;
        x03 r54 = (x03) r53;
        Object[] r125 = r54.b;
        long[] r126 = r54.a;
        int r127 = r126.length - 2;
        if (r127 < 0) goto L170;
        long r311 = r49;
        int r128 = 0;
    L152:
        long r55 = r126[r128];
        Object[] r129 = r125;
        long[] r218 = r126;
        if (((((~r55) << r211) & r55) & r20) == r20) goto L167;
        int r130 = 8 - ((~(r128 - r127)) >>> 31);
        int r131 = 0;
    L155:
        if (r131 >= r130) goto L164;
        if ((r55 & r18) >= r16) goto L162;
        long[] r219 = r46;
        int r56 = (r128 << 3) + r131;
        long r220 = r55;
        if (r31.c((lv3) r129[r56]) == false) goto L163;
        r54.m(r56);
    L163:
        r55 = r220 >> 8;
        r131 = r131 + 1;
        r46 = r219;
        goto L155
    L162:
        r219 = r46;
        r220 = r55;
        goto L163
    L164:
        long[] r221 = r46;
        if (r130 != 8) goto L171;
    L168:
        if (r128 == r127) goto L171;
        r128 = r128 + 1;
        r125 = r129;
        r126 = r218;
        r46 = r221;
    L171:
        boolean r57 = r54.g();
    L173:
        if (r57 == false) goto L177;
        r30.k(r51);
    L177:
        r49 = r311 >> 8;
        r50 = r50 + 1;
        r46 = r221;
        goto L144
    L167:
        r221 = r46;
        goto L168
    L170:
        r221 = r46;
        r311 = r49;
        goto L171
    L172:
        r221 = r46;
        r311 = r49;
        r53.getClass();
        r57 = r31.c((lv3) r53);
        goto L173
    L176:
        r221 = r46;
        r311 = r49;
        goto L177
    L178:
        long[] r222 = r46;
        if (r124 != 8) goto L184;
    L182:
        if (r48 == r47) goto L184;
        r48 = r48 + 1;
        r46 = r222;
        goto L141
    L181:
        r222 = r46;
    L184:
        h();
        r31.b();
        return;
    L225:
        return;
    L46:
        r210 = r2;
        r211 = 7;
        goto L47
    L49:
        r16 = 128;
        r18 = 255;
        r20 = -9187201950435737472L;
        r211 = 7;
        goto L76
    L50:
        r16 = 128;
        r18 = 255;
        r20 = -9187201950435737472L;
        r211 = 7;
        Iterator r58 = r32.iterator();
    L52:
        if (r58.hasNext() == false) goto L76;
        Object r59 = r58.next();
        if ((r59 instanceof lv3) == true) goto L55;
        b(r59, r33);
        Object r60 = r4.g(r59);
        if (r60 == null) goto L52;
        if ((r60 instanceof x03) == true) goto L60;
        b((dp0) r60, r33);
        goto L52
    L60:
        x03 r61 = (x03) r60;
        Object[] r62 = r61.b;
        long[] r63 = r61.a;
        int r64 = r63.length - 2;
        if (r64 < 0) goto L52;
        int r65 = 0;
    L63:
        long r66 = r63[r65];
        if (((((~r66) << 7) & r66) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L73;
        int r132 = 8 - ((~(r65 - r64)) >>> 31);
        int r133 = 0;
    L66:
        if (r133 >= r132) goto L72;
        if ((r66 & 255) >= 128) goto L70;
        b((dp0) r62[(r65 << 3) + r133], r33);
    L70:
        r66 = r66 >> 8;
        r133 = r133 + 1;
        goto L66
    L72:
        if (r132 != 8) goto L52;
    L73:
        if (r65 == r64) goto L52;
        r65 = r65 + 1;
        goto L63
    L55:
        ((lv3) r59).b(null);
        goto L52
    }

    public final void d() {
        Object r0 = this.q;
        monitor-enter(r0);
        e(this.x);     // Catch: Throwable -> L7
        o();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
    L13:
        th = move-exception;
        a();     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;
    L9:
        if (this.r.n.g() == true) goto L18;
        uy3 r2 = this.H;     // Catch: Throwable -> L13
        r2.g(this.r, this.I.v());     // Catch: Throwable -> L15
        r2.b();     // Catch: Throwable -> L15
        r2.a();     // Catch: Throwable -> L13
        goto L18
    L15:
        th = move-exception;
        r2.a();     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L18:
        throw th;     // Catch: Throwable -> L13
    }

    public final void e(w00 r34) {
        w00 r2 = this.y;
        rg1 r3 = this.I;
        x80 r4 = r3.v();
        uy3 r5 = this.H;
        r5.g(this.r, r4);
    L22:
        th = th;
    L154:
    L133:
        th = move-exception;
        r5.a();
        throw th;
    L128:
        if (r2.n.w0() == true) goto L130;
    L135:
        r5.a();
        throw th;
    L130:
        if (this.D != null) goto L135;
        r5.b();     // Catch: Throwable -> L133
        goto L135
    L4:
        if (r34.n.w0() == true) goto L150;
        ef3 r6 = this.D;     // Catch: Throwable -> L22
        if (r6 == null) goto L24;
        bi r7 = r6.l;     // Catch: Throwable -> L22
        if (r7 == null) goto L24;
    L25:
        if (r6 == null) goto L27;
        uv3 r8 = r6.l;     // Catch: Throwable -> L22
    L29:
        if (r7.equals(r8) == false) goto L31;
        String r9 = "Compose:recordChanges";
    L139:
        Trace.beginSection(r9);     // Catch: Throwable -> L22
        ef3 r10 = this.D;     // Catch: Throwable -> L38
        if (r10 == null) goto L40;
        uy3 r11 = r10.k;     // Catch: Throwable -> L38
        if (r11 == null) goto L40;
    L41:
        ig4 r12 = this.s;     // Catch: Throwable -> L38
        x80 r13 = r3.v();     // Catch: Throwable -> L38
        lg4 r14 = kg4.d(r12).e();     // Catch: Throwable -> L38
        int r15 = 0;
        r34.C(r7, r14, r11, r13);     // Catch: Throwable -> L120
        r14.e(true);     // Catch: Throwable -> L38
        r7.i();     // Catch: Throwable -> L38
        Trace.endSection();     // Catch: Throwable -> L22
        r5.c();     // Catch: Throwable -> L22
        r5.d();     // Catch: Throwable -> L22
        if (this.B == false) goto L107;
        Trace.beginSection("Compose:unobserve");     // Catch: Throwable -> L22
        this.B = false;     // Catch: Throwable -> L83
        w03 r16 = this.t;     // Catch: Throwable -> L83
        long[] r17 = r16.a;     // Catch: Throwable -> L83
        int r18 = r17.length - 2;     // Catch: Throwable -> L83
        if (r18 < 0) goto L100;
        int r19 = 0;
    L52:
        long r20 = r17[r19];     // Catch: Throwable -> L83
        char r110 = 7;
        long r111 = -9187201950435737472L;
        if (((((~r20) << 7) & r20) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L97;
        int r112 = 8;
        int r113 = 8 - ((~(r19 - r18)) >>> 31);     // Catch: Throwable -> L83
        int r0 = r15;
    L55:
        if (r0 >= r113) goto L94;
        if ((r20 & 255) >= 128) goto L92;
        char r114 = r110;
        int r115 = (r19 << 3) + r0;     // Catch: Throwable -> L83
        long r22 = r111;
        Object r116 = r16.b[r115];     // Catch: Throwable -> L83
        Object r117 = r16.c[r115];     // Catch: Throwable -> L83
        if ((r117 instanceof x03) == false) goto L85;
        x03 r118 = (x03) r117;     // Catch: Throwable -> L83
        Object[] r119 = r118.b;     // Catch: Throwable -> L83
        long[] r21 = r118.a;     // Catch: Throwable -> L83
        int r24 = r112;
        int r120 = r21.length - 2;
        int r25 = r0;
        long[] r27 = r17;
        uy3 r26 = r5;
        if (r120 < 0) goto L81;
        int r1 = 0;
    L140:
        long r23 = r21[r1];     // Catch: Throwable -> L73
        long r28 = r20;
        long[] r121 = r21;
        if (((((~r23) << r114) & r23) & r22) == r22) goto L79;
        int r29 = 8 - ((~(r1 - r120)) >>> 31);     // Catch: Throwable -> L73
        int r30 = 0;
    L67:
        if (r30 >= r29) goto L78;
        if ((r23 & 255) >= 128) goto L75;
        long r31 = r23;
        int r32 = (r1 << 3) + r30;     // Catch: Throwable -> L73
        if (((lv3) r119[r32]).a() == true) goto L76;
        r118.m(r32);     // Catch: Throwable -> L73
    L76:
        r23 = r31 >> r24;     // Catch: Throwable -> L73
        r30 = r30 + 1;     // Catch: Throwable -> L73
        goto L67
    L75:
        r31 = r23;
        goto L76
    L78:
        if (r29 == r24) goto L79;
    L82:
        boolean r33 = r118.g();     // Catch: Throwable -> L73
    L89:
        if (r33 == false) goto L91;
        r16.k(r115);     // Catch: Throwable -> L73
    L91:
        int r35 = 8;
    L93:
        r20 = r28 >> r35;     // Catch: Throwable -> L73
        r0 = r25 + 1;     // Catch: Throwable -> L73
        r112 = r35;
        r110 = r114;
        r111 = r22;
        r5 = r26;
        r17 = r27;
    L79:
        if (r1 == r120) goto L82;
        r1 = r1 + 1;     // Catch: Throwable -> L73
        r21 = r121;
        r20 = r28;
        r24 = 8;
    L73:
        th = th;
    L105:
        Trace.endSection();     // Catch: Throwable -> L103
        throw th;     // Catch: Throwable -> L103
    L81:
        r28 = r20;
        goto L82
    L85:
        r25 = r0;
        r27 = r17;
        r26 = r5;
        r28 = r20;
        r117.getClass();     // Catch: Throwable -> L73
        if (((lv3) r117).a() == true) goto L88;
        r33 = true;
        goto L89
    L88:
        r33 = false;
        goto L89
    L92:
        r25 = r0;
        r27 = r17;
        r26 = r5;
        r28 = r20;
        r114 = r110;
        r22 = r111;
        r35 = r112;
        goto L93
    L94:
        long[] r210 = r17;
        uy3 r211 = r5;
        if (r113 != r112) goto L101;
    L98:
        if (r19 == r18) goto L101;
        r19 = r19 + 1;     // Catch: Throwable -> L73
        r5 = r211;
        r17 = r210;
        r15 = 0;
    L101:
        h();     // Catch: Throwable -> L73
        Trace.endSection();     // Catch: Throwable -> L103
    L146:
    L114:
        th = move-exception;
        r211.a();
        throw th;
    L109:
        if (r2.n.w0() == true) goto L111;
    L116:
        r211.a();
        return;
    L111:
        if (this.D != null) goto L116;
        r211.b();     // Catch: Throwable -> L114
        goto L116
    L97:
        r210 = r17;
        r211 = r5;
        goto L98
    L100:
        r211 = r5;
    L83:
        th = th;
        goto L105
    L107:
        r211 = r5;
    L120:
        th = move-exception;
        r14.e(false);     // Catch: Throwable -> L124
        throw th;     // Catch: Throwable -> L124
    L124:
        th = th;
    L125:
        Trace.endSection();     // Catch: Throwable -> L103
        throw th;     // Catch: Throwable -> L103
    L40:
        r11 = r5;
    L38:
        th = th;
    L103:
        th = th;
        goto L154
    L31:
        r9 = "Compose:applyChanges";
        goto L139
    L27:
        r8 = null;
    L24:
        r7 = this.o;     // Catch: Throwable -> L22
        goto L25
    L150:
    L11:
        th = move-exception;
        r5.a();
        throw th;
    L6:
        if (r2.n.w0() == true) goto L8;
    L13:
        r5.a();
        return;
    L8:
        if (this.D != null) goto L13;
        r5.b();     // Catch: Throwable -> L11
        goto L13
    }

    public final void f() {
        Object r0 = this.q;
        monitor-enter(r0);
        w00 r1 = this.y;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        if (r1.n.w0() == true) goto L10;
        e(this.y);     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
    L17:
        th = move-exception;
        a();     // Catch: Throwable -> L25
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L13:
        if (this.r.n.g() == true) goto L22;
        uy3 r2 = this.H;     // Catch: Throwable -> L17
        r2.g(this.r, this.I.v());     // Catch: Throwable -> L19
        r2.b();     // Catch: Throwable -> L19
        r2.a();     // Catch: Throwable -> L17
        goto L22
    L19:
        th = move-exception;
        r2.a();     // Catch: Throwable -> L17
        throw th;     // Catch: Throwable -> L17
    L22:
        throw th;     // Catch: Throwable -> L17
    }

    public final void g() {
        Object r0 = this.q;
        monitor-enter(r0);
        this.I.v = null;     // Catch: Throwable -> L9
        if (this.r.n.g() == true) goto L14;
        uy3 r1 = this.H;     // Catch: Throwable -> L9
        r1.g(this.r, this.I.v());     // Catch: Throwable -> L11
        r1.b();     // Catch: Throwable -> L11
        r1.a();     // Catch: Throwable -> L9
        goto L14
    L11:
        th = move-exception;
        r1.a();     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    L14:
        monitor-exit(r0);
        return;
    L9:
        th = move-exception;
    L21:
        th = move-exception;
        a();     // Catch: Throwable -> L29
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        throw th;
    L17:
        if (this.r.n.g() == true) goto L26;
        uy3 r2 = this.H;     // Catch: Throwable -> L21
        r2.g(this.r, this.I.v());     // Catch: Throwable -> L23
        r2.b();     // Catch: Throwable -> L23
        r2.a();     // Catch: Throwable -> L21
        goto L26
    L23:
        th = move-exception;
        r2.a();     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L26:
        throw th;     // Catch: Throwable -> L21
    }

    public final void h() {
        w03 r1 = this.w;
        long[] r2 = r1.a;
        int r3 = r2.length - 2;
        long r6 = 255;
        char r8 = 7;
        long r9 = -9187201950435737472L;
        int r11 = 8;
        if (r3 < 0) goto L50;
        int r13 = 0;
    L5:
        long r14 = r2[r13];
        long r16 = 128;
        if (((((~r14) << r8) & r14) & r9) == r9) goto L47;
        int r4 = 8 - ((~(r13 - r3)) >>> 31);
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L44;
        if ((r14 & r6) >= 128) goto L42;
        long r19 = r6;
        int r7 = (r13 << 3) + r5;
        Object r10 = r1.b[r7];
        Object r12 = r1.c[r7];
        char r18 = r8;
        boolean r15 = r12 instanceof x03;
        long r21 = r9;
        w03 r17 = this.t;
        if (r15 == false) goto L35;
        x03 r20 = (x03) r12;
        Object[] r22 = r20.b;
        long[] r110 = r20.a;
        int r111 = r110.length - 2;
        if (r111 < 0) goto L33;
        int r23 = r11;
        long r24 = r14;
        int r112 = 0;
    L16:
        long r113 = r110[r112];
        long[] r26 = r2;
        int r27 = r3;
        if (((((~r113) << r18) & r113) & r21) == r21) goto L30;
        int r25 = 8 - ((~(r112 - r111)) >>> 31);
        int r28 = 0;
    L19:
        if (r28 >= r25) goto L27;
        if ((r113 & r19) >= 128) goto L25;
        int r29 = r28;
        int r30 = (r112 << 3) + r29;
        int r31 = r5;
        if (r17.c((dp0) r22[r30]) == true) goto L26;
        r20.m(r30);
    L26:
        r113 = r113 >> r23;
        r28 = r29 + 1;
        r5 = r31;
        goto L19
    L25:
        r29 = r28;
        r31 = r5;
        goto L26
    L27:
        int r32 = r5;
        if (r25 != r23) goto L34;
    L31:
        if (r112 == r111) goto L34;
        r112 = r112 + 1;
        r2 = r26;
        r3 = r27;
        r5 = r32;
        r23 = 8;
    L34:
        boolean r33 = r20.g();
    L39:
        if (r33 == false) goto L41;
        r1.k(r7);
    L41:
        int r34 = 8;
    L43:
        r14 = r24 >> r34;
        r5 = r32 + 1;
        r11 = r34;
        r8 = r18;
        r6 = r19;
        r9 = r21;
        r2 = r26;
        r3 = r27;
        goto L8
    L30:
        r32 = r5;
        goto L31
    L33:
        r26 = r2;
        r27 = r3;
        r32 = r5;
        r24 = r14;
        goto L34
    L35:
        r26 = r2;
        r27 = r3;
        r32 = r5;
        r24 = r14;
        r12.getClass();
        if (r17.c((dp0) r12) == true) goto L38;
        r33 = true;
        goto L39
    L38:
        r33 = false;
        goto L39
    L42:
        r26 = r2;
        r27 = r3;
        r32 = r5;
        r19 = r6;
        r18 = r8;
        r21 = r9;
        r24 = r14;
        r34 = r11;
        goto L43
    L44:
        long[] r210 = r2;
        int r211 = r3;
        long r114 = r6;
        char r115 = r8;
        long r212 = r9;
        if (r4 != r11) goto L51;
        r3 = r211;
    L48:
        if (r13 == r3) goto L51;
        r13 = r13 + 1;
        r8 = r115;
        r6 = r114;
        r9 = r212;
        r2 = r210;
        r11 = 8;
    L51:
        x03 r0 = this.v;
        if (r0.h() == false) goto L73;
        Object[] r35 = r0.b;
        long[] r36 = r0.a;
        int r37 = r36.length - 2;
        if (r37 < 0) goto L91;
        int r38 = 0;
    L56:
        long r39 = r36[r38];
        if (((((~r39) << r115) & r39) & r212) == r212) goto L71;
        int r116 = 8 - ((~(r38 - r37)) >>> 31);
        int r40 = 0;
    L59:
        if (r40 >= r116) goto L68;
        if ((r39 & r114) >= r16) goto L66;
        int r41 = (r38 << 3) + r40;
        if (((lv3) r35[r41]).g != null) goto L66;
        r0.m(r41);
    L66:
        r39 = r39 >> 8;
        r40 = r40 + 1;
        goto L59
    L68:
        if (r116 == 8) goto L71;
        return;
    L71:
        if (r38 == r37) goto L93;
        r38 = r38 + 1;
        goto L56
    L93:
        return;
    L91:
        return;
    L73:
        return;
    L47:
        r210 = r2;
        r114 = r6;
        r115 = r8;
        r212 = r9;
        goto L48
    L50:
        r114 = 255;
        r115 = 7;
        r212 = -9187201950435737472L;
        r16 = 128;
        goto L51
    }

    public final boolean i() {
        Object r0 = this.q;
        monitor-enter(r0);
        boolean r3 = true;
        if (this.J == 1) goto L8;
        r3 = false;
    L8:
        if (r3 == false) goto L13;
        this.J = 0;     // Catch: Throwable -> L11
    L13:
        monitor-exit(r0);
        return r3;
    L11:
        th = move-exception;
        throw th;
    }

    public final void j(wf1 r6) {
        Object r0 = this.q;     // Catch: Throwable -> L14
        monitor-enter(r0);     // Catch: Throwable -> L14
        n();     // Catch: Throwable -> L22
        w03 r1 = this.A;     // Catch: Throwable -> L22
        this.A = te5.i();     // Catch: Throwable -> L22
        rg1 r2 = this.I;     // Catch: Throwable -> L19
        md4 r3 = this.C;     // Catch: Throwable -> L19
        if (r2.e.n.w0() == true) goto L8;
        l80.a("Expected applyChanges() to have been called");     // Catch: Throwable -> L19
    L8:
        r2.P = r3;     // Catch: Throwable -> L19
        r2.m(r1, r6);     // Catch: Throwable -> L16
        r2.P = null;     // Catch: Throwable -> L19
        monitor-exit(r0);     // Catch: Throwable -> L14
        return;
    L16:
        th = move-exception;
        r2.P = null;     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        this.A = r1;     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
    L30:
        th = move-exception;
        a();
        throw th;
    L26:
        if (this.r.n.g() == true) goto L35;
        uy3 r4 = this.H;     // Catch: Throwable -> L30
        r4.g(this.r, this.I.v());     // Catch: Throwable -> L32
        r4.b();     // Catch: Throwable -> L32
        r4.a();     // Catch: Throwable -> L30
        goto L35
    L32:
        th = move-exception;
        r4.a();     // Catch: Throwable -> L30
        throw th;     // Catch: Throwable -> L30
    L35:
        throw th;     // Catch: Throwable -> L30
    }

    public final ef3 k(boolean r11, wf1 r12) {
        if (this.D == null) goto L6;
        oo3.b("A pausable composition is in progress");
    L6:
        ef3 r1 = new ef3(this, this.n, this.I, this.r, r12, r11, this.o, this.q);
        this.D = r1;
        return r1;
    }

    public final void l() {
        Object r0 = this.q;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L5:
        if (this.D == null) goto L8;
        oo3.b("Deactivate is not supported while pausable composition is in progress");     // Catch: Throwable -> L16
    L8:
        int r3 = 1;
        if (this.s.o != 0) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L14;
    L18:
        Trace.beginSection("Compose:deactivate");     // Catch: Throwable -> L16
        uy3 r4 = this.H;     // Catch: Throwable -> L36
        r4.g(this.r, this.I.v());     // Catch: Throwable -> L25
        if (r1 == true) goto L30;
        ig4 r2 = this.s;     // Catch: Throwable -> L25
        uy3 r5 = this.H;     // Catch: Throwable -> L25
        lg4 r6 = r2.e();     // Catch: Throwable -> L25
        r6.n(r6.t, new ib(r3, r5, r6));     // Catch: Throwable -> L27
        r6.e(true);     // Catch: Throwable -> L25
        this.o.i();     // Catch: Throwable -> L25
        r4.c();     // Catch: Throwable -> L25
        goto L30
    L27:
        th = move-exception;
        r6.e(false);     // Catch: Throwable -> L25
        throw th;     // Catch: Throwable -> L25
    L30:
        r4.b();     // Catch: Throwable -> L25
        r4.a();     // Catch: Throwable -> L36
        Trace.endSection();     // Catch: Throwable -> L16
    L33:
        this.t.a();     // Catch: Throwable -> L16
        this.w.a();     // Catch: Throwable -> L16
        this.A.a();     // Catch: Throwable -> L16
        this.x.n.u0();     // Catch: Throwable -> L16
        this.y.n.u0();     // Catch: Throwable -> L16
        rg1 r7 = this.I;     // Catch: Throwable -> L16
        r7.E.clear();     // Catch: Throwable -> L16
        r7.s.clear();     // Catch: Throwable -> L16
        r7.e.n.u0();     // Catch: Throwable -> L16
        r7.v = null;     // Catch: Throwable -> L16
        this.J = 1;     // Catch: Throwable -> L16
        monitor-exit(r0);
        return;
    L25:
        th = move-exception;
        r4.a();     // Catch: Throwable -> L36
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L16
        throw th;     // Catch: Throwable -> L16
    L14:
        if (this.r.n.g() == true) goto L33;
    L11:
        r1 = false;
        goto L12
    }

    public final void m() {
        Object r0 = this.q;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.I.F == false) goto L9;
        oo3.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");     // Catch: Throwable -> L7
    L9:
        int r2 = 3;
        if (this.J == 3) goto L42;
        this.J = 3;     // Catch: Throwable -> L7
        w00 r1 = this.I.L;     // Catch: Throwable -> L7
        if (r1 == null) goto L15;
        e(r1);     // Catch: Throwable -> L7
    L15:
        if (this.s.o != 0) goto L17;
        boolean r3 = true;
    L18:
        if (r3 == true) goto L20;
    L21:
        uy3 r5 = this.H;     // Catch: Throwable -> L7
        r5.g(this.r, this.I.v());     // Catch: Throwable -> L27
        if (r3 == true) goto L32;
        ig4 r4 = this.s;     // Catch: Throwable -> L27
        uy3 r6 = this.H;     // Catch: Throwable -> L27
        lg4 r7 = r4.e();     // Catch: Throwable -> L27
        r7.n(r7.t, new z(r2, r6));     // Catch: Throwable -> L29
        r7.H();     // Catch: Throwable -> L29
        r7.e(true);     // Catch: Throwable -> L27
        this.o.f();     // Catch: Throwable -> L27
        this.o.i();     // Catch: Throwable -> L27
        r5.c();     // Catch: Throwable -> L27
        goto L32
    L29:
        th = move-exception;
        r7.e(false);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L32:
        r5.b();     // Catch: Throwable -> L27
        r5.a();     // Catch: Throwable -> L7
    L34:
        this.z.a();     // Catch: Throwable -> L7
        rg1 r8 = this.I;     // Catch: Throwable -> L7
        r8.getClass();     // Catch: Throwable -> L7
        Trace.beginSection("Compose:Composer.dispose");     // Catch: Throwable -> L7
        r8.b.u(r8);     // Catch: Throwable -> L37
        r8.E.clear();     // Catch: Throwable -> L37
        r8.s.clear();     // Catch: Throwable -> L37
        r8.e.n.u0();     // Catch: Throwable -> L37
        r8.v = null;     // Catch: Throwable -> L37
        r8.a.f();     // Catch: Throwable -> L37
        Trace.endSection();     // Catch: Throwable -> L7
        goto L42
    L37:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L7
        throw th;     // Catch: Throwable -> L7
    L27:
        th = move-exception;
        r5.a();     // Catch: Throwable -> L7
        throw th;     // Catch: Throwable -> L7
    L20:
        if (this.r.n.g() == true) goto L34;
    L17:
        r3 = false;
    L42:
        monitor-exit(r0);
        this.n.v(this);
    }

    public final void n() {
        Object r0 = l93.a;
        AtomicReference r1 = this.p;
        Object r2 = r1.getAndSet(r0);
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.equals(r0) == false) goto L7;
        l80.b("pending composition has not been applied");
        er1.a();
        return;
    L7:
        if ((r2 instanceof Set) == false) goto L11;
        c((Set) r2, true);
        return;
    L11:
        if ((r2 instanceof Object[]) == false) goto L15;
        Set[] r3 = (Set[]) r2;
        int r4 = r3.length;
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L21;
        c(r3[r5], true);
        r5 = r5 + 1;
        goto L13
    L21:
        return;
    L15:
        l80.b("corrupt pendingModifications drain: " + r1);
        er1.a();
    }

    public final void o() {
        AtomicReference r1 = this.p;
        Object r0 = r1.getAndSet(null);
        if (h12.c(r0, l93.a) == false) goto L5;
        return;
    L5:
        if ((r0 instanceof Set) == false) goto L9;
        c((Set) r0, false);
        return;
    L9:
        if ((r0 instanceof Object[]) == false) goto L13;
        Set[] r2 = (Set[]) r0;
        int r3 = r2.length;
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L23;
        c(r2[r4], false);
        r4 = r4 + 1;
        goto L11
    L23:
        return;
    L13:
        if (r0 == null) goto L15;
        l80.b("corrupt pendingModifications drain: " + r1);
        er1.a();
        return;
    L15:
        if (this.D != null) goto L22;
        l80.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        return;
    }

    public final void p() {
        z01 r0 = z01.n;
        AtomicReference r1 = this.p;
        Object r2 = r1.getAndSet(r0);
        if (h12.c(r2, l93.a) == true) goto L18;
        if (r2 != null) goto L7;
        return;
    L7:
        if ((r2 instanceof Set) == false) goto L11;
        c((Set) r2, false);
        return;
    L11:
        if ((r2 instanceof Object[]) == false) goto L15;
        Set[] r3 = (Set[]) r2;
        int r4 = r3.length;
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L20;
        c(r3[r5], false);
        r5 = r5 + 1;
        goto L13
    L20:
        return;
    L15:
        l80.b("corrupt pendingModifications drain: " + r1);
        er1.a();
        return;
    }

    public final void q() {
        int r0 = this.J;
        if (r0 == 0) goto L17;
        if (r0 != 1) goto L8;
        String r1 = "The composition should be activated before setting content.";
    L15:
        oo3.b(r1);
        goto L17
    L8:
        if (r0 != 2) goto L10;
        r1 = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
        goto L15
    L10:
        if (r0 == 3) goto L12;
        r1 = "";
        goto L15
    L12:
        r1 = "The composition is disposed";
    L17:
        if (this.D != null) goto L19;
        return;
    L19:
        oo3.b("A pausable composition is in progress");
    }

    public final void r(ArrayList r4) {
        z03 r0 = this.r;
        rg1 r1 = this.I;
        if (r4.size() <= 0) goto L36;
        ((jy2) ((kd3) r4.get(0)).n).getClass();
        l80.a("Check failed");
    L36:
        r1.getClass();     // Catch: Throwable -> L17
        Trace.beginSection("Compose:insertMovableContent");     // Catch: Throwable -> L17
        r1.x(r4);     // Catch: Throwable -> L12
        r1.h();     // Catch: Throwable -> L10
        Trace.endSection();     // Catch: Throwable -> L17
        return;
    L12:
        th = move-exception;
        r1.a();     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L17
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
    L23:
        th = move-exception;
        a();
        throw th;
    L19:
        if (r0.n.g() == true) goto L28;
        uy3 r2 = this.H;     // Catch: Throwable -> L23
        r2.g(r0, r1.v());     // Catch: Throwable -> L25
        r2.b();     // Catch: Throwable -> L25
        r2.a();     // Catch: Throwable -> L23
        goto L28
    L25:
        th = move-exception;
        r2.a();     // Catch: Throwable -> L23
        throw th;     // Catch: Throwable -> L23
    L28:
        throw th;     // Catch: Throwable -> L23
    }

    public final p12 s(lv3 r4, Object r5) {
        int r0 = r4.b;
        if ((r0 & 2) == 0) goto L5;
        r4.b = r0 | 4;
    L5:
        mg1 r1 = r4.c;
        if (r1 == null) goto L39;
        if (r1.a() == false) goto L39;
        ig4 r2 = this.s;
        r2.getClass();
        mg1 r3 = r4.c;
        if (r3 != null) goto L13;
    L22:
        Object r6 = this.q;
        monitor-enter(r6);
        z80 r7 = this.E;     // Catch: Throwable -> L35
        monitor-exit(r6);
        if (r7 == null) goto L34;
        rg1 r8 = r7.I;
        if (r8.F == false) goto L34;
        if (r8.W(r4, r5) == false) goto L34;
        return p12.q;
    L34:
        return p12.n;
    L35:
        th = move-exception;
        throw th;
    L13:
        if (r2.f(fh0.d(r3)) != true) goto L22;
        if (r4.d == null) goto L21;
        p12 r9 = t(r4, r1, r5);
        if (r9 == p12.n) goto L19;
        this.G.r();
    L19:
        return r9;
    L21:
        return p12.n;
    L39:
        return p12.n;
    }

    public final p12 t(lv3 r20, mg1 r21, Object r22) {
        Object r3 = this.q;
        monitor-enter(r3);
        z80 r4 = this.E;     // Catch: Throwable -> L22
        z80 r5 = null;
        if (r4 == null) goto L24;
        ig4 r6 = this.s;     // Catch: Throwable -> L22
        int r7 = this.F;     // Catch: Throwable -> L22
        if (r6.t == false) goto L9;
        l80.a("Writer is active");     // Catch: Throwable -> L22
    L9:
        if (r7 >= 0) goto L11;
    L13:
        l80.a("Invalid group index");     // Catch: Throwable -> L22
    L14:
        mg1 r8 = fh0.d(r21);     // Catch: Throwable -> L22
        if (r6.f(r8) == false) goto L20;
        int r9 = r6.n[(r7 * 5) + 3] + r7;     // Catch: Throwable -> L22
        int r10 = r8.a;     // Catch: Throwable -> L22
        if (r7 > r10) goto L20;
        if (r10 >= r9) goto L20;
    L21:
        r5 = r4;
    L20:
        r4 = null;
        goto L21
    L11:
        if (r7 >= r6.o) goto L13;
    L24:
        if (r5 != null) goto L65;
        rg1 r11 = this.I;     // Catch: Throwable -> L22
        if (r11.F == true) goto L28;
    L30:
        boolean r12 = false;
    L31:
        if (r12 == false) goto L35;
        p12 r0 = p12.q;     // Catch: Throwable -> L22
        monitor-exit(r3);
        return r0;
    L35:
        if (r22 != null) goto L37;
        this.A.l(r20, rv2.B);     // Catch: Throwable -> L22
        goto L65
    L37:
        boolean r13 = r22 instanceof dp0;     // Catch: Throwable -> L22
        w03 r14 = this.A;
        if (r13 == true) goto L41;
        r14.l(r20, rv2.B);     // Catch: Throwable -> L22
        goto L65
    L41:
        Object r15 = r14.g(r20);     // Catch: Throwable -> L22
        if (r15 != null) goto L44;
    L64:
        te5.b(this.A, r20, r22);     // Catch: Throwable -> L22
        goto L65
    L44:
        if ((r15 instanceof x03) == false) goto L62;
        x03 r16 = (x03) r15;     // Catch: Throwable -> L22
        Object[] r17 = r16.b;     // Catch: Throwable -> L22
        long[] r18 = r16.a;     // Catch: Throwable -> L22
        int r19 = r18.length - 2;     // Catch: Throwable -> L22
        if (r19 < 0) goto L64;
        int r23 = 0;
    L48:
        long r110 = r18[r23];     // Catch: Throwable -> L22
        if (((((~r110) << 7) & r110) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L59;
        int r111 = 8 - ((~(r23 - r19)) >>> 31);     // Catch: Throwable -> L22
        int r112 = 0;
    L51:
        if (r112 >= r111) goto L58;
        if ((255 & r110) >= 128) goto L57;
        if (r17[(r23 << 3) + r112] == rv2.B) goto L65;
    L57:
        r110 = r110 >> 8;     // Catch: Throwable -> L22
        r112 = r112 + 1;     // Catch: Throwable -> L22
        goto L51
    L58:
        if (r111 != 8) goto L64;
    L59:
        if (r23 == r19) goto L64;
        r23 = r23 + 1;     // Catch: Throwable -> L22
        goto L48
    L62:
        if (r15 != rv2.B) goto L64;
    L28:
        if (r11.W(r20, r22) == false) goto L30;
        r12 = true;
    L65:
        monitor-exit(r3);
        if (r5 != null) goto L68;
        this.n.l(this);
        if (this.I.F == false) goto L74;
        return p12.p;
    L74:
        return p12.o;
    L68:
        return r5.t(r20, r21, r22);
    L22:
        th = move-exception;
        throw th;
    }

    public final void u(Object r18) {
        Object r2 = this.t.g(r18);
        if (r2 == null) goto L37;
        boolean r3 = r2 instanceof x03;
        p12 r4 = p12.q;
        w03 r0 = this.z;
        if (r3 == false) goto L24;
        x03 r5 = (x03) r2;
        Object[] r6 = r5.b;
        long[] r7 = r5.a;
        int r8 = r7.length - 2;
        if (r8 < 0) goto L38;
        int r9 = 0;
    L9:
        long r10 = r7[r9];
        if (((((~r10) << 7) & r10) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r11 = 8 - ((~(r9 - r8)) >>> 31);
        int r12 = 0;
    L12:
        if (r12 >= r11) goto L21;
        if ((255 & r10) >= 128) goto L20;
        lv3 r13 = (lv3) r6[(r9 << 3) + r12];
        if (r13.b(r18) != r4) goto L20;
        if ((r18 instanceof dp0) == true) goto L20;
        te5.b(r0, r18, r13);
    L20:
        r10 = r10 >> 8;
        r12 = r12 + 1;
        goto L12
    L21:
        if (r11 == 8) goto L22;
        return;
    L22:
        if (r9 == r8) goto L42;
        r9 = r9 + 1;
        goto L9
    L42:
        return;
    L38:
        return;
    L24:
        lv3 r14 = (lv3) r2;
        if (r14.b(r18) == r4) goto L27;
        return;
    L27:
        if ((r18 instanceof dp0) == true) goto L40;
        te5.b(r0, r18, r14);
        return;
    L40:
        return;
    }

    public final boolean v(Set r18) {
        boolean r2 = r18 instanceof x54;
        w03 r3 = this.w;
        w03 r0 = this.t;
        if (r2 == false) goto L22;
        x03 r1 = ((x54) r18).n;
        Object[] r4 = r1.b;
        long[] r5 = r1.a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L30;
        int r7 = 0;
    L7:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L10:
        if (r12 >= r10) goto L19;
        if ((255 & r8) >= 128) goto L18;
        Object r13 = r4[(r7 << 3) + r12];
        if (r0.c(r13) == true) goto L17;
        if (r3.c(r13) == false) goto L18;
    L17:
        return true;
    L18:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L10
    L19:
        if (r10 != 8) goto L30;
    L20:
        if (r7 == r6) goto L30;
        r7 = r7 + 1;
    L30:
        return false;
    L22:
        Iterator r9 = r18.iterator();
    L24:
        if (r9.hasNext() == false) goto L30;
        Object r11 = r9.next();
        if (r0.c(r11) == true) goto L29;
        if (r3.c(r11) == false) goto L24;
    L29:
        return true;
    }

    public final boolean w() {
        Object r0 = this.q;
        monitor-enter(r0);
        ef3 r1 = this.D;     // Catch: Throwable -> L20
        boolean r2 = false;
        if (r1 != null) goto L7;
    L22:
        n();     // Catch: Throwable -> L20
        w03 r3 = this.A;     // Catch: Throwable -> L48
        this.A = te5.i();     // Catch: Throwable -> L48
        rg1 r4 = this.I;     // Catch: Throwable -> L39
        md4 r5 = this.C;     // Catch: Throwable -> L39
        ya3 r6 = r4.e.n;     // Catch: Throwable -> L39
        if (r6.w0() == true) goto L28;
        l80.a("Expected applyChanges() to have been called");     // Catch: Throwable -> L39
    L28:
        if (r3.e <= 0) goto L30;
    L32:
        r4.P = r5;     // Catch: Throwable -> L39
        r4.m(r3, null);     // Catch: Throwable -> L43
        r4.P = null;     // Catch: Throwable -> L39
        r2 = !r6.w0();     // Catch: Throwable -> L39
    L36:
        if (r2 == true) goto L41;
        o();     // Catch: Throwable -> L39
    L41:
        monitor-exit(r0);
        return r2;
    L43:
        th = move-exception;
        r4.P = null;     // Catch: Throwable -> L39
        throw th;     // Catch: Throwable -> L39
    L30:
        if (r4.s.isEmpty() == false) goto L32;
    L39:
        th = move-exception;
        this.A = r3;     // Catch: Throwable -> L48
        throw th;     // Catch: Throwable -> L48
    L48:
        th = move-exception;
    L54:
        th = move-exception;
        a();     // Catch: Throwable -> L20
        throw th;     // Catch: Throwable -> L20
    L50:
        if (this.r.n.g() == true) goto L59;
        uy3 r7 = this.H;     // Catch: Throwable -> L54
        r7.g(this.r, this.I.v());     // Catch: Throwable -> L56
        r7.b();     // Catch: Throwable -> L56
        r7.a();     // Catch: Throwable -> L54
        goto L59
    L56:
        th = move-exception;
        r7.a();     // Catch: Throwable -> L54
        throw th;     // Catch: Throwable -> L54
    L59:
        throw th;     // Catch: Throwable -> L54
    L7:
        if (r1.h.get() == gf3.r) goto L9;
    L11:
        AtomicReference r8 = r1.h;     // Catch: Throwable -> L20
        gf3 r9 = gf3.s;     // Catch: Throwable -> L20
        gf3 r10 = gf3.q;     // Catch: Throwable -> L20
    L13:
        if (r8.compareAndSet(r9, r10) == true) goto L17;
        if (r8.get() == r9) goto L13;
    L17:
        r1.l.n.a(9);     // Catch: Throwable -> L20
        monitor-exit(r0);
        return false;
    L9:
        if (r1.i != te5.m()) goto L11;
    L20:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(x54 r5) {
    L2:
        Object r0 = this.p.get();
        if (r0 != null) goto L5;
    L15:
        Object r1 = r5;
    L16:
        AtomicReference r2 = this.p;
    L18:
        if (r2.compareAndSet(r0, r1) == true) goto L19;
        if (r2.get() == r0) goto L18;
    L19:
        if (r0 != null) goto L28;
        Object r6 = this.q;
        monitor-enter(r6);
        o();     // Catch: Throwable -> L25
        monitor-exit(r6);
        return;
    L25:
        th = move-exception;
        throw th;
    L28:
        return;
    L5:
        if (r0.equals(l93.a) == true) goto L15;
        if ((r0 instanceof Set) == false) goto L11;
        r1 = new Set[]{r0, r5};
        goto L16
    L11:
        if ((r0 instanceof Object[]) == false) goto L14;
        Set[] r3 = (Set[]) r0;
        int r4 = r3.length;
        Object[] r7 = Arrays.copyOf(r3, r4 + 1);
        r7[r4] = r5;
        r1 = r7;
        goto L16
    L14:
        throw new IllegalStateException(("corrupt pendingModifications: " + this.p).toString());
    }

    public final void y(Object r21) {
        rg1 r2 = this.I;
        if (r2.A > 0) goto L59;
        lv3 r3 = r2.u();
        if (r3 == null) goto L56;
        int r4 = r3.b | 1;
        r3.b = r4;
        if ((r4 & 32) == 0) goto L10;
    L9:
        boolean r5 = false;
    L20:
        this.G.r();
        if (r5 == false) goto L23;
        return;
    L23:
        if ((r21 instanceof sl4) == false) goto L25;
        ((sl4) r21).f(1);
    L25:
        te5.b(this.t, r21, r3);
        if ((r21 instanceof dp0) == false) goto L58;
        dp0 r6 = (dp0) r21;
        cp0 r7 = r6.h();
        w03 r0 = this.w;
        te5.J(r0, r21);
        p03 r8 = r7.e;
        Object[] r9 = r8.b;
        long[] r10 = r8.a;
        int r11 = r10.length - 2;
        if (r11 < 0) goto L46;
        int r12 = 0;
    L30:
        long r13 = r10[r12];
        if (((((~r13) << 7) & r13) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L44;
        int r14 = 8;
        int r15 = 8 - ((~(r12 - r11)) >>> 31);
        int r16 = 0;
    L33:
        if (r16 >= r15) goto L43;
        if ((r13 & 255) >= 128) goto L41;
        rl4 r17 = (rl4) r9[(r12 << 3) + r16];
        if ((r17 instanceof sl4) == false) goto L39;
        ((sl4) r17).f(1);
    L39:
        te5.b(r0, r17, r21);
    L41:
        r13 = r13 >> r14;
        r16 = r16 + 1;
        r14 = r14;
        goto L33
    L43:
        if (r15 != r14) goto L46;
    L44:
        if (r12 == r11) goto L46;
        r12 = r12 + 1;
    L46:
        Object r1 = r7.f;
        w03 r18 = r3.g;
        if (r18 != null) goto L49;
        r18 = new w03();
        r3.g = r18;
    L49:
        r18.l(r6, r1);
        return;
    L58:
        return;
    L10:
        p03 r19 = r3.f;
        if (r19 != null) goto L13;
        r19 = new p03();
        r3.f = r19;
    L13:
        int r20 = r3.e;
        int r22 = r19.c(r21);
        if (r22 >= 0) goto L16;
        r22 = ~r22;
        int r23 = -1;
    L17:
        r19.b[r22] = r21;
        r19.c[r22] = r20;
        if (r23 != r3.e) goto L9;
        r5 = true;
        goto L20
    L16:
        r23 = r19.c[r22];
        goto L17
    L56:
        return;
    }

    public final void z(Object r15) {
        Object r0 = this.q;
        monitor-enter(r0);
        u(r15);     // Catch: Throwable -> L18
        Object r16 = this.w.g(r15);     // Catch: Throwable -> L18
        if (r16 != null) goto L7;
    L25:
        monitor-exit(r0);
        return;
    L7:
        if ((r16 instanceof x03) == false) goto L24;
        x03 r17 = (x03) r16;     // Catch: Throwable -> L18
        Object[] r1 = r17.b;     // Catch: Throwable -> L18
        long[] r18 = r17.a;     // Catch: Throwable -> L18
        int r2 = r18.length - 2;     // Catch: Throwable -> L18
        if (r2 < 0) goto L25;
        int r4 = 0;
    L11:
        long r5 = r18[r4];     // Catch: Throwable -> L18
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r7 = 8 - ((~(r4 - r2)) >>> 31);     // Catch: Throwable -> L18
        int r9 = 0;
    L14:
        if (r9 >= r7) goto L21;
        if ((255 & r5) >= 128) goto L20;
        u((dp0) r1[(r4 << 3) + r9]);     // Catch: Throwable -> L18
    L20:
        r5 = r5 >> 8;     // Catch: Throwable -> L18
        r9 = r9 + 1;     // Catch: Throwable -> L18
        goto L14
    L21:
        if (r7 != 8) goto L25;
    L22:
        if (r4 == r2) goto L25;
        r4 = r4 + 1;     // Catch: Throwable -> L18
        goto L11
    L24:
        u((dp0) r16);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }
}
