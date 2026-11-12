package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 extends i90 {
    public static final byte[] B = {4, 34, 77, 24};
    public static final byte[] C = {42, 77, 24};
    public byte[] A;
    public final df0 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public InputStream v;
    public boolean w;
    public boolean x;
    public final byte[] o = new byte[1];
    public final hg3 p = new hg3(20, this);
    public final de5 y = new de5();
    public final de5 z = new de5();

    public qe1(ByteArrayInputStream byteArrayInputStream) throws IOException {
        this.q = new df0(byteArrayInputStream);
        df0 df0Var = this.q;
        byte[] bArr = new byte[4];
        int iD = vr1.D(df0Var, bArr, 0, 4);
        b(iD);
        if (4 != iD) {
            mj0.i("Not a LZ4 frame stream");
            return;
        }
        int iD2 = 4;
        loop0: while (iD2 == 4 && (bArr[0] & 80) == 80) {
            for (int i = 1; i < 4; i++) {
                if (bArr[i] != C[i - 1]) {
                    break loop0;
                }
            }
            long jK = gh0.k(this.p, 4);
            if (jK < 0) {
                mj0.i("Found illegal skippable frame with negative size");
                return;
            }
            long jG = vr1.G(df0Var, jK);
            b(jG);
            if (jK != jG) {
                mj0.i("Premature end of stream while skipping frame");
                return;
            } else {
                iD2 = vr1.D(df0Var, bArr, 0, 4);
                b(iD2);
            }
        }
        if (4 != iD2 || !Arrays.equals(bArr, B)) {
            mj0.i("Not a LZ4 frame stream");
            return;
        }
        de5 de5Var = this.y;
        int iN = n();
        if (iN == -1) {
            mj0.i("Premature end of stream while reading frame flags");
            return;
        }
        de5Var.update(iN);
        if ((iN & 192) != 64) {
            throw new IOException("Unsupported version " + (iN >> 6));
        }
        boolean z = (iN & 32) == 0;
        this.s = z;
        if (!z) {
            this.A = null;
        } else if (this.A == null) {
            this.A = new byte[65536];
        }
        this.r = (iN & 16) != 0;
        this.t = (iN & 8) != 0;
        this.u = (4 & iN) != 0;
        int iN2 = n();
        if (iN2 == -1) {
            mj0.i("Premature end of stream while reading frame BD byte");
            return;
        }
        de5Var.update(iN2);
        if (this.t) {
            byte[] bArr2 = new byte[8];
            int iD3 = vr1.D(df0Var, bArr2, 0, 8);
            b(iD3);
            if (8 != iD3) {
                mj0.i("Premature end of stream while reading content size");
                return;
            }
            de5Var.update(bArr2, 0, 8);
        }
        int iN3 = n();
        if (iN3 == -1) {
            mj0.i("Premature end of stream while reading frame header checksum");
            return;
        }
        int value = (int) ((de5Var.getValue() >> 8) & 255);
        de5Var.reset();
        if (iN3 == value) {
            f();
        } else {
            mj0.i("Frame header checksum mismatch");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        df0 df0Var = this.q;
        try {
            InputStream inputStream = this.v;
            if (inputStream != null) {
                inputStream.close();
                this.v = null;
            }
        } finally {
            df0Var.close();
        }
    }

    public final void f() throws IOException {
        InputStream a20Var;
        InputStream inputStream = this.v;
        de5 de5Var = this.z;
        if (inputStream != null) {
            inputStream.close();
            this.v = null;
            if (this.r) {
                q(de5Var, "block");
                de5Var.reset();
            }
        }
        long jK = gh0.k(this.p, 4);
        boolean z = ((-2147483648L) & jK) != 0;
        int i = (int) (jK & 2147483647L);
        if (i < 0) {
            mj0.i("Found illegal block with negative size");
            return;
        }
        if (i == 0) {
            boolean z2 = this.u;
            de5 de5Var2 = this.y;
            if (z2) {
                q(de5Var2, "content");
            }
            de5Var2.reset();
            this.w = true;
            return;
        }
        gu guVar = new gu(this.q, i);
        if (this.r) {
            a20Var = guVar;
            a20Var = new a20(de5Var, guVar);
        }
        if (z) {
            this.x = true;
            this.v = a20Var;
            return;
        }
        this.x = false;
        gt gtVar = new gt(a20Var);
        if (this.s) {
            byte[] bArr = this.A;
            if (gtVar.q != 0) {
                kf2.o("The stream has already been read from, can't prefill anymore");
                return;
            }
            int iMin = Math.min(gtVar.o, bArr.length);
            System.arraycopy(bArr, bArr.length - iMin, gtVar.p, 0, iMin);
            gtVar.q += iMin;
            gtVar.r += iMin;
        }
        this.v = gtVar;
    }

    public final int j(byte[] bArr, int i, int i2) throws IOException {
        boolean z = this.x;
        InputStream inputStream = this.v;
        if (z) {
            int i3 = inputStream.read(bArr, i, i2);
            b(i3);
            return i3;
        }
        gt gtVar = (gt) inputStream;
        long j = gtVar.n;
        int i4 = inputStream.read(bArr, i, i2);
        b(gtVar.n - j);
        return i4;
    }

    public final int n() throws IOException {
        int i = this.q.read();
        if (i == -1) {
            return -1;
        }
        b(1L);
        return i & 255;
    }

    public final void q(de5 de5Var, String str) throws IOException {
        byte[] bArr = new byte[4];
        int iD = vr1.D(this.q, bArr, 0, 4);
        b(iD);
        if (4 != iD) {
            mj0.i(xa3.h("Premature end of stream while reading ", str, " checksum"));
        } else {
            if (de5Var.getValue() == gh0.m(bArr, 0, 4)) {
                return;
            }
            mj0.i(str.concat(" checksum mismatch."));
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        if (i2 == 0) {
            return 0;
        }
        if (this.w) {
            return -1;
        }
        int iJ = j(bArr, i, i2);
        if (iJ == -1) {
            f();
            if (!this.w) {
                iJ = j(bArr, i, i2);
            }
        }
        if (iJ != -1) {
            if (this.s && (iMin = Math.min(iJ, this.A.length)) > 0) {
                byte[] bArr2 = this.A;
                int length = bArr2.length - iMin;
                if (length > 0) {
                    System.arraycopy(bArr2, iMin, bArr2, 0, length);
                }
                System.arraycopy(bArr, i, this.A, length, iMin);
            }
            if (this.u) {
                this.y.update(bArr, i, iJ);
            }
        }
        return iJ;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.o;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
