package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l75 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l75(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(yw3 yw3Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.F0(yw3Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void W(hm2 hm2Var, yw3 yw3Var, v3 v3Var) {
        super.W(hm2Var, yw3Var, v3Var);
        this.E.G.getClass();
    }

    @Override // defpackage.mw3
    public final void X(hm2 hm2Var, yw3 yw3Var, View view, v3 v3Var) {
        int i;
        ViewPager2 viewPager2 = (ViewPager2) this.E.G.q;
        int i2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.t.getClass();
            i = mw3.I(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.t.getClass();
            i2 = mw3.I(view);
        }
        v3Var.k(u3.a(i, 1, i2, 1, false, false));
    }

    @Override // defpackage.mw3
    public final boolean k0(hm2 hm2Var, yw3 yw3Var, int i, Bundle bundle) {
        this.E.G.getClass();
        return super.k0(hm2Var, yw3Var, i, bundle);
    }

    @Override // defpackage.mw3
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
