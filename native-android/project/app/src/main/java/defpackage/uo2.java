package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uo2 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ zo2 a;

    public uo2(zo2 zo2Var) {
        this.a = zo2Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.j(routingController);
    }
}
