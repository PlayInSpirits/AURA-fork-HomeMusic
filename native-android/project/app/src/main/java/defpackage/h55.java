package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h55 extends g55 implements Choreographer.FrameCallback {
    @Override // defpackage.g55
    public final void a() {
        this.o.registerDisplayListener(this, f35.p(null));
        this.n.postFrameCallback(this);
        Display r0 = this.o.getDisplay(0);
        if (r0 == null) goto L5;
        long r1 = (long) (1.0E9d / ((double) r0.getRefreshRate()));
    L6:
        this.q = r1;
        return;
    L5:
        l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        r1 = -9223372036854775807L;
        goto L6
    }

    @Override // defpackage.g55
    public final void b() {
        this.o.unregisterDisplayListener(this);
        this.n.removeFrameCallback(this);
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r3) {
        this.p = r3;
        this.n.postFrameCallbackDelayed(this, 500);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r5) {
        if (r5 != 0) goto L9;
        this.n.postFrameCallback(this);
        Display r6 = this.o.getDisplay(0);
        if (r6 == null) goto L6;
        long r0 = (long) (1.0E9d / ((double) r6.getRefreshRate()));
    L7:
        this.q = r0;
        return;
    L6:
        l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        r0 = -9223372036854775807L;
        goto L7
    }
}
