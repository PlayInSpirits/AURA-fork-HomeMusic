package androidx.media3.exoplayer.drm;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DrmSession$DrmSessionException extends IOException {
    public final int n;

    public DrmSession$DrmSessionException(Throwable th, int i) {
        super(th);
        this.n = i;
    }
}
