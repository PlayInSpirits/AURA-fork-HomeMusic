package androidx.media3.decoder.ffmpeg;

import defpackage.hn2;
import defpackage.l93;
import defpackage.q61;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FfmpegLibrary {
    public static final q61 a;
    public static String b;
    public static int c;

    static {
        hn2.a("media3.decoder.ffmpeg");
        q61 q61Var = new q61();
        q61Var.a = new String[]{"ffmpegJNI"};
        a = q61Var;
        c = -1;
    }

    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "video/hevc":
                return "hevc";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "video/avc":
                return "h264";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!d()) {
            return -1;
        }
        if (c == -1) {
            c = ffmpegGetInputBufferPaddingSize();
        }
        return c;
    }

    public static String c() {
        if (!d()) {
            return null;
        }
        if (b == null) {
            b = ffmpegGetVersion();
        }
        return b;
    }

    public static boolean d() {
        q61 q61Var = a;
        synchronized (q61Var) {
            if (q61Var.b) {
                return q61Var.c;
            }
            q61Var.b = true;
            try {
                for (String str : q61Var.a) {
                    System.loadLibrary(str);
                }
                q61Var.c = true;
            } catch (UnsatisfiedLinkError unused) {
                l93.q0("LibraryLoader", "Failed to load " + Arrays.toString(q61Var.a));
            }
            return q61Var.c;
        }
    }

    public static boolean e(String str) {
        String strA;
        if (!d() || (strA = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strA)) {
            return true;
        }
        l93.q0("FfmpegLibrary", "No " + strA + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
