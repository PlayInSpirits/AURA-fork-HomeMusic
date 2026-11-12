package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        cx3 cx3VarM = recyclerView.M(view);
        if (!(cx3VarM instanceof rp3) || !((rp3) cx3VarM).y) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        cx3 cx3VarM2 = recyclerView.M(recyclerView.getChildAt(iIndexOfChild + 1));
        return (cx3VarM2 instanceof rp3) && ((rp3) cx3VarM2).x;
    }
}
