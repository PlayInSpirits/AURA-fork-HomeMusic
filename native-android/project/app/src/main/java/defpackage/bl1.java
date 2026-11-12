package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 implements mz0 {
    public final jv3 a;
    public final boolean b;
    public final boolean c;
    public final n41 d;
    public final n41 e;
    public final n41 f;
    public long g;
    public final boolean[] h;
    public String i;
    public wv4 j;
    public al1 k;
    public boolean l;
    public long m;
    public boolean n;
    public final be3 o;

    public bl1(jv3 r1, boolean r2, boolean r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.h = new boolean[3];
        this.d = new n41(7);
        this.e = new n41(8);
        this.f = new n41(6);
        this.m = -9223372036854775807L;
        this.o = new be3();
    }

    @Override // defpackage.mz0
    public final void a(be3 r14) {
        this.j.getClass();
        String r0 = f35.a;
        int r1 = r14.b;
        int r2 = r14.c;
        byte[] r3 = r14.a;
        this.g += (long) r14.a();
        this.j.e(r14.a(), r14);
    L3:
        int r15 = uc5.o(r3, r1, r2, this.h);
        if (r15 == r2) goto L5;
        int r5 = r3[r15 + 3] & 31;
        if (r15 > 0) goto L10;
    L12:
        int r4 = 3;
    L13:
        int r6 = r15 - r1;
        if (r6 <= 0) goto L16;
        this.g(r3, r1, r15);
    L16:
        int r7 = r2 - r15;
        long r9 = this.g - ((long) r7);
        if (r6 >= 0) goto L20;
        int r8 = -r6;
    L21:
        bl1 r10 = this;
        r10.b(r7, r8, r9, this.m);
        r10.h(r5, r9, r10.m);
        r1 = r15 + r4;
        bl1 this = r10;
        goto L3
    L20:
        r8 = 0;
        goto L21
    L10:
        if (r3[r15 - 1] != 0) goto L12;
        r15 = r15 - 1;
        r4 = 4;
        goto L13
    L5:
        this.g(r3, r1, r2);
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
    public final void b(int r23, int r24, long r25, long r27) {
        c6 r2 = (c6) this.a.p;
        if (this.l == true) goto L5;
    L6:
        n41 r3 = this.d;
        r3.d(r24);
        n41 r6 = this.e;
        r6.d(r24);
        boolean r7 = this.l;
        boolean r8 = r3.e;
        if (r7 == true) goto L12;
        if (r8 == true) goto L10;
    L17:
        n41 r4 = this.f;
        if (r4.d(r24) == false) goto L20;
        int r1 = uc5.b0(r4.c, (byte[]) r4.f);
        byte[] r5 = (byte[]) r4.f;
        be3 r9 = this.o;
        r9.L(r1, r5);
        r9.N(4);
        r2.a(r27, r9);
    L20:
        al1 r10 = this.k;
        boolean r11 = this.l;
        if (r10.i != 9) goto L23;
    L65:
        if (r11 == true) goto L67;
    L74:
        r10.p = r10.j;
        r10.q = r10.l;
        r10.r = false;
        r10.o = true;
    L76:
        if (r10.b == false) goto L85;
        zk1 r12 = r10.n;
        if (r12.b == false) goto L84;
        int r13 = r12.e;
        if (r13 != 7) goto L82;
    L83:
        boolean r14 = true;
    L86:
        boolean r15 = r10.r;
        int r16 = r10.i;
        if (r16 == 5) goto L93;
        if (r14 == false) goto L92;
        boolean r17 = true;
        if (r16 != 1) goto L92;
    L94:
        boolean r18 = r15 | r17;
        r10.r = r18;
        r10.i = 24;
        if (r18 == false) goto L98;
        this.n = false;
        return;
    L98:
        return;
    L92:
        r17 = false;
        goto L94
    L93:
        r17 = true;
        goto L94
    L82:
        if (r13 == 2) goto L83;
    L84:
        r14 = false;
        goto L86
    L85:
        r14 = r10.s;
        goto L86
    L67:
        if (r10.o == false) goto L74;
        long r19 = r10.j;
        int r110 = r23 + ((int) (r25 - r19));
        long r20 = r10.q;
        if (r20 == (-9223372036854775807L)) goto L74;
        long r21 = r10.p;
        if (r19 == r21) goto L74;
        int r111 = (int) (r19 - r21);
        r10.a.a(r20, r10.r ? 1 : 0, r111, r110, null);
        goto L74
    L23:
        if (r10.c == false) goto L76;
        zk1 r22 = r10.n;
        zk1 r26 = r10.m;
        if (r22.a == false) goto L76;
        if (r26.a == false) goto L65;
        u13 r28 = r22.c;
        r28.getClass();
        u13 r29 = r26.c;
        r29.getClass();
        int r30 = r29.m;
        if (r22.f != r26.f) goto L65;
        if (r22.g != r26.g) goto L65;
        if (r22.h != r26.h) goto L65;
        if (r22.i == true) goto L39;
    L42:
        int r31 = r22.d;
        int r32 = r26.d;
        if (r31 == r32) goto L46;
        if (r31 == 0) goto L65;
        if (r32 == 0) goto L65;
    L46:
        int r33 = r28.m;
        if (r33 != 0) goto L54;
        if (r30 != 0) goto L54;
        if (r22.m != r26.m) goto L65;
        if (r22.n != r26.n) goto L65;
    L54:
        if (r33 != 1) goto L60;
        if (r30 != 1) goto L60;
        if (r22.o != r26.o) goto L65;
        if (r22.p != r26.p) goto L65;
    L60:
        boolean r34 = r22.k;
        if (r34 != r26.k) goto L65;
        if (r34 == false) goto L76;
        if (r22.l == r26.l) goto L76;
    L39:
        if (r26.i == false) goto L42;
        if (r22.j != r26.j) goto L65;
    L10:
        if (r6.e == false) goto L17;
        ArrayList r35 = new ArrayList();
        r35.add(Arrays.copyOf((byte[]) r3.f, r3.c));
        r35.add(Arrays.copyOf((byte[]) r6.f, r6.c));
        u13 r36 = uc5.L((byte[]) r3.f, 3, r3.c);
        int r37 = r36.s;
        h00 r112 = new h00((byte[]) r6.f, 4, r6.c);
        int r113 = r112.m();
        int r114 = r112.m();
        r112.s();
        t13 r115 = new t13(r113, r114, r112.h());
        int r116 = r36.a;
        int r117 = r36.b;
        int r118 = r36.c;
        byte[] r119 = i40.a;
        String r120 = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(r116), Integer.valueOf(r117), Integer.valueOf(r118)});
        wv4 r121 = this.j;
        sb1 r122 = new sb1();
        r122.a = this.i;
        r122.l = lw2.m("video/mp2t");
        r122.m = lw2.m("video/avc");
        r122.j = r120;
        r122.t = r36.e;
        r122.u = r36.f;
        r122.C = new c50(r36.p, r36.q, r36.r, null, r36.h + 8, r36.i + 8);
        r122.z = r36.g;
        r122.p = r35;
        r122.o = r37;
        f34.l(r122, r121);
        this.l = true;
        r2.x(r37);
        this.k.d.append(r36.d, r36);
        this.k.e.append(r113, r115);
        r3.f();
        r6.f();
        goto L17
    L12:
        if (r8 == false) goto L15;
        u13 r38 = uc5.L((byte[]) r3.f, 3, r3.c);
        r2.x(r38.s);
        this.k.d.append(r38.d, r38);
        r3.f();
        goto L17
    L15:
        if (r6.e == false) goto L17;
        h00 r39 = new h00((byte[]) r6.f, 4, r6.c);
        int r40 = r39.m();
        int r41 = r39.m();
        r39.s();
        this.k.e.append(r40, new t13(r40, r41, r39.h()));
        r6.f();
        goto L17
    L5:
        if (this.k.c == false) goto L17;
        goto L6
    }

    @Override // defpackage.mz0
    public final void c() {
        this.g = 0;
        this.n = false;
        this.m = -9223372036854775807L;
        uc5.i(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        ((c6) this.a.p).j(0);
        al1 r3 = this.k;
        if (r3 == null) goto L6;
        r3.k = false;
        r3.o = false;
        zk1 r4 = r3.n;
        r4.b = false;
        r4.a = false;
        return;
    }

    @Override // defpackage.mz0
    public final void d(boolean r8) {
        this.j.getClass();
        String r1 = f35.a;
        if (r8 == false) goto L6;
        ((c6) this.a.p).j(0);
        b(0, 0, this.g, this.m);
        h(9, this.g, this.m);
        b(0, 0, this.g, this.m);
        return;
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.m = r2;
        boolean r3 = this.n;
        if ((r1 & 2) == 0) goto L5;
        boolean r4 = true;
    L6:
        this.n = r4 | r3;
        return;
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.mz0
    public final void f(m51 r5, sy4 r6) {
        r6.a();
        r6.b();
        this.i = r6.e;
        r6.b();
        wv4 r0 = r5.t(r6.d, 2);
        this.j = r0;
        this.k = new al1(r0, this.b, this.c);
        this.a.a(r5, r6);
    }

    public final void g(byte[] r17, int r18, int r19) {
        if (this.l == true) goto L5;
    L6:
        this.d.a(r17, r18, r19);
        this.e.a(r17, r18, r19);
    L7:
        this.f.a(r17, r18, r19);
        al1 r0 = this.k;
        SparseArray r4 = r0.e;
        h00 r5 = r0.f;
        if (r0.k == false) goto L98;
        int r3 = r19 - r18;
        byte[] r6 = r0.g;
        int r7 = r6.length;
        int r8 = r0.h + r3;
        if (r7 >= r8) goto L13;
        r0.g = Arrays.copyOf(r6, r8 * 2);
    L13:
        System.arraycopy(r17, r18, r0.g, r0.h, r3);
        int r1 = r0.h + r3;
        r0.h = r1;
        r5.b = r0.g;
        r5.d = 0;
        r5.c = r1;
        r5.e = 0;
        r5.a();
        if (r5.d(8) == false) goto L99;
        r5.s();
        int r2 = r5.i(2);
        r5.t(5);
        if (r5.e() == false) goto L100;
        r5.m();
        if (r5.e() == false) goto L101;
        int r9 = r5.m();
        if (r0.c == true) goto L27;
        r0.k = false;
        zk1 r10 = r0.n;
        r10.e = r9;
        r10.b = true;
        return;
    L27:
        if (r5.e() == false) goto L102;
        int r11 = r5.m();
        if (r4.indexOfKey(r11) >= 0) goto L33;
        r0.k = false;
        return;
    L33:
        t13 r12 = (t13) r4.get(r11);
        SparseArray r13 = r0.d;
        int r14 = r12.a;
        boolean r15 = r12.b;
        u13 r16 = (u13) r13.get(r14);
        boolean r110 = r16.j;
        int r111 = r16.n;
        int r112 = r16.l;
        if (r110 == false) goto L40;
        if (r5.d(2) == false) goto L103;
        r5.t(2);
        goto L40
    L103:
        return;
    L40:
        if (r5.d(r112) == false) goto L104;
        int r20 = r5.i(r112);
        if (r16.k == false) goto L45;
        boolean r113 = false;
        boolean r114 = false;
    L54:
        boolean r115 = r114;
    L57:
        if (r0.i != 5) goto L59;
        boolean r21 = true;
    L60:
        if (r21 == true) goto L62;
        int r116 = 0;
    L66:
        int r22 = r16.m;
        if (r22 == 0) goto L69;
        if (r22 == 1) goto L83;
    L95:
        int r23 = 0;
    L79:
        int r24 = 0;
    L80:
        int r25 = 0;
    L78:
        int r117 = 0;
    L96:
        zk1 r26 = r0.n;
        r26.c = r16;
        r26.d = r2;
        r26.e = r9;
        r26.f = r20;
        r26.g = r11;
        r26.h = r113;
        r26.i = r115;
        r26.j = r114;
        r26.k = r21;
        r26.l = r116;
        r26.m = r23;
        r26.n = r25;
        r26.o = r24;
        r26.p = r117;
        r26.a = true;
        r26.b = true;
        r0.k = false;
        return;
    L83:
        if (r16.o == true) goto L95;
        if (r5.e() == false) goto L110;
        int r27 = r5.n();
        if (r15 == false) goto L94;
        if (r113 == true) goto L94;
        if (r5.e() == true) goto L93;
        return;
    L93:
        r117 = r5.n();
        r25 = 0;
        r24 = r27;
        r23 = 0;
    L94:
        r24 = r27;
        r23 = 0;
        goto L80
    L110:
        return;
    L69:
        if (r5.d(r111) == false) goto L108;
        r23 = r5.i(r111);
        if (r15 == false) goto L79;
        if (r113 == true) goto L79;
        if (r5.e() == false) goto L109;
        r25 = r5.n();
        r24 = 0;
        goto L78
    L109:
        return;
    L108:
        return;
    L62:
        if (r5.e() == false) goto L107;
        r116 = r5.m();
        goto L66
    L107:
        return;
    L59:
        r21 = false;
        goto L60
    L45:
        if (r5.d(1) == false) goto L105;
        r113 = r5.h();
        if (r113 == true) goto L50;
        r114 = false;
        goto L54
    L50:
        if (r5.d(1) == false) goto L106;
        r114 = r5.h();
        r115 = true;
        goto L57
    L106:
        return;
    L105:
        return;
    L104:
        return;
    L102:
        return;
    L101:
        return;
    L100:
        return;
    L99:
        return;
    L98:
        return;
    L5:
        if (this.k.c == false) goto L7;
        goto L6
    }

    public final void h(int r2, long r3, long r5) {
        if (this.l == true) goto L5;
    L6:
        this.d.g(r2);
        this.e.g(r2);
    L7:
        this.f.g(r2);
        al1 r0 = this.k;
        boolean r1 = this.n;
        r0.i = r2;
        r0.l = r5;
        r0.j = r3;
        r0.s = r1;
        if (r0.b == false) goto L11;
        if (r2 != 1) goto L11;
    L17:
        zk1 r4 = r0.m;
        r0.m = r0.n;
        r0.n = r4;
        r4.b = false;
        r4.a = false;
        r0.h = 0;
        r0.k = true;
        return;
    L11:
        if (r0.c == true) goto L13;
        return;
    L13:
        if (r2 == 5) goto L17;
        if (r2 == 1) goto L17;
        if (r2 == 2) goto L17;
        return;
    L5:
        if (this.k.c == false) goto L7;
        goto L6
    }
}
