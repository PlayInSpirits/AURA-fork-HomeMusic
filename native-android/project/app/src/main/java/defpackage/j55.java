package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j55 extends g55 implements Choreographer$VsyncCallback {
    public final Handler r;

    public j55(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.r = f35.p(null);
    }

    @Override // defpackage.g55
    public final void a() {
        this.o.registerDisplayListener(this, f35.p(null));
        this.n.postVsyncCallback(this);
    }

    @Override // defpackage.g55
    public final void b() {
        this.o.unregisterDisplayListener(this);
        this.r.removeCallbacksAndMessages(null);
        this.n.removeVsyncCallback(this);
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.n.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.p = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.q = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.q = -9223372036854775807L;
        }
        this.r.postDelayed(new jq3(12, this), 500L);
    }
}
