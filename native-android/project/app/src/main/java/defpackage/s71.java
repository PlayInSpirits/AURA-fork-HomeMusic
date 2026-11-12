package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s71 implements k51 {
    public final byte[] a;
    public final be3 b;
    public final boolean c;
    public final t71 d;
    public m51 e;
    public wv4 f;
    public int g;
    public qv2 h;
    public v71 i;
    public int j;
    public int k;
    public r71 l;
    public int m;
    public long n;

    static {
    }

    public s71() {
        this.a = new byte[42];
        this.b = new be3(0, new byte[32768]);
        this.c = false;
        this.d = new t71();
        this.g = 0;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r32, t71 r33) {
        int r2 = this.g;
        qv2 r3 = null;
        boolean r4 = true;
        int r5 = 0;
        if (r2 == 0) goto L162;
        byte[] r6 = this.a;
        if (r2 == 1) goto L160;
        int r8 = 4;
        int r9 = 3;
        if (r2 == 2) goto L154;
        int r10 = 7;
        int r11 = 6;
        if (r2 == 3) goto L126;
        long r12 = 0;
        if (r2 == 4) goto L99;
        if (r2 != 5) goto L97;
        this.f.getClass();
        this.i.getClass();
        r71 r7 = this.l;
        if (r7 == null) goto L20;
        if (r7.c == null) goto L20;
        return r7.b(r32, r33);
    L20:
        if (this.n != (-1)) goto L50;
        v71 r13 = this.i;
        r32.k();
        r32.g(1);
        byte[] r14 = new byte[1];
        r32.n(r14, 0, 1);
        if ((r14[0] & 1) != 1) goto L24;
        boolean r15 = true;
    L25:
        r32.g(2);
        if (r15 == true) goto L29;
        r10 = 6;
    L29:
        be3 r16 = new be3(r10);
        byte[] r17 = r16.a;
        int r18 = 0;
    L30:
        if (r18 >= r10) goto L35;
        int r19 = r32.i(r17, r18, r10 - r18);
        if (r19 == (-1)) goto L35;
        r18 = r18 + r19;
    L35:
        r16.M(r18);
        r32.k();
        long r20 = r16.I();     // Catch: NumberFormatException -> L174
        if (r15 == true) goto L40;
        r20 = r20 * ((long) r13.b);
    L40:
        long r1 = r13.j;
        if (r1 != 0) goto L43;
    L45:
        r12 = r20;
    L46:
        if (r4 == false) goto L49;
        this.n = r12;
    L96:
        return 0;
    L49:
        throw ParserException.a(null, null);
    L43:
        if (r20 <= r1) goto L45;
    L44:
        r4 = false;
        goto L46
    L24:
        r15 = false;
        goto L25
    L50:
        be3 r21 = this.b;
        int r22 = r21.c;
        if (r22 >= 32768) goto L62;
        int r23 = r32.read(r21.a, r22, 32768 - r22);
        if (r23 == (-1)) goto L56;
        r4 = false;
    L56:
        if (r4 == true) goto L59;
        r21.M(r22 + r23);
    L63:
        int r24 = r21.b;
        int r25 = this.m;
        int r26 = this.j;
        if (r25 >= r26) goto L66;
        r21.O(Math.min(r26 - r25, r21.a()));
    L66:
        this.i.getClass();
        int r27 = r21.b;
    L67:
        int r28 = r21.c - 16;
        t71 r110 = this.d;
        if (r27 > r28) goto L73;
        r21.N(r27);
        if (rr2.h(r21, this.i, this.k, r110) == true) goto L71;
        r27 = r27 + 1;
        goto L67
    L71:
        r21.N(r27);
        long r29 = r110.a;
    L89:
        int r30 = r21.b - r24;
        r21.N(r24);
        this.f.e(r30, r21);
        int r31 = this.m + r30;
        this.m = r31;
        if (r29 == (-1)) goto L92;
        long r111 = this.n * 1000000;
        v71 r34 = this.i;
        String r35 = f35.a;
        this.f.a(r111 / ((long) r34.e), 1, r31, 0, null);
        this.m = 0;
        this.n = r29;
    L92:
        int r0 = r21.a.length - r21.c;
        if (r21.a() >= 16) goto L96;
        if (r0 >= 16) goto L96;
        int r36 = r21.a();
        byte[] r37 = r21.a;
        System.arraycopy(r37, r21.b, r37, 0, r36);
        r21.N(0);
        r21.M(r36);
        goto L96
    L73:
        if (r4 == false) goto L87;
    L74:
        int r38 = r21.c;
        if (r27 > (r38 - this.j)) goto L86;
        r21.N(r27);
        boolean r39 = rr2.h(r21, this.i, this.k, r110);     // Catch: IndexOutOfBoundsException -> L79
    L81:
        if (r21.b <= r21.c) goto L83;
        r39 = false;
    L83:
        if (r39 == true) goto L84;
        r27 = r27 + 1;
        goto L74
    L84:
        r21.N(r27);
        r29 = r110.a;
    L79:
        r39 = false;
        goto L81
    L86:
        r21.N(r38);
    L88:
        r29 = -1;
        goto L89
    L87:
        r21.N(r27);
        goto L88
    L59:
        if (r21.a() != 0) goto L63;
        long r40 = this.n * 1000000;
        v71 r41 = this.i;
        String r42 = f35.a;
        this.f.a(r40 / ((long) r41.e), 1, this.m, 0, null);
        return -1;
    L62:
        r4 = false;
        goto L63
    L97:
        tb4.a();
        return 0;
    L99:
        r32.k();
        be3 r43 = new be3(2);
        r32.n(r43.a, 0, 2);
        int r44 = r43.H();
        if ((r44 >> 2) != 16382) goto L124;
        r32.k();
        this.k = r44;
        m51 r45 = this.e;
        String r46 = f35.a;
        long r47 = r32.getPosition();
        long r210 = r32.getLength();
        this.i.getClass();
        v71 r48 = this.i;
        rm3 r49 = r48.k;
        if (r49 == null) goto L107;
        if (((long[]) r49.n).length <= 0) goto L107;
        m84 r50 = new bo(r48, r47, 1);
        r5 = 0;
    L122:
        r45.w(r50);
        this.g = 5;
        return r5;
    L107:
        if (r210 != (-1)) goto L109;
    L121:
        r5 = 0;
        r50 = new bo(r48.b());
        goto L122
    L109:
        if (r48.j <= 0) goto L121;
        int r51 = this.k;
        int r52 = r48.c;
        cn r53 = new cn(13, r48);
        q71 r112 = new q71(r48, r51);
        long r113 = r48.b();
        long r114 = r48.j;
        int r54 = r48.d;
        if (r54 <= 0) goto L114;
        long r115 = ((((long) r54) + ((long) r52)) / 2) + 1;
    L120:
        r71 r116 = new r71(r53, r112, r113, r114, r47, r210, r115, Math.max(6, r52));
        this.l = r116;
        r50 = r116.a;
        goto L122
    L114:
        int r55 = r48.a;
        if (r55 != r48.b) goto L118;
        if (r55 <= 0) goto L118;
        long r56 = r55;
    L119:
        r115 = 64 + (((r56 * ((long) r48.g)) * ((long) r48.h)) / 8);
    L118:
        r56 = 4096;
        goto L119
    L124:
        r32.k();
        throw ParserException.a(null, "First frame does not start with sync code.");
    L126:
        int r310 = 0;
        v71 r57 = this.i;
        boolean r58 = false;
    L127:
        if (r58 == true) goto L152;
        r32.k();
        byte[] r59 = new byte[r8];
        h00 r60 = new h00(r8, r59);
        int r61 = r310;
        r32.n(r59, r61, r8);
        boolean r62 = r60.h();
        int r63 = r60.i(r10);
        int r64 = r60.i(24) + r8;
        if (r63 != 0) goto L131;
        byte[] r65 = new byte[38];
        r32.readFully(r65, r61, 38);
        r57 = new v71(r8, r65);
    L149:
        String r66 = f35.a;
        this.i = r57;
        r58 = r62;
        r8 = 4;
        r9 = 3;
        r10 = 7;
        r11 = 6;
        r310 = 0;
        goto L127
    L131:
        if (r57 == null) goto L150;
        qv2 r117 = r57.l;
        if (r63 != r9) goto L135;
        be3 r67 = new be3(r64);
        r32.readFully(r67.a, r61, r64);
        r57 = new v71(r57.a, r57.b, r57.c, r57.d, r57.e, r57.g, r57.h, r57.j, l93.Y(r67), r57.l);
        goto L149
    L135:
        if (r63 != r8) goto L142;
        be3 r68 = new be3(r64);
        r32.readFully(r68.a, 0, r64);
        r68.O(r8);
        qv2 r69 = zz1.w(Arrays.asList((String[]) zz1.C(r68, false, false).n));
        if (r117 == null) goto L140;
        r69 = r117.b(r69);
    L140:
        v71 r118 = new v71(r57.a, r57.b, r57.c, r57.d, r57.e, r57.g, r57.h, r57.j, r57.k, r69);
    L141:
        r57 = r118;
        goto L149
    L142:
        if (r63 != r11) goto L148;
        be3 r70 = new be3(r64);
        r32.readFully(r70.a, 0, r64);
        r70.O(4);
        qv2 r71 = new qv2(yw1.o(dg3.d(r70)));
        if (r117 == null) goto L147;
        r71 = r117.b(r71);
    L147:
        r118 = new v71(r57.a, r57.b, r57.c, r57.d, r57.e, r57.g, r57.h, r57.j, r57.k, r71);
        goto L141
    L148:
        r32.l(r64);
        goto L149
    L150:
        nz2.c();
        return 0;
    L152:
        this.i.getClass();
        this.j = Math.max(this.i.c, 6);
        tb1 r72 = this.i.c(r6, this.h);
        wv4 r73 = this.f;
        sb1 r74 = r72.a();
        r74.l = lw2.m("audio/flac");
        f34.l(r74, r73);
        this.f.d(this.i.b());
        this.g = 4;
        return 0;
    L154:
        be3 r75 = new be3(4);
        r32.readFully(r75.a, 0, 4);
        if (r75.C() != 1716281667) goto L159;
        this.g = 3;
        return 0;
    L159:
        throw ParserException.a(null, "Failed to read FLAC stream marker.");
    L160:
        r32.n(r6, 0, r6.length);
        r32.k();
        this.g = 2;
        return 0;
    L162:
        r32.k();
        long r76 = r32.f();
        if (this.c == true) goto L165;
        er1 r77 = null;
    L166:
        qv2 r78 = new ov1(0).a(r32, r77, 0);
        if (r78 != null) goto L169;
    L172:
        r32.l((int) (r32.f() - r76));
        this.h = r3;
        this.g = 1;
        return 0;
    L169:
        if (r78.a.length == 0) goto L172;
        r3 = r78;
        goto L172
    L165:
        r77 = mv1.o;
        goto L166
    }

    @Override // defpackage.k51
    public final boolean c(l51 r5) {
        er1 r4 = mv1.o;
        qv2 r6 = new ov1(0).a(r5, r4, 0);
        if (r6 == null) goto L5;
        int r7 = r6.a.length;
    L5:
        be3 r8 = new be3(4);
        rk0 r9 = (rk0) r5;
        r9.e(r8.a, 0, 4, false);
        if (r8.C() != 1716281667) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r3, long r5) {
        long r0 = 0;
        if (r3 != 0) goto L5;
        this.g = 0;
    L9:
        if (r5 == 0) goto L12;
        r0 = -1;
    L12:
        this.n = r0;
        this.m = 0;
        this.b.K(0);
        return;
    L5:
        r71 r4 = this.l;
        if (r4 == null) goto L9;
        r4.d(r5);
        goto L9
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        this.e = r3;
        this.f = r3.t(0, 1);
        r3.p();
    }
}
