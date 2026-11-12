package defpackage;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cf3 {
    public char a;
    public final float[] b;

    public cf3(cf3 r2) {
        this.a = r2.a;
        float[] r3 = r2.b;
        this.b = fh0.i(r3, r3.length);
    }

    public static void a(Path r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, boolean r62, boolean r63) {
        double r4 = Math.toRadians(r61);
        double r8 = Math.cos(r4);
        double r10 = Math.sin(r4);
        double r12 = r55;
        double r5 = r56;
        double r14 = r59;
        double r18 = ((r5 * r10) + (r12 * r8)) / r14;
        double r0 = r60;
        double r20 = ((r5 * r8) + (((double) (-r55)) * r10)) / r0;
        double r1 = r58;
        double r26 = ((r1 * r10) + (((double) r57) * r8)) / r14;
        double r24 = ((r1 * r8) + (((double) (-r57)) * r10)) / r0;
        double r2 = r18 - r26;
        double r28 = r20 - r24;
        double r30 = (r18 + r26) / 2.0d;
        double r34 = (r20 + r24) / 2.0d;
        double r3 = (r28 * r28) + (r2 * r2);
        if (r3 != 0.0d) goto L6;
        Log.w("PathParser", " Points are coincident");
        return;
    L6:
        double r42 = (1.0d / r3) - 0.25d;
        if (r42 >= 0.0d) goto L10;
        Log.w("PathParser", "Points are too far apart " + r3);
        float r6 = (float) (Math.sqrt(r3) / 1.99999d);
        a(r54, r55, r56, r57, r58, r59 * r6, r6 * r60, r61, r62, r63);
        return;
    L10:
        double r7 = Math.sqrt(r42);
        double r9 = r7 * r2;
        double r11 = r7 * r28;
        if (r62 != r63) goto L13;
        double r31 = r30 - r11;
        double r35 = r34 + r9;
    L14:
        double r13 = Math.atan2(r20 - r35, r18 - r31);
        double r15 = Math.atan2(r24 - r35, r26 - r31) - r13;
        if (r15 < 0.0d) goto L17;
        boolean r16 = true;
    L18:
        if (r63 != r16) goto L20;
    L23:
        double r32 = r31 * r14;
        double r36 = r35 * r0;
        double r19 = (r32 * r8) - (r36 * r10);
        double r37 = (r36 * r8) + (r32 * r10);
        int r17 = (int) Math.ceil(Math.abs((r15 * 4.0d) / 3.141592653589793d));
        double r21 = Math.cos(r4);
        double r110 = Math.sin(r4);
        double r22 = Math.cos(r13);
        double r25 = Math.sin(r13);
        double r23 = -r14;
        double r27 = r23 * r21;
        double r33 = r0 * r110;
        double r29 = (r27 * r25) - (r33 * r22);
        double r38 = r23 * r110;
        double r210 = r0 * r21;
        double r39 = r15 / ((double) r17);
        double r211 = (r22 * r210) + (r25 * r38);
        double r212 = r12;
        double r111 = r5;
        int r40 = 0;
        double r41 = r13;
    L24:
        if (r40 >= r17) goto L26;
        double r310 = r41 + r39;
        double r43 = Math.sin(r310);
        double r44 = Math.cos(r310);
        int r45 = r17;
        double r46 = (((r14 * r21) * r44) + r19) - (r33 * r43);
        double r47 = (r210 * r43) + (((r14 * r110) * r44) + r37);
        double r48 = (r27 * r43) - (r33 * r44);
        double r49 = (r44 * r210) + (r43 * r38);
        double r410 = r310 - r41;
        double r411 = Math.tan(r410 / 2.0d);
        double r412 = ((Math.sqrt(((r411 * 3.0d) * r411) + 4.0d) - 1.0d) * Math.sin(r410)) / 3.0d;
        double r112 = (r211 * r412) + r111;
        double r213 = r38;
        r54.rLineTo(0.0f, 0.0f);
        r54.cubicTo((float) ((r29 * r412) + r212), (float) r112, (float) (r46 - (r412 * r48)), (float) (r47 - (r412 * r49)), (float) r46, (float) r47);
        r40 = r40 + 1;
        r111 = r47;
        r21 = r21;
        r38 = r213;
        r41 = r310;
        r211 = r49;
        r212 = r46;
        r17 = r45;
        r29 = r48;
        r39 = r39;
        goto L24
    L26:
        return;
    L20:
        if (r15 <= 0.0d) goto L22;
        r15 = r15 - 6.283185307179586d;
        goto L23
    L22:
        r15 = r15 + 6.283185307179586d;
        goto L23
    L17:
        r16 = false;
        goto L18
    L13:
        r31 = r30 + r11;
        r35 = r34 - r9;
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(cf3[] r33, Path r34) {
        cf3[] r0 = r33;
        float[] r12 = new float[6];
        int r13 = r0.length;
        int r15 = 0;
        int r8 = 0;
        char r2 = 'm';
    L3:
        if (r8 >= r13) goto L142;
        cf3 r9 = r0[r8];
        char r10 = r9.a;
        float[] r3 = r9.b;
        float r4 = r12[r15];
        float r5 = r12[1];
        float r6 = r12[2];
        float r7 = r12[3];
        float r11 = r12[4];
        int r21 = r15;
        float r16 = r12[5];
        switch(r10) {
            case 65: goto L11;
            case 67: goto L10;
            case 72: goto L9;
            case 81: goto L8;
            case 83: goto L8;
            case 86: goto L9;
            case 90: goto L7;
            case 97: goto L11;
            case 99: goto L10;
            case 104: goto L9;
            case 113: goto L8;
            case 115: goto L8;
            case 118: goto L9;
            case 122: goto L7;
            default: goto L6;
        };
    L6:
        int r22 = 2;
    L12:
        float r23 = r11;
        float r24 = r16;
        float r14 = r4;
        float r17 = r5;
        int r18 = r21;
    L14:
        if (r18 >= r3.length) goto L141;
        if (r10 != 'A') goto L18;
        r3 = r3;
        r18 = r18;
        r9 = r9;
        float r19 = r14;
        float r20 = r17;
        r8 = r8;
        int r110 = r18 + 5;
        float r25 = r3[r110];
        int r27 = r18 + 6;
        float r26 = r3[r27];
        float r28 = r3[r18];
        float r29 = r3[r18 + 1];
        float r30 = r3[r18 + 2];
        if (r3[r18 + 3] == 0.0f) goto L133;
        boolean r31 = 1;
    L135:
        if (r3[r18 + 4] == 0.0f) goto L138;
        boolean r111 = 1;
    L139:
        a(r34, r19, r20, r25, r26, r28, r29, r30, r31, r111);
        r6 = r3[r110];
        float r32 = r3[r27];
        r7 = r32;
        float r35 = r6;
    L140:
        r18 = r18 + r22;
        r34 = r34;
        r9 = r9;
        r10 = r10;
        r8 = r8;
        r14 = r35;
        r17 = r32;
        r2 = r10;
        r3 = r3;
        goto L14
    L138:
        r111 = r21;
        goto L139
    L133:
        r31 = r21;
        goto L135
    L18:
        if (r10 != 'C') goto L20;
        r3 = r3;
        r18 = r18;
        r8 = r8;
        r9 = r9;
        int r36 = r18 + 2;
        int r37 = r18 + 3;
        int r112 = r18 + 4;
        int r113 = r18 + 5;
        r34.cubicTo(r3[r18], r3[r18 + 1], r3[r36], r3[r37], r3[r112], r3[r113]);
        float r1 = r3[r112];
        float r38 = r3[r113];
        r6 = r3[r36];
        r7 = r3[r37];
        r32 = r38;
        r35 = r1;
        goto L140
    L20:
        if (r10 != 'H') goto L22;
        r3 = r3;
        r18 = r18;
        r9 = r9;
        r32 = r17;
        r8 = r8;
        r34.lineTo(r3[r18], r32);
        r35 = r3[r18];
        goto L140
    L22:
        if (r10 != 'Q') goto L24;
        r3 = r3;
        r18 = r18;
        r8 = r8;
        r9 = r9;
        int r39 = r18 + 1;
        int r40 = r18 + 2;
        int r41 = r18 + 3;
        r34.quadTo(r3[r18], r3[r39], r3[r40], r3[r41]);
        float r42 = r3[r18];
        float r43 = r3[r39];
        float r44 = r3[r40];
        float r45 = r3[r41];
        r6 = r42;
        r7 = r43;
        r35 = r44;
        r32 = r45;
        goto L140
    L24:
        if (r10 != 'V') goto L26;
        r3 = r3;
        r18 = r18;
        r8 = r8;
        r9 = r9;
        r35 = r14;
        r34.lineTo(r35, r3[r18]);
        r32 = r3[r18];
        goto L140
    L26:
        if (r10 != 'a') goto L28;
        r3 = r3;
        r18 = r18;
        int r114 = r18 + 5;
        float r46 = r3[r114] + r14;
        int r210 = r18 + 6;
        float r47 = r3[r210] + r17;
        float r48 = r3[r18];
        float r49 = r3[r18 + 1];
        float r50 = r3[r18 + 2];
        if (r3[r18 + 3] == 0.0f) goto L119;
        boolean r51 = 1;
    L120:
        r9 = r9;
        float r52 = r14;
        if (r3[r18 + 4] == 0.0f) goto L124;
        boolean r115 = 1;
    L123:
        float r53 = r17;
        r8 = r8;
        a(r34, r52, r53, r46, r47, r48, r49, r50, r51, r115);
        r35 = r52 + r3[r114];
        r32 = r53 + r3[r210];
        r6 = r35;
        r7 = r32;
        goto L140
    L124:
        r115 = r21;
        goto L123
    L119:
        r51 = r21;
        goto L120
    L28:
        if (r10 != 'c') goto L30;
        r3 = r3;
        r18 = r18;
        int r116 = r18 + 2;
        int r211 = r18 + 3;
        int r212 = r18 + 4;
        int r213 = r18 + 5;
        r34.rCubicTo(r3[r18], r3[r18 + 1], r3[r116], r3[r211], r3[r212], r3[r213]);
        float r54 = r3[r116] + r14;
        float r55 = r3[r211] + r17;
        r14 = r14 + r3[r212];
        r17 = r17 + r3[r213];
        r6 = r54;
        r7 = r55;
    L78:
        r9 = r9;
        r35 = r14;
        r32 = r17;
        goto L140
    L30:
        if (r10 != 'h') goto L32;
        r3 = r3;
        r18 = r18;
        r34.rLineTo(r3[r18], 0.0f);
        r14 = r14 + r3[r18];
        goto L78
    L32:
        if (r10 != 'q') goto L34;
        r3 = r3;
        r18 = r18;
        int r56 = r18 + 1;
        int r57 = r18 + 2;
        int r58 = r18 + 3;
        r34.rQuadTo(r3[r18], r3[r56], r3[r57], r3[r58]);
        float r59 = r3[r18] + r14;
        float r60 = r3[r56] + r17;
        r14 = r14 + r3[r57];
        float r61 = r3[r58];
    L77:
        r17 = r17 + r61;
        r6 = r59;
        r7 = r60;
        goto L78
    L34:
        if (r10 != 'v') goto L36;
        r3 = r3;
        r18 = r18;
        r34.rLineTo(0.0f, r3[r18]);
        float r62 = r3[r18];
    L84:
        r17 = r17 + r62;
        goto L78
    L36:
        if (r10 != 'L') goto L38;
        r3 = r3;
        r18 = r18;
        int r63 = r18 + 1;
        r34.lineTo(r3[r18], r3[r63]);
        r35 = r3[r18];
        r32 = r3[r63];
    L106:
        r9 = r9;
        goto L140
    L38:
        if (r10 != 'M') goto L40;
        r3 = r3;
        r18 = r18;
        r35 = r3[r18];
        r32 = r3[r18 + 1];
        if (r18 <= 0) goto L110;
        r34.lineTo(r35, r32);
        goto L106
    L110:
        r34.moveTo(r35, r32);
        r23 = r35;
        r24 = r32;
        goto L106
    L40:
        if (r10 != 'S') goto L42;
        r3 = r3;
        r18 = r18;
        if (r2 == 'c') goto L104;
        if (r2 == 's') goto L104;
        if (r2 == 'C') goto L104;
        if (r2 == 'S') goto L104;
    L103:
        float r64 = r14;
        float r65 = r17;
        int r117 = r18 + 1;
        int r118 = r18 + 2;
        int r119 = r18 + 3;
        r34.cubicTo(r64, r65, r3[r18], r3[r117], r3[r118], r3[r119]);
        float r66 = r3[r18];
        float r67 = r3[r117];
        r6 = r66;
        r7 = r67;
        r35 = r3[r118];
        r32 = r3[r119];
    L104:
        r14 = (r14 * 2.0f) - r6;
        r17 = (r17 * 2.0f) - r7;
        goto L103
    L42:
        if (r10 != 'T') goto L44;
        r3 = r3;
        r18 = r18;
        if (r2 != 'q') goto L88;
    L93:
        r14 = (r14 * 2.0f) - r6;
        r17 = (r17 * 2.0f) - r7;
    L94:
        int r68 = r18 + 1;
        r34.quadTo(r14, r17, r3[r18], r3[r68]);
        r35 = r3[r18];
        r32 = r3[r68];
        r9 = r9;
        r6 = r14;
        r7 = r17;
        goto L140
    L88:
        if (r2 == 't') goto L93;
        if (r2 == 'Q') goto L93;
        if (r2 != 'T') goto L94;
    L44:
        if (r10 != 'l') goto L46;
        r3 = r3;
        r18 = r18;
        int r69 = r18 + 1;
        r34.rLineTo(r3[r18], r3[r69]);
        r14 = r14 + r3[r18];
        r62 = r3[r69];
        goto L84
    L46:
        if (r10 == 'm') goto L79;
        if (r10 == 's') goto L66;
        if (r10 == 't') goto L55;
        r35 = r14;
    L51:
        r32 = r17;
        goto L140
    L55:
        if (r2 == 'q') goto L63;
        if (r2 == 't') goto L63;
        if (r2 == 'Q') goto L63;
        if (r2 == 'T') goto L63;
        float r70 = 0.0f;
        float r120 = 0.0f;
    L64:
        int r71 = r18 + 1;
        r34.rQuadTo(r120, r70, r3[r18], r3[r71]);
        float r121 = r120 + r14;
        float r72 = r70 + r17;
        float r122 = r14 + r3[r18];
        r17 = r17 + r3[r71];
        r7 = r72;
        r35 = r122;
        r6 = r121;
    L63:
        r120 = r14 - r6;
        r70 = r17 - r7;
        goto L64
    L66:
        if (r2 == 'c') goto L75;
        if (r2 == 's') goto L75;
        if (r2 == 'C') goto L75;
        if (r2 == 'S') goto L75;
        float r73 = 0.0f;
        float r123 = 0.0f;
    L74:
        int r74 = r18;
        int r214 = r74 + 1;
        int r215 = r74 + 2;
        int r216 = r74 + 3;
        r3 = r3;
        r18 = r74;
        r34.rCubicTo(r73, r123, r3[r74], r3[r214], r3[r215], r3[r216]);
        r59 = r3[r18] + r14;
        r60 = r3[r214] + r17;
        r14 = r14 + r3[r215];
        r61 = r3[r216];
    L75:
        r123 = r17 - r7;
        r73 = r14 - r6;
        goto L74
    L79:
        r3 = r3;
        r18 = r18;
        float r75 = r3[r18];
        r14 = r14 + r75;
        float r76 = r3[r18 + 1];
        r17 = r17 + r76;
        if (r18 <= 0) goto L82;
        r34.rLineTo(r75, r76);
        goto L78
    L82:
        r34.rMoveTo(r75, r76);
        r9 = r9;
        r35 = r14;
        r23 = r35;
        r32 = r17;
        r24 = r32;
        goto L140
    L141:
        r12[r21] = r14;
        r12[1] = r17;
        r12[2] = r6;
        r12[3] = r7;
        r12[4] = r23;
        r12[5] = r24;
        r2 = r9.a;
        r8 = r8 + 1;
        r0 = r33;
        r15 = r21;
        goto L3
    L7:
        r34.close();
        r34.moveTo(r11, r16);
        r4 = r11;
        r6 = r4;
        r5 = r16;
        r7 = r5;
        goto L6
    L8:
        r22 = 4;
        goto L12
    L9:
        r22 = 1;
        goto L12
    L10:
        r22 = 6;
        goto L12
    L11:
        r22 = 7;
        goto L12
    }

    public cf3(char r1, float[] r2) {
        this.a = r1;
        this.b = r2;
    }
}
