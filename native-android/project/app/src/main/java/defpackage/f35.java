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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f35 {
    public static final String a = null;
    public static final byte[] b = null;
    public static final long[] c = null;
    public static final Pattern d = null;
    public static final Pattern e = null;
    public static final Pattern f = null;
    public static HashMap g;
    public static final String[] h = null;
    public static final String[] i = null;
    public static final int[] j = null;
    public static final int[] k = null;
    public static final int[] l = null;

    static {
        String r0 = Build.DEVICE;
        String r1 = Build.MANUFACTURER;
        a = r0 + ", " + Build.MODEL + ", " + r1 + ", " + Build.VERSION.SDK_INT;
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

    public static long A(long r2, float r4) {
        if (r4 != 1.0f) goto L6;
        return r2;
    L6:
        return Math.round(r2 * ((double) r4));
    }

    public static long B(long r2) {
        if (r2 != (-9223372036854775807L)) goto L7;
        return System.currentTimeMillis();
    L7:
        return SystemClock.elapsedRealtime() + r2;
    }

    public static int C(int r1, ByteOrder r2) {
        if (r1 != 8) goto L5;
        return 3;
    L5:
        if (r1 == 16) goto L25;
        if (r1 == 24) goto L19;
        if (r1 == 32) goto L13;
        return 0;
    L13:
        if (r2.equals(ByteOrder.LITTLE_ENDIAN) == false) goto L16;
        return 22;
    L16:
        return 1610612736;
    L19:
        if (r2.equals(ByteOrder.LITTLE_ENDIAN) == false) goto L22;
        return 21;
    L22:
        return 1342177280;
    L25:
        if (r2.equals(ByteOrder.LITTLE_ENDIAN) == false) goto L28;
        return 2;
    L28:
        return 268435456;
    }

    public static tb1 D(int r2, int r3, int r4) {
        sb1 r0 = new sb1();
        r0.m = lw2.m("audio/raw");
        r0.E = r3;
        r0.F = r4;
        r0.G = r2;
        return new tb1(r0);
    }

    public static long E(long r2, float r4) {
        if (r4 != 1.0f) goto L6;
        return r2;
    L6:
        return Math.round(r2 / ((double) r4));
    }

    public static String F(StringBuilder r9, Formatter r10, long r11) {
        if (r11 != (-9223372036854775807L)) goto L6;
        r11 = 0;
    L6:
        if (r11 >= 0) goto L8;
        String r0 = "-";
    L9:
        long r12 = (Math.abs(r11) + 500) / 1000;
        long r5 = r12 % 60;
        long r7 = (r12 / 60) % 60;
        long r13 = r12 / 3600;
        r9.setLength(0);
        if (r13 <= 0) goto L14;
        return r10.format("%s%d:%02d:%02d", new Object[]{r0, Long.valueOf(r13), Long.valueOf(r7), Long.valueOf(r5)}).toString();
    L14:
        return r10.format("%s%02d:%02d", new Object[]{r0, Long.valueOf(r7), Long.valueOf(r5)}).toString();
    L8:
        r0 = "";
        goto L9
    }

    public static String G(String r3) {
        Class<?> r0 = Class.forName("android.os.SystemProperties");     // Catch: Exception -> L4
        return (String) r0.getMethod("get", new Class[]{String.class}).invoke(r0, new Object[]{r3});
    L4:
        e = move-exception;
        l93.G("Util", "Failed to read system property ".concat(r3), e);
        return null;
    }

    public static String H(int r2) {
        switch(r2) {
            case -2: goto L25;
            case -1: goto L23;
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            default: goto L4;
        };
    L9:
        return "camera motion";
    L11:
        return "metadata";
    L13:
        return "image";
    L15:
        return "text";
    L17:
        return "video";
    L19:
        return "audio";
    L21:
        return "default";
    L23:
        return "unknown";
    L25:
        return "none";
    L4:
        if (r2 >= 10000) goto L6;
        return "?";
    L6:
        return b11.j(r2, "custom (", ")");
    }

    public static boolean I(qi3 r4) {
        boolean r0 = false;
        if (r4 != null) goto L5;
        return false;
    L5:
        int r1 = r4.g();
        if (r1 != 1) goto L12;
        if (r4.S0(2) == false) goto L12;
        r4.b();
    L10:
        r0 = true;
    L17:
        if (r4.S0(1) == false) goto L20;
        r4.m0();
        return true;
    L20:
        return r0;
    L12:
        if (r1 != 4) goto L17;
        if (r4.S0(4) == false) goto L17;
        r4.C();
        goto L10
    }

    public static int J(Uri r7, String r8) {
        byte r0 = -1;
        if (r8 != null) goto L53;
        String r9 = r7.getScheme();
        if (r9 != null) goto L7;
    L11:
        String r10 = r7.getLastPathSegment();
        if (r10 == null) goto L72;
        int r6 = r10.lastIndexOf(46);
        if (r6 < 0) goto L42;
        String r11 = rr2.U(r10.substring(r6 + 1));
        r11.getClass();
        switch(r11.hashCode()) {
            case 104579: goto L32;
            case 108321: goto L28;
            case 3242057: goto L24;
            case 3299913: goto L20;
            default: goto L35;
        };
    L35:
        switch(r0) {
            case 0: goto L39;
            case 1: goto L38;
            case 2: goto L39;
            case 3: goto L37;
            default: goto L36;
        };
    L36:
        int r12 = 4;
    L40:
        if (r12 == 4) goto L42;
        return r12;
    L37:
        r12 = 2;
        goto L40
    L38:
        r12 = 0;
        goto L40
    L39:
        r12 = 1;
        goto L40
    L20:
        if (r11.equals("m3u8") == false) goto L35;
        r0 = 3;
        goto L35
    L24:
        if (r11.equals("isml") == false) goto L35;
        r0 = 2;
        goto L35
    L28:
        if (r11.equals("mpd") == false) goto L35;
        r0 = 1;
        goto L35
    L32:
        if (r11.equals("ism") == false) goto L35;
        r0 = 0;
    L42:
        String r13 = r7.getPath();
        r13.getClass();
        Matcher r14 = f.matcher(r13);
        if (r14.matches() == false) goto L72;
        String r15 = r14.group(2);
        if (r15 != null) goto L47;
    L75:
        return 1;
    L47:
        if (r15.contains("format=mpd-time-csf") == false) goto L50;
    L74:
        return 0;
    L50:
        if (r15.contains("format=m3u8-aapl") == false) goto L75;
    L76:
        return 2;
    L72:
        return 4;
    L7:
        if (rr2.A("rtsp", r9) == false) goto L9;
    L73:
        return 3;
    L9:
        if (rr2.A("rtspt", r9) == false) goto L11;
    L53:
        switch(r8.hashCode()) {
            case -979127466: goto L68;
            case -156749520: goto L64;
            case 64194685: goto L60;
            case 1154777587: goto L56;
            default: goto L71;
        };
    L71:
        switch(r0) {
            case 0: goto L76;
            case 1: goto L75;
            case 2: goto L74;
            case 3: goto L73;
            default: goto L72;
        };
    L56:
        if (r8.equals("application/x-rtsp") == false) goto L71;
        r0 = 3;
        goto L71
    L60:
        if (r8.equals("application/dash+xml") == false) goto L71;
        r0 = 2;
        goto L71
    L64:
        if (r8.equals("application/vnd.ms-sstr+xml") == false) goto L71;
        r0 = 1;
        goto L71
    L68:
        if (r8.equals("application/x-mpegURL") == false) goto L71;
        r0 = 0;
        goto L71
    }

    public static boolean K(be3 r3, be3 r4, Inflater r5) {
        if (r3.a() != 0) goto L6;
        return false;
    L6:
        if (r4.a.length >= r3.a()) goto L8;
        r4.c(r3.a() * 2);
    L8:
        if (r5 != null) goto L10;
        r5 = new Inflater();
    L10:
        r5.setInput(r3.a, r3.b, r3.a());
        int r6 = 0;
    L33:
        byte[] r0 = r4.a;     // Catch: Throwable -> L16 DataFormatException -> L31
        r6 = r6 + r5.inflate(r0, r6, r0.length - r6);     // Catch: Throwable -> L16 DataFormatException -> L31
        if (r5.finished() == true) goto L13;
        if (r5.needsDictionary() == true) goto L27;
        if (r5.needsInput() == true) goto L27;
        byte[] r1 = r4.a;     // Catch: Throwable -> L16 DataFormatException -> L31
        if (r6 != r1.length) goto L33;
        r4.c(r1.length * 2);     // Catch: Throwable -> L16 DataFormatException -> L31
    L27:
        r5.reset();
        return false;
    L13:
        r4.M(r6);     // Catch: Throwable -> L16 DataFormatException -> L31
        r5.reset();
        return true;
    L31:
        r5.reset();
        return false;
    L16:
        th = move-exception;
        r5.reset();
        throw th;
    }

    public static boolean L(int r1) {
        if (r1 != 3) goto L5;
        return true;
    L5:
        if (r1 != 2) goto L7;
        return true;
    L7:
        if (r1 != 268435456) goto L9;
        return true;
    L9:
        if (r1 != 21) goto L11;
        return true;
    L11:
        if (r1 != 1342177280) goto L13;
        return true;
    L13:
        if (r1 != 22) goto L15;
        return true;
    L15:
        if (r1 != 1610612736) goto L17;
        return true;
    L17:
        if (r1 == 4) goto L29;
        return false;
    L29:
        return true;
    }

    public static boolean M(Context r2) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) goto L5;
        return true;
    L5:
        if (r2.getApplicationInfo().targetSdkVersion >= 29) goto L7;
        return true;
    L7:
        if (r0 != 30) goto L13;
        String r3 = Build.MODEL;
        if (rr2.A(r3, "moto g(20)") == false) goto L11;
        return true;
    L11:
        if (rr2.A(r3, "rmx3231") == false) goto L13;
        return true;
    L13:
        if (r0 == 34) goto L15;
        return false;
    L15:
        if (rr2.A(Build.MODEL, "sm-x200") == true) goto L25;
        return false;
    L25:
        return true;
    }

    public static boolean N(int r1) {
        if (r1 != 10) goto L5;
        return true;
    L5:
        if (r1 == 13) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean O(Context r1) {
        UiModeManager r2 = (UiModeManager) r1.getApplicationContext().getSystemService("uimode");
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.getCurrentModeType() != 4) goto L10;
        return true;
    L10:
        return false;
    }

    public static void P(ArrayList r2, int r3, int r4, int r5) {
        ArrayDeque r0 = new ArrayDeque();
        int r6 = (r4 - r3) - 1;
    L3:
        if (r6 < 0) goto L5;
        r0.addFirst(r2.remove(r3 + r6));
        r6 = r6 - 1;
        goto L3
    L5:
        r2.addAll(Math.min(r5, r2.size()), r0);
    }

    public static long Q(long r2) {
        if (r2 != (-9223372036854775807L)) goto L5;
        return r2;
    L5:
        if (r2 != Long.MIN_VALUE) goto L8;
        return r2;
    L8:
        return r2 * 1000;
    }

    public static String R(String r10) {
        if (r10 != null) goto L5;
        return null;
    L5:
        String r0 = r10.replace('_', '-');
        if (r0.isEmpty() == false) goto L8;
    L11:
        String r11 = rr2.U(r10);
        int r1 = 0;
        String r2 = r11.split("-", 2)[0];
        if (g != null) goto L25;
        String[] r3 = Locale.getISOLanguages();
        int r4 = r3.length;
        String[] r5 = h;
        HashMap r6 = new HashMap(r4 + r5.length);
        int r7 = r3.length;
        int r8 = 0;
    L14:
        if (r8 >= r7) goto L20;
        String r9 = r3[r8];
        String r12 = new Locale(r9).getISO3Language();     // Catch: MissingResourceException -> L41
        if (TextUtils.isEmpty(r12) == true) goto L19;
        r6.put(r12, r9);     // Catch: MissingResourceException -> L41
    L19:
        r8 = r8 + 1;
        goto L14
    L20:
        int r13 = 0;
    L22:
        if (r13 >= r5.length) goto L24;
        r6.put(r5[r13], r5[r13 + 1]);
        r13 = r13 + 2;
        goto L22
    L24:
        g = r6;
    L25:
        String r14 = (String) g.get(r2);
        if (r14 == null) goto L29;
        r11 = r14.concat(r11.substring(r2.length()));
        r2 = r14;
    L29:
        if ("no".equals(r2) == true) goto L34;
        if ("i".equals(r2) == true) goto L34;
        if ("zh".equals(r2) == true) goto L34;
        return r11;
    L34:
        String[] r15 = i;
        if (r1 >= r15.length) goto L52;
        if (r11.startsWith(r15[r1]) == true) goto L51;
        r1 = r1 + 2;
        goto L34
    L51:
        return r15[r1 + 1] + r11.substring(r15[r1].length());
    L52:
        return r11;
    L8:
        if (r0.equals("und") == true) goto L11;
        r10 = r0;
        goto L11
    }

    public static Object[] S(int r1, Object[] r2) {
        if (r1 > r2.length) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        return Arrays.copyOf(r2, r1);
    L5:
        r0 = false;
        goto L6
    }

    public static long T(String r10) {
        Matcher r0 = d.matcher(r10);
        if (r0.matches() == false) goto L25;
        int r2 = 0;
        if (r0.group(9) != null) goto L8;
    L17:
        GregorianCalendar r3 = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        r3.clear();
        r3.set(Integer.parseInt(r0.group(1)), Integer.parseInt(r0.group(2)) - 1, Integer.parseInt(r0.group(3)), Integer.parseInt(r0.group(4)), Integer.parseInt(r0.group(5)), Integer.parseInt(r0.group(6)));
        if (TextUtils.isEmpty(r0.group(8)) == true) goto L20;
        r3.set(14, new BigDecimal("0." + r0.group(8)).movePointRight(3).intValue());
    L20:
        long r1 = r3.getTimeInMillis();
        if (r2 != 0) goto L23;
        return r1;
    L23:
        return r1 - (((long) r2) * 60000);
    L8:
        if (r0.group(9).equalsIgnoreCase("Z") == true) goto L17;
        int r11 = Integer.parseInt(r0.group(12)) * 60;
        String r4 = r0.group(13);
        if (r4 == null) goto L13;
        r2 = Integer.parseInt(r4) + r11;
    L15:
        if ("-".equals(r0.group(11)) == false) goto L17;
        r2 = r2 * (-1);
        goto L17
    L13:
        r2 = r11;
        goto L15
    L25:
        throw ParserException.a(null, "Invalid date/time format: ".concat(r10));
    }

    public static float U(long r2, long r4) {
        if (r4 == 0) goto L8;
        if (r2 != r4) goto L8;
        return 100.0f;
    L8:
        return (r2 / r4) * 100.0f;
    }

    public static int V(long r6, long r8) {
        long r2 = gh0.A(r6, 100);
        if (r2 != Long.MAX_VALUE) goto L5;
    L7:
        long r3 = r6 / (r8 / 100);
    L9:
        return jz4.I(r3);
    L5:
        if (r2 == Long.MIN_VALUE) goto L7;
        r3 = r2 / r8;
        goto L9
    }

    public static void W(Handler r2, Runnable r3) {
        Looper r0 = r2.getLooper();
        if (r0.getThread().isAlive() == true) goto L6;
        return;
    L6:
        if (r0 != Looper.myLooper()) goto L9;
        r3.run();
        return;
    L9:
        r2.post(r3);
    }

    public static void X(ArrayList r1, int r2, int r3) {
        if (r2 >= 0) goto L4;
    L9:
        nz2.c();
        return;
    L4:
        if (r3 > r1.size()) goto L9;
        if (r2 > r3) goto L9;
        if (r2 == r3) goto L11;
        r1.subList(r2, r3).clear();
        return;
    }

    public static long Y(int r7, long r8) {
        return a0(r8, 1000000, r7, RoundingMode.DOWN);
    }

    public static void Z(long[] r12, long r13) {
        RoundingMode r6 = RoundingMode.DOWN;
        int r1 = 0;
        if (r13 >= 1000000) goto L5;
    L10:
        if (r13 < 1000000) goto L12;
    L17:
        int r9 = 0;
    L19:
        if (r9 >= r12.length) goto L41;
        long r0 = r12[r9];
        if (r0 != 0) goto L24;
    L22:
        long r4 = r13;
    L33:
        r9 = r9 + 1;
        r13 = r4;
        goto L19
    L24:
        if (r13 >= r0) goto L26;
    L28:
        if (r13 < r0) goto L30;
    L32:
        r4 = r13;
        r12[r9] = b0(r0, 1000000, r4, r6);
        goto L33
    L30:
        if ((r0 % r13) != 0) goto L32;
        r12[r9] = gh0.A(1000000, gh0.h(r0, r13, RoundingMode.UNNECESSARY));
        goto L22
    L26:
        if ((r13 % r0) != 0) goto L28;
        r12[r9] = gh0.h(1000000, gh0.h(r13, r0, RoundingMode.UNNECESSARY), r6);
        goto L22
    L41:
        return;
    L12:
        if ((1000000 % r13) != 0) goto L17;
        long r14 = gh0.h(1000000, r13, RoundingMode.UNNECESSARY);
    L15:
        if (r1 >= r12.length) goto L40;
        r12[r1] = gh0.A(r12[r1], r14);
        r1 = r1 + 1;
        goto L15
    L40:
        return;
    L5:
        if ((r13 % 1000000) != 0) goto L10;
        long r15 = gh0.h(r13, 1000000, RoundingMode.UNNECESSARY);
    L8:
        if (r1 >= r12.length) goto L34;
        r12[r1] = gh0.h(r12[r1], r15, r6);
        r1 = r1 + 1;
        goto L8
    }

    public static long a(long r6, long r8) {
        long r0 = r6 + r8;
        boolean r9 = false;
        if ((r8 ^ r6) >= 0) goto L5;
        boolean r10 = true;
    L7:
        if ((r6 ^ r0) < 0) goto L10;
        r9 = true;
    L10:
        if ((r10 | r9) == false) goto L12;
        long r2 = r0;
    L14:
        if (r2 != Long.MIN_VALUE) goto L18;
        if (r0 == Long.MIN_VALUE) goto L18;
    L21:
        return Long.MAX_VALUE;
    L18:
        if (r2 == Long.MAX_VALUE) goto L20;
    L22:
        return r2;
    L20:
        if (r0 == Long.MAX_VALUE) goto L22;
    L12:
        r2 = ((r0 >>> 63) ^ 1) + Long.MAX_VALUE;
        goto L14
    L5:
        r10 = false;
        goto L7
    }

    public static long a0(long r7, long r9, long r11, RoundingMode r13) {
        if (r7 != 0) goto L5;
    L31:
        return 0;
    L5:
        if (r9 == 0) goto L31;
        if (r11 >= r9) goto L10;
    L13:
        if (r11 >= r9) goto L19;
        if ((r9 % r11) != 0) goto L19;
        return gh0.A(r7, gh0.h(r9, r11, RoundingMode.UNNECESSARY));
    L19:
        if (r11 >= r7) goto L21;
    L24:
        if (r11 >= r7) goto L30;
        if ((r7 % r11) != 0) goto L30;
        return gh0.A(r9, gh0.h(r7, r11, RoundingMode.UNNECESSARY));
    L30:
        return b0(r7, r9, r11, r13);
    L21:
        if ((r11 % r7) != 0) goto L24;
        return gh0.h(r9, gh0.h(r11, r7, RoundingMode.UNNECESSARY), r13);
    L10:
        if ((r11 % r9) != 0) goto L13;
        return gh0.h(r7, gh0.h(r11, r9, RoundingMode.UNNECESSARY), r13);
    }

    public static int b(long[] r4, long r5, boolean r7) {
        int r0 = Arrays.binarySearch(r4, r5);
        if (r0 < 0) goto L5;
    L6:
        int r1 = r0 + 1;
        if (r1 >= r4.length) goto L11;
        if (r4[r1] != r5) goto L11;
        r0 = r1;
    L11:
        if (r7 == false) goto L13;
        return r0;
    L13:
        return r1;
    L5:
        return ~r0;
    }

    public static long b0(long r9, long r11, long r13, RoundingMode r15) {
        long r0 = gh0.A(r9, r11);
        if (r0 != Long.MAX_VALUE) goto L5;
    L8:
        long r1 = gh0.n(Math.abs(r11), Math.abs(r13));
        RoundingMode r4 = RoundingMode.UNNECESSARY;
        long r12 = gh0.h(r11, r1, r4);
        long r14 = gh0.h(r13, r1, r4);
        long r2 = gh0.n(Math.abs(r9), Math.abs(r14));
        long r10 = gh0.h(r9, r2, r4);
        long r16 = gh0.h(r14, r2, r4);
        long r3 = gh0.A(r10, r12);
        if (r3 != Long.MAX_VALUE) goto L11;
    L14:
        double r17 = r10 * (r12 / r16);
        if (r17 <= 9.223372036854776E18d) goto L18;
        return Long.MAX_VALUE;
    L18:
        if (r17 >= (-9.223372036854776E18d)) goto L20;
        return Long.MIN_VALUE;
    L20:
        int r5 = ms0.a;
        if (rr2.I(r17) == false) goto L71;
        boolean r6 = true;
        switch(ls0.a[r15.ordinal()]) {
            case 1: goto L55;
            case 2: goto L49;
            case 3: goto L42;
            case 4: goto L54;
            case 5: goto L34;
            case 6: goto L32;
            case 7: goto L29;
            case 8: goto L26;
            default: goto L25;
        };
    L26:
        double r7 = Math.rint(r17);
        if (Math.abs(r17 - r7) == 0.5d) goto L54;
    L57:
        if (((-9.223372036854776E18d) - r7) >= 1.0d) goto L59;
        boolean r18 = true;
    L61:
        if (r7 < 9.223372036854776E18d) goto L65;
        r6 = false;
    L65:
        if ((r18 & r6) == false) goto L69;
        return (long) r7;
    L69:
        throw new ArithmeticException("rounded value is out of range for input " + r17 + " and rounding mode " + r15);
    L59:
        r18 = false;
        goto L61
    L29:
        r7 = Math.rint(r17);
        if (Math.abs(r17 - r7) != 0.5d) goto L57;
        r7 = Math.copySign(0.5d, r17) + r17;
        goto L57
    L32:
        r7 = Math.rint(r17);
    L54:
        r7 = r17;
        goto L57
    L55:
        l93.n(ms0.a(r17));
        goto L54
    L25:
        throw new AssertionError();
    L34:
        if (ms0.a(r17) == true) goto L54;
        long r8 = (long) r17;
        if (r17 <= 0.0d) goto L39;
        int r19 = 1;
    L40:
        r7 = r8 + ((long) r19);
        goto L57
    L39:
        r19 = -1;
        goto L40
    L42:
        if (r17 <= 0.0d) goto L54;
        if (ms0.a(r17) == true) goto L54;
        long r20 = ((long) r17) + 1;
    L47:
        r7 = r20;
        goto L57
    L49:
        if (r17 >= 0.0d) goto L54;
        if (ms0.a(r17) == true) goto L54;
        r20 = ((long) r17) - 1;
        goto L47
    L71:
        throw new ArithmeticException("input is infinite or NaN");
    L11:
        if (r3 == Long.MIN_VALUE) goto L14;
        return gh0.h(r3, r16, r15);
    L5:
        if (r0 == Long.MIN_VALUE) goto L8;
        return gh0.h(r0, r13, r15);
    }

    public static int c(te2 r6, long r7) {
        int r0 = r6.b - 1;
        int r2 = 0;
    L3:
        if (r2 > r0) goto L8;
        int r3 = (r2 + r0) >>> 1;
        if (r6.d(r3) < r7) goto L6;
        r0 = r3 - 1;
        goto L3
    L6:
        r2 = r3 + 1;
        goto L3
    L8:
        int r4 = r0 + 1;
        if (r4 >= r6.b) goto L14;
        if (r6.d(r4) != r7) goto L14;
        return r4;
    L14:
        if (r0 != (-1)) goto L16;
        return 0;
    L16:
        return r0;
    }

    public static void c0(Service r2, int r3, Notification r4, int r5, String r6) {
        if (Build.VERSION.SDK_INT >= 29) goto L11;
        r2.startForeground(r3, r4);
        return;
    L11:
        lm4.n(r2, r3, r4, r5);     // Catch: RuntimeException -> L6
        return;
    L6:
        e = move-exception;
        l93.F("Util", "The service must be declared with a foregroundServiceType that includes ".concat(r6));
        throw e;
    }

    public static int d(List r3, Long r4, boolean r5) {
        int r0 = Collections.binarySearch(r3, r4);
        if (r0 >= 0) goto L5;
        int r6 = -(r0 + 2);
    L11:
        if (r5 == true) goto L13;
        return r6;
    L13:
        return Math.max(0, r6);
    L5:
        int r1 = r0 - 1;
        if (r1 < 0) goto L10;
        if (((Comparable) r3.get(r1)).compareTo(r4) != 0) goto L10;
        r0 = r1;
    L10:
        r6 = r0;
        goto L11
    }

    public static boolean d0(qi3 r3, boolean r4) {
        if (r3 != null) goto L5;
    L18:
        return true;
    L5:
        if (r3.q() == false) goto L18;
        if (r3.g() == 1) goto L18;
        if (r3.g() == 4) goto L18;
        if (r4 == true) goto L12;
        return false;
    L12:
        if (r3.v0() != 0) goto L14;
        return false;
    L14:
        if (r3.v0() != 4) goto L18;
        return false;
    }

    public static int e(int[] r3, int r4, boolean r5, boolean r6) {
        int r0 = Arrays.binarySearch(r3, r4);
        if (r0 >= 0) goto L5;
        int r7 = -(r0 + 2);
    L13:
        if (r6 == true) goto L15;
        return r7;
    L15:
        return Math.max(0, r7);
    L5:
        int r1 = r0 - 1;
        if (r1 < 0) goto L10;
        if (r3[r1] != r4) goto L10;
        r0 = r1;
    L10:
        if (r5 == false) goto L12;
        r7 = r0;
        goto L13
    L12:
        r7 = r1;
        goto L13
    }

    public static String[] e0(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L7;
        return new String[0];
    L7:
        return r2.trim().split("(\\s*,\\s*)", -1);
    }

    public static int f(long[] r4, long r5, boolean r7) {
        int r0 = Arrays.binarySearch(r4, r5);
        if (r0 >= 0) goto L5;
        int r6 = -(r0 + 2);
    L11:
        if (r7 == true) goto L13;
        return r6;
    L13:
        return Math.max(0, r6);
    L5:
        int r1 = r0 - 1;
        if (r1 < 0) goto L10;
        if (r4[r1] != r5) goto L10;
        r0 = r1;
    L10:
        r6 = r0;
        goto L11
    }

    public static boolean f0(SQLiteDatabase r2, String r3) {
        if (DatabaseUtils.queryNumEntries(r2, "sqlite_master", "tbl_name = ?", new String[]{r3}) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int g(int r0, int r1) {
        return ((r0 + r1) - 1) / r1;
    }

    public static String g0(int r6) {
        return new String(new byte[]{(byte) (r6 >> 24), (byte) (r6 >> 16), (byte) (r6 >> 8), (byte) r6}, StandardCharsets.US_ASCII);
    }

    public static void h(Closeable r0) {
        if (r0 == null) goto L8;
        r0.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    public static lb4 h0(ic2 r4, mk r5) {
        lb4 r0 = new lb4();
        mn2 r1 = new mn2(r0, r4, 1);
        gq0 r2 = gq0.n;
        r0.f(r1, r2);
        r4.f(new qo2(r4, r0, r5, 17), r2);
        return r0;
    }

    public static float i(float r0, float r1, float r2) {
        return Math.max(r1, Math.min(r0, r2));
    }

    public static long i0(long r2) {
        if (r2 != (-9223372036854775807L)) goto L5;
        return r2;
    L5:
        if (r2 != Long.MIN_VALUE) goto L8;
        return r2;
    L8:
        return r2 / 1000;
    }

    public static int j(int r0, int r1, int r2) {
        return Math.max(r1, Math.min(r0, r2));
    }

    public static long k(long r0, long r2, long r4) {
        return Math.max(r2, Math.min(r0, r4));
    }

    public static boolean l(SparseArray r0, int r1) {
        if (r0.indexOfKey(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean m(Object[] r4, Object r5) {
        int r0 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (Objects.equals(r4[r2], r5) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static Bundle n(Bundle r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        ClassLoader r1 = f35.class.getClassLoader();
        r1.getClass();
        r3.setClassLoader(r1);
        r3.isEmpty();     // Catch: RuntimeException -> L8
        return r3;
    L8:
        e = move-exception;
        l93.G("Util", "Ignoring invalid bundle", e);
        return null;
    }

    public static int o(int r2, int r3, int r4, byte[] r5) {
    L2:
        if (r2 >= r3) goto L4;
        int r0 = r4 << 8;
        int r6 = ((r4 >>> 24) ^ (r5[r2] & 255)) & 255;
        r4 = j[r6] ^ r0;
        r2 = r2 + 1;
        goto L2
    L4:
        return r4;
    }

    public static Handler p(nk2 r2) {
        Looper r0 = Looper.myLooper();
        r0.getClass();
        return new Handler(r0, r2);
    }

    public static Handler q(gt0 r2) {
        return new Handler(x(), r2);
    }

    public static int r(int r1) {
        if (r1 == 30) goto L22;
        switch(r1) {
            case 2: goto L20;
            case 3: goto L20;
            case 4: goto L18;
            case 5: goto L18;
            case 6: goto L18;
            case 7: goto L16;
            case 8: goto L16;
            case 9: goto L14;
            case 10: goto L14;
            case 11: goto L14;
            case 12: goto L14;
            default: goto L5;
        };
    L5:
        switch(r1) {
            case 14: goto L12;
            case 15: goto L24;
            case 16: goto L24;
            case 17: goto L24;
            case 18: goto L24;
            default: goto L6;
        };
    L6:
        switch(r1) {
            case 20: goto L11;
            case 21: goto L9;
            case 22: goto L9;
            default: goto L7;
        };
    L7:
        return Integer.MAX_VALUE;
    L9:
        return 31;
    L11:
        return 30;
    L12:
        return 25;
    L24:
        return 28;
    L14:
        return 28;
    L16:
        return 23;
    L18:
        return 21;
    L20:
        return 3;
    L22:
        return 34;
    }

    public static int s(int r4) {
        if (r4 == 10) goto L49;
        if (r4 == 16) goto L44;
        if (r4 == 24) goto L39;
        switch(r4) {
            case 1: goto L36;
            case 2: goto L34;
            case 3: goto L32;
            case 4: goto L30;
            case 5: goto L28;
            case 6: goto L26;
            case 7: goto L24;
            case 8: goto L23;
            default: goto L9;
        };
    L9:
        switch(r4) {
            case 12: goto L21;
            case 13: goto L17;
            case 14: goto L12;
            default: goto L10;
        };
    L10:
        return 0;
    L21:
        return 743676;
    L12:
        if (Build.VERSION.SDK_INT < 32) goto L15;
        return 202070268;
    L15:
        return 0;
    L17:
        if (Build.VERSION.SDK_INT < 32) goto L20;
        return 30136348;
    L20:
        return 0;
    L23:
        return 6396;
    L24:
        return 1276;
    L26:
        return 252;
    L28:
        return 220;
    L30:
        return 204;
    L32:
        return 28;
    L34:
        return 12;
    L36:
        return 4;
    L39:
        if (Build.VERSION.SDK_INT < 32) goto L42;
        return 67108860;
    L42:
        return 0;
    L44:
        if (Build.VERSION.SDK_INT < 32) goto L47;
        return 205215996;
    L47:
        return 0;
    L49:
        if (Build.VERSION.SDK_INT < 32) goto L52;
        return 737532;
    L52:
        return 6396;
    }

    public static int t(int r4) {
        if (r4 != 2) goto L5;
    L25:
        return 2;
    L5:
        if (r4 != 3) goto L7;
        return 1;
    L7:
        if (r4 != 4) goto L9;
    L22:
        return 4;
    L9:
        if (r4 != 21) goto L11;
    L21:
        return 3;
    L11:
        if (r4 == 22) goto L22;
        if (r4 == 268435456) goto L25;
        if (r4 == 1342177280) goto L21;
        if (r4 == 1610612736) goto L22;
        nz2.c();
        return 0;
    }

    public static int u(int r4, String r5) {
        String[] r6 = e0(r5);
        int r0 = r6.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (r4 != lw2.h(lw2.d(r6[r1]))) goto L7;
        r2 = r2 + 1;
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r2;
    }

    public static String v(int r5, String r6) {
        String[] r7 = e0(r6);
        if (r7.length == 0) goto L23;
        StringBuilder r0 = new StringBuilder();
        int r1 = r7.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L15;
        String r3 = r7[r2];
        if (r5 != lw2.h(lw2.d(r3))) goto L13;
        if (r0.length() <= 0) goto L12;
        r0.append(",");
    L12:
        r0.append(r3);
    L13:
        r2 = r2 + 1;
        goto L6
    L15:
        if (r0.length() > 0) goto L17;
        return null;
    L17:
        return r0.toString();
    L23:
        return null;
    }

    public static Point w(Context r6) {
        DisplayManager r0 = (DisplayManager) r6.getSystemService("display");
        if (r0 == null) goto L5;
        Display r1 = r0.getDisplay(0);
    L6:
        if (r1 != null) goto L9;
        WindowManager r2 = (WindowManager) r6.getSystemService("window");
        r2.getClass();
        r1 = r2.getDefaultDisplay();
    L9:
        if (r1.getDisplayId() == 0) goto L11;
    L33:
        Point r7 = new Point();
        Display.Mode r3 = r1.getMode();
        r7.x = r3.getPhysicalWidth();
        r7.y = r3.getPhysicalHeight();
        return r7;
    L11:
        if (O(r6) == false) goto L33;
        if (Build.VERSION.SDK_INT >= 28) goto L15;
        String r4 = G("sys.display-size");
    L17:
        if (TextUtils.isEmpty(r4) == true) goto L27;
        String[] r5 = r4.trim().split("x", -1);     // Catch: NumberFormatException -> L35
        if (r5.length != 2) goto L25;
        int r8 = Integer.parseInt(r5[0]);     // Catch: NumberFormatException -> L35
        int r9 = Integer.parseInt(r5[1]);     // Catch: NumberFormatException -> L35
        if (r8 <= 0) goto L25;
        if (r9 <= 0) goto L25;
        return new Point(r8, r9);
    L25:
        l93.F("Util", "Invalid display size: " + r4);
    L27:
        if ("Sony".equals(Build.MANUFACTURER) == false) goto L33;
        if (Build.MODEL.startsWith("BRAVIA") == false) goto L33;
        if (r6.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd") == false) goto L33;
        return new Point(3840, 2160);
    L15:
        r4 = G("vendor.display-size");
        goto L17
    L5:
        r1 = null;
        goto L6
    }

    public static Looper x() {
        Looper r0 = Looper.myLooper();
        if (r0 == null) goto L6;
        return r0;
    L6:
        return Looper.getMainLooper();
    }

    public static int y(int r1) {
        if (r1 != 2) goto L5;
        return 6005;
    L5:
        if (r1 != 4) goto L7;
        return 6005;
    L7:
        if (r1 != 10) goto L9;
        return 6004;
    L9:
        if (r1 != 7) goto L11;
        return 6005;
    L11:
        if (r1 == 8) goto L18;
        switch(r1) {
            case 15: goto L24;
            case 16: goto L28;
            case 17: goto L25;
            case 18: goto L28;
            case 19: goto L25;
            case 20: goto L25;
            case 21: goto L25;
            case 22: goto L25;
            default: goto L13;
        };
    L13:
        switch(r1) {
            case 24: goto L16;
            case 25: goto L16;
            case 26: goto L16;
            case 27: goto L16;
            case 28: goto L16;
            default: goto L14;
        };
    L14:
        return 6006;
    L16:
        return 6002;
    L24:
        return 6003;
    L25:
        return 6004;
    L28:
        return 6005;
    L18:
        return 6003;
    }

    public static int z(String r5) {
        int r0 = 0;
        if (r5 != null) goto L5;
        return 0;
    L5:
        String[] r6 = r5.split("_", -1);
        int r1 = r6.length;
        if (r1 >= 2) goto L8;
        return 0;
    L8:
        String r3 = r6[r1 - 1];
        if (r1 >= 3) goto L11;
    L13:
        boolean r7 = false;
    L20:
        r3.getClass();     // Catch: NumberFormatException -> L19
        r0 = Integer.parseInt(r3);     // Catch: NumberFormatException -> L19
        if (r7 == false) goto L18;
        return -r0;
    L18:
        return r0;
    L11:
        if ("neg".equals(r6[r1 - 2]) == false) goto L13;
        r7 = true;
        goto L20
    }
}
