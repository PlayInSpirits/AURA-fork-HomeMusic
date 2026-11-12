package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dl1 implements mz0 {
    public final jv3 a;
    public String b;
    public wv4 c;
    public cl1 d;
    public boolean e;
    public final boolean[] f;
    public final n41 g;
    public final n41 h;
    public final n41 i;
    public final n41 j;
    public final n41 k;
    public long l;
    public long m;
    public final be3 n;

    public dl1(jv3 r3) {
        this.a = r3;
        this.f = new boolean[3];
        this.g = new n41(32);
        this.h = new n41(33);
        this.i = new n41(34);
        this.j = new n41(39);
        this.k = new n41(40);
        this.m = -9223372036854775807L;
        this.n = new be3();
    }

    @Override // defpackage.mz0
    public final void a(be3 r13) {
        this.c.getClass();
        String r1 = f35.a;
    L4:
        if (r13.a() <= 0) goto L26;
        int r2 = r13.b;
        int r7 = r13.c;
        byte[] r8 = r13.a;
        this.l += (long) r13.a();
        this.c.e(r13.a(), r13);
    L6:
        if (r2 >= r7) goto L4;
        int r3 = uc5.o(r8, r2, r7, this.f);
        if (r3 == r7) goto L9;
        int r9 = (r8[r3 + 3] & 126) >> 1;
        if (r3 > 0) goto L14;
    L17:
        int r4 = 3;
    L16:
        int r10 = r3;
        int r11 = r4;
        int r5 = r10 - r2;
        if (r5 <= 0) goto L21;
        g(r8, r2, r10);
    L21:
        int r6 = r7 - r10;
        long r12 = this.l - ((long) r6);
        if (r5 >= 0) goto L24;
        int r14 = -r5;
    L25:
        b(r6, r14, r12, this.m);
        h(r6, r9, r12, this.m);
        r2 = r10 + r11;
        goto L6
    L24:
        r14 = 0;
        goto L25
    L14:
        if (r8[r3 - 1] != 0) goto L17;
        r3 = r3 - 1;
        r4 = 4;
        goto L16
    L9:
        g(r8, r2, r7);
        return;
    }

    public final void b(int r21, int r22, long r23, long r25) {
        c6 r4 = (c6) this.a.p;
        cl1 r5 = this.d;
        boolean r6 = this.e;
        boolean r8 = false;
        if (r5.j == false) goto L8;
        if (r5.g == false) goto L8;
        r5.m = r5.c;
        r5.j = false;
    L17:
        if (this.e == true) goto L31;
        n41 r7 = this.g;
        r7.d(r22);
        n41 r9 = this.h;
        r9.d(r22);
        n41 r10 = this.i;
        r10.d(r22);
        if (r7.e == false) goto L31;
        if (r9.e == false) goto L31;
        if (r10.e == false) goto L31;
        String r11 = this.b;
        int r12 = r7.c;
        byte[] r13 = new byte[(r9.c + r12) + r10.c];
        System.arraycopy((byte[]) r7.f, 0, r13, 0, r12);
        System.arraycopy((byte[]) r9.f, 0, r13, r7.c, r9.c);
        System.arraycopy((byte[]) r10.f, 0, r13, r7.c + r9.c, r10.c);
        String r14 = null;
        r13 r15 = uc5.I((byte[]) r9.f, 3, r9.c, null);
        p13 r16 = r15.b;
        if (r16 == null) goto L27;
        r14 = i40.a(r16.a, r16.b, r16.c, r16.d, r16.e, r16.f);
    L27:
        sb1 r17 = new sb1();
        r17.a = r11;
        r17.l = lw2.m("video/mp2t");
        r17.m = lw2.m("video/hevc");
        r17.j = r14;
        r17.t = r15.e;
        r17.u = r15.f;
        r17.v = r15.g;
        r17.w = r15.h;
        r17.C = new c50(r15.k, r15.l, r15.m, null, r15.c + 8, r15.d + 8);
        r17.z = r15.i;
        r17.o = r15.j;
        r17.D = r15.a + 1;
        r17.p = Collections.singletonList(r13);
        tb1 r18 = new tb1(r17);
        this.c.g(r18);
        int r19 = r18.p;
        if (r19 == (-1)) goto L30;
        r8 = true;
    L30:
        rr2.w(r8);
        r4.x(r19);
        this.e = true;
    L31:
        n41 r20 = this.j;
        boolean r24 = r20.d(r22);
        be3 r26 = this.n;
        if (r24 == false) goto L34;
        r26.L(uc5.b0(r20.c, (byte[]) r20.f), (byte[]) r20.f);
        r26.O(5);
        r4.a(r25, r26);
    L34:
        n41 r0 = this.k;
        if (r0.d(r22) == false) goto L38;
        r26.L(uc5.b0(r0.c, (byte[]) r0.f), (byte[]) r0.f);
        r26.O(5);
        r4.a(r25, r26);
        return;
    L38:
        return;
    L8:
        if (r5.h == false) goto L10;
    L11:
        if (r6 == true) goto L13;
    L15:
        r5.k = r5.b;
        r5.l = r5.e;
        r5.m = r5.c;
        r5.i = true;
        goto L17
    L13:
        if (r5.i == false) goto L15;
        r5.a(r21 + ((int) (r23 - r5.b)));
        goto L15
    L10:
        if (r5.g == false) goto L17;
        goto L11
    }

    @Override // defpackage.mz0
    public final void c() {
        this.l = 0;
        this.m = -9223372036854775807L;
        uc5.i(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        ((c6) this.a.p).j(0);
        cl1 r2 = this.d;
        if (r2 == null) goto L6;
        r2.f = false;
        r2.g = false;
        r2.h = false;
        r2.i = false;
        r2.j = false;
        return;
    }

    @Override // defpackage.mz0
    public final void d(boolean r8) {
        this.c.getClass();
        String r1 = f35.a;
        if (r8 == false) goto L6;
        ((c6) this.a.p).j(0);
        b(0, 0, this.l, this.m);
        h(0, 48, this.l, this.m);
        return;
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.m = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r3, sy4 r4) {
        r4.a();
        r4.b();
        this.b = r4.e;
        r4.b();
        wv4 r0 = r3.t(r4.d, 2);
        this.c = r0;
        this.d = new cl1(r0);
        this.a.a(r3, r4);
    }

    public final void g(byte[] r4, int r5, int r6) {
        cl1 r0 = this.d;
        if (r0.f == false) goto L13;
        int r2 = r0.d;
        int r1 = (r5 + 2) - r2;
        if (r1 < r6) goto L7;
        r0.d = (r6 - r5) + r2;
        goto L13
    L7:
        if ((r4[r1] & 128) == 0) goto L9;
        boolean r3 = true;
    L10:
        r0.g = r3;
        r0.f = false;
        goto L13
    L9:
        r3 = false;
    L13:
        if (this.e == true) goto L15;
        this.g.a(r4, r5, r6);
        this.h.a(r4, r5, r6);
        this.i.a(r4, r5, r6);
    L15:
        this.j.a(r4, r5, r6);
        this.k.a(r4, r5, r6);
    }

    public final void h(int r4, int r5, long r6, long r8) {
        cl1 r0 = this.d;
        boolean r1 = this.e;
        boolean r2 = false;
        r0.g = false;
        r0.h = false;
        r0.e = r8;
        r0.d = 0;
        r0.b = r6;
        if (r5 < 32) goto L21;
        if (r5 == 40) goto L21;
        if (r0.i == true) goto L10;
    L14:
        if (32 > r5) goto L18;
        if (r5 > 35) goto L18;
    L19:
        r0.h = !r0.j;
        r0.j = true;
    L18:
        if (r5 != 39) goto L21;
    L10:
        if (r0.j == true) goto L14;
        if (r1 == false) goto L13;
        r0.a(r4);
    L13:
        r0.i = false;
    L21:
        if (r5 >= 16) goto L23;
    L25:
        boolean r7 = false;
    L26:
        r0.c = r7;
        if (r7 == false) goto L29;
    L30:
        r2 = true;
    L31:
        r0.f = r2;
        if (this.e == true) goto L34;
        this.g.g(r5);
        this.h.g(r5);
        this.i.g(r5);
    L34:
        this.j.g(r5);
        this.k.g(r5);
        return;
    L29:
        if (r5 > 9) goto L31;
    L23:
        if (r5 > 21) goto L25;
        r7 = true;
        goto L26
    }
}
