package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q85 extends VolumeProvider {
    public final /* synthetic */ is2 a;

    public q85(is2 r1, int r2, int r3, int r4, String r5) {
        this.a = r1;
        super(r2, r3, r4, r5);
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int r4) {
        is2 r3 = this.a;
        f35.W(r3.f, new hs2(r3.g, r4, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int r4) {
        is2 r3 = this.a;
        f35.W(r3.f, new hs2(r3.g, r4, 0));
    }
}
