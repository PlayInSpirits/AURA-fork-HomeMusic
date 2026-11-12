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
    public static final int A = 0;
    public static final int B = 0;
    public static final int[] C = null;
    public static final int[] D = null;
    public static final int[] E = null;
    public static final int[] F = null;
    public static final int[] G = null;
    public static final int[] H = null;
    public static final a61 x = null;
    public static final int y = 0;
    public static final int z = 0;
    public bc4 a;
    public n81 b;
    public RippleDrawable c;
    public nt d;
    public RippleDrawable e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public Animator l;
    public zx2 m;
    public zx2 n;
    public float o;
    public int p;
    public int q;
    public final FloatingActionButton r;
    public final zh0 s;
    public final Rect t;
    public final RectF u;
    public final RectF v;
    public final Matrix w;

    static {
        x = yd.c;
        y = R.attr.motionDurationLong2;
        z = R.attr.motionEasingEmphasizedInterpolator;
        A = R.attr.motionDurationMedium1;
        B = R.attr.motionEasingEmphasizedAccelerateInterpolator;
        C = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
        D = new int[]{android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
        E = new int[]{android.R.attr.state_focused, android.R.attr.state_enabled};
        F = new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled};
        G = new int[]{android.R.attr.state_enabled};
        H = new int[0];
    }

    public m81(FloatingActionButton r4, zh0 r5) {
        this.g = true;
        this.o = 1.0f;
        int r1 = 0;
        this.q = 0;
        this.t = new Rect();
        this.u = new RectF();
        this.v = new RectF();
        this.w = new Matrix();
        this.r = r4;
        this.s = r5;
        hd5 r6 = new hd5(20);
        o81 r3 = (o81) this;
        r6.f(d(new k81(r3, 1)));
        r6.f(d(new k81(r3, r1)));
        r6.f(d(new k81(r3, r1)));
        r6.f(d(new k81(r3, r1)));
        r6.f(d(new k81(r3, 2)));
        r6.f(d(new j81(r3)));
        r4.getRotation();
    }

    public static ValueAnimator d(l81 r3) {
        ValueAnimator r0 = new ValueAnimator();
        r0.setInterpolator(x);
        r0.setDuration(100);
        r0.addListener(r3);
        r0.addUpdateListener(r3);
        r0.setFloatValues(new float[]{0.0f, 1.0f});
        return r0;
    }

    public final void a(float r5, Matrix r6) {
        r6.reset();
        Drawable r0 = this.r.getDrawable();
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.p == 0) goto L9;
        float r1 = r0.getIntrinsicWidth();
        float r2 = r0.getIntrinsicHeight();
        RectF r3 = this.u;
        r3.set(0.0f, 0.0f, r1, r2);
        float r4 = this.p;
        RectF r7 = this.v;
        r7.set(0.0f, 0.0f, r4, r4);
        r6.setRectToRect(r3, r7, Matrix.ScaleToFit.CENTER);
        float r8 = this.p / 2.0f;
        r6.postScale(r5, r5, r8, r8);
        return;
    }

    public final AnimatorSet b(zx2 r10, float r11, float r12, float r13) {
        ArrayList r0 = new ArrayList();
        Property r1 = View.ALPHA;
        float[] r3 = {r11};
        FloatingActionButton r14 = this.r;
        ObjectAnimator r2 = ObjectAnimator.ofFloat(r14, r1, r3);
        r10.f("opacity").a(r2);
        r0.add(r2);
        ObjectAnimator r4 = ObjectAnimator.ofFloat(r14, View.SCALE_X, new float[]{r12});
        r10.f("scale").a(r4);
        int r5 = Build.VERSION.SDK_INT;
        if (r5 != 26) goto L6;
        i81 r7 = new i81();
        r7.b = new FloatEvaluator();
        r4.setEvaluator(r7);
    L6:
        r0.add(r4);
        ObjectAnimator r15 = ObjectAnimator.ofFloat(r14, View.SCALE_Y, new float[]{r12});
        r10.f("scale").a(r15);
        if (r5 != 26) goto L10;
        i81 r6 = new i81();
        r6.b = new FloatEvaluator();
        r15.setEvaluator(r6);
    L10:
        r0.add(r15);
        Matrix r16 = this.w;
        a(r13, r16);
        ObjectAnimator r9 = ObjectAnimator.ofObject(r14, new cq(), new g81(this), new Matrix[]{new Matrix(r16)});
        r10.f("iconScale").a(r9);
        r0.add(r9);
        AnimatorSet r17 = new AnimatorSet();
        gi1.R(r17, r0);
        return r17;
    }

    public final AnimatorSet c(float r15, float r16, float r17, int r18, int r19) {
        AnimatorSet r0 = new AnimatorSet();
        ArrayList r1 = new ArrayList();
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        FloatingActionButton r3 = this.r;
        r2.addUpdateListener(new h81(this, r3.getAlpha(), r15, r3.getScaleX(), r16, r3.getScaleY(), this.o, r17, new Matrix(this.w)));
        r1.add(r2);
        gi1.R(r0, r1);
        r0.setDuration(g12.N(r3.getContext(), r18, r3.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        r0.setInterpolator(g12.O(r3.getContext(), r19, yd.b));
        return r0;
    }

    public abstract void e(float r1, float r2, float r3);

    public final void f() {
    }

    public final void g(bc4 r3) {
        this.a = r3;
        n81 r0 = this.b;
        if (r0 == null) goto L5;
        r0.setShapeAppearanceModel(r3);
    L5:
        Drawable.Callback r1 = this.c;
        if ((r1 instanceof lc4) == false) goto L8;
        ((lc4) r1).setShapeAppearanceModel(r3);
    L8:
        nt r2 = this.d;
        if (r2 == null) goto L12;
        r2.o = r3;
        r2.invalidateSelf();
        return;
    }

    public final void h() {
        o81 r0 = (o81) this;
        zh0 r1 = r0.s;
        boolean r2 = ((FloatingActionButton) r1.o).x;
        boolean r3 = r0.f;
        Rect r4 = this.t;
        FloatingActionButton r5 = r0.r;
        int r6 = 0;
        if (r2 == false) goto L11;
        if (r3 == false) goto L7;
        r6 = Math.max((r0.k - r5.getSizeDimension()) / 2, 0);
    L7:
        if (r0.g == false) goto L9;
        float r7 = r5.getElevation() + r0.j;
    L10:
        int r8 = Math.max(r6, (int) Math.ceil(r7));
        int r9 = Math.max(r6, (int) Math.ceil(r7 * 1.5f));
        r4.set(r8, r9, r8, r9);
    L17:
        l93.m(this.e, "Didn't initialize content background");
        boolean r10 = ((FloatingActionButton) r1.o).x;
        zh0 r11 = this.s;
        if (r10 == false) goto L20;
    L27:
        FloatingActionButton.b((FloatingActionButton) r11.o, new InsetDrawable(this.e, r4.left, r4.top, r4.right, r4.bottom));
    L28:
        int r12 = r4.left;
        int r13 = r4.top;
        int r14 = r4.right;
        int r15 = r4.bottom;
        FloatingActionButton r16 = (FloatingActionButton) r11.o;
        r16.y.set(r12, r13, r14, r15);
        int r17 = r16.v;
        r16.setPadding(r12 + r17, r13 + r17, r14 + r17, r15 + r17);
        return;
    L20:
        if (r0.f == true) goto L22;
    L23:
        RippleDrawable r18 = this.e;
        if (r18 == null) goto L26;
        FloatingActionButton.b((FloatingActionButton) r11.o, r18);
        goto L28
    L26:
        r11.getClass();
        goto L28
    L22:
        if (r5.getSizeDimension() < r0.k) goto L27;
    L9:
        r7 = 0.0f;
        goto L10
    L11:
        if (r3 == false) goto L16;
        int r19 = r5.getSizeDimension();
        int r20 = r0.k;
        if (r19 >= r20) goto L16;
        int r21 = (r20 - r5.getSizeDimension()) / 2;
        r4.set(r21, r21, r21, r21);
    L16:
        r4.set(0, 0, 0, 0);
        goto L17
    }
}
