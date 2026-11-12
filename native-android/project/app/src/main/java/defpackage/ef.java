package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ef extends AutoCompleteTextView {
    public static final int[] q = null;
    public final c6 n;
    public final ih o;
    public final gp3 p;

    static {
        q = new int[]{R.attr.popupBackground};
    }

    public ef(Context r4, AttributeSet r5, int r6) {
        ju4.a(r4);
        super(r4, r5, r6);
        gt4.a(this, getContext());
        jv3 r7 = jv3.f(getContext(), r5, q, r6);
        if (((TypedArray) r7.o).hasValue(0) == false) goto L5;
        setDropDownBackgroundDrawable(r7.c(0));
    L5:
        r7.g();
        c6 r8 = new c6(this);
        this.n = r8;
        r8.n(r5, r6);
        ih r9 = new ih(this);
        this.o = r9;
        r9.f(r5, r6);
        r9.b();
        gp3 r10 = new gp3(this);
        this.p = r10;
        r10.p(r5, r6);
        KeyListener r11 = getKeyListener();
        if ((r11 instanceof NumberKeyListener) == true) goto L12;
        boolean r12 = super.isFocusable();
        boolean r0 = super.isClickable();
        boolean r1 = super.isLongClickable();
        int r2 = super.getInputType();
        KeyListener r13 = r10.k(r11);
        if (r13 == r11) goto L13;
        super.setKeyListener(r13);
        super.setRawInputType(r2);
        super.setFocusable(r12);
        super.setClickable(r0);
        super.setLongClickable(r1);
        return;
    L13:
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 r0 = this.n;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        ih r1 = this.o;
        if (r1 == null) goto L9;
        r1.b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.k();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.l();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r2) {
        InputConnection r0 = super.onCreateInputConnection(r2);
        wr1.O(r2, r0, this);
        return this.p.r(r0, r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.p();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
        super.setBackgroundResource(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.q(r1);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ya4.P(r1, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
        setDropDownBackgroundDrawable(zz1.r(getContext(), r2));
    }

    public void setEmojiCompatEnabled(boolean r1) {
        this.p.v(r1);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.p.k(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.y(r1);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.z(r1);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r1) {
        ih r0 = this.o;
        r0.k(r1);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r1) {
        ih r0 = this.o;
        r0.l(r1);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r1, int r2) {
        super.setTextAppearance(r1, r2);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.g(r1, r2);
        return;
    }
}
