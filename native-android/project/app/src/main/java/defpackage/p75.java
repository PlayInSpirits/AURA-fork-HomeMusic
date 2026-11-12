package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p75 extends RecyclerView {
    public final /* synthetic */ ViewPager2 Y0;

    public p75(ViewPager2 r1, Context r2) {
        this.Y0 = r1;
        super(r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.Y0.G.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        ViewPager2 r1 = this.Y0;
        r2.setFromIndex(r1.q);
        r2.setToIndex(r1.q);
        r2.setSource((ViewPager2) r1.G.q);
        r2.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r2) {
        if (this.Y0.E == true) goto L5;
        return false;
    L5:
        if (super.onInterceptTouchEvent(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        if (this.Y0.E == true) goto L5;
        return false;
    L5:
        if (super.onTouchEvent(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
