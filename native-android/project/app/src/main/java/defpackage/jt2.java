package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements SurfaceHolder {
    public final Surface a;
    public final Rect b;
    public SurfaceHolder.Callback c;

    public jt2(Surface r2, int r3, int r4) {
        Rect r0 = new Rect();
        this.b = r0;
        this.a = r2;
        r0.set(0, 0, r3, r4);
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback r1) {
        this.c = r1;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.a;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.b;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback r2) {
        if (this.c != r2) goto L6;
        this.c = null;
        return;
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int r3, int r4) {
        this.b.set(0, 0, r3, r4);
        SurfaceHolder.Callback r0 = this.c;
        if (r0 == null) goto L6;
        r0.surfaceChanged(this, 1, r3, r4);
        return;
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int r1) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean r1) {
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int r1) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas r1) {
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect r1) {
        throw new UnsupportedOperationException();
    }

    public jt2(Surface r2) {
        this.b = new Rect();
        this.a = r2;
    }
}
