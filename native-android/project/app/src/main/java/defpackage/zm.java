package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zm extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ jv3 a;

    public zm(jv3 r1) {
        this.a = r1;
    }

    public final void onDataRequest(AudioTrack r1, int r2) {
        ((an) this.a.p).i.f(-1, new kf2(7));
    }

    public final void onPresentationEnded(AudioTrack r2) {
        ((an) this.a.p).i.f(-1, new kf2(8));
    }

    public final void onTearDown(AudioTrack r2) {
        ((an) this.a.p).i.f(-1, new kf2(7));
    }
}
