package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class mh extends TextView {
    public final c6 n;
    public final ih o;
    public final xc5 p;
    public ig q;
    public boolean r;
    public zg5 s;
    public Future t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        this.r = false;
        this.s = null;
        gt4.a(this, getContext());
        c6 c6Var = new c6(this);
        this.n = c6Var;
        c6Var.n(attributeSet, i);
        ih ihVar = new ih(this);
        this.o = ihVar;
        ihVar.f(attributeSet, i);
        ihVar.b();
        xc5 xc5Var = new xc5(2, false);
        xc5Var.o = this;
        this.p = xc5Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private ig getEmojiTextViewHelper() {
        if (this.q == null) {
            this.q = new ig(this);
        }
        return this.q;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public jh getSuperCaller() {
        if (this.s == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.s = new lh(this);
            } else if (i >= 28) {
                this.s = new kh(this);
            } else if (i >= 26) {
                this.s = new zg5(this);
            }
        }
        return this.s;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.t;
        if (future != null) {
            try {
                this.t = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ya4.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        xc5 xc5Var;
        if (Build.VERSION.SDK_INT >= 28 || (xc5Var = this.p) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) xc5Var.p;
        return textClassifier == null ? ch.a((TextView) xc5Var.o) : textClassifier;
    }

    public mo3 getTextMetricsParamsCompat() {
        return ya4.w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.o.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i2 >= 30) {
                p3.h(editorInfo, text);
            } else {
                text.getClass();
                if (i2 >= 30) {
                    p3.h(editorInfo, text);
                } else {
                    int i3 = editorInfo.initialSelStart;
                    int i4 = editorInfo.initialSelEnd;
                    int i5 = i3 > i4 ? i4 : i3;
                    if (i3 <= i4) {
                        i3 = i4;
                    }
                    int length = text.length();
                    if (i5 < 0 || i3 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        uo.S(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        uo.S(editorInfo, text, i5, i3);
                    } else {
                        int i6 = i3 - i5;
                        int i7 = i6 > 1024 ? 0 : i6;
                        int i8 = 2048 - i7;
                        int iMin = Math.min(text.length() - i3, i8 - Math.min(i5, (int) (((double) i8) * 0.8d)));
                        int iMin2 = Math.min(i5, i8 - iMin);
                        int i9 = i5 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i9))) {
                            i9++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
                            iMin--;
                        }
                        int i10 = iMin2 + i7;
                        uo.S(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
                    }
                }
            }
        }
        wr1.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ih ihVar = this.o;
        if (ihVar == null || e85.c) {
            return;
        }
        ihVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.t;
        if (future != null) {
            try {
                this.t = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ya4.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? zz1.r(context, i) : null, i2 != 0 ? zz1.r(context, i2) : null, i3 != 0 ? zz1.r(context, i3) : null, i4 != 0 ? zz1.r(context, i4) : null);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? zz1.r(context, i) : null, i2 != 0 ? zz1.r(context, i2) : null, i3 != 0 ? zz1.r(context, i3) : null, i4 != 0 ? zz1.r(context, i4) : null);
        ih ihVar = this.o;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            ya4.I(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            ya4.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().h(i, f);
        } else if (i2 >= 34) {
            a3.o(this, i, f);
        } else {
            ya4.K(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(no3 no3Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        ya4.w(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        xc5 xc5Var;
        if (Build.VERSION.SDK_INT >= 28 || (xc5Var = this.p) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xc5Var.p = textClassifier;
        }
    }

    public void setTextFuture(Future<no3> future) {
        this.t = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(mo3 mo3Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = mo3Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(mo3Var.a);
        setBreakStrategy(mo3Var.c);
        setHyphenationFrequency(mo3Var.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.r) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            vr1 vr1Var = d05.a;
            if (context == null) {
                kf2.n("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.r = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.r = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ya4.K(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    public mh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
