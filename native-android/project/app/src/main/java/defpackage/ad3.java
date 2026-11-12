package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ad3 implements a74 {
    public final b13 A;
    public final b13 B;
    public final zd3 C;
    public final zd3 D;
    public final zd3 E;
    public final zd3 F;
    public boolean a;
    public qc3 b;
    public final zd3 c;
    public final nq d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ml3 k;
    public final boolean l;
    public final zd3 m;
    public oo0 n;
    public int o;
    public final rm2 p;
    public final wd3 q;
    public final wd3 r;
    public final dp0 s;
    public final q82 t;
    public final fc3 u;
    public final hg3 v;
    public final io w;
    public final zd3 x;
    public final yc3 y;
    public final n82 z;

    public ad3(int r7, float r8) {
        double r0 = r8;
        if ((-0.5d) <= r0) goto L5;
    L7:
        fz1.a("currentPageOffsetFraction " + r8 + " is not within the range -0.5 to 0.5");
    L8:
        this.c = uc5.B(new g83(0));
        this.d = new nq(r7, r8, this);
        this.e = r7;
        this.g = Long.MAX_VALUE;
        int r1 = 0;
        this.k = new ml3(new uc3(this, r1));
        int r9 = 1;
        this.l = true;
        qc3 r2 = ed3.b;
        rv2 r3 = rv2.s;
        this.m = new zd3(r2, r3);
        this.n = ed3.a;
        this.p = new rm2(4);
        this.q = new wd3(-1);
        this.r = new wd3(r7);
        rv2 r10 = rv2.D;
        z05 r4 = ph4.a;
        new fl(0);
        new cp0(jh4.j().g());
        this.s = new dp0(new vc3(this, r1), r10);
        q82 r11 = new q82(new uc3(this, r9));
        this.t = r11;
        this.u = new fc3(new om1(15, this), r11, new vc3(this, r9));
        this.v = new hg3(25);
        this.w = new io();
        this.x = uc5.B(null);
        this.y = new yc3(this);
        qc0.b(0, 0, 15);
        this.z = new n82();
        j15 r12 = j15.a;
        this.A = new zd3(r12, r3);
        this.B = new zd3(r12, r3);
        Boolean r13 = Boolean.FALSE;
        this.C = uc5.B(r13);
        this.D = uc5.B(r13);
        this.E = uc5.B(r13);
        this.F = uc5.B(r13);
        return;
    L5:
        if (r0 > 0.5d) goto L7;
        goto L7
    }

    public static /* synthetic */ Object g(lm0 r0, int r1, yy4 r2, ep4 r3, int r4) {
        wd r5 = r2;
        if ((r4 & 4) == 0) goto L6;
        r5 = au0.S(7);
    L6:
        return r0.f(r1, r5, r3);
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
    public static Object s(ad3 r6, h13 r7, wf1 r8, wd0 r9) {
        if ((r9 instanceof zc3) == false) goto L7;
        zc3 r0 = (zc3) r9;
        int r1 = r0.s;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.s = r1 - Integer.MIN_VALUE;
    L8:
        Object r10 = r0.q;
        int r2 = r0.s;
        Object r5 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        r6 = r0.n;
        kb4.X(r10);
    L25:
        r6.q.h(-1);
        return j15.a;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        wf1 r11 = (wf1) r0.p;
        r7 = r0.o;
        r6 = r0.n;
        kb4.X(r10);
        wf1 r12 = r11;
    L20:
        if (r6.k.a() == true) goto L22;
        int r13 = r6.k();
        r6.r.h(r13);
    L22:
        ml3 r14 = r6.k;
        r0.n = r6;
        r0.o = null;
        r0.p = null;
        r0.s = 2;
        if (r14.e(r7, r12, r0) != r5) goto L25;
    L24:
        return r5;
    L16:
        kb4.X(r10);
        r0.n = r6;
        r0.o = r7;
        r0.p = (ep4) r8;
        r0.s = 1;
        r12 = r8;
        if (r6.i(r0) != r5) goto L20;
    L7:
        r0 = new zc3(r6, r9);
        goto L8
    }

    @Override // defpackage.a74
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.a74
    public final boolean b() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public final float d(float r1) {
        return this.k.d(r1);
    }

    @Override // defpackage.a74
    public final Object e(h13 r1, wf1 r2, wd0 r3) {
        return s(this, r1, r2, r3);
    }

    public final Object f(int r12, wd r13, wd0 r14) {
        if ((r14 instanceof wc3) == false) goto L8;
        wc3 r3 = (wc3) r14;
        int r4 = r3.r;
        if ((r4 & Integer.MIN_VALUE) == 0) goto L8;
        r3.r = r4 - Integer.MIN_VALUE;
    L7:
        wc3 r6 = r3;
        Object r2 = r6.p;
        int r5 = r6.r;
        j15 r8 = j15.a;
        Object r10 = xe0.n;
        if (r5 == 0) goto L18;
        if (r5 == 1) goto L17;
        if (r5 != 2) goto L15;
        kb4.X(r2);
        return r8;
    L15:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L17:
        int r0 = r6.n;
        wd r7 = r6.o;
        kb4.X(r2);
        wd r9 = r7;
    L30:
        xc3 r1 = new xc3(this, j(r0), p() * 0.0f, r9, null);
        r6.o = null;
        r6.r = 2;
        if (s(this, h13.n, r1, r6) != r10) goto L33;
    L32:
        return r10;
    L33:
        return r8;
    L18:
        kb4.X(r2);
        if (r12 != k()) goto L24;
        if (l() == 0.0f) goto L33;
    L24:
        if (n() == 0) goto L33;
        r6.o = r13;
        r6.n = r12;
        r6.r = 1;
        if (i(r6) == r10) goto L32;
        r0 = r12;
        r9 = r13;
    L8:
        r3 = new wc3(this, r14);
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v30 */
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
    public final void h(qc3 r20, boolean r21, boolean r22) {
        List r2 = r20.a;
        int r3 = r20.l;
        xi2 r4 = r20.i;
        xi2 r5 = r20.j;
        float r6 = r20.k;
        this.t.d = r2.size();
        this.o = r20.b + r20.c;
        if (r21 == false) goto L5;
    L8:
        boolean r7 = true;
        if (r21 == false) goto L11;
        this.a = true;
    L11:
        fc3 r8 = this.u;
        boolean r9 = this.l;
        if1 r17 = null;
        nq r11 = this.d;
        if (r22 == false) goto L15;
        ((vd3) r11.q).h(r6);
    L14:
        boolean r18 = true;
        boolean r10 = r9;
        ?? r12 = 0;
    L122:
        this.m.setValue(r20);
        this.C.setValue(Boolean.valueOf(r20.m));
        if (r4 == null) goto L125;
        ?? r13 = r4.a;
    L126:
        if (r13 != 0) goto L130;
        if (r3 != 0) goto L130;
        ?? r14 = r12;
    L131:
        this.D.setValue(Boolean.valueOf(r14));
        if (r4 == null) goto L134;
        this.e = r4.a;
    L134:
        this.f = r3;
        ch4 r15 = ya4.t();
        if (r15 == null) goto L137;
        r17 = r15.e();
    L137:
        if1 r16 = r17;
        ch4 r19 = ya4.z(r15);
        if (r10 == true) goto L172;
    L139:
        ya4.H(r15, r19, r16);
        this.g = ed3.a(r20, n());
        n();
        if (r20.e != hb3.o) goto L164;
        long r23 = r20.i() >> 32;
    L163:
        int r24 = (int) r23;
        r20.n.getClass();
        long r1 = gb.m(r12, r12, r24);
        long r25 = this.g;
        if (r1 <= r25) goto L168;
        r1 = r25;
    L168:
        this.h = r1;
        return;
    L164:
        r23 = r20.i() & 4294967295L;
        goto L163
    L172:
    L158:
        th = move-exception;
        ya4.H(r15, r19, r16);
        throw th;
    L141:
        if (r20.h >= n()) goto L139;
        if (Math.abs(this.j) <= 0.5f) goto L139;
        float r26 = this.j;     // Catch: Throwable -> L158
        if (m().e != hb3.n) goto L152;
        if (Math.signum(r26) != Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) goto L155;
    L156:
        r8.d(this.j, r20);     // Catch: Throwable -> L158
    L155:
        if (r() == false) goto L139;
    L152:
        if (Math.signum(r26) != Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) goto L155;
    L130:
        r14 = r18;
        goto L131
    L125:
        r13 = r12;
        goto L126
    L15:
        r11.getClass();
        if (r5 == null) goto L18;
        Object r110 = r5.d;
    L19:
        r11.r = r110;
        if (r11.n == false) goto L22;
    L23:
        r11.n = true;
        if (r5 == null) goto L26;
        int r27 = r5.a;
    L27:
        ((wd3) r11.p).h(r27);
        g82 r28 = (g82) r11.s;
        if (r27 == r28.o) goto L30;
        r28.o = r27;
        int r29 = (r27 / 30) * 30;
        r28.n.setValue(gb.g0(Math.max(r29 - 100, 0), r29 + 130));
    L30:
        ((vd3) r11.q).h(r6);
    L31:
        if (r9 == false) goto L14;
        r10 = r9;
        qp4 r30 = r8.o;
        i03 r31 = r8.e;
        r30.b = r20;
        r30.c = r8.n;
        om1 r32 = r8.a;
        int r111 = r8.g;
        float r112 = 0.0f;
        int r113 = -1;
        if (r111 != (-1)) goto L35;
    L55:
        r8.m = r30.h();
        if (r30.c() == false) goto L120;
        int r114 = r30.e().r.size() + (r30.e().a.size() + r30.e().q.size());
        int r115 = 0;
    L58:
        if (r115 >= r114) goto L104;
        int r116 = r30.e().q.size();
        int r117 = r30.e().a.size();
        if (r115 >= r116) goto L62;
        int r118 = ((xi2) r30.e().q.get(r115)).a;
        float r210 = r112;
    L71:
        int r119 = r30.e().q.size();
        int r120 = r30.e().a.size();
        if (r115 >= r119) goto L74;
        Object r121 = ((xi2) r30.e().q.get(r115)).d;
    L82:
        int r33 = r30.e().b;
        if (r118 != r113) goto L85;
        boolean r122 = true;
    L103:
        r115 = r115 + 1;
        r112 = r210;
        r7 = r122;
        r113 = -1;
        goto L58
    L85:
        if (r31.a(r118) == false) goto L91;
        Object r123 = r31.b(r118);
        r123.getClass();
        int r124 = ((zx) r123).b;
        Object r125 = r31.b(r118);
        r125.getClass();
        Object r126 = ((zx) r125).a;
        if (r124 == r33) goto L89;
    L90:
        r122 = true;
        r8.l = true;
    L93:
        zx r127 = (zx) r31.b(r118);
        if (r127 == null) goto L96;
        r127.b = r33;
        r127.a = r121;
    L97:
        r31.i(r118, r127);
        r8.h = Math.min(r8.h, r118);
        r8.i = Math.max(r8.i, r118);
        List r34 = (List) r8.b.g(r118);
        if (r34 == null) goto L103;
        int r128 = r34.size();
        int r129 = 0;
    L100:
        if (r129 >= r128) goto L103;
        ((p82) r34.get(r129)).cancel();
        r129 = r129 + 1;
        goto L100
    L96:
        r127 = new zx();
        r127.a = r121;
        r127.b = r33;
        goto L97
    L89:
        if (h12.c(r126, r121) == false) goto L90;
    L91:
        r122 = true;
        goto L93
    L74:
        if (r115 < r119) goto L79;
        if (r115 >= (r119 + r120)) goto L79;
        r121 = ((xi2) r30.e().a.get(r115 - r119)).d;
    L79:
        if (r115 < (r119 + r120)) goto L81;
        r121 = ((xi2) r30.e().r.get((r115 - r119) - r120)).d;
        goto L82
    L81:
        r121 = zx.c;
        goto L82
    L62:
        r210 = r112;
        if (r115 < r116) goto L68;
        if (r115 >= (r116 + r117)) goto L68;
        r118 = ((xi2) r30.e().a.get(r115 - r116)).a;
    L68:
        if (r115 < (r116 + r117)) goto L70;
        r118 = ((xi2) r30.e().r.get((r115 - r116) - r117)).a;
        goto L71
    L70:
        r118 = r113;
        goto L71
    L104:
        r18 = r7;
        float r211 = r112;
        if (r8.l == true) goto L107;
        r10 = r10;
        r18 = r18;
        boolean r35 = false;
    L121:
        r8.g = r30.h();
        r12 = r35;
        goto L122
    L107:
        if (r8.f > r211) goto L109;
        boolean r130 = r18;
    L111:
        if (r30.c() == false) goto L117;
        te5.x(r30.e());
        if (r30.e().t == null) goto L115;
        int r131 = ((ad3) r32.o).o;
    L116:
        boolean r36 = false;
        r8.c(r30, r30.b(), r30.d(), r131, r30.f(), r30.g(), 0.0f, r130);
    L118:
        r8.l = r36;
        r35 = r36;
        goto L121
    L115:
        r131 = 0;
        goto L116
    L117:
        r36 = false;
        goto L118
    L109:
        r130 = false;
        goto L111
    L120:
        r10 = r10;
        r18 = true;
        r35 = false;
        r8.f();
        goto L121
    L35:
        if (r111 == r30.h()) goto L55;
        r8.l = true;
        if (r30.c() == false) goto L55;
        int r132 = r8.h;
        if (r132 >= 0) goto L41;
        r132 = 0;
    L41:
        r8.h = r132;
        if (r30.e().a.isEmpty() == false) goto L44;
        int r133 = -1;
    L45:
        if (r133 == (-1)) goto L52;
        int r134 = r8.i;
        if (r134 > r133) goto L50;
        r133 = r134;
    L50:
        r8.i = r133;
    L52:
        if (r8.f > 0.0f) goto L54;
        r8.e(r30.d(), r8.m - 1);
        goto L55
    L54:
        r8.e(0, r30.b());
        goto L55
    L44:
        r133 = r30.h() - 1;
        goto L45
    L26:
        r27 = 0;
        goto L27
    L22:
        if (r2.isEmpty() == true) goto L31;
    L18:
        r110 = null;
        goto L19
    L5:
        if (this.a == false) goto L8;
        this.b = r20;
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
    public final Object i(wd0 r12) {
        Object r0 = this.m.getValue();
        qc3 r1 = ed3.b;
        j15 r2 = j15.a;
        if (r0 != r1) goto L29;
        io r11 = this.w;
        x60 r3 = r11.b;
        if (r3 != null) goto L23;
        int r4 = 1;
        r3 = new x60(true);
        r3.N(null);
        r11.b = r3;
        ho r13 = r11.a;
        if (r13 == null) goto L23;
        if (r13.A == false) goto L23;
        o r5 = new o(r4, r13, r13.C);
        c72 r6 = j51.O(r13);
        int r7 = r6.o;
        yv3 r8 = ((ra) h12.L(r6)).getRectManager();
        pt4 r9 = r8.d;
        r9.getClass();
        i03 r10 = r9.a;
        ot4 r14 = new ot4(r9, r7, r13, r5);
        Object r15 = r10.b(r7);
        if (r15 != null) goto L13;
        r10.i(r7, r14);
        r15 = r14;
    L13:
        ot4 r16 = (ot4) r15;
        if (r16 == r14) goto L19;
    L15:
        ot4 r17 = r16.d;
        if (r17 == null) goto L18;
        r16 = r17;
        goto L15
    L18:
        r16.d = r14;
    L19:
        c72 r18 = j51.O(r13.n);
        if (yv3.d(r18) == false) goto L22;
        ue1 r19 = r8.c;
        int r20 = r8.e(r18);
        long[] r21 = (long[]) r19.p;
        int r22 = r20 + 2;
        r21[r22] = (r21[r22] & 8070450532247928831L) | (-8070450532247928832L);
    L22:
        r8.f = true;
        r8.k();
        r13.B = r14;
    L23:
        Object r110 = r3.j0(r12);
        xe0 r111 = xe0.n;
        if (r110 == r111) goto L27;
        r110 = r2;
    L27:
        if (r110 != r111) goto L29;
        return r110;
    L29:
        return r2;
    }

    public final int j(int r3) {
        if (n() > 0) goto L5;
        return 0;
    L5:
        return gb.m(r3, 0, n() - 1);
    }

    public final int k() {
        return ((wd3) this.d.p).g();
    }

    public final float l() {
        return ((vd3) this.d.q).g();
    }

    public final qc3 m() {
        return (qc3) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((qc3) this.m.getValue()).b;
    }

    public final int p() {
        int r0 = o();
        return ((qc3) this.m.getValue()).c + r0;
    }

    public final long q() {
        return ((g83) this.c.getValue()).a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0) goto L5;
        return false;
    L5:
        if (((int) Float.intBitsToFloat((int) (q() & 4294967295L))) != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void t(float r6, int r7, boolean r8) {
        nq r0 = this.d;
        wd3 r1 = (wd3) r0.p;
        vd3 r2 = (vd3) r0.q;
        if (r1.g() == r7) goto L5;
    L7:
        this.u.f();
    L8:
        ((wd3) r0.p).h(r7);
        g82 r3 = (g82) r0.s;
        if (r7 == r3.o) goto L11;
        r3.o = r7;
        int r9 = (r7 / 30) * 30;
        r3.n.setValue(gb.g0(Math.max(r9 - 100, 0), r9 + 130));
    L11:
        r2.h(r6);
        r0.r = null;
        if (r8 == false) goto L17;
        c72 r5 = (c72) this.x.getValue();
        if (r5 == null) goto L19;
        r5.l();
        return;
    L19:
        return;
    L17:
        this.B.setValue(j15.a);
        return;
    L5:
        if (r2.g() != r6) goto L7;
        goto L7
    }
}
