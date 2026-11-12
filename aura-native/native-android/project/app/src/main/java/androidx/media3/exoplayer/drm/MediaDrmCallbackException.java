package androidx.media3.exoplayer.drm;

import android.net.Uri;
import defpackage.ii0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public final ii0 n;
    public final Uri o;
    public final Map p;
    public final long q;

    public MediaDrmCallbackException(ii0 ii0Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.n = ii0Var;
        this.o = uri;
        this.p = map;
        this.q = j;
    }
}
