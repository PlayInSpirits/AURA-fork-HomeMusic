package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class id extends ViewGroup {
    public final HashMap n;
    public final HashMap o;

    public id(Context r1) {
        super(r1);
        setClipChildren(false);
        this.n = new HashMap();
        this.o = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r1) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent r1) {
        return true;
    }

    public final HashMap<Object, c72> getHolderToLayoutNode() {
        return this.n;
    }

    public final HashMap<c72, Object> getLayoutNodeToHolder() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] r1, Rect r2) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View r1, View r2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        Iterator r0 = this.n.keySet().iterator();
        if (r0.hasNext() == true) goto L6;
        return;
    L6:
        throw xa3.d(r0);
    }

    @Override // android.view.View
    public final void onMeasure(int r3, int r4) {
        if (View.MeasureSpec.getMode(r3) == 1073741824) goto L7;
        cz1.a("widthMeasureSpec should be EXACTLY");
    L7:
        if (View.MeasureSpec.getMode(r4) == 1073741824) goto L10;
        cz1.a("heightMeasureSpec should be EXACTLY");
    L10:
        setMeasuredDimension(View.MeasureSpec.getSize(r3), View.MeasureSpec.getSize(r4));
        Iterator r2 = this.n.keySet().iterator();
        if (r2.hasNext() == true) goto L14;
        return;
    L14:
        throw xa3.d(r2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int r0 = getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        View r3 = getChildAt(r2);
        c72 r4 = (c72) this.n.get(r3);
        if (r3.isLayoutRequested() == false) goto L8;
        if (r4 == null) goto L8;
        c72.W(r4, false, 7);
    L8:
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
