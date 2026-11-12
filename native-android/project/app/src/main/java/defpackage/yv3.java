package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv3 {
    public final e02 a;
    public final ra b;
    public final ue1 c;
    public final pt4 d;
    public final q03 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ga i;
    public long j;
    public final wc k;
    public final v03 l;

    public yv3(i03 r2, ra r3) {
        this.a = r2;
        this.b = r3;
        ue1 r4 = new ue1(11, 0);
        r4.p = new long[192];
        r4.q = new long[192];
        this.c = r4;
        this.d = new pt4();
        this.e = new q03();
        this.j = -1;
        this.k = new wc(18, this);
        this.l = new v03();
    }

    public static boolean c(f63 r0) {
        tb3 r1 = r0.g0;
        if (r1 != null) goto L5;
        return false;
    L5:
        if (jz4.B(((vj1) r1).b()) == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean d(c72 r1) {
        if (r1.t == (-4)) goto L6;
        return true;
    L6:
        return false;
    }

    public static long g(c72 r5) {
        w12 r6 = r5.Q;
        f63 r0 = (f63) r6.e;
        f63 r7 = (iz1) r6.d;
        long r1 = 0;
    L3:
        if (r7 == null) goto L10;
        if (r7 == r0) goto L10;
        if (c(r7) == true) goto L7;
        r1 = g02.c(r1, r7.S);
        r7 = r7.J;
        goto L3
    L7:
        return 9223372034707292159L;
    L10:
        return r1;
    }

    public static void j(c72 r5) {
        if (r5.p == true) goto L5;
        return;
    L5:
        if (c((f63) r5.Q.e) == true) goto L16;
        int r0 = 0;
        r5.p = false;
        if (r5.r == false) goto L10;
        r5.q = g(r5);
        r5.r = false;
    L10:
        if (g02.a(r5.q, 9223372034707292159L) == true) goto L17;
        f13 r6 = r5.y();
        Object[] r1 = r6.n;
        int r7 = r6.p;
    L12:
        if (r0 >= r7) goto L18;
        j((c72) r1[r0]);
        r0 = r0 + 1;
        goto L12
    L18:
        return;
    L17:
        return;
    }

    public final void a() {
        ga r1 = this.i;
        if (r1 == null) goto L5;
        this.b.removeCallbacks(r1);
        this.i = null;
    L5:
        long r9 = System.currentTimeMillis();
        boolean r2 = this.f;
        if (r2 == false) goto L8;
    L11:
        boolean r12 = true;
    L12:
        ue1 r15 = this.c;
        boolean r3 = true;
        pt4 r4 = this.d;
        if (r2 == false) goto L45;
        this.f = false;
        q03 r5 = this.e;
        Object[] r6 = r5.a;
        int r7 = r5.b;
        int r8 = 0;
    L15:
        if (r8 >= r7) goto L17;
        ((gf1) r6[r8]).invoke();
        r8 = r8 + 1;
        goto L15
    L17:
        long[] r10 = (long[]) r15.p;
        int r11 = r15.o;
        int r13 = 0;
    L19:
        if (r13 >= (r10.length - 2)) goto L40;
        if (r13 >= r11) goto L40;
        long r14 = r10[r13 + 2];
        boolean r16 = r3;
        int r17 = r11;
        if ((((int) (r14 >> 60)) & 1) == 0) goto L39;
        long r18 = r10[r13];
        long r19 = r10[r13 + 1];
        ot4 r20 = (ot4) r4.a.b(((int) r14) & 33554431);
    L24:
        if (r20 == null) goto L39;
        ot4 r21 = r20.d;
        boolean r30 = r12;
        long r110 = r20.g;
        if ((r9 - r110) < 0) goto L28;
    L31:
        boolean r22 = r16;
    L32:
        r20.e = r18;
        r20.f = r19;
        if (r22 == false) goto L35;
        r20.g = r9;
        long r111 = r18;
        long r23 = r19;
        r20.a(r111, r23, r4.d, r4.e, r4.g);
    L36:
        r20 = r21;
        r18 = r111;
        r19 = r23;
        r12 = r30;
        goto L24
    L35:
        r111 = r18;
        r23 = r19;
        goto L36
    L28:
        if (r110 == Long.MIN_VALUE) goto L31;
        r22 = false;
    L39:
        r13 = r13 + 3;
        r3 = r16;
        r11 = r17;
        r12 = r12;
    L40:
        boolean r31 = r12;
        long r28 = 0;
        long[] r24 = (long[]) r15.p;
        int r25 = r15.o;
        int r26 = 0;
    L42:
        if (r26 >= (r24.length - 2)) goto L47;
        if (r26 >= r25) goto L47;
        int r27 = r26 + 2;
        r24[r27] = r24[r27] & (-1152921504606846977L);
        r26 = r26 + 3;
    L47:
        if (this.g == false) goto L68;
        this.g = false;
        long r29 = r4.d;
        long r32 = r4.e;
        float[] r33 = r4.g;
        i03 r34 = r4.a;
        long r112 = 128;
        Object[] r113 = r34.c;
        long[] r35 = r34.a;
        int r114 = r35.length - 2;
        if (r114 < 0) goto L67;
        int r115 = 0;
        int r116 = 8;
        long r210 = 255;
    L51:
        long r211 = r29;
        long r36 = r35[r115];
        int r37 = r116;
        r15 = r15;
        if (((((~r36) << 7) & r36) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L64;
        int r117 = 8 - ((~(r115 - r114)) >>> 31);
        long r212 = r36;
        int r118 = 0;
    L54:
        if (r118 >= r117) goto L61;
        if ((r212 & 255) >= 128) goto L60;
        ot4 r38 = (ot4) r113[(r115 << 3) + r118];
    L58:
        if (r38 == null) goto L60;
        r4.a(r38, r211, r32, r33, r9);
        r38 = r38.d;
        r37 = r37;
        r35 = r35;
    L60:
        long[] r39 = r35;
        int r40 = r37;
        r212 = r212 >> r40;
        r118 = r118 + 1;
        r211 = r211;
        r37 = r40;
        r35 = r39;
        goto L54
    L61:
        long[] r310 = r35;
        int r41 = r37;
        r29 = r211;
        if (r117 != r41) goto L70;
    L65:
        if (r115 == r114) goto L70;
        r115 = r115 + 1;
        r116 = r41;
        r15 = r15;
        r35 = r310;
    L70:
        if (r31 == false) goto L76;
        long r42 = r4.d;
        long r43 = r4.e;
        float[] r44 = r4.g;
        ot4 r45 = r4.b;
        if (r45 == null) goto L76;
    L73:
        if (r45 == null) goto L76;
        c72 r119 = j51.O(r45.b);
        long r120 = ((ra) h12.L(r119)).getRectManager().b(r119);
        r45.e = r120;
        ti2 r121 = r119.R.p;
        r45.f = (((long) (r121.n + ((int) (r120 >> 32)))) << 32) | (((long) (r121.o + ((int) (r120 & 4294967295L)))) & 4294967295L);
        r4.a(r45, r42, r43, r44, r9);
        r45 = r45.d;
    L76:
        if (this.h == false) goto L88;
        int r46 = 0;
        this.h = false;
        ue1 r47 = r15;
        long[] r48 = (long[]) r47.p;
        int r49 = r47.o;
        long[] r50 = (long[]) r47.q;
        int r51 = 0;
        int r122 = 0;
    L79:
        if (r51 >= (r48.length - 2)) goto L87;
        if (r122 >= (r50.length - 2)) goto L87;
        if (r51 >= r49) goto L87;
        int r123 = r51 + 2;
        if (r48[r123] == xv3.a) goto L86;
        r50[r122] = r48[r51];
        r50[r122 + 1] = r48[r51 + 1];
        r50[r122 + 2] = r48[r123];
        r122 = r122 + 3;
    L86:
        r51 = r51 + 3;
    L87:
        r47.o = r122;
        r47.p = r50;
        r47.q = r48;
    L90:
        if (r4.c > r9) goto L114;
        i03 r52 = r4.a;
        Object[] r53 = r52.c;
        long[] r54 = r52.a;
        int r55 = r54.length - 2;
        if (r55 < 0) goto L108;
        int r56 = r46;
    L95:
        long r57 = r54[r56];
        if (((((~r57) << 7) & r57) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L106;
        int r124 = 8 - ((~(r56 - r55)) >>> 31);
        long r125 = r57;
        int r58 = r46;
    L98:
        if (r58 >= r124) goto L105;
        if ((r125 & r210) >= r112) goto L104;
        ot4 r59 = (ot4) r53[(r56 << 3) + r58];
    L102:
        if (r59 == null) goto L104;
        r59 = r59.d;
    L104:
        r125 = r125 >> r41;
        r58 = r58 + 1;
        goto L98
    L105:
        if (r124 != r41) goto L108;
    L106:
        if (r56 == r55) goto L108;
        r56 = r56 + 1;
    L108:
        ot4 r60 = r4.b;
        if (r60 == null) goto L112;
    L110:
        if (r60 == null) goto L112;
        r60 = r60.d;
    L112:
        r4.c = -1;
    L114:
        if (r4.c <= r28) goto L142;
        k();
        return;
    L142:
        return;
    L88:
        r46 = 0;
        goto L90
    L64:
        r310 = r35;
        r41 = r37;
        r29 = r211;
        goto L65
    L67:
        r41 = 8;
    L69:
        r210 = 255;
        goto L70
    L68:
        r41 = 8;
        r112 = 128;
        goto L69
    L45:
        r31 = r12;
        r28 = 0;
        goto L47
    L8:
        if (this.g == true) goto L11;
        r12 = false;
        goto L12
    }

    public final long b(c72 r5) {
        if (d(r5) == false) goto L6;
        int r6 = e(r5);
        long r0 = ((long[]) this.c.p)[r6];
        int r7 = (int) (r0 >> 32);
        return (((long) r7) << 32) | (((long) ((int) r0)) & 4294967295L);
    L6:
        return 9223372034707292159L;
    }

    public final int e(c72 r8) {
        int r0 = r8.t;
        if (r0 != (-4)) goto L5;
    L4:
        r0 = -4;
    L19:
        if (r0 != (-4)) goto L22;
        cz1.a("LayoutNode " + r8.o + " not found in RectList");
    L22:
        r8.t = r0;
        return r0;
    L5:
        int r2 = r8.o;
        ue1 r7 = this.c;
        long[] r3 = (long[]) r7.p;
        if (r0 >= 0) goto L8;
    L12:
        int r1 = r2 & 33554431;
        int r9 = r7.o;
        int r4 = 0;
    L14:
        if (r4 >= (r9 - 2)) goto L4;
        if ((((int) r3[r4 + 2]) & 33554431) == r1) goto L17;
        r4 = r4 + 3;
        goto L14
    L17:
        r0 = r4;
        goto L19
    L8:
        if (r0 >= (r7.o - 2)) goto L12;
        if ((((int) r3[r0 + 2]) & 33554431) != (r2 & 33554431)) goto L12;
        goto L12
    }

    public final void f(c72 r21) {
        r21.p = true;
        w12 r3 = r21.Q;
        f63 r4 = (f63) r3.e;
        ti2 r5 = r21.R.p;
        int r6 = r5.G();
        float r7 = r5.F();
        v03 r8 = this.l;
        r8.b = 0.0f;
        r8.c = 0.0f;
        r8.d = r6;
        r8.e = r7;
    L4:
        if (r4 == null) goto L18;
        c72 r9 = r4.H;
        if (r4 == ((f63) r9.Q.e)) goto L8;
    L12:
        tb3 r10 = r4.g0;
        if (r10 == null) goto L17;
        float[] r11 = ((vj1) r10).b();
        if (jz4.B(r11) == true) goto L17;
        ya4.B(r11, r8);
    L17:
        long r12 = r4.S;
        long r13 = Float.floatToRawIntBits((int) (r12 >> 32));
        r8.d((4294967295L & ((long) Float.floatToRawIntBits((int) (r12 & 4294967295L)))) | (r13 << 32));
        r4 = r4.J;
        goto L4
    L8:
        if (r9.p == true) goto L12;
        long r14 = b(r9);
        if (g02.a(r14, 9223372034707292159L) == true) goto L12;
        r8.d((Float.floatToRawIntBits((int) (r14 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r14 & 4294967295L)) & 4294967295L));
    L18:
        int r15 = (int) r8.b;
        int r16 = (int) r8.c;
        int r17 = (int) r8.d;
        int r18 = (int) r8.e;
        int r19 = r21.o;
        int r20 = r21.t;
        ue1 r22 = this.c;
        int r23 = -4;
        if (r20 == (-4)) goto L21;
        int r24 = e(r21);
        long[] r25 = (long[]) r22.p;
        r25[r24] = (((long) r15) << 32) | (((long) r16) & 4294967295L);
        r25[r24 + 1] = (4294967295L & ((long) r18)) | (((long) r17) << 32);
        int r26 = r24 + 2;
        long r27 = r25[r26];
        r25[r26] = r27 | (((r27 >> 63) & 1) << 60);
    L29:
        int r28 = 0;
        r21.s = false;
        this.f = true;
        f13 r1 = r21.y();
        Object[] r2 = r1.n;
        int r29 = r1.p;
    L30:
        if (r28 >= r29) goto L35;
        c72 r30 = (c72) r2[r28];
        if (r30.H() == false) goto L34;
        f(r30);
    L34:
        r28 = r28 + 1;
        goto L30
    L35:
        return;
    L21:
        c72 r31 = r21.t();
        if (r31 == null) goto L25;
        int r32 = r31.o;
    L24:
        int r110 = r32;
        if (r31 == null) goto L28;
        r23 = e(r31);
    L28:
        r21.t = r22.m(r19, r15, r16, r17, r18, r110, r23, r3.d(1024), r3.d(16), this.d.a.a(r19));
        goto L29
    L25:
        r32 = -1;
        goto L24
    }

    public final void h(c72 r27) {
        boolean r2 = r27.H();
        w12 r3 = r27.Q;
        if (r2 == true) goto L5;
        return;
    L5:
        if (r27.s == false) goto L50;
        c72 r4 = r27.t();
        if (r4 != null) goto L10;
    L15:
        if (r4 != null) goto L17;
        long r7 = 0;
    L18:
        f63 r9 = (f63) r3.e;
        if (g02.a(r7, 9223372034707292159L) == false) goto L21;
    L46:
        f(r27);
    L47:
        r27.s = false;
        this.f = true;
        k();
        return;
    L21:
        if (c(r9) == true) goto L46;
        if (r27.p == true) goto L45;
        long r5 = g02.c(r7, r9.S);
        ti2 r8 = r27.R.p;
        int r10 = r8.G();
        int r11 = r8.F();
        int r12 = r27.t;
        ue1 r13 = this.c;
        if (r12 == (-4)) goto L37;
        int r14 = e(r27);
        if (r4 == null) goto L33;
        int r6 = e(r4);
        int r15 = (int) (r5 >> 32);
        long[] r16 = (long[]) r13.p;
        long r17 = r16[r6];
        int r18 = ((int) (r17 >> 32)) + r15;
        int r19 = ((int) r17) + ((int) (r5 & 4294967295L));
        long r20 = r16[r14];
        int r110 = r18 - ((int) (r20 >> 32));
        int r111 = r19 - ((int) r20);
        int r21 = r14 + 2;
        long r112 = r16[r21];
        r16[r14] = (((long) r18) << 32) | (((long) r19) & 4294967295L);
        r16[r14 + 1] = (((long) (r10 + r18)) << 32) | (((long) (r11 + r19)) & 4294967295L);
        r16[r21] = r112 | (((r112 >> 63) & 1) << 60);
        if (r110 != 0) goto L31;
        if (r111 == 0) goto L47;
    L31:
        r13.E(r14, r110, r111, r112);
        goto L47
    L33:
        int r113 = e(r27);
        int r22 = (int) (r5 >> 32);
        int r23 = (int) (r5 & 4294967295L);
        long[] r24 = (long[]) r13.p;
        long r25 = r24[r113];
        r24[r113] = (((long) r23) & 4294967295L) | (((long) r22) << 32);
        r24[r113 + 1] = (((long) (r11 + r23)) & 4294967295L) | (((long) (r10 + r22)) << 32);
        int r26 = r113 + 2;
        long r28 = r24[r26];
        r24[r26] = (((r28 >> 63) & 1) << 60) | r28;
        int r114 = r22 - ((int) (r25 >> 32));
        int r115 = r23 - ((int) r25);
        if (r114 != 0) goto L36;
        if (r115 == 0) goto L47;
    L36:
        r13.E(r113, r114, r115, r28);
        goto L47
    L37:
        int r116 = r27.o;
        boolean r29 = r3.d(1024);
        boolean r30 = r3.d(16);
        boolean r210 = this.d.a.a(r116);
        if (r4 == null) goto L44;
        int r31 = r4.o;
        int r32 = e(r4);
        int r33 = (int) (r5 >> 32);
        int r34 = (int) (r5 & 4294967295L);
        int r117 = r116 & 33554431;
        long[] r118 = (long[]) r13.p;
        if ((((int) r118[r32 + 2]) & 33554431) == (33554431 & r31)) goto L43;
        cz1.a("Inserted child " + r117 + " without valid parent index or parent " + r31 + " not found");
    L43:
        long r119 = r118[r32];
        int r35 = ((int) (r119 >> 32)) + r33;
        int r120 = ((int) r119) + r34;
        r27.t = r13.m(r117, r35, r120, r35 + r10, r120 + r11, r31, r32, r29, r30, r210);
        goto L47
    L44:
        int r121 = (int) (r5 >> 32);
        int r122 = (int) (r5 & 4294967295L);
        r27.t = r13.m(r116, r121, r122, r121 + r10, r122 + r11, -1, -4, r29, r30, r210);
        goto L47
    L45:
        f(r27);
        j(r27);
        goto L47
    L17:
        r7 = 9223372034707292159L;
        goto L18
    L10:
        if (r4.p == true) goto L15;
        if (r4.r == false) goto L14;
        r4.r = false;
        r4.q = g(r4);
    L14:
        r7 = r4.q;
        goto L18
    }

    public final void i(c72 r6) {
        if (d(r6) == false) goto L6;
        int r0 = e(r6);
        long[] r1 = (long[]) this.c.p;
        r1[r0] = -1;
        r1[r0 + 1] = -1;
        r1[r0 + 2] = xv3.a;
        r6.t = -4;
        r6.s = true;
        this.f = true;
        this.h = true;
        return;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k() {
        ga r0 = this.i;
        if (r0 == null) goto L5;
        boolean r2 = true;
    L6:
        long r3 = this.d.c;
        if (r3 >= 0) goto L11;
        if (r2 == false) goto L11;
        return;
    L11:
        if (this.j != r3) goto L14;
        if (r2 == false) goto L14;
        return;
    L14:
        ra r4 = this.b;
        if (r0 == null) goto L17;
        r4.removeCallbacks(r0);
    L17:
        long r5 = System.currentTimeMillis();
        long r6 = Math.max(r3, 16 + r5);
        this.j = r6;
        ga r1 = new ga(1, this.k);
        r4.postDelayed(r1, r6 - r5);
        this.i = r1;
        return;
    L5:
        r2 = false;
        goto L6
    }
}
