package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final ss0 o;

    public zl1(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, ss0 ss0Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = ss0Var;
    }

    public static zl1 a(be3 be3Var, boolean z, ss0 ss0Var) {
        boolean z2;
        cx cxVarH;
        int i = 4;
        try {
            if (z) {
                be3Var.O(4);
            } else {
                be3Var.O(21);
            }
            int iA = be3Var.A() & 3;
            int iA2 = be3Var.A();
            int i2 = be3Var.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iA2) {
                    break;
                }
                be3Var.O(1);
                int iH = be3Var.H();
                for (int i6 = 0; i6 < iH; i6++) {
                    int iH2 = be3Var.H();
                    i5 += iH2 + 4;
                    be3Var.O(iH2);
                }
                i4++;
            }
            be3Var.N(i2);
            byte[] bArr = new byte[i5];
            ss0 ss0Var2 = ss0Var;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iA2) {
                int iA3 = be3Var.A() & 63;
                int iH3 = be3Var.H();
                int i19 = i3;
                ss0 ss0VarJ = ss0Var2;
                while (i19 < iH3) {
                    boolean z3 = z2;
                    int iH4 = be3Var.H();
                    int i20 = iA;
                    System.arraycopy(uc5.c, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(be3Var.a, be3Var.b, bArr, i21, iH4);
                    if (iA3 == 32 && i19 == 0) {
                        ss0VarJ = uc5.J(bArr, i21, i21 + iH4);
                    } else {
                        if (iA3 == 33 && i19 == 0) {
                            r13 r13VarI = uc5.I(bArr, i21, i21 + iH4, ss0VarJ);
                            i7 = r13VarI.a + 1;
                            i8 = r13VarI.g;
                            int i22 = r13VarI.h;
                            i10 = r13VarI.c + 8;
                            i11 = r13VarI.d + 8;
                            int i23 = r13VarI.k;
                            i9 = i22;
                            int i24 = r13VarI.l;
                            int i25 = r13VarI.m;
                            float f2 = r13VarI.i;
                            int i26 = r13VarI.j;
                            p13 p13Var = r13VarI.b;
                            if (p13Var != null) {
                                strA = i40.a(p13Var.a, p13Var.b, p13Var.c, p13Var.d, p13Var.e, p13Var.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iA3 == 39 && i19 == 0 && (cxVarH = uc5.H(bArr, i21, i21 + iH4)) != null && ss0VarJ != null) {
                            i3 = 0;
                            i15 = cxVarH.a == ((o13) ((yw1) ss0VarJ.n).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iH4;
                    be3Var.O(iH4);
                    i19++;
                    z2 = z3;
                    iA = i20;
                    i = 4;
                }
                i17++;
                ss0Var2 = ss0VarJ;
                i = 4;
            }
            return new zl1(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iA + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, ss0Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
