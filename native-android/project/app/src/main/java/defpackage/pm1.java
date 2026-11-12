package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements no2, gn1 {
    public final int A;
    public final ik3 B;
    public final om1 C;
    public mo2 D;
    public int E;
    public tv4 F;
    public ln1[] G;
    public ln1[] H;
    public int I;
    public s80 J;
    public final xk0 n;
    public final al0 o;
    public final zh0 p;
    public final rw4 q;
    public final ww0 r;
    public final sw0 s;
    public final i80 t;
    public final ue1 u;
    public final n9 v;
    public final IdentityHashMap w;
    public final si1 x;
    public final i80 y;
    public final boolean z;

    public pm1(xk0 r1, al0 r2, zh0 r3, rw4 r4, ww0 r5, sw0 r6, i80 r7, ue1 r8, n9 r9, i80 r10, boolean r11, int r12, ik3 r13) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        this.y = r10;
        this.z = r11;
        this.A = r12;
        this.B = r13;
        this.C = new om1(0, this);
        r10.getClass();
        vw1 r14 = yw1.o;
        gy3 r15 = gy3.r;
        this.J = new s80(r15, r15);
        this.w = new IdentityHashMap();
        this.x = new si1(27);
        this.G = new ln1[0];
        this.H = new ln1[0];
    }

    public static tb1 j(tb1 r12, tb1 r13, boolean r14) {
        vw1 r0 = yw1.o;
        gy3 r1 = gy3.r;
        int r2 = -1;
        if (r13 == null) goto L5;
        String r3 = r13.k;
        qv2 r4 = r13.l;
        int r5 = r13.F;
        int r6 = r13.e;
        int r7 = r13.f;
        String r8 = r13.d;
        String r9 = r13.b;
        yw1 r15 = r13.c;
    L9:
        String r10 = lw2.d(r3);
        if (r14 == false) goto L12;
        int r11 = r12.h;
    L13:
        if (r14 == false) goto L15;
        r2 = r12.i;
    L15:
        sb1 r16 = new sb1();
        r16.a = r12.a;
        r16.b = r9;
        r16.c = yw1.k(r15);
        r16.l = lw2.m(r12.m);
        r16.m = lw2.m(r10);
        r16.j = r3;
        r16.k = r4;
        r16.h = r11;
        r16.i = r2;
        r16.E = r5;
        r16.e = r6;
        r16.f = r7;
        r16.d = r8;
        return new tb1(r16);
    L12:
        r11 = -1;
        goto L13
    L5:
        String r17 = f35.v(1, r12.k);
        r4 = r12.l;
        if (r14 == false) goto L8;
        r5 = r12.F;
        r6 = r12.e;
        r7 = r12.f;
        r8 = r12.d;
        r9 = r12.b;
        r3 = r17;
        r15 = r12.c;
        goto L9
    L8:
        r6 = 0;
        r8 = null;
        r3 = r17;
        r15 = r1;
        r5 = -1;
        r7 = 0;
        r9 = null;
        goto L9
    }

    @Override // defpackage.gn1
    public final void a() {
        ln1[] r0 = this.G;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L34;
        ln1 r4 = r0[r3];
        i61 r5 = r4.w;
        km1 r6 = r4.q;
        ArrayList r7 = r4.A;
        if (r7.isEmpty() == true) goto L33;
        nm1 r8 = (nm1) te5.w(r7);
        int r9 = r6.b(r8);
        int r10 = r8.o;
        boolean r11 = true;
        if (r9 == 1) goto L10;
        if (r9 != 0) goto L27;
        r4.E.post(new k6(25, r4, r8));
        goto L33
    L27:
        if (r9 != 2) goto L33;
        if (r4.g0 == true) goto L33;
        if (r5.l() == false) goto L33;
        r5.d();
        goto L33
    L10:
        if (r8.f() == true) goto L33;
        if (r10 != (-1)) goto L15;
        r11 = false;
    L15:
        rr2.w(r11);
        ym1 r12 = r6.g.a(false, r6.e[r6.h.b(r8.d)]);
        r12.getClass();
        yw1 r13 = r12.r;
        int r14 = (int) (r8.j - r12.k);
        if (r14 >= 0) goto L19;
        long r15 = 0;
    L23:
        r8.K = r15;
        goto L33
    L19:
        if (r14 >= r13.size()) goto L21;
        yw1 r16 = ((vm1) r13.get(r14)).z;
    L22:
        r15 = ((tm1) r16.get(r10)).p;
        goto L23
    L21:
        r16 = r12.s;
    L33:
        r3 = r3 + 1;
        goto L3
    L34:
        this.D.j(this);
    }

    @Override // defpackage.gn1
    public final boolean b(Uri r17, x7 r18, boolean r19) {
        ln1[] r2 = this.G;
        int r3 = r2.length;
        int r6 = 0;
        boolean r7 = true;
    L3:
        if (r6 >= r3) goto L42;
        ln1 r8 = r2[r6];
        km1 r9 = r8.q;
        Uri[] r10 = r9.e;
        if (f35.m(r10, r17) == true) goto L9;
    L7:
        boolean r4 = true;
    L41:
        r7 = r7 & r4;
        r6 = r6 + 1;
        goto L3
    L9:
        if (r19 == true) goto L16;
        i80 r11 = r8.v;
        n50 r13 = uo.n(r9.r);
        r11.getClass();
        dd2 r14 = i80.C(r13, r18);
        if (r14 == null) goto L16;
        if (r14.a != 2) goto L16;
        long r15 = r14.b;
    L17:
        int r16 = 0;
    L19:
        if (r16 >= r10.length) goto L24;
        if (r10[r16].equals(r17) == true) goto L25;
        r16 = r16 + 1;
    L25:
        if (r16 == (-1)) goto L7;
        int r5 = r9.r.t(r16);
        if (r5 == (-1)) goto L7;
        r9.o = r17;
        if (r15 != (-9223372036854775807L)) goto L33;
    L40:
        r4 = false;
        goto L41
    L33:
        if (r9.r.o(r5, r15) == false) goto L40;
        zk0 r12 = (zk0) r9.g.q.get(r17);
        if (r12 == null) goto L37;
        boolean r20 = zk0.a(r12, r15);
    L38:
        if (r20 == false) goto L40;
    L37:
        r20 = false;
        goto L38
    L24:
        r16 = -1;
    L16:
        r15 = -9223372036854775807L;
        goto L17
    L42:
        this.D.j(this);
        return r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.no2
    public final long c(t41[] r40, boolean[] r41, q44[] r42, boolean[] r43, long r44) {
        int[] r12 = new int[r40.length];
        int[] r13 = new int[r40.length];
        int r3 = 0;
    L3:
        int r6 = r40.length;
        IdentityHashMap r15 = this.w;
        if (r3 >= r6) goto L19;
        q44 r7 = r42[r3];
        if (r7 != null) goto L8;
        int r8 = -1;
    L9:
        r12[r3] = r8;
        r13[r3] = -1;
        t41 r9 = r40[r3];
        if (r9 == null) goto L18;
        sv4 r10 = r9.c();
        int r11 = 0;
    L12:
        ln1[] r14 = this.G;
        if (r11 >= r14.length) goto L18;
        ln1 r16 = r14[r11];
        r16.v();
        if (r16.V.b(r10) != (-1)) goto L16;
        r11 = r11 + 1;
        goto L12
    L16:
        r13[r3] = r11;
    L18:
        r3 = r3 + 1;
        goto L3
    L8:
        r8 = ((Integer) r15.get(r7)).intValue();
        goto L9
    L19:
        r15.clear();
        int r4 = r40.length;
        int r17 = r40.length;
        q44[] r18 = new q44[r17];
        int r19 = r40.length;
        t41[] r110 = new t41[r19];
        boolean r111 = false;
        ln1[] r112 = new ln1[this.G.length];
        int r113 = r17;
        int r20 = 0;
        int r114 = 0;
        boolean r115 = false;
        Object[] r21 = new q44[r4];
        Object[] r22 = r18;
    L21:
        if (r20 >= this.G.length) goto L163;
        int r23 = r4;
        ?? r24 = r111;
        Object[] r25 = r21;
    L23:
        Object[] r26 = r25;
        if (r24 >= r40.length) goto L34;
        if (r12[r24] != r20) goto L28;
        q44 r5 = r42[r24];
    L29:
        r22[r24] = r5;
        if (r13[r24] != r20) goto L32;
        t41 r27 = r40[r24];
    L33:
        r110[r24] = r27;
        r25 = r26;
        r24 = r24 + 1;
        goto L23
    L32:
        r27 = null;
        goto L33
    L28:
        r5 = null;
        goto L29
    L34:
        ln1 r28 = this.G[r20];
        i61 r29 = r28.w;
        int r210 = r20;
        km1 r30 = r28.q;
        Uri[] r31 = r30.e;
        al0 r32 = r30.g;
        ArrayList r33 = r28.A;
        r28.v();
        int r34 = r28.R;
        Object[] r211 = r22;
        ?? r35 = r111;
    L35:
        if (r35 >= r19) goto L49;
        hn1 r36 = (hn1) r211[r35];
        if (r36 != null) goto L39;
    L43:
        ?? r37 = r35;
    L48:
        r110 = r110;
        r35 = r37 + 1;
        goto L35
    L39:
        if (r110[r35] != null) goto L41;
    L42:
        r37 = r35;
        r28.R--;
        if (r36.p == (-1)) goto L47;
        ln1 r38 = r36.o;
        int r116 = r36.n;
        r38.v();
        r38.X.getClass();
        int r117 = r38.X[r116];
        rr2.w(r38.a0[r117]);
        r38.a0[r117] = r111;
        r36.p = -1;
    L47:
        r211[r37 == true ? 1 : 0] = null;
        goto L48
    L41:
        if (r41[r35] == true) goto L43;
    L49:
        t41[] r39 = r110;
        boolean r310 = true;
        if (r115 == false) goto L52;
    L54:
        int[] r212 = r12;
    L60:
        boolean r45 = true;
    L61:
        t41 r118 = r30.r;
        boolean r119 = r45;
        t41 r46 = r118;
        ?? r47 = r111;
    L62:
        if (r47 >= r19) goto L87;
        ?? r311 = r47;
        t41 r48 = r39[r311 == true ? 1 : 0];
        if (r48 != null) goto L66;
        int r312 = r19;
    L86:
        r19 = r312;
        r111 = false;
        r310 = true;
        r47 = (r311 == true ? 1 : 0) + 1;
        goto L62
    L66:
        r312 = r19;
        boolean r313 = r119;
        int r120 = r28.V.b(r48.c());
        if (r120 != r28.Y) goto L73;
        zk0 r49 = (zk0) r32.q.get(r31[r30.r.l()]);
        if (r49 == null) goto L71;
        r49.x = r111;
    L71:
        r30.r = r48;
        r46 = r48;
    L73:
        if (r211[r311 == true ? 1 : 0] != null) goto L85;
        r28.R++;
        hn1 r50 = new hn1(r28, r120);
        r211[r311 == true ? 1 : 0] = r50;
        r43[r311 == true ? 1 : 0] = r310;
        if (r28.X == null) goto L85;
        r50.a();
        if (r313 == true) goto L85;
        kn1 r51 = r28.I[r28.X[r120]];
        if (r51.o() != 0) goto L81;
    L83:
        boolean r52 = false;
    L84:
        r119 = r52;
        goto L86
    L81:
        if (r51.z(r310, r44) == true) goto L83;
        r52 = true;
    L85:
        r119 = r313;
        goto L86
    L87:
        int r314 = r19;
        boolean r315 = r119;
        if (r28.R != 0) goto L102;
        zk0 r53 = (zk0) r32.q.get(r31[r30.r.l()]);
        if (r53 == null) goto L92;
        r53.x = false;
    L92:
        r30.n = null;
        r28.T = null;
        r28.e0 = true;
        r33.clear();
        if (r29.l() == true) goto L95;
        r28.I();
    L101:
        km1 r121 = r30;
        int r54 = r113;
        int r316 = r23;
        Object[] r317 = r26;
        int r318 = r210;
        boolean r55 = r315;
        int[] r122 = r13;
        ln1[] r213 = r112;
        ln1 r123 = r28;
    L127:
        ArrayList r56 = r123.F;
        r56.clear();
        int r57 = 0;
    L128:
        if (r57 >= r54) goto L133;
        Object r58 = r211[r57];
        if (r58 == null) goto L132;
        r56.add((hn1) r58);
    L132:
        r57 = r57 + 1;
        goto L128
    L133:
        r123.f0 = true;
        int r59 = 0;
        boolean r60 = false;
        Object[] r319 = r317;
    L135:
        if (r59 >= r40.length) goto L146;
        Object r61 = r211[r59];
        int r124 = r318;
        if (r122[r59] != r124) goto L139;
        r61.getClass();
        Object[] r125 = r319;
        r125[r59] = r61;
        r15.put(r61, Integer.valueOf(r124));
        r60 = true;
    L145:
        r59 = r59 + 1;
        r319 = r125;
        r318 = r124;
        goto L135
    L139:
        r125 = r319;
        if (r212[r59] != r124) goto L145;
        if (r61 != null) goto L143;
        boolean r62 = true;
    L144:
        rr2.w(r62);
        goto L145
    L143:
        r62 = false;
        goto L144
    L146:
        Object[] r126 = r319;
        int r127 = r318;
        int r63 = r114;
        if (r60 == false) goto L162;
        r213[r63] = r123;
        r114 = r63 + 1;
        if (r63 != 0) goto L158;
        r121.l = true;
        if (r55 == true) goto L156;
        ln1[] r64 = this.H;
        if (r64.length == 0) goto L156;
        if (r123 == r64[0]) goto L162;
    L156:
        ((SparseArray) this.x.o).clear();
        r115 = true;
        goto L162
    L158:
        if (r127 >= this.I) goto L160;
        boolean r65 = true;
    L161:
        r121.l = r65;
        goto L162
    L160:
        r65 = false;
    L162:
        r20 = r127 + 1;
        r13 = r122;
        r12 = r212;
        r112 = r213;
        r22 = r211;
        r110 = r39;
        r4 = r316;
        r111 = false;
        r113 = r54;
        r21 = r126;
        r19 = r314;
        goto L21
    L95:
        if (r28.P == false) goto L99;
        kn1[] r66 = r28.I;
        int r67 = r66.length;
        int r68 = 0;
    L97:
        if (r68 >= r67) goto L99;
        r66[r68].j();
        r68 = r68 + 1;
    L99:
        r29.d();
        goto L101
    L102:
        boolean r128 = true;
        if (r33.isEmpty() == false) goto L105;
    L117:
        r121 = r30;
        int r320 = r113;
        r316 = r23;
        Object[] r321 = r26;
        r318 = r210;
        r122 = r13;
        r213 = r112;
        r123 = r28;
    L118:
        boolean r69 = r115;
        r55 = r315;
        r317 = r321;
    L119:
        if (r55 == false) goto L126;
        r123.J(r69, r44);
        r54 = r320;
        int r70 = 0;
    L121:
        if (r70 >= r54) goto L127;
        if (r211[r70] == null) goto L125;
        r43[r70] = r128;
    L125:
        r70 = r70 + 1;
        r128 = true;
        goto L121
    L126:
        r54 = r320;
        goto L127
    L105:
        if (Objects.equals(r46, r118) == true) goto L117;
        if (r28.f0 == true) goto L115;
        long r129 = 0;
        if (r44 >= 0) goto L111;
        r129 = -r44;
    L111:
        nm1 r71 = r28.C();
        long r214 = r129;
        xj2[] r130 = r30.a(r71, r44);
        r121 = r30;
        List r131 = r28.B;
        r320 = r113;
        r316 = r23;
        Object[] r322 = r26;
        r318 = r210;
        r122 = r13;
        r213 = r112;
        r123 = r28;
        t41 r72 = r46;
        r72.b(r44, r214, -9223372036854775807L, r131, r130);
        if (r72.l() == r121.h.b(r71.d)) goto L114;
        r128 = true;
        Object[] r323 = r322;
    L116:
        r123.e0 = r128;
        r69 = r128;
        r55 = r69;
        r317 = r323;
        goto L119
    L114:
        r128 = true;
        r321 = r322;
        goto L118
    L115:
        r121 = r30;
        r320 = r113;
        r316 = r23;
        r323 = r26;
        r318 = r210;
        r122 = r13;
        r213 = r112;
        r123 = r28;
        goto L116
    L52:
        if (r28.f0 == false) goto L56;
        if (r34 == 0) goto L54;
        r212 = r12;
    L59:
        r45 = r111;
        goto L61
    L56:
        r212 = r12;
        if (r44 == r28.c0) goto L59;
    L163:
        int r73 = r4;
        boolean r132 = r111;
        System.arraycopy(r21, r132 ? 1 : 0, r42, r132 ? 1 : 0, r73);
        ln1[] r1 = (ln1[]) f35.S(r114, r112);
        this.H = r1;
        gy3 r2 = yw1.l(r1);
        AbstractList r74 = hw.P(new mj0(27), r2);
        this.y.getClass();
        this.J = new s80(r2, r74);
        return r44;
    }

    @Override // defpackage.da4
    public final long d() {
        return this.J.d();
    }

    @Override // defpackage.no2
    public final long e(long r13, n84 r15) {
        ln1[] r12 = this.H;
        int r0 = r12.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L26;
        ln1 r2 = r12[r1];
        if (r2.N == 2) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        km1 r14 = r2.q;
        al0 r3 = r14.g;
        int r4 = r14.r.d();
        Uri[] r5 = r14.e;
        if (r4 < r5.length) goto L9;
    L11:
        ym1 r16 = null;
    L12:
        if (r16 == null) goto L26;
        yw1 r6 = r16.r;
        if (r6.isEmpty() == true) goto L26;
        long r7 = r16.h - r3.A;
        long r8 = r13 - r7;
        int r17 = f35.d(r6, Long.valueOf(r8), true);
        long r9 = ((vm1) r6.get(r17)).r;
        if (r16.c == true) goto L19;
    L22:
        long r10 = r9;
    L24:
        return r15.a(r8, r9, r10) + r7;
    L19:
        if (r17 == (r6.size() - 1)) goto L22;
        r10 = ((vm1) r6.get(r17 + 1)).r;
        goto L24
    L9:
        if (r4 == (-1)) goto L11;
        r16 = r3.a(true, r5[r14.r.l()]);
    L26:
        return r13;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.J.f();
    }

    public final ln1 g(String r17, int r18, Uri[] r19, tb1[] r20, tb1 r21, List r22, Map r23, long r24) {
        si1 r8 = this.x;
        ik3 r10 = this.B;
        km1 r1 = new km1(this.n, this.o, r19, r20, this.p, this.q, r8, r22, r10);
        int r14 = this.A;
        return new ln1(r17, r18, this.C, r1, r23, this.v, r24, r21, this.r, this.s, this.t, this.u, r14, null);
    }

    @Override // defpackage.no2
    public final void h() {
        ln1[] r4 = this.G;
        int r0 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        ln1 r2 = r4[r1];
        r2.G();
        if (r2.g0 == false) goto L11;
        if (r2.Q == true) goto L11;
        throw ParserException.a(null, "Loading finished before preparation is complete.");
    L11:
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.no2
    public final long i(long r5) {
        ln1[] r0 = this.H;
        if (r0.length <= 0) goto L10;
        boolean r1 = r0[0].J(false, r5);
        int r2 = 1;
    L5:
        ln1[] r3 = this.H;
        if (r2 >= r3.length) goto L8;
        r3[r2].J(r1, r5);
        r2 = r2 + 1;
        goto L5
    L8:
        if (r1 == false) goto L10;
        ((SparseArray) this.x.o).clear();
    L10:
        return r5;
    }

    @Override // defpackage.no2
    public final void k(boolean r9, long r10) {
        ln1[] r8 = this.H;
        int r0 = r8.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L13;
        ln1 r3 = r8[r2];
        if (r3.P == false) goto L12;
        if (r3.E() == true) goto L12;
        int r4 = r3.I.length;
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L12;
        r3.I[r5].i(r10, r9, r3.a0[r5]);
        r5 = r5 + 1;
    L12:
        r2 = r2 + 1;
        goto L3
    }

    @Override // defpackage.no2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 r26, long r27) {
        this.D = r26;
        al0 r1 = this.o;
        r1.getClass();
        r1.r.add(this);
        cn1 r10 = r1.w;
        r10.getClass();
        List r11 = r10.f;
        List r2 = r10.e;
        Map r7 = Collections.EMPTY_MAP;
        boolean r3 = r2.isEmpty();
        List r12 = r10.g;
        int r13 = 0;
        this.E = 0;
        ArrayList r14 = new ArrayList();
        ArrayList r15 = new ArrayList();
        xk0 r4 = this.n;
        boolean r5 = this.z;
        if (r3 == true) goto L77;
        tb1 r6 = r10.h;
        int r8 = r2.size();
        int[] r9 = new int[r8];
        int r16 = 0;
        int r17 = 0;
    L5:
        List r18 = r12;
        if (r16 >= r2.size()) goto L18;
        tb1 r19 = ((bn1) r2.get(r16)).b;
        int r110 = r19.v;
        String r20 = r19.k;
        if (r110 > 0) goto L16;
        if (f35.v(2, r20) != null) goto L16;
        if (f35.v(1, r20) == null) goto L15;
        r9[r16] = 1;
        r13 = r13 + 1;
    L17:
        r16 = r16 + 1;
        r12 = r18;
        goto L5
    L15:
        r9[r16] = -1;
    L16:
        r9[r16] = 2;
        r17 = r17 + 1;
        goto L17
    L18:
        if (r17 <= 0) goto L20;
        boolean r21 = false;
        int r111 = r17;
        boolean r22 = true;
    L23:
        Uri[] r23 = new Uri[r111];
        tb1[] r24 = new tb1[r111];
        int[] r112 = new int[r111];
        int r0 = 0;
        int r25 = 0;
    L25:
        if (r0 >= r2.size()) goto L36;
        if (r22 == false) goto L30;
        Uri[] r28 = r23;
        if (r9[r0] != 2) goto L35;
    L31:
        if (r21 == true) goto L33;
    L34:
        bn1 r29 = (bn1) r2.get(r0);
        r28[r25] = r29.a;
        r24[r25] = r29.b;
        r112[r25] = r0;
        r25 = r25 + 1;
        goto L35
    L33:
        if (r9[r0] != 1) goto L34;
    L35:
        r0 = r0 + 1;
        r23 = r28;
        goto L25
    L30:
        r28 = r23;
        goto L31
    L36:
        Uri[] r210 = r23;
        String r30 = r24[0].k;
        int r31 = f35.u(2, r30);
        int r32 = f35.u(1, r30);
        if (r32 == 1) goto L41;
        if (r32 == 0) goto L40;
    L45:
        boolean r113 = false;
    L46:
        if (r22 == true) goto L49;
        if (r32 <= 0) goto L49;
        int r33 = 1;
    L50:
        xk0 r114 = r4;
        List r211 = r11;
        boolean r212 = r5;
        ln1 r34 = g("main", r33, r210, r24, r10.h, r10.i, r7, r27);
        r14.add(r34);
        r15.add(r112);
        if (r212 == false) goto L76;
        if (r113 == false) goto L76;
        ArrayList r35 = new ArrayList();
        if (r31 <= 0) goto L71;
        tb1[] r36 = new tb1[r111];
        int r37 = 0;
    L56:
        if (r37 >= r111) goto L58;
        tb1 r38 = r24[r37];
        String r39 = f35.v(2, r38.k);
        String r115 = lw2.d(r39);
        sb1 r40 = new sb1();
        r40.a = r38.a;
        r40.b = r38.b;
        r40.c = yw1.k(r38.c);
        r40.l = lw2.m(r38.m);
        r40.m = lw2.m(r115);
        r40.j = r39;
        r40.k = r38.l;
        r40.h = r38.h;
        r40.i = r38.i;
        r40.t = r38.u;
        r40.u = r38.v;
        r40.x = r38.y;
        r40.e = r38.e;
        r40.f = r38.f;
        r36[r37] = new tb1(r40);
        r37 = r37 + 1;
        r24 = r24;
        goto L56
    L58:
        tb1[] r116 = r24;
        r35.add(new sv4("main", r36));
        if (r32 <= 0) goto L64;
        if (r6 == null) goto L62;
    L63:
        r35.add(new sv4("main:audio", new tb1[]{j(r116[0], r6, false)}));
        goto L64
    L62:
        if (r211.isEmpty() == true) goto L63;
    L64:
        List r41 = r10.i;
        if (r41 == null) goto L75;
        int r42 = 0;
    L68:
        if (r42 >= r41.size()) goto L75;
        r35.add(new sv4(f34.f(r42, "main:cc:"), new tb1[]{r114.i((tb1) r41.get(r42))}));
        r42 = r42 + 1;
    L75:
        sb1 r43 = new sb1();
        r43.a = "ID3";
        r43.m = lw2.m("application/id3");
        sv4 r44 = new sv4("main:id3", new tb1[]{new tb1(r43)});
        r35.add(r44);
        r34.H((sv4[]) r35.toArray(new sv4[0]), new int[]{r35.indexOf(r44)});
    L78:
        ArrayList r117 = new ArrayList(r211.size());
        ArrayList r118 = new ArrayList(r211.size());
        ArrayList r119 = new ArrayList(r211.size());
        HashSet r45 = new HashSet();
        int r46 = 0;
    L80:
        if (r46 >= r211.size()) goto L100;
        List r47 = r211;
        String r48 = ((an1) r47.get(r46)).c;
        if (r45.add(r48) == true) goto L84;
        HashSet r120 = r45;
        int r213 = r46;
        r211 = r47;
    L99:
        r46 = r213 + 1;
        r45 = r120;
        goto L80
    L84:
        r117.clear();
        r118.clear();
        r119.clear();
        int r49 = 0;
        boolean r121 = true;
    L86:
        if (r49 >= r47.size()) goto L95;
        if (r48.equals(((an1) r47.get(r49)).c) == false) goto L94;
        an1 r50 = (an1) r47.get(r49);
        r119.add(Integer.valueOf(r49));
        Uri r51 = r50.a;
        tb1 r52 = r50.b;
        r117.add(r51);
        r118.add(r52);
        if (f35.u(1, r52.k) != 1) goto L92;
        boolean r53 = true;
    L93:
        r121 = r121 & r53;
        goto L94
    L92:
        r53 = false;
    L94:
        r49 = r49 + 1;
        goto L86
    L95:
        String r54 = "audio:".concat(r48);
        String r55 = f35.a;
        r211 = r47;
        r120 = r45;
        r213 = r46;
        ln1 r56 = g(r54, 1, (Uri[]) r117.toArray(new Uri[0]), (tb1[]) r118.toArray(new tb1[0]), null, Collections.EMPTY_LIST, r7, r27);
        r15.add(jz4.N(r119));
        r14.add(r56);
        if (r212 == false) goto L99;
        if (r121 == false) goto L99;
        r56.H(new sv4[]{new sv4(r54, (tb1[]) r118.toArray(new tb1[0]))}, new int[0]);
        goto L99
    L100:
        this.I = r14.size();
        ArrayList r122 = new ArrayList(r18.size());
        ArrayList r123 = new ArrayList(r18.size());
        ArrayList r124 = new ArrayList(r18.size());
        HashSet r57 = new HashSet();
        int r58 = 0;
    L102:
        if (r58 >= r18.size()) goto L118;
        r18 = r18;
        String r59 = ((an1) r18.get(r58)).c;
        if (r57.add(r59) == true) goto L106;
        HashSet r125 = r57;
        int r126 = r58;
    L117:
        r58 = r126 + 1;
        r57 = r125;
        goto L102
    L106:
        r122.clear();
        r123.clear();
        r124.clear();
        int r60 = 0;
    L108:
        if (r60 >= r18.size()) goto L113;
        if (r59.equals(((an1) r18.get(r60)).c) == false) goto L112;
        an1 r61 = (an1) r18.get(r60);
        r124.add(Integer.valueOf(r60));
        r122.add(r61.a);
        r123.add(r61.b);
    L112:
        r60 = r60 + 1;
        goto L108
    L113:
        String r62 = "subtitle:".concat(r59);
        tb1[] r63 = (tb1[]) r123.toArray(new tb1[0]);
        String r64 = f35.a;
        Uri[] r65 = (Uri[]) r122.toArray(new Uri[0]);
        vw1 r66 = yw1.o;
        r125 = r57;
        r126 = r58;
        ln1 r67 = g(r62, 3, r65, r63, null, gy3.r, r7, r27);
        r15.add(jz4.N(r124));
        r14.add(r67);
        int r68 = r63.length;
        tb1[] r69 = new tb1[r68];
        int r70 = 0;
    L114:
        if (r70 >= r68) goto L116;
        r69[r70] = r114.i(r63[r70]);
        r70 = r70 + 1;
        goto L114
    L116:
        r67.H(new sv4[]{new sv4(r62, r69)}, new int[0]);
        goto L117
    L118:
        this.G = (ln1[]) r14.toArray(new ln1[0]);
        int[][] r71 = (int[][]) r15.toArray(new int[0][]);
        this.E = this.G.length;
        int r72 = 0;
    L119:
        int r73 = this.I;
        ln1[] r74 = this.G;
        if (r72 >= r73) goto L122;
        r74[r72].q.l = true;
        r72 = r72 + 1;
        goto L119
    L122:
        int r75 = r74.length;
        int r127 = 0;
    L123:
        if (r127 >= r75) goto L128;
        ln1 r76 = r74[r127];
        if (r76.Q == true) goto L127;
        od2 r77 = new od2();
        r77.a = r76.c0;
        r76.o(new pd2(r77));
    L127:
        r127 = r127 + 1;
        goto L123
    L128:
        this.H = this.G;
        return;
    L71:
        tb1[] r78 = new tb1[r111];
        int r79 = 0;
    L72:
        if (r79 >= r111) goto L74;
        r78[r79] = j(r24[r79], r6, true);
        r79 = r79 + 1;
        goto L72
    L74:
        r35.add(new sv4("main", r78));
    L76:
        r114 = r114;
    L49:
        r33 = 0;
        goto L50
    L40:
        if (r11.isEmpty() == false) goto L45;
    L41:
        if (r31 > 1) goto L45;
        if ((r32 + r31) <= 0) goto L45;
        r113 = true;
        goto L46
    L20:
        if (r13 >= r8) goto L22;
        r22 = false;
        r111 = r8 - r13;
        r21 = true;
        goto L23
    L22:
        r22 = false;
        r111 = r8;
        r21 = false;
        goto L23
    L77:
        r114 = r4;
        r212 = r5;
        r211 = r11;
        r18 = r12;
        goto L78
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 r0 = this.F;
        r0.getClass();
        return r0;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r7) {
        if (this.F != null) goto L12;
        ln1[] r6 = this.G;
        int r8 = r6.length;
        int r1 = 0;
    L5:
        if (r1 >= r8) goto L10;
        ln1 r2 = r6[r1];
        if (r2.Q == true) goto L9;
        od2 r3 = new od2();
        r3.a = r2.c0;
        r2.o(new pd2(r3));
    L9:
        r1 = r1 + 1;
        goto L5
    L10:
        return false;
    L12:
        return this.J.o(r7);
    }

    @Override // defpackage.da4
    public final long q() {
        return this.J.q();
    }

    @Override // defpackage.da4
    public final void u(long r1) {
        this.J.u(r1);
    }
}
