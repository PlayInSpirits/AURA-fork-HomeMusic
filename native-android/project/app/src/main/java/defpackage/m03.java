package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m03 {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public m03(int r2) {
        this.a = v54.a;
        this.b = we2.a;
        this.c = su3.c;
        if (r2 < 0) goto L6;
        e(v54.d(r2));
        return;
    L6:
        kf2.n("Capacity must be a positive value.");
        throw null;
    }

    public final void a() {
        this.e = 0;
        long[] r1 = this.a;
        if (r1 == v54.a) goto L5;
        ti.g0(r1, -9187201950435737472L);
        long[] r2 = this.a;
        int r3 = this.d;
        int r4 = r3 >> 3;
        long r6 = 255 << ((r3 & 7) << 3);
        r2[r4] = (r2[r4] & (~r6)) | r6;
    L5:
        Object[] r5 = this.c;
        ti.f0(0, this.d, null, r5);
        this.f = v54.a(this.d) - this.e;
    }

    public final boolean b(long r18) {
        int r1 = Long.hashCode(r18) * (-862048943);
        int r2 = r1 ^ (r1 << 16);
        int r3 = r2 & 127;
        int r4 = this.d;
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
        if (this.b[r13] == r18) goto L13;
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

    public final int c(int r10) {
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

    public final Object d(long r15) {
        int r0 = Long.hashCode(r15) * (-862048943);
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
        if (this.b[r12] == r15) goto L13;
        r11 = r11 & (r11 - 1);
    L13:
        if (r12 >= 0) goto L15;
        return null;
    L15:
        return this.c[r12];
    L11:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r5 = r5 + 8;
        r4 = (r4 + r5) & r3;
        goto L3
    L12:
        r12 = -1;
        goto L13
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
        this.b = new long[r11];
        this.c = new Object[r11];
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
        if ((r18 instanceof m03) == true) goto L8;
        return false;
    L8:
        m03 r1 = (m03) r18;
        if (r1.e == this.e) goto L11;
        return false;
    L11:
        long[] r3 = this.b;
        Object[] r5 = this.c;
        long[] r0 = this.a;
        int r6 = r0.length - 2;
        if (r6 < 0) goto L34;
        int r7 = 0;
    L14:
        long r8 = r0[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L32;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L17:
        if (r12 >= r10) goto L31;
        if ((255 & r8) >= 128) goto L30;
        int r13 = (r7 << 3) + r12;
        long r14 = r3[r13];
        Object r15 = r5[r13];
        if (r15 != null) goto L28;
        if (r1.d(r14) != null) goto L26;
        if (r1.b(r14) == true) goto L30;
    L26:
        return false;
    L28:
        if (r15.equals(r1.d(r14)) == true) goto L30;
        return false;
    L30:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L17
    L31:
        if (r10 != 8) goto L34;
    L32:
        if (r7 == r6) goto L34;
        r7 = r7 + 1;
    L34:
        return true;
    }

    public final void f(long r39, Object r41) {
        int r2 = -862048943;
        int r1 = Long.hashCode(r39) * (-862048943);
        int r3 = r1 ^ (r1 << 16);
        int r4 = r3 >>> 7;
        int r5 = r3 & 127;
        int r6 = this.d;
        int r7 = r4 & r6;
        int r8 = 0;
    L3:
        long[] r9 = this.a;
        int r10 = r7 >> 3;
        int r11 = (r7 & 7) << 3;
        int r13 = 1;
        long r12 = ((r9[r10 + 1] << (64 - r11)) & ((-r11) >> 63)) | (r9[r10] >>> r11);
        long r14 = r5;
        int r18 = r8;
        int r15 = 0;
        long r16 = r12 ^ (r14 * 72340172838076673L);
        long r17 = ((~r16) & (r16 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r17 == 0) goto L10;
        int r19 = (r7 + (Long.numberOfTrailingZeros(r17) >> 3)) & r6;
        int r110 = r2;
        if (this.b[r19] == r39) goto L55;
        r17 = r17 & (r17 - 1);
        r2 = r110;
    L55:
        this.b[r19] = r39;
        this.c[r19] = r41;
        return;
    L10:
        int r111 = r2;
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) != 0) goto L12;
        r8 = r18 + 8;
        r7 = (r7 + r8) & r6;
        r2 = r111;
        goto L3
    L12:
        int r20 = c(r4);
        if (this.f == 0) goto L15;
    L16:
        long r27 = 255;
        long r31 = r14;
        int r29 = 0;
        int r112 = 1;
        long r21 = 128;
    L51:
        r19 = r20;
        this.e++;
        int r22 = this.f;
        long[] r23 = this.a;
        int r24 = r19 >> 3;
        long r25 = r23[r24];
        int r26 = (r19 & 7) << 3;
        if (((r25 >> r26) & r27) != r21) goto L54;
        r29 = r112;
    L54:
        this.f = r22 - r29;
        int r28 = this.d;
        long r30 = (r25 & (~(r27 << r26))) | (r31 << r26);
        r23[r24] = r30;
        r23[(((r19 - 7) & r28) + (r28 & 7)) >> 3] = r30;
        goto L55
    L15:
        if (((this.a[r20 >> 3] >> ((r20 & 7) << 3)) & 255) == 254) goto L16;
        int r32 = this.d;
        if (r32 <= 8) goto L42;
        r21 = 128;
        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) r32) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
        long[] r33 = this.a;
        int r34 = this.d;
        long[] r35 = this.b;
        Object[] r36 = this.c;
        int r37 = (r34 + 7) >> 3;
        r27 = 255;
        int r38 = 0;
    L22:
        if (r38 >= r37) goto L24;
        long r40 = r33[r38] & (-9187201950435737472L);
        r33[r38] = (-72340172838076674L) & ((~r40) + (r40 >>> 7));
        r38 = r38 + 1;
        r13 = r13;
        r15 = r15;
        r14 = r14;
        goto L22
    L24:
        r31 = r14;
        r29 = r15;
        int r113 = r13;
        char r42 = 7;
        int r43 = ti.j0(r33);
        int r44 = r43 - 1;
        long r114 = 72057594037927935L;
        r33[r44] = (r33[r44] & 72057594037927935L) | (-72057594037927936L);
        r33[r43] = r33[r29];
        int r45 = r29;
    L25:
        if (r45 == r34) goto L40;
        int r46 = r45 >> 3;
        int r115 = (r45 & 7) << 3;
        long r47 = (r33[r46] >> r115) & 255;
        if (r47 == 128) goto L28;
        if (r47 != 254) goto L28;
        int r48 = Long.hashCode(r35[r45]) * r111;
        int r49 = r48 ^ (r48 << 16);
        int r116 = r49 >>> 7;
        int r117 = c(r116);
        int r118 = r116 & r34;
        char r310 = r42;
        if ((((r117 - r118) & r34) / 8) == (((r45 - r118) & r34) / 8)) goto L34;
        int r119 = r113;
        long r311 = r114;
        int r50 = r117 >> 3;
        long r120 = r33[r50];
        int r121 = (r117 & 7) << 3;
        if (((r120 >> r121) & 255) != 128) goto L38;
        long[] r122 = r35;
        Object[] r312 = r36;
        r33[r50] = (r120 & (~(255 << r121))) | (((long) (r49 & 127)) << r121);
        r33[r46] = (r33[r46] & (~(255 << r115))) | (128 << r115);
        r122[r117] = r122[r45];
        r122[r45] = 0;
        r312[r117] = r312[r45];
        r312[r45] = null;
    L39:
        r33[r33.length - 1] = (r33[r29] & r311) | Long.MIN_VALUE;
        r45 = r45 + 1;
        r35 = r122;
        r113 = r119;
        r42 = r310;
        r114 = r311;
        r36 = r312;
        goto L25
    L38:
        r312 = r36;
        r122 = r35;
        r33[r50] = ((r49 & 127) << r121) | (r120 & (~(255 << r121)));
        long r51 = r122[r117];
        r122[r117] = r122[r45];
        r122[r45] = r51;
        Object r52 = r312[r117];
        r312[r117] = r312[r45];
        r312[r45] = r52;
        r45 = r45 - 1;
        goto L39
    L34:
        int r123 = r113;
        long r313 = r114;
        r33[r46] = (((long) (r49 & 127)) << r115) | (r33[r46] & (~(255 << r115)));
        r33[r33.length - r123] = (r33[r29] & r313) | Long.MIN_VALUE;
        r45 = r45 + 1;
        r113 = r123;
        r42 = r310;
        r114 = r313;
    L28:
        r45 = r45 + 1;
        goto L25
    L40:
        r112 = r113;
        this.f = v54.a(this.d) - this.e;
    L50:
        r20 = c(r4);
    L41:
        r27 = 255;
        r31 = r14;
        r29 = 0;
        r112 = 1;
        int r53 = v54.b(this.d);
        long[] r54 = this.a;
        long[] r55 = this.b;
        Object[] r56 = this.c;
        int r57 = this.d;
        e(r53);
        long[] r58 = this.a;
        long[] r59 = this.b;
        Object[] r60 = this.c;
        int r61 = this.d;
        int r124 = 0;
    L44:
        if (r124 >= r57) goto L50;
        if (((r54[r124 >> 3] >> ((r124 & 7) << 3)) & 255) >= r21) goto L48;
        long r125 = r55[r124];
        int r126 = Long.hashCode(r125) * r111;
        int r127 = r126 ^ (r126 << 16);
        int r128 = c(r127 >>> 7);
        long[] r129 = r58;
        long r62 = r127 & 127;
        int r130 = r128 >> 3;
        int r131 = (r128 & 7) << 3;
        long r63 = (r129[r130] & (~(255 << r131))) | (r62 << r131);
        r129[r130] = r63;
        r129[(((r128 - 7) & r61) + (r61 & 7)) >> 3] = r63;
        r59[r128] = r125;
        r60[r128] = r56[r124];
    L49:
        r124 = r124 + 1;
        r54 = r54;
        r58 = r129;
        goto L44
    L48:
        r129 = r58;
        goto L49
    L42:
        r21 = 128;
        goto L41
    }

    public final int hashCode() {
        long[] r0 = this.b;
        Object[] r1 = this.c;
        long[] r15 = this.a;
        int r2 = r15.length - 2;
        if (r2 < 0) goto L23;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r15[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L17;
        if ((255 & r6) >= 128) goto L16;
        int r11 = (r4 << 3) + r10;
        long r12 = r0[r11];
        Object r13 = r1[r11];
        int r14 = Long.hashCode(r12);
        if (r13 == null) goto L14;
        int r16 = r13.hashCode();
    L15:
        r5 = r5 + (r16 ^ r14);
        goto L16
    L14:
        r16 = 0;
    L16:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L17:
        if (r8 == 8) goto L20;
        return r5;
    L20:
        if (r4 == r2) goto L22;
        r4 = r4 + 1;
        goto L5
    L22:
        return r5;
    L23:
        return 0;
    }

    public final String toString() {
        if (this.e != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        long[] r2 = this.b;
        Object[] r3 = this.c;
        long[] r4 = this.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L29;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L23;
        if ((255 & r9) >= 128) goto L21;
        int r14 = (r7 << 3) + r13;
        int r16 = r7;
        long r6 = r2[r14];
        Object r15 = r3[r14];
        r1.append(r6);
        r1.append("=");
        if (r15 != this) goto L18;
        r15 = "(this)";
    L18:
        r1.append(r15);
        r8 = r8 + 1;
        if (r8 >= this.e) goto L22;
        r1.append(", ");
    L22:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        r7 = r16;
        goto L12
    L21:
        r16 = r7;
        goto L22
    L23:
        int r17 = r7;
        if (r11 != 8) goto L29;
        int r10 = r17;
    L27:
        if (r10 == r5) goto L29;
        r7 = r10 + 1;
        goto L9
    L26:
        r10 = r7;
    L29:
        r1.append('}');
        return r1.toString();
    }
}
