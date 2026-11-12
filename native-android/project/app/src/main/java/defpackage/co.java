package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co implements k51 {
    public final be3 a;
    public final v2 b;
    public final boolean c;
    public final om0 d;
    public int e;
    public m51 f;
    public eo g;
    public long h;
    public u20[] i;
    public long j;
    public u20 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public co(int r2, om0 r3) {
        this.d = r3;
        boolean r4 = true;
        if ((r2 & 1) == 0) goto L6;
        r4 = false;
    L6:
        this.c = r4;
        this.a = new be3(12);
        this.b = new v2();
        this.f = new tv1();
        this.i = new u20[0];
        this.m = -1;
        this.n = -1;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r23, t71 r24) {
        int r6 = 0;
        if (this.j == (-1)) goto L11;
        long r7 = r23.getPosition();
        long r9 = this.j;
        if (r9 < r7) goto L10;
        if (r9 > (262144 + r7)) goto L10;
        r23.l((int) (r9 - r7));
    L10:
        r24.a = r9;
        boolean r2 = true;
    L12:
        this.j = -1;
        if (r2 == false) goto L15;
        return 1;
    L15:
        int r3 = this.e;
        int r13 = 4;
        int r15 = 8;
        u20 r4 = null;
        v2 r10 = this.b;
        int r20 = 2;
        be3 r12 = this.a;
        switch(r3) {
            case 0: goto L198;
            case 1: goto L187;
            case 2: goto L150;
            case 3: goto L127;
            case 4: goto L120;
            case 5: goto L69;
            case 6: goto L20;
            default: goto L18;
        };
    L69:
        be3 r5 = new be3(this.o);
        r23.readFully(r5.a, 0, this.o);
        if (r5.a() >= 16) goto L72;
        long r11 = 0;
    L78:
        if (r5.a() < 16) goto L103;
        int r1 = r5.o();
        int r8 = r5.o();
        long r14 = ((long) r5.o()) + r11;
        r5.O(r13);
        u20[] r16 = this.i;
        int r17 = r16.length;
        int r18 = 0;
    L80:
        if (r18 >= r17) goto L87;
        u20 r19 = r16[r18];
        if (r19.c == r1) goto L88;
        if (r19.d == r1) goto L88;
        r18 = r18 + 1;
    L88:
        if (r19 == null) goto L89;
        if ((r8 & 16) != 16) goto L93;
        boolean r21 = true;
    L95:
        if (r19.l != (-1)) goto L97;
        r19.l = r14;
    L97:
        if (r21 == true) goto L99;
    L102:
        r19.j++;
        goto L89
    L99:
        if (r19.k != r19.n.length) goto L101;
        long[] r22 = r19.m;
        r19.m = Arrays.copyOf(r22, (r22.length * 3) / 2);
        int[] r25 = r19.n;
        r19.n = Arrays.copyOf(r25, (r25.length * 3) / 2);
    L101:
        long[] r26 = r19.m;
        int r27 = r19.k;
        r26[r27] = r14;
        r19.n[r27] = r19.j;
        r19.k = r27 + 1;
        goto L102
    L93:
        r21 = false;
    L89:
        r13 = 4;
        goto L78
    L87:
        r19 = null;
        goto L88
    L103:
        u20[] r28 = this.i;
        int r29 = r28.length;
        int r30 = 0;
    L104:
        if (r30 >= r29) goto L113;
        u20 r31 = r28[r30];
        r31.m = Arrays.copyOf(r31.m, r31.k);
        r31.n = Arrays.copyOf(r31.n, r31.k);
        if ((r31.c & 1651965952) != 1651965952) goto L112;
        if (r31.a.f == 0) goto L112;
        int r32 = r31.k;
        if (r32 <= 0) goto L112;
        r31.f = r32;
    L112:
        r30 = r30 + 1;
        goto L104
    L113:
        this.p = true;
        int r33 = this.i.length;
        m51 r34 = this.f;
        long r35 = this.h;
        if (r33 != 0) goto L117;
        r34.w(new bo(r35));
    L118:
        this.e = 6;
        this.j = this.m;
        return 0;
    L117:
        r34.w(new bo(this, r35, 0));
        goto L118
    L72:
        int r36 = r5.b;
        r5.O(8);
        long r110 = r5.o();
        long r111 = this.m;
        if (r110 <= r111) goto L75;
        r11 = 0;
    L76:
        r5.N(r36);
        goto L78
    L75:
        r11 = r111 + 8;
        goto L76
    L120:
        r23.readFully(r12.a, 0, 8);
        r12.N(0);
        int r37 = r12.o();
        int r38 = r12.o();
        if (r37 != 829973609) goto L124;
        this.e = 5;
        this.o = r38;
        return 0;
    L124:
        this.j = r23.getPosition() + ((long) r38);
        return 0;
    L150:
        int r39 = this.l - 4;
        be3 r40 = new be3(r39);
        r23.readFully(r40.a, 0, r39);
        rb2 r41 = rb2.b(1819436136, r40);
        int r42 = r41.b;
        if (r42 != 1819436136) goto L186;
        eo r43 = (eo) r41.a(eo.class);
        if (r43 == null) goto L184;
        this.g = r43;
        this.h = ((long) r43.c) * ((long) r43.a);
        ArrayList r44 = new ArrayList();
        vw1 r45 = r41.a.m(0);
        int r46 = 0;
    L156:
        if (r45.hasNext() == false) goto L181;
        ao r47 = (ao) r45.next();
        if (r47.getType() != 1819440243) goto L180;
        rb2 r48 = (rb2) r47;
        int r49 = r46 + 1;
        fo r50 = (fo) r48.a(fo.class);
        dm4 r51 = (dm4) r48.a(dm4.class);
        if (r50 != null) goto L164;
        l93.q0("AviExtractor", "Missing Stream Header");
    L162:
        int r210 = r49;
    L163:
        u20 r52 = null;
    L177:
        if (r52 == null) goto L179;
        r44.add(r52);
    L179:
        r46 = r210;
        goto L180
    L164:
        if (r51 != null) goto L166;
        l93.q0("AviExtractor", "Missing Stream Format");
        goto L162
    L166:
        long r112 = r50.d;
        long r113 = ((long) r50.b) * 1000000;
        r210 = r49;
        long r53 = r50.c;
        String r114 = f35.a;
        long r54 = f35.a0(r112, r113, r53, RoundingMode.DOWN);
        tb1 r55 = r51.a;
        sb1 r115 = r55.a();
        r115.a = Integer.toString(r46);
        int r116 = r50.e;
        if (r116 == 0) goto L169;
        r115.n = r116;
    L169:
        hm4 r56 = (hm4) r48.a(hm4.class);
        if (r56 == null) goto L172;
        r115.b = r56.a;
    L172:
        int r57 = lw2.h(r55.n);
        if (r57 != 1) goto L175;
    L176:
        wv4 r58 = this.f.t(r46, r57);
        r58.g(new tb1(r115));
        r58.d(r54);
        this.h = Math.max(this.h, r54);
        r52 = new u20(r46, r50, r58);
        goto L177
    L175:
        if (r57 != r20) goto L163;
    L180:
        r6 = 0;
        r20 = 2;
        goto L156
    L181:
        int r59 = r6;
        this.i = (u20[]) r44.toArray(new u20[r59]);
        this.f.p();
        this.e = 3;
        return r59;
    L184:
        throw ParserException.a(null, "AviHeader not found");
    L186:
        throw ParserException.a(null, "Unexpected header list type " + r42);
    L187:
        r23.readFully(r12.a, 0, 12);
        r12.N(0);
        r10.getClass();
        r10.a = r12.o();
        r10.b = r12.o();
        r10.c = 0;
        if (r10.a != 1414744396) goto L196;
        int r60 = r12.o();
        r10.c = r60;
        if (r60 != 1819436136) goto L194;
        this.l = r10.b;
        this.e = 2;
        return 0;
    L194:
        throw ParserException.a(null, "hdrl expected, found: " + r10.c);
    L196:
        throw ParserException.a(null, "LIST expected, found: " + r10.a);
    L18:
        throw new AssertionError();
    L20:
        if (r23.getPosition() < this.n) goto L23;
        return -1;
    L23:
        u20 r61 = this.k;
        if (r61 == null) goto L42;
        int r62 = r61.h;
        int r63 = r62 - r61.b.f(r23, r62, false);
        r61.h = r63;
        if (r63 != 0) goto L28;
        boolean r64 = true;
    L29:
        if (r64 == true) goto L31;
    L38:
        if (r64 == false) goto L40;
        this.k = null;
    L40:
        return 0;
    L31:
        if (r61.g <= 0) goto L37;
        wv4 r65 = r61.b;
        int r66 = r61.i;
        long r67 = (r61.e * ((long) r66)) / ((long) r61.f);
        if (Arrays.binarySearch(r61.n, r66) < 0) goto L35;
        int r117 = 1;
    L36:
        r65.a(r67, r117, r61.g, 0, null);
        goto L37
    L35:
        r117 = 0;
    L37:
        r61.i++;
        goto L38
    L28:
        r64 = false;
        goto L29
    L42:
        if ((r23.getPosition() & 1) != 1) goto L44;
        r23.l(1);
    L44:
        r23.n(r12.a, 0, 12);
        r12.N(0);
        int r68 = r12.o();
        if (r68 != 1414744396) goto L51;
        r12.N(8);
        if (r12.o() != 1769369453) goto L49;
        r15 = 12;
    L49:
        r23.l(r15);
        r23.k();
        return 0;
    L51:
        int r69 = r12.o();
        if (r68 != 1263424842) goto L55;
        this.j = (r23.getPosition() + ((long) r69)) + 8;
        return 0;
    L55:
        r23.l(8);
        r23.k();
        u20[] r70 = this.i;
        int r71 = r70.length;
        int r72 = 0;
    L56:
        if (r72 >= r71) goto L64;
        u20 r73 = r70[r72];
        if (r73.c == r68) goto L63;
        if (r73.d == r68) goto L63;
        r72 = r72 + 1;
    L63:
        r4 = r73;
    L64:
        if (r4 != null) goto L67;
        this.j = r23.getPosition() + ((long) r69);
        return 0;
    L67:
        r4.g = r69;
        r4.h = r69;
        this.k = r4;
        return 0;
    L127:
        if (this.m == (-1)) goto L132;
        long r74 = r23.getPosition();
        long r75 = this.m;
        if (r74 == r75) goto L132;
        this.j = r75;
        return 0;
    L132:
        r23.n(r12.a, 0, 12);
        r23.k();
        r12.N(0);
        r10.getClass();
        r10.a = r12.o();
        r10.b = r12.o();
        r10.c = 0;
        int r76 = r12.o();
        int r77 = r10.a;
        if (r77 != 1179011410) goto L136;
        r23.l(12);
        return 0;
    L136:
        if (r77 != 1414744396) goto L148;
        if (r76 != 1769369453) goto L148;
        long r78 = r23.getPosition();
        this.m = r78;
        this.n = (r78 + ((long) r10.b)) + 8;
        if (this.p == true) goto L146;
        eo r79 = this.g;
        r79.getClass();
        if ((r79.b & 16) != 16) goto L145;
        this.e = 4;
        this.j = this.n;
        return 0;
    L145:
        this.f.w(new bo(this.h));
        this.p = true;
    L146:
        this.j = r23.getPosition() + 12;
        this.e = 6;
        return 0;
    L148:
        this.j = (r23.getPosition() + ((long) r10.b)) + 8;
        return 0;
    L198:
        if (c(r23) == false) goto L202;
        r23.l(12);
        this.e = 1;
        return 0;
    L202:
        throw ParserException.a(null, "AVI Header List not found");
    L11:
        r2 = false;
        goto L12
    }

    @Override // defpackage.k51
    public final boolean c(l51 r4) {
        be3 r3 = this.a;
        r4.n(r3.a, 0, 12);
        r3.N(0);
        if (r3.o() == 1179011410) goto L5;
        return false;
    L5:
        r3.O(4);
        if (r3.o() != 541677121) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r6, long r8) {
        this.j = -1;
        this.k = null;
        u20[] r9 = this.i;
        int r10 = r9.length;
        int r1 = 0;
    L3:
        if (r1 >= r10) goto L10;
        u20 r2 = r9[r1];
        if (r2.k != 0) goto L7;
        r2.i = 0;
    L8:
        r1 = r1 + 1;
        goto L3
    L7:
        r2.i = r2.n[f35.f(r2.m, r6, true)];
        goto L8
    L10:
        if (r6 == 0) goto L12;
        this.e = 6;
        return;
    L12:
        if (this.i.length != 0) goto L15;
        this.e = 0;
        return;
    L15:
        this.e = 3;
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        this.e = 0;
        if (this.c == false) goto L5;
        r3 = new ll(r3, this.d);
    L5:
        this.f = r3;
        this.j = -1;
    }
}
