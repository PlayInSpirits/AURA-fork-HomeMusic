package defpackage;

import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f35 {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static HashMap g;
    public static final String[] h;
    public static final String[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        a = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        e = Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static long B(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int C(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static tb1 D(int i2, int i3, int i4) {
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("audio/raw");
        sb1Var.E = i3;
        sb1Var.F = i4;
        sb1Var.G = i2;
        return new tb1(sb1Var);
    }

    public static long E(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static String F(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String G(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            l93.G("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String H(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? b11.j(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean I(qi3 qi3Var) {
        boolean z = false;
        if (qi3Var == null) {
            return false;
        }
        int iG = qi3Var.g();
        if (iG != 1 || !qi3Var.S0(2)) {
            if (iG == 4 && qi3Var.S0(4)) {
                qi3Var.C();
            }
            if (qi3Var.S0(1)) {
                return z;
            }
            qi3Var.m0();
            return true;
        }
        qi3Var.b();
        z = true;
        if (qi3Var.S0(1)) {
            return z;
        }
        qi3Var.m0();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    public static int J(Uri uri, String overrideMimeType) {
        if (overrideMimeType != null) {
            switch (overrideMimeType) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }

        String scheme = uri.getScheme();
        if (scheme != null && (rr2.A("rtsp", scheme) || rr2.A("rtspt", scheme))) {
            return 3;
        }

        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int dotIndex = lastPathSegment.lastIndexOf('.');
        if (dotIndex < 0) {
            return 4;
        }

        String extension = rr2.U(lastPathSegment.substring(dotIndex + 1));
        switch (extension) {
            case "mpd":
                return 0;
            case "ism":
            case "isml":
                return 1;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static boolean K(be3 be3Var, be3 be3Var2, Inflater inflater) {
                    if (be3Var.a() == 0) {
                        return false;
                    }
                    if (be3Var2.a.length < be3Var.a()) {
                        be3Var2.c(be3Var.a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(be3Var.a, be3Var.b, be3Var.a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = be3Var2.a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                be3Var2.M(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = be3Var2.a;
                                if (iInflate == bArr2.length) {
                                    be3Var2.c(bArr2.length * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                public static boolean L(int i2) {
                    return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
                }

                public static boolean M(Context context) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i2 == 30) {
                        String str = Build.MODEL;
                        if (rr2.A(str, "moto g(20)") || rr2.A(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i2 == 34 && rr2.A(Build.MODEL, "sm-x200");
                }

                public static boolean N(int i2) {
                    return i2 == 10 || i2 == 13;
                }

                public static boolean O(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static void P(ArrayList arrayList, int i2, int i3, int i4) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
                        arrayDeque.addFirst(arrayList.remove(i2 + i5));
                    }
                    arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
                }

                public static long Q(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
                }

                public static String R(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strU = rr2.U(str);
                    int i2 = 0;
                    String str2 = strU.split("-", 2)[0];
                    if (g == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = h;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                            map.put(strArr[i3], strArr[i3 + 1]);
                        }
                        g = map;
                    }
                    String str4 = (String) g.get(str2);
                    if (str4 != null) {
                        strU = str4.concat(strU.substring(str2.length()));
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strU;
                    }
                    while (true) {
                        String[] strArr2 = i;
                        if (i2 >= strArr2.length) {
                            return strU;
                        }
                        if (strU.startsWith(strArr2[i2])) {
                            return strArr2[i2 + 1] + strU.substring(strArr2[i2].length());
                        }
                        i2 += 2;
                    }
                }

                public static Object[] S(int i2, Object[] objArr) {
                    rr2.l(i2 <= objArr.length);
                    return Arrays.copyOf(objArr, i2);
                }

                public static long T(String str) throws ParserException {
                    Matcher matcher = d.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.a(null, "Invalid date/time format: ".concat(str));
                    }
                    int i2 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        int i3 = Integer.parseInt(matcher.group(12)) * 60;
                        String strGroup = matcher.group(13);
                        i2 = strGroup != null ? Integer.parseInt(strGroup) + i3 : i3;
                        if ("-".equals(matcher.group(11))) {
                            i2 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
                }

                public static float U(long j2, long j3) {
                    if (j3 == 0 || j2 != j3) {
                        return (j2 / j3) * 100.0f;
                    }
                    return 100.0f;
                }

                public static int V(long j2, long j3) {
                    long jA = gh0.A(j2, 100L);
                    return jz4.I((jA == Long.MAX_VALUE || jA == Long.MIN_VALUE) ? j2 / (j3 / 100) : jA / j3);
                }

                public static void W(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static void X(ArrayList arrayList, int i2, int i3) {
                    if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
                        nz2.c();
                    } else if (i2 != i3) {
                        arrayList.subList(i2, i3).clear();
                    }
                }

                public static long Y(int i2, long j2) {
                    return a0(j2, 1000000L, i2, RoundingMode.DOWN);
                }

                public static void Z(long[] jArr, long j2) {
                    long j3;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i2 = 0;
                    if (j2 >= 1000000 && j2 % 1000000 == 0) {
                        long jH = gh0.h(j2, 1000000L, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = gh0.h(jArr[i2], jH, roundingMode);
                            i2++;
                        }
                        return;
                    }
                    if (j2 < 1000000 && 1000000 % j2 == 0) {
                        long jH2 = gh0.h(1000000L, j2, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = gh0.A(jArr[i2], jH2);
                            i2++;
                        }
                        return;
                    }
                    int i3 = 0;
                    while (i3 < jArr.length) {
                        long j4 = jArr[i3];
                        if (j4 != 0) {
                            if (j2 >= j4 && j2 % j4 == 0) {
                                jArr[i3] = gh0.h(1000000L, gh0.h(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j2 >= j4 || j4 % j2 != 0) {
                                j3 = j2;
                                jArr[i3] = b0(j4, 1000000L, j3, roundingMode);
                            } else {
                                jArr[i3] = gh0.A(1000000L, gh0.h(j4, j2, RoundingMode.UNNECESSARY));
                            }
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        i3++;
                        j2 = j3;
                    }
                }

                public static long a(long j2, long j3) {
                    long j4 = j2 + j3;
                    long j5 = (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
                    if ((j5 != Long.MIN_VALUE || j4 == Long.MIN_VALUE) && (j5 != Long.MAX_VALUE || j4 == Long.MAX_VALUE)) {
                        return j5;
                    }
                    return Long.MAX_VALUE;
                }

                public static long a0(long j2, long j3, long j4, RoundingMode roundingMode) {
                    if (j2 == 0 || j3 == 0) {
                        return 0L;
                    }
                    if (j4 >= j3 && j4 % j3 == 0) {
                        return gh0.h(j2, gh0.h(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j4 < j3 && j3 % j4 == 0) {
                        return gh0.A(j2, gh0.h(j3, j4, RoundingMode.UNNECESSARY));
                    }
                    if (j4 < j2 || j4 % j2 != 0) {
                        return (j4 >= j2 || j2 % j4 != 0) ? b0(j2, j3, j4, roundingMode) : gh0.A(j3, gh0.h(j2, j4, RoundingMode.UNNECESSARY));
                    }
                    return gh0.h(j3, gh0.h(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
                }

                public static int b(long[] jArr, long j2, boolean z) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i2 = iBinarySearch + 1;
                        if (i2 >= jArr.length || jArr[i2] != j2) {
                            break;
                        }
                        iBinarySearch = i2;
                    }
                    return z ? iBinarySearch : i2;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:54:0x00de  */
                /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
                /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
                /* JADX WARN: Instruction removed from duplicated block: B:68:0x00ff, please report this as an issue */
                public static long b0(long j2, long j3, long j4, RoundingMode roundingMode) {
                    double dRint;
                    long j5;
                    boolean z;
                    long jA = gh0.A(j2, j3);
                    if (jA != Long.MAX_VALUE && jA != Long.MIN_VALUE) {
                        return gh0.h(jA, j4, roundingMode);
                    }
                    long jN = gh0.n(Math.abs(j3), Math.abs(j4));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jH = gh0.h(j3, jN, roundingMode2);
                    long jH2 = gh0.h(j4, jN, roundingMode2);
                    long jN2 = gh0.n(Math.abs(j2), Math.abs(jH2));
                    long jH3 = gh0.h(j2, jN2, roundingMode2);
                    long jH4 = gh0.h(jH2, jN2, roundingMode2);
                    long jA2 = gh0.A(jH3, jH);
                    if (jA2 != Long.MAX_VALUE && jA2 != Long.MIN_VALUE) {
                        return gh0.h(jA2, jH4, roundingMode);
                    }
                    double d2 = jH3 * (jH / jH4);
                    if (d2 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d2 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    int i2 = ms0.a;
                    if (!rr2.I(d2)) {
                        throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (ls0.a[roundingMode.ordinal()]) {
                        case 1:
                            l93.n(ms0.a(d2));
                            dRint = d2;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 2:
                            if (d2 >= 0.0d || ms0.a(d2)) {
                                dRint = d2;
                            } else {
                                j5 = ((long) d2) - 1;
                                dRint = j5;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            if (d2 <= 0.0d || ms0.a(d2)) {
                                dRint = d2;
                            } else {
                                j5 = ((long) d2) + 1;
                                dRint = j5;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 4:
                            dRint = d2;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 5:
                            if (ms0.a(d2)) {
                                dRint = d2;
                            } else {
                                dRint = ((long) d2) + ((long) (d2 > 0.0d ? 1 : -1));
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 6:
                            dRint = Math.rint(d2);
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 7:
                            dRint = Math.rint(d2);
                            if (Math.abs(d2 - dRint) == 0.5d) {
                                dRint = Math.copySign(0.5d, d2) + d2;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        case 8:
                            dRint = Math.rint(d2);
                            if (Math.abs(d2 - dRint) == 0.5d) {
                                dRint = d2;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
                        default:
                            throw new AssertionError();
                    }
                }

                public static int c(te2 te2Var, long j2) {
                    int i2 = te2Var.b - 1;
                    int i3 = 0;
                    while (i3 <= i2) {
                        int i4 = (i3 + i2) >>> 1;
                        if (te2Var.d(i4) < j2) {
                            i3 = i4 + 1;
                        } else {
                            i2 = i4 - 1;
                        }
                    }
                    int i5 = i2 + 1;
                    if (i5 < te2Var.b && te2Var.d(i5) == j2) {
                        return i5;
                    }
                    if (i2 == -1) {
                        return 0;
                    }
                    return i2;
                }

                public static void c0(Service service, int i2, Notification notification, int i3, String str) {
                    if (Build.VERSION.SDK_INT < 29) {
                        service.startForeground(i2, notification);
                        return;
                    }
                    try {
                        service.startForeground(i2, notification, i3);
                    } catch (RuntimeException e2) {
                        l93.F("Util", "The service must be declared with a foregroundServiceType that includes ".concat(str));
                        throw e2;
                    }
                }

                public static int d(List list, Long l2, boolean z) {
                    int i2;
                    int iBinarySearch = Collections.binarySearch(list, l2);
                    if (iBinarySearch < 0) {
                        i2 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i3 = iBinarySearch - 1;
                            if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i2 = iBinarySearch;
                    }
                    return z ? Math.max(0, i2) : i2;
                }

                public static boolean d0(qi3 qi3Var, boolean z) {
                    return qi3Var == null || !qi3Var.q() || qi3Var.g() == 1 || qi3Var.g() == 4 || !(!z || qi3Var.v0() == 0 || qi3Var.v0() == 4);
                }

                public static int e(int[] iArr, int i2, boolean z, boolean z2) {
                    int i3;
                    int i4;
                    int iBinarySearch = Arrays.binarySearch(iArr, i2);
                    if (iBinarySearch < 0) {
                        i4 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i3 = iBinarySearch - 1;
                            if (i3 < 0 || iArr[i3] != i2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i4 = z ? iBinarySearch : i3;
                    }
                    return z2 ? Math.max(0, i4) : i4;
                }

                public static String[] e0(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static int f(long[] jArr, long j2, boolean z) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        i2 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i3 = iBinarySearch - 1;
                            if (i3 < 0 || jArr[i3] != j2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i2 = iBinarySearch;
                    }
                    return z ? Math.max(0, i2) : i2;
                }

                public static boolean f0(SQLiteDatabase sQLiteDatabase, String str) {
                    return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
                }

                public static int g(int i2, int i3) {
                    return ((i2 + i3) - 1) / i3;
                }

                public static String g0(int i2) {
                    return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
                }

                public static void h(Closeable closeable) {
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public static lb4 h0(ic2 ic2Var, mk mkVar) {
                    lb4 lb4Var = new lb4();
                    mn2 mn2Var = new mn2(lb4Var, ic2Var, 1);
                    gq0 gq0Var = gq0.n;
                    lb4Var.f(mn2Var, gq0Var);
                    ic2Var.f(new qo2(ic2Var, lb4Var, mkVar, 17), gq0Var);
                    return lb4Var;
                }

                public static float i(float f2, float f3, float f4) {
                    return Math.max(f3, Math.min(f2, f4));
                }

                public static long i0(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
                }

                public static int j(int i2, int i3, int i4) {
                    return Math.max(i3, Math.min(i2, i4));
                }

                public static long k(long j2, long j3, long j4) {
                    return Math.max(j3, Math.min(j2, j4));
                }

                public static boolean l(SparseArray sparseArray, int i2) {
                    return sparseArray.indexOfKey(i2) >= 0;
                }

                public static boolean m(Object[] objArr, Object obj) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                public static Bundle n(Bundle bundle) {
                    if (bundle == null) {
                        return null;
                    }
                    ClassLoader classLoader = f35.class.getClassLoader();
                    classLoader.getClass();
                    bundle.setClassLoader(classLoader);
                    try {
                        bundle.isEmpty();
                        return bundle;
                    } catch (RuntimeException e2) {
                        l93.G("Util", "Ignoring invalid bundle", e2);
                        return null;
                    }
                }

                public static int o(int i2, int i3, int i4, byte[] bArr) {
                    while (i2 < i3) {
                        i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
                        i2++;
                    }
                    return i4;
                }

                public static Handler p(nk2 nk2Var) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    return new Handler(looperMyLooper, nk2Var);
                }

                public static Handler q(gt0 gt0Var) {
                    return new Handler(x(), gt0Var);
                }

                public static int r(int i2) {
                    if (i2 == 30) {
                        return 34;
                    }
                    switch (i2) {
                        case 2:
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i2) {
                                case 14:
                                    return 25;
                                case 15:
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    switch (i2) {
                                        case 20:
                                            return 30;
                                        case 21:
                                        case 22:
                                            return 31;
                                        default:
                                            return Integer.MAX_VALUE;
                                    }
                            }
                    }
                }

                public static int s(int i2) {
                    if (i2 == 10) {
                        return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
                    }
                    if (i2 == 16) {
                        return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
                    }
                    if (i2 == 24) {
                        return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
                    }
                    switch (i2) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i2) {
                                case 12:
                                    return 743676;
                                case 13:
                                    return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                                case 14:
                                    return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                                default:
                                    return 0;
                            }
                    }
                }

                public static int t(int i2) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return 1;
                        }
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                nz2.c();
                                                return 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }

                public static int u(int i2, String str) {
                    int i3 = 0;
                    for (String str2 : e0(str)) {
                        if (i2 == lw2.h(lw2.d(str2))) {
                            i3++;
                        }
                    }
                    return i3;
                }

                public static String v(int i2, String str) {
                    String[] strArrE0 = e0(str);
                    if (strArrE0.length == 0) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : strArrE0) {
                        if (i2 == lw2.h(lw2.d(str2))) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(str2);
                        }
                    }
                    if (sb.length() > 0) {
                        return sb.toString();
                    }
                    return null;
                }

                public static Point w(Context context) {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                    Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                    if (display == null) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.getClass();
                        display = windowManager.getDefaultDisplay();
                    }
                    if (display.getDisplayId() == 0 && O(context)) {
                        String strG = Build.VERSION.SDK_INT < 28 ? G("sys.display-size") : G("vendor.display-size");
                        if (!TextUtils.isEmpty(strG)) {
                            try {
                                String[] strArrSplit = strG.trim().split("x", -1);
                                if (strArrSplit.length == 2) {
                                    int i2 = Integer.parseInt(strArrSplit[0]);
                                    int i3 = Integer.parseInt(strArrSplit[1]);
                                    if (i2 > 0 && i3 > 0) {
                                        return new Point(i2, i3);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            l93.F("Util", "Invalid display size: " + strG);
                        }
                        if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                    }
                    Point point = new Point();
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                    return point;
                }

                public static Looper x() {
                    Looper looperMyLooper = Looper.myLooper();
                    return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
                }

                public static int y(int i2) {
                    if (i2 == 2 || i2 == 4) {
                        return 6005;
                    }
                    if (i2 == 10) {
                        return 6004;
                    }
                    if (i2 == 7) {
                        return 6005;
                    }
                    if (i2 == 8) {
                        return 6003;
                    }
                    switch (i2) {
                        case 15:
                            return 6003;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static int z(String str) {
                    String[] strArrSplit;
                    int length;
                    int i2 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i2 = Integer.parseInt(str2);
                        if (z) {
                            return -i2;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i2;
                }
            }
