package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 {
    public int A;
    public int B;
    public boolean C;
    public final qg1 D;
    public final ArrayList E;
    public boolean F;
    public hg4 G;
    public ig4 H;
    public lg4 I;
    public boolean J;
    public mf3 K;
    public w00 L;
    public final k80 M;
    public mg1 N;
    public p71 O;
    public md4 P;
    public final x80 Q;
    public final ne0 R;
    public boolean S;
    public long T;
    public sg1 U;
    public final d15 a;
    public final u80 b;
    public final ig4 c;
    public final z03 d;
    public final w00 e;
    public final w00 f;
    public final zg5 g;
    public final z80 h;
    public final ArrayList i;
    public vg1 j;
    public int k;
    public int l;
    public int m;
    public final o02 n;
    public int[] o;
    public g03 p;
    public boolean q;
    public boolean r;
    public final ArrayList s;
    public final o02 t;
    public mf3 u;
    public i03 v;
    public boolean w;
    public final o02 x;
    public boolean y;
    public int z;

    public rg1(d15 r1, u80 r2, ig4 r3, z03 r4, w00 r5, w00 r6, zg5 r7, z80 r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = new ArrayList();
        this.n = new o02();
        this.s = new ArrayList();
        this.t = new o02();
        this.u = mf3.q;
        this.x = new o02();
        this.z = -1;
        if (r2.f() == false) goto L5;
    L8:
        boolean r9 = true;
    L9:
        this.C = r9;
        this.D = new qg1(0, this);
        this.E = new ArrayList();
        hg4 r10 = r3.d();
        r10.c();
        this.G = r10;
        ig4 r11 = new ig4();
        if (r2.f() == false) goto L13;
        r11.b();
    L13:
        if (r2.d() == false) goto L15;
        r11.x = new i03();
    L15:
        this.H = r11;
        lg4 r12 = r11.e();
        r12.e(true);
        this.I = r12;
        this.M = new k80(this, r5);
        hg4 r13 = this.H.d();
        mg1 r14 = r13.a(0);     // Catch: Throwable -> L23
        r13.c();
        this.N = r14;
        this.O = new p71();
        this.Q = new x80(this);
        ne0 r15 = r2.j();
        ne0 r16 = v();
        if (r16 != null) goto L21;
        r16 = q01.n;
    L21:
        this.R = r15.J(r16);
        return;
    L23:
        th = move-exception;
        r13.c();
        throw th;
    L5:
        if (r2.d() == true) goto L8;
        r9 = false;
        goto L9
    }

    public static final int J(rg1 r19, int r20, boolean r21, int r22) {
        hg4 r2 = r19.G;
        int r4 = 0;
        if (r2.j(r20) == false) goto L86;
        int r3 = r2.i(r20);
        Object r6 = r2.p(r2.b, r20);
        if (r3 == 206) goto L7;
    L81:
        int r16 = 1;
        if (r2.l(r20) == false) goto L85;
    L111:
        return r16;
    L85:
        return r2.o(r20);
    L7:
        if (h12.c(r6, l80.e) == false) goto L81;
        Object r5 = r2.h(r20, 0);
        og1 r7 = null;
        if ((r5 instanceof wg1) == false) goto L11;
        wg1 r8 = (wg1) r5;
    L12:
        if (r8 == null) goto L14;
        vy3 r9 = r8.a;
    L16:
        if ((r9 instanceof og1) == false) goto L18;
        r7 = (og1) r9;
    L18:
        if (r7 == null) goto L80;
        x03 r10 = r7.n.e;
        Object[] r11 = r10.b;
        long[] r12 = r10.a;
        int r13 = r12.length - 2;
        if (r13 < 0) goto L80;
        int r14 = 0;
    L22:
        long r15 = r12[r14];
        if (((((~r15) << 7) & r15) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L76;
        int r17 = 8;
        int r18 = 8 - ((~(r14 - r13)) >>> 31);
        int r110 = r4;
    L25:
        if (r110 >= r18) goto L73;
        if ((255 & r15) >= 128) goto L71;
        rg1 r111 = (rg1) r11[(r14 << 3) + r110];
        ig4 r112 = r111.c;
        if (r112.o > 0) goto L31;
    L69:
        int r23 = r4;
    L70:
        r19.b.r(r111.h);
    L72:
        r15 = r15 >> r17;
        r110 = r110 + 1;
        r17 = r17;
        r4 = r23;
        r12 = r12;
        goto L25
    L31:
        if ((r112.n[1] & 67108864) == 0) goto L69;
        z80 r24 = r111.h;
        Object r113 = r24.q;
        monitor-enter(r113);
        r24.p();     // Catch: Throwable -> L66
        w03 r114 = r24.A;     // Catch: Throwable -> L66
        r24.A = te5.i();     // Catch: Throwable -> L66
        r24.I.X(r114);     // Catch: Throwable -> L63
        monitor-exit(r113);
        w00 r25 = new w00();
        r111.L = r25;
        hg4 r26 = r111.c.d();
        r111.G = r26;     // Catch: Throwable -> L59
        k80 r115 = r111.M;     // Catch: Throwable -> L59
        w00 r116 = r115.b;     // Catch: Throwable -> L59
        r115.b = r25;     // Catch: Throwable -> L55
        r111.I(0);     // Catch: Throwable -> L55
        k80 r27 = r111.M;     // Catch: Throwable -> L55
        r27.b();     // Catch: Throwable -> L55
        if (r27.c == false) goto L49;
        hg4 r117 = r26;
        r27.b.n.x0(na3.f);     // Catch: Throwable -> L47
        if (r27.c == false) goto L50;
        r27.d(false);     // Catch: Throwable -> L47
        r27.d(false);     // Catch: Throwable -> L47
        r27.b.n.x0(x93.f);     // Catch: Throwable -> L47
        r23 = 0;
        r27.c = false;     // Catch: Throwable -> L47
    L116:
        r115.b = r116;     // Catch: Throwable -> L53
        r117.c();
    L53:
        th = th;
    L61:
        r117.c();
        throw th;
    L50:
        r23 = 0;
    L47:
        th = th;
    L57:
        r115.b = r116;     // Catch: Throwable -> L53
        throw th;     // Catch: Throwable -> L53
    L49:
        r117 = r26;
    L55:
        th = th;
        r117 = r26;
    L59:
        th = th;
        r117 = r26;
        goto L61
    L63:
        th = move-exception;
        r24.A = r114;     // Catch: Throwable -> L66
        throw th;     // Catch: Throwable -> L66
    L66:
        th = move-exception;
        throw th;
    L71:
        r12 = r12;
        r23 = r4;
        r17 = r17;
        goto L72
    L73:
        long[] r28 = r12;
        int r29 = r4;
        if (r18 != r17) goto L80;
    L77:
        if (r14 == r13) goto L80;
        r14 = r14 + 1;
        r4 = r29;
        r12 = r28;
        goto L22
    L76:
        r28 = r12;
        r29 = r4;
    L80:
        return r2.o(r20);
    L14:
        r9 = null;
        goto L16
    L11:
        r8 = null;
        goto L12
    L86:
        r16 = 1;
        if (r2.d(r20) == false) goto L110;
        int r30 = r2.b[(r20 * 5) + 3] + r20;
        int r31 = r20 + 1;
        int r32 = 0;
    L89:
        if (r31 >= r30) goto L106;
        boolean r33 = r2.l(r31);
        if (r33 == false) goto L93;
        r19.M.c();
        k80 r34 = r19.M;
        Object r35 = r2.n(r31);
        r34.c();
        r34.h.add(r35);
    L93:
        if (r33 == true) goto L97;
        if (r21 == true) goto L97;
        boolean r36 = false;
    L98:
        if (r33 == false) goto L100;
        int r37 = 0;
    L101:
        r32 = r32 + J(r19, r31, r36, r37);
        if (r33 == false) goto L104;
        r19.M.c();
        r19.M.a();
    L104:
        r31 = r31 + r2.b[(r31 * 5) + 3];
        goto L89
    L100:
        r37 = r22 + r32;
    L97:
        r36 = true;
        goto L98
    L106:
        if (r2.l(r20) == true) goto L111;
        return r32;
    L110:
        if (r2.l(r20) == true) goto L111;
        return r2.o(r20);
    }

    public final List A() {
        u80 r5 = this.b;
        t80 r0 = r5.h();
        if (r0 == null) goto L5;
        z80 r1 = (z80) r0;
    L6:
        if (r1 == null) goto L20;
        ig4 r2 = r1.s;
        hg4 r3 = kg4.d(r2).d();
        Integer r6 = gh0.j(r3, r5, 0, r3.c);     // Catch: Throwable -> L21
        r3.c();
        if (r6 == null) goto L20;
        hg4 r4 = kg4.d(r2).d();
        ArrayList r7 = gh0.H(r4, r6.intValue(), 0);     // Catch: Throwable -> L16
        r4.c();
        return q40.G0(r7, r1.I.A());
    L16:
        th = move-exception;
        r4.c();
        throw th;
    L21:
        th = move-exception;
        r3.c();
        throw th;
    L20:
        return u01.n;
    L5:
        r1 = null;
        goto L6
    }

    public final int B(int r5) {
        int r0 = this.G.q(r5) + 1;
        int r1 = 0;
    L3:
        if (r0 >= r5) goto L8;
        if (this.G.k(r0) == true) goto L7;
        r1 = r1 + 1;
    L7:
        r0 = r0 + this.G.b[(r0 * 5) + 3];
        goto L3
    L8:
        return r1;
    }

    public final Object C(z80 r9, z80 r10, Integer r11, List r12, gf1 r13) {
        boolean r0 = this.F;
        int r1 = this.k;
        this.F = true;     // Catch: Throwable -> L9
        this.k = 0;     // Catch: Throwable -> L9
        int r3 = r12.size();     // Catch: Throwable -> L9
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L13;
        kd3 r6 = (kd3) r12.get(r4);     // Catch: Throwable -> L9
        lv3 r7 = (lv3) r6.n;     // Catch: Throwable -> L9
        Object r8 = r6.o;     // Catch: Throwable -> L9
        if (r8 == null) goto L11;
        W(r7, r8);     // Catch: Throwable -> L9
    L12:
        r4 = r4 + 1;     // Catch: Throwable -> L9
        goto L5
    L11:
        W(r7, null);     // Catch: Throwable -> L9
        goto L12
    L13:
        if (r9 == null) goto L28;
        if (r11 == null) goto L16;
        int r14 = r11.intValue();     // Catch: Throwable -> L9
    L17:
        if (r10 == null) goto L26;
        if (r10 == r9) goto L26;
        if (r14 < 0) goto L26;
        r9.E = r10;     // Catch: Throwable -> L9
        r9.F = r14;     // Catch: Throwable -> L9
        Object r15 = r13.invoke();     // Catch: Throwable -> L23
        r9.E = null;     // Catch: Throwable -> L9
        r9.F = 0;     // Catch: Throwable -> L9
    L27:
        if (r15 == null) goto L28;
    L29:
        this.F = r0;
        this.k = r1;
        return r15;
    L23:
        th = move-exception;
        r9.E = null;     // Catch: Throwable -> L9
        r9.F = 0;     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    L26:
        r15 = r13.invoke();     // Catch: Throwable -> L9
        goto L27
    L16:
        r14 = -1;
    L28:
        r15 = r13.invoke();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        this.F = r0;
        this.k = r1;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void D() {
        rv2 r1 = rv2.D;
        boolean r2 = this.F;
        this.F = true;
        hg4 r4 = this.G;
        int r5 = r4.i;
        int r7 = (r5 * 5) + 3;
        int r6 = r4.b[r7] + r5;
        int r9 = this.k;
        long r10 = this.T;
        int r12 = this.l;
        int r13 = this.m;
        int r8 = r4.g;
        ArrayList r14 = this.s;
        int r11 = si0.t(r14, r8);
        if (r11 >= 0) goto L6;
        r11 = -(r11 + 1);
    L6:
        if (r11 >= r14.size()) goto L10;
        o12 r15 = (o12) r14.get(r11);
        if (r15.b >= r6) goto L10;
    L11:
        int r18 = 1;
        int r3 = r5;
        int r17 = 0;
    L12:
        if (r15 == null) goto L169;
        lv3 r16 = r15.a;
        int r19 = r15.b;
        rv2 r20 = r1;
        int r21 = si0.t(r14, r19);
        if (r21 < 0) goto L16;
        o12 r22 = (o12) r14.remove(r21);
    L16:
        Object r23 = r15.c;
        if (r23 != null) goto L21;
        r16.getClass();
        int r29 = r7;
        int r30 = r9;
    L19:
        int r32 = r12;
        int r33 = r13;
    L20:
        int r24 = r18;
    L60:
        if (r24 == 0) goto L126;
        this.G.r(r19);
        int r25 = this.G.g;
        G(r3, r25, r5);
        int r26 = this.G.q(r25);
    L62:
        if (r26 == r5) goto L67;
        if (this.G.l(r26) == true) goto L67;
        r26 = this.G.q(r26);
    L67:
        if (this.G.l(r26) == false) goto L69;
        int r27 = 0;
    L70:
        if (r26 == r25) goto L84;
        int r28 = (d0(r26) - this.G.o(r25)) + r27;
    L73:
        if (r27 >= r28) goto L84;
        if (r26 == r19) goto L84;
        r26 = r26 + 1;
    L76:
        if (r26 >= r19) goto L84;
        hg4 r31 = this.G;
        int r34 = r31.b[(r26 * 5) + 3] + r26;
        if (r19 < r34) goto L73;
        if (r31.l(r26) == false) goto L82;
        int r35 = r18;
    L83:
        r27 = r27 + r35;
        r26 = r34;
        goto L76
    L82:
        r35 = d0(r26);
    L84:
        this.k = r27;
        this.m = B(r25);
        int r36 = this.G.q(r25);
        long r37 = 0;
        int r38 = 3;
        int r39 = 0;
    L85:
        if (r36 < 0) goto L88;
        if (r36 == r5) goto L87;
        hg4 r40 = this.G;
        boolean r110 = r40.k(r36);
        int[] r111 = r40.b;
        if (r110 == false) goto L99;
        Object r41 = r40.p(r111, r36);
        if (r41 != null) goto L94;
        int r112 = r25;
        int r42 = 0;
    L109:
        if (r42 == 126665345) goto L110;
        if (this.G.k(r36) == false) goto L114;
        int r43 = 0;
    L115:
        r37 = (r37 ^ Long.rotateLeft(r42, r38)) ^ Long.rotateLeft(r43, r39);
        r38 = (r38 + 6) % 64;
        r39 = (r39 + 6) % 64;
        r36 = this.G.q(r36);
        r25 = r112;
        goto L85
    L114:
        r43 = B(r36);
        goto L115
    L110:
        r37 = r37 ^ Long.rotateLeft(r42, r39);
    L116:
        this.T = r37;
        this.K = null;
        wf1 r44 = r16.d;
        if (r44 == null) goto L124;
        r44.invoke(this, Integer.valueOf(r18));
        this.K = null;
        hg4 r45 = this.G;
        int r46 = r45.b[r29] + r5;
        int r47 = r45.g;
        if (r47 < r5) goto L122;
        if (r47 > r46) goto L122;
    L123:
        r45.i = r5;
        r45.h = r46;
        r45.l = 0;
        r45.m = 0;
        r2 = r2;
        r3 = r112;
        r17 = r18;
    L158:
        int r48 = si0.t(r14, this.G.g);
        if (r48 >= 0) goto L162;
        r48 = -(r48 + 1);
    L162:
        if (r48 >= r14.size()) goto L166;
        o12 r49 = (o12) r14.get(r48);
        r6 = r6;
        if (r49.b >= r6) goto L167;
        r15 = r49;
    L168:
        r2 = r2;
        r1 = r20;
        r7 = r29;
        r9 = r30;
        r12 = r32;
        r13 = r33;
    L167:
        r15 = null;
        goto L168
    L166:
        r6 = r6;
    L122:
        l80.a("Index " + r5 + " is not a parent of " + r47);
        goto L123
    L124:
        kf2.o("Invalid restart scope");
        return;
    L94:
        if ((r41 instanceof Enum) == false) goto L97;
        r42 = ((Enum) r41).ordinal();
    L96:
        r112 = r25;
        goto L109
    L97:
        r42 = r41.hashCode();
        goto L96
    L99:
        int r113 = r40.i(r36);
        r112 = r25;
        if (r113 != 207) goto L107;
        Object r50 = r40.b(r111, r36);
        if (r50 == null) goto L107;
        if (r50.equals(j80.a) == true) goto L107;
        r42 = r50.hashCode();
    L107:
        r42 = r113;
        goto L109
    L87:
        r37 = r37 ^ Long.rotateLeft(r10, r39);
    L88:
        r112 = r25;
        goto L116
    L69:
        r27 = r30;
        goto L70
    L126:
        ArrayList r51 = this.E;
        r51.add(r16);
        this.g.r();
        z80 r52 = r16.a;
        if (r52 == null) goto L157;
        p03 r53 = r16.f;
        if (r53 == null) goto L157;
        r16.d(r18);
        Object[] r54 = r53.b;     // Catch: Throwable -> L142
        int[] r55 = r53.c;     // Catch: Throwable -> L142
        long[] r56 = r53.a;     // Catch: Throwable -> L142
        int r114 = r56.length - 2;     // Catch: Throwable -> L142
        if (r114 < 0) goto L153;
        int r115 = 0;
    L134:
        long r57 = r56[r115];     // Catch: Throwable -> L142
        long[] r310 = r56;
        Object[] r311 = r54;
        if (((((~r57) << 7) & r57) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L151;
        int r58 = 8 - ((~(r115 - r114)) >>> 31);     // Catch: Throwable -> L142
        int r59 = 0;
    L137:
        if (r59 >= r58) goto L147;
        if ((r57 & 255) >= 128) goto L145;
        int r312 = (r115 << 3) + r59;     // Catch: Throwable -> L142
        Object r60 = r311[r312];     // Catch: Throwable -> L142
        int r61 = r55[r312];     // Catch: Throwable -> L142
        r52.y(r60);     // Catch: Throwable -> L142
    L145:
        r59 = r59 + 1;
        r57 = r57 >> 8;
        goto L137
    L147:
        if (r58 != 8) goto L153;
    L151:
        if (r115 == r114) goto L153;
        r115 = r115 + 1;
        r54 = r311;
        r56 = r310;
    L153:
        r16.d(false);
    L142:
        th = move-exception;
        r16.d(false);
        throw th;
    L157:
        r18 = 1;
        r51.remove(r51.size() - 1);
        goto L158
    L21:
        int r210 = 8;
        w03 r62 = r16.g;
        if (r62 != null) goto L24;
        r29 = r7;
        r30 = r9;
        goto L19
    L24:
        r29 = r7;
        if ((r23 instanceof dp0) == false) goto L30;
        dp0 r63 = (dp0) r23;
        rv2 r64 = r63.p;
        if (r64 != null) goto L29;
        r64 = r20;
    L29:
        r30 = r9;
        r24 = !r64.i(r63.h().f, r62.g(r63)) ? 1 : 0;
        r6 = r6;
        r32 = r12;
        r33 = r13;
        goto L60
    L30:
        r30 = r9;
        if ((r23 instanceof x03) == false) goto L19;
        x03 r65 = (x03) r23;
        if (r65.h() == false) goto L57;
        Object[] r66 = r65.b;
        long[] r67 = r65.a;
        int r68 = r67.length - 2;
        if (r68 < 0) goto L57;
        r32 = r12;
        r33 = r13;
        int r69 = 0;
    L37:
        long r116 = r67[r69];
        r6 = r6;
        Object[] r313 = r66;
        if (((((~r116) << 7) & r116) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L55;
        int r70 = 8 - ((~(r69 - r68)) >>> 31);
        int r71 = 0;
    L40:
        if (r71 >= r70) goto L54;
        if ((r116 & 255) >= 128) goto L52;
        Object r72 = r313[(r69 << 3) + r71];
        if ((r72 instanceof dp0) == false) goto L20;
        dp0 r73 = (dp0) r72;
        rv2 r117 = r73.p;
        if (r117 != null) goto L49;
        r117 = r20;
    L49:
        if (r117.i(r73.h().f, r62.g(r73)) == false) goto L20;
    L52:
        r116 = r116 >> r210;
        r71 = r71 + 1;
        goto L40
    L54:
        if (r70 == r210) goto L55;
    L58:
        r24 = 0;
    L55:
        if (r69 == r68) goto L58;
        r69 = r69 + 1;
        r6 = r6;
        r66 = r313;
        r210 = 8;
    L57:
        r6 = r6;
        r32 = r12;
        r33 = r13;
        goto L58
    L169:
        boolean r118 = r2;
        int r314 = r9;
        int r315 = r12;
        int r316 = r13;
        if (r17 == 0) goto L172;
        G(r3, r5, r5);
        this.G.t();
        int r74 = d0(r5);
        this.k = r314 + r74;
        this.l = r315 + r74;
        this.m = r316;
    L173:
        this.T = r10;
        this.F = r118;
        return;
    L172:
        M();
    L10:
        r15 = null;
        goto L11
    }

    public final void E() {
        I(this.G.g);
        k80 r8 = this.M;
        r8.d(false);
        o02 r1 = r8.d;
        rg1 r2 = r8.a;
        hg4 r3 = r2.G;
        if (r3.c <= 0) goto L13;
        int r4 = r3.i;
        if (r1.a(-2) == r4) goto L13;
        if (r8.c == false) goto L9;
    L11:
        if (r4 <= 0) goto L13;
        mg1 r5 = r3.a(r4);
        r1.c(r4);
        r8.d(false);
        ya3 r6 = r8.b.n;
        r6.x0(aa3.f);
        rr2.R(r6, 0, r5);
        r8.c = true;
        goto L13
    L9:
        if (r8.e == false) goto L11;
        r8.d(false);
        r8.b.n.x0(ba3.f);
        r8.c = true;
    L13:
        r8.b.n.x0(ja3.f);
        int r0 = r8.f;
        hg4 r7 = r2.G;
        r8.f = r7.b[(r7.g * 5) + 3] + r0;
    }

    public final void F(mf3 r2) {
        i03 r0 = this.v;
        if (r0 != null) goto L5;
        r0 = new i03();
        this.v = r0;
    L5:
        r0.i(this.G.g, r2);
    }

    public final void G(int r7, int r8, int r9) {
        hg4 r0 = this.G;
        if (r7 == r8) goto L13;
        if (r7 == r9) goto L34;
        if (r8 == r9) goto L34;
        if (r0.q(r7) != r8) goto L12;
        r9 = r8;
        goto L34
    L12:
        if (r0.q(r8) == r7) goto L13;
        if (r0.q(r7) != r0.q(r8)) goto L17;
        r9 = r0.q(r7);
        goto L34
    L17:
        int r1 = 0;
        int r2 = r7;
        int r3 = 0;
    L18:
        if (r2 <= 0) goto L21;
        if (r2 == r9) goto L21;
        r2 = r0.q(r2);
        r3 = r3 + 1;
    L21:
        int r4 = r8;
        int r5 = 0;
    L22:
        if (r4 <= 0) goto L25;
        if (r4 == r9) goto L25;
        r4 = r0.q(r4);
        r5 = r5 + 1;
    L25:
        int r10 = r3 - r5;
        int r6 = r7;
        int r11 = 0;
    L26:
        if (r11 >= r10) goto L28;
        r6 = r0.q(r6);
        r11 = r11 + 1;
        goto L26
    L28:
        int r12 = r5 - r3;
        int r13 = r8;
    L29:
        if (r1 >= r12) goto L31;
        r13 = r0.q(r13);
        r1 = r1 + 1;
        goto L29
    L31:
        int r14 = r13;
        r9 = r6;
    L32:
        if (r9 == r14) goto L34;
        r9 = r0.q(r9);
        r14 = r0.q(r14);
    L34:
        if (r7 <= 0) goto L40;
        if (r7 == r9) goto L40;
        if (r0.l(r7) == false) goto L39;
        this.M.a();
    L39:
        r7 = r0.q(r7);
    L40:
        n(r8, r9);
        return;
    L13:
        r9 = r7;
        goto L34
    }

    public final Object H() {
        boolean r0 = this.S;
        i80 r1 = j80.a;
        if (r0 == true) goto L5;
        Object r2 = this.G.m();
        if (this.y == false) goto L14;
        if ((r2 instanceof a24) == true) goto L14;
    L12:
        return r1;
    L14:
        if ((r2 instanceof wg1) == true) goto L16;
        return r2;
    L16:
        return ((wg1) r2).a;
    L5:
        if (this.r == false) goto L12;
        l80.a("A call to createNode(), emitNode() or useNode() expected");
        return r1;
    }

    public final void I(int r5) {
        boolean r0 = this.G.l(r5);
        k80 r1 = this.M;
        if (r0 == false) goto L5;
        r1.c();
        Object r2 = this.G.n(r5);
        r1.c();
        r1.h.add(r2);
    L5:
        J(this, r5, r0, 0);
        r1.c();
        if (r0 == false) goto L9;
        r1.a();
        return;
    }

    public final boolean K(int r4, boolean r5) {
        if ((r4 & 1) == 0) goto L5;
    L25:
        if (r5 == false) goto L27;
    L30:
        return true;
    L27:
        if (w() == false) goto L30;
        return false;
    L5:
        if (this.S == false) goto L7;
    L8:
        md4 r6 = this.P;
        if (r6 == null) goto L30;
        lv3 r7 = u();
        if (r7 == null) goto L30;
        if (r6.b() == false) goto L30;
        int r8 = r7.b;
        if ((r8 & 512) == 0) goto L19;
        return true;
    L19:
        int r0 = r8 | 1;
        r7.b = r0;
        if (this.y == false) goto L22;
        int r9 = r8 | 129;
    L23:
        r7.b = r9 | 256;
        ya3 r10 = this.M.b.n;
        r10.x0(ia3.f);
        rr2.R(r10, 0, r7);
        this.b.q(r7);
        return false;
    L22:
        r9 = r0 & (-129);
        goto L23
    L7:
        if (this.y == false) goto L25;
        goto L8
    }

    public final void L() {
        if (this.s.isEmpty() == false) goto L6;
        this.l = this.G.s() + this.l;
        return;
    L6:
        hg4 r0 = this.G;
        int r1 = r0.g();
        int[] r2 = r0.b;
        int r3 = r0.g;
        if (r3 >= r0.h) goto L9;
        Object r4 = r0.p(r2, r3);
    L10:
        Object r5 = r0.f();
        int r6 = this.m;
        i80 r7 = j80.a;
        if (r4 != null) goto L20;
        if (r5 == null) goto L17;
        if (r1 != 207) goto L17;
        if (r5.equals(r7) == true) goto L17;
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r5.hashCode()), 3) ^ ((long) r6);
    L24:
        boolean r11 = true;
        if ((r2[(r0.g * 5) + 1] & 1073741824) != 0) goto L28;
        r11 = false;
    L28:
        Q(null, r11);
        D();
        r0.e();
        if (r4 != null) goto L39;
        if (r5 == null) goto L36;
        if (r1 != 207) goto L36;
        if (r5.equals(r7) == true) goto L36;
        this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) r6), 3) ^ ((long) r5.hashCode()), 3);
        return;
    L36:
        this.T = Long.rotateRight(r1 ^ Long.rotateRight(this.T ^ ((long) r6), 3), 3);
        return;
    L39:
        if ((r4 instanceof Enum) == false) goto L42;
        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) r4).ordinal()), 3);
        return;
    L42:
        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) r4.hashCode()), 3);
        return;
    L17:
        long r10 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r1), 3) ^ ((long) r6);
    L18:
        this.T = r10;
        goto L24
    L20:
        if ((r4 instanceof Enum) == false) goto L23;
        int r12 = ((Enum) r4).ordinal();
    L22:
        r10 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r12), 3);
        goto L18
    L23:
        r12 = r4.hashCode();
        goto L22
    L9:
        r4 = null;
        goto L10
    }

    public final void M() {
        hg4 r0 = this.G;
        int r1 = r0.i;
        if (r1 < 0) goto L5;
        int r2 = r0.b[(r1 * 5) + 1] & 67108863;
    L6:
        this.l = r2;
        r0.t();
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final void N() {
        if (this.l == 0) goto L7;
        l80.a("No nodes can be emitted before calling skipAndEndGroup");
    L7:
        if (this.S == true) goto L20;
        lv3 r0 = u();
        if (r0 == null) goto L15;
        int r1 = r0.b;
        if ((r1 & 128) != 0) goto L15;
        r0.b = r1 | 16;
    L15:
        if (this.s.isEmpty() == false) goto L18;
        M();
        return;
    L18:
        D();
        return;
    }

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
    public final void O(int r27, k93 r28, int r29, Object r30) {
        k93 r2 = r28;
        if (this.r == false) goto L5;
        l80.a("A call to createNode(), emitNode() or useNode() expected");
    L5:
        int r7 = this.m;
        Object r8 = j80.a;
        if (r2 != null) goto L15;
        if (r30 != null) goto L9;
    L13:
        long r9 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r27), 3) ^ ((long) r7);
    L14:
        this.T = r9;
    L17:
        if (r2 != null) goto L20;
        this.m++;
    L20:
        if (r29 == 0) goto L22;
        boolean r10 = true;
    L24:
        if (this.S == false) goto L40;
        this.G.k++;
        lg4 r3 = this.I;
        int r11 = r3.t;
        Object r4 = r2;
        Object r5 = r2;
        if (r10 == false) goto L28;
        r3.Q(r8, r8, true, r27);
    L35:
        vg1 r6 = this.j;
        if (r6 == null) goto L38;
        int r12 = (-2) - r11;
        i42 r13 = new i42(-1, r27, r12, -1);
        r6.e.i(r12, new hk1(-1, this.k - r6.b, 0));
        r6.d.add(r13);
    L38:
        r(r10, null);
        return;
    L28:
        if (r30 == null) goto L32;
        if (r2 != null) goto L31;
        r4 = r8;
    L31:
        r3.Q(r4, r30, false, r27);
        goto L35
    L32:
        if (r2 != null) goto L34;
        r5 = r8;
    L34:
        r3.Q(r5, r8, false, r27);
        goto L35
    L40:
        if (r29 == 1) goto L43;
    L45:
        boolean r14 = false;
    L47:
        if (this.j != null) goto L58;
        int r15 = this.G.g();
        if (r14 == true) goto L59;
        if (r15 != r27) goto L59;
        hg4 r16 = this.G;
        int r17 = r16.g;
        if (r17 >= r16.h) goto L54;
        Object r18 = r16.p(r16.b, r17);
    L56:
        if (h12.c(r2, r18) == false) goto L59;
        Q(r30, r10);
        goto L58
    L54:
        r18 = null;
    L59:
        hg4 r19 = this.G;
        int[] r110 = r19.b;
        ArrayList r20 = new ArrayList();
        if (r19.k <= 0) goto L62;
    L61:
        boolean r210 = r14;
        this.j = new vg1(this.k, r20);
    L71:
        vg1 r21 = this.j;
        if (r21 == null) goto L191;
        ArrayList r22 = r21.d;
        i03 r23 = r21.e;
        int r24 = r21.b;
        if (r2 == null) goto L76;
        Object r111 = new b32(Integer.valueOf(r27), r2);
    L77:
        w03 r112 = ((mz2) r21.f.getValue()).a;
        Object r113 = r112.g(r111);
        if (r113 != null) goto L81;
        r113 = null;
    L90:
        i42 r114 = (i42) r113;
        if (r210 == true) goto L170;
        if (r114 == null) goto L170;
        int r1 = r114.c;
        r22.add(r114);
        hk1 r25 = (hk1) r23.b(r1);
        if (r25 == null) goto L96;
        int r26 = r25.b;
    L97:
        this.k = r26 + r24;
        hk1 r31 = (hk1) r23.b(r1);
        if (r31 == null) goto L100;
        int r32 = r31.a;
    L101:
        int r33 = r21.c;
        int r34 = r32 - r33;
        int r115 = 8;
        if (r32 <= r33) goto L127;
        Object[] r35 = r23.c;
        long[] r36 = r23.a;
        int r37 = r36.length - 2;
        if (r37 < 0) goto L126;
        int r38 = 0;
    L106:
        long r116 = r36[r38];
        if (((((~r116) << 7) & r116) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L123;
        int r117 = 8 - ((~(r38 - r37)) >>> 31);
        int r118 = 0;
    L109:
        if (r118 >= r117) goto L120;
        if ((r116 & 255) >= 128) goto L118;
        int r119 = r115;
        hk1 r120 = (hk1) r35[(r38 << 3) + r118];
        int r121 = r34;
        int r39 = r120.a;
        if (r39 != r32) goto L115;
        r120.a = r33;
    L119:
        r116 = r116 >> r119;
        r118 = r118 + 1;
        r34 = r121;
        r115 = r119;
        goto L109
    L115:
        if (r33 > r39) goto L119;
        if (r39 >= r32) goto L119;
        r120.a = r39 + 1;
        goto L119
    L118:
        r121 = r34;
        r119 = r115;
        goto L119
    L120:
        int r122 = r34;
        if (r117 != r115) goto L154;
    L124:
        if (r38 == r37) goto L154;
        r38 = r38 + 1;
        r34 = r122;
        r115 = 8;
    L154:
        k80 r40 = this.M;
        int r41 = r40.f;
        rg1 r42 = r40.a;
        r40.f = (r1 - r42.G.g) + r41;
        this.G.r(r1);
        if (r122 <= 0) goto L168;
        r40.d(false);
        o02 r43 = r40.d;
        hg4 r44 = r42.G;
        if (r44.c <= 0) goto L167;
        int r45 = r44.i;
        if (r43.a(-2) == r45) goto L167;
        if (r40.c == false) goto L163;
    L165:
        if (r45 <= 0) goto L167;
        mg1 r46 = r44.a(r45);
        r43.c(r45);
        r40.d(false);
        ya3 r47 = r40.b.n;
        r47.x0(aa3.f);
        rr2.R(r47, 0, r46);
        r40.c = true;
        goto L167
    L163:
        if (r40.e == false) goto L165;
        r40.d(false);
        r40.b.n.x0(ba3.f);
        r40.c = true;
    L167:
        ya3 r48 = r40.b.n;
        r48.x0(fa3.f);
        r48.f[r48.g - r48.d[r48.e - 1].b] = r122;
    L168:
        Q(r30, r10);
        goto L191
    L123:
        r122 = r34;
        goto L124
    L126:
        r122 = r34;
        goto L154
    L127:
        r122 = r34;
        if (r33 <= r32) goto L154;
        Object[] r49 = r23.c;
        long[] r50 = r23.a;
        int r51 = r50.length - 2;
        if (r51 < 0) goto L154;
        int r52 = 0;
    L132:
        long r123 = r50[r52];
        if (((((~r123) << 7) & r123) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L151;
        int r124 = 8 - ((~(r52 - r51)) >>> 31);
        int r53 = 0;
    L135:
        if (r53 >= r124) goto L148;
        if ((r123 & 255) >= 128) goto L146;
        hk1 r125 = (hk1) r49[(r52 << 3) + r53];
        int r126 = r125.a;
        if (r126 != r32) goto L141;
        r125.a = r33;
        goto L146
    L141:
        Object[] r211 = r49;
        if ((r32 + 1) > r126) goto L147;
        if (r126 >= r33) goto L147;
        r125.a = r126 - 1;
    L147:
        r123 = r123 >> 8;
        r53 = r53 + 1;
        r49 = r211;
    L146:
        r211 = r49;
        goto L147
    L148:
        Object[] r212 = r49;
        if (r124 != 8) goto L154;
    L152:
        if (r52 == r51) goto L154;
        r52 = r52 + 1;
        r49 = r212;
        goto L132
    L151:
        r212 = r49;
        goto L152
    L100:
        r32 = -1;
        goto L101
    L96:
        r26 = -1;
    L170:
        this.G.k++;
        this.S = true;
        this.K = null;
        if (this.I.w == false) goto L173;
        lg4 r54 = this.H.e();
        this.I = r54;
        r54.M();
        this.J = false;
        this.K = null;
    L173:
        this.I.d();
        lg4 r55 = this.I;
        int r56 = r55.t;
        if (r10 == false) goto L176;
        r55.Q(r8, r8, true, r27);
        int r127 = 0;
    L186:
        this.N = this.I.b(r56);
        int r128 = (-2) - r56;
        i42 r57 = new i42(-1, r27, r128, -1);
        r23.i(r128, new hk1(-1, this.k - r24, r127));
        r22.add(r57);
        ArrayList r58 = new ArrayList();
        if (r10 == false) goto L189;
        int r59 = r127;
    L190:
        vg1 r129 = new vg1(r59, r58);
    L192:
        r(r10, r129);
        return;
    L189:
        r59 = this.k;
        goto L190
    L176:
        if (r30 == null) goto L181;
        if (r28 != null) goto L179;
    L178:
        r127 = 0;
        r55.Q(r8, r30, false, r27);
        goto L186
    L179:
        r8 = r28;
        goto L178
    L181:
        r127 = 0;
        if (r28 != null) goto L184;
        Object r60 = r8;
    L185:
        r55.Q(r60, r8, false, r27);
        goto L186
    L184:
        r60 = r28;
        goto L185
    L81:
        if ((r113 instanceof q03) == false) goto L89;
        q03 r130 = (q03) r113;
        Object r131 = r130.k(0);
        if (r130.h() == false) goto L86;
        r112.j(r111);
    L86:
        if (r130.b != 1) goto L88;
        r112.l(r111, r130.e());
    L88:
        r113 = r131;
        goto L90
    L89:
        r112.j(r111);
        goto L90
    L76:
        r111 = Integer.valueOf(r27);
    L191:
        r129 = null;
        goto L192
    L62:
        int r132 = r19.g;
    L64:
        if (r132 >= r19.h) goto L61;
        int r133 = r132 * 5;
        int r61 = r110[r133];
        Object r62 = r19.p(r110, r132);
        int r213 = r110[r133 + 1];
        if ((r213 & 1073741824) == 0) goto L68;
        int r63 = 1;
    L69:
        r20.add(new i42(r62, r61, r132, r63));
        r132 = r132 + r110[r133 + 3];
        r14 = r14;
        goto L64
    L68:
        r63 = r213 & 67108863;
    L58:
        r210 = r14;
        goto L71
    L43:
        if (this.y == false) goto L45;
        r14 = true;
        goto L47
    L22:
        r10 = false;
        goto L24
    L9:
        if (r27 != 207) goto L13;
        if (r30.equals(r8) == true) goto L13;
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r30.hashCode()), 3) ^ ((long) r7);
        goto L17
    L15:
        r9 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r2.a.hashCode()), 3);
        goto L14
    }

    public final void P(int r3, k93 r4) {
        O(r3, r4, 0, null);
    }

    public final void Q(Object r3, boolean r4) {
        if (r4 == false) goto L11;
        hg4 r2 = this.G;
        if (r2.k <= 0) goto L6;
        return;
    L6:
        if ((r2.b[(r2.g * 5) + 1] & 1073741824) != 0) goto L9;
        oo3.a("Expected a node group");
    L9:
        r2.u();
        return;
    L11:
        if (r3 != null) goto L13;
    L15:
        this.G.u();
        return;
    L13:
        if (this.G.f() == r3) goto L15;
        k80 r5 = this.M;
        r5.getClass();
        r5.d(false);
        ya3 r6 = r5.b.n;
        r6.x0(sa3.f);
        rr2.R(r6, 0, r3);
        goto L15
    }

    public final void R(int r10) {
        if (this.j == null) goto L7;
        O(r10, null, 0, null);
        return;
    L7:
        if (this.r == false) goto L9;
        l80.a("A call to createNode(), emitNode() or useNode() expected");
    L9:
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) r10), 3) ^ ((long) this.m);
        this.m++;
        hg4 r0 = this.G;
        boolean r4 = this.S;
        i80 r5 = j80.a;
        if (r4 == false) goto L14;
        r0.k++;
        this.I.Q(r5, r5, false, r10);
        r(false, null);
        return;
    L14:
        if (r0.g() != r10) goto L23;
        int r6 = r0.g;
        if (r6 < r0.h) goto L18;
    L20:
        r0.u();
        r(false, null);
        return;
    L18:
        if ((r0.b[(r6 * 5) + 1] & 536870912) == 0) goto L20;
    L23:
        if (r0.k > 0) goto L29;
        int r7 = r0.g;
        if (r7 == r0.h) goto L29;
        int r8 = this.k;
        E();
        this.M.e(r8, r0.s());
        si0.i(r7, r0.g, this.s);
    L29:
        r0.k++;
        this.S = true;
        this.K = null;
        if (this.I.w == false) goto L32;
        lg4 r1 = this.H.e();
        this.I = r1;
        r1.M();
        this.J = false;
        this.K = null;
    L32:
        lg4 r2 = this.I;
        r2.d();
        int r3 = r2.t;
        r2.Q(r5, r5, false, r10);
        this.N = r2.b(r3);
        r(false, null);
    }

    public final rg1 S(int r7) {
        R(r7);
        boolean r8 = this.S;
        zg5 r0 = this.g;
        ArrayList r1 = this.E;
        z80 r2 = this.h;
        if (r8 == false) goto L6;
        lv3 r9 = new lv3(r2);
        r1.add(r9);
        c0(r9);
        r9.e = this.B;
        r9.b &= -17;
        r0.r();
        return this;
    L6:
        int r10 = this.G.i;
        ArrayList r3 = this.s;
        int r11 = si0.t(r3, r10);
        if (r11 < 0) goto L9;
        o12 r12 = (o12) r3.remove(r11);
    L10:
        Object r4 = this.G.m();
        if (h12.c(r4, j80.a) == false) goto L13;
        lv3 r5 = new lv3(r2);
        c0(r5);
    L15:
        if (r12 != null) goto L25;
        int r13 = r5.b;
        if ((r13 & 64) == 0) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        r5.b = r13 & (-65);
    L22:
        if (r6 == true) goto L25;
        boolean r14 = false;
    L26:
        int r15 = r5.b;
        if (r14 == false) goto L29;
        int r16 = r15 | 8;
    L30:
        r5.b = r16;
        r1.add(r5);
        r5.e = this.B;
        r5.b &= -17;
        r0.r();
        int r17 = r5.b;
        if ((r17 & 256) == 0) goto L37;
        r5.b = (r17 & (-257)) | 512;
        ya3 r18 = this.M.b.n;
        r18.x0(oa3.f);
        rr2.R(r18, 0, r5);
        if (this.y == true) goto L37;
        int r19 = r5.b;
        if ((r19 & 128) == 0) goto L37;
        this.y = true;
        this.z = this.G.i;
        r5.b = r19 | 1024;
    L37:
        return this;
    L29:
        r16 = r15 & (-9);
        goto L30
    L19:
        r6 = false;
    L25:
        r14 = true;
        goto L26
    L13:
        r4.getClass();
        r5 = (lv3) r4;
        goto L15
    L9:
        r12 = null;
        goto L10
    }

    public final void T(Object r4) {
        if (this.S == false) goto L5;
    L11:
        O(207, null, 0, r4);
        return;
    L5:
        if (this.G.g() != 207) goto L11;
        if (h12.c(this.G.f(), r4) == true) goto L11;
        if (this.z >= 0) goto L11;
        this.z = this.G.g;
        this.y = true;
        goto L11
    }

    public final void U() {
        O(125, null, 2, null);
        this.r = true;
    }

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
    public final void V() {
        this.m = 0;
        this.G = this.c.d();
        O(100, null, 0, null);
        u80 r1 = this.b;
        r1.t();
        mf3 r3 = r1.i();
        this.x.c(this.w ? 1 : 0);
        this.w = e(r3);
        this.K = null;
        if (this.q == true) goto L6;
        this.q = r1.e();
    L6:
        if (this.C == true) goto L9;
        this.C = r1.f();
    L9:
        if (this.C == false) goto L11;
        wl4 r4 = y80.a;
        r4.getClass();
        r3 = r3.b(r4, new xl4(v()));
    L11:
        this.u = r3;
        Set r5 = (Set) vr1.C(r3, yz1.a);
        if (r5 == null) goto L14;
        r5.add(t());
        r1.o(r5);
    L14:
        O(Long.hashCode(r1.g()), null, 0, null);
    }

    public final boolean W(lv3 r6, Object r7) {
        mg1 r0 = r6.c;
        if (r0 == null) goto L34;
        int r1 = this.G.a.a(fh0.d(r0));
        if (this.F == true) goto L8;
        return false;
    L8:
        if (r1 < this.G.g) goto L33;
        ArrayList r5 = this.s;
        int r2 = si0.t(r5, r1);
        if (r2 >= 0) goto L17;
        int r3 = -(r2 + 1);
        if ((r7 instanceof dp0) == true) goto L15;
        r7 = null;
    L15:
        r5.add(r3, new o12(r6, r1, r7));
        return true;
    L17:
        o12 r8 = (o12) r5.get(r2);
        if ((r7 instanceof dp0) == false) goto L29;
        Object r9 = r8.c;
        if (r9 != null) goto L24;
        r8.c = r7;
        return true;
    L24:
        if ((r9 instanceof x03) == false) goto L27;
        ((x03) r9).a(r7);
        return true;
    L27:
        x03 r4 = w54.a;
        x03 r10 = new x03(2);
        r10.k(r9);
        r10.k(r7);
        r8.c = r10;
        return true;
    L29:
        r8.c = null;
        return true;
    L33:
        return false;
    L34:
        return false;
    }

    public final void X(w03 r18) {
        ArrayList r0 = this.s;
        int r2 = gb.E(r0);
    L4:
        if ((-1) >= r2) goto L17;
        o12 r4 = (o12) r0.get(r2);
        mg1 r5 = r4.a.c;
        if (r5 == null) goto L8;
        mg1 r3 = fh0.d(r5);
    L9:
        if (r3 != null) goto L11;
    L15:
        r0.remove(r2);
    L16:
        r2 = r2 - 1;
        goto L4
    L11:
        if (r3.a() == false) goto L15;
        int r6 = r4.b;
        int r7 = r3.a;
        if (r6 == r7) goto L16;
        r4.b = r7;
        goto L16
    L8:
        r3 = null;
        goto L9
    L17:
        Object[] r8 = r18.b;
        Object[] r9 = r18.c;
        long[] r1 = r18.a;
        int r10 = r1.length - 2;
        if (r10 < 0) goto L36;
        int r11 = 0;
    L20:
        long r12 = r1[r11];
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L34;
        int r13 = 8 - ((~(r11 - r10)) >>> 31);
        int r14 = 0;
    L23:
        if (r14 >= r13) goto L33;
        if ((255 & r12) >= 128) goto L32;
        int r15 = (r11 << 3) + r14;
        Object r16 = r8[r15];
        Object r17 = r9[r15];
        r16.getClass();
        lv3 r19 = (lv3) r16;
        mg1 r110 = r19.c;
        if (r110 == null) goto L32;
        int r111 = fh0.d(r110).a;
        if (r17 != rv2.B) goto L31;
        r17 = null;
    L31:
        r0.add(new o12(r19, r111, r17));
    L32:
        r12 = r12 >> 8;
        r14 = r14 + 1;
        goto L23
    L33:
        if (r13 != 8) goto L36;
    L34:
        if (r11 == r10) goto L36;
        r11 = r11 + 1;
    L36:
        u40.m0(r0, si0.b);
    }

    public final void Y(int r5, int r6) {
        if (d0(r5) == r6) goto L15;
        if (r5 >= 0) goto L10;
        g03 r0 = this.p;
        if (r0 != null) goto L8;
        r0 = new g03();
        this.p = r0;
    L8:
        r0.f(r5, r6);
        return;
    L10:
        int[] r1 = this.o;
        if (r1 != null) goto L13;
        int r2 = this.G.c;
        int[] r3 = new int[r2];
        Arrays.fill(r3, 0, r2, -1);
        this.o = r3;
        r1 = r3;
    L13:
        r1[r5] = r6;
        return;
    }

    public final void Z(int r7, int r8) {
        int r0 = d0(r7);
        if (r0 == r8) goto L21;
        int r9 = r8 - r0;
        ArrayList r1 = this.i;
        int r2 = r1.size() - 1;
    L6:
        if (r7 == (-1)) goto L33;
        int r3 = d0(r7) + r9;
        Y(r7, r3);
        int r4 = r2;
    L8:
        if ((-1) >= r4) goto L15;
        vg1 r5 = (vg1) r1.get(r4);
        if (r5 == null) goto L14;
        if (r5.a(r7, r3) == false) goto L14;
        r2 = r4 - 1;
    L14:
        r4 = r4 - 1;
    L15:
        hg4 r6 = this.G;
        if (r7 < 0) goto L17;
        if (r6.l(r7) == true) goto L34;
        r7 = this.G.q(r7);
        goto L6
    L34:
        return;
    L17:
        r7 = r6.i;
        goto L6
    L33:
        return;
    }

    public final void a() {
        h();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        p71 r0 = this.O;
        r0.e.u0();
        r0.d.u0();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        hg4 r1 = this.G;
        if (r1.f == true) goto L6;
        r1.c();
    L6:
        if (this.I.w == true) goto L9;
        s();
        return;
    }

    public final mf3 a0(mf3 r3, mf3 r4) {
        r3.getClass();
        lf3 r0 = new lf3(r3);
        r0.putAll(r4);
        mf3 r5 = r0.a();
        P(204, l80.d);
        z();
        c0(r5);
        z();
        c0(r4);
        o(false);
        return r5;
    }

    public final void b(wf1 r5, Object r6) {
        if (this.S == false) goto L6;
        ya3 r4 = this.O.d;
        r4.x0(ta3.f);
        rr2.R(r4, 0, r6);
        jz4.j(2, r5);
        rr2.R(r4, 1, r5);
        return;
    L6:
        k80 r7 = this.M;
        r7.b();
        ya3 r8 = r7.b.n;
        r8.x0(ta3.f);
        jz4.j(2, r5);
        rr2.S(r8, 0, r6, 1, r5);
    }

    public final void b0(Object r4) {
        if ((r4 instanceof vy3) == false) goto L8;
        wg1 r0 = new wg1((vy3) r4, this.m - 1);
        if (this.S == false) goto L7;
        ya3 r1 = this.M.b.n;
        r1.x0(ha3.f);
        rr2.R(r1, 0, r0);
    L7:
        this.d.add(r4);
        r4 = r0;
    L8:
        c0(r4);
    }

    public final boolean c(float r3) {
        Object r0 = z();
        if ((r0 instanceof Float) == true) goto L5;
    L8:
        c0(Float.valueOf(r3));
        return true;
    L5:
        if (r3 != ((Number) r0).floatValue()) goto L8;
        return false;
    }

    public final void c0(Object r7) {
        if (this.S == false) goto L17;
        lg4 r6 = this.I;
        if (r6.n > 0) goto L7;
    L15:
        r6.F(r7);
        return;
    L7:
        if (r6.i == r6.k) goto L15;
        i03 r0 = r6.s;
        if (r0 != null) goto L11;
        r0 = new i03();
    L11:
        r6.s = r0;
        int r8 = r6.v;
        Object r1 = r0.b(r8);
        if (r1 != null) goto L14;
        r1 = new q03();
        r0.i(r8, r1);
    L14:
        ((q03) r1).a(r7);
        return;
    L17:
        hg4 r2 = this.G;
        boolean r3 = r2.n;
        k80 r4 = this.M;
        if (r3 == false) goto L25;
        int r5 = (r2.l - kg4.b(r2.b, r2.i)) - 1;
        if ((r4.a.G.i - r4.f) >= 0) goto L23;
        hg4 r9 = this.G;
        mg1 r10 = r9.a(r9.i);
        ya3 r11 = r4.b.n;
        r11.x0(ca3.i);
        rr2.S(r11, 0, r7, 1, r10);
        r11.f[r11.g - r11.d[r11.e - 1].b] = r5;
        return;
    L23:
        r4.d(true);
        ya3 r12 = r4.b.n;
        r12.x0(ca3.j);
        rr2.R(r12, 0, r7);
        r12.f[r12.g - r12.d[r12.e - 1].b] = r5;
        return;
    L25:
        mg1 r13 = r2.a(r2.i);
        ya3 r14 = r4.b.n;
        r14.x0(p93.f);
        rr2.S(r14, 0, r13, 1, r7);
    }

    public final boolean d(int r3) {
        Object r0 = z();
        if ((r0 instanceof Integer) == true) goto L5;
    L8:
        c0(Integer.valueOf(r3));
        return true;
    L5:
        if (r3 != ((Number) r0).intValue()) goto L8;
        return false;
    }

    public final int d0(int r3) {
        if (r3 >= 0) goto L13;
        g03 r2 = this.p;
        if (r2 != null) goto L6;
    L12:
        return 0;
    L6:
        if (r2.c(r3) < 0) goto L12;
        int r1 = r2.c(r3);
        if (r1 >= 0) goto L10;
        kf2.m(f34.f(r3, "Cannot find value for key "));
        goto L12
    L10:
        return r2.c[r1];
    L13:
        int[] r0 = this.o;
        if (r0 == null) goto L19;
        int r4 = r0[r3];
        if (r4 < 0) goto L19;
        return r4;
    L19:
        return this.G.o(r3);
    }

    public final boolean e(Object r2) {
        if (h12.c(z(), r2) == true) goto L6;
        c0(r2);
        return true;
    L6:
        return false;
    }

    public final void e0() {
        if (this.r == true) goto L5;
        l80.a("A call to createNode(), emitNode() or useNode() expected was not expected");
    L5:
        this.r = false;
        if (this.S == false) goto L8;
        l80.a("useNode() called while inserting");
    L8:
        hg4 r0 = this.G;
        Object r1 = r0.n(r0.i);
        k80 r2 = this.M;
        r2.c();
        r2.h.add(r1);
        if (this.y == true) goto L11;
        return;
    L11:
        if ((r1 instanceof u70) == false) goto L15;
        r2.b();
        r2.b.n.x0(va3.f);
        return;
    }

    public final boolean f(boolean r3) {
        Object r0 = z();
        if ((r0 instanceof Boolean) == true) goto L5;
    L8:
        c0(Boolean.valueOf(r3));
        return true;
    L5:
        if (r3 != ((Boolean) r0).booleanValue()) goto L8;
        return false;
    }

    public final boolean g(Object r2) {
        if (z() == r2) goto L6;
        c0(r2);
        return true;
    L6:
        return false;
    }

    public final void h() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0;
        this.r = false;
        k80 r2 = this.M;
        r2.c = false;
        r2.d.b = 0;
        r2.f = 0;
        r2.e = true;
        r2.g = 0;
        r2.h.clear();
        r2.i = -1;
        r2.j = -1;
        r2.k = -1;
        r2.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final Object i(qr3 r1) {
        return vr1.C(k(), r1);
    }

    public final void j() {
        if (this.r == true) goto L5;
        l80.a("A call to createNode(), emitNode() or useNode() expected was not expected");
    L5:
        this.r = false;
        if (this.S == true) goto L8;
        l80.a("createNode() can only be called when inserting");
    L8:
        o02 r1 = this.n;
        int r2 = r1.a[r1.b - 1];
        lg4 r3 = this.I;
        mg1 r4 = r3.b(r3.v);
        this.l++;
        p71 r9 = this.O;
        ya3 r5 = r9.d;
        r5.x0(ca3.g);
        rr2.R(r5, 0, c72.b0);
        r5.f[r5.g - r5.d[r5.e - 1].b] = r2;
        rr2.R(r5, 1, r4);
        ya3 r10 = r9.e;
        r10.x0(ca3.h);
        r10.f[r10.g - r10.d[r10.e - 1].b] = r2;
        rr2.R(r10, 0, r4);
    }

    public final mf3 k() {
        mf3 r0 = this.K;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int r1 = this.G.i;
        boolean r2 = this.S;
        k93 r3 = l80.c;
        if (r2 == false) goto L19;
        if (this.J == false) goto L19;
        int r4 = this.I.v;
    L10:
        if (r4 <= 0) goto L19;
        if (this.I.s(r4) != 202) goto L17;
        if (h12.c(this.I.t(r4), r3) == false) goto L17;
        Object r5 = this.I.q(r4);
        r5.getClass();
        mf3 r6 = (mf3) r5;
        this.K = r6;
        return r6;
    L17:
        lg4 r7 = this.I;
        r4 = r7.E(r7.b, r4);
    L19:
        if (this.G.c <= 0) goto L33;
    L20:
        if (r1 <= 0) goto L33;
        if (this.G.i(r1) != 202) goto L32;
        hg4 r8 = this.G;
        if (h12.c(r8.p(r8.b, r1), r3) == false) goto L32;
        i03 r9 = this.v;
        if (r9 == null) goto L29;
        mf3 r10 = (mf3) r9.b(r1);
        if (r10 == null) goto L29;
    L30:
        this.K = r10;
        return r10;
    L29:
        hg4 r11 = this.G;
        Object r12 = r11.b(r11.b, r1);
        r12.getClass();
        r10 = (mf3) r12;
    L32:
        r1 = this.G.q(r1);
    L33:
        mf3 r13 = this.u;
        this.K = r13;
        return r13;
    }

    public final c80 l() {
        if (this.b.k() == false) goto L22;
        qb2 r0 = gb.r();
        lg4 r2 = this.I;
        r0.addAll(gh0.d(r2, null, r2.t, null));
        hg4 r1 = this.G;
        boolean r3 = r1.f;
        int[] r4 = r1.b;
        if (r3 == false) goto L7;
    L16:
        Collection r5 = u01.n;
    L17:
        r0.addAll(r5);
        r0.addAll(A());
        return new c80(gb.f(r0), this.C);
    L7:
        if (r1.c == 0) goto L16;
        tu3 r6 = new tu3(r1);
        int r7 = r1.i;
        Object r8 = Integer.valueOf(r1.l - kg4.b(r4, r7));
    L9:
        if (r7 < 0) goto L15;
        if (r1.k(r7) == false) goto L13;
        Object r9 = r1.p(r4, r7);
    L14:
        r6.l(r1.i(r7), r9, r1.a.g(r7), r8);
        r8 = r1.a(r7);
        r7 = r1.q(r7);
        goto L9
    L13:
        r9 = j80.a;
        goto L14
    L15:
        r5 = (ArrayList) r6.a;
        goto L17
    L22:
        return null;
    }

    public final void m(w03 r8, wf1 r9) {
        ArrayList r1 = this.s;
        if (this.F == false) goto L5;
        l80.a("Reentrant composition is not supported");
    L5:
        this.g.r();
        Trace.beginSection("Compose:recompose");
        this.B = Long.hashCode(jh4.j().g());     // Catch: Throwable -> L44
        this.v = null;     // Catch: Throwable -> L44
        X(r8);     // Catch: Throwable -> L44
        this.k = 0;     // Catch: Throwable -> L44
        this.F = true;     // Catch: Throwable -> L44
        V();     // Catch: Throwable -> L11
        Object r3 = z();     // Catch: Throwable -> L11
        if (r3 == r9) goto L13;
        if (r9 == null) goto L13;
        c0(r9);     // Catch: Throwable -> L11
    L13:
        qg1 r4 = this.D;     // Catch: Throwable -> L11
        f13 r5 = uc5.n();     // Catch: Throwable -> L11
        r5.b(r4);     // Catch: Throwable -> L18
        k93 r6 = l80.a;
        if (r9 == null) goto L21;
        P(200, r6);     // Catch: Throwable -> L18
        vr1.y(this, r9);     // Catch: Throwable -> L18
        o(false);     // Catch: Throwable -> L18
    L27:
        r5.k(r5.p - 1);     // Catch: Throwable -> L11
        q();     // Catch: Throwable -> L11
        this.F = false;     // Catch: Throwable -> L44
        r1.clear();     // Catch: Throwable -> L44
        if (this.I.w == true) goto L31;
        l80.a("Check failed");     // Catch: Throwable -> L44
    L31:
        s();     // Catch: Throwable -> L44
        Trace.endSection();
        return;
    L21:
        if (this.w == false) goto L26;
        if (r3 == null) goto L26;
        if (r3.equals(j80.a) == true) goto L26;
        P(200, r6);     // Catch: Throwable -> L18
        jz4.j(2, r3);     // Catch: Throwable -> L18
        vr1.y(this, (wf1) r3);     // Catch: Throwable -> L18
        o(false);     // Catch: Throwable -> L18
    L26:
        L();     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r5.k(r5.p - 1);     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        si0.T(th, new ng1(1, this));     // Catch: Throwable -> L38
        throw th;     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        this.F = false;     // Catch: Throwable -> L44
        r1.clear();     // Catch: Throwable -> L44
        a();     // Catch: Throwable -> L44
        if (this.I.w == true) goto L42;
        l80.a("Check failed");     // Catch: Throwable -> L44
    L42:
        s();     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final void n(int r2, int r3) {
        if (r2 <= 0) goto L8;
        if (r2 == r3) goto L9;
        n(this.G.q(r2), r3);
        if (this.G.l(r2) == false) goto L10;
        Object r4 = this.G.n(r2);
        k80 r1 = this.M;
        r1.c();
        r1.h.add(r4);
        return;
    L10:
        return;
    L9:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void o(boolean r43) {
        o02 r1 = this.n;
        int r2 = r1.a[r1.b - 2] - 1;
        boolean r4 = this.S;
        i80 r5 = j80.a;
        if (r4 == false) goto L18;
        lg4 r6 = this.I;
        int r8 = r6.v;
        int r7 = r6.s(r8);
        Object r9 = this.I.t(r8);
        Object r10 = this.I.q(r8);
        if (r9 != null) goto L14;
        if (r10 == null) goto L11;
        if (r7 != 207) goto L11;
        if (r10.equals(r5) == true) goto L11;
        this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) r2), 3) ^ ((long) r10.hashCode()), 3);
    L32:
        int r3 = this.l;
        vg1 r11 = this.j;
        ArrayList r12 = this.s;
        k80 r13 = this.M;
        if (r11 == null) goto L150;
        i03 r14 = r11.e;
        int r15 = r11.b;
        ArrayList r16 = r11.a;
        if (r16.size() <= 0) goto L150;
        ArrayList r17 = r11.d;
        HashSet r18 = new HashSet(r17.size());
        int r19 = r17.size();
        int r20 = 0;
    L37:
        if (r20 >= r19) goto L39;
        r18.add(r17.get(r20));
        r20 = r20 + 1;
        goto L37
    L39:
        int r110 = -1;
        x03 r21 = w54.a;
        x03 r22 = new x03();
        int r23 = r17.size();
        int r111 = r16.size();
        int r24 = 0;
        int r112 = 0;
        int r25 = 0;
    L40:
        if (r24 >= r111) goto L147;
        i42 r26 = (i42) r16.get(r24);
        if (r18.contains(r26) == false) goto L43;
        o02 r27 = r1;
        int r28 = r24;
        if (r22.c(r26) == true) goto L48;
        int r29 = r112;
        if (r29 < r23) goto L55;
        r112 = r29;
        r1 = r27;
        r24 = r28;
        goto L40
    L55:
        i42 r30 = (i42) r17.get(r29);
        if (r30 == r26) goto L140;
        hk1 r31 = (hk1) r14.b(r30.c);
        if (r31 == null) goto L60;
        int r32 = r31.b;
    L61:
        r22.a(r30);
        int r33 = r25;
        if (r32 == r33) goto L137;
        hk1 r34 = (hk1) r14.b(r30.c);
        if (r34 == null) goto L67;
        int r35 = r34.c;
    L66:
        x03 r210 = r22;
        int r36 = r32 + r15;
        int r211 = r23;
        int r37 = r33 + r15;
        if (r35 <= 0) goto L79;
        int r212 = r15;
        int r113 = r13.l;
        if (r113 <= 0) goto L77;
        ArrayList r213 = r16;
        if (r13.j == (r36 - r113)) goto L75;
    L78:
        r13.c();
        r13.j = r36;
        r13.k = r37;
        r13.l = r35;
    L81:
        if (r32 <= r33) goto L108;
        Object[] r38 = r14.c;
        long[] r114 = r14.a;
        int r115 = r114.length - 2;
        if (r115 < 0) goto L138;
        ArrayList r39 = r17;
        HashSet r310 = r18;
        int r40 = 0;
    L85:
        long r116 = r114[r40];
        int r311 = r35;
        r12 = r12;
        if (((((~r116) << 7) & r116) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L104;
        int r41 = 8 - ((~(r40 - r115)) >>> 31);
        int r42 = 0;
    L88:
        if (r42 >= r41) goto L101;
        if ((r116 & 255) >= 128) goto L99;
        int r44 = r42;
        hk1 r45 = (hk1) r38[(r40 << 3) + r42];
        Object[] r312 = r38;
        int r46 = r45.b;
        long[] r47 = r114;
        if (r32 <= r46) goto L94;
    L96:
        if (r33 > r46) goto L100;
        if (r46 >= r32) goto L100;
        r45.b = r46 + r311;
    L100:
        r116 = r116 >> 8;
        r42 = r44 + 1;
        r38 = r312;
        r114 = r47;
        goto L88
    L94:
        if (r46 >= (r32 + r311)) goto L96;
        r45.b = (r46 - r32) + r33;
        goto L100
    L99:
        r44 = r42;
        r312 = r38;
        r47 = r114;
        goto L100
    L101:
        Object[] r313 = r38;
        long[] r48 = r114;
        if (r41 != 8) goto L139;
    L105:
        if (r40 == r115) goto L139;
        r40 = r40 + 1;
        r12 = r12;
        r35 = r311;
        r38 = r313;
        r114 = r48;
    L139:
        int r49 = r28;
    L141:
        r112 = r29 + 1;
        hk1 r50 = (hk1) r14.b(r30.c);
        if (r50 == null) goto L144;
        int r51 = r50.c;
    L145:
        int r52 = r33 + r51;
        r24 = r49;
        r11 = r11;
        r22 = r210;
        r23 = r211;
        r15 = r212;
        r16 = r213;
        r17 = r39;
        r18 = r310;
        r12 = r12;
        r25 = r52;
    L49:
        r1 = r27;
        goto L40
    L144:
        r51 = r30.d;
        goto L145
    L104:
        r313 = r38;
        r48 = r114;
    L138:
        r39 = r17;
        r310 = r18;
        goto L139
    L108:
        int r314 = r35;
        r12 = r12;
        r39 = r17;
        r310 = r18;
        if (r33 <= r32) goto L139;
        Object[] r53 = r14.c;
        long[] r54 = r14.a;
        int r55 = r54.length - 2;
        if (r55 < 0) goto L139;
        int r56 = 0;
    L113:
        long r117 = r54[r56];
        if (((((~r117) << 7) & r117) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L134;
        int r118 = 8 - ((~(r56 - r55)) >>> 31);
        int r119 = 0;
    L116:
        if (r119 >= r118) goto L131;
        if ((r117 & 255) >= 128) goto L129;
        Object[] r410 = r53;
        hk1 r57 = (hk1) r53[(r56 << 3) + r119];
        long[] r315 = r54;
        int r58 = r57.b;
        int r411 = r32;
        if (r32 > r58) goto L125;
        if (r58 >= (r411 + r314)) goto L125;
        r57.b = (r58 - r411) + r33;
    L130:
        r117 = r117 >> 8;
        r119 = r119 + 1;
        r54 = r315;
        r53 = r410;
        r32 = r411;
    L125:
        if ((r411 + 1) > r58) goto L130;
        if (r58 >= r33) goto L130;
        r57.b = r58 - r314;
        goto L130
    L129:
        r410 = r53;
        r315 = r54;
        r411 = r32;
        goto L130
    L131:
        Object[] r412 = r53;
        long[] r316 = r54;
        int r413 = r32;
        if (r118 != 8) goto L139;
    L135:
        if (r56 == r55) goto L139;
        r56 = r56 + 1;
        r54 = r316;
        r53 = r412;
        r32 = r413;
        goto L113
    L134:
        r412 = r53;
        r316 = r54;
        r413 = r32;
        goto L135
    L75:
        if (r13.k != (r37 - r113)) goto L78;
        r13.l = r113 + r35;
        goto L81
    L77:
        r213 = r16;
        goto L78
    L79:
        r212 = r15;
        r213 = r16;
        r13.getClass();
        goto L81
    L67:
        r35 = r30.d;
        goto L66
    L137:
        r210 = r22;
        r211 = r23;
        r212 = r15;
        r213 = r16;
        goto L138
    L60:
        r32 = -1;
        goto L61
    L140:
        r12 = r12;
        r210 = r22;
        r211 = r23;
        r212 = r15;
        r213 = r16;
        r39 = r17;
        r310 = r18;
        r33 = r25;
        r49 = r28 + 1;
    L48:
        r24 = r28 + 1;
        goto L49
    L43:
        r27 = r1;
        hk1 r59 = (hk1) r14.b(r26.c);
        if (r59 == null) goto L46;
        int r214 = r59.b;
    L47:
        int r60 = r26.c;
        r28 = r24;
        r13.e(r214 + r15, r26.d);
        r11.a(r60, 0);
        r13.f = (r60 - r13.a.G.g) + r13.f;
        this.G.r(r60);
        E();
        this.G.s();
        si0.i(r60, this.G.b[(r60 * 5) + 3] + r60, r12);
        goto L48
    L46:
        r214 = -1;
        goto L47
    L147:
        o02 r215 = r1;
        ArrayList r317 = r12;
        r13.c();
        if (r16.size() <= 0) goto L151;
        hg4 r61 = this.G;
        int r62 = r61.h;
        r13.f = (r62 - r13.a.G.g) + r13.f;
        r61.t();
    L151:
        boolean r63 = this.S;
        if (r63 == true) goto L169;
        hg4 r64 = this.G;
        int r65 = r64.m - r64.l;
        if (r65 <= 0) goto L169;
        if (r65 <= 0) goto L168;
        r13.d(false);
        o02 r66 = r13.d;
        hg4 r67 = r13.a.G;
        if (r67.c <= 0) goto L167;
        int r68 = r67.i;
        if (r66.a(-2) == r68) goto L167;
        if (r13.c == false) goto L163;
    L165:
        if (r68 <= 0) goto L167;
        mg1 r69 = r67.a(r68);
        r66.c(r68);
        r13.d(false);
        ya3 r70 = r13.b.n;
        r70.x0(aa3.f);
        rr2.R(r70, 0, r69);
        r13.c = true;
        goto L167
    L163:
        if (r13.e == false) goto L165;
        r13.d(false);
        r13.b.n.x0(ba3.f);
        r13.c = true;
    L167:
        ya3 r71 = r13.b.n;
        r71.x0(ra3.f);
        r71.f[r71.g - r71.d[r71.e - 1].b] = r65;
        goto L169
    L168:
        r13.getClass();
    L169:
        int r72 = this.k;
    L170:
        hg4 r73 = this.G;
        if (r73.k > 0) goto L175;
        int r74 = r73.g;
        if (r74 == r73.h) goto L175;
        E();
        r13.e(r72, this.G.s());
        si0.i(r74, this.G.g, r317);
    L175:
        if (r63 == false) goto L220;
        if (r43 == false) goto L182;
        p71 r75 = this.O;
        ya3 r76 = r75.e;
        if (r76.e != 0) goto L181;
        l80.a("Cannot end node insertion, there are no pending operations that can be realized.");
    L181:
        ya3 r77 = r75.d;
        e22[] r78 = r76.d;
        int r79 = r76.e - 1;
        r76.e = r79;
        e22 r80 = r78[r79];
        r78[r79] = null;
        r77.x0(r80);
        Object[] r81 = r76.h;
        Object[] r82 = r77.h;
        int r120 = r77.i;
        int r121 = r80.c;
        int r122 = r76.i;
        int r123 = r122 - r121;
        System.arraycopy(r81, r123, r82, r120 - r121, r122 - r123);
        Object[] r83 = r76.h;
        int r84 = r76.i;
        Arrays.fill(r83, r84 - r121, r84, null);
        int[] r85 = r76.f;
        int[] r86 = r77.f;
        int r87 = r77.g;
        int r88 = r80.b;
        int r89 = r76.g;
        ti.Y(r87 - r88, r89 - r88, r89, r85, r86);
        r76.i -= r121;
        r76.g -= r88;
        r3 = 1;
    L182:
        hg4 r90 = this.G;
        if (r90.k > 0) goto L186;
        oo3.a("Unbalanced begin/end empty");
    L186:
        r90.k--;
        lg4 r91 = this.I;
        int r92 = r91.v;
        r91.j();
        if (this.G.k > 0) goto L235;
        int r93 = (-2) - r92;
        this.I.k();
        this.I.e(true);
        mg1 r94 = this.N;
        boolean r95 = this.O.d.w0();
        ig4 r96 = this.H;
        if (r95 == false) goto L204;
        r13.b();
        r13.d(false);
        o02 r97 = r13.d;
        hg4 r98 = r13.a.G;
        if (r98.c <= 0) goto L202;
        int r124 = r98.i;
        if (r97.a(-2) == r124) goto L202;
        if (r13.c == false) goto L198;
    L200:
        if (r124 <= 0) goto L202;
        mg1 r99 = r98.a(r124);
        r97.c(r124);
        r13.d(false);
        ya3 r100 = r13.b.n;
        r100.x0(aa3.f);
        rr2.R(r100, 0, r99);
        int r101 = 1;
        r13.c = true;
    L203:
        r13.c();
        ya3 r102 = r13.b.n;
        r102.x0(da3.f);
        rr2.S(r102, 0, r94, r101, r96);
        ?? r103 = 0;
    L216:
        this.S = r103;
        if (this.c.o == 0) goto L235;
        Y(r93, r103);
        Z(r93, r3);
        goto L235
    L198:
        if (r13.e == false) goto L200;
        r13.d(false);
        r13.b.n.x0(ba3.f);
        r13.c = true;
    L202:
        r101 = 1;
        goto L203
    L204:
        p71 r104 = this.O;
        r13.b();
        r13.d(false);
        o02 r105 = r13.d;
        hg4 r125 = r13.a.G;
        if (r125.c <= 0) goto L215;
        int r126 = r125.i;
        if (r105.a(-2) == r126) goto L215;
        if (r13.c == false) goto L211;
    L213:
        if (r126 <= 0) goto L215;
        mg1 r106 = r125.a(r126);
        r105.c(r126);
        r13.d(false);
        ya3 r127 = r13.b.n;
        r127.x0(aa3.f);
        rr2.R(r127, 0, r106);
        r13.c = true;
        goto L215
    L211:
        if (r13.e == false) goto L213;
        r13.d(false);
        r13.b.n.x0(ba3.f);
        r13.c = true;
    L215:
        r13.c();
        ya3 r107 = r13.b.n;
        r107.x0(ea3.f);
        int r108 = r107.i - r107.d[r107.e - 1].c;
        Object[] r109 = r107.h;
        r109[r108] = r94;
        r109[r108 + 1] = r96;
        r109[r108 + 2] = r104;
        this.O = new p71();
        r103 = 0;
    L235:
        ArrayList r128 = this.i;
        vg1 r129 = (vg1) r128.remove(r128.size() - 1);
        if (r129 == null) goto L239;
        if (r63 == true) goto L239;
        r129.c++;
    L239:
        this.j = r129;
        this.k = r215.b() + r3;
        this.m = r215.b();
        this.l = r215.b() + r3;
        return;
    L220:
        if (r43 == false) goto L222;
        r13.a();
    L222:
        int r130 = r13.a.G.i;
        o02 r131 = r13.d;
        int r132 = r110;
        if (r131.a(r132) <= r130) goto L227;
        l80.a("Missed recording an endGroup");
    L227:
        if (r131.a(r132) != r130) goto L229;
        r13.d(false);
        r131.b();
        r13.b.n.x0(x93.f);
    L229:
        int r133 = this.G.i;
        if (r3 == d0(r133)) goto L232;
        Z(r133, r3);
    L232:
        if (r43 == false) goto L234;
        r3 = 1;
    L234:
        this.G.e();
        r13.c();
    L150:
        r215 = r1;
        r317 = r12;
        r110 = -1;
    L11:
        long r134 = Long.rotateRight(this.T ^ ((long) r2), 3) ^ ((long) r7);
    L12:
        this.T = Long.rotateRight(r134, 3);
        goto L32
    L14:
        if ((r9 instanceof Enum) == false) goto L17;
        int r135 = ((Enum) r9).ordinal();
    L16:
        r134 = Long.rotateRight(this.T, 3) ^ ((long) r135);
        goto L12
    L17:
        r135 = r9.hashCode();
        goto L16
    L18:
        hg4 r136 = this.G;
        int r137 = r136.i;
        int r138 = r136.i(r137);
        hg4 r139 = this.G;
        Object r140 = r139.p(r139.b, r137);
        hg4 r141 = this.G;
        Object r142 = r141.b(r141.b, r137);
        if (r140 != null) goto L28;
        if (r142 == null) goto L25;
        if (r138 != 207) goto L25;
        if (r142.equals(r5) == true) goto L25;
        this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) r2), 3) ^ ((long) r142.hashCode()), 3);
    L25:
        long r143 = Long.rotateRight(this.T ^ ((long) r2), 3) ^ ((long) r138);
    L26:
        this.T = Long.rotateRight(r143, 3);
        goto L32
    L28:
        if ((r140 instanceof Enum) == false) goto L31;
        int r144 = ((Enum) r140).ordinal();
    L30:
        r143 = Long.rotateRight(this.T, 3) ^ ((long) r144);
        goto L26
    L31:
        r144 = r140.hashCode();
        goto L30
    }

    public final lv3 p() {
        ArrayList r1 = this.E;
        if (r1.isEmpty() == true) goto L5;
        lv3 r2 = (lv3) r1.remove(r1.size() - 1);
    L6:
        if (r2 == null) goto L39;
        r2.b &= -9;
        this.g.r();
        int r5 = this.B;
        p03 r6 = r2.f;
        if (r6 != null) goto L10;
    L28:
        kv3 r3 = null;
    L29:
        k80 r4 = this.M;
        if (r3 == null) goto L32;
        ya3 r7 = r4.b.n;
        r7.x0(w93.f);
        rr2.S(r7, 0, r3, 1, this.h);
    L32:
        int r8 = r2.b;
        if ((r8 & 512) == 0) goto L39;
        r2.b = r8 & (-513);
        ya3 r9 = r4.b.n;
        r9.x0(z93.f);
        rr2.R(r9, 0, r2);
        int r10 = r2.b;
        r2.b = r10 & (-129);
        if ((r10 & 1024) == 0) goto L39;
        r2.b = r10 & (-1153);
        if (this.z != this.G.i) goto L39;
        this.y = false;
        this.z = -1;
        goto L39
    L10:
        if ((r2.b & 16) != 0) goto L28;
        Object[] r11 = r6.b;
        int[] r12 = r6.c;
        long[] r13 = r6.a;
        int r14 = r13.length - 2;
        if (r14 < 0) goto L28;
        int r15 = 0;
    L15:
        long r16 = r13[r15];
        if (((((~r16) << 7) & r16) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r17 = 8 - ((~(r15 - r14)) >>> 31);
        int r18 = 0;
    L18:
        if (r18 >= r17) goto L25;
        if ((r16 & 255) >= 128) goto L24;
        int r19 = (r15 << 3) + r18;
        Object r110 = r11[r19];
        if (r12[r19] == r5) goto L24;
        r3 = new kv3(r2, r5, r6);
    L24:
        r16 = r16 >> 8;
        r18 = r18 + 1;
        goto L18
    L25:
        if (r17 != 8) goto L28;
    L26:
        if (r15 == r14) goto L28;
        r15 = r15 + 1;
    L39:
        if (r2 == null) goto L57;
        int r20 = r2.b;
        if ((r20 & 16) != 0) goto L57;
        if ((r20 & 1) != 0) goto L49;
        if (this.q == false) goto L57;
    L49:
        if (r2.c == null) goto L51;
    L55:
        r2.b &= -5;
        lv3 r21 = r2;
    L58:
        o(false);
        return r21;
    L51:
        if (this.S == false) goto L53;
        lg4 r22 = this.I;
        mg1 r23 = r22.b(r22.v);
    L54:
        r2.c = r23;
        goto L55
    L53:
        hg4 r24 = this.G;
        r23 = r24.a(r24.i);
    L57:
        r21 = null;
        goto L58
    L5:
        r2 = null;
        goto L6
    }

    public final void q() {
        boolean r0 = false;
        o(false);
        this.b.c();
        o(false);
        k80 r1 = this.M;
        if (r1.c == false) goto L5;
        r1.d(false);
        r1.d(false);
        r1.b.n.x0(x93.f);
        r1.c = false;
    L5:
        r1.b();
        if (r1.d.b == 0) goto L10;
        l80.a("Missed recording an endGroup()");
    L10:
        if (this.i.isEmpty() == true) goto L12;
        l80.a("Start/end imbalance");
    L12:
        h();
        this.G.c();
        if (this.x.b() == 0) goto L15;
        r0 = true;
    L15:
        this.w = r0;
    }

    public final void r(boolean r3, vg1 r4) {
        this.i.add(this.j);
        this.j = r4;
        int r5 = this.l;
        o02 r0 = this.n;
        r0.c(r5);
        r0.c(this.m);
        r0.c(this.k);
        if (r3 == false) goto L5;
        this.k = 0;
    L5:
        this.l = 0;
        this.m = 0;
    }

    public final void s() {
        ig4 r0 = new ig4();
        if (this.C == false) goto L6;
        r0.b();
    L6:
        if (this.b.d() == false) goto L8;
        r0.x = new i03();
    L8:
        this.H = r0;
        lg4 r1 = r0.e();
        r1.e(true);
        this.I = r1;
    }

    public final w80 t() {
        sg1 r0 = this.U;
        if (r0 != null) goto L6;
        sg1 r1 = new sg1(this.h);
        this.U = r1;
        return r1;
    L6:
        return r0;
    }

    public final lv3 u() {
        if (this.A != 0) goto L8;
        ArrayList r1 = this.E;
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return (lv3) r1.get(r1.size() - 1);
    L8:
        return null;
    }

    public final x80 v() {
        if (this.b.k() == true) goto L5;
        return null;
    L5:
        return this.Q;
    }

    public final boolean w() {
        if (this.S == false) goto L5;
        return false;
    L5:
        if (this.y == false) goto L7;
        return false;
    L7:
        if (this.w == true) goto L18;
        lv3 r1 = u();
        if (r1 != null) goto L11;
        return false;
    L11:
        if ((r1.b & 8) != 0) goto L20;
        return true;
    L20:
        return false;
    L18:
        return false;
    }

    public final void x(ArrayList r17) {
        rg1 r0 = this;
        w00 r1 = r0.f;
        k80 r6 = r0.M;
        w00 r7 = r6.b;
        r6.b = r1;     // Catch: Throwable -> L17
        r1.n.x0(la3.f);     // Catch: Throwable -> L17
        int r8 = r17.size();     // Catch: Throwable -> L17
        int r10 = 0;
    L4:
        if (r10 >= r8) goto L22;
        kd3 r2 = (kd3) r17.get(r10);     // Catch: Throwable -> L17
        jy2 r3 = (jy2) r2.n;     // Catch: Throwable -> L17
        jy2 r4 = (jy2) r2.o;     // Catch: Throwable -> L17
        r3.getClass();     // Catch: Throwable -> L17
        mg1 r5 = fh0.d(null);     // Catch: Throwable -> L17
        ig4 r9 = kg4.d(null);     // Catch: Throwable -> L17
        int r11 = r9.a(r5);     // Catch: Throwable -> L17
        l02 r12 = new l02();     // Catch: Throwable -> L17
        r6.b();     // Catch: Throwable -> L17
        ya3 r13 = r6.b.n;     // Catch: Throwable -> L17
        r13.x0(u93.f);     // Catch: Throwable -> L17
        rr2.S(r13, 0, r12, 1, r5);     // Catch: Throwable -> L17
        if (r9 == r0.H) goto L9;
    L12:
        hg4 r14 = r9.d();     // Catch: Throwable -> L17
        r14.r(r11);     // Catch: Throwable -> L19
        r6.f = r11;     // Catch: Throwable -> L19
        w00 r15 = new w00();     // Catch: Throwable -> L19
        r0.C(null, null, null, u01.n, new jo(r0, r15, r14, r3));     // Catch: Throwable -> L19
        w00 r16 = r6.b;     // Catch: Throwable -> L19
        r16.getClass();     // Catch: Throwable -> L19
        if (r15.n.w0() == true) goto L16;
        ya3 r18 = r16.n;     // Catch: Throwable -> L19
        r18.x0(q93.f);     // Catch: Throwable -> L19
        rr2.S(r18, 0, r15, 1, r12);     // Catch: Throwable -> L19
    L16:
        r14.c();     // Catch: Throwable -> L17
        r6.b.n.x0(na3.f);     // Catch: Throwable -> L17
        r10 = r10 + 1;     // Catch: Throwable -> L17
        r0 = this;
    L19:
        th = move-exception;
        r14.c();     // Catch: Throwable -> L17
        throw th;     // Catch: Throwable -> L17
    L9:
        if (r0.I.w == true) goto L11;
        l80.a("Check failed");     // Catch: Throwable -> L17
    L11:
        r0.s();     // Catch: Throwable -> L17
        goto L12
    L22:
        r6.b();     // Catch: Throwable -> L17
        r6.b.n.x0(y93.f);     // Catch: Throwable -> L17
        r6.f = 0;     // Catch: Throwable -> L17
        r6.b = r7;
        return;
    L17:
        th = move-exception;
        r6.b = r7;
        throw th;
    }

    public final void y(mf3 r9, Object r10) {
        O(126665345, null, 0, null);
        z();
        c0(r10);
        long r3 = this.T;
        this.T = 126665345;     // Catch: Throwable -> L6
        if (this.S == false) goto L9;
        lg4.z(this.I);     // Catch: Throwable -> L6
    L9:
        if (this.S == false) goto L12;
    L10:
        boolean r0 = false;
    L14:
        if (r0 == false) goto L16;
        F(r9);     // Catch: Throwable -> L6
    L16:
        O(202, l80.c, 0, r9);     // Catch: Throwable -> L6
        this.K = null;     // Catch: Throwable -> L6
        boolean r11 = this.w;     // Catch: Throwable -> L6
        this.w = r0;     // Catch: Throwable -> L6
        vr1.y(this, new r70(-59194059, true, new z(4, r10)));     // Catch: Throwable -> L6
        this.w = r11;     // Catch: Throwable -> L6
        o(false);
        this.K = null;
        this.T = r3;
        o(false);
        return;
    L12:
        if (h12.c(this.G.f(), r9) == true) goto L10;
        r0 = true;
    L6:
        th = move-exception;
        si0.T(th, new ng1(2, this));     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        o(false);
        this.K = null;
        this.T = r3;
        o(false);
        throw th;
    }

    public final Object z() {
        boolean r0 = this.S;
        i80 r1 = j80.a;
        if (r0 == true) goto L5;
        Object r2 = this.G.m();
        if (this.y == true) goto L11;
    L13:
        return r2;
    L11:
        if ((r2 instanceof a24) == true) goto L13;
    L12:
        return r1;
    L5:
        if (this.r == false) goto L12;
        l80.a("A call to createNode(), emitNode() or useNode() expected");
        return r1;
    }
}
