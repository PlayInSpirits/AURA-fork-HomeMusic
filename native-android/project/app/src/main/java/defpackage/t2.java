package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements k51 {
    public final s2 a;
    public final be3 b;
    public boolean c;

    static {
    }

    public t2() {
        this.a = new s2(0, 1, null, "audio/ac4");
        this.b = new be3(16384);
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r6, t71 r7) {
        be3 r8 = this.b;
        int r9 = r6.read(r8.a, 0, 16384);
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
    public final boolean c(l51 r14) {
        be3 r13 = new be3(10);
        int r2 = 0;
    L3:
        rk0 r4 = (rk0) r14;
        r4.e(r13.a, 0, 10, false);
        r13.N(0);
        if (r13.D() != 4801587) goto L5;
        r13.O(3);
        int r3 = r13.z();
        r2 = r2 + (r3 + 10);
        r4.o(r3, false);
        goto L3
    L5:
        r4.s = 0;
        r4.o(r2, false);
        int r15 = 0;
        int r0 = r2;
    L6:
        int r5 = 7;
        r4.e(r13.a, 0, 7, false);
        r13.N(0);
        int r6 = r13.H();
        if (r6 == 44096) goto L13;
        if (r6 == 44097) goto L13;
        r4.s = 0;
        r0 = r0 + 1;
        if ((r0 - r2) >= 8192) goto L27;
        r4.o(r0, false);
        r15 = 0;
    L27:
        return false;
    L13:
        r15 = r15 + 1;
        if (r15 >= 4) goto L15;
        byte[] r7 = r13.a;
        if (r7.length >= 7) goto L19;
        int r10 = -1;
    L26:
        if (r10 == (-1)) goto L27;
        r4.o(r10 - 7, false);
        goto L6
    L19:
        int r11 = ((r7[2] & 255) << 8) | (r7[3] & 255);
        if (r11 != 65535) goto L22;
        r11 = (((r7[4] & 255) << 16) | ((r7[5] & 255) << 8)) | (r7[6] & 255);
    L23:
        if (r6 != 44097) goto L25;
        r5 = r5 + 2;
    L25:
        r10 = r11 + r5;
        goto L26
    L22:
        r5 = 4;
        goto L23
    L15:
        return true;
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
