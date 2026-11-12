package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.widget.WidgetProvider4x1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ji2 implements bg4 {
    public static final r70 a = new r70(641200809, false, new d60(2, 0));
    public static final d71 b = new d71(lq0.p);

    public static final void A(lg4 lg4Var, bi biVar, int i) {
        while (true) {
            int i2 = lg4Var.v;
            if (i > i2 && i < lg4Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            lg4Var.M();
            if (lg4Var.y(lg4Var.v)) {
                biVar.g();
            }
            lg4Var.j();
        }
    }

    public static double D(double d, double d2) {
        return E(h12.R(d), h12.R(d2));
    }

    public static double E(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    public static byte[] F(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    a51 a51Var = new a51(8193);
                    a51Var.write(i5);
                    byte[] bArr = new byte[8192];
                    for (int i6 = fileInputStream.read(bArr); i6 >= 0; i6 = fileInputStream.read(bArr)) {
                        a51Var.write(bArr, 0, i6);
                    }
                    int size = a51Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = a51Var.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    ti.X(i, 0, a51Var.size(), bArrB, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static int G(h00 h00Var, int i, int i2, int i3) {
        rr2.l(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        h12.h(h12.h(i4, i5), 1 << i3);
        if (h00Var.b() < i) {
            return -1;
        }
        int i6 = h00Var.i(i);
        if (i6 == i4) {
            if (h00Var.b() < i2) {
                return -1;
            }
            int i7 = h00Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (h00Var.b() < i3) {
                    return -1;
                }
                return h00Var.i(i3) + i6;
            }
        }
        return i6;
    }

    public static String H(File file) throws IOException {
        Charset charset = w10.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            string.getClass();
            inputStreamReader.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static void I(Context context) {
        xc5 xc5Var;
        Context applicationContext = context.getApplicationContext();
        cb4 cb4Var = new cb4(applicationContext, new ComponentName(applicationContext, (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        tv1 tv1Var = new tv1();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(applicationContext)));
        } else {
            xc5Var = null;
        }
        f35.W(new Handler(looperX), new pk2(bl2Var, new sk2(applicationContext, cb4Var, bundle, tv1Var, looperX, bl2Var, xc5Var), 0));
        bl2Var.f(new w85(2, bl2Var, applicationContext), gq0.n);
    }

    public static int J(Context context, int i) {
        Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
        int i2 = appWidgetOptions != null ? appWidgetOptions.getInt("appWidgetMinHeight") : 0;
        int integer = context.getResources().getInteger(R.integer.widget_expanded_min_height_dp);
        int integer2 = context.getResources().getInteger(R.integer.widget_large_min_height_dp);
        int integer3 = context.getResources().getInteger(R.integer.widget_medium_min_height_dp);
        if (i2 >= integer) {
            return 4;
        }
        if (i2 >= integer2) {
            return 3;
        }
        return i2 >= integer3 ? 2 : 1;
    }

    public static final long K(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static int L(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        kf2.n("Cannot round NaN value.");
        return 0;
    }

    public static long M(float f) {
        double d = f;
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        kf2.n("Cannot round NaN value.");
        return 0L;
    }

    public static void N(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fi2) {
            ((fi2) background).l(f);
        }
    }

    public static void O(View view, fi2 fi2Var) {
        nz0 nz0Var = fi2Var.n.b;
        if (nz0Var == null || !nz0Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = j65.a;
            elevation += ((View) parent).getElevation();
        }
        ei2 ei2Var = fi2Var.n;
        if (ei2Var.l != elevation) {
            ei2Var.l = elevation;
            fi2Var.u();
        }
    }

    public static void P(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fi2) {
            O(viewGroup, (fi2) background);
        }
    }

    public static void Q(h00 h00Var) {
        h00Var.t(3);
        h00Var.t(8);
        boolean zH = h00Var.h();
        boolean zH2 = h00Var.h();
        if (zH) {
            h00Var.t(5);
        }
        if (zH2) {
            h00Var.t(6);
        }
    }

    public static void R(h00 h00Var) {
        int i;
        int i2 = h00Var.i(2);
        if (i2 == 0) {
            h00Var.t(6);
            return;
        }
        int iG = G(h00Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            h00Var.t(iG * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = h00Var.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iG) {
                if (h00Var.h()) {
                    h00Var.t(7);
                    i = 0;
                } else {
                    if (h00Var.i(2) == 3 && h00Var.i(i4) * i3 != 0) {
                        h00Var.s();
                    }
                    i = h00Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        h00Var.s();
                    }
                    h00Var.s();
                }
                if (i != 0 && i != 180 && h00Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static boolean S(rk0 rk0Var, boolean z) {
        int i;
        be3 be3Var = new be3(16);
        boolean z2 = true;
        while (true) {
            be3Var.K(8);
            if (!rk0Var.e(be3Var.a, 0, 8, true)) {
                break;
            }
            long jC = be3Var.C();
            int iM = be3Var.m();
            if (jC != 1) {
                i = 8;
            } else {
                if (!rk0Var.e(be3Var.a, 8, 8, true)) {
                    break;
                }
                jC = be3Var.G();
                i = 16;
            }
            long j = i;
            if (jC < j) {
                break;
            }
            int i2 = (int) (jC - j);
            if (z2) {
                if (iM != 1718909296 || i2 < 8) {
                    break;
                }
                be3Var.K(4);
                rk0Var.e(be3Var.a, 0, 4, false);
                if (be3Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                rk0Var.o(i2 - 4, false);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    rk0Var.o(i2, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    public static void T(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, long j, long j2, String str5, String str6, String str7) {
        int i2;
        vz3 vz3Var;
        Context applicationContext = context.getApplicationContext();
        String string = TextUtils.isEmpty(str) ? applicationContext.getString(R.string.widget_not_playing) : str;
        String string2 = TextUtils.isEmpty(str2) ? applicationContext.getString(R.string.widget_placeholder_subtitle) : str2;
        String str8 = !TextUtils.isEmpty(str3) ? str3 : "";
        long jMax = Math.max(0L, j);
        long j3 = j2 > 0 ? j2 : 0L;
        if (j3 > 0 && jMax > j3) {
            jMax = j3;
        }
        String strH = (j3 > 0 || jMax > 0) ? e03.h(Long.valueOf(jMax), true) : null;
        String strH2 = j3 > 0 ? e03.h(Long.valueOf(j3), true) : null;
        int i3 = 0;
        if (j3 > 0) {
            long j4 = (jMax * 1000) / j3;
            if (j4 < 0) {
                i2 = 0;
            } else {
                i2 = j4 > 1000 ? 1000 : (int) j4;
            }
        } else {
            i2 = 0;
        }
        ge2 ge2Var = new ge2(i2, strH, strH2);
        if (!TextUtils.isEmpty(str4)) {
            wq4 ca5Var = new ca5(applicationContext, string, string2, str8, z, ge2Var, z2, i, str5, str6, str7);
            vz3 vz3VarG = a.c(applicationContext).g().P(wg0.b(512, str4)).a(wg0.a(2, applicationContext, str4));
            if (ud3.R()) {
                vz3Var = vz3VarG;
                vz3Var = (vz3) vz3VarG.l();
            }
            vz3Var = vz3VarG;
            vz3Var.J(ca5Var, null, vz3Var, fh0.g);
            return;
        }
        String str9 = str8;
        String str10 = string;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) WidgetProvider4x1.class));
        int length = appWidgetIds.length;
        while (i3 < length) {
            int i4 = appWidgetIds[i3];
            int i5 = length;
            Context context2 = applicationContext;
            String str11 = string2;
            String str12 = str10;
            String str13 = str9;
            RemoteViews remoteViewsR = r(context2, str12, str11, str13, null, z, ge2Var.a, ge2Var.b, ge2Var.c, z2, i, i4);
            WidgetProvider4x1.a(context2, remoteViewsR, i4, str5, str6, str7);
            appWidgetManager.updateAppWidget(i4, remoteViewsR);
            i3++;
            applicationContext = context2;
            str10 = str12;
            string2 = str11;
            str9 = str13;
            length = i5;
        }
    }

    public static void U(File file, String str) throws IOException {
        Charset charset = w10.a;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            V(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void V(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                kf2.o("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    public static final Exception c(h hVar, String str, GetPublicKeyCredentialDomException getPublicKeyCredentialDomException) {
        return new GetPublicKeyCredentialDomException(hVar, str);
    }

    public static final int g(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(str);
    }

    public static void i(boolean z) {
        if (z) {
            return;
        }
        nz2.c();
    }

    public static void j(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            kf2.o(f34.h("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void k(String str) {
        if (TextUtils.isEmpty(str)) {
            kf2.n("Given String is empty or null");
        }
    }

    public static void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            kf2.n(str2);
        }
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        nz2.n("null reference");
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        nz2.n(str);
    }

    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.o(str);
    }

    public static byte p(long j) {
        rr2.m((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static RemoteViews q(Context context, int i) {
        int iW = xa3.w(J(context, i));
        if (iW == 1) {
            return rr2.g(context, R.layout.widget_layout_medium, false, false);
        }
        if (iW != 2) {
            return iW != 3 ? rr2.g(context, R.layout.widget_layout_compact, false, false) : rr2.g(context, R.layout.widget_layout_large, true, true);
        }
        return rr2.g(context, R.layout.widget_layout_large_short, true, true);
    }

    public static RemoteViews r(Context context, String str, String str2, String str3, Bitmap bitmap, boolean z, String str4, String str5, int i, boolean z2, int i2, int i3) {
        int iW = xa3.w(J(context, i3));
        if (iW == 1) {
            return rr2.O(context, str, str2, str3, bitmap, z, str4, str5, i, R.layout.widget_layout_medium, true, true, z2, i2);
        }
        if (iW != 2) {
            return iW != 3 ? rr2.O(context, str, str2, str3, bitmap, z, str4, str5, i, R.layout.widget_layout_compact, false, false, z2, i2) : rr2.O(context, str, str2, str3, bitmap, z, str4, str5, i, R.layout.widget_layout_large, true, true, z2, i2);
        }
        return rr2.O(context, str, str2, str3, bitmap, z, str4, str5, i, R.layout.widget_layout_large_short, true, true, z2, i2);
    }

    public static void s(long j, be3 be3Var, wv4[] wv4VarArr) {
        int i;
        int iA;
        while (true) {
            if (be3Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (be3Var.a() == 0) {
                    i = -1;
                    break;
                }
                int iA2 = be3Var.A();
                i2 += iA2;
                if (iA2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (be3Var.a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iA = be3Var.A();
                    i3 += iA;
                }
            } while (iA == 255);
            int i4 = be3Var.b + i3;
            if (i3 == -1 || i3 > be3Var.a()) {
                l93.q0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = be3Var.c;
            } else if (i == 4 && i3 >= 8) {
                int iA3 = be3Var.A();
                int iH = be3Var.H();
                int iM = iH == 49 ? be3Var.m() : 0;
                int iA4 = be3Var.A();
                if (iH == 47) {
                    be3Var.O(1);
                }
                boolean z = iA3 == 181 && (iH == 49 || iH == 47) && iA4 == 3;
                if (iH == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    t(j, be3Var, wv4VarArr);
                }
            }
            be3Var.N(i4);
        }
    }

    public static void t(long j, be3 be3Var, wv4[] wv4VarArr) {
        int iA = be3Var.A();
        if ((iA & 64) != 0) {
            be3Var.O(1);
            int i = (iA & 31) * 3;
            int i2 = be3Var.b;
            for (wv4 wv4Var : wv4VarArr) {
                be3Var.N(i2);
                wv4Var.e(i, be3Var);
                rr2.w(j != -9223372036854775807L);
                wv4Var.a(j, 1, i, 0, null);
            }
        }
    }

    public static final void u(int i, int i2) {
        if (i <= i2) {
            return;
        }
        kf2.h(b11.n("toIndex (", ") is greater than size (", i, i2, ")."));
    }

    public static su3 v(int i) {
        if (i != 0) {
            return i != 1 ? new m34() : new ch0();
        }
        return new m34();
    }

    public static final long w(long j, boolean z, int i, float f) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && nc0.d(j)) ? nc0.h(j) : Integer.MAX_VALUE;
        if (nc0.j(j) != iH) {
            iH = gb.m(g(f), nc0.j(j), iH);
        }
        return zz1.m(0, iH, 0, nc0.g(j));
    }

    public static final int x(x34 x34Var) {
        x34Var.getClass();
        z34 z34VarU = x34Var.U("SELECT changes()");
        try {
            z34VarU.O();
            int i = (int) z34VarU.getLong(0);
            ud3.e(z34VarU, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public static final dx2 y(dc3 dc3Var, hg3 hg3Var) {
        return new w72(dc3Var, hg3Var);
    }

    public static final long z(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public abstract void B(f2 f2Var, f2 f2Var2);

    public abstract void C(f2 f2Var, Thread thread);

    @Override // defpackage.bg4
    public float a(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }

    public abstract boolean d(g2 g2Var, c2 c2Var, c2 c2Var2);

    public abstract boolean e(g2 g2Var, Object obj, Object obj2);

    public abstract boolean f(g2 g2Var, f2 f2Var, f2 f2Var2);
}
