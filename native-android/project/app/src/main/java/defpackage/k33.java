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
    public static final int[] T = null;
    public static final tv1 U = null;
    public static final j33 V = null;
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

    static {
        T = new int[]{R.attr.state_checked};
        U = new tv1();
        V = new j33();
    }

    public k33(Context r7) {
        super(r7);
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
        int r1 = 1;
        LayoutInflater.from(r7).inflate(getItemLayoutResId(), this, true);
        this.y = (FrameLayout) findViewById(app.homemusic.R.id.navigation_bar_item_icon_container);
        this.z = findViewById(app.homemusic.R.id.navigation_bar_item_active_indicator_view);
        ImageView r8 = (ImageView) findViewById(app.homemusic.R.id.navigation_bar_item_icon_view);
        this.A = r8;
        ViewGroup r0 = (ViewGroup) findViewById(app.homemusic.R.id.navigation_bar_item_labels_group);
        this.B = r0;
        TextView r2 = (TextView) findViewById(app.homemusic.R.id.navigation_bar_item_small_label_view);
        this.C = r2;
        TextView r3 = (TextView) findViewById(app.homemusic.R.id.navigation_bar_item_large_label_view);
        this.D = r3;
        setBackgroundResource(getItemBackgroundResId());
        this.q = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.r = r0.getPaddingBottom();
        this.s = getResources().getDimensionPixelSize(app.homemusic.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap r4 = j65.a;
        r2.setImportantForAccessibility(2);
        r3.setImportantForAccessibility(2);
        setFocusable(true);
        a(r2.getTextSize(), r3.getTextSize());
        if (r8 == null) goto L6;
        r8.addOnLayoutChangeListener(new ot(r1, (pt) this));
        return;
    }

    public static void f(TextView r4, int r5) {
        r4.setTextAppearance(r5);
        Context r0 = r4.getContext();
        if (r5 == 0) goto L7;
        TypedArray r6 = r0.obtainStyledAttributes(r5, ht3.V);
        TypedValue r2 = new TypedValue();
        boolean r3 = r6.getValue(0, r2);
        r6.recycle();
        if (r3 == false) goto L7;
        int r7 = r2.getComplexUnit();
        int r8 = r2.data;
        if (r7 != 2) goto L11;
        int r9 = Math.round(TypedValue.complexToFloat(r8) * r0.getResources().getDisplayMetrics().density);
    L12:
        if (r9 == 0) goto L15;
        r4.setTextSize(0, r9);
        return;
    L15:
        return;
    L11:
        r9 = TypedValue.complexToDimensionPixelSize(r8, r0.getResources().getDisplayMetrics());
    L7:
        r9 = 0;
        goto L12
    }

    public static void g(View r0, float r1, float r2, int r3) {
        r0.setScaleX(r1);
        r0.setScaleY(r2);
        r0.setVisibility(r3);
    }

    private View getIconOrContainer() {
        FrameLayout r0 = this.y;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.A;
    }

    private int getItemVisiblePosition() {
        ViewGroup r0 = (ViewGroup) getParent();
        int r5 = r0.indexOfChild(this);
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r5) goto L10;
        View r3 = r0.getChildAt(r1);
        if ((r3 instanceof k33) == false) goto L9;
        if (r3.getVisibility() != 0) goto L9;
        r2 = r2 + 1;
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return r2;
    }

    private int getSuggestedIconHeight() {
        int r0 = ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
        return getIconOrContainer().getMeasuredHeight() + r0;
    }

    private int getSuggestedIconWidth() {
        yo r0 = this.S;
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int r3 = Math.max(r1, r2.leftMargin);
        int r4 = this.A.getMeasuredWidth() + r3;
        return Math.max(r1, r2.rightMargin) + r4;
    L5:
        r1 = r0.getMinimumWidth() - this.S.r.b.J.intValue();
        goto L6
    }

    public static void h(View r1, int r2, int r3) {
        FrameLayout.LayoutParams r0 = (FrameLayout.LayoutParams) r1.getLayoutParams();
        r0.topMargin = r2;
        r0.bottomMargin = r2;
        r0.gravity = r3;
        r1.setLayoutParams(r0);
    }

    public static void j(View r3, int r4) {
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingRight(), r4);
    }

    public final void a(float r3, float r4) {
        this.t = r3 - r4;
        this.u = (r4 * 1.0f) / r3;
        this.v = (r3 * 1.0f) / r4;
    }

    public final void b() {
        tu2 r0 = this.G;
        if (r0 == null) goto L6;
        setChecked(r0.isChecked());
        return;
    }

    @Override // defpackage.hv2
    public final void c(tu2 r2) {
        this.G = r2;
        setCheckable(r2.isCheckable());
        setChecked(r2.isChecked());
        setEnabled(r2.isEnabled());
        setIcon(r2.getIcon());
        setTitle(r2.e);
        setId(r2.a);
        if (TextUtils.isEmpty(r2.q) == true) goto L6;
        setContentDescription(r2.q);
    L6:
        if (TextUtils.isEmpty(r2.r) == true) goto L8;
        CharSequence r0 = r2.r;
    L9:
        e35.S(this, r0);
        if (r2.isVisible() == false) goto L12;
        int r3 = 0;
    L13:
        setVisibility(r3);
        this.n = true;
        return;
    L12:
        r3 = 8;
        goto L13
    L8:
        r0 = r2.e;
        goto L9
    }

    public final void d() {
        Drawable r0 = this.p;
        ColorStateList r1 = this.o;
        FrameLayout r2 = this.y;
        RippleDrawable r4 = null;
        boolean r5 = true;
        if (r1 == null) goto L13;
        Drawable r3 = getActiveIndicatorDrawable();
        if (this.N == true) goto L7;
    L11:
        if (r0 != null) goto L13;
        r0 = new RippleDrawable(l24.a(this.o), null, null);
        goto L13
    L7:
        if (getActiveIndicatorDrawable() == null) goto L11;
        if (r2 == null) goto L11;
        if (r3 == null) goto L11;
        r4 = new RippleDrawable(l24.c(this.o), null, r3);
        r5 = false;
    L13:
        if (r2 == null) goto L15;
        r2.setPadding(0, 0, 0, 0);
        r2.setForeground(r4);
    L15:
        WeakHashMap r6 = j65.a;
        setBackground(r0);
        if (Build.VERSION.SDK_INT < 26) goto L19;
        gm0.o(this, r5);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent r3) {
        FrameLayout r0 = this.y;
        if (r0 == null) goto L8;
        if (this.N == false) goto L8;
        r0.dispatchTouchEvent(r3);
    L8:
        return super.dispatchTouchEvent(r3);
    }

    public final void e(float r5, float r6) {
        View r0 = this.z;
        if (r0 == null) goto L12;
        tv1 r1 = this.L;
        r1.getClass();
        r0.setScaleX(yd.a(0.4f, 1.0f, r5));
        r0.setScaleY(r1.q(r5, r6));
        if (r6 != 0.0f) goto L7;
        float r2 = 0.8f;
    L8:
        if (r6 != 0.0f) goto L10;
        float r7 = 1.0f;
    L11:
        r0.setAlpha(yd.b(0.0f, 1.0f, r2, r7, r5));
        goto L12
    L10:
        r7 = 0.2f;
        goto L11
    L7:
        r2 = 0.0f;
    L12:
        this.M = r5;
    }

    public Drawable getActiveIndicatorDrawable() {
        View r0 = this.z;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getBackground();
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
        ViewGroup r0 = this.B;
        FrameLayout.LayoutParams r1 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        int r2 = getSuggestedIconHeight();
        if (r0.getVisibility() != 0) goto L5;
        int r4 = this.s;
    L6:
        int r3 = (r2 + r4) + r1.topMargin;
        return (r0.getMeasuredHeight() + r3) + r1.bottomMargin;
    L5:
        r4 = 0;
        goto L6
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup r0 = this.B;
        FrameLayout.LayoutParams r1 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        int r2 = r1.leftMargin;
        int r3 = (r0.getMeasuredWidth() + r2) + r1.rightMargin;
        return Math.max(getSuggestedIconWidth(), r3);
    }

    public final void i(int r5) {
        View r0 = this.z;
        if (r0 == null) goto L14;
        if (r5 <= 0) goto L15;
        int r6 = Math.min(this.O, r5 - (this.R * 2));
        FrameLayout.LayoutParams r1 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        if (this.Q == true) goto L9;
    L11:
        int r4 = this.P;
    L12:
        r1.height = r4;
        r1.width = r6;
        r0.setLayoutParams(r1);
        return;
    L9:
        if (this.w != 2) goto L11;
        r4 = r6;
        goto L12
    L15:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r3 = super.onCreateDrawableState(r2 + 1);
        tu2 r0 = this.G;
        if (r0 != null) goto L5;
    L9:
        return r3;
    L5:
        if (r0.isCheckable() == false) goto L9;
        if (this.G.isChecked() == false) goto L9;
        View.mergeDrawableStates(r3, T);
        goto L9
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r8) {
        super.onInitializeAccessibilityNodeInfo(r8);
        yo r0 = this.S;
        if (r0 != null) goto L5;
    L10:
        r8.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) u3.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected() == false) goto L13;
        r8.setClickable(false);
        r8.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
    L13:
        r8.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(app.homemusic.R.string.item_view_role_description));
        return;
    L5:
        if (r0.isVisible() == false) goto L10;
        tu2 r1 = this.G;
        CharSequence r2 = r1.e;
        if (TextUtils.isEmpty(r1.q) == true) goto L9;
        r2 = this.G.q;
    L9:
        r8.setContentDescription(r2 + ", " + this.S.c());
        goto L10
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        post(new rq(r1, 4, this));
    }

    public void setActiveIndicatorDrawable(Drawable r2) {
        View r0 = this.z;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setBackgroundDrawable(r2);
        d();
    }

    public void setActiveIndicatorEnabled(boolean r2) {
        this.N = r2;
        d();
        View r0 = this.z;
        if (r0 == null) goto L9;
        if (r2 == false) goto L6;
        int r3 = 0;
    L7:
        r0.setVisibility(r3);
        requestLayout();
        return;
    L6:
        r3 = 8;
        goto L7
    }

    public void setActiveIndicatorHeight(int r1) {
        this.P = r1;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int r2) {
        if (this.s == r2) goto L6;
        this.s = r2;
        b();
        return;
    }

    public void setActiveIndicatorMarginHorizontal(int r1) {
        this.R = r1;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean r1) {
        this.Q = r1;
    }

    public void setActiveIndicatorWidth(int r1) {
        this.O = r1;
        i(getWidth());
    }

    public void setBadge(yo r5) {
        yo r0 = this.S;
        if (r0 == r5) goto L29;
        ImageView r2 = this.A;
        if (r0 == null) goto L18;
        if (r2 == null) goto L18;
        Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
        if (this.S == null) goto L18;
        setClipChildren(true);
        setClipToPadding(true);
        yo r1 = this.S;
        if (r1 != null) goto L14;
    L17:
        this.S = null;
        goto L18
    L14:
        if (r1.d() == null) goto L16;
        r1.d().setForeground(null);
        goto L17
    L16:
        r2.getOverlay().remove(r1);
    L18:
        this.S = r5;
        if (r2 == null) goto L27;
        if (r5 == null) goto L28;
        setClipChildren(false);
        setClipToPadding(false);
        yo r4 = this.S;
        Rect r6 = new Rect();
        r2.getDrawingRect(r6);
        r4.setBounds(r6);
        r4.i(r2, null);
        if (r4.d() == null) goto L25;
        r4.d().setForeground(r4);
        return;
    L25:
        r2.getOverlay().add(r4);
        return;
    L28:
        return;
    L27:
        return;
    }

    public void setCheckable(boolean r1) {
        refreshDrawableState();
    }

    public void setChecked(boolean r13) {
        TextView r0 = this.D;
        r0.setPivotX(r0.getWidth() / 2);
        r0.setPivotY(r0.getBaseline());
        TextView r1 = this.C;
        r1.setPivotX(r1.getWidth() / 2);
        r1.setPivotY(r1.getBaseline());
        if (r13 == false) goto L5;
        float r4 = 1.0f;
    L7:
        if (this.N == true) goto L9;
    L17:
        e(r4, r4);
    L18:
        int r5 = this.w;
        ViewGroup r10 = this.B;
        if (r5 == (-1)) goto L34;
        if (r5 == 0) goto L29;
        if (r5 == 1) goto L25;
        if (r5 != 2) goto L43;
        h(getIconOrContainer(), this.q, 17);
        r0.setVisibility(8);
        r1.setVisibility(8);
    L43:
        refreshDrawableState();
        setSelected(r13);
        return;
    L25:
        j(r10, this.r);
        if (r13 == false) goto L28;
        h(getIconOrContainer(), (int) (this.q + this.t), 49);
        g(r0, 1.0f, 1.0f, 0);
        float r2 = this.u;
        g(r1, r2, r2, 4);
        goto L43
    L28:
        h(getIconOrContainer(), this.q, 49);
        float r3 = this.v;
        g(r0, r3, r3, 4);
        g(r1, 1.0f, 1.0f, 0);
        goto L43
    L29:
        if (r13 == false) goto L31;
        h(getIconOrContainer(), this.q, 49);
        j(r10, this.r);
        r0.setVisibility(0);
    L32:
        r1.setVisibility(4);
        goto L43
    L31:
        h(getIconOrContainer(), this.q, 17);
        j(r10, 0);
        r0.setVisibility(4);
        goto L32
    L34:
        if (this.x == false) goto L39;
        if (r13 == false) goto L37;
        h(getIconOrContainer(), this.q, 49);
        j(r10, this.r);
        r0.setVisibility(0);
    L38:
        r1.setVisibility(4);
        goto L43
    L37:
        h(getIconOrContainer(), this.q, 17);
        j(r10, 0);
        r0.setVisibility(4);
        goto L38
    L39:
        j(r10, this.r);
        if (r13 == false) goto L42;
        h(getIconOrContainer(), (int) (this.q + this.t), 49);
        g(r0, 1.0f, 1.0f, 0);
        float r6 = this.u;
        g(r1, r6, r6, 4);
        goto L43
    L42:
        h(getIconOrContainer(), this.q, 49);
        float r7 = this.v;
        g(r0, r7, r7, 4);
        g(r1, 1.0f, 1.0f, 0);
        goto L43
    L9:
        if (this.n == false) goto L17;
        WeakHashMap r8 = j65.a;
        if (isAttachedToWindow() == false) goto L17;
        ValueAnimator r9 = this.K;
        if (r9 == null) goto L16;
        r9.cancel();
        this.K = null;
    L16:
        ValueAnimator r11 = ValueAnimator.ofFloat(new float[]{this.M, r4});
        this.K = r11;
        r11.addUpdateListener(new i33(this, r4));
        this.K.setInterpolator(g12.O(getContext(), app.homemusic.R.attr.motionEasingEmphasizedInterpolator, yd.b));
        this.K.setDuration(g12.N(getContext(), app.homemusic.R.attr.motionDurationLong2, getResources().getInteger(app.homemusic.R.integer.material_motion_duration_long_1)));
        this.K.start();
        goto L18
    L5:
        r4 = 0.0f;
        goto L7
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
        super.setEnabled(r2);
        this.C.setEnabled(r2);
        this.D.setEnabled(r2);
        this.A.setEnabled(r2);
        if (r2 == false) goto L6;
        PointerIcon r3 = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap r0 = j65.a;
        c65.a(this, r3);
        return;
    L6:
        WeakHashMap r4 = j65.a;
        c65.a(this, null);
    }

    public void setIcon(Drawable r2) {
        if (r2 != this.I) goto L5;
        return;
    L5:
        this.I = r2;
        if (r2 == null) goto L14;
        Drawable.ConstantState r0 = r2.getConstantState();
        if (r0 == null) goto L11;
        r2 = r0.newDrawable();
    L11:
        r2 = r2.mutate();
        this.J = r2;
        ColorStateList r1 = this.H;
        if (r1 == null) goto L14;
        r2.setTintList(r1);
    L14:
        this.A.setImageDrawable(r2);
    }

    public void setIconSize(int r2) {
        ImageView r1 = this.A;
        FrameLayout.LayoutParams r0 = (FrameLayout.LayoutParams) r1.getLayoutParams();
        r0.width = r2;
        r0.height = r2;
        r1.setLayoutParams(r0);
    }

    public void setIconTintList(ColorStateList r2) {
        this.H = r2;
        if (this.G == null) goto L8;
        Drawable r0 = this.J;
        if (r0 == null) goto L9;
        r0.setTintList(r2);
        this.J.invalidateSelf();
        return;
    L9:
        return;
    }

    public void setItemBackground(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        this.p = r2;
        d();
        return;
    L4:
        if (r2.getConstantState() == null) goto L6;
        r2 = r2.getConstantState().newDrawable().mutate();
        goto L6
    }

    public void setItemPaddingBottom(int r2) {
        if (this.r == r2) goto L6;
        this.r = r2;
        b();
        return;
    }

    public void setItemPaddingTop(int r2) {
        if (this.q == r2) goto L6;
        this.q = r2;
        b();
        return;
    }

    public void setItemPosition(int r1) {
        this.E = r1;
    }

    public void setItemRippleColor(ColorStateList r1) {
        this.o = r1;
        d();
    }

    public void setLabelVisibilityMode(int r2) {
        if (this.w == r2) goto L12;
        this.w = r2;
        if (this.Q == true) goto L7;
    L9:
        this.L = U;
    L10:
        i(getWidth());
        b();
        return;
    L7:
        if (r2 != 2) goto L9;
        this.L = V;
        goto L10
    }

    public void setShifting(boolean r2) {
        if (this.x == r2) goto L6;
        this.x = r2;
        b();
        return;
    }

    public void setTextAppearanceActive(int r2) {
        this.F = r2;
        TextView r0 = this.D;
        f(r0, r2);
        a(this.C.getTextSize(), r0.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean r2) {
        setTextAppearanceActive(this.F);
        TextView r1 = this.D;
        r1.setTypeface(r1.getTypeface(), r2 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int r2) {
        TextView r0 = this.C;
        f(r0, r2);
        a(r0.getTextSize(), this.D.getTextSize());
    }

    public void setTextColor(ColorStateList r2) {
        if (r2 == null) goto L5;
        this.C.setTextColor(r2);
        this.D.setTextColor(r2);
        return;
    }

    public void setTitle(CharSequence r2) {
        this.C.setText(r2);
        this.D.setText(r2);
        tu2 r0 = this.G;
        if (r0 != null) goto L5;
    L6:
        setContentDescription(r2);
    L7:
        tu2 r1 = this.G;
        if (r1 != null) goto L10;
    L13:
        e35.S(this, r2);
        return;
    L10:
        if (TextUtils.isEmpty(r1.r) == true) goto L13;
        r2 = this.G.r;
        goto L13
    L5:
        if (TextUtils.isEmpty(r0.q) == false) goto L7;
        goto L6
    }

    public void setItemBackground(int r2) {
        if (r2 != 0) goto L4;
        Drawable r3 = null;
    L5:
        setItemBackground(r3);
        return;
    L4:
        r3 = getContext().getDrawable(r2);
        goto L5
    }
}
