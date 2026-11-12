package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.bc;
import defpackage.bc4;
import defpackage.er1;
import defpackage.fi2;
import defpackage.g12;
import defpackage.gb;
import defpackage.hh3;
import defpackage.ht3;
import defpackage.j65;
import defpackage.j74;
import defpackage.ji2;
import defpackage.qu2;
import defpackage.ss2;
import defpackage.su3;
import defpackage.uc5;
import defpackage.ze;
import defpackage.zz1;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends Toolbar {
    public static final /* synthetic */ int z0 = 0;
    public final TextView k0;
    public final boolean l0;
    public final boolean m0;
    public final hh3 n0;
    public final Drawable o0;
    public final boolean p0;
    public final boolean q0;
    public View r0;
    public final Integer s0;
    public Drawable t0;
    public int u0;
    public boolean v0;
    public final fi2 w0;
    public final AccessibilityManager x0;
    public final ss2 y0;

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.u0 = -1;
        this.y0 = new ss2(13, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                er1.l("SearchBar does not support title. Use hint or text instead.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                er1.l("SearchBar does not support subtitle. Use hint or text instead.");
                throw null;
            }
        }
        Drawable drawableR = zz1.r(context2, getDefaultNavigationIconResource());
        this.o0 = drawableR;
        hh3 hh3Var = new hh3(24);
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.n0 = hh3Var;
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.N, i, R.style.Widget_Material3_SearchBar, new int[0]);
        bc4 bc4VarA = bc4.c(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayD.getColor(3, 0);
        float dimension = typedArrayD.getDimension(6, 0.0f);
        this.m0 = typedArrayD.getBoolean(4, true);
        this.v0 = typedArrayD.getBoolean(5, true);
        boolean z = typedArrayD.getBoolean(8, false);
        this.q0 = typedArrayD.getBoolean(7, false);
        this.p0 = typedArrayD.getBoolean(12, true);
        if (typedArrayD.hasValue(9)) {
            this.s0 = Integer.valueOf(typedArrayD.getColor(9, -1));
        }
        int resourceId = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(1);
        String string2 = typedArrayD.getString(2);
        float dimension2 = typedArrayD.getDimension(11, -1.0f);
        int color2 = typedArrayD.getColor(10, 0);
        typedArrayD.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableR);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.l0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.k0 = textView;
        WeakHashMap weakHashMap = j65.a;
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        fi2 fi2Var = new fi2(bc4VarA);
        this.w0 = fi2Var;
        fi2Var.j(getContext());
        this.w0.l(dimension);
        if (dimension2 >= 0.0f) {
            fi2 fi2Var2 = this.w0;
            fi2Var2.r(dimension2);
            fi2Var2.q(ColorStateList.valueOf(color2));
        }
        int iT = g12.t(this, R.attr.colorControlHighlight);
        this.w0.m(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
        fi2 fi2Var3 = this.w0;
        setBackground(new RippleDrawable(colorStateListValueOf, fi2Var3, fi2Var3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.x0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new bc(5, this));
        }
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonF = gb.F(this);
        if (imageButtonF == null) {
            return;
        }
        imageButtonF.setClickable(!z);
        imageButtonF.setFocusable(!z);
        Drawable background = imageButtonF.getBackground();
        if (background != null) {
            this.t0 = background;
        }
        imageButtonF.setBackgroundDrawable(z ? null : this.t0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.l0 && this.r0 == null && !(view instanceof ActionMenuView)) {
            this.r0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.r0;
    }

    public float getCompatElevation() {
        fi2 fi2Var = this.w0;
        if (fi2Var != null) {
            return fi2Var.n.m;
        }
        WeakHashMap weakHashMap = j65.a;
        return getElevation();
    }

    public float getCornerSize() {
        return this.w0.h();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.k0.getHint();
    }

    public int getMenuResId() {
        return this.u0;
    }

    public int getStrokeColor() {
        return this.w0.n.d.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.w0.n.j;
    }

    public CharSequence getText() {
        return this.k0.getText();
    }

    public TextView getTextView() {
        return this.k0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof qu2;
        if (z) {
            ((qu2) menu).y();
        }
        super.m(i);
        this.u0 = i;
        if (z) {
            ((qu2) menu).x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.O(this, this.w0);
        if (this.m0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        x();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.r0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i5 = measuredWidth + measuredWidth2;
        int measuredHeight = this.r0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        int i6 = measuredHeight + measuredHeight2;
        View view2 = this.r0;
        WeakHashMap weakHashMap = j65.a;
        if (getLayoutDirection() == 1) {
            view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
        } else {
            view2.layout(measuredWidth2, measuredHeight2, i5, i6);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.r0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j74)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j74 j74Var = (j74) parcelable;
        super.onRestoreInstanceState(j74Var.n);
        setText(j74Var.p);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        j74 j74Var = new j74(super.onSaveInstanceState());
        CharSequence text = getText();
        j74Var.p = text == null ? null : text.toString();
        return j74Var;
    }

    public void setCenterView(View view) {
        View view2 = this.r0;
        if (view2 != null) {
            removeView(view2);
            this.r0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.v0 = z;
        x();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        fi2 fi2Var = this.w0;
        if (fi2Var != null) {
            fi2Var.l(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.k0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iT;
        if (this.p0 && drawable != null) {
            Integer num = this.s0;
            if (num != null) {
                iT = num.intValue();
            } else {
                iT = g12.t(this, drawable == this.o0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(iT);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.q0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.n0.getClass();
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.w0.q(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.w0.r(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.k0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void x() {
        if (getLayoutParams() instanceof ze) {
            ze zeVar = (ze) getLayoutParams();
            if (this.v0) {
                if (zeVar.a == 0) {
                    zeVar.a = 53;
                }
            } else if (zeVar.a == 53) {
                zeVar.a = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean t;

        public ScrollingViewBehavior() {
            this.t = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.de0
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.t && (view2 instanceof AppBarLayout)) {
                this.t = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.t = false;
        }
    }

    public void setHint(int i) {
        this.k0.setHint(i);
    }

    public void setText(int i) {
        this.k0.setText(i);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context) {
        this(context, null);
    }
}
