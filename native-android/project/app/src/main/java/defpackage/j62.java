package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements mz0 {
    public final String a;
    public final int b;
    public final be3 c;
    public final h00 d;
    public wv4 e;
    public String f;
    public tb1 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public j62(int r2, String r3) {
        this.a = r3;
        this.b = r2;
        be3 r4 = new be3(1024);
        this.c = r4;
        byte[] r5 = r4.a;
        this.d = new h00(r5.length, r5);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void a(be3 r24) {
        this.e.getClass();
    L4:
        if (r24.a() <= 0) goto L111;
        int r1 = this.h;
        boolean r3 = true;
        if (r1 != 0) goto L8;
        if (r24.A() != 86) goto L4;
        this.h = 1;
        goto L4
    L8:
        if (r1 != 1) goto L9;
        int r2 = r24.A();
        if ((r2 & 224) == 224) goto L105;
        if (r2 == 86) goto L4;
        this.h = 0;
        goto L4
    L105:
        this.k = r2;
        this.h = 2;
        goto L4
    L9:
        be3 r4 = this.c;
        h00 r8 = this.d;
        if (r1 != 2) goto L11;
        int r5 = ((this.k & (-225)) << 8) | r24.A();
        this.j = r5;
        if (r5 <= r4.a.length) goto L102;
        r4.K(r5);
        byte[] r6 = r4.a;
        r8.getClass();
        r8.o(r6.length, r6);
    L102:
        this.i = 0;
        this.h = 3;
        goto L4
    L11:
        if (r1 != 3) goto L97;
        int r7 = Math.min(r24.a(), this.j - this.i);
        r24.k(r8.b, this.i, r7);
        int r9 = this.i + r7;
        this.i = r9;
        if (r9 != this.j) goto L4;
        r8.q(0);
        if (r8.h() == true) goto L67;
        this.m = true;
        int r10 = r8.i(1);
        if (r10 != 1) goto L19;
        int r11 = r8.i(1);
    L20:
        this.n = r11;
        if (r11 != 0) goto L65;
        if (r10 != 1) goto L25;
        r8.i((r8.i(2) + 1) * 8);
    L25:
        if (r8.h() == false) goto L63;
        this.o = r8.i(6);
        int r13 = r8.i(4);
        int r14 = r8.i(3);
        if (r13 != 0) goto L61;
        if (r14 != 0) goto L61;
        if (r10 != 0) goto L33;
        int r15 = r8.g();
        int r16 = r8.b();
        g r17 = xl.D(r8, true);
        this.v = r17.a;
        this.s = r17.b;
        this.u = r17.c;
        int r18 = r16 - r8.b();
        r8.q(r15);
        byte[] r12 = new byte[(r18 + 7) / 8];
        r8.j(r18, r12);
        sb1 r19 = new sb1();
        r19.a = this.f;
        r19.l = lw2.m("video/mp2t");
        r19.m = lw2.m("audio/mp4a-latm");
        r19.j = this.v;
        r19.E = this.u;
        r19.F = this.s;
        r19.p = Collections.singletonList(r12);
        r19.d = this.a;
        r19.f = this.b;
        tb1 r20 = new tb1(r19);
        if (r20.equals(this.g) == true) goto L34;
        this.g = r20;
        this.t = 1024000000 / ((long) r20.G);
        this.e.g(r20);
    L34:
        int r21 = r8.i(3);
        this.p = r21;
        if (r21 == 0) goto L50;
        if (r21 == 1) goto L49;
        if (r21 == 3) goto L48;
        if (r21 == 4) goto L48;
        if (r21 == 5) goto L48;
        if (r21 != 6) goto L43;
    L47:
        r8.t(1);
    L51:
        boolean r22 = r8.h();
        this.q = r22;
        this.r = 0;
        if (r22 == false) goto L58;
        if (r10 != 1) goto L55;
        this.r = r8.i((r8.i(2) + 1) * 8);
    L55:
        boolean r23 = r8.h();
        this.r = (this.r << 8) + ((long) r8.i(8));
        if (r23 == true) goto L55;
    L58:
        if (r8.h() == false) goto L70;
        r8.t(8);
    L70:
        if (this.n != 0) goto L96;
        if (this.o != 0) goto L94;
        if (this.p != 0) goto L92;
        int r25 = 0;
    L76:
        int r26 = r8.i(8);
        r25 = r25 + r26;
        if (r26 == 255) goto L76;
        int r27 = r8.g();
        if ((r27 & 7) != 0) goto L81;
        r4.N(r27 >> 3);
    L82:
        this.e.e(r25, r4);
        if (this.l != (-9223372036854775807L)) goto L86;
        r3 = false;
    L86:
        rr2.w(r3);
        this.e.a(this.l, 1, r25, 0, null);
        this.l += this.t;
        if (this.q == false) goto L89;
        r8.t((int) this.r);
    L89:
        this.h = 0;
        goto L4
    L81:
        r8.j(r25 * 8, r4.a);
        r4.N(0);
        goto L82
    L92:
        throw ParserException.a(null, null);
    L94:
        throw ParserException.a(null, null);
    L96:
        throw ParserException.a(null, null);
    L43:
        if (r21 == 7) goto L47;
        tb4.a();
        return;
    L48:
        r8.t(6);
        goto L51
    L49:
        r8.t(9);
        goto L51
    L50:
        r8.t(8);
        goto L51
    L33:
        int r28 = r8.i((r8.i(2) + 1) * 8);
        int r110 = r8.b();
        g r111 = xl.D(r8, true);
        this.v = r111.a;
        this.s = r111.b;
        this.u = r111.c;
        r8.t(r28 - (r110 - r8.b()));
    L61:
        throw ParserException.a(null, null);
    L63:
        throw ParserException.a(null, null);
    L65:
        throw ParserException.a(null, null);
    L19:
        r11 = 0;
        goto L20
    L67:
        if (this.m == true) goto L70;
    L97:
        tb4.a();
        return;
    }

    @Override // defpackage.mz0
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.mz0
    public final void d(boolean r1) {
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.l = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r3, sy4 r4) {
        r4.a();
        r4.b();
        this.e = r3.t(r4.d, 1);
        r4.b();
        this.f = r4.e;
    }
}
