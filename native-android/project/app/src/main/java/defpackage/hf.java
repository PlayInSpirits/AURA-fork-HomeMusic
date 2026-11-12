package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hf extends CheckBox implements lu4 {
    public final kf n;
    public final c6 o;
    public final ih p;
    public ig q;

    public hf(Context r1, AttributeSet r2, int r3) {
        ju4.a(r1);
        super(r1, r2, r3);
        gt4.a(this, getContext());
        kf r4 = new kf(this);
        this.n = r4;
        r4.c(r2, r3);
        c6 r5 = new c6(this);
        this.o = r5;
        r5.n(r2, r3);
        ih r6 = new ih(this);
        this.p = r6;
        r6.f(r2, r3);
        getEmojiTextViewHelper().b(r2, r3);
    }

    private ig getEmojiTextViewHelper() {
        if (this.q != null) goto L6;
        this.q = new ig(this);
    L6:
        return this.q;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c6 r0 = this.o;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        ih r1 = this.p;
        if (r1 == null) goto L9;
        r1.b();
        return;
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

    @Override // defpackage.lu4
    public ColorStateList getSupportButtonTintList() {
        kf r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable r1) {
        super.setButtonDrawable(r1);
        kf r0 = this.n;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.e == false) goto L8;
        r0.e = false;
        return;
    L8:
        r0.e = true;
        r0.a();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        ih r0 = this.p;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        ih r0 = this.p;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    public void setEmojiCompatEnabled(boolean r1) {
        getEmojiTextViewHelper().d(r1);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().a(r2));
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

    @Override // defpackage.lu4
    public void setSupportButtonTintList(ColorStateList r1) {
        kf r0 = this.n;
        if (r0 == null) goto L6;
        r0.a = r1;
        r0.c = true;
        r0.a();
        return;
    }

    @Override // defpackage.lu4
    public void setSupportButtonTintMode(PorterDuff.Mode r1) {
        kf r0 = this.n;
        if (r0 == null) goto L6;
        r0.b = r1;
        r0.d = true;
        r0.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(zz1.r(getContext(), r2));
    }
}
