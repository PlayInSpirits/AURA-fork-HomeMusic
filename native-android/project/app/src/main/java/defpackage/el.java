package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class el extends OutputStream {
    public final FileOutputStream n;
    public boolean o;

    public el(File r2) {
        this.o = false;
        this.n = new FileOutputStream(r2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream r0 = this.n;
        if (this.o == false) goto L5;
        return;
    L5:
        this.o = true;
        flush();
        r0.getFD().sync();     // Catch: IOException -> L8
    L10:
        r0.close();
        return;
    L8:
        e = move-exception;
        l93.r0("AtomicFile", "Failed to sync file descriptor:", e);
        goto L10
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.n.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int r1) {
        this.n.write(r1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1) {
        this.n.write(r1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1, int r2, int r3) {
        this.n.write(r1, r2, r3);
    }
}
