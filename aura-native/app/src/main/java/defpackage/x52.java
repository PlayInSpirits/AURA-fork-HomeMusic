package defpackage;

import android.media.VolumeProvider;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x52 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x52(MediaSession mediaSession, int i, int i2) {
        super(2, i, i2);
        this.b = mediaSession;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                z52.c.post(new w52(this, (MediaSession) obj, i, 0));
                break;
            default:
                is2 is2Var = (is2) obj;
                f35.W(is2Var.f, new hs2(is2Var.g, i, 1));
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                z52.c.post(new w52(this, (MediaSession) obj, i, 1));
                break;
            default:
                is2 is2Var = (is2) obj;
                f35.W(is2Var.f, new hs2(is2Var.g, i, 0));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x52(is2 is2Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = is2Var;
    }
}
