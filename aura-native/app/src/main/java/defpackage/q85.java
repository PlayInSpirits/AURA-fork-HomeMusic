package defpackage;

import android.media.VolumeProvider;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q85 extends VolumeProvider {
    public final /* synthetic */ is2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q85(is2 is2Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = is2Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        is2 is2Var = this.a;
        f35.W(is2Var.f, new hs2(is2Var.g, i, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        is2 is2Var = this.a;
        f35.W(is2Var.f, new hs2(is2Var.g, i, 0));
    }
}
