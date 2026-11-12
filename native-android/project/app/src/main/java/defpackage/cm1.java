package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 {
    public final q62 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final q03 f;
    public final i63 g;
    public final m03 h;

    public cm1(q62 r2) {
        this.a = r2;
        this.f = new q03();
        this.g = new i63();
        this.h = new m03(10);
    }

    public final void a(long r19, List r21, boolean r22) {
        int r3 = r21.size();
        i63 r4 = this.g;
        i63 r9 = r4;
        boolean r8 = true;
        int r7 = 0;
    L3:
        int r10 = 7;
        m03 r11 = this.h;
        if (r7 >= r3) goto L34;
        cx2 r13 = (cx2) r21.get(r7);
        if (r13.A == false) goto L33;
        r13.z = new fa(r10, this, r13);
        if (r8 == false) goto L26;
        f13 r12 = r9.a;
        Object[] r14 = r12.n;
        int r15 = r12.p;
        int r16 = 0;
    L10:
        if (r16 >= r15) goto L15;
        Object r17 = r14[r16];
        if (h12.c(((a63) r17).c, r13) == true) goto L16;
        r16 = r16 + 1;
    L16:
        a63 r6 = (a63) r17;
        if (r6 == null) goto L25;
        r6.i = true;
        r6.d.a(r19);
        if (r22 == false) goto L24;
        Object r18 = r11.d(r19);
        if (r18 != null) goto L23;
        r18 = new q03();
        r11.f(r19, r18);
    L23:
        ((q03) r18).a(r6);
    L24:
        r9 = r6;
        goto L33
    L25:
        r8 = false;
        goto L26
    L15:
        r17 = null;
    L26:
        r6 = new a63(r13);
        r6.d.a(r19);
        if (r22 == false) goto L32;
        Object r110 = r11.d(r19);
        if (r110 != null) goto L31;
        r110 = new q03();
        r11.f(r19, r110);
    L31:
        ((q03) r110).a(r6);
    L32:
        r9.a.b(r6);
    L33:
        r7 = r7 + 1;
        goto L3
    L34:
        if (r22 == false) goto L55;
        long[] r0 = r11.b;
        Object[] r1 = r11.c;
        long[] r2 = r11.a;
        int r5 = r2.length - 2;
        if (r5 < 0) goto L55;
        int r20 = 0;
    L38:
        long r23 = r2[r20];
        if (((((~r23) << r10) & r23) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L52;
        int r24 = 8;
        int r25 = 8 - ((~(r20 - r5)) >>> 31);
        int r111 = 0;
    L41:
        if (r111 >= r25) goto L49;
        if ((255 & r23) >= 128) goto L48;
        int r112 = (r20 << 3) + r111;
        long r113 = r0[r112];
        q03 r114 = (q03) r1[r112];
        f13 r115 = r4.a;
        Object[] r26 = r115.n;
        int r116 = r115.p;
        int r27 = 0;
    L45:
        if (r27 >= r116) goto L48;
        ((a63) r26[r27]).f(r113, r114);
        r27 = r27 + 1;
    L48:
        r23 = r23 >> r24;
        r111 = r111 + 1;
        r24 = r24;
        r0 = r0;
        goto L41
    L49:
        long[] r117 = r0;
        if (r25 != r24) goto L55;
    L53:
        if (r20 == r5) goto L55;
        r20 = r20 + 1;
        r0 = r117;
        r10 = 7;
        goto L38
    L52:
        r117 = r0;
    L55:
        r11.a();
    }

    public final boolean b(gp3 r10, boolean r11) {
        xe2 r0 = (xe2) r10.o;
        q62 r1 = this.a;
        i63 r2 = this.g;
        boolean r3 = r2.a(r0, r1, r10, r11);
        f13 r4 = r2.a;
        if (r3 == true) goto L5;
        return false;
    L5:
        boolean r5 = true;
        this.b = true;
        Object[] r6 = r4.n;
        int r7 = r4.p;
        int r8 = 0;
        boolean r9 = false;
    L6:
        if (r8 >= r7) goto L14;
        if (((a63) r6[r8]).e(r10, r11) == true) goto L12;
        if (r9 == true) goto L12;
        r9 = false;
    L13:
        r8 = r8 + 1;
    L12:
        r9 = true;
        goto L13
    L14:
        Object[] r12 = r4.n;
        int r13 = r4.p;
        int r14 = 0;
        boolean r15 = false;
    L15:
        if (r14 >= r13) goto L23;
        if (((a63) r12[r14]).d(r10) == true) goto L21;
        if (r15 == true) goto L21;
        r15 = false;
    L22:
        r14 = r14 + 1;
    L21:
        r15 = true;
        goto L22
    L23:
        r2.b(r10);
        if (r15 == true) goto L28;
        if (r9 == true) goto L28;
        r5 = false;
    L28:
        this.b = false;
        if (this.e == false) goto L35;
        this.e = false;
        q03 r16 = this.f;
        int r17 = r16.b;
        int r18 = 0;
    L31:
        if (r18 >= r17) goto L33;
        d((cx2) r16.f(r18));
        r18 = r18 + 1;
        goto L31
    L33:
        r16.d();
    L35:
        if (this.c == false) goto L38;
        this.c = false;
        c();
    L38:
        if (this.d == false) goto L40;
        this.d = false;
        r2.a.g();
    L40:
        return r5;
    }

    public final void c() {
        if (this.b == false) goto L6;
        this.c = true;
        return;
    L6:
        i63 r0 = this.g;
        f13 r2 = r0.a;
        Object[] r3 = r2.n;
        int r4 = r2.p;
        int r5 = 0;
    L7:
        if (r5 >= r4) goto L10;
        ((a63) r3[r5]).c();
        r5 = r5 + 1;
        goto L7
    L10:
        if (this.d == false) goto L13;
        this.d = true;
        return;
    L13:
        r0.a.g();
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
    public final void d(cx2 r6) {
        if (this.b == false) goto L6;
        this.e = true;
        this.f.a(r6);
        return;
    L6:
        i63 r5 = this.g;
        q03 r0 = r5.b;
        r0.d();
        r0.a(r5);
    L8:
        if (r0.i() == false) goto L16;
        i63 r7 = (i63) r0.k(r0.b - 1);
        int r2 = 0;
    L10:
        f13 r3 = r7.a;
        if (r2 >= r3.p) goto L8;
        a63 r4 = (a63) r3.n[r2];
        if (h12.c(r4.c, r6) == true) goto L14;
        r0.a(r4);
        r2 = r2 + 1;
        goto L10
    L14:
        r7.a.j(r4);
        r4.c();
        goto L10
    }
}
