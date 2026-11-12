package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i43 extends ex3 {
    public final /* synthetic */ l43 s;

    public i43(l43 r1, NavigationMenuView r2) {
        this.s = r1;
        super(r2);
    }

    @Override // defpackage.ex3, defpackage.z2
    public final void d(View r5, v3 r6) {
        super.d(r5, r6);
        l43 r4 = this.s.r.t;
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= r4.r.q.size()) goto L10;
        int r2 = r4.r.c(r0);
        if (r2 == 0) goto L8;
        if (r2 == 1) goto L8;
    L9:
        r0 = r0 + 1;
    L8:
        r1 = r1 + 1;
        goto L9
    L10:
        r6.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(r1, 1, false));
    }
}
