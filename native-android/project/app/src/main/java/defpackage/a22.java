package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a22 implements qw3 {
    public final /* synthetic */ f22 a;

    public a22(f22 f22Var) {
        this.a = f22Var;
    }

    @Override // defpackage.qw3
    public final void a(MotionEvent motionEvent) {
        f22 f22Var = this.a;
        g5 g5Var = f22Var.s;
        f22Var.x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = f22Var.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (f22Var.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(f22Var.l);
        if (iFindPointerIndex >= 0) {
            f22Var.k(actionMasked, iFindPointerIndex, motionEvent);
        }
        cx3 cx3Var = f22Var.c;
        if (cx3Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    f22Var.s(f22Var.o, iFindPointerIndex, motionEvent);
                    f22Var.q(cx3Var);
                    f22Var.r.removeCallbacks(g5Var);
                    g5Var.run();
                    f22Var.r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == f22Var.l) {
                    f22Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    f22Var.s(f22Var.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = f22Var.t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        f22Var.r(null, 0);
        f22Var.l = -1;
    }

    @Override // defpackage.qw3
    public final boolean d(MotionEvent motionEvent) {
        int iFindPointerIndex;
        f22 f22Var = this.a;
        f22Var.x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        b22 b22Var = null;
        if (actionMasked == 0) {
            f22Var.l = motionEvent.getPointerId(0);
            f22Var.d = motionEvent.getX();
            f22Var.e = motionEvent.getY();
            VelocityTracker velocityTracker = f22Var.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            f22Var.t = VelocityTracker.obtain();
            if (f22Var.c == null) {
                ArrayList arrayList = f22Var.p;
                if (!arrayList.isEmpty()) {
                    View viewN = f22Var.n(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        b22 b22Var2 = (b22) arrayList.get(size);
                        if (b22Var2.e.a == viewN) {
                            b22Var = b22Var2;
                            break;
                        }
                    }
                }
                if (b22Var != null) {
                    cx3 cx3Var = b22Var.e;
                    f22Var.d -= b22Var.i;
                    f22Var.e -= b22Var.j;
                    f22Var.m(cx3Var, true);
                    if (f22Var.a.remove(cx3Var.a)) {
                        f22Var.m.a(f22Var.r, cx3Var);
                    }
                    f22Var.r(cx3Var, b22Var.f);
                    f22Var.s(f22Var.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            f22Var.l = -1;
            f22Var.r(null, 0);
        } else {
            int i = f22Var.l;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                f22Var.k(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = f22Var.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return f22Var.c != null;
    }

    @Override // defpackage.qw3
    public final void e(boolean z) {
        if (z) {
            this.a.r(null, 0);
        }
    }
}
