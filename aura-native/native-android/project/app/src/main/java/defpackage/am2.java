package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ bm2 n;

    public am2(bm2 bm2Var) {
        this.n = bm2Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        bm2 bm2Var = this.n;
        if (bm2Var.B == surfaceHolder && bm2Var.Y()) {
            cb4 cb4Var = bm2Var.n;
            cb4Var.getClass();
            if (cb4Var.a.f() >= 8) {
                bm2Var.c1(new zl2(i2, i3, this));
            }
            bm2Var.p1(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bm2 bm2Var = this.n;
        if (bm2Var.B != surfaceHolder) {
            return;
        }
        bm2Var.A = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        bm2Var.z1(bm2Var.A, surfaceFrame.width(), surfaceFrame.height());
        bm2Var.p1(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bm2 bm2Var = this.n;
        if (bm2Var.B != surfaceHolder) {
            return;
        }
        bm2Var.A = null;
        bm2Var.z1(null, 0, 0);
        bm2Var.p1(0, 0);
    }
}
