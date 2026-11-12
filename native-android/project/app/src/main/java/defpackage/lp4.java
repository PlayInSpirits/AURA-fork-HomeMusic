package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp4 extends Animation {
    public final /* synthetic */ int n;
    public final /* synthetic */ SwipeRefreshLayout o;

    public /* synthetic */ lp4(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.n = i;
        this.o = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.n;
        SwipeRefreshLayout swipeRefreshLayout = this.o;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                int iAbs = swipeRefreshLayout.K - Math.abs(swipeRefreshLayout.J);
                int i2 = swipeRefreshLayout.I;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((iAbs - i2) * f))) - swipeRefreshLayout.G.getTop());
                f30 f30Var = swipeRefreshLayout.M;
                float f2 = 1.0f - f;
                e30 e30Var = f30Var.n;
                if (f2 != e30Var.p) {
                    e30Var.p = f2;
                }
                f30Var.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.k(f);
                break;
        }
    }
}
