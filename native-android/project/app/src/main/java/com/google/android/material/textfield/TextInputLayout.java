package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.au0;
import defpackage.aw0;
import defpackage.bc4;
import defpackage.by1;
import defpackage.cy1;
import defpackage.d65;
import defpackage.dh0;
import defpackage.eh0;
import defpackage.ei2;
import defpackage.el4;
import defpackage.ep0;
import defpackage.es4;
import defpackage.f11;
import defpackage.f34;
import defpackage.fg;
import defpackage.fi2;
import defpackage.fs4;
import defpackage.fz0;
import defpackage.g11;
import defpackage.g12;
import defpackage.gs4;
import defpackage.h12;
import defpackage.hs4;
import defpackage.ht3;
import defpackage.ix0;
import defpackage.ix4;
import defpackage.j65;
import defpackage.ji2;
import defpackage.js;
import defpackage.jv3;
import defpackage.k40;
import defpackage.ke0;
import defpackage.kf2;
import defpackage.m;
import defpackage.m34;
import defpackage.mh;
import defpackage.pn1;
import defpackage.qq;
import defpackage.su3;
import defpackage.tb4;
import defpackage.u51;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.v50;
import defpackage.vr1;
import defpackage.vr4;
import defpackage.xg2;
import defpackage.xk0;
import defpackage.yd;
import defpackage.zc1;
import defpackage.zz1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] N0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public gs4 A;
    public ColorStateList A0;
    public mh B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public int F0;
    public mh G;
    public boolean G0;
    public ColorStateList H;
    public final k40 H0;
    public int I;
    public boolean I0;
    public u51 J;
    public boolean J0;
    public u51 K;
    public ValueAnimator K0;
    public ColorStateList L;
    public boolean L0;
    public ColorStateList M;
    public boolean M0;
    public ColorStateList N;
    public ColorStateList O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public fi2 S;
    public fi2 T;
    public StateListDrawable U;
    public boolean V;
    public fi2 W;
    public fi2 a0;
    public bc4 b0;
    public boolean c0;
    public final int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public final Rect l0;
    public final Rect m0;
    public final FrameLayout n;
    public final RectF n0;
    public final el4 o;
    public Typeface o0;
    public final g11 p;
    public ColorDrawable p0;
    public EditText q;
    public int q0;
    public CharSequence r;
    public final LinkedHashSet r0;
    public int s;
    public ColorDrawable s0;
    public int t;
    public int t0;
    public int u;
    public Drawable u0;
    public int v;
    public ColorStateList v0;
    public final cy1 w;
    public ColorStateList w0;
    public boolean x;
    public int x0;
    public int y;
    public int y0;
    public boolean z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = new cy1(this);
        this.A = new tb4(4);
        this.l0 = new Rect();
        this.m0 = new Rect();
        this.n0 = new RectF();
        this.r0 = new LinkedHashSet();
        k40 k40Var = new k40(this);
        this.H0 = k40Var;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.n = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = yd.a;
        k40Var.W = linearInterpolator;
        k40Var.i(false);
        k40Var.V = linearInterpolator;
        k40Var.i(false);
        k40Var.l(8388659);
        jv3 jv3VarE = uc5.E(context2, attributeSet, ht3.X, i, app.homemusic.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        el4 el4Var = new el4(this, jv3VarE);
        this.o = el4Var;
        TypedArray typedArray = (TypedArray) jv3VarE.o;
        this.P = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.J0 = typedArray.getBoolean(47, true);
        this.I0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.b0 = bc4.c(context2, attributeSet, i, app.homemusic.R.style.Widget_Design_TextInputLayout).a();
        this.d0 = context2.getResources().getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f0 = typedArray.getDimensionPixelOffset(9, 0);
        this.h0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(app.homemusic.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.i0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(app.homemusic.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.g0 = this.h0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        zc1 zc1VarG = this.b0.g();
        if (dimension >= 0.0f) {
            zc1VarG.e = new m(dimension);
        }
        if (dimension2 >= 0.0f) {
            zc1VarG.f = new m(dimension2);
        }
        if (dimension3 >= 0.0f) {
            zc1VarG.g = new m(dimension3);
        }
        if (dimension4 >= 0.0f) {
            zc1VarG.h = new m(dimension4);
        }
        this.b0 = zc1VarG.a();
        ColorStateList colorStateListR = h12.r(context2, jv3VarE, 7);
        if (colorStateListR != null) {
            int defaultColor = colorStateListR.getDefaultColor();
            this.B0 = defaultColor;
            this.k0 = defaultColor;
            if (colorStateListR.isStateful()) {
                this.C0 = colorStateListR.getColorForState(new int[]{-16842910}, -1);
                this.D0 = colorStateListR.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.E0 = colorStateListR.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.D0 = this.B0;
                ColorStateList colorStateListN = ud3.n(context2, app.homemusic.R.color.mtrl_filled_background_color);
                this.C0 = colorStateListN.getColorForState(new int[]{-16842910}, -1);
                this.E0 = colorStateListN.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.k0 = 0;
            this.B0 = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListB = jv3VarE.b(1);
            this.w0 = colorStateListB;
            this.v0 = colorStateListB;
        }
        ColorStateList colorStateListR2 = h12.r(context2, jv3VarE, 14);
        this.z0 = typedArray.getColor(14, 0);
        this.x0 = context2.getColor(app.homemusic.R.color.mtrl_textinput_default_box_stroke_color);
        this.F0 = context2.getColor(app.homemusic.R.color.mtrl_textinput_disabled_color);
        this.y0 = context2.getColor(app.homemusic.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListR2 != null) {
            setBoxStrokeColorStateList(colorStateListR2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(h12.r(context2, jv3VarE, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.N = jv3VarE.b(24);
        this.O = jv3VarE.b(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i2 = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.D = typedArray.getResourceId(22, 0);
        this.C = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.C);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.D);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(jv3VarE.b(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(jv3VarE.b(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(jv3VarE.b(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(jv3VarE.b(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(jv3VarE.b(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(jv3VarE.b(58));
        }
        g11 g11Var = new g11(this, jv3VarE);
        this.p = g11Var;
        boolean z4 = typedArray.getBoolean(0, true);
        jv3VarE.g();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            d65.b(this, 1);
        }
        frameLayout.addView(el4Var);
        frameLayout.addView(g11Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.q;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.S;
        }
        int iT = g12.t(this.q, app.homemusic.R.attr.colorControlHighlight);
        int i = this.e0;
        int[][] iArr = N0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            fi2 fi2Var = this.S;
            int i2 = this.k0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g12.H(iT, 0.1f, i2), i2}), fi2Var, fi2Var);
        }
        Context context = getContext();
        fi2 fi2Var2 = this.S;
        int iR = g12.r(app.homemusic.R.attr.colorSurface, context, "TextInputLayout");
        fi2 fi2Var3 = new fi2(fi2Var2.n.a);
        int iH = g12.H(iT, 0.1f, iR);
        fi2Var3.m(new ColorStateList(iArr, new int[]{iH, 0}));
        fi2Var3.setTint(iR);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iR});
        fi2 fi2Var4 = new fi2(fi2Var2.n.a);
        fi2Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fi2Var3, fi2Var4), fi2Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.U == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.U = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.U.addState(new int[0], f(false));
        }
        return this.U;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.T == null) {
            this.T = f(true);
        }
        return this.T;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.q != null) {
            kf2.n("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.q = editText;
        int i = this.s;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.u);
        }
        int i2 = this.t;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.v);
        }
        this.V = false;
        i();
        setTextInputAccessibilityDelegate(new fs4(this));
        Typeface typeface = this.q.getTypeface();
        k40 k40Var = this.H0;
        boolean zM = k40Var.m(typeface);
        boolean zO = k40Var.o(typeface);
        if (zM || zO) {
            k40Var.i(false);
        }
        float textSize = this.q.getTextSize();
        if (k40Var.l != textSize) {
            k40Var.l = textSize;
            k40Var.i(false);
        }
        float letterSpacing = this.q.getLetterSpacing();
        if (k40Var.g0 != letterSpacing) {
            k40Var.g0 = letterSpacing;
            k40Var.i(false);
        }
        int gravity = this.q.getGravity();
        k40Var.l((gravity & (-113)) | 48);
        if (k40Var.j != gravity) {
            k40Var.j = gravity;
            k40Var.i(false);
        }
        this.q.addTextChangedListener(new pn1(5, this));
        if (this.v0 == null) {
            this.v0 = this.q.getHintTextColors();
        }
        if (this.P) {
            if (TextUtils.isEmpty(this.Q)) {
                CharSequence hint = this.q.getHint();
                this.r = hint;
                setHint(hint);
                this.q.setHint((CharSequence) null);
            }
            this.R = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        if (this.B != null) {
            n(this.q.getText());
        }
        r();
        this.w.b();
        this.o.bringToFront();
        g11 g11Var = this.p;
        g11Var.bringToFront();
        Iterator it = this.r0.iterator();
        while (it.hasNext()) {
            ((f11) it.next()).a(this);
        }
        g11Var.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.Q)) {
            return;
        }
        this.Q = charSequence;
        k40 k40Var = this.H0;
        if (charSequence == null || !TextUtils.equals(k40Var.G, charSequence)) {
            k40Var.G = charSequence;
            k40Var.H = null;
            Bitmap bitmap = k40Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                k40Var.K = null;
            }
            k40Var.i(false);
        }
        if (this.G0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.F == z) {
            return;
        }
        mh mhVar = this.G;
        if (!z) {
            if (mhVar != null) {
                mhVar.setVisibility(8);
            }
            this.G = null;
        } else if (mhVar != null) {
            this.n.addView(mhVar);
            this.G.setVisibility(0);
        }
        this.F = z;
    }

    public final void a(float f) {
        k40 k40Var = this.H0;
        if (k40Var.b == f) {
            return;
        }
        if (this.K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.K0 = valueAnimator;
            valueAnimator.setInterpolator(g12.O(getContext(), app.homemusic.R.attr.motionEasingEmphasizedInterpolator, yd.b));
            this.K0.setDuration(g12.N(getContext(), app.homemusic.R.attr.motionDurationMedium4, 167));
            this.K0.addUpdateListener(new qq(7, this));
        }
        this.K0.setFloatValues(k40Var.b, f);
        this.K0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.n;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        fi2 fi2Var = this.S;
        if (fi2Var == null) {
            return;
        }
        bc4 bc4Var = fi2Var.n.a;
        bc4 bc4Var2 = this.b0;
        if (bc4Var != bc4Var2) {
            fi2Var.setShapeAppearanceModel(bc4Var2);
        }
        if (this.e0 == 2 && (i = this.g0) > -1 && (i2 = this.j0) != 0) {
            fi2 fi2Var2 = this.S;
            fi2Var2.r(i);
            fi2Var2.q(ColorStateList.valueOf(i2));
        }
        int iG = this.k0;
        if (this.e0 == 1) {
            iG = v50.g(this.k0, g12.s(getContext(), app.homemusic.R.attr.colorSurface, 0));
        }
        this.k0 = iG;
        this.S.m(ColorStateList.valueOf(iG));
        fi2 fi2Var3 = this.W;
        if (fi2Var3 != null && this.a0 != null) {
            if (this.g0 > -1 && this.j0 != 0) {
                fi2Var3.m(this.q.isFocused() ? ColorStateList.valueOf(this.x0) : ColorStateList.valueOf(this.j0));
                this.a0.m(ColorStateList.valueOf(this.j0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fE;
        if (!this.P) {
            return 0;
        }
        int i = this.e0;
        k40 k40Var = this.H0;
        if (i == 0) {
            fE = k40Var.e();
        } else {
            if (i != 2) {
                return 0;
            }
            fE = k40Var.e() / 2.0f;
        }
        return (int) fE;
    }

    public final u51 d() {
        u51 u51Var = new u51();
        u51Var.p = g12.N(getContext(), app.homemusic.R.attr.motionDurationShort2, 87);
        u51Var.q = g12.O(getContext(), app.homemusic.R.attr.motionEasingLinearInterpolator, yd.a);
        return u51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.q;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.r != null) {
            boolean z = this.R;
            this.R = false;
            CharSequence hint = editText.getHint();
            this.q.setHint(this.r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.q.setHint(hint);
                this.R = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.n;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.q) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fi2 fi2Var;
        super.draw(canvas);
        boolean z = this.P;
        k40 k40Var = this.H0;
        if (z) {
            k40Var.d(canvas);
        }
        if (this.a0 == null || (fi2Var = this.W) == null) {
            return;
        }
        fi2Var.draw(canvas);
        if (this.q.isFocused()) {
            Rect bounds = this.a0.getBounds();
            Rect bounds2 = this.W.getBounds();
            float f = k40Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = yd.c(iCenterX, f, bounds2.left);
            bounds.right = yd.c(iCenterX, f, bounds2.right);
            this.a0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.L0) {
            return;
        }
        this.L0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        k40 k40Var = this.H0;
        if (k40Var != null) {
            k40Var.R = drawableState;
            ColorStateList colorStateList2 = k40Var.o;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = k40Var.n) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                k40Var.i(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.q != null) {
            WeakHashMap weakHashMap = j65.a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z) {
            invalidate();
        }
        this.L0 = false;
    }

    public final boolean e() {
        return this.P && !TextUtils.isEmpty(this.Q) && (this.S instanceof eh0);
    }

    public final fi2 f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.q;
        float popupElevation = editText instanceof xg2 ? ((xg2) editText).getPopupElevation() : getResources().getDimensionPixelOffset(app.homemusic.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        m34 m34Var = new m34();
        m34 m34Var2 = new m34();
        m34 m34Var3 = new m34();
        m34 m34Var4 = new m34();
        int i = 0;
        fz0 fz0Var = new fz0(i);
        fz0 fz0Var2 = new fz0(i);
        fz0 fz0Var3 = new fz0(i);
        fz0 fz0Var4 = new fz0(i);
        m mVar = new m(f);
        m mVar2 = new m(f);
        m mVar3 = new m(dimensionPixelOffset);
        m mVar4 = new m(dimensionPixelOffset);
        bc4 bc4Var = new bc4();
        bc4Var.a = m34Var;
        bc4Var.b = m34Var2;
        bc4Var.c = m34Var3;
        bc4Var.d = m34Var4;
        bc4Var.e = mVar;
        bc4Var.f = mVar2;
        bc4Var.g = mVar4;
        bc4Var.h = mVar3;
        bc4Var.i = fz0Var;
        bc4Var.j = fz0Var2;
        bc4Var.k = fz0Var3;
        bc4Var.l = fz0Var4;
        EditText editText2 = this.q;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof xg2 ? ((xg2) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = fi2.J;
            dropDownBackgroundTintList = ColorStateList.valueOf(g12.r(app.homemusic.R.attr.colorSurface, context, fi2.class.getSimpleName()));
        }
        fi2 fi2Var = new fi2();
        fi2Var.j(context);
        fi2Var.m(dropDownBackgroundTintList);
        fi2Var.l(popupElevation);
        fi2Var.setShapeAppearanceModel(bc4Var);
        ei2 ei2Var = fi2Var.n;
        if (ei2Var.g == null) {
            ei2Var.g = new Rect();
        }
        fi2Var.n.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fi2Var.invalidateSelf();
        return fi2Var;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.q.getCompoundPaddingLeft() : this.p.b();
        } else {
            compoundPaddingLeft = this.o.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.q;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public fi2 getBoxBackground() {
        int i = this.e0;
        if (i == 1 || i == 2) {
            return this.S;
        }
        tb4.a();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.k0;
    }

    public int getBoxBackgroundMode() {
        return this.e0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean z = vr1.z(this);
        bc4 bc4Var = this.b0;
        RectF rectF = this.n0;
        return z ? bc4Var.h.a(rectF) : bc4Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean z = vr1.z(this);
        bc4 bc4Var = this.b0;
        RectF rectF = this.n0;
        return z ? bc4Var.g.a(rectF) : bc4Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean z = vr1.z(this);
        bc4 bc4Var = this.b0;
        RectF rectF = this.n0;
        return z ? bc4Var.e.a(rectF) : bc4Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean z = vr1.z(this);
        bc4 bc4Var = this.b0;
        RectF rectF = this.n0;
        return z ? bc4Var.f.a(rectF) : bc4Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.h0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.i0;
    }

    public int getCounterMaxLength() {
        return this.y;
    }

    public CharSequence getCounterOverflowDescription() {
        mh mhVar;
        if (this.x && this.z && (mhVar = this.B) != null) {
            return mhVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.M;
    }

    public ColorStateList getCounterTextColor() {
        return this.L;
    }

    public ColorStateList getCursorColor() {
        return this.N;
    }

    public ColorStateList getCursorErrorColor() {
        return this.O;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.p.t.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.p.t.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.p.z;
    }

    public int getEndIconMode() {
        return this.p.v;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.p.A;
    }

    public CheckableImageButton getEndIconView() {
        return this.p.t;
    }

    public CharSequence getError() {
        cy1 cy1Var = this.w;
        if (cy1Var.q) {
            return cy1Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.w.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.w.s;
    }

    public int getErrorCurrentTextColors() {
        mh mhVar = this.w.r;
        if (mhVar != null) {
            return mhVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.p.p.getDrawable();
    }

    public CharSequence getHelperText() {
        cy1 cy1Var = this.w;
        if (cy1Var.x) {
            return cy1Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        mh mhVar = this.w.y;
        if (mhVar != null) {
            return mhVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.P) {
            return this.Q;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        k40 k40Var = this.H0;
        return k40Var.f(k40Var.o);
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    public gs4 getLengthCounter() {
        return this.A;
    }

    public int getMaxEms() {
        return this.t;
    }

    public int getMaxWidth() {
        return this.v;
    }

    public int getMinEms() {
        return this.s;
    }

    public int getMinWidth() {
        return this.u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.p.t.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.p.t.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.F) {
            return this.E;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.I;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.H;
    }

    public CharSequence getPrefixText() {
        return this.o.p;
    }

    public ColorStateList getPrefixTextColor() {
        return this.o.o.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.o.o;
    }

    public bc4 getShapeAppearanceModel() {
        return this.b0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.o.q.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.o.q.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.o.t;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.o.u;
    }

    public CharSequence getSuffixText() {
        return this.p.C;
    }

    public ColorStateList getSuffixTextColor() {
        return this.p.D.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.p.D;
    }

    public Typeface getTypeface() {
        return this.o0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.q.getCompoundPaddingRight() : this.o.a();
        } else {
            compoundPaddingRight = this.p.b();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.e0;
        if (i == 0) {
            this.S = null;
            this.W = null;
            this.a0 = null;
        } else if (i == 1) {
            this.S = new fi2(this.b0);
            this.W = new fi2();
            this.a0 = new fi2();
        } else {
            if (i != 2) {
                kf2.n(f34.i(new StringBuilder(), this.e0, " is illegal; only @BoxBackgroundMode constants are supported."));
                return;
            }
            if (!this.P || (this.S instanceof eh0)) {
                this.S = new fi2(this.b0);
            } else {
                bc4 bc4Var = this.b0;
                int i2 = eh0.L;
                if (bc4Var == null) {
                    bc4Var = new bc4();
                }
                dh0 dh0Var = new dh0(bc4Var, new RectF());
                eh0 eh0Var = new eh0(dh0Var);
                eh0Var.K = dh0Var;
                this.S = eh0Var;
            }
            this.W = null;
            this.a0 = null;
        }
        s();
        x();
        if (this.e0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f0 = getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (h12.z(getContext())) {
                this.f0 = getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.q != null && this.e0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.q;
                WeakHashMap weakHashMap = j65.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_filled_edittext_font_2_0_padding_top), this.q.getPaddingEnd(), getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (h12.z(getContext())) {
                EditText editText2 = this.q;
                WeakHashMap weakHashMap2 = j65.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_filled_edittext_font_1_3_padding_top), this.q.getPaddingEnd(), getResources().getDimensionPixelSize(app.homemusic.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.e0 != 0) {
            t();
        }
        EditText editText3 = this.q;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.e0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (e()) {
            int width = this.q.getWidth();
            int gravity = this.q.getGravity();
            k40 k40Var = this.H0;
            boolean zB = k40Var.b(k40Var.G);
            k40Var.I = zB;
            Rect rect = k40Var.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = k40Var.j0;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = k40Var.j0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.n0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (k40Var.j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (k40Var.I) {
                        f5 = k40Var.j0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (k40Var.I) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = k40Var.j0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = k40Var.e() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.d0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.g0);
                eh0 eh0Var = (eh0) this.S;
                eh0Var.getClass();
                eh0Var.v(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = k40Var.j0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.n0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (k40Var.j0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (k40Var.j0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = k40Var.e() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(mh mhVar, int i) {
        try {
            mhVar.setTextAppearance(i);
            if (mhVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        mhVar.setTextAppearance(app.homemusic.R.style.TextAppearance_AppCompat_Caption);
        mhVar.setTextColor(getContext().getColor(app.homemusic.R.color.design_error));
    }

    public final boolean m() {
        cy1 cy1Var = this.w;
        return (cy1Var.o != 1 || cy1Var.r == null || TextUtils.isEmpty(cy1Var.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((tb4) this.A).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.z;
        int i = this.y;
        if (i == -1) {
            this.B.setText(String.valueOf(length));
            this.B.setContentDescription(null);
            this.z = false;
        } else {
            this.z = length > i;
            Context context = getContext();
            this.B.setContentDescription(context.getString(this.z ? app.homemusic.R.string.character_counter_overflowed_content_description : app.homemusic.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.y)));
            if (z != this.z) {
                o();
            }
            String str = js.b;
            js jsVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? js.e : js.d;
            mh mhVar = this.B;
            String string = getContext().getString(app.homemusic.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.y));
            jsVar.getClass();
            xk0 xk0Var = vr4.a;
            mhVar.setText(string != null ? jsVar.c(string).toString() : null);
        }
        if (this.q == null || z == this.z) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        mh mhVar = this.B;
        if (mhVar != null) {
            l(mhVar, this.z ? this.C : this.D);
            if (!this.z && (colorStateList2 = this.L) != null) {
                this.B.setTextColor(colorStateList2);
            }
            if (!this.z || (colorStateList = this.M) == null) {
                return;
            }
            this.B.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.H0.h(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.q;
        if (editText != null) {
            Rect rect = this.l0;
            ep0.a(this, editText, rect);
            fi2 fi2Var = this.W;
            if (fi2Var != null) {
                int i5 = rect.bottom;
                fi2Var.setBounds(rect.left, i5 - this.h0, rect.right, i5);
            }
            fi2 fi2Var2 = this.a0;
            if (fi2Var2 != null) {
                int i6 = rect.bottom;
                fi2Var2.setBounds(rect.left, i6 - this.i0, rect.right, i6);
            }
            if (this.P) {
                float textSize = this.q.getTextSize();
                k40 k40Var = this.H0;
                if (k40Var.l != textSize) {
                    k40Var.l = textSize;
                    k40Var.i(false);
                }
                int gravity = this.q.getGravity();
                k40Var.l((gravity & (-113)) | 48);
                if (k40Var.j != gravity) {
                    k40Var.j = gravity;
                    k40Var.i(false);
                }
                if (this.q == null) {
                    tb4.a();
                    return;
                }
                boolean z2 = vr1.z(this);
                int i7 = rect.bottom;
                Rect rect2 = this.m0;
                rect2.bottom = i7;
                int i8 = this.e0;
                int i9 = rect.left;
                if (i8 == 1) {
                    rect2.left = g(i9, z2);
                    rect2.top = rect.top + this.f0;
                    rect2.right = h(rect.right, z2);
                } else if (i8 != 2) {
                    rect2.left = g(i9, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, z2);
                } else {
                    rect2.left = this.q.getPaddingLeft() + i9;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.q.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = k40Var.h;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    k40Var.S = true;
                }
                if (this.q == null) {
                    tb4.a();
                    return;
                }
                TextPaint textPaint = k40Var.U;
                textPaint.setTextSize(k40Var.l);
                textPaint.setTypeface(k40Var.z);
                textPaint.setLetterSpacing(k40Var.g0);
                float f = -textPaint.ascent();
                rect2.left = this.q.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.e0 != 1 || this.q.getMinLines() > 1) ? rect.top + this.q.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.q.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.e0 != 1 || this.q.getMinLines() > 1) ? rect.bottom - this.q.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = k40Var.g;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    k40Var.S = true;
                }
                k40Var.i(false);
                if (!e() || this.G0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        EditText editText2 = this.q;
        int i3 = 1;
        g11 g11Var = this.p;
        boolean z = false;
        if (editText2 != null && this.q.getMeasuredHeight() < (iMax = Math.max(g11Var.getMeasuredHeight(), this.o.getMeasuredHeight()))) {
            this.q.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.q.post(new es4(this, i3));
        }
        if (this.G != null && (editText = this.q) != null) {
            this.G.setGravity(editText.getGravity());
            this.G.setPadding(this.q.getCompoundPaddingLeft(), this.q.getCompoundPaddingTop(), this.q.getCompoundPaddingRight(), this.q.getCompoundPaddingBottom());
        }
        g11Var.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hs4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hs4 hs4Var = (hs4) parcelable;
        super.onRestoreInstanceState(hs4Var.n);
        setError(hs4Var.p);
        if (hs4Var.q) {
            post(new es4(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.c0) {
            ke0 ke0Var = this.b0.e;
            RectF rectF = this.n0;
            float fA = ke0Var.a(rectF);
            float fA2 = this.b0.f.a(rectF);
            float fA3 = this.b0.h.a(rectF);
            float fA4 = this.b0.g.a(rectF);
            bc4 bc4Var = this.b0;
            su3 su3Var = bc4Var.a;
            su3 su3Var2 = bc4Var.b;
            su3 su3Var3 = bc4Var.d;
            su3 su3Var4 = bc4Var.c;
            fz0 fz0Var = new fz0(0);
            fz0 fz0Var2 = new fz0(0);
            fz0 fz0Var3 = new fz0(0);
            fz0 fz0Var4 = new fz0(0);
            m mVar = new m(fA2);
            m mVar2 = new m(fA);
            m mVar3 = new m(fA4);
            m mVar4 = new m(fA3);
            bc4 bc4Var2 = new bc4();
            bc4Var2.a = su3Var2;
            bc4Var2.b = su3Var;
            bc4Var2.c = su3Var3;
            bc4Var2.d = su3Var4;
            bc4Var2.e = mVar;
            bc4Var2.f = mVar2;
            bc4Var2.g = mVar4;
            bc4Var2.h = mVar3;
            bc4Var2.i = fz0Var;
            bc4Var2.j = fz0Var2;
            bc4Var2.k = fz0Var3;
            bc4Var2.l = fz0Var4;
            this.c0 = z;
            setShapeAppearanceModel(bc4Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        hs4 hs4Var = new hs4(super.onSaveInstanceState());
        if (m()) {
            hs4Var.p = getError();
        }
        g11 g11Var = this.p;
        hs4Var.q = g11Var.v != 0 && g11Var.t.q;
        return hs4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.N;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueD = zz1.D(context, app.homemusic.R.attr.colorControlActivated);
            if (typedValueD != null) {
                int i = typedValueD.resourceId;
                if (i != 0) {
                    colorStateListValueOf = ud3.n(context, i);
                } else {
                    int i2 = typedValueD.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.q;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable textCursorDrawable = this.q.getTextCursorDrawable();
        if ((m() || (this.B != null && this.z)) && (colorStateList = this.O) != null) {
            colorStateListValueOf = colorStateList;
        }
        textCursorDrawable.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z;
        if (this.q == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            el4 el4Var = this.o;
            if (el4Var.getMeasuredWidth() > 0) {
                int measuredWidth = el4Var.getMeasuredWidth() - this.q.getPaddingLeft();
                if (this.p0 == null || this.q0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.p0 = colorDrawable;
                    this.q0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.q.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.p0;
                if (drawable != colorDrawable2) {
                    this.q.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.p0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.q.getCompoundDrawablesRelative();
                this.q.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.p0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.p0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.q.getCompoundDrawablesRelative();
            this.q.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.p0 = null;
            z = true;
        } else {
            z = false;
        }
        g11 g11Var = this.p;
        if ((g11Var.d() || ((g11Var.v != 0 && g11Var.c()) || g11Var.C != null)) && g11Var.getMeasuredWidth() > 0) {
            int measuredWidth2 = g11Var.D.getMeasuredWidth() - this.q.getPaddingRight();
            if (g11Var.d()) {
                checkableImageButton = g11Var.p;
            } else if (g11Var.v != 0 && g11Var.c()) {
                checkableImageButton = g11Var.t;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.q.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.s0;
            if (colorDrawable3 != null && this.t0 != measuredWidth2) {
                this.t0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.s0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.s0 = colorDrawable4;
                this.t0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.s0;
            if (drawable2 != colorDrawable5) {
                this.u0 = drawable2;
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.s0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.q.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.s0) {
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.u0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.s0 = null;
            return z2;
        }
        return z;
    }

    public final void r() {
        Drawable background;
        mh mhVar;
        EditText editText = this.q;
        if (editText == null || this.e0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = aw0.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(fg.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.z && (mhVar = this.B) != null) {
            drawableMutate.setColorFilter(fg.c(mhVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.q.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.q;
        if (editText == null || this.S == null) {
            return;
        }
        if ((this.V || editText.getBackground() == null) && this.e0 != 0) {
            EditText editText2 = this.q;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = j65.a;
            editText2.setBackground(editTextBoxBackground);
            this.V = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.k0 != i) {
            this.k0 = i;
            this.B0 = i;
            this.D0 = i;
            this.E0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.k0 = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.e0) {
            return;
        }
        this.e0 = i;
        if (this.q != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f0 = i;
    }

    public void setBoxCornerFamily(int i) {
        zc1 zc1VarG = this.b0.g();
        ke0 ke0Var = this.b0.e;
        zc1VarG.a = ji2.v(i);
        zc1VarG.e = ke0Var;
        ke0 ke0Var2 = this.b0.f;
        zc1VarG.b = ji2.v(i);
        zc1VarG.f = ke0Var2;
        ke0 ke0Var3 = this.b0.h;
        zc1VarG.d = ji2.v(i);
        zc1VarG.h = ke0Var3;
        ke0 ke0Var4 = this.b0.g;
        zc1VarG.c = ji2.v(i);
        zc1VarG.g = ke0Var4;
        this.b0 = zc1VarG.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.z0 != colorStateList.getDefaultColor()) {
            this.z0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.h0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.i0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.x != z) {
            cy1 cy1Var = this.w;
            if (z) {
                mh mhVar = new mh(getContext(), null);
                this.B = mhVar;
                mhVar.setId(app.homemusic.R.id.textinput_counter);
                Typeface typeface = this.o0;
                if (typeface != null) {
                    this.B.setTypeface(typeface);
                }
                this.B.setMaxLines(1);
                cy1Var.a(this.B, 2);
                ((ViewGroup.MarginLayoutParams) this.B.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.B != null) {
                    EditText editText = this.q;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                cy1Var.g(this.B, 2);
                this.B = null;
            }
            this.x = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.y != i) {
            if (i > 0) {
                this.y = i;
            } else {
                this.y = -1;
            }
            if (!this.x || this.B == null) {
                return;
            }
            EditText editText = this.q;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.C != i) {
            this.C = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.D != i) {
            this.D = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (m() || (this.B != null && this.z)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.q != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.p.t.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.p.t.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        g11 g11Var = this.p;
        CharSequence text = i != 0 ? g11Var.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = g11Var.t;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        g11 g11Var = this.p;
        Drawable drawableR = i != 0 ? zz1.r(g11Var.getContext(), i) : null;
        TextInputLayout textInputLayout = g11Var.n;
        CheckableImageButton checkableImageButton = g11Var.t;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            au0.b(textInputLayout, checkableImageButton, g11Var.x, g11Var.y);
            au0.Q(textInputLayout, checkableImageButton, g11Var.x);
        }
    }

    public void setEndIconMinSize(int i) {
        g11 g11Var = this.p;
        if (i < 0) {
            g11Var.getClass();
            kf2.n("endIconSize cannot be less than 0");
        } else if (i != g11Var.z) {
            g11Var.z = i;
            CheckableImageButton checkableImageButton = g11Var.t;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = g11Var.p;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.p.f(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        g11 g11Var = this.p;
        CheckableImageButton checkableImageButton = g11Var.t;
        View.OnLongClickListener onLongClickListener = g11Var.B;
        checkableImageButton.setOnClickListener(onClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        g11 g11Var = this.p;
        g11Var.B = onLongClickListener;
        CheckableImageButton checkableImageButton = g11Var.t;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        g11 g11Var = this.p;
        g11Var.A = scaleType;
        g11Var.t.setScaleType(scaleType);
        g11Var.p.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        g11 g11Var = this.p;
        if (g11Var.x != colorStateList) {
            g11Var.x = colorStateList;
            au0.b(g11Var.n, g11Var.t, colorStateList, g11Var.y);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        g11 g11Var = this.p;
        if (g11Var.y != mode) {
            g11Var.y = mode;
            au0.b(g11Var.n, g11Var.t, g11Var.x, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.p.g(z);
    }

    public void setError(CharSequence charSequence) {
        cy1 cy1Var = this.w;
        if (!cy1Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            cy1Var.f();
            return;
        }
        cy1Var.c();
        cy1Var.p = charSequence;
        cy1Var.r.setText(charSequence);
        int i = cy1Var.n;
        if (i != 1) {
            cy1Var.o = 1;
        }
        cy1Var.i(i, cy1Var.o, cy1Var.h(cy1Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        cy1 cy1Var = this.w;
        cy1Var.t = i;
        mh mhVar = cy1Var.r;
        if (mhVar != null) {
            WeakHashMap weakHashMap = j65.a;
            mhVar.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        cy1 cy1Var = this.w;
        cy1Var.s = charSequence;
        mh mhVar = cy1Var.r;
        if (mhVar != null) {
            mhVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        cy1 cy1Var = this.w;
        TextInputLayout textInputLayout = cy1Var.h;
        if (cy1Var.q == z) {
            return;
        }
        cy1Var.c();
        if (z) {
            mh mhVar = new mh(cy1Var.g, null);
            cy1Var.r = mhVar;
            mhVar.setId(app.homemusic.R.id.textinput_error);
            cy1Var.r.setTextAlignment(5);
            Typeface typeface = cy1Var.B;
            if (typeface != null) {
                cy1Var.r.setTypeface(typeface);
            }
            int i = cy1Var.u;
            cy1Var.u = i;
            mh mhVar2 = cy1Var.r;
            if (mhVar2 != null) {
                cy1Var.h.l(mhVar2, i);
            }
            ColorStateList colorStateList = cy1Var.v;
            cy1Var.v = colorStateList;
            mh mhVar3 = cy1Var.r;
            if (mhVar3 != null && colorStateList != null) {
                mhVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = cy1Var.s;
            cy1Var.s = charSequence;
            mh mhVar4 = cy1Var.r;
            if (mhVar4 != null) {
                mhVar4.setContentDescription(charSequence);
            }
            int i2 = cy1Var.t;
            cy1Var.t = i2;
            mh mhVar5 = cy1Var.r;
            if (mhVar5 != null) {
                WeakHashMap weakHashMap = j65.a;
                mhVar5.setAccessibilityLiveRegion(i2);
            }
            cy1Var.r.setVisibility(4);
            cy1Var.a(cy1Var.r, 0);
        } else {
            cy1Var.f();
            cy1Var.g(cy1Var.r, 0);
            cy1Var.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        cy1Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        g11 g11Var = this.p;
        g11Var.h(i != 0 ? zz1.r(g11Var.getContext(), i) : null);
        au0.Q(g11Var.n, g11Var.p, g11Var.q);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        g11 g11Var = this.p;
        CheckableImageButton checkableImageButton = g11Var.p;
        View.OnLongClickListener onLongClickListener = g11Var.s;
        checkableImageButton.setOnClickListener(onClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        g11 g11Var = this.p;
        g11Var.s = onLongClickListener;
        CheckableImageButton checkableImageButton = g11Var.p;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        g11 g11Var = this.p;
        if (g11Var.q != colorStateList) {
            g11Var.q = colorStateList;
            au0.b(g11Var.n, g11Var.p, colorStateList, g11Var.r);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        g11 g11Var = this.p;
        if (g11Var.r != mode) {
            g11Var.r = mode;
            au0.b(g11Var.n, g11Var.p, g11Var.q, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        cy1 cy1Var = this.w;
        cy1Var.u = i;
        mh mhVar = cy1Var.r;
        if (mhVar != null) {
            cy1Var.h.l(mhVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        cy1 cy1Var = this.w;
        cy1Var.v = colorStateList;
        mh mhVar = cy1Var.r;
        if (mhVar == null || colorStateList == null) {
            return;
        }
        mhVar.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.I0 != z) {
            this.I0 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        cy1 cy1Var = this.w;
        if (zIsEmpty) {
            if (cy1Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!cy1Var.x) {
            setHelperTextEnabled(true);
        }
        cy1Var.c();
        cy1Var.w = charSequence;
        cy1Var.y.setText(charSequence);
        int i = cy1Var.n;
        if (i != 2) {
            cy1Var.o = 2;
        }
        cy1Var.i(i, cy1Var.o, cy1Var.h(cy1Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        cy1 cy1Var = this.w;
        cy1Var.A = colorStateList;
        mh mhVar = cy1Var.y;
        if (mhVar == null || colorStateList == null) {
            return;
        }
        mhVar.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        cy1 cy1Var = this.w;
        TextInputLayout textInputLayout = cy1Var.h;
        if (cy1Var.x == z) {
            return;
        }
        cy1Var.c();
        if (z) {
            mh mhVar = new mh(cy1Var.g, null);
            cy1Var.y = mhVar;
            mhVar.setId(app.homemusic.R.id.textinput_helper_text);
            cy1Var.y.setTextAlignment(5);
            Typeface typeface = cy1Var.B;
            if (typeface != null) {
                cy1Var.y.setTypeface(typeface);
            }
            cy1Var.y.setVisibility(4);
            cy1Var.y.setAccessibilityLiveRegion(1);
            int i = cy1Var.z;
            cy1Var.z = i;
            mh mhVar2 = cy1Var.y;
            if (mhVar2 != null) {
                mhVar2.setTextAppearance(i);
            }
            ColorStateList colorStateList = cy1Var.A;
            cy1Var.A = colorStateList;
            mh mhVar3 = cy1Var.y;
            if (mhVar3 != null && colorStateList != null) {
                mhVar3.setTextColor(colorStateList);
            }
            cy1Var.a(cy1Var.y, 1);
            cy1Var.y.setAccessibilityDelegate(new by1(cy1Var));
        } else {
            cy1Var.c();
            int i2 = cy1Var.n;
            if (i2 == 2) {
                cy1Var.o = 0;
            }
            cy1Var.i(i2, cy1Var.o, cy1Var.h(cy1Var.y, ""));
            cy1Var.g(cy1Var.y, 1);
            cy1Var.y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        cy1Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        cy1 cy1Var = this.w;
        cy1Var.z = i;
        mh mhVar = cy1Var.y;
        if (mhVar != null) {
            mhVar.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.J0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.P) {
            this.P = z;
            if (z) {
                CharSequence hint = this.q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.Q)) {
                        setHint(hint);
                    }
                    this.q.setHint((CharSequence) null);
                }
                this.R = true;
            } else {
                this.R = false;
                if (!TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.q.getHint())) {
                    this.q.setHint(this.Q);
                }
                setHintInternal(null);
            }
            if (this.q != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        k40 k40Var = this.H0;
        k40Var.k(i);
        this.w0 = k40Var.o;
        if (this.q != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                k40 k40Var = this.H0;
                if (k40Var.o != colorStateList) {
                    k40Var.o = colorStateList;
                    k40Var.i(false);
                }
            }
            this.w0 = colorStateList;
            if (this.q != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(gs4 gs4Var) {
        this.A = gs4Var;
    }

    public void setMaxEms(int i) {
        this.t = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.v = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.s = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.u = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        g11 g11Var = this.p;
        g11Var.t.setContentDescription(i != 0 ? g11Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        g11 g11Var = this.p;
        g11Var.t.setImageDrawable(i != 0 ? zz1.r(g11Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        g11 g11Var = this.p;
        if (z && g11Var.v != 1) {
            g11Var.f(1);
        } else if (z) {
            g11Var.getClass();
        } else {
            g11Var.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        g11 g11Var = this.p;
        g11Var.x = colorStateList;
        au0.b(g11Var.n, g11Var.t, colorStateList, g11Var.y);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        g11 g11Var = this.p;
        g11Var.y = mode;
        au0.b(g11Var.n, g11Var.t, g11Var.x, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.G == null) {
            mh mhVar = new mh(getContext(), null);
            this.G = mhVar;
            mhVar.setId(app.homemusic.R.id.textinput_placeholder);
            this.G.setImportantForAccessibility(2);
            u51 u51VarD = d();
            this.J = u51VarD;
            u51VarD.o = 67L;
            this.K = d();
            setPlaceholderTextAppearance(this.I);
            setPlaceholderTextColor(this.H);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.F) {
                setPlaceholderTextEnabled(true);
            }
            this.E = charSequence;
        }
        EditText editText = this.q;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.I = i;
        mh mhVar = this.G;
        if (mhVar != null) {
            mhVar.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            mh mhVar = this.G;
            if (mhVar == null || colorStateList == null) {
                return;
            }
            mhVar.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        el4 el4Var = this.o;
        el4Var.getClass();
        el4Var.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        el4Var.o.setText(charSequence);
        el4Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.o.o.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.o.o.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(bc4 bc4Var) {
        fi2 fi2Var = this.S;
        if (fi2Var == null || fi2Var.n.a == bc4Var) {
            return;
        }
        this.b0 = bc4Var;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.o.q.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? zz1.r(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        el4 el4Var = this.o;
        if (i < 0) {
            el4Var.getClass();
            kf2.n("startIconSize cannot be less than 0");
        } else if (i != el4Var.t) {
            el4Var.t = i;
            CheckableImageButton checkableImageButton = el4Var.q;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        el4 el4Var = this.o;
        CheckableImageButton checkableImageButton = el4Var.q;
        View.OnLongClickListener onLongClickListener = el4Var.v;
        checkableImageButton.setOnClickListener(onClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        el4 el4Var = this.o;
        el4Var.v = onLongClickListener;
        CheckableImageButton checkableImageButton = el4Var.q;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        au0.R(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        el4 el4Var = this.o;
        el4Var.u = scaleType;
        el4Var.q.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        el4 el4Var = this.o;
        if (el4Var.r != colorStateList) {
            el4Var.r = colorStateList;
            au0.b(el4Var.n, el4Var.q, colorStateList, el4Var.s);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        el4 el4Var = this.o;
        if (el4Var.s != mode) {
            el4Var.s = mode;
            au0.b(el4Var.n, el4Var.q, el4Var.r, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.o.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        g11 g11Var = this.p;
        g11Var.getClass();
        g11Var.C = TextUtils.isEmpty(charSequence) ? null : charSequence;
        g11Var.D.setText(charSequence);
        g11Var.m();
    }

    public void setSuffixTextAppearance(int i) {
        this.p.D.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.p.D.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(fs4 fs4Var) {
        EditText editText = this.q;
        if (editText != null) {
            j65.o(editText, fs4Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.o0) {
            this.o0 = typeface;
            k40 k40Var = this.H0;
            boolean zM = k40Var.m(typeface);
            boolean zO = k40Var.o(typeface);
            if (zM || zO) {
                k40Var.i(false);
            }
            cy1 cy1Var = this.w;
            if (typeface != cy1Var.B) {
                cy1Var.B = typeface;
                mh mhVar = cy1Var.r;
                if (mhVar != null) {
                    mhVar.setTypeface(typeface);
                }
                mh mhVar2 = cy1Var.y;
                if (mhVar2 != null) {
                    mhVar2.setTypeface(typeface);
                }
            }
            mh mhVar3 = this.B;
            if (mhVar3 != null) {
                mhVar3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.e0 != 1) {
            FrameLayout frameLayout = this.n;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        mh mhVar;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.q;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.q;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.v0;
        k40 k40Var = this.H0;
        if (colorStateList2 != null) {
            k40Var.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.v0;
            int colorForState = this.F0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            k40Var.j(ColorStateList.valueOf(colorForState));
        } else if (m()) {
            mh mhVar2 = this.w.r;
            k40Var.j(mhVar2 != null ? mhVar2.getTextColors() : null);
        } else if (this.z && (mhVar = this.B) != null) {
            k40Var.j(mhVar.getTextColors());
        } else if (z4 && (colorStateList = this.w0) != null && k40Var.o != colorStateList) {
            k40Var.o = colorStateList;
            k40Var.i(false);
        }
        g11 g11Var = this.p;
        el4 el4Var = this.o;
        if (z3 || !this.I0 || (isEnabled() && z4)) {
            if (z2 || this.G0) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.K0.cancel();
                }
                if (z && this.J0) {
                    a(1.0f);
                } else {
                    k40Var.p(1.0f);
                }
                this.G0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.q;
                v(editText3 != null ? editText3.getText() : null);
                el4Var.w = false;
                el4Var.e();
                g11Var.E = false;
                g11Var.m();
                return;
            }
            return;
        }
        if (z2 || !this.G0) {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.K0.cancel();
            }
            if (z && this.J0) {
                a(0.0f);
            } else {
                k40Var.p(0.0f);
            }
            if (e() && !((eh0) this.S).K.r.isEmpty() && e()) {
                ((eh0) this.S).v(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.G0 = true;
            mh mhVar3 = this.G;
            if (mhVar3 != null && this.F) {
                mhVar3.setText((CharSequence) null);
                ix4.a(this.n, this.K);
                this.G.setVisibility(4);
            }
            el4Var.w = true;
            el4Var.e();
            g11Var.E = true;
            g11Var.m();
        }
    }

    public final void v(Editable editable) {
        ((tb4) this.A).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.n;
        if (length != 0 || this.G0) {
            mh mhVar = this.G;
            if (mhVar == null || !this.F) {
                return;
            }
            mhVar.setText((CharSequence) null);
            ix4.a(frameLayout, this.K);
            this.G.setVisibility(4);
            return;
        }
        if (this.G == null || !this.F || TextUtils.isEmpty(this.E)) {
            return;
        }
        this.G.setText(this.E);
        ix4.a(frameLayout, this.J);
        this.G.setVisibility(0);
        this.G.bringToFront();
        announceForAccessibility(this.E);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.j0 = colorForState2;
        } else if (z2) {
            this.j0 = colorForState;
        } else {
            this.j0 = defaultColor;
        }
    }

    public final void x() {
        mh mhVar;
        EditText editText;
        EditText editText2;
        if (this.S == null || this.e0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.q) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.q) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.j0 = this.F0;
        } else if (m()) {
            if (this.A0 != null) {
                w(z2, z);
            } else {
                this.j0 = getErrorCurrentTextColors();
            }
        } else if (!this.z || (mhVar = this.B) == null) {
            if (z2) {
                this.j0 = this.z0;
            } else if (z) {
                this.j0 = this.y0;
            } else {
                this.j0 = this.x0;
            }
        } else if (this.A0 != null) {
            w(z2, z);
        } else {
            this.j0 = mhVar.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        g11 g11Var = this.p;
        TextInputLayout textInputLayout = g11Var.n;
        CheckableImageButton checkableImageButton = g11Var.t;
        TextInputLayout textInputLayout2 = g11Var.n;
        g11Var.k();
        au0.Q(textInputLayout2, g11Var.p, g11Var.q);
        au0.Q(textInputLayout2, checkableImageButton, g11Var.x);
        if (g11Var.a() instanceof ix0) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                au0.b(textInputLayout, checkableImageButton, g11Var.x, g11Var.y);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        el4 el4Var = this.o;
        au0.Q(el4Var.n, el4Var.q, el4Var.r);
        if (this.e0 == 2) {
            int i = this.g0;
            if (z2 && isEnabled()) {
                this.g0 = this.i0;
            } else {
                this.g0 = this.h0;
            }
            if (this.g0 != i && e() && !this.G0) {
                if (e()) {
                    ((eh0) this.S).v(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.e0 == 1) {
            if (!isEnabled()) {
                this.k0 = this.C0;
            } else if (z && !z2) {
                this.k0 = this.E0;
            } else if (z2) {
                this.k0 = this.D0;
            } else {
                this.k0 = this.B0;
            }
        }
        b();
    }

    public void setHint(CharSequence charSequence) {
        if (this.P) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.o.q;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.o.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.p.t.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.p.t.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.p.t;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.p.h(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        g11 g11Var = this.p;
        TextInputLayout textInputLayout = g11Var.n;
        CheckableImageButton checkableImageButton = g11Var.t;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            au0.b(textInputLayout, checkableImageButton, g11Var.x, g11Var.y);
            au0.Q(textInputLayout, checkableImageButton, g11Var.x);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
