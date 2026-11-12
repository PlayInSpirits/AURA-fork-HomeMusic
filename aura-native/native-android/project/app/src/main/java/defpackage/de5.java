package defpackage;

import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class de5 implements Checksum {
    public final byte[] a = new byte[1];
    public final int[] b = new int[4];
    public final byte[] c = new byte[16];
    public int d;
    public int e;

    public de5() {
        a();
    }

    public final void a() {
        int[] iArr = this.b;
        iArr[0] = 606290984;
        iArr[1] = -2048144777;
        iArr[2] = 0;
        iArr[3] = 1640531535;
    }

    public final void b(int i, byte[] bArr) {
        int[] iArr = this.b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int iRotateLeft = Integer.rotateLeft((((int) (gh0.m(bArr, i, 4) & 4294967295L)) * (-2048144777)) + i2, 13) * (-1640531535);
        int iRotateLeft2 = Integer.rotateLeft((((int) (gh0.m(bArr, i + 4, 4) & 4294967295L)) * (-2048144777)) + i3, 13) * (-1640531535);
        int iRotateLeft3 = Integer.rotateLeft((((int) (gh0.m(bArr, i + 8, 4) & 4294967295L)) * (-2048144777)) + i4, 13) * (-1640531535);
        int iRotateLeft4 = Integer.rotateLeft((((int) (gh0.m(bArr, i + 12, 4) & 4294967295L)) * (-2048144777)) + i5, 13) * (-1640531535);
        iArr[0] = iRotateLeft;
        iArr[1] = iRotateLeft2;
        iArr[2] = iRotateLeft3;
        iArr[3] = iRotateLeft4;
        this.e = 0;
    }

    @Override // java.util.zip.Checksum
    public final long getValue() {
        int iRotateLeft;
        byte[] bArr;
        int i = this.d;
        int i2 = 0;
        int[] iArr = this.b;
        if (i > 16) {
            iRotateLeft = Integer.rotateLeft(iArr[3], 18) + Integer.rotateLeft(iArr[2], 12) + Integer.rotateLeft(iArr[1], 7) + Integer.rotateLeft(iArr[0], 1);
        } else {
            iRotateLeft = iArr[2] + 374761393;
        }
        int iRotateLeft2 = iRotateLeft + this.d;
        int i3 = this.e - 4;
        while (true) {
            bArr = this.c;
            if (i2 > i3) {
                break;
            }
            iRotateLeft2 = Integer.rotateLeft((((int) (4294967295L & gh0.m(bArr, i2, 4))) * (-1028477379)) + iRotateLeft2, 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.e) {
            iRotateLeft2 = Integer.rotateLeft(((bArr[i2] & 255) * 374761393) + iRotateLeft2, 11) * (-1640531535);
            i2++;
        }
        int i4 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477379);
        return ((long) (i5 ^ (i5 >>> 16))) & 4294967295L;
    }

    @Override // java.util.zip.Checksum
    public final void reset() {
        a();
        this.d = 0;
        this.e = 0;
    }

    @Override // java.util.zip.Checksum
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.d += i2;
        int i3 = i + i2;
        int i4 = this.e;
        int i5 = i4 + i2;
        byte[] bArr2 = this.c;
        if (i5 < 16) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.e += i2;
            return;
        }
        if (i4 > 0) {
            int i6 = 16 - i4;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            b(0, bArr2);
            i += i6;
        }
        int i7 = i3 - 16;
        while (i <= i7) {
            b(i, bArr);
            i += 16;
        }
        if (i < i3) {
            int i8 = i3 - i;
            this.e = i8;
            System.arraycopy(bArr, i, bArr2, 0, i8);
        }
    }

    @Override // java.util.zip.Checksum
    public final void update(int i) {
        byte[] bArr = this.a;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }
}
