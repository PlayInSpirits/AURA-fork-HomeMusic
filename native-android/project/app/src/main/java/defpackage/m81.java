package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m81 {
    public bc4 a;
    public n81 b;
    public RippleDrawable c;
    public nt d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public Animator l;
    public zx2 m;
    public zx2 n;
    public int p;
    public final FloatingActionButton r;
    public final zh0 s;
    public static final a61 x = yd.c;
    public static final int y = R.attr.motionDurationLong2;
    public static final int z = R.attr.motionEasingEmphasizedInterpolator;
    public static final int A = R.attr.motionDurationMedium1;
    public static final int B = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] C = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] D = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_enabled};
    public static final int[] H = new int[0];
    public boolean g = true;
    public float o = 1.0f;
    public int q = 0;
    public final Rect t = new Rect();
    public final RectF u = new RectF();
    public final RectF v = new RectF();
    public final Matrix w = new Matrix();

    public m81(FloatingActionButton floatingActionButton, zh0 zh0Var) {
        int i = 0;
        this.r = floatingActionButton;
        this.s = zh0Var;
        hd5 hd5Var = new hd5(20);
        o81 o81Var = (o81) this;
        hd5Var.f(d(new k81(o81Var, 1)));
        hd5Var.f(d(new k81(o81Var, i)));
        hd5Var.f(d(new k81(o81Var, i)));
        hd5Var.f(d(new k81(o81Var, i)));
        hd5Var.f(d(new k81(o81Var, 2)));
        hd5Var.f(d(new j81(o81Var)));
        floatingActionButton.getRotation();
    }

    public static ValueAnimator d(l81 l81Var) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(l81Var);
        valueAnimator.addUpdateListener(l81Var);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.r.getDrawable();
        if (drawable == null || this.p == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.u;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.p;
        RectF rectF2 = this.v;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.p / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(zx2 zx2Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.r;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        zx2Var.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        zx2Var.f("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            i81 i81Var = new i81();
            i81Var.b = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(i81Var);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        zx2Var.f("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            i81 i81Var2 = new i81();
            i81Var2.b = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(i81Var2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.w;
        a(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new cq(), new g81(this), new Matrix(matrix));
        zx2Var.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        gi1.R(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.r;
        valueAnimatorOfFloat.addUpdateListener(new h81(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.o, f3, new Matrix(this.w)));
        arrayList.add(valueAnimatorOfFloat);
        gi1.R(animatorSet, arrayList);
        animatorSet.setDuration(g12.N(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(g12.O(floatingActionButton.getContext(), i2, yd.b));
        return animatorSet;
    }

    public abstract void e(float f, float f2, float f3);

    public final void f() {
    }

    public final void g(bc4 bc4Var) {
        this.a = bc4Var;
        n81 n81Var = this.b;
        if (n81Var != null) {
            n81Var.setShapeAppearanceModel(bc4Var);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof lc4) {
            ((lc4) callback).setShapeAppearanceModel(bc4Var);
        }
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.o = bc4Var;
            ntVar.invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    public final void h() {
        o81 o81Var = (o81) this;
        zh0 zh0Var = o81Var.s;
        boolean z2 = ((FloatingActionButton) zh0Var.o).x;
        boolean z3 = o81Var.f;
        Rect rect = this.t;
        FloatingActionButton floatingActionButton = o81Var.r;
        if (z2) {
            int iMax = z3 ? Math.max((o81Var.k - floatingActionButton.getSizeDimension()) / 2, 0) : 0;
            float elevation = o81Var.g ? floatingActionButton.getElevation() + o81Var.j : 0.0f;
            int iMax2 = Math.max(iMax, (int) Math.ceil(elevation));
            int iMax3 = Math.max(iMax, (int) Math.ceil(elevation * 1.5f));
            rect.set(iMax2, iMax3, iMax2, iMax3);
        } else if (z3) {
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = o81Var.k;
            if (sizeDimension >= i) {
                rect.set(0, 0, 0, 0);
            } else {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        l93.m(this.e, "Didn't initialize content background");
        boolean z4 = ((FloatingActionButton) zh0Var.o).x;
        zh0 zh0Var2 = this.s;
        if (z4 || (o81Var.f && floatingActionButton.getSizeDimension() < o81Var.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            } else {
                zh0Var2.getClass();
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) zh0Var2.o;
        floatingActionButton2.y.set(i2, i3, i4, i5);
        int i6 = floatingActionButton2.v;
        floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}
