package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebView;
import androidx.cardview.widget.CardView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.UninitializedPropertyAccessException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h12 {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] b = {95.047d, 100.0d, 108.883d};
    public static final ro0 c = new ro0(1.0f, 1.0f);
    public static final long[] d = new long[0];

    public static final boolean A(c72 c72Var) {
        if (c72Var.u == null) {
            return false;
        }
        c72 c72VarT = c72Var.t();
        return (c72VarT != null ? c72VarT.u : null) == null || c72Var.R.b;
    }

    public static double B(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] C(int i) {
        double dE = E((i >> 16) & 255);
        double dE2 = E((i >> 8) & 255);
        double dE3 = E(i & 255);
        double[][] dArr = a;
        double[] dArr2 = dArr[0];
        double d2 = (dArr2[2] * dE3) + (dArr2[1] * dE2) + (dArr2[0] * dE);
        double[] dArr3 = dArr[1];
        double d3 = (dArr3[2] * dE3) + (dArr3[1] * dE2) + (dArr3[0] * dE);
        double[] dArr4 = dArr[2];
        double d4 = (dArr4[2] * dE3) + (dArr4[1] * dE2) + (dArr4[0] * dE);
        double[] dArr5 = b;
        double d5 = d2 / dArr5[0];
        double d6 = d3 / dArr5[1];
        double d7 = d4 / dArr5[2];
        double dB = B(d5);
        double dB2 = B(d6);
        return new double[]{(116.0d * dB2) - 16.0d, (dB - dB2) * 500.0d, (dB2 - B(d7)) * 200.0d};
    }

    public static final rv2 D(i80 i80Var, String str, Executor executor, gf1 gf1Var) {
        j15 j15Var = j15.a;
        i80Var.getClass();
        executor.getClass();
        k03 k03Var = new k03(rv2.w);
        oy oyVar = new oy();
        oyVar.c = new n04();
        ry ryVar = new ry(oyVar);
        oyVar.b = ryVar;
        oyVar.a = xa3.class;
        try {
            executor.execute(new mr((Object) i80Var, str, (Object) gf1Var, (Object) k03Var, (Object) oyVar, 9));
            oyVar.a = j15Var;
        } catch (Exception e) {
            ryVar.o.i(e);
        }
        return new rv2(7);
    }

    public static double E(int i) {
        double d2 = ((double) i) / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static int F(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            kf2.n(b11.j(i, "x (", ") must be > 0"));
            return 0;
        }
        switch (d02.a[roundingMode.ordinal()]) {
            case 1:
                l93.n((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static tl1 G(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            kf2.n("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                kf2.n("Headers cannot be null");
                return null;
            }
            strArr3[i2] = qm4.K0(strArr2[i2]).toString();
        }
        int iN = q05.n(0, strArr3.length - 1, 2);
        if (iN >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                e35.G(str);
                e35.H(str2, str);
                if (i == iN) {
                    break;
                }
                i += 2;
            }
        }
        return new tl1(strArr3);
    }

    public static long J(Context context, Uri uri, String str, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            i(cursorQuery);
        }
        i(cursorQuery);
    }

    public static String K(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        i(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    i(cursorQuery);
                    return string;
                } catch (Exception e) {
                    exc = e;
                    Log.w("DocumentFile", "Failed query: " + exc);
                    i(cursorQuery);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            exc = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
        th = th2;
        i(cursorQuery);
        throw th;
    }

    public static final ub3 L(c72 c72Var) {
        ub3 ub3Var = c72Var.A;
        if (ub3Var != null) {
            return ub3Var;
        }
        throw xa3.l("LayoutNode should be attached to an owner");
    }

    public static void M(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void N(rf2 rf2Var, float f) {
        h34 h34Var = (h34) rf2Var.n;
        CardView cardView = (CardView) rf2Var.o;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != h34Var.e || h34Var.f != useCompatPadding || h34Var.g != preventCornerOverlap) {
            h34Var.e = f;
            h34Var.f = useCompatPadding;
            h34Var.g = preventCornerOverlap;
            h34Var.b(null);
            h34Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            rf2Var.l(0, 0, 0, 0);
            return;
        }
        h34 h34Var2 = (h34) rf2Var.n;
        float f2 = h34Var2.e;
        float f3 = h34Var2.a;
        int iCeil = (int) Math.ceil(i34.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(i34.b(f2, f3, cardView.getPreventCornerOverlap()));
        rf2Var.l(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static final Object O(e64 e64Var, e64 e64Var2, wf1 wf1Var) throws Throwable {
        Object a70Var;
        Object objS;
        try {
            jz4.j(2, wf1Var);
            a70Var = wf1Var.invoke(e64Var2, e64Var);
        } catch (Throwable th) {
            a70Var = new a70(th, false);
        }
        xe0 xe0Var = xe0.n;
        if (a70Var == xe0Var || (objS = e64Var.S(a70Var)) == zz1.e) {
            return xe0Var;
        }
        if (objS instanceof a70) {
            throw ((a70) objS).a;
        }
        return zz1.M(objS);
    }

    public static final void P(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static void Q(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(xa3.h("lateinit property ", str, " has not been initialized"));
        M(uninitializedPropertyAccessException, h12.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static double R(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    public static final nb a(String str) {
        return new nb(kb4.S(str));
    }

    public static final boolean b(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void d(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(str);
    }

    public static void e(Object obj) {
        f(obj, "Argument must not be null");
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        nz2.n(str);
    }

    public static void g(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbT = b11.t("fromIndex: ", ", toIndex: ", i, i2, ", size: ");
            sbT.append(i3);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i <= i2) {
            return;
        }
        kf2.n(xa3.e(i, i2, "fromIndex: ", " > toIndex: "));
    }

    public static int h(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(b11.n("overflow: checkedAdd(", ", ", i, i2, ")"));
    }

    public static void i(Cursor cursor) {
        if (cursor != null) {
            try {
                xa3.p(cursor);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int k(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int l(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static int m(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (d02.a[roundingMode.ordinal()]) {
            case 1:
                l93.n(i4 == 0);
                return i3;
            case 2:
                return i3;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static final void n(x34 x34Var, String str) {
        x34Var.getClass();
        z34 z34VarU = x34Var.U(str);
        try {
            z34VarU.O();
            ud3.e(z34VarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public static boolean o(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            i(cursorQuery);
        }
    }

    public static InvocationHandler p() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                er1.m(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final long q(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static ColorStateList r(Context context, jv3 jv3Var, int i) {
        int resourceId;
        ColorStateList colorStateListN;
        TypedArray typedArray = (TypedArray) jv3Var.o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN = ud3.n(context, resourceId)) == null) ? jv3Var.b(i) : colorStateListN;
    }

    public static ColorStateList s(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListN;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN = ud3.n(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListN;
    }

    public static final String[] t(qd0 qd0Var) {
        qd0Var.getClass();
        return (String[]) ((nb) qd0Var).b.toArray(new String[0]);
    }

    public static int u(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableR = zz1.r(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableR;
    }

    public static final int w(qi qiVar, Object obj, int i) {
        int i2 = qiVar.p;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iH = su3.h(i2, i, qiVar.n);
            if (iH < 0 || c(obj, qiVar.o[iH])) {
                return iH;
            }
            int i3 = iH + 1;
            while (i3 < i2 && qiVar.n[i3] == i) {
                if (c(obj, qiVar.o[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iH - 1; i4 >= 0 && qiVar.n[i4] == i; i4--) {
                if (c(obj, qiVar.o[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            kf2.c();
            return 0;
        }
    }

    public static int x(String str) {
        if (str == null) {
            return -1;
        }
        String strM = lw2.m(str);
        strM.getClass();
        switch (strM) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int y(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean z(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public abstract void H(int i);

    public abstract void I(Typeface typeface, boolean z);
}
