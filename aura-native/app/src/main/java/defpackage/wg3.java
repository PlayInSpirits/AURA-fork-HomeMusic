package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wg3 extends oq2 {
    public final MediaRouter.RouteInfo a;

    public wg3(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.oq2
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.oq2
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
