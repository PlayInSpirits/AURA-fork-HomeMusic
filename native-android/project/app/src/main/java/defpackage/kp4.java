package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kp4 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ kp4(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        np4 np4Var;
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                if (!swipeRefreshLayout.p) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.M.setAlpha(255);
                    swipeRefreshLayout.M.start();
                    if (swipeRefreshLayout.R && (np4Var = swipeRefreshLayout.o) != null) {
                        np4Var.j();
                    }
                    swipeRefreshLayout.A = swipeRefreshLayout.G.getTop();
                }
                break;
            default:
                lp4 lp4Var = new lp4(swipeRefreshLayout, 1);
                swipeRefreshLayout.O = lp4Var;
                lp4Var.setDuration(150L);
                w20 w20Var = swipeRefreshLayout.G;
                w20Var.n = null;
                w20Var.clearAnimation();
                swipeRefreshLayout.G.startAnimation(swipeRefreshLayout.O);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
    }
}
