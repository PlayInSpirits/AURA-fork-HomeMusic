package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public x03(int r2) {
        this.a = v54.a;
        this.b = su3.c;
        if (r2 < 0) goto L6;
        f(v54.d(r2));
        return;
    L6:
        kf2.n("Capacity must be a positive value.");
        throw null;
    }

    public final boolean a(Object r4) {
        int r0 = this.d;
        int r1 = d(r4);
        this.b[r1] = r4;
        if (this.d == r0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void b() {
        this.d = 0;
        long[] r1 = this.a;
        if (r1 == v54.a) goto L5;
        ti.g0(r1, -9187201950435737472L);
        long[] r2 = this.a;
        int r3 = this.c;
        int r4 = r3 >> 3;
        long r6 = 255 << ((r3 & 7) << 3);
        r2[r4] = (r2[r4] & (~r6)) | r6;
    L5:
        Object[] r5 = this.b;
        ti.f0(0, this.c, null, r5);
        this.e = v54.a(this.c) - this.d;
    }

    public final boolean c(Object r18) {
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.c;
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

    public final int d(Object r35) {
        if (r35 == null) goto L5;
        int r3 = r35.hashCode();
    L6:
        int r4 = -862048943;
        int r5 = r3 * (-862048943);
        int r6 = r5 ^ (r5 << 16);
        int r7 = r6 >>> 7;
        int r8 = r6 & 127;
        int r9 = this.c;
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
        if (h12.c(this.b[r110], r35) == true) goto L12;
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
        if (this.e == 0) goto L19;
    L20:
        long r27 = 255;
        long r25 = r16;
        long r23 = 128;
    L63:
        this.d++;
        int r24 = this.e;
        long[] r26 = this.a;
        int r28 = r1 >> 3;
        long r29 = r26[r28];
        int r30 = (r1 & 7) << 3;
        if (((r29 >> r30) & r27) != r23) goto L66;
        r17 = 1;
    L66:
        this.e = r24 - r17;
        int r0 = this.c;
        long r31 = (r29 & (~(r27 << r30))) | (r25 << r30);
        r26[r28] = r31;
        r26[(((r1 - 7) & r0) + (r0 & 7)) >> 3] = r31;
        return r1;
    L19:
        if (((this.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) == 254) goto L20;
        int r32 = this.c;
        if (r32 <= 8) goto L49;
        int r111 = 8;
        if (Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) r32) * 25) ^ Long.MIN_VALUE) > 0) goto L49;
        long[] r33 = this.a;
        int r34 = this.c;
        Object[] r36 = this.b;
        int r37 = (r34 + 7) >> 3;
        int r38 = 0;
        r23 = 128;
    L26:
        if (r38 >= r37) goto L28;
        long r210 = r22;
        long r39 = r33[r38] & (-9187201950435737472L);
        r33[r38] = (-72340172838076674L) & ((~r39) + (r39 >>> 7));
        r38 = r38 + 1;
        r111 = r111;
        r16 = r16;
        r22 = r210;
        goto L26
    L28:
        r27 = r22;
        r25 = r16;
        int r112 = r111;
        int r40 = ti.j0(r33);
        int r41 = r40 - 1;
        long r42 = 72057594037927935L;
        r33[r41] = (r33[r41] & 72057594037927935L) | (-72057594037927936L);
        r33[r40] = r33[0];
        int r43 = 0;
    L29:
        if (r43 == r34) goto L48;
        int r44 = r43 >> 3;
        int r113 = (r43 & 7) << 3;
        long r45 = (r33[r44] >> r113) & r27;
        if (r45 == 128) goto L32;
        if (r45 != 254) goto L32;
        Object r46 = r36[r43];
        if (r46 == null) goto L39;
        int r47 = r46.hashCode();
    L40:
        int r48 = r47 * r21;
        int r49 = r48 ^ (r48 << 16);
        int r50 = r49 >>> 7;
        int r114 = e(r50);
        int r51 = r50 & r34;
        if ((((r114 - r51) & r34) / r112) == (((r43 - r51) & r34) / r112)) goto L42;
        long r211 = r42;
        int r52 = r114 >> 3;
        long r53 = r33[r52];
        int r115 = (r114 & 7) << 3;
        if (((r53 >> r115) & r27) != 128) goto L46;
        Object[] r310 = r36;
        r33[r52] = ((~(r27 << r115)) & r53) | (((long) (r49 & 127)) << r115);
        r33[r44] = (r33[r44] & (~(r27 << r113))) | (128 << r113);
        r310[r114] = r310[r43];
        r310[r43] = null;
    L47:
        r33[r33.length - 1] = (r33[0] & r211) | Long.MIN_VALUE;
        r43 = r43 + 1;
        r42 = r211;
        r112 = r112;
        r34 = r34;
        r36 = r310;
        goto L29
    L46:
        r310 = r36;
        r33[r52] = (((long) (r49 & 127)) << r115) | ((~(r27 << r115)) & r53);
        Object r54 = r310[r114];
        r310[r114] = r310[r43];
        r310[r43] = r54;
        r43 = r43 - 1;
        goto L47
    L42:
        long r212 = r42;
        long r55 = ((long) (r49 & 127)) << r113;
        r33[r44] = r55 | ((~(r27 << r113)) & r33[r44]);
        r33[r33.length - 1] = (r33[0] & r212) | Long.MIN_VALUE;
        r43 = r43 + 1;
        r42 = r212;
        goto L29
    L39:
        r47 = 0;
    L32:
        r43 = r43 + 1;
        goto L29
    L48:
        this.e = v54.a(this.c) - this.d;
    L62:
        r1 = e(r7);
    L49:
        r27 = 255;
        r25 = r16;
        r23 = 128;
        int r56 = v54.b(this.c);
        long[] r57 = this.a;
        Object[] r58 = this.b;
        int r59 = this.c;
        f(r56);
        long[] r60 = this.a;
        Object[] r61 = this.b;
        int r62 = this.c;
        int r63 = 0;
    L52:
        if (r63 >= r59) goto L62;
        if (((r57[r63 >> 3] >> ((r63 & 7) << 3)) & 255) >= 128) goto L60;
        Object r64 = r58[r63];
        if (r64 == null) goto L58;
        int r116 = r64.hashCode();
    L59:
        int r117 = r116 * r21;
        int r118 = r117 ^ (r117 << 16);
        int r119 = e(r118 >>> 7);
        long r120 = r118 & 127;
        int r121 = r119 >> 3;
        int r122 = (r119 & 7) << 3;
        long[] r213 = r60;
        long r65 = (r60[r121] & (~(255 << r122))) | (r120 << r122);
        r213[r121] = r65;
        r213[(((r119 - 7) & r62) + (r62 & 7)) >> 3] = r65;
        r61[r119] = r64;
    L61:
        r63 = r63 + 1;
        r57 = r57;
        r60 = r213;
        goto L52
    L58:
        r116 = 0;
        goto L59
    L60:
        r213 = r60;
        goto L61
    L5:
        r3 = 0;
        goto L6
    }

    public final int e(int r10) {
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

    public final boolean equals(Object r15) {
        if (r15 != this) goto L6;
        return true;
    L6:
        if ((r15 instanceof x03) == true) goto L8;
        return false;
    L8:
        x03 r16 = (x03) r15;
        if (r16.d == this.d) goto L11;
        return false;
    L11:
        Object[] r1 = this.b;
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

    public final void f(int r10) {
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
        if (r11 != 0) goto L13;
        Object[] r12 = su3.c;
    L14:
        this.b = r12;
        return;
    L13:
        r12 = new Object[r11];
        goto L14
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

    public final boolean g() {
        if (this.d != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean h() {
        if (this.d == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.c * 31) + this.d;
        Object[] r1 = this.b;
        long[] r2 = this.a;
        int r3 = r2.length - 2;
        if (r3 < 0) goto L23;
        int r5 = 0;
    L5:
        long r6 = r2[r5];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r8 = 8 - ((~(r5 - r3)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L18;
        if ((255 & r6) >= 128) goto L17;
        Object r11 = r1[(r5 << 3) + r10];
        if (h12.c(r11, this) == true) goto L17;
        if (r11 == null) goto L15;
        int r12 = r11.hashCode();
    L16:
        r0 = r0 + r12;
        goto L17
    L15:
        r12 = 0;
    L17:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L18:
        if (r8 == 8) goto L21;
        return r0;
    L21:
        if (r5 == r3) goto L23;
        r5 = r5 + 1;
    L23:
        return r0;
    }

    public final void i(Object r14) {
        int r0 = 0;
        if (r14 == null) goto L5;
        int r1 = r14.hashCode();
    L6:
        int r2 = r1 * (-862048943);
        int r3 = r2 ^ (r2 << 16);
        int r4 = r3 & 127;
        int r5 = this.c;
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
        if (r15 < 0) goto L24;
        m(r15);
        return;
    L24:
        return;
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

    public final void j(x03 r14) {
        r14.getClass();
        Object[] r0 = r14.b;
        long[] r15 = r14.a;
        int r1 = r15.length - 2;
        if (r1 < 0) goto L16;
        int r3 = 0;
    L5:
        long r4 = r15[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L14;
        int r6 = 8 - ((~(r3 - r1)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L13;
        if ((255 & r4) >= 128) goto L12;
        k(r0[(r3 << 3) + r8]);
    L12:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L13:
        if (r6 == 8) goto L14;
        return;
    L14:
        if (r3 == r1) goto L23;
        r3 = r3 + 1;
        goto L5
    L23:
        return;
    }

    public final void k(Object r2) {
        int r0 = d(r2);
        this.b[r0] = r2;
    }

    public final boolean l(Object r18) {
        boolean r2 = false;
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.c;
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
        r2 = true;
    L19:
        if (r2 == false) goto L21;
        m(r16);
    L21:
        return r2;
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

    public final void m(int r9) {
        this.d--;
        long[] r0 = this.a;
        int r1 = this.c;
        int r2 = r9 >> 3;
        int r3 = (r9 & 7) << 3;
        long r4 = (r0[r2] & (~(255 << r3))) | (254 << r3);
        r0[r2] = r4;
        r0[(((r9 - 7) & r1) + (r1 & 7)) >> 3] = r4;
        this.b[r9] = null;
    }

    public final String toString() {
        ir0 r1 = new ir0(6, this);
        StringBuilder r2 = new StringBuilder("[");
        Object[] r3 = this.b;
        long[] r0 = this.a;
        int r4 = r0.length - 2;
        if (r4 < 0) goto L21;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r0[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L18;
        if ((255 & r8) >= 128) goto L17;
        Object r13 = r3[(r6 << 3) + r12];
        if (r7 == (-1)) goto L13;
        if (r7 == 0) goto L16;
        r2.append(", ");
    L16:
        r2.append((CharSequence) r1.invoke(r13));
        r7 = r7 + 1;
        goto L17
    L13:
        r2.append("...");
    L23:
        return r2.toString();
    L17:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L18:
        if (r10 != 8) goto L21;
    L19:
        if (r6 == r4) goto L21;
        r6 = r6 + 1;
    L21:
        r2.append("]");
        goto L23
    }

    public /* synthetic */ x03() {
        this(6);
    }
}
