package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ay2;
import defpackage.f20;
import defpackage.ge0;
import defpackage.gi1;
import defpackage.gp3;
import defpackage.hh3;
import defpackage.j65;
import defpackage.kf2;
import defpackage.o51;
import defpackage.yd;
import defpackage.zx2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect p;
    public final RectF q;
    public final RectF r;
    public final int[] s;
    public float t;
    public float u;

    public FabTransformationBehavior() {
        this.p = new Rect();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new int[2];
    }

    public static float B(gp3 gp3Var, ay2 ay2Var, float f) {
        long j = ay2Var.a;
        long j2 = ay2Var.b;
        ay2 ay2VarF = ((zx2) gp3Var.o).f("expansion");
        return yd.a(f, 0.0f, ay2Var.b().getInterpolation((((ay2VarF.a + ay2VarF.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, gp3 gp3Var) {
        ay2 ay2VarF;
        ay2 ay2VarF2;
        if (f == 0.0f || f2 == 0.0f) {
            ay2VarF = ((zx2) gp3Var.o).f("translationXLinear");
            ay2VarF2 = ((zx2) gp3Var.o).f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            ay2VarF = ((zx2) gp3Var.o).f("translationXCurveDownwards");
            ay2VarF2 = ((zx2) gp3Var.o).f("translationYCurveDownwards");
        } else {
            ay2VarF = ((zx2) gp3Var.o).f("translationXCurveUpwards");
            ay2VarF2 = ((zx2) gp3Var.o).f("translationYCurveUpwards");
        }
        return new Pair(ay2VarF, ay2VarF2);
    }

    public final float A(View view, View view2, hh3 hh3Var) {
        RectF rectF = this.q;
        C(view, rectF);
        rectF.offset(this.t, this.u);
        RectF rectF2 = this.r;
        C(view2, rectF2);
        hh3Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.s;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract gp3 D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.de0
    public final boolean f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        kf2.o("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.de0
    public final void g(ge0 ge0Var) {
        if (ge0Var.h == 0) {
            ge0Var.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        gp3 gp3VarD = D(view2.getContext(), z);
        if (z) {
            this.t = view.getTranslationX();
            this.u = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = j65.a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((zx2) gp3VarD.o).f("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (hh3) gp3VarD.p);
        float fA = A(view, view2, (hh3) gp3VarD.p);
        Pair pairY = y(fZ, fA, z, gp3VarD);
        ay2 ay2Var = (ay2) pairY.first;
        ay2 ay2Var2 = (ay2) pairY.second;
        RectF rectF = this.q;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            i = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(gp3VarD, ay2Var, -fZ);
            float fB2 = B(gp3VarD, ay2Var2, -fA);
            Rect rect = this.p;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.r;
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        ay2Var.a(objectAnimatorOfFloat2);
        ay2Var2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fZ2 = z(view, view2, (hh3) gp3VarD.p);
        float fA2 = A(view, view2, (hh3) gp3VarD.p);
        Pair pairY2 = y(fZ2, fA2, z, gp3VarD);
        ay2 ay2Var3 = (ay2) pairY2.first;
        ay2 ay2Var4 = (ay2) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fZ2 = this.t;
        }
        float[] fArr = new float[1];
        fArr[i] = fZ2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fA2 = this.u;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = fA2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        ay2Var3.a(objectAnimatorOfFloat5);
        ay2Var4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        f20.a.set(viewGroup, Float.valueOf(f));
                    }
                    f20 f20Var = f20.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, f20Var, fArr3);
                } else {
                    f20 f20Var2 = f20.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, f20Var2, fArr4);
                }
                ((zx2) gp3VarD.o).f("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        gi1.R(animatorSet, arrayList);
        animatorSet.addListener(new o51(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, hh3 hh3Var) {
        RectF rectF = this.q;
        C(view, rectF);
        rectF.offset(this.t, this.u);
        RectF rectF2 = this.r;
        C(view2, rectF2);
        hh3Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new Rect();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new int[2];
    }
}
