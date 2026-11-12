package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo extends i90 {
    public static final /* synthetic */ int J = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public char H;
    public lo I;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final cx s;
    public int t;
    public qs u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public mo(ByteArrayInputStream byteArrayInputStream) throws IOException {
        cx cxVar = new cx();
        cxVar.a = -1;
        this.s = cxVar;
        this.v = 1;
        this.u = new qs(byteArrayInputStream == System.in ? new f40(byteArrayInputStream) : byteArrayInputStream, ByteOrder.BIG_ENDIAN);
        qs qsVar = this.u;
        if (qsVar != null) {
            int iB = (int) qsVar.b(8);
            int iB2 = (int) this.u.b(8);
            int iB3 = (int) this.u.b(8);
            if (iB != 66 || iB2 != 90 || iB3 != 104) {
                throw new IOException("Stream is not in the BZip2 format");
            }
            int iB4 = (int) this.u.b(8);
            if (iB4 < 49 || iB4 > 57) {
                mj0.i("BZip2 block size is invalid");
            } else {
                this.q = iB4 - 48;
                this.y = 0;
            }
        } else {
            mj0.i("No InputStream");
        }
        q();
    }

    public static int f(qs qsVar, int i) throws IOException {
        long jB = qsVar.b(i);
        if (jB >= 0) {
            return (int) jB;
        }
        mj0.i("Unexpected end of stream");
        return 0;
    }

    public static void j(String str, int i, int i2) throws IOException {
        if (i < 0) {
            mj0.i(xa3.h("Corrupted input, ", str, " value negative"));
        } else {
            if (i < i2) {
                return;
            }
            mj0.i(xa3.h("Corrupted input, ", str, " value too big"));
        }
    }

    public final int F() {
        if (this.D >= this.H) {
            this.C++;
            this.z = 0;
            return v();
        }
        int i = this.A;
        this.s.j(i);
        this.D++;
        this.v = 7;
        return i;
    }

    public final int H() throws IOException {
        if (this.C > this.o) {
            n();
            q();
            return u();
        }
        this.B = this.A;
        lo loVar = this.I;
        byte[] bArr = (byte[]) loVar.f;
        int i = this.G;
        int i2 = bArr[i] & 255;
        j("su_tPos", i, ((int[]) loVar.j).length);
        this.G = ((int[]) this.I.j)[this.G];
        int i3 = this.E;
        if (i3 == 0) {
            int i4 = this.F;
            this.E = j51.g[i4] - 1;
            int i5 = i4 + 1;
            this.F = i5;
            if (i5 == 512) {
                this.F = 0;
            }
        } else {
            this.E = i3 - 1;
        }
        int i6 = i2 ^ (this.E == 1 ? 1 : 0);
        this.A = i6;
        this.C++;
        this.v = 3;
        this.s.j(i6);
        return i6;
    }

    public final int J() {
        if (this.D < this.H) {
            this.s.j(this.A);
            this.D++;
            return this.A;
        }
        this.v = 2;
        this.C++;
        this.z = 0;
        return H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qs qsVar = this.u;
        if (qsVar != null) {
            try {
                qsVar.close();
            } finally {
                this.I = null;
                this.u = null;
            }
        }
    }

    public final void n() throws IOException {
        int i = ~this.s.a;
        int i2 = this.w;
        if (i2 == i) {
            int i3 = this.y;
            this.y = i ^ ((i3 >>> 31) | (i3 << 1));
        } else {
            int i4 = this.x;
            this.y = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            mj0.i("BZip2 CRC error");
        }
    }

    public final void q() throws IOException {
        char c;
        int i;
        qs qsVar = this.u;
        char cF = (char) f(qsVar, 8);
        char cF2 = (char) f(qsVar, 8);
        char cF3 = (char) f(qsVar, 8);
        char cF4 = (char) f(qsVar, 8);
        char cF5 = (char) f(qsVar, 8);
        char cF6 = (char) f(qsVar, 8);
        char c2 = 0;
        if (cF == 23 && cF2 == 'r' && cF3 == 'E' && cF4 == '8' && cF5 == 'P' && cF6 == 144) {
            int iF = f(this.u, 32);
            this.x = iF;
            this.v = 0;
            this.I = null;
            if (iF == this.y) {
                return;
            }
            mj0.i("BZip2 CRC error");
            return;
        }
        if (cF != '1' || cF2 != 'A' || cF3 != 'Y' || cF4 != '&' || cF5 != 'S' || cF6 != 'Y') {
            this.v = 0;
            mj0.i("Bad block header");
            return;
        }
        this.w = f(qsVar, 32);
        int i2 = 1;
        this.r = f(qsVar, 1) == 1;
        if (this.I == null) {
            this.I = new lo(this.q);
        }
        qs qsVar2 = this.u;
        this.p = f(qsVar2, 24);
        qs qsVar3 = this.u;
        lo loVar = this.I;
        boolean[] zArr = (boolean[]) loVar.a;
        byte[] bArr = (byte[]) loVar.e;
        byte[] bArr2 = (byte[]) loVar.c;
        byte[] bArr3 = (byte[]) loVar.d;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (f(qsVar3, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (f(qsVar3, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        lo loVar2 = this.I;
        boolean[] zArr2 = (boolean[]) loVar2.a;
        byte[] bArr4 = (byte[]) loVar2.b;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 256) {
            if (zArr2[i8]) {
                bArr4[i9] = (byte) i8;
                i9++;
            }
            i8++;
            c2 = c2;
        }
        char c3 = c2;
        this.t = i9;
        int i10 = i9 + 2;
        int iF2 = f(qsVar3, 3);
        int iF3 = f(qsVar3, 15);
        if (iF3 < 0) {
            mj0.i("Corrupted input, nSelectors value negative");
            return;
        }
        j("alphaSize", i10, 259);
        j("nGroups", iF2, 7);
        for (int i11 = c3; i11 < iF3; i11++) {
            int i12 = c3;
            while (f(qsVar3, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        if (iF3 > 18002) {
            iF3 = 18002;
        }
        int i13 = iF2;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            } else {
                bArr[i13] = (byte) i13;
            }
        }
        for (int i14 = c3; i14 < iF3; i14++) {
            int i15 = bArr3[i14] & 255;
            j("selectorMtf", i15, 6);
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c3] = b;
            bArr2[i14] = b;
        }
        char[][] cArr = (char[][]) loVar.o;
        for (int i16 = c3; i16 < iF2; i16++) {
            int iF4 = f(qsVar3, 5);
            char[] cArr2 = cArr[i16];
            for (int i17 = c3; i17 < i10; i17++) {
                while (f(qsVar3, 1) != 0) {
                    iF4 += f(qsVar3, 1) != 0 ? -1 : 1;
                }
                cArr2[i17] = (char) iF4;
            }
        }
        lo loVar3 = this.I;
        char[][] cArr3 = (char[][]) loVar3.o;
        int[] iArr = (int[]) loVar3.h;
        int[][] iArr2 = (int[][]) loVar3.k;
        int[][] iArr3 = (int[][]) loVar3.l;
        int[][] iArr4 = (int[][]) loVar3.m;
        int i18 = c3;
        while (i18 < iF2) {
            char[] cArr4 = cArr3[i18];
            int i19 = i2;
            int i20 = i10;
            char c4 = c3;
            char c5 = ' ';
            while (true) {
                i20--;
                if (i20 < 0) {
                    break;
                }
                char c6 = cArr4[i20];
                if (c6 > c4) {
                    c4 = c6;
                }
                if (c6 < c5) {
                    c5 = c6;
                }
            }
            int[] iArr5 = iArr2[i18];
            int[] iArr6 = iArr3[i18];
            int[] iArr7 = iArr4[i18];
            char[] cArr5 = cArr3[i18];
            int i21 = c3;
            for (int i22 = c5; i22 <= c4; i22++) {
                int i23 = c3;
                while (i23 < i10) {
                    char c7 = c5;
                    if (cArr5[i23] == i22) {
                        iArr7[i21] = i23;
                        i21++;
                    }
                    i23++;
                    c5 = c7;
                }
            }
            char c8 = c5;
            int i24 = 23;
            while (true) {
                i24--;
                if (i24 <= 0) {
                    break;
                }
                iArr6[i24] = c3;
                iArr5[i24] = c3;
            }
            for (int i25 = c3; i25 < i10; i25++) {
                char c9 = cArr5[i25];
                j("length", c9, 258);
                int i26 = c9 + 1;
                iArr6[i26] = iArr6[i26] + 1;
            }
            int i27 = iArr6[c3];
            for (int i28 = i19; i28 < 23; i28++) {
                i27 += iArr6[i28];
                iArr6[i28] = i27;
            }
            int i29 = iArr6[c8];
            int i30 = c3;
            int i31 = c8;
            while (i31 <= c4) {
                int i32 = i31 + 1;
                int i33 = iArr6[i32];
                int i34 = (i33 - i29) + i30;
                iArr5[i31] = i34 - 1;
                i30 = i34 << 1;
                i31 = i32;
                i29 = i33;
            }
            for (int i35 = c8 + 1; i35 <= c4; i35++) {
                iArr6[i35] = ((iArr5[i35 - 1] + 1) << 1) - iArr6[i35];
            }
            iArr[i18] = c8;
            i18++;
            i2 = i19;
        }
        int i36 = i2;
        lo loVar4 = this.I;
        byte[] bArr5 = (byte[]) loVar4.f;
        int[] iArr8 = (int[]) loVar4.g;
        byte[] bArr6 = (byte[]) loVar4.c;
        byte[] bArr7 = (byte[]) loVar4.b;
        char[] cArr6 = (char[]) loVar4.n;
        int[] iArr9 = (int[]) loVar4.h;
        int[][] iArr10 = (int[][]) loVar4.k;
        int[][] iArr11 = (int[][]) loVar4.l;
        int[][] iArr12 = (int[][]) loVar4.m;
        int i37 = this.q * 100000;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr6[i38] = (char) i38;
            iArr8[i38] = c3;
        }
        int i39 = this.t + 1;
        lo loVar5 = this.I;
        int i40 = ((byte[]) loVar5.c)[c3] & 255;
        j("zt", i40, 6);
        int[] iArr13 = ((int[][]) loVar5.k)[i40];
        int i41 = ((int[]) loVar5.h)[i40];
        j("zn", i41, 258);
        int iF5 = f(this.u, i41);
        int i42 = i41;
        while (iF5 > iArr13[i42]) {
            int i43 = i42 + 1;
            j("zn", i43, 258);
            i42 = i43;
            iF5 = (iF5 << 1) | f(this.u, i36);
            i36 = 1;
        }
        int i44 = iF5 - ((int[][]) loVar5.l)[i40][i42];
        j("zvec", i44, 258);
        int i45 = ((int[][]) loVar5.m)[i40][i44];
        int i46 = bArr6[c3] & 255;
        j("zt", i46, 6);
        int[] iArr14 = iArr11[i46];
        int[] iArr15 = iArr10[i46];
        int[] iArr16 = iArr12[i46];
        int i47 = iArr9[i46];
        int i48 = -1;
        int[] iArr17 = iArr16;
        int i49 = 49;
        int i50 = c3;
        while (i45 != i39) {
            iArr9 = iArr9;
            iArr10 = iArr10;
            iArr11 = iArr11;
            i39 = i39;
            if (i45 == 0 || i45 == 1) {
                int[] iArr18 = iArr14;
                int i51 = -1;
                int i52 = 1;
                while (true) {
                    if (i45 == 0) {
                        i51 += i52;
                    } else if (i45 != 1) {
                        break;
                    } else {
                        i51 += i52 << 1;
                    }
                    if (i49 == 0) {
                        int i53 = i50 + 1;
                        j("groupNo", i53, 18002);
                        int i54 = bArr6[i53] & 255;
                        j("zt", i54, 6);
                        iArr18 = iArr11[i54];
                        int[] iArr19 = iArr10[i54];
                        iArr17 = iArr12[i54];
                        i47 = iArr9[i54];
                        i50 = i53;
                        iArr15 = iArr19;
                        i49 = 49;
                    } else {
                        i49--;
                    }
                    int i55 = i47;
                    j("zn", i55, 258);
                    i47 = i55;
                    int iF6 = f(qsVar2, i55);
                    int i56 = i47;
                    while (iF6 > iArr15[i56]) {
                        int i57 = i56 + 1;
                        j("zn", i57, 258);
                        iF6 = (iF6 << 1) | f(qsVar2, 1);
                        i56 = i57;
                        cArr6 = cArr6;
                    }
                    int i58 = iF6 - iArr18[i56];
                    j("zvec", i58, 258);
                    i45 = iArr17[i58];
                    i52 <<= 1;
                    cArr6 = cArr6;
                }
                char[] cArr7 = cArr6;
                char c10 = cArr7[0];
                j("yy", c10, 256);
                byte b2 = bArr7[c10];
                int i59 = b2 & 255;
                iArr8[i59] = i51 + 1 + iArr8[i59];
                int i60 = i48 + 1;
                int i61 = i60 + i51;
                Arrays.fill(bArr5, i60, i61 + 1, b2);
                if (i61 >= i37) {
                    mj0.i(xa3.e(i61, i37, "Block overrun while expanding RLE in MTF, ", " exceeds "));
                    return;
                } else {
                    i48 = i61;
                    iArr14 = iArr18;
                    cArr6 = cArr7;
                }
            } else {
                i48++;
                if (i48 >= i37) {
                    mj0.i(xa3.e(i48, i37, "Block overrun in MTF, ", " exceeds "));
                    return;
                }
                j("nextSym", i45, 257);
                int i62 = i45 - 1;
                char c11 = cArr6[i62];
                int[] iArr20 = iArr14;
                j("yy", c11, 256);
                byte b3 = bArr7[c11];
                int i63 = b3 & 255;
                iArr8[i63] = iArr8[i63] + 1;
                bArr5[i48] = b3;
                if (i45 <= 16) {
                    while (i62 > 0) {
                        int i64 = i62 - 1;
                        cArr6[i62] = cArr6[i64];
                        i62 = i64;
                    }
                    c = c3;
                } else {
                    c = c3;
                    System.arraycopy(cArr6, c, cArr6, 1, i62);
                }
                cArr6[c] = c11;
                if (i49 == 0) {
                    int i65 = i50 + 1;
                    j("groupNo", i65, 18002);
                    int i66 = bArr6[i65] & 255;
                    j("zt", i66, 6);
                    int[] iArr21 = iArr11[i66];
                    int[] iArr22 = iArr10[i66];
                    int[] iArr23 = iArr12[i66];
                    i = iArr9[i66];
                    i50 = i65;
                    iArr20 = iArr21;
                    iArr15 = iArr22;
                    iArr17 = iArr23;
                    i49 = 49;
                } else {
                    i49--;
                    i = i47;
                }
                j("zn", i, 258);
                int iF7 = f(qsVar2, i);
                int i67 = i;
                while (iF7 > iArr15[i67]) {
                    i67++;
                    j("zn", i67, 258);
                    iF7 = (iF7 << 1) | f(qsVar2, 1);
                }
                int i68 = iF7 - iArr20[i67];
                j("zvec", i68, 258);
                i45 = iArr17[i68];
                i47 = i;
                iArr14 = iArr20;
            }
            c3 = 0;
        }
        this.o = i48;
        this.s.a = -1;
        this.v = 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            kf2.h(b11.j(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 < 0) {
            kf2.h(b11.j(i2, "len(", ") < 0."));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            kf2.h(f34.i(b11.t("offs(", ") + len(", i, i2, ") > dest.length("), bArr.length, ")."));
            return 0;
        }
        if (this.u == null) {
            mj0.i("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iS = s();
            if (iS < 0) {
                break;
            }
            bArr[i4] = (byte) iS;
            b(1L);
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    public final int s() throws IOException {
        switch (this.v) {
            case 0:
                return -1;
            case 1:
                return u();
            case 2:
                tb4.a();
                return 0;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (this.A != this.B) {
                    this.v = 2;
                    this.z = 1;
                    return H();
                }
                int i = this.z + 1;
                this.z = i;
                if (i < 4) {
                    this.v = 2;
                    return H();
                }
                lo loVar = this.I;
                byte[] bArr = (byte[]) loVar.f;
                int i2 = this.G;
                this.H = (char) (bArr[i2] & 255);
                j("su_tPos", i2, ((int[]) loVar.j).length);
                this.G = ((int[]) this.I.j)[this.G];
                int i3 = this.E;
                if (i3 == 0) {
                    int i4 = this.F;
                    this.E = j51.g[i4] - 1;
                    int i5 = i4 + 1;
                    this.F = i5;
                    if (i5 == 512) {
                        this.F = 0;
                    }
                } else {
                    this.E = i3 - 1;
                }
                this.D = 0;
                this.v = 4;
                if (this.E == 1) {
                    this.H = (char) (this.H ^ 1);
                }
                return J();
            case 4:
                return J();
            case 5:
                tb4.a();
                return 0;
            case 6:
                if (this.A != this.B) {
                    this.z = 1;
                    return v();
                }
                int i6 = this.z + 1;
                this.z = i6;
                if (i6 < 4) {
                    return v();
                }
                j("su_tPos", this.G, ((byte[]) this.I.f).length);
                lo loVar2 = this.I;
                byte[] bArr2 = (byte[]) loVar2.f;
                int i7 = this.G;
                this.H = (char) (bArr2[i7] & 255);
                this.G = ((int[]) loVar2.j)[i7];
                this.D = 0;
                return F();
            case 7:
                return F();
            default:
                tb4.a();
                return 0;
        }
    }

    public final int u() throws IOException {
        lo loVar;
        if (this.v == 0 || (loVar = this.I) == null) {
            return -1;
        }
        int[] iArr = (int[]) loVar.i;
        int i = this.o + 1;
        int[] iArr2 = (int[]) loVar.j;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            loVar.j = iArr2;
        }
        byte[] bArr = (byte[]) loVar.f;
        iArr[0] = 0;
        System.arraycopy((int[]) loVar.g, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.o;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            j("tt index", i7, i);
            iArr2[i7] = i5;
        }
        int i8 = this.p;
        if (i8 < 0 || i8 >= iArr2.length) {
            mj0.i("Stream corrupted");
            return 0;
        }
        this.G = iArr2[i8];
        this.z = 0;
        this.C = 0;
        this.A = 256;
        if (!this.r) {
            return v();
        }
        this.E = 0;
        this.F = 0;
        return H();
    }

    public final int v() throws IOException {
        if (this.C > this.o) {
            this.v = 5;
            n();
            q();
            return u();
        }
        this.B = this.A;
        lo loVar = this.I;
        byte[] bArr = (byte[]) loVar.f;
        int i = this.G;
        int i2 = bArr[i] & 255;
        this.A = i2;
        j("su_tPos", i, ((int[]) loVar.j).length);
        this.G = ((int[]) this.I.j)[this.G];
        this.C++;
        this.v = 6;
        this.s.j(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.u != null) {
            int iS = s();
            b(iS < 0 ? -1 : 1);
            return iS;
        }
        mj0.i("Stream closed");
        return 0;
    }
}
