package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f21 implements pw0 {
    public final DrmSession$DrmSessionException a;

    public f21(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
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
    public final boolean f(String str) {
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

    @Override // defpackage.pw0
    public final void d(sw0 sw0Var) {
    }

    @Override // defpackage.pw0
    public final void e(sw0 sw0Var) {
    }
}
