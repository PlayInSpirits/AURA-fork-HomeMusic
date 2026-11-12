package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lw2 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        n50 n50VarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (n50VarF = f(str2)) == null || (iA = n50VarF.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrE0 = f35.e0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrE0) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        n50 n50VarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (n50VarF = f(str2)) == null) {
                    return 0;
                }
                return n50VarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        n50 n50VarF;
        String strE = null;
        if (str != null) {
            String strU = rr2.U(str.trim());
            if (strU.startsWith("avc1") || strU.startsWith("avc3")) {
                return "video/avc";
            }
            if (strU.startsWith("hev1") || strU.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strU.startsWith("dvav") || strU.startsWith("dva1") || strU.startsWith("dvhe") || strU.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strU.startsWith("av01")) {
                return "video/av01";
            }
            if (strU.startsWith("vp9") || strU.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strU.startsWith("vp8") || strU.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strU.startsWith("mp4a")) {
                if (strU.startsWith("mp4a.") && (n50VarF = f(strU)) != null) {
                    strE = e(n50VarF.a);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strU.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strU.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strU.startsWith("ac-3") || strU.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strU.startsWith("ec-3") || strU.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strU.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strU.startsWith("ac-4") || strU.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strU.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strU.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strU.startsWith("dtsh") || strU.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strU.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strU.startsWith("opus")) {
                return "audio/opus";
            }
            if (strU.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strU.startsWith("flac")) {
                return "audio/flac";
            }
            if (strU.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strU.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strU.contains("cea708")) {
                return "application/cea-708";
            }
            if (strU.contains("eia608") || strU.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                kf2.k();
                return null;
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static n50 f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new n50(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        kf2.k();
        return 0;
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String strU = rr2.U(str);
        strU.getClass();
        switch (strU) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strU;
        }
    }
}
