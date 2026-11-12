package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h55 extends g55 implements Choreographer.FrameCallback {
    @Override // defpackage.g55
    public final void a() {
        long refreshRate;
        this.o.registerDisplayListener(this, f35.p(null));
        this.n.postFrameCallback(this);
        Display display = this.o.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.q = refreshRate;
    }

    @Override // defpackage.g55
    public final void b() {
        this.o.unregisterDisplayListener(this);
        this.n.removeFrameCallback(this);
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.p = j;
        this.n.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.n.postFrameCallback(this);
            Display display = this.o.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.q = refreshRate;
        }
    }
}
