package okhttp3.internal.http2;

import defpackage.b21;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {
    public final b21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(b21 b21Var) {
        super("stream was reset: " + b21Var);
        b21Var.getClass();
        this.n = b21Var;
    }
}
