package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dw extends OutputStream {
    public final FileOutputStream n;
    public byte[] o;
    public final qj0 p;
    public int q;

    public dw(FileOutputStream r2, qj0 r3) {
        this.n = r2;
        this.p = r3;
        this.o = (byte[]) r3.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream r0 = this.n;
        flush();     // Catch: Throwable -> L8
        r0.close();
        byte[] r1 = this.o;
        if (r1 == null) goto L13;
        this.p.h(r1);
        this.o = null;
        return;
    L13:
        return;
    L8:
        th = move-exception;
        r0.close();
        throw th;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int r0 = this.q;
        FileOutputStream r1 = this.n;
        if (r0 <= 0) goto L5;
        r1.write(this.o, 0, r0);
        this.q = 0;
    L5:
        r1.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r8, int r9, int r10) {
        int r1 = 0;
    L3:
        int r2 = r10 - r1;
        int r3 = r9 + r1;
        int r4 = this.q;
        FileOutputStream r5 = this.n;
        if (r4 == 0) goto L6;
    L9:
        int r6 = Math.min(r2, this.o.length - r4);
        System.arraycopy(r8, r3, this.o, this.q, r6);
        int r7 = this.q + r6;
        this.q = r7;
        r1 = r1 + r6;
        byte[] r11 = this.o;
        if (r7 != r11.length) goto L13;
        if (r7 <= 0) goto L13;
        r5.write(r11, 0, r7);
        this.q = 0;
    L13:
        if (r1 < r10) goto L3;
        return;
    L6:
        if (r2 < this.o.length) goto L9;
        r5.write(r8, r3, r2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public final void write(int r4) {
        byte[] r0 = this.o;
        int r1 = this.q;
        int r2 = r1 + 1;
        this.q = r2;
        r0[r1] = (byte) r4;
        if (r2 != r0.length) goto L7;
        if (r2 <= 0) goto L8;
        this.n.write(r0, 0, r2);
        this.q = 0;
        return;
    L8:
        return;
    }
}
