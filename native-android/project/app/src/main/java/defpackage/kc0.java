package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends jc0 {
    public p00[] A0;
    public p00[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final kr K0;
    public ArrayList p0;
    public final qp4 q0;
    public final xo0 r0;
    public int s0;
    public nr3 t0;
    public boolean u0;
    public final eb2 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public kc0() {
        this.p0 = new ArrayList();
        this.q0 = new qp4(this);
        xo0 r0 = new xo0();
        r0.b = true;
        r0.c = true;
        r0.f = new ArrayList();
        new ArrayList();
        r0.h = null;
        r0.i = new kr();
        r0.g = new ArrayList();
        r0.d = this;
        r0.e = this;
        this.r0 = r0;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new eb2();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new p00[4];
        this.B0 = new p00[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new kr();
    }

    public static void R(jc0 r9, nr3 r10, kr r11) {
        if (r10 != null) goto L4;
        return;
    L4:
        int r0 = r9.f0;
        int[] r1 = r9.t;
        if (r0 != 8) goto L7;
    L91:
        r11.e = 0;
        r11.f = 0;
        return;
    L7:
        if ((r9 instanceof pk1) == true) goto L91;
        if ((r9 instanceof ep) == true) goto L91;
        int[] r2 = r9.o0;
        r11.a = r2[0];
        boolean r3 = true;
        r11.b = r2[1];
        r11.c = r9.o();
        r11.d = r9.i();
        r11.i = false;
        r11.j = 0;
        if (r11.a != 3) goto L14;
        boolean r4 = true;
    L16:
        if (r11.b != 3) goto L18;
        boolean r5 = true;
    L20:
        if (r4 == true) goto L22;
    L24:
        boolean r6 = false;
    L25:
        if (r5 == true) goto L27;
    L29:
        boolean r7 = false;
    L31:
        if (r4 == true) goto L33;
    L43:
        if (r5 == false) goto L56;
        if (r9.r(1) == false) goto L56;
        if (r9.s != 0) goto L56;
        if (r7 == true) goto L56;
        r11.b = 2;
        if (r4 == true) goto L52;
    L54:
        r5 = false;
        goto L56
    L52:
        if (r9.r != 0) goto L54;
        r11.b = 1;
    L56:
        if (r9.y() == false) goto L59;
        r11.a = 1;
        r4 = false;
    L59:
        if (r9.z() == false) goto L62;
        r11.b = 1;
        r5 = false;
    L62:
        if (r6 == true) goto L64;
    L72:
        if (r7 == true) goto L74;
    L85:
        r10.d(r9, r11);
        r9.K(r11.e);
        r9.H(r11.f);
        r9.E = r11.h;
        int r12 = r11.g;
        r9.Z = r12;
        if (r12 > 0) goto L89;
        r3 = false;
    L89:
        r9.E = r3;
        r11.j = 0;
        return;
    L74:
        if (r1[1] != 4) goto L76;
        r11.b = 1;
        goto L85
    L76:
        if (r4 == true) goto L85;
        if (r11.a != 1) goto L80;
        int r8 = r11.c;
    L81:
        r11.b = 1;
        int r13 = r9.W;
        float r14 = r9.V;
        if (r13 != (-1)) goto L84;
        r11.d = (int) (r8 / r14);
        goto L85
    L84:
        r11.d = (int) (r14 * r8);
        goto L85
    L80:
        r11.b = 2;
        r10.d(r9, r11);
        r8 = r11.e;
        goto L81
    L64:
        if (r1[0] != 4) goto L66;
        r11.a = 1;
        goto L72
    L66:
        if (r5 == true) goto L72;
        if (r11.b != 1) goto L70;
        int r15 = r11.d;
    L71:
        r11.a = 1;
        r11.c = (int) (r9.V * r15);
        goto L72
    L70:
        r11.a = 2;
        r10.d(r9, r11);
        r15 = r11.f;
        goto L71
    L33:
        if (r9.r(0) == false) goto L43;
        if (r9.r != 0) goto L43;
        if (r6 == true) goto L43;
        r11.a = 2;
        if (r5 == true) goto L40;
    L42:
        r4 = false;
        goto L43
    L40:
        if (r9.s != 0) goto L42;
        r11.a = 1;
        goto L42
    L27:
        if (r9.V <= 0.0f) goto L29;
        r7 = true;
        goto L31
    L22:
        if (r9.V <= 0.0f) goto L24;
        r6 = true;
        goto L25
    L18:
        r5 = false;
        goto L20
    L14:
        r4 = false;
        goto L16
    }

    @Override // defpackage.jc0
    public final void A() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.A();
    }

    @Override // defpackage.jc0
    public final void C(yc5 r4) {
        super.C(r4);
        int r0 = this.p0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((jc0) this.p0.get(r1)).C(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.jc0
    public final void L(boolean r4, boolean r5) {
        super.L(r4, r5);
        int r0 = this.p0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((jc0) this.p0.get(r1)).L(r4, r5);
        r1 = r1 + 1;
        goto L3
    }

    public final void N(jc0 r6, int r7) {
        if (r7 != 0) goto L9;
        int r8 = this.y0 + 1;
        p00[] r1 = this.B0;
        if (r8 < r1.length) goto L7;
        this.B0 = (p00[]) Arrays.copyOf(r1, r1.length * 2);
    L7:
        p00[] r9 = this.B0;
        int r2 = this.y0;
        r9[r2] = new p00(r6, 0, this.u0);
        this.y0 = r2 + 1;
        return;
    L9:
        if (r7 != 1) goto L15;
        int r10 = this.z0 + 1;
        p00[] r3 = this.A0;
        if (r10 < r3.length) goto L13;
        this.A0 = (p00[]) Arrays.copyOf(r3, r3.length * 2);
    L13:
        p00[] r11 = this.A0;
        int r4 = this.z0;
        r11[r4] = new p00(r6, 1, this.u0);
        this.z0 = r4 + 1;
        return;
    }

    public final void O(eb2 r13) {
        boolean r0 = S(64);
        b(r13, r0);
        int r1 = this.p0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L10;
        jc0 r6 = (jc0) this.p0.get(r3);
        boolean[] r7 = r6.R;
        r7[0] = false;
        r7[1] = false;
        if ((r6 instanceof ep) == false) goto L8;
        r4 = true;
    L8:
        r3 = r3 + 1;
        goto L4
    L10:
        if (r4 == false) goto L34;
        int r5 = 0;
    L12:
        if (r5 >= r1) goto L34;
        jc0 r8 = (jc0) this.p0.get(r5);
        if ((r8 instanceof ep) == false) goto L33;
        ep r9 = (ep) r8;
        int r10 = 0;
    L17:
        if (r10 >= r9.q0) goto L33;
        jc0 r11 = r9.p0[r10];
        if (r9.s0 == false) goto L21;
    L23:
        int r12 = r9.r0;
        if (r12 == 0) goto L31;
        if (r12 == 1) goto L31;
        if (r12 != 2) goto L29;
    L30:
        r11.R[1] = true;
    L32:
        r10 = r10 + 1;
        goto L17
    L29:
        if (r12 != 3) goto L32;
    L31:
        r11.R[0] = true;
        goto L32
    L21:
        if (r11.c() == true) goto L23;
    L33:
        r5 = r5 + 1;
    L34:
        HashSet r14 = this.J0;
        r14.clear();
        int r15 = 0;
    L35:
        if (r15 >= r1) goto L41;
        jc0 r16 = (jc0) this.p0.get(r15);
        r16.getClass();
        if ((r16 instanceof pk1) == false) goto L39;
        r16.b(r13, r0);
    L39:
        r15 = r15 + 1;
    L41:
        if (r14.size() <= 0) goto L54;
        int r17 = r14.size();
        Iterator r18 = r14.iterator();
        if (r18.hasNext() == true) goto L51;
        if (r17 != r14.size()) goto L41;
        Iterator r19 = r14.iterator();
    L48:
        if (r19.hasNext() == false) goto L50;
        ((jc0) r19.next()).b(r13, r0);
        goto L48
    L50:
        r14.clear();
        goto L41
    L51:
        ((jc0) r18.next()).getClass();
        kf2.k();
        return;
    L54:
        if (eb2.q == false) goto L69;
        HashSet r20 = new HashSet();
        int r21 = 0;
    L56:
        if (r21 >= r1) goto L62;
        jc0 r22 = (jc0) this.p0.get(r21);
        r22.getClass();
        if ((r22 instanceof pk1) == true) goto L60;
        r20.add(r22);
    L60:
        r21 = r21 + 1;
        goto L56
    L62:
        if (this.o0[0] != 2) goto L64;
        int r110 = 0;
    L65:
        kc0 r23 = this;
        eb2 r24 = r13;
        r23.a(this, r24, r20, r110, false);
        Iterator r111 = r20.iterator();
    L67:
        if (r111.hasNext() == false) goto L88;
        jc0 r112 = (jc0) r111.next();
        uo.h(r23, r24, r112);
        r112.b(r24, r0);
    L88:
        if (r23.y0 <= 0) goto L91;
        l93.f(r23, r24, null, 0);
    L91:
        if (r23.z0 <= 0) goto L123;
        l93.f(r23, r24, null, 1);
        return;
    L123:
        return;
    L64:
        r110 = 1;
        goto L65
    L69:
        r23 = this;
        r24 = r13;
        int r113 = 0;
    L70:
        if (r113 >= r1) goto L88;
        jc0 r114 = (jc0) r23.p0.get(r113);
        if ((r114 instanceof kc0) == false) goto L83;
        int[] r25 = r114.o0;
        int r26 = r25[0];
        int r27 = r25[1];
        if (r26 != 2) goto L76;
        r114.I(1);
    L76:
        if (r27 != 2) goto L78;
        r114.J(1);
    L78:
        r114.b(r24, r0);
        if (r26 != 2) goto L81;
        r114.I(r26);
    L81:
        if (r27 != 2) goto L86;
        r114.J(r27);
    L86:
        r113 = r113 + 1;
        goto L70
    L83:
        uo.h(r23, r24, r114);
        if ((r114 instanceof pk1) == true) goto L86;
        r114.b(r24, r0);
        goto L86
    }

    public final boolean P(int r14, boolean r15) {
        xo0 r13 = this.r0;
        ArrayList r0 = (ArrayList) r13.f;
        kc0 r1 = (kc0) r13.d;
        boolean r2 = false;
        int r3 = r1.h(0);
        int r5 = r1.h(1);
        int r6 = r1.p();
        int r7 = r1.q();
        if (r15 == true) goto L5;
    L21:
        int[] r16 = r1.o0;
        if (r14 != 0) goto L28;
        int r17 = r16[0];
        if (r17 == 1) goto L26;
        if (r17 == 4) goto L26;
    L32:
        boolean r18 = false;
    L34:
        r13.g();
        int r19 = r0.size();
        int r8 = 0;
    L35:
        if (r8 >= r19) goto L45;
        Object r9 = r0.get(r8);
        r8 = r8 + 1;
        ba5 r10 = (ba5) r9;
        if (r10.f != r14) goto L35;
        if (r10.b != r1) goto L44;
        if (r10.g == false) goto L35;
    L44:
        r10.e();
        goto L35
    L45:
        int r110 = r0.size();
        int r11 = 0;
    L46:
        if (r11 >= r110) goto L65;
        Object r12 = r0.get(r11);
        r11 = r11 + 1;
        ba5 r20 = (ba5) r12;
        if (r20.f != r14) goto L46;
        if (r18 == true) goto L55;
        if (r20.b == r1) goto L46;
    L55:
        if (r20.h.j == false) goto L66;
        if (r20.i.j == false) goto L66;
        if ((r20 instanceof q00) == true) goto L46;
        if (r20.e.j == true) goto L46;
    L66:
        r1.I(r3);
        r1.J(r5);
        return r2;
    L65:
        r2 = true;
    L26:
        int r111 = r1.o() + r6;
        r1.d.i.d(r111);
        r1.d.e.d(r111 - r6);
    L27:
        r18 = true;
        goto L34
    L28:
        int r112 = r16[1];
        if (r112 == 1) goto L33;
        if (r112 != 4) goto L32;
    L33:
        int r113 = r1.i() + r7;
        r1.e.i.d(r113);
        r1.e.e.d(r113 - r7);
        goto L27
    L5:
        if (r3 == 2) goto L7;
        if (r5 != 2) goto L21;
    L7:
        int r21 = r0.size();
        int r114 = 0;
    L8:
        if (r114 >= r21) goto L14;
        Object r115 = r0.get(r114);
        r114 = r114 + 1;
        ba5 r116 = (ba5) r115;
        if (r116.f != r14) goto L8;
        if (r116.k() == true) goto L8;
        r15 = false;
    L14:
        if (r14 != 0) goto L18;
        if (r15 == false) goto L21;
        if (r3 != 2) goto L21;
        r1.I(1);
        r1.K(r13.d(r1, 0));
        r1.d.e.d(r1.o());
        goto L21
    L18:
        if (r15 == false) goto L21;
        if (r5 != 2) goto L21;
        r1.J(1);
        r1.H(r13.d(r1, 1));
        r1.e.e.d(r1.i());
        goto L21
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [jc0, kc0] */
    /* JADX WARN: Type inference failed for: r3v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void Q() {
        boolean[] r2 = uo.r;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int r4 = this.p0.size();
        int r0 = Math.max(0, o());
        int r5 = Math.max(0, i());
        int[] r6 = this.o0;
        int r8 = r6[1];
        int r9 = r6[0];
        int r10 = this.s0;
        hb0 r12 = this.I;
        hb0 r13 = this.H;
        if (r10 == 0) goto L5;
    L145:
        ?? r21 = r6;
    L146:
        eb2 r7 = this.v0;
        if (r4 <= 2) goto L151;
        if (r9 == 2) goto L153;
        if (r8 != 2) goto L151;
    L153:
        if (uo.q(this.C0, 1024) == false) goto L151;
        nr3 r11 = this.t0;
        ArrayList r14 = this.p0;
        int r15 = r14.size();
        int r16 = 0;
    L155:
        if (r16 >= r15) goto L160;
        jc0 r3 = (jc0) r14.get(r16);
        ?? r17 = r21[0];
        ?? r18 = r21[1];
        int[] r19 = r3.o0;
        int r24 = r16;
        if (gi1.a0(r17, r18, r19[0], r19[1]) == false) goto L158;
        r16 = r24 + 1;
        goto L155
    L158:
        int r29 = r0;
        int r25 = r4;
        int r26 = r5;
        int r28 = r8;
        int r31 = r9;
        hb0 r27 = r12;
        hb0 r23 = r13;
    L347:
        r5 = r26;
        int r20 = r28;
        int r22 = r29;
        int r30 = r31;
    L365:
        boolean r1 = false;
    L367:
        if (S(64) == false) goto L369;
    L372:
        boolean r32 = true;
    L373:
        r7.getClass();
        r7.h = false;
        if (this.C0 == 0) goto L377;
        if (r32 == false) goto L377;
        char r33 = 1;
        r7.h = true;
    L378:
        ArrayList r34 = this.p0;
        if (r21[0] != 2) goto L381;
    L384:
        boolean r35 = true;
    L385:
        this.y0 = 0;
        this.z0 = 0;
        int r110 = r25;
        int r111 = 0;
    L386:
        if (r111 >= r110) goto L391;
        jc0 r112 = (jc0) this.p0.get(r111);
        if ((r112 instanceof kc0) == false) goto L390;
        ((kc0) r112).Q();
    L390:
        r111 = r111 + 1;
        goto L386
    L391:
        boolean r113 = S(64);
        ?? r210 = r1;
        int r36 = 0;
        boolean r114 = true;
    L392:
        if (r114 == false) goto L516;
        int r115 = r36 + 1;
        r7.t();     // Catch: Exception -> L397
        this.y0 = 0;     // Catch: Exception -> L397
        this.z0 = 0;     // Catch: Exception -> L397
        e(r7);     // Catch: Exception -> L397
        int r37 = 0;
    L395:
        if (r37 >= r110) goto L399;
        ((jc0) this.p0.get(r37)).e(r7);     // Catch: Exception -> L397
        r37 = r37 + 1;     // Catch: Exception -> L397
        goto L395
    L399:
        O(r7);     // Catch: Exception -> L397
        WeakReference r38 = this.F0;     // Catch: Exception -> L456
        if (r38 != null) goto L535;
    L420:
        hb0 r116 = r27;
        boolean r211 = r35;
    L421:
        WeakReference r39 = this.H0;     // Catch: Exception -> L410
        if (r39 != null) goto L424;
    L426:
        WeakReference r40 = this.G0;     // Catch: Exception -> L410
        if (r40 != null) goto L429;
    L437:
        WeakReference r41 = this.I0;     // Catch: Exception -> L410
        if (r41 == null) goto L454;
        if (r41.get() == null) goto L454;
        r7.f(r7.k(this.J), r7.k((hb0) this.I0.get()), 0, 5);     // Catch: Exception -> L449
        this.I0 = null;     // Catch: Exception -> L447
    L447:
        e = e;
    L413:
        boolean r117 = true;
    L458:
        e.printStackTrace();
        System.out.println("EXCEPTION : " + e);
        boolean r118 = r117;
    L459:
        if (r118 == false) goto L469;
        r2[2] = false;
        boolean r42 = S(64);
        M(r7, r42);
        int r43 = this.p0.size();
        int r119 = 0;
        boolean r120 = false;
    L461:
        if (r119 >= r43) goto L468;
        jc0 r44 = (jc0) this.p0.get(r119);
        r44.M(r7, r42);
        boolean r212 = r42;
        int r213 = r43;
        if (r44.h == (-1)) goto L465;
    L466:
        r120 = true;
    L467:
        r119 = r119 + 1;
        r42 = r212;
        r43 = r213;
        r120 = r120;
        goto L461
    L465:
        if (r44.i == (-1)) goto L467;
    L468:
        boolean r121 = r120;
    L474:
        if (r211 == false) goto L490;
        if (r115 >= 8) goto L490;
        if (r2[2] == false) goto L490;
        int r45 = 0;
        int r46 = 0;
        int r122 = 0;
    L479:
        if (r45 >= r110) goto L481;
        jc0 r47 = (jc0) this.p0.get(r45);
        int r214 = r45;
        r122 = Math.max(r122, r47.o() + r47.X);
        r46 = Math.max(r46, r47.i() + r47.Y);
        r45 = r214 + 1;
        goto L479
    L481:
        int r48 = Math.max(this.a0, r122);
        int r49 = Math.max(this.b0, r46);
        r121 = r121;
        r210 = r210;
        if (r30 != 2) goto L486;
        r121 = r121;
        r210 = r210;
        if (o() >= r48) goto L486;
        K(r48);
        r21[0] = 2;
        r121 = true;
        r210 = 1;
    L486:
        if (r20 != 2) goto L490;
        if (i() >= r49) goto L490;
        H(r49);
        r21[1] = 2;
        r121 = true;
        r210 = 1;
    L490:
        int r50 = Math.max(this.a0, o());
        if (r50 <= o()) goto L493;
        K(r50);
        ?? r51 = 1;
        r21[0] = 1;
        boolean r123 = true;
        ?? r124 = 1;
    L494:
        int r52 = Math.max(this.b0, i());
        if (r52 <= i()) goto L497;
        H(r52);
        r21[r51] = r51;
        ?? r53 = r51;
        boolean r125 = r53 == true ? 1 : 0;
        ?? r54 = r53;
    L498:
        if (r54 != 0) goto L512;
        ?? r55 = r54;
        r55 = r54;
        boolean r126 = r125;
        r126 = r125;
        if (r21[0] != 2) goto L505;
        if (r22 <= 0) goto L505;
        r55 = r54;
        r126 = r125;
        if (o() <= r22) goto L505;
        this.D0 = r51;
        r21[0] = r51;
        K(r22);
        ?? r56 = r51;
        r126 = r56 == true ? 1 : 0;
        r55 = r56;
    L505:
        ?? r57 = r55;
        r57 = r55;
        boolean r127 = r126;
        r127 = r126;
        if (r21[r51] != 2) goto L511;
        if (r5 <= 0) goto L511;
        r57 = r55;
        r127 = r126;
        if (i() <= r5) goto L511;
        this.E0 = r51;
        r21[r51] = r51;
        H(r5);
        ?? r58 = 1;
        int r59 = 8;
        boolean r128 = true;
    L513:
        if (r115 <= r59) goto L515;
        r128 = false;
    L515:
        r210 = r58;
        r36 = r115;
        r35 = r211;
        r27 = r116;
        r114 = r128;
    L511:
        r59 = 8;
        r58 = r57;
        r128 = r127;
        goto L513
    L512:
        r57 = r54;
        r127 = r125;
        goto L511
    L497:
        r54 = r124;
        r125 = r123;
        goto L498
    L493:
        r51 = 1;
        r124 = r210;
        r123 = r121;
        goto L494
    L469:
        M(r7, r113);
        int r60 = 0;
    L470:
        if (r60 >= r110) goto L472;
        ((jc0) this.p0.get(r60)).M(r7, r113);
        r60 = r60 + 1;
        goto L470
    L472:
        r121 = false;
    L449:
        e = e;
    L451:
        e = e;
    L454:
        r7.p();     // Catch: Exception -> L447
        r118 = true;
        goto L459
    L429:
        if (r40.get() == null) goto L437;
        hb0 r61 = (hb0) this.G0.get();     // Catch: Exception -> L410
        hb0 r62 = r23;
        r23 = r62;
        r7.f(r7.k(r61), r7.k(r62), 0, 5);     // Catch: Exception -> L410
        this.G0 = null;     // Catch: Exception -> L410
    L435:
        e = e;
        r23 = r62;
        goto L413
    L424:
        if (r39.get() == null) goto L426;
        r7.f(r7.k(this.K), r7.k((hb0) this.H0.get()), 0, 5);     // Catch: Exception -> L410
        this.H0 = null;     // Catch: Exception -> L410
        goto L426
    L535:
    L418:
        e = e;
        r116 = r27;
    L417:
        r211 = r35;
        goto L413
    L403:
        if (r38.get() == null) goto L420;
        hb0 r63 = (hb0) this.F0.get();     // Catch: Exception -> L418
        r116 = r27;
        r211 = r35;
        r7.f(r7.k(r63), r7.k(r116), 0, 5);     // Catch: Exception -> L410
        this.F0 = null;     // Catch: Exception -> L410
    L410:
        e = e;
    L414:
        e = e;
    L416:
        e = e;
    L456:
        e = e;
        r116 = r27;
        r211 = r35;
    L397:
        e = e;
        r116 = r27;
        r211 = r35;
        r117 = r114;
        goto L458
    L516:
        boolean r215 = r210 == true ? 1 : 0;
        this.p0 = r34;
        if (r215 == false) goto L519;
        r21[0] = r30;
        r21[1] = r20;
    L519:
        C(r7.m);
        return;
    L381:
        if (r21[r33] == 2) goto L384;
        r35 = false;
    L377:
        r33 = 1;
        goto L378
    L369:
        if (S(128) == true) goto L372;
        r32 = false;
        goto L373
    L160:
        r25 = r4;
        r27 = r12;
        r23 = r13;
        int r64 = 0;
        ArrayList r65 = null;
        ArrayList r66 = null;
        ArrayList r67 = null;
        ArrayList r129 = null;
        ArrayList r130 = null;
        ArrayList r131 = null;
    L161:
        if (r64 >= r15) goto L221;
        int r216 = r64;
        jc0 r68 = (jc0) r14.get(r64);
        int r217 = r5;
        ?? r69 = r21[0];
        int r218 = r8;
        ?? r70 = r21[1];
        int r219 = r0;
        int[] r71 = r68.o0;
        int r310 = r9;
        if (gi1.a0(r69, r70, r71[0], r71[1]) == true) goto L165;
        R(r68, r11, this.K0);
    L165:
        boolean r72 = r68 instanceof pk1;
        if (r72 == false) goto L178;
        pk1 r73 = (pk1) r68;
        if (r73.t0 != 0) goto L173;
        if (r131 != null) goto L171;
        r131 = new ArrayList();
    L171:
        r131.add(r73);
    L173:
        if (r73.t0 != 1) goto L178;
        if (r65 != null) goto L176;
        r65 = new ArrayList();
    L176:
        r65.add(r73);
    L178:
        if ((r68 instanceof ep) == false) goto L199;
        if ((r68 instanceof ep) == false) goto L191;
        ep r74 = (ep) r68;
        if (r74.P() != 0) goto L187;
        if (r67 != null) goto L185;
        r67 = new ArrayList();
    L185:
        r67.add(r74);
    L187:
        if (r74.P() != 1) goto L199;
        if (r130 != null) goto L190;
        r130 = new ArrayList();
    L190:
        r130.add(r74);
        goto L199
    L191:
        ep r75 = (ep) r68;
        if (r67 != null) goto L194;
        r67 = new ArrayList();
    L194:
        r67.add(r75);
        if (r130 != null) goto L197;
        r130 = new ArrayList();
    L197:
        r130.add(r75);
    L199:
        if (r68.H.f != null) goto L209;
        if (r68.J.f != null) goto L209;
        if (r72 == true) goto L209;
        if ((r68 instanceof ep) == true) goto L209;
        if (r129 != null) goto L207;
        r129 = new ArrayList();
    L207:
        r129.add(r68);
    L209:
        if (r68.I.f != null) goto L220;
        if (r68.K.f != null) goto L220;
        if (r68.L.f != null) goto L220;
        if (r72 == true) goto L220;
        if ((r68 instanceof ep) == true) goto L220;
        if (r66 != null) goto L219;
        r66 = new ArrayList();
    L219:
        r66.add(r68);
    L220:
        r64 = r216 + 1;
        r5 = r217;
        r8 = r218;
        r0 = r219;
        r9 = r310;
        goto L161
    L221:
        r29 = r0;
        r26 = r5;
        r28 = r8;
        r31 = r9;
        ArrayList r76 = new ArrayList();
        if (r65 == null) goto L226;
        int r77 = r65.size();
        int r78 = 0;
    L224:
        if (r78 >= r77) goto L226;
        Object r79 = r65.get(r78);
        r78 = r78 + 1;
        gi1.n((pk1) r79, 0, r76, null);
    L226:
        if (r67 == null) goto L230;
        int r80 = r67.size();
        int r81 = 0;
    L228:
        if (r81 >= r80) goto L230;
        Object r82 = r67.get(r81);
        r81 = r81 + 1;
        ep r83 = (ep) r82;
        aa5 r84 = gi1.n(r83, 0, r76, null);
        r83.N(0, r84, r76);
        r84.a(r76);
    L230:
        HashSet r85 = g(2).a;
        if (r85 == null) goto L236;
        Iterator r86 = r85.iterator();
    L234:
        if (r86.hasNext() == false) goto L236;
        gi1.n(((hb0) r86.next()).d, 0, r76, null);
    L236:
        HashSet r87 = g(4).a;
        if (r87 == null) goto L242;
        Iterator r88 = r87.iterator();
    L240:
        if (r88.hasNext() == false) goto L242;
        gi1.n(((hb0) r88.next()).d, 0, r76, null);
    L242:
        HashSet r89 = g(7).a;
        if (r89 == null) goto L248;
        Iterator r90 = r89.iterator();
    L246:
        if (r90.hasNext() == false) goto L248;
        gi1.n(((hb0) r90.next()).d, 0, r76, null);
    L248:
        if (r129 == null) goto L252;
        int r91 = r129.size();
        int r92 = 0;
    L250:
        if (r92 >= r91) goto L252;
        Object r93 = r129.get(r92);
        r92 = r92 + 1;
        gi1.n((jc0) r93, 0, r76, null);
    L252:
        if (r131 == null) goto L256;
        int r94 = r131.size();
        int r95 = 0;
    L254:
        if (r95 >= r94) goto L256;
        Object r96 = r131.get(r95);
        r95 = r95 + 1;
        gi1.n((pk1) r96, 1, r76, null);
    L256:
        if (r130 == null) goto L260;
        int r97 = r130.size();
        int r98 = 0;
    L258:
        if (r98 >= r97) goto L260;
        Object r99 = r130.get(r98);
        r98 = r98 + 1;
        ep r100 = (ep) r99;
        aa5 r101 = gi1.n(r100, 1, r76, null);
        r100.N(1, r101, r76);
        r101.a(r76);
    L260:
        HashSet r102 = g(3).a;
        if (r102 == null) goto L266;
        Iterator r103 = r102.iterator();
    L264:
        if (r103.hasNext() == false) goto L266;
        gi1.n(((hb0) r103.next()).d, 1, r76, null);
    L266:
        HashSet r104 = g(6).a;
        if (r104 == null) goto L272;
        Iterator r105 = r104.iterator();
    L270:
        if (r105.hasNext() == false) goto L272;
        gi1.n(((hb0) r105.next()).d, 1, r76, null);
    L272:
        HashSet r106 = g(5).a;
        if (r106 == null) goto L278;
        Iterator r107 = r106.iterator();
    L276:
        if (r107.hasNext() == false) goto L278;
        gi1.n(((hb0) r107.next()).d, 1, r76, null);
    L278:
        HashSet r108 = g(7).a;
        if (r108 == null) goto L284;
        Iterator r109 = r108.iterator();
    L282:
        if (r109.hasNext() == false) goto L284;
        gi1.n(((hb0) r109.next()).d, 1, r76, null);
    L284:
        if (r66 == null) goto L288;
        int r132 = r66.size();
        int r133 = 0;
    L286:
        if (r133 >= r132) goto L288;
        Object r134 = r66.get(r133);
        r133 = r133 + 1;
        gi1.n((jc0) r134, 1, r76, null);
    L288:
        char r135 = 1;
        int r136 = 0;
    L289:
        if (r136 >= r15) goto L313;
        jc0 r137 = (jc0) r14.get(r136);
        int[] r138 = r137.o0;
        if (r138[0] != 3) goto L311;
        if (r138[r135] != 3) goto L311;
        int r139 = r137.m0;
        int r140 = r76.size();
        int r141 = 0;
    L295:
        if (r141 >= r140) goto L300;
        aa5 r142 = (aa5) r76.get(r141);
        if (r139 == r142.b) goto L301;
        r141 = r141 + 1;
    L301:
        int r143 = r137.n0;
        int r144 = r76.size();
        int r145 = 0;
    L302:
        if (r145 >= r144) goto L307;
        aa5 r146 = (aa5) r76.get(r145);
        if (r143 == r146.b) goto L308;
        r145 = r145 + 1;
    L308:
        if (r142 == null) goto L311;
        if (r146 == null) goto L311;
        r142.c(0, r146);
        r146.c = 2;
        r76.remove(r142);
        goto L311
    L307:
        r146 = null;
        goto L308
    L300:
        r142 = null;
    L311:
        r136 = r136 + 1;
        r135 = 1;
        goto L289
    L313:
        if (r76.size() <= 1) goto L347;
        if (r21[0] != 2) goto L328;
        int r147 = r76.size();
        int r148 = 0;
        int r149 = 0;
        aa5 r150 = null;
    L318:
        if (r149 >= r147) goto L325;
        Object r151 = r76.get(r149);
        r149 = r149 + 1;
        aa5 r152 = (aa5) r151;
        if (r152.c == 1) goto L318;
        int r153 = r152.b(r7, 0);
        if (r153 <= r148) goto L318;
        r150 = r152;
        r148 = r153;
        goto L318
    L325:
        char r154 = 1;
        if (r150 == null) goto L329;
        I(1);
        K(r148);
    L331:
        if (r21[r154] != 2) goto L343;
        int r155 = r76.size();
        int r156 = 0;
        int r157 = 0;
        aa5 r158 = null;
    L333:
        if (r157 >= r155) goto L341;
        Object r159 = r76.get(r157);
        r157 = r157 + 1;
        aa5 r160 = (aa5) r159;
        if (r160.c == 0) goto L333;
        int r161 = r160.b(r7, 1);
        if (r161 <= r156) goto L333;
        r158 = r160;
        r156 = r161;
        goto L333
    L341:
        if (r158 == null) goto L343;
        J(1);
        H(r156);
    L344:
        if (r150 != null) goto L346;
        if (r158 == null) goto L347;
    L346:
        r30 = r31;
        if (r30 != 2) goto L355;
        int r162 = r29;
        if (r162 >= o()) goto L353;
        if (r162 <= 0) goto L353;
        K(r162);
        this.D0 = true;
    L356:
        int r163 = r162;
    L354:
        r20 = r28;
        if (r20 != 2) goto L363;
        r5 = r26;
        if (r5 >= i()) goto L362;
        if (r5 <= 0) goto L362;
        H(r5);
        this.E0 = true;
    L364:
        r22 = r163;
        r1 = true;
    L362:
        r5 = i();
        goto L364
    L363:
        r5 = r26;
    L353:
        r163 = o();
        goto L354
    L355:
        r162 = r29;
    L343:
        r158 = null;
    L329:
        r150 = null;
        goto L331
    L328:
        r154 = 1;
    L151:
        r22 = r0;
        r25 = r4;
        r20 = r8;
        r30 = r9;
        r27 = r12;
        r23 = r13;
        goto L365
    L5:
        if (uo.q(this.C0, 1) == false) goto L145;
        nr3 r164 = this.t0;
        int r165 = r6[0];
        int r166 = r6[1];
        B();
        ArrayList r167 = this.p0;
        int r168 = r167.size();
        int r169 = 0;
    L7:
        if (r169 >= r168) goto L9;
        ((jc0) r167.get(r169)).B();
        r169 = r169 + 1;
        goto L7
    L9:
        boolean r170 = this.u0;
        if (r165 != 1) goto L12;
        F(0, o());
    L13:
        int r171 = 0;
        boolean r172 = false;
        boolean r173 = false;
    L15:
        if (r171 >= r168) goto L39;
        int r220 = r171;
        jc0 r174 = (jc0) r167.get(r171);
        int[] r221 = r6;
        if ((r174 instanceof pk1) == false) goto L33;
        pk1 r175 = (pk1) r174;
        boolean r222 = r172;
        if (r175.t0 != 1) goto L32;
        int r176 = r175.q0;
        if (r176 == (-1)) goto L24;
        r175.N(r176);
    L31:
        r222 = true;
        goto L32
    L24:
        if (r175.r0 == (-1)) goto L29;
        if (y() == false) goto L29;
        r175.N(o() - r175.r0);
    L29:
        if (y() == false) goto L31;
        r175.N((int) ((r175.p0 * o()) + 0.5f));
    L32:
        r172 = r222;
    L38:
        r171 = r220 + 1;
        r6 = r221;
        goto L15
    L33:
        r222 = r172;
        if ((r174 instanceof ep) == false) goto L32;
        if (((ep) r174).P() != 0) goto L32;
        r172 = r222;
        r173 = true;
        goto L38
    L39:
        r21 = r6;
        if (r172 == false) goto L51;
        int r177 = 0;
    L42:
        if (r177 >= r168) goto L51;
        jc0 r178 = (jc0) r167.get(r177);
        if ((r178 instanceof pk1) == false) goto L49;
        pk1 r179 = (pk1) r178;
        int r223 = r177;
        if (r179.t0 != 1) goto L50;
        q05.p(0, r179, r164, r170);
    L50:
        r177 = r223 + 1;
        goto L42
    L49:
        r223 = r177;
    L51:
        q05.p(0, this, r164, r170);
        if (r173 == false) goto L65;
        int r180 = 0;
    L54:
        if (r180 >= r168) goto L65;
        jc0 r181 = (jc0) r167.get(r180);
        if ((r181 instanceof ep) == false) goto L63;
        ep r182 = (ep) r181;
        if (r182.P() != 0) goto L63;
        if (r182.O() == false) goto L63;
        q05.p(1, r182, r164, r170);
    L63:
        r180 = r180 + 1;
    L65:
        if (r166 != 1) goto L67;
        G(0, i());
    L68:
        int r183 = 0;
        boolean r184 = false;
        boolean r185 = false;
    L69:
        if (r183 >= r168) goto L92;
        jc0 r186 = (jc0) r167.get(r183);
        int r187 = r183;
        if ((r186 instanceof pk1) == false) goto L87;
        pk1 r188 = (pk1) r186;
        if (r188.t0 != 0) goto L91;
        int r189 = r188.q0;
        if (r189 == (-1)) goto L78;
        r188.N(r189);
    L85:
        r184 = true;
        goto L91
    L78:
        if (r188.r0 == (-1)) goto L83;
        if (z() == false) goto L83;
        r188.N(i() - r188.r0);
    L83:
        if (z() == false) goto L85;
        r188.N((int) ((r188.p0 * i()) + 0.5f));
    L91:
        r183 = r187 + 1;
        goto L69
    L87:
        if ((r186 instanceof ep) == false) goto L91;
        if (((ep) r186).P() != 1) goto L91;
        r185 = true;
        goto L91
    L92:
        if (r184 == false) goto L101;
        int r190 = 0;
    L94:
        if (r190 >= r168) goto L101;
        jc0 r191 = (jc0) r167.get(r190);
        if ((r191 instanceof pk1) == false) goto L100;
        pk1 r192 = (pk1) r191;
        if (r192.t0 != 0) goto L100;
        q05.C(1, r192, r164);
    L100:
        r190 = r190 + 1;
    L101:
        q05.C(0, this, r164);
        if (r185 == false) goto L113;
        int r193 = 0;
    L104:
        if (r193 >= r168) goto L113;
        jc0 r194 = (jc0) r167.get(r193);
        if ((r194 instanceof ep) == false) goto L112;
        ep r195 = (ep) r194;
        if (r195.P() != 1) goto L112;
        if (r195.O() == false) goto L112;
        q05.C(1, r195, r164);
    L112:
        r193 = r193 + 1;
    L113:
        int r196 = 0;
    L114:
        if (r196 >= r168) goto L127;
        jc0 r197 = (jc0) r167.get(r196);
        if (r197.x() == false) goto L126;
        if (q05.g(r197) == false) goto L126;
        R(r197, r164, q05.a);
        if ((r197 instanceof pk1) == true) goto L122;
        q05.p(0, r197, r164, r170);
        q05.C(0, r197, r164);
        goto L126
    L122:
        if (((pk1) r197).t0 != 0) goto L124;
        q05.C(0, r197, r164);
        goto L126
    L124:
        q05.p(0, r197, r164, r170);
    L126:
        r196 = r196 + 1;
        goto L114
    L127:
        int r198 = 0;
    L128:
        if (r198 >= r4) goto L146;
        jc0 r199 = (jc0) this.p0.get(r198);
        if (r199.x() == false) goto L144;
        if ((r199 instanceof pk1) == true) goto L144;
        if ((r199 instanceof ep) == true) goto L144;
        int r200 = r199.h(0);
        int r201 = r199.h(1);
        if (r200 == 3) goto L138;
    L143:
        R(r199, this.t0, new kr());
        goto L144
    L138:
        if (r199.r == 1) goto L143;
        if (r201 != 3) goto L143;
        if (r199.s == 1) goto L143;
    L144:
        r198 = r198 + 1;
        goto L128
    L67:
        r12.i(0);
        this.Y = 0;
        goto L68
    L12:
        r13.i(0);
        this.X = 0;
        goto L13
    }

    public final boolean S(int r1) {
        if ((this.C0 & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.jc0
    public final void l(StringBuilder r4) {
        r4.append(this.j + ":{\n");
        StringBuilder r0 = new StringBuilder("  actualWidth:");
        r0.append(this.T);
        r4.append(r0.toString());
        r4.append("\n");
        r4.append("  actualHeight:" + this.U);
        r4.append("\n");
        ArrayList r3 = this.p0;
        int r1 = r3.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r5 = r3.get(r2);
        r2 = r2 + 1;
        ((jc0) r5).l(r4);
        r4.append(",\n");
        goto L3
    L5:
        r4.append("}");
    }
}
