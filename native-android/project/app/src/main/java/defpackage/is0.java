package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class is0 extends kw3 {
    public static final int[] d = null;
    public Drawable a;
    public final int b;
    public final Rect c;

    static {
        d = new int[]{R.attr.listDivider};
    }

    public is0(Context r3) {
        this.c = new Rect();
        TypedArray r4 = r3.obtainStyledAttributes(d);
        Drawable r0 = r4.getDrawable(0);
        this.a = r0;
        if (r0 != null) goto L5;
        Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
    L5:
        r4.recycle();
        this.b = 1;
    }

    @Override // defpackage.kw3
    public final void f(Rect r1, View r2, RecyclerView r3, yw3 r4) {
        Drawable r5 = this.a;
        if (r5 != null) goto L7;
        r1.set(0, 0, 0, 0);
        return;
    L7:
        if (this.b != 1) goto L10;
        r1.set(0, 0, 0, r5.getIntrinsicHeight());
        return;
    L10:
        r1.set(0, 0, r5.getIntrinsicWidth(), 0);
    }

    @Override // defpackage.kw3
    public final void g(Canvas r9, RecyclerView r10) {
        if (r10.getLayoutManager() != null) goto L5;
        return;
    L5:
        if (this.a == null) goto L30;
        int r0 = 0;
        int r2 = this.b;
        Rect r3 = this.c;
        if (r2 != 1) goto L18;
        r9.save();
        if (r10.getClipToPadding() == false) goto L12;
        int r1 = r10.getPaddingLeft();
        int r4 = r10.getWidth() - r10.getPaddingRight();
        r9.clipRect(r1, r10.getPaddingTop(), r4, r10.getHeight() - r10.getPaddingBottom());
    L13:
        int r5 = r10.getChildCount();
    L14:
        if (r0 >= r5) goto L16;
        View r6 = r10.getChildAt(r0);
        RecyclerView.O(r6, r3);
        int r7 = Math.round(r6.getTranslationY()) + r3.bottom;
        this.a.setBounds(r1, r7 - this.a.getIntrinsicHeight(), r4, r7);
        this.a.draw(r9);
        r0 = r0 + 1;
        goto L14
    L16:
        r9.restore();
        return;
    L12:
        r4 = r10.getWidth();
        r1 = 0;
        goto L13
    L18:
        r9.save();
        if (r10.getClipToPadding() == false) goto L21;
        int r8 = r10.getPaddingTop();
        int r11 = r10.getHeight() - r10.getPaddingBottom();
        r9.clipRect(r10.getPaddingLeft(), r8, r10.getWidth() - r10.getPaddingRight(), r11);
    L22:
        int r12 = r10.getChildCount();
    L23:
        if (r0 >= r12) goto L25;
        View r13 = r10.getChildAt(r0);
        r10.getLayoutManager().z(r13, r3);
        int r14 = Math.round(r13.getTranslationX()) + r3.right;
        this.a.setBounds(r14 - this.a.getIntrinsicWidth(), r8, r14, r11);
        this.a.draw(r9);
        r0 = r0 + 1;
        goto L23
    L25:
        r9.restore();
        return;
    L21:
        r11 = r10.getHeight();
        r8 = 0;
        goto L22
    }
}
