package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m44 {
    public final n9 a;
    public final int b;
    public final be3 c;
    public ru d;
    public ru e;
    public ru f;
    public long g;

    public m44(n9 n9Var) {
        this.a = n9Var;
        int iM = n9Var.m();
        this.b = iM;
        this.c = new be3(32);
        ru ruVar = new ru(iM, 0L);
        this.d = ruVar;
        this.e = ruVar;
        this.f = ruVar;
    }

    public static ru c(ru ruVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ruVar.o) {
            ruVar = (ru) ruVar.q;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (ruVar.o - j));
            m9 m9Var = (m9) ruVar.p;
            byteBuffer.put(m9Var.a, ((int) (j - ruVar.n)) + m9Var.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == ruVar.o) {
                ruVar = (ru) ruVar.q;
            }
        }
        return ruVar;
    }

    public static ru d(ru ruVar, long j, byte[] bArr, int i) {
        while (j >= ruVar.o) {
            ruVar = (ru) ruVar.q;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (ruVar.o - j));
            m9 m9Var = (m9) ruVar.p;
            System.arraycopy(m9Var.a, ((int) (j - ruVar.n)) + m9Var.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == ruVar.o) {
                ruVar = (ru) ruVar.q;
            }
        }
        return ruVar;
    }

    public static ru e(ru ruVar, cj0 cj0Var, cw1 cw1Var, be3 be3Var) {
        if (cj0Var.d(1073741824)) {
            long j = cw1Var.b;
            int iH = 1;
            be3Var.K(1);
            ru ruVarD = d(ruVar, j, be3Var.a, 1);
            long j2 = j + 1;
            byte b = be3Var.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            fg0 fg0Var = cj0Var.q;
            byte[] bArr = fg0Var.a;
            if (bArr == null) {
                fg0Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ruVar = d(ruVarD, j2, fg0Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                be3Var.K(2);
                ruVar = d(ruVar, j3, be3Var.a, 2);
                j3 += 2;
                iH = be3Var.H();
            }
            int[] iArr = fg0Var.d;
            if (iArr == null || iArr.length < iH) {
                iArr = new int[iH];
            }
            int[] iArr2 = fg0Var.e;
            if (iArr2 == null || iArr2.length < iH) {
                iArr2 = new int[iH];
            }
            if (z) {
                int i2 = iH * 6;
                be3Var.K(i2);
                ruVar = d(ruVar, j3, be3Var.a, i2);
                j3 += (long) i2;
                be3Var.N(0);
                for (int i3 = 0; i3 < iH; i3++) {
                    iArr[i3] = be3Var.H();
                    iArr2[i3] = be3Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cw1Var.a - ((int) (j3 - cw1Var.b));
            }
            vv4 vv4Var = (vv4) cw1Var.c;
            String str = f35.a;
            byte[] bArr2 = vv4Var.b;
            byte[] bArr3 = fg0Var.a;
            int i4 = vv4Var.a;
            int i5 = vv4Var.c;
            int i6 = vv4Var.d;
            fg0Var.f = iH;
            fg0Var.d = iArr;
            fg0Var.e = iArr2;
            fg0Var.b = bArr2;
            fg0Var.a = bArr3;
            fg0Var.c = i4;
            fg0Var.g = i5;
            fg0Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = fg0Var.i;
            cryptoInfo.numSubSamples = iH;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            hd5 hd5Var = fg0Var.j;
            hd5Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) hd5Var.p;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) hd5Var.o).setPattern(pattern);
            long j4 = cw1Var.b;
            int i7 = (int) (j3 - j4);
            cw1Var.b = j4 + ((long) i7);
            cw1Var.a -= i7;
        }
        if (!cj0Var.d(268435456)) {
            cj0Var.t(cw1Var.a);
            return c(ruVar, cw1Var.b, cj0Var.r, cw1Var.a);
        }
        be3Var.K(4);
        ru ruVarD2 = d(ruVar, cw1Var.b, be3Var.a, 4);
        int iE = be3Var.E();
        cw1Var.b += 4;
        cw1Var.a -= 4;
        cj0Var.t(iE);
        ru ruVarC = c(ruVarD2, cw1Var.b, cj0Var.r, iE);
        cw1Var.b += (long) iE;
        int i8 = cw1Var.a - iE;
        cw1Var.a = i8;
        ByteBuffer byteBuffer = cj0Var.u;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            cj0Var.u = ByteBuffer.allocate(i8);
        } else {
            cj0Var.u.clear();
        }
        return c(ruVarC, cw1Var.b, cj0Var.u, cw1Var.a);
    }

    public final void a(long j) {
        ru ruVar;
        if (j == -1) {
            return;
        }
        while (true) {
            ruVar = this.d;
            if (j < ruVar.o) {
                break;
            }
            this.a.f((m9) ruVar.p);
            ru ruVar2 = this.d;
            ruVar2.p = null;
            ru ruVar3 = (ru) ruVar2.q;
            ruVar2.q = null;
            this.d = ruVar3;
        }
        if (this.e.n < ruVar.n) {
            this.e = ruVar;
        }
    }

    public final int b(int i) {
        ru ruVar = this.f;
        if (((m9) ruVar.p) == null) {
            m9 m9VarG = this.a.g();
            ru ruVar2 = new ru(this.b, this.f.o);
            ruVar.p = m9VarG;
            ruVar.q = ruVar2;
        }
        return Math.min(i, (int) (this.f.o - this.g));
    }
}
