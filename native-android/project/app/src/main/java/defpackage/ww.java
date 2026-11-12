package defpackage;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ww extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1, int r2, int r3) {
        r1.getClass();
        rr2.u(r2, r3 + r2, r1.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1) {
        r1.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(int r1) {
    }
}
