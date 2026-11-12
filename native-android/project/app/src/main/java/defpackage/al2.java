package defpackage;

import android.media.session.MediaController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class al2 extends pz1 {
    @Override // defpackage.pz1
    public final void J(float f) {
        if (f != 0.0f) {
            ((MediaController.TransportControls) this.o).setPlaybackSpeed(f);
        } else {
            kf2.n("speed must not be zero");
        }
    }
}
