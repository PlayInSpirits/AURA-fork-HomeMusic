package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aj4 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final zi4 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public aj4(int r1, int r2, float r3, float r4, int r5, boolean r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r1 / r5;
        this.f = r1 / 400;
        int r7 = r1 / 65;
        this.g = r7;
        this.h = r7 * 2;
        if (r6 == false) goto L5;
        zi4 r8 = new yi4(this);
    L6:
        this.i = r8;
        return;
    L5:
        r8 = new yb4(this);
        goto L6
    }

    public final void a(int r5, int r6) {
        zi4 r0 = this.i;
        r0.j(r6);
        Object r1 = r0.h();
        int r2 = this.b;
        System.arraycopy(r1, r5 * r2, r0.i(), this.k * r2, r2 * r6);
        this.k += r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int r1 = this.k;
        float r2 = this.c;
        float r3 = this.d;
        double r4 = r2 / r3;
        float r5 = this.e * r3;
        int r6 = this.a;
        int r7 = 1;
        zi4 r8 = this.i;
        int r14 = this.b;
        if (r4 <= 1.0000100135803223d) goto L5;
    L9:
        int r9 = this.j;
        int r10 = this.h;
        if (r9 < r10) goto L8;
        int r12 = 0;
    L13:
        int r11 = this.o;
        if (r11 <= 0) goto L17;
        int r13 = Math.min(r10, r11);
        a(r12, r13);
        this.o -= r13;
        r12 = r12 + r13;
        float r17 = r5;
        double r22 = r4;
        int r18 = r7;
        int r15 = r10;
    L54:
        if ((r12 + r15) > r9) goto L55;
        r10 = r15;
        r5 = r17;
        r7 = r18;
        r4 = r22;
        goto L13
    L55:
        int r16 = this.j - r12;
        System.arraycopy(r8.h(), r12 * r14, r8.h(), 0, r16 * r14);
        this.j = r16;
    L57:
        if (r17 != 1.0f) goto L59;
        return;
    L59:
        if (this.k == r1) goto L100;
        long r19 = (long) (r6 / r17);
        long r110 = r6;
    L63:
        if (r19 == 0) goto L71;
        if (r110 == 0) goto L71;
        if ((r19 % 2) != 0) goto L71;
        if ((r110 % 2) != 0) goto L71;
        r19 = r19 / 2;
        r110 = r110 / 2;
    L71:
        int r20 = this.k - r1;
        r8.n(r20);
        System.arraycopy(r8.i(), r1 * r14, r8.l(), this.l * r14, r20 * r14);
        this.k = r1;
        this.l += r20;
        int r21 = 0;
    L72:
        int r23 = this.l - 1;
        if (r21 >= r23) goto L85;
    L74:
        int r24 = this.m + 1;
        long r25 = r24;
        long r26 = r25 * r19;
        long r27 = this.n;
        if (r26 <= (r27 * r110)) goto L77;
        int r111 = r18;
        r8.j(r111);
        r8.c(r21, r110, r19);
        this.n += r111;
        this.k += r111;
        goto L74
    L77:
        int r112 = r18;
        this.m = r24;
        if (r25 != r110) goto L84;
        this.m = 0;
        if (r27 != r19) goto L82;
        boolean r113 = r112;
    L83:
        rr2.w(r113);
        this.n = 0;
        goto L84
    L82:
        r113 = 0;
    L84:
        r21 = r21 + 1;
        r18 = r112;
        goto L72
    L85:
        if (r23 == 0) goto L101;
        System.arraycopy(r8.l(), r23 * r14, r8.l(), 0, (this.l - r23) * r14);
        this.l -= r23;
        return;
    L101:
        return;
    L100:
        return;
    L17:
        if (r6 <= 4000) goto L19;
        int r114 = r6 / 4000;
    L20:
        int r115 = this.g;
        int r116 = this.f;
        if (r14 != r7) goto L24;
        if (r114 != r7) goto L24;
        int r117 = r8.f(r12, r116, r115);
        r17 = r5;
    L38:
        if (r8.k() == false) goto L40;
        int r28 = this.p;
    L41:
        r8.g();
        this.p = r117;
        double r118 = this.q;
        if (r4 > 1.0d) goto L44;
        r22 = r4;
        int r119 = r7;
        r15 = r10;
        if (r22 >= 0.5d) goto L51;
        double r29 = ((((double) r28) * r22) / (1.0d - r22)) + r118;
        int r30 = (int) Math.round(r29);
        this.q = r29 - ((double) r30);
    L52:
        int r31 = r28 + r30;
        r8.j(r31);
        r18 = r119;
        System.arraycopy(r8.h(), r12 * r14, r8.i(), this.k * r14, r28 * r14);
        int r120 = r12;
        r8.m(r30, this.b, this.k + r28, r28 + r12, r120);
        this.k += r31;
        r12 = r120 + r30;
        goto L54
    L51:
        double r210 = ((((2.0d * r22) - 1.0d) * ((double) r28)) / (1.0d - r22)) + r118;
        int r32 = (int) Math.round(r210);
        this.o = r32;
        this.q = r210 - ((double) r32);
        r30 = r28;
        goto L52
    L44:
        if (r4 < 2.0d) goto L46;
        double r33 = (((double) r28) / (r4 - 1.0d)) + r118;
        int r121 = (int) Math.round(r33);
        r22 = r4;
        this.q = r33 - ((double) r121);
        r8 = r8;
    L47:
        r8.j(r121);
        int r34 = r10;
        int r35 = r121;
        r8.m(r35, this.b, this.k, r12, r12 + r28);
        this.k += r35;
        r12 = (r28 + r35) + r12;
        r15 = r34;
        r18 = r7;
        goto L54
    L46:
        r22 = r4;
        double r211 = (((2.0d - r22) * ((double) r28)) / (r22 - 1.0d)) + r118;
        int r36 = (int) Math.round(r211);
        this.o = r36;
        this.q = r211 - ((double) r36);
        r121 = r28;
        goto L47
    L40:
        r28 = r117;
    L24:
        r8.e(r12, r114);
        r17 = r5;
        int r37 = r8.q(r116 / r114, r115 / r114);
        if (r114 == r7) goto L36;
        int r38 = r37 * r114;
        int r122 = r114 * 4;
        int r123 = r38 - r122;
        int r39 = r38 + r122;
        if (r123 < r116) goto L30;
        r116 = r123;
    L30:
        if (r39 > r115) goto L33;
        r115 = r39;
    L33:
        if (r14 != r7) goto L35;
        r117 = r8.f(r12, r116, r115);
        goto L38
    L35:
        r8.e(r12, r7);
        r117 = r8.q(r116, r115);
        goto L38
    L36:
        r117 = r37;
        goto L38
    L19:
        r114 = r7;
    L8:
        r17 = r5;
        r18 = 1;
        goto L57
    L5:
        if (r4 < 0.9999899864196777d) goto L9;
        a(0, this.j);
        this.j = 0;
        goto L8
    }
}
