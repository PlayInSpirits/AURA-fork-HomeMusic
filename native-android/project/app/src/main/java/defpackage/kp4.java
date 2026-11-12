package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kp4 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ kp4(SwipeRefreshLayout r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    private final void a(Animation r1) {
    }

    private final void b(Animation r1) {
    }

    private final void c(Animation r1) {
    }

    private final void d(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r3) {
        int r4 = this.a;
        SwipeRefreshLayout r2 = this.b;
        switch(r4) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        lp4 r5 = new lp4(r2, 1);
        r2.O = r5;
        r5.setDuration(150);
        w20 r6 = r2.G;
        r6.n = null;
        r6.clearAnimation();
        r2.G.startAnimation(r2.O);
        return;
    L7:
        if (r2.p == false) goto L14;
        r2.M.setAlpha(255);
        r2.M.start();
        if (r2.R == false) goto L13;
        np4 r7 = r2.o;
        if (r7 == null) goto L13;
        r7.j();
    L13:
        r2.A = r2.G.getTop();
        return;
    L14:
        r2.l();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
        int r0 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r1) {
        int r0 = this.a;
    }
}
