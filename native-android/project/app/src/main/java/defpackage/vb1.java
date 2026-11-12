package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float n;
    public final int o;
    public final int p;
    public final View q;
    public ub1 r;
    public ub1 s;
    public boolean t;
    public int u;
    public final int[] v = new int[2];

    public vb1(View view) {
        this.q = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.o = tapTimeout;
        this.p = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        ub1 ub1Var = this.s;
        View view = this.q;
        if (ub1Var != null) {
            view.removeCallbacks(ub1Var);
        }
        ub1 ub1Var2 = this.r;
        if (ub1Var2 != null) {
            view.removeCallbacks(ub1Var2);
        }
    }

    public abstract nd4 b();

    public abstract boolean c();

    public boolean d() {
        nd4 nd4VarB = b();
        if (nd4VarB == null || !nd4VarB.b()) {
            return true;
        }
        nd4VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        cx0 cx0VarK;
        boolean z2 = this.t;
        View view2 = this.q;
        if (z2) {
            nd4 nd4VarB = b();
            if (nd4VarB != null && nd4VarB.b() && (cx0VarK = nd4VarB.k()) != null && cx0VarK.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.v;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                cx0VarK.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = cx0VarK.b(motionEventObtainNoHistory, this.u);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.u = motionEvent.getPointerId(0);
                    if (this.r == null) {
                        this.r = new ub1(this, 0);
                    }
                    view2.postDelayed(this.r, this.o);
                    if (this.s == null) {
                        this.s = new ub1(this, 1);
                    }
                    view2.postDelayed(this.s, this.p);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.u);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.n;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.t = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.t = false;
        this.u = -1;
        ub1 ub1Var = this.r;
        if (ub1Var != null) {
            this.q.removeCallbacks(ub1Var);
        }
    }
}
