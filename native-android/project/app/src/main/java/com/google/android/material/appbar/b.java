package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import defpackage.v3;
import defpackage.z2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z2 {
    public final /* synthetic */ AppBarLayout.BaseBehavior q;

    public b(AppBarLayout.BaseBehavior baseBehavior) {
        this.q = baseBehavior;
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        this.n.onInitializeAccessibilityNodeInfo(view, v3Var.a);
        v3Var.m(this.q.B);
        v3Var.i(ScrollView.class.getName());
    }
}
