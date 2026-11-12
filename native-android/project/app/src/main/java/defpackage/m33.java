package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m33 extends ViewGroup implements iv2 {
    public static final int[] S = null;
    public static final int[] T = null;
    public int A;
    public boolean B;
    public Drawable C;
    public ColorStateList D;
    public int E;
    public final SparseArray F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public bc4 N;
    public boolean O;
    public ColorStateList P;
    public o33 Q;
    public qu2 R;
    public final rn n;
    public final i4 o;
    public final ko3 p;
    public final SparseArray q;
    public int r;
    public k33[] s;
    public int t;
    public int u;
    public ColorStateList v;
    public int w;
    public ColorStateList x;
    public final ColorStateList y;
    public int z;

    static {
        S = new int[]{R.attr.state_checked};
        T = new int[]{-16842910};
    }

    public m33(Context r4) {
        super(r4);
        this.p = new ko3(5);
        this.q = new SparseArray(5);
        this.t = 0;
        this.u = 0;
        this.F = new SparseArray(5);
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.O = false;
        this.y = c();
        if (isInEditMode() == false) goto L5;
        this.n = null;
    L6:
        this.o = new i4(11, (qt) this);
        WeakHashMap r5 = j65.a;
        setImportantForAccessibility(1);
        return;
    L5:
        rn r0 = new rn();
        this.n = r0;
        r0.I(0);
        r0.G(g12.N(getContext(), app.homemusic.R.attr.motionDurationMedium4, getResources().getInteger(app.homemusic.R.integer.material_motion_duration_long_1)));
        r0.H(g12.O(getContext(), app.homemusic.R.attr.motionEasingStandard, yd.b));
        r0.F(new us4());
        goto L6
    }

    private k33 getNewItem() {
        k33 r0 = (k33) this.p.b();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new pt(getContext());
    }

    private void setBadgeIfNeeded(k33 r3) {
        int r0 = r3.getId();
        if (r0 == (-1)) goto L8;
        yo r2 = (yo) this.F.get(r0);
        if (r2 == null) goto L9;
        r3.setBadge(r2);
        return;
    L9:
        return;
    }

    public final void a() {
        removeAllViews();
        k33[] r0 = this.s;
        if (r0 == null) goto L22;
        int r4 = r0.length;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L22;
        k33 r6 = r0[r5];
        if (r6 == null) goto L20;
        this.p.a(r6);
        ImageView r7 = r6.A;
        if (r6.S == null) goto L19;
        if (r7 == null) goto L18;
        r6.setClipChildren(true);
        r6.setClipToPadding(true);
        yo r8 = r6.S;
        if (r8 == null) goto L18;
        if (r8.d() == null) goto L17;
        r8.d().setForeground(null);
        goto L18
    L17:
        r7.getOverlay().remove(r8);
    L18:
        r6.S = null;
    L19:
        r6.G = null;
        r6.M = 0.0f;
        r6.n = false;
    L20:
        r5 = r5 + 1;
    L22:
        if (this.R.f.size() != 0) goto L25;
        this.t = 0;
        this.u = 0;
        this.s = null;
        return;
    L25:
        HashSet r1 = new HashSet();
        int r2 = 0;
    L27:
        if (r2 >= this.R.f.size()) goto L29;
        r1.add(Integer.valueOf(this.R.getItem(r2).getItemId()));
        r2 = r2 + 1;
        goto L27
    L29:
        int r3 = 0;
    L30:
        SparseArray r9 = this.F;
        if (r3 >= r9.size()) goto L36;
        int r10 = r9.keyAt(r3);
        if (r1.contains(Integer.valueOf(r10)) == true) goto L35;
        r9.delete(r10);
    L35:
        r3 = r3 + 1;
        goto L30
    L36:
        this.s = new k33[this.R.f.size()];
        int r11 = this.r;
        int r12 = this.R.l().size();
        if (r11 == (-1)) goto L39;
        if (r11 != 0) goto L43;
    L42:
        boolean r13 = true;
    L44:
        int r14 = 0;
    L46:
        if (r14 >= this.R.f.size()) goto L65;
        this.Q.o = true;
        this.R.getItem(r14).setCheckable(true);
        this.Q.o = false;
        k33 r15 = getNewItem();
        this.s[r14] = r15;
        r15.setIconTintList(this.v);
        r15.setIconSize(this.w);
        r15.setTextColor(this.y);
        r15.setTextAppearanceInactive(this.z);
        r15.setTextAppearanceActive(this.A);
        r15.setTextAppearanceActiveBoldEnabled(this.B);
        r15.setTextColor(this.x);
        int r16 = this.G;
        if (r16 == (-1)) goto L50;
        r15.setItemPaddingTop(r16);
    L50:
        int r17 = this.H;
        if (r17 == (-1)) goto L53;
        r15.setItemPaddingBottom(r17);
    L53:
        int r18 = this.I;
        if (r18 == (-1)) goto L56;
        r15.setActiveIndicatorLabelPadding(r18);
    L56:
        r15.setActiveIndicatorWidth(this.K);
        r15.setActiveIndicatorHeight(this.L);
        r15.setActiveIndicatorMarginHorizontal(this.M);
        r15.setActiveIndicatorDrawable(d());
        r15.setActiveIndicatorResizeable(this.O);
        r15.setActiveIndicatorEnabled(this.J);
        Drawable r19 = this.C;
        if (r19 == null) goto L59;
        r15.setItemBackground(r19);
    L60:
        r15.setItemRippleColor(this.D);
        r15.setShifting(r13);
        r15.setLabelVisibilityMode(this.r);
        tu2 r20 = (tu2) this.R.getItem(r14);
        r15.c(r20);
        r15.setItemPosition(r14);
        int r21 = r20.a;
        r15.setOnTouchListener((View.OnTouchListener) this.q.get(r21));
        r15.setOnClickListener(this.o);
        int r22 = this.t;
        if (r22 == 0) goto L64;
        if (r21 != r22) goto L64;
        this.u = r14;
    L64:
        setBadgeIfNeeded(r15);
        addView(r15);
        r14 = r14 + 1;
        goto L46
    L59:
        r15.setItemBackground(this.E);
        goto L60
    L65:
        int r23 = Math.min(this.R.f.size() - 1, this.u);
        this.u = r23;
        this.R.getItem(r23).setChecked(true);
        return;
    L43:
        r13 = false;
        goto L44
    L39:
        if (r12 <= 3) goto L43;
        goto L43
    }

    @Override // defpackage.iv2
    public final void b(qu2 r1) {
        this.R = r1;
    }

    public final ColorStateList c() {
        TypedValue r0 = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, r0, true) == false) goto L11;
        ColorStateList r1 = ud3.n(getContext(), r0.resourceId);
        if (getContext().getTheme().resolveAttribute(app.homemusic.R.attr.colorPrimary, r0, true) == true) goto L9;
        return null;
    L9:
        int r6 = r0.data;
        int r2 = r1.getDefaultColor();
        int[] r3 = S;
        int[] r4 = ViewGroup.EMPTY_STATE_SET;
        int[] r5 = T;
        return new ColorStateList(new int[][]{r5, r3, r4}, new int[]{r1.getColorForState(r5, r2), r6, r2});
    L11:
        return null;
    }

    public final fi2 d() {
        if (this.N != null) goto L5;
        return null;
    L5:
        if (this.P == null) goto L10;
        fi2 r0 = new fi2(this.N);
        r0.m(this.P);
        return r0;
    L10:
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.I;
    }

    public SparseArray<yo> getBadgeDrawables() {
        return this.F;
    }

    public ColorStateList getIconTintList() {
        return this.v;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.P;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.J;
    }

    public int getItemActiveIndicatorHeight() {
        return this.L;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.M;
    }

    public bc4 getItemActiveIndicatorShapeAppearance() {
        return this.N;
    }

    public int getItemActiveIndicatorWidth() {
        return this.K;
    }

    public Drawable getItemBackground() {
        k33[] r0 = this.s;
        if (r0 == null) goto L9;
        if (r0.length <= 0) goto L9;
        return r0[0].getBackground();
    L9:
        return this.C;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.E;
    }

    public int getItemIconSize() {
        return this.w;
    }

    public int getItemPaddingBottom() {
        return this.H;
    }

    public int getItemPaddingTop() {
        return this.G;
    }

    public ColorStateList getItemRippleColor() {
        return this.D;
    }

    public int getItemTextAppearanceActive() {
        return this.A;
    }

    public int getItemTextAppearanceInactive() {
        return this.z;
    }

    public ColorStateList getItemTextColor() {
        return this.x;
    }

    public int getLabelVisibilityMode() {
        return this.r;
    }

    public qu2 getMenu() {
        return this.R;
    }

    public int getSelectedItemId() {
        return this.t;
    }

    public int getSelectedItemPosition() {
        return this.u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t3.a(1, this.R.l().size(), 1).a);
    }

    public void setActiveIndicatorLabelPadding(int r4) {
        this.I = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorLabelPadding(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setIconTintList(ColorStateList r4) {
        this.v = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setIconTintList(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorColor(ColorStateList r5) {
        this.P = r5;
        k33[] r6 = this.s;
        if (r6 == null) goto L7;
        int r0 = r6.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r6[r1].setActiveIndicatorDrawable(d());
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorEnabled(boolean r4) {
        this.J = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorEnabled(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorHeight(int r4) {
        this.L = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorHeight(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorMarginHorizontal(int r4) {
        this.M = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorMarginHorizontal(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorResizeable(boolean r4) {
        this.O = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorResizeable(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorShapeAppearance(bc4 r5) {
        this.N = r5;
        k33[] r6 = this.s;
        if (r6 == null) goto L7;
        int r0 = r6.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r6[r1].setActiveIndicatorDrawable(d());
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemActiveIndicatorWidth(int r4) {
        this.K = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setActiveIndicatorWidth(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemBackground(Drawable r4) {
        this.C = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setItemBackground(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemBackgroundRes(int r4) {
        this.E = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setItemBackground(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemIconSize(int r4) {
        this.w = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setIconSize(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemPaddingBottom(int r4) {
        this.H = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setItemPaddingBottom(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemPaddingTop(int r4) {
        this.G = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setItemPaddingTop(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemRippleColor(ColorStateList r4) {
        this.D = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setItemRippleColor(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemTextAppearanceActive(int r6) {
        this.A = r6;
        k33[] r0 = this.s;
        if (r0 == null) goto L10;
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L14;
        k33 r3 = r0[r2];
        r3.setTextAppearanceActive(r6);
        ColorStateList r4 = this.x;
        if (r4 == null) goto L9;
        r3.setTextColor(r4);
    L9:
        r2 = r2 + 1;
        goto L5
    L14:
        return;
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r4) {
        this.B = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setTextAppearanceActiveBoldEnabled(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setItemTextAppearanceInactive(int r6) {
        this.z = r6;
        k33[] r0 = this.s;
        if (r0 == null) goto L10;
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L14;
        k33 r3 = r0[r2];
        r3.setTextAppearanceInactive(r6);
        ColorStateList r4 = this.x;
        if (r4 == null) goto L9;
        r3.setTextColor(r4);
    L9:
        r2 = r2 + 1;
        goto L5
    L14:
        return;
    }

    public void setItemTextColor(ColorStateList r4) {
        this.x = r4;
        k33[] r3 = this.s;
        if (r3 == null) goto L7;
        int r0 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3[r1].setTextColor(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void setLabelVisibilityMode(int r1) {
        this.r = r1;
    }

    public void setPresenter(o33 r1) {
        this.Q = r1;
    }
}
