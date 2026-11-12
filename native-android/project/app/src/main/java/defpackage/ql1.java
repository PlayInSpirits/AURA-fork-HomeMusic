package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ql1 extends g75 {
    public pb0 p;
    public OverScroller q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public VelocityTracker v;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // defpackage.de0
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.u < 0) {
            this.u = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.r) {
            int i = this.s;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.t) > this.u) {
                    this.t = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.s = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).A;
                    if (weakReference == null) {
                    }
                    this.r = z;
                    if (z) {
                        this.t = y;
                        this.s = motionEvent.getPointerId(0);
                        if (this.v == null) {
                            this.v = VelocityTracker.obtain();
                        }
                        overScroller = this.q;
                        if (overScroller != null) {
                            this.q.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.v;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.s = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).A;
                z = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.p(view, x2, y);
                this.r = z;
                if (z) {
                    this.t = y;
                    this.s = motionEvent.getPointerId(0);
                    if (this.v == null) {
                        this.v = VelocityTracker.obtain();
                    }
                    overScroller = this.q;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.q.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.v;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[ADDED_TO_REGION] */
    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 2;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.s);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.t - y;
                    this.t = y;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i2, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.s = motionEvent.getPointerId(i3);
                    this.t = (int) (motionEvent.getY(i3) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.v;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.r || z;
        }
        VelocityTracker velocityTracker3 = this.v;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.v.computeCurrentVelocity(1000);
            float yVelocity = this.v.getYVelocity(this.s);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i4 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.p;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.p = null;
            }
            if (this.q == null) {
                this.q = new OverScroller(view.getContext());
            }
            this.q.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i4, 0);
            if (this.q.computeScrollOffset()) {
                pb0 pb0Var = new pb0(this, coordinatorLayout, view, i);
                this.p = pb0Var;
                WeakHashMap weakHashMap = j65.a;
                view.postOnAnimation(pb0Var);
            } else {
                ((AppBarLayout.BaseBehavior) this).F(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.y) {
                    appBarLayout2.g(appBarLayout2.h(AppBarLayout.BaseBehavior.C(coordinatorLayout)));
                }
            }
            z = true;
        }
        this.r = false;
        this.s = -1;
        velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.v = null;
        }
        velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.r) {
        }
        z = false;
        this.r = false;
        this.s = -1;
        velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.v = null;
        }
        velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.r) {
        }
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);
}
