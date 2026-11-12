package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import app.homemusic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s33 extends FrameLayout {
    public final l33 n;
    public final qt o;
    public final o33 p;
    public no4 q;
    public q33 r;

    public s33(Context r12, AttributeSet r13, int r14, int r15) {
        super(su3.H(r12, r13, r14, r15), r13, r14);
        o33 r16 = new o33();
        r16.o = false;
        this.p = r16;
        Context r1 = getContext();
        jv3 r17 = uc5.E(r1, r13, ht3.J, r14, r15, new int[]{12, 10});
        l33 r18 = new l33(r1, getClass(), getMaxItemCount());
        this.n = r18;
        qt r19 = new qt(r1);
        this.o = r19;
        r16.n = r19;
        r16.p = 1;
        r19.setPresenter(r16);
        r18.b(r16, r18.a);
        getContext();
        r16.n.R = r18;
        TypedArray r6 = (TypedArray) r17.o;
        if (r6.hasValue(6) == false) goto L5;
        r19.setIconTintList(r17.b(6));
    L6:
        setItemIconSize(r6.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (r6.hasValue(12) == false) goto L10;
        setItemTextAppearanceInactive(r6.getResourceId(12, 0));
    L10:
        if (r6.hasValue(10) == false) goto L12;
        setItemTextAppearanceActive(r6.getResourceId(10, 0));
    L12:
        setItemTextAppearanceActiveBoldEnabled(r6.getBoolean(11, true));
        if (r6.hasValue(13) == false) goto L16;
        setItemTextColor(r17.b(13));
    L16:
        if (getBackground() != null) goto L18;
    L19:
        bc4 r2 = bc4.c(r1, r13, r14, r15).a();
        fi2 r4 = new fi2();
        Drawable r5 = getBackground();
        if ((r5 instanceof ColorDrawable) == false) goto L22;
        r4.m(ColorStateList.valueOf(((ColorDrawable) r5).getColor()));
    L22:
        r4.j(r1);
        r4.setShapeAppearanceModel(r2);
        WeakHashMap r3 = j65.a;
        setBackground(r4);
    L24:
        if (r6.hasValue(8) == false) goto L27;
        setItemPaddingTop(r6.getDimensionPixelSize(8, 0));
    L27:
        if (r6.hasValue(7) == false) goto L30;
        setItemPaddingBottom(r6.getDimensionPixelSize(7, 0));
    L30:
        if (r6.hasValue(0) == false) goto L33;
        setActiveIndicatorLabelPadding(r6.getDimensionPixelSize(0, 0));
    L33:
        if (r6.hasValue(2) == false) goto L35;
        setElevation(r6.getDimensionPixelSize(2, 0));
    L35:
        getBackground().mutate().setTintList(h12.r(r1, r17, 1));
        setLabelVisibilityMode(r6.getInteger(14, -1));
        int r7 = r6.getResourceId(4, 0);
        if (r7 == 0) goto L38;
        r19.setItemBackgroundRes(r7);
    L39:
        int r8 = r6.getResourceId(3, 0);
        if (r8 == 0) goto L43;
        setItemActiveIndicatorEnabled(true);
        TypedArray r9 = r1.obtainStyledAttributes(r8, ht3.I);
        setItemActiveIndicatorWidth(r9.getDimensionPixelSize(1, 0));
        setItemActiveIndicatorHeight(r9.getDimensionPixelSize(0, 0));
        setItemActiveIndicatorMarginHorizontal(r9.getDimensionPixelOffset(3, 0));
        setItemActiveIndicatorColor(h12.s(r1, r9, 2));
        setItemActiveIndicatorShapeAppearance(bc4.a(r1, r9.getResourceId(4, 0), 0).a());
        r9.recycle();
    L43:
        if (r6.hasValue(15) == false) goto L45;
        int r10 = r6.getResourceId(15, 0);
        r16.o = true;
        getMenuInflater().inflate(r10, r18);
        r16.o = false;
        r16.c(true);
    L45:
        r17.g();
        addView(r19);
        r18.e = new si1(12, (BottomNavigationView) this);
        return;
    L38:
        setItemRippleColor(h12.r(r1, r17, 9));
        goto L39
    L18:
        if ((getBackground() instanceof ColorDrawable) == false) goto L24;
    L5:
        r19.setIconTintList(r19.c());
        goto L6
    }

    private MenuInflater getMenuInflater() {
        if (this.q != null) goto L6;
        this.q = new no4(getContext());
    L6:
        return this.q;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.o.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.o.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.o.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.o.getItemActiveIndicatorMarginHorizontal();
    }

    public bc4 getItemActiveIndicatorShapeAppearance() {
        return this.o.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.o.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.o.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.o.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.o.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.o.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.o.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.o.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.o.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.o.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.o.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.o.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.o.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.n;
    }

    public iv2 getMenuView() {
        return this.o;
    }

    public o33 getPresenter() {
        return this.p;
    }

    public int getSelectedItemId() {
        return this.o.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.P(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof r33) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        r33 r3 = (r33) r2;
        super.onRestoreInstanceState(r3.n);
        this.n.t(r3.p);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r33 r1 = new r33(super.onSaveInstanceState());
        Bundle r0 = new Bundle();
        r1.p = r0;
        this.n.v(r0);
        return r1;
    }

    public void setActiveIndicatorLabelPadding(int r1) {
        this.o.setActiveIndicatorLabelPadding(r1);
    }

    @Override // android.view.View
    public void setElevation(float r1) {
        super.setElevation(r1);
        ji2.N(this, r1);
    }

    public void setItemActiveIndicatorColor(ColorStateList r1) {
        this.o.setItemActiveIndicatorColor(r1);
    }

    public void setItemActiveIndicatorEnabled(boolean r1) {
        this.o.setItemActiveIndicatorEnabled(r1);
    }

    public void setItemActiveIndicatorHeight(int r1) {
        this.o.setItemActiveIndicatorHeight(r1);
    }

    public void setItemActiveIndicatorMarginHorizontal(int r1) {
        this.o.setItemActiveIndicatorMarginHorizontal(r1);
    }

    public void setItemActiveIndicatorShapeAppearance(bc4 r1) {
        this.o.setItemActiveIndicatorShapeAppearance(r1);
    }

    public void setItemActiveIndicatorWidth(int r1) {
        this.o.setItemActiveIndicatorWidth(r1);
    }

    public void setItemBackground(Drawable r1) {
        this.o.setItemBackground(r1);
    }

    public void setItemBackgroundResource(int r1) {
        this.o.setItemBackgroundRes(r1);
    }

    public void setItemIconSize(int r1) {
        this.o.setItemIconSize(r1);
    }

    public void setItemIconSizeRes(int r2) {
        setItemIconSize(getResources().getDimensionPixelSize(r2));
    }

    public void setItemIconTintList(ColorStateList r1) {
        this.o.setIconTintList(r1);
    }

    public void setItemPaddingBottom(int r1) {
        this.o.setItemPaddingBottom(r1);
    }

    public void setItemPaddingTop(int r1) {
        this.o.setItemPaddingTop(r1);
    }

    public void setItemRippleColor(ColorStateList r1) {
        this.o.setItemRippleColor(r1);
    }

    public void setItemTextAppearanceActive(int r1) {
        this.o.setItemTextAppearanceActive(r1);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r1) {
        this.o.setItemTextAppearanceActiveBoldEnabled(r1);
    }

    public void setItemTextAppearanceInactive(int r1) {
        this.o.setItemTextAppearanceInactive(r1);
    }

    public void setItemTextColor(ColorStateList r1) {
        this.o.setItemTextColor(r1);
    }

    public void setLabelVisibilityMode(int r3) {
        qt r0 = this.o;
        if (r0.getLabelVisibilityMode() == r3) goto L6;
        r0.setLabelVisibilityMode(r3);
        this.p.c(false);
        return;
    }

    public void setOnItemReselectedListener(p33 r1) {
    }

    public void setOnItemSelectedListener(q33 r1) {
        this.r = r1;
    }

    public void setSelectedItemId(int r3) {
        l33 r0 = this.n;
        MenuItem r4 = r0.findItem(r3);
        if (r4 != null) goto L5;
        return;
    L5:
        if (r0.q(r4, this.p, 0) == true) goto L9;
        r4.setChecked(true);
        return;
    }
}
