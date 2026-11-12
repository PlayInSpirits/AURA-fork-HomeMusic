package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lw2 {
    public static final ArrayList a = null;
    public static final Pattern b = null;

    static {
        a = new ArrayList();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static boolean a(String r4, String r5) {
        if (r4 != null) goto L5;
        return false;
    L5:
        byte r3 = -1;
        switch(r4.hashCode()) {
            case -2123537834: goto L49;
            case -432837260: goto L45;
            case -432837259: goto L41;
            case -53558318: goto L37;
            case 187078296: goto L33;
            case 187094639: goto L29;
            case 1504578661: goto L25;
            case 1504619009: goto L21;
            case 1504831518: goto L17;
            case 1903231877: goto L13;
            case 1903589369: goto L9;
            default: goto L52;
        };
    L52:
        switch(r3) {
            case 0: goto L65;
            case 1: goto L65;
            case 2: goto L65;
            case 3: goto L54;
            case 4: goto L65;
            case 5: goto L65;
            case 6: goto L65;
            case 7: goto L65;
            case 8: goto L65;
            case 9: goto L65;
            case 10: goto L65;
            default: goto L53;
        };
    L53:
        return false;
    L54:
        if (r5 != null) goto L56;
        return false;
    L56:
        n50 r6 = f(r5);
        if (r6 != null) goto L59;
        return false;
    L59:
        int r7 = r6.a();
        if (r7 != 0) goto L62;
    L64:
        return false;
    L62:
        if (r7 == 16) goto L64;
        return true;
    L65:
        return true;
    L9:
        if (r4.equals("audio/g711-mlaw") == false) goto L52;
        r3 = 10;
        goto L52
    L13:
        if (r4.equals("audio/g711-alaw") == false) goto L52;
        r3 = 9;
        goto L52
    L17:
        if (r4.equals("audio/mpeg") == false) goto L52;
        r3 = 8;
        goto L52
    L21:
        if (r4.equals("audio/flac") == false) goto L52;
        r3 = 7;
        goto L52
    L25:
        if (r4.equals("audio/eac3") == false) goto L52;
        r3 = 6;
        goto L52
    L29:
        if (r4.equals("audio/raw") == false) goto L52;
        r3 = 5;
        goto L52
    L33:
        if (r4.equals("audio/ac3") == false) goto L52;
        r3 = 4;
        goto L52
    L37:
        if (r4.equals("audio/mp4a-latm") == false) goto L52;
        r3 = 3;
        goto L52
    L41:
        if (r4.equals("audio/mpeg-L2") == false) goto L52;
        r3 = 2;
        goto L52
    L45:
        if (r4.equals("audio/mpeg-L1") == false) goto L52;
        r3 = 1;
        goto L52
    L49:
        if (r4.equals("audio/eac3-joc") == false) goto L52;
        r3 = 0;
        goto L52
    }

    public static String b(String r6, String r7) {
        if (r6 == null) goto L19;
        if (r7 == null) goto L19;
        String[] r8 = f35.e0(r6);
        StringBuilder r1 = new StringBuilder();
        int r2 = r8.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L16;
        String r4 = r8[r3];
        if (r7.equals(d(r4)) == false) goto L14;
        if (r1.length() <= 0) goto L13;
        r1.append(",");
    L13:
        r1.append(r4);
    L14:
        r3 = r3 + 1;
        goto L7
    L16:
        if (r1.length() <= 0) goto L19;
        return r1.toString();
    L19:
        return null;
    }

    public static int c(String r8, String r9) {
        r8.getClass();
        byte r7 = -1;
        switch(r8.hashCode()) {
            case -2123537834: goto L50;
            case -1365340241: goto L46;
            case -1095064472: goto L42;
            case -53558318: goto L38;
            case 187078296: goto L34;
            case 187078297: goto L30;
            case 550520934: goto L26;
            case 1504578661: goto L22;
            case 1504831518: goto L18;
            case 1504891608: goto L14;
            case 1505942594: goto L10;
            case 1556697186: goto L6;
            default: goto L53;
        };
    L53:
        switch(r7) {
            case 0: goto L76;
            case 1: goto L75;
            case 2: goto L74;
            case 3: goto L67;
            case 4: goto L66;
            case 5: goto L64;
            case 6: goto L62;
            case 7: goto L61;
            case 8: goto L60;
            case 9: goto L58;
            case 10: goto L57;
            case 11: goto L55;
            default: goto L54;
        };
    L54:
        return 0;
    L55:
        return 14;
    L57:
        return 8;
    L58:
        return 20;
    L60:
        return 9;
    L61:
        return 6;
    L62:
        return 30;
    L64:
        return 17;
    L66:
        return 5;
    L67:
        if (r9 != null) goto L69;
        return 0;
    L69:
        n50 r10 = f(r9);
        if (r10 != null) goto L73;
        return 0;
    L73:
        return r10.a();
    L74:
        return 7;
    L75:
        return 8;
    L76:
        return 18;
    L6:
        if (r8.equals("audio/true-hd") == false) goto L53;
        r7 = 11;
        goto L53
    L10:
        if (r8.equals("audio/vnd.dts.hd") == false) goto L53;
        r7 = 10;
        goto L53
    L14:
        if (r8.equals("audio/opus") == false) goto L53;
        r7 = 9;
        goto L53
    L18:
        if (r8.equals("audio/mpeg") == false) goto L53;
        r7 = 8;
        goto L53
    L22:
        if (r8.equals("audio/eac3") == false) goto L53;
        r7 = 7;
        goto L53
    L26:
        if (r8.equals("audio/vnd.dts.uhd;profile=p2") == false) goto L53;
        r7 = 6;
        goto L53
    L30:
        if (r8.equals("audio/ac4") == false) goto L53;
        r7 = 5;
        goto L53
    L34:
        if (r8.equals("audio/ac3") == false) goto L53;
        r7 = 4;
        goto L53
    L38:
        if (r8.equals("audio/mp4a-latm") == false) goto L53;
        r7 = 3;
        goto L53
    L42:
        if (r8.equals("audio/vnd.dts") == false) goto L53;
        r7 = 2;
        goto L53
    L46:
        if (r8.equals("audio/vnd.dts.hd;profile=lbr") == false) goto L53;
        r7 = 1;
        goto L53
    L50:
        if (r8.equals("audio/eac3-joc") == false) goto L53;
        r7 = 0;
        goto L53
    }

    public static String d(String r2) {
        String r0 = null;
        if (r2 == null) goto L124;
        String r3 = rr2.U(r2.trim());
        if (r3.startsWith("avc1") == false) goto L8;
        return "video/avc";
    L8:
        if (r3.startsWith("avc3") == false) goto L11;
        return "video/avc";
    L11:
        if (r3.startsWith("hev1") == false) goto L13;
        return "video/hevc";
    L13:
        if (r3.startsWith("hvc1") == false) goto L16;
        return "video/hevc";
    L16:
        if (r3.startsWith("dvav") == false) goto L18;
        return "video/dolby-vision";
    L18:
        if (r3.startsWith("dva1") == false) goto L20;
        return "video/dolby-vision";
    L20:
        if (r3.startsWith("dvhe") == false) goto L22;
        return "video/dolby-vision";
    L22:
        if (r3.startsWith("dvh1") == false) goto L25;
        return "video/dolby-vision";
    L25:
        if (r3.startsWith("av01") == false) goto L29;
        return "video/av01";
    L29:
        if (r3.startsWith("vp9") == false) goto L31;
        return "video/x-vnd.on2.vp9";
    L31:
        if (r3.startsWith("vp09") == false) goto L34;
        return "video/x-vnd.on2.vp9";
    L34:
        if (r3.startsWith("vp8") == false) goto L36;
        return "video/x-vnd.on2.vp8";
    L36:
        if (r3.startsWith("vp08") == false) goto L39;
        return "video/x-vnd.on2.vp8";
    L39:
        if (r3.startsWith("mp4a") == false) goto L50;
        if (r3.startsWith("mp4a.") == false) goto L45;
        n50 r4 = f(r3);
        if (r4 == null) goto L45;
        r0 = e(r4.a);
    L45:
        if (r0 != null) goto L48;
        return "audio/mp4a-latm";
    L48:
        return r0;
    L50:
        if (r3.startsWith("mha1") == false) goto L54;
        return "audio/mha1";
    L54:
        if (r3.startsWith("mhm1") == false) goto L58;
        return "audio/mhm1";
    L58:
        if (r3.startsWith("ac-3") == false) goto L60;
        return "audio/ac3";
    L60:
        if (r3.startsWith("dac3") == false) goto L63;
        return "audio/ac3";
    L63:
        if (r3.startsWith("ec-3") == false) goto L65;
        return "audio/eac3";
    L65:
        if (r3.startsWith("dec3") == false) goto L68;
        return "audio/eac3";
    L68:
        if (r3.startsWith("ec+3") == false) goto L72;
        return "audio/eac3-joc";
    L72:
        if (r3.startsWith("ac-4") == false) goto L74;
        return "audio/ac4";
    L74:
        if (r3.startsWith("dac4") == false) goto L77;
        return "audio/ac4";
    L77:
        if (r3.startsWith("dtsc") == false) goto L81;
        return "audio/vnd.dts";
    L81:
        if (r3.startsWith("dtse") == false) goto L85;
        return "audio/vnd.dts.hd;profile=lbr";
    L85:
        if (r3.startsWith("dtsh") == false) goto L87;
        return "audio/vnd.dts.hd";
    L87:
        if (r3.startsWith("dtsl") == false) goto L90;
        return "audio/vnd.dts.hd";
    L90:
        if (r3.startsWith("dtsx") == false) goto L94;
        return "audio/vnd.dts.uhd;profile=p2";
    L94:
        if (r3.startsWith("opus") == false) goto L98;
        return "audio/opus";
    L98:
        if (r3.startsWith("vorbis") == false) goto L102;
        return "audio/vorbis";
    L102:
        if (r3.startsWith("flac") == false) goto L106;
        return "audio/flac";
    L106:
        if (r3.startsWith("stpp") == false) goto L110;
        return "application/ttml+xml";
    L110:
        if (r3.startsWith("wvtt") == false) goto L114;
        return "text/vtt";
    L114:
        if (r3.contains("cea708") == false) goto L118;
        return "application/cea-708";
    L118:
        if (r3.contains("eia608") == false) goto L120;
        return "application/cea-608";
    L120:
        if (r3.contains("cea608") == true) goto L147;
        ArrayList r5 = a;
        if (r5.size() <= 0) goto L124;
        r5.get(0).getClass();
        kf2.k();
        return null;
    L147:
        return "application/cea-608";
    L124:
        return null;
    }

    public static String e(int r1) {
        if (r1 != 32) goto L5;
        return "video/mp4v-es";
    L5:
        if (r1 != 33) goto L7;
        return "video/avc";
    L7:
        if (r1 != 35) goto L9;
        return "video/hevc";
    L9:
        if (r1 != 64) goto L11;
        return "audio/mp4a-latm";
    L11:
        if (r1 != 163) goto L13;
        return "video/wvc1";
    L13:
        if (r1 != 177) goto L15;
        return "video/x-vnd.on2.vp9";
    L15:
        if (r1 != 221) goto L17;
        return "audio/vorbis";
    L17:
        if (r1 != 165) goto L19;
        return "audio/ac3";
    L19:
        if (r1 == 166) goto L40;
        switch(r1) {
            case 96: goto L38;
            case 97: goto L38;
            case 98: goto L38;
            case 99: goto L38;
            case 100: goto L38;
            case 101: goto L38;
            case 102: goto L58;
            case 103: goto L58;
            case 104: goto L58;
            case 105: goto L36;
            case 106: goto L34;
            case 107: goto L36;
            case 108: goto L32;
            default: goto L21;
        };
    L21:
        switch(r1) {
            case 169: goto L30;
            case 170: goto L28;
            case 171: goto L28;
            case 172: goto L30;
            case 173: goto L26;
            case 174: goto L24;
            default: goto L22;
        };
    L22:
        return null;
    L24:
        return "audio/ac4";
    L26:
        return "audio/opus";
    L28:
        return "audio/vnd.dts.hd";
    L30:
        return "audio/vnd.dts";
    L32:
        return "image/jpeg";
    L34:
        return "video/mpeg";
    L36:
        return "audio/mpeg";
    L38:
        return "video/mpeg2";
    L58:
        return "audio/mp4a-latm";
    L40:
        return "audio/eac3";
    }

    public static n50 f(String r2) {
        Matcher r3 = b.matcher(r2);
        if (r3.matches() == false) goto L13;
        String r0 = r3.group(1);
        r0.getClass();
        String r4 = r3.group(2);
        int r1 = Integer.parseInt(r0, 16);     // Catch: NumberFormatException -> L15
        if (r4 == null) goto L10;
        int r5 = Integer.parseInt(r4);     // Catch: NumberFormatException -> L15
    L12:
        return new n50(r1, r5);
    L10:
        r5 = 0;
    L18:
        return null;
    L13:
        return null;
    }

    public static String g(String r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        int r1 = r3.indexOf(47);
        if (r1 != (-1)) goto L9;
        return null;
    L9:
        return r3.substring(0, r1);
    }

    public static int h(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L6;
        return -1;
    L6:
        if (i(r1) == false) goto L10;
        return 1;
    L10:
        if (l(r1) == false) goto L14;
        return 2;
    L14:
        if (k(r1) == false) goto L18;
        return 3;
    L18:
        if (j(r1) == false) goto L22;
        return 4;
    L22:
        if ("application/id3".equals(r1) == false) goto L24;
        return 5;
    L24:
        if ("application/x-emsg".equals(r1) == false) goto L26;
        return 5;
    L26:
        if ("application/x-scte35".equals(r1) == false) goto L28;
        return 5;
    L28:
        if ("application/x-icy".equals(r1) == false) goto L30;
        return 5;
    L30:
        if ("application/vnd.dvb.ait".equals(r1) == false) goto L32;
        return 5;
    L32:
        if ("application/meta".equals(r1) == false) goto L35;
        return 5;
    L35:
        if ("application/x-camera-motion".equals(r1) == false) goto L38;
        return 6;
    L38:
        ArrayList r2 = a;
        if (r2.size() > 0) goto L42;
        return -1;
    L42:
        r2.get(0).getClass();
        kf2.k();
        return 0;
    }

    public static boolean i(String r1) {
        return "audio".equals(g(r1));
    }

    public static boolean j(String r2) {
        if ("image".equals(g(r2)) == false) goto L5;
        return true;
    L5:
        if ("application/x-image-uri".equals(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean k(String r2) {
        if ("text".equals(g(r2)) == false) goto L5;
        return true;
    L5:
        if ("application/x-media3-cues".equals(r2) == false) goto L7;
        return true;
    L7:
        if ("application/cea-608".equals(r2) == false) goto L9;
        return true;
    L9:
        if ("application/cea-708".equals(r2) == false) goto L11;
        return true;
    L11:
        if ("application/x-mp4-cea-608".equals(r2) == false) goto L13;
        return true;
    L13:
        if ("application/x-subrip".equals(r2) == false) goto L15;
        return true;
    L15:
        if ("application/ttml+xml".equals(r2) == false) goto L17;
        return true;
    L17:
        if ("application/x-quicktime-tx3g".equals(r2) == false) goto L19;
        return true;
    L19:
        if ("application/x-mp4-vtt".equals(r2) == false) goto L21;
        return true;
    L21:
        if ("application/x-rawcc".equals(r2) == false) goto L23;
        return true;
    L23:
        if ("application/vobsub".equals(r2) == false) goto L25;
        return true;
    L25:
        if ("application/pgs".equals(r2) == false) goto L27;
        return true;
    L27:
        if ("application/dvbsubs".equals(r2) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public static boolean l(String r1) {
        return "video".equals(g(r1));
    }

    public static String m(String r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        String r3 = rr2.U(r2);
        r3.getClass();
        byte r1 = -1;
        switch(r3.hashCode()) {
            case -1833600100: goto L33;
            case -1007807498: goto L29;
            case -979095690: goto L25;
            case -586683234: goto L21;
            case -432836268: goto L17;
            case -432836267: goto L13;
            case 187090231: goto L9;
            default: goto L36;
        };
    L36:
        switch(r1) {
            case 0: goto L50;
            case 1: goto L48;
            case 2: goto L46;
            case 3: goto L44;
            case 4: goto L42;
            case 5: goto L40;
            case 6: goto L38;
            default: goto L37;
        };
    L37:
        return r3;
    L38:
        return "audio/mpeg";
    L40:
        return "audio/mpeg-L2";
    L42:
        return "audio/mpeg-L1";
    L44:
        return "audio/wav";
    L46:
        return "application/x-mpegURL";
    L48:
        return "audio/flac";
    L50:
        return "video/mv-hevc";
    L9:
        if (r3.equals("audio/mp3") == false) goto L36;
        r1 = 6;
        goto L36
    L13:
        if (r3.equals("audio/mpeg-l2") == false) goto L36;
        r1 = 5;
        goto L36
    L17:
        if (r3.equals("audio/mpeg-l1") == false) goto L36;
        r1 = 4;
        goto L36
    L21:
        if (r3.equals("audio/x-wav") == false) goto L36;
        r1 = 3;
        goto L36
    L25:
        if (r3.equals("application/x-mpegurl") == false) goto L36;
        r1 = 2;
        goto L36
    L29:
        if (r3.equals("audio/x-flac") == false) goto L36;
        r1 = 1;
        goto L36
    L33:
        if (r3.equals("video/x-mvhevc") == false) goto L36;
        r1 = 0;
        goto L36
    }
}
