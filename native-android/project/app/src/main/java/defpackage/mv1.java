package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 extends zz1 {
    public static final er1 o = null;
    public final kv1 n;

    static {
        o = new er1(4);
    }

    public mv1(kv1 r1) {
        this.n = r1;
    }

    public static we P(be3 r7, int r8, int r9) {
        int r0 = r7.A();
        Charset r1 = e0(r0);
        int r10 = r8 - 1;
        byte[] r2 = new byte[r10];
        r7.k(r2, 0, r10);
        if (r9 != 2) goto L8;
        String r11 = "image/" + rr2.U(new String(r2, 0, 3, StandardCharsets.ISO_8859_1));
        if ("image/jpg".equals(r11) == false) goto L7;
        r11 = "image/jpeg";
    L7:
        int r12 = 2;
    L12:
        int r3 = r2[r12 + 1] & 255;
        int r13 = r12 + 2;
        int r4 = g0(r2, r13, r0);
        String r5 = new String(r2, r13, r4 - r13, r1);
        int r14 = d0(r0) + r4;
        if (r10 > r14) goto L15;
        byte[] r15 = f35.b;
    L17:
        return new we(r11, r5, r3, r15);
    L15:
        r15 = Arrays.copyOfRange(r2, r14, r10);
        goto L17
    L8:
        r12 = h0(0, r2);
        String r6 = rr2.U(new String(r2, 0, r12, StandardCharsets.ISO_8859_1));
        if (r6.indexOf(47) != (-1)) goto L11;
        r11 = "image/".concat(r6);
        goto L12
    L11:
        r11 = r6;
        goto L12
    }

    public static l10 Q(be3 r14, int r15, int r16, boolean r17, int r18, kv1 r19) {
        int r0 = r14.b;
        int r1 = h0(r0, r14.a);
        String r3 = new String(r14.a, r0, r1 - r0, StandardCharsets.ISO_8859_1);
        r14.N(r1 + 1);
        int r4 = r14.m();
        int r5 = r14.m();
        long r2 = r14.C();
        if (r2 != 4294967295L) goto L5;
        r2 = -1;
    L5:
        long r11 = r14.C();
        if (r11 != 4294967295L) goto L8;
        long r8 = -1;
    L9:
        ArrayList r6 = new ArrayList();
        int r7 = r0 + r15;
    L11:
        if (r14.b >= r7) goto L16;
        nv1 r13 = T(r16, r14, r17, r18, r19);
        if (r13 == null) goto L11;
        r6.add(r13);
        goto L11
    L16:
        return new l10(r3, r4, r5, r2, r8, (nv1[]) r6.toArray(new nv1[0]));
    L8:
        r8 = r11;
        goto L9
    }

    public static m10 R(be3 r16, int r17, int r18, boolean r19, int r20, kv1 r21) {
        int r1 = r16.b;
        int r2 = h0(r1, r16.a);
        String r3 = new String(r16.a, r1, r2 - r1, StandardCharsets.ISO_8859_1);
        r16.N(r2 + 1);
        int r4 = r16.A();
        if ((r4 & 2) == 0) goto L5;
        boolean r5 = true;
    L7:
        if ((r4 & 1) == 0) goto L9;
        boolean r6 = true;
    L10:
        int r7 = r16.A();
        String[] r8 = new String[r7];
        int r9 = 0;
    L11:
        if (r9 >= r7) goto L13;
        int r10 = r16.b;
        int r11 = h0(r10, r16.a);
        r8[r9] = new String(r16.a, r10, r11 - r10, StandardCharsets.ISO_8859_1);
        r16.N(r11 + 1);
        r9 = r9 + 1;
        goto L11
    L13:
        ArrayList r12 = new ArrayList();
        int r13 = r1 + r17;
    L15:
        if (r16.b >= r13) goto L20;
        nv1 r14 = T(r18, r16, r19, r20, r21);
        if (r14 == null) goto L15;
        r12.add(r14);
        goto L15
    L20:
        return new m10(r3, r5, r6, r8, (nv1[]) r12.toArray(new nv1[0]));
    L9:
        r6 = false;
        goto L10
    L5:
        r5 = false;
        goto L7
    }

    public static l60 S(int r7, be3 r8) {
        if (r7 >= 4) goto L6;
        return null;
    L6:
        int r1 = r8.A();
        Charset r2 = e0(r1);
        byte[] r4 = new byte[3];
        r8.k(r4, 0, 3);
        String r6 = new String(r4, 0, 3);
        int r9 = r7 - 4;
        byte[] r0 = new byte[r9];
        r8.k(r0, 0, r9);
        int r10 = g0(r0, 0, r1);
        String r11 = new String(r0, 0, r10, r2);
        int r3 = d0(r1) + r10;
        return new l60(r6, r11, X(r0, r3, g0(r0, r3, r1), r2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [nv1] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [be3] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [be3] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [be3] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static nv1 T(int r19, be3 r20, boolean r21, int r22, kv1 r23) {
        int r3 = r19;
        int r2 = r20.A();
        int r1 = r20.A();
        int r4 = r20.A();
        if (r3 < 3) goto L5;
        int r5 = r20.A();
    L7:
        if (r3 != 4) goto L12;
        int r0 = r20.E();
        if (r21 == true) goto L11;
        r0 = (((r0 >> 24) & 255) << 21) | (((r0 & 255) | (((r0 >> 8) & 255) << 7)) | (((r0 >> 16) & 255) << 14));
    L11:
        int r10 = r0;
        if (r3 < 3) goto L17;
        int r11 = r20.H();
    L19:
        if (r2 != 0) goto L27;
        if (r1 != 0) goto L27;
        if (r4 != 0) goto L27;
        if (r5 != 0) goto L27;
        if (r10 != 0) goto L27;
        if (r11 != 0) goto L27;
        r20.N(r20.c);
        return null;
    L27:
        int r13 = r20.b + r10;
        if (r13 <= r20.c) goto L31;
        l93.q0("Id3Decoder", "Frame size exceeds remaining tag data");
        r20.N(r20.c);
        return null;
    L31:
        if (r23 == null) goto L36;
        boolean r15 = r23.d(r3, r2, r1, r4, r5);
        r3 = r3;
        ?? r6 = r2;
        int r7 = r1;
        if (r15 == true) goto L38;
        r20.N(r13);
        return null;
    L38:
        if (r3 == 3) goto L40;
        if (r3 == 4) goto L54;
        boolean r8 = false;
        boolean r12 = false;
        boolean r16 = false;
        boolean r17 = false;
        boolean r18 = false;
    L75:
        if (r8 == true) goto L194;
        if (r17 == true) goto L194;
        if (r16 == false) goto L80;
        r10 = r10 - 1;
        r20.O(1);
    L80:
        if (r12 == false) goto L82;
        r10 = r10 - 4;
        r20.O(4);
    L82:
        if (r18 == false) goto L196;
        r10 = i0(r10, r20);
    L196:
        if (r6 != 84) goto L98;
        if (r7 != 88) goto L98;
        if (r4 != 88) goto L98;
        if (r3 == 2) goto L90;
        if (r5 != 88) goto L98;
    L90:
        Object r9 = a0(r10, r20);     // Catch: Throwable -> L92 Exception -> L94 OutOfMemoryError -> L96
    L91:
        int r14 = r10;
        r10 = r7;
        r7 = r14;
        ?? r24 = r6;
        int r110 = r4;
        int r111 = r5;
        r6 = r20;
        Throwable r112 = null;
    L187:
        r6.N(r13);
        ?? r113 = r9;
        e = r112;
        ?? r25 = r24;
    L191:
        if (r113 != 0) goto L193;
        l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(r3, r25, r10, r110, r111) + ", frameSize=" + r7, e);
    L193:
        return r113;
    L98:
        if (r6 != 84) goto L101;
        r9 = Y(r10, r20, f0(r3, r6, r7, r4, r5));     // Catch: Throwable -> L92 Exception -> L94 OutOfMemoryError -> L96
        goto L91
    L101:
        if (r6 != 87) goto L107;
        if (r7 != 88) goto L107;
        if (r4 != 88) goto L107;
        if (r3 == 2) goto L106;
        if (r5 != 88) goto L107;
    L106:
        r9 = c0(r10, r20);     // Catch: Throwable -> L92 Exception -> L94 OutOfMemoryError -> L96
    L107:
        if (r6 != 87) goto L110;
        r9 = b0(r10, r20, f0(r3, r6, r7, r4, r5));     // Catch: Throwable -> L92 Exception -> L94 OutOfMemoryError -> L96
        goto L91
    L110:
        if (r6 == 80) goto L112;
    L118:
        r112 = null;
        if (r6 != 71) goto L133;
        if (r7 != 69) goto L133;
        if (r4 != 79) goto L133;
        if (r5 == 66) goto L126;
        if (r3 != 2) goto L133;
    L126:
        r9 = U(r10, r20);     // Catch: Throwable -> L92 Exception -> L128 OutOfMemoryError -> L130
    L127:
        int r26 = r10;
        r10 = r7;
        r7 = r26;
        r24 = r6;
        r110 = r4;
        r111 = r5;
        r6 = r20;
    L133:
        if (r3 != 2) goto L138;
        if (r6 != 80) goto L144;
        if (r7 != 73) goto L144;
        if (r4 != 67) goto L144;
    L142:
        r9 = P(r20, r10, r3);     // Catch: Throwable -> L92 Exception -> L128 OutOfMemoryError -> L130
    L144:
        if (r6 != 67) goto L151;
        if (r7 != 79) goto L151;
        if (r4 != 77) goto L151;
        if (r5 == 77) goto L149;
        if (r3 != 2) goto L151;
    L149:
        r9 = S(r10, r20);     // Catch: Throwable -> L92 Exception -> L128 OutOfMemoryError -> L130
    L151:
        if (r6 == 67) goto L153;
    L165:
        int r27 = r10;
        r10 = r7;
        r7 = r27;
        r24 = r6;
        r110 = r4;
        r111 = r5;
        if (r24 != 67) goto L178;
        if (r10 != 84) goto L178;
        if (r110 != 79) goto L178;
        if (r111 != 67) goto L178;
        r3 = r19;
        be3 r28 = r20;
        r9 = R(r28, r7, r3, r21, r22, r23);     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        r6 = r28;
    L198:
    L178:
        r3 = r19;
        be3 r29 = r20;
        if (r24 == 77) goto L181;
    L185:
        String r30 = f0(r3, r24 == true ? 1 : 0, r10, r110, r111);     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        byte[] r31 = new byte[r7];     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        r29.k(r31, 0, r7);     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        r9 = new ks(r30, r31);     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        r6 = r29;
        goto L198
    L181:
        if (r10 != 76) goto L185;
        if (r110 != 76) goto L185;
        if (r111 != 84) goto L185;
        r9 = V(r7, r29);     // Catch: Throwable -> L172 Exception -> L174 OutOfMemoryError -> L176
        r6 = r29;
    L174:
        e = e;
        ?? r32 = r6;
        ?? r33 = r24;
    L190:
        r32.N(r13);
        r113 = r112;
        r25 = r33;
    L176:
        e = e;
        r32 = r6;
        r33 = r24;
    L172:
        th = th;
        ?? r34 = r6;
    L188:
        r34.N(r13);
        throw th;
    L153:
        if (r7 != 72) goto L165;
        if (r4 != 65) goto L165;
        if (r5 != 80) goto L165;
        int r35 = r10;
        r10 = r7;
        r7 = r35;
        r24 = r6;
        r110 = r4;
        r111 = r5;
        r9 = Q(r20, r7, r3, r21, r22, r23);     // Catch: Throwable -> L159 Exception -> L161 OutOfMemoryError -> L163
        r3 = r19;
        r6 = r20;
        goto L187
    L161:
        e = e;
    L162:
        r3 = r19;
        r32 = r20;
        r33 = r24;
    L163:
        e = e;
    L159:
        th = th;
        r34 = r20;
        goto L188
    L138:
        if (r6 != 65) goto L144;
        if (r7 != 80) goto L144;
        if (r4 != 73) goto L144;
        if (r5 != 67) goto L144;
    L128:
        e = e;
    L129:
        int r36 = r10;
        r10 = r7;
        r7 = r36;
        r33 = r6;
        r110 = r4;
        r111 = r5;
        r32 = r20;
    L130:
        e = e;
        goto L129
    L112:
        if (r7 != 82) goto L118;
        if (r4 != 73) goto L118;
        if (r5 != 86) goto L118;
        r9 = W(r10, r20);     // Catch: Throwable -> L92 Exception -> L94 OutOfMemoryError -> L96
    L92:
        th = th;
        r34 = r20;
    L94:
        e = e;
    L95:
        int r37 = r10;
        r10 = r7;
        r7 = r37;
        r33 = r6;
        r110 = r4;
        r111 = r5;
        r32 = r20;
        r112 = null;
    L96:
        e = e;
    L194:
        l93.q0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        r20.N(r13);
        return null;
    L54:
        if ((r11 & 64) == 0) goto L56;
        boolean r38 = true;
    L58:
        if ((r11 & 8) == 0) goto L60;
        boolean r114 = true;
    L62:
        if ((r11 & 4) == 0) goto L64;
        r17 = true;
    L66:
        if ((r11 & 2) == 0) goto L68;
        r18 = true;
    L70:
        if ((r11 & 1) == 0) goto L72;
        r12 = true;
    L73:
        boolean r115 = r114;
        r16 = r38;
        r8 = r115;
        goto L75
    L72:
        r12 = false;
        goto L73
    L68:
        r18 = false;
        goto L70
    L64:
        r17 = false;
        goto L66
    L60:
        r114 = false;
        goto L62
    L56:
        r38 = false;
        goto L58
    L40:
        if ((r11 & 128) == 0) goto L42;
        r8 = true;
    L44:
        if ((r11 & 64) == 0) goto L46;
        boolean r116 = true;
    L48:
        if ((r11 & 32) == 0) goto L50;
        boolean r117 = true;
    L51:
        r17 = r116;
        r18 = false;
        r16 = r117;
        r12 = r8;
        goto L75
    L50:
        r117 = false;
        goto L51
    L46:
        r116 = false;
        goto L48
    L42:
        r8 = false;
        goto L44
    L36:
        r7 = r1;
        r6 = r2;
        goto L38
    L17:
        r11 = 0;
        goto L19
    L12:
        if (r3 != 3) goto L14;
        r0 = r20.E();
        goto L11
    L14:
        r0 = r20.D();
        goto L11
    L5:
        r5 = 0;
        goto L7
    }

    public static hh1 U(int r6, be3 r7) {
        int r0 = r7.A();
        Charset r1 = e0(r0);
        int r8 = r6 - 1;
        byte[] r2 = new byte[r8];
        r7.k(r2, 0, r8);
        int r9 = h0(0, r2);
        String r3 = lw2.m(new String(r2, 0, r9, StandardCharsets.ISO_8859_1));
        int r10 = r9 + 1;
        int r4 = g0(r2, r10, r0);
        String r11 = X(r2, r10, r4, r1);
        int r5 = d0(r0) + r4;
        int r12 = g0(r2, r5, r0);
        String r13 = X(r2, r5, r12, r1);
        int r14 = d0(r0) + r12;
        if (r8 > r14) goto L5;
        byte[] r15 = f35.b;
    L7:
        return new hh1(r3, r11, r13, r15);
    L5:
        r15 = Arrays.copyOfRange(r2, r14, r8);
        goto L7
    }

    public static pw2 V(int r10, be3 r11) {
        int r1 = r11.H();
        int r2 = r11.D();
        int r3 = r11.D();
        int r0 = r11.A();
        int r4 = r11.A();
        h00 r5 = new h00();
        r5.p(r11);
        int r12 = ((r10 - 10) * 8) / (r0 + r4);
        int[] r6 = new int[r12];
        int[] r7 = new int[r12];
        int r8 = 0;
    L3:
        if (r8 >= r12) goto L6;
        int r9 = r5.i(r0);
        int r13 = r5.i(r4);
        r6[r8] = r9;
        r7[r8] = r13;
        r8 = r8 + 1;
        goto L3
    L6:
        return new pw2(r1, r2, r3, r6, r7);
    }

    public static hq3 W(int r4, be3 r5) {
        byte[] r0 = new byte[r4];
        r5.k(r0, 0, r4);
        int r6 = h0(0, r0);
        String r2 = new String(r0, 0, r6, StandardCharsets.ISO_8859_1);
        int r7 = r6 + 1;
        if (r4 > r7) goto L5;
        byte[] r8 = f35.b;
    L7:
        return new hq3(r2, r8);
    L5:
        r8 = Arrays.copyOfRange(r0, r7, r4);
        goto L7
    }

    public static String X(byte[] r1, int r2, int r3, Charset r4) {
        if (r3 > r2) goto L4;
        return "";
    L4:
        if (r3 <= r1.length) goto L7;
        return "";
    L7:
        return new String(r1, r2, r3 - r2, r4);
    }

    public static ds4 Y(int r4, be3 r5, String r6) {
        if (r4 >= 1) goto L5;
        return null;
    L5:
        int r2 = r5.A();
        int r7 = r4 - 1;
        byte[] r1 = new byte[r7];
        r5.k(r1, 0, r7);
        return new ds4(r6, null, Z(r1, r2, 0));
    }

    public static gy3 Z(byte[] r6, int r7, int r8) {
        if (r8 >= r6.length) goto L5;
        uw1 r0 = yw1.j();
        int r2 = g0(r6, r8, r7);
    L7:
        if (r8 >= r2) goto L9;
        r0.c(new String(r6, r8, r2 - r8, e0(r7)));
        r8 = d0(r7) + r2;
        r2 = g0(r6, r8, r7);
        goto L7
    L9:
        gy3 r9 = r0.f();
        if (r9.isEmpty() == true) goto L12;
        return r9;
    L12:
        return yw1.o("");
    L5:
        return yw1.o("");
    }

    public static ds4 a0(int r4, be3 r5) {
        if (r4 >= 1) goto L6;
        return null;
    L6:
        int r1 = r5.A();
        int r6 = r4 - 1;
        byte[] r0 = new byte[r6];
        r5.k(r0, 0, r6);
        int r7 = g0(r0, 0, r1);
        return new ds4("TXXX", new String(r0, 0, r7, e0(r1)), Z(r0, r1, d0(r1) + r7));
    }

    public static w25 b0(int r3, be3 r4, String r5) {
        byte[] r0 = new byte[r3];
        r4.k(r0, 0, r3);
        return new w25(r5, null, new String(r0, 0, h0(0, r0), StandardCharsets.ISO_8859_1));
    }

    public static w25 c0(int r4, be3 r5) {
        if (r4 >= 1) goto L6;
        return null;
    L6:
        int r1 = r5.A();
        int r6 = r4 - 1;
        byte[] r0 = new byte[r6];
        r5.k(r0, 0, r6);
        int r7 = g0(r0, 0, r1);
        String r8 = new String(r0, 0, r7, e0(r1));
        int r2 = d0(r1) + r7;
        return new w25("WXXX", r8, X(r0, r2, h0(r2, r0), StandardCharsets.ISO_8859_1));
    }

    public static int d0(int r1) {
        if (r1 != 0) goto L4;
        return 1;
    L4:
        if (r1 == 3) goto L10;
        return 2;
    L10:
        return 1;
    }

    public static Charset e0(int r1) {
        if (r1 == 1) goto L15;
        if (r1 == 2) goto L13;
        if (r1 == 3) goto L11;
        return StandardCharsets.ISO_8859_1;
    L11:
        return StandardCharsets.UTF_8;
    L13:
        return StandardCharsets.UTF_16BE;
    L15:
        return StandardCharsets.UTF_16;
    }

    public static String f0(int r1, int r2, int r3, int r4, int r5) {
        if (r1 != 2) goto L7;
        return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4)});
    L7:
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)});
    }

    public static int g0(byte[] r2, int r3, int r4) {
        int r0 = h0(r3, r2);
        if (r4 != 0) goto L5;
    L17:
        return r0;
    L5:
        if (r4 == 3) goto L17;
    L8:
        if (r0 >= (r2.length - 1)) goto L16;
        if (((r0 - r3) % 2) != 0) goto L14;
        if (r2[r0 + 1] != 0) goto L14;
        return r0;
    L14:
        r0 = h0(r0 + 1, r2);
        goto L8
    L16:
        return r2.length;
    }

    public static int h0(int r1, byte[] r2) {
    L3:
        if (r1 >= r2.length) goto L9;
        if (r2[r1] == 0) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L9:
        return r2.length;
    }

    public static int i0(int r5, be3 r6) {
        byte[] r0 = r6.a;
        int r7 = r6.b;
        int r1 = r7;
    L3:
        int r2 = r1 + 1;
        if (r2 >= (r7 + r5)) goto L11;
        if ((r0[r1] & 255) != 255) goto L10;
        if (r0[r2] != 0) goto L10;
        System.arraycopy(r0, r1 + 2, r0, r2, (r5 - (r1 - r7)) - 2);
        r5 = r5 - 1;
    L10:
        r1 = r2;
        goto L3
    L11:
        return r5;
    }

    public static boolean j0(be3 r18, int r19, int r20, boolean r21) {
        int r2 = r18.b;
    L63:
        boolean r4 = true;
        if (r18.a() < r20) goto L59;
        if (r19 < 3) goto L10;
        int r7 = r18.m();     // Catch: Throwable -> L8
        long r8 = r18.C();     // Catch: Throwable -> L8
        int r10 = r18.H();     // Catch: Throwable -> L8
    L13:
        if (r7 != 0) goto L20;
        if (r8 != 0) goto L20;
        if (r10 != 0) goto L20;
        r18.N(r2);
        return true;
    L20:
        if (r19 != 4) goto L27;
        if (r21 == true) goto L27;
        if ((8421504 & r8) != 0) goto L24;
        r8 = (((r8 >> 24) & 255) << 21) | (((r8 & 255) | (((r8 >> 8) & 255) << 7)) | (((r8 >> 16) & 255) << 14));
        goto L27
    L24:
        r18.N(r2);
        return false;
    L27:
        if (r19 == 4) goto L29;
        if (r19 == 3) goto L38;
        int r3 = 0;
        r4 = false;
    L45:
        if (r4 == false) goto L48;
        r3 = r3 + 4;
    L48:
        if (r8 < r3) goto L49;
        if (r18.a() < r8) goto L54;
        r18.O((int) r8);     // Catch: Throwable -> L8
        goto L63
    L54:
        r18.N(r2);
        return false;
    L49:
        r18.N(r2);
        return false;
    L38:
        if ((r10 & 32) == 0) goto L40;
        r3 = 1;
    L42:
        if ((r10 & 128) != 0) goto L45;
    L35:
        r4 = false;
        goto L45
    L40:
        r3 = 0;
        goto L42
    L29:
        if ((r10 & 64) == 0) goto L31;
        r3 = 1;
    L33:
        if ((r10 & 1) == 0) goto L35;
    L31:
        r3 = 0;
        goto L33
    L10:
        r7 = r18.D();     // Catch: Throwable -> L8
        r8 = r18.D();     // Catch: Throwable -> L8
        r10 = 0;
        goto L13
    L59:
        r18.N(r2);
        return true;
    L8:
        th = move-exception;
        r18.N(r2);
        throw th;
    }

    public final qv2 O(int r13, byte[] r14) {
        ArrayList r0 = new ArrayList();
        be3 r1 = new be3(r13, r14);
        boolean r2 = false;
        int r7 = 10;
        if (r1.a() >= 10) goto L6;
        l93.q0("Id3Decoder", "Data too short to be an ID3 tag");
    L5:
        lv1 r10 = null;
    L33:
        if (r10 != null) goto L35;
        return null;
    L35:
        int r15 = r10.a;
        int r8 = r1.b;
        if (r15 != 2) goto L38;
        r7 = 6;
    L38:
        int r16 = r10.c;
        if (r10.b == false) goto L41;
        r16 = i0(r16, r1);
    L41:
        r1.M(r8 + r16);
        if (j0(r1, r15, r7, false) == true) goto L50;
        if (r15 == 4) goto L45;
    L47:
        xa3.m(r15, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
        return null;
    L45:
        if (j0(r1, 4, r7, true) == false) goto L47;
        r2 = true;
    L50:
        if (r1.a() < r7) goto L55;
        nv1 r17 = T(r15, r1, r2, r7, this.n);
        if (r17 == null) goto L50;
        r0.add(r17);
        goto L50
    L55:
        return new qv2(r0);
    L6:
        int r18 = r1.D();
        if (r18 == 4801587) goto L9;
        l93.q0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", new Object[]{Integer.valueOf(r18)})));
        goto L5
    L9:
        int r19 = r1.A();
        r1.O(1);
        int r9 = r1.A();
        int r11 = r1.z();
        if (r19 != 2) goto L15;
        if ((r9 & 64) == 0) goto L26;
        l93.q0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
    L26:
        if (r19 < 4) goto L28;
    L30:
        boolean r12 = false;
    L31:
        r10 = new lv1(r19, r11, r12);
        goto L33
    L28:
        if ((r9 & 128) == 0) goto L30;
        r12 = true;
        goto L31
    L15:
        if (r19 == 3) goto L17;
        if (r19 == 4) goto L21;
        xa3.m(r19, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
        goto L5
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r110 = r1.z();
        r1.O(r110 - 4);
        r11 = r11 - r110;
    L24:
        if ((r9 & 16) == 0) goto L26;
        r11 = r11 - 10;
        goto L26
    L17:
        if ((r9 & 64) == 0) goto L26;
        int r111 = r1.m();
        r1.O(r111);
        r11 = r11 - (r111 + 4);
        goto L26
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 r1, ByteBuffer r2) {
        byte[] r3 = r2.array();
        return O(r2.limit(), r3);
    }
}
