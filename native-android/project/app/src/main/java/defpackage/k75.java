package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k75 implements ow3 {
    @Override // defpackage.ow3
    public final void b(View r1) {
    }

    @Override // defpackage.ow3
    public final void c(View r2) {
        nw3 r1 = (nw3) r2.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) r1).width == (-1)) goto L5;
    L7:
        kf2.o("Pages must fill the whole ViewPager2 (use match_parent)");
        return;
    L5:
        if (((ViewGroup.MarginLayoutParams) r1).height != (-1)) goto L7;
    }
}
