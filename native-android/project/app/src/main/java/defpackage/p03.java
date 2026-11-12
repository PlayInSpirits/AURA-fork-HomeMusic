package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p03 {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public p03(int r2) {
        this.a = v54.a;
        this.b = su3.c;
        this.c = m02.a;
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
        Object[] r5 = this.b;
        ti.f0(0, this.d, null, r5);
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

    public final int c(Object r36) {
        if (r36 == null) goto L5;
        int r3 = r36.hashCode();
    L6:
        int r4 = -862048943;
        int r5 = r3 * (-862048943);
        int r6 = r5 ^ (r5 << 16);
        int r7 = r6 >>> 7;
        int r8 = r6 & 127;
        int r9 = this.d;
        int r10 = r7 & r9;
        int r11 = 0;
    L7:
        long[] r12 = this.a;
        int r13 = r10 >> 3;
        int r14 = (r10 & 7) << 3;
        long r15 = ((r12[r13 + 1] << (64 - r14)) & ((-r14) >> 63)) | (r12[r13] >>> r14);
        long r16 = r8;
        int r19 = r8;
        int r17 = 0;
        long r2 = r15 ^ (r16 * 72340172838076673L);
        long r18 = ((~r2) & (r2 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r18 == 0) goto L14;
        int r110 = (r10 + (Long.numberOfTrailingZeros(r18) >> 3)) & r9;
        int r20 = r4;
        if (h12.c(this.b[r110], r36) == true) goto L12;
        r18 = r18 & (r18 - 1);
        r4 = r20;
        goto L9
    L12:
        return r110;
    L14:
        int r21 = r4;
        if (((((~r15) << 6) & r15) & (-9187201950435737472L)) != 0) goto L16;
        r11 = r11 + 8;
        r10 = (r10 + r11) & r9;
        r8 = r19;
        r4 = r21;
        goto L7
    L16:
        int r1 = b(r7);
        long r22 = 255;
        if (this.f == 0) goto L19;
    L20:
        long r27 = 255;
        long r25 = r16;
        long r23 = 128;
    L63:
        this.e++;
        int r24 = this.f;
        long[] r26 = this.a;
        int r28 = r1 >> 3;
        long r29 = r26[r28];
        int r30 = (r1 & 7) << 3;
        if (((r29 >> r30) & r27) != r23) goto L66;
        r17 = 1;
    L66:
        this.f = r24 - r17;
        int r0 = this.d;
        long r31 = (r29 & (~(r27 << r30))) | (r25 << r30);
        r26[r28] = r31;
        r26[(((r1 - 7) & r0) + (r0 & 7)) >> 3] = r31;
        return ~r1;
    L19:
        if (((this.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) == 254) goto L20;
        int r32 = this.d;
        if (r32 <= 8) goto L49;
        int r111 = 8;
        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) r32) * 25) ^ Long.MIN_VALUE) > 0) goto L49;
        long[] r33 = this.a;
        int r34 = this.d;
        Object[] r35 = this.b;
        int[] r37 = this.c;
        r23 = 128;
        int r38 = (r34 + 7) >> 3;
        int r39 = 0;
    L26:
        if (r39 >= r38) goto L28;
        long r210 = r22;
        long r40 = r33[r39] & (-9187201950435737472L);
        r33[r39] = (-72340172838076674L) & ((~r40) + (r40 >>> 7));
        r39 = r39 + 1;
        r111 = r111;
        r16 = r16;
        r22 = r210;
        goto L26
    L28:
        r27 = r22;
        r25 = r16;
        int r112 = r111;
        int r41 = ti.j0(r33);
        int r42 = r41 - 1;
        long r113 = 72057594037927935L;
        r33[r42] = (r33[r42] & 72057594037927935L) | (-72057594037927936L);
        r33[r41] = r33[0];
        int r43 = 0;
    L29:
        if (r43 == r34) goto L48;
        int r44 = r43 >> 3;
        int r114 = (r43 & 7) << 3;
        long r45 = (r33[r44] >> r114) & r27;
        if (r45 == 128) goto L32;
        if (r45 != 254) goto L32;
        Object r46 = r35[r43];
        if (r46 == null) goto L39;
        int r47 = r46.hashCode();
    L40:
        int r48 = r47 * r21;
        int r49 = r48 ^ (r48 << 16);
        int r50 = r49 >>> 7;
        int r115 = b(r50);
        int r51 = r50 & r34;
        long r211 = r113;
        if ((((r115 - r51) & r34) / 8) == (((r43 - r51) & r34) / r112)) goto L42;
        int r310 = r112;
        int r52 = r115 >> 3;
        long r116 = r33[r52];
        int r117 = (r115 & 7) << 3;
        if (((r116 >> r117) & r27) != 128) goto L46;
        Object[] r311 = r35;
        r33[r52] = ((~(r27 << r117)) & r116) | (((long) (r49 & 127)) << r117);
        r33[r44] = (r33[r44] & (~(r27 << r114))) | (128 << r114);
        r311[r115] = r311[r43];
        r311[r43] = null;
        r37[r115] = r37[r43];
        r37[r43] = 0;
    L47:
        r33[r33.length - 1] = (r33[0] & r211) | Long.MIN_VALUE;
        r43 = r43 + 1;
        r34 = r34;
        r113 = r211;
        r112 = r310;
        r35 = r311;
        goto L29
    L46:
        r311 = r35;
        r33[r52] = (((long) (r49 & 127)) << r117) | ((~(r27 << r117)) & r116);
        Object r53 = r311[r115];
        r311[r115] = r311[r43];
        r311[r43] = r53;
        int r54 = r37[r115];
        r37[r115] = r37[r43];
        r37[r43] = r54;
        r43 = r43 - 1;
        goto L47
    L42:
        r33[r44] = (((long) (r49 & 127)) << r114) | (r33[r44] & (~(r27 << r114)));
        r33[r33.length - 1] = (r33[0] & r211) | Long.MIN_VALUE;
        r43 = r43 + 1;
        r113 = r211;
        r112 = r112;
        goto L29
    L39:
        r47 = 0;
    L32:
        r43 = r43 + 1;
        goto L29
    L48:
        this.f = v54.a(this.d) - this.e;
    L62:
        r1 = b(r7);
    L49:
        r27 = 255;
        r25 = r16;
        r23 = 128;
        int r55 = v54.b(this.d);
        long[] r56 = this.a;
        Object[] r57 = this.b;
        int[] r58 = this.c;
        int r59 = this.d;
        e(r55);
        long[] r60 = this.a;
        Object[] r61 = this.b;
        int[] r62 = this.c;
        int r63 = this.d;
        int r118 = 0;
    L52:
        if (r118 >= r59) goto L62;
        if (((r56[r118 >> 3] >> ((r118 & 7) << 3)) & 255) >= 128) goto L60;
        Object r119 = r57[r118];
        if (r119 == null) goto L58;
        int r120 = r119.hashCode();
    L59:
        int r121 = r120 * r21;
        int r122 = r121 ^ (r121 << 16);
        int r123 = b(r122 >>> 7);
        long[] r124 = r60;
        long r64 = r122 & 127;
        int r125 = r123 >> 3;
        int r126 = (r123 & 7) << 3;
        long r65 = (r124[r125] & (~(255 << r126))) | (r64 << r126);
        r124[r125] = r65;
        r124[(((r123 - 7) & r63) + (r63 & 7)) >> 3] = r65;
        r61[r123] = r119;
        r62[r123] = r58[r118];
    L61:
        r118 = r118 + 1;
        r56 = r56;
        r60 = r124;
        goto L52
    L58:
        r120 = 0;
        goto L59
    L60:
        r124 = r60;
        goto L61
    L5:
        r3 = 0;
        goto L6
    }

    public final int d(Object r14) {
        int r0 = 0;
        if (r14 == null) goto L5;
        int r1 = r14.hashCode();
    L6:
        int r2 = r1 * (-862048943);
        int r3 = r2 ^ (r2 << 16);
        int r4 = r3 & 127;
        int r5 = this.d;
        int r6 = r3 >>> 7;
    L7:
        int r7 = r6 & r5;
        long[] r8 = this.a;
        int r9 = r7 >> 3;
        int r10 = (r7 & 7) << 3;
        long r11 = ((r8[r9 + 1] << (64 - r10)) & ((-r10) >> 63)) | (r8[r9] >>> r10);
        long r12 = (((long) r4) * 72340172838076673L) ^ r11;
        long r13 = ((~r12) & (r12 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r13 == 0) goto L15;
        int r15 = ((Long.numberOfTrailingZeros(r13) >> 3) + r7) & r5;
        if (h12.c(this.b[r15], r14) == true) goto L12;
        r13 = r13 & (r13 - 1);
        goto L9
    L12:
        return r15;
    L15:
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r6 = r7 + r0;
        goto L7
    L16:
        return -1;
    L5:
        r1 = 0;
        goto L6
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
        this.b = new Object[r11];
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
        if ((r18 instanceof p03) == true) goto L8;
        return false;
    L8:
        p03 r1 = (p03) r18;
        if (r1.e == this.e) goto L11;
        return false;
    L11:
        Object[] r3 = this.b;
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
        Object r14 = r3[r13];
        int r15 = r5[r13];
        int r16 = r1.d(r14);
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

    public final void f(int r9) {
        this.e--;
        long[] r0 = this.a;
        int r1 = this.d;
        int r2 = r9 >> 3;
        int r3 = (r9 & 7) << 3;
        long r4 = (r0[r2] & (~(255 << r3))) | (254 << r3);
        r0[r2] = r4;
        r0[(((r9 - 7) & r1) + (r1 & 7)) >> 3] = r4;
        this.b[r9] = null;
    }

    public final void g(int r3, Object r4) {
        int r0 = c(r4);
        if (r0 >= 0) goto L5;
        r0 = ~r0;
    L5:
        this.b[r0] = r4;
        this.c[r0] = r3;
    }

    public final int hashCode() {
        Object[] r0 = this.b;
        int[] r1 = this.c;
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
        Object r12 = r0[r11];
        int r13 = r1[r11];
        if (r12 == null) goto L14;
        int r14 = r12.hashCode();
    L15:
        r5 = r5 + (Integer.hashCode(r13) ^ r14);
        goto L16
    L14:
        r14 = 0;
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
        Object[] r2 = this.b;
        int[] r3 = this.c;
        long[] r4 = this.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L25;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L22;
        if ((255 & r9) >= 128) goto L21;
        int r14 = (r7 << 3) + r13;
        Object r15 = r2[r14];
        int r16 = r3[r14];
        if (r15 != this) goto L18;
        r15 = "(this)";
    L18:
        r1.append(r15);
        r1.append("=");
        r1.append(r16);
        r8 = r8 + 1;
        if (r8 >= this.e) goto L21;
        r1.append(", ");
    L21:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L22:
        if (r11 != 8) goto L25;
    L23:
        if (r7 == r5) goto L25;
        r7 = r7 + 1;
    L25:
        r1.append('}');
        return r1.toString();
    }

    public /* synthetic */ p03() {
        this(6);
    }
}
