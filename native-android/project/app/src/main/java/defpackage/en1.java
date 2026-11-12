package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 implements ce3 {
    public static final Pattern A = null;
    public static final Pattern A0 = null;
    public static final Pattern B = null;
    public static final Pattern B0 = null;
    public static final Pattern C = null;
    public static final Pattern C0 = null;
    public static final Pattern D = null;
    public static final Pattern D0 = null;
    public static final Pattern E = null;
    public static final Pattern E0 = null;
    public static final Pattern F = null;
    public static final Pattern F0 = null;
    public static final Pattern G = null;
    public static final Pattern G0 = null;
    public static final Pattern H = null;
    public static final Pattern H0 = null;
    public static final Pattern I = null;
    public static final Pattern I0 = null;
    public static final Pattern J = null;
    public static final Pattern J0 = null;
    public static final Pattern K = null;
    public static final Pattern K0 = null;
    public static final Pattern L = null;
    public static final Pattern L0 = null;
    public static final Pattern M = null;
    public static final Pattern N = null;
    public static final Pattern O = null;
    public static final Pattern P = null;
    public static final Pattern Q = null;
    public static final Pattern R = null;
    public static final Pattern S = null;
    public static final Pattern T = null;
    public static final Pattern U = null;
    public static final Pattern V = null;
    public static final Pattern W = null;
    public static final Pattern X = null;
    public static final Pattern Y = null;
    public static final Pattern Z = null;
    public static final Pattern a0 = null;
    public static final Pattern b0 = null;
    public static final Pattern c0 = null;
    public static final Pattern d0 = null;
    public static final Pattern e0 = null;
    public static final Pattern f0 = null;
    public static final Pattern g0 = null;
    public static final Pattern h0 = null;
    public static final Pattern i0 = null;
    public static final Pattern j0 = null;
    public static final Pattern k0 = null;
    public static final Pattern l0 = null;
    public static final Pattern m0 = null;
    public static final Pattern n0 = null;
    public static final Pattern o0 = null;
    public static final Pattern p = null;
    public static final Pattern p0 = null;
    public static final Pattern q = null;
    public static final Pattern q0 = null;
    public static final Pattern r = null;
    public static final Pattern r0 = null;
    public static final Pattern s = null;
    public static final Pattern s0 = null;
    public static final Pattern t = null;
    public static final Pattern t0 = null;
    public static final Pattern u = null;
    public static final Pattern u0 = null;
    public static final Pattern v = null;
    public static final Pattern v0 = null;
    public static final Pattern w = null;
    public static final Pattern w0 = null;
    public static final Pattern x = null;
    public static final Pattern x0 = null;
    public static final Pattern y = null;
    public static final Pattern y0 = null;
    public static final Pattern z = null;
    public static final Pattern z0 = null;
    public final cn1 n;
    public final ym1 o;

    static {
        p = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
        q = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
        r = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
        s = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
        t = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
        u = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
        v = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
        w = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
        x = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
        y = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
        z = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
        A = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
        B = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
        C = Pattern.compile("DURATION=([\\d\\.]+)\\b");
        D = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
        E = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
        F = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
        G = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
        H = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
        I = b("CAN-SKIP-DATERANGES");
        J = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
        K = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
        L = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
        M = b("CAN-BLOCK-RELOAD");
        N = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
        O = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
        P = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
        Q = Pattern.compile("LAST-MSN=(\\d+)\\b");
        R = Pattern.compile("LAST-PART=(\\d+)\\b");
        S = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
        T = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
        U = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
        V = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
        W = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
        X = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
        Y = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
        Z = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
        a0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
        b0 = Pattern.compile("IV=([^,.*]+)");
        c0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
        d0 = Pattern.compile("TYPE=(PART|MAP)");
        e0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
        f0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
        g0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
        h0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
        i0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
        j0 = b("AUTOSELECT");
        k0 = b("DEFAULT");
        l0 = b("FORCED");
        m0 = b("INDEPENDENT");
        n0 = b("GAP");
        o0 = b("PRECISE");
        p0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
        q0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
        r0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
        s0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
        t0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
        u0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
        v0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
        w0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
        x0 = b("END-ON-NEXT");
        y0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
        z0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
        A0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
        B0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
        C0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
        D0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
        E0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
        F0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
        G0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
        H0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
        I0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
        J0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
        K0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
        L0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");
    }

    public en1(cn1 r1, ym1 r2) {
        this.n = r1;
        this.o = r2;
    }

    public static Pattern b(String r1) {
        return Pattern.compile(r1.concat("=(NO|YES)"));
    }

    public static ow0 c(String r7, nw0[] r8) {
        nw0[] r1 = new nw0[r8.length];
        int r2 = 0;
    L4:
        if (r2 >= r8.length) goto L7;
        nw0 r3 = r8[r2];
        r1[r2] = new nw0(r3.o, r3.p, r3.q, null);
        r2 = r2 + 1;
        goto L4
    L7:
        return new ow0(r7, true, r1);
    }

    public static nw0 d(String r8, String r9, HashMap r10) {
        String r1 = j(r8, Z, "1", r10);
        boolean r2 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(r9);
        Pattern r6 = a0;
        if (r2 == false) goto L7;
        String r11 = k(r8, r6, r10);
        return new nw0(ax.d, null, "video/mp4", Base64.decode(r11.substring(r11.indexOf(44)), 0));
    L7:
        if ("com.widevine".equals(r9) == false) goto L11;
        UUID r12 = ax.d;
        String r3 = f35.a;
        return new nw0(r12, null, "hls", r8.getBytes(StandardCharsets.UTF_8));
    L11:
        if ("com.microsoft.playready".equals(r9) == true) goto L13;
    L16:
        return null;
    L13:
        if ("1".equals(r1) == false) goto L16;
        String r13 = k(r8, r6, r10);
        byte[] r14 = Base64.decode(r13.substring(r13.indexOf(44)), 0);
        UUID r15 = ax.e;
        return new nw0(r15, null, "video/mp4", te5.d(r15, null, r14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ym1 e(cn1 r131, ym1 r132, qp4 r133, String r134) {
        cn1 r1 = r131;
        ym1 r2 = r132;
        boolean r3 = r1.c;
        HashMap r4 = new HashMap();
        HashMap r5 = new HashMap();
        ArrayList r6 = new ArrayList();
        ArrayList r7 = new ArrayList();
        ArrayList r8 = new ArrayList();
        ArrayList r9 = new ArrayList();
        LinkedHashMap r10 = new LinkedHashMap();
        xm1 r11 = new xm1(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap r12 = new TreeMap();
        String r15 = "";
        boolean r23 = r3;
        String r74 = "";
        long r45 = -9223372036854775807L;
        long r24 = 0;
        long r35 = 0;
        long r40 = 0;
        long r42 = 0;
        long r57 = 0;
        long r72 = 0;
        long r75 = 0;
        long r38 = -1;
        tm1 r13 = null;
        String r14 = null;
        ow0 r26 = null;
        String r34 = null;
        ow0 r37 = null;
        int r44 = 0;
        int r47 = 1;
        boolean r48 = false;
        boolean r49 = false;
        int r50 = 0;
        vm1 r53 = null;
        int r56 = 0;
        String r60 = null;
        int r69 = 0;
        boolean r70 = false;
        int r71 = 0;
        long r19 = -9223372036854775807L;
        long r21 = -9223372036854775807L;
        long r16 = 0;
        boolean r18 = false;
    L3:
        r11 = r11;
        if (r133.j() == false) goto L671;
        String r17 = r133.l();
        r13 = r13;
        if (r17.startsWith("#EXT") == false) goto L9;
        r9.add(r17);
    L9:
        if (r17.startsWith("#EXT-X-PLAYLIST-TYPE") == true) goto L10;
        if (r17.equals("#EXT-X-I-FRAMES-ONLY") == false) goto L22;
        r11 = r11;
        r13 = r13;
        r70 = true;
        goto L3
    L22:
        if (r17.startsWith("#EXT-X-START") == true) goto L23;
        if (r17.startsWith("#EXT-X-SERVER-CONTROL") == false) goto L40;
        double r27 = h(r17, H, -9.223372036854776E18d);
        if (r27 != (-9.223372036854776E18d)) goto L29;
        long r88 = -9223372036854775807L;
    L30:
        boolean r90 = g(r17, I);
        double r28 = h(r17, K, -9.223372036854776E18d);
        if (r28 != (-9.223372036854776E18d)) goto L33;
        long r91 = -9223372036854775807L;
    L34:
        double r29 = h(r17, L, -9.223372036854776E18d);
        if (r29 != (-9.223372036854776E18d)) goto L37;
        long r93 = -9223372036854775807L;
    L38:
        r13 = r13;
        r11 = new xm1(r88, r90, r91, r93, g(r17, M));
        goto L3
    L37:
        r93 = (long) (r29 * 1000000.0d);
        goto L38
    L33:
        r91 = (long) (r28 * 1000000.0d);
        goto L34
    L29:
        r88 = (long) (r27 * 1000000.0d);
        goto L30
    L40:
        if (r17.startsWith("#EXT-X-PART-INF") == true) goto L41;
        boolean r20 = r17.startsWith("#EXT-X-MAP");
        Pattern r22 = U;
        r9 = r9;
        r5 = r5;
        Pattern r25 = a0;
        if (r20 == false) goto L62;
        String r210 = k(r17, r25, r4);
        String r30 = j(r17, r22, null, r4);
        if (r30 == null) goto L49;
        String r31 = f35.a;
        String[] r32 = r30.split("@", -1);
        r38 = Long.parseLong(r32[r69]);
        if (r32.length <= 1) goto L49;
        r24 = Long.parseLong(r32[1]);
    L49:
        long r33 = r38;
        if (r33 != (-1)) goto L52;
        long r211 = 0;
    L53:
        if (r60 == null) goto L58;
        if (r34 != null) goto L58;
        throw ParserException.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
    L58:
        vm1 r212 = new vm1(r210, r211, r33, r60, r34);
        String r89 = r34;
        if (r33 == (-1)) goto L61;
        r211 = r211 + r33;
    L61:
        r24 = r211;
        r53 = r212;
        r38 = -1;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r89;
        goto L3
    L52:
        r211 = r24;
        goto L53
    L62:
        LinkedHashMap r92 = r10;
        String r810 = r34;
        if (r17.startsWith("#EXT-X-TARGETDURATION") == true) goto L64;
        if (r17.startsWith("#EXT-X-MEDIA-SEQUENCE") == true) goto L69;
        if (r17.startsWith("#EXT-X-VERSION") == true) goto L72;
        if (r17.startsWith("#EXT-X-DEFINE") == true) goto L75;
        if (r17.startsWith("#EXTINF") == true) goto L84;
        if (r17.startsWith("#EXT-X-SKIP") == true) goto L87;
        if (r17.startsWith("#EXT-X-KEY") == true) goto L121;
        if (r17.startsWith("#EXT-X-BYTERANGE") == true) goto L147;
        if (r17.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE") == false) goto L155;
        r50 = Integer.parseInt(r17.substring(r17.indexOf(58) + 1));
        r1 = r131;
        r2 = r132;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r49 = true;
        goto L3
    L155:
        if (r17.equals("#EXT-X-DISCONTINUITY") == true) goto L156;
        if (r17.startsWith("#EXT-X-PROGRAM-DATE-TIME") == true) goto L160;
        if (r17.equals("#EXT-X-GAP") == false) goto L166;
        r1 = r131;
        r2 = r132;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r71 = 1;
        goto L3
    L166:
        if (r17.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L169;
        r1 = r131;
        r2 = r132;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r23 = true;
        goto L3
    L169:
        if (r17.equals("#EXT-X-ENDLIST") == false) goto L172;
        r1 = r131;
        r2 = r132;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r48 = true;
        goto L3
    L172:
        if (r17.startsWith("#EXT-X-RENDITION-REPORT") == true) goto L173;
        if (r17.startsWith("#EXT-X-PRELOAD-HINT") == true) goto L180;
        if (r17.startsWith("#EXT-X-PART") == false) goto L247;
        if (r60 != null) goto L215;
        String r61 = null;
    L218:
        String r52 = k(r17, r25, r4);
        long r36 = (long) (Double.parseDouble(k(r17, C, Collections.EMPTY_MAP)) * 1000000.0d);
        boolean r39 = g(r17, m0);
        if (r23 == true) goto L221;
    L223:
        boolean r110 = false;
    L224:
        boolean r67 = r39 | r110;
        boolean r66 = g(r17, n0);
        String r41 = j(r17, r22, null, r4);
        if (r41 == null) goto L230;
        String r43 = f35.a;
        String[] r46 = r41.split("@", -1);
        long r111 = Long.parseLong(r46[0]);
        if (r46.length <= 1) goto L229;
        r75 = Long.parseLong(r46[1]);
    L229:
        long r64 = r111;
    L232:
        if (r64 != (-1)) goto L234;
        long r62 = 0;
    L235:
        if (r37 == null) goto L237;
    L242:
        ow0 r59 = r37;
    L243:
        tm1 r51 = new tm1(r52, r53, r36, r56, r57, r59, r60, r61, r62, r64, r66, r67, false);
        vm1 r112 = r53;
        int r54 = r56;
        r7.add(r51);
        r57 = r57 + r36;
        if (r64 == (-1)) goto L246;
        r62 = r62 + r64;
    L246:
        r75 = r62;
        r2 = r132;
        r56 = r54;
        r53 = r112;
        r37 = r59;
        r11 = r11;
        r13 = r13;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r69 = 0;
        r1 = r131;
        goto L3
    L237:
        if (r12.isEmpty() == true) goto L242;
        nw0[] r55 = (nw0[]) r12.values().toArray(new nw0[0]);
        ow0 r58 = new ow0(r14, true, r55);
        if (r26 != null) goto L241;
        r26 = c(r14, r55);
    L241:
        r59 = r58;
        goto L243
    L234:
        r62 = r75;
        goto L235
    L230:
        r64 = -1;
        goto L232
    L221:
        if (r7.isEmpty() == false) goto L223;
        r110 = true;
        goto L224
    L215:
        if (r810 == null) goto L217;
        r61 = r810;
        goto L218
    L217:
        r61 = Long.toHexString(r40);
        goto L218
    L247:
        vm1 r113 = r53;
        int r63 = r56;
        if (r17.startsWith("#EXT-X-DATERANGE") == true) goto L250;
    L636:
        int r310 = r63;
        ArrayList r130 = r6;
        r7 = r7;
        ArrayList r115 = r8;
        TreeMap r116 = r12;
        String r117 = r14;
        vm1 r68 = r113;
        String r610 = r15;
        LinkedHashMap r65 = r92;
        if (r17.startsWith("#") == false) goto L638;
    L635:
        int r311 = r310;
        r7 = r7;
        String r114 = r117;
        ArrayList r73 = r130;
        int r118 = 0;
    L670:
        r1 = r131;
        r2 = r132;
        r10 = r65;
        r69 = r118;
        r14 = r114;
        r74 = r74;
        r72 = r72;
        r35 = r35;
        r24 = r24;
        r53 = r68;
        r15 = r610;
        r9 = r9;
        r34 = r810;
        r8 = r115;
        r12 = r116;
        r6 = r73;
        r56 = r311;
    L17:
        r13 = r13;
        goto L3
    L638:
        if (r60 != null) goto L640;
        String r312 = null;
    L643:
        long r76 = r40 + 1;
        String r77 = l(r4, r17);
        r5 = r5;
        vm1 r78 = (vm1) r5.get(r77);
        if (r38 != (-1)) goto L646;
        vm1 r510 = r78;
        r24 = 0;
    L651:
        if (r37 == null) goto L653;
    L659:
        String r119 = r117;
        int r120 = 0;
    L658:
        ow0 r79 = r26;
    L661:
        if (r68 == null) goto L664;
        vm1 r213 = r68;
    L663:
        long r313 = r35;
        ow0 r314 = r37;
        long r315 = r24;
        long r214 = r72;
        String r316 = r312;
        String r317 = r60;
        r60 = r317;
        r130.add(new vm1(r77, r213, r74, r214, r310, r313, r314, r317, r316, r315, r38, r71, r7));
        r57 = r313 + r214;
        ArrayList r80 = new ArrayList();
        if (r38 == (-1)) goto L668;
        r24 = r315 + r38;
    L669:
        r40 = r76;
        r10 = r65;
        r26 = r79;
        r7 = r80;
        r69 = r120;
        r71 = r69;
        r14 = r119;
        r56 = r310;
        r37 = r314;
        r35 = r57;
        r53 = r68;
        r15 = r610;
        r74 = r15;
        r72 = 0;
        r38 = -1;
        r9 = r9;
        r34 = r810;
        r8 = r115;
        r12 = r116;
        r1 = r131;
        r2 = r132;
        r6 = r130;
        goto L17
    L668:
        r24 = r315;
        goto L669
    L664:
        r213 = r510;
        goto L663
    L653:
        if (r116.isEmpty() == true) goto L659;
        r120 = 0;
        nw0[] r81 = (nw0[]) r116.values().toArray(new nw0[0]);
        r119 = r117;
        ow0 r82 = new ow0(r119, true, r81);
        if (r26 != null) goto L657;
        r79 = c(r119, r81);
        r37 = r82;
        goto L661
    L657:
        r37 = r82;
        goto L658
    L646:
        if (r70 == false) goto L650;
        if (r68 != null) goto L650;
        if (r78 != null) goto L650;
        vm1 r511 = new vm1(r77, 0, r24, null, null);
        r5.put(r77, r511);
        r510 = r511;
    L650:
        r510 = r78;
        r24 = r24;
        goto L651
    L640:
        if (r810 == null) goto L642;
        r312 = r810;
        goto L643
    L642:
        r312 = Long.toHexString(r40);
        goto L643
    L250:
        if (j(r17, s0, r15, r4).equals("com.apple.hls.interstitial") == false) goto L636;
        String r83 = k(r17, r0, r4);
        String r84 = j(r17, y0, null, r4);
        if (r84 == null) goto L254;
        Uri r85 = Uri.parse(r84);
    L255:
        String r86 = j(r17, z0, null, r4);
        if (r86 == null) goto L258;
        Uri r87 = Uri.parse(r86);
    L259:
        String r121 = j(r17, t0, null, r4);
        if (r121 == null) goto L262;
        long r512 = f35.Q(f35.T(r121));
    L263:
        String r122 = j(r17, v0, null, r4);
        if (r122 == null) goto L266;
        long r611 = f35.Q(f35.T(r122));
    L267:
        ArrayList r123 = new ArrayList();
        r310 = r63;
        String r94 = j(r17, u0, null, r4);
        if (r94 == null) goto L292;
        String r318 = f35.a;
        String[] r95 = r94.split(",", -1);
        int r96 = r95.length;
        int r97 = 0;
    L270:
        if (r97 >= r96) goto L292;
        int r513 = r97;
        String r98 = r95[r97].trim();
        r98.getClass();
        switch(r98.hashCode()) {
            case 79491: goto L283;
            case 2430593: goto L279;
            case 2461856: goto L275;
            default: goto L273;
        };
    L273:
        int r514 = r96;
    L274:
        byte r99 = -1;
    L287:
        switch(r99) {
            case 0: goto L289;
            case 1: goto L289;
            case 2: goto L289;
            default: goto L290;
        };
    L289:
        r123.add(r98);
    L290:
        r97 = r513 + 1;
        r96 = r514;
        goto L270
    L275:
        r514 = r96;
        if (r98.equals("POST") == false) goto L274;
        r99 = 2;
        goto L287
    L279:
        r514 = r96;
        if (r98.equals("ONCE") == false) goto L274;
        r99 = 1;
        goto L287
    L283:
        r514 = r96;
        if (r98.equals("PRE") == false) goto L274;
        r99 = 0;
    L292:
        r68 = r113;
        String r100 = r15;
        double r515 = h(r17, D, -1.0d);
        if (r515 < 0.0d) goto L295;
        long r910 = (long) (r515 * 1000000.0d);
    L296:
        double r516 = h(r17, w0, -1.0d);
        if (r516 < 0.0d) goto L299;
        long r101 = (long) (r516 * 1000000.0d);
    L300:
        boolean r102 = g(r17, x0);
        r610 = r100;
        ArrayList r124 = r8;
        double r517 = h(r17, A0, Double.MIN_VALUE);
        if (r517 == Double.MIN_VALUE) goto L303;
        long r107 = (long) (r517 * 1000000.0d);
    L304:
        ArrayList r103 = r124;
        double r518 = h(r17, B0, -1.0d);
        if (r518 < 0.0d) goto L307;
        long r1110 = (long) (r518 * 1000000.0d);
    L308:
        ArrayList r104 = new ArrayList();
        String r125 = j(r17, C0, null, r4);
        if (r125 == null) goto L319;
        String r126 = f35.a;
        String[] r127 = r125.split(",", -1);
        int r128 = r127.length;
        int r105 = 0;
    L311:
        if (r105 >= r128) goto L319;
        int r519 = r105;
        String r106 = r127[r105].trim();
        r106.getClass();
        ArrayList r1111 = r103;
        if (r106.equals("IN") == false) goto L315;
    L317:
        r104.add(r106);
    L318:
        r105 = r519 + 1;
        r103 = r1111;
        goto L311
    L315:
        if (r106.equals("OUT") == true) goto L317;
    L319:
        r115 = r103;
        ArrayList r108 = new ArrayList();
        String r109 = j(r17, D0, null, r4);
        if (r109 == null) goto L332;
        String r129 = f35.a;
        String[] r135 = r109.split(",", -1);
        int r136 = r135.length;
        int r137 = 0;
    L324:
        if (r137 >= r136) goto L332;
        String r138 = r135[r137].trim();
        r138.getClass();
        String[] r520 = r135;
        if (r138.equals("JUMP") == false) goto L328;
    L330:
        r108.add(r138);
    L331:
        r137 = r137 + 1;
        r135 = r520;
        goto L324
    L328:
        if (r138.equals("SKIP") == true) goto L330;
    L332:
        String r139 = j(r17, E0, null, r4);
        if (r139 == null) goto L335;
        Boolean r140 = Boolean.valueOf(!r139.equals("NO"));
    L336:
        String r141 = j(r17, F0, null, r4);
        if (r141 == null) goto L344;
        String r142 = "RANGE";
        if (r141.equals("RANGE") == true) goto L345;
        r142 = "POINT";
        if (r141.equals(r142) == false) goto L344;
    L345:
        String r143 = j(r17, G0, null, r4);
        if (r143 == null) goto L353;
        String r144 = "PRIMARY";
        if (r143.equals("PRIMARY") == true) goto L354;
        r144 = "HIGHLIGHT";
        if (r143.equals(r144) == false) goto L353;
    L354:
        r116 = r12;
        r117 = r14;
        double r319 = h(r17, H0, -1.0d);
        if (r319 < 0.0d) goto L357;
        long r1210 = (long) (r319 * 1000000.0d);
    L358:
        double r145 = h(r17, I0, -1.0d);
        if (r145 < 0.0d) goto L361;
        long r1211 = (long) (r145 * 1000000.0d);
    L362:
        String r146 = j(r17, J0, null, r4);
        ArrayList r147 = new ArrayList();
        String r148 = r17.substring(17);
        Matcher r149 = L0.matcher(r148);
    L364:
        if (r149.find() == false) goto L435;
        String r150 = r149.group();
        r150.getClass();
        switch(r150.hashCode()) {
            case -2136701954: goto L413;
            case -1843050726: goto L409;
            case -148960310: goto L405;
            case -36345757: goto L401;
            case 397239341: goto L397;
            case 850193465: goto L393;
            case 1065650400: goto L389;
            case 1274498945: goto L385;
            case 1472528844: goto L381;
            case 1748487807: goto L377;
            case 1814205923: goto L373;
            case 2080546752: goto L369;
            default: goto L367;
        };
    L367:
        Matcher r215 = r149;
    L368:
        byte r151 = -1;
    L417:
        switch(r151) {
            case 0: goto L433;
            case 1: goto L433;
            case 2: goto L433;
            case 3: goto L433;
            case 4: goto L433;
            case 5: goto L433;
            case 6: goto L433;
            case 7: goto L433;
            case 8: goto L433;
            case 9: goto L433;
            case 10: goto L433;
            case 11: goto L433;
            default: goto L418;
        };
    L418:
        String r152 = r150.substring(0, r150.length() - 1);
        String r153 = r152.concat("=");
        int r154 = r153.length() + r148.indexOf(r153);
        if (r148.length() != (r154 + 1)) goto L421;
        int r155 = 1;
    L422:
        String r156 = r148.substring(r154, r155 + r154);
        if (r156.startsWith("\"") == false) goto L426;
        qm1 r157 = new qm1(0, r152, k(r148, Pattern.compile(r152.concat("=\"((?:.|\f)+?)\"")), r4));
    L432:
        r147.add(r157);
    L434:
        r142 = r142;
        r149 = r215;
        r146 = r146;
        r144 = r144;
        r6 = r6;
        goto L364
    L426:
        if (r156.equals("0x") == true) goto L431;
        if (r156.equals("0X") == true) goto L431;
        r157 = new qm1(r152, Double.parseDouble(k(r148, Pattern.compile(r152.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP)));
    L431:
        r157 = new qm1(1, r152, k(r148, Pattern.compile(r152.concat("=(0[xX][A-F0-9]+)")), r4));
        goto L432
    L421:
        r155 = 2;
        goto L422
    L433:
        r142 = r142;
        r144 = r144;
        goto L434
    L369:
        r215 = r149;
        if (r150.equals("X-SKIP-CONTROL-LABEL-ID=") == false) goto L368;
        r151 = 11;
        goto L417
    L373:
        r215 = r149;
        if (r150.equals("X-ASSET-URI=") == false) goto L368;
        r151 = 10;
        goto L417
    L377:
        r215 = r149;
        if (r150.equals("X-RESUME-OFFSET=") == false) goto L368;
        r151 = 9;
        goto L417
    L381:
        r215 = r149;
        if (r150.equals("X-RESTRICT=") == false) goto L368;
        r151 = 8;
        goto L417
    L385:
        r215 = r149;
        if (r150.equals("X-SKIP-CONTROL-OFFSET=") == false) goto L368;
        r151 = 7;
        goto L417
    L389:
        r215 = r149;
        if (r150.equals("X-SKIP-CONTROL-DURATION=") == false) goto L368;
        r151 = 6;
        goto L417
    L393:
        r215 = r149;
        if (r150.equals("X-TIMELINE-OCCUPIES=") == false) goto L368;
        r151 = 5;
        goto L417
    L397:
        r215 = r149;
        if (r150.equals("X-ASSET-LIST=") == false) goto L368;
        r151 = 4;
        goto L417
    L401:
        r215 = r149;
        if (r150.equals("X-TIMELINE-STYLE=") == false) goto L368;
        r151 = 3;
        goto L417
    L405:
        r215 = r149;
        if (r150.equals("X-PLAYOUT-LIMIT=") == false) goto L368;
        r151 = 2;
        goto L417
    L409:
        r215 = r149;
        if (r150.equals("X-CONTENT-MAY-VARY=") == false) goto L368;
        r151 = 1;
        goto L417
    L413:
        r215 = r149;
        if (r150.equals("X-SNAP=") == false) goto L368;
        r151 = 0;
        goto L417
    L435:
        r130 = r6;
        String r320 = r146;
        String r158 = r142;
        String r321 = r144;
        r65 = r92;
        if (r65.containsKey(r83) == false) goto L438;
        rm1 r159 = (rm1) r65.get(r83);
    L439:
        if (r85 != null) goto L441;
        r159.getClass();
    L445:
        if (r87 == null) goto L452;
        Uri r160 = r159.d;
        if (r160 == null) goto L450;
        rr2.p(r160.equals(r87), "Can't change assetListUri from %s to %s", r159.d, r87);
    L450:
        r159.d = r87;
    L452:
        if (r512 == (-9223372036854775807L)) goto L463;
        long r161 = r159.e;
        if (r161 != (-9223372036854775807L)) goto L457;
    L461:
        r159.e = r512;
        goto L463
    L457:
        if (r161 != r512) goto L459;
        boolean r521 = true;
    L460:
        rr2.n(r521, "Can't change startDateUnixUs from %s to %s", r161, r512);
        goto L461
    L459:
        r521 = false;
    L463:
        if (r611 == (-9223372036854775807L)) goto L474;
        long r162 = r159.f;
        if (r162 != (-9223372036854775807L)) goto L468;
    L472:
        r159.f = r611;
        goto L474
    L468:
        if (r162 != r611) goto L470;
        boolean r612 = true;
    L471:
        rr2.n(r612, "Can't change endDateUnixUs from %s to %s", r162, r611);
        goto L472
    L470:
        r612 = false;
    L474:
        if (r910 == (-9223372036854775807L)) goto L485;
        long r163 = r159.g;
        if (r163 != (-9223372036854775807L)) goto L479;
    L483:
        r159.g = r910;
        goto L485
    L479:
        if (r163 != r910) goto L481;
        boolean r911 = true;
    L482:
        rr2.n(r911, "Can't change durationUs from %s to %s", r163, r910);
        goto L483
    L481:
        r911 = false;
    L485:
        if (r101 == (-9223372036854775807L)) goto L496;
        long r164 = r159.h;
        if (r164 != (-9223372036854775807L)) goto L490;
    L494:
        r159.h = r101;
        goto L496
    L490:
        if (r164 != r101) goto L492;
        boolean r912 = true;
    L493:
        rr2.n(r912, "Can't change plannedDurationUs from %s to %s", r164, r101);
        goto L494
    L492:
        r912 = false;
    L496:
        if (r123.isEmpty() == false) goto L499;
        r158 = r158;
    L515:
        if (r102 == false) goto L519;
        r159.j = true;
    L519:
        if (r107 == (-9223372036854775807L)) goto L530;
        long r165 = r159.k;
        if (r165 != (-9223372036854775807L)) goto L524;
    L528:
        r159.k = r107;
        goto L530
    L524:
        if (r165 != r107) goto L526;
        boolean r1010 = true;
    L527:
        rr2.n(r1010, "Can't change resumeOffsetUs from %s to %s", r165, r107);
        goto L528
    L526:
        r1010 = false;
    L530:
        if (r1110 == (-9223372036854775807L)) goto L541;
        long r166 = r159.l;
        if (r166 != (-9223372036854775807L)) goto L535;
    L539:
        r159.l = r1110;
        goto L541
    L535:
        if (r166 != r1110) goto L537;
        boolean r1011 = true;
    L538:
        rr2.n(r1011, "Can't change playoutLimitUs from %s to %s", r166, r1110);
        goto L539
    L537:
        r1011 = false;
    L541:
        if (r104.isEmpty() == true) goto L558;
        if (r159.m.isEmpty() == true) goto L556;
        boolean r167 = r159.m.equals(r104);
        StringBuilder r168 = new StringBuilder("Can't change snapTypes from ");
        ArrayList r169 = r159.m;
        StringBuilder r170 = new StringBuilder();
        Iterator r171 = r169.iterator();
        if (r171.hasNext() == false) goto L550;
    L547:
        r170.append((CharSequence) r171.next());
        if (r171.hasNext() == false) goto L550;
        r170.append(", ");
    L550:
        r168.append(r170.toString());
        r168.append(" to ");
        StringBuilder r172 = new StringBuilder();
        Iterator r173 = r104.iterator();
        if (r173.hasNext() == false) goto L555;
    L552:
        r172.append((CharSequence) r173.next());
        if (r173.hasNext() == false) goto L555;
        r172.append(", ");
    L555:
        r168.append(r172.toString());
        rr2.k(r168.toString(), r167);
    L556:
        r159.m = r104;
    L558:
        if (r108.isEmpty() == false) goto L561;
    L574:
        HashMap r174 = r159.b;
        if (r147.isEmpty() == true) goto L588;
        int r175 = 0;
    L579:
        if (r175 >= r147.size()) goto L588;
        qm1 r176 = (qm1) r147.get(r175);
        String r177 = r176.a;
        qm1 r178 = (qm1) r174.get(r177);
        if (r178 == null) goto L587;
        boolean r179 = r178.equals(r176);
        Object[] r180 = {r177, r178.d, Double.valueOf(r178.c), r176.d, Double.valueOf(r176.c)};
        if (r179 == true) goto L587;
        kf2.n(gh0.s("Can't change %s from %s %s to %s %s", r180));
        return null;
    L587:
        r174.put(r177, r176);
        r175 = r175 + 1;
    L588:
        if (r140 == null) goto L594;
        Boolean r181 = r159.o;
        if (r181 == null) goto L593;
        rr2.p(r181.equals(r140), "Can't change contentMayVary from %s to %s", r159.o, r140);
    L593:
        r159.o = r140;
    L594:
        if (r158 == null) goto L600;
        String r182 = r159.p;
        String r183 = r158;
        if (r182 == null) goto L599;
        rr2.p(r182.equals(r183), "Can't change timelineOccupies from %s to %s", r159.p, r183);
    L599:
        r159.p = r183;
    L600:
        if (r321 == null) goto L607;
        String r184 = r159.q;
        if (r184 == null) goto L605;
        rr2.p(r184.equals(r321), "Can't change timelineStyle from %s to %s", r159.q, r321);
    L605:
        r159.q = r321;
    L607:
        if (r1210 == (-9223372036854775807L)) goto L618;
        long r185 = r159.r;
        if (r185 != (-9223372036854775807L)) goto L612;
    L616:
        r159.r = r1210;
        goto L618
    L612:
        if (r185 != r1210) goto L614;
        boolean r1112 = true;
    L615:
        rr2.n(r1112, "Can't change skipControlOffsetUs from %s to %s", r185, r1210);
        goto L616
    L614:
        r1112 = false;
    L618:
        if (r1211 == (-9223372036854775807L)) goto L628;
        long r186 = r159.s;
        if (r186 != (-9223372036854775807L)) goto L623;
    L627:
        r159.s = r1211;
        goto L628
    L623:
        if (r186 != r1211) goto L625;
        boolean r1212 = true;
    L626:
        rr2.n(r1212, "Can't change skipControlDurationUs from %s to %s", r186, r1211);
        goto L627
    L625:
        r1212 = false;
    L628:
        if (r320 == null) goto L634;
        String r187 = r159.t;
        if (r187 == null) goto L633;
        rr2.p(r187.equals(r320), "Can't change skipControlLabelId from %s to %s", r159.t, r320);
    L633:
        r159.t = r320;
    L634:
        r65.put(r83, r159);
        goto L635
    L561:
        if (r159.n.isEmpty() == true) goto L573;
        boolean r188 = r159.n.equals(r108);
        StringBuilder r189 = new StringBuilder("Can't change restrictions from ");
        ArrayList r190 = r159.n;
        StringBuilder r191 = new StringBuilder();
        Iterator r192 = r190.iterator();
        if (r192.hasNext() == false) goto L567;
    L564:
        r191.append((CharSequence) r192.next());
        if (r192.hasNext() == false) goto L567;
        r191.append(", ");
    L567:
        r189.append(r191.toString());
        r189.append(" to ");
        StringBuilder r193 = new StringBuilder();
        Iterator r194 = r108.iterator();
        if (r194.hasNext() == false) goto L572;
    L569:
        r193.append((CharSequence) r194.next());
        if (r194.hasNext() == false) goto L572;
        r193.append(", ");
    L572:
        r189.append(r193.toString());
        rr2.k(r189.toString(), r188);
    L573:
        r159.n = r108;
        goto L574
    L499:
        if (r159.i.isEmpty() == true) goto L513;
        boolean r195 = r159.i.equals(r123);
        StringBuilder r196 = new StringBuilder("Can't change cue from ");
        ArrayList r197 = r159.i;
        StringBuilder r198 = new StringBuilder();
        Iterator r199 = r197.iterator();
        if (r199.hasNext() == false) goto L507;
        Object r1100 = r199.next();
    L503:
        r198.append((CharSequence) r1100);
        if (r199.hasNext() == false) goto L507;
        r198.append(", ");
        r1100 = r199.next();
    L507:
        r196.append(r198.toString());
        r196.append(" to ");
        StringBuilder r1101 = new StringBuilder();
        Iterator r1102 = r123.iterator();
        if (r1102.hasNext() == false) goto L512;
    L509:
        r1101.append((CharSequence) r1102.next());
        if (r1102.hasNext() == false) goto L512;
        r1101.append(", ");
    L512:
        r196.append(r1101.toString());
        rr2.k(r196.toString(), r195);
    L514:
        r159.i = r123;
        goto L515
    L513:
        r158 = r158;
        goto L514
    L441:
        Uri r200 = r159.c;
        if (r200 == null) goto L444;
        rr2.p(r200.equals(r85), "Can't change assetUri from %s to %s", r159.c, r85);
    L444:
        r159.c = r85;
        goto L445
    L438:
        r159 = new rm1(r83);
        goto L439
    L361:
        r1211 = -9223372036854775807L;
        goto L362
    L357:
        r1210 = -9223372036854775807L;
    L353:
        r144 = null;
    L344:
        r142 = null;
        goto L345
    L335:
        r140 = null;
        goto L336
    L307:
        r1110 = -9223372036854775807L;
        goto L308
    L303:
        r107 = -9223372036854775807L;
        goto L304
    L299:
        r101 = -9223372036854775807L;
        goto L300
    L295:
        r910 = -9223372036854775807L;
        goto L296
    L266:
        r611 = -9223372036854775807L;
        goto L267
    L262:
        r512 = -9223372036854775807L;
        goto L263
    L258:
        r87 = null;
        goto L259
    L254:
        r85 = null;
        goto L255
    L180:
        if (r13 != null) goto L81;
        if ("PART".equals(k(r17, d0, r4)) == false) goto L81;
        String r522 = k(r17, r25, r4);
        long r201 = i(r17, V);
        long r613 = i(r17, W);
        if (r60 != null) goto L188;
        String r614 = null;
    L191:
        if (r37 == null) goto L193;
    L198:
        ow0 r523 = r37;
    L200:
        if (r201 == (-1)) goto L206;
        if (r613 != (-1)) goto L206;
        r13 = r13;
    L210:
        r1 = r131;
        r2 = r132;
        r37 = r523;
        r11 = r11;
        r9 = r9;
        r5 = r5;
        r34 = r810;
        r10 = r92;
        r69 = 0;
    L206:
        if (r201 == (-1)) goto L208;
        long r615 = r201;
    L209:
        r13 = new tm1(r522, r53, 0, r56, r57, r523, r60, r614, r615, r613, false, false, true);
        goto L210
    L208:
        r615 = 0;
        goto L209
    L193:
        if (r12.isEmpty() == true) goto L198;
        nw0[] r202 = (nw0[]) r12.values().toArray(new nw0[r69]);
        ow0 r203 = new ow0(r14, true, r202);
        if (r26 != null) goto L197;
        r26 = c(r14, r202);
    L197:
        r523 = r203;
        goto L200
    L188:
        if (r810 == null) goto L190;
        r614 = r810;
        goto L191
    L190:
        r614 = Long.toHexString(r40);
    L81:
        r73 = r6;
        r115 = r8;
        r116 = r12;
        r114 = r14;
        r610 = r15;
        r68 = r53;
        r311 = r56;
        r118 = r69;
        r65 = r92;
        goto L670
    L173:
        long r204 = i(r17, Q);
        Matcher r205 = R.matcher(r17);
        if (r205.find() == false) goto L176;
        String r206 = r205.group(1);
        r206.getClass();
        int r207 = Integer.parseInt(r206);
    L177:
        r8.add(new um1(Uri.parse(jz4.G(r134, k(r17, r25, r4))), r204, r207));
        goto L81
    L176:
        r207 = -1;
        goto L177
    L160:
        if (r42 != 0) goto L81;
        r42 = f35.Q(f35.T(r17.substring(r17.indexOf(58) + 1))) - r35;
    L150:
        r1 = r131;
        r2 = r132;
    L65:
        r34 = r810;
    L66:
        r10 = r92;
        goto L3
    L156:
        r56 = r56 + 1;
        goto L150
    L147:
        String r208 = k(r17, T, r4);
        String r209 = f35.a;
        String[] r216 = r208.split("@", -1);
        r38 = Long.parseLong(r216[r69]);
        if (r216.length <= 1) goto L150;
        r24 = Long.parseLong(r216[1]);
        goto L150
    L121:
        String r217 = k(r17, X, r4);
        String r218 = j(r17, Y, "identity", r4);
        if ("NONE".equals(r217) == false) goto L126;
        r12.clear();
        r34 = null;
    L124:
        r37 = null;
    L125:
        r60 = null;
    L144:
        r1 = r131;
        r2 = r132;
        goto L66
    L126:
        String r219 = j(r17, b0, null, r4);
        if ("identity".equals(r218) == true) goto L129;
        if (r14 == null) goto L134;
    L141:
        nw0 r220 = d(r17, r218, r4);
        if (r220 != null) goto L143;
    L131:
        r34 = r219;
        goto L125
    L143:
        r12.put(r218, r220);
        r34 = r219;
        goto L124
    L134:
        if ("SAMPLE-AES-CENC".equals(r217) == false) goto L136;
    L140:
        String r221 = "cenc";
    L139:
        r14 = r221;
        goto L141
    L136:
        if ("SAMPLE-AES-CTR".equals(r217) == true) goto L140;
        r221 = "cbcs";
        goto L139
    L129:
        if ("AES-128".equals(r217) == false) goto L131;
        r60 = k(r17, r25, r4);
        r34 = r219;
        goto L144
    L87:
        int r222 = Integer.parseInt(k(r17, J, Collections.EMPTY_MAP));
        if (r2 != null) goto L90;
    L92:
        boolean r223 = r69;
    L93:
        rr2.w(r223);
        String r224 = f35.a;
        long r225 = r2.k;
        yw1 r226 = r2.r;
        int r227 = (int) (r16 - r225);
        int r228 = r222 + r227;
        if (r227 < 0) goto L118;
        if (r228 > r226.size()) goto L118;
        long r229 = r57;
        r34 = r810;
        long r524 = r35;
    L98:
        if (r227 >= r228) goto L116;
        vm1 r230 = (vm1) r226.get(r227);
        if (r16 == r2.k) goto L106;
        int r913 = (r2.j - r50) + r230.q;
        yw1 r1103 = r230.z;
        ArrayList r1104 = new ArrayList();
        long r914 = r524;
        int r1105 = r69;
    L103:
        if (r1105 >= r1103.size()) goto L105;
        tm1 r231 = (tm1) r1103.get(r1105);
        r1104.add(new tm1(r231.n, r231.o, r231.p, r913, r914, r231.s, r231.t, r231.u, r231.v, r231.w, r231.x, r231.y, r231.z));
        r914 = r914 + r231.p;
        r1105 = r1105 + 1;
        r228 = r228;
        goto L103
    L105:
        int r232 = r228;
        r230 = new vm1(r230.n, r230.o, r230.y, r230.p, r913, r524, r230.s, r230.t, r230.u, r230.v, r230.w, r230.x, r1104);
    L107:
        r6.add(r230);
        long r233 = r230.p;
        String r234 = r230.u;
        long r235 = r524 + r233;
        long r1106 = r230.w;
        if (r1106 == (-1)) goto L110;
        r24 = r230.v + r1106;
    L110:
        int r236 = r230.q;
        vm1 r237 = r230.o;
        ow0 r1107 = r230.s;
        String r238 = r230.t;
        if (r234 != null) goto L113;
    L114:
        r34 = r234;
    L115:
        r40 = r40 + 1;
        r227 = r227 + 1;
        r56 = r236;
        r53 = r237;
        r60 = r238;
        r37 = r1107;
        r228 = r232;
        r229 = r235;
        r524 = r229;
        r2 = r132;
        goto L98
    L113:
        if (r234.equals(Long.toHexString(r40)) == true) goto L115;
    L106:
        r232 = r228;
        goto L107
    L116:
        r1 = r131;
        r2 = r132;
        r35 = r524;
        r57 = r229;
    L118:
        throw new HlsPlaylistParser$DeltaUpdateException();
    L90:
        if (r6.isEmpty() == false) goto L92;
        r223 = 1;
        goto L93
    L84:
        r72 = new BigDecimal(k(r17, O, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000)).longValue();
        r74 = j(r17, P, r15, r4);
        goto L65
    L75:
        String r239 = j(r17, q0, null, r4);
        if (r239 == null) goto L80;
        String r240 = (String) r1.j.get(r239);
        if (r240 == null) goto L81;
        r4.put(r239, r240);
        goto L81
    L80:
        r4.put(k(r17, f0, r4), k(r17, p0, r4));
        goto L81
    L72:
        r47 = Integer.parseInt(k(r17, F, Collections.EMPTY_MAP));
        goto L65
    L69:
        r40 = Long.parseLong(k(r17, N, Collections.EMPTY_MAP));
        r16 = r40;
        goto L65
    L64:
        r19 = ((long) Integer.parseInt(k(r17, B, Collections.EMPTY_MAP))) * 1000000;
        goto L65
    L41:
        r21 = (long) (Double.parseDouble(k(r17, E, Collections.EMPTY_MAP)) * 1000000.0d);
        goto L17
    L23:
        long r1108 = (long) (Double.parseDouble(k(r17, S, Collections.EMPTY_MAP)) * 1000000.0d);
        r18 = g(r17, o0);
        r45 = r1108;
        goto L17
    L10:
        String r241 = k(r17, G, r4);
        if ("VOD".equals(r241) == false) goto L14;
        r44 = 1;
        goto L17
    L14:
        if ("EVENT".equals(r241) == false) goto L17;
        r44 = 2;
        goto L17
    L671:
        tm1 r811 = r13;
        ArrayList r242 = r6;
        ArrayList r1113 = r8;
        ArrayList r812 = r9;
        LinkedHashMap r243 = r10;
        HashMap r244 = new HashMap();
        int r245 = r69;
    L673:
        if (r245 >= r1113.size()) goto L689;
        ArrayList r246 = r1113;
        um1 r247 = (um1) r246.get(r245);
        long r248 = r247.b;
        if (r248 != (-1)) goto L677;
        r248 = (r16 + ((long) r242.size())) - (r7.isEmpty() ? 1 : 0);
    L677:
        int r249 = r247.c;
        if (r249 != (-1)) goto L687;
        if (r21 == (-9223372036854775807L)) goto L687;
        if (r7.isEmpty() == false) goto L684;
        List r250 = ((vm1) te5.w(r242)).z;
    L685:
        r249 = r250.size() - 1;
        goto L687
    L684:
        r250 = r7;
    L687:
        Uri r251 = r247.a;
        r244.put(r251, new um1(r251, r248, r249));
        r245 = r245 + 1;
        r1113 = r246;
        goto L673
    L689:
        if (r811 == null) goto L691;
        r7.add(r811);
    L691:
        ArrayList r252 = new ArrayList();
        Iterator r253 = r243.values().iterator();
    L693:
        if (r253.hasNext() == false) goto L723;
        rm1 r254 = (rm1) r253.next();
        Uri r255 = r254.d;
        if (r255 == null) goto L697;
    L698:
        if (r255 != null) goto L700;
    L719:
        sm1 r256 = null;
    L720:
        if (r256 == null) goto L722;
        r252.add(r256);
    L722:
        r253 = r253;
        r244 = r244;
        r242 = r242;
        goto L693
    L700:
        if (r254.c != null) goto L719;
    L701:
        long r257 = r254.e;
        if (r257 == (-9223372036854775807L)) goto L719;
        String r258 = r254.a;
        Uri r1109 = r254.c;
        long r1114 = r254.f;
        long r259 = r254.g;
        long r260 = r254.h;
        ArrayList r1115 = r254.i;
        boolean r261 = r254.j;
        long r262 = r254.k;
        long r263 = r254.l;
        ArrayList r264 = r254.m;
        ArrayList r265 = r254.n;
        ArrayList r266 = new ArrayList(r254.b.values());
        Boolean r267 = r254.o;
        if (r267 != null) goto L706;
    L709:
        boolean r1012 = true;
    L710:
        String r268 = r254.p;
        if (r268 == null) goto L713;
        String r1116 = r268;
    L714:
        String r269 = r254.q;
        if (r269 == null) goto L717;
        String r1117 = r269;
    L718:
        r256 = new sm1(r258, r1109, r255, r257, r1114, r259, r260, r1115, r261, r262, r263, r264, r265, r266, r1012, r1116, r1117, r254.r, r254.s, r254.t);
        goto L720
    L717:
        r1117 = "HIGHLIGHT";
        goto L718
    L713:
        r1116 = "POINT";
        goto L714
    L706:
        if (r267.booleanValue() == true) goto L709;
        r1012 = false;
        goto L710
    L697:
        if (r254.c != null) goto L701;
    L723:
        HashMap r322 = r244;
        ArrayList r1310 = r242;
        if (r42 != 0) goto L729;
        if (r132 == null) goto L729;
        if (r132.p == false) goto L729;
        long r1118 = r132.h;
    L731:
        if (r1118 == 0) goto L734;
        boolean r270 = true;
    L736:
        return new ym1(r44, r134, r812, r45, r18, r1118, r49, r50, r16, r47, r19, r21, r23, r48, r270, r26, r1310, r7, r11, r322, r252);
    L734:
        r270 = false;
    L729:
        r1118 = r42;
        goto L731
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    public static cn1 f(qp4 r43, String r44) {
        String r1 = r44;
        HashMap r2 = new HashMap();
        HashMap r11 = new HashMap();
        ArrayList r3 = new ArrayList();
        ArrayList r4 = new ArrayList();
        ArrayList r5 = new ArrayList();
        ArrayList r6 = new ArrayList();
        ArrayList r7 = new ArrayList();
        ArrayList r8 = new ArrayList();
        ArrayList r12 = new ArrayList();
        ArrayList r9 = new ArrayList();
        boolean r10 = false;
        boolean r13 = false;
    L3:
        boolean r14 = r43.j();
        Pattern r15 = a0;
        ArrayList r17 = r7;
        boolean r18 = r10;
        Pattern r16 = f0;
        boolean r19 = r13;
        if (r14 == false) goto L148;
        String r110 = r43.l();
        if (r110.startsWith("#EXT") == false) goto L8;
        r9.add(r110);
    L8:
        boolean r111 = r110.startsWith("#EXT-X-I-FRAME-STREAM-INF");
        ArrayList r23 = r9;
        if (r110.startsWith("#EXT-X-DEFINE") == false) goto L12;
        r11.put(k(r110, r16, r11), k(r110, p0, r11));
    L33:
        r8 = r8;
    L34:
        r10 = r18;
        r13 = r19;
    L145:
        r7 = r17;
        r9 = r23;
        r12 = r12;
        r6 = r6;
        r5 = r5;
        r4 = r4;
        r8 = r8;
        goto L3
    L12:
        if (r110.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L15;
        r8 = r8;
        r4 = r4;
        r5 = r5;
        r6 = r6;
        r12 = r12;
        r10 = r18;
        r13 = true;
        goto L145
    L15:
        if (r110.startsWith("#EXT-X-MEDIA") == false) goto L18;
        r8.add(r110);
        goto L33
    L18:
        if (r110.startsWith("#EXT-X-SESSION-KEY") == false) goto L30;
        nw0 r20 = d(r110, j(r110, Y, "identity", r11), r11);
        if (r20 == null) goto L33;
        String r21 = k(r110, X, r11);
        if ("SAMPLE-AES-CENC".equals(r21) == false) goto L24;
    L27:
        String r22 = "cenc";
    L28:
        r12.add(new ow0(r22, true, new nw0[]{r20}));
        goto L33
    L24:
        if ("SAMPLE-AES-CTR".equals(r21) == true) goto L27;
        r22 = "cbcs";
        goto L28
    L30:
        if (r110.startsWith("#EXT-X-STREAM-INF") == true) goto L35;
        if (r111 == false) goto L33;
    L35:
        boolean r112 = r18 | r110.contains("CLOSED-CAPTIONS=NONE");
        if (r111 == false) goto L39;
        int r24 = 16384;
    L38:
        r18 = r112;
        int r113 = Integer.parseInt(k(r110, u, Collections.EMPTY_MAP));
        Matcher r114 = p.matcher(r110);
        if (r114.find() == false) goto L43;
        String r115 = r114.group(1);
        r115.getClass();
        int r116 = Integer.parseInt(r115);
    L44:
        String r117 = j(r110, w, null, r11);
        String r25 = j(r110, x, null, r11);
        String r26 = j(r110, y, null, r11);
        if (r26 == null) goto L51;
        String r27 = f35.a;
        String[] r28 = r26.split(",", 2)[0].split("/", -1);
        String r29 = r28[0];
        if (r28.length <= 1) goto L49;
        String r30 = r28[1];
        r8 = r8;
        int r31 = 2;
    L52:
        String r32 = f35.v(r31, r25);
        ArrayList r33 = lw2.a;
        if (r32 != null) goto L56;
        String r210 = r25;
    L123:
        String r34 = r210;
    L124:
        String r35 = j(r110, z, null, r11);
        if (r35 == null) goto L129;
        String[] r36 = r35.split("x", -1);
        int r37 = Integer.parseInt(r36[0]);
        int r38 = Integer.parseInt(r36[1]);
        if (r37 <= 0) goto L129;
        if (r38 <= 0) goto L129;
    L130:
        String r39 = j(r110, A, null, r11);
        if (r39 == null) goto L133;
        float r40 = Float.parseFloat(r39);
    L134:
        String r211 = j(r110, q, null, r11);
        String r212 = j(r110, r, null, r11);
        String r310 = j(r110, s, null, r11);
        String r311 = j(r110, t, null, r11);
        if (r111 == false) goto L139;
        Uri r41 = jz4.H(r1, k(r110, r15, r11));
    L137:
        Uri r312 = r41;
        sb1 r42 = new sb1();
        r42.a = Integer.toString(r3.size());
        r42.l = lw2.m("application/x-mpegURL");
        r42.j = r34;
        r42.h = r116;
        r42.i = r113;
        r42.t = r37;
        r42.u = r38;
        r42.x = r40;
        r42.f = r24;
        r3.add(new bn1(r312, new tb1(r42), r211, r212, r310, r311));
        ArrayList r45 = (ArrayList) r2.get(r312);
        if (r45 != null) goto L144;
        r45 = new ArrayList();
        r2.put(r312, r45);
    L144:
        r45.add(new mn1(r116, r113, r211, r212, r310, r311));
        goto L34
    L139:
        if (r43.j() == false) goto L147;
        r41 = jz4.H(r1, l(r11, r43.l()));
        goto L137
    L147:
        throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
    L133:
        r40 = -1.0f;
    L129:
        r38 = -1;
        r37 = -1;
        goto L130
    L56:
        if (r32.startsWith("dvhe") == true) goto L83;
        r210 = r25;
        if (r32.startsWith("dvh1") == true) goto L84;
        if (r29 == null) goto L123;
        if (r29.startsWith("dvhe") == false) goto L67;
        if (r32.startsWith("hev1") == true) goto L84;
    L67:
        if (r29.startsWith("dvh1") == false) goto L71;
        if (r32.startsWith("hvc1") == true) goto L84;
    L71:
        if (r29.startsWith("dvav") == false) goto L75;
        if (r32.startsWith("avc3") == true) goto L84;
    L75:
        if (r29.startsWith("dva1") == false) goto L79;
        if (r32.startsWith("avc1") == true) goto L84;
    L79:
        if (r29.startsWith("dav1") == false) goto L123;
        if (r32.startsWith("av01") == false) goto L123;
    L84:
        if (r29 == null) goto L102;
        if (r117 == null) goto L123;
        if (r30 == null) goto L123;
        if (r117.equals("PQ") == false) goto L94;
        if (r30.equals("db1p") == false) goto L123;
    L94:
        if (r117.equals("SDR") == false) goto L98;
        if (r30.equals("db2g") == false) goto L123;
    L98:
        if (r117.equals("HLG") == false) goto L102;
        if (r30.startsWith("db4") == false) goto L123;
    L102:
        if (r29 != null) goto L105;
        r29 = r32;
    L105:
        String[] r46 = f35.e0(r210);
        if (r46.length != 0) goto L108;
    L107:
        String r47 = null;
    L120:
        if (r47 == null) goto L122;
        r34 = b11.o(r29, ",", r47);
        goto L124
    L122:
        r34 = r29;
        goto L124
    L108:
        StringBuilder r48 = new StringBuilder();
        int r49 = r46.length;
        int r50 = 0;
    L109:
        if (r50 >= r49) goto L118;
        String r118 = r46[r50];
        String[] r213 = r46;
        int r214 = r49;
        if (2 == lw2.h(lw2.d(r118))) goto L116;
        if (r48.length() <= 0) goto L115;
        r48.append(",");
    L115:
        r48.append(r118);
    L116:
        r50 = r50 + 1;
        r49 = r214;
        r46 = r213;
        goto L109
    L118:
        if (r48.length() <= 0) goto L107;
        r47 = r48.toString();
        goto L120
    L83:
        r210 = r25;
        goto L84
    L49:
        r31 = 2;
    L50:
        r30 = null;
        goto L52
    L51:
        r31 = 2;
        r29 = null;
        goto L50
    L43:
        r116 = -1;
        goto L44
    L39:
        r24 = 0;
        goto L38
    L148:
        ArrayList r313 = r8;
        ArrayList r314 = r4;
        ArrayList r315 = r5;
        ArrayList r316 = r6;
        ArrayList r215 = r9;
        ArrayList r216 = r12;
        ArrayList r51 = new ArrayList();
        HashSet r52 = new HashSet();
        int r53 = 0;
        HashMap r54 = r2;
    L150:
        if (r53 >= r3.size()) goto L160;
        bn1 r55 = (bn1) r3.get(r53);
        Uri r56 = r55.a;
        tb1 r119 = r55.b;
        if (r52.add(r56) == false) goto L159;
        if (r119.l != null) goto L156;
        boolean r57 = true;
    L157:
        rr2.w(r57);
        ArrayList r120 = (ArrayList) r54.get(r55.a);
        r120.getClass();
        qv2 r121 = new qv2(new pv2[]{new nn1(null, null, r120)});
        sb1 r58 = r119.a();
        r58.k = r121;
        r51.add(new bn1(r55.a, new tb1(r58), r55.c, r55.d, r55.e, r55.f));
        goto L159
    L156:
        r57 = false;
    L159:
        r53 = r53 + 1;
        r54 = r54;
        goto L150
    L160:
        int r59 = 0;
        List r60 = null;
        tb1 r61 = null;
    L162:
        if (r59 >= r313.size()) goto L276;
        ArrayList r62 = r313;
        String r63 = (String) r62.get(r59);
        String r122 = k(r63, g0, r11);
        String r123 = k(r63, r16, r11);
        sb1 r124 = new sb1();
        int r217 = r59;
        r124.a = b11.o(r122, ":", r123);
        r124.b = r123;
        r124.l = lw2.m("application/x-mpegURL");
        boolean r410 = g(r63, k0);
        ?? r411 = r410;
        if (g(r63, l0) == false) goto L167;
        r411 = (r410 ? 1 : 0) | 2;
    L167:
        if (g(r63, j0) == false) goto L169;
        ?? r64 = r411 | 4;
    L170:
        r124.e = r64;
        ArrayList r412 = r51;
        String r65 = j(r63, h0, null, r11);
        if (TextUtils.isEmpty(r65) == false) goto L173;
        r313 = r62;
        int r66 = 0;
    L187:
        r124.f = r66;
        r124.d = j(r63, e0, null, r11);
        String r67 = j(r63, r15, null, r11);
        if (r67 != null) goto L190;
        Uri r68 = null;
    L191:
        qv2 r69 = new qv2(new pv2[]{new nn1(r122, r123, Collections.EMPTY_LIST)});
        String r70 = k(r63, c0, r11);
        switch(r70.hashCode()) {
            case -959297733: goto L207;
            case -333210994: goto L203;
            case 62628790: goto L199;
            case 81665115: goto L195;
            default: goto L193;
        };
    L193:
        byte r71 = -1;
    L210:
        switch(r71) {
            case 0: goto L258;
            case 1: goto L250;
            case 2: goto L225;
            case 3: goto L212;
            default: goto L249;
        };
    L212:
        int r72 = 0;
    L214:
        if (r72 >= r3.size()) goto L219;
        bn1 r73 = (bn1) r3.get(r72);
        if (r122.equals(r73.c) == true) goto L220;
        r72 = r72 + 1;
    L220:
        if (r73 == null) goto L222;
        tb1 r74 = r73.b;
        String r75 = f35.v(2, r74.k);
        r124.j = r75;
        r124.m = lw2.m(lw2.d(r75));
        r124.t = r74.u;
        r124.u = r74.v;
        r124.x = r74.y;
    L222:
        if (r68 == null) goto L249;
        r124.k = r69;
        r314.add(new an1(r68, new tb1(r124), r123));
        goto L249
    L219:
        r73 = null;
        goto L220
    L225:
        int r76 = 0;
    L227:
        if (r76 >= r3.size()) goto L232;
        bn1 r77 = (bn1) r3.get(r76);
        int r218 = r76;
        if (r122.equals(r77.d) == true) goto L233;
        r76 = r218 + 1;
    L233:
        if (r77 == null) goto L235;
        String r78 = f35.v(1, r77.b.k);
        r124.j = r78;
        String r79 = lw2.d(r78);
    L236:
        bn1 r219 = r77;
        String r80 = j(r63, v, null, r11);
        if (r80 == null) goto L243;
        String r125 = f35.a;
        r124.E = Integer.parseInt(r80.split("/", 2)[0]);
        if ("audio/eac3".equals(r79) == false) goto L243;
        if (r80.endsWith("/JOC") == false) goto L243;
        r124.j = "ec+3";
        r79 = "audio/eac3-joc";
    L243:
        r124.m = lw2.m(r79);
        if (r68 == null) goto L246;
        r124.k = r69;
        r315.add(new an1(r68, new tb1(r124), r123));
        goto L249
    L246:
        ArrayList r81 = r315;
        if (r219 == null) goto L257;
        r315 = r81;
        r61 = new tb1(r124);
    L257:
        r315 = r81;
        goto L249
    L235:
        r79 = null;
        goto L236
    L232:
        r77 = null;
        goto L233
    L250:
        r81 = r315;
        String r82 = k(r63, i0, r11);
        if (r82.startsWith("CC") == false) goto L253;
        int r83 = Integer.parseInt(r82.substring(2));
        String r84 = "application/cea-608";
    L254:
        if (r60 != null) goto L256;
        r60 = new ArrayList();
    L256:
        r124.m = lw2.m(r84);
        r124.J = r83;
        r60.add(new tb1(r124));
        goto L257
    L253:
        r83 = Integer.parseInt(r82.substring(7));
        r84 = "application/cea-708";
        goto L254
    L258:
        int r85 = 0;
    L260:
        if (r85 >= r3.size()) goto L265;
        bn1 r86 = (bn1) r3.get(r85);
        if (r122.equals(r86.e) == true) goto L266;
        r85 = r85 + 1;
    L266:
        if (r86 == null) goto L268;
        String r87 = f35.v(3, r86.b.k);
        r124.j = r87;
        String r88 = lw2.d(r87);
    L269:
        if (r88 != null) goto L271;
        r88 = "text/vtt";
    L271:
        r124.m = lw2.m(r88);
        r124.k = r69;
        if (r68 == null) goto L274;
        an1 r89 = new an1(r68, new tb1(r124), r123);
        ArrayList r90 = r316;
        r90.add(r89);
    L275:
        r51 = r412;
        r316 = r90;
        r59 = r217 + 1;
        r1 = r44;
        goto L162
    L274:
        r90 = r316;
        l93.q0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
        goto L275
    L268:
        r88 = null;
        goto L269
    L265:
        r86 = null;
    L249:
        r90 = r316;
        goto L275
    L195:
        if (r70.equals("VIDEO") == false) goto L193;
        r71 = 3;
        goto L210
    L199:
        if (r70.equals("AUDIO") == false) goto L193;
        r71 = 2;
        goto L210
    L203:
        if (r70.equals("CLOSED-CAPTIONS") == false) goto L193;
        r71 = 1;
        goto L210
    L207:
        if (r70.equals("SUBTITLES") == false) goto L193;
        r71 = 0;
        goto L210
    L190:
        r68 = jz4.H(r1, r67);
        goto L191
    L173:
        String r91 = f35.a;
        String[] r92 = r65.split(",", -1);
        if (f35.m(r92, "public.accessibility.describes-video") == false) goto L177;
        r66 = 512;
    L176:
        r313 = r62;
        if (f35.m(r92, "public.accessibility.transcribes-spoken-dialog") == false) goto L182;
        r66 = r66 | 4096;
    L182:
        if (f35.m(r92, "public.accessibility.describes-music-and-sound") == false) goto L185;
        r66 = r66 | 1024;
    L185:
        if (f35.m(r92, "public.easy-to-read") == false) goto L187;
        r66 = r66 | 8192;
        goto L187
    L177:
        r66 = 0;
        goto L176
    L169:
        r64 = r411;
        goto L170
    L276:
        ArrayList r413 = r51;
        ArrayList r93 = r316;
        if (r18 == false) goto L280;
        r60 = Collections.EMPTY_LIST;
    L280:
        return new cn1(r44, r215, r413, r314, r315, r93, r17, r61, r60, r19, r11, r216);
    }

    public static boolean g(String r1, Pattern r2) {
        Matcher r3 = r2.matcher(r1);
        if (r3.find() == true) goto L5;
        return false;
    L5:
        return "YES".equals(r3.group(1));
    }

    public static double h(String r1, Pattern r2, double r3) {
        Matcher r4 = r2.matcher(r1);
        if (r4.find() == false) goto L6;
        String r5 = r4.group(1);
        r5.getClass();
        return Double.parseDouble(r5);
    L6:
        return r3;
    }

    public static long i(String r1, Pattern r2) {
        Matcher r3 = r2.matcher(r1);
        if (r3.find() == false) goto L6;
        String r4 = r3.group(1);
        r4.getClass();
        return Long.parseLong(r4);
    L6:
        return -1;
    }

    public static String j(String r1, Pattern r2, String r3, Map r4) {
        Matcher r5 = r2.matcher(r1);
        if (r5.find() == false) goto L6;
        r3 = r5.group(1);
        r3.getClass();
    L6:
        if (r4.isEmpty() == true) goto L11;
        if (r3 == null) goto L11;
        return l(r4, r3);
    L11:
        return r3;
    }

    public static String k(String r1, Pattern r2, Map r3) {
        String r4 = j(r1, r2, null, r3);
        if (r4 == null) goto L6;
        return r4;
    L6:
        throw ParserException.b("Couldn't match " + r2.pattern() + " in " + r1);
    }

    public static String l(Map r3, String r4) {
        Matcher r5 = K0.matcher(r4);
        StringBuffer r1 = new StringBuffer();
    L4:
        if (r5.find() == false) goto L8;
        String r2 = r5.group(1);
        if (r3.containsKey(r2) == false) goto L4;
        r5.appendReplacement(r1, Matcher.quoteReplacement((String) r3.get(r2)));
        goto L4
    L8:
        r5.appendTail(r1);
        return r1.toString();
    }

    @Override // defpackage.ce3
    public final dn1 a(Uri r7, gi0 r8) {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(r8));
        ArrayDeque r9 = new ArrayDeque();
        int r2 = r1.read();     // Catch: Throwable -> L41
        boolean r3 = false;
        if (r2 != 239) goto L12;
        if (r1.read() == 187) goto L8;
    L30:
        if (r3 == false) goto L67;
    L31:
        String r4 = r1.readLine();     // Catch: Throwable -> L41
        if (r4 == null) goto L64;
        String r5 = r4.trim();     // Catch: Throwable -> L41
        if (r5.isEmpty() == true) goto L31;
        if (r5.startsWith("#EXT-X-STREAM-INF") == true) goto L38;
        if (r5.startsWith("#EXT-X-TARGETDURATION") == true) goto L61;
        if (r5.startsWith("#EXT-X-MEDIA-SEQUENCE") == true) goto L61;
        if (r5.startsWith("#EXTINF") == true) goto L61;
        if (r5.startsWith("#EXT-X-KEY") == true) goto L61;
        if (r5.startsWith("#EXT-X-BYTERANGE") == true) goto L61;
        if (r5.equals("#EXT-X-DISCONTINUITY") == true) goto L61;
        if (r5.equals("#EXT-X-DISCONTINUITY-SEQUENCE") == true) goto L61;
        if (r5.equals("#EXT-X-ENDLIST") == true) goto L61;
        r9.add(r5);     // Catch: Throwable -> L41
    L61:
        r9.add(r5);     // Catch: Throwable -> L41
        ym1 r6 = e(this.n, this.o, new qp4(r9, r1), r7.toString());     // Catch: Throwable -> L41
        f35.h(r1);
        return r6;
    L38:
        r9.add(r5);     // Catch: Throwable -> L41
        cn1 r10 = f(new qp4(r9, r1), r7.toString());     // Catch: Throwable -> L41
        f35.h(r1);
        return r10;
    L64:
        f35.h(r1);
        throw ParserException.b("Failed to parse the playlist, could not identify any tags.");
    L67:
        throw ParserException.b("Input does not start with the #EXTM3U header.");     // Catch: Throwable -> L41
    L8:
        if (r1.read() != 191) goto L30;
        r2 = r1.read();     // Catch: Throwable -> L41
    L12:
        if (r2 == (-1)) goto L16;
        if (Character.isWhitespace(r2) == false) goto L16;
        r2 = r1.read();     // Catch: Throwable -> L41
    L16:
        int r11 = 0;
    L18:
        if (r11 >= 7) goto L23;
        if (r2 != "#EXTM3U".charAt(r11)) goto L30;
        r2 = r1.read();     // Catch: Throwable -> L41
        r11 = r11 + 1;     // Catch: Throwable -> L41
    L23:
        if (r2 == (-1)) goto L29;
        if (Character.isWhitespace(r2) == false) goto L29;
        if (f35.N(r2) == true) goto L29;
        r2 = r1.read();     // Catch: Throwable -> L41
    L29:
        r3 = f35.N(r2);     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        f35.h(r1);
        throw th;
    }

    public en1() {
        this(cn1.l, null);
    }
}
