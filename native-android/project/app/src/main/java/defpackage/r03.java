package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r03 {
    public long[] a;
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public r03(int r2) {
        this.a = v54.a;
        this.b = su3.c;
        this.c = h12.d;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        if (r2 < 0) goto L6;
        f(v54.d(r2));
        return;
    L6:
        kf2.n("Capacity must be a positive value.");
        throw null;
    }

    public final boolean a(Object r12) {
        int r0 = this.g;
        int r1 = d(r12);
        this.b[r1] = r12;
        long[] r13 = this.c;
        int r2 = this.d;
        r13[r1] = (((long) r2) & 2147483647L) | 4611686016279904256L;
        if (r2 == Integer.MAX_VALUE) goto L5;
        long r4 = (((long) r1) & 2147483647L) << 31;
        r13[r2] = r4 | (r13[r2] & (-4611686016279904257L));
    L5:
        this.d = r1;
        if (this.e != Integer.MAX_VALUE) goto L9;
        this.e = r1;
    L9:
        if (this.g == r0) goto L12;
        return true;
    L12:
        return false;
    }

    public final void b() {
        this.g = 0;
        long[] r1 = this.a;
        if (r1 == v54.a) goto L5;
        ti.g0(r1, -9187201950435737472L);
        long[] r2 = this.a;
        int r3 = this.f;
        int r4 = r3 >> 3;
        long r6 = 255 << ((r3 & 7) << 3);
        r2[r4] = (r2[r4] & (~r6)) | r6;
    L5:
        Object[] r5 = this.b;
        ti.f0(0, this.f, null, r5);
        ti.g0(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = v54.a(this.f) - this.g;
    }

    public final boolean c(Object r18) {
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.f;
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

    public final int d(Object r48) {
        if (r48 == null) goto L5;
        int r3 = r48.hashCode();
    L6:
        int r4 = -862048943;
        int r5 = r3 * (-862048943);
        int r6 = r5 ^ (r5 << 16);
        int r7 = r6 >>> 7;
        int r8 = r6 & 127;
        int r9 = this.f;
        int r10 = r7 & r9;
        int r11 = 0;
    L7:
        long[] r12 = this.a;
        int r13 = r10 >> 3;
        int r14 = (r10 & 7) << 3;
        long r15 = ((r12[r13 + 1] << (64 - r14)) & ((-r14) >> 63)) | (r12[r13] >>> r14);
        long r16 = r8;
        long r17 = r15 ^ (r16 * 72340172838076673L);
        long r18 = ((r17 - 72340172838076673L) & (~r17)) & (-9187201950435737472L);
    L9:
        if (r18 == 0) goto L14;
        int r19 = ((Long.numberOfTrailingZeros(r18) >> 3) + r10) & r9;
        int r21 = r4;
        if (h12.c(this.b[r19], r48) == true) goto L12;
        r18 = r18 & (r18 - 1);
        r4 = r21;
        goto L9
    L12:
        return r19;
    L14:
        int r22 = r4;
        if (((r15 & ((~r15) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r11 = r11 + 8;
        r10 = (r10 + r11) & r9;
        r4 = r22;
        goto L7
    L16:
        int r1 = e(r7);
        long r110 = 255;
        if (this.h == 0) goto L19;
    L20:
        int r30 = 0;
        long r45 = r16;
        long r35 = 255;
        long r26 = 128;
    L110:
        this.g++;
        int r2 = this.h;
        long[] r20 = this.a;
        int r23 = r1 >> 3;
        long r24 = r20[r23];
        int r25 = (r1 & 7) << 3;
        if (((r24 >> r25) & r35) != r26) goto L113;
        r30 = 1;
    L113:
        this.h = r2 - r30;
        int r0 = this.f;
        long r27 = (r24 & (~(r35 << r25))) | (r45 << r25);
        r20[r23] = r27;
        r20[(((r1 - 7) & r0) + (r0 & 7)) >> 3] = r27;
        return r1;
    L19:
        if (((this.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) == 254) goto L20;
        int r28 = this.f;
        if (r28 <= 8) goto L80;
        char r111 = 31;
        r26 = 128;
        if (Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) r28) * 25) ^ Long.MIN_VALUE) > 0) goto L79;
        long[] r29 = this.a;
        if (r29 != null) goto L28;
        r30 = 0;
        r45 = r16;
        r35 = 255;
    L109:
        r1 = e(r7);
        goto L110
    L28:
        int r31 = this.f;
        Object[] r32 = this.b;
        long[] r33 = this.c;
        long[] r34 = new long[r31];
        Arrays.fill(r34, 0, r31, 9223372034707292159L);
        r30 = 0;
        int r36 = (r31 + 7) >> 3;
        int r37 = 0;
    L29:
        if (r37 >= r36) goto L31;
        long r38 = r110;
        long r112 = r29[r37] & (-9187201950435737472L);
        int r210 = r37;
        r29[r210] = ((~r112) + (r112 >>> 7)) & (-72340172838076674L);
        r37 = r210 + 1;
        r110 = r38;
        goto L29
    L31:
        r35 = r110;
        int r39 = r29.length;
        int r40 = r39 - 1;
        int r41 = r39 - 2;
        r29[r41] = (r29[r41] & 72057594037927935L) | (-72057594037927936L);
        r29[r40] = r29[0];
        int r42 = 0;
    L32:
        if (r42 == r31) goto L62;
        int r113 = r42 >> 3;
        int r114 = (r42 & 7) << 3;
        long r115 = (r29[r113] >> r114) & r35;
        if (r115 == 128) goto L35;
        if (r115 != 254) goto L35;
        Object r116 = r32[r42];
        if (r116 == null) goto L42;
        int r117 = r116.hashCode();
    L43:
        int r118 = r117 * r22;
        int r119 = r118 ^ (r118 << 16);
        int r43 = r119 >>> 7;
        int r44 = e(r43);
        int r46 = r43 & r31;
        if ((((r44 - r46) & r31) / 8) == (((r42 - r46) & r31) / 8)) goto L45;
        int r310 = r31;
        Object[] r311 = r32;
        int r47 = r44 >> 3;
        long r312 = r29[r47];
        int r49 = (r44 & 7) << 3;
        if (((r312 >> r49) & r35) != 128) goto L56;
        r29[r47] = (r312 & (~(r35 << r49))) | (((long) (r119 & 127)) << r49);
        r29[r113] = (r29[r113] & (~(r35 << r114))) | (128 << r114);
        r311[r44] = r311[r42];
        r311[r42] = null;
        r33[r44] = r33[r42];
        r33[r42] = 4611686018427387903L;
        int r50 = (int) ((r34[r42] >> 32) & 4294967295L);
        if (r50 == Integer.MAX_VALUE) goto L54;
        r34[r50] = r44 | (r34[r50] & (-4294967296L));
        r34[r42] = (r34[r42] & 4294967295L) | (-4294967296L);
    L55:
        r34[r44] = (((long) r42) << 32) | 2147483647L;
    L61:
        r29[r29.length - 1] = r29[0];
        r42 = r42 + 1;
        r31 = r310;
        r32 = r311;
        r16 = r16;
        goto L32
    L54:
        r34[r42] = 9223372032559808512L | ((long) r44);
        goto L55
    L56:
        r16 = r16;
        r29[r47] = (((long) (r119 & 127)) << r49) | (r312 & (~(r35 << r49)));
        Object r51 = r311[r44];
        r311[r44] = r311[r42];
        r311[r42] = r51;
        long r52 = r33[r44];
        r33[r44] = r33[r42];
        r33[r42] = r52;
        int r53 = (int) ((r34[r42] >> 32) & 4294967295L);
        if (r53 == Integer.MAX_VALUE) goto L59;
        long r120 = r44;
        r34[r53] = (r34[r53] & (-4294967296L)) | r120;
        r34[r42] = (r34[r42] & 4294967295L) | (r120 << 32);
    L60:
        r34[r44] = (((long) r53) << 32) | ((long) r42);
        r42 = r42 - 1;
        goto L61
    L59:
        long r54 = r44;
        r34[r42] = r54 | (r54 << 32);
        r53 = r42;
        goto L60
    L45:
        int r313 = r31;
        Object[] r314 = r32;
        r29[r113] = (r29[r113] & (~(r35 << r114))) | (((long) (r119 & 127)) << r114);
        if (r34[r42] != 9223372034707292159L) goto L48;
        long r55 = r42;
        r34[r42] = r55 | (r55 << 32);
    L48:
        r29[r29.length - 1] = r29[0];
        r42 = r42 + 1;
        r31 = r313;
        r32 = r314;
        goto L32
    L42:
        r117 = 0;
    L35:
        r42 = r42 + 1;
        goto L32
    L62:
        r45 = r16;
        this.h = v54.a(this.f) - this.g;
        long[] r56 = this.c;
        int r57 = r56.length;
        int r58 = 0;
    L63:
        if (r58 >= r57) goto L73;
        long r59 = r56[r58];
        int r60 = (int) ((r59 >> 31) & 2147483647L);
        int r61 = (int) (r59 & 2147483647L);
        long r62 = r59 & (-4611686018427387904L);
        if (r60 != Integer.MAX_VALUE) goto L67;
        int r63 = Integer.MAX_VALUE;
    L68:
        long r64 = (r62 | ((long) r63)) << 31;
        if (r61 != Integer.MAX_VALUE) goto L71;
        int r65 = Integer.MAX_VALUE;
    L72:
        r56[r58] = r64 | ((long) r65);
        r58 = r58 + 1;
        goto L63
    L71:
        r65 = (int) (r34[r61] & 4294967295L);
        goto L72
    L67:
        r63 = (int) (r34[r60] & 4294967295L);
        goto L68
    L73:
        int r66 = this.d;
        if (r66 == Integer.MAX_VALUE) goto L76;
        this.d = (int) (r34[r66] & 4294967295L);
    L76:
        int r67 = this.e;
        if (r67 == Integer.MAX_VALUE) goto L109;
        this.e = (int) (r34[r67] & 4294967295L);
    L79:
        r30 = 0;
        r45 = r16;
        r35 = 255;
        int r68 = v54.b(this.f);
        long[] r69 = this.a;
        Object[] r70 = this.b;
        long[] r71 = this.c;
        int r72 = this.f;
        int[] r73 = new int[r72];
        f(r68);
        long[] r74 = this.a;
        Object[] r75 = this.b;
        long[] r76 = this.c;
        int r121 = this.f;
        int r122 = 0;
    L82:
        if (r122 >= r72) goto L92;
        if (((r69[r122 >> 3] >> ((r122 & 7) << 3)) & 255) >= r26) goto L90;
        Object r123 = r70[r122];
        if (r123 == null) goto L88;
        int r124 = r123.hashCode();
    L89:
        int r125 = r124 * r22;
        int r126 = r125 ^ (r125 << 16);
        int r127 = e(r126 >>> 7);
        long[] r128 = r74;
        long r77 = r126 & 127;
        int r129 = r127 >> 3;
        int r211 = (r127 & 7) << 3;
        long r78 = (r128[r129] & (~(255 << r211))) | (r77 << r211);
        r128[r129] = r78;
        r128[(((r127 - 7) & r121) + (r121 & 7)) >> 3] = r78;
        r75[r127] = r123;
        r76[r127] = r71[r122];
        r73[r122] = r127;
    L91:
        r122 = r122 + 1;
        r69 = r69;
        r74 = r128;
        goto L82
    L88:
        r124 = 0;
        goto L89
    L90:
        r128 = r74;
        goto L91
    L92:
        long[] r79 = this.c;
        int r80 = r79.length;
        int r81 = 0;
    L93:
        if (r81 >= r80) goto L103;
        long r82 = r79[r81];
        int r83 = (int) ((r82 >> r111) & 2147483647L);
        int r84 = (int) (r82 & 2147483647L);
        long r85 = r82 & (-4611686018427387904L);
        if (r83 != Integer.MAX_VALUE) goto L97;
        int r86 = Integer.MAX_VALUE;
    L98:
        long r87 = (r85 | ((long) r86)) << r111;
        if (r84 != Integer.MAX_VALUE) goto L101;
        int r88 = Integer.MAX_VALUE;
    L102:
        r79[r81] = r87 | ((long) r88);
        r81 = r81 + 1;
        goto L93
    L101:
        r88 = r73[r84];
        goto L102
    L97:
        r86 = r73[r83];
        goto L98
    L103:
        int r89 = this.d;
        if (r89 == Integer.MAX_VALUE) goto L106;
        this.d = r73[r89];
    L106:
        int r90 = this.e;
        if (r90 == Integer.MAX_VALUE) goto L109;
        this.e = r73[r90];
        goto L109
    L80:
        r111 = 31;
        r26 = 128;
        goto L79
    L5:
        r3 = 0;
        goto L6
    }

    public final int e(int r10) {
        int r0 = this.f;
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
        if ((r15 instanceof r03) == true) goto L8;
        return false;
    L8:
        r03 r16 = (r03) r15;
        if (r16.g == this.g) goto L11;
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

    public final void f(int r11) {
        if (r11 <= 0) goto L5;
        int r12 = Math.max(7, v54.c(r11));
    L6:
        this.f = r12;
        if (r12 != 0) goto L9;
        long[] r1 = v54.a;
    L10:
        this.a = r1;
        int r2 = r12 >> 3;
        long r6 = 255 << ((r12 & 7) << 3);
        r1[r2] = (r1[r2] & (~r6)) | r6;
        this.h = v54.a(this.f) - this.g;
        if (r12 != 0) goto L13;
        Object[] r3 = su3.c;
    L14:
        this.b = r3;
        if (r12 != 0) goto L17;
        long[] r13 = h12.d;
    L18:
        this.c = r13;
        return;
    L17:
        long[] r4 = new long[r12];
        Arrays.fill(r4, 0, r12, 4611686018427387903L);
        r13 = r4;
        goto L18
    L13:
        r3 = new Object[r12];
        goto L14
    L9:
        int r5 = ((r12 + 15) & (-8)) >> 3;
        long[] r7 = new long[r5];
        Arrays.fill(r7, 0, r5, -9187201950435737472L);
        r1 = r7;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }

    public final boolean g(Object r18) {
        boolean r2 = false;
        if (r18 == null) goto L5;
        int r3 = r18.hashCode();
    L6:
        int r4 = r3 * (-862048943);
        int r5 = r4 ^ (r4 << 16);
        int r6 = r5 & 127;
        int r7 = this.f;
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
        h(r16);
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

    public final void h(int r13) {
        this.g--;
        long[] r0 = this.a;
        int r1 = this.f;
        int r2 = r13 >> 3;
        int r3 = (r13 & 7) << 3;
        long r4 = (r0[r2] & (~(255 << r3))) | (254 << r3);
        r0[r2] = r4;
        r0[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r4;
        this.b[r13] = null;
        long[] r5 = this.c;
        long r6 = r5[r13];
        int r7 = (int) ((r6 >> 31) & 2147483647L);
        int r8 = (int) (r6 & 2147483647L);
        if (r7 == Integer.MAX_VALUE) goto L5;
        r5[r7] = (r5[r7] & (-2147483648L)) | (((long) r8) & 2147483647L);
    L6:
        if (r8 == Integer.MAX_VALUE) goto L8;
        r5[r8] = ((((long) r7) & 2147483647L) << 31) | (r5[r8] & (-4611686016279904257L));
    L9:
        r5[r13] = 4611686018427387903L;
        return;
    L8:
        this.e = r7;
        goto L9
    L5:
        this.d = r8;
        goto L6
    }

    public final int hashCode() {
        int r0 = (this.f * 31) + this.g;
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

    public final boolean i(Collection r17) {
        r17.getClass();
        Object[] r1 = this.b;
        int r2 = this.g;
        long[] r3 = this.a;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L19;
        int r6 = 0;
    L5:
        long r7 = r3[r6];
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r9 = 8 - ((~(r6 - r4)) >>> 31);
        int r11 = 0;
    L8:
        if (r11 >= r9) goto L15;
        if ((255 & r7) >= 128) goto L14;
        int r12 = (r6 << 3) + r11;
        if (q40.s0(r17, r1[r12]) == true) goto L14;
        h(r12);
    L14:
        r7 = r7 >> 8;
        r11 = r11 + 1;
        goto L8
    L15:
        if (r9 != 8) goto L19;
    L16:
        if (r6 == r4) goto L19;
        r6 = r6 + 1;
    L19:
        if (r2 == this.g) goto L22;
        return true;
    L22:
        return false;
    }

    public final String toString() {
        ir0 r0 = new ir0(5, this);
        StringBuilder r1 = new StringBuilder("[");
        Object[] r2 = this.b;
        long[] r3 = this.c;
        int r9 = this.e;
        int r4 = 0;
    L4:
        if (r9 == Integer.MAX_VALUE) goto L11;
        int r5 = (int) ((r3[r9] >> 31) & 2147483647L);
        Object r10 = r2[r9];
        if (r4 == (-1)) goto L7;
        if (r4 == 0) goto L10;
        r1.append(", ");
    L10:
        r1.append((CharSequence) r0.invoke(r10));
        r4 = r4 + 1;
        r9 = r5;
        goto L4
    L7:
        r1.append("...");
    L13:
        return r1.toString();
    L11:
        r1.append("]");
        goto L13
    }
}
