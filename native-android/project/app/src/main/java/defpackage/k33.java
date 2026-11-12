package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k33 extends FrameLayout implements hv2 {
    public static final int[] T = {R.attr.state_checked};
    public static final tv1 U = new tv1();
    public static final j33 V = new j33();
    public final ImageView A;
    public final ViewGroup B;
    public final TextView C;
    public final TextView D;
    public int E;
    public int F;
    public tu2 G;
    public ColorStateList H;
    public Drawable I;
    public Drawable J;
    public ValueAnimator K;
    public tv1 L;
    public float M;
    public boolean N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public yo S;
    public boolean n;
    public ColorStateList o;
    public Drawable p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public float v;
    public int w;
    public boolean x;
    public final FrameLayout y;
    public final View z;

    public k33(Context context) {
        super(context);
        this.n = false;
        this.E = -1;
        this.F = 0;
        this.L = U;
        this.M = 0.0f;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = 0;
        int i = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.y = (FrameLayout) findViewById(app.homemusic.R.id.navigation_bar_item_icon_container);
        this.z = findViewById(app.homemusic.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(app.homemusic.R.id.navigation_bar_item_icon_view);
        this.A = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(app.homemusic.R.id.navigation_bar_item_labels_group);
        this.B = viewGroup;
        TextView textView = (TextView) findViewById(app.homemusic.R.id.navigation_bar_item_small_label_view);
        this.C = textView;
        TextView textView2 = (TextView) findViewById(app.homemusic.R.id.navigation_bar_item_large_label_view);
        this.D = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.q = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.r = viewGroup.getPaddingBottom();
        this.s = getResources().getDimensionPixelSize(app.homemusic.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = j65.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ot(i, (pt) this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static void f(TextView textView, int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ht3.V);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void g(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.y;
        return frameLayout != null ? frameLayout : this.A;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof k33) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        yo yoVar = this.S;
        int minimumWidth = yoVar == null ? 0 : yoVar.getMinimumWidth() - this.S.r.b.J.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.A.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void j(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f, float f2) {
        this.t = f - f2;
        this.u = (f2 * 1.0f) / f;
        this.v = (f * 1.0f) / f2;
    }

    public final void b() {
        tu2 tu2Var = this.G;
        if (tu2Var != null) {
            setChecked(tu2Var.isChecked());
        }
    }

    @Override // defpackage.hv2
    public final void c(tu2 tu2Var) {
        this.G = tu2Var;
        setCheckable(tu2Var.isCheckable());
        setChecked(tu2Var.isChecked());
        setEnabled(tu2Var.isEnabled());
        setIcon(tu2Var.getIcon());
        setTitle(tu2Var.e);
        setId(tu2Var.a);
        if (!TextUtils.isEmpty(tu2Var.q)) {
            setContentDescription(tu2Var.q);
        }
        e35.S(this, !TextUtils.isEmpty(tu2Var.r) ? tu2Var.r : tu2Var.e);
        setVisibility(tu2Var.isVisible() ? 0 : 8);
        this.n = true;
    }

    public final void d() {
        Drawable rippleDrawable = this.p;
        ColorStateList colorStateList = this.o;
        FrameLayout frameLayout = this.y;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.N && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(l24.c(this.o), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(l24.a(this.o), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = j65.a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.y;
        if (frameLayout != null && this.N) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f, float f2) {
        View view = this.z;
        if (view != null) {
            tv1 tv1Var = this.L;
            tv1Var.getClass();
            view.setScaleX(yd.a(0.4f, 1.0f, f));
            view.setScaleY(tv1Var.q(f, f2));
            view.setAlpha(yd.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.M = f;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.z;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public yo getBadge() {
        return this.S;
    }

    public int getItemBackgroundResId() {
        return app.homemusic.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.hv2
    public tu2 getItemData() {
        return this.G;
    }

    public int getItemDefaultMarginResId() {
        return app.homemusic.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.E;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.B;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.s : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.B;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        View view = this.z;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.O, i - (this.R * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.Q && this.w == 2) ? iMin : this.P;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        tu2 tu2Var = this.G;
        if (tu2Var != null && tu2Var.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        yo yoVar = this.S;
        if (yoVar != null && yoVar.isVisible()) {
            tu2 tu2Var = this.G;
            CharSequence charSequence = tu2Var.e;
            if (!TextUtils.isEmpty(tu2Var.q)) {
                charSequence = this.G.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.S.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) u3.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(app.homemusic.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new rq(i, 4, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.z;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.N = z;
        d();
        View view = this.z;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.P = i;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.s != i) {
            this.s = i;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.R = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.Q = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.O = i;
        i(getWidth());
    }

    public void setBadge(yo yoVar) {
        yo yoVar2 = this.S;
        if (yoVar2 == yoVar) {
            return;
        }
        ImageView imageView = this.A;
        if (yoVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.S != null) {
                setClipChildren(true);
                setClipToPadding(true);
                yo yoVar3 = this.S;
                if (yoVar3 != null) {
                    if (yoVar3.d() != null) {
                        yoVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(yoVar3);
                    }
                }
                this.S = null;
            }
        }
        this.S = yoVar;
        if (imageView == null || yoVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        yo yoVar4 = this.S;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        yoVar4.setBounds(rect);
        yoVar4.i(imageView, null);
        if (yoVar4.d() != null) {
            yoVar4.d().setForeground(yoVar4);
        } else {
            imageView.getOverlay().add(yoVar4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z) {
        TextView textView = this.D;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.C;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.N && this.n) {
            WeakHashMap weakHashMap = j65.a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.K = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.M, f);
                this.K = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new i33(this, f));
                this.K.setInterpolator(g12.O(getContext(), app.homemusic.R.attr.motionEasingEmphasizedInterpolator, yd.b));
                this.K.setDuration(g12.N(getContext(), app.homemusic.R.attr.motionDurationLong2, getResources().getInteger(app.homemusic.R.integer.material_motion_duration_long_1)));
                this.K.start();
            } else {
                e(f, f);
            }
        } else {
            e(f, f);
        }
        int i = this.w;
        ViewGroup viewGroup = this.B;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    h(getIconOrContainer(), this.q, 49);
                    j(viewGroup, this.r);
                    textView.setVisibility(0);
                } else {
                    h(getIconOrContainer(), this.q, 17);
                    j(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                j(viewGroup, this.r);
                if (z) {
                    h(getIconOrContainer(), (int) (this.q + this.t), 49);
                    g(textView, 1.0f, 1.0f, 0);
                    float f2 = this.u;
                    g(textView2, f2, f2, 4);
                } else {
                    h(getIconOrContainer(), this.q, 49);
                    float f3 = this.v;
                    g(textView, f3, f3, 4);
                    g(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                h(getIconOrContainer(), this.q, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.x) {
            if (z) {
                h(getIconOrContainer(), this.q, 49);
                j(viewGroup, this.r);
                textView.setVisibility(0);
            } else {
                h(getIconOrContainer(), this.q, 17);
                j(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            j(viewGroup, this.r);
            if (z) {
                h(getIconOrContainer(), (int) (this.q + this.t), 49);
                g(textView, 1.0f, 1.0f, 0);
                float f4 = this.u;
                g(textView2, f4, f4, 4);
            } else {
                h(getIconOrContainer(), this.q, 49);
                float f5 = this.v;
                g(textView, f5, f5, 4);
                g(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.C.setEnabled(z);
        this.D.setEnabled(z);
        this.A.setEnabled(z);
        if (!z) {
            WeakHashMap weakHashMap = j65.a;
            c65.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap2 = j65.a;
            c65.a(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.I) {
            return;
        }
        this.I = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.J = drawable;
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.A.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.A;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.H = colorStateList;
        if (this.G == null || (drawable = this.J) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.J.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.p = drawable;
        d();
    }

    public void setItemPaddingBottom(int i) {
        if (this.r != i) {
            this.r = i;
            b();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.q != i) {
            this.q = i;
            b();
        }
    }

    public void setItemPosition(int i) {
        this.E = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.o = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.w != i) {
            this.w = i;
            if (this.Q && i == 2) {
                this.L = V;
            } else {
                this.L = U;
            }
            i(getWidth());
            b();
        }
    }

    public void setShifting(boolean z) {
        if (this.x != z) {
            this.x = z;
            b();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.F = i;
        TextView textView = this.D;
        f(textView, i);
        a(this.C.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.F);
        TextView textView = this.D;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.C;
        f(textView, i);
        a(textView.getTextSize(), this.D.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.C.setTextColor(colorStateList);
            this.D.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
        this.D.setText(charSequence);
        tu2 tu2Var = this.G;
        if (tu2Var == null || TextUtils.isEmpty(tu2Var.q)) {
            setContentDescription(charSequence);
        }
        tu2 tu2Var2 = this.G;
        if (tu2Var2 != null && !TextUtils.isEmpty(tu2Var2.r)) {
            charSequence = this.G.r;
        }
        e35.S(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
