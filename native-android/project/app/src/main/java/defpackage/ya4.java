package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.ActionMode;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ya4 {
    public static final i61 b;
    public static i61 c;
    public static final ca1 a = new ca1(16);
    public static final f01 d = new f01(1, "NONE");
    public static final f01 e = new f01(1, "PENDING");

    static {
        Object obj = null;
        b = new i61(obj, obj, obj, false, 8);
    }

    public static final long A(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * fIntBitsToFloat2) + (f3 * fIntBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = f5 * fIntBitsToFloat2;
        return (((long) Float.floatToRawIntBits((((f4 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits((f11 + (f2 * fIntBitsToFloat) + f8) * f10)) & 4294967295L);
    }

    public static final void B(float[] fArr, v03 v03Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = v03Var.b;
        float f11 = v03Var.c;
        float f12 = v03Var.d;
        float f13 = v03Var.e;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        v03Var.b = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        v03Var.c = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        v03Var.d = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        v03Var.e = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    public static ne0 C(le0 le0Var, me0 me0Var) {
        me0Var.getClass();
        return h12.c(le0Var.getKey(), me0Var) ? q01.n : le0Var;
    }

    public static Object D(bp0 bp0Var, gf1 gf1Var) {
        ch4 ox4Var;
        ch4 ch4Var = (ch4) jh4.b.f();
        if (ch4Var instanceof ox4) {
            ox4 ox4Var2 = (ox4) ch4Var;
            if (ox4Var2.t == te5.m()) {
                if1 if1Var = ox4Var2.r;
                if1 if1Var2 = ox4Var2.s;
                try {
                    ((ox4) ch4Var).r = jh4.k(bp0Var, if1Var, true);
                    ((ox4) ch4Var).s = if1Var2;
                    return gf1Var.invoke();
                } finally {
                    ox4Var2.r = if1Var;
                    ox4Var2.s = if1Var2;
                }
            }
        }
        if (ch4Var == null || (ch4Var instanceof a13)) {
            ox4Var = new ox4(ch4Var instanceof a13 ? (a13) ch4Var : null, bp0Var, null, true, false);
        } else {
            ox4Var = ch4Var.u(bp0Var);
        }
        try {
            ch4 ch4VarJ = ox4Var.j();
            try {
                Object objInvoke = gf1Var.invoke();
                ch4.q(ch4VarJ);
                ox4Var.c();
                return objInvoke;
            } catch (Throwable th) {
                ch4.q(ch4VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            ox4Var.c();
            throw th2;
        }
    }

    public static final ArrayList E(List list, List list2) {
        ju3 ju3Var = ku3.n;
        if (list == null) {
            list = u01.n;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ArtistID3) obj).getId() != null) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (hashSet.add(((ArtistID3) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        List listA0 = gb.a0(arrayList2, ju3Var);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = (ArrayList) listA0;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            hashSet2.add(((ArtistID3) obj3).getId());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            ArtistID3 artistID3 = (ArtistID3) obj4;
            if (artistID3.getId() != null && !hashSet2.contains(artistID3.getId())) {
                arrayList4.add(obj4);
            }
        }
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayList4.size();
        while (i < size3) {
            Object obj5 = arrayList4.get(i);
            i++;
            if (hashSet3.add(((ArtistID3) obj5).getId())) {
                arrayList5.add(obj5);
            }
        }
        return q40.G0(listA0, gb.a0(arrayList5, ju3Var));
    }

    public static ne0 F(le0 le0Var, ne0 ne0Var) {
        ne0Var.getClass();
        return ne0Var == q01.n ? le0Var : (ne0) ne0Var.s(new d60(9, (byte) 0), le0Var);
    }

    public static final void G(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static void H(ch4 ch4Var, ch4 ch4Var2, if1 if1Var) {
        if (ch4Var != ch4Var2) {
            ch4Var2.getClass();
            ch4.q(ch4Var);
            ch4Var2.c();
        } else if (ch4Var instanceof ox4) {
            ((ox4) ch4Var).r = if1Var;
        } else if (ch4Var instanceof px4) {
            ((px4) ch4Var).h = if1Var;
        } else {
            mj0.g(ch4Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void I(TextView textView, int i) {
        l93.k(i);
        if (Build.VERSION.SDK_INT >= 28) {
            ne.r(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i) {
        l93.k(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void K(TextView textView, int i) {
        l93.k(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final vu3 L(gc0 gc0Var, td0 td0Var, il4 il4Var, Float f) {
        y00.d.getClass();
        x00 x00Var = x00.a;
        rf2 rf2Var = new rf2(gc0Var, q01.n);
        nl4 nl4VarA = a(f);
        fu.F(td0Var, (ne0) rf2Var.o, il4Var.equals(id4.a) ? ze0.n : ze0.q, new x70(il4Var, (p81) rf2Var.n, nl4VarA, f, null, 4));
        return new vu3(nl4VarA);
    }

    public static final int M(h03 h03Var) {
        int iB;
        int i = h03Var.b;
        int iB2 = h03Var.b(0);
        while (h03Var.b != 0 && h03Var.b(0) == iB2) {
            int i2 = h03Var.b;
            if (i2 == 0) {
                kf2.m("IntList is empty.");
                return 0;
            }
            h03Var.d(0, h03Var.a[i2 - 1]);
            h03Var.c(h03Var.b - 1);
            int i3 = h03Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iB3 = h03Var.b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iB4 = h03Var.b(i7);
                if (i6 < i3 && (iB = h03Var.b(i6)) > iB4) {
                    if (iB <= iB3) {
                        break;
                    }
                    h03Var.d(i5, iB);
                    h03Var.d(i6, iB3);
                    i5 = i6;
                } else {
                    if (iB4 <= iB3) {
                        break;
                    }
                    h03Var.d(i5, iB4);
                    h03Var.d(i7, iB3);
                    i5 = i7;
                }
            }
        }
        return iB2;
    }

    public static void N(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static ActionMode.Callback O(ActionMode.Callback callback) {
        return (!(callback instanceof dt4) || Build.VERSION.SDK_INT < 26) ? callback : ((dt4) callback).a;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof dt4) || callback == null) ? callback : new dt4(callback, textView);
    }

    public static Object Q(wf1 wf1Var, Object obj, vd0 vd0Var) {
        wf1Var.getClass();
        ne0 context = vd0Var.getContext();
        Object k12Var = context == q01.n ? new k12(vd0Var) : new l12(vd0Var, context);
        jz4.j(2, wf1Var);
        return wf1Var.invoke(obj, k12Var);
    }

    public static final nl4 a(Object obj) {
        if (obj == null) {
            obj = xl.e;
        }
        return new nl4(obj);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x02d2  */
    public static final void b(dx2 dx2Var, final lm0 lm0Var, final ac3 ac3Var, wg4 wg4Var, final boolean z, final tb tbVar, final float f, final rv2 rv2Var, y43 y43Var, final if1 if1Var, final gs gsVar, final rv2 rv2Var2, final r70 r70Var, rg1 rg1Var, final int i, final int i2) {
        int i3;
        int i4;
        wg4 wg4Var2;
        lm0 lm0Var2;
        y43 y43Var2;
        dx2 dx2Var2;
        boolean z2;
        int i5;
        final boolean z3;
        dx2 dx2VarY;
        dx2 dx2VarC;
        Object obj = fz0.z;
        rg1Var.S(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (rg1Var.e(dx2Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rg1Var.e(lm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rg1Var.e(ac3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= rg1Var.f(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rg1Var.d(1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= rg1Var.e(wg4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= rg1Var.f(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rg1Var.e(tbVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rg1Var.d(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rg1Var.c(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rg1Var.e(rv2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rg1Var.g(y43Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= rg1Var.g(if1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rg1Var.e(obj) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rg1Var.e(gsVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= rg1Var.e(rv2Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rg1Var.g(r70Var) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (rg1Var.K(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            int i7 = i3 & 112;
            boolean z4 = i7 == 32;
            Object objH = rg1Var.H();
            Object obj2 = j80.a;
            if (z4 || objH == obj2) {
                objH = new h82(lm0Var, 0);
                rg1Var.b0(objH);
            }
            Object obj3 = (gf1) objH;
            int i8 = i3 >> 3;
            int i9 = i8 & 14;
            int i10 = i6 >> 15;
            int i11 = i9 | (i10 & 112) | (i6 & 896);
            Object objS = uc5.S(r70Var, rg1Var);
            Object objS2 = uc5.S(if1Var, rg1Var);
            boolean zE = ((((i11 & 14) ^ 6) > 4 && rg1Var.e(lm0Var)) || (i11 & 6) == 4) | rg1Var.e(objS) | rg1Var.e(objS2) | rg1Var.e(obj3);
            Object objH2 = rg1Var.H();
            if (zE || objH2 == obj2) {
                rv2 rv2Var3 = rv2.A;
                jo joVar = new jo(objS, objS2, obj3, 5);
                z05 z05Var = ph4.a;
                objH2 = new k82(0, 0, kl4.class, new dp0(new fa(11, new dp0(joVar, rv2Var3), lm0Var), rv2Var3), "value", "getValue()Ljava/lang/Object;");
                rg1Var.b0(objH2);
            }
            k82 k82Var = (k82) objH2;
            Object objH3 = rg1Var.H();
            if (objH3 == obj2) {
                Object yy3Var = new yy3(rg1Var.R);
                rg1Var.b0(yy3Var);
                objH3 = yy3Var;
            }
            final we0 we0Var = (we0) objH3;
            boolean z5 = i7 == 32;
            Object objH4 = rg1Var.H();
            if (z5 || objH4 == obj2) {
                objH4 = new h82(lm0Var, 1);
                rg1Var.b0(objH4);
            }
            gf1 gf1Var = (gf1) objH4;
            int i12 = i3 >> 9;
            int i13 = (i3 & 65520) | (i12 & 458752) | (i12 & 3670016) | ((i6 << 21) & 29360128);
            int i14 = i6 << 15;
            int i15 = i13 | (i14 & 234881024) | (i14 & 1879048192);
            boolean z6 = ((((i15 & 896) ^ 384) > 256 && rg1Var.e(ac3Var)) || (i15 & 384) == 256) | ((((i15 & 112) ^ 48) > 32 && rg1Var.e(lm0Var)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && rg1Var.f(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) > 16384 && rg1Var.d(1)) {
                z2 = true;
            } else if ((i15 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z6 | z2 | ((((i15 & 234881024) ^ 100663296) > 67108864 && rg1Var.e(obj)) || (i15 & 100663296) == 67108864) | ((((i15 & 1879048192) ^ 805306368) > 536870912 && rg1Var.e(gsVar)) || (i15 & 805306368) == 536870912) | ((((i15 & 3670016) ^ 1572864) > 1048576 && rg1Var.c(f)) || (i15 & 1572864) == 1048576) | ((((i15 & 29360128) ^ 12582912) > 8388608 && rg1Var.e(rv2Var)) || (i15 & 12582912) == 8388608);
            int i16 = 4;
            boolean zE2 = ((((i15 & 458752) ^ 196608) > 131072 && rg1Var.d(0)) || (i15 & 196608) == 131072) | z7 | ((((i10 & 14) ^ 6) > 4 && rg1Var.e(rv2Var2)) || (i10 & 6) == 4) | rg1Var.e(gf1Var) | rg1Var.e(we0Var);
            Object objH5 = rg1Var.H();
            if (zE2 || objH5 == obj2) {
                i5 = 32;
                objH5 = new pc3(lm0Var, ac3Var, f, rv2Var, k82Var, gf1Var, gsVar, rv2Var2, we0Var);
                rg1Var.b0(objH5);
            } else {
                i5 = 32;
            }
            pc3 pc3Var = (pc3) objH5;
            boolean zF = (((i9 ^ 6) > 4 && rg1Var.e(lm0Var)) || (i8 & 6) == 4) | rg1Var.f(false);
            Object objH6 = rg1Var.H();
            if (zF || objH6 == obj2) {
                objH6 = new s82(lm0Var, false);
                rg1Var.b0(objH6);
            }
            s82 s82Var = (s82) objH6;
            boolean z8 = (r39 == i5) | ((i3 & 458752) == 131072);
            Object objH7 = rg1Var.H();
            if (z8 || objH7 == obj2) {
                wg4Var2 = wg4Var;
                objH7 = new gd3(wg4Var2, lm0Var);
                rg1Var.b0(objH7);
            } else {
                wg4Var2 = wg4Var;
            }
            gd3 gd3Var = (gd3) objH7;
            fv fvVar = (fv) rg1Var.i(hv.a);
            r62 r62Var = (r62) rg1Var.i(g90.n);
            boolean zE3 = (i7 == i5) | rg1Var.e(fvVar) | rg1Var.d(r62Var.ordinal());
            Object objH8 = rg1Var.H();
            if (zE3 || objH8 == obj2) {
                objH8 = new ec3(lm0Var, fvVar, r62Var);
                rg1Var.b0(objH8);
            }
            ec3 ec3Var = (ec3) objH8;
            ax2 ax2Var = ax2.a;
            if (z) {
                rg1Var.R(-853734429);
                int i17 = i9 | ((i3 >> 21) & 112);
                boolean z9 = ((((i17 & 14) ^ 6) > 4 && rg1Var.e(lm0Var)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) > i5 && rg1Var.d(0)) || (i17 & 48) == i5);
                Object objH9 = rg1Var.H();
                if (z9 || objH9 == obj2) {
                    objH9 = new dc3(lm0Var);
                    rg1Var.b0(objH9);
                }
                dx2VarY = ji2.y((dc3) objH9, lm0Var.v);
                z3 = false;
                rg1Var.o(false);
            } else {
                z3 = false;
                rg1Var.R(-853304645);
                rg1Var.o(false);
                dx2VarY = ax2Var;
            }
            dx2Var2 = dx2Var;
            dx2 dx2VarL = rr2.L(dx2Var2.c(lm0Var.y).c(lm0Var.w), k82Var, s82Var, z);
            if (z) {
                if1 if1Var2 = new if1() { // from class: ic3
                    @Override // defpackage.if1
                    public final Object invoke(Object obj4) {
                        q94 q94Var = (q94) obj4;
                        boolean z10 = z3;
                        final lm0 lm0Var3 = lm0Var;
                        final we0 we0Var2 = we0Var;
                        if (z10) {
                            final int i18 = 0;
                            gf1 gf1Var2 = new gf1() { // from class: jc3
                                @Override // defpackage.gf1
                                public final Object invoke() {
                                    int i19 = i18;
                                    vd0 vd0Var = null;
                                    we0 we0Var3 = we0Var2;
                                    lm0 lm0Var4 = lm0Var3;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    int i20 = 1;
                                    switch (i19) {
                                        case 0:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z11 = true;
                                            }
                                            return Boolean.valueOf(z11);
                                        case 1:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i20), 3);
                                                z14 = true;
                                            }
                                            return Boolean.valueOf(z14);
                                        case 2:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z13 = true;
                                            }
                                            return Boolean.valueOf(z13);
                                        default:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i20), 3);
                                                z12 = true;
                                            }
                                            return Boolean.valueOf(z12);
                                    }
                                }
                            };
                            c42[] c42VarArr = o94.a;
                            q94Var.a(d94.x, new w2(null, gf1Var2));
                            final int i19 = 1;
                            q94Var.a(d94.z, new w2(null, new gf1() { // from class: jc3
                                @Override // defpackage.gf1
                                public final Object invoke() {
                                    int i110 = i19;
                                    vd0 vd0Var = null;
                                    we0 we0Var3 = we0Var2;
                                    lm0 lm0Var4 = lm0Var3;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    int i20 = 1;
                                    switch (i110) {
                                        case 0:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z11 = true;
                                            }
                                            return Boolean.valueOf(z11);
                                        case 1:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i20), 3);
                                                z14 = true;
                                            }
                                            return Boolean.valueOf(z14);
                                        case 2:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z13 = true;
                                            }
                                            return Boolean.valueOf(z13);
                                        default:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i20), 3);
                                                z12 = true;
                                            }
                                            return Boolean.valueOf(z12);
                                    }
                                }
                            }));
                        } else {
                            final int i20 = 2;
                            gf1 gf1Var3 = new gf1() { // from class: jc3
                                @Override // defpackage.gf1
                                public final Object invoke() {
                                    int i110 = i20;
                                    vd0 vd0Var = null;
                                    we0 we0Var3 = we0Var2;
                                    lm0 lm0Var4 = lm0Var3;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    int i21 = 1;
                                    switch (i110) {
                                        case 0:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z11 = true;
                                            }
                                            return Boolean.valueOf(z11);
                                        case 1:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i21), 3);
                                                z14 = true;
                                            }
                                            return Boolean.valueOf(z14);
                                        case 2:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z13 = true;
                                            }
                                            return Boolean.valueOf(z13);
                                        default:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i21), 3);
                                                z12 = true;
                                            }
                                            return Boolean.valueOf(z12);
                                    }
                                }
                            };
                            c42[] c42VarArr2 = o94.a;
                            q94Var.a(d94.y, new w2(null, gf1Var3));
                            final int i21 = 3;
                            q94Var.a(d94.A, new w2(null, new gf1() { // from class: jc3
                                @Override // defpackage.gf1
                                public final Object invoke() {
                                    int i110 = i21;
                                    vd0 vd0Var = null;
                                    we0 we0Var3 = we0Var2;
                                    lm0 lm0Var4 = lm0Var3;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    int i22 = 1;
                                    switch (i110) {
                                        case 0:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z11 = true;
                                            }
                                            return Boolean.valueOf(z11);
                                        case 1:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i22), 3);
                                                z14 = true;
                                            }
                                            return Boolean.valueOf(z14);
                                        case 2:
                                            if (lm0Var4.b()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, z11 ? 1 : 0), 3);
                                                z13 = true;
                                            }
                                            return Boolean.valueOf(z13);
                                        default:
                                            if (lm0Var4.c()) {
                                                fu.G(we0Var3, null, null, new kc3(lm0Var4, vd0Var, i22), 3);
                                                z12 = true;
                                            }
                                            return Boolean.valueOf(z12);
                                    }
                                }
                            }));
                        }
                        return j15.a;
                    }
                };
                AtomicInteger atomicInteger = f94.a;
                dx2VarC = dx2VarL.c(new zh(if1Var2));
            } else {
                dx2VarC = dx2VarL.c(ax2Var);
            }
            dx2 dx2VarF = vr1.F(dx2VarC.c(dx2VarY), lm0Var, tbVar, z, gd3Var, lm0Var.p, ec3Var);
            lm0Var2 = lm0Var;
            si1 si1Var = new si1(i16, lm0Var2);
            kn3 kn3Var = gp4.a;
            y43Var2 = y43Var;
            su3.b(k82Var, te5.F(dx2VarF.c(new fp4(lm0Var2, null, si1Var, 6)), y43Var2), lm0Var2.t, pc3Var, rg1Var, 0);
        } else {
            wg4Var2 = wg4Var;
            lm0Var2 = lm0Var;
            y43Var2 = y43Var;
            dx2Var2 = dx2Var;
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            final lm0 lm0Var3 = lm0Var2;
            final wg4 wg4Var3 = wg4Var2;
            final y43 y43Var3 = y43Var2;
            final dx2 dx2Var3 = dx2Var2;
            lv3VarP.d = new wf1() { // from class: i82
                @Override // defpackage.wf1
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iO = xl.O(i | 1);
                    int iO2 = xl.O(i2);
                    ya4.b(dx2Var3, lm0Var3, ac3Var, wg4Var3, z, tbVar, f, rv2Var, y43Var3, if1Var, gsVar, rv2Var2, r70Var, (rg1) obj4, iO, iO2);
                    return j15.a;
                }
            };
        }
    }

    public static final void c(h03 h03Var, int i) {
        if (h03Var.b == 0 || !(h03Var.b(0) == i || h03Var.b(h03Var.b - 1) == i)) {
            int i2 = h03Var.b;
            h03Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iB = h03Var.b(i3);
                if (i <= iB) {
                    break;
                }
                h03Var.d(i2, iB);
                i2 = i3;
            }
            h03Var.d(i2, i);
        }
    }

    public static Long d(String str) {
        String string;
        Long lM0;
        if (str == null || (string = qm4.K0(str).toString()) == null) {
            return null;
        }
        List listD0 = qm4.D0(string, new char[]{':'});
        if (listD0.size() != 3 || (lM0 = xm4.m0((String) listD0.get(0))) == null) {
            return null;
        }
        long jLongValue = lM0.longValue();
        Long lM1 = xm4.m0((String) listD0.get(1));
        if (lM1 == null) {
            return null;
        }
        long jLongValue2 = lM1.longValue();
        Long lM2 = xm4.m0(qm4.H0((String) listD0.get(2), '.'));
        if (lM2 == null) {
            return null;
        }
        long jLongValue3 = lM2.longValue();
        if (jLongValue2 >= 60 || jLongValue3 >= 60) {
            return null;
        }
        return Long.valueOf(((((jLongValue * 60) + jLongValue2) * 60) + jLongValue3) * 1000);
    }

    public static p81 e(p81 p81Var, int i) {
        wv wvVar;
        if (i < 0 && i != -2 && i != -1) {
            kf2.e(f34.f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            wvVar = wv.o;
        } else {
            wvVar = wv.n;
        }
        boolean z = p81Var instanceof jg1;
        q01 q01Var = q01.n;
        return z ? ((jg1) p81Var).c(q01Var, i, wvVar) : new b10(p81Var, q01Var, i, wvVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable f(j91 j91Var, q81 q81Var, wd0 wd0Var) throws Throwable {
        u81 u81Var;
        jx3 jx3Var;
        Throwable th;
        s22 s22Var;
        CancellationException cancellationExceptionQ;
        if (wd0Var instanceof u81) {
            u81Var = (u81) wd0Var;
            int i = u81Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                u81Var.p = i - Integer.MIN_VALUE;
            } else {
                u81Var = new u81(wd0Var);
            }
        } else {
            u81Var = new u81(wd0Var);
        }
        Object obj = u81Var.o;
        int i2 = u81Var.p;
        if (i2 != 0) {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jx3Var = u81Var.n;
            try {
                kb4.X(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
                th = (Throwable) jx3Var.n;
                if ((th == null && th.equals(th)) || ((s22Var = (s22) u81Var.getContext().K(fz0.h0)) != null && s22Var.isCancelled() && (cancellationExceptionQ = s22Var.q()) != null && cancellationExceptionQ.equals(th))) {
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    j51.d(th, th);
                    throw th;
                }
                j51.d(th, th);
                throw th;
            }
        }
        kb4.X(obj);
        jx3 jx3Var2 = new jx3();
        try {
            q81 gs0Var = new gs0(q81Var, jx3Var2);
            u81Var.n = jx3Var2;
            u81Var.p = 1;
            Object objA = j91Var.a(gs0Var, u81Var);
            xe0 xe0Var = xe0.n;
            if (objA == xe0Var) {
                return xe0Var;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            jx3Var = jx3Var2;
            th = (Throwable) jx3Var.n;
            if (th == null) {
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    j51.d(th, th);
                    throw th;
                }
                j51.d(th, th);
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                j51.d(th, th);
                throw th;
            }
            j51.d(th, th);
            throw th;
            throw th;
        }
    }

    public static void g(int i) {
        if (2 > i || i >= 37) {
            kf2.g(new j02(2, 36, 1), f34.j(i, "radix ", " was not in valid range "));
        }
    }

    public static float[] h() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vd0 i(vd0 vd0Var, vd0 vd0Var2, wf1 wf1Var) {
        wf1Var.getClass();
        if (wf1Var instanceof jp) {
            return ((jp) wf1Var).create(vd0Var, vd0Var2);
        }
        ne0 context = vd0Var2.getContext();
        return context == q01.n ? new i12(vd0Var2, vd0Var, wf1Var) : new j12(vd0Var2, context, wf1Var, vd0Var);
    }

    public static b54 j(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            b54 b54Var = new b54();
            new LinkedHashMap();
            b54Var.a = new z40(v01.n);
            return b54Var;
        }
        ClassLoader classLoader = b54.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ag2 ag2Var = new ag2(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            ag2Var.put(str, bundle.get(str));
        }
        ag2 ag2VarB = ag2Var.b();
        b54 b54Var2 = new b54();
        new LinkedHashMap();
        b54Var2.a = new z40(ag2VarB);
        return b54Var2;
    }

    public static byte[] k(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static final p81 m(p81 p81Var) {
        return ((p81Var instanceof ll4) || (p81Var instanceof hs0)) ? p81Var : new hs0(p81Var);
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final boolean o(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object p(gc0 gc0Var, wd0 wd0Var) {
        d91 d91Var;
        jx3 jx3Var;
        AbortFlowException e2;
        fc0 fc0Var;
        f01 f01Var = xl.e;
        if (wd0Var instanceof d91) {
            d91Var = (d91) wd0Var;
            int i = d91Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                d91Var.q = i - Integer.MIN_VALUE;
            } else {
                d91Var = new d91(wd0Var);
            }
        } else {
            d91Var = new d91(wd0Var);
        }
        Object obj = d91Var.p;
        int i2 = d91Var.q;
        int i3 = 1;
        if (i2 == 0) {
            kb4.X(obj);
            jx3 jx3Var2 = new jx3();
            jx3Var2.n = f01Var;
            fc0 fc0Var2 = new fc0(i3, jx3Var2);
            try {
                d91Var.n = jx3Var2;
                d91Var.o = fc0Var2;
                d91Var.q = 1;
                Object objA = gc0Var.a(fc0Var2, d91Var);
                Object obj2 = xe0.n;
                if (objA == obj2) {
                    return obj2;
                }
                jx3Var = jx3Var2;
            } catch (AbortFlowException e3) {
                jx3Var = jx3Var2;
                e2 = e3;
                fc0Var = fc0Var2;
                if (e2.n != fc0Var) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fc0Var = d91Var.o;
            jx3Var = d91Var.n;
            try {
                kb4.X(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.n != fc0Var) {
                    throw e2;
                }
            }
        }
        Object obj3 = jx3Var.n;
        if (obj3 != f01Var) {
            return obj3;
        }
        kf2.m("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [wf1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p81] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, wf1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object q(p81 p81Var, wf1 wf1Var, wd0 wd0Var) {
        e91 e91Var;
        ?? r1;
        jx3 jx3Var;
        AbortFlowException e2;
        lv0 lv0Var;
        ?? r2;
        f01 f01Var = xl.e;
        if (wd0Var instanceof e91) {
            e91Var = (e91) wd0Var;
            int i = e91Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                e91Var.r = i - Integer.MIN_VALUE;
            } else {
                e91Var = new e91(wd0Var);
            }
        } else {
            e91Var = new e91(wd0Var);
        }
        Object obj = e91Var.q;
        int i2 = e91Var.r;
        int i3 = 1;
        if (i2 == 0) {
            kb4.X(obj);
            jx3 jx3Var2 = new jx3();
            jx3Var2.n = f01Var;
            lv0 lv0Var2 = new lv0(i3, wf1Var, jx3Var2);
            try {
                e91Var.n = (ep4) wf1Var;
                e91Var.o = jx3Var2;
                e91Var.p = lv0Var2;
                e91Var.r = 1;
                Object objA = p81Var.a(lv0Var2, e91Var);
                xe0 xe0Var = xe0.n;
                if (objA == xe0Var) {
                    return xe0Var;
                }
                r2 = wf1Var;
                jx3Var = jx3Var2;
            } catch (AbortFlowException e3) {
                r1 = wf1Var;
                jx3Var = jx3Var2;
                e2 = e3;
                lv0Var = lv0Var2;
                r2 = r1;
                if (e2.n != lv0Var) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lv0Var = e91Var.p;
            jx3Var = e91Var.o;
            r1 = (wf1) e91Var.n;
            try {
                kb4.X(obj);
                r2 = r1;
            } catch (AbortFlowException e4) {
                e2 = e4;
                r2 = r1;
                if (e2.n != lv0Var) {
                    throw e2;
                }
            }
        }
        Object obj2 = jx3Var.n;
        if (obj2 != f01Var) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r2);
    }

    public static le0 r(le0 le0Var, me0 me0Var) {
        me0Var.getClass();
        if (h12.c(le0Var.getKey(), me0Var)) {
            return le0Var;
        }
        return null;
    }

    public static ch4 t() {
        return (ch4) jh4.b.f();
    }

    public static Rect u(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static String v(Context context, int i) {
        String strValueOf;
        context.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            strValueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i);
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public static mo3 w(mh mhVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new mo3(ne.o(mhVar));
        }
        TextPaint textPaint = new TextPaint(mhVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = mhVar.getBreakStrategy();
        int hyphenationFrequency = mhVar.getHyphenationFrequency();
        if (mhVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (mhVar.getInputType() & 15) != 3) {
            boolean z = mhVar.getLayoutDirection() == 1;
            switch (mhVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ne.d(DecimalFormatSymbols.getInstance(mhVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new mo3(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static vd0 x(vd0 vd0Var) {
        vd0<Object> vd0VarIntercepted;
        vd0Var.getClass();
        wd0 wd0Var = vd0Var instanceof wd0 ? (wd0) vd0Var : null;
        return (wd0Var == null || (vd0VarIntercepted = wd0Var.intercepted()) == null) ? vd0Var : vd0VarIntercepted;
    }

    public static boolean y(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static ch4 z(ch4 ch4Var) {
        if (ch4Var instanceof ox4) {
            ox4 ox4Var = (ox4) ch4Var;
            if (ox4Var.t == te5.m()) {
                ox4Var.r = null;
                return ch4Var;
            }
        }
        if (ch4Var instanceof px4) {
            px4 px4Var = (px4) ch4Var;
            if (px4Var.i == te5.m()) {
                px4Var.h = null;
                return ch4Var;
            }
        }
        ch4 ch4VarG = jh4.g(ch4Var, null, false);
        ch4VarG.j();
        return ch4VarG;
    }

    public abstract int l(g60 g60Var);

    public abstract wv3 s();
}
