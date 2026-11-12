package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo2 b;

    public /* synthetic */ xo2(zo2 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    public void onRoutesAdded(List r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onRoutesAdded(r2);
        return;
    L6:
        this.b.i();
    }

    public void onRoutesChanged(List r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onRoutesChanged(r2);
        return;
    L6:
        this.b.i();
    }

    public void onRoutesRemoved(List r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onRoutesRemoved(r2);
        return;
    L6:
        this.b.i();
    }

    public void onRoutesUpdated(List r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onRoutesUpdated(r2);
        return;
    L6:
        this.b.i();
    }
}
