package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        int m = n9Var.m();
        this.b = m;
        this.c = new be3(32);
        ru ruVar = new ru(m, 0L);
        this.d = ruVar;
        this.e = ruVar;
        this.f = ruVar;
    }

    public static ru c(ru ruVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ruVar.o) {
            ruVar = (ru) ruVar.q;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ruVar.o - j));
            m9 m9Var = (m9) ruVar.p;
            byteBuffer.put(m9Var.a, ((int) (j - ruVar.n)) + m9Var.b, min);
            i -= min;
            j += min;
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
            int min = Math.min(i2, (int) (ruVar.o - j));
            m9 m9Var = (m9) ruVar.p;
            System.arraycopy(m9Var.a, ((int) (j - ruVar.n)) + m9Var.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ruVar.o) {
                ruVar = (ru) ruVar.q;
            }
        }
        return ruVar;
    }

    public static ru e(ru ruVar, cj0 cj0Var, cw1 cw1Var, be3 be3Var) {
        if (cj0Var.d(1073741824)) {
            long j = cw1Var.b;
            int i = 1;
            be3Var.K(1);
            ru d = d(ruVar, j, be3Var.a, 1);
            long j2 = j + 1;
            byte b = be3Var.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            fg0 fg0Var = cj0Var.q;
            byte[] bArr = fg0Var.a;
            if (bArr == null) {
                fg0Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ruVar = d(d, j2, fg0Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                be3Var.K(2);
                ruVar = d(ruVar, j3, be3Var.a, 2);
                j3 += 2;
                i = be3Var.H();
            }
            int[] iArr = fg0Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = fg0Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                be3Var.K(i3);
                ruVar = d(ruVar, j3, be3Var.a, i3);
                j3 += i3;
                be3Var.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = be3Var.H();
                    iArr2[i4] = be3Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cw1Var.a - ((int) (j3 - cw1Var.b));
            }
            vv4 vv4Var = (vv4) cw1Var.c;
            String str = f35.a;
            byte[] bArr2 = vv4Var.b;
            byte[] bArr3 = fg0Var.a;
            int i5 = vv4Var.a;
            int i6 = vv4Var.c;
            int i7 = vv4Var.d;
            fg0Var.f = i;
            fg0Var.d = iArr;
            fg0Var.e = iArr2;
            fg0Var.b = bArr2;
            fg0Var.a = bArr3;
            fg0Var.c = i5;
            fg0Var.g = i6;
            fg0Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = fg0Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            hd5 hd5Var = fg0Var.j;
            hd5Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) hd5Var.p;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) hd5Var.o).setPattern(pattern);
            long j4 = cw1Var.b;
            int i8 = (int) (j3 - j4);
            cw1Var.b = j4 + i8;
            cw1Var.a -= i8;
        }
        if (!cj0Var.d(268435456)) {
            cj0Var.t(cw1Var.a);
            return c(ruVar, cw1Var.b, cj0Var.r, cw1Var.a);
        }
        be3Var.K(4);
        ru d2 = d(ruVar, cw1Var.b, be3Var.a, 4);
        int E = be3Var.E();
        cw1Var.b += 4;
        cw1Var.a -= 4;
        cj0Var.t(E);
        ru c = c(d2, cw1Var.b, cj0Var.r, E);
        cw1Var.b += E;
        int i9 = cw1Var.a - E;
        cw1Var.a = i9;
        ByteBuffer byteBuffer = cj0Var.u;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            cj0Var.u = ByteBuffer.allocate(i9);
        } else {
            cj0Var.u.clear();
        }
        return c(c, cw1Var.b, cj0Var.u, cw1Var.a);
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
            m9 g = this.a.g();
            ru ruVar2 = new ru(this.b, this.f.o);
            ruVar.p = g;
            ruVar.q = ruVar2;
        }
        return Math.min(i, (int) (this.f.o - this.g));
    }
}
