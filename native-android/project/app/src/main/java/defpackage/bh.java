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
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh extends Spinner {
    public static final int[] v = {R.attr.spinnerMode};
    public final c6 n;
    public final Context o;
    public final rg p;
    public SpinnerAdapter q;
    public final boolean r;
    public final ah s;
    public int t;
    public final Rect u;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public bh(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, app.homemusic.R.attr.spinnerStyle);
        this.u = new Rect();
        gt4.a(this, getContext());
        int[] iArr = st3.w;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, app.homemusic.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        this.n = new c6(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.o = new ud0(context, resourceId);
        } else {
            this.o = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v, app.homemusic.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        ug ugVar = new ug(this);
                        this.s = ugVar;
                        ugVar.p = typedArray.getString(2);
                    } else if (i == 1) {
                        yg ygVar = new yg(this, this.o, attributeSet);
                        jv3 jv3VarF2 = jv3.f(this.o, attributeSet, iArr, app.homemusic.R.attr.spinnerStyle);
                        this.t = ((TypedArray) jv3VarF2.o).getLayoutDimension(3, -2);
                        ygVar.i(jv3VarF2.c(1));
                        ygVar.P = typedArray.getString(2);
                        jv3VarF2.g();
                        this.s = ygVar;
                        this.p = new rg(this, this, ygVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(app.homemusic.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    jv3VarF.g();
                    this.r = true;
                    spinnerAdapter = this.q;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.q = null;
                    }
                    this.n.n(attributeSet, app.homemusic.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            ug ugVar2 = new ug(this);
            this.s = ugVar2;
            ugVar2.p = typedArray.getString(2);
        } else if (i == 1) {
            yg ygVar2 = new yg(this, this.o, attributeSet);
            jv3 jv3VarF3 = jv3.f(this.o, attributeSet, iArr, app.homemusic.R.attr.spinnerStyle);
            this.t = ((TypedArray) jv3VarF3.o).getLayoutDimension(3, -2);
            ygVar2.i(jv3VarF3.c(1));
            ygVar2.P = typedArray.getString(2);
            jv3VarF3.g();
            this.s = ygVar2;
            this.p = new rg(this, this, ygVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(app.homemusic.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        jv3VarF.g();
        this.r = true;
        spinnerAdapter = this.q;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.q = null;
        }
        this.n.n(attributeSet, app.homemusic.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.u;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ah ahVar = this.s;
        return ahVar != null ? ahVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ah ahVar = this.s;
        return ahVar != null ? ahVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.s != null ? this.t : super.getDropDownWidth();
    }

    public final ah getInternalPopup() {
        return this.s;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ah ahVar = this.s;
        return ahVar != null ? ahVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.o;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ah ahVar = this.s;
        return ahVar != null ? ahVar.e() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ah ahVar = this.s;
        if (ahVar == null || !ahVar.b()) {
            return;
        }
        ahVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.s == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        zg zgVar = (zg) parcelable;
        super.onRestoreInstanceState(zgVar.getSuperState());
        if (!zgVar.n || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new sg(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        zg zgVar = new zg(super.onSaveInstanceState());
        ah ahVar = this.s;
        zgVar.n = ahVar != null && ahVar.b();
        return zgVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rg rgVar = this.p;
        if (rgVar == null || !rgVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ah ahVar = this.s;
        if (ahVar == null) {
            return super.performClick();
        }
        if (ahVar.b()) {
            return true;
        }
        ahVar.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.r) {
            this.q = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ah ahVar = this.s;
        if (ahVar != null) {
            Context context = this.o;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            vg vgVar = new vg();
            vgVar.n = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                vgVar.o = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                tg.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            ahVar.p(vgVar);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        ah ahVar = this.s;
        if (ahVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            ahVar.m(i);
            ahVar.d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        ah ahVar = this.s;
        if (ahVar != null) {
            ahVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.s != null) {
            this.t = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ah ahVar = this.s;
        if (ahVar != null) {
            ahVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(zz1.r(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ah ahVar = this.s;
        if (ahVar != null) {
            ahVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
