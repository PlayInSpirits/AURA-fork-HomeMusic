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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        gt4.a(this, getContext());
        kf kfVar = new kf(this);
        this.n = kfVar;
        kfVar.c(attributeSet, i);
        c6 c6Var = new c6(this);
        this.o = c6Var;
        c6Var.n(attributeSet, i);
        ih ihVar = new ih(this);
        this.p = ihVar;
        ihVar.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private ig getEmojiTextViewHelper() {
        if (this.q == null) {
            this.q = new ig(this);
        }
        return this.q;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.b();
        }
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 c6Var = this.o;
        if (c6Var != null) {
            return c6Var.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 c6Var = this.o;
        if (c6Var != null) {
            return c6Var.l();
        }
        return null;
    }

    @Override // defpackage.lu4
    public ColorStateList getSupportButtonTintList() {
        kf kfVar = this.n;
        if (kfVar != null) {
            return kfVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        kf kfVar = this.n;
        if (kfVar != null) {
            return kfVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.p.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.q(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        kf kfVar = this.n;
        if (kfVar != null) {
            if (kfVar.e) {
                kfVar.e = false;
            } else {
                kfVar.e = true;
                kfVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.z(mode);
        }
    }

    @Override // defpackage.lu4
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        kf kfVar = this.n;
        if (kfVar != null) {
            kfVar.a = colorStateList;
            kfVar.c = true;
            kfVar.a();
        }
    }

    @Override // defpackage.lu4
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        kf kfVar = this.n;
        if (kfVar != null) {
            kfVar.b = mode;
            kfVar.d = true;
            kfVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ih ihVar = this.p;
        ihVar.k(colorStateList);
        ihVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ih ihVar = this.p;
        ihVar.l(mode);
        ihVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(zz1.r(getContext(), i));
    }
}
