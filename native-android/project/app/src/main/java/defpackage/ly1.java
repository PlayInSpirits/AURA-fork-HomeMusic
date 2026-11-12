package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 implements mv0 {
    public final z64 n;
    public gy1 o;
    public jy1 p;
    public iy1 q;
    public hy1 r;
    public wr1 s;
    public rm2 t;
    public e20 u;
    public final x7 v;
    public final x7 w;

    public ly1(z64 r3) {
        this.n = r3;
        x7 r4 = new x7(7, false);
        r4.p = new q03();
        this.v = r4;
        x7 r5 = new x7(10, false);
        r5.p = new l03();
        this.w = r5;
    }

    public static void c(ly1 r4, ey1 r5, long r6, long r8, int r10) {
        if ((r10 & 4) == 0) goto L5;
        r8 = 0;
    L5:
        z64 r11 = r4.n;
        iy1 r0 = r4.q;
        if (r0 != null) goto L8;
        r0 = new iy1();
        r0.j = null;
        r0.k = Long.MAX_VALUE;
        r0.l = false;
        r4.q = r0;
    L8:
        r0.j = r5;
        r0.k = r6;
        e20 r7 = r4.u;
        hb3 r9 = r11.D;
        if (r7 != null) goto L11;
        r4.u = new e20(r9, 0);
    L12:
        r0.l = false;
        r4.s = r0;
        return;
    L11:
        r7.p = r9;
        r7.o = r8;
        goto L12
    }

    @Override // defpackage.ih1
    public final String A() {
        wr1 r1 = this.s;
        if ((r1 instanceof gy1) == false) goto L8;
        if (((gy1) r1).l == true) goto L20;
        return "idle";
    L20:
        return "waiting";
    L8:
        if ((r1 instanceof iy1) == false) goto L11;
        return "waiting";
    L11:
        if ((r1 instanceof hy1) == false) goto L15;
        return "waiting";
    L15:
        if ((r1 instanceof jy1) == false) goto L22;
        return "recognized";
    L22:
        return "idle";
    }

    @Override // defpackage.mv0
    public final hb3 F() {
        return this.n.D;
    }

    public final void a() {
        gy1 r0 = this.o;
        fy1 r1 = fy1.p;
        if (r0 != null) goto L5;
        r0 = new gy1();
        r0.j = r1;
        r0.k = false;
        r0.l = false;
        this.o = r0;
    L5:
        r0.j = r1;
        r0.k = false;
        r0.l = false;
        this.s = r0;
    }

    public final void b(ey1 r4, long r5, e20 r7) {
        hy1 r0 = this.r;
        if (r0 != null) goto L5;
        r0 = new hy1();
        r0.j = null;
        r0.k = Long.MAX_VALUE;
        this.r = r0;
    L5:
        r0.j = r4;
        r0.k = r5;
        r7.o = 0;
        this.s = r0;
    }

    public final rm2 d() {
        rm2 r0 = this.t;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(ey1 r23, dy1 r24, long r25) {
        long r4 = r23.c;
        z64 r6 = this.n;
        hb3 r7 = r6.D;
        r7.getClass();
        int r8 = ov0.a;
        long r10 = 4294967295L;
        if (r7 != hb3.n) goto L6;
        long r9 = r25 & 4294967295L;
    L8:
        if (Math.abs(Float.intBitsToFloat((int) r9)) <= 2.0f) goto L68;
        rm2 r11 = d();
        hb3 r12 = r6.D;
        x7 r13 = this.v;
        q03 r14 = (q03) r13.p;
        float r15 = Float.intBitsToFloat((int) (r4 >> 32));
        float r5 = Float.intBitsToFloat((int) (r4 & 4294967295L));
        int r16 = 0;
        if (zz1.h(r23) == false) goto L12;
        r13.o = 0;
        r14.d();
    L12:
        float r17 = 0.0f;
        if (zz1.b(r23) == false) goto L15;
    L30:
        long r19 = 4294967295L;
    L31:
        long r18 = Float.floatToRawIntBits(r15);
        long r20 = (((long) Float.floatToRawIntBits(r5)) & r19) | (r18 << 32);
        if (r12 == null) goto L44;
        int r110 = r24.a;
        if (r110 != 1) goto L38;
        float r21 = Float.intBitsToFloat((int) (r20 >> 32));
    L41:
        if (r12 != hb3.o) goto L43;
        r20 = (Float.floatToRawIntBits(r21) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & r19);
        goto L44
    L43:
        long r111 = Float.floatToRawIntBits(0.0f);
        r20 = (((long) Float.floatToRawIntBits(r21)) & r19) | (r111 << 32);
        goto L44
    L38:
        if (r110 != 2) goto L44;
        r21 = Float.intBitsToFloat((int) (r20 & r19));
    L44:
        ((qf2) r11.o).a(r23.b, r20);
        x7 r0 = this.w;
        l03 r22 = (l03) r0.p;
        int r26 = r22.b;
        if (r26 != 3) goto L52;
        int r27 = r0.o;
        r0.o = r27 + 1;
        if (r27 < 0) goto L50;
        if (r27 >= r26) goto L50;
        long[] r28 = r22.a;
        long r112 = r28[r27];
        r28[r27] = r25;
    L54:
        if (r0.o != 3) goto L56;
        r0.o = 0;
    L56:
        long[] r1 = r22.a;
        int r2 = r22.b;
        int r3 = 0;
        float r29 = 0.0f;
    L57:
        if (r3 >= r2) goto L59;
        r29 = r29 + Float.intBitsToFloat((int) (r1[r3] >> 32));
        r3 = r3 + 1;
        goto L57
    L59:
        int r30 = r22.b;
        float r31 = r29 / r30;
        long[] r32 = r22.a;
    L60:
        if (r16 >= r30) goto L62;
        r17 = Float.intBitsToFloat((int) (r32[r16] & r19)) + r17;
        r16 = r16 + 1;
        goto L60
    L62:
        float r113 = r17 / r22.b;
        r6.A0(new xu0(true, (Float.floatToRawIntBits(r31) << 32) | (((long) Float.floatToRawIntBits(r113)) & r19)));
        return;
    L50:
        kf2.h("Index must be between 0 and size");
        return;
    L52:
        r22.a(r25);
        goto L54
    L15:
        if (zz1.h(r23) == true) goto L30;
        if (r14.b != 3) goto L19;
        int r33 = r13.o;
        r13.o = r33 + 1;
        r14.n(r33, r23);
    L21:
        if (r13.o != 3) goto L23;
        r13.o = 0;
    L23:
        Object[] r34 = r14.a;
        int r35 = r14.b;
        int r114 = 0;
        float r115 = 0.0f;
    L24:
        if (r114 >= r35) goto L26;
        r115 = r115 + Float.intBitsToFloat((int) (((ey1) r34[r114]).c >> 32));
        r114 = r114 + 1;
        r10 = r10;
        goto L24
    L26:
        r19 = r10;
        int r36 = r14.b;
        r15 = r115 / r36;
        Object[] r37 = r14.a;
        int r116 = 0;
        float r117 = 0.0f;
    L27:
        if (r116 >= r36) goto L29;
        r117 = r117 + Float.intBitsToFloat((int) (((ey1) r37[r116]).c & r19));
        r116 = r116 + 1;
        goto L27
    L29:
        r5 = r117 / r14.b;
        goto L31
    L19:
        r14.a(r23);
        goto L21
    L68:
        return;
    L6:
        r9 = r25 >> 32;
        goto L8
    }

    public final void f(ey1 r21, ey1 r22, dy1 r23, long r24) {
        if (this.t != null) goto L5;
        this.t = new rm2(28);
    L5:
        rm2 r3 = d();
        z64 r4 = this.n;
        hb3 r5 = r4.D;
        x7 r6 = this.v;
        q03 r7 = (q03) r6.p;
        char r10 = ' ';
        float r8 = Float.intBitsToFloat((int) (r21.c >> 32));
        long r13 = 4294967295L;
        float r9 = Float.intBitsToFloat((int) (r21.c & 4294967295L));
        if (zz1.h(r21) == false) goto L9;
        r6.o = 0;
        r7.d();
    L9:
        if (zz1.b(r21) == false) goto L11;
    L26:
        char r17 = ' ';
        long r18 = 4294967295L;
    L27:
        long r11 = (Float.floatToRawIntBits(r8) << r17) | (((long) Float.floatToRawIntBits(r9)) & r18);
        if (r5 == null) goto L40;
        int r12 = r23.a;
        if (r12 != 1) goto L34;
        float r14 = Float.intBitsToFloat((int) (r11 >> r17));
    L37:
        if (r5 != hb3.o) goto L39;
        r11 = (Float.floatToRawIntBits(r14) << r17) | (((long) Float.floatToRawIntBits(0.0f)) & r18);
        goto L40
    L39:
        r11 = (Float.floatToRawIntBits(0.0f) << r17) | (((long) Float.floatToRawIntBits(r14)) & r18);
        goto L40
    L34:
        if (r12 != 2) goto L40;
        r14 = Float.intBitsToFloat((int) (r11 & r18));
    L40:
        ((qf2) r3.o).a(r21.b, r11);
        long r1 = g83.d(zz1.B(r22, r4.D, r23), r24);
        r4.E.getClass();
        r4.A0(new yu0(r1));
        x7 r0 = this.w;
        r0.o = 0;
        ((l03) r0.p).b = 0;
        return;
    L11:
        if (zz1.h(r21) == true) goto L26;
        if (r7.b != 3) goto L15;
        int r15 = r6.o;
        r6.o = r15 + 1;
        r7.n(r15, r21);
    L17:
        if (r6.o != 3) goto L19;
        r6.o = 0;
    L19:
        Object[] r16 = r7.a;
        int r19 = r7.b;
        int r20 = 0;
        float r110 = 0.0f;
    L20:
        if (r20 >= r19) goto L22;
        char r111 = r10;
        r110 = r110 + Float.intBitsToFloat((int) (((ey1) r16[r20]).c >> r111));
        r20 = r20 + 1;
        r10 = r111;
        r13 = r13;
        goto L20
    L22:
        r17 = r10;
        r18 = r13;
        int r25 = r7.b;
        r8 = r110 / r25;
        Object[] r26 = r7.a;
        int r112 = 0;
        float r113 = 0.0f;
    L23:
        if (r112 >= r25) goto L25;
        r113 = r113 + Float.intBitsToFloat((int) (((ey1) r26[r112]).c & r18));
        r112 = r112 + 1;
        goto L23
    L25:
        r9 = r113 / r7.b;
        goto L27
    L15:
        r7.a(r21);
        goto L17
    }
}
