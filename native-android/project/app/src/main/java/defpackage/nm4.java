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

    public nm4(FileInputStream r3, Charset r4) {
        if (r4 != null) goto L5;
        throw null;
    L5:
        if (r4.equals(d35.a) == false) goto L8;
        this.n = r3;
        this.o = r4;
        this.p = new byte[8192];
        return;
    L8:
        kf2.n("Unsupported encoding");
        throw null;
    }

    public final String b() {
        FileInputStream r0 = this.n;
        monitor-enter(r0);
        byte[] r1 = this.p;     // Catch: Throwable -> L23
        if (r1 == null) goto L48;
        if (this.q < this.r) goto L13;
        int r2 = this.n.read(r1, 0, r1.length);     // Catch: Throwable -> L23
        if (r2 == (-1)) goto L12;
        this.q = 0;     // Catch: Throwable -> L23
        this.r = r2;     // Catch: Throwable -> L23
        goto L13
    L12:
        throw new EOFException();     // Catch: Throwable -> L23
    L13:
        int r3 = this.q;     // Catch: Throwable -> L23
    L15:
        if (r3 == this.r) goto L30;
        byte[] r4 = this.p;     // Catch: Throwable -> L23
        if (r4[r3] == 10) goto L18;
        r3 = r3 + 1;     // Catch: Throwable -> L23
        goto L15
    L18:
        int r5 = this.q;     // Catch: Throwable -> L23
        if (r3 == r5) goto L25;
        int r6 = r3 - 1;     // Catch: Throwable -> L23
        if (r4[r6] != 13) goto L25;
    L26:
        String r7 = new String(r4, r5, r6 - r5, this.o.name());     // Catch: Throwable -> L23
        this.q = r3 + 1;     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r7;
    L25:
        r6 = r3;
        goto L26
    L30:
        mm4 r8 = new mm4(this, (this.r - this.q) + 80);     // Catch: Throwable -> L23
    L31:
        byte[] r9 = this.p;     // Catch: Throwable -> L23
        int r10 = this.q;     // Catch: Throwable -> L23
        r8.write(r9, r10, this.r - r10);     // Catch: Throwable -> L23
        this.r = -1;     // Catch: Throwable -> L23
        FileInputStream r11 = this.n;     // Catch: Throwable -> L23
        byte[] r12 = this.p;     // Catch: Throwable -> L23
        int r13 = r11.read(r12, 0, r12.length);     // Catch: Throwable -> L23
        if (r13 == (-1)) goto L46;
        this.q = 0;     // Catch: Throwable -> L23
        this.r = r13;     // Catch: Throwable -> L23
        int r14 = 0;
    L35:
        if (r14 == this.r) goto L31;
        byte[] r15 = this.p;     // Catch: Throwable -> L23
        if (r15[r14] == 10) goto L38;
        r14 = r14 + 1;     // Catch: Throwable -> L23
        goto L35
    L38:
        int r16 = this.q;     // Catch: Throwable -> L23
        if (r14 == r16) goto L41;
        r8.write(r15, r16, r14 - r16);     // Catch: Throwable -> L23
    L41:
        this.q = r14 + 1;     // Catch: Throwable -> L23
        String r17 = r8.toString();     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r17;
    L46:
        throw new EOFException();     // Catch: Throwable -> L23
    L48:
        throw new IOException("LineReader is closed");     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileInputStream r0 = this.n;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.p == null) goto L9;
        this.p = null;     // Catch: Throwable -> L7
        this.n.close();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }
}
