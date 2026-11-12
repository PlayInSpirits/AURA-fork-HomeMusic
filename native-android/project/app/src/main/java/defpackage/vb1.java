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
    public final int[] v;

    public vb1(View r3) {
        this.v = new int[2];
        this.q = r3;
        r3.setLongClickable(true);
        r3.addOnAttachStateChangeListener(this);
        this.n = ViewConfiguration.get(r3.getContext()).getScaledTouchSlop();
        int r4 = ViewConfiguration.getTapTimeout();
        this.o = r4;
        this.p = (ViewConfiguration.getLongPressTimeout() + r4) / 2;
    }

    public final void a() {
        ub1 r0 = this.s;
        View r1 = this.q;
        if (r0 == null) goto L5;
        r1.removeCallbacks(r0);
    L5:
        ub1 r2 = this.r;
        if (r2 == null) goto L9;
        r1.removeCallbacks(r2);
        return;
    }

    public abstract nd4 b();

    public abstract boolean c();

    public boolean d() {
        nd4 r1 = b();
        if (r1 != null) goto L5;
        return true;
    L5:
        if (r1.b() == false) goto L10;
        r1.dismiss();
        return true;
    L10:
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r13, MotionEvent r14) {
        boolean r15 = this.t;
        View r1 = this.q;
        if (r15 == false) goto L27;
        nd4 r4 = b();
        if (r4 == null) goto L23;
        if (r4.b() == false) goto L23;
        cx0 r5 = r4.k();
        if (r5 == null) goto L23;
        if (r5.isShown() == false) goto L23;
        MotionEvent r6 = MotionEvent.obtainNoHistory(r14);
        int[] r7 = this.v;
        r1.getLocationOnScreen(r7);
        r6.offsetLocation(r7[0], r7[1]);
        r5.getLocationOnScreen(r7);
        r6.offsetLocation(-r7[0], -r7[1]);
        boolean r2 = r5.b(r6, this.u);
        r6.recycle();
        int r16 = r14.getActionMasked();
        if (r16 == 1) goto L18;
        if (r16 == 3) goto L18;
        boolean r17 = true;
    L19:
        if (r2 == false) goto L23;
        if (r17 == false) goto L23;
    L24:
        boolean r18 = true;
    L61:
        this.t = r18;
        if (r18 == true) goto L66;
        if (r15 == true) goto L66;
        return false;
    L66:
        return true;
    L18:
        r17 = false;
    L23:
        if (d() == false) goto L24;
        r18 = false;
        goto L61
    L27:
        if (r1.isEnabled() == false) goto L58;
        int r8 = r14.getActionMasked();
        if (r8 == 0) goto L51;
        if (r8 != 1) goto L33;
    L50:
        a();
        goto L58
    L33:
        if (r8 == 2) goto L36;
        if (r8 == 3) goto L50;
    L36:
        int r0 = r14.findPointerIndex(this.u);
        if (r0 < 0) goto L58;
        float r9 = r14.getX(r0);
        float r19 = r14.getY(r0);
        float r3 = this.n;
        float r10 = -r3;
        if (r9 >= r10) goto L41;
    L47:
        a();
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        if (c() == false) goto L58;
        r18 = true;
    L59:
        if (r18 == false) goto L61;
        long r11 = SystemClock.uptimeMillis();
        MotionEvent r12 = MotionEvent.obtain(r11, r11, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r12);
        r12.recycle();
        goto L61
    L41:
        if (r19 < r10) goto L47;
        if (r9 >= ((r1.getRight() - r1.getLeft()) + r3)) goto L47;
        if (r19 >= ((r1.getBottom() - r1.getTop()) + r3)) goto L47;
    L51:
        this.u = r14.getPointerId(0);
        if (this.r != null) goto L54;
        this.r = new ub1(this, 0);
    L54:
        r1.postDelayed(this.r, this.o);
        if (this.s != null) goto L57;
        this.s = new ub1(this, 1);
    L57:
        r1.postDelayed(this.s, this.p);
    L58:
        r18 = false;
        goto L59
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
        this.t = false;
        this.u = -1;
        ub1 r2 = this.r;
        if (r2 == null) goto L6;
        this.q.removeCallbacks(r2);
        return;
    }
}
