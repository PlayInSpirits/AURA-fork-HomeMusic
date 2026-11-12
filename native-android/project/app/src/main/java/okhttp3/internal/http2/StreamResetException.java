package okhttp3.internal.http2;

import defpackage.b21;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {
    public final b21 n;

    public StreamResetException(b21 r3) {
        r3.getClass();
        super("stream was reset: " + r3);
        this.n = r3;
    }
}
