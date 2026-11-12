package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] t = null;
    public final Handler n;
    public final int[] o;
    public EGLDisplay p;
    public EGLContext q;
    public EGLSurface r;
    public SurfaceTexture s;

    static {
        t = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public qy0(Handler r1) {
        this.n = r1;
        this.o = new int[1];
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture r1) {
        this.n.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture r0 = this.s;
        if (r0 == null) goto L9;
        r0.updateTexImage();     // Catch: RuntimeException -> L6
        return;
    L10:
        return;
    }
}
