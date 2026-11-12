package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp4 extends Animation {
    public final /* synthetic */ int n;
    public final /* synthetic */ SwipeRefreshLayout o;

    public /* synthetic */ lp4(SwipeRefreshLayout r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r3, Transformation r4) {
        int r5 = this.n;
        SwipeRefreshLayout r2 = this.o;
        switch(r5) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r2.k(r3);
        return;
    L6:
        int r6 = r2.K - Math.abs(r2.J);
        int r1 = r2.I;
        r2.setTargetOffsetTopAndBottom((r1 + ((int) ((r6 - r1) * r3))) - r2.G.getTop());
        f30 r7 = r2.M;
        float r0 = 1.0f - r3;
        e30 r8 = r7.n;
        if (r0 == r8.p) goto L9;
        r8.p = r0;
    L9:
        r7.invalidateSelf();
        return;
    L11:
        r2.setAnimationProgress(1.0f - r3);
        return;
    L13:
        r2.setAnimationProgress(r3);
    }
}
