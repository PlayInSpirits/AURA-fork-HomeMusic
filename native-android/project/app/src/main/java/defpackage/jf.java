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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ju4.a(context);
        gt4.a(this, getContext());
        ih ihVar = new ih(this);
        this.p = ihVar;
        ihVar.f(attributeSet, R.attr.checkedTextViewStyle);
        ihVar.b();
        c6 c6Var = new c6(this);
        this.o = c6Var;
        c6Var.n(attributeSet, R.attr.checkedTextViewStyle);
        this.n = new kf(this);
        Context context2 = getContext();
        int[] iArr = st3.l;
        jv3 jv3VarF = jv3.f(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        j65.n(this, getContext(), iArr, attributeSet, (TypedArray) jv3VarF.o, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(zz1.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(zz1.r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(zz1.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(jv3VarF.b(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(aw0.c(typedArray.getInt(3, -1), null));
            }
            jv3VarF.g();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            jv3VarF.g();
            throw th;
        }
    }

    private ig getEmojiTextViewHelper() {
        if (this.q == null) {
            this.q = new ig(this);
        }
        return this.q;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
        c6 c6Var = this.o;
        if (c6Var != null) {
            c6Var.b();
        }
        kf kfVar = this.n;
        if (kfVar != null) {
            kfVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        kf kfVar = this.n;
        if (kfVar != null) {
            return kfVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        wr1.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        kf kfVar = this.n;
        if (kfVar != null) {
            if (kfVar.e) {
                kfVar.e = false;
            } else {
                kfVar.e = true;
                kfVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ya4.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        kf kfVar = this.n;
        if (kfVar != null) {
            kfVar.a = colorStateList;
            kfVar.c = true;
            kfVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        kf kfVar = this.n;
        if (kfVar != null) {
            kfVar.b = mode;
            kfVar.d = true;
            kfVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ih ihVar = this.p;
        if (ihVar != null) {
            ihVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(zz1.r(getContext(), i));
    }
}
