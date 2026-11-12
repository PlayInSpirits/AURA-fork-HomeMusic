package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n03 {
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;

    public n03(int r2) {
        this.a = v54.a;
        this.b = we2.a;
        if (r2 < 0) goto L6;
        c(v54.d(r2));
        return;
    L6:
        kf2.n("Capacity must be a positive value.");
        throw null;
    }

    public final boolean a(long r18) {
        int r1 = Long.hashCode(r18) * (-862048943);
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

    public final int b(int r10) {
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

    public final void c(int r10) {
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
        this.b = new long[r11];
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
        if ((r15 instanceof n03) == true) goto L8;
        return false;
    L8:
        n03 r16 = (n03) r15;
        if (r16.d == this.d) goto L11;
        return false;
    L11:
        long[] r1 = this.b;
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
        if (r16.a(r1[(r4 << 3) + r9]) == true) goto L23;
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

    public final int hashCode() {
        long[] r0 = this.b;
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
        r4 = Long.hashCode(r0[(r3 << 3) + r9]) + r4;
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
        long[] r1 = this.b;
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
        long r11 = r1[(r4 << 3) + r10];
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
}
