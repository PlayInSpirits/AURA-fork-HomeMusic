package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jp3 extends kw3 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ kp3 d;

    public jp3(kp3 kp3Var) {
        this.d = kp3Var;
    }

    @Override // defpackage.kw3
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw3Var) {
        if (i(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.kw3
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (i(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean i(View view, RecyclerView recyclerView) {
        cx3 M = recyclerView.M(view);
        if (!(M instanceof rp3) || !((rp3) M).y) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        cx3 M2 = recyclerView.M(recyclerView.getChildAt(indexOfChild + 1));
        return (M2 instanceof rp3) && ((rp3) M2).x;
    }
}
