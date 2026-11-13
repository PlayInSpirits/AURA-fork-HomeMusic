package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64
 */
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class en1
implements ce3 {
    public static final Pattern A;
    public static final Pattern A0;
    public static final Pattern B;
    public static final Pattern B0;
    public static final Pattern C;
    public static final Pattern C0;
    public static final Pattern D;
    public static final Pattern D0;
    public static final Pattern E;
    public static final Pattern E0;
    public static final Pattern F;
    public static final Pattern F0;
    public static final Pattern G;
    public static final Pattern G0;
    public static final Pattern H;
    public static final Pattern H0;
    public static final Pattern I;
    public static final Pattern I0;
    public static final Pattern J;
    public static final Pattern J0;
    public static final Pattern K;
    public static final Pattern K0;
    public static final Pattern L;
    public static final Pattern L0;
    public static final Pattern M;
    public static final Pattern N;
    public static final Pattern O;
    public static final Pattern P;
    public static final Pattern Q;
    public static final Pattern R;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public static final Pattern V;
    public static final Pattern W;
    public static final Pattern X;
    public static final Pattern Y;
    public static final Pattern Z;
    public static final Pattern a0;
    public static final Pattern b0;
    public static final Pattern c0;
    public static final Pattern d0;
    public static final Pattern e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public static final Pattern h0;
    public static final Pattern i0;
    public static final Pattern j0;
    public static final Pattern k0;
    public static final Pattern l0;
    public static final Pattern m0;
    public static final Pattern n0;
    public static final Pattern o0;
    public static final Pattern p;
    public static final Pattern p0;
    public static final Pattern q;
    public static final Pattern q0;
    public static final Pattern r;
    public static final Pattern r0;
    public static final Pattern s;
    public static final Pattern s0;
    public static final Pattern t;
    public static final Pattern t0;
    public static final Pattern u;
    public static final Pattern u0;
    public static final Pattern v;
    public static final Pattern v0;
    public static final Pattern w;
    public static final Pattern w0;
    public static final Pattern x;
    public static final Pattern x0;
    public static final Pattern y;
    public static final Pattern y0;
    public static final Pattern z;
    public static final Pattern z0;
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
        I = en1.b("CAN-SKIP-DATERANGES");
        J = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
        K = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
        L = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
        M = en1.b("CAN-BLOCK-RELOAD");
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
        j0 = en1.b("AUTOSELECT");
        k0 = en1.b("DEFAULT");
        l0 = en1.b("FORCED");
        m0 = en1.b("INDEPENDENT");
        n0 = en1.b("GAP");
        o0 = en1.b("PRECISE");
        p0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
        q0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
        r0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
        s0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
        t0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
        u0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
        v0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
        w0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
        x0 = en1.b("END-ON-NEXT");
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

    public en1() {
        this(cn1.l, null);
    }

    public en1(cn1 cn12, ym1 ym12) {
        this.n = cn12;
        this.o = ym12;
    }

    public static Pattern b(String string) {
        return Pattern.compile(string.concat("=(NO|YES)"));
    }

    public static ow0 c(String string, nw0[] nw0Array) {
        nw0[] nw0Array2 = new nw0[nw0Array.length];
        for (int i16 = 0; i16 < nw0Array.length; ++i16) {
            nw0 nw02 = nw0Array[i16];
            nw0Array2[i16] = new nw0(nw02.o, nw02.p, nw02.q, null);
        }
        return new ow0(string, true, nw0Array2);
    }

    public static nw0 d(String object, String object2, HashMap serializable) {
        String string = en1.j((String)object, Z, "1", serializable);
        boolean bl5 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(object2);
        Pattern pattern = a0;
        if (bl5) {
            object = en1.k((String)object, pattern, serializable);
            return new nw0(ax.d, null, "video/mp4", Base64.decode((String)((String)object).substring(((String)object).indexOf(44)), (int)0));
        }
        if ("com.widevine".equals(object2)) {
            serializable = ax.d;
            object2 = f35.a;
            return new nw0((UUID)serializable, null, "hls", ((String)object).getBytes(StandardCharsets.UTF_8));
        }
        if ("com.microsoft.playready".equals(object2) && "1".equals(string)) {
            object = en1.k((String)object, pattern, serializable);
            object = Base64.decode((String)((String)object).substring(((String)object).indexOf(44)), (int)0);
            object2 = ax.e;
            return new nw0((UUID)object2, null, "video/mp4", te5.d((UUID)object2, null, (byte[])object));
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ym1 e(cn1 var0, ym1 var1_1, qp4 var2_2, String var3_3) {
        var77_4 = var0;
        var76_5 = var1_1;
        var22_6 = var77_4.c;
        var93_7 = new HashMap<Object, Object>();
        var72_8 /* !! */  = new HashMap();
        var80_9 = new ArrayList();
        var82_10 = new ArrayList<Comparable>();
        var81_11 = new ArrayList<E>();
        var70_12 = new ArrayList<String>();
        var73_13 = new LinkedHashMap<K, V>();
        var71_14 = new xm1(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        var85_15 = new TreeMap<String, Object>();
        var86_16 = "";
        var83_17 = "";
        var40_18 = -9223372036854775807L;
        var24_19 = 0L;
        var26_25 = var32_24 = (var36_23 = (var30_22 = (var34_21 = (var38_20 = 0L))));
        var28_26 = -1L;
        var69_27 = null;
        var74_28 = null;
        var79_29 /* !! */  = null;
        var68_30 = null;
        var75_31 /* !! */  = null;
        var10_32 = 0;
        var11_33 = 1;
        var21_34 = false;
        var20_35 = false;
        var13_36 = 0;
        var78_37 = null;
        var9_38 = 0;
        var84_39 = null;
        var8_40 = 0;
        var14_41 = false;
        var18_42 = false;
        var42_44 = var46_43 = -9223372036854775807L;
        var44_45 = var26_25;
        var17_46 = 0;
        var48_47 = var26_25;
        block25: while (var2_2.j()) {
            block175: {
                block184: {
                    block190: {
                        block189: {
                            block188: {
                                block187: {
                                    block185: {
                                        block183: {
                                            block182: {
                                                block181: {
                                                    block180: {
                                                        block176: {
                                                            block179: {
                                                                var91_68 = var2_2.l();
                                                                if (var91_68.startsWith("#EXT")) {
                                                                    var70_12.add((String)var91_68);
                                                                }
                                                                if (var91_68.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                                                                    var87_64 = en1.k((String)var91_68, en1.G, var93_7);
                                                                    if ("VOD".equals(var87_64)) {
                                                                        var10_32 = 1;
                                                                        var19_53 = var17_46;
                                                                        var50_55 = var42_44;
                                                                        var52_56 = var40_18;
                                                                    } else {
                                                                        var19_53 = var17_46;
                                                                        var50_55 = var42_44;
                                                                        var52_56 = var40_18;
                                                                        if ("EVENT".equals(var87_64)) {
                                                                            var10_32 = 2;
                                                                            var52_56 = var40_18;
                                                                            var50_55 = var42_44;
                                                                            var19_53 = var17_46;
                                                                        }
                                                                    }
lbl60:
                                                                    // 6 sources

                                                                    while (true) {
                                                                        var40_18 = var52_56;
                                                                        var42_44 = var50_55;
                                                                        var17_46 = var19_53;
                                                                        continue block25;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var91_68.equals("#EXT-X-I-FRAMES-ONLY")) {
                                                                    var14_41 = true;
                                                                    continue;
                                                                }
                                                                if (!var91_68.startsWith("#EXT-X-START")) break block179;
                                                                var52_56 = (long)(Double.parseDouble(en1.k((String)var91_68, en1.S, Collections.EMPTY_MAP)) * 1000000.0);
                                                                var19_53 = en1.g((String)var91_68, en1.o0);
                                                                var50_55 = var42_44;
                                                                ** GOTO lbl60
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-SERVER-CONTROL")) {
                                                                var4_48 = en1.h((String)var91_68, en1.H, -9.223372036854776E18);
                                                                var50_55 = var4_48 == -9.223372036854776E18 ? -9223372036854775807L : (long)(var4_48 * 1000000.0);
                                                                var19_53 = en1.g((String)var91_68, en1.I);
                                                                var4_48 = en1.h((String)var91_68, en1.K, -9.223372036854776E18);
                                                                var52_56 = var4_48 == -9.223372036854776E18 ? -9223372036854775807L : (long)(var4_48 * 1000000.0);
                                                                var4_48 = en1.h((String)var91_68, en1.L, -9.223372036854776E18);
                                                                var54_57 = var4_48 == -9.223372036854776E18 ? -9223372036854775807L : (long)(var4_48 * 1000000.0);
                                                                var71_14 = new xm1(var50_55, (boolean)var19_53, var52_56, var54_57, en1.g((String)var91_68, en1.M));
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-PART-INF")) {
                                                                var50_55 = (long)(Double.parseDouble(en1.k((String)var91_68, en1.E, Collections.EMPTY_MAP)) * 1000000.0);
                                                                var19_53 = var17_46;
                                                                var52_56 = var40_18;
                                                                ** continue;
                                                            }
                                                            var19_53 = var91_68.startsWith("#EXT-X-MAP");
                                                            var88_65 = en1.U;
                                                            var87_64 = en1.a0;
                                                            if (var19_53 != 0) {
                                                                var78_37 = en1.k((String)var91_68, (Pattern)var87_64, var93_7);
                                                                var87_64 = en1.j((String)var91_68, (Pattern)var88_65, null, var93_7);
                                                                var50_55 = var24_19;
                                                                var52_56 = var28_26;
                                                                if (var87_64 != null) {
                                                                    var88_65 = f35.a;
                                                                    var87_64 = var87_64.split("@", -1);
                                                                    var28_26 = Long.parseLong(var87_64[var8_40]);
                                                                    var50_55 = var24_19;
                                                                    var52_56 = var28_26;
                                                                    if (((String[])var87_64).length > 1) {
                                                                        var50_55 = Long.parseLong(var87_64[1]);
                                                                        var52_56 = var28_26;
                                                                    }
                                                                }
                                                                var24_19 = (var12_50 = (cfr_temp_0 = var52_56 - -1L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false ? var26_25 : var50_55;
                                                                if (var84_39 != null && var68_30 == null) {
                                                                    throw ParserException.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                                                                }
                                                                var78_37 = new vm1((String)var78_37, var24_19, var52_56, var84_39, (String)var68_30);
                                                                var28_26 = var24_19;
                                                                if (var12_50 != false) {
                                                                    var28_26 = var24_19 + var52_56;
                                                                }
                                                                var24_19 = var28_26;
                                                                var28_26 = -1L;
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-TARGETDURATION")) {
                                                                var46_43 = (long)Integer.parseInt(en1.k((String)var91_68, en1.B, Collections.EMPTY_MAP)) * 1000000L;
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                                                var44_45 = var34_21 = Long.parseLong(en1.k((String)var91_68, en1.N, Collections.EMPTY_MAP));
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-VERSION")) {
                                                                var11_33 = Integer.parseInt(en1.k((String)var91_68, en1.F, Collections.EMPTY_MAP));
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-DEFINE")) {
                                                                var76_5 = en1.j((String)var91_68, en1.q0, null, var93_7);
                                                                if (var76_5 != null) {
                                                                    var77_4 = (String)var77_4.j.get(var76_5);
                                                                    if (var77_4 != null) {
                                                                        var93_7.put(var76_5, var77_4);
                                                                    }
                                                                } else {
                                                                    var93_7.put(en1.k((String)var91_68, en1.f0, var93_7), en1.k((String)var91_68, en1.p0, var93_7));
                                                                }
lbl135:
                                                                // 5 sources

                                                                while (true) {
                                                                    var76_5 = var80_9;
                                                                    var77_4 = var81_11;
                                                                    var80_9 = var74_28;
                                                                    var12_50 = var9_38;
                                                                    break block175;
                                                                    break;
                                                                }
                                                            }
                                                            if (var91_68.startsWith("#EXTINF")) {
                                                                var32_24 = new BigDecimal(en1.k((String)var91_68, en1.O, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                                                var83_17 = en1.j((String)var91_68, en1.P, var86_16, var93_7);
                                                                continue;
                                                            }
                                                            if (var91_68.startsWith("#EXT-X-SKIP")) {
                                                                var16_52 = Integer.parseInt(en1.k((String)var91_68, en1.J, Collections.EMPTY_MAP));
                                                                var12_50 = var76_5 != null && var80_9.isEmpty() != false ? (long)1 : (long)var8_40;
                                                                rr2.w((boolean)var12_50);
                                                                var77_4 = f35.a;
                                                                var50_55 = var76_5.k;
                                                                var87_64 = var76_5.r;
                                                                var15_51 = (int)(var44_45 - var50_55);
                                                                if (var15_51 >= 0 && (var16_52 += var15_51) <= var87_64.size()) {
                                                                    var50_55 = var36_23;
                                                                    var36_23 = var38_20;
                                                                    var12_50 = var9_38;
                                                                    var38_20 = var50_55;
                                                                    var9_38 = var16_52;
                                                                    while (var15_51 < var9_38) {
                                                                        var75_31 /* !! */  = (vm1)var87_64.get(var15_51);
                                                                        if (var44_45 != var76_5.k) {
                                                                            var16_52 = var76_5.j - var13_36 + var75_31 /* !! */ .q;
                                                                            var78_37 = var75_31 /* !! */ .z;
                                                                            var76_5 = new ArrayList<E>();
                                                                            var38_20 = var36_23;
                                                                            for (var12_50 = (long)var8_40; var12_50 < var78_37.size(); ++var12_50) {
                                                                                var77_4 = (tm1)var78_37.get((int)var12_50);
                                                                                var76_5.add(new tm1(var77_4.n, var77_4.o, var77_4.p, var16_52, var38_20, var77_4.s, var77_4.t, var77_4.u, var77_4.v, var77_4.w, var77_4.x, var77_4.y, var77_4.z));
                                                                                var38_20 += var77_4.p;
                                                                            }
                                                                            var75_31 /* !! */  = new vm1(var75_31 /* !! */ .n, var75_31 /* !! */ .o, var75_31 /* !! */ .y, var75_31 /* !! */ .p, var16_52, var36_23, var75_31 /* !! */ .s, var75_31 /* !! */ .t, var75_31 /* !! */ .u, var75_31 /* !! */ .v, var75_31 /* !! */ .w, var75_31 /* !! */ .x, (List)var76_5);
                                                                        }
                                                                        var80_9.add(var75_31 /* !! */ );
                                                                        var38_20 = var75_31 /* !! */ .p;
                                                                        var77_4 = var75_31 /* !! */ .u;
                                                                        var50_55 = var75_31 /* !! */ .w;
                                                                        if (var50_55 != -1L) {
                                                                            var24_19 = var75_31 /* !! */ .v + var50_55;
                                                                        }
                                                                        var12_50 = var75_31 /* !! */ .q;
                                                                        var78_37 = var75_31 /* !! */ .o;
                                                                        var76_5 = var75_31 /* !! */ .s;
                                                                        var84_39 = var75_31 /* !! */ .t;
                                                                        if (var77_4 == null || !var77_4.equals(Long.toHexString(var34_21))) {
                                                                            var68_30 = var77_4;
                                                                        }
                                                                        ++var34_21;
                                                                        ++var15_51;
                                                                        var75_31 /* !! */  = var76_5;
                                                                        var36_23 = var38_20 = var36_23 + var38_20;
                                                                        var76_5 = var1_1;
                                                                    }
                                                                    var77_4 = var0;
                                                                    var76_5 = var1_1;
                                                                    var50_55 = var36_23;
                                                                    var36_23 = var38_20;
                                                                    var38_20 = var50_55;
                                                                    var9_38 = (int)var12_50;
                                                                    continue;
                                                                }
                                                                throw new HlsPlaylistParser$DeltaUpdateException();
                                                            }
                                                            if (!var91_68.startsWith("#EXT-X-KEY")) break block180;
                                                            var88_65 = en1.k((String)var91_68, en1.X, var93_7);
                                                            var84_39 = en1.j((String)var91_68, en1.Y, "identity", var93_7);
                                                            if ("NONE".equals(var88_65)) {
                                                                var85_15.clear();
                                                                var68_30 = null;
lbl206:
                                                                // 2 sources

                                                                while (true) {
                                                                    var75_31 /* !! */  = null;
lbl208:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var84_39 = null;
                                                                        break block176;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            var76_5 = en1.j((String)var91_68, en1.b0, null, var93_7);
                                                            if (!"identity".equals(var84_39)) ** GOTO lbl222
                                                            var77_4 = var74_28;
                                                            if ("AES-128".equals(var88_65)) {
                                                                var84_39 = en1.k((String)var91_68, (Pattern)var87_64, var93_7);
                                                                var68_30 = var76_5;
                                                            } else {
                                                                while (true) {
                                                                    var68_30 = var76_5;
                                                                    var74_28 = var77_4;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl222:
                                                                // 1 sources

                                                                var68_30 = var74_28;
                                                                if (var74_28 == null) {
                                                                    var68_30 = !"SAMPLE-AES-CENC".equals(var88_65) && !"SAMPLE-AES-CTR".equals(var88_65) ? "cbcs" : "cenc";
                                                                }
                                                                var74_28 = en1.d((String)var91_68, var84_39, var93_7);
                                                                var77_4 = var68_30;
                                                                if (var74_28 == null) ** continue;
                                                                var85_15.put(var84_39, var74_28);
                                                                var74_28 = var68_30;
                                                                var68_30 = var76_5;
                                                                ** continue;
                                                            }
                                                        }
                                                        var77_4 = var0;
                                                        var76_5 = var1_1;
                                                        continue;
                                                    }
                                                    if (var91_68.startsWith("#EXT-X-BYTERANGE")) {
                                                        var77_4 = en1.k((String)var91_68, en1.T, var93_7);
                                                        var76_5 = f35.a;
                                                        var76_5 = var77_4.split("@", -1);
                                                        var28_26 = var52_56 = Long.parseLong(var76_5[var8_40]);
                                                        var50_55 = var30_22;
                                                        var12_50 = var9_38;
                                                        if (((String[])var76_5).length > 1) {
                                                            var24_19 = Long.parseLong(var76_5[1]);
                                                            var12_50 = var9_38;
                                                            var50_55 = var30_22;
                                                            var28_26 = var52_56;
                                                        }
lbl250:
                                                        // 5 sources

                                                        while (true) {
                                                            var77_4 = var0;
                                                            var76_5 = var1_1;
                                                            var30_22 = var50_55;
                                                            var9_38 = (int)var12_50;
                                                            continue block25;
                                                            break;
                                                        }
                                                    }
                                                    if (var91_68.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        var13_36 = Integer.parseInt(var91_68.substring(var91_68.indexOf(58) + 1));
                                                        var77_4 = var0;
                                                        var76_5 = var1_1;
                                                        var20_35 = true;
                                                        continue;
                                                    }
                                                    if (!var91_68.equals("#EXT-X-DISCONTINUITY")) break block181;
                                                    var12_50 = var9_38 + 1;
                                                    var50_55 = var30_22;
                                                    ** GOTO lbl250
                                                }
                                                if (!var91_68.startsWith("#EXT-X-PROGRAM-DATE-TIME")) break block182;
                                                if (var30_22 != var26_25) ** GOTO lbl135
                                                var50_55 = f35.Q(f35.T(var91_68.substring(var91_68.indexOf(58) + 1))) - var38_20;
                                                var12_50 = var9_38;
                                                ** continue;
                                            }
                                            if (var91_68.equals("#EXT-X-GAP")) {
                                                var77_4 = var0;
                                                var76_5 = var1_1;
                                                var18_42 = true;
                                                continue;
                                            }
                                            if (var91_68.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                var77_4 = var0;
                                                var76_5 = var1_1;
                                                var22_6 = true;
                                                continue;
                                            }
                                            if (var91_68.equals("#EXT-X-ENDLIST")) {
                                                var77_4 = var0;
                                                var76_5 = var1_1;
                                                var21_34 = true;
                                                continue;
                                            }
                                            if (!var91_68.startsWith("#EXT-X-RENDITION-REPORT")) break block183;
                                            var50_55 = en1.i((String)var91_68, en1.Q);
                                            var76_5 = en1.R.matcher((CharSequence)var91_68);
                                            if (var76_5.find()) {
                                                var76_5 = var76_5.group(1);
                                                var76_5.getClass();
                                                var12_50 = Integer.parseInt((String)var76_5);
                                            } else {
                                                var12_50 = -1;
                                            }
                                            var81_11.add(new um1(Uri.parse((String)jz4.G(var3_3, en1.k((String)var91_68, (Pattern)var87_64, var93_7))), var50_55, (int)var12_50));
                                            ** GOTO lbl135
                                        }
                                        if (var91_68.startsWith("#EXT-X-PRELOAD-HINT")) {
                                            if (var69_27 == null && "PART".equals(en1.k((String)var91_68, en1.d0, var93_7))) ** break;
                                            ** continue;
                                            var87_64 = en1.k((String)var91_68, (Pattern)var87_64, var93_7);
                                            var50_55 = en1.i((String)var91_68, en1.V);
                                            var52_56 = en1.i((String)var91_68, en1.W);
                                            var76_5 = var84_39 == null ? null : (var68_30 != null ? var68_30 : Long.toHexString(var34_21));
                                            if (var75_31 /* !! */  == null && !var85_15.isEmpty()) {
                                                var88_65 = var85_15.values().toArray(new nw0[var8_40]);
                                                var77_4 = new ow0((String)var74_28, true, (nw0[])var88_65);
                                                var75_31 /* !! */  = var79_29 /* !! */ ;
                                                if (var79_29 /* !! */  == null) {
                                                    var75_31 /* !! */  = en1.c((String)var74_28, (nw0[])var88_65);
                                                }
                                                var79_29 /* !! */  = var75_31 /* !! */ ;
                                                var75_31 /* !! */  = var77_4;
                                            }
                                            if ((var8_40 = (int)((cfr_temp_1 = var50_55 - -1L) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0 || var52_56 != -1L) {
                                                if (var8_40 == 0) {
                                                    var50_55 = var26_25;
                                                }
                                                var69_27 = new tm1((String)var87_64, (vm1)var78_37, 0L, var9_38, var36_23, (ow0)var75_31 /* !! */ , var84_39, (String)var76_5, var50_55, var52_56, false, false, true);
                                            }
                                            var77_4 = var0;
                                            var76_5 = var1_1;
                                            var8_40 = 0;
                                            continue;
                                        }
                                        if (var91_68.startsWith("#EXT-X-PART")) {
                                            var76_5 = var84_39 == null ? null : (var68_30 != null ? var68_30 : Long.toHexString(var34_21));
                                            var87_64 = en1.k((String)var91_68, (Pattern)var87_64, var93_7);
                                            var52_56 = (long)(Double.parseDouble(en1.k((String)var91_68, en1.C, Collections.EMPTY_MAP)) * 1000000.0);
                                            var19_53 = en1.g((String)var91_68, en1.m0);
                                            var8_40 = var22_6 != false && var82_10.isEmpty() != false ? 1 : 0;
                                            var23_54 = en1.g((String)var91_68, en1.n0);
                                            if ((var88_65 = en1.j((String)var91_68, (Pattern)var88_65, null, var93_7)) != null) {
                                                var77_4 = f35.a;
                                                var77_4 = var88_65.split("@", -1);
                                                var50_55 = Long.parseLong(var77_4[0]);
                                                if (((Object[])var77_4).length > 1) {
                                                    var48_47 = Long.parseLong((String)var77_4[1]);
                                                }
                                            } else {
                                                var50_55 = -1L;
                                            }
                                            var12_50 = (cfr_temp_2 = var50_55 - -1L) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                            if (var12_50 == false) {
                                                var48_47 = var26_25;
                                            }
                                            if (var75_31 /* !! */  == null && !var85_15.isEmpty()) {
                                                var88_65 = var85_15.values().toArray(new nw0[0]);
                                                var77_4 = new ow0((String)var74_28, true, (nw0[])var88_65);
                                                var75_31 /* !! */  = var79_29 /* !! */ ;
                                                if (var79_29 /* !! */  == null) {
                                                    var75_31 /* !! */  = en1.c((String)var74_28, (nw0[])var88_65);
                                                }
                                                var79_29 /* !! */  = var75_31 /* !! */ ;
                                                var75_31 /* !! */  = var77_4;
                                            }
                                            var82_10.add(new tm1((String)var87_64, (vm1)var78_37, var52_56, var9_38, var36_23, (ow0)var75_31 /* !! */ , var84_39, (String)var76_5, var48_47, var50_55, var23_54, (boolean)(var19_53 | var8_40), false));
                                            var52_56 = var36_23 + var52_56;
                                            var36_23 = var48_47;
                                            if (var12_50 != false) {
                                                var36_23 = var48_47 + var50_55;
                                            }
                                            var48_47 = var36_23;
                                            var76_5 = var1_1;
                                            var8_40 = 0;
                                            var77_4 = var0;
                                            var36_23 = var52_56;
                                            continue;
                                        }
                                        if (!var91_68.startsWith("#EXT-X-DATERANGE") || !en1.j((String)var91_68, en1.s0, var86_16, var93_7).equals("com.apple.hls.interstitial")) break block184;
                                        var94_70 = en1.k((String)var91_68, en1.r0, var93_7);
                                        var76_5 = en1.j((String)var91_68, en1.y0, null, var93_7);
                                        var88_65 = var76_5 != null ? Uri.parse((String)var76_5) : null;
                                        var76_5 = en1.j((String)var91_68, en1.z0, null, var93_7);
                                        var89_66 = var76_5 != null ? Uri.parse((String)var76_5) : null;
                                        var76_5 = en1.j((String)var91_68, en1.t0, null, var93_7);
                                        var50_55 = var76_5 != null ? f35.Q(f35.T((String)var76_5)) : -9223372036854775807L;
                                        var76_5 = en1.j((String)var91_68, en1.v0, null, var93_7);
                                        var52_56 = var76_5 != null ? f35.Q(f35.T((String)var76_5)) : -9223372036854775807L;
                                        var96_72 = new ArrayList<Object>();
                                        var76_5 = en1.j((String)var91_68, en1.u0, null, var93_7);
                                        if (var76_5 == null) break block185;
                                        var77_4 = f35.a;
                                        var76_5 = var76_5.split(",", -1);
                                        var12_50 = ((Object)var76_5).length;
                                        block34: for (var15_51 = 0; var15_51 < var12_50; ++var15_51) {
                                            block177: {
                                                block186: {
                                                    var77_4 = var76_5[var15_51].trim();
                                                    var77_4.getClass();
                                                    switch (var77_4.hashCode()) {
                                                        default: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                var8_40 = -1;
                                                                break block177;
                                                                break;
                                                            }
                                                        }
                                                        case 2461856: {
                                                            if (!var77_4.equals("POST")) break;
                                                            var8_40 = 2;
                                                            break block177;
                                                        }
                                                        case 2430593: {
                                                            if (!var77_4.equals("ONCE")) break;
                                                            var8_40 = 1;
                                                            break block177;
                                                        }
                                                        case 79491: {
                                                            if (var77_4.equals("PRE")) break block186;
                                                        }
                                                    }
                                                    ** continue;
                                                }
                                                var8_40 = 0;
                                            }
                                            switch (var8_40) {
                                                default: {
                                                    continue block34;
                                                }
                                                case 0: 
                                                case 1: 
                                                case 2: {
                                                    var96_72.add(var77_4);
                                                }
                                            }
                                        }
                                    }
                                    var54_57 = (var4_48 = en1.h((String)var91_68, en1.D, -1.0)) >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var4_48 = en1.h((String)var91_68, en1.w0, -1.0);
                                    var56_58 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var23_54 = en1.g((String)var91_68, en1.x0);
                                    var4_48 = en1.h((String)var91_68, en1.A0, 4.9E-324);
                                    var58_59 = var4_48 != 4.9E-324 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var76_5 = en1.B0;
                                    var4_48 = en1.h((String)var91_68, (Pattern)var76_5, -1.0);
                                    var60_60 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var95_71 = new ArrayList<Object>();
                                    var76_5 = en1.j((String)var91_68, en1.C0, null, var93_7);
                                    if (var76_5 != null) {
                                        var77_4 = f35.a;
                                        var77_4 = var76_5.split(",", -1);
                                        var12_50 = ((Object)var77_4).length;
                                        var8_40 = 0;
                                        while (true) {
                                            var76_5 = var81_11;
                                            if (var8_40 >= var12_50) break;
                                            var76_5 = var77_4[var8_40].trim();
                                            var76_5.getClass();
                                            if (var76_5.equals("IN") || var76_5.equals("OUT")) {
                                                var95_71.add(var76_5);
                                            }
                                            ++var8_40;
                                        }
lbl437:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var76_5 = var81_11;
                                    ** continue;
                                    var81_11 = var76_5;
                                    var97_73 = new ArrayList<Object>();
                                    var77_4 = en1.j((String)var91_68, en1.D0, null, var93_7);
                                    if (var77_4 != null) {
                                        var76_5 = f35.a;
                                        var76_5 = var77_4.split(",", -1);
                                        var12_50 = ((Object)var76_5).length;
                                        for (var8_40 = 0; var8_40 < var12_50; ++var8_40) {
                                            var77_4 = var76_5[var8_40].trim();
                                            var77_4.getClass();
                                            if (!var77_4.equals("JUMP") && !var77_4.equals("SKIP")) continue;
                                            var97_73.add(var77_4);
                                        }
                                    }
                                    var87_64 = (var76_5 = en1.j((String)var91_68, en1.E0, null, var93_7)) != null ? Boolean.valueOf(var76_5.equals("NO") ^ true) : null;
                                    var77_4 = en1.j((String)var91_68, en1.F0, null, var93_7);
                                    if (var77_4 == null) break block187;
                                    var76_5 = "RANGE";
                                    if (var77_4.equals("RANGE")) break block188;
                                    var76_5 = "POINT";
                                    if (var77_4.equals("POINT")) break block188;
                                }
                                var76_5 = null;
                            }
                            var90_67 = en1.j((String)var91_68, en1.G0, null, var93_7);
                            if (var90_67 == null) break block189;
                            var77_4 = "PRIMARY";
                            if (var90_67.equals("PRIMARY")) break block190;
                            var77_4 = "HIGHLIGHT";
                            if (var90_67.equals("HIGHLIGHT")) break block190;
                        }
                        var77_4 = null;
                    }
                    var4_48 = en1.h((String)var91_68, en1.H0, -1.0);
                    var62_61 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                    var4_48 = en1.h((String)var91_68, en1.I0, -1.0);
                    var64_62 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                    var90_67 = en1.j((String)var91_68, en1.J0, null, var93_7);
                    var98_74 = new ArrayList<Object>();
                    var99_75 = var91_68.substring(17);
                    var92_69 = en1.L0.matcher((CharSequence)var99_75);
                    var91_68 = var76_5;
                    while (var92_69.find()) {
                        block178: {
                            block191: {
                                var76_5 = var92_69.group();
                                var76_5.getClass();
                                switch (var76_5.hashCode()) {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var8_40 = -1;
                                            break block178;
                                            break;
                                        }
                                    }
                                    case 2080546752: {
                                        if (!var76_5.equals("X-SKIP-CONTROL-LABEL-ID=")) break;
                                        var8_40 = 11;
                                        break block178;
                                    }
                                    case 1814205923: {
                                        if (!var76_5.equals("X-ASSET-URI=")) break;
                                        var8_40 = 10;
                                        break block178;
                                    }
                                    case 1748487807: {
                                        if (!var76_5.equals("X-RESUME-OFFSET=")) break;
                                        var8_40 = 9;
                                        break block178;
                                    }
                                    case 1472528844: {
                                        if (!var76_5.equals("X-RESTRICT=")) break;
                                        var8_40 = 8;
                                        break block178;
                                    }
                                    case 1274498945: {
                                        if (!var76_5.equals("X-SKIP-CONTROL-OFFSET=")) break;
                                        var8_40 = 7;
                                        break block178;
                                    }
                                    case 1065650400: {
                                        if (!var76_5.equals("X-SKIP-CONTROL-DURATION=")) break;
                                        var8_40 = 6;
                                        break block178;
                                    }
                                    case 850193465: {
                                        if (!var76_5.equals("X-TIMELINE-OCCUPIES=")) break;
                                        var8_40 = 5;
                                        break block178;
                                    }
                                    case 397239341: {
                                        if (!var76_5.equals("X-ASSET-LIST=")) break;
                                        var8_40 = 4;
                                        break block178;
                                    }
                                    case -36345757: {
                                        if (!var76_5.equals("X-TIMELINE-STYLE=")) break;
                                        var8_40 = 3;
                                        break block178;
                                    }
                                    case -148960310: {
                                        if (!var76_5.equals("X-PLAYOUT-LIMIT=")) break;
                                        var8_40 = 2;
                                        break block178;
                                    }
                                    case -1843050726: {
                                        if (!var76_5.equals("X-CONTENT-MAY-VARY=")) break;
                                        var8_40 = 1;
                                        break block178;
                                    }
                                    case -2136701954: {
                                        if (var76_5.equals("X-SNAP=")) break block191;
                                    }
                                }
                                ** continue;
                            }
                            var8_40 = 0;
                        }
                        switch (var8_40) {
                            default: {
                                var76_5 = var76_5.substring(0, var76_5.length() - 1);
                                var100_76 = var76_5.concat("=");
                                var8_40 = var99_75.indexOf(var100_76);
                                var12_50 = var100_76.length() + var8_40;
                                var8_40 = var99_75.length() == var12_50 + true ? 1 : 2;
                                var100_76 = var99_75.substring((int)var12_50, var8_40 + var12_50);
                                var76_5 = var100_76.startsWith("\"") ? new qm1(0, (String)var76_5, en1.k((String)var99_75, Pattern.compile(var76_5.concat("=\"((?:.|\f)+?)\"")), var93_7)) : (!var100_76.equals("0x") && !var100_76.equals("0X") ? new qm1((String)var76_5, Double.parseDouble(en1.k((String)var99_75, Pattern.compile(var76_5.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP))) : new qm1(1, (String)var76_5, en1.k((String)var99_75, Pattern.compile(var76_5.concat("=(0[xX][A-F0-9]+)")), var93_7)));
                                var98_74.add(var76_5);
                            }
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 11: 
                        }
                    }
                    var76_5 = var80_9;
                    var80_9 = var73_13.containsKey(var94_70) != false ? (rm1)var73_13.get(var94_70) : new rm1(var94_70);
                    if (var88_65 == null) {
                        var80_9.getClass();
                    } else {
                        var92_69 = var80_9.c;
                        if (var92_69 != null) {
                            rr2.p(var92_69.equals(var88_65), "Can't change assetUri from %s to %s", var80_9.c, var88_65);
                        }
                        var80_9.c = var88_65;
                    }
                    if (var89_66 != null) {
                        var88_65 = var80_9.d;
                        if (var88_65 != null) {
                            rr2.p(var88_65.equals(var89_66), "Can't change assetListUri from %s to %s", var80_9.d, var89_66);
                        }
                        var80_9.d = var89_66;
                    }
                    if (var50_55 != -9223372036854775807L) {
                        var66_63 = var80_9.e;
                        if (var66_63 != -9223372036854775807L) {
                            var19_53 = var66_63 == var50_55 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change startDateUnixUs from %s to %s", var66_63, var50_55);
                        }
                        var80_9.e = var50_55;
                    }
                    if (var52_56 != -9223372036854775807L) {
                        var50_55 = var80_9.f;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var52_56 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change endDateUnixUs from %s to %s", var50_55, var52_56);
                        }
                        var80_9.f = var52_56;
                    }
                    if (var54_57 != -9223372036854775807L) {
                        var50_55 = var80_9.g;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var54_57 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change durationUs from %s to %s", var50_55, var54_57);
                        }
                        var80_9.g = var54_57;
                    }
                    if (var56_58 != -9223372036854775807L) {
                        var50_55 = var80_9.h;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var56_58 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change plannedDurationUs from %s to %s", var50_55, var56_58);
                        }
                        var80_9.h = var56_58;
                    }
                    if (!var96_72.isEmpty()) {
                        if (!var80_9.i.isEmpty()) {
                            var19_53 = var80_9.i.equals(var96_72);
                            var89_66 = new StringBuilder("Can't change cue from ");
                            var88_65 = var80_9.i;
                            var92_69 = new StringBuilder();
                            var99_75 = var88_65.iterator();
                            if (var99_75.hasNext()) {
                                var88_65 = (CharSequence)var99_75.next();
                                while (true) {
                                    var92_69.append((CharSequence)var88_65);
                                    if (!var99_75.hasNext()) break;
                                    var92_69.append((CharSequence)", ");
                                    var88_65 = (CharSequence)var99_75.next();
                                }
                            }
                            var89_66.append(var92_69.toString());
                            var89_66.append(" to ");
                            var88_65 = new StringBuilder();
                            var92_69 = var96_72.iterator();
                            if (var92_69.hasNext()) {
                                while (true) {
                                    var88_65.append((CharSequence)var92_69.next());
                                    if (!var92_69.hasNext()) break;
                                    var88_65.append((CharSequence)", ");
                                }
                            }
                            var89_66.append(var88_65.toString());
                            rr2.k(var89_66.toString(), (boolean)var19_53);
                        }
                        var80_9.i = var96_72;
                    }
                    if (var23_54) {
                        var80_9.j = true;
                    }
                    if (var58_59 != -9223372036854775807L) {
                        var50_55 = var80_9.k;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var58_59 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change resumeOffsetUs from %s to %s", var50_55, var58_59);
                        }
                        var80_9.k = var58_59;
                    }
                    if (var60_60 != -9223372036854775807L) {
                        var50_55 = var80_9.l;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var60_60 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change playoutLimitUs from %s to %s", var50_55, var60_60);
                        }
                        var80_9.l = var60_60;
                    }
                    if (!var95_71.isEmpty()) {
                        if (!var80_9.m.isEmpty()) {
                            var19_53 = var80_9.m.equals(var95_71);
                            var88_65 = new StringBuilder("Can't change snapTypes from ");
                            var92_69 = var80_9.m;
                            var89_66 = new StringBuilder();
                            if ((var92_69 = var92_69.iterator()).hasNext()) {
                                while (true) {
                                    var89_66.append((CharSequence)var92_69.next());
                                    if (!var92_69.hasNext()) break;
                                    var89_66.append((CharSequence)", ");
                                }
                            }
                            var88_65.append(var89_66.toString());
                            var88_65.append(" to ");
                            var89_66 = new StringBuilder();
                            var92_69 = var95_71.iterator();
                            if (var92_69.hasNext()) {
                                while (true) {
                                    var89_66.append((CharSequence)var92_69.next());
                                    if (!var92_69.hasNext()) break;
                                    var89_66.append((CharSequence)", ");
                                }
                            }
                            var88_65.append(var89_66.toString());
                            rr2.k(var88_65.toString(), (boolean)var19_53);
                        }
                        var80_9.m = var95_71;
                    }
                    if (!var97_73.isEmpty()) {
                        if (!var80_9.n.isEmpty()) {
                            var19_53 = var80_9.n.equals(var97_73);
                            var88_65 = new StringBuilder("Can't change restrictions from ");
                            var92_69 = var80_9.n;
                            var89_66 = new StringBuilder();
                            if ((var92_69 = var92_69.iterator()).hasNext()) {
                                while (true) {
                                    var89_66.append((CharSequence)var92_69.next());
                                    if (!var92_69.hasNext()) break;
                                    var89_66.append((CharSequence)", ");
                                }
                            }
                            var88_65.append(var89_66.toString());
                            var88_65.append(" to ");
                            var92_69 = new StringBuilder();
                            var89_66 = var97_73.iterator();
                            if (var89_66.hasNext()) {
                                while (true) {
                                    var92_69.append((CharSequence)var89_66.next());
                                    if (!var89_66.hasNext()) break;
                                    var92_69.append((CharSequence)", ");
                                }
                            }
                            var88_65.append(var92_69.toString());
                            rr2.k(var88_65.toString(), (boolean)var19_53);
                        }
                        var80_9.n = var97_73;
                    }
                    var88_65 = var80_9.b;
                    if (!var98_74.isEmpty()) {
                        for (var8_40 = 0; var8_40 < var98_74.size(); ++var8_40) {
                            var92_69 = (qm1)var98_74.get(var8_40);
                            var89_66 = var92_69.a;
                            var96_72 = (qm1)var88_65.get(var89_66);
                            if (var96_72 != null) {
                                var19_53 = var96_72.equals(var92_69);
                                var95_71 = var96_72.d;
                                var6_49 = var96_72.c;
                                var96_72 = var92_69.d;
                                var4_48 = var92_69.c;
                                if (var19_53 == 0) {
                                    kf2.n(gh0.s("Can't change %s from %s %s to %s %s", new Object[]{var89_66, var95_71, var6_49, var96_72, var4_48}));
                                    return null;
                                }
                            }
                            var88_65.put(var89_66, var92_69);
                        }
                    }
                    if (var87_64 != null) {
                        var88_65 = var80_9.o;
                        if (var88_65 != null) {
                            rr2.p(var88_65.equals(var87_64), "Can't change contentMayVary from %s to %s", var80_9.o, var87_64);
                        }
                        var80_9.o = var87_64;
                    }
                    if (var91_68 != null) {
                        var87_64 = var80_9.p;
                        if (var87_64 != null) {
                            rr2.p(var87_64.equals(var91_68), "Can't change timelineOccupies from %s to %s", var80_9.p, var91_68);
                        }
                        var80_9.p = var91_68;
                    }
                    if (var77_4 != null) {
                        var87_64 = var80_9.q;
                        if (var87_64 != null) {
                            rr2.p(var87_64.equals(var77_4), "Can't change timelineStyle from %s to %s", var80_9.q, var77_4);
                        }
                        var80_9.q = var77_4;
                    }
                    if (var62_61 != -9223372036854775807L) {
                        var50_55 = var80_9.r;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var62_61 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change skipControlOffsetUs from %s to %s", var50_55, var62_61);
                        }
                        var80_9.r = var62_61;
                    }
                    if (var64_62 != -9223372036854775807L) {
                        var50_55 = var80_9.s;
                        if (var50_55 != -9223372036854775807L) {
                            var19_53 = var50_55 == var64_62 ? 1 : 0;
                            rr2.n((boolean)var19_53, "Can't change skipControlDurationUs from %s to %s", var50_55, var64_62);
                        }
                        var80_9.s = var64_62;
                    }
                    if (var90_67 != null) {
                        var77_4 = var80_9.t;
                        if (var77_4 != null) {
                            rr2.p(var77_4.equals(var90_67), "Can't change skipControlLabelId from %s to %s", var80_9.t, var90_67);
                        }
                        var80_9.t = var90_67;
                    }
                    var73_13.put(var94_70, var80_9);
                    var77_4 = var81_11;
                    while (true) {
                        var8_40 = var9_38;
                        var80_9 = var74_28;
                        var8_40 = 0;
                        break block175;
                        break;
                    }
                }
                var77_4 = var81_11;
                var76_5 = var80_9;
                if (var91_68.startsWith("#")) ** continue;
                var76_5 = var84_39 == null ? null : (var68_30 != null ? var68_30 : Long.toHexString(var34_21));
                var88_65 = en1.l(var93_7, (String)var91_68);
                var87_64 = var72_8 /* !! */ ;
                var72_8 /* !! */  = (vm1)var87_64.get(var88_65);
                cfr_temp_3 = var28_26 - -1L;
                var8_40 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                if (var8_40 == 0) {
                    var24_19 = var26_25;
                } else if (var14_41 && var78_37 == null && var72_8 /* !! */  == null) {
                    var72_8 /* !! */  = new vm1((String)var88_65, 0L, var24_19, null, null);
                    var87_64.put(var88_65, var72_8 /* !! */ );
                }
                if (var75_31 /* !! */  != null || var85_15.isEmpty()) ** GOTO lbl-1000
                var77_4 = var85_15.values().toArray(new nw0[0]);
                var75_31 /* !! */  = new ow0((String)var74_28, true, (nw0[])var77_4);
                if (var79_29 /* !! */  == null) {
                    var77_4 = en1.c((String)var74_28, (nw0[])var77_4);
                } else lbl-1000:
                // 2 sources

                {
                    var77_4 = var79_29 /* !! */ ;
                }
                if (var78_37 != null) {
                    var72_8 /* !! */  = var78_37;
                }
                var72_8 /* !! */  = new vm1((String)var88_65, (vm1)var72_8 /* !! */ , var83_17, var32_24, var9_38, var38_20, (ow0)var75_31 /* !! */ , var84_39, (String)var76_5, var24_19, var28_26, var18_42, var82_10);
                var80_9.add(var72_8 /* !! */ );
                var32_24 = var38_20 + var32_24;
                var82_10 = new ArrayList<E>();
                if (var8_40 != 0) {
                    var24_19 += var28_26;
                }
                ++var34_21;
                var79_29 /* !! */  = var77_4;
                var8_40 = 0;
                var18_42 = false;
                var38_20 = var32_24;
                var83_17 = var86_16;
                var50_55 = var26_25;
                var28_26 = -1L;
                var77_4 = var0;
                var76_5 = var1_1;
                var72_8 /* !! */  = var87_64;
                var36_23 = var32_24;
                var32_24 = var50_55;
                continue;
            }
            var81_11 = var0;
            var80_9 = var1_1;
            var87_64 = var77_4;
            var88_65 = var76_5;
            var77_4 = var81_11;
            var76_5 = var80_9;
            var80_9 = var88_65;
            var81_11 = var87_64;
        }
        var0 = var80_9;
        var2_2 = var81_11;
        var72_8 /* !! */  = new HashMap<K, V>();
        while (var8_40 < var2_2.size()) {
            var74_28 = (um1)var2_2.get(var8_40);
            var24_19 = var28_26 = var74_28.b;
            if (var28_26 == -1L) {
                var24_19 = var44_45 + (long)var0.size() - (long)var82_10.isEmpty();
            }
            if ((var9_38 = var74_28.c) == -1 && var42_44 != -9223372036854775807L) {
                var68_30 = var82_10.isEmpty() != false ? ((vm1)te5.w((Iterable)var0)).z : var82_10;
                var9_38 = var68_30.size() - 1;
            }
            var68_30 = var74_28.a;
            var72_8 /* !! */ .put(var68_30, new um1((Uri)var68_30, var24_19, var9_38));
            ++var8_40;
        }
        if (var69_27 != null) {
            var82_10.add((Comparable)var69_27);
        }
        var74_28 = new ArrayList<E>();
        var2_2 = var73_13.values().iterator();
        var68_30 = var72_8 /* !! */ ;
        while (var2_2.hasNext()) {
            var78_37 = (rm1)var2_2.next();
            var77_4 = var78_37.d;
            if ((var77_4 == null && var78_37.c != null || var77_4 != null && var78_37.c == null) && (var34_21 = var78_37.e) != -9223372036854775807L) {
                var83_17 = var78_37.a;
                var75_31 /* !! */  = var78_37.c;
                var38_20 = var78_37.f;
                var36_23 = var78_37.g;
                var24_19 = var78_37.h;
                var80_9 = var78_37.i;
                var19_53 = var78_37.j;
                var28_26 = var78_37.k;
                var32_24 = var78_37.l;
                var76_5 = var78_37.m;
                var73_13 = var78_37.n;
                var81_11 = new ArrayList<V>(var78_37.b.values());
                var69_27 = var78_37.o;
                var18_42 = var69_27 == null || var69_27.booleanValue();
                var69_27 = var78_37.p;
                if (var69_27 == null) {
                    var69_27 = "POINT";
                }
                var72_8 /* !! */  = var78_37.q;
                if (var72_8 /* !! */  == null) {
                    var72_8 /* !! */  = "HIGHLIGHT";
                }
                var69_27 = new sm1(var83_17, (Uri)var75_31 /* !! */ , (Uri)var77_4, var34_21, var38_20, var36_23, var24_19, (ArrayList)var80_9, (boolean)var19_53, var28_26, var32_24, (ArrayList)var76_5, (ArrayList)var73_13, (ArrayList)var81_11, var18_42, (String)var69_27, (String)var72_8 /* !! */ , var78_37.r, var78_37.s, var78_37.t);
            } else {
                var69_27 = null;
            }
            if (var69_27 == null) continue;
            var74_28.add(var69_27);
        }
        if (var30_22 == var26_25 && var1_1 != null && var1_1.p) {
            var30_22 = var1_1.h;
        }
        var18_42 = var30_22 != var26_25;
        return new ym1(var10_32, var3_3, var70_12, var40_18, (boolean)var17_46, var30_22, var20_35, var13_36, var44_45, var11_33, var46_43, var42_44, var22_6, var21_34, var18_42, (ow0)var79_29 /* !! */ , (List)var0, var82_10, var71_14, (Map)var68_30, (List)var74_28);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static cn1 f(qp4 var0, String var1_1) {
        var22_2 = new HashMap<K, V>();
        var26_3 = new HashMap<String, String>();
        var27_4 = new ArrayList<bn1>();
        var20_5 = new ArrayList<an1>();
        var14_6 = new ArrayList<E>();
        var13_7 = new ArrayList<E>();
        var19_8 = new ArrayList<E>();
        var15_9 = new ArrayList<String>();
        var17_10 = new ArrayList<ow0>();
        var18_11 = new ArrayList<String>();
        var3_12 = 0;
        var10_13 = false;
        while (true) {
            block71: {
                block80: {
                    block79: {
                        block78: {
                            block77: {
                                block76: {
                                    block75: {
                                        block74: {
                                            block73: {
                                                block72: {
                                                    block70: {
                                                        var11_21 = var0.j();
                                                        var28_28 = en1.a0;
                                                        var4_15 = var3_12;
                                                        var29_29 = en1.f0;
                                                        if (!var11_21) break;
                                                        var25_27 = var0.l();
                                                        if (var25_27.startsWith("#EXT")) {
                                                            var18_11.add((String)var25_27);
                                                        }
                                                        var11_21 = var25_27.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                                                        if (!var25_27.startsWith("#EXT-X-DEFINE")) break block70;
                                                        var26_3.put(en1.k((String)var25_27, (Pattern)var29_29, var26_3), en1.k((String)var25_27, en1.p0, var26_3));
                                                        break block71;
                                                    }
                                                    if (var25_27.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                        var3_12 = var4_15;
                                                        var10_13 = true;
                                                        continue;
                                                    }
                                                    if (!var25_27.startsWith("#EXT-X-MEDIA")) break block72;
                                                    var15_9.add(var25_27);
                                                    break block71;
                                                }
                                                if (!var25_27.startsWith("#EXT-X-SESSION-KEY")) break block73;
                                                var21_24 = en1.d((String)var25_27, en1.j((String)var25_27, en1.Y, "identity", var26_3), var26_3);
                                                if (var21_24 != null) {
                                                    var16_23 = en1.k((String)var25_27, en1.X, var26_3);
                                                    var16_23 = !"SAMPLE-AES-CENC".equals(var16_23) && !"SAMPLE-AES-CTR".equals(var16_23) ? "cbcs" : "cenc";
                                                    var17_10.add(new ow0((String)var16_23, true, new nw0[]{var21_24}));
                                                }
                                                break block71;
                                            }
                                            if (!var25_27.startsWith("#EXT-X-STREAM-INF") && !var11_21) break block71;
                                            var12_22 = var25_27.contains("CLOSED-CAPTIONS=NONE");
                                            var3_12 = var11_21 != false ? 16384 : 0;
                                            var7_18 = var4_15 | var12_22;
                                            var9_20 = Integer.parseInt(en1.k((String)var25_27, en1.u, Collections.EMPTY_MAP));
                                            var16_23 = en1.p.matcher((CharSequence)var25_27);
                                            if (var16_23.find()) {
                                                var16_23 = var16_23.group(1);
                                                var16_23.getClass();
                                                var4_15 = Integer.parseInt((String)var16_23);
                                            } else {
                                                var4_15 = -1;
                                            }
                                            var29_29 = en1.j((String)var25_27, en1.w, null, var26_3);
                                            var23_25 = en1.j((String)var25_27, en1.x, null, var26_3);
                                            var16_23 = en1.j((String)var25_27, en1.y, null, var26_3);
                                            if (var16_23 == null) break block74;
                                            var21_24 = f35.a;
                                            var21_24 = var16_23.split(",", 2)[0].split("/", -1);
                                            var16_23 = var21_24[0];
                                            if (((String[])var21_24).length <= 1) break block75;
                                            var21_24 = var21_24[1];
                                            break block76;
                                        }
                                        var16_23 = null;
                                    }
                                    var21_24 = null;
                                }
                                var24_26 = f35.v(2, (String)var23_25);
                                var30_30 = lw2.a;
                                if (var24_26 == null || !(var24_26.startsWith("dvhe") != false || var24_26.startsWith("dvh1") != false) && (var16_23 == null || !(var16_23.startsWith("dvhe") != false && var24_26.startsWith("hev1") != false || var16_23.startsWith("dvh1") != false && var24_26.startsWith("hvc1") != false || var16_23.startsWith("dvav") != false && var24_26.startsWith("avc3") != false || var16_23.startsWith("dva1") != false && var24_26.startsWith("avc1") != false) && (!var16_23.startsWith("dav1") || !var24_26.startsWith("av01"))) || var16_23 != null && (var29_29 == null || var21_24 == null || var29_29.equals("PQ") && !var21_24.equals("db1p") || var29_29.equals("SDR") && !var21_24.equals("db2g") || var29_29.equals("HLG") && !var21_24.startsWith("db4"))) break block77;
                                if (var16_23 == null) {
                                    var16_23 = var24_26;
                                }
                                var21_24 = f35.e0((String)var23_25);
                                if (((Object)var21_24).length == 0) ** GOTO lbl-1000
                                var23_25 = new StringBuilder();
                                for (Object var24_26 : var21_24) {
                                    if (2 == lw2.h(lw2.d((String)var24_26))) continue;
                                    if (var23_25.length() > 0) {
                                        var23_25.append(",");
                                    }
                                    var23_25.append((String)var24_26);
                                }
                                if (var23_25.length() > 0) {
                                    var21_24 = var23_25.toString();
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var21_24 = null;
                                }
                                if (var21_24 != null) {
                                    var16_23 = b11.o((String)var16_23, ",", (String)var21_24);
                                }
                                break block78;
                            }
                            var16_23 = var23_25;
                        }
                        var21_24 = en1.j((String)var25_27, en1.z, null, var26_3);
                        if (var21_24 == null) break block79;
                        var21_24 = var21_24.split("x", -1);
                        var6_17 = Integer.parseInt((String)var21_24[0]);
                        var8_19 = Integer.parseInt((String)var21_24[1]);
                        if (var6_17 <= 0) break block79;
                        var5_16 = var8_19;
                        if (var8_19 > 0) break block80;
                    }
                    var5_16 = -1;
                    var6_17 = -1;
                }
                var2_14 = (var21_24 = en1.j((String)var25_27, en1.A, null, var26_3)) != null ? Float.parseFloat((String)var21_24) : -1.0f;
                var24_26 = en1.j((String)var25_27, en1.q, null, var26_3);
                var29_29 = en1.j((String)var25_27, en1.r, null, var26_3);
                var31_31 = en1.j((String)var25_27, en1.s, null, var26_3);
                var30_30 = en1.j((String)var25_27, en1.t, null, var26_3);
                if (var11_21) {
                    var21_24 = jz4.H(var1_1, en1.k((String)var25_27, var28_28, var26_3));
                } else {
                    if (!var0.j()) {
                        throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                    }
                    var21_24 = jz4.H(var1_1, en1.l(var26_3, var0.l()));
                }
                var23_25 = new sb1();
                var23_25.a = Integer.toString(var27_4.size());
                var23_25.l = lw2.m("application/x-mpegURL");
                var23_25.j = var16_23;
                var23_25.h = var4_15;
                var23_25.i = var9_20;
                var23_25.t = var6_17;
                var23_25.u = var5_16;
                var23_25.x = var2_14;
                var23_25.f = var3_12;
                var27_4.add(new bn1((Uri)var21_24, new tb1((sb1)var23_25), (String)var24_26, (String)var29_29, var31_31, (String)var30_30));
                var23_25 = (ArrayList)var22_2.get(var21_24);
                var16_23 = var23_25;
                if (var23_25 == null) {
                    var16_23 = new ArrayList<mn1>();
                    var22_2.put(var21_24, var16_23);
                }
                var16_23.add(new mn1(var4_15, var9_20, (String)var24_26, (String)var29_29, var31_31, (String)var30_30));
                var4_15 = var7_18;
            }
            var3_12 = var4_15;
        }
        var16_23 = var13_7;
        var21_24 = new ArrayList<E>();
        var13_7 = new HashSet<E>();
        var0 = var22_2;
        for (var3_12 = 0; var3_12 < var27_4.size(); ++var3_12) {
            var22_2 = (bn1)var27_4.get(var3_12);
            var24_26 = var22_2.a;
            var23_25 = var22_2.b;
            if (!var13_7.add((Uri)var24_26)) continue;
            var11_21 = var23_25.l == null;
            rr2.w(var11_21);
            var24_26 = (ArrayList)var0.get(var22_2.a);
            var24_26.getClass();
            var24_26 = new qv2(new pv2[]{new nn1(null, null, (List)var24_26)});
            var23_25 = var23_25.a();
            var23_25.k = var24_26;
            var23_25 = new tb1((sb1)var23_25);
            var21_24.add(new bn1(var22_2.a, (tb1)var23_25, var22_2.c, var22_2.d, var22_2.e, var22_2.f));
        }
        var6_17 = 0;
        var0 = null;
        var22_2 = null;
        var13_7 = var14_6;
        var14_6 = var22_2;
        while (true) {
            block82: {
                block69: {
                    block83: {
                        block81: {
                            if (var6_17 >= var15_9.size()) break block81;
                            var24_26 = (String)var15_9.get(var6_17);
                            var33_33 = en1.k((String)var24_26, en1.g0, var26_3);
                            var31_31 = en1.k((String)var24_26, (Pattern)var29_29, var26_3);
                            var30_30 = new sb1();
                            var30_30.a = b11.o(var33_33, ":", var31_31);
                            var30_30.b = var31_31;
                            var30_30.l = lw2.m("application/x-mpegURL");
                            var5_16 = en1.g((String)var24_26, en1.k0);
                            var3_12 = var5_16;
                            if (en1.g((String)var24_26, en1.l0)) {
                                var3_12 = var5_16 | 2;
                            }
                            if (en1.g((String)var24_26, en1.j0)) {
                                var3_12 |= 4;
                            }
                            var30_30.e = var3_12;
                            var22_2 = en1.j((String)var24_26, en1.h0, null, var26_3);
                            if (TextUtils.isEmpty((CharSequence)var22_2)) {
                                var3_12 = 0;
                            } else {
                                var23_25 = f35.a;
                                var5_16 = f35.m((Object[])(var22_2 = var22_2.split(",", -1)), "public.accessibility.describes-video") != false ? 512 : 0;
                                var3_12 = var5_16;
                                if (f35.m((Object[])var22_2, "public.accessibility.transcribes-spoken-dialog")) {
                                    var3_12 = var5_16 | 4096;
                                }
                                var5_16 = var3_12;
                                if (f35.m((Object[])var22_2, "public.accessibility.describes-music-and-sound")) {
                                    var5_16 = var3_12 | 1024;
                                }
                                var3_12 = var5_16;
                                if (f35.m((Object[])var22_2, "public.easy-to-read")) {
                                    var3_12 = var5_16 | 8192;
                                }
                            }
                            var25_27 = var15_9;
                            var30_30.f = var3_12;
                            var30_30.d = en1.j((String)var24_26, en1.e0, null, var26_3);
                            var15_9 = en1.j((String)var24_26, var28_28, null, var26_3);
                            var22_2 = var15_9 == null ? null : jz4.H(var1_1, (String)var15_9);
                            var32_32 = new qv2(new pv2[]{new nn1(var33_33, var31_31, Collections.EMPTY_LIST)});
                            var15_9 = en1.k((String)var24_26, en1.c0, var26_3);
                            tmp = -1;
                            switch (var15_9.hashCode()) {
                                case 81665115: {
                                    if (!var15_9.equals("VIDEO")) break;
                                    tmp = 1;
                                    break;
                                }
                                case 62628790: {
                                    if (!var15_9.equals("AUDIO")) break;
                                    tmp = 2;
                                    break;
                                }
                                case -333210994: {
                                    if (!var15_9.equals("CLOSED-CAPTIONS")) break;
                                    tmp = 3;
                                    break;
                                }
                                case -959297733: {
                                    if (!var15_9.equals("SUBTITLES")) break;
                                    tmp = 4;
                                    break;
                                }
                            }
                            switch (tmp) {
                                default: {
                                    var3_12 = -1;
                                    break;
                                }
                                case 1: {
                                    var3_12 = 3;
                                    break;
                                }
                                case 2: {
                                    var3_12 = 2;
                                    break;
                                }
                                case 3: {
                                    var3_12 = 1;
                                    break;
                                }
                                case 4: {
                                    var3_12 = 0;
                                }
                            }
                            switch (var3_12) {
                                case 3: {
                                    for (var3_12 = 0; var3_12 < var27_4.size(); ++var3_12) {
                                        var15_9 = (bn1)var27_4.get(var3_12);
                                        if (!var33_33.equals(var15_9.c)) {
                                            continue;
                                        }
                                        ** GOTO lbl253
                                    }
                                    var15_9 = null;
lbl253:
                                    // 2 sources

                                    if (var15_9 != null) {
                                        var23_25 = var15_9.b;
                                        var30_30.j = var15_9 = f35.v(2, var23_25.k);
                                        var30_30.m = lw2.m(lw2.d((String)var15_9));
                                        var30_30.t = var23_25.u;
                                        var30_30.u = var23_25.v;
                                        var30_30.x = var23_25.y;
                                    }
                                    if (var22_2 != null) ** GOTO lbl263
                                }
                                default: {
                                    break block82;
                                }
lbl263:
                                // 1 sources

                                var30_30.k = var32_32;
                                var20_5.add(new an1((Uri)var22_2, new tb1((sb1)var30_30), var31_31));
                                break block82;
                                case 2: {
                                    for (var3_12 = 0; var3_12 < var27_4.size(); ++var3_12) {
                                        var23_25 = (bn1)var27_4.get(var3_12);
                                        if (!var33_33.equals(var23_25.d)) {
                                            continue;
                                        }
                                        ** GOTO lbl274
                                    }
                                    var23_25 = null;
lbl274:
                                    // 2 sources

                                    if (var23_25 != null) {
                                        var30_30.j = var15_9 = f35.v(1, var23_25.b.k);
                                        var15_9 = lw2.d((String)var15_9);
                                    } else {
                                        var15_9 = null;
                                    }
                                    var33_33 = en1.j((String)var24_26, en1.v, null, var26_3);
                                    var24_26 = var15_9;
                                    if (var33_33 != null) {
                                        var24_26 = f35.a;
                                        var30_30.E = Integer.parseInt(var33_33.split("/", 2)[0]);
                                        var24_26 = var15_9;
                                        if ("audio/eac3".equals(var15_9)) {
                                            var24_26 = var15_9;
                                            if (var33_33.endsWith("/JOC")) {
                                                var30_30.j = "ec+3";
                                                var24_26 = "audio/eac3-joc";
                                            }
                                        }
                                    }
                                    var30_30.m = lw2.m((String)var24_26);
                                    if (var22_2 == null) ** GOTO lbl296
                                    var30_30.k = var32_32;
                                    var13_7.add(new an1((Uri)var22_2, new tb1((sb1)var30_30), var31_31));
                                    break block82;
lbl296:
                                    // 1 sources

                                    var15_9 = var0;
                                    if (var23_25 == null) ** GOTO lbl315
                                    var14_6 = new tb1((sb1)var30_30);
                                    break block82;
                                }
                                case 1: {
                                    var15_9 = en1.k((String)var24_26, en1.i0, var26_3);
                                    if (var15_9.startsWith("CC")) {
                                        var3_12 = Integer.parseInt(var15_9.substring(2));
                                        var22_2 = "application/cea-608";
                                    } else {
                                        var3_12 = Integer.parseInt(var15_9.substring(7));
                                        var22_2 = "application/cea-708";
                                    }
                                    var15_9 = var0;
                                    if (var0 == null) {
                                        var15_9 = new ArrayList<tb1>();
                                    }
                                    var30_30.m = lw2.m((String)var22_2);
                                    var30_30.J = var3_12;
                                    var15_9.add(new tb1((sb1)var30_30));
lbl315:
                                    // 2 sources

                                    var0 = var15_9;
                                    break block82;
                                }
                                case 0: 
                            }
                            break block83;
                        }
                        if (var4_15 != 0) {
                            var0 = Collections.EMPTY_LIST;
                        }
                        return new cn1(var1_1, var18_11, (List)var21_24, var20_5, (List)var13_7, (List)var16_23, var19_8, (tb1)var14_6, (List)var0, var10_13, var26_3, var17_10);
                    }
                    for (var3_12 = 0; var3_12 < var27_4.size(); ++var3_12) {
                        var15_9 = (bn1)var27_4.get(var3_12);
                        if (!var33_33.equals(var15_9.e)) {
                            continue;
                        }
                        break block69;
                    }
                    var15_9 = null;
                }
                if (var15_9 != null) {
                    var30_30.j = var15_9 = f35.v(3, var15_9.b.k);
                    var15_9 = lw2.d((String)var15_9);
                } else {
                    var15_9 = null;
                }
                var23_25 = var15_9;
                if (var15_9 == null) {
                    var23_25 = "text/vtt";
                }
                var30_30.m = lw2.m((String)var23_25);
                var30_30.k = var32_32;
                if (var22_2 != null) {
                    var16_23.add(new an1((Uri)var22_2, new tb1((sb1)var30_30), var31_31));
                } else {
                    l93.q0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                }
            }
            ++var6_17;
            var15_9 = var25_27;
        }
    }

    public static boolean g(String object, Pattern pattern) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            return "YES".equals(((Matcher)object).group(1));
        }
        return false;
    }

    public static double h(String object, Pattern pattern, double d16) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            object = ((Matcher)object).group(1);
            object.getClass();
            return Double.parseDouble((String)object);
        }
        return d16;
    }

    public static long i(String object, Pattern pattern) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            object = ((Matcher)object).group(1);
            object.getClass();
            return Long.parseLong((String)object);
        }
        return -1L;
    }

    public static String j(String object, Pattern pattern, String string, Map map) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            string = ((Matcher)object).group(1);
            string.getClass();
        }
        if (!map.isEmpty() && string != null) {
            return en1.l(map, string);
        }
        return string;
    }

    public static String k(String string, Pattern pattern, Map object) {
        if ((object = en1.j(string, pattern, null, (Map)object)) != null) {
            return object;
        }
        object = new StringBuilder("Couldn't match ");
        ((StringBuilder)object).append(pattern.pattern());
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(string);
        throw ParserException.b(((StringBuilder)object).toString());
    }

    public static String l(Map map, String charSequence) {
        Matcher matcher = K0.matcher(charSequence);
        charSequence = new StringBuffer();
        while (matcher.find()) {
            String string = matcher.group(1);
            if (!map.containsKey(string)) continue;
            matcher.appendReplacement((StringBuffer)charSequence, Matcher.quoteReplacement((String)map.get(string)));
        }
        matcher.appendTail((StringBuffer)charSequence);
        return ((StringBuffer)charSequence).toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public final dn1 a(Uri var1_1, gi0 var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [11 : 268->417)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

