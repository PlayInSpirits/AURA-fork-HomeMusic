package com.eddyizm.tempus.helper.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.nz2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollableHost extends FrameLayout {
    public final int n;
    public float o;
    public float p;

    public NestedScrollableHost(Context r1) {
        r1.getClass();
        super(r1);
        this.n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) goto L5;
        return null;
    L5:
        return getChildAt(0);
    }

    private final ViewPager2 getParentViewPager() {
        Object r2 = getParent();
        if ((r2 instanceof View) == false) goto L5;
        View r3 = (View) r2;
    L6:
        if (r3 == null) goto L13;
        if ((r3 instanceof ViewPager2) == true) goto L13;
        Object r4 = r3.getParent();
        if ((r4 instanceof View) == false) goto L5;
        r3 = (View) r4;
        goto L6
    L5:
        r3 = null;
    L13:
        if ((r3 instanceof ViewPager2) == true) goto L15;
        return null;
    L15:
        return (ViewPager2) r3;
    L17:
        r3 = null;
        goto L6
    }

    public final boolean a(int r3, float r4) {
        int r5 = -((int) Math.signum(r4));
        if (r3 != 0) goto L5;
        View r2 = getChild();
        if (r2 != null) goto L16;
        return false;
    L16:
        return r2.canScrollHorizontally(r5);
    L5:
        if (r3 != 1) goto L11;
        View r6 = getChild();
        if (r6 != null) goto L9;
        return false;
    L9:
        return r6.canScrollVertically(r5);
    L11:
        nz2.c();
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r11) {
        r11.getClass();
        ViewPager2 r0 = getParentViewPager();
        if (r0 == null) goto L44;
        int r1 = r0.getOrientation();
        float r2 = 1.0f;
        if (a(r1, -1.0f) == true) goto L10;
        if (a(r1, 1.0f) == false) goto L44;
    L10:
        if (r11.getAction() != 0) goto L13;
        this.o = r11.getX();
        this.p = r11.getY();
        getParent().requestDisallowInterceptTouchEvent(true);
        goto L44
    L13:
        if (r11.getAction() != 2) goto L44;
        float r3 = r11.getX() - this.o;
        float r4 = r11.getY() - this.p;
        if (r1 != 0) goto L17;
        boolean r6 = true;
    L18:
        float r7 = Math.abs(r3);
        if (r6 == false) goto L21;
        float r9 = 0.5f;
    L22:
        float r8 = r7 * r9;
        float r10 = Math.abs(r4);
        if (r6 == true) goto L26;
        r2 = 0.5f;
    L26:
        float r12 = r10 * r2;
        float r5 = this.n;
        if (r8 > r5) goto L31;
        if (r12 <= r5) goto L44;
    L31:
        if (r12 <= r8) goto L33;
        boolean r13 = true;
    L34:
        if (r6 != r13) goto L36;
        getParent().requestDisallowInterceptTouchEvent(false);
        goto L44
    L36:
        if (r6 == true) goto L40;
        r3 = r4;
    L40:
        if (a(r1, r3) == false) goto L42;
        getParent().requestDisallowInterceptTouchEvent(true);
        goto L44
    L42:
        getParent().requestDisallowInterceptTouchEvent(false);
        goto L44
    L33:
        r13 = false;
        goto L34
    L21:
        r9 = 1.0f;
        goto L22
    L17:
        r6 = false;
    L44:
        return super.onInterceptTouchEvent(r11);
    }

    public NestedScrollableHost(Context r1, AttributeSet r2) {
        r1.getClass();
        super(r1, r2);
        this.n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
