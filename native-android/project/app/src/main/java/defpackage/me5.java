package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class me5 extends i90 {
    public static final /* synthetic */ int C = 0;
    public final int A;
    public long B;
    public final byte[] o;
    public final qs p;
    public final int q;
    public int r;
    public byte s;
    public int t;
    public int u;
    public final int[] v;
    public final byte[] w;
    public final byte[] x;
    public int y;
    public final boolean z;

    public me5(ByteArrayInputStream byteArrayInputStream) throws IOException {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.o = new byte[1];
        this.q = -1;
        this.r = 9;
        this.t = -1;
        qs qsVar = new qs(byteArrayInputStream, byteOrder);
        this.p = qsVar;
        this.B = 0L;
        int iB = (int) qsVar.b(8);
        int iB2 = (int) qsVar.b(8);
        int iB3 = (int) qsVar.b(8);
        if (iB != 31 || iB2 != 157 || iB3 < 0) {
            mj0.i("Input is not in .Z format");
            throw null;
        }
        boolean z = (iB3 & 128) != 0;
        this.z = z;
        int i = iB3 & 31;
        this.A = i;
        if (z) {
            this.q = 256;
        }
        if (i <= 0) {
            kf2.n(b11.j(i, "maxCodeSize is ", ", must be bigger than 0"));
            throw null;
        }
        if (i <= 0) {
            kf2.n(b11.j(i, "maxCodeSize is ", ", must be bigger than 0"));
            throw null;
        }
        int i2 = 1 << i;
        this.v = new int[i2];
        this.w = new byte[i2];
        this.x = new byte[i2];
        this.y = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.v[i3] = -1;
            this.w[i3] = (byte) i3;
        }
        this.u = (this.z ? 1 : 0) + 256;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.p.close();
    }

    public final int f(int i, byte b) {
        int i2 = this.r;
        int i3 = 1 << i2;
        int i4 = this.u;
        if (i4 < i3) {
            this.v[i4] = i;
            this.w[i4] = b;
            this.u = i4 + 1;
        } else {
            i4 = -1;
        }
        if (this.u == i3 && i2 < this.A) {
            j();
            this.r++;
        }
        return i4;
    }

    public final void j() {
        long j = 8 - (this.B % 8);
        if (j == 8) {
            j = 0;
        }
        for (long j2 = 0; j2 < j; j2++) {
            n();
        }
        qs qsVar = this.p;
        qsVar.p = 0L;
        qsVar.q = 0;
    }

    public final int n() {
        int i = this.r;
        if (i > 31) {
            kf2.n("Code size must not be bigger than 31");
            return 0;
        }
        int iB = (int) this.p.b(i);
        if (iB >= 0) {
            this.B++;
        }
        return iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        int iMin2;
        Object[] objArr;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.x;
        int length = bArr2.length - this.y;
        if (length > 0) {
            iMin = Math.min(length, i2);
            System.arraycopy(bArr2, this.y, bArr, i, iMin);
            this.y += iMin;
        } else {
            iMin = 0;
        }
        while (true) {
            int i3 = i2 - iMin;
            if (i3 <= 0) {
                b(iMin);
                return iMin;
            }
            int iN = n();
            int i4 = -1;
            if (iN >= 0) {
                boolean z = this.z;
                if (z && iN == this.q) {
                    this.u = (z ? 1 : 0) + 256;
                    j();
                    this.r = 9;
                    this.t = -1;
                    i4 = 0;
                } else {
                    int i5 = this.u;
                    if (iN == i5) {
                        int i6 = this.t;
                        if (i6 == -1) {
                            mj0.i("The first code can't be a reference to its preceding code");
                            return 0;
                        }
                        f(i6, this.s);
                        objArr = true;
                    } else {
                        if (iN > i5) {
                            throw new IOException(String.format("Invalid %d bit code 0x%x", Integer.valueOf(this.r), Integer.valueOf(iN)));
                        }
                        objArr = false;
                    }
                    int i7 = iN;
                    while (i7 >= 0) {
                        int i8 = this.y - 1;
                        this.y = i8;
                        bArr2[i8] = this.w[i7];
                        i7 = this.v[i7];
                    }
                    int i9 = this.t;
                    if (i9 != -1 && objArr == false) {
                        f(i9, bArr2[this.y]);
                    }
                    this.t = iN;
                    i4 = this.y;
                    this.s = bArr2[i4];
                }
            }
            if (i4 < 0) {
                if (iMin <= 0) {
                    return i4;
                }
                b(iMin);
                return iMin;
            }
            int i10 = i + iMin;
            int length2 = bArr2.length - this.y;
            if (length2 > 0) {
                iMin2 = Math.min(length2, i3);
                System.arraycopy(bArr2, this.y, bArr, i10, iMin2);
                this.y += iMin2;
            } else {
                iMin2 = 0;
            }
            iMin += iMin2;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.o;
        int i = read(bArr);
        return i < 0 ? i : bArr[0] & 255;
    }
}
