package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class rl1 extends g75 {
    public final Rect p;
    public final Rect q;
    public int r;
    public int s;

    public rl1() {
        this.p = new Rect();
        this.q = new Rect();
        this.r = 0;
    }

    @Override // defpackage.de0
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout z;
        pb5 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = j65.a;
            if (z.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = z.getTotalScrollRange() + size;
        int measuredHeight = z.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    @Override // defpackage.g75
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view));
        if (z == null) {
            coordinatorLayout.r(view, i);
            this.r = 0;
            return;
        }
        ge0 ge0Var = (ge0) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin;
        int bottom = z.getBottom() + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin;
        int bottom2 = ((z.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin;
        Rect rect = this.p;
        rect.set(paddingLeft, bottom, width, bottom2);
        pb5 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = j65.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = ge0Var.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.q;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int y = y(z);
        view.layout(rect2.left, rect2.top - y, rect2.right, rect2.bottom - y);
        this.r = rect2.top - z.getBottom();
    }

    public final int y(View view) {
        int i;
        if (this.s == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            de0 de0Var = ((ge0) appBarLayout.getLayoutParams()).a;
            int y = de0Var instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) de0Var).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + y > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (y / i) + 1.0f;
            }
        }
        int i2 = this.s;
        return su3.l((int) (f * i2), 0, i2);
    }

    public rl1(int i) {
        super(0);
        this.p = new Rect();
        this.q = new Rect();
        this.r = 0;
    }
}
