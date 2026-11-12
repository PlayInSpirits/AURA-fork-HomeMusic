package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements ww0 {
    @Override // defpackage.ww0
    public final pw0 c(sw0 r2, tb1 r3) {
        if (r3.r != null) goto L7;
        return null;
    L7:
        return new f21(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.ww0
    public final void e(Looper r1, ik3 r2) {
    }

    @Override // defpackage.ww0
    public final int f(tb1 r1) {
        if (r1.r == null) goto L6;
        return 1;
    L6:
        return 0;
    }
}
