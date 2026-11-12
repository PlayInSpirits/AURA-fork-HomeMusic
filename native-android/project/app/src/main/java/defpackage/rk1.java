package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 extends i90 {
    public static final /* synthetic */ int w = 0;
    public final FilterInputStream o;
    public final byte[] p;
    public int q;
    public Inflater r;
    public final CRC32 s;
    public boolean t;
    public final byte[] u;
    public final y41 v;

    public rk1(ByteArrayInputStream r5) {
        this.p = new byte[8192];
        this.r = new Inflater(true);
        this.s = new CRC32();
        this.t = false;
        this.u = new byte[1];
        this.v = new y41(25);
        df0 r0 = new df0(r5);
        if (r0.markSupported() == false) goto L5;
        this.o = r0;
    L6:
        y41 r6 = this.v;
        FilterInputStream r1 = this.o;
        if (r1.read() != 31) goto L34;
        if (r1.read() != 139) goto L34;
        DataInputStream r2 = new DataInputStream(r1);
        int r3 = r2.readUnsignedByte();
        if (r3 != 8) goto L31;
        int r4 = r2.readUnsignedByte();
        if ((r4 & 224) != 0) goto L30;
        gh0.l(r2);
        r6.getClass();
        r2.readUnsignedByte();
        r2.readUnsignedByte();
        if ((r4 & 4) == 0) goto L21;
        int r7 = r2.readUnsignedByte() | (r2.readUnsignedByte() << 8);
    L17:
        int r8 = r7 - 1;
        if (r7 <= 0) goto L21;
        r2.readUnsignedByte();
        r7 = r8;
    L21:
        if ((r4 & 8) == 0) goto L24;
        new String(f(r2), "ISO-8859-1");
    L24:
        if ((r4 & 16) == 0) goto L27;
        new String(f(r2), "ISO-8859-1");
    L27:
        if ((r4 & 2) == 0) goto L29;
        r2.readShort();
    L29:
        this.r.reset();
        this.s.reset();
        return;
    L30:
        mj0.i("Reserved flags are set in the .gz header");
        return;
    L31:
        mj0.i(b11.j(r3, "Unsupported compression method ", " in the .gz header"));
        return;
    L34:
        throw new IOException("Input is not in the .gz format");
    L5:
        this.o = new BufferedInputStream(r0);
        goto L6
    }

    public static byte[] f(DataInputStream r2) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
    L22:
        int r1 = r2.readUnsignedByte();     // Catch: Throwable -> L6
        if (r1 == 0) goto L8;
        r0.write(r1);     // Catch: Throwable -> L6
        goto L22
    L8:
        byte[] r3 = r0.toByteArray();     // Catch: Throwable -> L6
        r0.close();
        return r3;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater r0 = this.r;
        if (r0 == null) goto L5;
        r0.end();
        this.r = null;
    L5:
        InputStream r1 = System.in;
        FilterInputStream r2 = this.o;
        if (r2 == r1) goto L9;
        r2.close();
        return;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
        if (r11 != 0) goto L6;
        return 0;
    L6:
        if (this.t == true) goto L28;
        int r1 = 0;
    L9:
        if (r11 <= 0) goto L38;
        boolean r3 = this.r.needsInput();
        FilterInputStream r4 = this.o;
        if (r3 == false) goto L39;
        byte[] r5 = this.p;
        r4.mark(r5.length);
        int r6 = r4.read(r5);
        this.q = r6;
        if (r6 == (-1)) goto L16;
        this.r.setInput(r5, 0, r6);
        goto L39
    L16:
        throw new EOFException();
    L39:
        int r7 = this.r.inflate(r9, r10, r11);     // Catch: DataFormatException -> L36
        CRC32 r8 = this.s;
        r8.update(r9, r10, r7);
        r10 = r10 + r7;
        r11 = r11 - r7;
        r1 = r1 + r7;
        b(r7);
        if (this.r.finished() == false) goto L9;
        r4.reset();
        long r12 = this.q - this.r.getRemaining();
        if (vr1.G(r4, r12) != r12) goto L35;
        this.q = 0;
        DataInputStream r13 = new DataInputStream(r4);
        if (gh0.l(r13) == r8.getValue()) goto L25;
        mj0.i("Gzip-compressed data is corrupt (CRC32 error)");
        return 0;
    L25:
        if (gh0.l(r13) != (this.r.getBytesWritten() & 4294967295L)) goto L30;
        this.r.end();
        this.r = null;
        this.t = true;
        if (r1 == 0) goto L28;
        return r1;
    L30:
        mj0.i("Gzip-compressed data is corrupt(uncompressed size mismatch)");
        return 0;
    L35:
        throw new IOException();
    L36:
        mj0.i("Gzip-compressed data is corrupt");
        return 0;
    L38:
        return r1;
    L28:
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.u;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }
}
