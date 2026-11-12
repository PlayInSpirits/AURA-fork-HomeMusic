package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 implements pw0 {
    public final DrmSession$DrmSessionException a;

    public f21(DrmSession$DrmSessionException r1) {
        this.a = r1;
    }

    @Override // defpackage.pw0
    public final UUID a() {
        return ax.a;
    }

    @Override // defpackage.pw0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pw0
    public final void d(sw0 r1) {
    }

    @Override // defpackage.pw0
    public final void e(sw0 r1) {
    }

    @Override // defpackage.pw0
    public final boolean f(String r1) {
        return false;
    }

    @Override // defpackage.pw0
    public final DrmSession$DrmSessionException g() {
        return this.a;
    }

    @Override // defpackage.pw0
    public final int getState() {
        return 1;
    }

    @Override // defpackage.pw0
    public final se1 h() {
        return null;
    }
}
