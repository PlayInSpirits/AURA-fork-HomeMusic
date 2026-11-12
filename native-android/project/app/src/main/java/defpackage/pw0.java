package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface pw0 {
    static void b(pw0 pw0Var, pw0 pw0Var2) {
        if (pw0Var == pw0Var2) {
            return;
        }
        if (pw0Var2 != null) {
            pw0Var2.e(null);
        }
        if (pw0Var != null) {
            pw0Var.d(null);
        }
    }

    UUID a();

    boolean c();

    void d(sw0 sw0Var);

    void e(sw0 sw0Var);

    boolean f(String str);

    DrmSession$DrmSessionException g();

    int getState();

    se1 h();
}
