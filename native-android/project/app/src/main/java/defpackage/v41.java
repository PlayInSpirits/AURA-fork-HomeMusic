package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View n;
    public final /* synthetic */ int o;
    public final /* synthetic */ w41 p;
    public final /* synthetic */ ExpandableBehavior q;

    public v41(ExpandableBehavior r1, View r2, int r3, w41 r4) {
        this.q = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View r0 = this.n;
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior r1 = this.q;
        if (r1.n != this.o) goto L5;
        Object r5 = this.p;
        r1.w((View) r5, r0, ((FloatingActionButton) r5).B.b, false);
    L5:
        return false;
    }
}
