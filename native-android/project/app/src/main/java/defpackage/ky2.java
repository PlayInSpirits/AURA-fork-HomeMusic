package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ky2 implements k51 {
    public final long a;
    public final be3 b;
    public final wy2 c;
    public final zg1 d;
    public final ov1 e;
    public final tq0 f;
    public m51 g;
    public wv4 h;
    public wv4 i;
    public int j;
    public qv2 k;
    public qv2 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public q84 r;
    public boolean s;
    public boolean t;
    public long u;

    static {
    }

    public ky2(long r1) {
        this.a = r1;
        this.b = new be3(10);
        this.c = new wy2();
        this.d = new zg1();
        this.m = -9223372036854775807L;
        this.e = new ov1(0);
        tq0 r2 = new tq0();
        this.f = r2;
        this.i = r2;
        this.p = -1;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.k51
    public final int b(l51 r59, t71 r60) {
        this.h.getClass();
        String r2 = f35.a;
        int r3 = this.j;
        int r14 = 0;
        wy2 r7 = this.c;
        if (r3 == 0) goto L248;
    L7:
        q84 r4 = this.r;
        be3 r8 = this.b;
        if (r4 != null) goto L205;
        be3 r5 = new be3(r7.b);
        Throwable r61 = null;
        r59.n(r5.a, 0, r7.b);
        int r6 = r7.a & 1;
        int r15 = r7.d;
        int r16 = 21;
        long r17 = 1000000;
        if (r6 == 0) goto L14;
        if (r15 == 1) goto L13;
        int r9 = 36;
    L17:
        long r21 = -9223372036854775807L;
        if (r5.c < (r9 + 4)) goto L24;
        r5.N(r9);
        int r10 = r5.m();
        if (r10 == 1483304551) goto L29;
        if (r10 != 1231971951) goto L24;
    L29:
        zg1 r11 = this.d;
        if (r10 == 1231971951) goto L34;
        if (r10 == 1447187017) goto L35;
        if (r10 == 1483304551) goto L34;
        r59.k();
        q84 r30 = null;
        wy2 r18 = r7;
        int r29 = 0;
    L145:
        qv2 r12 = this.k;
        long r13 = r59.getPosition();
        if (r12 != null) goto L148;
    L147:
        qw2 r19 = null;
    L184:
        if (this.s == false) goto L186;
        q84 r20 = new p84(-9223372036854775807L);
        r8 = r8;
        r11 = r11;
        wy2 r22 = r18;
        boolean r23 = true;
        r14 = 0;
    L196:
        this.r = r20;
        this.g.w(r20);
        qv2 r24 = this.k;
        qv2 r25 = this.l;
        if (r24 == null) goto L201;
        if (r25 == null) goto L200;
        r24 = r24.b(r25);
    L200:
        r25 = r24;
    L201:
        sb1 r26 = new sb1();
        r26.l = lw2.m("audio/mpeg");
        r26.m = lw2.m((String) r22.g);
        r26.n = 4096;
        r26.E = r22.d;
        r26.F = r22.c;
        r26.H = r11.a;
        r26.I = r11.b;
        r26.k = r25;
        if (this.r.f() == (-2147483647)) goto L204;
        r26.h = this.r.f();
    L204:
        this.i.g(new tb1(r26));
        this.o = r59.getPosition();
        long r27 = 0;
        ?? r28 = r23;
    L211:
        if (this.q != 0) goto L232;
        r59.k();
        if (h(r59) == true) goto L234;
        r8.N(r14);
        int r31 = r8.m();
        if (((-128000) & r31) == (((long) this.j) & (-128000))) goto L218;
    L230:
        r59.l(r28);
        this.j = r14;
    L231:
        int r32 = -1;
    L239:
        if (r14 != r32) goto L247;
        q84 r1 = this.r;
        if ((r1 instanceof vx1) == false) goto L247;
        if (r1.g() == (((this.n * r17) / ((long) r22.c)) + this.m)) goto L247;
        ((vx1) this.r).getClass();
        throw r61;
    L247:
        return r14;
    L218:
        if (jz4.v(r31) == (-1)) goto L230;
        r22.a(r31);
        if (this.m != r21) goto L225;
        this.m = this.r.c(r59.getPosition());
        long r33 = this.a;
        if (r33 == r21) goto L225;
        this.m = (r33 - this.r.c(r27)) + this.m;
    L225:
        this.q = r22.b;
        this.p = r59.getPosition() + ((long) r22.b);
        if ((this.r instanceof vx1) == false) goto L232;
        long r0 = ((this.n + ((long) r22.f)) * r17) / ((long) r22.c);
        throw r61;
    L234:
        r32 = -1;
        r14 = -1;
    L232:
        int r34 = this.i.f(r59, this.q, r28);
        if (r34 == (-1)) goto L234;
        int r35 = this.q - r34;
        this.q = r35;
        if (r35 > 0) goto L231;
        this.i.a(this.m + ((this.n * r17) / ((long) r22.c)), 1, r22.b, 0, null);
        this.n += (long) r22.f;
        this.q = r14;
        goto L231
    L186:
        r21 = -9223372036854775807L;
        if (r19 == null) goto L189;
        r30 = r19;
    L192:
        if (r30 != null) goto L194;
        int r36 = r29;
        r59.n(r8.a, r36, 4);
        r8.N(r36);
        r18.a(r8.m());
        r22 = r18;
        boolean r37 = true;
        r14 = 0;
        r30 = new eb0(r59.getLength(), r59.getPosition(), r18.e, r18.b, false, true);
    L195:
        r30.b();
        r30.b();
        this.h.d(r30.g());
        r20 = r30;
        r23 = r37;
        goto L196
    L194:
        r22 = r18;
        r37 = true;
        r14 = 0;
        goto L195
    L189:
        if (r30 != null) goto L192;
        r30 = null;
        goto L192
    L148:
        pv2[] r38 = r12.a;
        int r39 = r38.length;
        int r40 = r29;
    L149:
        if (r40 >= r39) goto L159;
        pv2 r41 = r38[r40];
        if (pw2.class.isAssignableFrom(r41.getClass()) == false) goto L155;
        pv2 r42 = (pv2) pw2.class.cast(r41);
        if (zo3.n.apply(r42) == false) goto L155;
    L156:
        if (r42 != null) goto L160;
        r40 = r40 + 1;
    L160:
        pw2 r43 = (pw2) r42;
        if (r43 == null) goto L147;
        int[] r44 = r43.e;
        pv2[] r45 = r12.a;
        int r46 = r45.length;
        int r47 = 0;
    L164:
        if (r47 >= r46) goto L174;
        pv2 r110 = r45[r47];
        if (ds4.class.isAssignableFrom(r110.getClass()) == false) goto L170;
        pv2 r111 = (pv2) ds4.class.cast(r110);
        if (((ds4) r111).a.equals("TLEN") == false) goto L170;
    L171:
        if (r111 != null) goto L175;
        r47 = r47 + 1;
    L175:
        ds4 r112 = (ds4) r111;
        if (r112 != null) goto L178;
        long r48 = -9223372036854775807L;
        char r113 = 0;
    L179:
        int r49 = r44.length;
        int r114 = r49 + 1;
        long[] r115 = new long[r114];
        long[] r116 = new long[r114];
        r115[r113] = r13;
        r116[r113] = 0;
        long r210 = 0;
        int r117 = 1;
    L180:
        if (r117 > r49) goto L182;
        int r211 = r117 - 1;
        long r50 = r13 + ((long) (r43.c + r44[r211]));
        r210 = r210 + ((long) (r43.d + r43.f[r211]));
        r115[r117] = r50;
        r116[r117] = r210;
        r117 = r117 + 1;
        r49 = r49;
        r13 = r50;
        goto L180
    L182:
        r19 = new qw2(r48, r115, r116);
        goto L184
    L178:
        r113 = 0;
        r48 = f35.Q(Long.parseLong((String) r112.d.get(0)));
    L170:
        r111 = null;
        goto L171
    L174:
        r111 = null;
    L155:
        r42 = null;
        goto L156
    L159:
        r42 = null;
        goto L160
    L35:
        long r118 = r59.getLength();
        long r212 = r59.getPosition();
        r5.O(6);
        int r51 = r5.m();
        r29 = 0;
        long r310 = r212 + ((long) r7.b);
        long r52 = r310 + ((long) r51);
        int r53 = r5.m();
        if (r53 > 0) goto L38;
        r30 = null;
        r18 = r7;
    L65:
        r59.l(r18.b);
        goto L145
    L38:
        long r311 = f35.Y(r7.c, (((long) r53) * ((long) r7.f)) - 1);
        int r54 = r5.H();
        int r55 = r5.H();
        int r56 = r5.H();
        r5.O(2);
        long[] r119 = new long[r54];
        long[] r120 = new long[r54];
        wy2 r121 = r7;
        long r57 = r212 + ((long) r7.b);
        int r58 = 0;
    L39:
        if (r58 >= r54) goto L54;
        long[] r213 = r120;
        wy2 r214 = r121;
        int r312 = r58;
        long[] r215 = r119;
        r215[r312] = (((long) r58) * r311) / ((long) r54);
        r213[r312] = r57;
        if (r56 != 1) goto L43;
        int r62 = r5.A();
    L53:
        r57 = r57 + (((long) r62) * ((long) r55));
        r58 = r312 + 1;
        r120 = r213;
        r121 = r214;
        r119 = r215;
        goto L39
    L43:
        if (r56 != 2) goto L45;
        r62 = r5.H();
        goto L53
    L45:
        if (r56 != 3) goto L47;
        r62 = r5.D();
        goto L53
    L47:
        if (r56 != 4) goto L48;
        r62 = r5.E();
        goto L53
    L48:
        r30 = null;
        r18 = r214;
        goto L65
    L54:
        long[] r216 = r119;
        long[] r217 = r120;
        wy2 r218 = r121;
        if (r118 != (-1)) goto L57;
    L59:
        long r63 = r52;
    L61:
        if (r63 == r57) goto L63;
        l93.q0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + r63 + ", " + r57 + "\nSeeking will be inaccurate.");
        long r313 = Math.max(r63, r57);
    L64:
        r18 = r218;
        r30 = new l35(r216, r217, r311, r310, r313, r18.e);
        goto L65
    L63:
        r313 = r63;
        goto L64
    L57:
        if (r118 == r52) goto L59;
        StringBuilder r64 = new StringBuilder("VBRI data size mismatch: ");
        r64.append(r118);
        r64.append(", ");
        r63 = r52;
        r64.append(r63);
        l93.q0("VbriSeeker", r64.toString());
    L34:
        r18 = r7;
        r29 = 0;
        int r65 = r5.m();
        if ((r65 & 1) == 0) goto L69;
        int r66 = r5.E();
    L71:
        if ((r65 & 2) == 0) goto L73;
        long r410 = r5.C();
    L75:
        if ((r65 & 4) != 4) goto L80;
        long[] r67 = new long[100];
        int r68 = 0;
    L77:
        if (r68 >= 100) goto L79;
        r67[r68] = r5.A();
        r68 = r68 + 1;
        goto L77
    L79:
        long[] r411 = r67;
    L82:
        if ((r65 & 8) == 0) goto L85;
        r5.O(4);
    L85:
        if (r5.a() < 24) goto L94;
        r5.O(11);
        float r69 = Float.intBitsToFloat(r5.m());
        int r70 = r5.H();
        int r71 = r5.H();
        ly2 r72 = ly2.a(r70);
        ly2 r73 = ly2.a(r71);
        if (r69 > 0.0f) goto L92;
        if (r72 != null) goto L92;
        if (r73 != null) goto L92;
        my2 r74 = null;
    L93:
        r5.O(2);
        int r75 = r5.D();
        int r76 = (16773120 & r75) >> 12;
        int r77 = r75 & 4095;
    L95:
        long r78 = r66;
        int r79 = r18.b;
        int r122 = r18.c;
        int r123 = r18.e;
        int r124 = r18.f;
        if (r11.a != (-1)) goto L98;
    L100:
        if (r76 == (-1)) goto L103;
        if (r77 == (-1)) goto L103;
        r11.a = r76;
        r11.b = r77;
    L103:
        if (r74 == null) goto L105;
        qv2 r80 = new qv2(new pv2[]{r74});
    L106:
        this.l = r80;
        long r412 = r59.getPosition();
        if (r59.getLength() != (-1)) goto L109;
    L113:
        long r314 = r78;
    L114:
        r59.l(r18.b);
        if (r10 == 1483304551) goto L117;
        long r81 = r59.getLength();
        if (r314 != (-1)) goto L130;
    L133:
        long r315 = -9223372036854775807L;
    L135:
        if (r315 != (-9223372036854775807L)) goto L138;
    L125:
        r30 = null;
        goto L145
    L138:
        if (r410 == (-1)) goto L142;
        r81 = r412 + r410;
        long r413 = r410 - ((long) r79);
    L140:
        long r510 = r81;
        long r316 = r413;
        RoundingMode r317 = RoundingMode.HALF_UP;
        r30 = new eb0(r510, r412 + ((long) r79), jz4.m(f35.a0(r316, 8000000, r315, r317)), jz4.m(gh0.h(r316, r314, r317)), false, true);
        goto L145
    L142:
        if (r81 == (-1)) goto L125;
        r413 = (r81 - r412) - ((long) r79);
        goto L140
    L130:
        if (r314 == 0) goto L133;
        r315 = f35.Y(r122, (((long) r124) * r314) - 1);
        goto L135
    L117:
        if (r314 != (-1)) goto L119;
    L122:
        long r414 = -9223372036854775807L;
    L124:
        if (r414 == (-9223372036854775807L)) goto L125;
        r30 = new ge5(r412, r79, r414, r123, r410, r411);
        goto L145
    L119:
        if (r314 == 0) goto L122;
        r414 = f35.Y(r122, (r314 * ((long) r124)) - 1);
        goto L124
    L109:
        if (r410 == (-1)) goto L113;
        r314 = r78;
        long r82 = r412 + r410;
        if (r59.getLength() == r82) goto L114;
        l93.K("Mp3Extractor", "Data size mismatch between stream (" + r59.getLength() + ") and Xing frame (" + r82 + "), using Xing value.");
        goto L114
    L105:
        r80 = null;
        goto L106
    L98:
        if (r11.b == (-1)) goto L100;
    L92:
        r74 = new my2(r69, r72, r73);
        goto L93
    L94:
        r74 = null;
        r77 = -1;
        r76 = -1;
        goto L95
    L80:
        r411 = null;
        goto L82
    L73:
        r410 = -1;
        goto L75
    L69:
        r66 = -1;
    L24:
        if (r5.c < 40) goto L28;
        r5.N(36);
        if (r5.m() != 1447187017) goto L28;
        r10 = 1447187017;
    L28:
        r10 = 0;
    L13:
        r9 = r16;
        goto L17
    L14:
        if (r15 != 1) goto L13;
        r16 = 13;
        goto L13
    L205:
        r22 = r7;
        r8 = r8;
        boolean r83 = true;
        r61 = null;
        r17 = 1000000;
        r21 = -9223372036854775807L;
        r27 = 0;
        r28 = r83;
        if (this.o == 0) goto L211;
        long r84 = r59.getPosition();
        long r85 = this.o;
        r28 = r83;
        if (r84 >= r85) goto L211;
        r59.l((int) (r85 - r84));
        r28 = r83;
        goto L211
    L248:
        i(r59, false);     // Catch: EOFException -> L6
    L6:
        r22 = r7;
        r61 = null;
        r32 = -1;
        r14 = -1;
        r17 = 1000000;
        goto L239
    }

    @Override // defpackage.k51
    public final boolean c(l51 r2) {
        return i(r2, true);
    }

    @Override // defpackage.k51
    public final void d(long r3, long r5) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0;
        this.q = 0;
        this.p = -1;
        this.u = r5;
        if ((this.r instanceof vx1) == true) goto L6;
        return;
    L6:
        throw null;
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        this.g = r3;
        wv4 r4 = r3.t(0, 1);
        this.h = r4;
        this.i = r4;
        this.g.p();
    }

    public final void g() {
        q84 r0 = this.r;
        if ((r0 instanceof eb0) == true) goto L5;
        return;
    L5:
        if (((eb0) r0).b() == false) goto L13;
        long r1 = this.p;
        if (r1 != (-1)) goto L9;
        return;
    L9:
        if (r1 == this.r.a()) goto L15;
        eb0 r2 = (eb0) this.r;
        this.r = new eb0(this.p, r2.i, r2.j, r2.k, r2.l, false);
        m51 r3 = this.g;
        r3.getClass();
        r3.w(this.r);
        wv4 r4 = this.h;
        r4.getClass();
        r4.d(this.r.g());
        return;
    L15:
        return;
    }

    public final boolean h(l51 r9) {
        q84 r0 = this.r;
        if (r0 == null) goto L14;
        long r2 = r0.a();
        if (r2 == (-1)) goto L14;
        if (r9.f() <= (r2 - 4)) goto L14;
    L12:
        return true;
    L14:
        return !r9.e(this.b.a, 0, 4, true);
    }

    public final boolean i(l51 r17, boolean r18) {
        r17.k();
        if (r17.getPosition() != 0) goto L12;
        qv2 r2 = this.e.a(r17, null, 131072);
        this.k = r2;
        if (r2 == null) goto L7;
        this.d.b(r2);
    L7:
        int r3 = (int) r17.f();
        if (r18 == true) goto L10;
        r17.l(r3);
    L10:
        int r5 = 0;
    L11:
        int r6 = r5;
        int r7 = r6;
    L14:
        if (h(r17) == true) goto L15;
        be3 r8 = this.b;
        r8.N(0);
        int r9 = r8.m();
        if (r5 != 0) goto L22;
    L23:
        int r10 = jz4.v(r9);
        if (r10 == (-1)) goto L25;
        r6 = r6 + 1;
        if (r6 != 1) goto L39;
        this.c.a(r9);
        r5 = r9;
    L45:
        r17.g(r10 - 4);
        goto L14
    L39:
        if (r6 != 4) goto L45;
    L40:
        if (r18 == false) goto L42;
        r17.l(r3 + r7);
    L43:
        this.j = r5;
        return true;
    L42:
        r17.k();
    L25:
        int r11 = r7 + 1;
        if (r7 == 131072) goto L27;
        if (r18 == false) goto L33;
        r17.k();
        r17.g(r3 + r11);
    L34:
        r6 = 0;
        r7 = r11;
        r5 = 0;
        goto L14
    L33:
        r17.l(1);
        goto L34
    L27:
        if (r18 == false) goto L29;
        return false;
    L29:
        g();
        throw new EOFException();
    L22:
        if (((-128000) & r9) != (((long) r5) & (-128000))) goto L25;
    L15:
        if (r6 > 0) goto L40;
        g();
        throw new EOFException();
    L12:
        r3 = 0;
        r5 = 0;
        goto L11
    }

    public ky2(int r3) {
        this(-9223372036854775807L);
    }
}
