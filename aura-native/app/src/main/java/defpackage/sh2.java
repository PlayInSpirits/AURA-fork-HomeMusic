package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sh2 extends hf {
    public static final int[] L = {R.attr.state_indeterminate};
    public static final int[] M = {R.attr.state_error};
    public static final int[][] N = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int O = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public ColorStateList B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public int E;
    public int[] F;
    public boolean G;
    public CharSequence H;
    public CompoundButton.OnCheckedChangeListener I;
    public final qd J;
    public final hq K;
    public final LinkedHashSet r;
    public final LinkedHashSet s;
    public ColorStateList t;
    public boolean u;
    public boolean v;
    public boolean w;
    public CharSequence x;
    public Drawable y;
    public Drawable z;

    public sh2(Context context, AttributeSet attributeSet) {
        super(su3.H(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.r = new LinkedHashSet();
        this.s = new LinkedHashSet();
        Context context2 = getContext();
        qd qdVar = new qd(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = g14.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        qdVar.n = drawable;
        drawable.setCallback(qdVar.s);
        new pd(0, qdVar.n.getConstantState());
        this.J = qdVar;
        this.K = new hq(this, 2);
        Context context3 = getContext();
        this.y = getButtonDrawable();
        this.B = getSuperButtonTintList();
        setSupportButtonTintList(null);
        jv3 E = uc5.E(context3, attributeSet, ht3.A, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) E.o;
        this.z = E.c(2);
        if (this.y != null && zz1.E(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == O && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.y = zz1.r(context3, R.drawable.mtrl_checkbox_button);
                this.A = true;
                if (this.z == null) {
                    this.z = zz1.r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.C = h12.r(context3, E, 3);
        this.D = vr1.B(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.u = typedArray.getBoolean(10, false);
        this.v = typedArray.getBoolean(6, true);
        this.w = typedArray.getBoolean(9, false);
        this.x = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        E.g();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.E;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.t == null) {
            int t = g12.t(this, R.attr.colorControlActivated);
            int t2 = g12.t(this, R.attr.colorError);
            int t3 = g12.t(this, R.attr.colorSurface);
            int t4 = g12.t(this, R.attr.colorOnSurface);
            this.t = new ColorStateList(N, new int[]{g12.H(t3, 1.0f, t2), g12.H(t3, 1.0f, t), g12.H(t3, 0.54f, t4), g12.H(t3, 0.38f, t4), g12.H(t3, 0.38f, t4)});
        }
        return this.t;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.B;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l4 l4Var;
        this.y = te5.l(this.y, this.B, getButtonTintMode());
        this.z = te5.l(this.z, this.C, this.D);
        if (this.A) {
            qd qdVar = this.J;
            if (qdVar != null) {
                od odVar = qdVar.o;
                Drawable drawable = qdVar.n;
                hq hqVar = this.K;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (hqVar.a == null) {
                        hqVar.a = new jd(hqVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(hqVar.a);
                }
                ArrayList arrayList = qdVar.r;
                if (arrayList != null && hqVar != null) {
                    arrayList.remove(hqVar);
                    if (qdVar.r.size() == 0 && (l4Var = qdVar.q) != null) {
                        odVar.b.removeListener(l4Var);
                        qdVar.q = null;
                    }
                }
                Drawable drawable2 = qdVar.n;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (hqVar.a == null) {
                        hqVar.a = new jd(hqVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(hqVar.a);
                } else if (hqVar != null) {
                    if (qdVar.r == null) {
                        qdVar.r = new ArrayList();
                    }
                    if (!qdVar.r.contains(hqVar)) {
                        qdVar.r.add(hqVar);
                        if (qdVar.q == null) {
                            qdVar.q = new l4(1, qdVar);
                        }
                        odVar.b.addListener(qdVar.q);
                    }
                }
            }
            Drawable drawable3 = this.y;
            if ((drawable3 instanceof AnimatedStateListDrawable) && qdVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, qdVar, false);
                ((AnimatedStateListDrawable) this.y).addTransition(R.id.indeterminate, R.id.unchecked, qdVar, false);
            }
        }
        Drawable drawable4 = this.y;
        if (drawable4 != null && (colorStateList2 = this.B) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.z;
        if (drawable5 != null && (colorStateList = this.C) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(te5.h(this.y, this.z, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.y;
    }

    public Drawable getButtonIconDrawable() {
        return this.z;
    }

    public ColorStateList getButtonIconTintList() {
        return this.C;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.D;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.B;
    }

    public int getCheckedState() {
        return this.E;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.x;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.E == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u && this.B == null && this.C == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        if (this.w) {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        this.F = te5.u(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.v || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (vr1.z(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.w) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.x));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rh2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rh2 rh2Var = (rh2) parcelable;
        super.onRestoreInstanceState(rh2Var.getSuperState());
        setCheckedState(rh2Var.n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        rh2 rh2Var = new rh2(super.onSaveInstanceState());
        rh2Var.n = getCheckedState();
        return rh2Var;
    }

    @Override // defpackage.hf, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(zz1.r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.z = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(zz1.r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.C == colorStateList) {
            return;
        }
        this.C = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.D == mode) {
            return;
        }
        this.D = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.B == colorStateList) {
            return;
        }
        this.B = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.v = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.E != i) {
            this.E = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.H == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.G) {
                return;
            }
            this.G = true;
            LinkedHashSet linkedHashSet = this.s;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw xa3.d(it);
                }
            }
            if (this.E != 2 && (onCheckedChangeListener = this.I) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.G = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.x = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        refreshDrawableState();
        Iterator it = this.r.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.I = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.H = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.u = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.hf, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.y = drawable;
        this.A = false;
        a();
    }
}
