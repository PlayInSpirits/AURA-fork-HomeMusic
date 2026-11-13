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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class is0 extends kw3 {
    public static final int[] d = {R.attr.listDivider};
    public Drawable a;
    public final int b;
    public final Rect c = new Rect();

    public is0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.b = 1;
    }

    @Override // defpackage.kw3
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw3Var) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.kw3
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() == null || this.a == null) {
            return;
        }
        int i3 = 0;
        int i4 = this.b;
        Rect rect = this.c;
        if (i4 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.O(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.a.setBounds(i2, round - this.a.getIntrinsicHeight(), width, round);
                this.a.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().z(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.a.setBounds(round2 - this.a.getIntrinsicWidth(), i, round2, height);
            this.a.draw(canvas);
            i3++;
        }
        canvas.restore();
    }
}
