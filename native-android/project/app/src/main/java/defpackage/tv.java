package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv implements fw, ew, Cloneable, ByteChannel {
    public t84 n;
    public long o;

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew A(yw ywVar) {
        X(ywVar);
        return this;
    }

    @Override // defpackage.fw
    public final String B(Charset charset) {
        charset.getClass();
        return K(this.o, charset);
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew C(long j) {
        a0(j);
        return this;
    }

    @Override // defpackage.fw
    public final yw E() {
        return g(this.o);
    }

    public final byte[] F(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            kf2.e(b11.k("byteCount: ", j));
            return null;
        }
        if (this.o < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // defpackage.fw
    public final boolean G(long j) {
        return this.o >= j;
    }

    public final long H() {
        long j;
        byte b;
        long j2 = 0;
        if (this.o == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            t84 t84Var = this.n;
            t84Var.getClass();
            byte[] bArr = t84Var.a;
            int i2 = t84Var.b;
            int i3 = t84Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.n = t84Var.a();
                a94.a(t84Var);
            } else {
                t84Var.b = i2;
            }
            if (z2 || this.n == null) {
                long j5 = this.o - ((long) i);
                this.o = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbS = b11.s(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbS.append(zz1.K(q(j)));
                throw new NumberFormatException(sbS.toString());
            }
            j2 = j;
        }
        tv tvVar = new tv();
        tvVar.Z(j3);
        tvVar.Y(b);
        if (!z) {
            tvVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(tvVar.M()));
    }

    @Override // defpackage.fw
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    public final short J() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final String K(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            kf2.e(b11.k("byteCount: ", j));
            return null;
        }
        if (this.o < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        int i = t84Var.b;
        if (((long) i) + j > t84Var.c) {
            return new String(F(j), charset);
        }
        int i2 = (int) j;
        String str = new String(t84Var.a, i, i2, charset);
        int i3 = t84Var.b + i2;
        t84Var.b = i3;
        this.o -= j;
        if (i3 == t84Var.c) {
            this.n = t84Var.a();
            a94.a(t84Var);
        }
        return str;
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) {
        t84 t84VarB;
        tvVar.getClass();
        if (tvVar == this) {
            kf2.n("source == this");
            return;
        }
        zz1.i(tvVar.o, 0L, j);
        while (j > 0) {
            t84 t84Var = tvVar.n;
            t84Var.getClass();
            int i = t84Var.c;
            t84 t84Var2 = tvVar.n;
            t84Var2.getClass();
            long j2 = i - t84Var2.b;
            int i2 = 0;
            if (j < j2) {
                t84 t84Var3 = this.n;
                t84 t84Var4 = t84Var3 != null ? t84Var3.g : null;
                if (t84Var4 != null && t84Var4.e) {
                    if ((((long) t84Var4.c) + j) - ((long) (t84Var4.d ? 0 : t84Var4.b)) <= 8192) {
                        t84 t84Var5 = tvVar.n;
                        t84Var5.getClass();
                        t84Var5.d(t84Var4, (int) j);
                        tvVar.o -= j;
                        this.o += j;
                        return;
                    }
                }
                t84 t84Var6 = tvVar.n;
                t84Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > t84Var6.c - t84Var6.b) {
                    kf2.n("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    t84VarB = t84Var6.c();
                } else {
                    t84VarB = a94.b();
                    byte[] bArr = t84Var6.a;
                    byte[] bArr2 = t84VarB.a;
                    int i4 = t84Var6.b;
                    ti.X(0, i4, i4 + i3, bArr, bArr2);
                }
                t84VarB.c = t84VarB.b + i3;
                t84Var6.b += i3;
                t84 t84Var7 = t84Var6.g;
                t84Var7.getClass();
                t84Var7.b(t84VarB);
                tvVar.n = t84VarB;
            }
            t84 t84Var8 = tvVar.n;
            t84Var8.getClass();
            long j3 = t84Var8.c - t84Var8.b;
            tvVar.n = t84Var8.a();
            t84 t84Var9 = this.n;
            if (t84Var9 == null) {
                this.n = t84Var8;
                t84Var8.g = t84Var8;
                t84Var8.f = t84Var8;
            } else {
                t84 t84Var10 = t84Var9.g;
                t84Var10.getClass();
                t84Var10.b(t84Var8);
                t84 t84Var11 = t84Var8.g;
                if (t84Var11 == t84Var8) {
                    kf2.o("cannot compact");
                    return;
                }
                t84Var11.getClass();
                if (t84Var11.e) {
                    int i5 = t84Var8.c - t84Var8.b;
                    t84 t84Var12 = t84Var8.g;
                    t84Var12.getClass();
                    int i6 = 8192 - t84Var12.c;
                    t84 t84Var13 = t84Var8.g;
                    t84Var13.getClass();
                    if (!t84Var13.d) {
                        t84 t84Var14 = t84Var8.g;
                        t84Var14.getClass();
                        i2 = t84Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        t84 t84Var15 = t84Var8.g;
                        t84Var15.getClass();
                        t84Var8.d(t84Var15, i5);
                        t84Var8.a();
                        a94.a(t84Var8);
                    }
                }
            }
            tvVar.o -= j3;
            this.o += j3;
            j -= j3;
        }
    }

    public final String M() {
        return K(this.o, w10.a);
    }

    @Override // defpackage.fw
    public final long N(tv tvVar) {
        long j = this.o;
        if (j > 0) {
            tvVar.L(this, j);
        }
        return j;
    }

    @Override // defpackage.fw
    public final void P(long j) throws EOFException {
        if (this.o < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew Q(long j) {
        Z(j);
        return this;
    }

    public final int R() {
        int i;
        int i2;
        int i3;
        if (this.o == 0) {
            throw new EOFException();
        }
        byte bQ = q(0L);
        if ((bQ & 128) == 0) {
            i = bQ & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bQ & 224) == 192) {
            i = bQ & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bQ & 240) == 224) {
            i = bQ & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bQ & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bQ & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.o < j) {
            StringBuilder sbJ = f34.j(i2, "size < ", ": ");
            sbJ.append(this.o);
            sbJ.append(" (to read code point prefixed 0x");
            sbJ.append(zz1.K(bQ));
            sbJ.append(')');
            throw new EOFException(sbJ.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bQ2 = q(j2);
            if ((bQ2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bQ2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.fw
    public final long S() throws EOFException {
        int i;
        if (this.o == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            t84 t84Var = this.n;
            t84Var.getClass();
            byte[] bArr = t84Var.a;
            int i3 = t84Var.b;
            int i4 = t84Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(zz1.K(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    tv tvVar = new tv();
                    tvVar.a0(j);
                    tvVar.Y(b);
                    throw new NumberFormatException("Number too large: ".concat(tvVar.M()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.n = t84Var.a();
                a94.a(t84Var);
            } else {
                t84Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.n != null);
        this.o -= (long) i2;
        return j;
    }

    public final yw T(int i) {
        if (i == 0) {
            return yw.q;
        }
        zz1.i(this.o, 0L, i);
        t84 t84Var = this.n;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            t84Var.getClass();
            int i5 = t84Var.c;
            int i6 = t84Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            t84Var = t84Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        t84 t84Var2 = this.n;
        int i7 = 0;
        while (i2 < i) {
            t84Var2.getClass();
            bArr[i7] = t84Var2.a;
            i2 += t84Var2.c - t84Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = t84Var2.b;
            t84Var2.d = true;
            i7++;
            t84Var2 = t84Var2.f;
        }
        return new b94(bArr, iArr);
    }

    @Override // defpackage.fw
    public final InputStream V() {
        return new rv(this, 0);
    }

    public final t84 W(int i) {
        if (i < 1 || i > 8192) {
            kf2.n("unexpected capacity");
            return null;
        }
        t84 t84Var = this.n;
        if (t84Var == null) {
            t84 t84VarB = a94.b();
            this.n = t84VarB;
            t84VarB.g = t84VarB;
            t84VarB.f = t84VarB;
            return t84VarB;
        }
        t84 t84Var2 = t84Var.g;
        t84Var2.getClass();
        if (t84Var2.c + i <= 8192 && t84Var2.e) {
            return t84Var2;
        }
        t84 t84VarB2 = a94.b();
        t84Var2.b(t84VarB2);
        return t84VarB2;
    }

    public final void X(yw ywVar) {
        ywVar.getClass();
        ywVar.r(this, ywVar.d());
    }

    public final void Y(int i) {
        t84 t84VarW = W(1);
        byte[] bArr = t84VarW.a;
        int i2 = t84VarW.c;
        t84VarW.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.o++;
    }

    public final void Z(long j) {
        boolean z;
        if (j == 0) {
            Y(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                d0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        t84 t84VarW = W(i);
        byte[] bArr = t84VarW.a;
        int i2 = t84VarW.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = e.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        t84VarW.c += i;
        this.o += (long) i;
    }

    @Override // defpackage.fw, defpackage.ew
    public final tv a() {
        return this;
    }

    public final void a0(long j) {
        if (j == 0) {
            Y(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        t84 t84VarW = W(i);
        byte[] bArr = t84VarW.a;
        int i2 = t84VarW.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = e.a[(int) (15 & j)];
            j >>>= 4;
        }
        t84VarW.c += i;
        this.o += (long) i;
    }

    public final void b() {
        skip(this.o);
    }

    public final void b0(int i) {
        t84 t84VarW = W(4);
        byte[] bArr = t84VarW.a;
        int i2 = t84VarW.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        t84VarW.c = i2 + 4;
        this.o += 4;
    }

    public final void c0(int i) {
        t84 t84VarW = W(2);
        byte[] bArr = t84VarW.a;
        int i2 = t84VarW.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        t84VarW.c = i2 + 2;
        this.o += 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.of4
    public final void close() {
    }

    public final void d0(String str) {
        str.getClass();
        e0(str, 0, str.length());
    }

    public final void e0(String str, int i, int i2) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            kf2.e(f34.f(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            kf2.e(xa3.e(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbJ = f34.j(i2, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                t84 t84VarW = W(1);
                byte[] bArr = t84VarW.a;
                int i3 = t84VarW.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = t84VarW.c;
                int i6 = (i3 + i) - i5;
                t84VarW.c = i5 + i6;
                this.o += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    t84 t84VarW2 = W(2);
                    byte[] bArr2 = t84VarW2.a;
                    int i7 = t84VarW2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    t84VarW2.c = i7 + 2;
                    this.o += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    t84 t84VarW3 = W(3);
                    byte[] bArr3 = t84VarW3.a;
                    int i8 = t84VarW3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    t84VarW3.c = i8 + 3;
                    this.o += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Y(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        t84 t84VarW4 = W(4);
                        byte[] bArr4 = t84VarW4.a;
                        int i11 = t84VarW4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        t84VarW4.c = i11 + 4;
                        this.o += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv)) {
            return false;
        }
        long j = this.o;
        tv tvVar = (tv) obj;
        if (j != tvVar.o) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        t84 t84Var2 = tvVar.n;
        t84Var2.getClass();
        int i = t84Var.b;
        int i2 = t84Var2.b;
        long j2 = 0;
        while (j2 < this.o) {
            long jMin = Math.min(t84Var.c - i, t84Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (t84Var.a[i] != t84Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == t84Var.c) {
                t84Var = t84Var.f;
                t84Var.getClass();
                i = t84Var.b;
            }
            if (i2 == t84Var2.c) {
                t84Var2 = t84Var2.f;
                t84Var2.getClass();
                i2 = t84Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final tv clone() {
        tv tvVar = new tv();
        if (this.o == 0) {
            return tvVar;
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        t84 t84VarC = t84Var.c();
        tvVar.n = t84VarC;
        t84VarC.g = t84VarC;
        t84VarC.f = t84VarC;
        for (t84 t84Var2 = t84Var.f; t84Var2 != t84Var; t84Var2 = t84Var2.f) {
            t84 t84Var3 = t84VarC.g;
            t84Var3.getClass();
            t84Var2.getClass();
            t84Var3.b(t84Var2.c());
        }
        tvVar.o = this.o;
        return tvVar;
    }

    public final void f0(int i) {
        if (i < 128) {
            Y(i);
            return;
        }
        if (i < 2048) {
            t84 t84VarW = W(2);
            byte[] bArr = t84VarW.a;
            int i2 = t84VarW.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            t84VarW.c = i2 + 2;
            this.o += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Y(63);
            return;
        }
        if (i < 65536) {
            t84 t84VarW2 = W(3);
            byte[] bArr2 = t84VarW2.a;
            int i3 = t84VarW2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            t84VarW2.c = i3 + 3;
            this.o += 3;
            return;
        }
        if (i > 1114111) {
            kf2.n("Unexpected code point: 0x".concat(zz1.L(i)));
            return;
        }
        t84 t84VarW3 = W(4);
        byte[] bArr3 = t84VarW3.a;
        int i4 = t84VarW3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        t84VarW3.c = i4 + 4;
        this.o += 4;
    }

    @Override // defpackage.ew, defpackage.of4, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fw
    public final yw g(long j) {
        if (j < 0 || j > 2147483647L) {
            kf2.e(b11.k("byteCount: ", j));
            return null;
        }
        if (this.o < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new yw(F(j));
        }
        yw ywVarT = T((int) j);
        skip(j);
        return ywVarT;
    }

    public final int hashCode() {
        t84 t84Var = this.n;
        if (t84Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = t84Var.c;
            for (int i3 = t84Var.b; i3 < i2; i3++) {
                i = (i * 31) + t84Var.a[i3];
            }
            t84Var = t84Var.f;
            t84Var.getClass();
        } while (t84Var != this.n);
        return i;
    }

    @Override // defpackage.fw
    public final byte[] i() {
        return F(this.o);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j = this.o;
        if (j == 0) {
            return 0L;
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        t84 t84Var2 = t84Var.g;
        t84Var2.getClass();
        int i = t84Var2.c;
        return (i >= 8192 || !t84Var2.e) ? j : j - ((long) (i - t84Var2.b));
    }

    @Override // defpackage.fw
    public final boolean l() {
        return this.o == 0;
    }

    @Override // defpackage.fw
    public final int m(cb3 cb3Var) {
        cb3Var.getClass();
        int iB = e.b(this, cb3Var, false);
        if (iB == -1) {
            return -1;
        }
        skip(cb3Var.n[iB].d());
        return iB;
    }

    public final void n(tv tvVar, long j, long j2) {
        tvVar.getClass();
        long j3 = j;
        zz1.i(this.o, j3, j2);
        if (j2 == 0) {
            return;
        }
        tvVar.o += j2;
        t84 t84Var = this.n;
        while (true) {
            t84Var.getClass();
            long j4 = t84Var.c - t84Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            t84Var = t84Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            t84Var.getClass();
            t84 t84VarC = t84Var.c();
            int i = t84VarC.b + ((int) j3);
            t84VarC.b = i;
            t84VarC.c = Math.min(i + ((int) j5), t84VarC.c);
            t84 t84Var2 = tvVar.n;
            if (t84Var2 == null) {
                t84VarC.g = t84VarC;
                t84VarC.f = t84VarC;
                tvVar.n = t84VarC;
            } else {
                t84 t84Var3 = t84Var2.g;
                t84Var3.getClass();
                t84Var3.b(t84VarC);
            }
            j5 -= (long) (t84VarC.c - t84VarC.b);
            t84Var = t84Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.fw
    public final String o() {
        long jS = s((byte) 10, 0L, Long.MAX_VALUE);
        if (jS != -1) {
            return e.a(this, jS);
        }
        long j = this.o;
        if (j != 0) {
            return K(j, w10.a);
        }
        return null;
    }

    @Override // defpackage.ew
    public final long p(ej4 ej4Var) {
        ej4Var.getClass();
        long j = 0;
        while (true) {
            long j2 = ej4Var.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public final byte q(long j) {
        zz1.i(this.o, j, 1L);
        t84 t84Var = this.n;
        t84Var.getClass();
        long j2 = this.o;
        if (j2 - j < j) {
            while (j2 > j) {
                t84Var = t84Var.g;
                t84Var.getClass();
                j2 -= (long) (t84Var.c - t84Var.b);
            }
            return t84Var.a[(int) ((((long) t84Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = t84Var.c;
            int i2 = t84Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return t84Var.a[(int) ((((long) i2) + j) - j3)];
            }
            t84Var = t84Var.f;
            t84Var.getClass();
            j3 = j4;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        zz1.i(bArr.length, i, i2);
        t84 t84Var = this.n;
        if (t84Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, t84Var.c - t84Var.b);
        byte[] bArr2 = t84Var.a;
        int i3 = t84Var.b;
        ti.X(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = t84Var.b + iMin;
        t84Var.b = i4;
        this.o -= (long) iMin;
        if (i4 == t84Var.c) {
            this.n = t84Var.a();
            a94.a(t84Var);
        }
        return iMin;
    }

    @Override // defpackage.fw
    public final byte readByte() {
        if (this.o == 0) {
            throw new EOFException();
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        int i = t84Var.b;
        int i2 = t84Var.c;
        int i3 = i + 1;
        byte b = t84Var.a[i];
        this.o--;
        if (i3 != i2) {
            t84Var.b = i3;
            return b;
        }
        this.n = t84Var.a();
        a94.a(t84Var);
        return b;
    }

    @Override // defpackage.fw
    public final int readInt() throws EOFException {
        if (this.o < 4) {
            throw new EOFException();
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        int i = t84Var.b;
        int i2 = t84Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = t84Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.o -= 4;
        if (i5 != i2) {
            t84Var.b = i5;
            return i6;
        }
        this.n = t84Var.a();
        a94.a(t84Var);
        return i6;
    }

    @Override // defpackage.fw
    public final short readShort() throws EOFException {
        if (this.o < 2) {
            throw new EOFException();
        }
        t84 t84Var = this.n;
        t84Var.getClass();
        int i = t84Var.b;
        int i2 = t84Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = t84Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.o -= 2;
        if (i5 == i2) {
            this.n = t84Var.a();
            a94.a(t84Var);
        } else {
            t84Var.b = i5;
        }
        return (short) i6;
    }

    public final long s(byte b, long j, long j2) {
        t84 t84Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.o + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.o;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (t84Var = this.n) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                t84Var = t84Var.g;
                t84Var.getClass();
                j4 -= (long) (t84Var.c - t84Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = t84Var.a;
                int iMin = (int) Math.min(t84Var.c, (((long) t84Var.b) + j2) - j4);
                for (int i = (int) ((((long) t84Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - t84Var.b)) + j4;
                    }
                }
                j4 += (long) (t84Var.c - t84Var.b);
                t84Var = t84Var.f;
                t84Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (t84Var.c - t84Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            t84Var = t84Var.f;
            t84Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = t84Var.a;
            int iMin2 = (int) Math.min(t84Var.c, (((long) t84Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) t84Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - t84Var.b)) + j3;
                }
            }
            j3 += (long) (t84Var.c - t84Var.b);
            t84Var = t84Var.f;
            t84Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // defpackage.fw
    public final void skip(long j) {
        while (j > 0) {
            t84 t84Var = this.n;
            if (t84Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, t84Var.c - t84Var.b);
            long j2 = iMin;
            this.o -= j2;
            j -= j2;
            int i = t84Var.b + iMin;
            t84Var.b = i;
            if (i == t84Var.c) {
                this.n = t84Var.a();
                a94.a(t84Var);
            }
        }
    }

    @Override // defpackage.fw
    public final String t(long j) throws EOFException {
        if (j < 0) {
            kf2.e(b11.k("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jS = s((byte) 10, 0L, j2);
        if (jS != -1) {
            return e.a(this, jS);
        }
        if (j2 < this.o && q(j2 - 1) == 13 && q(j2) == 10) {
            return e.a(this, j2);
        }
        tv tvVar = new tv();
        n(tvVar, 0L, Math.min(32L, this.o));
        throw new EOFException("\\n not found: limit=" + Math.min(this.o, j) + " content=" + tvVar.g(tvVar.o).e() + (char) 8230);
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return fu4.d;
    }

    public final String toString() {
        long j = this.o;
        if (j <= 2147483647L) {
            return T((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.o).toString());
    }

    public final long u(yw ywVar) {
        int i;
        int i2;
        ywVar.getClass();
        t84 t84Var = this.n;
        if (t84Var == null) {
            return -1L;
        }
        long j = this.o;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                t84Var = t84Var.g;
                t84Var.getClass();
                j -= (long) (t84Var.c - t84Var.b);
            }
            if (ywVar.d() == 2) {
                byte bI = ywVar.i(0);
                byte bI2 = ywVar.i(1);
                while (j < this.o) {
                    byte[] bArr = t84Var.a;
                    i = (int) ((((long) t84Var.b) + j2) - j);
                    int i3 = t84Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (t84Var.c - t84Var.b)) + j;
                            t84Var = t84Var.f;
                            t84Var.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bI || b == bI2) {
                                i2 = t84Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrH = ywVar.h();
            while (j < this.o) {
                byte[] bArr2 = t84Var.a;
                i = (int) ((((long) t84Var.b) + j2) - j);
                int i4 = t84Var.c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrH.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrH[i5]) {
                                i2 = t84Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (t84Var.c - t84Var.b)) + j;
                        t84Var = t84Var.f;
                        t84Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (t84Var.c - t84Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            t84Var = t84Var.f;
            t84Var.getClass();
            j = j3;
        }
        if (ywVar.d() == 2) {
            byte bI3 = ywVar.i(0);
            byte bI4 = ywVar.i(1);
            while (j < this.o) {
                byte[] bArr3 = t84Var.a;
                i = (int) ((((long) t84Var.b) + j2) - j);
                int i6 = t84Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (t84Var.c - t84Var.b)) + j;
                        t84Var = t84Var.f;
                        t84Var.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bI3 || b3 == bI4) {
                            i2 = t84Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrH2 = ywVar.h();
        while (j < this.o) {
            byte[] bArr4 = t84Var.a;
            i = (int) ((((long) t84Var.b) + j2) - j);
            int i7 = t84Var.c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrH2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrH2[i8]) {
                            i2 = t84Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (t84Var.c - t84Var.b)) + j;
                    t84Var = t84Var.f;
                    t84Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    public final boolean v(yw ywVar) {
        ywVar.getClass();
        int iD = ywVar.d();
        if (iD >= 0 && this.o >= iD && ywVar.d() >= iD) {
            for (int i = 0; i < iD; i++) {
                if (q(i) == ywVar.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m78write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        zz1.i(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            t84 t84VarW = W(1);
            int iMin = Math.min(i3 - i, 8192 - t84VarW.c);
            int i4 = i + iMin;
            ti.X(t84VarW.c, i, i4, bArr, t84VarW.a);
            t84VarW.c += iMin;
            i = i4;
        }
        this.o += j;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeByte(int i) {
        Y(i);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeInt(int i) {
        b0(i);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeShort(int i) {
        c0(i);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew y(String str) {
        d0(str);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew write(byte[] bArr, int i, int i2) {
        m78write(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            t84 t84VarW = W(1);
            int iMin = Math.min(i, 8192 - t84VarW.c);
            byteBuffer.get(t84VarW.a, t84VarW.c, iMin);
            i -= iMin;
            t84VarW.c += iMin;
        }
        this.o += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        t84 t84Var = this.n;
        if (t84Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), t84Var.c - t84Var.b);
        byteBuffer.put(t84Var.a, t84Var.b, iMin);
        int i = t84Var.b + iMin;
        t84Var.b = i;
        this.o -= (long) iMin;
        if (i == t84Var.c) {
            this.n = t84Var.a();
            a94.a(t84Var);
        }
        return iMin;
    }

    @Override // defpackage.ew
    public final ew write(byte[] bArr) {
        bArr.getClass();
        m78write(bArr, 0, bArr.length);
        return this;
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) {
        tvVar.getClass();
        if (j >= 0) {
            long j2 = this.o;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            tvVar.L(this, j);
            return j;
        }
        kf2.e(b11.k("byteCount < 0: ", j));
        return 0L;
    }
}
