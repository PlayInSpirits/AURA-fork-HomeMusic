package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ff extends Button {
    public final c6 n;
    public final ih o;
    public ig p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        gt4.a(this, getContext());
        c6 c6Var = new c6(this);
        this.n = c6Var;
        c6Var.n(attributeSet, i);
        ih ihVar = new ih(this);
        this.o = ihVar;
        ihVar.f(attributeSet, i);
        ihVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private ig getEmojiTextViewHelper() {
        if (this.p == null) {
            this.p = new ig(this);
        }
        return this.p;
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
    public int getAutoSizeMaxTextSize() {
        if (e85.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            return Math.round(ihVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e85.c) {
            return super.getAutoSizeMinTextSize();
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            return Math.round(ihVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e85.c) {
            return super.getAutoSizeStepGranularity();
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            return Math.round(ihVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e85.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ih ihVar = this.o;
        return ihVar != null ? ihVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (e85.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            return ihVar.i.a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ih ihVar = this.o;
        if (ihVar == null || e85.c) {
            return;
        }
        ihVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ih ihVar = this.o;
        if (ihVar != null) {
            rh rhVar = ihVar.i;
            if (e85.c || !rhVar.f()) {
                return;
            }
            rhVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (e85.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (e85.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (e85.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.j(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ya4.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = e85.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            rh rhVar = ihVar.i;
            if (z || rhVar.f()) {
                return;
            }
            rhVar.g(i, f);
        }
    }
}
