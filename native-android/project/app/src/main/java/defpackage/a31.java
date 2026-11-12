package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class a31 extends InputStream implements DataInput {
    public static final ByteOrder r = null;
    public static final ByteOrder s = null;
    public final DataInputStream n;
    public ByteOrder o;
    public int p;
    public byte[] q;

    static {
        r = ByteOrder.LITTLE_ENDIAN;
        s = ByteOrder.BIG_ENDIAN;
    }

    public a31(InputStream r2, int r3) {
        ByteOrder r4 = ByteOrder.BIG_ENDIAN;
        this.o = r4;
        DataInputStream r0 = new DataInputStream(r2);
        this.n = r0;
        r0.mark(0);
        this.p = 0;
        this.o = r4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.n.available();
    }

    public final void b(int r7) {
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L15;
        int r2 = r7 - r1;
        DataInputStream r5 = this.n;
        int r3 = (int) r5.skip(r2);
        if (r3 > 0) goto L14;
        if (this.q != null) goto L9;
        this.q = new byte[8192];
    L9:
        r3 = r5.read(this.q, 0, Math.min(8192, r2));
        if (r3 != (-1)) goto L14;
        throw new EOFException(b11.j(r7, "Reached EOF while skipping ", " bytes."));
    L14:
        r1 = r1 + r3;
        goto L3
    L15:
        this.p += r1;
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.p++;
        return this.n.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.p++;
        return this.n.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.p++;
        int r1 = this.n.read();
        if (r1 < 0) goto L7;
        return (byte) r1;
    L7:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.p += 2;
        return this.n.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r3) {
        this.p += r3.length;
        this.n.readFully(r3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.p += 4;
        DataInputStream r0 = this.n;
        int r1 = r0.read();
        int r2 = r0.read();
        int r3 = r0.read();
        int r4 = r0.read();
        if ((((r1 | r2) | r3) | r4) < 0) goto L15;
        ByteOrder r5 = this.o;
        if (r5 != r) goto L9;
        return (((r4 << 24) + (r3 << 16)) + (r2 << 8)) + r1;
    L9:
        if (r5 == s) goto L11;
        mj0.m(this.o, "Invalid byte order: ");
        return 0;
    L11:
        return (((r1 << 24) + (r2 << 16)) + (r3 << 8)) + r4;
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.p += 8;
        DataInputStream r1 = this.n;
        int r3 = r1.read();
        int r4 = r1.read();
        int r5 = r1.read();
        int r6 = r1.read();
        int r7 = r1.read();
        int r8 = r1.read();
        int r9 = r1.read();
        int r2 = r1.read();
        if ((((((((r3 | r4) | r5) | r6) | r7) | r8) | r9) | r2) < 0) goto L15;
        ByteOrder r10 = this.o;
        if (r10 != r) goto L9;
        return (((((((((long) r2) << 56) + (((long) r9) << 48)) + (((long) r8) << 40)) + (((long) r7) << 32)) + (((long) r6) << 24)) + (((long) r5) << 16)) + (((long) r4) << 8)) + ((long) r3);
    L9:
        if (r10 == s) goto L11;
        mj0.m(this.o, "Invalid byte order: ");
        return 0;
    L11:
        return (((((((((long) r3) << 56) + (((long) r4) << 48)) + (((long) r5) << 40)) + (((long) r6) << 32)) + (((long) r7) << 24)) + (((long) r8) << 16)) + (((long) r9) << 8)) + ((long) r2);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.p += 2;
        DataInputStream r0 = this.n;
        int r1 = r0.read();
        int r2 = r0.read();
        if ((r1 | r2) < 0) goto L15;
        ByteOrder r3 = this.o;
        if (r3 != r) goto L9;
        return (short) ((r2 << 8) + r1);
    L9:
        if (r3 == s) goto L11;
        mj0.m(this.o, "Invalid byte order: ");
        return 0;
    L11:
        return (short) ((r1 << 8) + r2);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.p += 2;
        return this.n.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.p++;
        return this.n.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.p += 2;
        DataInputStream r0 = this.n;
        int r1 = r0.read();
        int r2 = r0.read();
        if ((r1 | r2) < 0) goto L15;
        ByteOrder r3 = this.o;
        if (r3 != r) goto L9;
        return (r2 << 8) + r1;
    L9:
        if (r3 == s) goto L11;
        mj0.m(this.o, "Invalid byte order: ");
        return 0;
    L11:
        return (r1 << 8) + r2;
    L15:
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r1) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r2, int r3, int r4) {
        this.p += r4;
        this.n.readFully(r2, r3, r4);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r5 = this.n.read(r2, r3, r4);
        this.p += r5;
        return r5;
    }

    public a31(InputStream r2) {
        ByteOrder r0 = ByteOrder.BIG_ENDIAN;
        this(r2, 0);
    }

    public a31(byte[] r2) {
        ByteArrayInputStream r0 = new ByteArrayInputStream(r2);
        ByteOrder r3 = ByteOrder.BIG_ENDIAN;
        this(r0, 0);
    }
}
