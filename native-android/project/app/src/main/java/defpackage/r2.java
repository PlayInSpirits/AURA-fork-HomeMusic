package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements k51 {
    public final s2 a;
    public final be3 b;
    public boolean c;

    static {
    }

    public r2() {
        this.a = new s2("audio/ac3");
        this.b = new be3(2786);
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r6, t71 r7) {
        be3 r8 = this.b;
        int r9 = r6.read(r8.a, 0, 2786);
        if (r9 != (-1)) goto L5;
        return -1;
    L5:
        r8.N(0);
        r8.M(r9);
        boolean r10 = this.c;
        s2 r0 = this.a;
        if (r10 == true) goto L8;
        r0.o = 0;
        this.c = true;
    L8:
        r0.a(r8);
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r13) {
        be3 r12 = new be3(10);
        int r2 = 0;
    L3:
        rk0 r4 = (rk0) r13;
        r4.e(r12.a, 0, 10, false);
        r12.N(0);
        if (r12.D() != 4801587) goto L5;
        r12.O(3);
        int r3 = r12.z();
        r2 = r2 + (r3 + 10);
        r4.o(r3, false);
        goto L3
    L5:
        r4.s = 0;
        r4.o(r2, false);
        int r14 = 0;
        int r5 = r2;
    L6:
        r4.e(r12.a, 0, 6, false);
        r12.N(0);
        if (r12.H() != 2935) goto L8;
        r14 = r14 + 1;
        if (r14 >= 4) goto L14;
        byte[] r9 = r12.a;
        if (r9.length >= 6) goto L19;
        int r8 = -1;
    L22:
        if (r8 == (-1)) goto L23;
        r4.o(r8 - 6, false);
    L23:
        return false;
    L19:
        if (((r9[5] & 248) >> 3) <= 10) goto L21;
        r8 = ((((r9[2] & 7) << 8) | (r9[3] & 255)) + 1) * 2;
        goto L22
    L21:
        byte r6 = r9[4];
        r8 = fu.t((r6 & 192) >> 6, r6 & 63);
        goto L22
    L14:
        return true;
    L8:
        r4.s = 0;
        r5 = r5 + 1;
        if ((r5 - r2) >= 8192) goto L23;
        r4.o(r5, false);
        r14 = 0;
        goto L6
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.k51
    public final void f(m51 r4) {
        sy4 r0 = new sy4(0, 1);
        this.a.f(r4, r0);
        r4.p();
        r4.w(new bo(-9223372036854775807L));
    }
}
