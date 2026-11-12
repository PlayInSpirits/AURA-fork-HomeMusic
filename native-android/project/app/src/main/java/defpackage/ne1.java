package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 {
    public final wv4 a;
    public final rv4 b;
    public final be3 c;
    public xv4 d;
    public qm0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final tb1 j;
    public final be3 k;
    public final be3 l;
    public boolean m;

    public ne1(wv4 r3, xv4 r4, qm0 r5, tb1 r6) {
        this.a = r3;
        this.d = r4;
        this.e = r5;
        this.j = r6;
        this.b = new rv4();
        this.c = new be3();
        this.k = new be3(1);
        this.l = new be3();
        this.d = r4;
        this.e = r5;
        r3.g(r6);
        e();
    }

    public final int a() {
        if (this.m == true) goto L6;
        int r0 = this.d.g[this.f];
    L10:
        if (b() != null) goto L12;
        return r0;
    L12:
        return 1073741824 | r0;
    L6:
        if (this.b.j[this.f] == false) goto L8;
        r0 = 1;
        goto L10
    L8:
        r0 = 0;
        goto L10
    }

    public final qv4 b() {
        if (this.m == false) goto L16;
        rv4 r0 = this.b;
        qm0 r1 = r0.a;
        String r2 = f35.a;
        int r3 = r1.a;
        qv4 r4 = r0.m;
        if (r4 != null) goto L9;
        r4 = this.d.a.l[r3];
    L9:
        if (r4 != null) goto L11;
        return null;
    L11:
        if (r4.a == false) goto L15;
        return r4;
    L15:
        return null;
    L16:
        return null;
    }

    public final boolean c() {
        this.f++;
        if (this.m == true) goto L5;
        return false;
    L5:
        int r0 = this.g + 1;
        this.g = r0;
        int[] r3 = this.b.g;
        int r4 = this.h;
        if (r0 != r3[r4]) goto L9;
        this.h = r4 + 1;
        this.g = 0;
        return false;
    L9:
        return true;
    }

    public final int d(int r11, int r12) {
        qv4 r0 = b();
        if (r0 != null) goto L5;
        return 0;
    L5:
        int r2 = r0.d;
        rv4 r3 = this.b;
        if (r2 == 0) goto L8;
        be3 r1 = r3.n;
    L9:
        int r4 = this.f;
        if (r3.k == true) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == true) goto L19;
        if (r12 != 0) goto L19;
        boolean r6 = false;
    L20:
        be3 r7 = this.k;
        byte[] r8 = r7.a;
        if (r6 == false) goto L23;
        int r9 = 128;
    L24:
        r8[0] = (byte) (r9 | r2);
        r7.N(0);
        wv4 r10 = this.a;
        r10.b(r7, 1, 1);
        r10.b(r1, r2, 1);
        if (r6 == false) goto L27;
        be3 r13 = this.c;
        if (r5 == true) goto L32;
        r13.K(8);
        byte[] r14 = r13.a;
        r14[0] = 0;
        r14[1] = 1;
        r14[2] = 0;
        r14[3] = (byte) (r12 & 255);
        r14[4] = (byte) ((r11 >> 24) & 255);
        r14[5] = (byte) ((r11 >> 16) & 255);
        r14[6] = (byte) ((r11 >> 8) & 255);
        r14[7] = (byte) (r11 & 255);
        r10.b(r13, 8, 1);
        return r2 + 9;
    L32:
        be3 r15 = r3.n;
        int r16 = r15.H();
        r15.O(-2);
        int r17 = (r16 * 6) + 2;
        if (r12 == 0) goto L35;
        r13.K(r17);
        byte[] r18 = r13.a;
        r15.k(r18, 0, r17);
        int r19 = (((r18[2] & 255) << 8) | (r18[3] & 255)) + r12;
        r18[2] = (byte) ((r19 >> 8) & 255);
        r18[3] = (byte) (r19 & 255);
    L36:
        r10.b(r13, r17, 1);
        return (r2 + 1) + r17;
    L35:
        r13 = r15;
        goto L36
    L27:
        return r2 + 1;
    L23:
        r9 = 0;
    L19:
        r6 = true;
        goto L20
    L12:
        if (r3.l[r4] == false) goto L14;
        r5 = true;
        goto L15
    L8:
        byte[] r20 = r0.e;
        String r21 = f35.a;
        int r22 = r20.length;
        be3 r23 = this.l;
        r23.L(r22, r20);
        r2 = r20.length;
        r1 = r23;
        goto L9
    }

    public final void e() {
        rv4 r0 = this.b;
        r0.d = 0;
        r0.p = 0;
        r0.q = false;
        r0.k = false;
        r0.o = false;
        r0.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
