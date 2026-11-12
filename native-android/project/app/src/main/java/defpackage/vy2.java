package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy2 implements mz0 {
    public final be3 a;
    public final wy2 b;
    public final String c;
    public final int d;
    public final String e;
    public wv4 f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public vy2(int r4, String r5, String r6) {
        this.h = 0;
        be3 r1 = new be3(4);
        this.a = r1;
        r1.a[0] = -1;
        this.b = new wy2();
        this.n = -9223372036854775807L;
        this.c = r5;
        this.d = r4;
        this.e = r6;
    }

    @Override // defpackage.mz0
    public final void a(be3 r13) {
        this.f.getClass();
    L4:
        if (r13.a() <= 0) goto L46;
        int r0 = this.h;
        be3 r1 = this.a;
        boolean r4 = true;
        if (r0 != 0) goto L7;
        byte[] r2 = r13.a;
        int r5 = r13.b;
        int r6 = r13.c;
    L30:
        if (r5 >= r6) goto L45;
        byte r7 = r2[r5];
        if ((r7 & 255) != 255) goto L34;
        boolean r8 = true;
    L36:
        if (this.k == true) goto L38;
    L40:
        boolean r9 = false;
    L41:
        this.k = r8;
        if (r9 == true) goto L43;
        r5 = r5 + 1;
        goto L30
    L43:
        r13.N(r5 + 1);
        this.k = false;
        r1.a[1] = r2[r5];
        this.i = 2;
        this.h = 1;
        goto L4
    L38:
        if ((r7 & 224) != 224) goto L40;
        r9 = true;
        goto L41
    L34:
        r8 = false;
        goto L36
    L45:
        r13.N(r6);
        goto L4
    L7:
        if (r0 != 1) goto L8;
        int r3 = Math.min(r13.a(), 4 - this.i);
        r13.k(r1.a, this.i, r3);
        int r10 = this.i + r3;
        this.i = r10;
        if (r10 < 4) goto L4;
        r1.N(0);
        int r11 = r1.m();
        wy2 r12 = this.b;
        if (r12.a(r11) == false) goto L24;
        this.m = r12.b;
        if (this.j == true) goto L28;
        this.l = (((long) r12.f) * 1000000) / ((long) r12.c);
        sb1 r14 = new sb1();
        r14.a = this.g;
        r14.l = lw2.m(this.e);
        r14.m = lw2.m((String) r12.g);
        r14.n = 4096;
        r14.E = r12.d;
        r14.F = r12.c;
        r14.d = this.c;
        r14.f = this.d;
        this.f.g(new tb1(r14));
        this.j = true;
    L28:
        r1.N(0);
        this.f.e(4, r1);
        this.h = 2;
        goto L4
    L24:
        this.i = 0;
        this.h = 1;
        goto L4
    L8:
        if (r0 != 2) goto L17;
        int r15 = Math.min(r13.a(), this.m - this.i);
        this.f.e(r15, r13);
        int r16 = this.i + r15;
        this.i = r16;
        if (r16 < this.m) goto L4;
        if (this.n != (-9223372036854775807L)) goto L16;
        r4 = false;
    L16:
        rr2.w(r4);
        this.f.a(this.n, 1, this.m, 0, null);
        this.n += this.l;
        this.i = 0;
        this.h = 0;
        goto L4
    L17:
        tb4.a();
        return;
    }

    @Override // defpackage.mz0
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void d(boolean r1) {
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.n = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r2, sy4 r3) {
        r3.a();
        r3.b();
        this.g = r3.e;
        r3.b();
        this.f = r2.t(r3.d, 1);
    }
}
