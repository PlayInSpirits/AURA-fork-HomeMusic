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

    public final void A(CoordinatorLayout r7, View r8, int r9) {
        z(r7, r8, r9, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.de0
    public final boolean k(CoordinatorLayout r8, View r9, MotionEvent r10) {
        if (this.u >= 0) goto L6;
        this.u = ViewConfiguration.get(r8.getContext()).getScaledTouchSlop();
    L6:
        if (r10.getActionMasked() != 2) goto L20;
        if (this.r == false) goto L20;
        int r0 = this.s;
        if (r0 == (-1)) goto L47;
        int r1 = r10.findPointerIndex(r0);
        if (r1 == (-1)) goto L47;
        int r2 = (int) r10.getY(r1);
        if (Math.abs(r2 - this.t) <= this.u) goto L20;
        this.t = r2;
        return true;
    L47:
        return false;
    L20:
        if (r10.getActionMasked() != 0) goto L44;
        this.s = -1;
        int r3 = (int) r10.getX();
        int r4 = (int) r10.getY();
        AppBarLayout r6 = (AppBarLayout) r9;
        WeakReference r5 = ((AppBarLayout.BaseBehavior) this).A;
        if (r5 == null) goto L30;
        View r7 = (View) r5.get();
        if (r7 != null) goto L26;
    L32:
        boolean r11 = false;
    L33:
        this.r = r11;
        if (r11 == false) goto L44;
        this.t = r4;
        this.s = r10.getPointerId(0);
        if (this.v != null) goto L38;
        this.v = VelocityTracker.obtain();
    L38:
        OverScroller r12 = this.q;
        if (r12 == null) goto L44;
        if (r12.isFinished() == true) goto L44;
        this.q.abortAnimation();
        return true;
    L26:
        if (r7.isShown() == false) goto L32;
        if (r7.canScrollVertically(-1) == true) goto L32;
    L30:
        if (r8.p(r9, r3, r4) == false) goto L32;
        r11 = true;
    L44:
        VelocityTracker r13 = this.v;
        if (r13 == null) goto L47;
        r13.addMovement(r10);
        goto L47
    }

    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout r22, View r23, MotionEvent r24) {
        int r1 = r24.getActionMasked();
        int r2 = 2;
        if (r1 == 1) goto L20;
        if (r1 != 2) goto L6;
        int r3 = r24.findPointerIndex(this.s);
        if (r3 == (-1)) goto L46;
        int r4 = (int) r24.getY(r3);
        int r5 = this.t - r4;
        this.t = r4;
        AppBarLayout r6 = (AppBarLayout) r23;
        z(r22, r23, y() - r5, r6.getTopInset() + (-r6.getDownNestedScrollRange()), 0);
    L19:
        boolean r7 = false;
    L39:
        VelocityTracker r8 = this.v;
        if (r8 == null) goto L43;
        r8.addMovement(r24);
    L43:
        if (this.r == true) goto L47;
        if (r7 == false) goto L46;
    L47:
        return true;
    L46:
        return false;
    L6:
        if (r1 != 3) goto L8;
    L35:
        r7 = false;
    L36:
        this.r = false;
        this.s = -1;
        VelocityTracker r9 = this.v;
        if (r9 == null) goto L39;
        r9.recycle();
        this.v = null;
        goto L39
    L8:
        if (r1 != 6) goto L19;
        if (r24.getActionIndex() != 0) goto L13;
        int r10 = 1;
    L14:
        this.s = r24.getPointerId(r10);
        this.t = (int) (r24.getY(r10) + 0.5f);
        goto L19
    L13:
        r10 = 0;
        goto L14
    L20:
        VelocityTracker r11 = this.v;
        if (r11 == null) goto L35;
        r11.addMovement(r24);
        this.v.computeCurrentVelocity(1000);
        float r12 = this.v.getYVelocity(this.s);
        AppBarLayout r13 = (AppBarLayout) r23;
        int r14 = -r13.getTotalScrollRange();
        Runnable r15 = this.p;
        if (r15 == null) goto L26;
        r23.removeCallbacks(r15);
        this.p = null;
    L26:
        if (this.q != null) goto L28;
        this.q = new OverScroller(r23.getContext());
    L28:
        this.q.fling(0, w(), 0, Math.round(r12), 0, 0, r14, 0);
        if (this.q.computeScrollOffset() == false) goto L31;
        pb0 r16 = new pb0(this, r22, r23, r2);
        this.p = r16;
        WeakHashMap r17 = j65.a;
        r23.postOnAnimation(r16);
    L34:
        r7 = true;
        goto L36
    L31:
        ((AppBarLayout.BaseBehavior) this).F(r22, r13);
        if (r13.y == false) goto L34;
        r13.g(r13.h(AppBarLayout.BaseBehavior.C(r22)));
        goto L34
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout r1, View r2, int r3, int r4, int r5);
}
