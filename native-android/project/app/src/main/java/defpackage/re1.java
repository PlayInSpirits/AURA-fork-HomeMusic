package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class re1 extends i90 {
    public static final byte[] z = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    public final PushbackInputStream o;
    public final int p;
    public bh4 q;
    public boolean s;
    public boolean t;
    public int u;
    public final int w;
    public final es3 x;
    public final zg5 y;
    public final byte[] r = new byte[1];
    public long v = -1;

    public re1(ByteArrayInputStream byteArrayInputStream) throws IOException {
        es3 es3Var = new es3();
        es3Var.a = -1;
        this.x = es3Var;
        this.y = new zg5(this);
        this.o = new PushbackInputStream(new df0(byteArrayInputStream), 1);
        this.w = 32768;
        this.p = 1;
        n();
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.t) {
            return Math.min(this.u, this.o.available());
        }
        bh4 bh4Var = this.q;
        if (bh4Var != null) {
            return bh4Var.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PushbackInputStream pushbackInputStream = this.o;
        try {
            bh4 bh4Var = this.q;
            if (bh4Var != null) {
                bh4Var.close();
                this.q = null;
            }
        } finally {
            pushbackInputStream.close();
        }
    }

    public final void f() throws IOException {
        int i;
        long j = this.v;
        es3 es3Var = this.x;
        if (j >= 0 && j != es3Var.getValue()) {
            mj0.i("Checksum verification failed");
            return;
        }
        this.v = -1L;
        es3Var.a = -1;
        this.t = false;
        PushbackInputStream pushbackInputStream = this.o;
        int i2 = pushbackInputStream.read();
        if (i2 != -1) {
            b(1L);
            i = i2 & 255;
        } else {
            i = -1;
        }
        boolean z2 = true;
        if (i == -1) {
            this.s = true;
            return;
        }
        if (i == 255) {
            pushbackInputStream.unread(i);
            this.n--;
            n();
            f();
            return;
        }
        zg5 zg5Var = this.y;
        if (i == 254 || (i > 127 && i <= 253)) {
            int iK = (int) gh0.k(zg5Var, 3);
            if (iK < 0) {
                mj0.i("Found illegal chunk with negative size");
                return;
            }
            long j2 = iK;
            long jG = vr1.G(pushbackInputStream, j2);
            b(jG);
            if (jG == j2) {
                f();
                return;
            } else {
                mj0.i("Premature end of stream");
                return;
            }
        }
        if (i >= 2 && i <= 127) {
            StringBuilder sbJ = f34.j(i, "Unskippable chunk with type ", " (hex ");
            sbJ.append(Integer.toHexString(i));
            sbJ.append(") detected.");
            throw new IOException(sbJ.toString());
        }
        if (i == 1) {
            this.t = true;
            int iK2 = ((int) gh0.k(zg5Var, 3)) - 4;
            this.u = iK2;
            if (iK2 < 0) {
                mj0.i("Found illegal chunk with negative size");
                return;
            }
            byte[] bArr = new byte[4];
            int iD = vr1.D(pushbackInputStream, bArr, 0, 4);
            b(iD);
            if (iD != 4) {
                mj0.i("Premature end of stream");
                return;
            } else {
                long jM = (gh0.m(bArr, 0, 4) - 2726488792L) & 4294967295L;
                this.v = ((jM << 15) | (jM >> 17)) & 4294967295L;
                return;
            }
        }
        if (i != 0) {
            mj0.i(b11.j(i, "Unknown chunk type ", " detected."));
            return;
        }
        int i3 = this.p;
        if (i3 != 1) {
            if (i3 != 2) {
                throw null;
            }
            z2 = false;
        }
        long jK = ((long) ((int) gh0.k(zg5Var, 3))) - (z2 ? 4L : 0L);
        if (jK < 0) {
            mj0.i("Found illegal chunk with negative size");
            return;
        }
        if (z2) {
            byte[] bArr2 = new byte[4];
            int iD2 = vr1.D(pushbackInputStream, bArr2, 0, 4);
            b(iD2);
            if (iD2 != 4) {
                mj0.i("Premature end of stream");
                return;
            } else {
                long jM2 = (gh0.m(bArr2, 0, 4) - 2726488792L) & 4294967295L;
                this.v = ((jM2 << 15) | (jM2 >> 17)) & 4294967295L;
            }
        } else {
            this.v = -1L;
        }
        bh4 bh4Var = new bh4(new gu(pushbackInputStream, jK), this.w);
        this.q = bh4Var;
        b(bh4Var.n);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final int j(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = -1;
        if (!this.t) {
            bh4 bh4Var = this.q;
            if (bh4Var != null) {
                long j = bh4Var.n;
                i3 = bh4Var.read(bArr, i, i2);
                bh4 bh4Var2 = this.q;
                if (i3 == -1) {
                    bh4Var2.close();
                    this.q = null;
                } else {
                    b(bh4Var2.n - j);
                }
            }
            if (i4 > 0) {
                this.x.update(bArr, i, i4);
            }
            return i4;
        }
        int iMin = Math.min(this.u, i2);
        if (iMin == 0) {
            return -1;
        }
        i3 = this.o.read(bArr, i, iMin);
        if (i3 != -1) {
            this.u -= i3;
            b(i3);
        }
        i4 = i3;
        if (i4 > 0) {
            this.x.update(bArr, i, i4);
        }
        return i4;
    }

    public final void n() throws IOException {
        byte[] bArr = new byte[10];
        int iD = vr1.D(this.o, bArr, 0, 10);
        b(iD);
        if (10 == iD && Arrays.equals(bArr, z)) {
            return;
        }
        mj0.i("Not a framed Snappy stream");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int iJ = j(bArr, i, i2);
        if (iJ != -1) {
            return iJ;
        }
        f();
        if (this.s) {
            return -1;
        }
        return j(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.r;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
