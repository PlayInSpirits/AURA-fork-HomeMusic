package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh extends Spinner {
    public static final int[] v = null;
    public final c6 n;
    public final Context o;
    public final rg p;
    public SpinnerAdapter q;
    public final boolean r;
    public final ah s;
    public int t;
    public final Rect u;

    static {
        v = new int[]{R.attr.spinnerMode};
    }

    public bh(Context r13, AttributeSet r14) {
        super(r13, r14, app.homemusic.R.attr.spinnerStyle);
        this.u = new Rect();
        gt4.a(this, getContext());
        int[] r1 = st3.w;
        jv3 r2 = jv3.f(r13, r14, r1, app.homemusic.R.attr.spinnerStyle);
        TypedArray r3 = (TypedArray) r2.o;
        this.n = new c6(this);
        int r4 = r3.getResourceId(4, 0);
        if (r4 == 0) goto L5;
        this.o = new ud0(r13, r4);
    L6:
        int r5 = -1;
        TypedArray r6 = null;
        TypedArray r7 = r13.obtainStyledAttributes(r14, v, app.homemusic.R.attr.spinnerStyle, 0);     // Catch: Throwable -> L17 Exception -> L19
    L14:
        e = e;
    L21:
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);     // Catch: Throwable -> L12
        if (r7 == null) goto L25;
    L16:
        r7.recycle();
    L25:
        if (r5 == 0) goto L29;
        if (r5 != 1) goto L30;
        yg r8 = new yg(this, this.o, r14);
        jv3 r9 = jv3.f(this.o, r14, r1, app.homemusic.R.attr.spinnerStyle);
        this.t = ((TypedArray) r9.o).getLayoutDimension(3, -2);
        r8.i(r9.c(1));
        r8.P = r3.getString(2);
        r9.g();
        this.s = r8;
        this.p = new rg(this, this, r8);
    L30:
        CharSequence[] r10 = r3.getTextArray(0);
        if (r10 == null) goto L33;
        ArrayAdapter r11 = new ArrayAdapter(r13, R.layout.simple_spinner_item, r10);
        r11.setDropDownViewResource(app.homemusic.R.layout.support_simple_spinner_dropdown_item);
        setAdapter(r11);
    L33:
        r2.g();
        this.r = true;
        SpinnerAdapter r15 = this.q;
        if (r15 == null) goto L36;
        setAdapter(r15);
        this.q = null;
    L36:
        this.n.n(r14, app.homemusic.R.attr.spinnerStyle);
        return;
    L29:
        ug r12 = new ug(this);
        this.s = r12;
        r12.p = r3.getString(2);
    L12:
        th = th;
        r6 = r7;
    L38:
        if (r6 == null) goto L40;
        r6.recycle();
    L40:
        throw th;
    L9:
        if (r7.hasValue(0) == false) goto L16;
        r5 = r7.getInt(0, 0);     // Catch: Throwable -> L12 Exception -> L14
        goto L16
    L19:
        e = e;
        r7 = null;
    L17:
        th = th;
        goto L38
    L5:
        this.o = r13;
        goto L6
    }

    public final int a(SpinnerAdapter r11, Drawable r12) {
        int r0 = 0;
        if (r11 != null) goto L5;
        return 0;
    L5:
        int r1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int r3 = Math.max(0, getSelectedItemPosition());
        int r4 = Math.min(r11.getCount(), r3 + 15);
        int r6 = Math.max(0, r3 - (15 - (r4 - r3)));
        View r7 = null;
        int r5 = 0;
    L6:
        if (r6 >= r4) goto L14;
        int r8 = r11.getItemViewType(r6);
        if (r8 == r0) goto L10;
        r7 = null;
        r0 = r8;
    L10:
        r7 = r11.getView(r6, r7, this);
        if (r7.getLayoutParams() != null) goto L13;
        r7.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    L13:
        r7.measure(r1, r2);
        r5 = Math.max(r5, r7.getMeasuredWidth());
        r6 = r6 + 1;
        goto L6
    L14:
        if (r12 == null) goto L17;
        Rect r10 = this.u;
        r12.getPadding(r10);
        return (r10.left + r10.right) + r5;
    L17:
        return r5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ah r0 = this.s;
        if (r0 == null) goto L7;
        return r0.c();
    L7:
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ah r0 = this.s;
        if (r0 == null) goto L7;
        return r0.o();
    L7:
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.s == null) goto L7;
        return this.t;
    L7:
        return super.getDropDownWidth();
    }

    public final ah getInternalPopup() {
        return this.s;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ah r0 = this.s;
        if (r0 == null) goto L7;
        return r0.g();
    L7:
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.o;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ah r0 = this.s;
        if (r0 == null) goto L7;
        return r0.e();
    L7:
        return super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ah r1 = this.s;
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.b() == false) goto L9;
        r1.dismiss();
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        if (this.s != null) goto L5;
        return;
    L5:
        if (View.MeasureSpec.getMode(r3) != Integer.MIN_VALUE) goto L9;
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(r3)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable r3) {
        zg r4 = (zg) r3;
        super.onRestoreInstanceState(r4.getSuperState());
        if (r4.n == false) goto L8;
        ViewTreeObserver r5 = getViewTreeObserver();
        if (r5 == null) goto L9;
        r5.addOnGlobalLayoutListener(new sg(0, this));
        return;
    L9:
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        zg r0 = new zg(super.onSaveInstanceState());
        ah r2 = this.s;
        if (r2 != null) goto L5;
    L7:
        boolean r3 = false;
    L8:
        r0.n = r3;
        return r0;
    L5:
        if (r2.b() == false) goto L7;
        r3 = true;
        goto L8
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        rg r0 = this.p;
        if (r0 == null) goto L9;
        if (r0.onTouch(this, r2) == false) goto L9;
        return true;
    L9:
        return super.onTouchEvent(r2);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ah r0 = this.s;
        if (r0 == null) goto L10;
        if (r0.b() == true) goto L11;
        r0.n(getTextDirection(), getTextAlignment());
        return true;
    L11:
        return true;
    L10:
        return super.performClick();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter r4) {
        if (this.r == true) goto L6;
        this.q = r4;
        return;
    L6:
        super.setAdapter(r4);
        ah r0 = this.s;
        if (r0 == null) goto L20;
        Context r1 = this.o;
        if (r1 != null) goto L11;
        r1 = getContext();
    L11:
        Resources.Theme r2 = r1.getTheme();
        vg r3 = new vg();
        r3.n = r4;
        if ((r4 instanceof ListAdapter) == false) goto L14;
        r3.o = (ListAdapter) r4;
    L14:
        if (r2 != null) goto L16;
    L18:
        r0.p(r3);
        return;
    L16:
        if ((r4 instanceof ThemedSpinnerAdapter) == false) goto L18;
        tg.a((ThemedSpinnerAdapter) r4, r2);
        goto L18
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
        ah r0 = this.s;
        if (r0 == null) goto L6;
        r0.m(r2);
        r0.d(r2);
        return;
    L6:
        super.setDropDownHorizontalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
        ah r0 = this.s;
        if (r0 == null) goto L6;
        r0.j(r2);
        return;
    L6:
        super.setDropDownVerticalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
        if (this.s == null) goto L6;
        this.t = r2;
        return;
    L6:
        super.setDropDownWidth(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable r2) {
        ah r0 = this.s;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    L6:
        super.setPopupBackgroundDrawable(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
        setPopupBackgroundDrawable(zz1.r(getPopupContext(), r2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence r2) {
        ah r0 = this.s;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    L6:
        super.setPrompt(r2);
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

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter r1) {
        setAdapter((SpinnerAdapter) r1);
    }
}
