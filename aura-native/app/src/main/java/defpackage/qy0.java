package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qy0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] t = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler n;
    public final int[] o = new int[1];
    public EGLDisplay p;
    public EGLContext q;
    public EGLSurface r;
    public SurfaceTexture s;

    public qy0(Handler handler) {
        this.n = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.n.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.s;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
