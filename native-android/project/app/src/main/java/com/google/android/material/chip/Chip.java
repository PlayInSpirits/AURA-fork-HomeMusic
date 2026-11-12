package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.bc4;
import defpackage.er1;
import defpackage.g20;
import defpackage.h12;
import defpackage.h20;
import defpackage.hf;
import defpackage.ht3;
import defpackage.i20;
import defpackage.j20;
import defpackage.j65;
import defpackage.ji2;
import defpackage.js;
import defpackage.k20;
import defpackage.l24;
import defpackage.lc4;
import defpackage.rr4;
import defpackage.su3;
import defpackage.th2;
import defpackage.u3;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.vr1;
import defpackage.vr4;
import defpackage.xk0;
import defpackage.xr4;
import defpackage.zx2;
import defpackage.zz1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends hf implements lc4, Checkable {
    public static final Rect K = new Rect();
    public static final int[] L = {R.attr.state_selected};
    public static final int[] M = {R.attr.state_checkable};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public CharSequence E;
    public final j20 F;
    public boolean G;
    public final Rect H;
    public final RectF I;
    public final h20 J;
    public k20 r;
    public InsetDrawable s;
    public RippleDrawable t;
    public View.OnClickListener u;
    public CompoundButton.OnCheckedChangeListener v;
    public th2 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.H = new Rect();
        this.I = new RectF();
        int i2 = 0;
        this.J = new h20(i2, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                er1.l("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                er1.l("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                er1.l("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                er1.l("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                er1.l("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        k20 k20Var = new k20(context2, attributeSet, i);
        Context context3 = k20Var.r0;
        int[] iArr = ht3.h;
        TypedArray typedArrayD = uc5.D(context3, attributeSet, iArr, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        k20Var.R0 = typedArrayD.hasValue(37);
        Context context4 = k20Var.r0;
        ColorStateList colorStateListS = h12.s(context4, typedArrayD, 24);
        if (k20Var.K != colorStateListS) {
            k20Var.K = colorStateListS;
            k20Var.onStateChange(k20Var.getState());
        }
        ColorStateList colorStateListS2 = h12.s(context4, typedArrayD, 11);
        if (k20Var.L != colorStateListS2) {
            k20Var.L = colorStateListS2;
            k20Var.onStateChange(k20Var.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (k20Var.M != dimension) {
            k20Var.M = dimension;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        if (typedArrayD.hasValue(12)) {
            k20Var.I(typedArrayD.getDimension(12, 0.0f));
        }
        k20Var.N(h12.s(context4, typedArrayD, 22));
        k20Var.O(typedArrayD.getDimension(23, 0.0f));
        k20Var.X(h12.s(context4, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(k20Var.R, text);
        xr4 xr4Var = k20Var.x0;
        if (!zEquals) {
            k20Var.R = text;
            xr4Var.e = true;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        rr4 rr4Var = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new rr4(context4, resourceId);
        rr4Var.k = typedArrayD.getDimension(1, rr4Var.k);
        xr4Var.c(rr4Var, context4);
        int i3 = typedArrayD.getInt(3, 0);
        if (i3 == 1) {
            k20Var.O0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            k20Var.O0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            k20Var.O0 = TextUtils.TruncateAt.END;
        }
        k20Var.M(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            k20Var.M(typedArrayD.getBoolean(15, false));
        }
        k20Var.J(h12.v(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            k20Var.L(h12.s(context4, typedArrayD, 17));
        }
        k20Var.K(typedArrayD.getDimension(16, -1.0f));
        k20Var.U(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            k20Var.U(typedArrayD.getBoolean(26, false));
        }
        k20Var.P(h12.v(context4, typedArrayD, 25));
        k20Var.T(h12.s(context4, typedArrayD, 30));
        k20Var.R(typedArrayD.getDimension(28, 0.0f));
        k20Var.E(typedArrayD.getBoolean(6, false));
        k20Var.H(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            k20Var.H(typedArrayD.getBoolean(8, false));
        }
        k20Var.F(h12.v(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            k20Var.G(h12.s(context4, typedArrayD, 9));
        }
        k20Var.h0 = zx2.a(context4, typedArrayD, 39);
        k20Var.i0 = zx2.a(context4, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (k20Var.j0 != dimension2) {
            k20Var.j0 = dimension2;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        k20Var.W(typedArrayD.getDimension(35, 0.0f));
        k20Var.V(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (k20Var.m0 != dimension3) {
            k20Var.m0 = dimension3;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (k20Var.n0 != dimension4) {
            k20Var.n0 = dimension4;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        k20Var.S(typedArrayD.getDimension(29, 0.0f));
        k20Var.Q(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (k20Var.q0 != dimension5) {
            k20Var.q0 = dimension5;
            k20Var.invalidateSelf();
            k20Var.C();
        }
        k20Var.Q0 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        uc5.c(context2, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        uc5.g(context2, attributeSet, iArr, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        this.B = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.D = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(vr1.l(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(k20Var);
        k20Var.l(getElevation());
        uc5.c(context2, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        uc5.g(context2, attributeSet, iArr, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.F = new j20(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new i20(i2, this));
        }
        setChecked(this.x);
        setText(k20Var.R);
        setEllipsize(k20Var.O0);
        h();
        if (!this.r.P0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.B) {
            setMinHeight(this.D);
        }
        this.C = getLayoutDirection();
        super.setOnCheckedChangeListener(new g20(i2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.I;
        rectF.setEmpty();
        if (d() && this.u != null) {
            k20 k20Var = this.r;
            Rect bounds = k20Var.getBounds();
            rectF.setEmpty();
            if (k20Var.a0()) {
                float f = k20Var.q0 + k20Var.p0 + k20Var.b0 + k20Var.o0 + k20Var.n0;
                if (k20Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.H;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private rr4 getTextAppearance() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.x0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.z != z) {
            this.z = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.y != z) {
            this.y = z;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.D = i;
        if (!this.B) {
            InsetDrawable insetDrawable = this.s;
            if (insetDrawable == null) {
                int[] iArr = l24.a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.s = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = l24.a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.r.M));
        int iMax2 = Math.max(0, i - this.r.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.s;
            if (insetDrawable2 == null) {
                int[] iArr3 = l24.a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.s = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = l24.a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.s != null) {
            Rect rect = new Rect();
            this.s.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = l24.a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.s = new InsetDrawable((Drawable) this.r, i2, i3, i2, i3);
        int[] iArr6 = l24.a;
        f();
    }

    public final boolean d() {
        k20 k20Var = this.r;
        if (k20Var == null) {
            return false;
        }
        Drawable drawable = k20Var.Y;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.G) {
            return this.F.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.G) {
            return super.dispatchKeyEvent(keyEvent);
        }
        j20 j20Var = this.F;
        j20Var.getClass();
        boolean zQ = false;
        int i2 = 0;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && j20Var.q(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zQ = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = j20Var.y;
                                if (i != Integer.MIN_VALUE) {
                                    j20Var.s(i, 16, null);
                                }
                                zQ = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = j20Var.y;
                    if (i != Integer.MIN_VALUE) {
                        j20Var.s(i, 16, null);
                    }
                    zQ = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zQ = j20Var.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zQ = j20Var.q(1, null);
            }
        }
        if (!zQ || j20Var.y == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.hf, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        k20 k20Var = this.r;
        boolean zD = false;
        if (k20Var != null && k20.B(k20Var.Y)) {
            k20 k20Var2 = this.r;
            ?? IsEnabled = isEnabled();
            if (this.A) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.z) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.y) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.A) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.z) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.y) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(k20Var2.L0, iArr)) {
                k20Var2.L0 = iArr;
                if (k20Var2.a0()) {
                    zD = k20Var2.D(k20Var2.getState(), iArr);
                }
            }
        }
        if (zD) {
            invalidate();
        }
    }

    public final void e() {
        k20 k20Var;
        if (!d() || (k20Var = this.r) == null || !k20Var.X || this.u == null) {
            j65.o(this, null);
            this.G = false;
        } else {
            j65.o(this, this.F);
            this.G = true;
        }
    }

    public final void f() {
        this.t = new RippleDrawable(l24.c(this.r.Q), getBackgroundDrawable(), null);
        this.r.getClass();
        RippleDrawable rippleDrawable = this.t;
        WeakHashMap weakHashMap = j65.a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        k20 k20Var;
        if (TextUtils.isEmpty(getText()) || (k20Var = this.r) == null) {
            return;
        }
        int iY = (int) (k20Var.y() + k20Var.q0 + k20Var.n0);
        k20 k20Var2 = this.r;
        int iX = (int) (k20Var2.x() + k20Var2.j0 + k20Var2.m0);
        if (this.s != null) {
            Rect rect = new Rect();
            this.s.getPadding(rect);
            iX += rect.left;
            iY += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = j65.a;
        setPaddingRelative(iX, paddingTop, iY, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.E)) {
            return this.E;
        }
        k20 k20Var = this.r;
        if (k20Var == null || !k20Var.d0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).u.b) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.s;
        return insetDrawable == null ? this.r : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.f0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.g0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.L;
        }
        return null;
    }

    public float getChipCornerRadius() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return Math.max(0.0f, k20Var.z());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.r;
    }

    public float getChipEndPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.q0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        k20 k20Var = this.r;
        if (k20Var == null || (drawable = k20Var.T) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.V;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.U;
        }
        return null;
    }

    public float getChipMinHeight() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.M;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.j0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.O;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.P;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        k20 k20Var = this.r;
        if (k20Var == null || (drawable = k20Var.Y) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.c0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.p0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.b0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.o0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.a0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.O0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.G) {
            j20 j20Var = this.F;
            if (j20Var.y == 1 || j20Var.x == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public zx2 getHideMotionSpec() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.i0;
        }
        return null;
    }

    public float getIconEndPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.l0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.k0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.Q;
        }
        return null;
    }

    public bc4 getShapeAppearanceModel() {
        return this.r.n.a;
    }

    public zx2 getShowMotionSpec() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.h0;
        }
        return null;
    }

    public float getTextEndPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.n0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        k20 k20Var = this.r;
        if (k20Var != null) {
            return k20Var.m0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        k20 k20Var = this.r;
        if (k20Var != null) {
            paint.drawableState = k20Var.getState();
        }
        rr4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.J);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.O(this, this.r);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        k20 k20Var = this.r;
        if (k20Var != null && k20Var.d0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.G) {
            j20 j20Var = this.F;
            int i2 = j20Var.y;
            if (i2 != Integer.MIN_VALUE) {
                j20Var.j(i2);
            }
            if (z) {
                j20Var.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        k20 k20Var = this.r;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(k20Var != null && k20Var.d0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.p) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(app.homemusic.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) u3.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.C != i) {
            this.C = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.y) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.y) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.u;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.G) {
                        this.F.x(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.E = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.t) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.hf, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.t) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.hf, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.E(z);
        }
    }

    public void setCheckableResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.E(k20Var.r0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        k20 k20Var = this.r;
        if (k20Var == null) {
            this.x = z;
        } else if (k20Var.d0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.F(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.F(zz1.r(k20Var.r0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.G(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.G(ud3.n(k20Var.r0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.H(k20Var.r0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.L == colorStateList) {
            return;
        }
        k20Var.L = colorStateList;
        k20Var.onStateChange(k20Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListN;
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.L == (colorStateListN = ud3.n(k20Var.r0, i))) {
            return;
        }
        k20Var.L = colorStateListN;
        k20Var.onStateChange(k20Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.I(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.I(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(k20 k20Var) {
        k20 k20Var2 = this.r;
        if (k20Var2 != k20Var) {
            if (k20Var2 != null) {
                k20Var2.N0 = new WeakReference(null);
            }
            this.r = k20Var;
            k20Var.P0 = false;
            k20Var.N0 = new WeakReference(this);
            c(this.D);
        }
    }

    public void setChipEndPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.q0 == f) {
            return;
        }
        k20Var.q0 = f;
        k20Var.invalidateSelf();
        k20Var.C();
    }

    public void setChipEndPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            float dimension = k20Var.r0.getResources().getDimension(i);
            if (k20Var.q0 != dimension) {
                k20Var.q0 = dimension;
                k20Var.invalidateSelf();
                k20Var.C();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.J(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.J(zz1.r(k20Var.r0, i));
        }
    }

    public void setChipIconSize(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.K(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.K(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.L(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.L(ud3.n(k20Var.r0, i));
        }
    }

    public void setChipIconVisible(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.M(k20Var.r0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.M == f) {
            return;
        }
        k20Var.M = f;
        k20Var.invalidateSelf();
        k20Var.C();
    }

    public void setChipMinHeightResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            float dimension = k20Var.r0.getResources().getDimension(i);
            if (k20Var.M != dimension) {
                k20Var.M = dimension;
                k20Var.invalidateSelf();
                k20Var.C();
            }
        }
    }

    public void setChipStartPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.j0 == f) {
            return;
        }
        k20Var.j0 = f;
        k20Var.invalidateSelf();
        k20Var.C();
    }

    public void setChipStartPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            float dimension = k20Var.r0.getResources().getDimension(i);
            if (k20Var.j0 != dimension) {
                k20Var.j0 = dimension;
                k20Var.invalidateSelf();
                k20Var.C();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.N(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.N(ud3.n(k20Var.r0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.O(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.O(k20Var.r0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.P(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.c0 == charSequence) {
            return;
        }
        String str = js.b;
        js jsVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? js.e : js.d;
        jsVar.getClass();
        xk0 xk0Var = vr4.a;
        k20Var.c0 = jsVar.c(charSequence);
        k20Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.Q(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.Q(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.P(zz1.r(k20Var.r0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.R(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.R(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.S(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.S(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.T(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.T(ud3.n(k20Var.r0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.hf, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            er1.l("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            er1.l("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.hf, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            er1.l("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            er1.l("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            er1.l("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            er1.l("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            er1.l("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            er1.l("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.l(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.r == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            er1.l("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.O0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.B = z;
        c(this.D);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(zx2 zx2Var) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.i0 = zx2Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.i0 = zx2.b(k20Var.r0, i);
        }
    }

    public void setIconEndPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.V(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.V(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.W(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.W(k20Var.r0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(th2 th2Var) {
        this.w = th2Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.r == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            er1.l("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            er1.l("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.Q0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            er1.l("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.u = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.X(colorStateList);
        }
        this.r.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.X(ud3.n(k20Var.r0, i));
            this.r.getClass();
            f();
        }
    }

    @Override // defpackage.lc4
    public void setShapeAppearanceModel(bc4 bc4Var) {
        this.r.setShapeAppearanceModel(bc4Var);
    }

    public void setShowMotionSpec(zx2 zx2Var) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.h0 = zx2Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.h0 = zx2.b(k20Var.r0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            er1.l("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        k20 k20Var = this.r;
        if (k20Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(k20Var.P0 ? null : charSequence, bufferType);
        k20 k20Var2 = this.r;
        if (k20Var2 == null || TextUtils.equals(k20Var2.R, charSequence)) {
            return;
        }
        k20Var2.R = charSequence;
        k20Var2.x0.e = true;
        k20Var2.invalidateSelf();
        k20Var2.C();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k20 k20Var = this.r;
        if (k20Var != null) {
            Context context2 = k20Var.r0;
            k20Var.x0.c(new rr4(context2, i), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.n0 == f) {
            return;
        }
        k20Var.n0 = f;
        k20Var.invalidateSelf();
        k20Var.C();
    }

    public void setTextEndPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            float dimension = k20Var.r0.getResources().getDimension(i);
            if (k20Var.n0 != dimension) {
                k20Var.n0 = dimension;
                k20Var.invalidateSelf();
                k20Var.C();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        k20 k20Var = this.r;
        if (k20Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            xr4 xr4Var = k20Var.x0;
            rr4 rr4Var = xr4Var.g;
            if (rr4Var != null) {
                rr4Var.k = fApplyDimension;
                xr4Var.a.setTextSize(fApplyDimension);
                k20Var.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        k20 k20Var = this.r;
        if (k20Var == null || k20Var.m0 == f) {
            return;
        }
        k20Var.m0 = f;
        k20Var.invalidateSelf();
        k20Var.C();
    }

    public void setTextStartPaddingResource(int i) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            float dimension = k20Var.r0.getResources().getDimension(i);
            if (k20Var.m0 != dimension) {
                k20Var.m0 = dimension;
                k20Var.invalidateSelf();
                k20Var.C();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.U(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.H(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.M(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            er1.l("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            er1.l("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            er1.l("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            er1.l("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(rr4 rr4Var) {
        k20 k20Var = this.r;
        if (k20Var != null) {
            k20Var.x0.c(rr4Var, k20Var.r0);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        k20 k20Var = this.r;
        if (k20Var != null) {
            Context context = k20Var.r0;
            k20Var.x0.c(new rr4(context, i), context);
        }
        h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
