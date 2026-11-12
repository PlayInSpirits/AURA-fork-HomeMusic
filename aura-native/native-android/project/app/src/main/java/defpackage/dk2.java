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

    public dk2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = lw2.l(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(f35.g(i, widthAlignment) * widthAlignment, f35.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static dk2 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new dk2(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final ej0 b(tb1 tb1Var, tb1 tb1Var2) {
        tb1 tb1Var3;
        tb1 tb1Var4;
        int i;
        String str = tb1Var.n;
        c50 c50Var = tb1Var.D;
        String str2 = tb1Var2.n;
        c50 c50Var2 = tb1Var2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (tb1Var.z != tb1Var2.z) {
                i2 |= 1024;
            }
            boolean z = (tb1Var.u == tb1Var2.u && tb1Var.v == tb1Var2.v) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!c50.e(c50Var) || !c50.e(c50Var2)) && !Objects.equals(c50Var, c50Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !tb1Var.b(tb1Var2)) {
                i2 |= 2;
            }
            int i3 = tb1Var.w;
            if (i3 != -1 && (i = tb1Var.x) != -1 && i3 == tb1Var2.w && i == tb1Var2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(tb1Var2.n, "video/dolby-vision")) {
                Pair pairB = i40.b(tb1Var);
                Pair pairB2 = i40.b(tb1Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new ej0(this.a, tb1Var, tb1Var2, tb1Var.b(tb1Var2) ? 3 : 2, 0);
            }
            tb1Var3 = tb1Var;
            tb1Var4 = tb1Var2;
        } else {
            tb1Var3 = tb1Var;
            tb1Var4 = tb1Var2;
            if (tb1Var3.F != tb1Var4.F) {
                i2 |= 4096;
            }
            if (tb1Var3.G != tb1Var4.G) {
                i2 |= 8192;
            }
            if (tb1Var3.H != tb1Var4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = i40.b(tb1Var3);
                Pair pairB4 = i40.b(tb1Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ej0(this.a, tb1Var3, tb1Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new ej0(this.a, tb1Var3, tb1Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new ej0(this.a, tb1Var3, tb1Var4, 3, 0);
            }
            if (!tb1Var3.b(tb1Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new ej0(this.a, tb1Var3, tb1Var4, 1, 0);
            }
        }
        return new ej0(this.a, tb1Var3, tb1Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x004e, please report this as an issue */
    public final boolean c(Context context, tb1 tb1Var, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int maxInputChannelCount;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pairB = i40.b(tb1Var);
        String str2 = tb1Var.n;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM = lw2.m(str3);
            if (!strM.equals("video/mv-hevc")) {
                if (strM.equals("video/hevc")) {
                    HashMap map = jk2.a;
                    String strQ = uc5.q(tb1Var.q);
                    if (strQ == null) {
                        pairB = null;
                    } else {
                        String strTrim = strQ.trim();
                        String str4 = f35.a;
                        pairB = i40.c(strQ, strTrim.split("\\.", -1), tb1Var.D);
                    }
                }
                if (pairB != null) {
                    iIntValue = ((Integer) pairB.first).intValue();
                    iIntValue2 = ((Integer) pairB.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iIntValue = 2;
                                break;
                            case "video/avc":
                                iIntValue = 8;
                                break;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.i) {
                        codecCapabilities = this.d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                maxInputChannelCount = 2;
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{jk2.b(1026, i2)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{jk2.b(257, i2), jk2.b(513, i2), jk2.b(514, i2), jk2.b(1026, i2), jk2.b(1028, i2)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i = 0; i < length; i++) {
                            codecProfileLevel = codecProfileLevelArr[i];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        h("codec.profileLevel, " + tb1Var.k + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            maxInputChannelCount = 2;
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{jk2.b(1026, i2)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{jk2.b(257, i2), jk2.b(513, i2), jk2.b(514, i2), jk2.b(1026, i2), jk2.b(1028, i2)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i < length) {
                        codecProfileLevel = codecProfileLevelArr[i];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    h("codec.profileLevel, " + tb1Var.k + ", " + str3);
                    return false;
                }
            }
        } else if (pairB != null) {
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dk2.c(android.content.Context, tb1, boolean):boolean");
            }

            public final boolean d(tb1 tb1Var) {
                return (Objects.equals(tb1Var.n, "audio/flac") && tb1Var.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
            }

            public final boolean e(Context context, tb1 tb1Var) {
                int i;
                int i2;
                String str = tb1Var.n;
                String str2 = this.b;
                if ((!str2.equals(str) && !str2.equals(jk2.c(tb1Var))) || !c(context, tb1Var, true) || !d(tb1Var)) {
                    return false;
                }
                if (this.i) {
                    int i3 = tb1Var.u;
                    if (i3 > 0 && (i2 = tb1Var.v) > 0) {
                        return g(i3, i2, tb1Var.y);
                    }
                } else {
                    int i4 = tb1Var.G;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (i4 != -1) {
                        if (codecCapabilities == null) {
                            h("sampleRate.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            h("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            h("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = tb1Var.F;
                    if (i5 != -1) {
                        if (codecCapabilities == null) {
                            h("channelCount.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            h("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            l93.q0("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            h("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            public final boolean f(tb1 tb1Var) {
                if (this.i) {
                    return this.e;
                }
                Pair pairB = i40.b(tb1Var);
                return pairB != null && ((Integer) pairB.first).intValue() == 42;
            }

            /* JADX WARN: Code duplicated, block: B:51:0x008d  */
            /* JADX WARN: Code duplicated, block: B:59:0x00ab A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
            public final boolean g(int i, int i2, double d) {
                String str;
                char c;
                Boolean bool;
                List supportedPerformancePoints;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    h("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    h("sizeAndRate.vCaps");
                    return false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    if (i3 < 29 || (((bool = uc5.j) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                        c = 0;
                    } else {
                        ek2.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointH = ek2.h(i, i2, (int) d);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= supportedPerformancePoints.size()) {
                                c = 1;
                                break;
                            }
                            if (yj1.c(supportedPerformancePoints.get(i4)).covers(performancePointH)) {
                                c = 2;
                                break;
                            }
                            i4++;
                        }
                        if (c == 1 && uc5.j == null) {
                            int iK = i3 >= 35 ? 2 : q05.k(false);
                            int iK2 = q05.k(true);
                            boolean z = iK == 0 || (iK2 != 0 ? !(iK == 2 && iK2 == 2) : iK != 2);
                            uc5.j = Boolean.valueOf(z);
                            if (z) {
                                c = 0;
                            }
                        }
                    }
                    if (c != 2) {
                        if (c == 1) {
                            StringBuilder sbT = b11.t("sizeAndRate.cover, ", "x", i, i2, "@");
                            sbT.append(d);
                            h(sbT.toString());
                            return false;
                        }
                        if (!a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbT2 = b11.t("sizeAndRate.rotated, ", "x", i, i2, "@");
                                    sbT2.append(d);
                                    StringBuilder sbU = b11.u("AssumedSupport [", sbT2.toString(), "] [", str, ", ");
                                    sbU.append(this.b);
                                    sbU.append("] [");
                                    sbU.append(f35.a);
                                    sbU.append("]");
                                    l93.A("MediaCodecInfo", sbU.toString());
                                    return true;
                                }
                                StringBuilder sbT3 = b11.t("sizeAndRate.rotated, ", "x", i, i2, "@");
                                sbT3.append(d);
                                StringBuilder sbU2 = b11.u("AssumedSupport [", sbT3.toString(), "] [", str, ", ");
                                sbU2.append(this.b);
                                sbU2.append("] [");
                                sbU2.append(f35.a);
                                sbU2.append("]");
                                l93.A("MediaCodecInfo", sbU2.toString());
                                return true;
                            }
                            StringBuilder sbT4 = b11.t("sizeAndRate.support, ", "x", i, i2, "@");
                            sbT4.append(d);
                            h(sbT4.toString());
                            return false;
                        }
                    }
                } else if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbT5 = b11.t("sizeAndRate.rotated, ", "x", i, i2, "@");
                            sbT5.append(d);
                            StringBuilder sbU3 = b11.u("AssumedSupport [", sbT5.toString(), "] [", str, ", ");
                            sbU3.append(this.b);
                            sbU3.append("] [");
                            sbU3.append(f35.a);
                            sbU3.append("]");
                            l93.A("MediaCodecInfo", sbU3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbT6 = b11.t("sizeAndRate.support, ", "x", i, i2, "@");
                    sbT6.append(d);
                    h(sbT6.toString());
                    return false;
                }
                return true;
            }

            public final void h(String str) {
                StringBuilder sbJ = xa3.j("NoSupport [", str, "] [");
                sbJ.append(this.a);
                sbJ.append(", ");
                sbJ.append(this.b);
                sbJ.append("] [");
                sbJ.append(f35.a);
                sbJ.append("]");
                l93.A("MediaCodecInfo", sbJ.toString());
            }

            public final String toString() {
                return this.a;
            }
        }
