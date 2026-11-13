/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.Choreographer;
import android.view.Display;
import defpackage.f35;
import defpackage.g55;
import defpackage.l93;

public final class h55
extends g55
implements Choreographer.FrameCallback {
    public h55(android.view.Choreographer a0, android.hardware.display.DisplayManager a1) {
        super(a0, a1);
    }

    @Override
    public final void a() {
        long l16;
        this.o.registerDisplayListener(this, f35.p(null));
        this.n.postFrameCallback(this);
        Display display = this.o.getDisplay(0);
        if (display != null) {
            l16 = (long)(1.0E9 / (double)display.getRefreshRate());
        } else {
            l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            l16 = -9223372036854775807L;
        }
        this.q = l16;
    }

    @Override
    public final void b() {
        this.o.unregisterDisplayListener(this);
        this.n.removeFrameCallback(this);
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override
    public final void doFrame(long l16) {
        this.p = l16;
        this.n.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final void onDisplayChanged(int n16) {
        if (n16 == 0) {
            long l16;
            this.n.postFrameCallback(this);
            Display display = this.o.getDisplay(0);
            if (display != null) {
                l16 = (long)(1.0E9 / (double)display.getRefreshRate());
            } else {
                l93.q0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                l16 = -9223372036854775807L;
            }
            this.q = l16;
        }
    }
}

