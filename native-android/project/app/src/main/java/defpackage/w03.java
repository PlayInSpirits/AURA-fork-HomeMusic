package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w03 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public w03(int r2) {
        this.a = v54.a;
        Object[] r0 = su3.c;
        this.b = r0;
        this.c = r0;
        if (r2 < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        h(v54.d(r2));
        return;
    L9:
        kf2.n("Capacity must be a positive value.");
        throw null;
    L5:
        r1 = false;
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
        Object[] r5 = this.c;
        ti.f0(0, this.d, null, r5);
        Object[] r7 = this.b;
        ti.f0(0, this.d, null, r7);
        this.f = v54.a(this.d) - this.e;
    }

    public final boolean b(Object r18) {
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.d;
        int r8 = (r5 >>> 7) & r7;
        int r9 = 0;
    L7:
        long[] r10 = this.a;
        int r11 = r8 >> 3;
        int r12 = (r8 & 7) << 3;
        long r13 = ((r10[r11 + 1] << (64 - r12)) & ((-r12) >> 63)) | (r10[r11] >>> r12);
        long r14 = (((long) r6) * 72340172838076673L) ^ r13;
        long r15 = ((~r14) & (r14 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r15 == 0) goto L15;
        int r16 = ((Long.numberOfTrailingZeros(r15) >> 3) + r8) & r7;
        if (h12.c(this.b[r16], r18) == true) goto L17;
        r15 = r15 & (r15 - 1);
    L17:
        if (r16 < 0) goto L19;
        return true;
    L19:
        return false;
    L15:
        if (((r13 & ((~r13) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r9 = r9 + 8;
        r8 = (r8 + r9) & r7;
        goto L7
    L16:
        r16 = -1;
        goto L17
    L5:
        r3 = 0;
        goto L6
    }

    public final boolean c(Object r18) {
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.d;
        int r8 = (r5 >>> 7) & r7;
        int r9 = 0;
    L7:
        long[] r10 = this.a;
        int r11 = r8 >> 3;
        int r12 = (r8 & 7) << 3;
        long r13 = ((r10[r11 + 1] << (64 - r12)) & ((-r12) >> 63)) | (r10[r11] >>> r12);
        long r14 = (((long) r6) * 72340172838076673L) ^ r13;
        long r15 = ((~r14) & (r14 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r15 == 0) goto L15;
        int r16 = ((Long.numberOfTrailingZeros(r15) >> 3) + r8) & r7;
        if (h12.c(this.b[r16], r18) == true) goto L17;
        r15 = r15 & (r15 - 1);
    L17:
        if (r16 < 0) goto L19;
        return true;
    L19:
        return false;
    L15:
        if (((r13 & ((~r13) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r9 = r9 + 8;
        r8 = (r8 + r9) & r7;
        goto L7
    L16:
        r16 = -1;
        goto L17
    L5:
        r3 = 0;
        goto L6
    }

    public final boolean d(Object r14) {
        Object[] r0 = this.c;
        long[] r13 = this.a;
        int r1 = r13.length - 2;
        if (r1 < 0) goto L19;
        int r3 = 0;
    L5:
        long r4 = r13[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L17;
        int r6 = 8 - ((~(r3 - r1)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L16;
        if ((255 & r4) >= 128) goto L15;
        if (h12.c(r14, r0[(r3 << 3) + r8]) == false) goto L15;
        return true;
    L15:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L16:
        if (r6 != 8) goto L19;
    L17:
        if (r3 == r1) goto L19;
        r3 = r3 + 1;
    L19:
        return false;
    }

    public final int e(int r10) {
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

    public final boolean equals(Object r18) {
        if (r18 != this) goto L6;
        return true;
    L6:
        if ((r18 instanceof w03) == true) goto L8;
        return false;
    L8:
        w03 r1 = (w03) r18;
        if (r1.e == this.e) goto L11;
        return false;
    L11:
        Object[] r3 = this.b;
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
        Object r14 = r3[r13];
        Object r15 = r5[r13];
        if (r15 != null) goto L28;
        if (r1.g(r14) != null) goto L26;
        if (r1.c(r14) == true) goto L30;
    L26:
        return false;
    L28:
        if (r15.equals(r1.g(r14)) == true) goto L30;
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

    public final int f(Object r32) {
        if (r32 == null) goto L5;
        int r3 = r32.hashCode();
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
        if (h12.c(this.b[r110], r32) == true) goto L12;
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
        int r1 = e(r7);
        long r22 = 255;
        if (this.f == 0) goto L19;
    L20:
        long r25 = 255;
        long r23 = r16;
        long r111 = 128;
    L63:
        this.e++;
        int r24 = this.f;
        long[] r26 = this.a;
        int r27 = r1 >> 3;
        long r28 = r26[r27];
        int r29 = (r1 & 7) << 3;
        if (((r28 >> r29) & r25) != r111) goto L66;
        r17 = 1;
    L66:
        this.f = r24 - r17;
        int r0 = this.d;
        long r30 = (r28 & (~(r25 << r29))) | (r23 << r29);
        r26[r27] = r30;
        r26[(((r1 - 7) & r0) + (r0 & 7)) >> 3] = r30;
        return ~r1;
    L19:
        if (((this.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) == 254) goto L20;
        int r31 = this.d;
        if (r31 <= 8) goto L49;
        int r112 = 8;
        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) r31) * 25) ^ Long.MIN_VALUE) > 0) goto L49;
        long[] r33 = this.a;
        int r34 = this.d;
        Object[] r35 = this.b;
        Object[] r36 = this.c;
        r111 = 128;
        int r37 = (r34 + 7) >> 3;
        int r38 = 0;
    L26:
        if (r38 >= r37) goto L28;
        long r210 = r22;
        long r39 = r33[r38] & (-9187201950435737472L);
        r33[r38] = (-72340172838076674L) & ((~r39) + (r39 >>> 7));
        r38 = r38 + 1;
        r112 = r112;
        r16 = r16;
        r22 = r210;
        goto L26
    L28:
        r25 = r22;
        r23 = r16;
        int r113 = r112;
        int r40 = ti.j0(r33);
        int r41 = r40 - 1;
        r33[r41] = (r33[r41] & 72057594037927935L) | (-72057594037927936L);
        r33[r40] = r33[0];
        int r42 = 0;
    L29:
        if (r42 == r34) goto L48;
        int r43 = r42 >> 3;
        int r114 = (r42 & 7) << 3;
        long r44 = (r33[r43] >> r114) & r25;
        if (r44 == 128) goto L32;
        if (r44 != 254) goto L32;
        Object r45 = r35[r42];
        if (r45 == null) goto L39;
        int r46 = r45.hashCode();
    L40:
        int r47 = r46 * r21;
        int r48 = r47 ^ (r47 << 16);
        int r49 = r48 >>> 7;
        int r115 = e(r49);
        int r50 = r49 & r34;
        if ((((r115 - r50) & r34) / r113) == (((r42 - r50) & r34) / r113)) goto L42;
        int r116 = r113;
        int r51 = r115 >> 3;
        long r117 = r33[r51];
        int r118 = (r115 & 7) << 3;
        if (((r117 >> r118) & r25) != 128) goto L46;
        Object[] r211 = r35;
        r33[r51] = ((~(r25 << r118)) & r117) | (((long) (r48 & 127)) << r118);
        r33[r43] = (r33[r43] & (~(r25 << r114))) | (128 << r114);
        r211[r115] = r211[r42];
        r211[r42] = null;
        r36[r115] = r36[r42];
        r36[r42] = null;
    L47:
        r33[r33.length - 1] = r33[0];
        r42 = r42 + 1;
        r113 = r116;
        r34 = r34;
        r35 = r211;
        goto L29
    L46:
        r211 = r35;
        r33[r51] = (((long) (r48 & 127)) << r118) | ((~(r25 << r118)) & r117);
        Object r52 = r211[r115];
        r211[r115] = r211[r42];
        r211[r42] = r52;
        Object r53 = r36[r115];
        r36[r115] = r36[r42];
        r36[r42] = r53;
        r42 = r42 - 1;
        goto L47
    L42:
        r33[r43] = (((long) (r48 & 127)) << r114) | (r33[r43] & (~(r25 << r114)));
        r33[r33.length - 1] = r33[0];
        r42 = r42 + 1;
        r113 = r113;
        goto L29
    L39:
        r46 = 0;
    L32:
        r42 = r42 + 1;
        goto L29
    L48:
        this.f = v54.a(this.d) - this.e;
    L62:
        r1 = e(r7);
    L49:
        r25 = 255;
        r23 = r16;
        r111 = 128;
        int r54 = v54.b(this.d);
        long[] r55 = this.a;
        Object[] r56 = this.b;
        Object[] r57 = this.c;
        int r58 = this.d;
        h(r54);
        long[] r59 = this.a;
        Object[] r60 = this.b;
        Object[] r61 = this.c;
        int r62 = this.d;
        int r119 = 0;
    L52:
        if (r119 >= r58) goto L62;
        if (((r55[r119 >> 3] >> ((r119 & 7) << 3)) & 255) >= 128) goto L60;
        Object r120 = r56[r119];
        if (r120 == null) goto L58;
        int r121 = r120.hashCode();
    L59:
        int r122 = r121 * r21;
        int r123 = r122 ^ (r122 << 16);
        int r124 = e(r123 >>> 7);
        long[] r125 = r59;
        long r63 = r123 & 127;
        int r126 = r124 >> 3;
        int r212 = (r124 & 7) << 3;
        long r64 = (r125[r126] & (~(255 << r212))) | (r63 << r212);
        r125[r126] = r64;
        r125[(((r124 - 7) & r62) + (r62 & 7)) >> 3] = r64;
        r60[r124] = r120;
        r61[r124] = r57[r119];
    L61:
        r119 = r119 + 1;
        r55 = r55;
        r59 = r125;
        goto L52
    L58:
        r121 = 0;
        goto L59
    L60:
        r125 = r59;
        goto L61
    L5:
        r3 = 0;
        goto L6
    }

    public final Object g(Object r14) {
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
        if (h12.c(this.b[r15], r14) == true) goto L17;
        r13 = r13 & (r13 - 1);
    L17:
        if (r15 >= 0) goto L19;
        return null;
    L19:
        return this.c[r15];
    L15:
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r6 = r7 + r0;
        goto L7
    L16:
        r15 = -1;
        goto L17
    L5:
        r1 = 0;
        goto L6
    }

    public final void h(int r11) {
        Object[] r0 = su3.c;
        if (r11 <= 0) goto L5;
        int r12 = Math.max(7, v54.c(r11));
    L6:
        this.d = r12;
        if (r12 != 0) goto L9;
        long[] r1 = v54.a;
    L10:
        this.a = r1;
        this.f = v54.a(this.d) - this.e;
        if (r12 != 0) goto L13;
        Object[] r2 = r0;
    L14:
        this.b = r2;
        if (r12 == 0) goto L18;
        r0 = new Object[r12];
    L18:
        this.c = r0;
        return;
    L13:
        r2 = new Object[r12];
        goto L14
    L9:
        int r3 = ((r12 + 15) & (-8)) >> 3;
        long[] r4 = new long[r3];
        Arrays.fill(r4, 0, r3, -9187201950435737472L);
        int r5 = r12 >> 3;
        long r6 = 255 << ((r12 & 7) << 3);
        r4[r5] = (r4[r5] & (~r6)) | r6;
        r1 = r4;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }

    public final int hashCode() {
        Object[] r0 = this.b;
        Object[] r1 = this.c;
        long[] r15 = this.a;
        int r2 = r15.length - 2;
        if (r2 < 0) goto L26;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r15[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L20;
        if ((255 & r6) >= 128) goto L19;
        int r11 = (r4 << 3) + r10;
        Object r12 = r0[r11];
        Object r13 = r1[r11];
        if (r12 == null) goto L14;
        int r14 = r12.hashCode();
    L15:
        if (r13 == null) goto L17;
        int r16 = r13.hashCode();
    L18:
        r5 = r5 + (r16 ^ r14);
        goto L19
    L17:
        r16 = 0;
        goto L18
    L14:
        r14 = 0;
    L19:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L20:
        if (r8 == 8) goto L23;
        return r5;
    L23:
        if (r4 == r2) goto L25;
        r4 = r4 + 1;
        goto L5
    L25:
        return r5;
    L26:
        return 0;
    }

    public final boolean i() {
        if (this.e != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object j(Object r14) {
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
        if (h12.c(this.b[r15], r14) == true) goto L17;
        r13 = r13 & (r13 - 1);
    L17:
        if (r15 >= 0) goto L19;
        return null;
    L19:
        return k(r15);
    L15:
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r6 = r7 + r0;
        goto L7
    L16:
        r15 = -1;
        goto L17
    L5:
        r1 = 0;
        goto L6
    }

    public final Object k(int r9) {
        this.e--;
        long[] r0 = this.a;
        int r1 = this.d;
        int r2 = r9 >> 3;
        int r3 = (r9 & 7) << 3;
        long r4 = (r0[r2] & (~(255 << r3))) | (254 << r3);
        r0[r2] = r4;
        r0[(((r9 - 7) & r1) + (r1 & 7)) >> 3] = r4;
        this.b[r9] = null;
        Object[] r8 = this.c;
        Object r5 = r8[r9];
        r8[r9] = null;
        return r5;
    }

    public final void l(Object r3, Object r4) {
        int r0 = f(r3);
        if (r0 >= 0) goto L5;
        r0 = ~r0;
    L5:
        this.b[r0] = r3;
        this.c[r0] = r4;
    }

    public final String toString() {
        if (i() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        Object[] r2 = this.b;
        Object[] r3 = this.c;
        long[] r4 = this.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L28;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L25;
        if ((255 & r9) >= 128) goto L24;
        int r14 = (r7 << 3) + r13;
        Object r15 = r2[r14];
        Object r16 = r3[r14];
        if (r15 != this) goto L18;
        r15 = "(this)";
    L18:
        r1.append(r15);
        r1.append("=");
        if (r16 != this) goto L21;
        r16 = "(this)";
    L21:
        r1.append(r16);
        r8 = r8 + 1;
        if (r8 >= this.e) goto L24;
        r1.append(", ");
    L24:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L25:
        if (r11 != 8) goto L28;
    L26:
        if (r7 == r5) goto L28;
        r7 = r7 + 1;
    L28:
        r1.append('}');
        return r1.toString();
    }

    public /* synthetic */ w03() {
        this(6);
    }
}
