package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dw extends OutputStream {
    public final FileOutputStream n;
    public byte[] o;
    public final qj0 p;
    public int q;

    public dw(FileOutputStream fileOutputStream, qj0 qj0Var) {
        this.n = fileOutputStream;
        this.p = qj0Var;
        this.o = (byte[]) qj0Var.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.n;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.o;
            if (bArr != null) {
                this.p.h(bArr);
                this.o = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.q;
        FileOutputStream fileOutputStream = this.n;
        if (i > 0) {
            fileOutputStream.write(this.o, 0, i);
            this.q = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.q;
            FileOutputStream fileOutputStream = this.n;
            if (i6 == 0 && i4 >= this.o.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.o.length - i6);
            System.arraycopy(bArr, i5, this.o, this.q, iMin);
            int i7 = this.q + iMin;
            this.q = i7;
            i3 += iMin;
            byte[] bArr2 = this.o;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.q = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.o;
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.n.write(bArr, 0, i3);
        this.q = 0;
    }
}
