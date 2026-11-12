package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class el extends OutputStream {
    public final FileOutputStream n;
    public boolean o = false;

    public el(File file) {
        this.n = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.n;
        if (this.o) {
            return;
        }
        this.o = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            l93.r0("AtomicFile", "Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.n.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.n.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.n.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.n.write(bArr, i, i2);
    }
}
