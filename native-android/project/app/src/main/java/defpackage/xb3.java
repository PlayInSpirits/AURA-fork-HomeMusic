package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 extends i90 {
    public static final byte[] q;
    public static final int r;
    public final ByteArrayInputStream o;
    public final kx1 p;

    static {
        byte[] bArr = {-54, -2, -48, 13};
        q = bArr;
        r = bArr.length;
    }

    public xb3(ByteArrayInputStream byteArrayInputStream) throws IOException {
        this.o = byteArrayInputStream;
        kx1 kx1Var = new kx1(new ByteArrayOutputStream());
        this.p = kx1Var;
        JarOutputStream jarOutputStream = new JarOutputStream(kx1Var);
        try {
            Pack200.newUnpacker().unpack(new f40(byteArrayInputStream), jarOutputStream);
            jarOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.p.b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            kx1 kx1Var = this.p;
            kx1Var.close();
            synchronized (kx1Var.o) {
                try {
                    InputStream inputStream = kx1Var.n;
                    if (inputStream != null) {
                        inputStream.close();
                        kx1Var.n = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ByteArrayInputStream byteArrayInputStream = this.o;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        } catch (Throwable th2) {
            ByteArrayInputStream byteArrayInputStream2 = this.o;
            if (byteArrayInputStream2 != null) {
                byteArrayInputStream2.close();
            }
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        try {
            this.p.b().mark(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        try {
            return this.p.b().markSupported();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.p.b().read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.p.b().reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return vr1.G(this.p.b(), j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.p.b().read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.p.b().read(bArr, i, i2);
    }
}
