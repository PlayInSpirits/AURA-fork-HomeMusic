package defpackage;

import android.media.MediaRouter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class br2 extends MediaRouter.VolumeCallback {
    public final vg3 a;

    public br2(vg3 r1) {
        this.a = r1;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo r1, int r2) {
        this.a.getClass();
        yg3 r0 = vg3.m(r1);
        if (r0 == null) goto L6;
        r0.a.j(r2);
        return;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo r1, int r2) {
        this.a.getClass();
        yg3 r0 = vg3.m(r1);
        if (r0 == null) goto L10;
        wq2 r3 = r0.a;
        r3.getClass();
        yq2.b();
        if (r2 == 0) goto L11;
        oq2 r4 = yq2.c().f(r3);
        if (r4 == null) goto L12;
        r4.i(r2);
        return;
    L12:
        return;
    L11:
        return;
    }
}
