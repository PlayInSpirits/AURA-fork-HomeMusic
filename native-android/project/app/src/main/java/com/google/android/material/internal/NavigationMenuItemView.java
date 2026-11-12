package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.ar;
import defpackage.e35;
import defpackage.g14;
import defpackage.hv2;
import defpackage.j65;
import defpackage.nb1;
import defpackage.tu2;
import defpackage.ya2;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends nb1 implements hv2 {
    public static final int[] T = {R.attr.state_checked};
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final CheckedTextView M;
    public FrameLayout N;
    public tu2 O;
    public ColorStateList P;
    public boolean Q;
    public Drawable R;
    public final ar S;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = true;
        ar arVar = new ar(6, this);
        this.S = arVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(app.homemusic.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(app.homemusic.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(app.homemusic.R.id.design_menu_item_text);
        this.M = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        j65.o(checkedTextView, arVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.N == null) {
                this.N = (FrameLayout) ((ViewStub) findViewById(app.homemusic.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.N.removeAllViews();
            this.N.addView(view);
        }
    }

    @Override // defpackage.hv2
    public final void c(tu2 tu2Var) {
        StateListDrawable stateListDrawable;
        this.O = tu2Var;
        int i = tu2Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(tu2Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(app.homemusic.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(T, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = j65.a;
            setBackground(stateListDrawable);
        }
        setCheckable(tu2Var.isCheckable());
        setChecked(tu2Var.isChecked());
        setEnabled(tu2Var.isEnabled());
        setTitle(tu2Var.e);
        setIcon(tu2Var.getIcon());
        setActionView(tu2Var.getActionView());
        setContentDescription(tu2Var.q);
        e35.S(this, tu2Var.r);
        tu2 tu2Var2 = this.O;
        CharSequence charSequence = tu2Var2.e;
        CheckedTextView checkedTextView = this.M;
        if (charSequence == null && tu2Var2.getIcon() == null && this.O.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.N;
            if (frameLayout != null) {
                ya2 ya2Var = (ya2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) ya2Var).width = -1;
                this.N.setLayoutParams(ya2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.N;
        if (frameLayout2 != null) {
            ya2 ya2Var2 = (ya2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) ya2Var2).width = -2;
            this.N.setLayoutParams(ya2Var2);
        }
    }

    @Override // defpackage.hv2
    public tu2 getItemData() {
        return this.O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        tu2 tu2Var = this.O;
        if (tu2Var != null && tu2Var.isCheckable() && this.O.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.K != z) {
            this.K = z;
            this.S.h(this.M, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.M;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.L) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.Q) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.P);
            }
            int i = this.I;
            drawable.setBounds(0, 0, i, i);
        } else if (this.J) {
            if (this.R == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = g14.a;
                Drawable drawable2 = resources.getDrawable(app.homemusic.R.drawable.navigation_empty_icon, theme);
                this.R = drawable2;
                if (drawable2 != null) {
                    int i2 = this.I;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.R;
        }
        this.M.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.M.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.I = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.P = colorStateList;
        this.Q = colorStateList != null;
        tu2 tu2Var = this.O;
        if (tu2Var != null) {
            setIcon(tu2Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.M.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.J = z;
    }

    public void setTextAppearance(int i) {
        this.M.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.M.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.M.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
