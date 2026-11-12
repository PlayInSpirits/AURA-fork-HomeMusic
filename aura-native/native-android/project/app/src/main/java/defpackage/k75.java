package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k75 implements ow3 {
    @Override // defpackage.ow3
    public final void b(View view) {
    }

    @Override // defpackage.ow3
    public final void c(View view) {
        nw3 nw3Var = (nw3) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nw3Var).width == -1 && ((ViewGroup.MarginLayoutParams) nw3Var).height == -1) {
            return;
        }
        kf2.o("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
