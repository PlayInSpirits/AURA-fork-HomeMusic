package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v41 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View n;
    public final /* synthetic */ int o;
    public final /* synthetic */ w41 p;
    public final /* synthetic */ ExpandableBehavior q;

    public v41(ExpandableBehavior expandableBehavior, View view, int i, w41 w41Var) {
        this.q = expandableBehavior;
        this.n = view;
        this.o = i;
        this.p = w41Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.n;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.q;
        if (expandableBehavior.n == this.o) {
            Object obj = this.p;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).B.b, false);
        }
        return false;
    }
}
