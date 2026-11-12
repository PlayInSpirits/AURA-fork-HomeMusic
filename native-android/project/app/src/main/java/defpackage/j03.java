package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public j03(int r2) {
        this.a = v54.a;
        this.b = m02.a;
        if (r2 < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        e(v54.d(r2));
        return;
    L9:
        kf2.n("Capacity must be a positive value.");
        throw null;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean a(int r38) {
        int r2 = this.d;
        int r4 = -862048943;
        int r3 = Integer.hashCode(r38) * (-862048943);
        int r5 = r3 ^ (r3 << 16);
        int r6 = r5 >>> 7;
        int r7 = r5 & 127;
        int r8 = this.c;
        int r9 = r6 & r8;
        int r10 = 0;
    L3:
        long[] r11 = this.a;
        int r12 = r9 >> 3;
        int r13 = (r9 & 7) << 3;
        boolean r15 = true;
        int r17 = r10;
        long r14 = (((-r13) >> 63) & (r11[r12 + 1] << (64 - r13))) | (r11[r12] >>> r13);
        long r16 = r7;
        long r18 = r14 ^ (r16 * 72340172838076673L);
        long r19 = ((r18 - 72340172838076673L) & (~r18)) & (-9187201950435737472L);
    L5:
        if (r19 == 0) goto L10;
        int r110 = ((Long.numberOfTrailingZeros(r19) >> 3) + r9) & r8;
        int r22 = r4;
        if (this.b[r110] == r38) goto L8;
        r19 = r19 & (r19 - 1);
        r4 = r22;
        goto L5
    L8:
        boolean r31 = true;
    L57:
        this.b[r110] = r38;
        if (this.d == r2) goto L60;
        return r31;
    L60:
        return false;
    L10:
        int r23 = r4;
        long r20 = (r14 & ((~r14) << 6)) & (-9187201950435737472L);
        char r21 = '\b';
        if (r20 != 0) goto L12;
        r10 = r17 + 8;
        r9 = (r9 + r10) & r8;
        r4 = r23;
        goto L3
    L12:
        int r24 = d(r6);
        long r111 = 255;
        if (this.e == 0) goto L15;
    L16:
        long r27 = 255;
        r31 = true;
        long r25 = 128;
    L52:
        r110 = r24;
        this.d++;
        int r26 = this.e;
        long[] r28 = this.a;
        int r29 = r110 >> 3;
        long r30 = r28[r29];
        int r32 = (r110 & 7) << 3;
        if (((r30 >> r32) & r27) != r25) goto L55;
        ?? r33 = r31;
    L56:
        this.e = r26 - r33;
        int r34 = this.c;
        long r35 = (r30 & (~(r27 << r32))) | (r16 << r32);
        r28[r29] = r35;
        r28[(((r110 - 7) & r34) + (r34 & 7)) >> 3] = r35;
        goto L57
    L55:
        r33 = 0;
        goto L56
    L15:
        if (((this.a[r24 >> 3] >> ((r24 & 7) << 3)) & 255) == 254) goto L16;
        int r36 = this.c;
        if (r36 <= 8) goto L43;
        r25 = 128;
        if (Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) r36) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
        long[] r37 = this.a;
        int r39 = this.c;
        int[] r40 = this.b;
        int r41 = (r39 + 7) >> 3;
        int r112 = 0;
    L22:
        if (r112 >= r41) goto L24;
        char r210 = r21;
        long r42 = r37[r112] & (-9187201950435737472L);
        r37[r112] = (-72340172838076674L) & ((~r42) + (r42 >>> 7));
        r112 = r112 + 1;
        r111 = r111;
        r21 = r210;
        goto L22
    L24:
        r27 = r111;
        int r43 = ti.j0(r37);
        int r44 = r43 - 1;
        r37[r44] = (r37[r44] & 72057594037927935L) | (-72057594037927936L);
        r37[r43] = r37[0];
        int r45 = 0;
    L25:
        if (r45 == r39) goto L41;
        int r46 = r45 >> 3;
        int r47 = (r45 & 7) << 3;
        long r113 = (r37[r46] >> r47) & r27;
        if (r113 == 128) goto L28;
        if (r113 != 254) goto L28;
        int r114 = Integer.hashCode(r40[r45]) * r23;
        int r115 = r114 ^ (r114 << 16);
        int r116 = r115 >>> 7;
        int r117 = d(r116);
        int r118 = r116 & r39;
        boolean r310 = r15;
        if ((((r117 - r118) & r39) / 8) != (((r45 - r118) & r39) / 8)) goto L36;
        int[] r311 = r40;
        r37[r46] = ((~(r27 << r47)) & r37[r46]) | (((long) (r115 & 127)) << r47);
        r37[r37.length - 1] = (r37[0] & 72057594037927935L) | Long.MIN_VALUE;
        r45 = r45 + 1;
    L35:
        r40 = r311;
        r15 = r310;
        goto L25
    L36:
        r311 = r40;
        int r312 = r45;
        int r48 = r117 >> 3;
        long r313 = r37[r48];
        int r49 = (r117 & 7) << 3;
        if (((r313 >> r49) & r27) != 128) goto L39;
        r37[r48] = (r313 & (~(r27 << r49))) | (((long) (r115 & 127)) << r49);
        r37[r46] = (r37[r46] & (~(r27 << r47))) | (128 << r47);
        r311[r117] = r311[r312];
        r311[r312] = 0;
        int r50 = r312;
    L40:
        r37[r37.length - 1] = (r37[0] & 72057594037927935L) | Long.MIN_VALUE;
        r45 = r50 + 1;
        goto L35
    L39:
        r37[r48] = (((long) (r115 & 127)) << r49) | (r313 & (~(r27 << r49)));
        int r51 = r311[r117];
        r311[r117] = r311[r312];
        r311[r312] = r51;
        r50 = r312 - 1;
    L28:
        r45 = r45 + 1;
        goto L25
    L41:
        r31 = r15;
        this.e = v54.a(this.c) - this.d;
    L51:
        r24 = d(r6);
    L42:
        r27 = 255;
        r31 = true;
        int r52 = v54.b(this.c);
        long[] r53 = this.a;
        int[] r54 = this.b;
        int r55 = this.c;
        e(r52);
        long[] r56 = this.a;
        int[] r57 = this.b;
        int r58 = this.c;
        int r119 = 0;
    L45:
        if (r119 >= r55) goto L51;
        if (((r53[r119 >> 3] >> ((r119 & 7) << 3)) & 255) >= r25) goto L49;
        int r120 = r54[r119];
        int r121 = Integer.hashCode(r120) * r23;
        int r122 = r121 ^ (r121 << 16);
        int r123 = d(r122 >>> 7);
        long[] r124 = r56;
        long r59 = r122 & 127;
        int r125 = r123 >> 3;
        int r211 = (r123 & 7) << 3;
        long r60 = (r124[r125] & (~(255 << r211))) | (r59 << r211);
        r124[r125] = r60;
        r124[(((r123 - 7) & r58) + (r58 & 7)) >> 3] = r60;
        r57[r123] = r120;
    L50:
        r119 = r119 + 1;
        r53 = r53;
        r56 = r124;
        goto L45
    L49:
        r124 = r56;
        goto L50
    L43:
        r25 = 128;
        goto L42
    }

    public final void b() {
        this.d = 0;
        long[] r0 = this.a;
        if (r0 == v54.a) goto L5;
        ti.g0(r0, -9187201950435737472L);
        long[] r1 = this.a;
        int r2 = this.c;
        int r3 = r2 >> 3;
        long r5 = 255 << ((r2 & 7) << 3);
        r1[r3] = (r1[r3] & (~r5)) | r5;
    L5:
        this.e = v54.a(this.c) - this.d;
    }

    public final boolean c(int r19) {
        int r1 = Integer.hashCode(r19) * (-862048943);
        int r2 = r1 ^ (r1 << 16);
        int r3 = r2 & 127;
        int r4 = this.c;
        int r5 = (r2 >>> 7) & r4;
        int r6 = 0;
    L3:
        long[] r7 = this.a;
        int r8 = r5 >> 3;
        int r9 = (r5 & 7) << 3;
        long r10 = ((r7[r8 + 1] << (64 - r9)) & ((-r9) >> 63)) | (r7[r8] >>> r9);
        long r11 = (((long) r3) * 72340172838076673L) ^ r10;
        long r12 = ((~r11) & (r11 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r12 == 0) goto L11;
        int r13 = ((Long.numberOfTrailingZeros(r12) >> 3) + r5) & r4;
        if (this.b[r13] == r19) goto L13;
        r12 = r12 & (r12 - 1);
    L13:
        if (r13 < 0) goto L15;
        return true;
    L15:
        return false;
    L11:
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r6 = r6 + 8;
        r5 = (r5 + r6) & r4;
        goto L3
    L12:
        r13 = -1;
        goto L13
    }

    public final int d(int r10) {
        int r0 = this.c;
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

    public final void e(int r10) {
        if (r10 <= 0) goto L5;
        int r11 = Math.max(7, v54.c(r10));
    L6:
        this.c = r11;
        if (r11 != 0) goto L9;
        long[] r0 = v54.a;
    L10:
        this.a = r0;
        int r1 = r11 >> 3;
        long r5 = 255 << ((r11 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.e = v54.a(this.c) - this.d;
        this.b = new int[r11];
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

    public final boolean equals(Object r15) {
        if (r15 != this) goto L6;
        return true;
    L6:
        if ((r15 instanceof j03) == true) goto L8;
        return false;
    L8:
        j03 r16 = (j03) r15;
        if (r16.d == this.d) goto L11;
        return false;
    L11:
        int[] r1 = this.b;
        long[] r14 = this.a;
        int r3 = r14.length - 2;
        if (r3 < 0) goto L27;
        int r4 = 0;
    L14:
        long r5 = r14[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r7 = 8 - ((~(r4 - r3)) >>> 31);
        int r9 = 0;
    L17:
        if (r9 >= r7) goto L24;
        if ((255 & r5) >= 128) goto L23;
        if (r16.c(r1[(r4 << 3) + r9]) == true) goto L23;
        return false;
    L23:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L17
    L24:
        if (r7 != 8) goto L27;
    L25:
        if (r4 == r3) goto L27;
        r4 = r4 + 1;
    L27:
        return true;
    }

    public final boolean f(int r19) {
        int r1 = Integer.hashCode(r19) * (-862048943);
        int r2 = r1 ^ (r1 << 16);
        int r3 = r2 & 127;
        int r4 = this.c;
        int r5 = (r2 >>> 7) & r4;
        boolean r6 = false;
        int r7 = 0;
    L3:
        long[] r8 = this.a;
        int r9 = r5 >> 3;
        int r10 = (r5 & 7) << 3;
        long r11 = ((r8[r9 + 1] << (64 - r10)) & ((-r10) >> 63)) | (r8[r9] >>> r10);
        long r12 = (((long) r3) * 72340172838076673L) ^ r11;
        long r13 = ((~r12) & (r12 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r13 == 0) goto L11;
        int r14 = ((Long.numberOfTrailingZeros(r13) >> 3) + r5) & r4;
        if (this.b[r14] == r19) goto L13;
        r13 = r13 & (r13 - 1);
    L13:
        if (r14 < 0) goto L15;
        r6 = true;
    L15:
        if (r6 == false) goto L17;
        g(r14);
    L17:
        return r6;
    L11:
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r7 = r7 + 8;
        r5 = (r5 + r7) & r4;
        goto L3
    L12:
        r14 = -1;
        goto L13
    }

    public final void g(int r8) {
        this.d--;
        long[] r0 = this.a;
        int r7 = this.c;
        int r1 = r8 >> 3;
        int r2 = (r8 & 7) << 3;
        long r3 = (r0[r1] & (~(255 << r2))) | (254 << r2);
        r0[r1] = r3;
        r0[(((r8 - 7) & r7) + (r7 & 7)) >> 3] = r3;
    }

    public final int hashCode() {
        int[] r0 = this.b;
        long[] r14 = this.a;
        int r1 = r14.length - 2;
        if (r1 < 0) goto L19;
        int r3 = 0;
        int r4 = 0;
    L5:
        long r5 = r14[r3];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r7 = 8 - ((~(r3 - r1)) >>> 31);
        int r9 = 0;
    L8:
        if (r9 >= r7) goto L13;
        if ((255 & r5) >= 128) goto L12;
        r4 = Integer.hashCode(r0[(r3 << 3) + r9]) + r4;
    L12:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L8
    L13:
        if (r7 == 8) goto L16;
        return r4;
    L16:
        if (r3 == r1) goto L18;
        r3 = r3 + 1;
        goto L5
    L18:
        return r4;
    L19:
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("[");
        int[] r1 = this.b;
        long[] r15 = this.a;
        int r2 = r15.length - 2;
        if (r2 < 0) goto L21;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r15[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L18;
        if ((255 & r6) >= 128) goto L17;
        int r11 = r1[(r4 << 3) + r10];
        if (r5 == (-1)) goto L13;
        if (r5 == 0) goto L16;
        r0.append(", ");
    L16:
        r0.append(r11);
        r5 = r5 + 1;
        goto L17
    L13:
        r0.append("...");
    L23:
        return r0.toString();
    L17:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L18:
        if (r8 != 8) goto L21;
    L19:
        if (r4 == r2) goto L21;
        r4 = r4 + 1;
    L21:
        r0.append("]");
        goto L23
    }

    public /* synthetic */ j03() {
        this(6);
    }
}
