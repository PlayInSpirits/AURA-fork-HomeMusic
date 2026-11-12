package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class er extends FrameLayout {
    public static final dr y = new dr(0);
    public fr n;
    public final bc4 o;
    public int p;
    public final float q;
    public final float r;
    public final int s;
    public final int t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public Rect w;
    public boolean x;

    public er(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(su3.H(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ht3.T);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = j65.a;
            setElevation(dimensionPixelSize);
        }
        this.p = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.o = bc4.c(context2, attributeSet, 0, 0).a();
        }
        this.q = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(h12.s(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(vr1.B(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.r = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(y);
        setFocusable(true);
        if (getBackground() == null) {
            int iH = g12.H(g12.t(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), g12.t(this, R.attr.colorOnSurface));
            bc4 bc4Var = this.o;
            if (bc4Var != null) {
                a61 a61Var = fr.w;
                fi2 fi2Var = new fi2(bc4Var);
                fi2Var.m(ColorStateList.valueOf(iH));
                drawable = fi2Var;
            } else {
                Resources resources = getResources();
                a61 a61Var2 = fr.w;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iH);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = j65.a;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(fr frVar) {
        this.n = frVar;
    }

    public float getActionTextColorAlpha() {
        return this.r;
    }

    public int getAnimationMode() {
        return this.p;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.q;
    }

    public int getMaxInlineActionWidth() {
        return this.t;
    }

    public int getMaxWidth() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        fr frVar = this.n;
        if (frVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = frVar.i.getRootWindowInsets()) != null) {
            frVar.r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            frVar.g();
        }
        WeakHashMap weakHashMap = j65.a;
        requestApplyInsets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        boolean z;
        super.onDetachedFromWindow();
        fr frVar = this.n;
        if (frVar != null) {
            na4 na4VarZ = na4.z();
            br brVar = frVar.v;
            synchronized (na4VarZ.n) {
                i = 1;
                if (!na4VarZ.G(brVar)) {
                    rg4 rg4Var = (rg4) na4VarZ.q;
                    z = rg4Var != null && rg4Var.a.get() == brVar;
                }
            }
            if (z) {
                fr.z.post(new zq(frVar, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fr frVar = this.n;
        if (frVar == null || !frVar.t) {
            return;
        }
        frVar.f();
        frVar.t = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.s;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.p = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.u != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.u);
            drawable.setTintMode(this.v);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.v);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.x || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.w = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        fr frVar = this.n;
        if (frVar != null) {
            a61 a61Var = fr.w;
            frVar.g();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : y);
        super.setOnClickListener(onClickListener);
    }
}
