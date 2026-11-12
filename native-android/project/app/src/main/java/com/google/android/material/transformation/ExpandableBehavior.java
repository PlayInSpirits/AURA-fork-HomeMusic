package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.de0;
import defpackage.j65;
import defpackage.v41;
import defpackage.w41;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends de0 {
    public int n = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.de0
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.de0
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (w41) view2;
        boolean z = ((FloatingActionButton) obj).B.b;
        int i = this.n;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).B.b;
        this.n = z2 ? 1 : 2;
        w((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.de0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        w41 w41Var;
        WeakHashMap weakHashMap = j65.a;
        if (!view.isLaidOut()) {
            List listK = coordinatorLayout.k(view);
            int size = listK.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    w41Var = null;
                    break;
                }
                View view2 = (View) listK.get(i2);
                if (f(view, view2)) {
                    w41Var = (w41) view2;
                    break;
                }
                i2++;
            }
            if (w41Var != null) {
                boolean z = ((FloatingActionButton) w41Var).B.b;
                int i3 = this.n;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.n = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new v41(this, view, i4, w41Var));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
