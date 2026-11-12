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
    public int q;
    public final byte[] p = new byte[8192];
    public Inflater r = new Inflater(true);
    public final CRC32 s = new CRC32();
    public boolean t = false;
    public final byte[] u = new byte[1];
    public final y41 v = new y41(25);

    public rk1(ByteArrayInputStream byteArrayInputStream) throws IOException {
        df0 df0Var = new df0(byteArrayInputStream);
        if (df0Var.markSupported()) {
            this.o = df0Var;
        } else {
            this.o = new BufferedInputStream(df0Var);
        }
        y41 y41Var = this.v;
        FilterInputStream filterInputStream = this.o;
        if (filterInputStream.read() != 31 || filterInputStream.read() != 139) {
            throw new IOException("Input is not in the .gz format");
        }
        DataInputStream dataInputStream = new DataInputStream(filterInputStream);
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte != 8) {
            mj0.i(b11.j(unsignedByte, "Unsupported compression method ", " in the .gz header"));
            return;
        }
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & 224) != 0) {
            mj0.i("Reserved flags are set in the .gz header");
            return;
        }
        gh0.l(dataInputStream);
        y41Var.getClass();
        dataInputStream.readUnsignedByte();
        dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & 4) != 0) {
            int unsignedByte3 = dataInputStream.readUnsignedByte() | (dataInputStream.readUnsignedByte() << 8);
            while (true) {
                int i = unsignedByte3 - 1;
                if (unsignedByte3 <= 0) {
                    break;
                }
                dataInputStream.readUnsignedByte();
                unsignedByte3 = i;
            }
        }
        if ((unsignedByte2 & 8) != 0) {
            new String(f(dataInputStream), "ISO-8859-1");
        }
        if ((unsignedByte2 & 16) != 0) {
            new String(f(dataInputStream), "ISO-8859-1");
        }
        if ((unsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.r.reset();
        this.s.reset();
    }

    public static byte[] f(DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int unsignedByte = dataInputStream.readUnsignedByte();
                if (unsignedByte == 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(unsignedByte);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Inflater inflater = this.r;
        if (inflater != null) {
            inflater.end();
            this.r = null;
        }
        InputStream inputStream = System.in;
        FilterInputStream filterInputStream = this.o;
        if (filterInputStream != inputStream) {
            filterInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (!this.t) {
            int i3 = 0;
            while (i2 > 0) {
                boolean zNeedsInput = this.r.needsInput();
                FilterInputStream filterInputStream = this.o;
                if (zNeedsInput) {
                    byte[] bArr2 = this.p;
                    filterInputStream.mark(bArr2.length);
                    int i4 = filterInputStream.read(bArr2);
                    this.q = i4;
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.r.setInput(bArr2, 0, i4);
                }
                try {
                    int iInflate = this.r.inflate(bArr, i, i2);
                    CRC32 crc32 = this.s;
                    crc32.update(bArr, i, iInflate);
                    i += iInflate;
                    i2 -= iInflate;
                    i3 += iInflate;
                    b(iInflate);
                    if (this.r.finished()) {
                        filterInputStream.reset();
                        long remaining = this.q - this.r.getRemaining();
                        if (vr1.G(filterInputStream, remaining) != remaining) {
                            throw new IOException();
                        }
                        this.q = 0;
                        DataInputStream dataInputStream = new DataInputStream(filterInputStream);
                        if (gh0.l(dataInputStream) != crc32.getValue()) {
                            mj0.i("Gzip-compressed data is corrupt (CRC32 error)");
                            return 0;
                        }
                        if (gh0.l(dataInputStream) != (this.r.getBytesWritten() & 4294967295L)) {
                            mj0.i("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                            return 0;
                        }
                        this.r.end();
                        this.r = null;
                        this.t = true;
                        if (i3 != 0) {
                            return i3;
                        }
                    }
                } catch (DataFormatException unused) {
                    mj0.i("Gzip-compressed data is corrupt");
                    return 0;
                }
            }
            return i3;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.u;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
