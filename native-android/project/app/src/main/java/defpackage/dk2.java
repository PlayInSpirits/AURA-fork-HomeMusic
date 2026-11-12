package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dk2 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public dk2(String r1, String r2, String r3, MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.g = r5;
        this.e = r8;
        this.f = r9;
        this.h = r10;
        this.i = lw2.l(r2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        int r0 = r3.getWidthAlignment();
        int r1 = r3.getHeightAlignment();
        Point r2 = new Point(f35.g(r4, r0) * r0, f35.g(r5, r1) * r1);
        int r7 = r2.x;
        int r8 = r2.y;
        if (r6 == (-1.0d)) goto L20;
        if (r6 < 1.0d) goto L20;
        double r9 = Math.floor(r6);
        if (r3.areSizeAndRateSupported(r7, r8, r9) == false) goto L22;
        Range<Double> r10 = r3.getAchievableFrameRatesFor(r7, r8);
        if (r10 != null) goto L14;
        return true;
    L14:
        if (r9 > ((Double) r10.getUpper()).doubleValue()) goto L17;
        return true;
    L17:
        return false;
    L22:
        return false;
    L20:
        return r3.isSizeSupported(r7, r8);
    }

    public static dk2 i(String r11, String r12, String r13, MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17) {
        if (r14 != null) goto L5;
    L7:
        boolean r8 = false;
    L8:
        if (r14 == null) goto L10;
        r14.isFeatureSupported("tunneled-playback");
    L10:
        if (r14 != null) goto L12;
    L14:
        boolean r9 = false;
    L16:
        if (Build.VERSION.SDK_INT < 35) goto L32;
        if (r14 == null) goto L32;
        if (r14.isFeatureSupported("detached-surface") == false) goto L32;
        String r3 = Build.MANUFACTURER;
        if (r3.equals("Xiaomi") == true) goto L32;
        if (r3.equals("OPPO") == true) goto L32;
        if (r3.equals("realme") == true) goto L32;
        if (r3.equals("motorola") == true) goto L32;
        if (r3.equals("LENOVO") == true) goto L32;
        boolean r10 = true;
    L34:
        return new dk2(r11, r12, r13, r14, r15, r16, r17, r8, r9, r10);
    L32:
        r10 = false;
        goto L34
    L12:
        if (r14.isFeatureSupported("secure-playback") == false) goto L14;
        r9 = true;
        goto L16
    L5:
        if (r14.isFeatureSupported("adaptive-playback") == false) goto L7;
        r8 = true;
        goto L8
    }

    public final ej0 b(tb1 r9, tb1 r10) {
        String r0 = r9.n;
        c50 r1 = r9.D;
        String r2 = r10.n;
        c50 r3 = r10.D;
        boolean r4 = Objects.equals(r0, r2);
        boolean r5 = false;
        if (r4 == true) goto L5;
        int r6 = 8;
    L7:
        if (this.i == true) goto L9;
        tb1 r7 = r9;
        tb1 r8 = r10;
        if (r7.F == r8.F) goto L67;
        r6 = r6 | 4096;
    L67:
        if (r7.G == r8.G) goto L70;
        r6 = r6 | 8192;
    L70:
        if (r7.H == r8.H) goto L72;
        r6 = r6 | 16384;
    L72:
        String r11 = this.b;
        if (r6 == 0) goto L75;
    L92:
        if (r6 != 0) goto L100;
        if (r11.equals("audio/eac3-joc") == true) goto L98;
        if (r11.equals("audio/eac3") == false) goto L100;
    L98:
        return new ej0(this.a, r7, r8, 3, 0);
    L100:
        if (r7.b(r8) == true) goto L103;
        r6 = r6 | 32;
    L103:
        if ("audio/opus".equals(r11) == false) goto L105;
        r6 = r6 | 2;
    L105:
        if (r6 == 0) goto L107;
    L109:
        return new ej0(this.a, r7, r8, 0, r6);
    L107:
        return new ej0(this.a, r7, r8, 1, 0);
    L75:
        if (r11.equals("audio/mp4a-latm") == false) goto L77;
    L78:
        Pair r12 = i40.b(r7);
        Pair r13 = i40.b(r8);
        if (r12 == null) goto L92;
        if (r13 == null) goto L92;
        int r14 = ((Integer) r12.first).intValue();
        int r15 = ((Integer) r13.first).intValue();
        if (r14 != 42) goto L87;
        if (r15 != 42) goto L87;
        return new ej0(this.a, r7, r8, 3, 0);
    L87:
        if (r11.equals("audio/ac4") == false) goto L92;
        if (r12.equals(r13) == false) goto L92;
        return new ej0(this.a, r7, r8, 3, 0);
    L77:
        if (r11.equals("audio/ac4") == false) goto L92;
    L9:
        if (r9.z == r10.z) goto L12;
        r6 = r6 | 1024;
    L12:
        if (r9.u == r10.u) goto L14;
    L15:
        r5 = true;
    L17:
        if (this.e == true) goto L21;
        if (r5 == false) goto L21;
        r6 = r6 | 512;
    L21:
        if (c50.e(r1) == false) goto L25;
        if (c50.e(r3) == false) goto L25;
    L28:
        if (Build.MODEL.startsWith("SM-T230") == true) goto L30;
    L34:
        int r16 = r9.w;
        if (r16 == (-1)) goto L44;
        int r17 = r9.x;
        if (r17 == (-1)) goto L44;
        if (r16 != r10.w) goto L44;
        if (r17 != r10.x) goto L44;
        if (r5 == false) goto L44;
        r6 = r6 | 2;
    L44:
        if (r6 == 0) goto L46;
    L53:
        if (r6 == 0) goto L55;
        r7 = r9;
        r8 = r10;
        goto L109
    L55:
        if (r9.b(r10) == false) goto L58;
        int r18 = 3;
    L60:
        return new ej0(this.a, r9, r10, r18, 0);
    L58:
        r18 = 2;
        goto L60
    L46:
        if (Objects.equals(r10.n, "video/dolby-vision") == false) goto L53;
        Pair r19 = i40.b(r9);
        Pair r20 = i40.b(r10);
        if (r19 == null) goto L52;
        if (r20 == null) goto L52;
        if (((Integer) r19.first).equals(r20.first) == true) goto L53;
    L52:
        r6 = r6 | 2;
        goto L53
    L30:
        if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) == false) goto L34;
        if (r9.b(r10) == true) goto L34;
        r6 = r6 | 2;
    L25:
        if (Objects.equals(r1, r3) == true) goto L28;
        r6 = r6 | 2048;
        goto L28
    L14:
        if (r9.v == r10.v) goto L17;
    L5:
        r6 = 0;
        goto L7
    }

    public final boolean c(Context r17, tb1 r18, boolean r19) {
        Pair r2 = i40.b(r18);
        String r3 = r18.n;
        byte r4 = -1;
        String r6 = this.c;
        if (r3 != null) goto L5;
    L15:
        if (r2 == null) goto L83;
        int r8 = ((Integer) r2.first).intValue();
        int r5 = ((Integer) r2.second).intValue();
        boolean r7 = "video/dolby-vision".equals(r3);
        int r9 = 8;
        String r11 = this.b;
        if (r7 == false) goto L40;
        r11.getClass();
        switch(r11.hashCode()) {
            case -1662735862: goto L31;
            case -1662541442: goto L27;
            case 1331836730: goto L23;
            default: goto L34;
        };
    L34:
        switch(r4) {
            case 0: goto L38;
            case 1: goto L38;
            case 2: goto L36;
            default: goto L40;
        };
    L36:
        r8 = 8;
    L37:
        r5 = 0;
        goto L40
    L38:
        r8 = 2;
        goto L37
    L23:
        if (r11.equals("video/avc") == false) goto L34;
        r4 = 2;
        goto L34
    L27:
        if (r11.equals("video/hevc") == false) goto L34;
        r4 = 1;
        goto L34
    L31:
        if (r11.equals("video/av01") == false) goto L34;
        r4 = 0;
    L40:
        if (this.i == false) goto L42;
    L46:
        MediaCodecInfo.CodecCapabilities r10 = this.d;
        if (r10 == null) goto L50;
        MediaCodecInfo.CodecProfileLevel[] r13 = r10.profileLevels;
        if (r13 == null) goto L50;
    L52:
        if (r11.equals("audio/ac4") == true) goto L54;
    L68:
        int r12 = r13.length;
        int r14 = 0;
    L69:
        if (r14 >= r12) goto L85;
        MediaCodecInfo.CodecProfileLevel r15 = r13[r14];
        if (r15.profile != r8) goto L84;
        if (r15.level >= r5) goto L76;
        if (r19 == true) goto L84;
    L76:
        if ("video/hevc".equals(r11) == false) goto L83;
        if (2 != r8) goto L83;
        String r16 = Build.DEVICE;
        if ("sailfish".equals(r16) == true) goto L84;
        if ("marlin".equals(r16) == false) goto L83;
    L84:
        r14 = r14 + 1;
        goto L69
    L85:
        h("codec.profileLevel, " + r18.k + ", " + r6);
        return false;
    L54:
        if (r13.length != 0) goto L68;
        if (r10 == null) goto L59;
        MediaCodecInfo.AudioCapabilities r20 = r10.getAudioCapabilities();
        if (r20 == null) goto L59;
        int r21 = r20.getMaxInputChannelCount();
    L61:
        if (r21 <= 18) goto L64;
        r9 = 16;
    L64:
        if (r17.getPackageManager().hasSystemFeature("android.hardware.type.automotive") == false) goto L67;
        MediaCodecInfo.CodecProfileLevel[] r22 = {jk2.b(1026, r9)};
    L66:
        r13 = r22;
        goto L68
    L67:
        r22 = new MediaCodecInfo.CodecProfileLevel[]{jk2.b(257, r9), jk2.b(513, r9), jk2.b(514, r9), jk2.b(1026, r9), jk2.b(1028, r9)};
    L59:
        r21 = 2;
    L50:
        r13 = new MediaCodecInfo.CodecProfileLevel[0];
        goto L52
    L42:
        if (r11.equals("audio/ac4") == true) goto L46;
        if (r8 == 42) goto L46;
    L83:
        return true;
    L5:
        if (r3.equals("video/mv-hevc") == false) goto L15;
        String r23 = lw2.m(r6);
        if (r23.equals("video/mv-hevc") == true) goto L83;
        if (r23.equals("video/hevc") == false) goto L15;
        HashMap r24 = jk2.a;
        String r25 = uc5.q(r18.q);
        if (r25 != null) goto L14;
        r2 = null;
        goto L15
    L14:
        String r26 = r25.trim();
        String r27 = f35.a;
        r2 = i40.c(r25, r26.split("\\.", -1), r18.D);
        goto L15
    }

    public final boolean d(tb1 r3) {
        if (Objects.equals(r3.n, "audio/flac") == true) goto L5;
        return true;
    L5:
        if (r3.H == 22) goto L7;
        return true;
    L7:
        if (Build.VERSION.SDK_INT < 34) goto L9;
        return true;
    L9:
        if (this.a.equals("c2.android.flac.decoder") == false) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean e(Context r7, tb1 r8) {
        String r0 = r8.n;
        String r1 = this.b;
        if (r1.equals(r0) == true) goto L9;
        if (r1.equals(jk2.c(r8)) == true) goto L9;
        return false;
    L9:
        if (c(r7, r8, true) == true) goto L12;
    L13:
        return false;
    L12:
        if (d(r8) == false) goto L13;
        if (this.i == false) goto L23;
        int r9 = r8.u;
        if (r9 <= 0) goto L85;
        int r2 = r8.v;
        if (r2 <= 0) goto L85;
        return g(r9, r2, r8.y);
    L85:
        return true;
    L23:
        int r10 = r8.G;
        MediaCodecInfo.CodecCapabilities r3 = this.d;
        if (r10 == (-1)) goto L36;
        if (r3 != null) goto L28;
        h("sampleRate.caps");
        return false;
    L28:
        MediaCodecInfo.AudioCapabilities r5 = r3.getAudioCapabilities();
        if (r5 != null) goto L33;
        h("sampleRate.aCaps");
        return false;
    L33:
        if (r5.isSampleRateSupported(r10) == true) goto L36;
        h("sampleRate.support, " + r10);
        return false;
    L36:
        int r11 = r8.F;
        if (r11 == (-1)) goto L85;
        if (r3 != null) goto L41;
        h("channelCount.caps");
        return false;
    L41:
        MediaCodecInfo.AudioCapabilities r12 = r3.getAudioCapabilities();
        if (r12 != null) goto L45;
        h("channelCount.aCaps");
        return false;
    L45:
        int r13 = r12.getMaxInputChannelCount();
        if (r13 <= 1) goto L48;
    L82:
        if (r13 >= r11) goto L85;
        h("channelCount.support, " + r11);
        return false;
    L48:
        if (Build.VERSION.SDK_INT < 26) goto L52;
        if (r13 > 0) goto L82;
    L52:
        if ("audio/mpeg".equals(r1) == true) goto L82;
        if ("audio/3gpp".equals(r1) == true) goto L82;
        if ("audio/amr-wb".equals(r1) == true) goto L82;
        if ("audio/mp4a-latm".equals(r1) == true) goto L82;
        if ("audio/vorbis".equals(r1) == true) goto L82;
        if ("audio/opus".equals(r1) == true) goto L82;
        if ("audio/raw".equals(r1) == true) goto L82;
        if ("audio/flac".equals(r1) == true) goto L82;
        if ("audio/g711-alaw".equals(r1) == true) goto L82;
        if ("audio/g711-mlaw".equals(r1) == true) goto L82;
        if ("audio/gsm".equals(r1) == true) goto L82;
        if ("audio/ac3".equals(r1) == false) goto L78;
        int r4 = 6;
    L81:
        l93.q0("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + r13 + " to " + r4 + "]");
        r13 = r4;
        goto L82
    L78:
        if ("audio/eac3".equals(r1) == false) goto L80;
        r4 = 16;
        goto L81
    L80:
        r4 = 30;
        goto L81
    }

    public final boolean f(tb1 r2) {
        if (this.i == true) goto L5;
        Pair r1 = i40.b(r2);
        if (r1 != null) goto L9;
        return false;
    L9:
        if (((Integer) r1.first).intValue() != 42) goto L14;
        return true;
    L14:
        return false;
    L5:
        return this.e;
    }

    public final boolean g(int r12, int r13, double r14) {
        MediaCodecInfo.CodecCapabilities r1 = this.d;
        if (r1 != null) goto L6;
        h("sizeAndRate.caps");
        return false;
    L6:
        MediaCodecInfo.VideoCapabilities r2 = r1.getVideoCapabilities();
        if (r2 != null) goto L10;
        h("sizeAndRate.vCaps");
        return false;
    L10:
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 29) goto L58;
        if (r3 < 29) goto L51;
        Boolean r4 = uc5.j;
        if (r4 != null) goto L17;
    L19:
        List r5 = yj1.e(r2);
        if (r5 == null) goto L51;
        if (r5.isEmpty() == true) goto L51;
        ek2.m();
        MediaCodecInfo.VideoCapabilities.PerformancePoint r8 = ek2.h(r12, r13, (int) r14);
        int r9 = 0;
    L26:
        if (r9 >= r5.size()) goto L31;
        if (ek2.t(yj1.c(r5.get(r9)), r8) == true) goto L29;
        r9 = r9 + 1;
        goto L26
    L29:
        char r6 = 2;
    L32:
        if (r6 == 1) goto L34;
    L52:
        if (r6 == 2) goto L72;
        if (r6 != 1) goto L58;
        StringBuilder r15 = b11.t("sizeAndRate.cover, ", "x", r12, r13, "@");
        r15.append(r14);
        h(r15.toString());
        return false;
    L72:
        return true;
    L34:
        if (uc5.j != null) goto L52;
        if (r3 < 35) goto L38;
        int r7 = 2;
    L39:
        int r10 = q05.k(true);
        if (r7 != 0) goto L42;
    L41:
        boolean r11 = true;
    L49:
        uc5.j = Boolean.valueOf(r11);
        if (r11 == false) goto L52;
    L42:
        if (r10 != 0) goto L46;
        if (r7 != 2) goto L41;
    L45:
        r11 = false;
        goto L49
    L46:
        if (r7 != 2) goto L41;
        if (r10 == 2) goto L45;
    L38:
        r7 = q05.k(false);
        goto L39
    L31:
        r6 = 1;
        goto L32
    L17:
        if (r4.booleanValue() == false) goto L19;
    L51:
        r6 = 0;
    L58:
        if (a(r2, r12, r13, r14) == true) goto L72;
        if (r12 >= r13) goto L70;
        String r16 = this.a;
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(r16) == false) goto L66;
        if ("mcv5a".equals(Build.DEVICE) == true) goto L70;
    L66:
        if (a(r2, r13, r12, r14) == false) goto L70;
        StringBuilder r17 = b11.t("sizeAndRate.rotated, ", "x", r12, r13, "@");
        r17.append(r14);
        StringBuilder r18 = b11.u("AssumedSupport [", r17.toString(), "] [", r16, ", ");
        r18.append(this.b);
        r18.append("] [");
        r18.append(f35.a);
        r18.append("]");
        l93.A("MediaCodecInfo", r18.toString());
        return true;
    L70:
        StringBuilder r19 = b11.t("sizeAndRate.support, ", "x", r12, r13, "@");
        r19.append(r14);
        h(r19.toString());
        return false;
    }

    public final void h(String r3) {
        StringBuilder r4 = xa3.j("NoSupport [", r3, "] [");
        r4.append(this.a);
        r4.append(", ");
        r4.append(this.b);
        r4.append("] [");
        r4.append(f35.a);
        r4.append("]");
        l93.A("MediaCodecInfo", r4.toString());
    }

    public final String toString() {
        return this.a;
    }
}
