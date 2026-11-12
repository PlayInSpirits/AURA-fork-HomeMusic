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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr2 implements bg4 {
    public static final r70 a = null;
    public static final Object b = null;

    static {
        a = new r70(-1759434350, false, new d60(3, 0));
        b = new Object();
    }

    public static boolean A(String r6, String r7) {
        int r0 = r6.length();
        if (r6 != r7) goto L6;
        return true;
    L6:
        if (r0 != r7.length()) goto L18;
        int r1 = 0;
    L9:
        if (r1 >= r0) goto L26;
        char r3 = r6.charAt(r1);
        char r4 = r7.charAt(r1);
        if (r3 == r4) goto L17;
        char r5 = (char) ((r3 | ' ') - 97);
        if (r5 >= 26) goto L18;
        if (r5 != ((char) ((r4 | ' ') - 97))) goto L18;
    L17:
        r1 = r1 + 1;
        goto L9
    L26:
        return true;
    L18:
        return false;
    }

    public static final float B(float r4) {
        float r0 = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(r4)) & 8589934591L) / 3)) + 709952852);
        float r1 = r0 - ((r0 - (r4 / (r0 * r0))) * 0.33333334f);
        return r1 - ((r1 - (r4 / (r1 * r1))) * 0.33333334f);
    }

    public static final int C(List r7, int r8) {
        int r0 = ((od3) q40.C0(r7)).c;
        if (r8 <= ((od3) q40.C0(r7)).c) goto L6;
        dz1.a("Index " + r8 + " should be less or equal than last line's end " + r0);
    L6:
        int r1 = r7.size() - 1;
        int r3 = 0;
    L7:
        if (r3 > r1) goto L19;
        int r4 = (r3 + r1) >>> 1;
        od3 r5 = (od3) r7.get(r4);
        if (r5.b <= r8) goto L12;
        byte r6 = 1;
    L15:
        if (r6 < 0) goto L16;
        if (r6 <= 0) goto L20;
        r1 = r4 - 1;
    L20:
        if (r4 >= 0) goto L22;
    L24:
        int r2 = r7.size();
        String r9 = gc2.a(r7, null, new k52(11), 31);
        StringBuilder r10 = b11.t("Found paragraph index ", " should be in range [0, ", r4, r2, ").\nDebug info: index=");
        r10.append(r8);
        r10.append(", paragraphs=[");
        r10.append(r9);
        r10.append("]");
        dz1.a(r10.toString());
        return r4;
    L22:
        if (r4 >= r7.size()) goto L24;
        return r4;
    L16:
        r3 = r4 + 1;
        goto L7
    L12:
        if (r5.c > r8) goto L14;
        r6 = -1;
        goto L15
    L14:
        r6 = 0;
        goto L15
    L19:
        r4 = -(r3 + 1);
        goto L20
    }

    public static final int D(List r7, int r8) {
        int r0 = r7.size() - 1;
        int r3 = 0;
    L3:
        if (r3 > r0) goto L17;
        int r4 = (r3 + r0) >>> 1;
        od3 r5 = (od3) r7.get(r4);
        if (r5.d <= r8) goto L8;
        byte r6 = 1;
    L11:
        if (r6 < 0) goto L12;
        if (r6 <= 0) goto L15;
        r0 = r4 - 1;
        goto L3
    L15:
        return r4;
    L12:
        r3 = r4 + 1;
        goto L3
    L8:
        if (r5.e > r8) goto L10;
        r6 = -1;
        goto L11
    L10:
        r6 = 0;
        goto L11
    L17:
        return -(r3 + 1);
    }

    public static final int E(z34 r8, String r9) {
        r8.getClass();
        int r0 = y(r8, r9);
        if (r0 < 0) goto L5;
        return r0;
    L5:
        int r1 = r8.getColumnCount();
        ArrayList r2 = new ArrayList(r1);
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        r2.add(r8.getColumnName(r3));
        r3 = r3 + 1;
        goto L6
    L8:
        kf2.j("Column '", r9, "' does not exist. Available columns: [", q40.B0(r2, null, null, null, null, 63), 93);
        return 0;
    }

    public static final ql4 F(rh4 r1) {
        ql4 r0 = r1.n;
        r0.getClass();
        return (ql4) jh4.t(r0, r1);
    }

    public static long G(double r3) {
        k("not a normal value", I(r3));
        int r0 = Math.getExponent(r3);
        long r4 = Double.doubleToRawLongBits(r3) & 4503599627370495L;
        if (r0 != (-1023)) goto L7;
        return r4 << 1;
    L7:
        return r4 | 4503599627370496L;
    }

    public static final int H(rh4 r0) {
        ql4 r1 = r0.n;
        r1.getClass();
        return ((ql4) jh4.h(r1)).e;
    }

    public static boolean I(double r0) {
        if (Math.getExponent(r0) > 1023) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean J(char r1) {
        if (r1 >= 'A') goto L5;
        return false;
    L5:
        if (r1 > 'Z') goto L10;
        return true;
    L10:
        return false;
    }

    public static r72 K(b92 r2, gf1 r3) {
        rv2 r0 = rv2.H;
        int r4 = r2.ordinal();
        if (r4 == 0) goto L15;
        if (r4 != 1) goto L7;
        l44 r5 = new l44();
        r5.n = r3;
        r5.o = r0;
        return r5;
    L7:
        if (r4 != 2) goto L10;
        x15 r6 = new x15();
        r6.n = r3;
        r6.o = r0;
        return r6;
    L10:
        er1.n();
        return null;
    L15:
        return new rp4(r3);
    }

    public static final dx2 L(dx2 r1, k82 r2, s82 r3, boolean r4) {
        return r1.c(new t82(r2, r3, r4));
    }

    public static final long M(long r1, float r3) {
        if (Float.isNaN(r3) == false) goto L5;
        return r1;
    L5:
        if (r3 < 1.0f) goto L8;
        return r1;
    L8:
        return x40.b(r1, x40.d(r1) * r3);
    }

    public static final boolean N(rh4 r7, if1 r8) {
    L2:
        Object r0 = b;
        monitor-enter(r0);
        ql4 r1 = r7.n;     // Catch: Throwable -> L20
        r1.getClass();     // Catch: Throwable -> L20
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L20
        int r3 = r2.d;     // Catch: Throwable -> L20
        y1 r4 = r2.c;     // Catch: Throwable -> L20
        monitor-exit(r0);
        r4.getClass();
        xf3 r5 = r4.f();
        Object r6 = r8.invoke(r5);
        y1 r9 = r5.d();
        if (h12.c(r9, r4) == true) goto L19;
        ql4 r10 = r7.n;
        r10.getClass();
        Object r11 = jh4.c;
        monitor-enter(r11);
        ch4 r12 = jh4.j();     // Catch: Throwable -> L15
        boolean r13 = e((ql4) jh4.w(r10, r7, r12), r3, r9, true);     // Catch: Throwable -> L15
        monitor-exit(r11);
        jh4.n(r12, r7);
        if (r13 == false) goto L2;
    L15:
        th = move-exception;
        throw th;
    L19:
        return ((Boolean) r6).booleanValue();
    L20:
        th = move-exception;
        throw th;
    }

    public static RemoteViews O(Context r17, String r18, String r19, String r20, Bitmap r21, boolean r22, String r23, String r24, int r25, int r26, boolean r27, boolean r28, boolean r29, int r30) {
        Bitmap r2 = r21;
        RemoteViews r4 = new RemoteViews(r17.getPackageName(), r26);
        r4.setTextViewText(R.id.title, r18);
        r4.setTextViewText(R.id.subtitle, r19);
        if (r27 == true) goto L5;
    L7:
        r4.setTextViewText(R.id.album, "");
        r4.setViewVisibility(R.id.album, 8);
    L9:
        if (r2 != null) goto L11;
        r4.setImageViewResource(R.id.album_art, R.drawable.ic_splash_logo);
    L27:
        if (r22 == false) goto L29;
        int r0 = R.drawable.ic_pause;
    L30:
        r4.setImageViewResource(R.id.btn_play_pause, r0);
        if (TextUtils.isEmpty(r23) == true) goto L33;
        String r1 = r23;
    L35:
        if (TextUtils.isEmpty(r24) == true) goto L37;
        String r3 = r24;
    L38:
        if (r25 >= 0) goto L40;
        int r7 = 0;
    L42:
        if (r7 <= 1000) goto L44;
        r7 = 1000;
    L44:
        r4.setTextViewText(R.id.time_elapsed, r1);
        r4.setTextViewText(R.id.time_total, r3);
        r4.setProgressBar(R.id.progress, 1000, r7, false);
        if (r28 == true) goto L47;
        r4.setViewVisibility(R.id.controls_secondary, 8);
        r4.setViewVisibility(R.id.btn_shuffle, 8);
        r4.setViewVisibility(R.id.btn_repeat, 8);
    L60:
        return r4;
    L47:
        int r5 = r17.getColor(R.color.widget_icon_tint);
        int r6 = r17.getColor(R.color.widget_icon_tint_active);
        r4.setViewVisibility(R.id.controls_secondary, 0);
        r4.setViewVisibility(R.id.btn_shuffle, 0);
        r4.setViewVisibility(R.id.btn_repeat, 0);
        r4.setImageViewResource(R.id.btn_shuffle, R.drawable.ic_shuffle);
        if (r30 != 1) goto L50;
        int r8 = R.drawable.ic_repeat_one;
    L51:
        r4.setImageViewResource(R.id.btn_repeat, r8);
        if (r29 == false) goto L54;
        int r9 = r6;
    L55:
        r4.setInt(R.id.btn_shuffle, "setColorFilter", r9);
        if (r30 == 0) goto L59;
        r5 = r6;
    L59:
        r4.setInt(R.id.btn_repeat, "setColorFilter", r5);
        goto L60
    L54:
        r9 = r5;
        goto L55
    L50:
        r8 = R.drawable.ic_repeat;
        goto L51
    L40:
        r7 = r25;
        goto L42
    L37:
        r3 = r17.getString(R.string.widget_time_duration_placeholder);
        goto L38
    L33:
        r1 = r17.getString(R.string.widget_time_elapsed_placeholder);
        goto L35
    L29:
        r0 = R.drawable.ic_play;
        goto L30
    L11:
        if (r2.isRecycled() == false) goto L61;
    L12:
        Bitmap r10 = null;
    L23:
        if (r10 == null) goto L25;
        r2 = r10;
    L25:
        r4.setImageViewBitmap(R.id.album_art, r2);
        goto L27
    L61:
        int r11 = r2.getWidth();     // Catch: Throwable -> L19 RuntimeException -> L21
        int r12 = r2.getHeight();     // Catch: Throwable -> L19 RuntimeException -> L21
        if (r11 <= 0) goto L12;
        if (r12 <= 0) goto L12;
        Bitmap r13 = Bitmap.createBitmap(r11, r12, Bitmap.Config.ARGB_8888);     // Catch: Throwable -> L19 RuntimeException -> L21
        Canvas r14 = new Canvas(r13);     // Catch: Throwable -> L19 RuntimeException -> L21
        Paint r15 = new Paint(1);     // Catch: Throwable -> L19 RuntimeException -> L21
        Shader.TileMode r16 = Shader.TileMode.CLAMP;     // Catch: Throwable -> L19 RuntimeException -> L21
        r15.setShader(new BitmapShader(r2, r16, r16));     // Catch: Throwable -> L19 RuntimeException -> L21
        float r110 = Math.min(TypedValue.applyDimension(1, 6.0f, r17.getResources().getDisplayMetrics()), Math.min(r11, r12) / 2.0f);     // Catch: Throwable -> L19 RuntimeException -> L21
        r14.drawRoundRect(new RectF(0.0f, 0.0f, r11, r12), r110, r110, r15);     // Catch: Throwable -> L19 RuntimeException -> L21
        r10 = r13;
    L19:
        e = move-exception;
        Log.w("TempoWidget", "Failed to round album art", e);
        goto L12
    L5:
        if (TextUtils.isEmpty(r20) == true) goto L7;
        r4.setTextViewText(R.id.album, r20);
        r4.setViewVisibility(R.id.album, 0);
        goto L9
    }

    public static int P(int r0, be3 r1) {
        switch(r0) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L12;
            case 4: goto L12;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            case 9: goto L6;
            case 10: goto L6;
            case 11: goto L6;
            case 12: goto L6;
            case 13: goto L6;
            case 14: goto L6;
            case 15: goto L6;
            default: goto L3;
        };
    L3:
        return -1;
    L13:
        return 192;
    L6:
        return 256 << (r0 - 8);
    L8:
        return r1.H() + 1;
    L10:
        return r1.A() + 1;
    L12:
        return 576 << (r0 - 2);
    }

    public static final k02 Q(wv3 r4) {
        return new k02(Math.round(r4.a), Math.round(r4.b), Math.round(r4.c), Math.round(r4.d));
    }

    public static final void R(ya3 r3, int r4, Object r5) {
        r3.h[(r3.i - r3.d[r3.e - 1].c) + r4] = r5;
    }

    public static final void S(ya3 r3, int r4, Object r5, int r6, Object r7) {
        int r0 = r3.i - r3.d[r3.e - 1].c;
        Object[] r8 = r3.h;
        r8[r4 + r0] = r5;
        r8[r0 + r6] = r7;
    }

    public static final GetCredentialException T(CharSequence r3, String r4) {
        r4.getClass();
        switch(r4.hashCode()) {
            case -781118336: goto L31;
            case -408155724: goto L26;
            case -45448328: goto L21;
            case 580557411: goto L16;
            case 627896683: goto L11;
            case 1594095913: goto L6;
            default: goto L33;
        };
    L6:
        if (r4.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION") == false) goto L33;
        return new GetCredentialProviderConfigurationException(r3);
    L11:
        if (r4.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL") == false) goto L33;
        return new NoCredentialException(r3);
    L16:
        if (r4.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED") == false) goto L33;
        return new GetCredentialCancellationException(r3);
    L21:
        if (r4.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED") == false) goto L33;
        return new GetCredentialInterruptedException(r3);
    L26:
        if (r4.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION") == false) goto L33;
        return new GetCredentialUnsupportedException(r3);
    L31:
        if (r4.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN") == false) goto L33;
        return new GetCredentialUnknownException(r3);
    L33:
        if (xm4.k0(r4, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false) == false) goto L47;
        int r2 = GetPublicKeyCredentialException.r;
        if (r3 == null) goto L37;
        String r5 = r3.toString();
    L50:
        if (xm4.k0(r4, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false) == false) goto L43;
        int r0 = GetPublicKeyCredentialDomException.s;     // Catch: FrameworkClassParsingException -> L44
        return si0.q(r4, r5);
    L43:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L44
    L45:
        return new GetCredentialCustomException(r5, r4);
    L37:
        r5 = null;
        goto L50
    L47:
        return new GetCredentialCustomException(r3, r4);
    }

    public static String U(String r4) {
        int r0 = r4.length();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L15;
        if (J(r4.charAt(r1)) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        char[] r5 = r4.toCharArray();
    L7:
        if (r1 >= r0) goto L13;
        char r2 = r5[r1];
        if (J(r2) == false) goto L11;
        r5[r1] = (char) (r2 ^ ' ');
    L11:
        r1 = r1 + 1;
        goto L7
    L13:
        return String.valueOf(r5);
    L15:
        return r4;
    }

    public static String V(String r5) {
        int r0 = r5.length();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L18;
        char r2 = r5.charAt(r1);
        if (r2 < 'a') goto L17;
        if (r2 > 'z') goto L17;
        char[] r6 = r5.toCharArray();
    L9:
        if (r1 >= r0) goto L16;
        char r3 = r6[r1];
        if (r3 < 'a') goto L14;
        if (r3 > 'z') goto L14;
        r6[r1] = (char) (r3 ^ ' ');
    L14:
        r1 = r1 + 1;
        goto L9
    L16:
        return String.valueOf(r6);
    L17:
        r1 = r1 + 1;
        goto L3
    L18:
        return r5;
    }

    public static final double W(long r4) {
        return ((r4 >>> 11) * 2048.0d) + (r4 & 2047);
    }

    public static Bundle X(Bundle r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        z(r2);
        r2.isEmpty();     // Catch: BadParcelableException -> L8
        return r2;
    L8:
        Log.e("MediaSessionCompat", "Could not unparcel the data.");
        return null;
    }

    public static final long c(float r4, boolean r5, boolean r6) {
        long r0 = Float.floatToRawIntBits(r4);
        long r2 = 0;
        if (r5 == false) goto L5;
        long r7 = 1;
    L6:
        if (r6 == false) goto L9;
        r2 = 2;
    L9:
        return ((r7 | r2) & 4294967295L) | (r0 << 32);
    L5:
        r7 = 0;
        goto L6
    }

    public static final void d(int r3, int r4) {
        if (r3 < 0) goto L5;
        if (r3 >= r4) goto L5;
        return;
    L5:
        kf2.h(b11.n("index (", ") is out of bound of [0, ", r3, r4, ")"));
    }

    public static final boolean e(ql4 r2, int r3, y1 r4, boolean r5) {
        Object r0 = b;
        monitor-enter(r0);
        int r1 = r2.d;     // Catch: Throwable -> L9
        if (r1 != r3) goto L13;
        r2.c = r4;     // Catch: Throwable -> L9
        boolean r6 = true;
        if (r5 == false) goto L11;
        r2.e++;     // Catch: Throwable -> L9
    L11:
        r2.d = r1 + 1;     // Catch: Throwable -> L9
    L14:
        monitor-exit(r0);
        return r6;
    L13:
        r6 = false;
    L9:
        th = move-exception;
        throw th;
    }

    public static String f(String r0, int r1, int r2) {
        if (r1 < 0) goto L4;
        if (r2 >= 0) goto L7;
        kf2.n(f34.f(r2, "negative size: "));
        return null;
    L7:
        return gh0.s("%s (%s) must not be greater than size (%s)", new Object[]{r0, Integer.valueOf(r1), Integer.valueOf(r2)});
    L4:
        return gh0.s("%s (%s) must not be negative", new Object[]{r0, Integer.valueOf(r1)});
    }

    public static RemoteViews g(Context r3, int r4, boolean r5, boolean r6) {
        RemoteViews r0 = new RemoteViews(r3.getPackageName(), r4);
        r0.setTextViewText(R.id.title, r3.getString(R.string.widget_not_playing));
        r0.setTextViewText(R.id.subtitle, r3.getString(R.string.widget_placeholder_subtitle));
        r0.setTextViewText(R.id.album, "");
        int r7 = 8;
        if (r5 == false) goto L5;
        int r8 = 4;
    L6:
        r0.setViewVisibility(R.id.album, r8);
        r0.setTextViewText(R.id.time_elapsed, r3.getString(R.string.widget_time_elapsed_placeholder));
        r0.setTextViewText(R.id.time_total, r3.getString(R.string.widget_time_duration_placeholder));
        r0.setProgressBar(R.id.progress, 1000, 0, false);
        r0.setImageViewResource(R.id.btn_play_pause, R.drawable.ic_play);
        r0.setImageViewResource(R.id.album_art, R.drawable.ic_splash_logo);
        if (r6 == false) goto L9;
        r7 = 0;
    L9:
        r0.setViewVisibility(R.id.controls_secondary, r7);
        r0.setViewVisibility(R.id.btn_shuffle, r7);
        r0.setViewVisibility(R.id.btn_repeat, r7);
        if (r6 == false) goto L12;
        int r9 = r3.getColor(R.color.widget_icon_tint);
        r0.setImageViewResource(R.id.btn_shuffle, R.drawable.ic_shuffle);
        r0.setImageViewResource(R.id.btn_repeat, R.drawable.ic_repeat);
        r0.setInt(R.id.btn_shuffle, "setColorFilter", r9);
        r0.setInt(R.id.btn_repeat, "setColorFilter", r9);
    L12:
        return r0;
    L5:
        r8 = 8;
        goto L6
    }

    public static boolean h(be3 r19, v71 r20, int r21, t71 r22) {
        int r2 = r19.b;
        long r3 = r19.C();
        long r5 = r3 >>> 16;
        if (r5 == r21) goto L6;
        return false;
    L6:
        if ((r5 & 1) != 1) goto L8;
        boolean r6 = true;
    L9:
        int r11 = (int) ((r3 >> 12) & 15);
        int r8 = (int) ((r3 >> 8) & 15);
        int r9 = (int) ((r3 >> 4) & 15);
        int r10 = (int) ((r3 >> 1) & 7);
        if ((r3 & 1) != 1) goto L12;
        boolean r4 = true;
    L14:
        if (r9 > 7) goto L19;
        if (r9 != (r20.g - 1)) goto L95;
    L22:
        if (r10 != 0) goto L25;
    L26:
        if (r4 == true) goto L99;
        long r12 = r19.I();     // Catch: NumberFormatException -> L91
        if (r6 == true) goto L31;
        r12 = r12 * ((long) r20.b);
    L31:
        long r13 = r20.j;
        if (r13 != 0) goto L34;
    L36:
        r22.a = r12;
        int r7 = P(r11, r19);
        long r14 = r20.j;
        if (r14 != 0) goto L39;
    L42:
        boolean r15 = true;
    L44:
        if (r7 == (-1)) goto L100;
        if (r15 == true) goto L49;
        if (r7 >= r20.a) goto L49;
        return false;
    L49:
        if (r7 > r20.b) goto L102;
        int r16 = r20.e;
        if (r8 != 0) goto L54;
    L68:
        int r1 = r19.A();
        int r17 = r19.b;
        byte[] r18 = r19.a;
        int r23 = r17 - 1;
        int r24 = 0;
    L69:
        if (r2 >= r23) goto L71;
        r24 = f35.l[r24 ^ (r18[r2] & 255)];
        r2 = r2 + 1;
        goto L69
    L71:
        String r25 = f35.a;
        if (r1 == r24) goto L74;
        return false;
    L74:
        if (r19.a() == 0) goto L89;
        int r0 = r19.j();
        if ((r0 & 128) != 0) goto L109;
        int r26 = (r0 & 126) >> 1;
        if (r26 < 2) goto L84;
        if (r26 > 7) goto L84;
    L87:
        l93.K("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + r26);
        return false;
    L84:
        if (r26 < 13) goto L89;
        if (r26 > 31) goto L89;
    L109:
        return false;
    L89:
        return true;
    L54:
        if (r8 <= 11) goto L56;
        if (r8 != 12) goto L63;
        if ((r19.A() * 1000) == r16) goto L68;
        return false;
    L63:
        if (r8 > 14) goto L105;
        int r27 = r19.H();
        if (r8 != 14) goto L67;
        r27 = r27 * 10;
    L67:
        if (r27 == r16) goto L68;
        return false;
    L105:
        return false;
    L56:
        if (r8 == r20.f) goto L68;
        return false;
    L102:
        return false;
    L100:
        return false;
    L39:
        if ((r12 + ((long) r7)) >= r14) goto L42;
        r15 = false;
        goto L44
    L34:
        if (r12 <= r13) goto L36;
        return false;
    L110:
        return false;
    L99:
        return false;
    L25:
        if (r10 == r20.i) goto L26;
        return false;
    L95:
        return false;
    L19:
        if (r9 <= 10) goto L21;
        return false;
    L21:
        if (r20.g == 2) goto L22;
        return false;
    L12:
        r4 = false;
        goto L14
    L8:
        r6 = false;
        goto L9
    }

    public static void i(int r0, int r1, String r2, boolean r3) {
        if (r3 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r2, new Object[]{Integer.valueOf(r0), Integer.valueOf(r1)}));
    }

    public static void j(int r0, String r1, boolean r2) {
        if (r2 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r1, new Object[]{Integer.valueOf(r0)}));
    }

    public static void k(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.n(r0);
    }

    public static void l(boolean r0) {
        if (r0 == false) goto L4;
        return;
    L4:
        nz2.c();
    }

    public static void m(boolean r0, String r1, long r2) {
        if (r0 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r1, new Object[]{Long.valueOf(r2)}));
    }

    public static void n(boolean r0, String r1, long r2, long r4) {
        if (r0 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r1, new Object[]{Long.valueOf(r2), Long.valueOf(r4)}));
    }

    public static void o(boolean r0, String r1, Object r2) {
        if (r0 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r1, new Object[]{r2}));
    }

    public static void p(boolean r0, String r1, Object r2, Object r3) {
        if (r0 == false) goto L4;
        return;
    L4:
        kf2.n(gh0.s(r1, new Object[]{r2, r3}));
    }

    public static void q(int r2, int r3) {
        if (r2 < 0) goto L7;
        if (r2 >= r3) goto L7;
        return;
    L7:
        if (r2 < 0) goto L12;
        if (r3 >= 0) goto L11;
        kf2.n(f34.f(r3, "negative size: "));
        return;
    L11:
        String r4 = gh0.s("%s (%s) must be less than size (%s)", new Object[]{"index", Integer.valueOf(r2), Integer.valueOf(r3)});
    L14:
        throw new IndexOutOfBoundsException(r4);
    L12:
        r4 = gh0.s("%s (%s) must not be negative", new Object[]{"index", Integer.valueOf(r2)});
        goto L14
    }

    public static void r(oo2 r0) {
        r0.getClass();
    }

    public static void s(Object r0, String r1) {
        if (r0 == null) goto L4;
        return;
    L4:
        nz2.n(r1);
    }

    public static void t(int r1, int r2) {
        if (r1 < 0) goto L5;
        if (r1 > r2) goto L5;
        return;
    L5:
        kf2.h(f("index", r1, r2));
    }

    public static void u(int r1, int r2, int r3) {
        if (r1 < 0) goto L8;
        if (r2 < r1) goto L8;
        if (r2 > r3) goto L8;
        return;
    L8:
        if (r1 < 0) goto L15;
        if (r1 > r3) goto L15;
        if (r2 < 0) goto L14;
        if (r2 > r3) goto L14;
        String r4 = gh0.s("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r2), Integer.valueOf(r1)});
    L17:
        throw new IndexOutOfBoundsException(r4);
    L14:
        r4 = f("end index", r2, r3);
    L15:
        r4 = f("start index", r1, r3);
        goto L17
    }

    public static void v(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.o(r0);
    }

    public static void w(boolean r0) {
        if (r0 == false) goto L4;
        return;
    L4:
        tb4.a();
    }

    public static final int y(z34 r10, String r11) {
        r10.getClass();
        int r0 = r10.getColumnCount();
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L9;
        if (r11.equals(r10.getColumnName(r2)) == true) goto L10;
        r2 = r2 + 1;
    L10:
        if (r2 < 0) goto L12;
        return r2;
    L12:
        String r1 = "`" + r11 + '`';
        int r4 = r10.getColumnCount();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L18;
        if (r1.equals(r10.getColumnName(r5)) == true) goto L19;
        r5 = r5 + 1;
    L19:
        if (r5 < 0) goto L22;
        return r5;
    L22:
        if (Build.VERSION.SDK_INT <= 25) goto L24;
    L39:
        return -1;
    L24:
        if (r11.length() == 0) goto L39;
        int r3 = r10.getColumnCount();
        String r6 = ".".concat(r11);
        String r7 = "." + r11 + '`';
        int r8 = 0;
    L27:
        if (r8 >= r3) goto L39;
        String r9 = r10.getColumnName(r8);
        if (r9.length() < (r11.length() + 2)) goto L38;
        if (xm4.e0(r9, r6, false) == true) goto L37;
        if (r9.charAt(0) != '`') goto L38;
        if (xm4.e0(r9, r7, false) == false) goto L38;
    L37:
        return r8;
    L38:
        r8 = r8 + 1;
        goto L27
    L18:
        r5 = -1;
        goto L19
    L9:
        r2 = -1;
        goto L10
    }

    public static void z(Bundle r1) {
        if (r1 == null) goto L5;
        r1.setClassLoader(rr2.class.getClassLoader());
        return;
    }

    @Override // defpackage.bg4
    public float b(ViewGroup r1, View r2) {
        return r2.getTranslationX();
    }

    public abstract List x(String r1, List r2);
}
