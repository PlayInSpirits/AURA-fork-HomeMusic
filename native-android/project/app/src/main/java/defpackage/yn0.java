package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends i90 {
    public static final /* synthetic */ int q = 0;
    public final InflaterInputStream o;
    public final Inflater p;

    public yn0(ByteArrayInputStream byteArrayInputStream) {
        Inflater inflater = new Inflater(false);
        this.p = inflater;
        this.o = new InflaterInputStream(new df0(byteArrayInputStream), inflater);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater inflater = this.p;
        try {
            this.o.close();
        } finally {
            inflater.end();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.o.read();
        b(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return vr1.G(this.o, j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.o.read(bArr, i, i2);
        b(i3);
        return i3;
    }
}
