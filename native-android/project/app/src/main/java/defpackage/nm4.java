package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nm4 implements Closeable {
    public final FileInputStream n;
    public final Charset o;
    public byte[] p;
    public int q;
    public int r;

    public nm4(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(d35.a)) {
            kf2.n("Unsupported encoding");
            throw null;
        }
        this.n = fileInputStream;
        this.o = charset;
        this.p = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String b() {
        int i;
        synchronized (this.n) {
            try {
                byte[] bArr = this.p;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.q >= this.r) {
                    int i2 = this.n.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.q = 0;
                    this.r = i2;
                }
                for (int i3 = this.q; i3 != this.r; i3++) {
                    byte[] bArr2 = this.p;
                    if (bArr2[i3] == 10) {
                        int i4 = this.q;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.o.name());
                        this.q = i3 + 1;
                        return str;
                    }
                }
                mm4 mm4Var = new mm4(this, (this.r - this.q) + 80);
                while (true) {
                    byte[] bArr3 = this.p;
                    int i5 = this.q;
                    mm4Var.write(bArr3, i5, this.r - i5);
                    this.r = -1;
                    FileInputStream fileInputStream = this.n;
                    byte[] bArr4 = this.p;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.q = 0;
                    this.r = i6;
                    for (int i7 = 0; i7 != this.r; i7++) {
                        byte[] bArr5 = this.p;
                        if (bArr5[i7] == 10) {
                            int i8 = this.q;
                            if (i7 != i8) {
                                mm4Var.write(bArr5, i8, i7 - i8);
                            }
                            this.q = i7 + 1;
                            return mm4Var.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.n) {
            try {
                if (this.p != null) {
                    this.p = null;
                    this.n.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
