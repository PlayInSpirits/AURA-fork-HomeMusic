package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xg2 extends ef {
    public final bc2 r;
    public final AccessibilityManager s;
    public final Rect t;
    public final int u;
    public final float v;
    public ColorStateList w;
    public int x;
    public ColorStateList y;

    public xg2(Context r8, AttributeSet r9) {
        super(su3.H(r8, r9, R.attr.autoCompleteTextViewStyle, 0), r9, R.attr.autoCompleteTextViewStyle);
        this.t = new Rect();
        Context r0 = getContext();
        TypedArray r10 = uc5.D(r0, r9, ht3.u, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (r10.hasValue(0) == true) goto L5;
    L7:
        this.u = r10.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.v = r10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (r10.hasValue(2) == false) goto L10;
        this.w = ColorStateList.valueOf(r10.getColor(2, 0));
    L10:
        this.x = r10.getColor(4, 0);
        this.y = h12.s(r0, r10, 5);
        this.s = (AccessibilityManager) r0.getSystemService("accessibility");
        bc2 r3 = new bc2(r0, null, R.attr.listPopupWindowStyle, 0);
        this.r = r3;
        r3.L = true;
        lg r1 = r3.M;
        r1.setFocusable(true);
        r3.B = this;
        r1.setInputMethodMode(2);
        r3.p(getAdapter());
        r3.C = new wg(1, this);
        if (r10.hasValue(6) == false) goto L13;
        setSimpleItems(r10.getResourceId(6, 0));
    L13:
        r10.recycle();
        return;
    L5:
        if (r10.getInt(0, 0) != 0) goto L7;
        setKeyListener(null);
        goto L7
    }

    public static void a(xg2 r1, Object r2) {
        r1.setText(r1.convertSelectionToString(r2), false);
    }

    public final TextInputLayout b() {
        ViewParent r1 = getParent();
    L3:
        if (r1 == null) goto L9;
        if ((r1 instanceof TextInputLayout) == true) goto L7;
        r1 = r1.getParent();
        goto L3
    L7:
        return (TextInputLayout) r1;
    L9:
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager r0 = this.s;
        if (r0 != null) goto L5;
    L8:
        super.dismissDropDown();
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L8;
        this.r.dismiss();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.w;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout r0 = b();
        if (r0 == null) goto L9;
        if (r0.R == false) goto L9;
        return r0.getHint();
    L9:
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.v;
    }

    public int getSimpleItemSelectedColor() {
        return this.x;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.y;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout r0 = b();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.R == true) goto L7;
        return;
    L7:
        if (super.getHint() != null) goto L18;
        String r1 = Build.MANUFACTURER;
        if (r1 == null) goto L11;
        String r2 = r1.toLowerCase(Locale.ENGLISH);
    L13:
        if (r2.equals("meizu") == false) goto L19;
        setHint("");
        return;
    L19:
        return;
    L11:
        r2 = "";
        goto L13
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
        super.onMeasure(r14, r15);
        if (View.MeasureSpec.getMode(r14) != Integer.MIN_VALUE) goto L30;
        int r16 = getMeasuredWidth();
        ListAdapter r0 = getAdapter();
        TextInputLayout r1 = b();
        int r2 = 0;
        if (r0 == null) goto L25;
        if (r1 == null) goto L25;
        int r3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        bc2 r5 = this.r;
        if (r5.M.isShowing() == true) goto L11;
        int r6 = -1;
    L12:
        int r7 = Math.min(r0.getCount(), Math.max(0, r6) + 15);
        int r9 = Math.max(0, r7 - 15);
        View r10 = null;
        int r8 = 0;
    L13:
        if (r9 >= r7) goto L21;
        int r11 = r0.getItemViewType(r9);
        if (r11 == r2) goto L17;
        r10 = null;
        r2 = r11;
    L17:
        r10 = r0.getView(r9, r10, r1);
        if (r10.getLayoutParams() != null) goto L20;
        r10.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    L20:
        r10.measure(r3, r4);
        r8 = Math.max(r8, r10.getMeasuredWidth());
        r9 = r9 + 1;
        goto L13
    L21:
        Drawable r12 = r5.M.getBackground();
        if (r12 == null) goto L24;
        Rect r13 = this.t;
        r12.getPadding(r13);
        r8 = r8 + (r13.left + r13.right);
    L24:
        r2 = r1.getEndIconView().getMeasuredWidth() + r8;
        goto L25
    L11:
        r6 = r5.p.getSelectedItemPosition();
    L25:
        setMeasuredDimension(Math.min(Math.max(r16, r2), View.MeasureSpec.getSize(r14)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
        AccessibilityManager r0 = this.s;
        if (r0 != null) goto L5;
    L7:
        super.onWindowFocusChanged(r2);
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L7;
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T r1) {
        super.setAdapter(r1);
        this.r.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable r1) {
        super.setDropDownBackgroundDrawable(r1);
        bc2 r0 = this.r;
        if (r0 == null) goto L6;
        r0.i(r1);
        return;
    }

    public void setDropDownBackgroundTint(int r1) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(r1));
    }

    public void setDropDownBackgroundTintList(ColorStateList r2) {
        this.w = r2;
        Drawable r3 = getDropDownBackground();
        if ((r3 instanceof fi2) == false) goto L6;
        ((fi2) r3).m(this.w);
        return;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener r1) {
        super.setOnItemSelectedListener(r1);
        bc2 r2 = this.r;
        r2.D = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
        super.setRawInputType(r1);
        TextInputLayout r0 = b();
        if (r0 == null) goto L6;
        r0.s();
        return;
    }

    public void setSimpleItemSelectedColor(int r1) {
        this.x = r1;
        if ((getAdapter() instanceof wg2) == false) goto L6;
        ((wg2) getAdapter()).a();
        return;
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList r1) {
        this.y = r1;
        if ((getAdapter() instanceof wg2) == false) goto L6;
        ((wg2) getAdapter()).a();
        return;
    }

    public void setSimpleItems(String[] r4) {
        setAdapter(new wg2(this, getContext(), this.u, r4));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager r0 = this.s;
        if (r0 != null) goto L5;
    L8:
        super.showDropDown();
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L8;
        this.r.f();
    }

    public void setSimpleItems(int r2) {
        setSimpleItems(getResources().getStringArray(r2));
    }
}
