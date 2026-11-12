package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rd3 {
    public String a;
    public zs4 b;
    public ha1 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public oo0 i;
    public ic j;
    public boolean k;
    public long l;
    public mw2 m;
    public qd3 n;
    public r62 o;
    public long p;
    public long q;

    public rd3(String r1, zs4 r2, ha1 r3, int r4, boolean r5, int r6, int r7) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = gz1.a;
        this.l = 0;
        this.p = qc0.g(0, 0, 0, 0);
    }

    public final boolean a(long r22, r62 r24) {
        this.q = (this.q << 2) | 3;
        boolean r3 = false;
        if (this.g <= 1) goto L20;
        zs4 r2 = this.b;
        mw2 r6 = this.m;
        oo0 r7 = this.i;
        r7.getClass();
        mw2 r4 = j51.t(r6, r24, r2, r7, this.c);
        this.m = r4;
        int r8 = this.g;
        ro0 r13 = r4.c;
        float r9 = r4.g;
        float r10 = r4.f;
        if (Float.isNaN(r9) == false) goto L7;
    L10:
        String r11 = nw2.a;
        zs4 r12 = r4.e;
        ha1 r14 = r4.d;
        u01 r15 = u01.n;
        ic r16 = new ic(new mc(r11, r12, r15, r15, r14, r13, false), 1, 1, qc0.b(0, 0, 15));
        int r17 = 1;
        float r18 = new ic(new mc(nw2.b, r4.e, r15, r15, r4.d, r13, true), 2, 1, qc0.b(0, 0, 15)).f;
        float r5 = r16.f;
        r10 = r18 - r5;
        r4.g = r5;
        r4.f = r10;
    L11:
        if (r8 == r17) goto L18;
        int r19 = Math.round((r10 * (r8 - r17)) + r5);
        if (r19 >= 0) goto L15;
        r19 = 0;
    L15:
        int r20 = nc0.g(r22);
        if (r19 <= r20) goto L19;
        r19 = r20;
    L19:
        long r21 = qc0.a(nc0.j(r22), nc0.h(r22), r19, nc0.g(r22));
    L21:
        ic r23 = this.j;
        if (r23 == null) goto L61;
        qd3 r110 = this.n;
        if (r110 == null) goto L61;
        if (r110.a() == true) goto L61;
        if (r24 != this.o) goto L61;
        if (nc0.b(r21, this.p) == true) goto L48;
        if (nc0.h(r21) != nc0.h(this.p)) goto L61;
        if (nc0.j(r21) != nc0.j(this.p)) goto L61;
        if (nc0.g(r21) < r23.f) goto L61;
        if (r23.d.d == true) goto L61;
    L48:
        if (nc0.b(r21, this.p) == true) goto L60;
        ic r1 = this.j;
        r1.getClass();
        long r111 = qc0.d(r21, (((long) ji2.g(Math.min(r1.a.v.c(), r1.c()))) << 32) | (((long) ji2.g(r1.f)) & 4294967295L));
        this.l = r111;
        if (this.d != 3) goto L53;
    L57:
        boolean r25 = false;
    L59:
        this.k = r25;
        this.p = r21;
        goto L60
    L53:
        if (((int) (r111 >> 32)) >= r1.c()) goto L55;
    L58:
        r25 = true;
        goto L59
    L55:
        if (((int) (r111 & 4294967295L)) >= r1.f) goto L57;
    L60:
        return false;
    L61:
        qd3 r26 = this.n;
        if (r26 != null) goto L64;
    L67:
        this.o = r24;
        String r112 = this.a;
        zs4 r113 = ud3.g0(this.b, r24);
        oo0 r27 = this.i;
        r27.getClass();
        ha1 r28 = this.c;
        boolean r114 = this.e;
        u01 r115 = u01.n;
        r26 = new mc(r112, r113, r115, r115, r28, r27, r114);
    L68:
        this.n = r26;
        long r116 = ji2.w(r21, this.e, this.d, r26.d());
        boolean r29 = this.e;
        int r117 = this.d;
        int r118 = this.f;
        if (r29 == true) goto L79;
        if (r117 != 2) goto L73;
    L77:
        int r119 = 1;
    L82:
        ic r120 = new ic((mc) r26, r119, r117, r116);
        this.p = r21;
        int r30 = ji2.g(r120.c());
        float r31 = r120.f;
        long r32 = qc0.d(r21, (((long) r30) << 32) | (((long) ji2.g(r31)) & 4294967295L));
        this.l = r32;
        if (this.d != 3) goto L86;
    L90:
        this.k = r3;
        this.j = r120;
        return true;
    L86:
        if (((int) (r32 >> 32)) >= r120.c()) goto L88;
    L89:
        r3 = true;
        goto L90
    L88:
        if (((int) (r32 & 4294967295L)) >= r31) goto L90;
    L73:
        if (r117 == 4) goto L77;
        if (r117 == 5) goto L77;
    L79:
        if (r118 < 1) goto L77;
        r119 = r118;
        goto L82
    L64:
        if (r24 != this.o) goto L67;
        if (r26.a() == false) goto L68;
    L18:
        r19 = nc0.i(r22);
        goto L19
    L7:
        if (Float.isNaN(r10) == true) goto L10;
        r5 = r9;
        r17 = 1;
        goto L11
    L20:
        r21 = r22;
        goto L21
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.p = qc0.g(0, 0, 0, 0);
        this.l = 0;
        this.k = false;
    }

    public final void c(oo0 r6) {
        oo0 r0 = this.i;
        if (r6 == null) goto L5;
        int r1 = gz1.b;
        long r2 = gz1.a(r6.g(), r6.J());
    L6:
        if (r0 != null) goto L9;
        this.i = r6;
        this.h = r2;
        return;
    L9:
        if (r6 != null) goto L11;
    L13:
        this.i = r6;
        this.h = r2;
        this.q = (this.q << 2) | 1;
        b();
        return;
    L11:
        if (this.h != r2) goto L13;
        return;
    L5:
        r2 = gz1.a;
        goto L6
    }

    public final String toString() {
        if (this.j == null) goto L5;
        String r0 = "<paragraph>";
    L6:
        String r1 = gz1.b(this.h);
        long r2 = this.q;
        return b11.p(b11.u("ParagraphLayoutCache(paragraph=", r0, ", lastDensity=", r1, ", history="), r2, ", constraints=$)");
    L5:
        r0 = "null";
        goto L6
    }
}
