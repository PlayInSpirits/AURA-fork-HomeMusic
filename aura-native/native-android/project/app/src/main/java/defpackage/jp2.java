package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jp2 extends Animation {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ View q;

    public jp2(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.n = 2;
        this.q = swipeRefreshLayout;
        this.o = i;
        this.p = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.n;
        int i2 = this.p;
        int i3 = this.o;
        View view = this.q;
        switch (i) {
            case 0:
                qp2.r(view, i3 - ((int) ((i3 - i2) * f)));
                break;
            case 1:
                int i4 = i2 + ((int) ((i3 - i2) * f));
                int i5 = lq2.g0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i4;
                view.setLayoutParams(layoutParams);
                break;
            default:
                ((SwipeRefreshLayout) view).M.setAlpha((int) (((i2 - i3) * f) + i3));
                break;
        }
    }

    public /* synthetic */ jp2(int i, int i2, int i3, View view) {
        this.n = i3;
        this.o = i;
        this.p = i2;
        this.q = view;
    }
}
