package androidx.media3.exoplayer.mediacodec;

import defpackage.dk2;
import defpackage.tb1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String n;
    public final boolean o;
    public final dk2 p;
    public final String q;

    public MediaCodecRenderer$DecoderInitializationException(tb1 tb1Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + tb1Var, mediaCodecUtil$DecoderQueryException, tb1Var.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, dk2 dk2Var, String str3) {
        super(str, th);
        this.n = str2;
        this.o = z;
        this.p = dk2Var;
        this.q = str3;
    }
}
