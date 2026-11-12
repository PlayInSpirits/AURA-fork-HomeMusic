package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wl1 implements k51 {
    public final be3 a;
    public m51 b;
    public l51 c;
    public e20 d;
    public sy2 e;
    public int f;
    public int g;
    public long h;
    public int i;
    public long j;

    public wl1() {
        this.a = new be3(16);
        this.j = -1;
        this.f = 0;
    }

    @Override // defpackage.k51
    public final void a() {
        sy2 r0 = this.e;
        if (r0 == null) goto L6;
        r0.getClass();
        this.e = null;
        return;
    }

    @Override // defpackage.k51
    public final int b(l51 r24, t71 r25) {
    L3:
        int r3 = this.f;
        if (r3 != 0) goto L5;
        int r4 = this.i;
        be3 r12 = this.a;
        if (r4 != 0) goto L38;
        if (r24.a(r12.a, 0, 8, true) == false) goto L34;
        this.i = 8;
        r12.N(0);
        this.h = r12.C();
        this.g = r12.m();
        goto L38
    L34:
        m51 r1 = this.b;
        r1.getClass();
        r1.p();
        this.b.w(new bo(-9223372036854775807L));
        this.f = 4;
        return -1;
    L38:
        if (this.h != 1) goto L41;
        r24.readFully(r12.a, 8, 8);
        this.i += 8;
        this.h = r12.G();
    L41:
        if (this.g == 1836086884) goto L42;
        this.f = 1;
        goto L3
    L42:
        long r5 = r24.getPosition();
        this.j = r5;
        long r7 = this.i;
        xx2 r13 = new xx2(0, r5 - r7, -9223372036854775807L, r5, this.h - r7);
        m51 r6 = this.b;
        r6.getClass();
        wv4 r8 = r6.t(1024, 4);
        sb1 r9 = new sb1();
        r9.l = lw2.m("image/heic");
        r9.k = new qv2(new pv2[]{r13});
        f34.l(r9, r8);
        this.f = 2;
        goto L3
    L5:
        if (r3 != 1) goto L7;
        r24.l((int) (this.h - ((long) this.i)));
        this.i = 0;
        this.f = 0;
        goto L3
    L7:
        if (r3 != 2) goto L8;
        if (this.e != null) goto L25;
        this.e = new sy2(xn4.m, 8);
    L25:
        e20 r10 = new e20(r24, this.j);
        this.d = r10;
        if (this.e.c(r10) == true) goto L27;
        m51 r11 = this.b;
        r11.getClass();
        r11.p();
        this.b.w(new bo(-9223372036854775807L));
        this.f = 4;
        goto L3
    L27:
        sy2 r14 = this.e;
        long r15 = this.j;
        m51 r16 = this.b;
        r16.getClass();
        r14.f(new e20(r15, r16, 6));
        this.f = 3;
        goto L3
    L8:
        if (r3 == 3) goto L14;
        if (r3 != 4) goto L11;
        return -1;
    L11:
        tb4.a();
        return 0;
    L14:
        if (this.d != null) goto L16;
    L17:
        this.c = r24;
        this.d = new e20(r24, this.j);
    L18:
        sy2 r2 = this.e;
        r2.getClass();
        int r17 = r2.b(this.d, r25);
        if (r17 != 1) goto L21;
        r25.a += this.j;
    L21:
        return r17;
    L16:
        if (r24 == this.c) goto L18;
        goto L17
    }

    @Override // defpackage.k51
    public final boolean c(l51 r1) {
        return ji2.S((rk0) r1, true);
    }

    @Override // defpackage.k51
    public final void d(long r3, long r5) {
        if (r3 != 0) goto L9;
        this.f = 0;
        this.i = 0;
        this.j = -1;
        if (this.e == null) goto L12;
        this.e = null;
        return;
    L12:
        return;
    L9:
        if (this.f != 3) goto L13;
        sy2 r2 = this.e;
        r2.getClass();
        r2.d(r3, r5);
        return;
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.b = r1;
    }
}
