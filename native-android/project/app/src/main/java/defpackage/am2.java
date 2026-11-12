package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ bm2 n;

    public am2(bm2 r1) {
        this.n = r1;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture r1, int r2, int r3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture r1) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture r1, int r2, int r3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture r1) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder r2, int r3, int r4, int r5) {
        bm2 r6 = this.n;
        if (r6.B == r2) goto L5;
        return;
    L5:
        if (r6.Y() == false) goto L13;
        cb4 r7 = r6.n;
        r7.getClass();
        if (r7.a.f() < 8) goto L10;
        r6.c1(new zl2(r4, r5, this));
    L10:
        r6.p1(r4, r5);
        return;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder r4) {
        bm2 r3 = this.n;
        if (r3.B == r4) goto L5;
        return;
    L5:
        r3.A = r4.getSurface();
        Rect r5 = r4.getSurfaceFrame();
        r3.z1(r3.A, r5.width(), r5.height());
        r3.p1(r5.width(), r5.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder r2) {
        bm2 r1 = this.n;
        if (r1.B == r2) goto L5;
        return;
    L5:
        r1.A = null;
        r1.z1(null, 0, 0);
        r1.p1(0, 0);
    }
}
