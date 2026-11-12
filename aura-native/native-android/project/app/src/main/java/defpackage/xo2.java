package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo2 b;

    public /* synthetic */ xo2(zo2 zo2Var, int i) {
        this.a = i;
        this.b = zo2Var;
    }

    public void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.i();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.i();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.i();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.i();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
