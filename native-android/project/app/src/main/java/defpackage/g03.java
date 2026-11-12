package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g03 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public g03(int r2) {
        this.a = v54.a;
        int[] r0 = m02.a;
        this.b = r0;
        this.c = r0;
        if (r2 < 0) goto L6;
        e(v54.d(r2));
        return;
    L6:
        kf2.n("Capacity must be a positive value.");
        throw null;
    }

    public final void a() {
        this.e = 0;
        long[] r0 = this.a;
        if (r0 == v54.a) goto L5;
        ti.g0(r0, -9187201950435737472L);
        long[] r1 = this.a;
        int r2 = this.d;
        int r3 = r2 >> 3;
        long r5 = 255 << ((r2 & 7) << 3);
        r1[r3] = (r1[r3] & (~r5)) | r5;
    L5:
        this.f = v54.a(this.d) - this.e;
    }

    public final int b(int r10) {
        int r0 = this.d;
        int r11 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.a;
        int r3 = r11 >> 3;
        int r4 = (r11 & 7) << 3;
        long r5 = ((r2[r3 + 1] << (64 - r4)) & ((-r4) >> 63)) | (r2[r3] >>> r4);
        long r6 = (r5 & ((~r5) << 7)) & (-9187201950435737472L);
        if (r6 != 0) goto L6;
        r1 = r1 + 8;
        r11 = (r11 + r1) & r0;
        goto L3
    L6:
        return (r11 + (Long.numberOfTrailingZeros(r6) >> 3)) & r0;
    }

    public final int c(int r14) {
        int r0 = Integer.hashCode(r14) * (-862048943);
        int r1 = r0 ^ (r0 << 16);
        int r2 = r1 & 127;
        int r3 = this.d;
        int r4 = (r1 >>> 7) & r3;
        int r5 = 0;
    L3:
        long[] r6 = this.a;
        int r7 = r4 >> 3;
        int r8 = (r4 & 7) << 3;
        long r9 = ((r6[r7 + 1] << (64 - r8)) & ((-r8) >> 63)) | (r6[r7] >>> r8);
        long r10 = (((long) r2) * 72340172838076673L) ^ r9;
        long r11 = ((~r10) & (r10 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r11 == 0) goto L11;
        int r12 = ((Long.numberOfTrailingZeros(r11) >> 3) + r4) & r3;
        if (this.b[r12] == r14) goto L8;
        r11 = r11 & (r11 - 1);
        goto L5
    L8:
        return r12;
    L11:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r5 = r5 + 8;
        r4 = (r4 + r5) & r3;
        goto L3
    L12:
        return -1;
    }

    public final int d(int r1) {
        int r2 = c(r1);
        if (r2 >= 0) goto L5;
        return -1;
    L5:
        return this.c[r2];
    }

    public final void e(int r10) {
        if (r10 <= 0) goto L5;
        int r11 = Math.max(7, v54.c(r10));
    L6:
        this.d = r11;
        if (r11 != 0) goto L9;
        long[] r0 = v54.a;
    L10:
        this.a = r0;
        int r1 = r11 >> 3;
        long r5 = 255 << ((r11 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f = v54.a(this.d) - this.e;
        this.b = new int[r11];
        this.c = new int[r11];
        return;
    L9:
        int r2 = ((r11 + 15) & (-8)) >> 3;
        long[] r3 = new long[r2];
        Arrays.fill(r3, 0, r2, -9187201950435737472L);
        r0 = r3;
        goto L10
    L5:
        r11 = 0;
        goto L6
    }

    public final boolean equals(Object r18) {
        if (r18 != this) goto L6;
        return true;
    L6:
        if ((r18 instanceof g03) == true) goto L8;
        return false;
    L8:
        g03 r1 = (g03) r18;
        if (r1.e == this.e) goto L11;
        return false;
    L11:
        int[] r3 = this.b;
        int[] r5 = this.c;
        long[] r0 = this.a;
        int r6 = r0.length - 2;
        if (r6 < 0) goto L29;
        int r7 = 0;
    L14:
        long r8 = r0[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L17:
        if (r12 >= r10) goto L26;
        if ((255 & r8) >= 128) goto L25;
        int r13 = (r7 << 3) + r12;
        int r14 = r3[r13];
        int r15 = r5[r13];
        int r16 = r1.c(r14);
        if (r16 < 0) goto L24;
        if (r15 == r1.c[r16]) goto L25;
    L24:
        return false;
    L25:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L17
    L26:
        if (r10 != 8) goto L29;
    L27:
        if (r7 == r6) goto L29;
        r7 = r7 + 1;
    L29:
        return true;
    }

    public final void f(int r38, int r39) {
        int r1 = r38;
        int r3 = -862048943;
        int r2 = Integer.hashCode(r1) * (-862048943);
        int r4 = r2 ^ (r2 << 16);
        int r5 = r4 >>> 7;
        int r6 = r4 & 127;
        int r7 = this.d;
        int r8 = r5 & r7;
        int r9 = 0;
    L3:
        long[] r10 = this.a;
        int r11 = r8 >> 3;
        int r12 = (r8 & 7) << 3;
        int r14 = 1;
        int r16 = r9;
        int r15 = 0;
        long r13 = (((-r12) >> 63) & (r10[r11 + 1] << (64 - r12))) | (r10[r11] >>> r12);
        long r17 = r6;
        long r18 = r13 ^ (r17 * 72340172838076673L);
        long r19 = ((r18 - 72340172838076673L) & (~r18)) & (-9187201950435737472L);
    L5:
        if (r19 == 0) goto L10;
        int r110 = ((Long.numberOfTrailingZeros(r19) >> 3) + r8) & r7;
        int r21 = r3;
        if (this.b[r110] == r1) goto L55;
        r19 = r19 & (r19 - 1);
        r3 = r21;
    L55:
        if (r110 >= 0) goto L57;
        r110 = ~r110;
    L57:
        this.b[r110] = r38;
        this.c[r110] = r39;
        return;
    L10:
        int r22 = r3;
        if (((r13 & ((~r13) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r9 = r16 + 8;
        r8 = (r8 + r9) & r7;
        r1 = r38;
        r3 = r22;
        goto L3
    L12:
        int r20 = b(r5);
        long r111 = 255;
        if (this.f == 0) goto L15;
    L16:
        long r29 = r17;
        long r27 = 255;
        int r112 = 1;
        int r32 = 0;
        long r113 = 128;
    L51:
        this.e++;
        int r23 = this.f;
        long[] r24 = this.a;
        int r25 = r20 >> 3;
        long r26 = r24[r25];
        int r28 = (r20 & 7) << 3;
        if (((r26 >> r28) & r27) != r113) goto L54;
        r32 = r112;
    L54:
        this.f = r23 - r32;
        int r30 = this.d;
        long r31 = (r26 & (~(r27 << r28))) | (r29 << r28);
        r24[r25] = r31;
        r24[(((r20 - 7) & r30) + (r30 & 7)) >> 3] = r31;
        r110 = ~r20;
        goto L55
    L15:
        if (((this.a[r20 >> 3] >> ((r20 & 7) << 3)) & 255) == 254) goto L16;
        int r33 = this.d;
        if (r33 <= 8) goto L42;
        r113 = 128;
        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) r33) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
        long[] r34 = this.a;
        int r35 = this.d;
        int[] r36 = this.b;
        int[] r37 = this.c;
        int r114 = (r35 + 7) >> 3;
        int r40 = 0;
    L22:
        if (r40 >= r114) goto L24;
        long r41 = r34[r40] & (-9187201950435737472L);
        r34[r40] = (-72340172838076674L) & ((~r41) + (r41 >>> 7));
        r40 = r40 + 1;
        r111 = r111;
        r17 = r17;
        goto L22
    L24:
        r29 = r17;
        r27 = r111;
        char r115 = 7;
        int r42 = ti.j0(r34);
        int r43 = r42 - 1;
        r34[r43] = (r34[r43] & 72057594037927935L) | (-72057594037927936L);
        r34[r42] = r34[0];
        int r44 = 0;
    L25:
        if (r44 == r35) goto L40;
        int r45 = r44 >> 3;
        int r116 = (r44 & 7) << 3;
        long r46 = (r34[r45] >> r116) & r27;
        if (r46 == 128) goto L28;
        if (r46 != 254) goto L28;
        int r47 = Integer.hashCode(r36[r44]) * r22;
        int r48 = r47 ^ (r47 << 16);
        int r117 = r48 >>> 7;
        int r118 = b(r117);
        int r119 = r117 & r35;
        char r310 = r115;
        if ((((r118 - r119) & r35) / 8) == (((r44 - r119) & r35) / 8)) goto L34;
        int r120 = r14;
        int r311 = r15;
        int r121 = r118 >> 3;
        long r122 = r34[r121];
        int r123 = (r118 & 7) << 3;
        if (((r122 >> r123) & r27) != 128) goto L38;
        int[] r312 = r36;
        int[] r313 = r37;
        r34[r121] = ((~(r27 << r123)) & r122) | (((long) (r48 & 127)) << r123);
        r34[r45] = (r34[r45] & (~(r27 << r116))) | (128 << r116);
        r312[r118] = r312[r44];
        r312[r44] = r311;
        r313[r118] = r313[r44];
        r313[r44] = r311;
    L39:
        r34[r34.length - 1] = (r34[r311] & 72057594037927935L) | Long.MIN_VALUE;
        r44 = r44 + 1;
        r14 = r120;
        r115 = r310;
        r15 = r311;
        r36 = r312;
        r37 = r313;
        goto L25
    L38:
        r312 = r36;
        r313 = r37;
        r34[r121] = (((long) (r48 & 127)) << r123) | ((~(r27 << r123)) & r122);
        int r49 = r312[r118];
        r312[r118] = r312[r44];
        r312[r44] = r49;
        int r50 = r313[r118];
        r313[r118] = r313[r44];
        r313[r44] = r50;
        r44 = r44 - 1;
        goto L39
    L34:
        int r314 = r15;
        r34[r45] = (((long) (r48 & 127)) << r116) | (r34[r45] & (~(r27 << r116)));
        r34[r34.length - 1] = (r34[r314] & 72057594037927935L) | Long.MIN_VALUE;
        r44 = r44 + 1;
        r14 = r14;
        r115 = r310;
        r15 = r314;
    L28:
        r44 = r44 + 1;
        goto L25
    L40:
        r112 = r14;
        r32 = r15;
        this.f = v54.a(this.d) - this.e;
    L50:
        r20 = b(r5);
    L41:
        r29 = r17;
        r27 = 255;
        r112 = 1;
        r32 = 0;
        int r51 = v54.b(this.d);
        long[] r52 = this.a;
        int[] r53 = this.b;
        int[] r54 = this.c;
        int r55 = this.d;
        e(r51);
        long[] r56 = this.a;
        int[] r57 = this.b;
        int[] r58 = this.c;
        int r124 = this.d;
        int r125 = 0;
    L44:
        if (r125 >= r55) goto L50;
        if (((r52[r125 >> 3] >> ((r125 & 7) << 3)) & 255) >= r113) goto L48;
        int r126 = r53[r125];
        int r127 = Integer.hashCode(r126) * r22;
        int r128 = r127 ^ (r127 << 16);
        int r129 = b(r128 >>> 7);
        long[] r130 = r56;
        long r59 = r128 & 127;
        int r131 = r129 >> 3;
        int r132 = (r129 & 7) << 3;
        long r60 = (r130[r131] & (~(255 << r132))) | (r59 << r132);
        r130[r131] = r60;
        r130[(((r129 - 7) & r124) + (r124 & 7)) >> 3] = r60;
        r57[r129] = r126;
        r58[r129] = r54[r125];
    L49:
        r125 = r125 + 1;
        r56 = r130;
        goto L44
    L48:
        r130 = r56;
        goto L49
    L42:
        r113 = 128;
        goto L41
    }

    public final int hashCode() {
        int[] r0 = this.b;
        int[] r1 = this.c;
        long[] r15 = this.a;
        int r2 = r15.length - 2;
        if (r2 < 0) goto L19;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r15[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L13;
        if ((255 & r6) >= 128) goto L12;
        int r11 = (r4 << 3) + r10;
        int r12 = r0[r11];
        int r13 = r1[r11];
        r5 = r5 + (Integer.hashCode(r13) ^ Integer.hashCode(r12));
    L12:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L13:
        if (r8 == 8) goto L16;
        return r5;
    L16:
        if (r4 == r2) goto L18;
        r4 = r4 + 1;
        goto L5
    L18:
        return r5;
    L19:
        return 0;
    }

    public final String toString() {
        if (this.e != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        int[] r2 = this.b;
        int[] r3 = this.c;
        long[] r4 = this.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L22;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L19;
        if ((255 & r9) >= 128) goto L18;
        int r14 = (r7 << 3) + r13;
        int r15 = r2[r14];
        int r16 = r3[r14];
        r1.append(r15);
        r1.append("=");
        r1.append(r16);
        r8 = r8 + 1;
        if (r8 >= this.e) goto L18;
        r1.append(", ");
    L18:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L19:
        if (r11 != 8) goto L22;
    L20:
        if (r7 == r5) goto L22;
        r7 = r7 + 1;
    L22:
        r1.append('}');
        return r1.toString();
    }

    public /* synthetic */ g03() {
        this(6);
    }
}
