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
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final kt4 c = new kt4(0, new long[0], new Object[0]);

    public static void A(String str, String str2) {
        synchronized (b) {
            Log.d(str, e(str2, null));
        }
    }

    public static void B(String str, String str2, Exception exc) {
        synchronized (b) {
            Log.d(str, e(str2, exc));
        }
    }

    public static int C(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean E(String str, String str2) {
        return h12.c(str, str2) || (xm4.e0(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !ue5.a.a(str));
    }

    public static void F(String str, String str2) {
        synchronized (b) {
            Log.e(str, e(str2, null));
        }
    }

    public static void G(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.e(str, e(str2, th));
        }
    }

    public static void H(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(f34.f(i, "Overread allowed size end="), parcel);
        }
    }

    public static void K(String str, String str2) {
        synchronized (b) {
            Log.i(str, e(str2, null));
        }
    }

    public static String M(String str) {
        gr1 gr1VarB;
        str.getClass();
        String string = qm4.K0(str).toString();
        if (string.length() != 0) {
            if (!qm4.o0(string, "://")) {
                string = "https://".concat(string);
            }
            try {
                fr1 fr1Var = new fr1();
                fr1Var.e(null, string);
                gr1VarB = fr1Var.b();
            } catch (IllegalArgumentException unused) {
                gr1VarB = null;
            }
            if (gr1VarB != null) {
                String str2 = gr1VarB.d;
                if (str2.length() != 0 && (qm4.n0(str2, '.') || str2.equals("localhost"))) {
                    return qm4.L0(gr1VarB.i, '/');
                }
            }
        }
        return null;
    }

    public static ik S(Uri uri) {
        if (uri == null || !"tempo".equalsIgnoreCase(uri.getScheme()) || !"asset".equalsIgnoreCase(uri.getHost())) {
            return null;
        }
        if (uri.getPathSegments().size() < 2) {
            return null;
        }
        String str = uri.getPathSegments().get(0);
        String str2 = uri.getPathSegments().get(1);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str == null) {
            return null;
        }
        switch (str) {
            case "artist":
            case "song":
            case "year":
            case "album":
            case "genre":
            case "playlist":
                return new ik(str, str2, uri);
            default:
                return null;
        }
    }

    public static ae0 T(gr1 gr1Var, String str) {
        long j;
        String str2;
        gr1Var.getClass();
        str.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = xe5.a;
        char c2 = ';';
        int iF = xe5.f(str, ';', 0, str.length());
        int iF2 = xe5.f(str, '=', 0, iF);
        String str3 = null;
        if (iF2 != iF) {
            String strP = xe5.p(str, 0, iF2);
            if (strP.length() != 0 && xe5.h(strP) == -1) {
                String strP2 = xe5.p(str, iF2 + 1, iF);
                if (xe5.h(strP2) == -1) {
                    int i = iF + 1;
                    int length = str.length();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    String str4 = null;
                    boolean z4 = true;
                    long jU = 253402300799999L;
                    long j2 = -1;
                    String strSubstring = null;
                    while (true) {
                        if (i >= length) {
                            if (j2 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j2 != -1) {
                                long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                            } else {
                                j = jU;
                            }
                            String str5 = gr1Var.d;
                            if (str3 != null) {
                                if (E(str5, str3)) {
                                    str2 = str3;
                                }
                                return null;
                            }
                            str2 = str5;
                            if (str5.length() == str2.length() || b.j.a(str2) != null) {
                                if (strSubstring == null || !xm4.k0(strSubstring, "/", false)) {
                                    String strB = gr1Var.b();
                                    int iV0 = qm4.v0(strB, '/', 0, 6);
                                    strSubstring = iV0 != 0 ? strB.substring(0, iV0) : "/";
                                }
                                return new ae0(strP, strP2, j, str2, strSubstring, z3, z, z2, z4, str4);
                            }
                            return null;
                        }
                        int iF3 = xe5.f(str, c2, i, length);
                        int iF4 = xe5.f(str, '=', i, iF3);
                        String strP3 = xe5.p(str, i, iF4);
                        String strP4 = iF4 < iF3 ? xe5.p(str, iF4 + 1, iF3) : "";
                        if (strP3.equalsIgnoreCase("expires")) {
                            try {
                                jU = U(strP4.length(), strP4);
                                z2 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strP3.equalsIgnoreCase("max-age")) {
                            try {
                                j2 = Long.parseLong(strP4);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                patternCompile.getClass();
                                if (!patternCompile.matcher(strP4).matches()) {
                                    throw e;
                                }
                                j2 = xm4.k0(strP4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z2 = true;
                        } else if (strP3.equalsIgnoreCase("domain")) {
                            if (xm4.e0(strP4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strB2 = ue5.b(qm4.z0(strP4, "."));
                            if (strB2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = strB2;
                            z4 = false;
                        } else if (strP3.equalsIgnoreCase("path")) {
                            strSubstring = strP4;
                        } else if (strP3.equalsIgnoreCase("secure")) {
                            z3 = true;
                        } else if (strP3.equalsIgnoreCase("httponly")) {
                            z = true;
                        } else if (strP3.equalsIgnoreCase("samesite")) {
                            str4 = strP4;
                        }
                        i = iF3 + 1;
                        c2 = ';';
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long U(int i, String str) {
        int iC = C(0, i, str, false);
        Matcher matcher = ae0.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iS0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iC < i) {
            int iC2 = C(iC + 1, i, str, true);
            matcher.region(iC, iC2);
            if (i3 == -1 && matcher.usePattern(ae0.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(ae0.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iS0 == -1) {
                Pattern pattern = ae0.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iS0 = qm4.s0(strPattern, lowerCase, 0, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(ae0.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iC = C(iC2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        if (iS0 == -1) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            kf2.n("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ze5.b);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iS0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static boolean V(Parcel parcel, int i) {
        t0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int W(Parcel parcel, int i) {
        t0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long X(Parcel parcel, int i) {
        t0(parcel, i, 8);
        return parcel.readLong();
    }

    public static rm3 Y(be3 be3Var) {
        be3Var.O(1);
        int iD = be3Var.D();
        long j = ((long) be3Var.b) + ((long) iD);
        int i = iD / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            long jU = be3Var.u();
            if (jU == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jU;
            jArrCopyOf2[i2] = be3Var.u();
            be3Var.O(2);
        }
        be3Var.O((int) (j - ((long) be3Var.b)));
        return new rm3(jArrCopyOf, jArrCopyOf2, z);
    }

    public static int Z(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void a0(rg1 rg1Var) {
        rg1Var.b(new m94(13), j15.a);
    }

    public static final void b(nc3 nc3Var, Object obj, int i, Object obj2, rg1 rg1Var, int i2) {
        rg1Var.S(1439843069);
        int i3 = (rg1Var.e(nc3Var) ? 4 : 2) | i2 | (rg1Var.e(obj) ? 32 : 16) | (rg1Var.d(i) ? 256 : 128) | (rg1Var.e(obj2) ? 2048 : 1024);
        if (rg1Var.K(i3 & 1, (i3 & 1171) != 1170)) {
            ((u44) obj).e(obj2, fh0.w(980966366, new d82(i, nc3Var, obj2), rg1Var), rg1Var, 48);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new o70(nc3Var, obj, i, obj2, i2);
        }
    }

    public static boolean b0(String str, String str2) {
        String lowerCase;
        if (str == null || qm4.u0(str) || str2 == null || qm4.u0(str2)) {
            return false;
        }
        String strM = M(str);
        String lowerCase2 = null;
        if (strM != null) {
            lowerCase = strM.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        String strM2 = M(str2);
        if (strM2 != null) {
            lowerCase2 = strM2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
        }
        return h12.c(lowerCase, lowerCase2);
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            dz1.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = ss4.c;
        return j;
    }

    public static final void c0(wf1 wf1Var, rg1 rg1Var, Object obj) {
        if (rg1Var.S || !h12.c(rg1Var.H(), obj)) {
            rg1Var.b0(obj);
            rg1Var.b(wf1Var, obj);
        }
    }

    public static void d(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }

    public static void d0(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            p3.f(window, z);
        } else {
            if (i >= 30) {
                p3.e(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static String e(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbS = b11.s(str, "\n  ");
        sbS.append(strReplace.replace("\n", "\n  "));
        sbS.append('\n');
        return sbS.toString();
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void f(kc0 kc0Var, eb2 eb2Var, ArrayList arrayList, int i) {
        int i2;
        p00[] p00VarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        jc0 jc0Var;
        eb2 eb2Var2;
        jc0 jc0Var2;
        ai4 ai4Var;
        hb0 hb0Var;
        ai4 ai4Var2;
        jc0 jc0Var3;
        int i6;
        hb0[] hb0VarArr;
        hb0 hb0Var2;
        ai4 ai4Var3;
        int i7;
        hb0[] hb0VarArr2;
        int i8;
        hb0 hb0Var3;
        hb0 hb0Var4;
        ai4 ai4Var4;
        hb0 hb0Var5;
        ai4 ai4Var5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        ai4 ai4Var6;
        ai4 ai4Var7;
        ai4 ai4Var8;
        ai4 ai4Var9;
        pi piVarL;
        float f2;
        hb0 hb0Var6;
        jc0 jc0Var4;
        int i12;
        int i13;
        jc0 jc0Var5;
        kc0 kc0Var2 = kc0Var;
        if (i == 0) {
            i2 = kc0Var2.y0;
            p00VarArr = kc0Var2.B0;
            i3 = 0;
        } else {
            i2 = kc0Var2.z0;
            p00VarArr = kc0Var2.A0;
            i3 = 2;
        }
        int i14 = i2;
        p00[] p00VarArr2 = p00VarArr;
        int i15 = 0;
        while (i15 < i14) {
            p00 p00Var = p00VarArr2[i15];
            boolean z4 = p00Var.q;
            jc0 jc0Var6 = p00Var.a;
            hb0[] hb0VarArr3 = jc0Var6.P;
            int i16 = 3;
            int i17 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = p00Var.l;
                int i19 = i18 * 2;
                jc0 jc0Var7 = jc0Var6;
                jc0 jc0Var8 = jc0Var7;
                boolean z5 = false;
                while (!z5) {
                    p00Var.i++;
                    jc0[] jc0VarArr = jc0Var7.l0;
                    hb0[] hb0VarArr4 = jc0Var7.P;
                    jc0VarArr[i18] = null;
                    jc0Var7.k0[i18] = null;
                    if (jc0Var7.f0 != i17) {
                        jc0Var7.h(i18);
                        hb0VarArr4[i19].d();
                        int i20 = i19 + 1;
                        hb0VarArr4[i20].d();
                        hb0VarArr4[i19].d();
                        hb0VarArr4[i20].d();
                        if (p00Var.b == null) {
                            p00Var.b = jc0Var7;
                        }
                        p00Var.d = jc0Var7;
                        int i21 = jc0Var7.o0[i18];
                        if (i21 == i16) {
                            int i22 = jc0Var7.t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                p00Var.j++;
                                float f4 = jc0Var7.j0[i18];
                                if (f4 > 0.0f) {
                                    p00Var.k += f4;
                                }
                                i13 = i18;
                                if (jc0Var7.f0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < 0.0f) {
                                        p00Var.n = true;
                                    } else {
                                        p00Var.o = true;
                                    }
                                    if (p00Var.h == null) {
                                        p00Var.h = new ArrayList();
                                    }
                                    p00Var.h.add(jc0Var7);
                                }
                                if (p00Var.f == null) {
                                    p00Var.f = jc0Var7;
                                }
                                jc0 jc0Var9 = p00Var.g;
                                if (jc0Var9 != null) {
                                    jc0Var9.k0[i13] = jc0Var7;
                                }
                                p00Var.g = jc0Var7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (jc0Var7.r == 0 && jc0Var7.u == 0) {
                                    int i23 = jc0Var7.v;
                                }
                            } else if (jc0Var7.s == 0 && jc0Var7.x == 0) {
                                int i24 = jc0Var7.y;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    jc0 jc0Var10 = jc0Var8;
                    if (jc0Var10 != jc0Var7) {
                        jc0Var10.l0[i13] = jc0Var7;
                    }
                    hb0 hb0Var7 = hb0VarArr4[i19 + 1].f;
                    if (hb0Var7 != null) {
                        jc0Var5 = hb0Var7.d;
                        hb0 hb0Var8 = jc0Var5.P[i19].f;
                        if (hb0Var8 == null || hb0Var8.d != jc0Var7) {
                            jc0Var5 = null;
                        }
                    } else {
                        jc0Var5 = null;
                    }
                    if (jc0Var5 == null) {
                        jc0Var5 = jc0Var7;
                        z5 = true;
                    }
                    jc0Var8 = jc0Var7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    jc0Var7 = jc0Var5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                jc0 jc0Var11 = p00Var.b;
                if (jc0Var11 != null) {
                    jc0Var11.P[i19].d();
                }
                jc0 jc0Var12 = p00Var.d;
                if (jc0Var12 != null) {
                    jc0Var12.P[i19 + 1].d();
                }
                p00Var.c = jc0Var7;
                if (i25 == 0 && p00Var.m) {
                    p00Var.e = jc0Var7;
                } else {
                    p00Var.e = jc0Var6;
                }
                p00Var.p = p00Var.o && p00Var.n;
            }
            p00Var.q = true;
            if (arrayList == 0 || arrayList.contains(jc0Var6)) {
                jc0 jc0Var13 = p00Var.c;
                jc0 jc0Var14 = p00Var.b;
                jc0 jc0Var15 = p00Var.d;
                jc0 jc0Var16 = p00Var.e;
                float f5 = p00Var.k;
                int[] iArr = kc0Var2.o0;
                hb0[] hb0VarArr5 = kc0Var2.P;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = jc0Var16.h0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = jc0Var16.i0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    hb0[] hb0VarArr6 = jc0Var6.P;
                    int[] iArr2 = jc0Var6.o0;
                    hb0 hb0Var9 = hb0VarArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iD = hb0Var9.d();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && jc0Var6.t[i] == 0;
                    hb0 hb0Var10 = hb0Var9.f;
                    if (hb0Var10 != null && jc0Var6 != jc0Var6) {
                        iD = hb0Var10.d() + iD;
                    }
                    int i29 = iD;
                    if (z13 && jc0Var6 != jc0Var6 && jc0Var6 != jc0Var14) {
                        i28 = 8;
                    }
                    jc0 jc0Var17 = jc0Var6;
                    hb0 hb0Var11 = hb0Var9.f;
                    if (hb0Var11 != null) {
                        boolean z15 = z14;
                        ai4 ai4Var10 = hb0Var9.i;
                        ai4 ai4Var11 = hb0Var11.i;
                        if (jc0Var6 == jc0Var14) {
                            eb2Var.f(ai4Var10, ai4Var11, i29, 6);
                        } else {
                            eb2Var.f(ai4Var10, ai4Var11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        eb2Var.e(hb0Var9.i, hb0Var9.f.i, i29, (jc0Var6 == jc0Var14 && z13 && jc0Var6.R[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (jc0Var6.f0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            eb2Var.f(hb0VarArr6[i3 + 1].i, hb0VarArr6[i3].i, 0, 5);
                        }
                        eb2Var.f(hb0VarArr6[i3].i, hb0VarArr5[i3].i, i12, 8);
                    }
                    hb0 hb0Var12 = hb0VarArr6[i3 + 1].f;
                    if (hb0Var12 != null) {
                        jc0Var4 = hb0Var12.d;
                        hb0 hb0Var13 = jc0Var4.P[i3].f;
                        if (hb0Var13 == null || hb0Var13.d != jc0Var6) {
                            jc0Var4 = null;
                        }
                    } else {
                        jc0Var4 = null;
                    }
                    if (jc0Var4 != null) {
                        jc0Var6 = jc0Var4;
                    } else {
                        z11 = true;
                    }
                    jc0Var6 = jc0Var17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (jc0Var15 != null) {
                    int i30 = i3 + 1;
                    if (jc0Var13.P[i30].f != null) {
                        hb0 hb0Var14 = jc0Var15.P[i30];
                        if (jc0Var15.o0[i] == 3 && jc0Var15.t[i] == 0 && !z17) {
                            hb0 hb0Var15 = hb0Var14.f;
                            if (hb0Var15.d == kc0Var2) {
                                eb2Var.e(hb0Var14.i, hb0Var15.i, -hb0Var14.d(), 5);
                            } else if (z17) {
                                hb0Var6 = hb0Var14.f;
                                if (hb0Var6.d == kc0Var2) {
                                    eb2Var.e(hb0Var14.i, hb0Var6.i, -hb0Var14.d(), 4);
                                }
                            }
                        } else if (z17) {
                            hb0Var6 = hb0Var14.f;
                            if (hb0Var6.d == kc0Var2) {
                                eb2Var.e(hb0Var14.i, hb0Var6.i, -hb0Var14.d(), 4);
                            }
                        }
                        eb2Var.g(hb0Var14.i, jc0Var13.P[i30].f.i, -hb0Var14.d(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    ai4 ai4Var12 = hb0VarArr5[i31].i;
                    hb0 hb0Var16 = jc0Var13.P[i31];
                    eb2Var.f(ai4Var12, hb0Var16.i, hb0Var16.d(), 8);
                }
                ArrayList arrayList3 = p00Var.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (p00Var.n && !p00Var.p) {
                        f5 = p00Var.j;
                    }
                    jc0 jc0Var18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        jc0 jc0Var19 = (jc0) arrayList3.get(i32);
                        float[] fArr = jc0Var19.j0;
                        hb0[] hb0VarArr7 = jc0Var19.P;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                eb2Var.e(hb0VarArr7[i3 + 1].i, hb0VarArr7[i3].i, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (jc0Var18 != null) {
                                    hb0[] hb0VarArr8 = jc0Var18.P;
                                    ai4Var6 = hb0VarArr8[i3].i;
                                    int i33 = i3 + 1;
                                    ai4Var7 = hb0VarArr8[i33].i;
                                    ai4Var8 = hb0VarArr7[i3].i;
                                    ai4Var9 = hb0VarArr7[i33].i;
                                    piVarL = eb2Var.l();
                                    f2 = f3;
                                    piVarL.b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        piVarL.d.g(ai4Var6, 1.0f);
                                        piVarL.d.g(ai4Var7, -1.0f);
                                        piVarL.d.g(ai4Var9, 1.0f);
                                        piVarL.d.g(ai4Var8, -1.0f);
                                    } else {
                                        ji jiVar = piVarL.d;
                                        if (f8 == f) {
                                            i11 = i32;
                                            jiVar.g(ai4Var6, 1.0f);
                                            piVarL.d.g(ai4Var7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                jiVar.g(ai4Var8, 1.0f);
                                                piVarL.d.g(ai4Var9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                jiVar.g(ai4Var6, 1.0f);
                                                piVarL.d.g(ai4Var7, -1.0f);
                                                piVarL.d.g(ai4Var9, f9);
                                                piVarL.d.g(ai4Var8, -f9);
                                            }
                                        }
                                    }
                                    eb2Var.c(piVarL);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                jc0Var18 = jc0Var19;
                            }
                        } else {
                            if (p00Var.p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                eb2Var.e(hb0VarArr7[i3 + 1].i, hb0VarArr7[i3].i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    eb2Var.e(hb0VarArr7[i3 + 1].i, hb0VarArr7[i3].i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (jc0Var18 != null) {
                                        hb0[] hb0VarArr9 = jc0Var18.P;
                                        ai4Var6 = hb0VarArr9[i3].i;
                                        int i34 = i3 + 1;
                                        ai4Var7 = hb0VarArr9[i34].i;
                                        ai4Var8 = hb0VarArr7[i3].i;
                                        ai4Var9 = hb0VarArr7[i34].i;
                                        piVarL = eb2Var.l();
                                        f2 = f3;
                                        piVarL.b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            piVarL.d.g(ai4Var6, 1.0f);
                                            piVarL.d.g(ai4Var7, -1.0f);
                                            piVarL.d.g(ai4Var9, 1.0f);
                                            piVarL.d.g(ai4Var8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            piVarL.d.g(ai4Var6, 1.0f);
                                            piVarL.d.g(ai4Var7, -1.0f);
                                            piVarL.d.g(ai4Var9, 1.0f);
                                            piVarL.d.g(ai4Var8, -1.0f);
                                        }
                                        eb2Var.c(piVarL);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    jc0Var18 = jc0Var19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (jc0Var14 == null || !(jc0Var14 == jc0Var15 || z17)) {
                    jc0Var = jc0Var15;
                    if (z2 && jc0Var14 != null) {
                        int i35 = p00Var.j;
                        boolean z18 = i35 > 0 && p00Var.i == i35;
                        jc0 jc0Var20 = jc0Var14;
                        jc0 jc0Var21 = jc0Var20;
                        while (true) {
                            hb0[] hb0VarArr10 = jc0Var21.P;
                            if (jc0Var20 == null) {
                                break;
                            }
                            hb0[] hb0VarArr11 = jc0Var20.P;
                            jc0 jc0Var22 = jc0Var20.l0[i];
                            while (true) {
                                if (jc0Var22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (jc0Var22.f0 != 8) {
                                    break;
                                } else {
                                    jc0Var22 = jc0Var22.l0[i];
                                }
                            }
                            if (jc0Var22 != null || jc0Var20 == jc0Var) {
                                hb0 hb0Var17 = hb0VarArr11[i3];
                                ai4 ai4Var13 = hb0Var17.i;
                                hb0 hb0Var18 = hb0Var17.f;
                                ai4 ai4Var14 = hb0Var18 != null ? hb0Var18.i : null;
                                if (jc0Var21 != jc0Var20) {
                                    ai4Var14 = hb0VarArr10[i3 + 1].i;
                                } else if (jc0Var20 == jc0Var14) {
                                    hb0 hb0Var19 = hb0VarArr3[i3].f;
                                    ai4Var14 = hb0Var19 != null ? hb0Var19.i : null;
                                }
                                int iD2 = hb0Var17.d();
                                int i36 = i3 + 1;
                                int iD3 = hb0VarArr11[i36].d();
                                if (jc0Var22 != null) {
                                    hb0Var2 = jc0Var22.P[i3];
                                    hb0VarArr = hb0VarArr10;
                                    ai4Var3 = hb0Var2.i;
                                } else {
                                    hb0VarArr = hb0VarArr10;
                                    hb0Var2 = jc0Var13.P[i36].f;
                                    ai4Var3 = hb0Var2 != null ? hb0Var2.i : null;
                                }
                                ai4 ai4Var15 = hb0VarArr11[i36].i;
                                if (hb0Var2 != null) {
                                    iD3 += hb0Var2.d();
                                }
                                int iD4 = hb0VarArr[i36].d() + iD2;
                                if (ai4Var13 == null || ai4Var14 == null || ai4Var3 == null || ai4Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (jc0Var20 == jc0Var14) {
                                        iD4 = jc0Var14.P[i3].d();
                                    }
                                    int i37 = iD4;
                                    if (jc0Var20 == jc0Var) {
                                        iD3 = jc0Var.P[i36].d();
                                    }
                                    i7 = 8;
                                    eb2Var.b(ai4Var13, ai4Var14, i37, 0.5f, ai4Var3, ai4Var15, iD3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (jc0Var20.f0 != i7) {
                                jc0Var21 = jc0Var20;
                            }
                            jc0Var20 = jc0Var22;
                            jc0Var21 = jc0Var21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && jc0Var14 != null) {
                            int i39 = p00Var.j;
                            boolean z19 = i39 > 0 && p00Var.i == i39;
                            jc0 jc0Var23 = jc0Var14;
                            jc0 jc0Var24 = jc0Var23;
                            while (true) {
                                hb0[] hb0VarArr12 = jc0Var23.P;
                                if (jc0Var24 == null) {
                                    break;
                                }
                                hb0[] hb0VarArr13 = jc0Var24.P;
                                jc0 jc0Var25 = jc0Var24.l0[i];
                                while (jc0Var25 != null && jc0Var25.f0 == i38) {
                                    jc0Var25 = jc0Var25.l0[i];
                                }
                                if (jc0Var24 == jc0Var14 || jc0Var24 == jc0Var || jc0Var25 == null) {
                                    jc0Var2 = jc0Var23;
                                } else {
                                    if (jc0Var25 == jc0Var) {
                                        jc0Var25 = null;
                                    }
                                    hb0 hb0Var20 = hb0VarArr13[i3];
                                    ai4 ai4Var16 = hb0Var20.i;
                                    int i40 = i3 + 1;
                                    ai4 ai4Var17 = hb0VarArr12[i40].i;
                                    int iD5 = hb0Var20.d();
                                    int iD6 = hb0VarArr13[i40].d();
                                    if (jc0Var25 != null) {
                                        hb0Var = jc0Var25.P[i3];
                                        ai4Var = hb0Var.i;
                                        jc0Var2 = jc0Var23;
                                        hb0 hb0Var21 = hb0Var.f;
                                        ai4Var2 = hb0Var21 != null ? hb0Var21.i : null;
                                    } else {
                                        jc0Var2 = jc0Var23;
                                        hb0 hb0Var22 = jc0Var.P[i3];
                                        ai4Var = hb0Var22 != null ? hb0Var22.i : null;
                                        ai4 ai4Var18 = hb0VarArr13[i40].i;
                                        hb0Var = hb0Var22;
                                        ai4Var2 = ai4Var18;
                                    }
                                    if (hb0Var != null) {
                                        iD6 += hb0Var.d();
                                    }
                                    int iD7 = hb0VarArr12[i40].d() + iD5;
                                    jc0 jc0Var26 = jc0Var25;
                                    int i41 = iD6;
                                    int i42 = z19 ? 8 : 4;
                                    if (ai4Var16 == null || ai4Var17 == null || ai4Var == null || ai4Var2 == null) {
                                        jc0Var3 = jc0Var26;
                                    } else {
                                        ai4 ai4Var19 = ai4Var;
                                        jc0Var3 = jc0Var26;
                                        eb2Var.b(ai4Var16, ai4Var17, iD7, 0.5f, ai4Var19, ai4Var2, i41, i42);
                                    }
                                    jc0Var25 = jc0Var3;
                                }
                                if (jc0Var24.f0 != 8) {
                                    jc0Var2 = jc0Var24;
                                }
                                jc0Var24 = jc0Var25;
                                i38 = 8;
                                jc0Var23 = jc0Var2;
                            }
                            eb2Var2 = eb2Var;
                            hb0 hb0Var23 = jc0Var14.P[i3];
                            hb0 hb0Var24 = hb0VarArr3[i3].f;
                            int i43 = i3 + 1;
                            hb0 hb0Var25 = jc0Var.P[i43];
                            hb0 hb0Var26 = jc0Var13.P[i43].f;
                            if (hb0Var24 != null) {
                                if (jc0Var14 != jc0Var) {
                                    eb2Var2.e(hb0Var23.i, hb0Var24.i, hb0Var23.d(), 5);
                                } else if (hb0Var26 != null) {
                                    eb2Var2.b(hb0Var23.i, hb0Var24.i, hb0Var23.d(), 0.5f, hb0Var25.i, hb0Var26.i, hb0Var25.d(), 5);
                                }
                            }
                            if (hb0Var26 != null && jc0Var14 != jc0Var) {
                                eb2Var2.e(hb0Var25.i, hb0Var26.i, -hb0Var25.d(), 5);
                            }
                        }
                        if ((z2 || z3) && jc0Var14 != null && jc0Var14 != jc0Var) {
                            hb0VarArr2 = jc0Var14.P;
                            hb0 hb0Var27 = hb0VarArr2[i3];
                            if (jc0Var == null) {
                                jc0Var = jc0Var14;
                            }
                            hb0[] hb0VarArr14 = jc0Var.P;
                            i8 = i3 + 1;
                            hb0Var3 = hb0VarArr14[i8];
                            hb0Var4 = hb0Var27.f;
                            if (hb0Var4 != null) {
                                ai4Var4 = hb0Var4.i;
                            } else {
                                ai4Var4 = null;
                            }
                            hb0Var5 = hb0Var3.f;
                            if (hb0Var5 != null) {
                                ai4Var5 = hb0Var5.i;
                            } else {
                                ai4Var5 = null;
                            }
                            if (jc0Var13 != jc0Var) {
                                hb0 hb0Var28 = jc0Var13.P[i8].f;
                                ai4Var5 = hb0Var28 != null ? hb0Var28.i : null;
                            }
                            if (jc0Var14 == jc0Var) {
                                hb0Var3 = hb0VarArr2[i8];
                            }
                            if (ai4Var4 == null && ai4Var5 != null) {
                                eb2Var2.b(hb0Var27.i, ai4Var4, hb0Var27.d(), 0.5f, ai4Var5, hb0Var3.i, hb0VarArr14[i8].d(), 5);
                            }
                        }
                    }
                } else {
                    hb0 hb0Var29 = hb0VarArr3[i3];
                    int i44 = i3 + 1;
                    hb0 hb0Var30 = jc0Var13.P[i44];
                    hb0 hb0Var31 = hb0Var29.f;
                    ai4 ai4Var20 = hb0Var31 != null ? hb0Var31.i : null;
                    hb0 hb0Var32 = hb0Var30.f;
                    ai4 ai4Var21 = hb0Var32 != null ? hb0Var32.i : null;
                    hb0 hb0Var33 = jc0Var14.P[i3];
                    if (jc0Var15 != null) {
                        hb0Var30 = jc0Var15.P[i44];
                    }
                    if (ai4Var20 == null || ai4Var21 == null) {
                        jc0Var = jc0Var15;
                    } else {
                        float f11 = i == 0 ? jc0Var16.c0 : jc0Var16.d0;
                        int iD8 = hb0Var33.d();
                        int iD9 = hb0Var30.d();
                        ai4 ai4Var22 = hb0Var33.i;
                        ai4 ai4Var23 = hb0Var30.i;
                        ai4 ai4Var24 = ai4Var20;
                        jc0Var = jc0Var15;
                        eb2Var.b(ai4Var22, ai4Var24, iD8, f11, ai4Var21, ai4Var23, iD9, 7);
                    }
                }
                eb2Var2 = eb2Var;
                if (z2) {
                    hb0VarArr2 = jc0Var14.P;
                    hb0 hb0Var210 = hb0VarArr2[i3];
                    if (jc0Var == null) {
                        jc0Var = jc0Var14;
                    }
                    hb0[] hb0VarArr15 = jc0Var.P;
                    i8 = i3 + 1;
                    hb0Var3 = hb0VarArr15[i8];
                    hb0Var4 = hb0Var210.f;
                    if (hb0Var4 != null) {
                        ai4Var4 = hb0Var4.i;
                    } else {
                        ai4Var4 = null;
                    }
                    hb0Var5 = hb0Var3.f;
                    if (hb0Var5 != null) {
                        ai4Var5 = hb0Var5.i;
                    } else {
                        ai4Var5 = null;
                    }
                    if (jc0Var13 != jc0Var) {
                        hb0 hb0Var211 = jc0Var13.P[i8].f;
                        ai4Var5 = hb0Var211 != null ? hb0Var211.i : null;
                    }
                    if (jc0Var14 == jc0Var) {
                        hb0Var3 = hb0VarArr2[i8];
                    }
                    if (ai4Var4 == null) {
                    }
                } else {
                    hb0VarArr2 = jc0Var14.P;
                    hb0 hb0Var212 = hb0VarArr2[i3];
                    if (jc0Var == null) {
                        jc0Var = jc0Var14;
                    }
                    hb0[] hb0VarArr16 = jc0Var.P;
                    i8 = i3 + 1;
                    hb0Var3 = hb0VarArr16[i8];
                    hb0Var4 = hb0Var212.f;
                    if (hb0Var4 != null) {
                        ai4Var4 = hb0Var4.i;
                    } else {
                        ai4Var4 = null;
                    }
                    hb0Var5 = hb0Var3.f;
                    if (hb0Var5 != null) {
                        ai4Var5 = hb0Var5.i;
                    } else {
                        ai4Var5 = null;
                    }
                    if (jc0Var13 != jc0Var) {
                        hb0 hb0Var213 = jc0Var13.P[i8].f;
                        ai4Var5 = hb0Var213 != null ? hb0Var213.i : null;
                    }
                    if (jc0Var14 == jc0Var) {
                        hb0Var3 = hb0VarArr2[i8];
                    }
                    if (ai4Var4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            kc0Var2 = kc0Var;
            i14 = i5;
        }
    }

    public static void g(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getTag(R.id.tag_link_original_color) == null) {
                textView.setTag(R.id.tag_link_original_color, Integer.valueOf(textView.getCurrentTextColor()));
            }
            textView.setTextColor(g12.s(view.getContext(), R.attr.colorPrimary, view.getContext().getColor(android.R.color.holo_blue_light)));
        }
    }

    public static ik h(String str, String str2) {
        String strI = i(str, str2);
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        return S(Uri.parse(strI));
    }

    public static String i(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        switch (str) {
            case "artist":
            case "song":
            case "year":
            case "album":
            case "genre":
            case "playlist":
                Objects.requireNonNull(str2);
                return new Uri.Builder().scheme("tempo").authority("asset").appendPath(str).appendPath(str2).build().toString();
            default:
                return null;
        }
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        kf2.n(str);
    }

    public static void k(int i) {
        if (i >= 0) {
            return;
        }
        nz2.c();
    }

    public static void l(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        nz2.n(str);
    }

    public static void m0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Z(parcel, i));
    }

    public static void n(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final void o(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            kf2.e(i != i2 ? b11.n("Both size ", " and step ", i, i2, " must be greater than zero.") : b11.j(i, "size ", " must be greater than zero."));
        }
    }

    public static final long o0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static void p(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Object tag = textView.getTag(R.id.tag_link_original_color);
            if (tag instanceof Integer) {
                textView.setTextColor(((Integer) tag).intValue());
            } else {
                textView.setTextColor(g12.s(view.getContext(), R.attr.colorOnSurface, view.getContext().getColor(android.R.color.primary_text_light)));
            }
        }
    }

    public static int p0(Parcel parcel) {
        int i = parcel.readInt();
        int iZ = Z(parcel, i);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iZ + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(xa3.e(iDataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static void q0(String str, String str2) {
        synchronized (b) {
            Log.w(str, e(str2, null));
        }
    }

    public static final long r(int i, long j) {
        int i2 = ss4.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static void r0(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.w(str, e(str2, th));
        }
    }

    public static void s0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new SafeParcelReader$ParseException(b11.q(b11.t("Expected size ", " got ", i2, i, " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void t(Context context, ik ikVar) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(context.getString(R.string.asset_link_clipboard_label), ikVar.b.toString()));
    }

    public static void t0(Parcel parcel, int i, int i2) {
        int iZ = Z(parcel, i);
        if (iZ == i2) {
            return;
        }
        throw new SafeParcelReader$ParseException(b11.q(b11.t("Expected size ", " got ", i2, iZ, " (0x"), Integer.toHexString(iZ), ")"), parcel);
    }

    public static Bundle u(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iZ);
        return bundle;
    }

    public static byte[] v(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return bArrCreateByteArray;
    }

    public static Parcelable w(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iZ);
        return parcelable;
    }

    public static String x(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iZ);
        return string;
    }

    public static Object[] y(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return objArrCreateTypedArray;
    }

    public static ArrayList z(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return arrayListCreateTypedArrayList;
    }

    public abstract void D(boolean z);

    public abstract int I();

    public abstract Context J();

    public boolean L() {
        return false;
    }

    public abstract void N();

    public void O() {
    }

    public abstract boolean P(int i, KeyEvent keyEvent);

    public boolean Q(KeyEvent keyEvent) {
        return false;
    }

    public boolean R() {
        return false;
    }

    public abstract void e0(boolean z);

    public abstract void f0(boolean z);

    public abstract void g0();

    public abstract void h0(int i);

    public abstract void i0(Drawable drawable);

    public abstract void j0(boolean z);

    public abstract void k0(String str);

    public abstract void l0(CharSequence charSequence);

    public d5 n0(rm3 rm3Var) {
        return null;
    }

    public boolean q() {
        return false;
    }

    public abstract boolean s();
}
