package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import app.homemusic.R;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc5 {
    public static final f01 a = new f01(1, "UNDEFINED");
    public static final f01 b = new f01(1, "REUSABLE_CLAIMED");
    public static final byte[] c = {0, 0, 0, 1};
    public static final float[] d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object e = new Object();
    public static int[] f = new int[10];
    public static final int[] g = {R.attr.colorPrimary};
    public static final int[] h = {R.attr.colorPrimaryVariant};
    public static volatile boolean i = true;
    public static Boolean j;

    public static Drawable A(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            ud0 ud0Var = new ud0(context);
            ud0Var.b = theme;
            ud0Var.a(theme.getResources().getConfiguration());
            context = ud0Var;
        }
        return zz1.r(context, i2);
    }

    public static zd3 B(Object obj) {
        return new zd3(obj, rv2.D);
    }

    public static int C(tb1 tb1Var) {
        String strR = r(tb1Var);
        if (Objects.equals(strR, "video/avc")) {
            return 1;
        }
        return Objects.equals(strR, "video/hevc") ? 2 : 0;
    }

    public static TypedArray D(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        c(context, attributeSet, i2, i3);
        g(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static jv3 E(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        c(context, attributeSet, i2, i3);
        g(context, attributeSet, iArr, i2, i3, iArr2);
        return new jv3(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static v2 F(h00 h00Var) {
        h00Var.s();
        return new v2(h00Var.i(6), h00Var.i(6), h00Var.i(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static p13 G(h00 h00Var, boolean z, int i2, p13 p13Var) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zH;
        int i6;
        int i7;
        int i8;
        int[] iArr2 = new int[6];
        if (!z) {
            if (p13Var != null) {
                int i9 = p13Var.a;
                zH = p13Var.b;
                i6 = p13Var.c;
                i7 = p13Var.d;
                iArr2 = p13Var.e;
                i3 = i9;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int i10 = h00Var.i(8);
            i8 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                if (h00Var.h()) {
                    i8 += 88;
                }
                if (h00Var.h()) {
                    i8 += 8;
                }
            }
            h00Var.t(i8);
            if (i2 > 0) {
                h00Var.t((8 - i2) * 2);
            }
            return new p13(i3, z2, i4, i5, iArr, i10);
        }
        int i12 = h00Var.i(2);
        zH = h00Var.h();
        i6 = h00Var.i(5);
        i7 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (h00Var.h()) {
                i7 |= 1 << i13;
            }
        }
        for (int i14 = 0; i14 < 6; i14++) {
            iArr2[i14] = h00Var.i(8);
        }
        i3 = i12;
        iArr = iArr2;
        z2 = zH;
        i4 = i6;
        i5 = i7;
        int i15 = h00Var.i(8);
        i8 = 0;
        while (i11 < i2) {
            if (h00Var.h()) {
                i8 += 88;
            }
            if (h00Var.h()) {
                i8 += 8;
            }
        }
        h00Var.t(i8);
        if (i2 > 0) {
            h00Var.t((8 - i2) * 2);
        }
        return new p13(i3, z2, i4, i5, iArr, i15);
    }

    public static cx H(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        h00 h00Var = new h00(bArr, i4, i3 + 1);
        while (h00Var.d(16)) {
            int i5 = h00Var.i(8);
            int i6 = 0;
            while (i5 == 255) {
                i6 += 255;
                i5 = h00Var.i(8);
            }
            int i7 = i6 + i5;
            int i8 = h00Var.i(8);
            int i9 = 0;
            while (i8 == 255) {
                i9 += 255;
                i8 = h00Var.i(8);
            }
            int i10 = i9 + i8;
            if (i10 == 0 || !h00Var.d(i10)) {
                return null;
            }
            if (i7 == 176) {
                int iM = h00Var.m();
                boolean zH = h00Var.h();
                int iM2 = zH ? h00Var.m() : 0;
                int iM3 = h00Var.m();
                int iM4 = -1;
                for (int i11 = 0; i11 <= iM3; i11++) {
                    iM4 = h00Var.m();
                    h00Var.m();
                    int i12 = h00Var.i(6);
                    if (i12 == 63) {
                        return null;
                    }
                    h00Var.i(i12 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i12 + iM) - 31));
                    if (zH) {
                        int i13 = h00Var.i(6);
                        if (i13 == 63) {
                            return null;
                        }
                        h00Var.i(i13 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i13 + iM2) - 31));
                    }
                    if (h00Var.h()) {
                        h00Var.t(10);
                    }
                }
                return new cx(iM4);
            }
            h00Var.t(i10 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    public static r13 I(byte[] bArr, int i2, int i3, ss0 ss0Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iM;
        int i8;
        int iM2;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int iF;
        int iG;
        int i14;
        wo0 wo0Var;
        hd5 hd5Var;
        v2 v2VarF = F(new h00(bArr, i2, i3));
        h00 h00Var = new h00(bArr, i2 + 2, i3);
        int i15 = 4;
        h00Var.t(4);
        int i16 = h00Var.i(3);
        int i17 = v2VarF.b;
        boolean z = i17 != 0 && i16 == 7;
        if (ss0Var != null) {
            yw1 yw1Var = (yw1) ss0Var.n;
            if (yw1Var.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((o13) yw1Var.get(Math.min(i17, yw1Var.size() - 1))).a;
            }
        } else {
            i4 = 0;
        }
        p13 p13VarG = null;
        if (!z) {
            h00Var.s();
            p13VarG = G(h00Var, true, i16, null);
        } else if (ss0Var != null) {
            xc5 xc5Var = (xc5) ss0Var.o;
            int[] iArr = (int[]) xc5Var.p;
            yw1 yw1Var2 = (yw1) xc5Var.o;
            int i18 = iArr[i4];
            if (yw1Var2.size() > i18) {
                p13VarG = (p13) yw1Var2.get(i18);
            }
        }
        h00Var.m();
        if (z) {
            int i19 = h00Var.h() ? h00Var.i(8) : -1;
            if (ss0Var == null || (hd5Var = (hd5) ss0Var.p) == null) {
                iM = 0;
                iM2 = 0;
                i8 = 0;
                i10 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                yw1 yw1Var3 = (yw1) hd5Var.o;
                if (i19 == -1) {
                    i19 = ((int[]) hd5Var.p)[i4];
                }
                if (i19 == -1 || yw1Var3.size() <= i19) {
                    iM = 0;
                    iM2 = 0;
                    i8 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    q13 q13Var = (q13) yw1Var3.get(i19);
                    int i20 = q13Var.a;
                    i8 = q13Var.d;
                    int i21 = q13Var.e;
                    iM = q13Var.b;
                    iM2 = q13Var.c;
                    i7 = i21;
                    i9 = i7;
                    i10 = i8;
                }
            }
        } else {
            int iM3 = h00Var.m();
            if (iM3 == 3) {
                h00Var.s();
            }
            int iM4 = h00Var.m();
            int iM5 = h00Var.m();
            if (h00Var.h()) {
                int iM6 = h00Var.m();
                int iM7 = h00Var.m();
                int iM8 = h00Var.m();
                int iM9 = h00Var.m();
                i5 = iM4 - ((iM6 + iM7) * ((iM3 == 1 || iM3 == 2) ? 2 : 1));
                i6 = iM5 - ((iM8 + iM9) * (iM3 == 1 ? 2 : 1));
            } else {
                i5 = iM4;
                i6 = iM5;
            }
            i7 = i6;
            iM = h00Var.m();
            i8 = i5;
            iM2 = h00Var.m();
            i9 = iM5;
            i10 = iM4;
        }
        int iM10 = h00Var.m();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i22 = h00Var.h() ? 0 : i16; i22 <= i16; i22++) {
                h00Var.m();
                iMax = Math.max(h00Var.m(), iMax);
                h00Var.m();
            }
        }
        h00Var.m();
        h00Var.m();
        h00Var.m();
        h00Var.m();
        h00Var.m();
        h00Var.m();
        if (h00Var.h()) {
            int i23 = 6;
            if (z ? h00Var.h() : false) {
                h00Var.t(6);
            } else if (h00Var.h()) {
                int i24 = 0;
                while (i24 < i15) {
                    int i25 = 0;
                    while (i25 < i23) {
                        if (h00Var.h()) {
                            int iMin = Math.min(64, 1 << ((i24 << 1) + 4));
                            if (i24 > 1) {
                                h00Var.n();
                            }
                            for (int i26 = 0; i26 < iMin; i26++) {
                                h00Var.n();
                            }
                        } else {
                            h00Var.m();
                        }
                        i25 += i24 == 3 ? 3 : 1;
                        i23 = 6;
                    }
                    i24++;
                    i15 = 4;
                    i23 = 6;
                }
            }
        }
        h00Var.t(2);
        if (h00Var.h()) {
            h00Var.t(8);
            h00Var.m();
            h00Var.m();
            h00Var.s();
        }
        int iM11 = h00Var.m();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i27 = 0;
        int iM12 = -1;
        int i28 = -1;
        while (i27 < iM11) {
            if (i27 == 0 || !h00Var.h()) {
                int iM13 = h00Var.m();
                iM12 = h00Var.m();
                int[] iArr3 = new int[iM13];
                int i29 = 0;
                while (i29 < iM13) {
                    iArr3[i29] = (i29 > 0 ? iArr3[i29 - 1] : 0) - (h00Var.m() + 1);
                    h00Var.s();
                    i29++;
                }
                int[] iArr4 = new int[iM12];
                int i30 = 0;
                while (i30 < iM12) {
                    iArr4[i30] = h00Var.m() + 1 + (i30 > 0 ? iArr4[i30 - 1] : 0);
                    h00Var.s();
                    i30++;
                }
                i28 = iM13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i31 = i28 + iM12;
                int iM14 = (1 - ((h00Var.h() ? 1 : 0) * 2)) * (h00Var.m() + 1);
                int i32 = i31 + 1;
                boolean[] zArr = new boolean[i32];
                for (int i33 = 0; i33 <= i31; i33++) {
                    if (h00Var.h()) {
                        zArr[i33] = true;
                    } else {
                        zArr[i33] = h00Var.h();
                    }
                }
                int[] iArr5 = new int[i32];
                int[] iArr6 = new int[i32];
                int i34 = 0;
                for (int i35 = iM12 - 1; i35 >= 0; i35--) {
                    int i36 = iArrCopyOf[i35] + iM14;
                    if (i36 < 0 && zArr[i28 + i35]) {
                        iArr5[i34] = i36;
                        i34++;
                    }
                }
                if (iM14 < 0 && zArr[i31]) {
                    iArr5[i34] = iM14;
                    i34++;
                }
                int i37 = i34;
                int[] iArr7 = iArr2;
                for (int i38 = 0; i38 < i28; i38++) {
                    int i39 = iArr7[i38] + iM14;
                    if (i39 < 0 && zArr[i38]) {
                        iArr5[i37] = i39;
                        i37++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i37);
                int i40 = 0;
                for (int i41 = i28 - 1; i41 >= 0; i41--) {
                    int i42 = iArr7[i41] + iM14;
                    if (i42 > 0 && zArr[i41]) {
                        iArr6[i40] = i42;
                        i40++;
                    }
                }
                if (iM14 > 0 && zArr[i31]) {
                    iArr6[i40] = iM14;
                    i40++;
                }
                int i43 = i37;
                int i44 = i40;
                for (int i45 = 0; i45 < iM12; i45++) {
                    int i46 = iArrCopyOf[i45] + iM14;
                    if (i46 > 0 && zArr[i28 + i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i44);
                iM12 = i44;
                i28 = i43;
                iArr2 = iArrCopyOf2;
            }
            i27++;
            iM11 = iM11;
            i4 = i4;
        }
        int i47 = i4;
        if (h00Var.h()) {
            int iM15 = h00Var.m();
            for (int i48 = 0; i48 < iM15; i48++) {
                h00Var.t(iM10 + 5);
            }
        }
        h00Var.t(2);
        float f2 = 1.0f;
        if (h00Var.h()) {
            if (h00Var.h()) {
                int i49 = h00Var.i(8);
                if (i49 == 255) {
                    int i50 = h00Var.i(16);
                    int i51 = h00Var.i(16);
                    if (i50 != 0 && i51 != 0) {
                        f2 = i50 / i51;
                    }
                } else if (i49 < 17) {
                    f2 = d[i49];
                } else {
                    xa3.m(i49, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (h00Var.h()) {
                h00Var.s();
            }
            if (h00Var.h()) {
                h00Var.t(3);
                i14 = h00Var.h() ? 1 : 2;
                if (h00Var.h()) {
                    int i52 = h00Var.i(8);
                    int i53 = h00Var.i(8);
                    h00Var.t(8);
                    iF = c50.f(i52);
                    iG = c50.g(i53);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (ss0Var == null || (wo0Var = (wo0) ss0Var.q) == null) {
                iF = -1;
                iG = -1;
                i14 = -1;
            } else {
                yw1 yw1Var4 = (yw1) wo0Var.n;
                int i54 = ((int[]) wo0Var.o)[i47];
                if (yw1Var4.size() > i54) {
                    s13 s13Var = (s13) yw1Var4.get(i54);
                    int i55 = s13Var.a;
                    int i56 = s13Var.b;
                    iG = s13Var.c;
                    iF = i55;
                    i14 = i56;
                } else {
                    iF = -1;
                    iG = -1;
                    i14 = -1;
                }
            }
            if (h00Var.h()) {
                h00Var.m();
                h00Var.m();
            }
            h00Var.s();
            if (h00Var.h()) {
                i7 *= 2;
            }
            i11 = iF;
            i13 = iG;
            i12 = i14;
        } else {
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new r13(i16, p13VarG, iM, iM2, i8, i7, i10, i9, f2, iMax, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:482:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ss0 J(byte[] bArr, int i2, int i3) {
        int[] iArr;
        wo0 wo0Var;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        gy3 gy3Var;
        boolean[][] zArr;
        int i8;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i9;
        boolean zH;
        int i10;
        int i11;
        int i12;
        boolean zH2;
        boolean zH3;
        int iM;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        h00 h00Var = new h00(bArr, i2, i3);
        F(h00Var);
        h00Var.t(4);
        boolean zH4 = h00Var.h();
        boolean zH5 = h00Var.h();
        int i16 = h00Var.i(6);
        int i17 = i16 + 1;
        int i18 = h00Var.i(3);
        h00Var.t(17);
        p13 p13VarG = G(h00Var, true, i18, null);
        for (int i19 = h00Var.h() ? 0 : i18; i19 <= i18; i19++) {
            h00Var.m();
            h00Var.m();
            h00Var.m();
        }
        int i20 = h00Var.i(6);
        int iM2 = h00Var.m() + 1;
        int i21 = 6;
        xc5 xc5Var = new xc5(yw1.o(p13VarG), new int[1]);
        boolean z4 = i17 >= 2 && iM2 >= 2;
        boolean z5 = zH4 && zH5;
        int i22 = i20 + 1;
        boolean z6 = i22 >= i17;
        if (!z4 || !z5 || !z6) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i22);
        int i23 = 1;
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i24 = 1; i24 < iM2; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 <= i20; i26++) {
                if (h00Var.h()) {
                    iArr4[i24][i25] = i26;
                    iArr6[i24] = i26;
                    i25++;
                }
                iArr5[i24] = i25;
            }
        }
        if (h00Var.h()) {
            h00Var.t(64);
            if (h00Var.h()) {
                h00Var.m();
            }
            int iM3 = h00Var.m();
            int i27 = 0;
            while (i27 < iM3) {
                h00Var.m();
                if (i27 == 0 || h00Var.h()) {
                    boolean zH6 = h00Var.h();
                    boolean zH7 = h00Var.h();
                    z3 = zH6;
                    z2 = zH7;
                    if (zH6 || zH7) {
                        zH = h00Var.h();
                        if (zH) {
                            h00Var.t(19);
                        }
                        h00Var.t(8);
                        if (zH) {
                            h00Var.t(4);
                        }
                        h00Var.t(15);
                        i11 = zH6;
                        i10 = zH7;
                    }
                    i12 = 0;
                    while (i12 <= i18) {
                        zH2 = h00Var.h();
                        if (!zH2) {
                            zH2 = h00Var.h();
                        }
                        if (zH2) {
                            h00Var.m();
                            zH3 = false;
                        } else {
                            zH3 = h00Var.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = h00Var.m();
                        }
                        int[][] iArr7 = iArr4;
                        i13 = i11 + i10;
                        int[] iArr8 = iArr6;
                        i14 = 0;
                        while (i14 < i13) {
                            int i28 = i13;
                            for (i15 = 0; i15 <= iM; i15++) {
                                h00Var.m();
                                h00Var.m();
                                if (zH) {
                                    h00Var.m();
                                    h00Var.m();
                                }
                                h00Var.s();
                            }
                            i14++;
                            i13 = i28;
                        }
                        i12++;
                        i27 = i27;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i27++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zH = false;
                i11 = z3;
                i10 = z2;
                i12 = 0;
                while (i12 <= i18) {
                    zH2 = h00Var.h();
                    if (!zH2) {
                        zH2 = h00Var.h();
                    }
                    if (zH2) {
                        h00Var.m();
                        zH3 = false;
                    } else {
                        zH3 = h00Var.h();
                    }
                    if (zH3) {
                        iM = h00Var.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i13 = i11 + i10;
                    int[] iArr10 = iArr6;
                    i14 = 0;
                    while (i14 < i13) {
                        int i29 = i13;
                        while (i15 <= iM) {
                            h00Var.m();
                            h00Var.m();
                            if (zH) {
                                h00Var.m();
                                h00Var.m();
                            }
                            h00Var.s();
                        }
                        i14++;
                        i13 = i29;
                    }
                    i12++;
                    i27 = i27;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i27++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!h00Var.h()) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int i30 = h00Var.e;
        if (i30 > 0) {
            h00Var.t(8 - i30);
        }
        p13 p13VarG2 = G(h00Var, false, i18, p13VarG);
        boolean zH8 = h00Var.h();
        boolean[] zArr3 = new boolean[16];
        int i31 = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            boolean zH9 = h00Var.h();
            zArr3[i32] = zH9;
            if (zH9) {
                i31++;
            }
        }
        if (i31 == 0 || !zArr3[1]) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int[] iArr13 = new int[i31];
        for (int i33 = 0; i33 < i31 - (zH8 ? 1 : 0); i33++) {
            iArr13[i33] = h00Var.i(3);
        }
        int[] iArr14 = new int[i31 + 1];
        if (zH8) {
            int i34 = 1;
            while (i34 < i31) {
                int[] iArr15 = iArr14;
                for (int i35 = 0; i35 < i34; i35++) {
                    iArr15[i34] = iArr13[i35] + 1 + iArr15[i34];
                }
                i34++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i31] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i17, i31);
        int[] iArr17 = new int[i17];
        iArr17[0] = 0;
        boolean zH10 = h00Var.h();
        int i36 = 1;
        while (i36 < i17) {
            if (zH10) {
                i9 = i36;
                iArr17[i9] = h00Var.i(i21);
            } else {
                i9 = i36;
                iArr17[i9] = i9;
            }
            if (zH8) {
                int i37 = 0;
                while (i37 < i31) {
                    int i38 = i37 + 1;
                    iArr16[i9][i37] = (iArr17[i9] & ((1 << iArr[i38]) - 1)) >> iArr[i37];
                    i37 = i38;
                }
            } else {
                int i39 = 0;
                while (i39 < i31) {
                    int i40 = i39;
                    iArr16[i9][i40] = h00Var.i(iArr13[i39] + 1);
                    i39 = i40 + 1;
                }
            }
            i36 = i9 + 1;
            i21 = 6;
        }
        int[] iArr18 = new int[i22];
        int i41 = 1;
        int i42 = 0;
        while (i42 < i17) {
            iArr18[iArr17[i42]] = -1;
            int[] iArr19 = iArr18;
            int i43 = 0;
            int i44 = 0;
            while (i43 < 16) {
                if (zArr3[i43]) {
                    if (i43 == i23) {
                        iArr19[iArr17[i42]] = iArr16[i42][i44];
                    }
                    i44++;
                }
                i43++;
                i23 = 1;
            }
            if (i42 > 0) {
                int i45 = 0;
                while (true) {
                    if (i45 >= i42) {
                        i41++;
                        break;
                    }
                    int i46 = i45;
                    if (iArr19[iArr17[i42]] == iArr19[iArr17[i45]]) {
                        break;
                    }
                    i45 = i46 + 1;
                }
            }
            i42++;
            iArr18 = iArr19;
            i23 = 1;
        }
        int[] iArr20 = iArr18;
        int i47 = h00Var.i(4);
        if (i41 < 2 || i47 == 0) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int[] iArr21 = new int[i41];
        for (int i48 = 0; i48 < i41; i48++) {
            iArr21[i48] = h00Var.i(i47);
        }
        int[] iArr22 = new int[i22];
        for (int i49 = 0; i49 < i17; i49++) {
            iArr22[Math.min(iArr17[i49], i20)] = i49;
        }
        uw1 uw1VarJ = yw1.j();
        int i50 = 0;
        while (i50 <= i20) {
            int[] iArr23 = iArr22;
            int i51 = i41;
            int iMin = Math.min(iArr20[i50], i51 - 1);
            uw1VarJ.c(new o13(iArr23[i50], iMin >= 0 ? iArr21[iMin] : -1));
            i50++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i41 = i51;
        }
        int[] iArr24 = iArr17;
        gy3 gy3VarF = uw1VarJ.f();
        if (((o13) gy3VarF.get(0)).b == -1) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int i52 = 1;
        while (true) {
            if (i52 > i20) {
                i52 = -1;
                break;
            }
            if (((o13) gy3VarF.get(i52)).b != -1) {
                break;
            }
            i52++;
        }
        if (i52 == -1) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        for (int i53 = 1; i53 < i17; i53++) {
            for (int i54 = 0; i54 < i53; i54++) {
                boolean[] zArr6 = zArr4[i53];
                boolean[] zArr7 = zArr5[i53];
                boolean zH11 = h00Var.h();
                zArr7[i54] = zH11;
                zArr6[i54] = zH11;
            }
        }
        for (int i55 = 1; i55 < i17; i55++) {
            int i56 = 0;
            while (i56 < i16) {
                boolean[][] zArr8 = zArr4;
                for (int i57 = 0; i57 < i55; i57++) {
                    boolean[] zArr9 = zArr5[i55];
                    if (zArr9[i57] && zArr5[i57][i56]) {
                        zArr9[i56] = true;
                        break;
                    }
                }
                i56++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i22];
        for (int i58 = 0; i58 < i17; i58++) {
            int i59 = 0;
            for (int i60 = 0; i60 < i58; i60++) {
                i59 += zArr10[i58][i60] ? 1 : 0;
            }
            iArr25[iArr24[i58]] = i59;
        }
        int i61 = 0;
        for (int i62 = 0; i62 < i17; i62++) {
            if (iArr25[iArr24[i62]] == 0) {
                i61++;
            }
        }
        if (i61 > 1) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int[] iArr26 = new int[i17];
        int[] iArr27 = new int[iM2];
        if (h00Var.h()) {
            int i63 = 0;
            while (i63 < i17) {
                int i64 = i63;
                iArr26[i64] = h00Var.i(3);
                i63 = i64 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i17, i18);
        }
        int i65 = 0;
        while (i65 < iM2) {
            int i66 = i65;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i67 = 0; i67 < iArr5[i66]; i67++) {
                iMax = Math.max(iMax, iArr28[((o13) gy3VarF.get(iArr11[i66][i67])).a]);
            }
            iArr27[i66] = iMax + 1;
            i65 = i66 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (h00Var.h()) {
            int i68 = 0;
            while (i68 < i16) {
                int i69 = i68 + 1;
                int i70 = i69;
                while (i70 < i17) {
                    if (zArr10[i70][i68]) {
                        h00Var.t(3);
                    }
                    i70++;
                    i16 = i16;
                }
                i68 = i69;
            }
        }
        h00Var.s();
        int iM4 = h00Var.m() + 1;
        uw1 uw1VarJ2 = yw1.j();
        uw1VarJ2.c(p13VarG);
        if (iM4 > 1) {
            uw1VarJ2.c(p13VarG2);
            for (int i71 = 2; i71 < iM4; i71++) {
                p13VarG2 = G(h00Var, h00Var.h(), i18, p13VarG2);
                uw1VarJ2.c(p13VarG2);
            }
        }
        gy3 gy3VarF2 = uw1VarJ2.f();
        int iM5 = h00Var.m() + iM2;
        if (iM5 > iM2) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int i72 = h00Var.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i22);
        int[] iArr29 = new int[iM5];
        int i73 = 0;
        int[] iArr30 = new int[iM5];
        int i74 = 0;
        while (i74 < iM2) {
            iArr29[i74] = i73;
            iArr30[i74] = iArr12[i74];
            if (i72 == 0) {
                i8 = i74;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i8], i73, iArr5[i8], true);
                iArr2[i8] = iArr5[i8];
            } else {
                i8 = i74;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (i72 == 1) {
                    int i75 = iArr12[i8];
                    for (int i76 = 0; i76 < iArr5[i8]; i76++) {
                        zArr2[i8][i76] = iArr11[i8][i76] == i75;
                    }
                    iArr2[i8] = 1;
                } else {
                    i73 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i74 = i8 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i73 = 0;
            i74 = i8 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i22];
        int i77 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i22;
        iArr34[i73] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i78 = 1;
        int i79 = 0;
        while (i78 < iM5) {
            if (i72 == i77) {
                for (int i80 = 0; i80 < iArr5[i78]; i80++) {
                    zArr14[i78][i80] = h00Var.h();
                    int i81 = iArr31[i78];
                    boolean z7 = zArr14[i78][i80];
                    iArr31[i78] = i81 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i78] = iArr11[i78][i80];
                    }
                }
            }
            if (i79 == 0) {
                i7 = 0;
                if (iArr11[i78][0] == 0 && zArr14[i78][0]) {
                    for (int i82 = 1; i82 < iArr5[i78]; i82++) {
                        if (iArr11[i78][i82] == i52 && zArr14[i78][i52]) {
                            i79 = i78;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
            int i83 = i7;
            while (i83 < iArr5[i78]) {
                if (iM4 > 1) {
                    zArr15[i78][i83] = zArr14[i78][i83];
                    gy3Var = gy3VarF2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = ms0.c(iM4);
                    if (!zArr[i78][i83]) {
                        int i84 = ((o13) gy3VarF.get(iArr11[i78][i83])).a;
                        int i85 = i7;
                        while (i85 < i83) {
                            int i86 = i85;
                            if (zArr12[i84][((o13) gy3VarF.get(iArr11[i78][i86])).a]) {
                                zArr[i78][i83] = true;
                                break;
                            }
                            i85 = i86 + 1;
                        }
                    }
                    if (zArr[i78][i83]) {
                        if (i79 <= 0 || i78 != i79) {
                            h00Var.t(iC);
                        } else {
                            iArr33[i83] = h00Var.i(iC);
                        }
                    }
                } else {
                    gy3Var = gy3VarF2;
                    zArr = zArr15;
                }
                i83++;
                gy3VarF2 = gy3Var;
                zArr15 = zArr;
            }
            gy3 gy3Var2 = gy3VarF2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i78] == 1 && iArr25[iArr30[i78]] > 0) {
                h00Var.s();
            }
            i78++;
            gy3VarF2 = gy3Var2;
            zArr15 = zArr16;
            i77 = 2;
        }
        gy3 gy3Var3 = gy3VarF2;
        boolean[][] zArr17 = zArr15;
        if (i79 == 0) {
            return new ss0((gy3) null, xc5Var, (hd5) null, (wo0) null);
        }
        int iM6 = h00Var.m();
        int i87 = iM6 + 1;
        f(i87, "expectedSize");
        f(i87, "initialCapacity");
        int[] iArr35 = new int[i17];
        Object[] objArrCopyOf = new Object[i87];
        int i88 = 0;
        int i89 = 0;
        boolean z8 = false;
        while (i88 < i87) {
            int i90 = i88;
            int i91 = h00Var.i(16);
            int i92 = h00Var.i(16);
            boolean z9 = z8;
            if (h00Var.h()) {
                i4 = h00Var.i(2);
                if (i4 == 3) {
                    h00Var.s();
                }
                i5 = h00Var.i(4);
                i6 = h00Var.i(4);
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (h00Var.h()) {
                int iM7 = h00Var.m();
                int iM8 = h00Var.m();
                int iM9 = h00Var.m();
                int iM10 = h00Var.m();
                i91 -= (iM7 + iM8) * ((i4 == 1 || i4 == 2) ? 2 : 1);
                i92 -= (iM9 + iM10) * (i4 == 1 ? 2 : 1);
            }
            q13 q13Var = new q13(i4, i5, i6, i91, i92);
            int iB = qw1.b(objArrCopyOf.length, i89 + 1);
            if (iB > objArrCopyOf.length || z9) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                z = false;
            } else {
                z = z9;
            }
            objArrCopyOf[i89] = q13Var;
            i89++;
            i88 = i90 + 1;
            z8 = z;
        }
        if (i87 <= 1 || !h00Var.h()) {
            for (int i93 = 1; i93 < i17; i93++) {
                iArr35[i93] = Math.min(i93, iM6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = ms0.c(i87);
            for (int i94 = 1; i94 < i17; i94++) {
                iArr35[i94] = h00Var.i(iC2);
            }
        }
        hd5 hd5Var = new hd5(yw1.i(i89, objArrCopyOf), iArr35);
        h00Var.t(2);
        for (int i95 = 1; i95 < i17; i95++) {
            if (iArr25[iArr24[i95]] == 0) {
                h00Var.s();
            }
        }
        for (int i96 = 1; i96 < iM5; i96++) {
            boolean zH12 = h00Var.h();
            int i97 = 0;
            while (i97 < iArr32[i96]) {
                if ((i97 <= 0 || !zH12) ? i97 == 0 : h00Var.h()) {
                    for (int i98 = 0; i98 < iArr5[i96]; i98++) {
                        if (zArr17[i96][i98]) {
                            h00Var.m();
                        }
                    }
                    h00Var.m();
                    h00Var.m();
                }
                i97++;
            }
        }
        int iM11 = h00Var.m() + 2;
        if (h00Var.h()) {
            h00Var.t(iM11);
        } else {
            for (int i99 = 1; i99 < i17; i99++) {
                for (int i100 = 0; i100 < i99; i100++) {
                    if (zArr10[i99][i100]) {
                        h00Var.t(iM11);
                    }
                }
            }
        }
        int iM12 = h00Var.m();
        for (int i101 = 1; i101 <= iM12; i101++) {
            h00Var.t(8);
        }
        if (h00Var.h()) {
            int i102 = h00Var.e;
            if (i102 > 0) {
                h00Var.t(8 - i102);
            }
            if (!h00Var.h() ? h00Var.h() : true) {
                h00Var.s();
            }
            boolean zH13 = h00Var.h();
            boolean zH14 = h00Var.h();
            if (zH13 || zH14) {
                for (int i103 = 0; i103 < iM2; i103++) {
                    for (int i104 = 0; i104 < iArr32[i103]; i104++) {
                        boolean zH15 = zH13 ? h00Var.h() : false;
                        boolean zH16 = zH14 ? h00Var.h() : false;
                        if (zH15) {
                            h00Var.t(32);
                        }
                        if (zH16) {
                            h00Var.t(18);
                        }
                    }
                }
            }
            boolean zH17 = h00Var.h();
            int i105 = zH17 ? h00Var.i(4) + 1 : i17;
            f(i105, "expectedSize");
            f(i105, "initialCapacity");
            int[] iArr36 = new int[i17];
            Object[] objArrCopyOf2 = new Object[i105];
            int i106 = 0;
            int i107 = 0;
            boolean z10 = false;
            while (i106 < i105) {
                h00Var.t(3);
                int i108 = h00Var.h() ? 1 : 2;
                int iF = c50.f(h00Var.i(8));
                boolean z11 = zH17;
                int iG = c50.g(h00Var.i(8));
                h00Var.t(8);
                s13 s13Var = new s13(iF, i108, iG);
                int iB2 = qw1.b(objArrCopyOf2.length, i107 + 1);
                if (iB2 > objArrCopyOf2.length || z10) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                    z10 = false;
                }
                objArrCopyOf2[i107] = s13Var;
                i106++;
                i107++;
                zH17 = z11;
                z10 = z10;
            }
            if (zH17 && i105 > 1) {
                for (int i109 = 0; i109 < i17; i109++) {
                    iArr36[i109] = h00Var.i(4);
                }
            }
            gy3 gy3VarI = yw1.i(i107, objArrCopyOf2);
            wo0Var = new wo0();
            wo0Var.n = yw1.k(gy3VarI);
            wo0Var.o = iArr36;
        } else {
            wo0Var = null;
        }
        return new ss0(gy3VarF, new xc5(gy3Var3, iArr33), hd5Var, wo0Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList K(be3 be3Var) {
        char c2;
        ArrayList arrayList;
        boolean z;
        int i2;
        Object lr3Var;
        be3 be3Var2 = be3Var;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (be3Var2.A() == 0) {
            char c3 = 7;
            be3Var2.O(7);
            int iM = be3Var2.m();
            boolean z2 = true;
            if (iM == 1684433976) {
                be3 be3Var3 = new be3();
                Inflater inflater = new Inflater(true);
                try {
                    if (!f35.K(be3Var2, be3Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    be3Var2 = be3Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i3 = be3Var2.b;
            int i4 = be3Var2.c;
            while (i3 < i4) {
                int iM2 = be3Var2.m() + i3;
                if (iM2 > i3 && iM2 <= i4) {
                    if (be3Var2.m() == 1835365224) {
                        int iM3 = be3Var2.m();
                        if (iM3 > 10000) {
                            c2 = c3;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i2 = i4;
                            lr3Var = arrayList4;
                        } else {
                            float[] fArr = new float[iM3];
                            for (int i5 = 0; i5 < iM3; i5++) {
                                fArr[i5] = Float.intBitsToFloat(be3Var2.m());
                            }
                            int iM4 = be3Var2.m();
                            if (iM4 > 32000) {
                                c2 = c3;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i2 = i4;
                                lr3Var = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = be3Var2.a;
                                h00 h00Var = new h00(bArr.length, bArr);
                                h00Var.q(be3Var2.b * 8);
                                float[] fArr2 = new float[iM4 * 5];
                                int i6 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i7 < iM4) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i6) {
                                                int i10 = iArr[i9];
                                                int i11 = h00Var.i(iCeil);
                                                int i12 = ((i11 >> 1) ^ (-(i11 & 1))) + i10;
                                                if (i12 < iM3 && i12 >= 0) {
                                                    fArr2[i8] = fArr[i12];
                                                    iArr[i9] = i12;
                                                    i9++;
                                                    i8++;
                                                    i6 = 5;
                                                }
                                            } else {
                                                i7++;
                                                i6 = 5;
                                            }
                                        }
                                    } else {
                                        h00Var.q((h00Var.g() + 7) & (-8));
                                        int i13 = 32;
                                        int i14 = h00Var.i(32);
                                        tu[] tuVarArr = new tu[i14];
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int i16 = h00Var.i(8);
                                                int i17 = h00Var.i(8);
                                                int i18 = h00Var.i(i13);
                                                if (i18 <= 128000) {
                                                    int i19 = i14;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[i18 * 3];
                                                    float[] fArr5 = new float[i18 * 2];
                                                    i2 = i4;
                                                    int i20 = 0;
                                                    int i21 = 0;
                                                    while (true) {
                                                        if (i20 < i18) {
                                                            int i22 = h00Var.i(iCeil2);
                                                            h00 h00Var2 = h00Var;
                                                            int i23 = ((i22 >> 1) ^ (-(i22 & 1))) + i21;
                                                            if (i23 >= 0 && i23 < iM4) {
                                                                int i24 = i20 * 3;
                                                                int i25 = i23 * 5;
                                                                fArr4[i24] = fArr3[i25];
                                                                fArr4[i24 + 1] = fArr3[i25 + 1];
                                                                fArr4[i24 + 2] = fArr3[i25 + 2];
                                                                int i26 = i20 * 2;
                                                                fArr5[i26] = fArr3[i25 + 3];
                                                                fArr5[i26 + 1] = fArr3[i25 + 4];
                                                                i20++;
                                                                i21 = i23;
                                                                h00Var = h00Var2;
                                                            }
                                                        } else {
                                                            tuVarArr[i15] = new tu(i16, i17, fArr4, fArr5);
                                                            i15++;
                                                            i14 = i19;
                                                            fArr2 = fArr3;
                                                            i4 = i2;
                                                            h00Var = h00Var;
                                                            i13 = 32;
                                                        }
                                                    }
                                                }
                                                lr3Var = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i2 = i4;
                                                lr3Var = new lr3(tuVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i2 = i4;
                                    lr3Var = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (lr3Var == null) {
                            return arrayList;
                        }
                        arrayList3.add(lr3Var);
                    } else {
                        c2 = c3;
                        arrayList = arrayList2;
                        z = z2;
                        i2 = i4;
                    }
                    be3Var2.N(iM2);
                    i3 = iM2;
                    c3 = c2;
                    z2 = z;
                    arrayList2 = arrayList;
                    i4 = i2;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static u13 L(byte[] bArr, int i2, int i3) {
        int iM;
        int iM2;
        int i4;
        boolean z;
        int i5;
        int iM3;
        boolean z2;
        boolean zH;
        int i6;
        int i7;
        int i8;
        int iM4;
        int iF;
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int iG;
        boolean zH2;
        boolean zH3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        h00 h00Var = new h00(bArr, i2 + 1, i3);
        int i19 = h00Var.i(8);
        int i20 = h00Var.i(8);
        int i21 = h00Var.i(8);
        int iM5 = h00Var.m();
        if (i19 == 100 || i19 == 110 || i19 == 122 || i19 == 244 || i19 == 44 || i19 == 83 || i19 == 86 || i19 == 118 || i19 == 128 || i19 == 138) {
            iM = h00Var.m();
            boolean zH4 = iM == 3 ? h00Var.h() : false;
            int iM6 = h00Var.m();
            iM2 = h00Var.m();
            h00Var.s();
            if (h00Var.h()) {
                int i22 = iM != 3 ? 8 : 12;
                i4 = 16;
                int i23 = 0;
                while (i23 < i22) {
                    if (h00Var.h()) {
                        int i24 = i23 < 6 ? 16 : 64;
                        int iN = 8;
                        int i25 = 8;
                        for (int i26 = 0; i26 < i24; i26++) {
                            if (iN != 0) {
                                iN = ((h00Var.n() + i25) + 256) % 256;
                            }
                            if (iN != 0) {
                                i25 = iN;
                            }
                        }
                    }
                    i23++;
                }
            } else {
                i4 = 16;
            }
            z = zH4;
            i5 = iM6;
        } else {
            iM = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            iM2 = 0;
        }
        int iM7 = h00Var.m() + 4;
        int iM8 = h00Var.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = h00Var.h();
                h00Var.n();
                h00Var.n();
                i19 = i19;
                long jM = h00Var.m();
                iM8 = iM8;
                for (int i27 = 0; i27 < jM; i27++) {
                    h00Var.m();
                }
                iM2 = iM2;
                z2 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            h00Var.m();
            h00Var.s();
            int iM9 = h00Var.m() + 1;
            int iM10 = h00Var.m() + 1;
            zH = h00Var.h();
            i6 = 2 - (zH ? 1 : 0);
            int i28 = iM10 * i6;
            if (!zH) {
                h00Var.s();
            }
            h00Var.s();
            i7 = iM9 * 16;
            i8 = i28 * 16;
            if (h00Var.h()) {
                int iM11 = h00Var.m();
                int iM12 = h00Var.m();
                int iM13 = h00Var.m();
                int iM14 = h00Var.m();
                if (iM == 0) {
                    i17 = 1;
                } else {
                    if (iM == 3) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    if (iM == 1) {
                        i18 = 2;
                    } else {
                        i18 = 1;
                    }
                    i6 *= i18;
                }
                i7 -= (iM11 + iM12) * i17;
                i8 -= (iM13 + iM14) * i6;
            }
            int i29 = i8;
            int i30 = i7;
            int i31 = i19;
            iM4 = ((i31 != 44 || i31 == 86 || i31 == 100 || i31 == 110 || i31 == 122 || i31 == 244) && (i20 & 16) != 0) ? 0 : i4;
            iF = -1;
            f2 = 1.0f;
            if (h00Var.h()) {
                if (!h00Var.h()) {
                    i14 = h00Var.i(8);
                    if (i14 == 255) {
                        int i32 = i4;
                        i15 = h00Var.i(i32);
                        i16 = h00Var.i(i32);
                        if (i15 != 0 && i16 != 0) {
                            f2 = i15 / i16;
                        }
                    } else if (i14 < 17) {
                        f2 = d[i14];
                    } else {
                        xa3.m(i14, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (h00Var.h()) {
                    h00Var.s();
                }
                if (h00Var.h()) {
                    h00Var.t(3);
                    if (h00Var.h()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (h00Var.h()) {
                        int i33 = h00Var.i(8);
                        int i34 = h00Var.i(8);
                        h00Var.t(8);
                        iF = c50.f(i33);
                        iG = c50.g(i34);
                    } else {
                        iG = -1;
                    }
                } else {
                    i13 = -1;
                    iG = -1;
                }
                if (h00Var.h()) {
                    h00Var.m();
                    h00Var.m();
                }
                if (h00Var.h()) {
                    h00Var.t(65);
                }
                zH2 = h00Var.h();
                if (zH2) {
                    W(h00Var);
                }
                zH3 = h00Var.h();
                if (zH3) {
                    W(h00Var);
                }
                if (zH2 || zH3) {
                    h00Var.s();
                }
                h00Var.s();
                if (h00Var.h()) {
                    h00Var.s();
                    h00Var.m();
                    h00Var.m();
                    h00Var.m();
                    h00Var.m();
                    iM4 = h00Var.m();
                    h00Var.m();
                }
                f3 = f2;
                i12 = iF;
                i10 = i13;
                i11 = iG;
                i9 = iM4;
            } else {
                iM7 = iM7;
                i9 = iM4;
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                i12 = -1;
            }
            return new u13(i31, i20, i21, iM5, i30, i29, f3, i5, iM2, z, zH, iM7, iM8, iM3, z2, i12, i10, i11, i9);
        }
        iM3 = h00Var.m() + 4;
        z2 = false;
        h00Var.m();
        h00Var.s();
        int iM15 = h00Var.m() + 1;
        int iM16 = h00Var.m() + 1;
        zH = h00Var.h();
        i6 = 2 - (zH ? 1 : 0);
        int i210 = iM16 * i6;
        if (!zH) {
            h00Var.s();
        }
        h00Var.s();
        i7 = iM15 * 16;
        i8 = i210 * 16;
        if (h00Var.h()) {
            int iM17 = h00Var.m();
            int iM18 = h00Var.m();
            int iM19 = h00Var.m();
            int iM110 = h00Var.m();
            if (iM == 0) {
                i17 = 1;
            } else {
                if (iM == 3) {
                    i17 = 1;
                } else {
                    i17 = 2;
                }
                if (iM == 1) {
                    i18 = 2;
                } else {
                    i18 = 1;
                }
                i6 *= i18;
            }
            i7 -= (iM17 + iM18) * i17;
            i8 -= (iM19 + iM110) * i6;
        }
        int i211 = i8;
        int i35 = i7;
        int i36 = i19;
        if (i36 != 44) {
        }
        iF = -1;
        f2 = 1.0f;
        if (h00Var.h()) {
            if (!h00Var.h()) {
                i14 = h00Var.i(8);
                if (i14 == 255) {
                    int i37 = i4;
                    i15 = h00Var.i(i37);
                    i16 = h00Var.i(i37);
                    if (i15 != 0) {
                        f2 = i15 / i16;
                    }
                } else if (i14 < 17) {
                    f2 = d[i14];
                } else {
                    xa3.m(i14, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (h00Var.h()) {
                h00Var.s();
            }
            if (h00Var.h()) {
                h00Var.t(3);
                if (h00Var.h()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (h00Var.h()) {
                    int i38 = h00Var.i(8);
                    int i39 = h00Var.i(8);
                    h00Var.t(8);
                    iF = c50.f(i38);
                    iG = c50.g(i39);
                } else {
                    iG = -1;
                }
            } else {
                i13 = -1;
                iG = -1;
            }
            if (h00Var.h()) {
                h00Var.m();
                h00Var.m();
            }
            if (h00Var.h()) {
                h00Var.t(65);
            }
            zH2 = h00Var.h();
            if (zH2) {
                W(h00Var);
            }
            zH3 = h00Var.h();
            if (zH3) {
                W(h00Var);
            }
            if (zH2) {
                h00Var.s();
            } else {
                h00Var.s();
            }
            h00Var.s();
            if (h00Var.h()) {
                h00Var.s();
                h00Var.m();
                h00Var.m();
                h00Var.m();
                h00Var.m();
                iM4 = h00Var.m();
                h00Var.m();
            }
            f3 = f2;
            i12 = iF;
            i10 = i13;
            i11 = iG;
            i9 = iM4;
        } else {
            iM7 = iM7;
            i9 = iM4;
            i10 = -1;
            i11 = -1;
            f3 = 1.0f;
            i12 = -1;
        }
        return new u13(i36, i20, i21, iM5, i35, i211, f3, i5, iM2, z, zH, iM7, iM8, iM3, z2, i12, i10, i11, i9);
    }

    public static final ug0 M(ba1 ba1Var) {
        int iOrdinal = ba1Var.v0().ordinal();
        ug0 ug0Var = ug0.n;
        if (iOrdinal != 0) {
            ug0 ug0Var2 = ug0.o;
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (ba1VarS == null) {
                    kf2.n("ActiveParent with no focused child");
                    return null;
                }
                ug0 ug0VarM = M(ba1VarS);
                ug0 ug0Var3 = ug0VarM != ug0Var ? ug0VarM : null;
                if (ug0Var3 != null) {
                    return ug0Var3;
                }
                if (ba1Var.C) {
                    return ug0Var;
                }
                ba1Var.C = true;
                try {
                    x91 x91VarS0 = ba1Var.s0();
                    ey eyVar = (ey) ((ra) j51.P(ba1Var)).getFocusOwner();
                    ba1 ba1VarF = eyVar.f();
                    x91VarS0.k.getClass();
                    ba1 ba1VarF2 = eyVar.f();
                    if (ba1VarF == ba1VarF2 || ba1VarF2 == null) {
                        return ug0Var;
                    }
                    return y91.d == y91.c ? ug0Var2 : ug0.p;
                } finally {
                    ba1Var.C = false;
                }
            }
            if (iOrdinal == 2) {
                return ug0Var2;
            }
            if (iOrdinal != 3) {
                er1.n();
                return null;
            }
        }
        return ug0Var;
    }

    public static final ug0 N(ba1 ba1Var) {
        if (!ba1Var.D) {
            ba1Var.D = true;
            try {
                x91 x91VarS0 = ba1Var.s0();
                ey eyVar = (ey) ((ra) j51.P(ba1Var)).getFocusOwner();
                ba1 ba1VarF = eyVar.f();
                x91VarS0.j.getClass();
                ba1 ba1VarF2 = eyVar.f();
                if (ba1VarF != ba1VarF2 && ba1VarF2 != null) {
                    return y91.d == y91.c ? ug0.o : ug0.p;
                }
            } finally {
                ba1Var.D = false;
            }
        }
        return ug0.n;
    }

    public static final ug0 O(ba1 ba1Var) {
        cx2 cx2VarC;
        w12 w12Var;
        int iOrdinal = ba1Var.v0().ordinal();
        ug0 ug0Var = ug0.n;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (ba1VarS != null) {
                    return M(ba1VarS);
                }
                kf2.n("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    er1.n();
                    return null;
                }
                if (!ba1Var.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2 cx2Var = ba1Var.n.r;
                c72 c72VarO = j51.O(ba1Var);
                loop0: while (true) {
                    if (c72VarO == null) {
                        cx2VarC = null;
                        break;
                    }
                    if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                        while (cx2Var != null) {
                            if ((cx2Var.p & 1024) != 0) {
                                cx2VarC = cx2Var;
                                f13 f13Var = null;
                                while (cx2VarC != null) {
                                    if (cx2VarC instanceof ba1) {
                                        break loop0;
                                    }
                                    if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                        int i2 = 0;
                                        for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                            if ((cx2Var2.p & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cx2VarC = cx2Var2;
                                                } else {
                                                    if (f13Var == null) {
                                                        f13Var = new f13(new cx2[16]);
                                                    }
                                                    if (cx2VarC != null) {
                                                        f13Var.b(cx2VarC);
                                                        cx2VarC = null;
                                                    }
                                                    f13Var.b(cx2Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cx2VarC = j51.c(f13Var);
                                }
                            }
                            cx2Var = cx2Var.r;
                        }
                    }
                    c72VarO = c72VarO.t();
                    cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
                }
                ba1 ba1Var2 = (ba1) cx2VarC;
                if (ba1Var2 == null) {
                    return ug0Var;
                }
                int iOrdinal2 = ba1Var2.v0().ordinal();
                if (iOrdinal2 == 0) {
                    return N(ba1Var2);
                }
                if (iOrdinal2 == 1) {
                    return O(ba1Var2);
                }
                if (iOrdinal2 == 2) {
                    return ug0.o;
                }
                if (iOrdinal2 != 3) {
                    er1.n();
                    return null;
                }
                ug0 ug0VarO = O(ba1Var2);
                ug0 ug0Var2 = ug0VarO != ug0Var ? ug0VarO : null;
                return ug0Var2 == null ? N(ba1Var2) : ug0Var2;
            }
        }
        return ug0Var;
    }

    public static final boolean P(ba1 ba1Var, boolean z) {
        int iOrdinal = ba1Var.v0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (!(ba1VarS != null ? P(ba1VarS, z) : true)) {
                    return false;
                }
                ba1Var.r0(z91.o, z91.p);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                er1.n();
                return false;
            }
        }
        return true;
    }

    public static final List Q(z34 z34Var) {
        int iY = rr2.y(z34Var, "id");
        int iY2 = rr2.y(z34Var, "seq");
        int iY3 = rr2.y(z34Var, "from");
        int iY4 = rr2.y(z34Var, "to");
        qb2 qb2VarR = gb.r();
        while (z34Var.O()) {
            qb2VarR.add(new ob1((int) z34Var.getLong(iY), (int) z34Var.getLong(iY2), z34Var.D(iY3), z34Var.D(iY4)));
        }
        return q40.J0(gb.f(qb2VarR));
    }

    public static final qq4 R(x34 x34Var, String str, boolean z) {
        z34 z34VarU = x34Var.U("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iY = rr2.y(z34VarU, "seqno");
            int iY2 = rr2.y(z34VarU, "cid");
            int iY3 = rr2.y(z34VarU, "name");
            int iY4 = rr2.y(z34VarU, "desc");
            if (iY != -1 && iY2 != -1 && iY3 != -1 && iY4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (z34VarU.O()) {
                    if (((int) z34VarU.getLong(iY2)) >= 0) {
                        int i2 = (int) z34VarU.getLong(iY);
                        String strD = z34VarU.D(iY3);
                        String str2 = z34VarU.getLong(iY4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), strD);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List listK0 = q40.K0(linkedHashMap.entrySet(), new jb2(4));
                ArrayList arrayList = new ArrayList(r40.k0(listK0, 10));
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listQ0 = q40.Q0(arrayList);
                List listK1 = q40.K0(linkedHashMap2.entrySet(), new jb2(5));
                ArrayList arrayList2 = new ArrayList(r40.k0(listK1, 10));
                Iterator it2 = listK1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                qq4 qq4Var = new qq4(str, z, listQ0, q40.Q0(arrayList2));
                ud3.e(z34VarU, null);
                return qq4Var;
            }
            ud3.e(z34VarU, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public static final b13 S(Object obj, rg1 rg1Var) {
        Object objH = rg1Var.H();
        if (objH == j80.a) {
            objH = B(obj);
            rg1Var.b0(objH);
        }
        b13 b13Var = (b13) objH;
        b13Var.setValue(obj);
        return b13Var;
    }

    public static final void T(vd0 vd0Var, Object obj) {
        if (!(vd0Var instanceof mr0)) {
            vd0Var.resumeWith(obj);
            return;
        }
        mr0 mr0Var = (mr0) vd0Var;
        pe0 pe0Var = mr0Var.q;
        wd0 wd0Var = mr0Var.r;
        Throwable thA = bb3.a(obj);
        Object a70Var = thA == null ? obj : new a70(thA, false);
        if (pe0Var.Y(wd0Var.getContext())) {
            mr0Var.s = a70Var;
            mr0Var.p = 1;
            pe0Var.W(wd0Var.getContext(), mr0Var);
            return;
        }
        g21 g21VarA = it4.a();
        if (g21VarA.p >= 4294967296L) {
            mr0Var.s = a70Var;
            mr0Var.p = 1;
            g21VarA.b0(mr0Var);
            return;
        }
        g21VarA.c0(true);
        try {
            s22 s22Var = (s22) wd0Var.getContext().K(fz0.h0);
            if (s22Var == null || s22Var.b()) {
                Object obj2 = mr0Var.t;
                ne0 context = wd0Var.getContext();
                Object objR = te5.R(context, obj2);
                f15 f15VarQ = objR != te5.b ? jz4.Q(wd0Var, context, objR) : null;
                try {
                    wd0Var.resumeWith(obj);
                    if (f15VarQ == null || f15VarQ.m0()) {
                        te5.K(context, objR);
                    }
                } catch (Throwable th) {
                    if (f15VarQ == null || f15VarQ.m0()) {
                        te5.K(context, objR);
                    }
                    throw th;
                }
            } else {
                mr0Var.resumeWith(kb4.o(s22Var.q()));
            }
            while (g21VarA.e0()) {
            }
        } catch (Throwable th2) {
            try {
                mr0Var.g(th2);
            } finally {
                g21VarA.a0(true);
            }
        }
    }

    public static final Object U(ba1 ba1Var, int i2, if1 if1Var) {
        int i3;
        int i4;
        Object objInvoke;
        cx2 cx2VarC;
        z72 z72VarU0;
        int iMax;
        int i5;
        w12 w12Var;
        if (!ba1Var.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var = ba1Var.n.r;
        c72 c72VarO = j51.O(ba1Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
            if (c72VarO == null) {
                cx2VarC = null;
                break;
            }
            if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                while (cx2Var != null) {
                    if ((cx2Var.p & 1024) != 0) {
                        cx2VarC = cx2Var;
                        f13 f13Var = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof ba1) {
                                break loop0;
                            }
                            if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                int i6 = 0;
                                for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                    if ((cx2Var2.p & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            cx2VarC = cx2Var2;
                                        } else {
                                            if (f13Var == null) {
                                                f13Var = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var.b(cx2Var2);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var);
                        }
                    }
                    cx2Var = cx2Var.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        ba1 ba1Var2 = (ba1) cx2VarC;
        if ((ba1Var2 == null || !h12.c(ba1Var2.u0(), ba1Var.u0())) && (z72VarU0 = ba1Var.u0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                kf2.o("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (z72VarU0.B.a.n() <= 0 || z72VarU0.B.a.m().a.isEmpty() || !z72VarU0.A) {
                return if1Var.invoke(z72.E);
            }
            boolean zR0 = z72VarU0.r0(i7);
            dc3 dc3Var = z72VarU0.B;
            if (zR0) {
                lm0 lm0Var = dc3Var.a;
                iMax = Math.min(lm0Var.n() - 1, ((xi2) q40.C0(lm0Var.m().a)).a);
            } else {
                iMax = Math.max(0, dc3Var.a.e);
            }
            jx3 jx3Var = new jx3();
            hg3 hg3Var = z72VarU0.C;
            hg3Var.getClass();
            v72 v72Var = new v72(iMax, iMax);
            ((f13) hg3Var.o).b(v72Var);
            jx3Var.n = v72Var;
            lm0 lm0Var2 = z72VarU0.B.a;
            if (lm0Var2.m().a.size() == 0) {
                i4 = 0;
            } else {
                int iX = te5.x(lm0Var2.m());
                int i8 = lm0Var2.m().b + lm0Var2.m().c;
                if (i8 != 0 && (i5 = iX / i8) >= 1) {
                    i4 = i5;
                }
            }
            int i9 = i4 * 2;
            int iN = z72VarU0.B.a.n();
            if (i9 > iN) {
                i9 = iN;
            }
            while (objInvoke == null && z72VarU0.q0((v72) jx3Var.n, i7) && i3 < i9) {
                v72 v72Var2 = (v72) jx3Var.n;
                int i10 = v72Var2.a;
                int i11 = v72Var2.b;
                if (z72VarU0.r0(i7)) {
                    i11++;
                } else {
                    i10--;
                }
                hg3 hg3Var2 = z72VarU0.C;
                hg3Var2.getClass();
                v72 v72Var3 = new v72(i10, i11);
                ((f13) hg3Var2.o).b(v72Var3);
                ((f13) z72VarU0.C.o).j((v72) jx3Var.n);
                jx3Var.n = v72Var3;
                i3++;
                j51.O(z72VarU0).l();
                objInvoke = if1Var.invoke(new y72(z72VarU0, jx3Var, i7));
            }
            ((f13) z72VarU0.C.o).j((v72) jx3Var.n);
            j51.O(z72VarU0).l();
            return objInvoke;
        }
        return null;
    }

    public static String V(Context context, long j2) {
        if (j2 >= 1073741824) {
            String string = context.getString(R.string.homemusic_size_gb, Double.valueOf(j2 / 1.073741824E9d));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.homemusic_size_mb, Double.valueOf(j2 / 1048576.0d));
        string2.getClass();
        return string2;
    }

    public static void W(h00 h00Var) {
        int iM = h00Var.m() + 1;
        h00Var.t(8);
        for (int i2 = 0; i2 < iM; i2++) {
            h00Var.m();
            h00Var.m();
            h00Var.s();
        }
        h00Var.t(20);
    }

    public static final int X(int i2) {
        if (i2 == 0) {
            throw null;
        }
        int iW = xa3.w(i2);
        if (iW == 0) {
            return 0;
        }
        int i3 = 1;
        if (iW != 1) {
            i3 = 2;
            if (iW != 2) {
                i3 = 3;
                if (iW != 3) {
                    i3 = 4;
                    if (iW != 4) {
                        if (iW == 5) {
                            return 5;
                        }
                        er1.n();
                        return 0;
                    }
                }
            }
        }
        return i3;
    }

    public static final ly4 Y(Context context, int i2) {
        lp1 lp1Var = lp1.a;
        long jA = lp1.a(i2, "play");
        long jA2 = lp1.a(i2, "preload");
        return new ly4(V(context, jA + jA2), V(context, jA), V(context, jA2));
    }

    public static final long Z(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        if (i2 <= 15) {
            return j2;
        }
        if (i2 == s50.u.c) {
            return e35.U(j2);
        }
        if ((i2 == s50.v.c || i2 == s50.w.c) && Build.VERSION.SDK_INT < 34) {
            return e35.U(j2);
        }
        return (i2 != s50.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : e35.U(j2);
    }

    public static final void a(final lm0 lm0Var, final dx2 dx2Var, final ac3 ac3Var, rv2 rv2Var, final float f2, gs gsVar, wg4 wg4Var, final boolean z, final if1 if1Var, y43 y43Var, rv2 rv2Var2, tb tbVar, final r70 r70Var, rg1 rg1Var, final int i2) {
        final rv2 rv2Var3;
        final gs gsVar2;
        final wg4 wg4Var2;
        final y43 y43Var2;
        final rv2 rv2Var4;
        final tb tbVar2;
        int i3;
        boolean z2;
        tb tbVar3;
        wg4 wg4Var3;
        y43 y43Var3;
        int i4;
        rv2 rv2Var5;
        gs gsVar3;
        tb tbVar4;
        lv3 lv3VarU;
        rg1Var.S(1860873769);
        int i5 = i2 | (rg1Var.e(lm0Var) ? 4 : 2) | 5794816 | (rg1Var.f(z) ? 67108864 : 33554432) | 805306368;
        int i6 = (rg1Var.g(if1Var) ? 4 : 2) | 26000;
        if (rg1Var.K(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            rg1Var.O(-127, null, 0, null);
            if ((i2 & 1) == 0 || !rg1Var.w() || rg1Var.w || !((lv3VarU = rg1Var.u()) == null || (lv3VarU.b & 4) == 0)) {
                rv2 rv2Var6 = rv2.x;
                gs gsVar4 = fz0.x;
                int i7 = (i5 & 14) | 196608;
                Object sc3Var = new sc3();
                float f3 = xj4.a;
                qr3 qr3Var = g90.h;
                oo0 oo0Var = (oo0) rg1Var.i(qr3Var);
                boolean zC = rg1Var.c(oo0Var.g());
                Object objH = rg1Var.H();
                Object obj = j80.a;
                if (zC || objH == obj) {
                    objH = new ui0(new rm2(oo0Var));
                    rg1Var.b0(objH);
                }
                ui0 ui0Var = (ui0) objH;
                int i8 = n85.a;
                ck4 ck4VarS = au0.S(1);
                Object obj2 = (oo0) rg1Var.i(qr3Var);
                qr3 qr3Var2 = g90.n;
                r62 r62Var = (r62) rg1Var.i(qr3Var2);
                boolean zE = ((((i7 & 14) ^ 6) > 4 && rg1Var.e(lm0Var)) || (i7 & 6) == 4) | rg1Var.e(ui0Var) | rg1Var.e(ck4VarS) | rg1Var.e(sc3Var) | rg1Var.e(obj2) | rg1Var.d(r62Var.ordinal());
                Object objH2 = rg1Var.H();
                if (zE || objH2 == obj) {
                    gc3 gc3Var = new gc3(0, lm0Var, r62Var);
                    rf2 rf2Var = new rf2();
                    rf2Var.n = lm0Var;
                    rf2Var.o = gc3Var;
                    Object wg4Var4 = new wg4(rf2Var, ui0Var, ck4VarS);
                    rg1Var.b0(wg4Var4);
                    objH2 = wg4Var4;
                }
                wg4 wg4Var5 = (wg4) objH2;
                i3 = i5 & (-29360129);
                int i9 = (i5 & 14) | 432;
                r62 r62Var2 = (r62) rg1Var.i(qr3Var2);
                boolean zD = rg1Var.d(r62Var2.ordinal()) | ((((i9 & 14) ^ 6) > 4 && rg1Var.e(lm0Var)) || (i9 & 6) == 4);
                Object objH3 = rg1Var.H();
                if (zD || objH3 == obj) {
                    objH3 = new jm0(lm0Var, r62Var2);
                    rg1Var.b0(objH3);
                }
                jm0 jm0Var = (jm0) objH3;
                rv2 rv2Var7 = rv2.C;
                l90 l90Var = sb3.a;
                rg1Var.R(282942128);
                ub ubVar = (ub) rg1Var.i(sb3.a);
                if (ubVar == null) {
                    z2 = false;
                    rg1Var.o(false);
                    tbVar3 = null;
                } else {
                    boolean zE2 = rg1Var.e(ubVar);
                    Object objH4 = rg1Var.H();
                    if (zE2 || objH4 == obj) {
                        objH4 = new tb(ubVar.a, ubVar.b, ubVar.c, ubVar.d);
                        rg1Var.b0(objH4);
                    }
                    z2 = false;
                    rg1Var.o(false);
                    tbVar3 = (tb) objH4;
                }
                wg4Var3 = wg4Var5;
                y43Var3 = jm0Var;
                rv2Var4 = rv2Var7;
                i4 = i6 & (-7281);
                rv2Var5 = rv2Var6;
                gsVar3 = gsVar4;
                tbVar4 = tbVar3;
            } else {
                rg1Var.N();
                int i10 = i6 & (-7281);
                rv2Var5 = rv2Var;
                rv2Var4 = rv2Var2;
                tbVar4 = tbVar;
                i3 = i5 & (-29360129);
                i4 = i10;
                z2 = false;
                gsVar3 = gsVar;
                wg4Var3 = wg4Var;
                y43Var3 = y43Var;
            }
            rg1Var.o(z2);
            lv3 lv3VarU2 = rg1Var.u();
            if (lv3VarU2 != null) {
                int i11 = lv3VarU2.b;
                if ((i11 & 1) != 0) {
                    lv3VarU2.b = i11 | 2;
                }
            }
            y43 y43Var4 = y43Var3;
            ya4.b(dx2Var, lm0Var, ac3Var, wg4Var3, z, tbVar4, f2, rv2Var5, y43Var4, if1Var, gsVar3, rv2Var4, r70Var, rg1Var, ((i3 >> 6) & 3670016) | ((i3 << 3) & 112) | 28038 | 905969664, ((i4 << 6) & 896) | 1797126);
            tbVar2 = tbVar4;
            rv2Var3 = rv2Var5;
            gsVar2 = gsVar3;
            wg4Var2 = wg4Var3;
            y43Var2 = y43Var4;
        } else {
            rg1Var.N();
            rv2Var3 = rv2Var;
            gsVar2 = gsVar;
            wg4Var2 = wg4Var;
            y43Var2 = y43Var;
            rv2Var4 = rv2Var2;
            tbVar2 = tbVar;
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new wf1(dx2Var, ac3Var, rv2Var3, f2, gsVar2, wg4Var2, z, if1Var, y43Var2, rv2Var4, tbVar2, r70Var, i2) { // from class: hc3
                public final /* synthetic */ dx2 o;
                public final /* synthetic */ ac3 p;
                public final /* synthetic */ rv2 q;
                public final /* synthetic */ float r;
                public final /* synthetic */ gs s;
                public final /* synthetic */ wg4 t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ if1 v;
                public final /* synthetic */ y43 w;
                public final /* synthetic */ rv2 x;
                public final /* synthetic */ tb y;
                public final /* synthetic */ r70 z;

                @Override // defpackage.wf1
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iO = xl.O(197041);
                    uc5.a(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (rg1) obj3, iO);
                    return j15.a;
                }
            };
        }
    }

    public static final o53 a0(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new o53(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i2 = objectInputStream.readInt();
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = objectInputStream.readInt();
                }
                int i4 = objectInputStream.readInt();
                int[] iArr2 = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr2[i5] = objectInputStream.readInt();
                }
                o53 o53VarN = fu.n(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return o53VarN;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                q05.h(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final LinkedHashSet b(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new lc0(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                q05.h(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static int b0(int i2, byte[] bArr) {
        int i3;
        synchronized (e) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = f;
                    if (iArr.length <= i5) {
                        f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = f[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static void c(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.Y, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, h, "Theme.MaterialComponents");
            }
        }
        h(context, g, "Theme.AppCompat");
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static h33 e(TypedValue typedValue, h33 h33Var, h33 h33Var2, String str, String str2) throws XmlPullParserException {
        if (h33Var == null || h33Var == h33Var2) {
            return h33Var == null ? h33Var2 : h33Var;
        }
        StringBuilder sbU = b11.u("Type is ", str, " but found ", str2, ": ");
        sbU.append(typedValue.data);
        throw new XmlPullParserException(sbU.toString());
    }

    public static void f(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void g(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.Y, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        kf2.n("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                kf2.n(xa3.h("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static Parcelable j(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList k(List list, Parcelable.Creator creator) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(j((Parcelable) list.get(i2), creator));
        }
        return arrayList;
    }

    public static final sc5 l(Context context, r90 r90Var) {
        q24 q24VarI;
        context.getClass();
        bq4 bq4Var = new bq4(r90Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ia4 ia4Var = (ia4) bq4Var.n;
        ia4Var.getClass();
        xi4 xi4Var = r90Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        xi4Var.getClass();
        if (z) {
            q24VarI = new q24(applicationContext, WorkDatabase.class, null);
            q24VarI.i = true;
        } else {
            q24VarI = vr1.i(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            q24VarI.h = new ss2(25, applicationContext);
        }
        q24VarI.f = ia4Var;
        q24VarI.d.add(new m30(xi4Var));
        q24VarI.a(kw2.h);
        q24VarI.a(new k04(applicationContext, 2, 3));
        q24VarI.a(kw2.i);
        q24VarI.a(kw2.j);
        q24VarI.a(new k04(applicationContext, 5, 6));
        q24VarI.a(kw2.k);
        q24VarI.a(kw2.l);
        q24VarI.a(kw2.m);
        q24VarI.a(new k04(applicationContext));
        q24VarI.a(new k04(applicationContext, 10, 11));
        q24VarI.a(kw2.d);
        q24VarI.a(kw2.e);
        q24VarI.a(kw2.f);
        q24VarI.a(kw2.g);
        q24VarI.a(new k04(applicationContext, 21, 22));
        q24VarI.p = false;
        q24VarI.q = true;
        WorkDatabase workDatabase = (WorkDatabase) q24VarI.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        z40 z40Var = new z40(bq4Var, applicationContext2);
        pq3 pq3Var = new pq3(context.getApplicationContext(), r90Var, bq4Var, workDatabase);
        int i2 = tc5.n;
        String str = c64.a;
        dq4 dq4Var = new dq4(context, workDatabase, r90Var);
        yb3.a(context, SystemJobService.class, true);
        cx.f().b(c64.a, "Created SystemJobScheduler and enabled SystemJobService");
        return new sc5(context.getApplicationContext(), r90Var, bq4Var, workDatabase, gb.P(dq4Var, new dk1(context, r90Var, z40Var, pq3Var, new rm3(pq3Var, bq4Var), bq4Var)), pq3Var, z40Var);
    }

    public static final long m() {
        return Thread.currentThread().getId();
    }

    public static final f13 n() {
        z05 z05Var = ph4.b;
        f13 f13Var = (f13) z05Var.f();
        if (f13Var != null) {
            return f13Var;
        }
        f13 f13Var2 = new f13(new qg1[0]);
        z05Var.n(f13Var2);
        return f13Var2;
    }

    public static int o(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        rr2.w(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            i(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            i(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            i(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    i(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static Drawable p(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (i) {
                return A(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i2);
        } catch (NoClassDefFoundError unused2) {
            i = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = g14.a;
        return resources.getDrawable(i2, theme);
    }

    public static String q(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                uw1 uw1VarJ = yw1.j();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iO = o(bArr, i3, bArr.length, zArr);
                    if (iO != bArr.length) {
                        uw1VarJ.c(Integer.valueOf(iO));
                    }
                    i3 = iO + 3;
                }
                gy3 gy3VarF = uw1VarJ.f();
                for (int i4 = 0; i4 < gy3VarF.q; i4++) {
                    if (((Integer) gy3VarF.get(i4)).intValue() + 3 < length) {
                        h00 h00Var = new h00(bArr, ((Integer) gy3VarF.get(i4)).intValue() + 3, length);
                        v2 v2VarF = F(h00Var);
                        if (v2VarF.a == 33 && v2VarF.b == 0) {
                            h00Var.t(4);
                            int i5 = h00Var.i(3);
                            h00Var.s();
                            p13 p13VarG = G(h00Var, true, i5, null);
                            return i40.a(p13VarG.a, p13VarG.b, p13VarG.c, p13VarG.d, p13VarG.e, p13VarG.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String r(tb1 tb1Var) {
        String str = tb1Var.n;
        String str2 = tb1Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return tb1Var.n;
    }

    public static final void s(ne0 ne0Var, Throwable th) {
        try {
            qe0 qe0Var = (qe0) ne0Var.K(fz0.S);
            if (qe0Var != null) {
                qe0Var.n(ne0Var, th);
            } else {
                q05.o(ne0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j51.d(runtimeException, th);
                th = runtimeException;
            }
            q05.o(ne0Var, th);
        }
    }

    public static final int t(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final int u(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        kf2.n(b11.j(i2, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    public static final int v(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return 6;
        }
        kf2.n(b11.j(i2, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final int w(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        kf2.n(b11.j(i2, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final int x(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (i2 == 5) {
            return 6;
        }
        kf2.n(b11.j(i2, "Could not convert ", " to State"));
        return 0;
    }

    public static boolean y(byte[] bArr, int i2, tb1 tb1Var) {
        int i3;
        if (Objects.equals(tb1Var.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(tb1Var.n, "video/hevc")) {
            v2 v2VarF = F(new h00(bArr, 4, i2 + 4));
            int i4 = v2VarF.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && v2VarF.c == tb1Var.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean z(tv tvVar) {
        tvVar.getClass();
        try {
            tv tvVar2 = new tv();
            long j2 = tvVar.o;
            long j3 = 64;
            if (j2 <= 64) {
                j3 = j2;
            }
            tvVar.n(tvVar2, 0L, j3);
            for (int i2 = 0; i2 < 16 && !tvVar2.l(); i2++) {
                int iR = tvVar2.R();
                if (Character.isISOControl(iR) && !Character.isWhitespace(iR)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }
}
