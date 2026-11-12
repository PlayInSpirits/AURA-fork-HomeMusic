package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.br;
import defpackage.d34;
import defpackage.er;
import defpackage.na4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final d34 v;

    public BaseTransientBottomBar$Behavior() {
        d34 d34Var = new d34(10, false);
        this.s = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.t = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.r = 0;
        this.v = d34Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.de0
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d34 d34Var = this.v;
        d34Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                na4.z().O((br) d34Var.o);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            na4.z().K((br) d34Var.o);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.v.getClass();
        return view instanceof er;
    }
}
