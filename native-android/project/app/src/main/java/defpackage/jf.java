package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf extends CheckedTextView {
    public final kf n;
    public final c6 o;
    public final ih p;
    public ig q;

    public jf(Context r9, AttributeSet r10) {
        ju4.a(r9);
        super(r9, r10, R.attr.checkedTextViewStyle);
        gt4.a(this, getContext());
        ih r11 = new ih(this);
        this.p = r11;
        r11.f(r10, R.attr.checkedTextViewStyle);
        r11.b();
        c6 r12 = new c6(this);
        this.o = r12;
        r12.n(r10, R.attr.checkedTextViewStyle);
        this.n = new kf(this);
        Context r13 = getContext();
        int[] r2 = st3.l;
        jv3 r14 = jv3.f(r13, r10, r2, R.attr.checkedTextViewStyle);
        TypedArray r7 = (TypedArray) r14.o;
        j65.n(this, getContext(), r2, r10, (TypedArray) r14.o, R.attr.checkedTextViewStyle, 0);
    L9:
        th = move-exception;
        r14.g();
        throw th;
    L4:
        if (r7.hasValue(1) == false) goto L12;
        int r8 = r7.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r8 == 0) goto L12;
        setCheckMarkDrawable(zz1.r(getContext(), r8));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r7.hasValue(2) == false) goto L20;
        setCheckMarkTintList(r14.b(2));     // Catch: Throwable -> L9
    L20:
        if (r7.hasValue(3) == false) goto L22;
        setCheckMarkTintMode(aw0.c(r7.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r14.g();
        getEmojiTextViewHelper().b(r10, R.attr.checkedTextViewStyle);
        return;
    L12:
        if (r7.hasValue(0) == false) goto L17;
        int r15 = r7.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r15 == 0) goto L17;
        setCheckMarkDrawable(zz1.r(getContext(), r15));     // Catch: Throwable -> L9
        goto L17
    }

    private ig getEmojiTextViewHelper() {
        if (this.q != null) goto L6;
        this.q = new ig(this);
    L6:
        return this.q;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ih r0 = this.p;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        c6 r1 = this.o;
        if (r1 == null) goto L8;
        r1.b();
    L8:
        kf r2 = this.n;
        if (r2 == null) goto L12;
        r2.b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 r0 = this.o;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.k();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 r0 = this.o;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.l();
    }

    public ColorStateList getSupportCheckMarkTintList() {
        kf r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        kf r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.p.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r2) {
        InputConnection r0 = super.onCreateInputConnection(r2);
        wr1.O(r2, r0, this);
        return r0;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
        super.setAllCaps(r1);
        getEmojiTextViewHelper().c(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        c6 r0 = this.o;
        if (r0 == null) goto L6;
        r0.p();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
        super.setBackgroundResource(r1);
        c6 r0 = this.o;
        if (r0 == null) goto L6;
        r0.q(r1);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable r1) {
        super.setCheckMarkDrawable(r1);
        kf r0 = this.n;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.e == false) goto L8;
        r0.e = false;
        return;
    L8:
        r0.e = true;
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        ih r0 = this.p;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        ih r0 = this.p;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ya4.P(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r1) {
        getEmojiTextViewHelper().d(r1);
    }

    public void setSupportBackgroundTintList(ColorStateList r1) {
        c6 r0 = this.o;
        if (r0 == null) goto L6;
        r0.y(r1);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r1) {
        c6 r0 = this.o;
        if (r0 == null) goto L6;
        r0.z(r1);
        return;
    }

    public void setSupportCheckMarkTintList(ColorStateList r1) {
        kf r0 = this.n;
        if (r0 == null) goto L6;
        r0.a = r1;
        r0.c = true;
        r0.b();
        return;
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode r1) {
        kf r0 = this.n;
        if (r0 == null) goto L6;
        r0.b = r1;
        r0.d = true;
        r0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r1) {
        ih r0 = this.p;
        r0.k(r1);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r1) {
        ih r0 = this.p;
        r0.l(r1);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r1, int r2) {
        super.setTextAppearance(r1, r2);
        ih r0 = this.p;
        if (r0 == null) goto L6;
        r0.g(r1, r2);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
        setCheckMarkDrawable(zz1.r(getContext(), r2));
    }
}
