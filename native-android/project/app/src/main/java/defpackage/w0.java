package defpackage;

import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends i90 {
    public final int o;
    public final byte[] p;
    public int q;
    public int r;
    public final df0 s;
    public long t;
    public int u;
    public final byte[] v = new byte[1];
    public final hg3 w = new hg3(2, this);

    public w0(InputStream inputStream, int i) {
        this.s = new df0(inputStream);
        if (i <= 0) {
            kf2.n("windowSize must be bigger than 0");
            throw null;
        }
        this.o = i;
        this.p = new byte[i * 3];
        this.r = 0;
        this.q = 0;
        this.t = 0L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.q - this.r;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final int f(byte[] bArr, int i, int i2) {
        int iAvailable = available();
        if (i2 > iAvailable) {
            int iMin = (int) Math.min(i2 - iAvailable, this.t);
            byte[] bArr2 = this.p;
            int iMin2 = Math.min(iMin, bArr2.length - this.q);
            if (iMin2 != 0) {
                int i3 = this.u;
                if (i3 == 1) {
                    int i4 = this.q;
                    Arrays.fill(bArr2, i4, i4 + iMin2, bArr2[i4 - 1]);
                    this.q += iMin2;
                } else if (iMin2 < i3) {
                    int i5 = this.q;
                    System.arraycopy(bArr2, i5 - i3, bArr2, i5, iMin2);
                    this.q += iMin2;
                } else {
                    int i6 = iMin2 / i3;
                    for (int i7 = 0; i7 < i6; i7++) {
                        int i8 = this.q;
                        int i9 = this.u;
                        System.arraycopy(bArr2, i8 - i9, bArr2, i8, i9);
                        this.q += this.u;
                    }
                    int i10 = this.u;
                    int i11 = iMin2 - (i6 * i10);
                    if (i11 > 0) {
                        int i12 = this.q;
                        System.arraycopy(bArr2, i12 - i10, bArr2, i12, i11);
                        this.q += i11;
                    }
                }
            }
            this.t -= (long) iMin2;
        }
        return j(bArr, i, i2);
    }

    public final int j(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, available());
        if (iMin > 0) {
            int i3 = this.r;
            byte[] bArr2 = this.p;
            System.arraycopy(bArr2, i3, bArr, i, iMin);
            int i4 = this.r + iMin;
            this.r = i4;
            int i5 = this.o;
            int i6 = i5 * 2;
            if (i4 > i6) {
                System.arraycopy(bArr2, i5, bArr2, 0, i6);
                this.q -= i5;
                this.r -= i5;
            }
        }
        return iMin;
    }

    public final int n(byte[] bArr, int i, int i2) {
        int iAvailable = available();
        if (i2 > iAvailable) {
            int iMin = (int) Math.min(i2 - iAvailable, this.t);
            byte[] bArr2 = this.p;
            int iMin2 = Math.min(iMin, bArr2.length - this.q);
            int iD = iMin2 > 0 ? vr1.D(this.s, bArr2, this.q, iMin2) : 0;
            b(iD);
            if (iMin2 != iD) {
                mj0.i("Premature end of stream reading literal");
                return 0;
            }
            this.q += iMin2;
            this.t -= (long) iMin2;
        }
        return j(bArr, i, i2);
    }

    public final int q() {
        int i = this.s.read();
        if (i == -1) {
            return -1;
        }
        b(1L);
        return i & 255;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.v;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public final void s(int i, long j) {
        if (i <= 0 || i > this.q) {
            kf2.n("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        } else if (j < 0) {
            kf2.n("length must not be negative");
        } else {
            this.u = i;
            this.t = j;
        }
    }
}
