package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends nn0 implements Comparable {
    public final boolean A;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public ln0(int r7, sv4 r8, int r9, jn0 r10, int r11, String r12, String r13) {
        super(r7, r8, r9);
        int r14 = 0;
        this.s = kq.n(r11, false);
        int r15 = this.q.e;
        int r16 = r10.C;
        yw1 r0 = r10.y;
        int r17 = r15 & (~r16);
        if ((r17 & 1) == 0) goto L5;
        boolean r18 = true;
    L6:
        this.t = r18;
        if ((r17 & 2) == 0) goto L9;
        boolean r19 = true;
    L10:
        this.u = r19;
        if (r13 == null) goto L14;
        yw1 r20 = yw1.o(r13);
    L17:
        int r21 = 0;
    L19:
        if (r21 >= r20.size()) goto L24;
        int r2 = pn0.c(this.q, (String) r20.get(r21), r10.D);
        if (r2 > 0) goto L25;
        r21 = r21 + 1;
    L25:
        this.v = r21;
        this.w = r2;
        if (r13 == null) goto L28;
        int r22 = 1088;
    L29:
        int r110 = this.q.f;
        gb3 r4 = pn0.k;
        if (r110 == 0) goto L33;
        if (r110 != r22) goto L33;
        int r23 = Integer.MAX_VALUE;
    L34:
        this.x = r23;
        tb1 r111 = this.q;
        if ((1088 & r111.f) == 0) goto L37;
        boolean r24 = true;
    L38:
        this.A = r24;
        int r25 = pn0.a(r111, r10.z);
        this.y = r25;
        if (pn0.f(r12) != null) goto L41;
        boolean r112 = true;
    L42:
        int r113 = pn0.c(this.q, r12, r112);
        this.z = r113;
        if (r2 <= 0) goto L45;
    L59:
        boolean r26 = true;
    L61:
        if (kq.n(r11, r10.B0) == false) goto L64;
        if (r26 == false) goto L64;
        r14 = 1;
    L64:
        this.r = r14;
        return;
    L45:
        if (r0.isEmpty() == false) goto L48;
        if (r23 > 0) goto L59;
    L48:
        if (r0.isEmpty() == false) goto L51;
        if (r25 != Integer.MAX_VALUE) goto L59;
    L51:
        if (this.t == true) goto L59;
        if (this.u == false) goto L56;
        if (r113 > 0) goto L59;
    L56:
        if (r10.x == true) goto L59;
        r26 = false;
        goto L61
    L41:
        r112 = false;
        goto L42
    L37:
        r24 = false;
    L33:
        r23 = Integer.bitCount(r22 & r110);
        goto L34
    L28:
        r22 = r10.A;
        goto L29
    L24:
        r2 = 0;
        r21 = Integer.MAX_VALUE;
        goto L25
    L14:
        if (r0.isEmpty() == false) goto L16;
        r20 = yw1.o("");
        goto L17
    L16:
        r20 = r0;
        goto L17
    L9:
        r19 = false;
        goto L10
    L5:
        r18 = false;
        goto L6
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final /* bridge */ /* synthetic */ boolean b(nn0 r1) {
        ln0 r2 = (ln0) r1;
        return false;
    }

    public final int c(ln0 r8) {
        boolean r0 = this.s;
        boolean r1 = r8.s;
        v60 r2 = v60.a.c(r0, r1);
        Integer r3 = Integer.valueOf(this.v);
        Integer r4 = Integer.valueOf(r8.v);
        x13 r5 = x13.o;
        x13 r6 = x13.p;
        v60 r7 = r2.b(r3, r4, r6);
        int r9 = r8.w;
        int r10 = this.w;
        v60 r11 = r7.a(r10, r9);
        int r12 = r8.x;
        int r13 = this.x;
        v60 r14 = r11.a(r13, r12).b(Integer.valueOf(this.y), Integer.valueOf(r8.y), r6).c(this.t, r8.t);
        Boolean r15 = Boolean.valueOf(this.u);
        Boolean r16 = Boolean.valueOf(r8.u);
        if (r10 == 0) goto L6;
        r5 = r6;
    L6:
        v60 r17 = r14.b(r15, r16, r5).a(this.z, r8.z);
        if (r13 != 0) goto L10;
        r17 = r17.d(this.A, r8.A);
    L10:
        return r17.e();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return c((ln0) r1);
    }
}
