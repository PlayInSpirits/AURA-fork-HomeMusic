package defpackage;

import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class de5 implements Checksum {
    public final byte[] a;
    public final int[] b;
    public final byte[] c;
    public int d;
    public int e;

    public de5() {
        this.a = new byte[1];
        this.b = new int[4];
        this.c = new byte[16];
        a();
    }

    public final void a() {
        int[] r3 = this.b;
        r3[0] = 606290984;
        r3[1] = -2048144777;
        r3[2] = 0;
        r3[3] = 1640531535;
    }

    public final void b(int r23, byte[] r24) {
        int[] r3 = this.b;
        int r5 = r3[0];
        int r7 = r3[1];
        int r9 = r3[2];
        int r11 = r3[3];
        int r13 = Integer.rotateLeft((((int) (gh0.m(r24, r23, 4) & 4294967295L)) * (-2048144777)) + r5, 13) * (-1640531535);
        int r8 = Integer.rotateLeft((((int) (gh0.m(r24, r23 + 4, 4) & 4294967295L)) * (-2048144777)) + r7, 13) * (-1640531535);
        int r10 = Integer.rotateLeft((((int) (gh0.m(r24, r23 + 8, 4) & 4294967295L)) * (-2048144777)) + r9, 13) * (-1640531535);
        int r1 = Integer.rotateLeft((((int) (gh0.m(r24, r23 + 12, 4) & 4294967295L)) * (-2048144777)) + r11, 13) * (-1640531535);
        r3[0] = r13;
        r3[1] = r8;
        r3[2] = r10;
        r3[3] = r1;
        this.e = 0;
    }

    @Override // java.util.zip.Checksum
    public final long getValue() {
        int r0 = this.d;
        int r3 = 0;
        int[] r5 = this.b;
        if (r0 <= 16) goto L5;
        int r1 = Integer.rotateLeft(r5[0], 1);
        int r4 = Integer.rotateLeft(r5[1], 7) + r1;
        int r2 = Integer.rotateLeft(r5[2], 12) + r4;
        int r6 = Integer.rotateLeft(r5[3], 18) + r2;
    L6:
        int r7 = r6 + this.d;
        int r8 = this.e - 4;
    L7:
        byte[] r9 = this.c;
        if (r3 > r8) goto L11;
        r7 = Integer.rotateLeft((((int) (4294967295L & gh0.m(r9, r3, 4))) * (-1028477379)) + r7, 17) * 668265263;
        r3 = r3 + 4;
    L11:
        if (r3 >= this.e) goto L13;
        int r10 = r3 + 1;
        r7 = Integer.rotateLeft(((r9[r3] & 255) * 374761393) + r7, 11) * (-1640531535);
        r3 = r10;
        goto L11
    L13:
        int r11 = ((r7 >>> 15) ^ r7) * (-2048144777);
        int r12 = (r11 ^ (r11 >>> 13)) * (-1028477379);
        return ((long) (r12 ^ (r12 >>> 16))) & 4294967295L;
    L5:
        r6 = r5[2] + 374761393;
        goto L6
    }

    @Override // java.util.zip.Checksum
    public final void reset() {
        a();
        this.d = 0;
        this.e = 0;
    }

    @Override // java.util.zip.Checksum
    public final void update(byte[] r6, int r7, int r8) {
        if (r8 <= 0) goto L19;
        this.d += r8;
        int r0 = r7 + r8;
        int r1 = this.e;
        int r2 = r1 + r8;
        byte[] r3 = this.c;
        if (r2 >= 16) goto L9;
        System.arraycopy(r6, r7, r3, r1, r8);
        this.e += r8;
        return;
    L9:
        if (r1 <= 0) goto L11;
        int r4 = 16 - r1;
        System.arraycopy(r6, r7, r3, r1, r4);
        b(0, r3);
        r7 = r7 + r4;
    L11:
        int r5 = r0 - 16;
    L12:
        if (r7 > r5) goto L14;
        b(r7, r6);
        r7 = r7 + 16;
        goto L12
    L14:
        if (r7 >= r0) goto L18;
        int r9 = r0 - r7;
        this.e = r9;
        System.arraycopy(r6, r7, r3, 0, r9);
        return;
    L18:
        return;
    }

    @Override // java.util.zip.Checksum
    public final void update(int r3) {
        byte[] r0 = this.a;
        r0[0] = (byte) (r3 & 255);
        update(r0, 0, 1);
    }
}
