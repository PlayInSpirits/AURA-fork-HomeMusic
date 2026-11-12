package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag3 implements ty4 {
    public final mz0 a;
    public final h00 b;
    public int c;
    public int d;
    public iu4 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public ag3(mz0 r3) {
        this.a = r3;
        this.b = new h00(10, new byte[10]);
        this.c = 0;
    }

    @Override // defpackage.ty4
    public final void a(int r19, be3 r20) {
        this.e.getClass();
        int r2 = r19 & 1;
        int r3 = -1;
        int r4 = 2;
        mz0 r5 = this.a;
        if (r2 == 0) goto L22;
        int r6 = this.c;
        if (r6 == 0) goto L21;
        if (r6 == 1) goto L21;
        if (r6 == 2) goto L20;
        if (r6 == 3) goto L11;
        tb4.a();
        return;
    L11:
        if (this.j == (-1)) goto L14;
        l93.q0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
    L14:
        if (r20.c != 0) goto L16;
        boolean r7 = true;
    L17:
        r5.d(r7);
        goto L21
    L16:
        r7 = false;
        goto L17
    L20:
        l93.q0("PesReader", "Unexpected start indicator reading extended header");
    L21:
        this.c = 1;
        this.d = 0;
    L22:
        int r8 = r19;
    L24:
        if (r20.a() <= 0) goto L70;
        int r9 = this.c;
        if (r9 == 0) goto L69;
        h00 r10 = this.b;
        if (r9 == 1) goto L63;
        if (r9 == r4) goto L45;
        if (r9 != 3) goto L42;
        int r11 = r20.a();
        int r12 = this.j;
        if (r12 != r3) goto L34;
        int r13 = 0;
    L35:
        if (r13 <= 0) goto L37;
        r11 = r11 - r13;
        r20.M(r20.b + r11);
    L37:
        r5.a(r20);
        int r14 = this.j;
        if (r14 == r3) goto L61;
        int r15 = r14 - r11;
        this.j = r15;
        if (r15 != 0) goto L61;
        r5.d(false);
        this.c = 1;
        this.d = 0;
    L61:
        r3 = -1;
        r4 = 2;
        goto L24
    L34:
        r13 = r11 - r12;
        goto L35
    L42:
        tb4.a();
        return;
    L45:
        if (d(r20, r10.b, Math.min(10, this.i)) == false) goto L61;
        if (d(r20, null, this.i) == false) goto L61;
        r10.q(0);
        this.l = -9223372036854775807L;
        if (this.f == false) goto L57;
        r10.t(4);
        long r16 = ((long) r10.i(3)) << 30;
        r10.t(1);
        long r17 = ((long) (r10.i(15) << 15)) | r16;
        r10.t(1);
        long r18 = r17 | ((long) r10.i(15));
        r10.t(1);
        if (this.h == false) goto L53;
    L55:
        this.l = this.e.b(r18);
        goto L57
    L53:
        if (this.g == false) goto L55;
        r10.t(4);
        long r110 = ((long) r10.i(3)) << 30;
        r10.t(1);
        long r111 = r110 | ((long) (r10.i(15) << 15));
        r10.t(1);
        long r112 = r111 | ((long) r10.i(15));
        r10.t(1);
        this.e.b(r112);
        this.h = true;
    L57:
        if (this.k == false) goto L59;
        int r113 = 4;
    L60:
        r8 = r8 | r113;
        r5.e(r8, this.l);
        this.c = 3;
        this.d = 0;
        goto L61
    L59:
        r113 = 0;
        goto L60
    L63:
        if (d(r20, r10.b, 9) == false) goto L61;
        if (e() == false) goto L67;
        int r21 = 2;
    L68:
        this.c = r21;
        this.d = 0;
        goto L61
    L67:
        r21 = 0;
        goto L68
    L69:
        r20.O(r20.a());
        goto L61
    }

    @Override // defpackage.ty4
    public final void b(iu4 r1, m51 r2, sy4 r3) {
        this.e = r1;
        this.a.f(r2, r3);
    }

    @Override // defpackage.ty4
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(be3 r4, byte[] r5, int r6) {
        int r0 = Math.min(r4.a(), r6 - this.d);
        if (r0 > 0) goto L5;
        return true;
    L5:
        if (r5 != null) goto L7;
        r4.O(r0);
    L8:
        int r7 = this.d + r0;
        this.d = r7;
        if (r7 != r6) goto L11;
        return true;
    L11:
        return false;
    L7:
        r4.k(r5, this.d, r0);
        goto L8
    }

    public final boolean e() {
        h00 r0 = this.b;
        r0.q(0);
        int r2 = r0.i(24);
        if (r2 == 1) goto L6;
        xa3.m(r2, "Unexpected start code prefix: ", "PesReader");
        this.j = -1;
        return false;
    L6:
        r0.t(8);
        int r3 = r0.i(16);
        r0.t(5);
        this.k = r0.h();
        r0.t(2);
        this.f = r0.h();
        this.g = r0.h();
        r0.t(6);
        int r1 = r0.i(8);
        this.i = r1;
        if (r3 != 0) goto L10;
        this.j = -1;
        return true;
    L10:
        int r4 = (r3 - 3) - r1;
        this.j = r4;
        if (r4 >= 0) goto L13;
        l93.q0("PesReader", "Found negative packet payload size: " + this.j);
        this.j = -1;
    L13:
        return true;
    }
}
