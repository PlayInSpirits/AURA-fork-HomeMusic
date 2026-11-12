package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qv0 extends ViewGroup {
    public final void a(jz r1, View r2, long r3) {
        super.drawChild(ba.a(r1), r2, r3);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] r1, Rect r2) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
