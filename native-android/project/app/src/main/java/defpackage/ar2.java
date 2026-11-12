package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 extends MediaRouter.Callback {
    public final vg3 a;

    public ar2(vg3 vg3Var) {
        this.a = vg3Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vg3 vg3Var = this.a;
        if (vg3Var.h(routeInfo)) {
            vg3Var.q();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        vg3 vg3Var = this.a;
        vg3Var.getClass();
        if (vg3.m(routeInfo) != null || (i = vg3Var.i(routeInfo)) < 0) {
            return;
        }
        vg3Var.r((xg3) vg3Var.D.get(i));
        vg3Var.q();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vg3 vg3Var = this.a;
        int i = vg3Var.i(routeInfo);
        if (i >= 0) {
            xg3 xg3Var = (xg3) vg3Var.D.get(i);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != xg3Var.c.a.getInt("presentationDisplayId", -1)) {
                sp2 sp2Var = xg3Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (sp2Var == null) {
                    kf2.n("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(sp2Var.a);
                ArrayList arrayListC = sp2Var.c();
                ArrayList arrayListB = sp2Var.b();
                HashSet hashSetA = sp2Var.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                xg3Var.c = new sp2(bundle);
                vg3Var.q();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        vg3 vg3Var = this.a;
        vg3Var.getClass();
        if (vg3.m(routeInfo) != null || (i = vg3Var.i(routeInfo)) < 0) {
            return;
        }
        vg3Var.D.remove(i);
        vg3Var.q();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        wq2 wq2VarA;
        vg3 vg3Var = this.a;
        if (routeInfo != vg3Var.w.getSelectedRoute(8388611)) {
            return;
        }
        yg3 yg3VarM = vg3.m(routeInfo);
        if (yg3VarM != null) {
            yg3VarM.a.k(false);
            return;
        }
        int i2 = vg3Var.i(routeInfo);
        if (i2 >= 0) {
            xg3 xg3Var = (xg3) vg3Var.D.get(i2);
            ui1 ui1Var = vg3Var.v;
            String str = xg3Var.b;
            ui1Var.a.removeMessages(262);
            vq2 vq2VarD = ui1Var.d(ui1Var.r);
            if (vq2VarD == null || (wq2VarA = vq2VarD.a(str)) == null) {
                return;
            }
            wq2VarA.k(false);
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        vg3 vg3Var = this.a;
        vg3Var.getClass();
        if (vg3.m(routeInfo) != null || (i = vg3Var.i(routeInfo)) < 0) {
            return;
        }
        xg3 xg3Var = (xg3) vg3Var.D.get(i);
        int volume = routeInfo.getVolume();
        if (volume != xg3Var.c.a.getInt("volume")) {
            sp2 sp2Var = xg3Var.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (sp2Var == null) {
                kf2.n("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(sp2Var.a);
            ArrayList arrayListC = sp2Var.c();
            ArrayList arrayListB = sp2Var.b();
            HashSet hashSetA = sp2Var.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            xg3Var.c = new sp2(bundle);
            vg3Var.q();
        }
    }
}
