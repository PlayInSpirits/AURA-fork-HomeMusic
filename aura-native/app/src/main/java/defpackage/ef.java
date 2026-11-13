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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ef extends AutoCompleteTextView {
    public static final int[] q = {R.attr.popupBackground};
    public final c6 n;
    public final ih o;
    public final gp3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        gt4.a(this, getContext());
        jv3 f = jv3.f(getContext(), attributeSet, q, i);
        if (((TypedArray) f.o).hasValue(0)) {
            setDropDownBackgroundDrawable(f.c(0));
        }
        f.g();
        c6 c6Var = new c6(this);
        this.n = c6Var;
        c6Var.n(attributeSet, i);
        ih ihVar = new ih(this);
        this.o = ihVar;
        ihVar.f(attributeSet, i);
        ihVar.b();
        gp3 gp3Var = new gp3(this);
        this.p = gp3Var;
        gp3Var.p(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener k = gp3Var.k(keyListener);
        if (k == keyListener) {
            return;
        }
        super.setKeyListener(k);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.b();
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.l();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        wr1.O(editorInfo, onCreateInputConnection, this);
        return this.p.r(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.q(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ya4.P(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(zz1.r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.p.v(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.p.k(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.z(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ih ihVar = this.o;
        ihVar.k(colorStateList);
        ihVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ih ihVar = this.o;
        ihVar.l(mode);
        ihVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.g(context, i);
        }
    }
}
