package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s85 extends im4 {
    public ew4 n;
    public int o;
    public boolean p;
    public wy2 q;
    public c05 r;

    @Override // defpackage.im4
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        wy2 wy2Var = this.q;
        this.o = wy2Var != null ? wy2Var.e : 0;
    }

    @Override // defpackage.im4
    public final long b(be3 be3Var) {
        byte b = be3Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ew4 ew4Var = this.n;
        ew4Var.getClass();
        boolean z = ((ox1[]) ew4Var.s)[(b >> 1) & (255 >>> (8 - ew4Var.o))].o;
        wy2 wy2Var = (wy2) ew4Var.p;
        int i = !z ? wy2Var.e : wy2Var.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = be3Var.a;
        int length = bArr.length;
        int i2 = be3Var.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            be3Var.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            be3Var.M(i2);
        }
        byte[] bArr2 = be3Var.a;
        int i3 = be3Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b1  */
    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.im4
    public final boolean c(be3 be3Var, long j, rf2 rf2Var) throws ParserException {
        ew4 ew4Var;
        if (this.n != null) {
            ((tb1) rf2Var.n).getClass();
            return false;
        }
        wy2 wy2Var = this.q;
        int i = 4;
        if (wy2Var != null) {
            c05 c05Var = this.r;
            if (c05Var == null) {
                this.r = zz1.C(be3Var, true, true);
            } else {
                int i2 = be3Var.c;
                ?? r8 = new byte[i2];
                System.arraycopy(be3Var.a, 0, r8, 0, i2);
                int i3 = wy2Var.a;
                int i4 = 5;
                zz1.N(5, be3Var, false);
                int iA = be3Var.A() + 1;
                h00 h00Var = new h00(be3Var.a);
                int i5 = 8;
                h00Var.t(be3Var.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iA) {
                        int i8 = i5;
                        if (h00Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((h00Var.d * 8) + h00Var.e));
                        }
                        int i9 = h00Var.i(16);
                        int i10 = h00Var.i(24);
                        if (h00Var.h()) {
                            h00Var.t(i4);
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = 0;
                                for (int i13 = i10 - i11; i13 > 0; i13 >>>= 1) {
                                    i12++;
                                }
                                i11 += h00Var.i(i12);
                            }
                        } else {
                            boolean zH = h00Var.h();
                            for (int i14 = 0; i14 < i10; i14++) {
                                if (!zH) {
                                    h00Var.t(i4);
                                } else if (h00Var.h()) {
                                    h00Var.t(i4);
                                }
                            }
                        }
                        int i15 = h00Var.i(4);
                        if (i15 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i15);
                        }
                        if (i15 == 1 || i15 == 2) {
                            h00Var.t(32);
                            h00Var.t(32);
                            int i16 = h00Var.i(4) + 1;
                            h00Var.t(1);
                            h00Var.t((int) ((i15 == 1 ? i9 != 0 ? (long) Math.floor(Math.pow(i10, 1.0d / ((double) i9))) : 0L : ((long) i9) * ((long) i10)) * ((long) i16)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i17 = i5;
                        int i18 = 6;
                        int i19 = h00Var.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (h00Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i21 = 1;
                        int i22 = h00Var.i(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 >= i22) {
                                int i25 = h00Var.i(i18) + 1;
                                int i26 = 0;
                                while (i26 < i25) {
                                    if (h00Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    h00Var.t(24);
                                    h00Var.t(24);
                                    h00Var.t(24);
                                    int i27 = h00Var.i(i18) + 1;
                                    int i28 = 8;
                                    h00Var.t(8);
                                    int[] iArr = new int[i27];
                                    for (int i29 = 0; i29 < i27; i29++) {
                                        iArr[i29] = ((h00Var.h() ? h00Var.i(5) : 0) * 8) + h00Var.i(3);
                                    }
                                    int i30 = 0;
                                    while (i30 < i27) {
                                        int i31 = 0;
                                        while (i31 < i28) {
                                            if ((iArr[i30] & (1 << i31)) != 0) {
                                                h00Var.t(i28);
                                            }
                                            i31++;
                                            i28 = 8;
                                        }
                                        i30++;
                                        i28 = 8;
                                    }
                                    i26++;
                                    i18 = 6;
                                }
                                int i32 = h00Var.i(i18) + 1;
                                for (int i33 = 0; i33 < i32; i33++) {
                                    int i34 = h00Var.i(16);
                                    if (i34 != 0) {
                                        l93.F("VorbisUtil", "mapping type other than 0 not supported: " + i34);
                                    } else {
                                        int i35 = h00Var.h() ? h00Var.i(4) + 1 : 1;
                                        if (h00Var.h()) {
                                            int i36 = h00Var.i(8) + 1;
                                            for (int i37 = 0; i37 < i36; i37++) {
                                                int i38 = i3 - 1;
                                                int i39 = 0;
                                                for (int i40 = i38; i40 > 0; i40 >>>= 1) {
                                                    i39++;
                                                }
                                                h00Var.t(i39);
                                                int i41 = 0;
                                                while (i38 > 0) {
                                                    i41++;
                                                    i38 >>>= 1;
                                                }
                                                h00Var.t(i41);
                                            }
                                        }
                                        if (h00Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i35 > 1) {
                                            for (int i42 = 0; i42 < i3; i42++) {
                                                h00Var.t(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i35; i43++) {
                                            h00Var.t(8);
                                            h00Var.t(8);
                                            h00Var.t(8);
                                        }
                                    }
                                }
                                int i44 = h00Var.i(6);
                                int i45 = i44 + 1;
                                ox1[] ox1VarArr = new ox1[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean zH2 = h00Var.h();
                                    h00Var.i(16);
                                    h00Var.i(16);
                                    h00Var.i(8);
                                    ox1VarArr[i46] = new ox1(2, zH2);
                                }
                                if (!h00Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (i44 > 0) {
                                    i47++;
                                    i44 >>>= 1;
                                }
                                ew4Var = new ew4(wy2Var, c05Var, r8, ox1VarArr, i47, 7);
                                break;
                            }
                            int i48 = h00Var.i(i7);
                            if (i48 == 0) {
                                int i49 = i17;
                                h00Var.t(i49);
                                h00Var.t(16);
                                h00Var.t(16);
                                h00Var.t(6);
                                h00Var.t(i49);
                                int i50 = h00Var.i(4) + 1;
                                int i51 = 0;
                                while (i51 < i50) {
                                    h00Var.t(i49);
                                    i51++;
                                    i49 = 8;
                                }
                            } else {
                                if (i48 != i21) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + i48);
                                }
                                int i52 = h00Var.i(5);
                                int[] iArr2 = new int[i52];
                                int i53 = -1;
                                for (int i54 = 0; i54 < i52; i54++) {
                                    int i55 = h00Var.i(i);
                                    iArr2[i54] = i55;
                                    if (i55 > i53) {
                                        i53 = i55;
                                    }
                                }
                                int i56 = i53 + 1;
                                int[] iArr3 = new int[i56];
                                int i57 = 0;
                                while (i57 < i56) {
                                    iArr3[i57] = h00Var.i(i24) + 1;
                                    int i58 = h00Var.i(2);
                                    int i59 = i17;
                                    if (i58 > 0) {
                                        h00Var.t(i59);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i60 = 0;
                                    for (int i61 = 1; i60 < (i61 << i58); i61 = 1) {
                                        h00Var.t(i59);
                                        i60++;
                                        i59 = 8;
                                    }
                                    i57++;
                                    iArr3 = iArr4;
                                    i17 = 8;
                                    i24 = 3;
                                }
                                int[] iArr5 = iArr3;
                                h00Var.t(2);
                                int i62 = h00Var.i(4);
                                int i63 = 0;
                                int i64 = 0;
                                for (int i65 = 0; i65 < i52; i65++) {
                                    i63 += iArr5[iArr2[i65]];
                                    while (i64 < i63) {
                                        h00Var.t(i62);
                                        i64++;
                                    }
                                }
                            }
                            i23++;
                            i17 = 8;
                            i18 = 6;
                            i = 4;
                            i7 = 16;
                            i21 = 1;
                        }
                    }
                }
            }
            this.n = ew4Var;
            if (ew4Var == null) {
                return true;
            }
            wy2 wy2Var2 = (wy2) ew4Var.p;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) wy2Var2.g);
            arrayList.add((byte[]) ew4Var.r);
            qv2 qv2VarW = zz1.w(yw1.l((String[]) ((c05) ew4Var.q).n));
            sb1 sb1Var = new sb1();
            sb1Var.l = lw2.m("audio/ogg");
            sb1Var.m = lw2.m("audio/vorbis");
            sb1Var.h = wy2Var2.d;
            sb1Var.i = wy2Var2.c;
            sb1Var.E = wy2Var2.a;
            sb1Var.F = wy2Var2.b;
            sb1Var.p = arrayList;
            sb1Var.k = qv2VarW;
            rf2Var.n = new tb1(sb1Var);
            return true;
        }
        zz1.N(1, be3Var, false);
        be3Var.s();
        int iA2 = be3Var.A();
        int iS = be3Var.s();
        int iO = be3Var.o();
        if (iO <= 0) {
            iO = -1;
        }
        int iO2 = be3Var.o();
        int i66 = iO2 > 0 ? iO2 : -1;
        be3Var.o();
        int iA3 = be3Var.A();
        int iPow = (int) Math.pow(2.0d, iA3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iA3 & 240) >> 4);
        be3Var.A();
        ?? CopyOf = Arrays.copyOf(be3Var.a, be3Var.c);
        wy2 wy2Var3 = new wy2();
        wy2Var3.a = iA2;
        wy2Var3.b = iS;
        wy2Var3.c = iO;
        wy2Var3.d = i66;
        wy2Var3.e = iPow;
        wy2Var3.f = iPow2;
        wy2Var3.g = CopyOf;
        this.q = wy2Var3;
        ew4Var = null;
        this.n = ew4Var;
        if (ew4Var == null) {
            return true;
        }
        wy2 wy2Var4 = (wy2) ew4Var.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) wy2Var4.g);
        arrayList2.add((byte[]) ew4Var.r);
        qv2 qv2VarW2 = zz1.w(yw1.l((String[]) ((c05) ew4Var.q).n));
        sb1 sb1Var2 = new sb1();
        sb1Var2.l = lw2.m("audio/ogg");
        sb1Var2.m = lw2.m("audio/vorbis");
        sb1Var2.h = wy2Var4.d;
        sb1Var2.i = wy2Var4.c;
        sb1Var2.E = wy2Var4.a;
        sb1Var2.F = wy2Var4.b;
        sb1Var2.p = arrayList2;
        sb1Var2.k = qv2VarW2;
        rf2Var.n = new tb1(sb1Var2);
        return true;
    }

    @Override // defpackage.im4
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
