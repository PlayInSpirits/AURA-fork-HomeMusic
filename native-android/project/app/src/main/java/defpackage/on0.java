package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 extends nn0 {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final boolean r;
    public final jn0 s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public on0(int r7, sv4 r8, int r9, jn0 r10, int r11, String r12, int r13, boolean r14) {
        super(r7, r8, r9);
        this.s = r10;
        boolean r15 = r10.x0;
        yw1 r16 = r10.m;
        yw1 r17 = r10.o;
        if (r15 == false) goto L5;
        int r18 = 24;
    L6:
        int r19 = 0;
        this.F = false;
        if (r14 == false) goto L25;
        tb1 r3 = this.q;
        int r4 = r3.u;
        if (r4 != (-1)) goto L11;
    L12:
        int r5 = r3.v;
        if (r5 != (-1)) goto L15;
    L16:
        float r6 = r3.y;
        if (r6 != (-1.0f)) goto L19;
    L20:
        int r20 = r3.j;
        if (r20 != (-1)) goto L23;
    L24:
        boolean r21 = true;
    L26:
        this.r = r21;
        if (r14 == false) goto L45;
        tb1 r110 = this.q;
        int r22 = r110.u;
        if (r22 != (-1)) goto L31;
    L32:
        int r23 = r110.v;
        if (r23 != (-1)) goto L35;
    L36:
        float r24 = r110.y;
        if (r24 != (-1.0f)) goto L39;
    L40:
        int r111 = r110.j;
        if (r111 != (-1)) goto L43;
    L44:
        boolean r112 = true;
    L46:
        this.t = r112;
        this.u = kq.n(r11, false);
        tb1 r113 = this.q;
        float r25 = r113.y;
        if (r25 != (-1.0f)) goto L49;
    L51:
        boolean r0 = false;
    L52:
        this.v = r0;
        this.w = r113.j;
        int r1 = r113.u;
        if (r1 == (-1)) goto L58;
        int r114 = r113.v;
        if (r114 == (-1)) goto L58;
        int r2 = r1 * r114;
    L59:
        this.x = r2;
        int r115 = 0;
    L60:
        int r26 = Integer.MAX_VALUE;
        if (r115 >= r17.size()) goto L66;
        int r27 = pn0.c(this.q, (String) r17.get(r115), false);
        if (r27 > 0) goto L67;
        r115 = r115 + 1;
    L67:
        this.z = r115;
        this.A = r27;
        int r28 = this.q.f;
        int r116 = r10.p;
        gb3 r29 = pn0.k;
        if (r28 == 0) goto L71;
        if (r28 != r116) goto L71;
        int r30 = Integer.MAX_VALUE;
    L72:
        this.B = r30;
        int r31 = this.q.f;
        if (r31 != 0) goto L75;
    L78:
        boolean r32 = true;
    L79:
        this.D = r32;
        if (pn0.f(r12) != null) goto L82;
        boolean r33 = true;
    L83:
        this.E = pn0.c(this.q, r12, r33);
        int r34 = 0;
    L85:
        if (r34 >= r16.size()) goto L92;
        String r117 = this.q.n;
        if (r117 == null) goto L91;
        if (r117.equals(r16.get(r34)) == false) goto L91;
        r26 = r34;
    L91:
        r34 = r34 + 1;
    L92:
        this.y = r26;
        this.C = pn0.a(this.q, r10.n);
        if ((r11 & 384) != 128) goto L95;
        boolean r35 = true;
    L96:
        this.H = r35;
        if ((r11 & 64) != 64) goto L99;
        boolean r36 = true;
    L100:
        this.I = r36;
        tb1 r37 = this.q;
        String r38 = r37.n;
        if (r38 == null) goto L127;
        int r118 = 4;
        switch(r38.hashCode()) {
            case -1851077871: goto L123;
            case -1662735862: goto L119;
            case -1662541442: goto L115;
            case 1331836730: goto L111;
            case 1599127257: goto L107;
            default: goto L105;
        };
    L105:
        byte r39 = -1;
    L126:
        switch(r39) {
            case 0: goto L131;
            case 1: goto L132;
            case 2: goto L130;
            case 3: goto L129;
            case 4: goto L128;
            default: goto L127;
        };
    L128:
        r118 = 2;
        goto L132
    L129:
        r118 = 1;
        goto L132
    L130:
        r118 = 3;
        goto L132
    L131:
        r118 = 5;
    L132:
        this.J = r118;
        boolean r40 = this.r;
        jn0 r119 = this.s;
        if ((r37.f & 16384) == 0) goto L136;
    L157:
        this.G = r19;
        return;
    L136:
        if (kq.n(r11, r119.B0) == false) goto L157;
        if (r40 == true) goto L143;
        if (r119.w0 == false) goto L157;
    L143:
        if (kq.n(r11, false) == true) goto L145;
    L156:
        r19 = 1;
        goto L157
    L145:
        if (this.t == false) goto L156;
        if (r40 == false) goto L156;
        if (r37.j == (-1)) goto L156;
        if (r119.G == true) goto L156;
        if (r119.F == true) goto L156;
        if ((r18 & r11) == 0) goto L156;
        r19 = 2;
        goto L157
    L107:
        if (r38.equals("video/x-vnd.on2.vp9") == false) goto L165;
        r39 = 4;
        goto L126
    L165:
        r39 = -1;
        goto L126
    L111:
        if (r38.equals("video/avc") == false) goto L166;
        r39 = 3;
        goto L126
    L166:
        r39 = -1;
        goto L126
    L115:
        if (r38.equals("video/hevc") == false) goto L167;
        r39 = 2;
        goto L126
    L167:
        r39 = -1;
        goto L126
    L119:
        if (r38.equals("video/av01") == false) goto L168;
        r39 = 1;
        goto L126
    L168:
        r39 = -1;
        goto L126
    L123:
        if (r38.equals("video/dolby-vision") == false) goto L169;
        r39 = 0;
        goto L126
    L169:
        r39 = -1;
    L127:
        r118 = 0;
        goto L132
    L99:
        r36 = false;
        goto L100
    L95:
        r35 = false;
        goto L96
    L82:
        r33 = false;
        goto L83
    L75:
        if ((r31 & 1) != 0) goto L78;
        r32 = false;
    L71:
        r30 = Integer.bitCount(r28 & r116);
        goto L72
    L66:
        r27 = 0;
        r115 = Integer.MAX_VALUE;
    L58:
        r2 = -1;
        goto L59
    L49:
        if (r25 < 10.0f) goto L51;
        r0 = true;
        goto L52
    L43:
        if (r111 < r10.h) goto L45;
    L39:
        if (r24 < r10.g) goto L45;
    L35:
        if (r23 < r10.f) goto L45;
    L31:
        if (r22 >= r10.e) goto L32;
    L45:
        r112 = false;
        goto L46
    L23:
        if (r20 > r10.d) goto L25;
    L19:
        if (r6 > r10.c) goto L25;
    L15:
        if (r5 > r10.b) goto L25;
    L11:
        if (r4 <= r10.a) goto L12;
    L25:
        r21 = false;
        goto L26
    L5:
        r18 = 16;
        goto L6
    }

    public static int c(on0 r4, on0 r5) {
        boolean r0 = r4.u;
        boolean r1 = r5.u;
        v60 r2 = v60.a.c(r0, r1);
        Integer r3 = Integer.valueOf(r4.z);
        Integer r6 = Integer.valueOf(r5.z);
        x13 r7 = x13.p;
        v60 r8 = r2.b(r3, r6, r7).a(r4.A, r5.A).a(r4.B, r5.B).b(Integer.valueOf(r4.C), Integer.valueOf(r5.C), r7).c(r4.D, r5.D).a(r4.E, r5.E).c(r4.v, r5.v).c(r4.r, r5.r).c(r4.t, r5.t).b(Integer.valueOf(r4.y), Integer.valueOf(r5.y), r7);
        boolean r9 = r4.H;
        v60 r10 = r8.c(r9, r5.H);
        boolean r11 = r4.I;
        v60 r12 = r10.c(r11, r5.I);
        if (r9 == false) goto L7;
        if (r11 == false) goto L7;
        r12 = r12.a(r4.J, r5.J);
    L7:
        return r12.e();
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.G;
    }

    @Override // defpackage.nn0
    public final boolean b(nn0 r3) {
        on0 r4 = (on0) r3;
        if (this.F == false) goto L5;
    L6:
        this.s.getClass();
        if (this.H == r4.H) goto L9;
        return false;
    L9:
        if (this.I != r4.I) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (Objects.equals(this.q.n, r4.q.n) == true) goto L6;
        return false;
    }
}
