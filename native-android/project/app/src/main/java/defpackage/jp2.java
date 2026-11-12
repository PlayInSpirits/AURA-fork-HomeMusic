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

    public jp2(SwipeRefreshLayout r2, int r3, int r4) {
        this.n = 2;
        this.q = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r3, Transformation r4) {
        int r5 = this.n;
        int r0 = this.p;
        int r1 = this.o;
        View r2 = this.q;
        switch(r5) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((SwipeRefreshLayout) r2).M.setAlpha((int) (((r0 - r1) * r3) + r1));
        return;
    L6:
        int r6 = r0 + ((int) ((r1 - r0) * r3));
        int r7 = lq2.g0;
        ViewGroup.LayoutParams r8 = r2.getLayoutParams();
        r8.height = r6;
        r2.setLayoutParams(r8);
        return;
    L8:
        qp2.r(r2, r1 - ((int) ((r1 - r0) * r3)));
    }

    public /* synthetic */ jp2(int r1, int r2, int r3, View r4) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
        this.q = r4;
    }
}
