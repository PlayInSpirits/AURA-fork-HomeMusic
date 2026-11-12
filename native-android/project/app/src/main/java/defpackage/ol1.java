package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol1 {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public ol1(int r8) {
        this.d = r8;
        sy r0 = sy.a(r8);
        this.a = r0.a;
        this.b = r0.b;
        this.c = (h12.B(ud3.a0(new double[]{h12.E((r8 >> 16) & 255), h12.E((r8 >> 8) & 255), h12.E(r8 & 255)}, h12.a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static ol1 a(double r45, double r47, double r49) {
        double[] r0 = j51.e;
        if (r47 < 1.0E-4d) goto L120;
        if (r49 < 1.0E-4d) goto L120;
        if (r49 > 99.9999d) goto L120;
        double r5 = r45 % 360.0d;
        if (r5 >= 0.0d) goto L12;
        r5 = r5 + 360.0d;
    L12:
        double r1 = h12.R(r49);
        double r9 = Math.sqrt(r1) * 11.0d;
        h85 r3 = h85.k;
        double r46 = (r5 / 180.0d) * 3.141592653589793d;
        int r15 = -16777216;
        double r13 = 1.0d;
        double r4 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, r3.f), 0.73d);
        double r18 = ((((Math.cos(r46 + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * r3.e) * r3.c;
        double r6 = Math.sin(r46);
        double r22 = Math.cos(r46);
        int r8 = 0;
    L13:
        double r25 = r13;
        int r29 = r15;
        if (r8 >= 5) goto L47;
        double r14 = r9 / 100.0d;
        if (r47 != 0.0d) goto L18;
    L22:
        double r31 = 0.0d;
    L21:
        int r34 = 8;
        double r11 = r31 * r4;
        double[] r32 = r0;
        double r35 = r1;
        double r2 = Math.pow(r11, 1.1111111111111112d);
        double r7 = (Math.pow(r14, (r25 / r3.d) / r3.j) * r3.a) / r3.b;
        double r12 = (((0.305d + r7) * 23.0d) * r2) / (((108.0d * r2) * r6) + (((r2 * 11.0d) * r22) + (23.0d * r18)));
        double r16 = r12 * r22;
        double r17 = r12 * r6;
        double r10 = r7 * 460.0d;
        int r33 = 1;
        double[] r19 = ud3.a0(new double[]{j51.A(((288.0d * r17) + ((451.0d * r16) + r10)) / 1403.0d), j51.A(((r10 - (891.0d * r16)) - (261.0d * r17)) / 1403.0d), j51.A(((r10 - (r16 * 220.0d)) - (r17 * 6300.0d)) / 1403.0d)}, j51.d);
        double r20 = r19[0];
        if (r20 < 0.0d) goto L32;
        double r110 = r19[1];
        if (r110 < 0.0d) goto L32;
        double r111 = r19[2];
        if (r111 < 0.0d) goto L32;
        double r37 = r32[0];
        double r41 = (r32[2] * r111) + ((r32[1] * r110) + (r37 * r20));
        if (r41 <= 0.0d) goto L32;
        if (r8 == 4) goto L39;
        double r21 = r41 - r35;
        if (Math.abs(r21) < 0.002d) goto L39;
        r9 = r9 - ((r21 * r9) / (r41 * 2.0d));
        r8 = r8 + 1;
        r13 = r25;
        r15 = r29;
        r0 = r32;
        r1 = r35;
    L39:
        double r23 = r19[0];
        if (r23 > 100.01d) goto L32;
        if (r19[1] > 100.01d) goto L32;
        if (r19[2] > 100.01d) goto L32;
        int r24 = (h12.l(r19[2]) & 255) | ((((h12.l(r23) & 255) << 16) | r29) | ((h12.l(r19[1]) & 255) << 8));
    L48:
        if (r24 != 0) goto L122;
        double[] r26 = new double[3];
        r26[0] = -1.0d;
        r26[r33] = -1.0d;
        r26[2] = -1.0d;
        double[] r27 = r26;
        double r28 = 0.0d;
        double r30 = 0.0d;
        boolean r36 = false;
        int r38 = 0;
        int r39 = r33;
    L52:
        if (r38 >= 12) goto L95;
        double r40 = r32[0];
        double r112 = r32[r33];
        double r113 = r32[2];
        boolean r114 = r36;
        if ((r38 % 4) > r33) goto L56;
        double r210 = 0.0d;
    L58:
        if ((r38 % 2) != 0) goto L61;
        double r211 = 0.0d;
    L62:
        if (r38 >= 4) goto L69;
        double r115 = ((r35 - (r112 * r210)) - (r113 * r211)) / r40;
        if (j51.B(r115) == false) goto L67;
        double[] r42 = {r115, r210, r211};
    L66:
        double[] r116 = r42;
    L79:
        if (r116[0] < 0.0d) goto L88;
        double r43 = j51.y(r116);
        if (r114 == true) goto L84;
        double r117 = r46;
        r28 = r43;
        r30 = r28;
        r26 = r116;
        r27 = r26;
        r36 = true;
    L94:
        r38 = r38 + 1;
        r46 = r117;
        r33 = 1;
        r34 = 8;
        goto L52
    L84:
        if (r39 == 0) goto L86;
    L87:
        double r48 = r46;
        double r410 = r28;
        r28 = r410;
        r117 = r48;
        if (j51.i(r410, r48, r43) == false) goto L93;
        r30 = r43;
        r27 = r116;
    L92:
        r36 = r114;
        r39 = 0;
        goto L94
    L93:
        r28 = r43;
        r26 = r116;
        goto L92
    L86:
        if (j51.i(r28, r43, r30) == true) goto L87;
    L88:
        r117 = r46;
        r36 = r114;
        goto L94
    L67:
        r42 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L69:
        if (r38 >= r34) goto L74;
        double r44 = ((r35 - (r40 * r211)) - (r113 * r210)) / r112;
        if (j51.B(r44) == false) goto L73;
        r116 = new double[]{r211, r44, r210};
        goto L79
    L73:
        r42 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L74:
        double r50 = ((r35 - (r40 * r210)) - (r112 * r211)) / r113;
        if (j51.B(r50) == false) goto L77;
        r116 = new double[]{r210, r211, r50};
        goto L79
    L77:
        r42 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L61:
        r211 = 100.0d;
        goto L62
    L56:
        r210 = 100.0d;
        goto L58
    L95:
        double r118 = r46;
        double[][] r51 = {r26, r27};
        double[] r52 = r51[0];
        double r53 = j51.y(r52);
        double[] r54 = r51[1];
        int r55 = 0;
    L97:
        if (r55 >= 3) goto L118;
        double r56 = r52[r55];
        double r57 = r54[r55];
        if (r56 == r57) goto L117;
        if (r56 >= r57) goto L104;
        int r58 = (int) Math.floor(j51.S(r56) - 0.5d);
        double r59 = Math.ceil(j51.S(r54[r55]) - 0.5d);
    L103:
        int r60 = (int) r59;
        int r61 = 0;
    L107:
        if (r61 >= 8) goto L116;
        if (Math.abs(r60 - r58) <= 1) goto L116;
        int r62 = (int) Math.floor(((double) (r58 + r60)) / 2.0d);
        double r119 = j51.f[r62];
        double r63 = r52[r55];
        double r120 = (r119 - r63) / (r54[r55] - r63);
        double r64 = r52[0];
        double r212 = ((r54[0] - r64) * r120) + r64;
        double r65 = r52[1];
        double r213 = ((r54[1] - r65) * r120) + r65;
        double r66 = r52[2];
        double[] r121 = {r212, r213, ((r54[2] - r66) * r120) + r66};
        double r122 = j51.y(r121);
        double r411 = r53;
        if (j51.i(r411, r118, r122) == false) goto L114;
        r60 = r62;
        r54 = r121;
        r53 = r411;
    L115:
        r61 = r61 + 1;
        goto L107
    L114:
        r58 = r62;
        r52 = r121;
        r53 = r122;
    L116:
        r53 = r53;
        goto L117
    L104:
        r58 = (int) Math.ceil(j51.S(r56) - 0.5d);
        r59 = Math.floor(j51.S(r54[r55]) - 0.5d);
    L117:
        r55 = r55 + 1;
        goto L97
    L118:
        double[] r67 = {(r52[0] + r54[0]) / 2.0d, (r52[1] + r54[1]) / 2.0d, (r52[2] + r54[2]) / 2.0d};
        int r68 = (((h12.l(r67[0]) & 255) << 16) | r29) | ((h12.l(r67[1]) & 255) << 8);
        int r69 = h12.l(r67[2]) & 255;
    L119:
        r24 = r69 | r68;
    L122:
        return new ol1(r24);
    L32:
        r24 = 0;
        goto L48
    L18:
        if (r9 == 0.0d) goto L22;
        r31 = r47 / Math.sqrt(r14);
        goto L21
    L47:
        r32 = r0;
        r35 = r1;
        r33 = 1;
        r34 = 8;
    L120:
        r69 = h12.l(h12.R(r49)) & 255;
        r68 = ((r69 << 16) | (-16777216)) | (r69 << 8);
        goto L119
    }
}
