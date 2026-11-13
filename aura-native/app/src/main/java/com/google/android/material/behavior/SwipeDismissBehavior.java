package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.de0;
import defpackage.j65;
import defpackage.jp4;
import defpackage.o3;
import defpackage.o65;
import defpackage.si1;
import defpackage.zg5;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends de0 {
    public o65 n;
    public zg5 o;
    public boolean p;
    public boolean q;
    public int r = 2;
    public float s = 0.0f;
    public float t = 0.5f;
    public final jp4 u = new jp4(this);

    @Override // defpackage.de0
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.p;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.p = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.p = false;
        }
        if (z) {
            if (this.n == null) {
                this.n = new o65(coordinatorLayout.getContext(), coordinatorLayout, this.u);
            }
            if (!this.q && this.n.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.de0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = j65.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            j65.l(view, 1048576);
            j65.i(view, 0);
            if (w(view)) {
                j65.m(view, o3.n, new si1(26, this));
            }
        }
        return false;
    }

    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.n == null) {
            return false;
        }
        if (this.q && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.n.k(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
