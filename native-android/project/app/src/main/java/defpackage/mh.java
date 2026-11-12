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

    public mh(Context r3, AttributeSet r4, int r5) {
        ju4.a(r3);
        super(r3, r4, r5);
        this.r = false;
        this.s = null;
        gt4.a(this, getContext());
        c6 r0 = new c6(this);
        this.n = r0;
        r0.n(r4, r5);
        ih r1 = new ih(this);
        this.o = r1;
        r1.f(r4, r5);
        r1.b();
        int r2 = 2;
        xc5 r6 = new xc5(r2, false);
        r6.o = this;
        this.p = r6;
        getEmojiTextViewHelper().b(r4, r5);
    }

    public static /* synthetic */ void d(mh r0, int r1) {
        super.setFirstBaselineToTopHeight(r1);
    }

    public static /* synthetic */ void e(mh r0, int r1) {
        super.setLastBaselineToBottomHeight(r1);
    }

    public static /* synthetic */ void f(mh r0, int r1, float r2) {
        super.setLineHeight(r1, r2);
    }

    private ig getEmojiTextViewHelper() {
        if (this.q != null) goto L6;
        this.q = new ig(this);
    L6:
        return this.q;
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
        ih r1 = this.o;
        if (r1 != null) goto L10;
        return 0;
    L10:
        return r1.i.a;
    L5:
        if (super.getAutoSizeTextType() != 1) goto L11;
        return 1;
    L11:
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
        if (this.s != null) goto L14;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L8;
        this.s = new lh(this);
        goto L14
    L8:
        if (r0 < 28) goto L11;
        this.s = new kh(this);
        goto L14
    L11:
        if (r0 < 26) goto L14;
        this.s = new zg5(this);
    L14:
        return this.s;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future r0 = this.t;
        if (r0 == null) goto L16;
        this.t = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        ya4.w(this);     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    L16:
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L12;
        xc5 r0 = this.p;
        if (r0 == null) goto L12;
        TextClassifier r2 = (TextClassifier) r0.p;
        if (r2 == null) goto L10;
        return r2;
    L10:
        return ch.a((TextView) r0.o);
    L12:
        return super.getTextClassifier();
    }

    public mo3 getTextMetricsParamsCompat() {
        return ya4.w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r14) {
        InputConnection r0 = super.onCreateInputConnection(r14);
        this.o.getClass();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 30) goto L49;
        if (r0 == null) goto L49;
        CharSequence r3 = getText();
        if (r1 < 30) goto L8;
        p3.h(r14, r3);
        goto L49
    L8:
        r3.getClass();
        if (r1 < 30) goto L11;
        p3.h(r14, r3);
        goto L49
    L11:
        int r2 = r14.initialSelStart;
        int r4 = r14.initialSelEnd;
        if (r2 <= r4) goto L14;
        int r5 = r4;
    L15:
        if (r2 > r4) goto L18;
        r2 = r4;
    L18:
        int r6 = r3.length();
        if (r5 < 0) goto L48;
        if (r2 > r6) goto L48;
        int r7 = r14.inputType & 4095;
        if (r7 != 129) goto L25;
    L47:
        uo.S(r14, null, 0, 0);
        goto L49
    L25:
        if (r7 == 225) goto L47;
        if (r7 == 18) goto L47;
        if (r6 > 2048) goto L32;
        uo.S(r14, r3, r5, r2);
        goto L49
    L32:
        int r8 = r2 - r5;
        if (r8 <= 1024) goto L35;
        int r9 = 0;
    L36:
        int r10 = 2048 - r9;
        int r11 = Math.min(r3.length() - r2, r10 - Math.min(r5, (int) (((double) r10) * 0.8d)));
        int r12 = Math.min(r5, r10 - r11);
        int r13 = r5 - r12;
        if (Character.isLowSurrogate(r3.charAt(r13)) == false) goto L40;
        r13 = r13 + 1;
        r12 = r12 - 1;
    L40:
        if (Character.isHighSurrogate(r3.charAt((r2 + r11) - 1)) == false) goto L42;
        r11 = r11 - 1;
    L42:
        int r15 = r12 + r9;
        int r16 = r15 + r11;
        if (r9 == r8) goto L45;
        CharSequence r17 = TextUtils.concat(new CharSequence[]{r3.subSequence(r13, r13 + r12), r3.subSequence(r2, r11 + r2)});
    L46:
        uo.S(r14, r17, r12, r15);
        goto L49
    L45:
        r17 = r3.subSequence(r13, r16 + r13);
        goto L46
    L35:
        r9 = r8;
    L48:
        uo.S(r14, null, 0, 0);
        goto L49
    L14:
        r5 = r2;
    L49:
        wr1.O(r14, r0, this);
        return r0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L5;
        return;
    L5:
        if (r0 < 33) goto L7;
        return;
    L7:
        if (onCheckIsTextEditor() == false) goto L12;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        ih r0 = this.o;
        if (r0 != null) goto L5;
        return;
    L5:
        if (e85.c == true) goto L9;
        r0.i.a();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r4, int r5) {
        Future r0 = this.t;
        if (r0 != null) goto L18;
    L15:
        super.onMeasure(r4, r5);
        return;
    L18:
        this.t = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        ya4.w(this);     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r0 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r7 = zz1.r(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r8 = zz1.r(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r9 = zz1.r(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = zz1.r(r0, r6);
    L14:
        setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r8, r9, r1);
        ih r2 = this.o;
        if (r2 == null) goto L18;
        r2.b();
        return;
    L18:
        return;
    L11:
        r9 = null;
        goto L12
    L8:
        r8 = null;
        goto L9
    L5:
        r7 = null;
        goto L6
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r0 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r7 = zz1.r(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r8 = zz1.r(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r9 = zz1.r(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = zz1.r(r0, r6);
    L14:
        setCompoundDrawablesWithIntrinsicBounds(r7, r8, r9, r1);
        ih r2 = this.o;
        if (r2 == null) goto L18;
        r2.b();
        return;
    L18:
        return;
    L11:
        r9 = null;
        goto L12
    L8:
        r8 = null;
        goto L9
    L5:
        r7 = null;
        goto L6
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        getSuperCaller().f(r3);
        return;
    L6:
        ya4.I(this, r3);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        getSuperCaller().c(r3);
        return;
    L6:
        ya4.J(this, r3);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        getSuperCaller().h(r3, r4);
        return;
    L6:
        if (r0 < 34) goto L9;
        a3.o(this, r3, r4);
        return;
    L9:
        ya4.K(this, Math.round(TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics())));
    }

    public void setPrecomputedText(no3 r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        throw null;
    L5:
        ya4.w(this);
        throw null;
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
    public void setTextAppearance(Context r1, int r2) {
        super.setTextAppearance(r1, r2);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.g(r1, r2);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        xc5 r0 = this.p;
        if (r0 == null) goto L9;
        r0.p = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    public void setTextFuture(Future<no3> r1) {
        this.t = r1;
        if (r1 == null) goto L6;
        requestLayout();
        return;
    }

    public void setTextMetricsParamsCompat(mo3 r6) {
        TextDirectionHeuristic r0 = r6.b;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int r2 = 1;
        if (r0 == r1) goto L24;
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (r0 == r3) goto L24;
        if (r0 != TextDirectionHeuristics.ANYRTL_LTR) goto L12;
        r2 = 2;
        goto L24
    L12:
        if (r0 != TextDirectionHeuristics.LTR) goto L15;
        r2 = 3;
        goto L24
    L15:
        if (r0 != TextDirectionHeuristics.RTL) goto L18;
        r2 = 4;
        goto L24
    L18:
        if (r0 != TextDirectionHeuristics.LOCALE) goto L20;
        r2 = 5;
        goto L24
    L20:
        if (r0 != r3) goto L22;
        r2 = 6;
        goto L24
    L22:
        if (r0 != r1) goto L24;
        r2 = 7;
    L24:
        setTextDirection(r2);
        getPaint().set(r6.a);
        setBreakStrategy(r6.c);
        setHyphenationFrequency(r6.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface r3, int r4) {
        if (this.r == false) goto L5;
        return;
    L5:
        if (r3 == null) goto L12;
        if (r4 <= 0) goto L12;
        Context r0 = getContext();
        vr1 r1 = d05.a;
        if (r0 == null) goto L10;
        Typeface r2 = Typeface.create(r3, r4);
    L13:
        this.r = true;
        if (r2 == null) goto L23;
        r3 = r2;
    L23:
        super.setTypeface(r3, r4);     // Catch: Throwable -> L20
        this.r = false;
        return;
    L20:
        th = move-exception;
        this.r = false;
        throw th;
    L10:
        kf2.n("Context cannot be null");
        return;
    L12:
        r2 = null;
        goto L13
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
        ya4.K(this, r1);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    public mh(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.textViewStyle);
    }
}
