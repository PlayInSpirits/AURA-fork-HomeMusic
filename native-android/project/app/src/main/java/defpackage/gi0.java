package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends InputStream {
    public final ci0 n;
    public final ii0 o;
    public boolean q = false;
    public boolean r = false;
    public final byte[] p = new byte[1];

    public gi0(ci0 ci0Var, ii0 ii0Var) {
        this.n = ci0Var;
        this.o = ii0Var;
    }

    public final void b() {
        if (this.q) {
            return;
        }
        this.n.b(this.o);
        this.q = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r) {
            return;
        }
        this.n.close();
        this.r = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        rr2.w(!this.r);
        b();
        int i3 = this.n.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.p;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
