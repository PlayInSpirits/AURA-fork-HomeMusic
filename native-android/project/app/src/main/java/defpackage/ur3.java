package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ur3 implements k51 {
    public final iu4 a;
    public final SparseArray b;
    public final be3 c;
    public final sr3 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public r71 i;
    public m51 j;
    public boolean k;

    static {
    }

    public ur3() {
        this.a = new iu4(0);
        this.c = new be3(4096);
        this.b = new SparseArray();
        this.d = new sr3(0);
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r29, t71 r30) {
        this.j.getClass();
        long r13 = r29.getLength();
        long r7 = -9223372036854775807L;
        sr3 r10 = this.d;
        if (r13 == (-1)) goto L51;
        char r16 = 3;
        if (r10.d == true) goto L53;
        iu4 r0 = r10.b;
        be3 r3 = r10.c;
        if (r10.f == true) goto L23;
        long r4 = r29.getLength();
        int r1 = (int) Math.min(20000, r4);
        long r5 = r4 - ((long) r1);
        if (r29.getPosition() == r5) goto L12;
        r30.a = r5;
        return 1;
    L12:
        r3.K(r1);
        r29.k();
        r29.n(r3.a, 0, r1);
        int r2 = r3.b;
        int r6 = r3.c - 4;
    L13:
        if (r6 < r2) goto L20;
        if (sr3.b(r6, r3.a) != 442) goto L19;
        r3.N(r6 + 4);
        long r8 = sr3.c(r3);
        if (r8 == (-9223372036854775807L)) goto L19;
        r7 = r8;
    L19:
        r6 = r6 - 1;
    L20:
        r10.h = r7;
        r10.f = true;
        return 0;
    L23:
        if (r10.h != (-9223372036854775807L)) goto L27;
        r10.a(r29);
        return 0;
    L27:
        if (r10.e == true) goto L44;
        int r9 = (int) Math.min(20000, r29.getLength());
        if (r29.getPosition() == 0) goto L32;
        r30.a = 0;
        return 1;
    L32:
        r3.K(r9);
        r29.k();
        r29.n(r3.a, 0, r9);
        int r11 = r3.b;
        int r12 = r3.c;
    L34:
        if (r11 >= (r12 - 3)) goto L41;
        if (sr3.b(r11, r3.a) != 442) goto L40;
        r3.N(r11 + 4);
        long r14 = sr3.c(r3);
        if (r14 == (-9223372036854775807L)) goto L40;
        long r15 = r14;
    L42:
        r10.g = r15;
        r10.e = true;
        return 0;
    L40:
        r11 = r11 + 1;
        goto L34
    L41:
        r15 = -9223372036854775807L;
        goto L42
    L44:
        long r17 = r10.g;
        if (r17 != (-9223372036854775807L)) goto L48;
        r10.a(r29);
        return 0;
    L48:
        r10.i = r0.c(r10.h) - r0.b(r17);
        r10.a(r29);
        return 0;
    L53:
        if (this.k == true) goto L58;
        this.k = true;
        long r18 = r10.i;
        if (r18 == (-9223372036854775807L)) goto L57;
        int r19 = 4;
        r71 r20 = new r71(new pa(18), new xc5(r10.b), r18, r18 + 1, 0, r13, 188, 1000);
        this.i = r20;
        this.j.w(r20.a);
    L59:
        r71 r21 = this.i;
        if (r21 != null) goto L62;
    L65:
        r29.k();
        if (r13 == (-1)) goto L68;
        long r110 = r13 - r29.f();
    L70:
        if (r110 != (-1)) goto L72;
    L74:
        be3 r22 = this.c;
        if (r29.e(r22.a, 0, r19, true) == false) goto L140;
        r22.N(0);
        int r23 = r22.m();
        if (r23 != 441) goto L82;
        return -1;
    L82:
        if (r23 != 442) goto L86;
        r29.n(r22.a, 0, 10);
        r22.N(9);
        r29.l((r22.A() & 7) + 14);
        return 0;
    L86:
        if (r23 != 443) goto L90;
        r29.n(r22.a, 0, 2);
        r22.N(0);
        r29.l(r22.H() + 6);
        return 0;
    L90:
        if (((r23 & (-256)) >> 8) == 1) goto L93;
        r29.l(1);
        return 0;
    L93:
        int r24 = r23 & 255;
        SparseArray r111 = this.b;
        tr3 r112 = (tr3) r111.get(r24);
        if (this.e == true) goto L117;
        if (r112 != null) goto L109;
        if (r24 != 189) goto L100;
        mz0 r25 = new s2("video/mp2p");
        this.f = true;
        this.h = r29.getPosition();
    L106:
        if (r25 == null) goto L109;
        r25.f(this.j, new sy4(r24, 256));
        r112 = new tr3(r25, this.a);
        r111.put(r24, r112);
        goto L109
    L100:
        if ((r23 & 224) != 192) goto L103;
        r25 = new vy2(0, null, "video/mp2p");
        this.f = true;
        this.h = r29.getPosition();
        goto L106
    L103:
        if ((r23 & 240) != 224) goto L105;
        r25 = new vk1(null, "video/mp2p");
        this.g = true;
        this.h = r29.getPosition();
        goto L106
    L105:
        r25 = null;
    L109:
        if (this.f == true) goto L111;
    L113:
        long r26 = 1048576;
    L115:
        if (r29.getPosition() <= r26) goto L117;
        this.e = true;
        this.j.p();
        goto L117
    L111:
        if (this.g == false) goto L113;
        r26 = this.h + 8192;
    L117:
        r29.n(r22.a, 0, 2);
        r22.N(0);
        int r27 = r22.H() + 6;
        if (r112 != null) goto L121;
        r29.l(r27);
        return 0;
    L121:
        r22.K(r27);
        r29.readFully(r22.a, 0, r27);
        r22.N(6);
        mz0 r28 = r112.a;
        h00 r31 = r112.c;
        r22.k(r31.b, 0, 3);
        r31.q(0);
        r31.t(8);
        r112.d = r31.h();
        r112.e = r31.h();
        r31.t(6);
        r22.k(r31.b, 0, r31.i(8));
        r31.q(0);
        iu4 r32 = r112.b;
        r112.g = 0;
        if (r112.d == false) goto L129;
        r31.t(4);
        long r33 = ((long) r31.i(3)) << 30;
        r31.t(1);
        long r34 = r33 | ((long) (r31.i(15) << 15));
        r31.t(1);
        long r35 = r34 | ((long) r31.i(15));
        r31.t(1);
        if (r112.f == false) goto L126;
    L128:
        r112.g = r32.b(r35);
        goto L129
    L126:
        if (r112.e == false) goto L128;
        r31.t(4);
        long r113 = ((long) r31.i(3)) << 30;
        r31.t(1);
        long r114 = r113 | ((long) (r31.i(15) << 15));
        r31.t(1);
        long r36 = r114 | ((long) r31.i(15));
        r31.t(1);
        r32.b(r36);
        r112.f = true;
    L129:
        r28.e(4, r112.g);
        r28.a(r22);
        r28.d(false);
        r22.M(r22.a.length);
        return 0;
    L140:
        return -1;
    L72:
        if (r110 >= 4) goto L74;
        return -1;
    L68:
        r110 = -1;
        goto L70
    L62:
        if (r21.c == null) goto L65;
        return r21.b(r29, r30);
    L57:
        r19 = 4;
        this.j.w(new bo(r18));
        goto L59
    L58:
        r19 = 4;
        goto L59
    L51:
        r16 = 3;
        goto L53
    }

    @Override // defpackage.k51
    public final boolean c(l51 r9) {
        byte[] r0 = new byte[14];
        rk0 r10 = (rk0) r9;
        r10.e(r0, 0, 14, false);
        if (442 == (((((r0[0] & 255) << 24) | ((r0[1] & 255) << 16)) | ((r0[2] & 255) << 8)) | (r0[3] & 255))) goto L6;
    L23:
        return false;
    L6:
        if ((r0[4] & 196) != 68) goto L23;
        if ((r0[6] & 4) != 4) goto L23;
        if ((r0[8] & 4) != 4) goto L23;
        if ((r0[9] & 1) != 1) goto L23;
        if ((r0[12] & 3) != 3) goto L23;
        r10.o(r0[13] & 7, false);
        r10.e(r0, 0, 3, false);
        if (1 != ((((r0[0] & 255) << 16) | ((r0[1] & 255) << 8)) | (r0[2] & 255))) goto L23;
        return true;
    }

    @Override // defpackage.k51
    public final void d(long r8, long r10) {
        SparseArray r9 = this.b;
        iu4 r11 = this.a;
        monitor-enter(r11);
        long r0 = r11.b;     // Catch: Throwable -> L30
        monitor-exit(r11);
        boolean r1 = true;
        if (r0 != (-9223372036854775807L)) goto L9;
        boolean r2 = true;
    L10:
        if (r2 == true) goto L20;
        long r5 = r11.d();
        if (r5 != (-9223372036854775807L)) goto L14;
    L18:
        r1 = false;
    L19:
        r2 = r1;
        goto L20
    L14:
        if (r5 == 0) goto L18;
        if (r5 == r10) goto L18;
    L20:
        if (r2 == false) goto L22;
        r11.f(r10);
    L22:
        r71 r7 = this.i;
        if (r7 == null) goto L25;
        r7.d(r10);
    L25:
        int r12 = 0;
    L27:
        if (r12 >= r9.size()) goto L29;
        tr3 r13 = (tr3) r9.valueAt(r12);
        r13.f = false;
        r13.a.c();
        r12 = r12 + 1;
        goto L27
    L29:
        return;
    L9:
        r2 = false;
    L30:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.j = r1;
    }
}
