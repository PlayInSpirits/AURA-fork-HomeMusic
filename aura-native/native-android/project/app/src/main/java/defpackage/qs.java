package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qs implements Closeable {
    public static final long[] r = new long[64];
    public final df0 n;
    public final ByteOrder o;
    public long p = 0;
    public int q = 0;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = r;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public qs(InputStream inputStream, ByteOrder byteOrder) {
        this.n = new df0(inputStream);
        this.o = byteOrder;
    }

    public final long b(int i) {
        int i2;
        ByteOrder byteOrder;
        df0 df0Var;
        long j;
        if (i < 0 || i > 63) {
            kf2.n("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            i2 = this.q;
            byteOrder = this.o;
            df0Var = this.n;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j2 = df0Var.read();
            if (j2 < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j3 = this.p;
            if (byteOrder == byteOrder2) {
                this.p = (j2 << this.q) | j3;
            } else {
                this.p = (j3 << 8) | j2;
            }
            this.q += 8;
        }
        if (i2 >= i) {
            return f(i);
        }
        int i3 = i - i2;
        int i4 = 8 - i3;
        long j4 = df0Var.read();
        if (j4 < 0) {
            return j4;
        }
        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
        long[] jArr = r;
        if (byteOrder == byteOrder3) {
            this.p = ((jArr[i3] & j4) << this.q) | this.p;
            j = (j4 >>> i3) & jArr[i4];
        } else {
            long j5 = this.p << i3;
            this.p = j5;
            this.p = j5 | ((j4 >>> i4) & jArr[i3]);
            j = jArr[i4] & j4;
        }
        long j6 = jArr[i] & this.p;
        this.p = j;
        this.q = i4;
        return j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.close();
    }

    public final long f(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.p;
        long[] jArr = r;
        if (this.o == byteOrder) {
            j = j2 & jArr[i];
            this.p = j2 >>> i;
        } else {
            j = (j2 >> (this.q - i)) & jArr[i];
        }
        this.q -= i;
        return j;
    }
}
