package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aw3 extends FilterInputStream {
    public volatile byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final qj0 s;

    public aw3(InputStream inputStream, qj0 qj0Var) {
        super(inputStream);
        this.q = -1;
        this.s = qj0Var;
        this.n = (byte[]) qj0Var.d(65536, byte[].class);
    }

    public static void j() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.n == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.o - this.r) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.q;
        if (i != -1) {
            int i2 = this.r - i;
            int i3 = this.p;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.o == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.s.d(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.n = bArr2;
                    this.s.h(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.r - this.q;
                this.r = i4;
                this.q = 0;
                this.o = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.r;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.o = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.q = -1;
            this.r = 0;
            this.o = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.n != null) {
            this.s.h(this.n);
            this.n = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void f() {
        if (this.n != null) {
            this.s.h(this.n);
            this.n = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.p = Math.max(this.p, i);
        this.q = this.r;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.n;
        if (bArr2 == null) {
            j();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i5 = this.r;
        int i6 = this.o;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.r += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.q == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.n && (bArr2 = this.n) == null) {
                    j();
                    throw null;
                }
                int i8 = this.o;
                int i9 = this.r;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.r += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.n == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.q;
        if (-1 == i) {
            throw new zv3("Mark has been invalidated, pos: " + this.r + " markLimit: " + this.p);
        }
        this.r = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            j();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i = this.o;
        int i2 = this.r;
        if (i - i2 >= j) {
            this.r = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.r = i;
        if (this.q == -1 || j > this.p) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.q = -1;
            }
            return j2 + jSkip;
        }
        if (b(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.o;
        int i4 = this.r;
        if (i3 - i4 >= j - j2) {
            this.r = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.r = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.n;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.r >= this.o && b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.n && (bArr = this.n) == null) {
                j();
                throw null;
            }
            int i = this.o;
            int i2 = this.r;
            if (i - i2 <= 0) {
                return -1;
            }
            this.r = i2 + 1;
            return bArr[i2] & 255;
        }
        j();
        throw null;
    }
}
