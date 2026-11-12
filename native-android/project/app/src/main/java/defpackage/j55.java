package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j55 extends g55 implements Choreographer$VsyncCallback {
    public final Handler r;

    public j55(Choreographer r1, DisplayManager r2) {
        super(r1, r2);
        this.r = f35.p(null);
    }

    @Override // defpackage.g55
    public final void a() {
        Handler r0 = f35.p(null);
        this.o.registerDisplayListener(this, r0);
        n3.t(this.n, this);
    }

    @Override // defpackage.g55
    public final void b() {
        this.o.unregisterDisplayListener(this);
        this.r.removeCallbacksAndMessages(null);
        i55.a(this.n, this);
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r1) {
        if (r1 != 0) goto L5;
        n3.t(this.n, this);
        return;
    }

    public final void onVsync(Choreographer.FrameData r7) {
        this.p = n3.a(r7);
        Choreographer.FrameTimeline[] r8 = n3.z(r7);
        long r2 = -9223372036854775807L;
        if (r8.length < 2) goto L9;
        long r0 = n3.b(r8[1]) - n3.b(r8[0]);
        if (r0 == 0) goto L8;
        r2 = r0;
    L8:
        this.q = r2;
    L10:
        this.r.postDelayed(new jq3(12, this), 500);
        return;
    L9:
        this.q = -9223372036854775807L;
        goto L10
    }
}
