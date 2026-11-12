package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements mz0 {
    public static final byte[] x = null;
    public final boolean a;
    public final h00 b;
    public final be3 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wv4 h;
    public wv4 i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public int t;
    public long u;
    public wv4 v;
    public long w;

    static {
        x = new byte[]{73, 68, 51};
    }

    public i6(String r4, int r5, String r6, boolean r7) {
        this.b = new h00(7, new byte[7]);
        this.c = new be3(Arrays.copyOf(x, 10));
        this.o = -1;
        this.p = -1;
        this.s = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.a = r7;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.mz0
    public final void a(be3 r24) {
        this.h.getClass();
        String r2 = f35.a;
    L4:
        if (r24.a() <= 0) goto L141;
        int r3 = this.j;
        byte r4 = -1;
        be3 r6 = this.c;
        int r8 = 3;
        h00 r9 = this.b;
        int r10 = 0;
        int r11 = 4;
        boolean r13 = true;
        int r14 = 1;
        if (r3 != 0) goto L7;
        byte[] r5 = r24.a;
        int r15 = r24.b;
        int r16 = r24.c;
    L53:
        if (r15 >= r16) goto L140;
        int r7 = r15 + 1;
        int r17 = r8;
        byte r12 = r5[r15];
        int r18 = r12 & 255;
        if (this.l == 512) goto L57;
    L121:
        byte r19 = r4;
        int r20 = r14;
    L122:
        int r21 = this.l;
        int r22 = r18 | r21;
        if (r22 != 329) goto L125;
        int r23 = 3;
        char r25 = 256;
        int r26 = 0;
        char r110 = 2;
        this.l = 768;
    L138:
        r15 = r7;
    L139:
        r14 = r20;
        r4 = r19;
        r11 = 4;
        r10 = r26;
        r8 = r23;
        goto L53
    L125:
        if (r22 != 511) goto L127;
        r23 = 3;
        r25 = 256;
        r26 = 0;
        r110 = 2;
        this.l = 512;
        goto L138
    L127:
        if (r22 != 836) goto L129;
        r23 = 3;
        r25 = 256;
        r26 = 0;
        r110 = 2;
        this.l = 1024;
        goto L138
    L129:
        if (r22 == 1075) goto L134;
        r25 = 256;
        if (r21 == 256) goto L133;
        this.l = 256;
        r23 = 3;
        r26 = 0;
        r110 = 2;
        goto L139
    L133:
        r23 = 3;
        r26 = 0;
        r110 = 2;
        goto L138
    L134:
        this.j = 2;
        this.k = 3;
        this.t = 0;
        r6.N(0);
        r24.N(r7);
        goto L4
    L57:
        if (((65280 | (((byte) r18) & 255 ? 1 : 0) ? 1 : 0) & 65526) != 65520) goto L121;
        if (this.n == true) goto L112;
        int r27 = r15 - 1;
        r24.N(r15);
        byte[] r111 = r9.b;
        if (r24.a() >= r14) goto L63;
    L62:
        r19 = -1;
    L111:
        r20 = 1;
        goto L122
    L63:
        r24.k(r111, r10, r14);
        r9.q(r11);
        int r28 = r9.i(r14);
        int r112 = this.o;
        if (r112 == (-1)) goto L68;
        if (r28 == r112) goto L68;
        r19 = -1;
    L68:
        if (this.p == (-1)) goto L76;
        byte[] r113 = r9.b;
        if (r24.a() < r14) goto L112;
        r24.k(r113, r10, r14);
        r9.q(2);
        int r114 = 4;
        if (r9.i(4) != this.p) goto L62;
        r24.N(r7);
    L77:
        byte[] r115 = r9.b;
        if (r24.a() < r114) goto L112;
        r24.k(r115, r10, r114);
        r9.q(14);
        int r116 = r9.i(13);
        if (r116 < 7) goto L62;
        byte[] r117 = r24.a;
        int r118 = r24.c;
        int r29 = r27 + r116;
        if (r29 >= r118) goto L112;
        byte r119 = r117[r29];
        r19 = -1;
        if (r119 != (-1)) goto L97;
        int r30 = r29 + 1;
        if (r30 == r118) goto L112;
        byte r31 = r117[r30];
        if (((65280 | (r31 & 255 ? 1 : 0) ? 1 : 0) & 65526) != 65520) goto L111;
        if (((r31 & 8) >> 3) != r28) goto L111;
    L97:
        if (r119 != 73) goto L111;
        int r32 = r29 + 1;
        if (r32 == r118) goto L112;
        if (r117[r32] != 68) goto L111;
        int r33 = r29 + 2;
        if (r33 == r118) goto L112;
        if (r117[r33] != 51) goto L111;
    L76:
        r114 = 4;
    L112:
        this.q = (r12 & 8) >> 3;
        if ((r12 & 1) != 0) goto L115;
        boolean r34 = true;
    L116:
        this.m = r34;
        if (this.n == true) goto L119;
        this.j = 1;
        this.k = 0;
    L120:
        r24.N(r7);
        goto L4
    L119:
        this.j = r17;
        this.k = 0;
        goto L120
    L115:
        r34 = false;
        goto L116
    L140:
        r24.N(r15);
        goto L4
    L7:
        if (r3 != 1) goto L9;
        if (r24.a() == 0) goto L4;
        r9.b[0] = r24.a[r24.b];
        r9.q(2);
        int r35 = r9.i(4);
        int r36 = this.p;
        if (r36 == (-1)) goto L49;
        if (r35 == r36) goto L49;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    L49:
        if (this.n == true) goto L51;
        this.n = true;
        this.o = this.q;
        this.p = r35;
    L51:
        this.j = 3;
        this.k = 0;
        goto L4
    L9:
        if (r3 != 2) goto L10;
        byte[] r37 = r6.a;
        int r38 = Math.min(r24.a(), 10 - this.k);
        r24.k(r37, this.k, r38);
        int r39 = this.k + r38;
        this.k = r39;
        if (r39 != 10) goto L4;
        this.i.e(10, r6);
        r6.N(6);
        wv4 r40 = this.i;
        int r41 = r6.z() + 10;
        this.j = 4;
        this.k = 10;
        this.v = r40;
        this.w = 0;
        this.t = r41;
        goto L4
    L10:
        if (r3 != 3) goto L11;
        if (this.m == false) goto L24;
        int r42 = 7;
    L25:
        byte[] r43 = r9.b;
        int r120 = Math.min(r24.a(), r42 - this.k);
        r24.k(r43, this.k, r120);
        int r44 = this.k + r120;
        this.k = r44;
        if (r44 != r42) goto L4;
        r9.q(0);
        if (this.r == true) goto L33;
        int r45 = r9.i(2) + 1;
        if (r45 == 2) goto L32;
        l93.q0("AdtsReader", "Detected audio object type: " + r45 + ", but assuming AAC LC.");
        r45 = 2;
    L32:
        r9.t(5);
        int r46 = r9.i(3);
        int r47 = this.p;
        byte[] r48 = {(byte) (((r45 << 3) & 248) | ((r47 >> 1) & 7)), (byte) (((r46 << 3) & 120) | ((r47 << 7) & 128))};
        g r49 = xl.D(new h00(2, r48), false);
        sb1 r50 = new sb1();
        r50.a = this.g;
        r50.l = lw2.m(this.f);
        r50.m = lw2.m("audio/mp4a-latm");
        r50.j = r49.a;
        r50.E = r49.c;
        r50.F = r49.b;
        r50.p = Collections.singletonList(r48);
        r50.d = this.d;
        r50.f = this.e;
        tb1 r51 = new tb1(r50);
        this.s = 1024000000 / ((long) r51.G);
        this.h.g(r51);
        this.r = true;
    L34:
        r9.t(4);
        int r52 = r9.i(13);
        int r53 = r52 - 7;
        if (this.m == false) goto L37;
        r53 = r52 - 9;
    L37:
        wv4 r54 = this.h;
        long r55 = this.s;
        this.j = 4;
        this.k = 0;
        this.v = r54;
        this.w = r55;
        this.t = r53;
        goto L4
    L33:
        r9.t(10);
        goto L34
    L24:
        r42 = 5;
        goto L25
    L11:
        if (r3 != 4) goto L19;
        int r56 = Math.min(r24.a(), this.t - this.k);
        this.v.e(r56, r24);
        int r57 = this.k + r56;
        this.k = r57;
        if (r57 != this.t) goto L4;
        if (this.u != (-9223372036854775807L)) goto L18;
        r13 = false;
    L18:
        rr2.w(r13);
        this.v.a(this.u, 1, this.t, 0, null);
        this.u += this.w;
        this.j = 0;
        this.k = 0;
        this.l = 256;
        goto L4
    L19:
        tb4.a();
        return;
    }

    @Override // defpackage.mz0
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.mz0
    public final void d(boolean r1) {
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.u = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r3, sy4 r4) {
        r4.a();
        r4.b();
        this.g = r4.e;
        r4.b();
        wv4 r0 = r3.t(r4.d, 1);
        this.h = r0;
        this.v = r0;
        if (this.a == false) goto L6;
        r4.a();
        r4.b();
        wv4 r5 = r3.t(r4.d, 5);
        this.i = r5;
        sb1 r1 = new sb1();
        r4.b();
        r1.a = r4.e;
        r1.l = lw2.m(this.f);
        r1.m = lw2.m("application/id3");
        f34.l(r1, r5);
        return;
    L6:
        this.i = new tq0();
    }
}
