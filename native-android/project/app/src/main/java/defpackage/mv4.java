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
    public final rj4 p;
    public final GestureDetector r;
    public final PointF n = new PointF();
    public final PointF o = new PointF();
    public final float q = 25.0f;
    public volatile float s = 3.1415927f;

    public mv4(Context context, rj4 rj4Var) {
        this.p = rj4Var;
        this.r = new GestureDetector(context, this);
    }

    @Override // defpackage.jb3
    public final void a(float f, float[] fArr) {
        this.s = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.n.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.n.x) / this.q;
        float y = motionEvent2.getY();
        PointF pointF = this.n;
        float f3 = (y - pointF.y) / this.q;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.s;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.o;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        rj4 rj4Var = this.p;
        PointF pointF3 = this.o;
        synchronized (rj4Var) {
            float f5 = pointF3.y;
            rj4Var.t = f5;
            Matrix.setRotateM(rj4Var.r, 0, -f5, (float) Math.cos(rj4Var.u), (float) Math.sin(rj4Var.u), 0.0f);
            Matrix.setRotateM(rj4Var.s, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.p.x.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.r.onTouchEvent(motionEvent);
    }
}
