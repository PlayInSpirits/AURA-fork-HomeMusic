package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.f4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f4 {
    public final /* synthetic */ CoordinatorLayout n;
    public final /* synthetic */ AppBarLayout o;
    public final /* synthetic */ View p;
    public final /* synthetic */ int q;
    public final /* synthetic */ AppBarLayout.BaseBehavior r;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.r = baseBehavior;
        this.n = coordinatorLayout;
        this.o = appBarLayout;
        this.p = view;
        this.q = i;
    }

    @Override // defpackage.f4
    public final boolean h(View view) {
        this.r.D(this.n, this.o, this.p, this.q, new int[]{0, 0});
        return true;
    }
}
