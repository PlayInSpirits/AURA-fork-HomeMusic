package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 implements ce3 {
    public final cn1 n;
    public final ym1 o;
    public static final Pattern p = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern q = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern r = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern s = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern t = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern u = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern v = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern w = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern x = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern y = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern z = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern A = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern B = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern C = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern E = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern H = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern I = b("CAN-SKIP-DATERANGES");
    public static final Pattern J = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M = b("CAN-BLOCK-RELOAD");
    public static final Pattern N = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern Q = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern R = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern U = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern V = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern W = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Y = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern a0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern b0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern c0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern d0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern e0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern j0 = b("AUTOSELECT");
    public static final Pattern k0 = b("DEFAULT");
    public static final Pattern l0 = b("FORCED");
    public static final Pattern m0 = b("INDEPENDENT");
    public static final Pattern n0 = b("GAP");
    public static final Pattern o0 = b("PRECISE");
    public static final Pattern p0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern x0 = b("END-ON-NEXT");
    public static final Pattern y0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern z0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern A0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern B0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern C0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern I0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern J0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern L0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public en1(cn1 cn1Var, ym1 ym1Var) {
        this.n = cn1Var;
        this.o = ym1Var;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static ow0 c(String str, nw0[] nw0VarArr) {
        nw0[] nw0VarArr2 = new nw0[nw0VarArr.length];
        for (int i = 0; i < nw0VarArr.length; i++) {
            nw0 nw0Var = nw0VarArr[i];
            nw0VarArr2[i] = new nw0(nw0Var.o, nw0Var.p, nw0Var.q, null);
        }
        return new ow0(str, true, nw0VarArr2);
    }

    public static nw0 d(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, Z, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = a0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new nw0(ax.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = ax.d;
            String str3 = f35.a;
            return new nw0(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = ax.e;
        return new nw0(uuid2, null, "video/mp4", te5.d(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:274:0x07a5 A[PHI: r51
  0x07a5: PHI (r51v18 int) = (r51v14 int), (r51v15 int), (r51v16 int), (r51v19 int) binds: [B:284:0x07ca, B:280:0x07bd, B:276:0x07af, B:273:0x07a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:353:0x0910  */
    /* JADX WARN: Code duplicated, block: B:368:0x096b A[PHI: r29
  0x096b: PHI (r29v17 java.util.regex.Matcher) = 
  (r29v4 java.util.regex.Matcher)
  (r29v5 java.util.regex.Matcher)
  (r29v6 java.util.regex.Matcher)
  (r29v7 java.util.regex.Matcher)
  (r29v8 java.util.regex.Matcher)
  (r29v9 java.util.regex.Matcher)
  (r29v10 java.util.regex.Matcher)
  (r29v11 java.util.regex.Matcher)
  (r29v12 java.util.regex.Matcher)
  (r29v13 java.util.regex.Matcher)
  (r29v14 java.util.regex.Matcher)
  (r29v15 java.util.regex.Matcher)
  (r29v18 java.util.regex.Matcher)
 binds: [B:414:0x0a14, B:410:0x0a07, B:406:0x09f9, B:402:0x09ec, B:398:0x09df, B:394:0x09d2, B:390:0x09c5, B:386:0x09b6, B:382:0x09a6, B:378:0x0996, B:374:0x0986, B:370:0x0976, B:367:0x0969] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:662:0x0ef4  */
    /* JADX WARN: Code duplicated, block: B:664:0x0f0d  */
    /* JADX WARN: Code duplicated, block: B:667:0x0f25  */
    /* JADX WARN: Code duplicated, block: B:668:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:719:0x108f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ym1 e(cn1 cn1Var, ym1 ym1Var, qp4 qp4Var, String str) throws IOException {
        sm1 sm1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        String str2;
        String str3;
        vm1 vm1Var;
        int i;
        int i2;
        LinkedHashMap linkedHashMap;
        int i3;
        int i4;
        ow0 ow0Var;
        int i5;
        ArrayList arrayList3;
        String str4;
        vm1 vm1Var2;
        String str5;
        int i6;
        ow0 ow0VarC;
        vm1 vm1Var3;
        long j;
        String str6;
        String str7;
        Matcher matcher;
        byte b;
        int i7;
        byte b2;
        long j2;
        ow0 ow0Var2;
        cn1 cn1Var2 = cn1Var;
        ym1 ym1Var2 = ym1Var;
        boolean z2 = cn1Var2.c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        xm1 xm1Var = new xm1(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str8 = "";
        boolean z3 = z2;
        String strJ = "";
        long j3 = -9223372036854775807L;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long jQ = 0;
        long j7 = 0;
        long jLongValue = 0;
        long j8 = 0;
        long j9 = -1;
        tm1 tm1Var = null;
        String str9 = null;
        ow0 ow0VarC2 = null;
        String str10 = null;
        ow0 ow0Var3 = null;
        int i8 = 0;
        int i9 = 1;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        vm1 vm1Var4 = null;
        int i11 = 0;
        String strK = null;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = 0;
        boolean zG = false;
        while (true) {
            xm1Var = xm1Var;
            if (!qp4Var.j()) {
                tm1 tm1Var2 = tm1Var;
                ArrayList arrayList8 = arrayList4;
                ArrayList arrayList9 = arrayList6;
                ArrayList arrayList10 = arrayList7;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                HashMap map3 = new HashMap();
                int i14 = i12;
                while (i14 < arrayList9.size()) {
                    ArrayList arrayList11 = arrayList9;
                    um1 um1Var = (um1) arrayList11.get(i14);
                    long size = um1Var.b;
                    if (size == -1) {
                        size = (j12 + ((long) arrayList8.size())) - (arrayList5.isEmpty() ? 1L : 0L);
                    }
                    int size2 = um1Var.c;
                    if (size2 == -1 && j11 != -9223372036854775807L) {
                        size2 = (arrayList5.isEmpty() ? ((vm1) te5.w(arrayList8)).z : arrayList5).size() - 1;
                    }
                    Uri uri = um1Var.a;
                    map3.put(uri, new um1(uri, size, size2));
                    i14++;
                    arrayList9 = arrayList11;
                }
                if (tm1Var2 != null) {
                    arrayList5.add(tm1Var2);
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it = linkedHashMap3.values().iterator();
                while (it.hasNext()) {
                    rm1 rm1Var = (rm1) it.next();
                    Uri uri2 = rm1Var.d;
                    if ((uri2 != null || rm1Var.c == null) && (uri2 == null || rm1Var.c != null)) {
                        sm1Var = null;
                    } else {
                        long j13 = rm1Var.e;
                        if (j13 != -9223372036854775807L) {
                            String str11 = rm1Var.a;
                            Uri uri3 = rm1Var.c;
                            long j14 = rm1Var.f;
                            long j15 = rm1Var.g;
                            long j16 = rm1Var.h;
                            ArrayList arrayList13 = rm1Var.i;
                            boolean z7 = rm1Var.j;
                            long j17 = rm1Var.k;
                            long j18 = rm1Var.l;
                            ArrayList arrayList14 = rm1Var.m;
                            ArrayList arrayList15 = rm1Var.n;
                            ArrayList arrayList16 = new ArrayList(rm1Var.b.values());
                            Boolean bool = rm1Var.o;
                            boolean z8 = bool == null || bool.booleanValue();
                            String str12 = rm1Var.p;
                            String str13 = str12 != null ? str12 : "POINT";
                            String str14 = rm1Var.q;
                            sm1Var = new sm1(str11, uri3, uri2, j13, j14, j15, j16, arrayList13, z7, j17, j18, arrayList14, arrayList15, arrayList16, z8, str13, str14 != null ? str14 : "HIGHLIGHT", rm1Var.r, rm1Var.s, rm1Var.t);
                        } else {
                            sm1Var = null;
                        }
                    }
                    if (sm1Var != null) {
                        arrayList12.add(sm1Var);
                    }
                    it = it;
                    map3 = map3;
                    arrayList8 = arrayList8;
                }
                HashMap map4 = map3;
                ArrayList arrayList17 = arrayList8;
                long j19 = (jQ == 0 && ym1Var != null && ym1Var.p) ? ym1Var.h : jQ;
                return new ym1(i8, str, arrayList10, j3, zG, j19, z5, i10, j12, i9, j10, j11, z3, z4, j19 != 0, ow0VarC2, arrayList17, arrayList5, xm1Var, map4, arrayList12);
            }
            String strL = qp4Var.l();
            tm1Var = tm1Var;
            if (strL.startsWith("#EXT")) {
                arrayList7.add(strL);
            }
            if (strL.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strL, G, map);
                if ("VOD".equals(strK2)) {
                    i8 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i8 = 2;
                }
            } else if (strL.equals("#EXT-X-I-FRAMES-ONLY")) {
                xm1Var = xm1Var;
                tm1Var = tm1Var;
                z6 = true;
            } else if (strL.startsWith("#EXT-X-START")) {
                long j20 = (long) (Double.parseDouble(k(strL, S, Collections.EMPTY_MAP)) * 1000000.0d);
                zG = g(strL, o0);
                j3 = j20;
            } else if (strL.startsWith("#EXT-X-SERVER-CONTROL")) {
                double dH = h(strL, H, -9.223372036854776E18d);
                long j21 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                boolean zG2 = g(strL, I);
                double dH2 = h(strL, K, -9.223372036854776E18d);
                long j22 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                double dH3 = h(strL, L, -9.223372036854776E18d);
                tm1Var = tm1Var;
                xm1Var = new xm1(j21, zG2, j22, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), g(strL, M));
            } else if (strL.startsWith("#EXT-X-PART-INF")) {
                j11 = (long) (Double.parseDouble(k(strL, E, Collections.EMPTY_MAP)) * 1000000.0d);
            } else {
                boolean zStartsWith = strL.startsWith("#EXT-X-MAP");
                Pattern pattern = U;
                arrayList7 = arrayList7;
                map2 = map2;
                Pattern pattern2 = a0;
                if (zStartsWith) {
                    String strK3 = k(strL, pattern2, map);
                    String strJ2 = j(strL, pattern, null, map);
                    if (strJ2 != null) {
                        String str15 = f35.a;
                        String[] strArrSplit = strJ2.split("@", -1);
                        j9 = Long.parseLong(strArrSplit[i12]);
                        if (strArrSplit.length > 1) {
                            j4 = Long.parseLong(strArrSplit[1]);
                        }
                    }
                    long j23 = j9;
                    long j24 = j23 == -1 ? 0L : j4;
                    if (strK != null && str10 == null) {
                        throw ParserException.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                    vm1 vm1Var5 = new vm1(strK3, j24, j23, strK, str10);
                    String str16 = str10;
                    if (j23 != -1) {
                        j24 += j23;
                    }
                    j4 = j24;
                    vm1Var4 = vm1Var5;
                    j9 = -1;
                    xm1Var = xm1Var;
                    tm1Var = tm1Var;
                    arrayList7 = arrayList7;
                    map2 = map2;
                    str10 = str16;
                } else {
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String str17 = str10;
                    if (strL.startsWith("#EXT-X-TARGETDURATION")) {
                        j10 = ((long) Integer.parseInt(k(strL, B, Collections.EMPTY_MAP))) * 1000000;
                    } else if (strL.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j6 = Long.parseLong(k(strL, N, Collections.EMPTY_MAP));
                        j12 = j6;
                    } else if (strL.startsWith("#EXT-X-VERSION")) {
                        i9 = Integer.parseInt(k(strL, F, Collections.EMPTY_MAP));
                    } else {
                        if (strL.startsWith("#EXT-X-DEFINE")) {
                            String strJ3 = j(strL, q0, null, map);
                            if (strJ3 != null) {
                                String str18 = (String) cn1Var2.j.get(strJ3);
                                if (str18 != null) {
                                    map.put(strJ3, str18);
                                }
                            } else {
                                map.put(k(strL, f0, map), k(strL, p0, map));
                            }
                        } else if (strL.startsWith("#EXTINF")) {
                            jLongValue = new BigDecimal(k(strL, O, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                            strJ = j(strL, P, str8, map);
                        } else {
                            if (strL.startsWith("#EXT-X-SKIP")) {
                                int i15 = Integer.parseInt(k(strL, J, Collections.EMPTY_MAP));
                                rr2.w((ym1Var2 == null || !arrayList4.isEmpty()) ? i12 : 1);
                                String str19 = f35.a;
                                long j25 = ym1Var2.k;
                                yw1 yw1Var = ym1Var2.r;
                                int i16 = (int) (j12 - j25);
                                int i17 = i15 + i16;
                                if (i16 < 0 || i17 > yw1Var.size()) {
                                    throw new IOException() { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                    };
                                }
                                long j26 = j7;
                                str10 = str17;
                                long j27 = j5;
                                while (i16 < i17) {
                                    vm1 vm1Var6 = (vm1) yw1Var.get(i16);
                                    if (j12 != ym1Var2.k) {
                                        int i18 = (ym1Var2.j - i10) + vm1Var6.q;
                                        yw1 yw1Var2 = vm1Var6.z;
                                        ArrayList arrayList18 = new ArrayList();
                                        long j28 = j27;
                                        int i19 = i12;
                                        while (i19 < yw1Var2.size()) {
                                            tm1 tm1Var3 = (tm1) yw1Var2.get(i19);
                                            arrayList18.add(new tm1(tm1Var3.n, tm1Var3.o, tm1Var3.p, i18, j28, tm1Var3.s, tm1Var3.t, tm1Var3.u, tm1Var3.v, tm1Var3.w, tm1Var3.x, tm1Var3.y, tm1Var3.z));
                                            j28 += tm1Var3.p;
                                            i19++;
                                            i17 = i17;
                                        }
                                        i3 = i17;
                                        vm1Var6 = new vm1(vm1Var6.n, vm1Var6.o, vm1Var6.y, vm1Var6.p, i18, j27, vm1Var6.s, vm1Var6.t, vm1Var6.u, vm1Var6.v, vm1Var6.w, vm1Var6.x, arrayList18);
                                    } else {
                                        i3 = i17;
                                    }
                                    arrayList4.add(vm1Var6);
                                    long j29 = vm1Var6.p;
                                    String str20 = vm1Var6.u;
                                    long j30 = j27 + j29;
                                    long j31 = vm1Var6.w;
                                    if (j31 != -1) {
                                        j4 = vm1Var6.v + j31;
                                    }
                                    int i20 = vm1Var6.q;
                                    vm1 vm1Var7 = vm1Var6.o;
                                    ow0 ow0Var4 = vm1Var6.s;
                                    String str21 = vm1Var6.t;
                                    if (str20 == null || !str20.equals(Long.toHexString(j6))) {
                                        str10 = str20;
                                    }
                                    j6++;
                                    i16++;
                                    i11 = i20;
                                    vm1Var4 = vm1Var7;
                                    strK = str21;
                                    ow0Var3 = ow0Var4;
                                    i17 = i3;
                                    j26 = j30;
                                    j27 = j26;
                                    ym1Var2 = ym1Var;
                                }
                                cn1Var2 = cn1Var;
                                ym1Var2 = ym1Var;
                                j5 = j27;
                                j7 = j26;
                            } else if (strL.startsWith("#EXT-X-KEY")) {
                                String strK4 = k(strL, X, map);
                                String strJ4 = j(strL, Y, "identity", map);
                                if ("NONE".equals(strK4)) {
                                    treeMap2.clear();
                                    str10 = null;
                                } else {
                                    String strJ5 = j(strL, b0, null, map);
                                    if ("identity".equals(strJ4)) {
                                        if ("AES-128".equals(strK4)) {
                                            strK = k(strL, pattern2, map);
                                            str10 = strJ5;
                                        }
                                        cn1Var2 = cn1Var;
                                        ym1Var2 = ym1Var;
                                    } else {
                                        if (str9 == null) {
                                            str9 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                        }
                                        nw0 nw0VarD = d(strL, strJ4, map);
                                        if (nw0VarD != null) {
                                            treeMap2.put(strJ4, nw0VarD);
                                            str10 = strJ5;
                                        }
                                        strK = null;
                                        cn1Var2 = cn1Var;
                                        ym1Var2 = ym1Var;
                                    }
                                    str10 = strJ5;
                                    strK = null;
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                }
                                ow0Var3 = null;
                                strK = null;
                                cn1Var2 = cn1Var;
                                ym1Var2 = ym1Var;
                            } else {
                                if (strL.startsWith("#EXT-X-BYTERANGE")) {
                                    String strK5 = k(strL, T, map);
                                    String str22 = f35.a;
                                    String[] strArrSplit2 = strK5.split("@", -1);
                                    j9 = Long.parseLong(strArrSplit2[i12]);
                                    if (strArrSplit2.length > 1) {
                                        j4 = Long.parseLong(strArrSplit2[1]);
                                    }
                                } else if (strL.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i10 = Integer.parseInt(strL.substring(strL.indexOf(58) + 1));
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                    xm1Var = xm1Var;
                                    tm1Var = tm1Var;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str10 = str17;
                                    linkedHashMap2 = linkedHashMap4;
                                    z5 = true;
                                } else if (strL.equals("#EXT-X-DISCONTINUITY")) {
                                    i11++;
                                } else if (strL.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jQ == 0) {
                                        jQ = f35.Q(f35.T(strL.substring(strL.indexOf(58) + 1))) - j5;
                                    }
                                } else if (strL.equals("#EXT-X-GAP")) {
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                    xm1Var = xm1Var;
                                    tm1Var = tm1Var;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str10 = str17;
                                    linkedHashMap2 = linkedHashMap4;
                                    i13 = 1;
                                } else if (strL.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                    xm1Var = xm1Var;
                                    tm1Var = tm1Var;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str10 = str17;
                                    linkedHashMap2 = linkedHashMap4;
                                    z3 = true;
                                } else if (strL.equals("#EXT-X-ENDLIST")) {
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                    xm1Var = xm1Var;
                                    tm1Var = tm1Var;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str10 = str17;
                                    linkedHashMap2 = linkedHashMap4;
                                    z4 = true;
                                } else if (strL.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long jI = i(strL, Q);
                                    Matcher matcher2 = R.matcher(strL);
                                    if (matcher2.find()) {
                                        String strGroup = matcher2.group(1);
                                        strGroup.getClass();
                                        i4 = Integer.parseInt(strGroup);
                                    } else {
                                        i4 = -1;
                                    }
                                    arrayList6.add(new um1(Uri.parse(jz4.G(str, k(strL, pattern2, map))), jI, i4));
                                } else if (strL.startsWith("#EXT-X-PRELOAD-HINT")) {
                                    if (tm1Var == null && "PART".equals(k(strL, d0, map))) {
                                        String strK6 = k(strL, pattern2, map);
                                        long jI2 = i(strL, V);
                                        long jI3 = i(strL, W);
                                        String hexString = strK == null ? null : str17 != null ? str17 : Long.toHexString(j6);
                                        if (ow0Var3 != null || treeMap2.isEmpty()) {
                                            ow0Var = ow0Var3;
                                        } else {
                                            nw0[] nw0VarArr = (nw0[]) treeMap2.values().toArray(new nw0[i12]);
                                            ow0 ow0Var5 = new ow0(str9, true, nw0VarArr);
                                            if (ow0VarC2 == null) {
                                                ow0VarC2 = c(str9, nw0VarArr);
                                            }
                                            ow0Var = ow0Var5;
                                        }
                                        tm1Var = (jI2 == -1 || jI3 != -1) ? new tm1(strK6, vm1Var4, 0L, i11, j7, ow0Var, strK, hexString, jI2 != -1 ? jI2 : 0L, jI3, false, false, true) : tm1Var;
                                        cn1Var2 = cn1Var;
                                        ym1Var2 = ym1Var;
                                        ow0Var3 = ow0Var;
                                        xm1Var = xm1Var;
                                        arrayList7 = arrayList7;
                                        map2 = map2;
                                        str10 = str17;
                                        linkedHashMap2 = linkedHashMap4;
                                        i12 = 0;
                                    }
                                } else if (strL.startsWith("#EXT-X-PART")) {
                                    String hexString2 = strK == null ? null : str17 != null ? str17 : Long.toHexString(j6);
                                    String strK7 = k(strL, pattern2, map);
                                    long j32 = (long) (Double.parseDouble(k(strL, C, Collections.EMPTY_MAP)) * 1000000.0d);
                                    boolean zG3 = g(strL, m0) | (z3 && arrayList5.isEmpty());
                                    boolean zG4 = g(strL, n0);
                                    String strJ6 = j(strL, pattern, null, map);
                                    if (strJ6 != null) {
                                        String str23 = f35.a;
                                        String[] strArrSplit3 = strJ6.split("@", -1);
                                        long j33 = Long.parseLong(strArrSplit3[0]);
                                        if (strArrSplit3.length > 1) {
                                            j8 = Long.parseLong(strArrSplit3[1]);
                                        }
                                        j2 = j33;
                                    } else {
                                        j2 = -1;
                                    }
                                    long j34 = j2 == -1 ? 0L : j8;
                                    if (ow0Var3 != null || treeMap2.isEmpty()) {
                                        ow0Var2 = ow0Var3;
                                    } else {
                                        nw0[] nw0VarArr2 = (nw0[]) treeMap2.values().toArray(new nw0[0]);
                                        ow0 ow0Var6 = new ow0(str9, true, nw0VarArr2);
                                        if (ow0VarC2 == null) {
                                            ow0VarC2 = c(str9, nw0VarArr2);
                                        }
                                        ow0Var2 = ow0Var6;
                                    }
                                    tm1 tm1Var4 = new tm1(strK7, vm1Var4, j32, i11, j7, ow0Var2, strK, hexString2, j34, j2, zG4, zG3, false);
                                    vm1 vm1Var8 = vm1Var4;
                                    int i21 = i11;
                                    arrayList5.add(tm1Var4);
                                    j7 += j32;
                                    if (j2 != -1) {
                                        j34 += j2;
                                    }
                                    j8 = j34;
                                    ym1Var2 = ym1Var;
                                    i11 = i21;
                                    vm1Var4 = vm1Var8;
                                    ow0Var3 = ow0Var2;
                                    xm1Var = xm1Var;
                                    tm1Var = tm1Var;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str10 = str17;
                                    linkedHashMap2 = linkedHashMap4;
                                    i12 = 0;
                                    cn1Var2 = cn1Var;
                                } else {
                                    vm1 vm1Var9 = vm1Var4;
                                    int i22 = i11;
                                    if (strL.startsWith("#EXT-X-DATERANGE") && j(strL, s0, str8, map).equals("com.apple.hls.interstitial")) {
                                        String strK8 = k(strL, r0, map);
                                        String strJ7 = j(strL, y0, null, map);
                                        Uri uri4 = strJ7 != null ? Uri.parse(strJ7) : null;
                                        String strJ8 = j(strL, z0, null, map);
                                        Uri uri5 = strJ8 != null ? Uri.parse(strJ8) : null;
                                        String strJ9 = j(strL, t0, null, map);
                                        long jQ2 = strJ9 != null ? f35.Q(f35.T(strJ9)) : -9223372036854775807L;
                                        String strJ10 = j(strL, v0, null, map);
                                        long jQ3 = strJ10 != null ? f35.Q(f35.T(strJ10)) : -9223372036854775807L;
                                        ArrayList arrayList19 = new ArrayList();
                                        i5 = i22;
                                        String strJ11 = j(strL, u0, null, map);
                                        if (strJ11 != null) {
                                            String str24 = f35.a;
                                            String[] strArrSplit4 = strJ11.split(",", -1);
                                            int length = strArrSplit4.length;
                                            int i23 = 0;
                                            while (i23 < length) {
                                                int i24 = i23;
                                                String strTrim = strArrSplit4[i23].trim();
                                                strTrim.getClass();
                                                switch (strTrim.hashCode()) {
                                                    case 79491:
                                                        i7 = length;
                                                        if (strTrim.equals("PRE")) {
                                                            b2 = 0;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case 2430593:
                                                        i7 = length;
                                                        if (strTrim.equals("ONCE")) {
                                                            b2 = 1;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case 2461856:
                                                        i7 = length;
                                                        if (strTrim.equals("POST")) {
                                                            b2 = 2;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = length;
                                                        b2 = -1;
                                                        break;
                                                }
                                                switch (b2) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                        arrayList19.add(strTrim);
                                                        break;
                                                }
                                                i23 = i24 + 1;
                                                length = i7;
                                            }
                                        }
                                        vm1Var = vm1Var9;
                                        String str25 = str8;
                                        double dH4 = h(strL, D, -1.0d);
                                        long j35 = dH4 >= 0.0d ? (long) (dH4 * 1000000.0d) : -9223372036854775807L;
                                        double dH5 = h(strL, w0, -1.0d);
                                        long j36 = dH5 >= 0.0d ? (long) (dH5 * 1000000.0d) : -9223372036854775807L;
                                        boolean zG5 = g(strL, x0);
                                        str3 = str25;
                                        ArrayList arrayList20 = arrayList6;
                                        double dH6 = h(strL, A0, Double.MIN_VALUE);
                                        long j37 = dH6 != Double.MIN_VALUE ? (long) (dH6 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList21 = arrayList20;
                                        double dH7 = h(strL, B0, -1.0d);
                                        long j38 = dH7 >= 0.0d ? (long) (dH7 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList22 = new ArrayList();
                                        String strJ12 = j(strL, C0, null, map);
                                        if (strJ12 != null) {
                                            String str26 = f35.a;
                                            String[] strArrSplit5 = strJ12.split(",", -1);
                                            int length2 = strArrSplit5.length;
                                            int i25 = 0;
                                            while (i25 < length2) {
                                                int i26 = i25;
                                                String strTrim2 = strArrSplit5[i25].trim();
                                                strTrim2.getClass();
                                                ArrayList arrayList23 = arrayList21;
                                                if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                    arrayList22.add(strTrim2);
                                                }
                                                i25 = i26 + 1;
                                                arrayList21 = arrayList23;
                                            }
                                        }
                                        arrayList2 = arrayList21;
                                        ArrayList arrayList24 = new ArrayList();
                                        String strJ13 = j(strL, D0, null, map);
                                        if (strJ13 != null) {
                                            String str27 = f35.a;
                                            String[] strArrSplit6 = strJ13.split(",", -1);
                                            int length3 = strArrSplit6.length;
                                            int i27 = 0;
                                            while (i27 < length3) {
                                                String strTrim3 = strArrSplit6[i27].trim();
                                                strTrim3.getClass();
                                                String[] strArr = strArrSplit6;
                                                if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                    arrayList24.add(strTrim3);
                                                }
                                                i27++;
                                                strArrSplit6 = strArr;
                                            }
                                        }
                                        String strJ14 = j(strL, E0, null, map);
                                        Boolean boolValueOf = strJ14 != null ? Boolean.valueOf(!strJ14.equals("NO")) : null;
                                        String strJ15 = j(strL, F0, null, map);
                                        if (strJ15 != null) {
                                            str6 = "RANGE";
                                            if (!strJ15.equals("RANGE")) {
                                                str6 = "POINT";
                                                if (!strJ15.equals(str6)) {
                                                    str6 = null;
                                                }
                                            }
                                        } else {
                                            str6 = null;
                                        }
                                        String strJ16 = j(strL, G0, null, map);
                                        if (strJ16 != null) {
                                            str7 = "PRIMARY";
                                            if (!strJ16.equals("PRIMARY")) {
                                                str7 = "HIGHLIGHT";
                                                if (!strJ16.equals(str7)) {
                                                    str7 = null;
                                                }
                                            }
                                        } else {
                                            str7 = null;
                                        }
                                        treeMap = treeMap2;
                                        str4 = str9;
                                        double dH8 = h(strL, H0, -1.0d);
                                        long j39 = dH8 >= 0.0d ? (long) (dH8 * 1000000.0d) : -9223372036854775807L;
                                        double dH9 = h(strL, I0, -1.0d);
                                        long j40 = dH9 >= 0.0d ? (long) (dH9 * 1000000.0d) : -9223372036854775807L;
                                        String strJ17 = j(strL, J0, null, map);
                                        ArrayList arrayList25 = new ArrayList();
                                        String strSubstring = strL.substring(17);
                                        Matcher matcher3 = L0.matcher(strSubstring);
                                        while (matcher3.find()) {
                                            String strGroup2 = matcher3.group();
                                            strGroup2.getClass();
                                            switch (strGroup2.hashCode()) {
                                                case -2136701954:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-SNAP=")) {
                                                        b = 0;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -1843050726:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-CONTENT-MAY-VARY=")) {
                                                        b = 1;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -148960310:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-PLAYOUT-LIMIT=")) {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -36345757:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-TIMELINE-STYLE=")) {
                                                        b = 3;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 397239341:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-ASSET-LIST=")) {
                                                        b = 4;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 850193465:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-TIMELINE-OCCUPIES=")) {
                                                        b = 5;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1065650400:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                        b = 6;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1274498945:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                        b = 7;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1472528844:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-RESTRICT=")) {
                                                        b = 8;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1748487807:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-RESUME-OFFSET=")) {
                                                        b = 9;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1814205923:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-ASSET-URI=")) {
                                                        b = 10;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 2080546752:
                                                    matcher = matcher3;
                                                    if (strGroup2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                        b = 11;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                default:
                                                    matcher = matcher3;
                                                    b = -1;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                    str6 = str6;
                                                    str7 = str7;
                                                    break;
                                                default:
                                                    String strSubstring2 = strGroup2.substring(0, strGroup2.length() - 1);
                                                    String strConcat = strSubstring2.concat("=");
                                                    int length4 = strConcat.length() + strSubstring.indexOf(strConcat);
                                                    String strSubstring3 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                    arrayList25.add(strSubstring3.startsWith("\"") ? new qm1(0, strSubstring2, k(strSubstring, Pattern.compile(strSubstring2.concat("=\"((?:.|\f)+?)\"")), map)) : (strSubstring3.equals("0x") || strSubstring3.equals("0X")) ? new qm1(1, strSubstring2, k(strSubstring, Pattern.compile(strSubstring2.concat("=(0[xX][A-F0-9]+)")), map)) : new qm1(strSubstring2, Double.parseDouble(k(strSubstring, Pattern.compile(strSubstring2.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP))));
                                                    break;
                                            }
                                            str6 = str6;
                                            matcher3 = matcher;
                                            strJ17 = strJ17;
                                            str7 = str7;
                                            arrayList4 = arrayList4;
                                        }
                                        arrayList3 = arrayList4;
                                        String str28 = strJ17;
                                        String str29 = str6;
                                        String str30 = str7;
                                        linkedHashMap = linkedHashMap4;
                                        rm1 rm1Var2 = linkedHashMap.containsKey(strK8) ? (rm1) linkedHashMap.get(strK8) : new rm1(strK8);
                                        if (uri4 == null) {
                                            rm1Var2.getClass();
                                        } else {
                                            Uri uri6 = rm1Var2.c;
                                            if (uri6 != null) {
                                                rr2.p(uri6.equals(uri4), "Can't change assetUri from %s to %s", rm1Var2.c, uri4);
                                            }
                                            rm1Var2.c = uri4;
                                        }
                                        if (uri5 != null) {
                                            Uri uri7 = rm1Var2.d;
                                            if (uri7 != null) {
                                                rr2.p(uri7.equals(uri5), "Can't change assetListUri from %s to %s", rm1Var2.d, uri5);
                                            }
                                            rm1Var2.d = uri5;
                                        }
                                        if (jQ2 != -9223372036854775807L) {
                                            long j41 = rm1Var2.e;
                                            if (j41 != -9223372036854775807L) {
                                                rr2.n(j41 == jQ2, "Can't change startDateUnixUs from %s to %s", j41, jQ2);
                                            }
                                            rm1Var2.e = jQ2;
                                        }
                                        if (jQ3 != -9223372036854775807L) {
                                            long j42 = rm1Var2.f;
                                            if (j42 != -9223372036854775807L) {
                                                rr2.n(j42 == jQ3, "Can't change endDateUnixUs from %s to %s", j42, jQ3);
                                            }
                                            rm1Var2.f = jQ3;
                                        }
                                        if (j35 != -9223372036854775807L) {
                                            long j43 = rm1Var2.g;
                                            if (j43 != -9223372036854775807L) {
                                                rr2.n(j43 == j35, "Can't change durationUs from %s to %s", j43, j35);
                                            }
                                            rm1Var2.g = j35;
                                        }
                                        if (j36 != -9223372036854775807L) {
                                            long j44 = rm1Var2.h;
                                            if (j44 != -9223372036854775807L) {
                                                rr2.n(j44 == j36, "Can't change plannedDurationUs from %s to %s", j44, j36);
                                            }
                                            rm1Var2.h = j36;
                                        }
                                        if (arrayList19.isEmpty()) {
                                            str29 = str29;
                                        } else {
                                            if (rm1Var2.i.isEmpty()) {
                                                str29 = str29;
                                            } else {
                                                boolean zEquals = rm1Var2.i.equals(arrayList19);
                                                StringBuilder sb = new StringBuilder("Can't change cue from ");
                                                ArrayList arrayList26 = rm1Var2.i;
                                                StringBuilder sb2 = new StringBuilder();
                                                Iterator it2 = arrayList26.iterator();
                                                if (it2.hasNext()) {
                                                    Object next = it2.next();
                                                    while (true) {
                                                        sb2.append((CharSequence) next);
                                                        if (it2.hasNext()) {
                                                            sb2.append((CharSequence) ", ");
                                                            next = it2.next();
                                                        }
                                                    }
                                                }
                                                sb.append(sb2.toString());
                                                sb.append(" to ");
                                                StringBuilder sb3 = new StringBuilder();
                                                Iterator it3 = arrayList19.iterator();
                                                if (it3.hasNext()) {
                                                    while (true) {
                                                        sb3.append((CharSequence) it3.next());
                                                        if (it3.hasNext()) {
                                                            sb3.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb.append(sb3.toString());
                                                rr2.k(sb.toString(), zEquals);
                                            }
                                            rm1Var2.i = arrayList19;
                                        }
                                        if (zG5) {
                                            rm1Var2.j = true;
                                        }
                                        if (j37 != -9223372036854775807L) {
                                            long j45 = rm1Var2.k;
                                            if (j45 != -9223372036854775807L) {
                                                rr2.n(j45 == j37, "Can't change resumeOffsetUs from %s to %s", j45, j37);
                                            }
                                            rm1Var2.k = j37;
                                        }
                                        if (j38 != -9223372036854775807L) {
                                            long j46 = rm1Var2.l;
                                            if (j46 != -9223372036854775807L) {
                                                rr2.n(j46 == j38, "Can't change playoutLimitUs from %s to %s", j46, j38);
                                            }
                                            rm1Var2.l = j38;
                                        }
                                        if (!arrayList22.isEmpty()) {
                                            if (!rm1Var2.m.isEmpty()) {
                                                boolean zEquals2 = rm1Var2.m.equals(arrayList22);
                                                StringBuilder sb4 = new StringBuilder("Can't change snapTypes from ");
                                                ArrayList arrayList27 = rm1Var2.m;
                                                StringBuilder sb5 = new StringBuilder();
                                                Iterator it4 = arrayList27.iterator();
                                                if (it4.hasNext()) {
                                                    while (true) {
                                                        sb5.append((CharSequence) it4.next());
                                                        if (it4.hasNext()) {
                                                            sb5.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb4.append(sb5.toString());
                                                sb4.append(" to ");
                                                StringBuilder sb6 = new StringBuilder();
                                                Iterator it5 = arrayList22.iterator();
                                                if (it5.hasNext()) {
                                                    while (true) {
                                                        sb6.append((CharSequence) it5.next());
                                                        if (it5.hasNext()) {
                                                            sb6.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb4.append(sb6.toString());
                                                rr2.k(sb4.toString(), zEquals2);
                                            }
                                            rm1Var2.m = arrayList22;
                                        }
                                        if (!arrayList24.isEmpty()) {
                                            if (!rm1Var2.n.isEmpty()) {
                                                boolean zEquals3 = rm1Var2.n.equals(arrayList24);
                                                StringBuilder sb7 = new StringBuilder("Can't change restrictions from ");
                                                ArrayList arrayList28 = rm1Var2.n;
                                                StringBuilder sb8 = new StringBuilder();
                                                Iterator it6 = arrayList28.iterator();
                                                if (it6.hasNext()) {
                                                    while (true) {
                                                        sb8.append((CharSequence) it6.next());
                                                        if (it6.hasNext()) {
                                                            sb8.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb7.append(sb8.toString());
                                                sb7.append(" to ");
                                                StringBuilder sb9 = new StringBuilder();
                                                Iterator it7 = arrayList24.iterator();
                                                if (it7.hasNext()) {
                                                    while (true) {
                                                        sb9.append((CharSequence) it7.next());
                                                        if (it7.hasNext()) {
                                                            sb9.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb7.append(sb9.toString());
                                                rr2.k(sb7.toString(), zEquals3);
                                            }
                                            rm1Var2.n = arrayList24;
                                        }
                                        HashMap map5 = rm1Var2.b;
                                        if (!arrayList25.isEmpty()) {
                                            for (int i28 = 0; i28 < arrayList25.size(); i28++) {
                                                qm1 qm1Var = (qm1) arrayList25.get(i28);
                                                String str31 = qm1Var.a;
                                                qm1 qm1Var2 = (qm1) map5.get(str31);
                                                if (qm1Var2 != null) {
                                                    boolean zEquals4 = qm1Var2.equals(qm1Var);
                                                    Object[] objArr = {str31, qm1Var2.d, Double.valueOf(qm1Var2.c), qm1Var.d, Double.valueOf(qm1Var.c)};
                                                    if (!zEquals4) {
                                                        kf2.n(gh0.s("Can't change %s from %s %s to %s %s", objArr));
                                                        return null;
                                                    }
                                                }
                                                map5.put(str31, qm1Var);
                                            }
                                        }
                                        if (boolValueOf != null) {
                                            Boolean bool2 = rm1Var2.o;
                                            if (bool2 != null) {
                                                rr2.p(bool2.equals(boolValueOf), "Can't change contentMayVary from %s to %s", rm1Var2.o, boolValueOf);
                                            }
                                            rm1Var2.o = boolValueOf;
                                        }
                                        if (str29 != null) {
                                            String str32 = rm1Var2.p;
                                            String str33 = str29;
                                            if (str32 != null) {
                                                rr2.p(str32.equals(str33), "Can't change timelineOccupies from %s to %s", rm1Var2.p, str33);
                                            }
                                            rm1Var2.p = str33;
                                        }
                                        if (str30 != null) {
                                            String str34 = rm1Var2.q;
                                            if (str34 != null) {
                                                rr2.p(str34.equals(str30), "Can't change timelineStyle from %s to %s", rm1Var2.q, str30);
                                            }
                                            rm1Var2.q = str30;
                                        }
                                        if (j39 != -9223372036854775807L) {
                                            long j47 = rm1Var2.r;
                                            if (j47 != -9223372036854775807L) {
                                                rr2.n(j47 == j39, "Can't change skipControlOffsetUs from %s to %s", j47, j39);
                                            }
                                            rm1Var2.r = j39;
                                        }
                                        if (j40 != -9223372036854775807L) {
                                            long j48 = rm1Var2.s;
                                            if (j48 != -9223372036854775807L) {
                                                rr2.n(j48 == j40, "Can't change skipControlDurationUs from %s to %s", j48, j40);
                                            }
                                            rm1Var2.s = j40;
                                        }
                                        if (str28 != null) {
                                            String str35 = rm1Var2.t;
                                            if (str35 != null) {
                                                rr2.p(str35.equals(str28), "Can't change skipControlLabelId from %s to %s", rm1Var2.t, str28);
                                            }
                                            rm1Var2.t = str28;
                                        }
                                        linkedHashMap.put(strK8, rm1Var2);
                                    } else {
                                        i5 = i22;
                                        arrayList3 = arrayList4;
                                        arrayList5 = arrayList5;
                                        arrayList2 = arrayList6;
                                        treeMap = treeMap2;
                                        str4 = str9;
                                        vm1Var = vm1Var9;
                                        str3 = str8;
                                        linkedHashMap = linkedHashMap4;
                                        if (!strL.startsWith("#")) {
                                            String hexString3 = strK == null ? null : str17 != null ? str17 : Long.toHexString(j6);
                                            long j49 = j6 + 1;
                                            String strL2 = l(map, strL);
                                            map2 = map2;
                                            vm1 vm1Var10 = (vm1) map2.get(strL2);
                                            if (j9 == -1) {
                                                vm1Var2 = vm1Var10;
                                                j4 = 0;
                                            } else if (z6 && vm1Var == null && vm1Var10 == null) {
                                                vm1 vm1Var11 = new vm1(strL2, 0L, j4, null, null);
                                                map2.put(strL2, vm1Var11);
                                                vm1Var2 = vm1Var11;
                                            } else {
                                                vm1Var2 = vm1Var10;
                                                j4 = j4;
                                            }
                                            if (ow0Var3 != null || treeMap.isEmpty()) {
                                                str5 = str4;
                                                i6 = 0;
                                            } else {
                                                i6 = 0;
                                                nw0[] nw0VarArr3 = (nw0[]) treeMap.values().toArray(new nw0[0]);
                                                str5 = str4;
                                                ow0 ow0Var7 = new ow0(str5, true, nw0VarArr3);
                                                if (ow0VarC2 == null) {
                                                    ow0VarC = c(str5, nw0VarArr3);
                                                    ow0Var3 = ow0Var7;
                                                } else {
                                                    ow0Var3 = ow0Var7;
                                                }
                                                if (vm1Var != null) {
                                                    vm1Var3 = vm1Var;
                                                } else {
                                                    vm1Var3 = vm1Var2;
                                                }
                                                long j50 = j5;
                                                ow0 ow0Var8 = ow0Var3;
                                                j = j4;
                                                long j51 = jLongValue;
                                                String str36 = hexString3;
                                                String str37 = strK;
                                                strK = str37;
                                                arrayList3.add(new vm1(strL2, vm1Var3, strJ, j51, i5, j50, ow0Var8, str37, str36, j, j9, i13, arrayList5));
                                                j7 = j50 + j51;
                                                ArrayList arrayList29 = new ArrayList();
                                                if (j9 != -1) {
                                                    j4 = j + j9;
                                                } else {
                                                    j4 = j;
                                                }
                                                j6 = j49;
                                                linkedHashMap2 = linkedHashMap;
                                                ow0VarC2 = ow0VarC;
                                                arrayList5 = arrayList29;
                                                i12 = i6;
                                                i13 = i12;
                                                str9 = str5;
                                                i11 = i5;
                                                ow0Var3 = ow0Var8;
                                                j5 = j7;
                                                vm1Var4 = vm1Var;
                                                str8 = str3;
                                                strJ = str8;
                                                jLongValue = 0;
                                                j9 = -1;
                                                arrayList7 = arrayList7;
                                                str10 = str17;
                                                arrayList6 = arrayList2;
                                                treeMap2 = treeMap;
                                                cn1Var2 = cn1Var;
                                                ym1Var2 = ym1Var;
                                                arrayList4 = arrayList3;
                                            }
                                            ow0VarC = ow0VarC2;
                                            if (vm1Var != null) {
                                                vm1Var3 = vm1Var;
                                            } else {
                                                vm1Var3 = vm1Var2;
                                            }
                                            long j52 = j5;
                                            ow0 ow0Var9 = ow0Var3;
                                            j = j4;
                                            long j53 = jLongValue;
                                            String str38 = hexString3;
                                            String str39 = strK;
                                            strK = str39;
                                            arrayList3.add(new vm1(strL2, vm1Var3, strJ, j53, i5, j52, ow0Var9, str39, str38, j, j9, i13, arrayList5));
                                            j7 = j52 + j53;
                                            ArrayList arrayList210 = new ArrayList();
                                            if (j9 != -1) {
                                                j4 = j + j9;
                                            } else {
                                                j4 = j;
                                            }
                                            j6 = j49;
                                            linkedHashMap2 = linkedHashMap;
                                            ow0VarC2 = ow0VarC;
                                            arrayList5 = arrayList210;
                                            i12 = i6;
                                            i13 = i12;
                                            str9 = str5;
                                            i11 = i5;
                                            ow0Var3 = ow0Var9;
                                            j5 = j7;
                                            vm1Var4 = vm1Var;
                                            str8 = str3;
                                            strJ = str8;
                                            jLongValue = 0;
                                            j9 = -1;
                                            arrayList7 = arrayList7;
                                            str10 = str17;
                                            arrayList6 = arrayList2;
                                            treeMap2 = treeMap;
                                            cn1Var2 = cn1Var;
                                            ym1Var2 = ym1Var;
                                            arrayList4 = arrayList3;
                                        }
                                        tm1Var = tm1Var;
                                    }
                                    i = i5;
                                    arrayList5 = arrayList5;
                                    str2 = str4;
                                    arrayList = arrayList3;
                                    i2 = 0;
                                    cn1Var2 = cn1Var;
                                    ym1Var2 = ym1Var;
                                    linkedHashMap2 = linkedHashMap;
                                    i12 = i2;
                                    str9 = str2;
                                    strJ = strJ;
                                    jLongValue = jLongValue;
                                    j5 = j5;
                                    j4 = j4;
                                    vm1Var4 = vm1Var;
                                    str8 = str3;
                                    arrayList7 = arrayList7;
                                    str10 = str17;
                                    arrayList6 = arrayList2;
                                    treeMap2 = treeMap;
                                    arrayList4 = arrayList;
                                    i11 = i;
                                    tm1Var = tm1Var;
                                }
                                cn1Var2 = cn1Var;
                                ym1Var2 = ym1Var;
                            }
                            linkedHashMap2 = linkedHashMap4;
                        }
                        arrayList = arrayList4;
                        arrayList2 = arrayList6;
                        treeMap = treeMap2;
                        str2 = str9;
                        str3 = str8;
                        vm1Var = vm1Var4;
                        i = i11;
                        i2 = i12;
                        linkedHashMap = linkedHashMap4;
                        cn1Var2 = cn1Var;
                        ym1Var2 = ym1Var;
                        linkedHashMap2 = linkedHashMap;
                        i12 = i2;
                        str9 = str2;
                        strJ = strJ;
                        jLongValue = jLongValue;
                        j5 = j5;
                        j4 = j4;
                        vm1Var4 = vm1Var;
                        str8 = str3;
                        arrayList7 = arrayList7;
                        str10 = str17;
                        arrayList6 = arrayList2;
                        treeMap2 = treeMap;
                        arrayList4 = arrayList;
                        i11 = i;
                        tm1Var = tm1Var;
                    }
                    str10 = str17;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            tm1Var = tm1Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x022c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:112:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x0257  */
    /* JADX WARN: Code duplicated, block: B:119:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x0276  */
    /* JADX WARN: Code duplicated, block: B:126:0x0283  */
    /* JADX WARN: Code duplicated, block: B:128:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x029c  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x032c  */
    /* JADX WARN: Code duplicated, block: B:193:0x04be  */
    /* JADX WARN: Code duplicated, block: B:282:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    public static cn1 f(qp4 qp4Var, String str) throws IOException {
        ?? r43;
        int i;
        ArrayList arrayList;
        bn1 bn1Var;
        String strD;
        ArrayList arrayList2;
        int i2;
        String str2;
        bn1 bn1Var2;
        String strD2;
        bn1 bn1Var3;
        int i3;
        int i4;
        String str3;
        String str4;
        String strV;
        String str5;
        String[] strArrE0;
        StringBuilder sb;
        int length;
        int i5;
        String string;
        String str6;
        String strO;
        String strJ;
        int i6;
        int i7;
        String strJ2;
        float f;
        Uri uriH;
        Uri uri;
        ArrayList arrayList3;
        String str7 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zJ = qp4Var.j();
            Pattern pattern = a0;
            ArrayList arrayList12 = arrayList8;
            boolean z4 = z2;
            Pattern pattern2 = f0;
            boolean z5 = z3;
            if (!zJ) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i8 = 0;
                HashMap map3 = map;
                while (i8 < arrayList4.size()) {
                    bn1 bn1Var4 = (bn1) arrayList4.get(i8);
                    Uri uri2 = bn1Var4.a;
                    tb1 tb1Var = bn1Var4.b;
                    if (hashSet.add(uri2)) {
                        rr2.w(tb1Var.l == null);
                        ArrayList arrayList20 = (ArrayList) map3.get(bn1Var4.a);
                        arrayList20.getClass();
                        qv2 qv2Var = new qv2(new nn1(null, null, arrayList20));
                        sb1 sb1VarA = tb1Var.a();
                        sb1VarA.k = qv2Var;
                        arrayList19.add(new bn1(bn1Var4.a, new tb1(sb1VarA), bn1Var4.c, bn1Var4.d, bn1Var4.e, bn1Var4.f));
                    }
                    i8++;
                    map3 = map3;
                }
                int i9 = 0;
                List arrayList21 = null;
                tb1 tb1Var2 = null;
                while (i9 < arrayList13.size()) {
                    ArrayList arrayList22 = arrayList13;
                    String str8 = (String) arrayList22.get(i9);
                    String strK = k(str8, g0, map2);
                    String strK2 = k(str8, pattern2, map2);
                    sb1 sb1Var = new sb1();
                    int i10 = i9;
                    sb1Var.a = b11.o(strK, ":", strK2);
                    sb1Var.b = strK2;
                    sb1Var.l = lw2.m("application/x-mpegURL");
                    boolean zG = g(str8, k0);
                    if (g(str8, l0)) {
                        r43 = zG;
                        r43 = (zG ? 1 : 0) | 2;
                    }
                    r43 = zG;
                    sb1Var.e = g(str8, j0) ? r43 | 4 : r43;
                    ArrayList arrayList23 = arrayList19;
                    String strJ3 = j(str8, h0, null, map2);
                    if (TextUtils.isEmpty(strJ3)) {
                        arrayList13 = arrayList22;
                        i = 0;
                    } else {
                        String str9 = f35.a;
                        String[] strArrSplit = strJ3.split(",", -1);
                        i = f35.m(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList13 = arrayList22;
                        if (f35.m(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= 4096;
                        }
                        if (f35.m(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (f35.m(strArrSplit, "public.easy-to-read")) {
                            i |= 8192;
                        }
                    }
                    sb1Var.f = i;
                    sb1Var.d = j(str8, e0, null, map2);
                    String strJ4 = j(str8, pattern, null, map2);
                    Uri uriH2 = strJ4 == null ? null : jz4.H(str7, strJ4);
                    qv2 qv2Var2 = new qv2(new nn1(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str8, c0, map2)) {
                        case "SUBTITLES":
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList4.size()) {
                                    bn1Var = (bn1) arrayList4.get(i11);
                                    if (!strK.equals(bn1Var.e)) {
                                        i11++;
                                    }
                                } else {
                                    bn1Var = null;
                                }
                            }
                            if (bn1Var != null) {
                                String strV2 = f35.v(3, bn1Var.b.k);
                                sb1Var.j = strV2;
                                strD = lw2.d(strV2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            sb1Var.m = lw2.m(strD);
                            sb1Var.k = qv2Var2;
                            if (uriH2 == null) {
                                arrayList = arrayList16;
                                l93.q0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                an1 an1Var = new an1(uriH2, new tb1(sb1Var), strK2);
                                arrayList = arrayList16;
                                arrayList.add(an1Var);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList2 = arrayList15;
                            String strK3 = k(str8, i0, map2);
                            if (strK3.startsWith("CC")) {
                                i2 = Integer.parseInt(strK3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strK3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                            }
                            sb1Var.m = lw2.m(str2);
                            sb1Var.J = i2;
                            arrayList21.add(new tb1(sb1Var));
                            arrayList15 = arrayList2;
                            arrayList = arrayList16;
                            break;
                        case "AUDIO":
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList4.size()) {
                                    bn1Var2 = (bn1) arrayList4.get(i12);
                                    int i13 = i12;
                                    if (!strK.equals(bn1Var2.d)) {
                                        i12 = i13 + 1;
                                    }
                                } else {
                                    bn1Var2 = null;
                                }
                            }
                            if (bn1Var2 != null) {
                                String strV3 = f35.v(1, bn1Var2.b.k);
                                sb1Var.j = strV3;
                                strD2 = lw2.d(strV3);
                            } else {
                                strD2 = null;
                            }
                            bn1 bn1Var5 = bn1Var2;
                            String strJ5 = j(str8, v, null, map2);
                            if (strJ5 != null) {
                                String str10 = f35.a;
                                sb1Var.E = Integer.parseInt(strJ5.split("/", 2)[0]);
                                if ("audio/eac3".equals(strD2) && strJ5.endsWith("/JOC")) {
                                    sb1Var.j = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            sb1Var.m = lw2.m(strD2);
                            if (uriH2 != null) {
                                sb1Var.k = qv2Var2;
                                arrayList15.add(new an1(uriH2, new tb1(sb1Var), strK2));
                            } else {
                                arrayList2 = arrayList15;
                                if (bn1Var5 != null) {
                                    arrayList15 = arrayList2;
                                    tb1Var2 = new tb1(sb1Var);
                                } else {
                                    arrayList15 = arrayList2;
                                }
                            }
                            arrayList = arrayList16;
                            break;
                        case "VIDEO":
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList4.size()) {
                                    bn1Var3 = (bn1) arrayList4.get(i14);
                                    if (!strK.equals(bn1Var3.c)) {
                                        i14++;
                                    }
                                } else {
                                    bn1Var3 = null;
                                }
                            }
                            if (bn1Var3 != null) {
                                tb1 tb1Var3 = bn1Var3.b;
                                String strV4 = f35.v(2, tb1Var3.k);
                                sb1Var.j = strV4;
                                sb1Var.m = lw2.m(lw2.d(strV4));
                                sb1Var.t = tb1Var3.u;
                                sb1Var.u = tb1Var3.v;
                                sb1Var.x = tb1Var3.y;
                            }
                            if (uriH2 != null) {
                                sb1Var.k = qv2Var2;
                                arrayList14.add(new an1(uriH2, new tb1(sb1Var), strK2));
                            }
                            arrayList = arrayList16;
                            break;
                        default:
                            arrayList = arrayList16;
                            break;
                    }
                    arrayList19 = arrayList23;
                    arrayList16 = arrayList;
                    i9 = i10 + 1;
                    str7 = str;
                }
                ArrayList arrayList24 = arrayList19;
                ArrayList arrayList25 = arrayList16;
                if (z4) {
                    arrayList21 = Collections.EMPTY_LIST;
                }
                return new cn1(str, arrayList17, arrayList24, arrayList14, arrayList15, arrayList25, arrayList12, tb1Var2, arrayList21, z5, map2, arrayList18);
            }
            String strL = qp4Var.l();
            if (strL.startsWith("#EXT")) {
                arrayList11.add(strL);
            }
            boolean zStartsWith = strL.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList11;
            if (strL.startsWith("#EXT-X-DEFINE")) {
                map2.put(k(strL, pattern2, map2), k(strL, p0, map2));
            } else {
                if (strL.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList10 = arrayList10;
                    z2 = z4;
                    z3 = true;
                } else if (strL.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strL);
                } else if (strL.startsWith("#EXT-X-SESSION-KEY")) {
                    nw0 nw0VarD = d(strL, j(strL, Y, "identity", map2), map2);
                    if (nw0VarD != null) {
                        String strK4 = k(strL, X, map2);
                        arrayList10.add(new ow0(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs", true, nw0VarD));
                    }
                } else {
                    if (strL.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z4 | strL.contains("CLOSED-CAPTIONS=NONE");
                        int i15 = zStartsWith ? 16384 : 0;
                        z4 = zContains;
                        int i16 = Integer.parseInt(k(strL, u, Collections.EMPTY_MAP));
                        Matcher matcher = p.matcher(strL);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strJ6 = j(strL, w, null, map2);
                        String strJ7 = j(strL, x, null, map2);
                        String strJ8 = j(strL, y, null, map2);
                        if (strJ8 != null) {
                            String str11 = f35.a;
                            String[] strArrSplit2 = strJ8.split(",", 2)[0].split("/", -1);
                            str3 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str4 = strArrSplit2[1];
                                arrayList9 = arrayList9;
                                i4 = 2;
                            } else {
                                i4 = 2;
                            }
                            strV = f35.v(i4, strJ7);
                            ArrayList arrayList27 = lw2.a;
                            if (strV == null) {
                                str5 = strJ7;
                            } else {
                                if (strV.startsWith("dvhe")) {
                                    str5 = strJ7;
                                } else {
                                    str5 = strJ7;
                                    if (strV.startsWith("dvh1") && (str3 == null || ((!str3.startsWith("dvhe") || !strV.startsWith("hev1")) && ((!str3.startsWith("dvh1") || !strV.startsWith("hvc1")) && ((!str3.startsWith("dvav") || !strV.startsWith("avc3")) && ((!str3.startsWith("dva1") || !strV.startsWith("avc1")) && (!str3.startsWith("dav1") || !strV.startsWith("av01")))))))) {
                                    }
                                    strJ = j(strL, z, null, map2);
                                    if (strJ != null) {
                                        String[] strArrSplit3 = strJ.split("x", -1);
                                        i7 = Integer.parseInt(strArrSplit3[0]);
                                        i6 = Integer.parseInt(strArrSplit3[1]);
                                        if (i7 > 0 || i6 <= 0) {
                                            i6 = -1;
                                            i7 = -1;
                                        }
                                    } else {
                                        i6 = -1;
                                        i7 = -1;
                                    }
                                    strJ2 = j(strL, A, null, map2);
                                    if (strJ2 != null) {
                                        f = Float.parseFloat(strJ2);
                                    } else {
                                        f = -1.0f;
                                    }
                                    String strJ9 = j(strL, q, null, map2);
                                    String strJ10 = j(strL, r, null, map2);
                                    String strJ11 = j(strL, s, null, map2);
                                    String strJ12 = j(strL, t, null, map2);
                                    if (zStartsWith) {
                                        uriH = jz4.H(str7, k(strL, pattern, map2));
                                    } else {
                                        if (qp4Var.j()) {
                                            throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                        }
                                        uriH = jz4.H(str7, l(map2, qp4Var.l()));
                                    }
                                    uri = uriH;
                                    sb1 sb1Var2 = new sb1();
                                    sb1Var2.a = Integer.toString(arrayList4.size());
                                    sb1Var2.l = lw2.m("application/x-mpegURL");
                                    sb1Var2.j = strO;
                                    sb1Var2.h = i3;
                                    sb1Var2.i = i16;
                                    sb1Var2.t = i7;
                                    sb1Var2.u = i6;
                                    sb1Var2.x = f;
                                    sb1Var2.f = i15;
                                    arrayList4.add(new bn1(uri, new tb1(sb1Var2), strJ9, strJ10, strJ11, strJ12));
                                    arrayList3 = (ArrayList) map.get(uri);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        map.put(uri, arrayList3);
                                    }
                                    arrayList3.add(new mn1(i3, i16, strJ9, strJ10, strJ11, strJ12));
                                }
                                if (str3 == null || (strJ6 != null && str4 != null && ((!strJ6.equals("PQ") || str4.equals("db1p")) && ((!strJ6.equals("SDR") || str4.equals("db2g")) && (!strJ6.equals("HLG") || str4.startsWith("db4")))))) {
                                    if (str3 == null) {
                                        str3 = strV;
                                    }
                                    strArrE0 = f35.e0(str5);
                                    if (strArrE0.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrE0.length;
                                        i5 = 0;
                                        while (i5 < length) {
                                            str6 = strArrE0[i5];
                                            String[] strArr = strArrE0;
                                            int i17 = length;
                                            if (2 == lw2.h(lw2.d(str6))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str6);
                                            }
                                            i5++;
                                            length = i17;
                                            strArrE0 = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strO = b11.o(str3, ",", string);
                                    } else {
                                        strO = str3;
                                    }
                                }
                                strJ = j(strL, z, null, map2);
                                if (strJ != null) {
                                    String[] strArrSplit4 = strJ.split("x", -1);
                                    i7 = Integer.parseInt(strArrSplit4[0]);
                                    i6 = Integer.parseInt(strArrSplit4[1]);
                                    if (i7 > 0) {
                                        i6 = -1;
                                        i7 = -1;
                                    } else {
                                        i6 = -1;
                                        i7 = -1;
                                    }
                                } else {
                                    i6 = -1;
                                    i7 = -1;
                                }
                                strJ2 = j(strL, A, null, map2);
                                if (strJ2 != null) {
                                    f = Float.parseFloat(strJ2);
                                } else {
                                    f = -1.0f;
                                }
                                String strJ13 = j(strL, q, null, map2);
                                String strJ14 = j(strL, r, null, map2);
                                String strJ15 = j(strL, s, null, map2);
                                String strJ16 = j(strL, t, null, map2);
                                if (zStartsWith) {
                                    uriH = jz4.H(str7, k(strL, pattern, map2));
                                } else {
                                    if (qp4Var.j()) {
                                        throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                    }
                                    uriH = jz4.H(str7, l(map2, qp4Var.l()));
                                }
                                uri = uriH;
                                sb1 sb1Var3 = new sb1();
                                sb1Var3.a = Integer.toString(arrayList4.size());
                                sb1Var3.l = lw2.m("application/x-mpegURL");
                                sb1Var3.j = strO;
                                sb1Var3.h = i3;
                                sb1Var3.i = i16;
                                sb1Var3.t = i7;
                                sb1Var3.u = i6;
                                sb1Var3.x = f;
                                sb1Var3.f = i15;
                                arrayList4.add(new bn1(uri, new tb1(sb1Var3), strJ13, strJ14, strJ15, strJ16));
                                arrayList3 = (ArrayList) map.get(uri);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    map.put(uri, arrayList3);
                                }
                                arrayList3.add(new mn1(i3, i16, strJ13, strJ14, strJ15, strJ16));
                            }
                            strO = str5;
                            strJ = j(strL, z, null, map2);
                            if (strJ != null) {
                                String[] strArrSplit5 = strJ.split("x", -1);
                                i7 = Integer.parseInt(strArrSplit5[0]);
                                i6 = Integer.parseInt(strArrSplit5[1]);
                                if (i7 > 0) {
                                    i6 = -1;
                                    i7 = -1;
                                } else {
                                    i6 = -1;
                                    i7 = -1;
                                }
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                            strJ2 = j(strL, A, null, map2);
                            if (strJ2 != null) {
                                f = Float.parseFloat(strJ2);
                            } else {
                                f = -1.0f;
                            }
                            String strJ17 = j(strL, q, null, map2);
                            String strJ18 = j(strL, r, null, map2);
                            String strJ19 = j(strL, s, null, map2);
                            String strJ110 = j(strL, t, null, map2);
                            if (zStartsWith) {
                                uriH = jz4.H(str7, k(strL, pattern, map2));
                            } else {
                                if (qp4Var.j()) {
                                    throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriH = jz4.H(str7, l(map2, qp4Var.l()));
                            }
                            uri = uriH;
                            sb1 sb1Var4 = new sb1();
                            sb1Var4.a = Integer.toString(arrayList4.size());
                            sb1Var4.l = lw2.m("application/x-mpegURL");
                            sb1Var4.j = strO;
                            sb1Var4.h = i3;
                            sb1Var4.i = i16;
                            sb1Var4.t = i7;
                            sb1Var4.u = i6;
                            sb1Var4.x = f;
                            sb1Var4.f = i15;
                            arrayList4.add(new bn1(uri, new tb1(sb1Var4), strJ17, strJ18, strJ19, strJ110));
                            arrayList3 = (ArrayList) map.get(uri);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                map.put(uri, arrayList3);
                            }
                            arrayList3.add(new mn1(i3, i16, strJ17, strJ18, strJ19, strJ110));
                        } else {
                            i4 = 2;
                            str3 = null;
                        }
                        str4 = null;
                        strV = f35.v(i4, strJ7);
                        ArrayList arrayList28 = lw2.a;
                        if (strV == null) {
                            str5 = strJ7;
                        } else {
                            if (strV.startsWith("dvhe")) {
                                str5 = strJ7;
                                if (strV.startsWith("dvh1")) {
                                }
                                strJ = j(strL, z, null, map2);
                                if (strJ != null) {
                                    String[] strArrSplit6 = strJ.split("x", -1);
                                    i7 = Integer.parseInt(strArrSplit6[0]);
                                    i6 = Integer.parseInt(strArrSplit6[1]);
                                    if (i7 > 0) {
                                        i6 = -1;
                                        i7 = -1;
                                    } else {
                                        i6 = -1;
                                        i7 = -1;
                                    }
                                } else {
                                    i6 = -1;
                                    i7 = -1;
                                }
                                strJ2 = j(strL, A, null, map2);
                                if (strJ2 != null) {
                                    f = Float.parseFloat(strJ2);
                                } else {
                                    f = -1.0f;
                                }
                                String strJ111 = j(strL, q, null, map2);
                                String strJ112 = j(strL, r, null, map2);
                                String strJ113 = j(strL, s, null, map2);
                                String strJ114 = j(strL, t, null, map2);
                                if (zStartsWith) {
                                    uriH = jz4.H(str7, k(strL, pattern, map2));
                                } else {
                                    if (qp4Var.j()) {
                                        throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                    }
                                    uriH = jz4.H(str7, l(map2, qp4Var.l()));
                                }
                                uri = uriH;
                                sb1 sb1Var5 = new sb1();
                                sb1Var5.a = Integer.toString(arrayList4.size());
                                sb1Var5.l = lw2.m("application/x-mpegURL");
                                sb1Var5.j = strO;
                                sb1Var5.h = i3;
                                sb1Var5.i = i16;
                                sb1Var5.t = i7;
                                sb1Var5.u = i6;
                                sb1Var5.x = f;
                                sb1Var5.f = i15;
                                arrayList4.add(new bn1(uri, new tb1(sb1Var5), strJ111, strJ112, strJ113, strJ114));
                                arrayList3 = (ArrayList) map.get(uri);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    map.put(uri, arrayList3);
                                }
                                arrayList3.add(new mn1(i3, i16, strJ111, strJ112, strJ113, strJ114));
                            } else {
                                str5 = strJ7;
                            }
                            if (str3 == null) {
                            }
                            if (str3 == null) {
                                str3 = strV;
                            }
                            strArrE0 = f35.e0(str5);
                            if (strArrE0.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrE0.length;
                                i5 = 0;
                                while (i5 < length) {
                                    str6 = strArrE0[i5];
                                    String[] strArr2 = strArrE0;
                                    int i18 = length;
                                    if (2 == lw2.h(lw2.d(str6))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str6);
                                    }
                                    i5++;
                                    length = i18;
                                    strArrE0 = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strO = b11.o(str3, ",", string);
                            } else {
                                strO = str3;
                            }
                            strJ = j(strL, z, null, map2);
                            if (strJ != null) {
                                String[] strArrSplit7 = strJ.split("x", -1);
                                i7 = Integer.parseInt(strArrSplit7[0]);
                                i6 = Integer.parseInt(strArrSplit7[1]);
                                if (i7 > 0) {
                                    i6 = -1;
                                    i7 = -1;
                                } else {
                                    i6 = -1;
                                    i7 = -1;
                                }
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                            strJ2 = j(strL, A, null, map2);
                            if (strJ2 != null) {
                                f = Float.parseFloat(strJ2);
                            } else {
                                f = -1.0f;
                            }
                            String strJ115 = j(strL, q, null, map2);
                            String strJ116 = j(strL, r, null, map2);
                            String strJ117 = j(strL, s, null, map2);
                            String strJ118 = j(strL, t, null, map2);
                            if (zStartsWith) {
                                uriH = jz4.H(str7, k(strL, pattern, map2));
                            } else {
                                if (qp4Var.j()) {
                                    throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriH = jz4.H(str7, l(map2, qp4Var.l()));
                            }
                            uri = uriH;
                            sb1 sb1Var6 = new sb1();
                            sb1Var6.a = Integer.toString(arrayList4.size());
                            sb1Var6.l = lw2.m("application/x-mpegURL");
                            sb1Var6.j = strO;
                            sb1Var6.h = i3;
                            sb1Var6.i = i16;
                            sb1Var6.t = i7;
                            sb1Var6.u = i6;
                            sb1Var6.x = f;
                            sb1Var6.f = i15;
                            arrayList4.add(new bn1(uri, new tb1(sb1Var6), strJ115, strJ116, strJ117, strJ118));
                            arrayList3 = (ArrayList) map.get(uri);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                map.put(uri, arrayList3);
                            }
                            arrayList3.add(new mn1(i3, i16, strJ115, strJ116, strJ117, strJ118));
                        }
                        strO = str5;
                        strJ = j(strL, z, null, map2);
                        if (strJ != null) {
                            String[] strArrSplit8 = strJ.split("x", -1);
                            i7 = Integer.parseInt(strArrSplit8[0]);
                            i6 = Integer.parseInt(strArrSplit8[1]);
                            if (i7 > 0) {
                                i6 = -1;
                                i7 = -1;
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                        } else {
                            i6 = -1;
                            i7 = -1;
                        }
                        strJ2 = j(strL, A, null, map2);
                        if (strJ2 != null) {
                            f = Float.parseFloat(strJ2);
                        } else {
                            f = -1.0f;
                        }
                        String strJ119 = j(strL, q, null, map2);
                        String strJ1110 = j(strL, r, null, map2);
                        String strJ1111 = j(strL, s, null, map2);
                        String strJ1112 = j(strL, t, null, map2);
                        if (zStartsWith) {
                            uriH = jz4.H(str7, k(strL, pattern, map2));
                        } else {
                            if (qp4Var.j()) {
                                throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriH = jz4.H(str7, l(map2, qp4Var.l()));
                        }
                        uri = uriH;
                        sb1 sb1Var7 = new sb1();
                        sb1Var7.a = Integer.toString(arrayList4.size());
                        sb1Var7.l = lw2.m("application/x-mpegURL");
                        sb1Var7.j = strO;
                        sb1Var7.h = i3;
                        sb1Var7.i = i16;
                        sb1Var7.t = i7;
                        sb1Var7.u = i6;
                        sb1Var7.x = f;
                        sb1Var7.f = i15;
                        arrayList4.add(new bn1(uri, new tb1(sb1Var7), strJ119, strJ1110, strJ1111, strJ1112));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new mn1(i3, i16, strJ119, strJ1110, strJ1111, strJ1112));
                    }
                    z2 = z4;
                    z3 = z5;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList26;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            arrayList9 = arrayList9;
            z2 = z4;
            z3 = z5;
            arrayList8 = arrayList12;
            arrayList11 = arrayList26;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(map, str2);
    }

    public static String k(String str, Pattern pattern, Map map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(Map map, String str) {
        Matcher matcher = K0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0095, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0047 A[SYNTHETIC] */
    @Override // defpackage.ce3
    public final dn1 a(Uri uri, gi0 gi0Var) throws ParserException {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gi0Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zN = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zN = f35.N(i2);
                            break;
                        }
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        while (i2 != -1 && Character.isWhitespace(i2) && !f35.N(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zN = f35.N(i2);
                        break;
                    }
                    if (i2 != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    i2 = bufferedReader.read();
                    i++;
                }
            }
            if (!zN) {
                throw ParserException.b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    f35.h(bufferedReader);
                    throw ParserException.b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        cn1 cn1VarF = f(new qp4(arrayDeque, bufferedReader), uri.toString());
                        f35.h(bufferedReader);
                        return cn1VarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    ym1 ym1VarE = e(this.n, this.o, new qp4(arrayDeque, bufferedReader), uri.toString());
                    f35.h(bufferedReader);
                    return ym1VarE;
                }
            }
        } catch (Throwable th) {
            f35.h(bufferedReader);
            throw th;
        }
    }

    public en1() {
        this(cn1.l, null);
    }
}
