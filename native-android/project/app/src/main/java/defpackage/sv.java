package defpackage;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv extends OutputStream {
    public final /* synthetic */ tv n;

    public sv(tv r1) {
        this.n = r1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.n + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1, int r2, int r3) {
        r1.getClass();
        this.n.m78write(r1, r2, r3);
    }

    @Override // java.io.OutputStream
    public final void write(int r1) {
        this.n.Y(r1);
    }
}
