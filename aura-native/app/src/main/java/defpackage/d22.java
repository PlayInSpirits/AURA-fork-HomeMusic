package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d22 extends GestureDetector.SimpleOnGestureListener {
    public boolean n = true;
    public final /* synthetic */ f22 o;

    public d22(f22 f22Var) {
        this.o = f22Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View n;
        cx3 M;
        f22 f22Var = this.o;
        e22 e22Var = f22Var.m;
        if (!this.n || (n = f22Var.n(motionEvent)) == null || (M = f22Var.r.M(n)) == null) {
            return;
        }
        RecyclerView recyclerView = f22Var.r;
        int i = e22Var.c;
        if ((e22.b((i << 8) | i | 3 | 196608, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i2 = f22Var.l;
            if (pointerId == i2) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                f22Var.d = x;
                f22Var.e = y;
                f22Var.i = 0.0f;
                f22Var.h = 0.0f;
                e22Var.getClass();
                if (e22Var instanceof vl3) {
                    return;
                }
                f22Var.r(M, 2);
            }
        }
    }
}
