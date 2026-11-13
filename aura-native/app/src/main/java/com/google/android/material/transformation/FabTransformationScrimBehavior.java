package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ay2;
import defpackage.gi1;
import defpackage.p51;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final ay2 p;
    public final ay2 q;

    public FabTransformationScrimBehavior() {
        this.p = new ay2(75L);
        this.q = new ay2(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.de0
    public final boolean f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        ay2 ay2Var = z ? this.p : this.q;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        ay2Var.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        gi1.R(animatorSet, arrayList);
        animatorSet.addListener(new p51(view2, z));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new ay2(75L);
        this.q = new ay2(0L);
    }
}
