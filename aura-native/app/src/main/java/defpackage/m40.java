package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m40 implements af {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public m40(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.af
    public final void a(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        k40 k40Var = collapsingToolbarLayout.x;
        collapsingToolbarLayout.L = i;
        pb5 pb5Var = collapsingToolbarLayout.N;
        int d = pb5Var != null ? pb5Var.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            l40 l40Var = (l40) childAt.getLayoutParams();
            h75 b = CollapsingToolbarLayout.b(childAt);
            int i3 = l40Var.a;
            if (i3 == 1) {
                b.b(su3.l(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((l40) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round((-i) * l40Var.b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.C != null && d > 0) {
            WeakHashMap weakHashMap = j65.a;
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        WeakHashMap weakHashMap2 = j65.a;
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
        float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        float f = minimumHeight;
        float min = Math.min(1.0f, scrimVisibleHeightTrigger / f);
        k40Var.d = min;
        k40Var.e = xa3.a(1.0f, min, 0.5f, min);
        k40Var.f = collapsingToolbarLayout.L + minimumHeight;
        k40Var.p(Math.abs(i) / f);
    }
}
