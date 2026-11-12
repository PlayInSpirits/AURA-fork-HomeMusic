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

    public ar2(vg3 r1) {
        this.a = r1;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter r1, MediaRouter.RouteInfo r2) {
        vg3 r0 = this.a;
        if (r0.h(r2) == false) goto L6;
        r0.q();
        return;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter r1, MediaRouter.RouteInfo r2) {
        vg3 r0 = this.a;
        r0.getClass();
        if (vg3.m(r2) != null) goto L8;
        int r3 = r0.i(r2);
        if (r3 < 0) goto L9;
        r0.r((xg3) r0.D.get(r3));
        r0.q();
        return;
    L9:
        return;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter r1, MediaRouter.RouteInfo r2, MediaRouter.RouteGroup r3, int r4) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter r6, MediaRouter.RouteInfo r7) {
        vg3 r5 = this.a;
        int r8 = r5.i(r7);
        if (r8 < 0) goto L16;
        xg3 r9 = (xg3) r5.D.get(r8);
        Display r10 = r7.getPresentationDisplay();
        if (r10 == null) goto L7;
        int r11 = r10.getDisplayId();
    L9:
        if (r11 == r9.c.a.getInt("presentationDisplayId", -1)) goto L17;
        sp2 r0 = r9.c;
        new ArrayList();
        new ArrayList();
        new HashSet();
        if (r0 == null) goto L14;
        Bundle r1 = new Bundle(r0.a);
        ArrayList r3 = r0.c();
        ArrayList r4 = r0.b();
        HashSet r2 = r0.a();
        r1.putInt("presentationDisplayId", r11);
        r1.putParcelableArrayList("controlFilters", new ArrayList(r4));
        r1.putStringArrayList("groupMemberIds", new ArrayList(r3));
        r1.putStringArrayList("allowedPackages", new ArrayList(r2));
        r9.c = new sp2(r1);
        r5.q();
        return;
    L14:
        kf2.n("descriptor must not be null");
        return;
    L17:
        return;
    L7:
        r11 = -1;
        goto L9
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter r1, MediaRouter.RouteInfo r2) {
        vg3 r0 = this.a;
        r0.getClass();
        if (vg3.m(r2) != null) goto L8;
        int r3 = r0.i(r2);
        if (r3 < 0) goto L9;
        r0.D.remove(r3);
        r0.q();
        return;
    L9:
        return;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter r2, int r3, MediaRouter.RouteInfo r4) {
        vg3 r1 = this.a;
        if (r4 != r1.w.getSelectedRoute(8388611)) goto L20;
        yg3 r5 = vg3.m(r4);
        if (r5 == null) goto L9;
        r5.a.k(false);
        return;
    L9:
        int r6 = r1.i(r4);
        if (r6 < 0) goto L17;
        xg3 r7 = (xg3) r1.D.get(r6);
        ui1 r8 = r1.v;
        String r9 = r7.b;
        r8.a.removeMessages(262);
        vq2 r10 = r8.d(r8.r);
        if (r10 == null) goto L18;
        wq2 r11 = r10.a(r9);
        if (r11 == null) goto L19;
        r11.k(false);
        return;
    L19:
        return;
    L18:
        return;
    L17:
        return;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter r1, MediaRouter.RouteInfo r2, MediaRouter.RouteGroup r3) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter r1, int r2, MediaRouter.RouteInfo r3) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter r6, MediaRouter.RouteInfo r7) {
        vg3 r5 = this.a;
        r5.getClass();
        if (vg3.m(r7) != null) goto L14;
        int r8 = r5.i(r7);
        if (r8 < 0) goto L15;
        xg3 r9 = (xg3) r5.D.get(r8);
        int r10 = r7.getVolume();
        if (r10 == r9.c.a.getInt("volume")) goto L16;
        sp2 r0 = r9.c;
        new ArrayList();
        new ArrayList();
        new HashSet();
        if (r0 == null) goto L12;
        Bundle r2 = new Bundle(r0.a);
        ArrayList r3 = r0.c();
        ArrayList r4 = r0.b();
        HashSet r1 = r0.a();
        r2.putInt("volume", r10);
        r2.putParcelableArrayList("controlFilters", new ArrayList(r4));
        r2.putStringArrayList("groupMemberIds", new ArrayList(r3));
        r2.putStringArrayList("allowedPackages", new ArrayList(r1));
        r9.c = new sp2(r2);
        r5.q();
        return;
    L12:
        kf2.n("descriptor must not be null");
        return;
    L16:
        return;
    L15:
        return;
    }
}
