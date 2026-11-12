package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.dk2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int n;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, dk2 dk2Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(dk2Var == null ? null : dk2Var.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.n = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
