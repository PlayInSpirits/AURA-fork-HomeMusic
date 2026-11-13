/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.SurfaceTexture;
import defpackage.z54;

public final class y54
implements SurfaceTexture.OnFrameAvailableListener {
    public final z54 n;

    public y54(z54 z542) {
        this.n = z542;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.n.n.set(true);
    }
}

