package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c43 extends z2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ d43 s;

    public c43(d43 d43Var, int i, boolean z) {
        this.s = d43Var;
        this.q = i;
        this.r = z;
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        this.n.onInitializeAccessibilityNodeInfo(view, v3Var.a);
        l43 l43Var = this.s.t;
        int i = this.q;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (l43Var.r.c(i3) == 2 || l43Var.r.c(i3) == 3) {
                i2--;
            }
        }
        v3Var.k(u3.a(i2, 1, 1, 1, this.r, view.isSelected()));
    }
}
