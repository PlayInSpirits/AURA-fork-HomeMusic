package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij4 implements fe {
    public final as4 a;
    public final long b;
    public final gb1 c;
    public final eb1 d;
    public final fb1 e;
    public final vk0 f;
    public final String g;
    public final long h;
    public final hr i;
    public final bs4 j;
    public final vd2 k;
    public final long l;
    public final sr4 m;
    public final xb4 n;
    public final q05 o;

    public ij4(long r19, long r21, gb1 r23, eb1 r24, fb1 r25, vk0 r26, String r27, long r28, hr r30, bs4 r31, vd2 r32, long r33, sr4 r35, xb4 r36, int r37) {
        if ((r37 & 1) == 0) goto L5;
        long r1 = x40.g;
    L7:
        if ((r37 & 2) == 0) goto L9;
        long r3 = bt4.c;
    L11:
        if ((r37 & 4) == 0) goto L13;
        gb1 r5 = null;
    L15:
        if ((r37 & 8) == 0) goto L17;
        eb1 r7 = null;
    L19:
        if ((r37 & 16) == 0) goto L21;
        fb1 r8 = null;
    L23:
        if ((r37 & 32) == 0) goto L25;
        vk0 r9 = null;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r37 & 128) == 0) goto L33;
        long r11 = bt4.c;
    L35:
        if ((r37 & 256) == 0) goto L37;
        hr r13 = null;
    L39:
        if ((r37 & 512) == 0) goto L41;
        bs4 r14 = null;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        vd2 r15 = null;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        long r16 = x40.g;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        sr4 r6 = null;
    L55:
        if ((r37 & 8192) == 0) goto L58;
        xb4 r38 = null;
    L59:
        this(r1, r3, r5, r7, r8, r9, r10, r11, r13, r14, r15, r16, r6, r38);
        return;
    L58:
        r38 = r36;
        goto L59
    L53:
        r6 = r35;
        goto L55
    L49:
        r16 = r33;
        goto L51
    L45:
        r15 = r32;
        goto L47
    L41:
        r14 = r31;
        goto L43
    L37:
        r13 = r30;
        goto L39
    L33:
        r11 = r28;
        goto L35
    L29:
        r10 = r27;
        goto L31
    L25:
        r9 = r26;
        goto L27
    L21:
        r8 = r25;
        goto L23
    L17:
        r7 = r24;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }

    public final boolean a(ij4 r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if (bt4.a(this.b, r8.b) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.c, r8.c) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.d, r8.d) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.e, r8.e) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.f, r8.f) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.g, r8.g) == true) goto L24;
        return false;
    L24:
        if (bt4.a(this.h, r8.h) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.i, r8.i) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.j, r8.j) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.k, r8.k) == true) goto L36;
        return false;
    L36:
        if (x40.c(this.l, r8.l) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean b(ij4 r4) {
        if (h12.c(this.a, r4.a) == true) goto L6;
        return false;
    L6:
        if (h12.c(this.m, r4.m) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.n, r4.n) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.o, r4.o) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ij4) == true) goto L8;
        return false;
    L8:
        ij4 r5 = (ij4) r4;
        if (a(r5) == true) goto L11;
    L13:
        return false;
    L11:
        if (b(r5) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        as4 r0 = this.a;
        long r1 = r0.c();
        int r3 = x40.h;
        int r2 = Long.hashCode(r1) * 31;
        uo r4 = r0.f();
        int r5 = 0;
        if (r4 == null) goto L5;
        int r6 = r4.hashCode();
    L6:
        int r7 = (Float.hashCode(r0.b()) + ((r2 + r6) * 31)) * 31;
        ct4[] r8 = bt4.b;
        int r9 = xa3.b(r7, 31, this.b);
        gb1 r10 = this.c;
        if (r10 == null) goto L9;
        int r11 = r10.n;
    L10:
        int r12 = (r9 + r11) * 31;
        eb1 r13 = this.d;
        if (r13 == null) goto L13;
        int r14 = Integer.hashCode(r13.a);
    L14:
        int r15 = (r12 + r14) * 31;
        fb1 r16 = this.e;
        if (r16 == null) goto L17;
        int r17 = Integer.hashCode(r16.a);
    L18:
        int r18 = (r15 + r17) * 31;
        vk0 r19 = this.f;
        if (r19 == null) goto L21;
        int r20 = r19.hashCode();
    L22:
        int r21 = (r18 + r20) * 31;
        String r22 = this.g;
        if (r22 == null) goto L25;
        int r23 = r22.hashCode();
    L26:
        int r24 = xa3.b((r21 + r23) * 31, 31, this.h);
        hr r25 = this.i;
        if (r25 == null) goto L29;
        int r26 = Float.hashCode(r25.a);
    L30:
        int r27 = (r24 + r26) * 31;
        bs4 r28 = this.j;
        if (r28 == null) goto L33;
        int r29 = r28.hashCode();
    L34:
        int r30 = (r27 + r29) * 31;
        vd2 r31 = this.k;
        if (r31 == null) goto L37;
        int r32 = r31.n.hashCode();
    L38:
        int r33 = xa3.b((r30 + r32) * 31, 31, this.l);
        sr4 r34 = this.m;
        if (r34 == null) goto L41;
        int r35 = r34.a;
    L42:
        int r36 = (r33 + r35) * 31;
        xb4 r37 = this.n;
        if (r37 == null) goto L45;
        int r38 = r37.hashCode();
    L46:
        int r39 = (r36 + r38) * 961;
        q05 r40 = this.o;
        if (r40 == null) goto L50;
        r5 = r40.hashCode();
    L50:
        return r39 + r5;
    L45:
        r38 = 0;
        goto L46
    L41:
        r35 = 0;
        goto L42
    L37:
        r32 = 0;
        goto L38
    L33:
        r29 = 0;
        goto L34
    L29:
        r26 = 0;
        goto L30
    L25:
        r23 = 0;
        goto L26
    L21:
        r20 = 0;
        goto L22
    L17:
        r17 = 0;
        goto L18
    L13:
        r14 = 0;
        goto L14
    L9:
        r11 = 0;
        goto L10
    L5:
        r6 = 0;
        goto L6
    }

    public final String toString() {
        as4 r0 = this.a;
        String r1 = x40.h(r0.c());
        uo r2 = r0.f();
        float r3 = r0.b();
        String r4 = bt4.d(this.b);
        String r5 = bt4.d(this.h);
        String r6 = x40.h(this.l);
        StringBuilder r7 = new StringBuilder("SpanStyle(color=");
        r7.append(r1);
        r7.append(", brush=");
        r7.append(r2);
        r7.append(", alpha=");
        r7.append(r3);
        r7.append(", fontSize=");
        r7.append(r4);
        r7.append(", fontWeight=");
        r7.append(this.c);
        r7.append(", fontStyle=");
        r7.append(this.d);
        r7.append(", fontSynthesis=");
        r7.append(this.e);
        r7.append(", fontFamily=");
        r7.append(this.f);
        r7.append(", fontFeatureSettings=");
        f34.n(r7, this.g, ", letterSpacing=", r5, ", baselineShift=");
        r7.append(this.i);
        r7.append(", textGeometricTransform=");
        r7.append(this.j);
        r7.append(", localeList=");
        r7.append(this.k);
        r7.append(", background=");
        r7.append(r6);
        r7.append(", textDecoration=");
        r7.append(this.m);
        r7.append(", shadow=");
        r7.append(this.n);
        r7.append(", platformStyle=null, drawStyle=");
        r7.append(this.o);
        r7.append(")");
        return r7.toString();
    }

    public ij4(as4 r1, long r2, gb1 r4, eb1 r5, fb1 r6, vk0 r7, String r8, long r9, hr r11, bs4 r12, vd2 r13, long r14, sr4 r16, xb4 r17, q05 r18) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r11;
        this.j = r12;
        this.k = r13;
        this.l = r14;
        this.m = r16;
        this.n = r17;
        this.o = r18;
    }

    public ij4(long r23, long r25, gb1 r27, eb1 r28, fb1 r29, vk0 r30, String r31, long r32, hr r34, bs4 r35, vd2 r36, long r37, sr4 r39, xb4 r40) {
        if (r23 == 16) goto L6;
        as4 r2 = new u50(r23);
    L7:
        this(r2, r25, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r40, null);
        return;
    L6:
        r2 = rv2.F;
        goto L7
    }
}
