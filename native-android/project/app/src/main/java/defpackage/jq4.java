package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jq4 extends LinearLayout {
    public static final /* synthetic */ int p = 0;
    public ValueAnimator n;
    public final /* synthetic */ TabLayout o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq4(TabLayout tabLayout, Context context) {
        super(context);
        this.o = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.o;
        if (tabLayout.c0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            xi4 xi4Var = tabLayout.U;
            Drawable drawable = tabLayout.B;
            xi4Var.getClass();
            RectF rectFJ = xi4.j(tabLayout, childAt);
            drawable.setBounds((int) rectFJ.left, drawable.getBounds().top, (int) rectFJ.right, drawable.getBounds().bottom);
            tabLayout.n = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.o;
        Rect bounds = tabLayout.B.getBounds();
        tabLayout.B.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.o;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.B;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.B.getBounds().bottom);
        } else {
            tabLayout.U.y(tabLayout, view, view2, f, tabLayout.B);
        }
        WeakHashMap weakHashMap = j65.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.o;
        if (tabLayout.n == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.n = i;
        w51 w51Var = new w51(this, childAt, childAt2);
        if (!z) {
            this.n.removeAllUpdateListeners();
            this.n.addUpdateListener(w51Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.n = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.V);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(w51Var);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.o;
        int iHeight = tabLayout.B.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.B.getIntrinsicHeight();
        }
        int i = tabLayout.N;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.B.getBounds().width() > 0) {
            Rect bounds = tabLayout.B.getBounds();
            tabLayout.B.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.B.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.n;
        TabLayout tabLayout = this.o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.n == -1) {
            tabLayout.n = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.n);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.o;
        boolean z = true;
        if (tabLayout.L == 1 || tabLayout.O == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) vr1.l(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.L = 0;
                tabLayout.k(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
