package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qt extends m33 {
    public final int U;
    public final int V;
    public final int W;
    public final int a0;
    public boolean b0;
    public final ArrayList c0;

    public qt(Context r2) {
        super(r2);
        this.c0 = new ArrayList();
        FrameLayout.LayoutParams r3 = new FrameLayout.LayoutParams(-2, -2);
        r3.gravity = 17;
        setLayoutParams(r3);
        Resources r4 = getResources();
        this.U = r4.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.V = r4.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.W = r4.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.a0 = r4.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        int r10 = getChildCount();
        int r11 = r8 - r6;
        int r12 = r9 - r7;
        int r13 = 0;
        int r0 = 0;
    L3:
        if (r13 >= r10) goto L13;
        View r1 = getChildAt(r13);
        if (r1.getVisibility() == 8) goto L12;
        WeakHashMap r2 = j65.a;
        if (getLayoutDirection() != 1) goto L10;
        int r3 = r11 - r0;
        r1.layout(r3 - r1.getMeasuredWidth(), 0, r3, r12);
    L11:
        r0 = r0 + r1.getMeasuredWidth();
        goto L12
    L10:
        r1.layout(r0, 0, r1.getMeasuredWidth() + r0, r12);
    L12:
        r13 = r13 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
        qu2 r0 = getMenu();
        int r15 = View.MeasureSpec.getSize(r13);
        int r1 = r0.l().size();
        int r2 = getChildCount();
        ArrayList r3 = this.c0;
        r3.clear();
        int r16 = View.MeasureSpec.getSize(r14);
        int r4 = View.MeasureSpec.makeMeasureSpec(r16, 1073741824);
        int r5 = getLabelVisibilityMode();
        int r7 = this.W;
        int r9 = 0;
        int r10 = 1;
        if (r5 == (-1)) goto L5;
        if (r5 == 0) goto L9;
    L33:
        if (r1 == 0) goto L36;
        r10 = r1;
    L36:
        int r6 = Math.min(r15 / r10, r7);
        int r17 = r15 - (r1 * r6);
        int r8 = 0;
    L37:
        if (r8 >= r2) goto L45;
        if (getChildAt(r8).getVisibility() == 8) goto L43;
        if (r17 <= 0) goto L42;
        int r11 = r6 + 1;
        r17 = r17 - 1;
    L44:
        r3.add(Integer.valueOf(r11));
        r8 = r8 + 1;
        goto L37
    L42:
        r11 = r6;
        goto L44
    L43:
        r11 = 0;
    L45:
        int r18 = 0;
    L46:
        if (r9 >= r2) goto L52;
        View r12 = getChildAt(r9);
        if (r12.getVisibility() == 8) goto L51;
        r12.measure(View.MeasureSpec.makeMeasureSpec(((Integer) r3.get(r9)).intValue(), 1073741824), r4);
        r12.getLayoutParams().width = r12.getMeasuredWidth();
        r18 = r12.getMeasuredWidth() + r18;
    L51:
        r9 = r9 + 1;
        goto L46
    L52:
        setMeasuredDimension(r18, r16);
        return;
    L9:
        if (this.b0 == false) goto L33;
        View r19 = getChildAt(getSelectedItemPosition());
        int r20 = r19.getVisibility();
        int r110 = this.a0;
        if (r20 == 8) goto L14;
        r19.measure(View.MeasureSpec.makeMeasureSpec(r7, Integer.MIN_VALUE), r4);
        r110 = Math.max(r110, r19.getMeasuredWidth());
    L14:
        if (r19.getVisibility() == 8) goto L16;
        int r21 = 1;
    L17:
        int r22 = r1 - r21;
        int r23 = Math.min(r15 - (this.V * r22), Math.min(r110, r7));
        int r111 = r15 - r23;
        if (r22 == 0) goto L21;
        r10 = r22;
    L21:
        int r24 = Math.min(r111 / r10, this.U);
        int r112 = r111 - (r22 * r24);
        int r25 = 0;
    L22:
        if (r25 >= r2) goto L45;
        if (getChildAt(r25).getVisibility() != 8) goto L26;
        int r26 = 0;
    L32:
        r3.add(Integer.valueOf(r26));
        r25 = r25 + 1;
        goto L22
    L26:
        if (r25 != getSelectedItemPosition()) goto L28;
        r26 = r23;
    L29:
        if (r112 <= 0) goto L32;
        r26 = r26 + 1;
        r112 = r112 - 1;
        goto L32
    L28:
        r26 = r24;
        goto L29
    L16:
        r21 = 0;
        goto L17
    L5:
        if (r1 <= 3) goto L33;
        goto L33
    }

    public void setItemHorizontalTranslationEnabled(boolean r1) {
        this.b0 = r1;
    }
}
