package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h6 implements k51 {
    public final i6 a;
    public final be3 b;
    public final be3 c;
    public final h00 d;
    public m51 e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    static {
    }

    public h6(int r5) {
        this.a = new i6(null, 0, "audio/mp4a-latm", true);
        this.b = new be3(2048);
        this.g = -1;
        be3 r6 = new be3(10);
        this.c = r6;
        byte[] r7 = r6.a;
        this.d = new h00(r7.length, r7);
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r9, t71 r10) {
        this.e.getClass();
        r9.getLength();
        be3 r11 = this.b;
        int r12 = r9.read(r11.a, 0, 2048);
        if (r12 != (-1)) goto L5;
        boolean r3 = true;
    L7:
        if (this.i == true) goto L10;
        this.e.w(new bo(-9223372036854775807L));
        this.i = true;
    L10:
        if (r3 == false) goto L12;
        return -1;
    L12:
        r11.N(0);
        r11.M(r12);
        boolean r13 = this.h;
        i6 r0 = this.a;
        if (r13 == true) goto L15;
        r0.u = this.f;
        this.h = true;
    L15:
        r0.a(r11);
        return 0;
    L5:
        r3 = false;
        goto L7
    }

    @Override // defpackage.k51
    public final boolean c(l51 r11) {
        int r1 = 0;
    L3:
        be3 r2 = this.c;
        r11.n(r2.a, 0, 10);
        r2.N(0);
        if (r2.D() != 4801587) goto L5;
        r2.O(3);
        int r3 = r2.z();
        r1 = r1 + (r3 + 10);
        r11.g(r3);
        goto L3
    L5:
        r11.k();
        r11.g(r1);
        if (this.g != (-1)) goto L8;
        this.g = r1;
    L8:
        int r4 = 0;
        int r5 = 0;
        int r6 = r1;
    L9:
        rk0 r7 = (rk0) r11;
        r7.e(r2.a, 0, 2, false);
        r2.N(0);
        if ((r2.H() & 65526) != 65520) goto L21;
        r4 = r4 + 1;
        if (r4 >= 4) goto L14;
    L16:
        r7.e(r2.a, 0, 4, false);
        h00 r8 = this.d;
        r8.q(14);
        int r9 = r8.i(13);
        if (r9 > 6) goto L20;
        r6 = r6 + 1;
        r7.s = 0;
        r7.o(r6, false);
    L19:
        r4 = 0;
        r5 = 0;
    L23:
        if ((r6 - r1) < 8192) goto L9;
        return false;
    L20:
        r7.o(r9 - 6, false);
        r5 = r5 + r9;
        goto L23
    L14:
        if (r5 <= 188) goto L16;
        return true;
    L21:
        r6 = r6 + 1;
        r7.s = 0;
        r7.o(r6, false);
        goto L19
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        this.h = false;
        this.a.c();
        this.f = r3;
    }

    @Override // defpackage.k51
    public final void f(m51 r4) {
        this.e = r4;
        sy4 r0 = new sy4(0, 1);
        this.a.f(r4, r0);
        r4.p();
    }
}
