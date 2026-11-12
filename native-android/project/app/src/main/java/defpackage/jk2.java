package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jk2 {
    public static final HashMap a = null;

    static {
        a = new HashMap();
    }

    public static void a(String r9, ArrayList r10) {
        if ("audio/raw".equals(r9) == false) goto L15;
        if (Build.VERSION.SDK_INT < 26) goto L7;
    L13:
        int r3 = 2;
        Collections.sort(r10, new w60(r3, new er1(18)));
        goto L15
    L7:
        if (Build.DEVICE.equals("R9") == false) goto L13;
        if (r10.size() != 1) goto L13;
        if (((dk2) r10.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW") == false) goto L13;
        r10.add(dk2.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
    L15:
        if (Build.VERSION.SDK_INT < 32) goto L17;
        return;
    L17:
        if (r10.size() > 1) goto L19;
        return;
    L19:
        if ("OMX.qti.audio.decoder.flac".equals(((dk2) r10.get(0)).a) == false) goto L24;
        r10.add((dk2) r10.remove(0));
        return;
    }

    public static MediaCodecInfo.CodecProfileLevel b(int r1, int r2) {
        MediaCodecInfo.CodecProfileLevel r0 = new MediaCodecInfo.CodecProfileLevel();
        r0.profile = r1;
        r0.level = r2;
        return r0;
    }

    public static String c(tb1 r3) {
        String r0 = r3.n;
        String r1 = r3.n;
        if ("audio/eac3-joc".equals(r0) == false) goto L7;
        return "audio/eac3";
    L7:
        if ("video/dolby-vision".equals(r1) == false) goto L25;
        Pair r4 = i40.b(r3);
        if (r4 == null) goto L25;
        int r5 = ((Integer) r4.first).intValue();
        if (r5 != 16) goto L13;
    L23:
        return "video/hevc";
    L13:
        if (r5 == 256) goto L23;
        if (r5 != 512) goto L20;
        return "video/avc";
    L20:
        if (r5 != 1024) goto L25;
        return "video/av01";
    L25:
        if ("video/mv-hevc".equals(r1) == false) goto L27;
        return "video/hevc";
    L27:
        return null;
    }

    public static String d(MediaCodecInfo r4, String r5, String r6) {
        String[] r7 = r4.getSupportedTypes();
        int r0 = r7.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        String r2 = r7[r1];
        if (r2.equalsIgnoreCase(r6) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L9:
        if (r6.equals("video/dolby-vision") == false) goto L21;
        if ("OMX.MS.HEVCDV.Decoder".equals(r5) == false) goto L15;
        return "video/hevcdv";
    L15:
        if ("OMX.RTK.video.decoder".equals(r5) == false) goto L17;
        return "video/dv_hevc";
    L17:
        if ("OMX.realtek.video.decoder.tunneled".equals(r5) == true) goto L50;
        return null;
    L50:
        return "video/dv_hevc";
    L21:
        if (r6.equals("video/mv-hevc") == false) goto L29;
        if ("c2.qti.mvhevc.decoder".equals(r5) == false) goto L25;
        return "video/x-mvhevc";
    L25:
        if ("c2.qti.mvhevc.decoder.secure".equals(r5) == false) goto L52;
        return "video/x-mvhevc";
    L52:
        return null;
    L29:
        if (r6.equals("audio/alac") == false) goto L35;
        if ("OMX.lge.alac.decoder".equals(r5) == false) goto L35;
        return "audio/x-lg-alac";
    L35:
        if (r6.equals("audio/flac") == false) goto L41;
        if ("OMX.lge.flac.decoder".equals(r5) == false) goto L41;
        return "audio/x-lg-flac";
    L41:
        if (r6.equals("audio/ac3") == true) goto L43;
        return null;
    L43:
        if ("OMX.lge.ac3.decoder".equals(r5) == false) goto L54;
        return "audio/lg-ac3";
    L54:
        return null;
    }

    public static synchronized List e(boolean r5, boolean r6, String r7) {
        monitor-enter(jk2.class);
        hk2 r1 = new hk2(r5, r6, r7);     // Catch: Throwable -> L11
        HashMap r2 = a;     // Catch: Throwable -> L11
        List r3 = (List) r2.get(r1);     // Catch: Throwable -> L11
        if (r3 == null) goto L8;
        monitor-exit(jk2.class);
        return r3;
    L8:
        ArrayList r8 = f(r1, new x7(r5, r6, r7.equals("video/mv-hevc")));     // Catch: Throwable -> L11
        if (r5 == false) goto L13;
        r8.isEmpty();     // Catch: Throwable -> L11
    L13:
        a(r7, r8);     // Catch: Throwable -> L11
        yw1 r9 = yw1.k(r8);     // Catch: Throwable -> L11
        r2.put(r1, r9);     // Catch: Throwable -> L11
        monitor-exit(jk2.class);
        return r9;
    L11:
        th = move-exception;
        throw th;
    }

    public static ArrayList f(hk2 r19, x7 r20) {
        hk2 r0 = r19;
        int r2 = r20.o;
        ArrayList r5 = new ArrayList();     // Catch: Exception -> L62
        String r7 = r0.a;     // Catch: Exception -> L62
        boolean r13 = r0.b;     // Catch: Exception -> L62
        if (((MediaCodecInfo[]) r20.p) != null) goto L6;
        r20.p = new MediaCodecList(r2).getCodecInfos();     // Catch: Exception -> L62
    L6:
        int r14 = ((MediaCodecInfo[]) r20.p).length;     // Catch: Exception -> L62
        int r6 = 0;
    L7:
        if (r6 >= r14) goto L61;
        if (((MediaCodecInfo[]) r20.p) != null) goto L11;
        r20.p = new MediaCodecList(r2).getCodecInfos();     // Catch: Exception -> L62
    L11:
        MediaCodecInfo r8 = ((MediaCodecInfo[]) r20.p)[r6];     // Catch: Exception -> L62
        int r9 = Build.VERSION.SDK_INT;     // Catch: Exception -> L62
        if (r9 >= 29) goto L14;
    L16:
        int r11 = r6;
        String r10 = r8.getName();     // Catch: Exception -> L62
        if (r8.isEncoder() == false) goto L19;
    L18:
        int r17 = r11;
    L54:
        r6 = r17 + 1;
        r0 = r19;
        goto L7
    L19:
        String r12 = d(r8, r10, r7);     // Catch: Exception -> L62
        if (r12 == null) goto L18;
        MediaCodecInfo.CodecCapabilities r15 = r8.getCapabilitiesForType(r12);     // Catch: Exception -> L57
        boolean r16 = r15.isFeatureSupported("tunneled-playback");     // Catch: Exception -> L57
        boolean r18 = r15.isFeatureRequired("tunneled-playback");     // Catch: Exception -> L57
        boolean r110 = r0.c;     // Catch: Exception -> L57
        if (r110 == true) goto L25;
        if (r18 == true) goto L18;
    L25:
        if (r110 == false) goto L28;
        if (r16 == false) goto L18;
    L28:
        boolean r111 = r15.isFeatureSupported("secure-playback");     // Catch: Exception -> L57
        boolean r112 = r15.isFeatureRequired("secure-playback");     // Catch: Exception -> L57
        if (r13 == true) goto L31;
        if (r112 == true) goto L18;
    L31:
        if (r13 == false) goto L34;
        if (r111 == false) goto L18;
    L34:
        boolean r113 = true;
        if (r9 < 29) goto L38;
        boolean r1 = ek2.y(r8);     // Catch: Exception -> L57
    L37:
        r17 = r11;
        boolean r114 = h(r8, r7);     // Catch: Exception -> L57
        boolean r115 = r1;
        if (r9 < 29) goto L42;
        r113 = ek2.B(r8);     // Catch: Exception -> L57
    L50:
        if (r13 != r111) goto L54;
        String r21 = r12;
        r5.add(dk2.i(r10, r7, r21, r15, r115, r114, r113));     // Catch: Exception -> L55
    L55:
        e = e;
    L59:
        l93.F("MediaCodecUtil", "Failed to query codec " + r10 + " (" + r21 + ")");     // Catch: Exception -> L62
        throw e;     // Catch: Exception -> L62
    L42:
        String r3 = rr2.U(r8.getName());     // Catch: Exception -> L57
        if (r3.startsWith("omx.google.") == false) goto L45;
    L49:
        r113 = false;
        goto L50
    L45:
        if (r3.startsWith("c2.android.") == true) goto L49;
        if (r3.startsWith("c2.google.") == true) goto L49;
    L38:
        r1 = !h(r8, r7);     // Catch: Exception -> L57
    L57:
        e = e;
        r21 = r12;
        goto L59
    L14:
        if (ek2.D(r8) == false) goto L16;
        r17 = r6;
        goto L54
    L61:
        return r5;
    L62:
        e = move-exception;
        throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e);
    }

    public static gy3 g(kf2 r1, tb1 r2, boolean r3, boolean r4) {
        List r0 = r1.a(r3, r4, r2.n);
        String r5 = c(r2);
        if (r5 != null) goto L5;
        List r6 = gy3.r;
    L6:
        uw1 r7 = yw1.j();
        r7.d(r0);
        r7.d(r6);
        return r7.f();
    L5:
        r6 = r1.a(r3, r4, r5);
        goto L6
    }

    public static boolean h(MediaCodecInfo r2, String r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return ek2.u(r2);
    L7:
        if (lw2.i(r3) == true) goto L42;
        String r4 = rr2.U(r2.getName());
        if (r4.startsWith("arc.") == false) goto L13;
        return false;
    L13:
        if (r4.startsWith("omx.google.") == false) goto L15;
        return true;
    L15:
        if (r4.startsWith("omx.ffmpeg.") == false) goto L17;
        return true;
    L17:
        if (r4.startsWith("omx.sec.") == false) goto L21;
        if (r4.contains(".sw.") == false) goto L21;
        return true;
    L21:
        if (r4.equals("omx.qcom.video.decoder.hevcswvdec") == false) goto L23;
        return true;
    L23:
        if (r4.startsWith("c2.android.") == false) goto L25;
        return true;
    L25:
        if (r4.startsWith("c2.google.") == false) goto L27;
        return true;
    L27:
        if (r4.startsWith("omx.") == false) goto L29;
        return false;
    L29:
        if (r4.startsWith("c2.") == false) goto L43;
        return false;
    L43:
        return true;
    L42:
        return true;
    }
}
