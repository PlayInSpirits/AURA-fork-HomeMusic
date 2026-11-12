package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l93 {
    public static final Object a = null;
    public static final Object b = null;
    public static final kt4 c = null;

    static {
        a = new Object();
        b = new Object();
        c = new kt4(0, new long[0], new Object[0]);
    }

    public static void A(String r2, String r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.d(r2, e(r3, null));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static void B(String r1, String r2, Exception r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.d(r1, e(r2, r3));     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static int C(int r4, int r5, String r6, boolean r7) {
    L2:
        if (r4 >= r5) goto L31;
        char r0 = r6.charAt(r4);
        if (r0 >= ' ') goto L8;
        if (r0 == '\t') goto L8;
    L26:
        boolean r1 = true;
    L28:
        if (r1 == (!r7)) goto L29;
        r4 = r4 + 1;
        goto L2
    L29:
        return r4;
    L8:
        if (r0 >= 127) goto L26;
        if ('0' > r0) goto L14;
        if (r0 < ':') goto L26;
    L14:
        if ('a' > r0) goto L19;
        if (r0 < '{') goto L26;
    L19:
        if ('A' <= r0) goto L21;
    L23:
        if (r0 == ':') goto L26;
        r1 = false;
        goto L28
    L21:
        if (r0 >= '[') goto L23;
    L31:
        return r5;
    }

    public static boolean E(String r3, String r4) {
        if (h12.c(r3, r4) == false) goto L6;
    L11:
        return true;
    L6:
        if (xm4.e0(r3, r4, false) == true) goto L8;
    L12:
        return false;
    L8:
        if (r3.charAt((r3.length() - r4.length()) - 1) != '.') goto L12;
        if (ue5.a.a(r3) == true) goto L12;
        goto L11
    }

    public static void F(String r2, String r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.e(r2, e(r3, null));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static void G(String r1, String r2, Throwable r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.e(r1, e(r2, r3));     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static void H(Parcel r2, int r3) {
        if (r2.dataPosition() != r3) goto L6;
        return;
    L6:
        throw new SafeParcelReader$ParseException(f34.f(r3, "Overread allowed size end="), r2);
    }

    public static void K(String r2, String r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.i(r2, e(r3, null));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static String M(String r3) {
        r3.getClass();
        String r4 = qm4.K0(r3).toString();
        if (r4.length() != 0) goto L6;
    L20:
        return null;
    L6:
        if (qm4.o0(r4, "://") == true) goto L23;
        r4 = "https://".concat(r4);
    L23:
        fr1 r0 = new fr1();     // Catch: IllegalArgumentException -> L10
        r0.e(null, r4);     // Catch: IllegalArgumentException -> L10
        gr1 r5 = r0.b();     // Catch: IllegalArgumentException -> L10
    L11:
        if (r5 == null) goto L20;
        String r1 = r5.d;
        if (r1.length() == 0) goto L20;
        if (qm4.n0(r1, '.') == true) goto L22;
        if (r1.equals("localhost") == false) goto L20;
    L22:
        return qm4.L0(r5.i, new char[]{'/'});
    L10:
        r5 = null;
        goto L11
    }

    public static ik S(Uri r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        if ("tempo".equalsIgnoreCase(r7.getScheme()) == true) goto L8;
        return null;
    L8:
        if ("asset".equalsIgnoreCase(r7.getHost()) == false) goto L60;
        byte r1 = 2;
        if (r7.getPathSegments().size() < 2) goto L61;
        String r0 = r7.getPathSegments().get(0);
        String r3 = r7.getPathSegments().get(1);
        if (TextUtils.isEmpty(r0) == false) goto L16;
        return null;
    L16:
        if (TextUtils.isEmpty(r3) == true) goto L62;
        if (r0 != null) goto L21;
        return null;
    L21:
        switch(r0.hashCode()) {
            case -1409097913: goto L43;
            case 3536149: goto L39;
            case 3704893: goto L36;
            case 92896879: goto L32;
            case 98240899: goto L28;
            case 1879474642: goto L24;
            default: goto L22;
        };
    L22:
        r1 = -1;
    L46:
        switch(r1) {
            case 0: goto L49;
            case 1: goto L49;
            case 2: goto L49;
            case 3: goto L49;
            case 4: goto L49;
            case 5: goto L49;
            default: goto L64;
        };
    L64:
        return null;
    L49:
        return new ik(r0, r3, r7);
    L24:
        if (r0.equals("playlist") == false) goto L52;
        r1 = 5;
        goto L46
    L52:
        r1 = -1;
        goto L46
    L28:
        if (r0.equals("genre") == false) goto L53;
        r1 = 4;
        goto L46
    L53:
        r1 = -1;
        goto L46
    L32:
        if (r0.equals("album") == false) goto L54;
        r1 = 3;
        goto L46
    L54:
        r1 = -1;
        goto L46
    L36:
        if (r0.equals("year") == true) goto L46;
        r1 = -1;
        goto L46
    L39:
        if (r0.equals("song") == false) goto L56;
        r1 = 1;
        goto L46
    L56:
        r1 = -1;
        goto L46
    L43:
        if (r0.equals("artist") == false) goto L57;
        r1 = 0;
        goto L46
    L57:
        r1 = -1;
        goto L46
    L62:
        return null;
    L61:
        return null;
    L60:
        return null;
    }

    public static ae0 T(gr1 r33, String r34) {
        r33.getClass();
        r34.getClass();
        long r2 = System.currentTimeMillis();
        byte[] r0 = xe5.a;
        char r4 = ';';
        int r1 = xe5.f(r34, ';', 0, r34.length());
        int r7 = xe5.f(r34, '=', 0, r1);
        String r8 = null;
        if (r7 == r1) goto L13;
        String r10 = xe5.p(r34, 0, r7);
        if (r10.length() == 0) goto L13;
        if (xe5.h(r10) != (-1)) goto L13;
        String r9 = xe5.p(r34, r7 + 1, r1);
        if (xe5.h(r9) != (-1)) goto L13;
        int r3 = r1 + 1;
        int r11 = r34.length();
        boolean r20 = false;
        boolean r22 = false;
        boolean r26 = false;
        String r23 = null;
        boolean r21 = true;
        long r24 = 253402300799999L;
        long r16 = -1;
        String r12 = null;
    L15:
        long r27 = Long.MAX_VALUE;
        if (r3 >= r11) goto L64;
        int r13 = xe5.f(r34, r4, r3, r11);
        int r14 = xe5.f(r34, '=', r3, r13);
        String r5 = xe5.p(r34, r3, r14);
        if (r14 >= r13) goto L20;
        String r15 = xe5.p(r34, r14 + 1, r13);
    L22:
        if (r5.equalsIgnoreCase("expires") == false) goto L26;
        r24 = U(r15.length(), r15);     // Catch: Throwable -> L103
    L24:
        r22 = true;
    L62:
        r3 = r13 + 1;
        r4 = ';';
        goto L15
    L26:
        if (r5.equalsIgnoreCase("max-age") == false) goto L40;
        r16 = Long.parseLong(r15);     // Catch: NumberFormatException -> L31
        if (r16 > 0) goto L24;
        r16 = Long.MIN_VALUE;
    L31:
        e = move-exception;
        Pattern r6 = Pattern.compile("-?\\d+");
        r6.getClass();
        if (r6.matcher(r15).matches() == false) goto L38;
        if (xm4.k0(r15, "-", false) == false) goto L37;
        r27 = Long.MIN_VALUE;
    L37:
        r16 = r27;
        goto L24
    L38:
        throw e;
    L40:
        if (r5.equalsIgnoreCase("domain") == false) goto L51;
        if (xm4.e0(r15, ".", false) == true) goto L49;
        String r17 = ue5.b(qm4.z0(r15, "."));     // Catch: Throwable -> L103
        if (r17 == null) goto L47;
        r8 = r17;
        r21 = false;
        goto L62
    L47:
        throw new IllegalArgumentException();     // Catch: Throwable -> L103
    L49:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L103
    L51:
        if (r5.equalsIgnoreCase("path") == false) goto L54;
        r12 = r15;
        goto L62
    L54:
        if (r5.equalsIgnoreCase("secure") == false) goto L57;
        r26 = true;
        goto L62
    L57:
        if (r5.equalsIgnoreCase("httponly") == false) goto L60;
        r20 = true;
        goto L62
    L60:
        if (r5.equalsIgnoreCase("samesite") == false) goto L62;
        r23 = r15;
        goto L62
    L20:
        r15 = "";
        goto L22
    L64:
        if (r16 != Long.MIN_VALUE) goto L67;
        long r18 = Long.MIN_VALUE;
    L79:
        String r19 = r33.d;
        if (r8 != null) goto L83;
        String r110 = r19;
    L87:
        if (r19.length() != r110.length()) goto L89;
    L91:
        String r25 = "/";
        if (r12 != null) goto L94;
    L97:
        String r28 = r33.b();
        int r29 = qm4.v0(r28, '/', 0, 6);
        if (r29 == 0) goto L100;
        r25 = r28.substring(0, r29);
    L100:
        r12 = r25;
    L102:
        return new ae0(r10, r9, r18, r110, r12, r26, r20, r22, r21, r23);
    L94:
        if (xm4.k0(r12, "/", false) == true) goto L102;
    L89:
        if (b.j.a(r110) != null) goto L91;
    L84:
        return null;
    L83:
        if (E(r19, r8) == false) goto L84;
        r110 = r8;
        goto L87
    L67:
        if (r16 != (-1)) goto L69;
        r18 = r24;
        goto L79
    L69:
        if (r16 > 9223372036854775L) goto L71;
        r27 = r16 * 1000;
    L71:
        long r210 = r2 + r27;
        if (r210 >= r2) goto L74;
    L77:
        r18 = 253402300799999L;
        goto L79
    L74:
        if (r210 > 253402300799999L) goto L77;
        r18 = r210;
    L13:
        return null;
    }

    public static long U(int r13, String r14) {
        int r1 = C(0, r13, r14, false);
        Matcher r2 = ae0.n.matcher(r14);
        int r4 = -1;
        int r5 = -1;
        int r6 = -1;
        int r7 = -1;
        int r8 = -1;
        int r9 = -1;
    L4:
        if (r1 >= r13) goto L24;
        int r12 = C(r1 + 1, r13, r14, true);
        r2.region(r1, r12);
        if (r5 == (-1)) goto L8;
    L10:
        if (r6 == (-1)) goto L12;
    L14:
        if (r7 != (-1)) goto L18;
        Pattern r3 = ae0.l;
        if (r2.usePattern(r3).matches() == false) goto L18;
        String r10 = r2.group(1);
        r10.getClass();
        Locale r11 = Locale.US;
        r11.getClass();
        String r15 = r10.toLowerCase(r11);
        r15.getClass();
        String r16 = r3.pattern();
        r16.getClass();
        r7 = qm4.s0(r16, r15, 0, 6) / 4;
    L22:
        r1 = C(r12 + 1, r13, r14, false);
    L18:
        if (r4 != (-1)) goto L22;
        if (r2.usePattern(ae0.k).matches() == false) goto L22;
        String r17 = r2.group(1);
        r17.getClass();
        r4 = Integer.parseInt(r17);
        goto L22
    L12:
        if (r2.usePattern(ae0.m).matches() == false) goto L14;
        String r18 = r2.group(1);
        r18.getClass();
        r6 = Integer.parseInt(r18);
        goto L22
    L8:
        if (r2.usePattern(ae0.n).matches() == false) goto L10;
        String r19 = r2.group(1);
        r19.getClass();
        r5 = Integer.parseInt(r19);
        String r20 = r2.group(2);
        r20.getClass();
        r8 = Integer.parseInt(r20);
        String r21 = r2.group(3);
        r21.getClass();
        r9 = Integer.parseInt(r21);
        goto L22
    L24:
        if (70 <= r4) goto L26;
    L28:
        if (r4 < 0) goto L32;
        if (r4 >= 70) goto L32;
        r4 = r4 + 2000;
    L32:
        if (r4 < 1601) goto L57;
        if (r7 == (-1)) goto L55;
        if (1 <= r6) goto L36;
    L53:
        kf2.n("Failed requirement.");
        return 0;
    L36:
        if (r6 >= 32) goto L53;
        if (r5 >= 0) goto L39;
    L51:
        kf2.n("Failed requirement.");
        return 0;
    L39:
        if (r5 >= 24) goto L51;
        if (r8 >= 0) goto L42;
    L49:
        kf2.n("Failed requirement.");
        return 0;
    L42:
        if (r8 >= 60) goto L49;
        if (r9 < 0) goto L47;
        if (r9 >= 60) goto L47;
        GregorianCalendar r110 = new GregorianCalendar(ze5.b);
        r110.setLenient(false);
        r110.set(1, r4);
        r110.set(2, r7 - 1);
        r110.set(5, r6);
        r110.set(11, r5);
        r110.set(12, r8);
        r110.set(13, r9);
        r110.set(14, 0);
        return r110.getTimeInMillis();
    L47:
        kf2.n("Failed requirement.");
        return 0;
    L55:
        kf2.n("Failed requirement.");
        return 0;
    L57:
        kf2.n("Failed requirement.");
        return 0;
    L26:
        if (r4 >= 100) goto L28;
        r4 = r4 + 1900;
        goto L28
    }

    public static boolean V(Parcel r1, int r2) {
        t0(r1, r2, 4);
        if (r1.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int W(Parcel r1, int r2) {
        t0(r1, r2, 4);
        return r1.readInt();
    }

    public static long X(Parcel r1, int r2) {
        t0(r1, r2, 8);
        return r1.readLong();
    }

    public static rm3 Y(be3 r11) {
        r11.O(1);
        int r0 = r11.D();
        long r1 = ((long) r11.b) + ((long) r0);
        int r2 = r0 / 18;
        long[] r3 = new long[r2];
        long[] r4 = new long[r2];
        boolean r5 = false;
        int r6 = 0;
    L3:
        if (r6 >= r2) goto L8;
        long r7 = r11.u();
        if (r7 == (-1)) goto L6;
        r3[r6] = r7;
        r4[r6] = r11.u();
        r11.O(2);
        r6 = r6 + 1;
        goto L3
    L6:
        r3 = Arrays.copyOf(r3, r6);
        r4 = Arrays.copyOf(r4, r6);
    L8:
        r11.O((int) (r1 - ((long) r11.b)));
        return new rm3(r3, r4, r5);
    }

    public static int Z(Parcel r2, int r3) {
        if ((r3 & (-65536)) == (-65536)) goto L7;
        return (char) (r3 >> 16);
    L7:
        return r2.readInt();
    }

    public static final long a(float r4, float r5) {
        long r0 = Float.floatToRawIntBits(r4);
        return (((long) Float.floatToRawIntBits(r5)) & 4294967295L) | (r0 << 32);
    }

    public static final void a0(rg1 r2) {
        r2.b(new m94(13), j15.a);
    }

    public static final void b(nc3 r6, Object r7, int r8, Object r9, rg1 r10, int r11) {
        r10.S(1439843069);
        if (r10.e(r6) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r11;
        if (r10.e(r7) == false) goto L9;
        int r2 = 32;
    L10:
        int r3 = r1 | r2;
        if (r10.d(r8) == false) goto L13;
        int r4 = 256;
    L14:
        int r5 = r3 | r4;
        if (r10.e(r9) == false) goto L17;
        int r12 = 2048;
    L18:
        int r13 = r5 | r12;
        if ((r13 & 1171) == 1170) goto L21;
        boolean r14 = true;
    L23:
        if (r10.K(r13 & 1, r14) == false) goto L25;
        ((u44) r7).e(r9, fh0.w(980966366, new d82(r8, r6, r9), r10), r10, 48);
    L26:
        lv3 r15 = r10.p();
        if (r15 == null) goto L30;
        r15.d = new o70(r6, r7, r8, r9, r11);
        return;
    L30:
        return;
    L25:
        r10.N();
        goto L26
    L21:
        r14 = false;
        goto L23
    L17:
        r12 = 1024;
        goto L18
    L13:
        r4 = 128;
        goto L14
    L9:
        r2 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static boolean b0(String r2, String r3) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (qm4.u0(r2) == true) goto L22;
        if (r3 != null) goto L8;
        return false;
    L8:
        if (qm4.u0(r3) == true) goto L23;
        String r4 = M(r2);
        String r0 = null;
        if (r4 == null) goto L13;
        String r5 = r4.toLowerCase(Locale.ROOT);
        r5.getClass();
    L14:
        String r6 = M(r3);
        if (r6 == null) goto L18;
        r0 = r6.toLowerCase(Locale.ROOT);
        r0.getClass();
    L18:
        return h12.c(r5, r0);
    L13:
        r5 = null;
        goto L14
    L23:
        return false;
    L22:
        return false;
    }

    public static final long c(int r4, int r5) {
        if (r4 < 0) goto L5;
        if (r5 < 0) goto L5;
    L6:
        long r6 = (((long) r5) & 4294967295L) | (((long) r4) << 32);
        int r0 = ss4.c;
        return r6;
    L5:
        dz1.a("start and end cannot be negative. [start: " + r4 + ", end: " + r5 + "]");
        goto L6
    }

    public static final void c0(wf1 r1, rg1 r2, Object r3) {
        if (r2.S == false) goto L5;
    L8:
        r2.b0(r3);
        r2.b(r1, r3);
        return;
    L5:
        if (h12.c(r2.H(), r3) == false) goto L8;
    }

    public static void d(StringBuilder r5, String r6) {
        r5.append('\"');
        int r1 = r6.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L14;
        char r3 = r6.charAt(r2);
        if (r3 != '\n') goto L8;
        r5.append("%0A");
    L13:
        r2 = r2 + 1;
        goto L3
    L8:
        if (r3 != '\r') goto L10;
        r5.append("%0D");
        goto L13
    L10:
        if (r3 != '\"') goto L12;
        r5.append("%22");
        goto L13
    L12:
        r5.append(r3);
        goto L13
    L14:
        r5.append('\"');
    }

    public static void d0(Window r2, boolean r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L7;
        p3.f(r2, r3);
        return;
    L7:
        if (r0 < 30) goto L10;
        p3.e(r2, r3);
        return;
    L10:
        View r4 = r2.getDecorView();
        int r1 = r4.getSystemUiVisibility();
        if (r3 == false) goto L13;
        int r5 = r1 & (-1793);
    L14:
        r4.setSystemUiVisibility(r5);
        return;
    L13:
        r5 = r1 | 1792;
        goto L14
    }

    public static String e(String r3, Throwable r4) {
        if (r4 != null) goto L4;
        String r5 = null;
    L19:
        if (TextUtils.isEmpty(r5) == true) goto L27;
        StringBuilder r6 = b11.s(r3, "\n  ");
        r6.append(r5.replace("\n", "\n  "));
        r6.append('\n');
        return r6.toString();
    L27:
        return r3;
    L4:
        Object r0 = b;
        monitor-enter(r0);
        Throwable r1 = r4;
    L7:
        if (r1 == null) goto L16;
    L13:
        th = move-exception;
        throw th;
    L9:
        if ((r1 instanceof UnknownHostException) == true) goto L10;
        r1 = r1.getCause();     // Catch: Throwable -> L13
        goto L7
    L10:
        r5 = "UnknownHostException (no network)";
        monitor-exit(r0);     // Catch: Throwable -> L13
        goto L19
    L16:
        r5 = Log.getStackTraceString(r4).trim().replace("\t", "    ");     // Catch: Throwable -> L13
        monitor-exit(r0);     // Catch: Throwable -> L13
        goto L19
    }

    public static void f(kc0 r40, eb2 r41, ArrayList r42, int r43) {
        kc0 r0 = r40;
        if (r43 != 0) goto L6;
        int r2 = r0.y0;
        p00[] r3 = r0.B0;
        int r15 = 0;
    L5:
        int r13 = r2;
        p00[] r14 = r3;
        int r4 = 0;
    L8:
        if (r4 >= r13) goto L429;
        p00 r5 = r14[r4];
        boolean r6 = r5.q;
        jc0 r7 = r5.a;
        hb0[] r8 = r7.P;
        int r9 = 3;
        ai4 r16 = null;
        int r10 = 8;
        float r17 = 0.0f;
        if (r6 == true) goto L100;
        int r11 = r5.l;
        int r18 = r11 * 2;
        jc0 r12 = r7;
        jc0 r21 = r12;
        boolean r19 = false;
    L12:
        if (r19 == true) goto L80;
        r5.i++;
        jc0[] r20 = r12.l0;
        hb0[] r110 = r12.P;
        r20[r11] = null;
        r12.k0[r11] = null;
        if (r12.f0 == r10) goto L66;
        r12.h(r11);
        r110[r18].d();
        int r22 = r18 + 1;
        r110[r22].d();
        r110[r18].d();
        r110[r22].d();
        if (r5.b != null) goto L18;
        r5.b = r12;
    L18:
        r5.d = r12;
        int r23 = r12.o0[r11];
        if (r23 != r9) goto L66;
        int r24 = r12.t[r11];
        if (r24 == 0) goto L27;
        if (r24 == r9) goto L27;
        if (r24 == 2) goto L27;
        r4 = r4;
        int r27 = r11;
    L52:
        if (r27 != 0) goto L60;
        if (r12.r == 0) goto L57;
    L65:
        jc0 r25 = r21;
        if (r25 == r12) goto L69;
        r25.l0[r27] = r12;
    L69:
        hb0 r26 = r110[r18 + 1].f;
        if (r26 == null) goto L75;
        jc0 r28 = r26.d;
        hb0 r29 = r28.P[r18].f;
        if (r29 == null) goto L75;
        if (r29.d != r12) goto L75;
    L76:
        if (r28 != null) goto L79;
        r28 = r12;
        r19 = true;
    L79:
        r21 = r12;
        r11 = r27;
        r9 = 3;
        r10 = 8;
        r12 = r28;
        r4 = r4;
    L75:
        r28 = null;
        goto L76
    L57:
        if (r12.u != 0) goto L65;
        int r30 = r12.v;
        goto L65
    L60:
        if (r12.s != 0) goto L65;
        if (r12.x != 0) goto L65;
        int r31 = r12.y;
    L27:
        r5.j++;
        float r32 = r12.j0[r11];
        if (r32 <= 0.0f) goto L31;
        r5.k += r32;
    L31:
        r27 = r11;
        if (r12.f0 == 8) goto L46;
        if (r23 != 3) goto L46;
        if (r24 == 0) goto L38;
        if (r24 != 3) goto L46;
    L38:
        if (r32 >= 0.0f) goto L40;
        r5.n = true;
    L42:
        if (r5.h != null) goto L44;
        r5.h = new ArrayList();
    L44:
        r5.h.add(r12);
        goto L46
    L40:
        r5.o = true;
    L46:
        if (r5.f != null) goto L48;
        r5.f = r12;
    L48:
        jc0 r33 = r5.g;
        if (r33 == null) goto L51;
        r33.k0[r27] = r12;
    L51:
        r5.g = r12;
    L66:
        r4 = r4;
        r27 = r11;
        goto L65
    L80:
        int r210 = r4;
        int r211 = r11;
        jc0 r34 = r5.b;
        if (r34 == null) goto L83;
        r34.P[r18].d();
    L83:
        jc0 r35 = r5.d;
        if (r35 == null) goto L86;
        r35.P[r18 + 1].d();
    L86:
        r5.c = r12;
        if (r211 == 0) goto L89;
    L91:
        r5.e = r7;
    L93:
        if (r5.o == true) goto L95;
    L97:
        boolean r36 = false;
    L98:
        r5.p = r36;
    L101:
        r5.q = true;
        if (r42 != 0) goto L104;
    L107:
        jc0 r111 = r5.c;
        jc0 r112 = r5.b;
        jc0 r37 = r5.d;
        jc0 r38 = r5.e;
        float r39 = r5.k;
        int[] r44 = r0.o0;
        hb0[] r45 = r0.P;
        if (r44[r43] != 2) goto L110;
        boolean r46 = true;
    L111:
        if (r43 != 0) goto L126;
        int r47 = r38.h0;
        if (r47 != 0) goto L116;
        boolean r212 = true;
    L117:
        if (r47 != 1) goto L120;
        boolean r213 = true;
    L121:
        if (r47 != 2) goto L123;
        boolean r48 = true;
    L124:
        boolean r214 = r213;
        boolean r215 = r212;
    L125:
        boolean r216 = false;
    L139:
        if (r216 == true) goto L194;
        hb0[] r49 = r7.P;
        int[] r50 = r7.o0;
        hb0 r51 = r49[r15];
        if (r48 == false) goto L143;
        int r310 = 1;
    L144:
        int r311 = r51.d();
        boolean r312 = r46;
        boolean r313 = r48;
        if (r50[r43] == 3) goto L147;
    L149:
        boolean r52 = false;
    L150:
        hb0 r53 = r51.f;
        if (r53 == null) goto L154;
        if (r7 == r7) goto L154;
        r311 = r53.d() + r311;
    L154:
        int r54 = r311;
        if (r313 == false) goto L159;
        if (r7 == r7) goto L159;
        if (r7 == r112) goto L159;
        r310 = 8;
    L159:
        jc0 r314 = r7;
        hb0 r55 = r51.f;
        if (r55 == null) goto L175;
        boolean r315 = r52;
        ai4 r56 = r51.i;
        ai4 r57 = r55.i;
        if (r7 != r112) goto L164;
        r41.f(r56, r57, r54, 6);
    L165:
        if (r315 == false) goto L168;
        if (r313 == true) goto L168;
        r310 = 5;
    L168:
        if (r7 != r112) goto L173;
        if (r313 == false) goto L173;
        if (r7.R[r43] == false) goto L173;
        int r58 = 5;
    L174:
        r41.e(r51.i, r51.f.i, r54, r58);
    L173:
        r58 = r310;
        goto L174
    L164:
        r41.f(r56, r57, r54, 8);
    L175:
        if (r312 == true) goto L177;
    L183:
        hb0 r59 = r49[r15 + 1].f;
        if (r59 == null) goto L189;
        jc0 r60 = r59.d;
        hb0 r61 = r60.P[r15].f;
        if (r61 == null) goto L189;
        if (r61.d != r7) goto L189;
    L190:
        if (r60 == null) goto L192;
        r7 = r60;
    L193:
        r7 = r314;
        r46 = r312;
        r48 = r313;
        goto L139
    L192:
        r216 = true;
    L189:
        r60 = null;
        goto L190
    L177:
        if (r7.f0 != 8) goto L179;
    L181:
        int r62 = 0;
    L182:
        r41.f(r49[r15].i, r45[r15].i, r62, 8);
        goto L183
    L179:
        if (r50[r43] != 3) goto L181;
        r62 = 0;
        r41.f(r49[r15 + 1].i, r49[r15].i, 0, 5);
        goto L182
    L147:
        if (r7.t[r43] != 0) goto L149;
        r52 = true;
        goto L150
    L143:
        r310 = 4;
        goto L144
    L194:
        boolean r316 = r46;
        boolean r317 = r48;
        if (r37 == null) goto L212;
        int r63 = r15 + 1;
        if (r111.P[r63].f == null) goto L212;
        hb0 r64 = r37.P[r63];
        if (r37.o0[r43] != 3) goto L207;
        if (r37.t[r43] != 0) goto L207;
        if (r317 == true) goto L207;
        hb0 r65 = r64.f;
        if (r65.d != r0) goto L207;
        r41.e(r64.i, r65.i, -r64.d(), 5);
    L211:
        r41.g(r64.i, r111.P[r63].f.i, -r64.d(), 6);
    L207:
        if (r317 == false) goto L211;
        hb0 r66 = r64.f;
        if (r66.d != r0) goto L211;
        r41.e(r64.i, r66.i, -r64.d(), 4);
    L212:
        if (r316 == false) goto L214;
        int r67 = r15 + 1;
        ai4 r68 = r45[r67].i;
        hb0 r69 = r111.P[r67];
        r41.f(r68, r69.i, r69.d(), 8);
    L214:
        ArrayList r70 = r5.h;
        if (r70 == null) goto L254;
        int r71 = r70.size();
        if (r71 <= 1) goto L254;
        if (r5.n == true) goto L221;
    L223:
        jc0 r72 = null;
        float r113 = 0.0f;
        int r73 = 0;
    L224:
        if (r73 >= r71) goto L254;
        jc0 r74 = (jc0) r70.get(r73);
        float[] r1 = r74.j0;
        hb0[] r75 = r74.P;
        float r114 = r1[r43];
        if (r114 < r17) goto L228;
    L231:
        ArrayList r318 = r70;
        int r319 = r71;
        if (r114 != r17) goto L235;
        r41.e(r75[r15 + 1].i, r75[r15].i, 0, 8);
    L234:
        int r217 = r13;
        float r320 = r17;
        r113 = r113;
        int r115 = r73;
    L253:
        r73 = r115 + 1;
        r13 = r217;
        r70 = r318;
        r71 = r319;
        r17 = r320;
        goto L224
    L235:
        float r218 = r113;
        if (r72 == null) goto L251;
        hb0[] r76 = r72.P;
        ai4 r77 = r76[r15].i;
        int r321 = r15 + 1;
        ai4 r78 = r76[r321].i;
        ai4 r79 = r75[r15].i;
        ai4 r116 = r75[r321].i;
        pi r80 = r41.l();
        float r81 = r17;
        r80.b = r81;
        r320 = r81;
        if (r39 != r81) goto L240;
    L241:
        r115 = r73;
        r217 = r13;
        r80.d.g(r77, 1.0f);
        r80.d.g(r78, -1.0f);
        r80.d.g(r116, 1.0f);
        r80.d.g(r79, -1.0f);
    L250:
        r41.c(r80);
    L252:
        r113 = r114;
        r72 = r74;
        goto L253
    L240:
        if (r218 == r114) goto L241;
        ji r82 = r80.d;
        if (r218 != r320) goto L245;
        r115 = r73;
        r82.g(r77, 1.0f);
        r80.d.g(r78, -1.0f);
        r217 = r13;
        goto L250
    L245:
        r115 = r73;
        r217 = r13;
        if (r114 != r17) goto L248;
        r82.g(r79, 1.0f);
        r80.d.g(r116, -1.0f);
        goto L250
    L248:
        float r117 = (r218 / r39) / (r114 / r39);
        r82.g(r77, 1.0f);
        r80.d.g(r78, -1.0f);
        r80.d.g(r116, r117);
        r80.d.g(r79, -r117);
        goto L250
    L251:
        r217 = r13;
        r320 = r17;
        r115 = r73;
        goto L252
    L228:
        if (r5.p == false) goto L230;
        r318 = r70;
        r319 = r71;
        r41.e(r75[r15 + 1].i, r75[r15].i, 0, 4);
        goto L234
    L230:
        r114 = 1.0f;
        goto L231
    L221:
        if (r5.p == true) goto L223;
        r39 = r5.j;
    L254:
        int r219 = r13;
        if (r112 == null) goto L259;
        if (r112 == r37) goto L260;
        if (r317 == false) goto L259;
    L260:
        hb0 r83 = r8[r15];
        int r84 = r15 + 1;
        hb0 r85 = r111.P[r84];
        hb0 r86 = r83.f;
        if (r86 == null) goto L263;
        ai4 r87 = r86.i;
    L264:
        hb0 r88 = r85.f;
        if (r88 == null) goto L267;
        ai4 r89 = r88.i;
    L268:
        hb0 r90 = r112.P[r15];
        if (r37 == null) goto L271;
        r85 = r37.P[r84];
    L271:
        if (r87 == null) goto L278;
        if (r89 == null) goto L278;
        if (r43 != 0) goto L276;
        float r91 = r38.c0;
    L275:
        float r92 = r91;
        int r93 = r90.d();
        int r94 = r85.d();
        ai4 r95 = r90.i;
        ai4 r96 = r85.i;
        ai4 r97 = r87;
        jc0 r98 = r37;
        r41.b(r95, r97, r93, r92, r89, r96, r94, 7);
    L279:
        eb2 r99 = r41;
    L403:
        if (r215 == true) goto L405;
        if (r214 == true) goto L405;
    L428:
        r4 = r210 + 1;
        r0 = r40;
        r13 = r219;
    L405:
        if (r112 == null) goto L428;
        if (r112 == r98) goto L428;
        hb0[] r100 = r112.P;
        hb0 r101 = r100[r15];
        if (r98 != null) goto L410;
        r98 = r112;
    L410:
        hb0[] r102 = r98.P;
        int r103 = r15 + 1;
        hb0 r104 = r102[r103];
        hb0 r105 = r101.f;
        if (r105 == null) goto L413;
        ai4 r106 = r105.i;
    L414:
        hb0 r107 = r104.f;
        if (r107 == null) goto L417;
        ai4 r108 = r107.i;
    L418:
        if (r111 == r98) goto L423;
        hb0 r109 = r111.P[r103].f;
        if (r109 == null) goto L422;
        r16 = r109.i;
    L422:
        r108 = r16;
    L423:
        if (r112 != r98) goto L425;
        r104 = r100[r103];
    L425:
        if (r106 == null) goto L428;
        if (r108 == null) goto L428;
        int r118 = r101.d();
        int r119 = r102[r103].d();
        r99.b(r101.i, r106, r118, 0.5f, r108, r104.i, r119, 5);
        goto L428
    L417:
        r108 = null;
        goto L418
    L413:
        r106 = null;
        goto L414
    L276:
        r91 = r38.d0;
    L278:
        r98 = r37;
        goto L279
    L267:
        r89 = null;
        goto L268
    L263:
        r87 = null;
    L259:
        r98 = r37;
        if (r215 == false) goto L343;
        if (r112 == null) goto L343;
        int r120 = r5.j;
        if (r120 > 0) goto L285;
    L287:
        boolean r220 = false;
    L288:
        jc0 r121 = r112;
        jc0 r122 = r121;
    L289:
        hb0[] r123 = r122.P;
        if (r121 == null) goto L279;
        hb0[] r124 = r121.P;
        jc0 r125 = r121.l0[r43];
    L292:
        if (r125 == null) goto L296;
        int r126 = 8;
        if (r125.f0 != 8) goto L297;
        r125 = r125.l0[r43];
    L297:
        if (r125 != null) goto L301;
        if (r121 == r98) goto L301;
        int r127 = r126;
    L340:
        if (r121.f0 == r127) goto L342;
        r122 = r121;
    L342:
        r121 = r125;
        r122 = r122;
    L301:
        hb0 r128 = r124[r15];
        ai4 r129 = r128.i;
        hb0 r130 = r128.f;
        if (r130 == null) goto L304;
        ai4 r131 = r130.i;
    L305:
        if (r122 == r121) goto L307;
        r131 = r123[r15 + 1].i;
    L312:
        int r132 = r128.d();
        int r133 = r15 + 1;
        int r134 = r124[r133].d();
        if (r125 == null) goto L315;
        hb0 r135 = r125.P[r15];
        hb0[] r136 = r123;
        ai4 r137 = r135.i;
    L319:
        ai4 r138 = r124[r133].i;
        if (r135 == null) goto L322;
        r134 = r134 + r135.d();
    L322:
        int r139 = r136[r133].d() + r132;
        if (r129 == null) goto L338;
        if (r131 == null) goto L338;
        if (r137 == null) goto L338;
        if (r138 == null) goto L338;
        if (r121 != r112) goto L329;
        r139 = r112.P[r15].d();
    L329:
        int r140 = r139;
        if (r121 != r98) goto L332;
        r134 = r98.P[r133].d();
    L332:
        int r141 = r134;
        if (r220 == false) goto L336;
        int r142 = 8;
    L337:
        r127 = 8;
        r41.b(r129, r131, r140, 0.5f, r137, r138, r141, r142);
        goto L340
    L336:
        r142 = 5;
    L338:
        r127 = 8;
        goto L340
    L315:
        r136 = r123;
        r135 = r111.P[r133].f;
        if (r135 == null) goto L318;
        r137 = r135.i;
        goto L319
    L318:
        r137 = null;
        goto L319
    L307:
        if (r121 != r112) goto L312;
        hb0 r143 = r8[r15].f;
        if (r143 == null) goto L311;
        r131 = r143.i;
        goto L312
    L311:
        r131 = null;
        goto L312
    L304:
        r131 = null;
        goto L305
    L296:
        r126 = 8;
        goto L297
    L285:
        if (r5.i != r120) goto L287;
        r220 = true;
    L343:
        int r144 = 8;
        if (r214 == false) goto L279;
        if (r112 == null) goto L279;
        int r145 = r5.j;
        if (r145 > 0) goto L349;
    L351:
        boolean r221 = false;
    L352:
        jc0 r146 = r112;
        jc0 r147 = r146;
    L353:
        hb0[] r148 = r146.P;
        if (r147 == null) goto L394;
        hb0[] r149 = r147.P;
        jc0 r150 = r147.l0[r43];
    L356:
        if (r150 == null) goto L360;
        if (r150.f0 != r144) goto L360;
        r150 = r150.l0[r43];
    L360:
        if (r147 == r112) goto L389;
        if (r147 == r98) goto L389;
        if (r150 == null) goto L389;
        if (r150 != r98) goto L365;
        r150 = null;
    L365:
        hb0 r151 = r149[r15];
        ai4 r152 = r151.i;
        int r153 = r15 + 1;
        ai4 r154 = r148[r153].i;
        int r155 = r151.d();
        int r156 = r149[r153].d();
        if (r150 == null) goto L371;
        hb0 r157 = r150.P[r15];
        ai4 r158 = r157.i;
        jc0 r159 = r146;
        hb0 r160 = r157.f;
        if (r160 == null) goto L370;
        ai4 r161 = r160.i;
    L376:
        if (r157 == null) goto L378;
        r156 = r156 + r157.d();
    L378:
        int r162 = r148[r153].d() + r155;
        jc0 r163 = r150;
        int r164 = r156;
        if (r221 == false) goto L381;
        int r165 = 8;
    L382:
        if (r152 == null) goto L387;
        if (r154 == null) goto L387;
        if (r158 == null) goto L387;
        if (r161 == null) goto L387;
        ai4 r166 = r158;
        jc0 r167 = r163;
        r41.b(r152, r154, r162, 0.5f, r166, r161, r164, r165);
    L388:
        r150 = r167;
    L391:
        if (r147.f0 == 8) goto L393;
        r159 = r147;
    L393:
        r147 = r150;
        r144 = 8;
        r146 = r159;
    L387:
        r167 = r163;
        goto L388
    L381:
        r165 = 4;
        goto L382
    L370:
        r161 = null;
        goto L376
    L371:
        r159 = r146;
        hb0 r168 = r98.P[r15];
        if (r168 == null) goto L374;
        r158 = r168.i;
    L375:
        ai4 r169 = r149[r153].i;
        r157 = r168;
        r161 = r169;
        goto L376
    L374:
        r158 = null;
    L389:
        r159 = r146;
        goto L391
    L394:
        r99 = r41;
        hb0 r170 = r112.P[r15];
        hb0 r171 = r8[r15].f;
        int r172 = r15 + 1;
        hb0 r173 = r98.P[r172];
        hb0 r174 = r111.P[r172].f;
        if (r171 == null) goto L400;
        if (r112 == r98) goto L398;
        r99.e(r170.i, r171.i, r170.d(), 5);
        goto L400
    L398:
        if (r174 == null) goto L400;
        r99.b(r170.i, r171.i, r170.d(), 0.5f, r173.i, r174.i, r173.d(), 5);
    L400:
        if (r174 == null) goto L403;
        if (r112 == r98) goto L403;
        r99.e(r173.i, r174.i, -r173.d(), 5);
        goto L403
    L349:
        if (r5.i != r145) goto L351;
        r221 = true;
        goto L352
    L123:
        r48 = false;
        goto L124
    L120:
        r213 = false;
        goto L121
    L116:
        r212 = false;
        goto L117
    L126:
        int r175 = r38.i0;
        if (r175 != 0) goto L130;
        boolean r222 = true;
    L131:
        if (r175 != 1) goto L134;
        boolean r223 = true;
    L135:
        if (r175 != 2) goto L137;
        r48 = true;
    L138:
        r215 = r222;
        r214 = r223;
        goto L125
    L137:
        r48 = false;
        goto L138
    L134:
        r223 = false;
        goto L135
    L130:
        r222 = false;
        goto L131
    L110:
        r46 = false;
        goto L111
    L104:
        if (r42.contains(r7) == true) goto L107;
        r219 = r13;
        goto L428
    L95:
        if (r5.n == false) goto L97;
        r36 = true;
        goto L98
    L89:
        if (r5.m == false) goto L91;
        r5.e = r12;
        goto L93
    L100:
        r210 = r4;
        goto L101
    L429:
        return;
    L6:
        r2 = r0.z0;
        r3 = r0.A0;
        r15 = 2;
        goto L5
    }

    public static void g(View r3) {
        if ((r3 instanceof TextView) == false) goto L9;
        TextView r0 = (TextView) r3;
        if (r0.getTag(R.id.tag_link_original_color) != null) goto L7;
        r0.setTag(R.id.tag_link_original_color, Integer.valueOf(r0.getCurrentTextColor()));
    L7:
        int r1 = r3.getContext().getColor(android.R.color.holo_blue_light);
        r0.setTextColor(g12.s(r3.getContext(), R.attr.colorPrimary, r1));
        return;
    }

    public static ik h(String r0, String r1) {
        String r2 = i(r0, r1);
        if (TextUtils.isEmpty(r2) == false) goto L7;
        return null;
    L7:
        return S(Uri.parse(r2));
    }

    public static String i(String r2, String r3) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return null;
    L5:
        if (TextUtils.isEmpty(r3) == true) goto L39;
        byte r1 = -1;
        switch(r2.hashCode()) {
            case -1409097913: goto L30;
            case 3536149: goto L26;
            case 3704893: goto L22;
            case 92896879: goto L18;
            case 98240899: goto L14;
            case 1879474642: goto L10;
            default: goto L33;
        };
    L33:
        switch(r1) {
            case 0: goto L35;
            case 1: goto L35;
            case 2: goto L35;
            case 3: goto L35;
            case 4: goto L35;
            case 5: goto L35;
            default: goto L40;
        };
    L35:
        Objects.requireNonNull(r3);
        return new Uri.Builder().scheme("tempo").authority("asset").appendPath(r2).appendPath(r3).build().toString();
    L40:
        return null;
    L10:
        if (r2.equals("playlist") == false) goto L33;
        r1 = 5;
        goto L33
    L14:
        if (r2.equals("genre") == false) goto L33;
        r1 = 4;
        goto L33
    L18:
        if (r2.equals("album") == false) goto L33;
        r1 = 3;
        goto L33
    L22:
        if (r2.equals("year") == false) goto L33;
        r1 = 2;
        goto L33
    L26:
        if (r2.equals("song") == false) goto L33;
        r1 = 1;
        goto L33
    L30:
        if (r2.equals("artist") == false) goto L33;
        r1 = 0;
        goto L33
    L39:
        return null;
    }

    public static void j(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.n(r0);
    }

    public static void k(int r0) {
        if (r0 < 0) goto L4;
        return;
    L4:
        nz2.c();
    }

    public static void l(String r2, long r3) {
        if (r3 < 0) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(r2 + " (" + r3 + ") must be >= 0");
    }

    public static void m(Object r0, String r1) {
        if (r0 == null) goto L4;
        return;
    L4:
        nz2.n(r1);
    }

    public static void m0(Parcel r1, int r2) {
        int r3 = Z(r1, r2);
        r1.setDataPosition(r1.dataPosition() + r3);
    }

    public static void n(boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static final void o(int r3, int r4) {
        if (r3 <= 0) goto L6;
        if (r4 <= 0) goto L6;
        return;
    L6:
        if (r3 == r4) goto L8;
        String r5 = b11.n("Both size ", " and step ", r3, r4, " must be greater than zero.");
    L9:
        kf2.e(r5);
        return;
    L8:
        r5 = b11.j(r3, "size ", " must be greater than zero.");
        goto L9
    }

    public static final long o0(long r6) {
        long r4 = Float.floatToRawIntBits((int) (r6 >> 32));
        return (((long) Float.floatToRawIntBits((int) (r6 & 4294967295L))) & 4294967295L) | (r4 << 32);
    }

    public static void p(View r3) {
        if ((r3 instanceof TextView) == false) goto L10;
        TextView r0 = (TextView) r3;
        Object r1 = r0.getTag(R.id.tag_link_original_color);
        if ((r1 instanceof Integer) == false) goto L8;
        r0.setTextColor(((Integer) r1).intValue());
        return;
    L8:
        int r2 = r3.getContext().getColor(android.R.color.primary_text_light);
        r0.setTextColor(g12.s(r3.getContext(), R.attr.colorOnSurface, r2));
        return;
    }

    public static int p0(Parcel r5) {
        int r0 = r5.readInt();
        int r1 = Z(r5, r0);
        char r2 = (char) r0;
        int r3 = r5.dataPosition();
        if (r2 != 20293) goto L12;
        int r4 = r1 + r3;
        if (r4 < r3) goto L10;
        if (r4 > r5.dataSize()) goto L10;
        return r4;
    L10:
        throw new SafeParcelReader$ParseException(xa3.e(r3, r4, "Size read is invalid start=", " end="), r5);
    L12:
        throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r0))), r5);
    }

    public static void q0(String r2, String r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.w(r2, e(r3, null));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static final long r(int r5, long r6) {
        int r0 = ss4.c;
        int r1 = (int) (r6 >> 32);
        int r2 = 0;
        if (r1 >= 0) goto L5;
        int r3 = 0;
    L6:
        if (r3 <= r5) goto L8;
        r3 = r5;
    L8:
        int r4 = (int) (4294967295L & r6);
        if (r4 < 0) goto L12;
        r2 = r4;
    L12:
        if (r2 > r5) goto L15;
        r5 = r2;
    L15:
        if (r3 != r1) goto L20;
        if (r5 != r4) goto L20;
        return r6;
    L20:
        return c(r3, r5);
    L5:
        r3 = r1;
        goto L6
    }

    public static void r0(String r1, String r2, Throwable r3) {
        Object r0 = b;
        monitor-enter(r0);
        Log.w(r1, e(r2, r3));     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static void s0(Parcel r5, int r6, int r7) {
        if (r6 != r7) goto L4;
        return;
    L4:
        String r1 = Integer.toHexString(r6);
        throw new SafeParcelReader$ParseException(b11.q(b11.t("Expected size ", " got ", r7, r6, " (0x"), r1, ")"), r5);
    }

    public static void t(Context r2, ik r3) {
        ClipboardManager r0 = (ClipboardManager) r2.getSystemService("clipboard");
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setPrimaryClip(ClipData.newPlainText(r2.getString(R.string.asset_link_clipboard_label), r3.b.toString()));
    }

    public static void t0(Parcel r5, int r6, int r7) {
        int r8 = Z(r5, r6);
        if (r8 != r7) goto L5;
        return;
    L5:
        String r1 = Integer.toHexString(r8);
        throw new SafeParcelReader$ParseException(b11.q(b11.t("Expected size ", " got ", r7, r8, " (0x"), r1, ")"), r5);
    }

    public static Bundle u(Parcel r2, int r3) {
        int r4 = Z(r2, r3);
        int r0 = r2.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        Bundle r1 = r2.readBundle();
        r2.setDataPosition(r0 + r4);
        return r1;
    }

    public static byte[] v(Parcel r2, int r3) {
        int r4 = Z(r2, r3);
        int r0 = r2.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        byte[] r1 = r2.createByteArray();
        r2.setDataPosition(r0 + r4);
        return r1;
    }

    public static Parcelable w(Parcel r1, int r2, Parcelable.Creator r3) {
        int r4 = Z(r1, r2);
        int r0 = r1.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        Parcelable r5 = (Parcelable) r3.createFromParcel(r1);
        r1.setDataPosition(r0 + r4);
        return r5;
    }

    public static String x(Parcel r2, int r3) {
        int r4 = Z(r2, r3);
        int r0 = r2.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        String r1 = r2.readString();
        r2.setDataPosition(r0 + r4);
        return r1;
    }

    public static Object[] y(Parcel r1, int r2, Parcelable.Creator r3) {
        int r4 = Z(r1, r2);
        int r0 = r1.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        Object[] r5 = r1.createTypedArray(r3);
        r1.setDataPosition(r0 + r4);
        return r5;
    }

    public static ArrayList z(Parcel r1, int r2, Parcelable.Creator r3) {
        int r4 = Z(r1, r2);
        int r0 = r1.dataPosition();
        if (r4 != 0) goto L6;
        return null;
    L6:
        ArrayList r5 = r1.createTypedArrayList(r3);
        r1.setDataPosition(r0 + r4);
        return r5;
    }

    public abstract void D(boolean r1);

    public abstract int I();

    public abstract Context J();

    public boolean L() {
        return false;
    }

    public abstract void N();

    public void O() {
    }

    public abstract boolean P(int r1, KeyEvent r2);

    public boolean Q(KeyEvent r1) {
        return false;
    }

    public boolean R() {
        return false;
    }

    public abstract void e0(boolean r1);

    public abstract void f0(boolean r1);

    public abstract void g0();

    public abstract void h0(int r1);

    public abstract void i0(Drawable r1);

    public abstract void j0(boolean r1);

    public abstract void k0(String r1);

    public abstract void l0(CharSequence r1);

    public d5 n0(rm3 r1) {
        return null;
    }

    public boolean q() {
        return false;
    }

    public abstract boolean s();
}
