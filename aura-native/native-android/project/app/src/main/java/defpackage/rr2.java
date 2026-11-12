package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr2 implements bg4 {
    public static final r70 a = new r70(-1759434350, false, new d60(3, 0));
    public static final Object b = new Object();

    public static boolean A(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final float B(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final int C(List list, int i) {
        int i2;
        byte b2;
        int i3 = ((od3) q40.C0(list)).c;
        if (i > ((od3) q40.C0(list)).c) {
            dz1.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            od3 od3Var = (od3) list.get(i2);
            if (od3Var.b > i) {
                b2 = 1;
            } else {
                b2 = od3Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = gc2.a(list, null, new k52(11), 31);
        StringBuilder sbT = b11.t("Found paragraph index ", " should be in range [0, ", i2, size2, ").\nDebug info: index=");
        sbT.append(i);
        sbT.append(", paragraphs=[");
        sbT.append(strA);
        sbT.append("]");
        dz1.a(sbT.toString());
        return i2;
    }

    public static final int D(List list, int i) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            od3 od3Var = (od3) list.get(i3);
            if (od3Var.d > i) {
                b2 = 1;
            } else {
                b2 = od3Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int E(z34 z34Var, String str) {
        z34Var.getClass();
        int iY = y(z34Var, str);
        if (iY >= 0) {
            return iY;
        }
        int columnCount = z34Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(z34Var.getColumnName(i));
        }
        kf2.j("Column '", str, "' does not exist. Available columns: [", q40.B0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final ql4 F(rh4 rh4Var) {
        ql4 ql4Var = rh4Var.n;
        ql4Var.getClass();
        return (ql4) jh4.t(ql4Var, rh4Var);
    }

    public static long G(double d) {
        k("not a normal value", I(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static final int H(rh4 rh4Var) {
        ql4 ql4Var = rh4Var.n;
        ql4Var.getClass();
        return ((ql4) jh4.h(ql4Var)).e;
    }

    public static boolean I(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static boolean J(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static r72 K(b92 b92Var, gf1 gf1Var) {
        rv2 rv2Var = rv2.H;
        int iOrdinal = b92Var.ordinal();
        if (iOrdinal == 0) {
            return new rp4(gf1Var);
        }
        if (iOrdinal == 1) {
            l44 l44Var = new l44();
            l44Var.n = gf1Var;
            l44Var.o = rv2Var;
            return l44Var;
        }
        if (iOrdinal != 2) {
            er1.n();
            return null;
        }
        x15 x15Var = new x15();
        x15Var.n = gf1Var;
        x15Var.o = rv2Var;
        return x15Var;
    }

    public static final dx2 L(dx2 dx2Var, k82 k82Var, s82 s82Var, boolean z) {
        return dx2Var.c(new t82(k82Var, s82Var, z));
    }

    public static final long M(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : x40.b(j, x40.d(j) * f);
    }

    public static final boolean N(rh4 rh4Var, if1 if1Var) {
        int i;
        y1 y1Var;
        Object objInvoke;
        ch4 ch4VarJ;
        boolean zE;
        do {
            synchronized (b) {
                ql4 ql4Var = rh4Var.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            xf3 xf3VarF = y1Var.f();
            objInvoke = if1Var.invoke(xf3VarF);
            y1 y1VarD = xf3VarF.d();
            if (h12.c(y1VarD, y1Var)) {
                break;
            }
            ql4 ql4Var3 = rh4Var.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                ch4VarJ = jh4.j();
                zE = e((ql4) jh4.w(ql4Var3, rh4Var, ch4VarJ), i, y1VarD, true);
            }
            jh4.n(ch4VarJ, rh4Var);
        } while (!zE);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    public static RemoteViews O(Context context, String str, String str2, String str3, Bitmap bitmap, boolean z, String str4, String str5, int i, int i2, boolean z2, boolean z3, boolean z4, int i3) {
        Bitmap bitmap2;
        Bitmap bitmap3 = bitmap;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i2);
        remoteViews.setTextViewText(R.id.title, str);
        remoteViews.setTextViewText(R.id.subtitle, str2);
        if (!z2 || TextUtils.isEmpty(str3)) {
            remoteViews.setTextViewText(R.id.album, "");
            remoteViews.setViewVisibility(R.id.album, 8);
        } else {
            remoteViews.setTextViewText(R.id.album, str3);
            remoteViews.setViewVisibility(R.id.album, 0);
        }
        if (bitmap3 != null) {
            if (bitmap3.isRecycled()) {
                bitmap2 = null;
            } else {
                try {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    if (width <= 0 || height <= 0) {
                        bitmap2 = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(1);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                        float fMin = Math.min(TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics()), Math.min(width, height) / 2.0f);
                        canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), fMin, fMin, paint);
                        bitmap2 = bitmapCreateBitmap;
                    }
                } catch (OutOfMemoryError | RuntimeException e) {
                    Log.w("TempoWidget", "Failed to round album art", e);
                }
            }
            if (bitmap2 != null) {
                bitmap3 = bitmap2;
            }
            remoteViews.setImageViewBitmap(R.id.album_art, bitmap3);
        } else {
            remoteViews.setImageViewResource(R.id.album_art, R.drawable.ic_splash_logo);
        }
        remoteViews.setImageViewResource(R.id.btn_play_pause, z ? R.drawable.ic_pause : R.drawable.ic_play);
        String string = !TextUtils.isEmpty(str4) ? str4 : context.getString(R.string.widget_time_elapsed_placeholder);
        String string2 = !TextUtils.isEmpty(str5) ? str5 : context.getString(R.string.widget_time_duration_placeholder);
        int i4 = i < 0 ? 0 : i;
        if (i4 > 1000) {
            i4 = 1000;
        }
        remoteViews.setTextViewText(R.id.time_elapsed, string);
        remoteViews.setTextViewText(R.id.time_total, string2);
        remoteViews.setProgressBar(R.id.progress, 1000, i4, false);
        if (z3) {
            int color = context.getColor(R.color.widget_icon_tint);
            int color2 = context.getColor(R.color.widget_icon_tint_active);
            remoteViews.setViewVisibility(R.id.controls_secondary, 0);
            remoteViews.setViewVisibility(R.id.btn_shuffle, 0);
            remoteViews.setViewVisibility(R.id.btn_repeat, 0);
            remoteViews.setImageViewResource(R.id.btn_shuffle, R.drawable.ic_shuffle);
            remoteViews.setImageViewResource(R.id.btn_repeat, i3 == 1 ? R.drawable.ic_repeat_one : R.drawable.ic_repeat);
            remoteViews.setInt(R.id.btn_shuffle, "setColorFilter", z4 ? color2 : color);
            if (i3 != 0) {
                color = color2;
            }
            remoteViews.setInt(R.id.btn_repeat, "setColorFilter", color);
        } else {
            remoteViews.setViewVisibility(R.id.controls_secondary, 8);
            remoteViews.setViewVisibility(R.id.btn_shuffle, 8);
            remoteViews.setViewVisibility(R.id.btn_repeat, 8);
        }
        return remoteViews;
    }

    public static int P(int i, be3 be3Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return be3Var.A() + 1;
            case 7:
                return be3Var.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final k02 Q(wv3 wv3Var) {
        return new k02(Math.round(wv3Var.a), Math.round(wv3Var.b), Math.round(wv3Var.c), Math.round(wv3Var.d));
    }

    public static final void R(ya3 ya3Var, int i, Object obj) {
        ya3Var.h[(ya3Var.i - ya3Var.d[ya3Var.e - 1].c) + i] = obj;
    }

    public static final void S(ya3 ya3Var, int i, Object obj, int i2, Object obj2) {
        int i3 = ya3Var.i - ya3Var.d[ya3Var.e - 1].c;
        Object[] objArr = ya3Var.h;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final GetCredentialException T(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (!xm4.k0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new GetCredentialCustomException(charSequence, str);
        }
        int i = GetPublicKeyCredentialException.r;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!xm4.k0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i2 = GetPublicKeyCredentialDomException.s;
            return si0.q(str, string);
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(string, str);
        }
    }

    public static String U(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (J(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (J(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String V(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final double W(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static Bundle X(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        z(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final long c(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void d(int i, int i2) {
        if (i < 0 || i >= i2) {
            kf2.h(b11.n("index (", ") is out of bound of [0, ", i, i2, ")"));
        }
    }

    public static final boolean e(ql4 ql4Var, int i, y1 y1Var, boolean z) {
        boolean z2;
        synchronized (b) {
            try {
                int i2 = ql4Var.d;
                if (i2 == i) {
                    ql4Var.c = y1Var;
                    z2 = true;
                    if (z) {
                        ql4Var.e++;
                    }
                    ql4Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static String f(String str, int i, int i2) {
        if (i < 0) {
            return gh0.s("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return gh0.s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        kf2.n(f34.f(i2, "negative size: "));
        return null;
    }

    public static RemoteViews g(Context context, int i, boolean z, boolean z2) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setTextViewText(R.id.title, context.getString(R.string.widget_not_playing));
        remoteViews.setTextViewText(R.id.subtitle, context.getString(R.string.widget_placeholder_subtitle));
        remoteViews.setTextViewText(R.id.album, "");
        remoteViews.setViewVisibility(R.id.album, z ? 4 : 8);
        remoteViews.setTextViewText(R.id.time_elapsed, context.getString(R.string.widget_time_elapsed_placeholder));
        remoteViews.setTextViewText(R.id.time_total, context.getString(R.string.widget_time_duration_placeholder));
        remoteViews.setProgressBar(R.id.progress, 1000, 0, false);
        remoteViews.setImageViewResource(R.id.btn_play_pause, R.drawable.ic_play);
        remoteViews.setImageViewResource(R.id.album_art, R.drawable.ic_splash_logo);
        int i2 = z2 ? 0 : 8;
        remoteViews.setViewVisibility(R.id.controls_secondary, i2);
        remoteViews.setViewVisibility(R.id.btn_shuffle, i2);
        remoteViews.setViewVisibility(R.id.btn_repeat, i2);
        if (z2) {
            int color = context.getColor(R.color.widget_icon_tint);
            remoteViews.setImageViewResource(R.id.btn_shuffle, R.drawable.ic_shuffle);
            remoteViews.setImageViewResource(R.id.btn_repeat, R.drawable.ic_repeat);
            remoteViews.setInt(R.id.btn_shuffle, "setColorFilter", color);
            remoteViews.setInt(R.id.btn_repeat, "setColorFilter", color);
        }
        return remoteViews;
    }

    public static boolean h(be3 be3Var, v71 v71Var, int i, t71 t71Var) {
        long jC = be3Var.C();
        long j = jC >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jC >> 12) & 15);
        int i3 = (int) ((jC >> 8) & 15);
        int i4 = (int) ((jC >> 4) & 15);
        int i5 = (int) ((jC >> 1) & 7);
        boolean z2 = (jC & 1) == 1;
        if (i4 <= 7) {
            if (i4 != v71Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || v71Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == v71Var.i) || z2) {
            return false;
        }
        try {
            long jI = be3Var.I();
            if (!z) {
                jI *= (long) v71Var.b;
            }
            long j2 = v71Var.j;
            if (j2 != 0 && jI > j2) {
                return false;
            }
            t71Var.a = jI;
            int iP = P(i2, be3Var);
            long j3 = v71Var.j;
            boolean z3 = j3 == 0 || jI + ((long) iP) >= j3;
            if (iP == -1) {
                return false;
            }
            if ((!z3 && iP < v71Var.a) || iP > v71Var.b) {
                return false;
            }
            int i6 = v71Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != v71Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iH = be3Var.H();
                    if (i3 == 14) {
                        iH *= 10;
                    }
                    if (iH != i6) {
                        return false;
                    }
                } else if (be3Var.A() * 1000 != i6) {
                    return false;
                }
            }
            int iA = be3Var.A();
            int i7 = be3Var.b;
            byte[] bArr = be3Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = be3Var.b; i10 < i8; i10++) {
                i9 = f35.l[i9 ^ (bArr[i10] & 255)];
            }
            String str = f35.a;
            if (iA != i9) {
                return false;
            }
            if (be3Var.a() != 0) {
                int iJ = be3Var.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i11 = (iJ & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    l93.K("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void i(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void j(int i, String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, Integer.valueOf(i)));
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(str);
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        nz2.c();
    }

    public static void m(boolean z, String str, long j) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, Long.valueOf(j)));
    }

    public static void n(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void o(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, obj));
    }

    public static void p(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        kf2.n(gh0.s(str, obj, obj2));
    }

    public static void q(int i, int i2) {
        String strS;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strS = gh0.s("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    kf2.n(f34.f(i2, "negative size: "));
                    return;
                }
                strS = gh0.s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static void r(oo2 oo2Var) {
        oo2Var.getClass();
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        nz2.n(str);
    }

    public static void t(int i, int i2) {
        if (i < 0 || i > i2) {
            kf2.h(f("index", i, i2));
        }
    }

    public static void u(int i, int i2, int i3) {
        String strF;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strF = f("start index", i, i3);
            } else {
                strF = (i2 < 0 || i2 > i3) ? f("end index", i2, i3) : gh0.s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void v(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.o(str);
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        tb4.a();
    }

    public static final int y(z34 z34Var, String str) {
        z34Var.getClass();
        int columnCount = z34Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(z34Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = z34Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(z34Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = z34Var.getColumnCount();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = z34Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (xm4.e0(columnName, strConcat, false) || (columnName.charAt(0) == '`' && xm4.e0(columnName, str3, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static void z(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(rr2.class.getClassLoader());
        }
    }

    @Override // defpackage.bg4
    public float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }

    public abstract List x(String str, List list);
}
