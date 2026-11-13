package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class br2 extends MediaRouter.VolumeCallback {
    public final vg3 a;

    public br2(vg3 vg3Var) {
        this.a = vg3Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        yg3 m = vg3.m(routeInfo);
        if (m != null) {
            m.a.j(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        oq2 f;
        this.a.getClass();
        yg3 m = vg3.m(routeInfo);
        if (m != null) {
            wq2 wq2Var = m.a;
            wq2Var.getClass();
            yq2.b();
            if (i == 0 || (f = yq2.c().f(wq2Var)) == null) {
                return;
            }
            f.i(i);
        }
    }
}
