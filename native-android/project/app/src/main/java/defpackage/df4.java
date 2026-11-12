package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class df4 implements k51 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public m51 f;
    public wv4 g;

    public df4(String r1, int r2, int r3) {
        this.a = r2;
        this.b = r3;
        this.c = r1;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r11, t71 r12) {
        int r13 = this.e;
        if (r13 == 1) goto L8;
        if (r13 != 2) goto L6;
        return -1;
    L6:
        tb4.a();
        return 0;
    L8:
        wv4 r14 = this.g;
        r14.getClass();
        int r15 = r14.f(r11, 1024, true);
        if (r15 != (-1)) goto L12;
        this.e = 2;
        this.g.a(0, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    L12:
        this.d += r15;
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r6) {
        int r2 = this.b;
        int r5 = this.a;
        if (r5 == (-1)) goto L6;
        if (r2 == (-1)) goto L6;
        boolean r3 = true;
    L7:
        rr2.w(r3);
        be3 r4 = new be3(r2);
        ((rk0) r6).e(r4.a, 0, r2, false);
        if (r4.H() != r5) goto L10;
        return true;
    L10:
        return false;
    L6:
        r3 = false;
        goto L7
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        if (r1 != 0) goto L5;
    L8:
        this.e = 1;
        this.d = 0;
        return;
    L5:
        if (this.e == 1) goto L8;
    }

    @Override // defpackage.k51
    public final void f(m51 r4) {
        this.f = r4;
        wv4 r5 = r4.t(1024, 4);
        this.g = r5;
        sb1 r0 = new sb1();
        String r1 = this.c;
        r0.l = lw2.m(r1);
        r0.m = lw2.m(r1);
        f34.l(r0, r5);
        this.f.p();
        this.f.w(new if4());
        this.e = 1;
    }
}
