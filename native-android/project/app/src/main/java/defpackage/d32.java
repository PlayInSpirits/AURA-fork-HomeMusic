package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d32 implements k51 {
    public final be3 a;
    public m51 b;
    public int c;
    public int d;
    public int e;
    public long f;
    public xx2 g;
    public l51 h;
    public e20 i;
    public sy2 j;

    public d32() {
        this.a = new be3(2);
        this.f = -1;
    }

    @Override // defpackage.k51
    public final void a() {
        sy2 r0 = this.j;
        if (r0 == null) goto L6;
        r0.getClass();
        return;
    }

    @Override // defpackage.k51
    public final int b(l51 r26, t71 r27) {
        int r3 = this.c;
        long r4 = -1;
        be3 r6 = this.a;
        if (r3 == 0) goto L97;
        if (r3 == 1) goto L95;
        if (r3 == 2) goto L41;
        if (r3 == 4) goto L23;
        if (r3 == 5) goto L15;
        if (r3 != 6) goto L12;
        return -1;
    L12:
        tb4.a();
        return 0;
    L15:
        if (this.i != null) goto L17;
    L18:
        this.h = r26;
        this.i = new e20(r26, this.f);
    L19:
        sy2 r1 = this.j;
        r1.getClass();
        int r2 = r1.b(this.i, r27);
        if (r2 != 1) goto L22;
        r27.a += this.f;
    L22:
        return r2;
    L17:
        if (r26 == this.h) goto L19;
    L23:
        long r11 = r26.getPosition();
        long r13 = this.f;
        if (r11 == r13) goto L28;
        r27.a = r13;
        return 1;
    L28:
        if (r26.e(r6.a, 0, 1, true) == true) goto L31;
        g();
        return 0;
    L31:
        r26.k();
        if (this.j != null) goto L34;
        this.j = new sy2(xn4.m, 8);
    L34:
        e20 r5 = new e20(r26, this.f);
        this.i = r5;
        if (this.j.c(r5) == false) goto L38;
        sy2 r7 = this.j;
        long r12 = this.f;
        m51 r8 = this.b;
        r8.getClass();
        r7.f(new e20(r12, r8, 6));
        xx2 r9 = this.g;
        r9.getClass();
        m51 r10 = this.b;
        r10.getClass();
        wv4 r14 = r10.t(1024, 4);
        sb1 r15 = new sb1();
        r15.l = lw2.m("image/jpeg");
        r15.k = new qv2(new pv2[]{r9});
        f34.l(r15, r14);
        this.c = 5;
        return 0;
    L38:
        g();
        return 0;
    L41:
        if (this.d != 65505) goto L92;
        be3 r16 = new be3(this.e);
        r26.readFully(r16.a, 0, this.e);
        if (this.g == null) goto L45;
    L93:
        this.c = 0;
        return 0;
    L45:
        if ("http://ns.adobe.com/xap/1.0/".equals(r16.v()) == false) goto L93;
        String r17 = r16.v();
        if (r17 == null) goto L93;
        long r18 = r26.getLength();
        if (r18 != (-1)) goto L113;
    L50:
        xx2 r19 = null;
    L89:
        this.g = r19;
        if (r19 == null) goto L93;
        this.f = r19.d;
        goto L93
    L113:
        e20 r20 = bu.y(r17);     // Catch: Throwable -> L53
    L54:
        if (r20 == null) goto L50;
        gy3 r21 = (gy3) r20.p;
        int r110 = r21.q;
        if (r110 < 2) goto L50;
        int r111 = r110 - 1;
        long r112 = -1;
        long r113 = -1;
        long r114 = -1;
        long r22 = -1;
    L60:
        if (r111 < 0) goto L79;
        wx2 r23 = (wx2) r21.get(r111);
        String r115 = r23.a;
        if (r115.equals("video/mp4") == false) goto L64;
    L67:
        boolean r24 = true;
    L68:
        if (r111 != 0) goto L71;
        r18 = r18 - r23.c;
        long r25 = 0;
    L70:
        long r28 = r18;
        r18 = r25;
        if (r24 == true) goto L74;
    L76:
        if (r111 != 0) goto L78;
        r113 = r28;
        r112 = r18;
    L78:
        r111 = r111 - 1;
        r4 = r4;
        goto L60
    L74:
        if (r18 == r28) goto L76;
        r22 = r28 - r18;
        r114 = r18;
        goto L76
    L71:
        r25 = r18 - r23.b;
        goto L70
    L64:
        if (r115.equals("video/quicktime") == true) goto L67;
        r24 = false;
        goto L68
    L79:
        long r116 = r4;
        if (r114 == r116) goto L50;
        if (r22 == r116) goto L50;
        if (r112 == r116) goto L50;
        if (r113 == r116) goto L50;
        r19 = new xx2(r112, r113, r20.o, r114, r22);
    L53:
        l93.q0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
        r20 = null;
        goto L54
    L92:
        r26.l(this.e);
        goto L93
    L95:
        r6.K(2);
        r26.n(r6.a, 0, 2);
        this.e = r6.H() - 2;
        r26.l(2);
        this.c = 2;
        return 0;
    L97:
        r6.K(2);
        r26.readFully(r6.a, 0, 2);
        int r29 = r6.H();
        this.d = r29;
        if (r29 != 65498) goto L106;
        if (this.f == (-1)) goto L103;
        this.c = 4;
        return 0;
    L103:
        g();
        return 0;
    L106:
        if (r29 < 65488) goto L110;
        if (r29 > 65497) goto L110;
    L112:
        return 0;
    L110:
        if (r29 == 65281) goto L112;
        this.c = 1;
        goto L112
    }

    @Override // defpackage.k51
    public final boolean c(l51 r9) {
        rk0 r10 = (rk0) r9;
        be3 r0 = this.a;
        r0.K(2);
        r10.e(r0.a, 0, 2, false);
        if (r0.H() != 65496) goto L10;
    L5:
        r0.K(2);
        r10.e(r0.a, 0, 2, false);
        int r2 = r0.H();
        this.d = r2;
        if (r2 == 65498) goto L10;
        r0.K(2);
        r10.n(r0.a, 0, 2);
        int r3 = r0.H() - 2;
        if (r3 < 0) goto L10;
        if (this.d != 65505) goto L13;
        r0.K(r3);
        r10.e(r0.a, 0, r3, false);
        if (Objects.equals(r0.v(), "http://ns.adobe.com/xap/1.0/") == false) goto L5;
        String r4 = r0.v();
        if (r4 == null) goto L5;
        String[] r5 = bu.c;
        int r6 = 0;
    L22:
        if (r6 >= 4) goto L5;
        if (r4.contains(r5[r6] + "=\"1\"") == true) goto L25;
        r6 = r6 + 1;
        goto L22
    L25:
        return true;
    L13:
        r10.o(r3, false);
    L10:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r3, long r5) {
        if (r3 != 0) goto L7;
        this.c = 0;
        this.j = null;
        return;
    L7:
        if (this.c != 5) goto L10;
        sy2 r2 = this.j;
        r2.getClass();
        r2.d(r3, r5);
        return;
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.b = r1;
    }

    public final void g() {
        m51 r0 = this.b;
        r0.getClass();
        r0.p();
        this.b.w(new bo(-9223372036854775807L));
        this.c = 6;
    }
}
