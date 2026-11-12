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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh2 extends hf {
    public static final int[] L = null;
    public static final int[] M = null;
    public static final int[][] N = null;
    public static final int O = 0;
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

    static {
        L = new int[]{R.attr.state_indeterminate};
        M = new int[]{R.attr.state_error};
        N = new int[][]{new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        O = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public sh2(Context r9, AttributeSet r10) {
        super(su3.H(r9, r10, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), r10, R.attr.checkboxStyle);
        this.r = new LinkedHashSet();
        this.s = new LinkedHashSet();
        Context r11 = getContext();
        qd r0 = new qd(r11);
        Resources r1 = r11.getResources();
        Resources.Theme r12 = r11.getTheme();
        ThreadLocal r2 = g14.a;
        Drawable r13 = r1.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, r12);
        r0.n = r13;
        r13.setCallback(r0.s);
        new pd(0, r0.n.getConstantState());
        this.J = r0;
        this.K = new hq(this, 2);
        Context r3 = getContext();
        this.y = getButtonDrawable();
        this.B = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] r4 = ht3.A;
        jv3 r14 = uc5.E(r3, r10, r4, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray r5 = (TypedArray) r14.o;
        this.z = r14.c(2);
        if (this.y != null) goto L5;
    L12:
        this.C = h12.r(r3, r14, 3);
        this.D = vr1.B(r5.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.u = r5.getBoolean(10, false);
        this.v = r5.getBoolean(6, true);
        this.w = r5.getBoolean(9, false);
        this.x = r5.getText(8);
        if (r5.hasValue(7) == false) goto L15;
        setCheckedState(r5.getInt(7, 0));
    L15:
        r14.g();
        a();
        return;
    L5:
        if (zz1.E(r3, R.attr.isMaterial3Theme, false) == false) goto L12;
        int r6 = r5.getResourceId(0, 0);
        int r7 = r5.getResourceId(1, 0);
        if (r6 != O) goto L12;
        if (r7 != 0) goto L12;
        super.setButtonDrawable(null);
        this.y = zz1.r(r3, R.drawable.mtrl_checkbox_button);
        this.A = true;
        if (this.z != null) goto L12;
        this.z = zz1.r(r3, R.drawable.mtrl_checkbox_button_icon);
        goto L12
    }

    private String getButtonStateDescription() {
        int r0 = this.E;
        if (r0 == 1) goto L5;
        if (r0 != 0) goto L10;
        return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
    L10:
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    L5:
        return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.t != null) goto L6;
        int r0 = g12.t(this, R.attr.colorControlActivated);
        int r1 = g12.t(this, R.attr.colorError);
        int r2 = g12.t(this, R.attr.colorSurface);
        int r3 = g12.t(this, R.attr.colorOnSurface);
        int[] r4 = {g12.H(r2, 1.0f, r1), g12.H(r2, 1.0f, r0), g12.H(r2, 0.54f, r3), g12.H(r2, 0.38f, r3), g12.H(r2, 0.38f, r3)};
        this.t = new ColorStateList(N, r4);
    L6:
        return this.t;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList r0 = this.B;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (super.getButtonTintList() == null) goto L10;
        return super.getButtonTintList();
    L10:
        return getSupportButtonTintList();
    }

    public final void a() {
        this.y = te5.l(this.y, this.B, getButtonTintMode());
        this.z = te5.l(this.z, this.C, this.D);
        if (this.A == false) goto L44;
        qd r0 = this.J;
        if (r0 == null) goto L40;
        od r1 = r0.o;
        Drawable r2 = r0.n;
        hq r3 = this.K;
        if (r2 == null) goto L13;
        AnimatedVectorDrawable r4 = (AnimatedVectorDrawable) r2;
        if (r3.a != null) goto L12;
        r3.a = new jd(r3);
    L12:
        r4.unregisterAnimationCallback(r3.a);
    L13:
        ArrayList r5 = r0.r;
        if (r5 == null) goto L22;
        if (r3 == null) goto L22;
        r5.remove(r3);
        if (r0.r.size() != 0) goto L22;
        l4 r6 = r0.q;
        if (r6 == null) goto L22;
        r1.b.removeListener(r6);
        r0.q = null;
    L22:
        Drawable r7 = r0.n;
        if (r7 == null) goto L28;
        AnimatedVectorDrawable r8 = (AnimatedVectorDrawable) r7;
        if (r3.a != null) goto L27;
        r3.a = new jd(r3);
    L27:
        r8.registerAnimationCallback(r3.a);
        goto L40
    L28:
        if (r3 == null) goto L40;
        if (r0.r != null) goto L34;
        r0.r = new ArrayList();
    L34:
        if (r0.r.contains(r3) == true) goto L40;
        r0.r.add(r3);
        if (r0.q != null) goto L39;
        r0.q = new l4(1, r0);
    L39:
        r1.b.addListener(r0.q);
    L40:
        Drawable r9 = this.y;
        if ((r9 instanceof AnimatedStateListDrawable) == false) goto L44;
        if (r0 == null) goto L44;
        ((AnimatedStateListDrawable) r9).addTransition(R.id.checked, R.id.unchecked, r0, false);
        ((AnimatedStateListDrawable) this.y).addTransition(R.id.indeterminate, R.id.unchecked, r0, false);
    L44:
        Drawable r10 = this.y;
        if (r10 == null) goto L49;
        ColorStateList r11 = this.B;
        if (r11 == null) goto L49;
        r10.setTintList(r11);
    L49:
        Drawable r12 = this.z;
        if (r12 == null) goto L54;
        ColorStateList r13 = this.C;
        if (r13 == null) goto L54;
        r12.setTintList(r13);
    L54:
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
        if (this.E != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u == true) goto L5;
        return;
    L5:
        if (this.B == null) goto L7;
        return;
    L7:
        if (this.C != null) goto L12;
        setUseMaterialThemeColors(true);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r3) {
        int[] r4 = super.onCreateDrawableState(r3 + 2);
        if (getCheckedState() != 2) goto L6;
        View.mergeDrawableStates(r4, L);
    L6:
        if (this.w == false) goto L8;
        View.mergeDrawableStates(r4, M);
    L8:
        this.F = te5.u(r4);
        return r4;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas r6) {
        if (this.v == true) goto L5;
    L16:
        super.onDraw(r6);
        return;
    L5:
        if (TextUtils.isEmpty(getText()) == false) goto L16;
        Drawable r0 = getButtonDrawable();
        if (r0 == null) goto L16;
        if (vr1.z(this) == false) goto L11;
        int r1 = -1;
    L12:
        int r2 = ((getWidth() - r0.getIntrinsicWidth()) / 2) * r1;
        int r3 = r6.save();
        r6.translate(r2, 0.0f);
        super.onDraw(r6);
        r6.restoreToCount(r3);
        if (getBackground() == null) goto L18;
        Rect r7 = r0.getBounds();
        getBackground().setHotspotBounds(r7.left + r2, r7.top, r7.right + r2, r7.bottom);
        return;
    L18:
        return;
    L11:
        r1 = 1;
        goto L12
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r3) {
        super.onInitializeAccessibilityNodeInfo(r3);
        if (r3 != null) goto L6;
        return;
    L6:
        if (this.w == false) goto L9;
        r3.setText(r3.getText() + ", " + this.x);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof rh2) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        rh2 r3 = (rh2) r2;
        super.onRestoreInstanceState(r3.getSuperState());
        setCheckedState(r3.n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        rh2 r1 = new rh2(super.onSaveInstanceState());
        r1.n = getCheckedState();
        return r1;
    }

    @Override // defpackage.hf, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(zz1.r(getContext(), r2));
    }

    public void setButtonIconDrawable(Drawable r1) {
        this.z = r1;
        a();
    }

    public void setButtonIconDrawableResource(int r2) {
        setButtonIconDrawable(zz1.r(getContext(), r2));
    }

    public void setButtonIconTintList(ColorStateList r2) {
        if (this.C != r2) goto L5;
        return;
    L5:
        this.C = r2;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode r2) {
        if (this.D != r2) goto L5;
        return;
    L5:
        this.D = r2;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList r2) {
        if (this.B != r2) goto L5;
        return;
    L5:
        this.B = r2;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode r1) {
        setSupportButtonTintMode(r1);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
        this.v = r1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
        setCheckedState(r1 ? 1 : 0);
    }

    public void setCheckedState(int r4) {
        if (this.E == r4) goto L35;
        this.E = r4;
        if (r4 != 1) goto L7;
        boolean r5 = true;
    L8:
        super.setChecked(r5);
        refreshDrawableState();
        int r6 = Build.VERSION.SDK_INT;
        if (r6 < 30) goto L14;
        if (this.H != null) goto L14;
        super.setStateDescription(getButtonStateDescription());
    L14:
        if (this.G == true) goto L36;
        this.G = true;
        LinkedHashSet r1 = this.s;
        if (r1 == null) goto L24;
        Iterator r2 = r1.iterator();
        if (r2.hasNext() == false) goto L24;
        throw xa3.d(r2);
    L24:
        if (this.E == 2) goto L29;
        CompoundButton.OnCheckedChangeListener r3 = this.I;
        if (r3 == null) goto L29;
        r3.onCheckedChanged(this, isChecked());
    L29:
        if (r6 < 26) goto L33;
        AutofillManager r7 = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (r7 == null) goto L33;
        r7.notifyValueChanged(this);
    L33:
        this.G = false;
        return;
    L36:
        return;
    L7:
        r5 = false;
        goto L8
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean r1) {
        super.setEnabled(r1);
    }

    public void setErrorAccessibilityLabel(CharSequence r1) {
        this.x = r1;
    }

    public void setErrorAccessibilityLabelResource(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r3 = getResources().getText(r2);
    L5:
        setErrorAccessibilityLabel(r3);
        return;
    L4:
        r3 = null;
        goto L5
    }

    public void setErrorShown(boolean r2) {
        if (this.w == r2) goto L10;
        this.w = r2;
        refreshDrawableState();
        Iterator r1 = this.r.iterator();
        if (r1.hasNext() == true) goto L9;
        return;
    L9:
        throw xa3.d(r1);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener r1) {
        this.I = r1;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence r3) {
        this.H = r3;
        if (r3 == null) goto L5;
        super.setStateDescription(r3);
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L11;
        if (r3 != null) goto L12;
        super.setStateDescription(getButtonStateDescription());
        return;
    L12:
        return;
    }

    public void setUseMaterialThemeColors(boolean r1) {
        this.u = r1;
        if (r1 == false) goto L6;
        setButtonTintList(getMaterialThemeColorsTintList());
        return;
    L6:
        setButtonTintList(null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.hf, android.widget.CompoundButton
    public void setButtonDrawable(Drawable r1) {
        this.y = r1;
        this.A = false;
        a();
    }
}
