package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import defpackage.dj0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends dj0 {
    public final a s;
    public ByteBuffer t;

    public SimpleDecoderOutputBuffer(a aVar) {
        this.s = aVar;
    }

    @Override // defpackage.dj0
    public final void r() {
        this.o = 0;
        this.p = 0L;
        this.q = 0;
        this.r = false;
        ByteBuffer byteBuffer = this.t;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // defpackage.dj0
    public final void s() {
        this.s.a.n(this);
    }
}
