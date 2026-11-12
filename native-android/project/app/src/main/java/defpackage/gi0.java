package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends InputStream {
    public final ci0 n;
    public final ii0 o;
    public final byte[] p;
    public boolean q;
    public boolean r;

    public gi0(ci0 r2, ii0 r3) {
        this.q = false;
        this.r = false;
        this.n = r2;
        this.o = r3;
        this.p = new byte[1];
    }

    public final void b() {
        if (this.q == true) goto L6;
        this.n.b(this.o);
        this.q = true;
        return;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r == true) goto L6;
        this.n.close();
        this.r = true;
        return;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        rr2.w(!this.r);
        b();
        int r1 = this.n.read(r2, r3, r4);
        if (r1 != (-1)) goto L5;
        return -1;
    L5:
        return r1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r0 = this.p;
        if (read(r0, 0, r0.length) != (-1)) goto L6;
        return -1;
    L6:
        return r0[0] & 255;
    }
}
