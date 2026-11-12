package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv4 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, jb3 {
    public final PointF n;
    public final PointF o;
    public final rj4 p;
    public final float q;
    public final GestureDetector r;
    public volatile float s;

    public mv4(Context r2, rj4 r3) {
        this.n = new PointF();
        this.o = new PointF();
        this.p = r3;
        this.q = 25.0f;
        this.r = new GestureDetector(r2, this);
        this.s = 3.1415927f;
    }

    @Override // defpackage.jb3
    public final void a(float r1, float[] r2) {
        this.s = -r1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent r2) {
        float r0 = r2.getX();
        float r3 = r2.getY();
        this.n.set(r0, r3);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent r15, MotionEvent r16, float r17, float r18) {
        float r0 = (r16.getX() - this.n.x) / this.q;
        float r1 = r16.getY();
        PointF r2 = this.n;
        float r3 = (r1 - r2.y) / this.q;
        r2.set(r16.getX(), r16.getY());
        double r4 = this.s;
        float r5 = (float) Math.cos(r4);
        float r6 = (float) Math.sin(r4);
        PointF r7 = this.o;
        r7.x -= (r5 * r0) - (r6 * r3);
        float r8 = ((r5 * r3) + (r6 * r0)) + r7.y;
        r7.y = r8;
        r7.y = Math.max(-45.0f, Math.min(45.0f, r8));
        rj4 r9 = this.p;
        PointF r14 = this.o;
        monitor-enter(r9);
        float r10 = r14.y;     // Catch: Throwable -> L8
        r9.t = r10;     // Catch: Throwable -> L8
        Matrix.setRotateM(r9.r, 0, -r10, (float) Math.cos(r9.u), (float) Math.sin(r9.u), 0.0f);     // Catch: Throwable -> L8
        Matrix.setRotateM(r9.s, 0, -r14.x, 0.0f, 1.0f, 0.0f);     // Catch: Throwable -> L8
        monitor-exit(r9);
        return true;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent r1) {
        return this.p.x.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r1, MotionEvent r2) {
        return this.r.onTouchEvent(r2);
    }
}
