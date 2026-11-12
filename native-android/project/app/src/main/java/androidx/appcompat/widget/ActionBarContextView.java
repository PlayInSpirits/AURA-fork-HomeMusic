package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import defpackage.d5;
import defpackage.e85;
import defpackage.i;
import defpackage.i4;
import defpackage.iv2;
import defpackage.j65;
import defpackage.kf2;
import defpackage.qu2;
import defpackage.s75;
import defpackage.st3;
import defpackage.t4;
import defpackage.y4;
import defpackage.zz1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout A;
    public TextView B;
    public TextView C;
    public final int D;
    public final int E;
    public boolean F;
    public final int G;
    public final i n;
    public final Context o;
    public ActionMenuView p;
    public y4 q;
    public int r;
    public s75 s;
    public boolean t;
    public boolean u;
    public CharSequence v;
    public CharSequence w;
    public View x;
    public View y;
    public View z;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        i iVar = new i();
        iVar.c = this;
        iVar.b = false;
        this.n = iVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.o = context;
        } else {
            this.o = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : zz1.r(context, resourceId));
        this.D = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.r = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(d5 d5Var) {
        View view = this.x;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.G, (ViewGroup) this, false);
            this.x = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.x);
        }
        View viewFindViewById = this.x.findViewById(R.id.action_mode_close_button);
        this.y = viewFindViewById;
        viewFindViewById.setOnClickListener(new i4(i, d5Var));
        qu2 qu2VarC = d5Var.c();
        y4 y4Var = this.q;
        if (y4Var != null) {
            y4Var.f();
            t4 t4Var = y4Var.H;
            if (t4Var != null && t4Var.b()) {
                t4Var.i.dismiss();
            }
        }
        y4 y4Var2 = new y4(getContext());
        this.q = y4Var2;
        y4Var2.z = true;
        y4Var2.A = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        qu2VarC.b(this.q, this.o);
        y4 y4Var3 = this.q;
        iv2 iv2Var = y4Var3.u;
        if (iv2Var == null) {
            iv2 iv2Var2 = (iv2) y4Var3.q.inflate(y4Var3.s, (ViewGroup) this, false);
            y4Var3.u = iv2Var2;
            iv2Var2.b(y4Var3.p);
            y4Var3.c(true);
        }
        iv2 iv2Var3 = y4Var3.u;
        if (iv2Var != iv2Var3) {
            ((ActionMenuView) iv2Var3).setPresenter(y4Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) iv2Var3;
        this.p = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.p, layoutParams);
    }

    public final void d() {
        if (this.A == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A = linearLayout;
            this.B = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.C = (TextView) this.A.findViewById(R.id.action_bar_subtitle);
            int i = this.D;
            if (i != 0) {
                this.B.setTextAppearance(getContext(), i);
            }
            int i2 = this.E;
            if (i2 != 0) {
                this.C.setTextAppearance(getContext(), i2);
            }
        }
        this.B.setText(this.v);
        this.C.setText(this.w);
        boolean zIsEmpty = TextUtils.isEmpty(this.v);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.w);
        this.C.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.A.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.A.getParent() == null) {
            addView(this.A);
        }
    }

    public final void e() {
        removeAllViews();
        this.z = null;
        this.p = null;
        this.q = null;
        View view = this.y;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.s != null ? this.n.a : getVisibility();
    }

    public int getContentHeight() {
        return this.r;
    }

    public CharSequence getSubtitle() {
        return this.w;
    }

    public CharSequence getTitle() {
        return this.v;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            s75 s75Var = this.s;
            if (s75Var != null) {
                s75Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final s75 i(int i, long j) {
        s75 s75Var = this.s;
        if (s75Var != null) {
            s75Var.b();
        }
        i iVar = this.n;
        if (i != 0) {
            s75 s75VarA = j65.a(this);
            s75VarA.a(0.0f);
            s75VarA.c(j);
            ((ActionBarContextView) iVar.c).s = s75VarA;
            iVar.a = i;
            s75VarA.d(iVar);
            return s75VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        s75 s75VarA2 = j65.a(this);
        s75VarA2.a(1.0f);
        s75VarA2.c(j);
        ((ActionBarContextView) iVar.c).s = s75VarA2;
        iVar.a = i;
        s75VarA2.d(iVar);
        return s75VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, st3.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        y4 y4Var = this.q;
        if (y4Var != null) {
            Configuration configuration2 = y4Var.o.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            y4Var.D = i;
            qu2 qu2Var = y4Var.p;
            if (qu2Var != null) {
                qu2Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y4 y4Var = this.q;
        if (y4Var != null) {
            y4Var.f();
            t4 t4Var = this.q.H;
            if (t4Var == null || !t4Var.b()) {
                return;
            }
            t4Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.u = false;
        }
        if (!this.u) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.u = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.u = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = e85.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.x;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.x, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.A;
        if (linearLayout != null && this.z == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.A, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.z;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.p;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            kf2.o(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            kf2.o(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.r;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.x;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.p;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.p, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.A;
        if (linearLayout != null && this.z == null) {
            if (this.F) {
                this.A.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.A.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.A.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.z;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.z.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.r > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = false;
        }
        if (!this.t) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.t = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.t = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.r = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.z;
        if (view2 != null) {
            removeView(view2);
        }
        this.z = view;
        if (view != null && (linearLayout = this.A) != null) {
            removeView(linearLayout);
            this.A = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.w = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.v = charSequence;
        d();
        j65.p(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.F) {
            requestLayout();
        }
        this.F = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
