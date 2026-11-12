package defpackage;

import android.media.MediaRouter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class br2 extends MediaRouter.VolumeCallback {
    public final vg3 a;

    public br2(vg3 vg3Var) {
        this.a = vg3Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        yg3 yg3VarM = vg3.m(routeInfo);
        if (yg3VarM != null) {
            yg3VarM.a.j(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        oq2 oq2VarF;
        this.a.getClass();
        yg3 yg3VarM = vg3.m(routeInfo);
        if (yg3VarM != null) {
            wq2 wq2Var = yg3VarM.a;
            wq2Var.getClass();
            yq2.b();
            if (i == 0 || (oq2VarF = yq2.c().f(wq2Var)) == null) {
                return;
            }
            oq2VarF.i(i);
        }
    }
}
