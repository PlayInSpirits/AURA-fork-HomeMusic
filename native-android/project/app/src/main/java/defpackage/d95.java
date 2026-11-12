package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d95 implements k51 {
    public m51 a;
    public wv4 b;
    public b95 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = f35.a;
        int i2 = this.c;
        int iC = 4;
        if (i2 == 0) {
            rr2.w(l51Var.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                l51Var.l(i3);
                this.c = 4;
                return 0;
            }
            if (!uo.g(l51Var)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            l51Var.l((int) (l51Var.f() - l51Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i2 == 1) {
            be3 be3Var = new be3(8);
            dd2 dd2VarA = dd2.a(l51Var, be3Var);
            if (dd2VarA.a != 1685272116) {
                l51Var.k();
            } else {
                l51Var.g(8);
                be3Var.N(0);
                l51Var.n(be3Var.a, 0, 8);
                jP = be3Var.p();
                l51Var.l(((int) dd2VarA.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    tb4.a();
                    return 0;
                }
                rr2.w(this.g != -1);
                long position = this.g - l51Var.getPosition();
                b95 b95Var = this.e;
                b95Var.getClass();
                return b95Var.b(l51Var, position) ? -1 : 0;
            }
            l51Var.k();
            dd2 dd2VarT = uo.T(1684108385, l51Var, new be3(8));
            l51Var.l(8);
            Pair pairCreate = Pair.create(Long.valueOf(l51Var.getPosition()), Long.valueOf(dd2VarT.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = l51Var.getLength();
            if (length != -1 && this.g > length) {
                l93.q0("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b95 b95Var2 = this.e;
            b95Var2.getClass();
            b95Var2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        be3 be3Var2 = new be3(16);
        long j2 = uo.T(1718449184, l51Var, be3Var2).b;
        rr2.w(j2 >= 16);
        l51Var.n(be3Var2.a, 0, 16);
        be3Var2.N(0);
        int iT = be3Var2.t();
        int iT2 = be3Var2.t();
        int iS = be3Var2.s();
        be3Var2.s();
        int iT3 = be3Var2.t();
        int iT4 = be3Var2.t();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            l51Var.n(bArr, 0, i4);
            if (iT == 65534 && i4 == 24) {
                be3 be3Var3 = new be3(bArr);
                be3Var3.t();
                int iT5 = be3Var3.t();
                if (iT5 != 0 && iT5 != iT4) {
                    throw ParserException.c("validBits ( " + iT5 + ")  != bitsPerSample( " + iT4 + ") are not supported");
                }
                int iS2 = be3Var3.s();
                if ((iS2 >> 18) != 0) {
                    throw ParserException.c("invalid channel mask " + iS2);
                }
                if (iS2 != 0 && Integer.bitCount(iS2) != iT2) {
                    throw ParserException.c("invalid number of channels (" + Integer.bitCount(iS2) + ") in channel mask " + iS2);
                }
                iT = be3Var3.t();
                byte[] bArr2 = new byte[14];
                be3Var3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, uo.s) && !Arrays.equals(bArr2, uo.t)) {
                    throw ParserException.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = f35.b;
        }
        l51Var.l((int) (l51Var.f() - l51Var.getPosition()));
        uu uuVar = new uu();
        uuVar.n = iT2;
        uuVar.o = iS;
        uuVar.p = iT3;
        uuVar.q = iT4;
        uuVar.r = bArr;
        if (iT == 17) {
            this.e = new a95(this.a, this.b, uuVar);
        } else if (iT == 6) {
            this.e = new c95(this.a, this.b, uuVar, "audio/g711-alaw", -1);
        } else if (iT == 7) {
            this.e = new c95(this.a, this.b, uuVar, "audio/g711-mlaw", -1);
        } else {
            if (iT == 1) {
                iC = f35.C(iT4, ByteOrder.LITTLE_ENDIAN);
                i = iC;
            } else {
                if (iT != 3) {
                    if (iT == 65534) {
                        iC = f35.C(iT4, ByteOrder.LITTLE_ENDIAN);
                        i = iC;
                    }
                } else if (iT4 == 32) {
                    i = iC;
                }
                i = 0;
            }
            if (i == 0) {
                throw ParserException.c("Unsupported WAV format type: " + iT);
            }
            this.e = new c95(this.a, this.b, uuVar, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return uo.g(l51Var);
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b95 b95Var = this.e;
        if (b95Var != null) {
            b95Var.a(j2);
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.a = m51Var;
        this.b = m51Var.t(0, 1);
        m51Var.p();
    }
}
