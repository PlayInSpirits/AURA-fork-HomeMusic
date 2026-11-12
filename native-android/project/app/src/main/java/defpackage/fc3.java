package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc3 {
    public final om1 a;
    public final i03 b;
    public final j03 c;
    public final g03 d;
    public final i03 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final q82 n;
    public final qp4 o;

    public fc3(om1 r1, q82 r2, vc3 r3) {
        this.a = r1;
        i03 r4 = f02.a;
        this.b = new i03();
        this.c = new j03();
        int r5 = a02.a;
        this.d = new g03();
        this.e = new i03();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = r2;
        this.o = new qp4(r3);
    }

    public final int a(qp4 r9, int r10, boolean r11) {
        i03 r0 = this.e;
        if (r0.a(r10) == false) goto L6;
        Object r8 = r0.b(r10);
        r8.getClass();
        return ((zx) r8).b;
    L6:
        i03 r1 = this.b;
        int r2 = 0;
        if (r1.a(r10) == false) goto L14;
        if (r11 == false) goto L33;
        List r12 = (List) r1.b(r10);
        if (r12 == null) goto L39;
        int r13 = r12.size();
    L12:
        if (r2 >= r13) goto L42;
        ((p82) r12.get(r2)).a();
        r2 = r2 + 1;
        goto L12
    L42:
        return -1;
    L39:
        return -1;
    L33:
        return -1;
    L14:
        sx r3 = new sx(this, r9, 0);
        long r4 = r9.e().u;
        q82 r14 = (q82) r9.c;
        if (r14 == null) goto L35;
        o r5 = new o(20, r3, r9);
        ll r15 = r14.c;
        if (r15 == null) goto L25;
        rm3 r16 = r14.b;
        wp3 r6 = (wp3) r15.r;
        boolean r7 = r6 instanceof sc;
        vp3 r17 = new vp3(r15, r10, r16, r5);
        r17.d = new nc0(r4);
        if (r7 == false) goto L23;
        sc r18 = (sc) r6;
        r18.o.add(new gq3(1, r17));
        if (r18.p == true) goto L24;
        r18.p = true;
        r18.n.post(r18);
    L24:
        si0.R("compose:lazy:schedule_prefetch:index", r10);
        Object r19 = r17;
    L26:
        r1.i(r10, gb.O(r19));
        if (r11 == false) goto L40;
        List r20 = (List) r1.b(r10);
        if (r20 == null) goto L41;
        int r21 = r20.size();
    L31:
        if (r2 >= r21) goto L43;
        ((p82) r20.get(r2)).a();
        r2 = r2 + 1;
        goto L31
    L43:
        return -1;
    L41:
        return -1;
    L40:
        return -1;
    L23:
        r6.a(r17);
        goto L24
    L25:
        r19 = kx0.a;
        goto L26
    L35:
        h12.Q("state");
        throw null;
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
    public final void b(qp4 r8, int r9, int r10) {
        i03 r0 = this.e;
        zx r1 = (zx) r0.b(r9);
        pa r2 = zx.c;
        if (r1 == null) goto L5;
        r1.b = r10;
        r1.a = r2;
    L6:
        r0.i(r9, r1);
        if (r9 <= this.i) goto L10;
        this.i = r9;
        this.k -= r10;
    L13:
        if (Math.signum(this.f) > 0.0f) goto L18;
        if (this.k <= 0) goto L22;
        int r11 = this.i + 1;
    L23:
        if (r11 <= 0) goto L43;
        r8.getClass();
        if (r11 == (-1)) goto L43;
        if (r11 >= this.m) goto L43;
        sx r12 = new sx(this, r8, 1);
        long r3 = r8.e().u;
        q82 r4 = (q82) r8.c;
        if (r4 == null) goto L41;
        o r5 = new o(20, r12, r8);
        ll r13 = r4.c;
        if (r13 == null) goto L39;
        rm3 r14 = r4.b;
        wp3 r6 = (wp3) r13.r;
        boolean r7 = r6 instanceof sc;
        vp3 r15 = new vp3(r13, r11, r14, r5);
        r15.d = new nc0(r3);
        if (r7 == false) goto L37;
        sc r16 = (sc) r6;
        r16.o.add(new gq3(1, r15));
        if (r16.p == true) goto L38;
        r16.p = true;
        r16.n.post(r16);
    L38:
        si0.R("compose:lazy:schedule_prefetch:index", r11);
        Object r17 = r15;
    L40:
        this.b.i(r11, gb.O(r17));
        goto L43
    L37:
        r6.a(r15);
        goto L38
    L39:
        r17 = kx0.a;
        goto L40
    L41:
        h12.Q("state");
        throw null;
    L43:
        g();
        return;
    L22:
        r11 = -1;
        goto L23
    L18:
        if (Math.signum(this.f) <= 0.0f) goto L22;
        if (this.j <= 0) goto L22;
        r11 = this.h - 1;
        goto L23
    L10:
        if (r9 >= this.h) goto L13;
        this.h = r9;
        this.j -= r10;
        goto L13
    L5:
        r1 = new zx();
        r1.a = r2;
        r1.b = r10;
        goto L6
    }

    public final void c(qp4 r6, int r7, int r8, int r9, int r10, int r11, float r12, boolean r13) {
        if (Math.signum(r12) != Math.signum(this.f)) goto L5;
        boolean r0 = true;
    L7:
        if (r13 == false) goto L35;
        if (r0 == true) goto L10;
    L16:
        this.k = r9 - r10;
        this.i = r8;
    L18:
        if (this.k <= 0) goto L70;
        int r14 = this.i;
        r6.getClass();
        if (r14 == (-1)) goto L71;
        int r15 = this.i;
        if (r15 >= (this.m - 1)) goto L72;
        if ((r15 + 1) == (r8 + 1)) goto L26;
    L31:
        boolean r16 = false;
    L32:
        int r17 = a(r6, this.i + 1, r16);
        if (r17 == (-1)) goto L60;
        this.i++;
        this.k -= r17;
        goto L18
    L60:
        return;
    L26:
        if (r12 == 0.0f) goto L31;
        if (Math.abs(r12) < r10) goto L31;
        r16 = true;
        goto L32
    L72:
        return;
    L71:
        return;
    L70:
        return;
    L10:
        if (this.l == true) goto L16;
        int r18 = ji2.L(Math.abs(r12)) + this.k;
        int r19 = r9 - r10;
        if (r18 <= r19) goto L15;
        r18 = r19;
    L15:
        this.k = r18;
        goto L18
    L35:
        if (r0 == true) goto L37;
    L43:
        this.j = r9 - r11;
        this.h = r7;
    L45:
        if (this.j <= 0) goto L73;
        int r20 = this.h;
        if (r20 <= 0) goto L74;
        if ((r20 - 1) == (r7 - 1)) goto L51;
    L56:
        boolean r21 = false;
    L57:
        int r22 = a(r6, this.h - 1, r21);
        if (r22 == (-1)) goto L75;
        this.h--;
        this.j -= r22;
        goto L45
    L75:
        return;
    L51:
        if (r12 == 0.0f) goto L56;
        if (Math.abs(r12) < r11) goto L56;
        r21 = true;
        goto L57
    L74:
        return;
    L73:
        return;
    L37:
        if (this.l == true) goto L43;
        int r110 = ji2.L(Math.abs(r12)) + this.j;
        int r23 = r9 - r11;
        if (r110 <= r23) goto L42;
        r110 = r23;
    L42:
        this.j = r110;
        goto L45
    L5:
        r0 = false;
        goto L7
    }

    public final void d(float r11, qc3 r12) {
        qp4 r1 = this.o;
        r1.b = r12;
        r1.c = this.n;
        float r7 = -r11;
        g();
        if (r1.c() == false) goto L25;
        te5.x(r1.e());
        r1.e();
        this.m = r1.h();
        int r13 = r1.b();
        int r3 = r1.d();
        int r4 = r1.h();
        int r5 = r1.g();
        int r6 = r1.f();
        i03 r9 = this.e;
        if (r7 > 0.0f) goto L15;
        this.j = 0 - r5;
        this.h = r13;
    L8:
        if (this.j <= 0) goto L14;
        int r14 = this.h;
        if (r14 <= 0) goto L14;
        if (r9.a(r14 - 1) == false) goto L14;
        Object r15 = r9.b(this.h - 1);
        r15.getClass();
        int r16 = ((zx) r15).b;
        this.h--;
        this.j -= r16;
    L14:
        e(0, this.h - 1);
        goto L25
    L15:
        this.k = 0 - r6;
        this.i = r3;
    L17:
        if (this.k <= 0) goto L23;
        int r17 = this.i;
        if (r17 >= (r4 - 1)) goto L23;
        if (r9.a(r17 + 1) == false) goto L23;
        Object r18 = r9.b(this.i + 1);
        r18.getClass();
        int r19 = ((zx) r18).b;
        this.i++;
        this.k -= r19;
    L23:
        e(this.i + 1, r4 - 1);
    L25:
        if (r1.c() == false) goto L36;
        te5.x(r1.e());
        if (r1.e().t == null) goto L29;
        int r8 = ((ad3) this.a.o).o;
        boolean r110 = false;
    L30:
        int r2 = r1.b();
        int r10 = r1.d();
        int r20 = r1.g();
        int r21 = r1.f();
        if (r7 > 0.0f) goto L34;
        boolean r22 = true;
    L33:
        fc3 r0 = this;
        r0.c(r1, r2, r10, r8, r21, r20, r7, r22);
    L37:
        r0.f = r7;
        r0.g();
        return;
    L34:
        r22 = r110;
        goto L33
    L29:
        r110 = false;
        r8 = 0;
        goto L30
    L36:
        r0 = this;
        goto L37
    }

    public final void e(int r29, int r30) {
        j03 r3 = this.c;
        r3.b();
        i03 r4 = this.b;
        int[] r5 = r4.b;
        long[] r6 = r4.a;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L19;
        int r8 = 0;
        long r17 = 128;
        long r19 = 255;
    L5:
        long r10 = r6[r8];
        char r9 = 7;
        long r21 = -9187201950435737472L;
        if (((((~r10) << 7) & r10) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L17;
        int r12 = 8 - ((~(r8 - r7)) >>> 31);
        int r13 = 0;
    L8:
        if (r13 >= r12) goto L16;
        if ((r10 & 255) >= 128) goto L15;
        int r14 = r5[(r8 << 3) + r13];
        if (r29 > r14) goto L15;
        if (r14 > r30) goto L15;
        r3.a(r14);
    L15:
        r10 = r10 >> 8;
        r13 = r13 + 1;
        goto L8
    L16:
        if (r12 == 8) goto L17;
    L20:
        g03 r11 = this.d;
        int[] r15 = r11.b;
        long[] r16 = r11.a;
        int r18 = r16.length - 2;
        if (r18 < 0) goto L41;
        int r110 = 0;
    L23:
        long r111 = r16[r110];
        if (((((~r111) << r9) & r111) & r21) == r21) goto L38;
        int r112 = 8 - ((~(r110 - r18)) >>> 31);
        int r113 = 0;
    L26:
        if (r113 >= r112) goto L35;
        if ((r111 & r19) >= r17) goto L33;
        char r24 = r9;
        int r20 = r15[(r110 << 3) + r113];
        if (r29 > r20) goto L34;
        if (r20 > r30) goto L34;
        r3.a(r20);
    L34:
        r111 = r111 >> 8;
        r113 = r113 + 1;
        r9 = r24;
        goto L26
    L33:
        r24 = r9;
        goto L34
    L35:
        char r25 = r9;
        if (r112 != 8) goto L42;
    L39:
        if (r110 == r18) goto L42;
        r110 = r110 + 1;
        r9 = r25;
    L42:
        i03 r0 = this.e;
        int[] r22 = r0.b;
        long[] r23 = r0.a;
        int r26 = r23.length - 2;
        if (r26 < 0) goto L59;
        int r27 = 0;
    L45:
        long r114 = r23[r27];
        if (((((~r114) << r25) & r114) & r21) == r21) goto L57;
        int r115 = 8 - ((~(r27 - r26)) >>> 31);
        int r116 = 0;
    L48:
        if (r116 >= r115) goto L56;
        if ((r114 & r19) >= r17) goto L55;
        int r117 = r22[(r27 << 3) + r116];
        if (r29 > r117) goto L55;
        if (r117 > r30) goto L55;
        r3.a(r117);
    L55:
        r114 = r114 >> 8;
        r116 = r116 + 1;
        goto L48
    L56:
        if (r115 != 8) goto L59;
    L57:
        if (r27 == r26) goto L59;
        r27 = r27 + 1;
    L59:
        int[] r1 = r3.b;
        long[] r2 = r3.a;
        int r28 = r2.length - 2;
        if (r28 < 0) goto L86;
        int r31 = 0;
    L62:
        long r32 = r2[r31];
        if (((((~r32) << r25) & r32) & r21) == r21) goto L83;
        int r33 = 8 - ((~(r31 - r28)) >>> 31);
        int r118 = 0;
    L65:
        if (r118 >= r33) goto L80;
        if ((r32 & r19) >= r17) goto L78;
        int r119 = r1[(r31 << 3) + r118];
        List r120 = (List) r4.g(r119);
        if (r120 == null) goto L73;
        int r121 = r120.size();
        int r122 = 0;
    L71:
        if (r122 >= r121) goto L73;
        ((p82) r120.get(r122)).cancel();
        r122 = r122 + 1;
    L73:
        int r123 = r11.c(r119);
        if (r123 < 0) goto L77;
        r11.e--;
        long[] r124 = r11.a;
        int r125 = r11.d;
        int r210 = r123 >> 3;
        int r211 = (r123 & 7) << 3;
        long r34 = (r124[r210] & (~(r19 << r211))) | (254 << r211);
        r124[r210] = r34;
        r124[(((r123 - 7) & r125) + (r125 & 7)) >> 3] = r34;
    L77:
        r0.g(r119);
    L79:
        r32 = r32 >> 8;
        r118 = r118 + 1;
        r1 = r1;
        r2 = r2;
        goto L65
    L78:
        r1 = r1;
        r2 = r2;
        goto L79
    L80:
        int[] r212 = r1;
        long[] r213 = r2;
        if (r33 != 8) goto L114;
    L84:
        if (r31 == r28) goto L115;
        r31 = r31 + 1;
        r1 = r212;
        r2 = r213;
        goto L62
    L115:
        return;
    L114:
        return;
    L83:
        r212 = r1;
        r213 = r2;
        goto L84
    L86:
        return;
    L38:
        r25 = r9;
        goto L39
    L41:
        r25 = r9;
    L17:
        if (r8 == r7) goto L20;
        r8 = r8 + 1;
        goto L5
    L19:
        r9 = 7;
        r17 = 128;
        r19 = 255;
        r21 = -9187201950435737472L;
        goto L20
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        i03 r14 = this.b;
        long[] r1 = r14.a;
        int r2 = r1.length - 2;
        if (r2 < 0) goto L19;
        int r3 = 0;
    L5:
        long r4 = r1[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L17;
        int r6 = 8 - ((~(r3 - r2)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L16;
        if ((255 & r4) >= 128) goto L15;
        int r9 = (r3 << 3) + r8;
        int r10 = r14.b[r9];
        List r11 = (List) r14.c[r9];
        int r12 = r11.size();
        int r13 = 0;
    L12:
        if (r13 >= r12) goto L14;
        ((p82) r11.get(r13)).cancel();
        r13 = r13 + 1;
        goto L12
    L14:
        r14.h(r9);
    L15:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L16:
        if (r6 == 8) goto L17;
        return;
    L17:
        if (r3 == r2) goto L27;
        r3 = r3 + 1;
        goto L5
    L27:
        return;
    }

    public final void g() {
        si0.R("prefetchWindowStartExtraSpace", this.j);
        si0.R("prefetchWindowEndExtraSpace", this.k);
        si0.R("prefetchWindowStartIndex", this.h);
        si0.R("prefetchWindowEndIndex", this.i);
    }
}
