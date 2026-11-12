package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface pw0 {
    static void b(pw0 r1, pw0 r2) {
        if (r1 != r2) goto L5;
        return;
    L5:
        if (r2 == null) goto L7;
        r2.e(null);
    L7:
        if (r1 == null) goto L10;
        r1.d(null);
        return;
    }

    UUID a();

    boolean c();

    void d(sw0 r1);

    void e(sw0 r1);

    boolean f(String r1);

    DrmSession$DrmSessionException g();

    int getState();

    se1 h();
}
