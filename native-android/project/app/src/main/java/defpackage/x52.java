package defpackage;

import android.media.VolumeProvider;
import android.media.session.MediaSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x52 extends VolumeProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public x52(MediaSession r2, int r3, int r4) {
        this.a = 0;
        this.b = r2;
        super(2, r3, r4);
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int r5) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        is2 r2 = (is2) r1;
        f35.W(r2.f, new hs2(r2.g, r5, 1));
        return;
    L6:
        z52.c.post(new w52(this, (MediaSession) r1, r5, 0));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int r5) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        is2 r2 = (is2) r1;
        f35.W(r2.f, new hs2(r2.g, r5, 0));
        return;
    L6:
        z52.c.post(new w52(this, (MediaSession) r1, r5, 1));
    }

    public x52(is2 r2, int r3, int r4, int r5) {
        this.a = 1;
        this.b = r2;
        super(r3, r4, r5);
    }
}
