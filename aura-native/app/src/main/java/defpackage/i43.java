package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i43 extends ex3 {
    public final /* synthetic */ l43 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(l43 l43Var, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.s = l43Var;
    }

    @Override // defpackage.ex3, defpackage.z2
    public final void d(View view, v3 v3Var) {
        super.d(view, v3Var);
        l43 l43Var = this.s.r.t;
        int i = 0;
        for (int i2 = 0; i2 < l43Var.r.q.size(); i2++) {
            int c = l43Var.r.c(i2);
            if (c == 0 || c == 1) {
                i++;
            }
        }
        v3Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
