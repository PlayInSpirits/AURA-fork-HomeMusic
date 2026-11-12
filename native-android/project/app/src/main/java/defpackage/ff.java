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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ff extends Button {
    public final c6 n;
    public final ih o;
    public ig p;

    public ff(Context r1, AttributeSet r2, int r3) {
        ju4.a(r1);
        super(r1, r2, r3);
        gt4.a(this, getContext());
        c6 r4 = new c6(this);
        this.n = r4;
        r4.n(r2, r3);
        ih r5 = new ih(this);
        this.o = r5;
        r5.f(r2, r3);
        r5.b();
        getEmojiTextViewHelper().b(r2, r3);
    }

    private ig getEmojiTextViewHelper() {
        if (this.p != null) goto L6;
        this.p = new ig(this);
    L6:
        return this.p;
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
    public int getAutoSizeMaxTextSize() {
        if (e85.c == true) goto L5;
        ih r1 = this.o;
        if (r1 != null) goto L9;
        return -1;
    L9:
        return Math.round(r1.i.e);
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e85.c == true) goto L5;
        ih r1 = this.o;
        if (r1 != null) goto L9;
        return -1;
    L9:
        return Math.round(r1.i.d);
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e85.c == true) goto L5;
        ih r1 = this.o;
        if (r1 != null) goto L9;
        return -1;
    L9:
        return Math.round(r1.i.c);
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e85.c == true) goto L5;
        ih r1 = this.o;
        if (r1 == null) goto L11;
        return r1.i.f;
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (e85.c == true) goto L5;
        ih r2 = this.o;
        if (r2 != null) goto L11;
        return 0;
    L11:
        return r2.i.a;
    L5:
        if (super.getAutoSizeTextType() != 1) goto L7;
        return 1;
    L7:
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent r1) {
        super.onInitializeAccessibilityEvent(r1);
        r1.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r1) {
        super.onInitializeAccessibilityNodeInfo(r1);
        r1.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        ih r0 = this.o;
        if (r0 != null) goto L5;
        return;
    L5:
        if (e85.c == true) goto L9;
        r0.i.a();
        return;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L10;
        rh r5 = r0.i;
        if (e85.c == false) goto L7;
        return;
    L7:
        if (r5.f() == false) goto L12;
        r5.a();
        return;
    L12:
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
        super.setAllCaps(r1);
        getEmojiTextViewHelper().c(r1);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (e85.c == false) goto L6;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L6:
        ih r1 = this.o;
        if (r1 == null) goto L10;
        r1.h(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (e85.c == false) goto L6;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L6:
        ih r1 = this.o;
        if (r1 == null) goto L10;
        r1.i(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (e85.c == false) goto L6;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L6:
        ih r1 = this.o;
        if (r1 == null) goto L10;
        r1.j(r2);
        return;
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ya4.P(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r1) {
        getEmojiTextViewHelper().d(r1);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().a(r2));
    }

    public void setSupportAllCaps(boolean r1) {
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.a.setAllCaps(r1);
        return;
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

    @Override // android.widget.TextView
    public final void setTextSize(int r2, float r3) {
        boolean r0 = e85.c;
        if (r0 == false) goto L6;
        super.setTextSize(r2, r3);
        return;
    L6:
        ih r1 = this.o;
        if (r1 == null) goto L14;
        rh r4 = r1.i;
        if (r0 == false) goto L11;
        return;
    L11:
        if (r4.f() == true) goto L16;
        r4.g(r2, r3);
        return;
    L16:
        return;
    }
}
