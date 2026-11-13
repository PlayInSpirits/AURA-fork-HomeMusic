package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import defpackage.ge0;
import defpackage.gp3;
import defpackage.hh3;
import defpackage.j65;
import defpackage.zx2;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap v;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final gp3 D(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        gp3 gp3Var = new gp3(8, false);
        gp3Var.o = zx2.b(context, i);
        gp3Var.p = new hh3(2);
        return gp3Var;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.v = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof ge0) && (((ge0) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.v;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = j65.a;
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        int intValue = ((Integer) this.v.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = j65.a;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
            if (!z) {
                this.v = null;
            }
        }
        super.w(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
