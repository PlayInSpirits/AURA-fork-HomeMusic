package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
    public final boolean m(CoordinatorLayout r6, View r7, int r8, int r9, int r10) {
        int r0 = r7.getLayoutParams().height;
        if (r0 != (-1)) goto L5;
    L6:
        AppBarLayout r2 = AppBarLayout.ScrollingViewBehavior.z(r6.k(r7));
        if (r2 == null) goto L27;
        int r11 = View.MeasureSpec.getSize(r10);
        if (r11 <= 0) goto L15;
        WeakHashMap r3 = j65.a;
        if (r2.getFitsSystemWindows() == false) goto L16;
        pb5 r4 = r6.getLastWindowInsets();
        if (r4 == null) goto L16;
        r11 = r11 + (r4.a() + r4.d());
    L16:
        int r5 = r2.getTotalScrollRange() + r11;
        int r12 = r2.getMeasuredHeight();
        if ((this instanceof SearchBar.ScrollingViewBehavior) == false) goto L19;
        r7.setTranslationY(-r12);
    L20:
        if (r0 != (-1)) goto L22;
        int r13 = 1073741824;
    L23:
        r6.s(r8, r9, View.MeasureSpec.makeMeasureSpec(r5, r13), r7);
        return true;
    L22:
        r13 = Integer.MIN_VALUE;
        goto L23
    L19:
        r7.setTranslationY(0.0f);
        r5 = r5 - r12;
        goto L20
    L15:
        r11 = r6.getHeight();
        goto L16
    L27:
        return false;
    L5:
        if (r0 == (-2)) goto L6;
        return false;
    }

    @Override // defpackage.g75
    public final void x(CoordinatorLayout r14, View r15, int r16) {
        AppBarLayout r0 = AppBarLayout.ScrollingViewBehavior.z(r14.k(r15));
        if (r0 == null) goto L16;
        ge0 r1 = (ge0) r15.getLayoutParams();
        int r2 = r14.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r1).leftMargin;
        int r3 = r0.getBottom() + ((ViewGroup.MarginLayoutParams) r1).topMargin;
        int r4 = (r14.getWidth() - r14.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r1).rightMargin;
        int r6 = ((r0.getBottom() + r14.getHeight()) - r14.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r1).bottomMargin;
        Rect r10 = this.p;
        r10.set(r2, r3, r4, r6);
        pb5 r5 = r14.getLastWindowInsets();
        if (r5 == null) goto L11;
        WeakHashMap r7 = j65.a;
        if (r14.getFitsSystemWindows() == false) goto L11;
        if (r15.getFitsSystemWindows() == true) goto L11;
        r10.left = r5.b() + r10.left;
        r10.right -= r5.c();
    L11:
        int r17 = r1.c;
        if (r17 != 0) goto L14;
        r17 = 8388659;
    L14:
        int r8 = r15.getMeasuredWidth();
        int r9 = r15.getMeasuredHeight();
        Rect r11 = this.q;
        Gravity.apply(r17, r8, r9, r10, r11, r16);
        int r18 = y(r0);
        r15.layout(r11.left, r11.top - r18, r11.right, r11.bottom - r18);
        this.r = r11.top - r0.getBottom();
        return;
    L16:
        r14.r(r15, r16);
        this.r = 0;
    }

    public final int y(View r6) {
        if (this.s != 0) goto L5;
        return 0;
    L5:
        float r2 = 0.0f;
        if ((r6 instanceof AppBarLayout) == false) goto L18;
        AppBarLayout r7 = (AppBarLayout) r6;
        int r0 = r7.getTotalScrollRange();
        int r3 = r7.getDownNestedPreScrollRange();
        de0 r8 = ((ge0) r7.getLayoutParams()).a;
        if ((r8 instanceof AppBarLayout.BaseBehavior) == false) goto L10;
        int r9 = ((AppBarLayout.BaseBehavior) r8).y();
    L11:
        if (r3 != 0) goto L13;
    L15:
        int r1 = r0 - r3;
        if (r1 == 0) goto L18;
        r2 = (r9 / r1) + 1.0f;
        goto L18
    L13:
        if ((r0 + r9) > r3) goto L15;
    L10:
        r9 = 0;
    L18:
        int r5 = this.s;
        return su3.l((int) (r2 * r5), 0, r5);
    }

    public rl1(int r2) {
        super(0);
        this.p = new Rect();
        this.q = new Rect();
        this.r = 0;
    }
}
