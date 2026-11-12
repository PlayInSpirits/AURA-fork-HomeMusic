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

    public jq4(TabLayout r1, Context r2) {
        this.o = r1;
        super(r2);
        setWillNotDraw(false);
    }

    public final void a(int r6) {
        TabLayout r0 = this.o;
        if (r0.c0 != 0) goto L5;
    L9:
        View r5 = getChildAt(r6);
        xi4 r1 = r0.U;
        Drawable r2 = r0.B;
        r1.getClass();
        RectF r7 = xi4.j(r0, r5);
        r2.setBounds((int) r7.left, r2.getBounds().top, (int) r7.right, r2.getBounds().bottom);
        r0.n = r6;
        return;
    L5:
        if (r0.getTabSelectedIndicator().getBounds().left == (-1)) goto L7;
        return;
    L7:
        if (r0.getTabSelectedIndicator().getBounds().right == (-1)) goto L9;
    }

    public final void b(int r5) {
        TabLayout r0 = this.o;
        Rect r1 = r0.B.getBounds();
        r0.B.setBounds(r1.left, 0, r1.right, r5);
        requestLayout();
    }

    public final void c(View r7, View r8, float r9) {
        TabLayout r1 = this.o;
        if (r7 != null) goto L5;
    L7:
        Drawable r10 = r1.B;
        r10.setBounds(-1, r10.getBounds().top, -1, r1.B.getBounds().bottom);
    L8:
        WeakHashMap r11 = j65.a;
        postInvalidateOnAnimation();
        return;
    L5:
        if (r7.getWidth() <= 0) goto L7;
        r1.U.y(r1, r7, r8, r9, r1.B);
        goto L8
    }

    public final void d(int r4, int r5, boolean r6) {
        TabLayout r0 = this.o;
        if (r0.n != r4) goto L5;
        return;
    L5:
        View r1 = getChildAt(r0.getSelectedTabPosition());
        View r2 = getChildAt(r4);
        if (r2 != null) goto L9;
        a(r0.getSelectedTabPosition());
        return;
    L9:
        r0.n = r4;
        w51 r7 = new w51(this, r1, r2);
        if (r6 == false) goto L13;
        ValueAnimator r8 = new ValueAnimator();
        this.n = r8;
        r8.setInterpolator(r0.V);
        r8.setDuration(r5);
        r8.setFloatValues(new float[]{0.0f, 1.0f});
        r8.addUpdateListener(r7);
        r8.start();
        return;
    L13:
        this.n.removeAllUpdateListeners();
        this.n.addUpdateListener(r7);
    }

    @Override // android.view.View
    public final void draw(Canvas r7) {
        TabLayout r0 = this.o;
        int r1 = r0.B.getBounds().height();
        if (r1 >= 0) goto L5;
        r1 = r0.B.getIntrinsicHeight();
    L5:
        int r2 = r0.N;
        if (r2 != 0) goto L8;
        int r3 = getHeight() - r1;
        r1 = getHeight();
    L18:
        if (r0.B.getBounds().width() <= 0) goto L20;
        Rect r4 = r0.B.getBounds();
        r0.B.setBounds(r4.left, r3, r4.right, r1);
        r0.B.draw(r7);
    L20:
        super.draw(r7);
        return;
    L8:
        if (r2 == 1) goto L15;
        r3 = 0;
        if (r2 == 2) goto L18;
        if (r2 == 3) goto L14;
        r1 = 0;
        goto L18
    L14:
        r1 = getHeight();
        goto L18
    L15:
        r3 = (getHeight() - r1) / 2;
        r1 = (getHeight() + r1) / 2;
        goto L18
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        ValueAnimator r6 = this.n;
        TabLayout r7 = this.o;
        if (r6 == null) goto L9;
        if (r6.isRunning() == false) goto L9;
        d(r7.getSelectedTabPosition(), -1, false);
        return;
    L9:
        if (r7.n != (-1)) goto L11;
        r7.n = r7.getSelectedTabPosition();
    L11:
        a(r7.n);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r10, int r11) {
        super.onMeasure(r10, r11);
        if (View.MeasureSpec.getMode(r10) != 1073741824) goto L40;
        TabLayout r0 = this.o;
        boolean r3 = true;
        if (r0.L != 1) goto L8;
    L9:
        int r1 = getChildCount();
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L10:
        if (r5 >= r1) goto L15;
        View r7 = getChildAt(r5);
        if (r7.getVisibility() != 0) goto L14;
        r6 = Math.max(r6, r7.getMeasuredWidth());
    L14:
        r5 = r5 + 1;
        goto L10
    L15:
        if (r6 > 0) goto L18;
        return;
    L18:
        if ((r6 * r1) > (getMeasuredWidth() - (((int) vr1.l(getContext(), 16)) * 2))) goto L28;
        boolean r2 = false;
    L20:
        if (r4 >= r1) goto L27;
        LinearLayout.LayoutParams r8 = (LinearLayout.LayoutParams) getChildAt(r4).getLayoutParams();
        if (r8.width == r6) goto L24;
    L25:
        r8.width = r6;
        r8.weight = 0.0f;
        r2 = true;
    L26:
        r4 = r4 + 1;
        goto L20
    L24:
        if (r8.weight == 0.0f) goto L26;
    L27:
        r3 = r2;
    L29:
        if (r3 == false) goto L39;
        super.onMeasure(r10, r11);
        return;
    L39:
        return;
    L28:
        r0.L = 0;
        r0.k(false);
        goto L29
    L8:
        if (r0.O == 2) goto L9;
        return;
    }
}
