package defpackage;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd5 {
    public static final String y = null;
    public final String a;
    public int b;
    public final String c;
    public final String d;
    public final oh0 e;
    public final oh0 f;
    public final long g;
    public long h;
    public long i;
    public mc0 j;
    public final int k;
    public final int l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    static {
        y = cx.i("WorkSpec");
    }

    public /* synthetic */ dd5(String r37, int r38, String r39, String r40, oh0 r41, oh0 r42, long r43, long r45, long r47, mc0 r49, int r50, int r51, long r52, long r54, long r56, long r58, boolean r60, int r61, int r62, long r63, int r65, int r66, String r67, int r68) {
        if ((r68 & 2) == 0) goto L5;
        int r5 = 1;
    L7:
        if ((r68 & 8) == 0) goto L9;
        String r7 = OverwritingInputMerger.class.getName();
    L11:
        if ((r68 & 16) == 0) goto L13;
        oh0 r8 = oh0.b;
    L15:
        if ((r68 & 32) == 0) goto L17;
        oh0 r9 = oh0.b;
    L18:
        long r3 = 0;
        if ((r68 & 64) == 0) goto L21;
        long r10 = 0;
    L23:
        if ((r68 & 128) == 0) goto L25;
        long r12 = 0;
    L27:
        if ((r68 & 256) == 0) goto L29;
        long r14 = 0;
    L31:
        if ((r68 & 512) == 0) goto L33;
        mc0 r16 = mc0.j;
    L35:
        if ((r68 & 1024) == 0) goto L37;
        int r17 = 0;
    L39:
        if ((r68 & 2048) == 0) goto L41;
        int r18 = 1;
    L43:
        if ((r68 & 4096) == 0) goto L45;
        long r19 = 30000;
    L47:
        if ((r68 & 8192) == 0) goto L49;
        long r23 = -1;
    L51:
        if ((r68 & 16384) != 0) goto L55;
        r3 = r56;
    L55:
        if ((32768 & r68) == 0) goto L57;
        long r25 = -1;
    L59:
        if ((65536 & r68) == 0) goto L61;
        boolean r27 = false;
    L63:
        if ((131072 & r68) == 0) goto L65;
        int r28 = 1;
    L67:
        if ((262144 & r68) == 0) goto L69;
        int r29 = 0;
    L71:
        if ((1048576 & r68) == 0) goto L73;
        long r31 = Long.MAX_VALUE;
    L75:
        if ((2097152 & r68) == 0) goto L77;
        int r33 = 0;
    L79:
        if ((4194304 & r68) == 0) goto L81;
        int r34 = -256;
    L83:
        if ((r68 & 8388608) == 0) goto L85;
        String r35 = null;
    L86:
        this(r37, r5, r39, r7, r8, r9, r10, r12, r14, r16, r17, r18, r19, r23, r3, r25, r27, r28, r29, 0, r31, r33, r34, r35);
        return;
    L85:
        r35 = r67;
        goto L86
    L81:
        r34 = r66;
        goto L83
    L77:
        r33 = r65;
        goto L79
    L73:
        r31 = r63;
        goto L75
    L69:
        r29 = r62;
        goto L71
    L65:
        r28 = r61;
        goto L67
    L61:
        r27 = r60;
        goto L63
    L57:
        r25 = r58;
        goto L59
    L49:
        r23 = r54;
        goto L51
    L45:
        r19 = r52;
        goto L47
    L41:
        r18 = r51;
        goto L43
    L37:
        r17 = r50;
        goto L39
    L33:
        r16 = r49;
        goto L35
    L29:
        r14 = r47;
        goto L31
    L25:
        r12 = r45;
        goto L27
    L21:
        r10 = r43;
        goto L23
    L17:
        r9 = r42;
        goto L18
    L13:
        r8 = r41;
        goto L15
    L9:
        r7 = r40;
        goto L11
    L5:
        r5 = r38;
        goto L7
    }

    public static dd5 b(dd5 r36, String r37, int r38, String r39, oh0 r40, int r41, long r42, int r44, int r45, long r46, int r48, int r49) {
        if ((r49 & 1) == 0) goto L5;
        String r4 = r36.a;
    L7:
        if ((r49 & 2) == 0) goto L9;
        int r5 = r36.b;
    L11:
        if ((r49 & 4) == 0) goto L13;
        String r6 = r36.c;
    L14:
        String r7 = r36.d;
        if ((r49 & 16) == 0) goto L17;
        oh0 r8 = r36.e;
    L18:
        oh0 r9 = r36.f;
        long r10 = r36.g;
        long r12 = r36.h;
        long r14 = r36.i;
        mc0 r2 = r36.j;
        if ((r49 & 1024) == 0) goto L21;
        int r17 = r36.k;
    L22:
        int r3 = r36.l;
        long r11 = r36.m;
        if ((r49 & 8192) == 0) goto L25;
        long r21 = r36.n;
    L26:
        long r13 = r36.o;
        long r1 = r36.p;
        boolean r15 = r36.q;
        int r16 = r36.r;
        if ((r49 & 262144) == 0) goto L29;
        int r29 = r36.s;
    L31:
        if ((r49 & 524288) == 0) goto L33;
        int r30 = r36.t;
    L35:
        if ((r49 & 1048576) == 0) goto L37;
        long r31 = r36.u;
    L39:
        if ((r49 & 2097152) == 0) goto L41;
        int r33 = r36.v;
    L42:
        int r18 = r36.w;
        String r19 = r36.x;
        r36.getClass();
        r4.getClass();
        if (r5 == 0) goto L51;
        r6.getClass();
        r7.getClass();
        r8.getClass();
        r9.getClass();
        r2.getClass();
        if (r3 == 0) goto L50;
        if (r16 != 0) goto L48;
        throw null;
    L48:
        return new dd5(r4, r5, r6, r7, r8, r9, r10, r12, r14, r2, r17, r3, r11, r21, r13, r1, r15, r16, r29, r30, r31, r33, r18, r19);
    L50:
        throw null;
    L51:
        throw null;
    L41:
        r33 = r48;
        goto L42
    L37:
        r31 = r46;
        goto L39
    L33:
        r30 = r45;
        goto L35
    L29:
        r29 = r44;
        goto L31
    L25:
        r21 = r42;
        goto L26
    L21:
        r17 = r41;
        goto L22
    L17:
        r8 = r40;
        goto L18
    L13:
        r6 = r39;
        goto L14
    L9:
        r5 = r38;
        goto L11
    L5:
        r4 = r37;
        goto L7
    }

    public final long a() {
        int r1 = this.b;
        int r2 = this.k;
        if (r1 != 1) goto L6;
        if (r2 <= 0) goto L6;
        boolean r3 = true;
    L7:
        long r4 = this.n;
        boolean r6 = d();
        long r7 = this.i;
        long r9 = this.h;
        int r11 = this.l;
        if (r11 == 0) goto L45;
        long r12 = this.u;
        int r5 = this.s;
        if (r12 == Long.MAX_VALUE) goto L18;
        if (r6 == false) goto L18;
        if (r5 == 0) goto L17;
        long r8 = r4 + 900000;
        if (r12 >= r8) goto L17;
        return r8;
    L17:
        return r12;
    L18:
        if (r3 == false) goto L28;
        long r10 = this.m;
        if (r11 != 2) goto L22;
        long r13 = r10 * ((long) r2);
    L24:
        if (r13 <= 18000000) goto L27;
        r13 = 18000000;
    L27:
        return r4 + r13;
    L22:
        r13 = (long) Math.scalb(r10, r2 - 1);
        goto L24
    L28:
        long r0 = this.g;
        if (r6 == false) goto L40;
        if (r5 != 0) goto L32;
        long r14 = r4 + r0;
    L34:
        if (r7 == r9) goto L38;
        if (r5 != 0) goto L38;
        return (r9 - r7) + r14;
    L38:
        return r14;
    L32:
        r14 = r4 + r9;
        goto L34
    L40:
        if (r4 != (-1)) goto L43;
        return Long.MAX_VALUE;
    L43:
        return r4 + r0;
    L45:
        throw null;
    L6:
        r3 = false;
        goto L7
    }

    public final boolean c() {
        return !h12.c(mc0.j, this.j);
    }

    public final boolean d() {
        if (this.h == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof dd5) == false) goto L82;
        dd5 r6 = (dd5) r5;
        if (h12.c(this.a, r6.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        if (h12.c(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        if (h12.c(this.d, r6.d) == true) goto L20;
        return false;
    L20:
        if (h12.c(this.e, r6.e) == true) goto L23;
        return false;
    L23:
        if (h12.c(this.f, r6.f) == true) goto L26;
        return false;
    L26:
        if (this.g == r6.g) goto L29;
        return false;
    L29:
        if (this.h == r6.h) goto L32;
        return false;
    L32:
        if (this.i == r6.i) goto L35;
        return false;
    L35:
        if (h12.c(this.j, r6.j) == true) goto L38;
        return false;
    L38:
        if (this.k == r6.k) goto L41;
        return false;
    L41:
        if (this.l == r6.l) goto L44;
        return false;
    L44:
        if (this.m == r6.m) goto L47;
        return false;
    L47:
        if (this.n == r6.n) goto L50;
        return false;
    L50:
        if (this.o == r6.o) goto L53;
        return false;
    L53:
        if (this.p == r6.p) goto L56;
        return false;
    L56:
        if (this.q == r6.q) goto L59;
        return false;
    L59:
        if (this.r == r6.r) goto L62;
        return false;
    L62:
        if (this.s == r6.s) goto L65;
        return false;
    L65:
        if (this.t == r6.t) goto L68;
        return false;
    L68:
        if (this.u == r6.u) goto L71;
        return false;
    L71:
        if (this.v == r6.v) goto L74;
        return false;
    L74:
        if (this.w == r6.w) goto L77;
        return false;
    L77:
        if (h12.c(this.x, r6.x) == true) goto L80;
        return false;
    L80:
        return true;
    L82:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (xa3.w(this.b) + r0) * 31;
        int r1 = f34.e(this.c, r2, 31);
        int r3 = f34.e(this.d, r1, 31);
        int r4 = (this.e.hashCode() + r3) * 31;
        int r5 = xa3.b(xa3.b(xa3.b((this.f.hashCode() + r4) * 31, 31, this.g), 31, this.h), 31, this.i);
        int r6 = (this.j.hashCode() + r5) * 31;
        int r7 = f34.d(this.k, r6, 31);
        int r8 = xa3.c(xa3.b(xa3.b(xa3.b(xa3.b((xa3.w(this.l) + r7) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        int r9 = (xa3.w(this.r) + r8) * 31;
        int r10 = f34.d(this.s, r9, 31);
        int r11 = xa3.b(f34.d(this.t, r10, 31), 31, this.u);
        int r12 = f34.d(this.v, r11, 31);
        int r13 = f34.d(this.w, r12, 31);
        String r14 = this.x;
        if (r14 != null) goto L5;
        int r15 = 0;
    L7:
        return r13 + r15;
    L5:
        r15 = r14.hashCode();
        goto L7
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    public dd5(String r4, int r5, String r6, String r7, oh0 r8, oh0 r9, long r10, long r12, long r14, mc0 r16, int r17, int r18, long r19, long r21, long r23, long r25, boolean r27, int r28, int r29, int r30, long r31, int r33, int r34, String r35) {
        r4.getClass();
        if (r5 == 0) goto L11;
        r6.getClass();
        r7.getClass();
        r8.getClass();
        r9.getClass();
        r16.getClass();
        if (r18 == 0) goto L10;
        if (r28 == 0) goto L9;
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r12;
        this.i = r14;
        this.j = r16;
        this.k = r17;
        this.l = r18;
        this.m = r19;
        this.n = r21;
        this.o = r23;
        this.p = r25;
        this.q = r27;
        this.r = r28;
        this.s = r29;
        this.t = r30;
        this.u = r31;
        this.v = r33;
        this.w = r34;
        this.x = r35;
        return;
    L9:
        throw null;
    L10:
        throw null;
    L11:
        throw null;
    }
}
