package com.google.android.material.appbar;

import android.view.View;
import defpackage.f4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f4 {
    public final /* synthetic */ AppBarLayout n;
    public final /* synthetic */ boolean o;

    public d(AppBarLayout appBarLayout, boolean z) {
        this.n = appBarLayout;
        this.o = z;
    }

    @Override // defpackage.f4
    public final boolean h(View view) {
        this.n.setExpanded(this.o);
        return true;
    }
}
