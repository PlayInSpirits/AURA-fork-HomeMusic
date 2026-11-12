package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vb1 o;

    public /* synthetic */ ub1(vb1 vb1Var, int i) {
        this.n = i;
        this.o = vb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        vb1 vb1Var = this.o;
        switch (i) {
            case 0:
                ViewParent parent = vb1Var.q.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                vb1Var.a();
                View view = vb1Var.q;
                if (view.isEnabled() && !view.isLongClickable() && vb1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    vb1Var.t = true;
                    break;
                }
                break;
        }
    }
}
