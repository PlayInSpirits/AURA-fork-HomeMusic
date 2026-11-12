package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 implements k51 {
    public final be3 a;
    public final be3 b;
    public final be3 c;
    public final be3 d;
    public final g64 e;
    public m51 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public tm o;
    public t55 p;

    static {
    }

    public n91() {
        this.a = new be3(4);
        this.b = new be3(9);
        this.c = new be3(11);
        this.d = new be3();
        g64 r0 = new g64(new tq0());
        r0.b = -9223372036854775807L;
        r0.c = new long[0];
        r0.d = new long[0];
        this.e = r0;
        this.g = 1;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r36, t71 r37) {
        this.f.getClass();
    L3:
        int r2 = this.g;
        boolean r8 = true;
        boolean r9 = false;
        if (r2 != 1) goto L6;
        be3 r3 = this.b;
        if (r36.a(r3.a, 0, 9, true) == false) goto L199;
        r3.N(0);
        r3.O(4);
        int r4 = r3.A();
        if ((r4 & 4) == 0) goto L164;
        boolean r5 = true;
    L166:
        if ((r4 & 1) == 0) goto L168;
        r9 = true;
    L168:
        if (r5 == true) goto L170;
    L172:
        if (r9 == true) goto L174;
    L176:
        int r6 = 2;
    L177:
        this.f.p();
        this.j = r3.m() - 5;
        this.g = r6;
        goto L3
    L174:
        if (this.p != null) goto L176;
        r6 = 2;
        this.p = new t55(this.f.t(9, 2));
        goto L177
    L170:
        if (this.o != null) goto L172;
        this.o = new tm(this.f.t(8, 1));
        goto L172
    L164:
        r5 = false;
        goto L166
    L199:
        return -1;
    L6:
        if (r2 != 2) goto L7;
        r36.l(this.j);
        this.j = 0;
        this.g = 3;
        goto L3
    L7:
        if (r2 != 3) goto L8;
        be3 r7 = this.c;
        if (r36.a(r7.a, 0, 11, true) == false) goto L159;
        r7.N(0);
        this.k = r7.A();
        this.l = r7.D();
        this.m = r7.D();
        this.m = (((long) (r7.A() << 24)) | this.m) * 1000;
        r7.O(3);
        this.g = 4;
        goto L3
    L159:
        return -1;
    L8:
        if (r2 != 4) goto L150;
        boolean r10 = this.h;
        g64 r11 = this.e;
        if (r10 == false) goto L14;
        long r12 = this.i + this.m;
    L12:
        long r20 = r12;
    L17:
        int r13 = this.k;
        if (r13 == 8) goto L20;
    L56:
        int r16 = 4;
        if (r13 != 9) goto L100;
        if (this.p == null) goto L100;
        if (this.n == true) goto L63;
        this.f.w(new bo(-9223372036854775807L));
        this.n = true;
    L63:
        t55 r14 = this.p;
        be3 r15 = g(r36);
        r14.getClass();
        int r17 = r15.A();
        int r18 = (r17 >> 4) & 15;
        int r19 = r17 & 15;
        if (r19 != 7) goto L97;
        r14.g = r18;
        if (r18 == 5) goto L68;
        boolean r21 = true;
    L69:
        if (r21 == false) goto L137;
        be3 r22 = r14.b;
        wv4 r110 = (wv4) r14.a;
        be3 r111 = r14.c;
        int r112 = r15.A();
        r15.f(3);
        byte[] r113 = r15.a;
        int r114 = r15.b;
        int r23 = r114 + 1;
        r15.b = r23;
        int r24 = ((r113[r114] & 255) << 24) >> 8;
        int r25 = r114 + 2;
        r15.b = r25;
        int r26 = ((r113[r23] & 255) << 8) | r24;
        r15.b = r114 + 3;
        long r29 = (((long) (r26 | (r113[r25] & 255))) * 1000) + r20;
        if (r112 != 0) goto L77;
        if (r14.e == true) goto L77;
        byte[] r27 = new byte[r15.a()];
        be3 r28 = new be3(r27);
        r15.k(r27, 0, r15.a());
        yn r30 = yn.a(r28);
        r14.d = r30.b;
        sb1 r31 = new sb1();
        r31.l = lw2.m("video/x-flv");
        r31.m = lw2.m("video/avc");
        r31.j = r30.l;
        r31.t = r30.c;
        r31.u = r30.d;
        r31.z = r30.k;
        r31.p = r30.a;
        f34.l(r31, r110);
        r14.e = true;
    L75:
        boolean r32 = false;
    L93:
        if (r32 == false) goto L137;
        boolean r33 = true;
    L96:
        r8 = true;
    L140:
        if (this.h == true) goto L147;
        if (r33 == false) goto L147;
        this.h = true;
        if (r11.b != (-9223372036854775807L)) goto L145;
        long r34 = -this.m;
    L146:
        this.i = r34;
        goto L147
    L145:
        r34 = 0;
    L147:
        this.j = 4;
        this.g = 2;
        if (r8 == false) goto L3;
        return 0;
    L77:
        if (r112 != 1) goto L75;
        if (r14.e == false) goto L75;
        if (r14.g != 1) goto L83;
        int r35 = 1;
    L85:
        if (r14.f == true) goto L88;
        if (r35 == 0) goto L75;
    L88:
        byte[] r38 = r111.a;
        r38[0] = 0;
        r38[1] = 0;
        r38[2] = 0;
        int r39 = 4 - r14.d;
        int r310 = 0;
    L90:
        if (r15.a() <= 0) goto L92;
        r15.k(r111.a, r39, r14.d);
        r111.N(0);
        int r40 = r111.E();
        r22.N(0);
        r110.e(r16, r22);
        r110.e(r40, r15);
        r310 = (r310 + 4) + r40;
        r16 = 4;
        goto L90
    L92:
        ((wv4) r14.a).a(r29, r35, r310, 0, null);
        r14.f = true;
        r32 = true;
        goto L93
    L83:
        r35 = 0;
    L137:
        r33 = false;
        goto L96
    L68:
        r21 = false;
        goto L69
    L97:
        final String r1 = f34.f(r19, "Video format not supported: ");
        throw new TagPayloadReader$UnsupportedFormatException(r1);
    L100:
        if (r13 == 18) goto L102;
    L138:
        r36.l(this.l);
        r33 = false;
        r8 = false;
        goto L140
    L102:
        if (this.n == true) goto L138;
        be3 r41 = g(r36);
        r11.getClass();
        if (r41.A() == 2) goto L107;
    L134:
        long r42 = r11.b;
        if (r42 == (-9223372036854775807L)) goto L137;
        this.f.w(new ux1(r42, r11.d, r11.c));
        this.n = true;
        goto L137
    L107:
        if ("onMetaData".equals(g64.w(r41)) == false) goto L134;
        if (r41.a() == 0) goto L134;
        if (r41.A() != 8) goto L134;
        HashMap r43 = g64.v(r41);
        Object r44 = r43.get("duration");
        if ((r44 instanceof Double) == false) goto L120;
        double r45 = ((Double) r44).doubleValue();
        if (r45 <= 0.0d) goto L120;
        r11.b = (long) (r45 * 1000000.0d);
    L120:
        Object r46 = r43.get("keyframes");
        if ((r46 instanceof Map) == false) goto L134;
        Map r47 = (Map) r46;
        Object r48 = r47.get("filepositions");
        Object r49 = r47.get("times");
        if ((r48 instanceof List) == false) goto L134;
        if ((r49 instanceof List) == false) goto L134;
        List r50 = (List) r48;
        List r51 = (List) r49;
        int r52 = r51.size();
        r11.c = new long[r52];
        r11.d = new long[r52];
        int r53 = 0;
    L127:
        if (r53 >= r52) goto L134;
        Object r54 = r50.get(r53);
        Object r115 = r51.get(r53);
        if ((r115 instanceof Double) == false) goto L133;
        if ((r54 instanceof Double) == false) goto L133;
        r11.c[r53] = (long) (((Double) r115).doubleValue() * 1000000.0d);
        r11.d[r53] = ((Double) r54).longValue();
        r53 = r53 + 1;
    L133:
        r11.c = new long[0];
        r11.d = new long[0];
        goto L134
    L20:
        if (this.o == null) goto L56;
        if (this.n == true) goto L24;
        this.f.w(new bo(-9223372036854775807L));
        this.n = true;
    L24:
        tm r55 = this.o;
        be3 r116 = g(r36);
        wv4 r117 = (wv4) r55.a;
        if (r55.b == true) goto L41;
        int r56 = r116.A();
        int r118 = (r56 >> 4) & 15;
        r55.d = r118;
        if (r118 != 2) goto L29;
        int r57 = tm.e[(r56 >> 2) & 3];
        sb1 r58 = new sb1();
        r58.l = lw2.m("video/x-flv");
        r58.m = lw2.m("audio/mpeg");
        r58.E = 1;
        r58.F = r57;
        f34.l(r58, r117);
        r55.c = true;
    L40:
        r55.b = true;
    L42:
        wv4 r59 = (wv4) r55.a;
        if (r55.d != 2) goto L46;
        int r60 = r116.a();
        r59.e(r60, r116);
        ((wv4) r55.a).a(r20, 1, r60, 0, null);
    L45:
        r33 = true;
        goto L140
    L46:
        int r61 = r116.A();
        if (r61 != 0) goto L53;
        if (r55.c == true) goto L53;
        int r62 = r116.a();
        byte[] r63 = new byte[r62];
        r116.k(r63, 0, r62);
        g r64 = xl.D(new h00(r62, r63), false);
        sb1 r119 = new sb1();
        r119.l = lw2.m("video/x-flv");
        r119.m = lw2.m("audio/mp4a-latm");
        r119.j = r64.a;
        r119.E = r64.c;
        r119.F = r64.b;
        r119.p = Collections.singletonList(r63);
        f34.l(r119, r59);
        r55.c = true;
    L51:
        r33 = false;
    L53:
        if (r55.d != 10) goto L55;
        if (r61 != 1) goto L51;
    L55:
        int r65 = r116.a();
        r59.e(r65, r116);
        ((wv4) r55.a).a(r20, 1, r65, 0, null);
        goto L45
    L29:
        if (r118 == 7) goto L36;
        if (r118 == 8) goto L36;
        if (r118 == 10) goto L40;
        final String r66 = "Audio format not supported: " + r55.d;
        throw new TagPayloadReader$UnsupportedFormatException(r66);
    L36:
        if (r118 != 7) goto L38;
        String r67 = "audio/g711-alaw";
    L39:
        sb1 r68 = new sb1();
        r68.l = lw2.m("video/x-flv");
        r68.m = lw2.m(r67);
        r68.E = 1;
        r68.F = 8000;
        f34.l(r68, r117);
        r55.c = true;
        goto L40
    L38:
        r67 = "audio/g711-mlaw";
        goto L39
    L41:
        r116.O(1);
        goto L42
    L14:
        if (r11.b != (-9223372036854775807L)) goto L16;
        r20 = 0;
        goto L17
    L16:
        r12 = this.m;
        goto L12
    L150:
        tb4.a();
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r4) {
        be3 r3 = this.a;
        rk0 r5 = (rk0) r4;
        r5.e(r3.a, 0, 3, false);
        r3.N(0);
        if (r3.D() != 4607062) goto L12;
        r5.e(r3.a, 0, 2, false);
        r3.N(0);
        if ((r3.H() & 250) != 0) goto L12;
        r5.e(r3.a, 0, 4, false);
        r3.N(0);
        int r0 = r3.m();
        r5.s = 0;
        r5.o(r0, false);
        r5.e(r3.a, 0, 4, false);
        r3.N(0);
        if (r3.m() != 0) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        if (r1 != 0) goto L5;
        this.g = 1;
        this.h = false;
    L6:
        this.j = 0;
        return;
    L5:
        this.g = 3;
        goto L6
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.f = r1;
    }

    public final be3 g(l51 r6) {
        int r0 = this.l;
        be3 r1 = this.d;
        byte[] r2 = r1.a;
        if (r0 <= r2.length) goto L5;
        r1.L(0, new byte[Math.max(r2.length * 2, r0)]);
    L6:
        r1.M(this.l);
        r6.readFully(r1.a, 0, this.l);
        return r1;
    L5:
        r1.N(0);
        goto L6
    }
}
