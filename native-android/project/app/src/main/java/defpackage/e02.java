package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e02 {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;

    public final boolean a(int r19) {
        int r1 = Integer.hashCode(r19) * (-862048943);
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

    public final Object b(int r14) {
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
        if (this.b[r12] == r14) goto L13;
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

    public final boolean equals(Object r18) {
        if (r18 != this) goto L6;
        return true;
    L6:
        if ((r18 instanceof e02) == true) goto L8;
        return false;
    L8:
        e02 r1 = (e02) r18;
        if (r1.e == this.e) goto L11;
        return false;
    L11:
        int[] r3 = this.b;
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
        int r14 = r3[r13];
        Object r15 = r5[r13];
        if (r15 != null) goto L28;
        if (r1.b(r14) != null) goto L26;
        if (r1.a(r14) == true) goto L30;
    L26:
        return false;
    L28:
        if (r15.equals(r1.b(r14)) == true) goto L30;
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

    public final int hashCode() {
        int[] r0 = this.b;
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
        int r12 = r0[r11];
        Object r13 = r1[r11];
        int r14 = Integer.hashCode(r12);
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
        int[] r2 = this.b;
        Object[] r3 = this.c;
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
        int r15 = r2[r14];
        Object r16 = r3[r14];
        r1.append(r15);
        r1.append("=");
        if (r16 != this) goto L18;
        r16 = "(this)";
    L18:
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
}
