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
    public static final r70 a = null;
    public static final d71 b = null;

    static {
        a = new r70(641200809, false, new d60(2, 0));
        b = new d71(lq0.p);
    }

    public static final void A(lg4 r2, bi r3, int r4) {
    L2:
        int r0 = r2.v;
        if (r4 > r0) goto L5;
    L6:
        if (r0 != 0) goto L9;
        if (r4 != 0) goto L9;
        return;
    L9:
        r2.M();
        if (r2.y(r2.v) == false) goto L12;
        r3.g();
    L12:
        r2.j();
        goto L2
    L5:
        if (r4 >= r2.u) goto L6;
    }

    public static double D(double r0, double r2) {
        return E(h12.R(r0), h12.R(r2));
    }

    public static double E(double r3, double r5) {
        double r0 = Math.max(r3, r5);
        if (r0 == r5) goto L7;
        r3 = r5;
    L7:
        return (r0 + 5.0d) / (r3 + 5.0d);
    }

    public static byte[] F(File r8) {
        FileInputStream r0 = new FileInputStream(r8);
        long r1 = r8.length();     // Catch: Throwable -> L12
        if (r1 > 2147483647L) goto L30;
        int r2 = (int) r1;
        byte[] r3 = new byte[r2];     // Catch: Throwable -> L12
        int r5 = r2;
        int r6 = 0;
    L8:
        if (r5 <= 0) goto L14;
        int r7 = r0.read(r3, r6, r5);     // Catch: Throwable -> L12
        if (r7 < 0) goto L14;
        r5 = r5 - r7;     // Catch: Throwable -> L12
        r6 = r6 + r7;     // Catch: Throwable -> L12
    L14:
        if (r5 <= 0) goto L16;
        r3 = Arrays.copyOf(r3, r6);     // Catch: Throwable -> L12
    L25:
        r0.close();
        return r3;
    L16:
        int r9 = r0.read();     // Catch: Throwable -> L12
        if (r9 == (-1)) goto L25;
        a51 r10 = new a51(8193);     // Catch: Throwable -> L12
        r10.write(r9);     // Catch: Throwable -> L12
        byte[] r11 = new byte[8192];     // Catch: Throwable -> L12
        int r12 = r0.read(r11);     // Catch: Throwable -> L12
    L20:
        if (r12 < 0) goto L22;
        r10.write(r11, 0, r12);     // Catch: Throwable -> L12
        r12 = r0.read(r11);     // Catch: Throwable -> L12
        goto L20
    L22:
        int r13 = r10.size() + r2;     // Catch: Throwable -> L12
        if (r13 < 0) goto L28;
        byte[] r14 = r10.b();     // Catch: Throwable -> L12
        r3 = Arrays.copyOf(r3, r13);     // Catch: Throwable -> L12
        ti.X(r2, 0, r10.size(), r14, r3);     // Catch: Throwable -> L12
        goto L25
    L28:
        throw new OutOfMemoryError("File " + r8 + " is too big to fit in memory.");     // Catch: Throwable -> L12
    L30:
        throw new OutOfMemoryError("File " + r8 + " is too big (" + r1 + " bytes) to fit in memory.");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        q05.h(r0, th);
        throw th;
    }

    public static int G(h00 r4, int r5, int r6, int r7) {
        if (Math.max(Math.max(r5, r6), r7) > 31) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        int r1 = (1 << r5) - 1;
        int r2 = (1 << r6) - 1;
        h12.h(h12.h(r1, r2), 1 << r7);
        if (r4.b() < r5) goto L23;
        int r8 = r4.i(r5);
        if (r8 == r1) goto L12;
    L22:
        return r8;
    L12:
        if (r4.b() < r6) goto L24;
        int r9 = r4.i(r6);
        r8 = r8 + r9;
        if (r9 != r2) goto L22;
        if (r4.b() >= r7) goto L21;
        return -1;
    L21:
        return r4.i(r7) + r8;
    L24:
        return -1;
    L23:
        return -1;
    L5:
        r0 = false;
        goto L6
    }

    public static String H(File r4) {
        Charset r0 = w10.a;
        r0.getClass();
        InputStreamReader r1 = new InputStreamReader(new FileInputStream(r4), r0);
        StringWriter r5 = new StringWriter();     // Catch: Throwable -> L9
        char[] r2 = new char[8192];     // Catch: Throwable -> L9
        int r3 = r1.read(r2);     // Catch: Throwable -> L9
    L4:
        if (r3 < 0) goto L6;
        r5.write(r2, 0, r3);     // Catch: Throwable -> L9
        r3 = r1.read(r2);     // Catch: Throwable -> L9
        goto L4
    L6:
        String r6 = r5.toString();     // Catch: Throwable -> L9
        r6.getClass();     // Catch: Throwable -> L9
        r1.close();
        return r6;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        q05.h(r1, th);
        throw th;
    }

    public static void I(Context r8) {
        Context r1 = r8.getApplicationContext();
        cb4 r2 = new cb4(r1, new ComponentName(r1, MediaService.class));
        Bundle r3 = Bundle.EMPTY;
        tv1 r4 = new tv1();
        Looper r5 = f35.x();
        bl2 r6 = new bl2(r5);
        if (r2.a.e() == false) goto L6;
        fi0 r7 = new fi0(new x7(r1));
        xc5 r9 = new xc5(4, r7);
    L7:
        sk2 r0 = new sk2(r1, r2, r3, r4, r5, r6, r9);
        f35.W(new Handler(r5), new pk2(r6, r0, 0));
        r6.f(new w85(2, r6, r1), gq0.n);
        return;
    L6:
        r9 = null;
        goto L7
    }

    public static int J(Context r3, int r4) {
        Bundle r5 = AppWidgetManager.getInstance(r3).getAppWidgetOptions(r4);
        if (r5 == null) goto L5;
        int r6 = r5.getInt("appWidgetMinHeight");
    L6:
        int r0 = r3.getResources().getInteger(R.integer.widget_expanded_min_height_dp);
        int r1 = r3.getResources().getInteger(R.integer.widget_large_min_height_dp);
        int r7 = r3.getResources().getInteger(R.integer.widget_medium_min_height_dp);
        if (r6 < r0) goto L10;
        return 4;
    L10:
        if (r6 < r1) goto L13;
        return 3;
    L13:
        if (r6 < r7) goto L16;
        return 2;
    L16:
        return 1;
    L5:
        r6 = 0;
        goto L6
    }

    public static final long K(long r6) {
        int r1 = Math.round(Float.intBitsToFloat((int) (r6 >> 32)));
        long r7 = ((long) Math.round(Float.intBitsToFloat((int) (r6 & 4294967295L)))) & 4294967295L;
        return r7 | (((long) r1) << 32);
    }

    public static int L(float r1) {
        if (Float.isNaN(r1) == false) goto L5;
        kf2.n("Cannot round NaN value.");
        return 0;
    L5:
        return Math.round(r1);
    }

    public static long M(float r2) {
        double r0 = r2;
        if (Double.isNaN(r0) == false) goto L5;
        kf2.n("Cannot round NaN value.");
        return 0;
    L5:
        return Math.round(r0);
    }

    public static void N(ViewGroup r1, float r2) {
        Drawable r3 = r1.getBackground();
        if ((r3 instanceof fi2) == false) goto L6;
        ((fi2) r3).l(r2);
        return;
    }

    public static void O(View r3, fi2 r4) {
        nz0 r0 = r4.n.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.a == false) goto L16;
        ViewParent r5 = r3.getParent();
        float r1 = 0.0f;
    L8:
        if ((r5 instanceof View) == false) goto L10;
        WeakHashMap r2 = j65.a;
        r1 = r1 + ((View) r5).getElevation();
        r5 = r5.getParent();
        goto L8
    L10:
        ei2 r6 = r4.n;
        if (r6.l == r1) goto L17;
        r6.l = r1;
        r4.u();
        return;
    L17:
        return;
    }

    public static void P(ViewGroup r2) {
        Drawable r0 = r2.getBackground();
        if ((r0 instanceof fi2) == false) goto L6;
        O(r2, (fi2) r0);
        return;
    }

    public static void Q(h00 r2) {
        r2.t(3);
        r2.t(8);
        boolean r0 = r2.h();
        boolean r1 = r2.h();
        if (r0 == false) goto L5;
        r2.t(5);
    L5:
        if (r1 == false) goto L8;
        r2.t(6);
        return;
    }

    public static void R(h00 r12) {
        int r1 = r12.i(2);
        int r2 = 6;
        if (r1 != 0) goto L6;
        r12.t(6);
        return;
    L6:
        int r4 = 5;
        int r3 = G(r12, 5, 8, 16) + 1;
        if (r1 != 1) goto L10;
        r12.t(r3 * 7);
        return;
    L10:
        if (r1 != 2) goto L40;
        boolean r5 = r12.h();
        if (r5 == false) goto L14;
        int r8 = 1;
    L15:
        if (r5 == false) goto L17;
        r4 = 7;
    L17:
        if (r5 == false) goto L19;
        r2 = 8;
    L19:
        int r6 = 0;
    L20:
        if (r6 >= r3) goto L46;
        if (r12.h() == false) goto L25;
        r12.t(7);
        int r9 = 0;
    L34:
        if (r9 == 0) goto L39;
        if (r9 == 180) goto L39;
        if (r12.h() == false) goto L39;
        r6 = r6 + 1;
    L39:
        r6 = r6 + 1;
        goto L20
    L25:
        if (r12.i(2) == 3) goto L27;
    L29:
        r9 = r12.i(r2) * r8;
        if (r9 == 0) goto L33;
        if (r9 == 180) goto L33;
        r12.s();
    L33:
        r12.s();
        goto L34
    L27:
        if ((r12.i(r4) * r8) == 0) goto L29;
        r12.s();
        goto L29
    L46:
        return;
    L14:
        r8 = 5;
        goto L15
    }

    public static boolean S(rk0 r12, boolean r13) {
        be3 r0 = new be3(16);
        boolean r3 = true;
    L3:
        r0.K(8);
        if (r12.e(r0.a, 0, 8, true) == false) goto L28;
        long r7 = r0.C();
        int r5 = r0.m();
        if (r7 == 1) goto L9;
        int r9 = 8;
    L13:
        long r10 = r9;
        if (r7 < r10) goto L28;
        int r8 = (int) (r7 - r10);
        if (r3 == true) goto L19;
        if (r5 == 1836086884) goto L31;
        if (r8 == 0) goto L3;
        r12.o(r8, false);
    L31:
        return true;
    L19:
        if (r5 != 1718909296) goto L28;
        if (r8 < 8) goto L28;
        r0.K(4);
        r12.e(r0.a, 0, 4, false);
        if (r0.m() != 1751476579) goto L28;
        if (r13 == false) goto L31;
        r12.o(r8 - 4, false);
        r3 = false;
        goto L3
    L9:
        if (r12.e(r0.a, 8, 8, true) == false) goto L28;
        r7 = r0.G();
        r9 = 16;
    L28:
        return false;
    }

    public static void T(Context r18, String r19, String r20, String r21, String r22, boolean r23, boolean r24, int r25, long r26, long r28, String r30, String r31, String r32) {
        Context r2 = r18.getApplicationContext();
        if (TextUtils.isEmpty(r19) == false) goto L5;
        String r1 = r2.getString(R.string.widget_not_playing);
    L7:
        if (TextUtils.isEmpty(r20) == false) goto L9;
        String r4 = r2.getString(R.string.widget_placeholder_subtitle);
    L11:
        if (TextUtils.isEmpty(r21) == true) goto L13;
        String r3 = r21;
    L14:
        long r7 = Math.max(0, r26);
        if (r28 <= 0) goto L17;
        long r9 = r28;
    L19:
        if (r9 <= 0) goto L24;
        if (r7 <= r9) goto L24;
        r7 = r9;
    L24:
        if (r9 <= 0) goto L26;
    L29:
        String r14 = e03.h(Long.valueOf(r7), true);
    L30:
        if (r9 <= 0) goto L32;
        String r12 = e03.h(Long.valueOf(r9), true);
    L33:
        int r15 = 0;
        if (r9 <= 0) goto L37;
        long r8 = (r7 * 1000) / r9;
        if (r8 < 0) goto L37;
        if (r8 <= 1000) goto L41;
        int r5 = 1000;
    L42:
        ge2 r10 = new ge2(r5, r14, r12);
        if (TextUtils.isEmpty(r22) == true) goto L49;
        wq4 r6 = new ca5(r2, r1, r4, r3, r23, r10, r24, r25, r30, r31, r32);
        vz3 r0 = a.c(r2).g().P(wg0.b(512, r22)).G(wg0.a(2, r2, r22));
        vz3 r11 = r0;
        if (ud3.R() == false) goto L47;
        r11 = (vz3) r0.l();
    L47:
        r11.J(r6, null, r11, fh0.g);
        return;
    L49:
        String r13 = r3;
        String r16 = r1;
        AppWidgetManager r17 = AppWidgetManager.getInstance(r2);
        int[] r110 = r17.getAppWidgetIds(new ComponentName(r2, WidgetProvider4x1.class));
        int r27 = r110.length;
    L50:
        if (r15 >= r27) goto L52;
        int r111 = r110[r15];
        int r29 = r27;
        Context r33 = r2;
        String r34 = r4;
        String r35 = r16;
        String r36 = r13;
        RemoteViews r37 = r(r33, r35, r34, r36, null, r23, r10.a, r10.b, r10.c, r24, r25, r111);
        WidgetProvider4x1.a(r33, r37, r111, r30, r31, r32);
        r17.updateAppWidget(r111, r37);
        r15 = r15 + 1;
        r2 = r33;
        r16 = r35;
        r4 = r34;
        r13 = r36;
        r27 = r29;
        goto L50
    L52:
        return;
    L41:
        r5 = (int) r8;
    L37:
        r5 = 0;
        goto L42
    L32:
        r12 = null;
        goto L33
    L26:
        if (r7 > 0) goto L29;
        r14 = null;
        goto L30
    L17:
        r9 = 0;
        goto L19
    L13:
        r3 = "";
        goto L14
    L9:
        r4 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }

    public static void U(File r2, String r3) {
        Charset r0 = w10.a;
        r0.getClass();
        FileOutputStream r1 = new FileOutputStream(r2);
        V(r1, r3, r0);     // Catch: Throwable -> L6
        r1.close();
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        q05.h(r1, th);
        throw th;
    }

    public static final void V(FileOutputStream r8, String r9, Charset r10) {
        if (r9.length() >= 16384) goto L6;
        byte[] r11 = r9.getBytes(r10);
        r11.getClass();
        r8.write(r11);
        return;
    L6:
        CharsetEncoder r12 = r10.newEncoder();
        CodingErrorAction r0 = CodingErrorAction.REPLACE;
        CharsetEncoder r13 = r12.onMalformedInput(r0).onUnmappableCharacter(r0);
        CharBuffer r1 = CharBuffer.allocate(8192);
        r13.getClass();
        ByteBuffer r2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(r13.maxBytesPerChar())));
        r2.getClass();
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r3 >= r9.length()) goto L26;
        int r5 = Math.min(8192 - r4, r9.length() - r3);
        int r6 = r3 + r5;
        char[] r7 = r1.array();
        r7.getClass();
        r9.getChars(r3, r6, r7, r4);
        r1.limit(r5 + r4);
        r4 = 1;
        if (r6 != r9.length()) goto L12;
        boolean r14 = true;
    L14:
        if (r13.encode(r1, r2, r14).isUnderflow() == false) goto L20;
        r8.write(r2.array(), 0, r2.position());
        if (r1.position() == r1.limit()) goto L18;
        r1.put(0, r1.get());
    L19:
        r1.clear();
        r2.clear();
        r3 = r6;
        goto L8
    L18:
        r4 = 0;
        goto L19
    L20:
        kf2.o("Check failed.");
        return;
    L12:
        r14 = false;
        goto L14
    }

    public static final Exception c(h r0, String r1, GetPublicKeyCredentialDomException r2) {
        return new GetPublicKeyCredentialDomException(r0, r1);
    }

    public static final int g(float r2) {
        return Math.round((float) Math.ceil(r2));
    }

    public static void h(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.n(r0);
    }

    public static void i(boolean r0) {
        if (r0 == false) goto L4;
        return;
    L4:
        nz2.c();
    }

    public static void j(Handler r4) {
        Looper r0 = Looper.myLooper();
        if (r0 == r4.getLooper()) goto L9;
        if (r0 == null) goto L6;
        String r1 = r0.getThread().getName();
    L7:
        kf2.o(f34.h("Must be called on ", r4.getLooper().getThread().getName(), " thread, but got ", r1, "."));
        return;
    L6:
        r1 = "null current looper";
        goto L7
    }

    public static void k(String r0) {
        if (TextUtils.isEmpty(r0) == true) goto L5;
        return;
    L5:
        kf2.n("Given String is empty or null");
    }

    public static void l(String r0, String r1) {
        if (TextUtils.isEmpty(r0) == true) goto L5;
        return;
    L5:
        kf2.n(r1);
    }

    public static void m(Object r0) {
        if (r0 == null) goto L4;
        return;
    L4:
        nz2.n("null reference");
    }

    public static void n(Object r0, String r1) {
        if (r0 == null) goto L4;
        return;
    L4:
        nz2.n(r1);
    }

    public static void o(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.o(r0);
    }

    public static byte p(long r4) {
        if ((r4 >> 8) != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.m(r0, "out of range: %s", r4);
        return (byte) r4;
    L5:
        r0 = false;
        goto L6
    }

    public static RemoteViews q(Context r3, int r4) {
        int r5 = xa3.w(J(r3, r4));
        if (r5 == 1) goto L15;
        if (r5 == 2) goto L13;
        if (r5 == 3) goto L11;
        return rr2.g(r3, R.layout.widget_layout_compact, false, false);
    L11:
        return rr2.g(r3, R.layout.widget_layout_large, true, true);
    L13:
        return rr2.g(r3, R.layout.widget_layout_large_short, true, true);
    L15:
        return rr2.g(r3, R.layout.widget_layout_medium, false, false);
    }

    public static RemoteViews r(Context r14, String r15, String r16, String r17, Bitmap r18, boolean r19, String r20, String r21, int r22, boolean r23, int r24, int r25) {
        int r1 = xa3.w(J(r14, r25));
        if (r1 == 1) goto L15;
        if (r1 == 2) goto L13;
        if (r1 == 3) goto L11;
        return rr2.O(r14, r15, r16, r17, r18, r19, r20, r21, r22, R.layout.widget_layout_compact, false, false, r23, r24);
    L11:
        return rr2.O(r14, r15, r16, r17, r18, r19, r20, r21, r22, R.layout.widget_layout_large, true, true, r23, r24);
    L13:
        return rr2.O(r14, r15, r16, r17, r18, r19, r20, r21, r22, R.layout.widget_layout_large_short, true, true, r23, r24);
    L15:
        return rr2.O(r14, r15, r16, r17, r18, r19, r20, r21, r22, R.layout.widget_layout_medium, true, true, r23, r24);
    }

    public static void s(long r10, be3 r12, wv4[] r13) {
    L2:
        boolean r1 = true;
        if (r12.a() <= 1) goto L51;
        int r2 = 0;
    L6:
        if (r12.a() == 0) goto L7;
        int r3 = r12.A();
        r2 = r2 + r3;
        if (r3 == 255) goto L6;
        int r4 = r2;
    L11:
        int r5 = 0;
    L13:
        if (r12.a() == 0) goto L14;
        int r6 = r12.A();
        r5 = r5 + r6;
        if (r6 == 255) goto L13;
    L17:
        int r7 = r12.b + r5;
        if (r5 != (-1)) goto L20;
    L49:
        l93.q0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        r7 = r12.c;
    L50:
        r12.N(r7);
        goto L2
    L20:
        if (r5 > r12.a()) goto L49;
        if (r4 != 4) goto L50;
        if (r5 < 8) goto L50;
        int r8 = r12.A();
        int r9 = r12.H();
        if (r9 != 49) goto L29;
        int r11 = r12.m();
    L30:
        int r14 = r12.A();
        if (r9 != 47) goto L34;
        r12.O(1);
    L34:
        if (r8 != 181) goto L40;
        if (r9 == 49) goto L38;
        if (r9 != 47) goto L40;
    L38:
        if (r14 != 3) goto L40;
        boolean r15 = true;
    L41:
        if (r9 == 49) goto L43;
    L47:
        if (r15 == false) goto L50;
        t(r10, r12, r13);
        goto L50
    L43:
        if (r11 == 1195456820) goto L46;
        r1 = false;
    L46:
        r15 = r15 & r1;
    L40:
        r15 = false;
        goto L41
    L29:
        r11 = 0;
        goto L30
    L14:
        r5 = -1;
        goto L17
    L7:
        r4 = -1;
        goto L11
    }

    public static void t(long r12, be3 r14, wv4[] r15) {
        int r0 = r14.A();
        if ((r0 & 64) == 0) goto L11;
        r14.O(1);
        int r6 = (r0 & 31) * 3;
        int r1 = r14.b;
        int r9 = r15.length;
        int r11 = 0;
    L5:
        if (r11 >= r9) goto L15;
        wv4 r2 = r15[r11];
        r14.N(r1);
        r2.e(r6, r14);
        if (r12 == (-9223372036854775807L)) goto L9;
        boolean r3 = true;
    L10:
        rr2.w(r3);
        r2.a(r12, 1, r6, 0, null);
        r11 = r11 + 1;
        goto L5
    L9:
        r3 = false;
        goto L10
    L15:
        return;
    }

    public static final void u(int r3, int r4) {
        if (r3 > r4) goto L4;
        return;
    L4:
        kf2.h(b11.n("toIndex (", ") is greater than size (", r3, r4, ")."));
    }

    public static su3 v(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return new m34();
    L8:
        return new ch0();
    L10:
        return new m34();
    }

    public static final long w(long r0, boolean r2, int r3, float r4) {
        if (r2 == true) goto L12;
        if (r3 == 2) goto L12;
        if (r3 == 4) goto L12;
        if (r3 == 5) goto L12;
    L14:
        int r5 = Integer.MAX_VALUE;
    L16:
        if (nc0.j(r0) == r5) goto L20;
        r5 = gb.m(g(r4), nc0.j(r0), r5);
    L20:
        return zz1.m(0, r5, 0, nc0.g(r0));
    L12:
        if (nc0.d(r0) == false) goto L14;
        r5 = nc0.h(r0);
        goto L16
    }

    public static final int x(x34 r2) {
        r2.getClass();
        z34 r3 = r2.U("SELECT changes()");
        r3.O();     // Catch: Throwable -> L6
        int r0 = (int) r3.getLong(0);
        ud3.e(r3, null);
        return r0;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        ud3.e(r3, th);
        throw th;
    }

    public static final dx2 y(dc3 r1, hg3 r2) {
        return new w72(r1, r2);
    }

    public static final long z(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) + ((int) (r8 >> 32));
        float r7 = Float.intBitsToFloat((int) (r6 & 4294967295L)) + ((int) (r8 & 4294967295L));
        return (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r7) & 4294967295L);
    }

    public abstract void B(f2 r1, f2 r2);

    public abstract void C(f2 r1, Thread r2);

    @Override // defpackage.bg4
    public float a(ViewGroup r1, View r2) {
        return r2.getTranslationY();
    }

    public abstract boolean d(g2 r1, c2 r2, c2 r3);

    public abstract boolean e(g2 r1, Object r2, Object r3);

    public abstract boolean f(g2 r1, f2 r2, f2 r3);
}
