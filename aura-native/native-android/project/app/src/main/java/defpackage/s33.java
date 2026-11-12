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

    public s33(Context context, AttributeSet attributeSet, int i, int i2) {
        super(su3.H(context, attributeSet, i, i2), attributeSet, i);
        o33 o33Var = new o33();
        o33Var.o = false;
        this.p = o33Var;
        Context context2 = getContext();
        jv3 jv3VarE = uc5.E(context2, attributeSet, ht3.J, i, i2, 12, 10);
        l33 l33Var = new l33(context2, getClass(), getMaxItemCount());
        this.n = l33Var;
        qt qtVar = new qt(context2);
        this.o = qtVar;
        o33Var.n = qtVar;
        o33Var.p = 1;
        qtVar.setPresenter(o33Var);
        l33Var.b(o33Var, l33Var.a);
        getContext();
        o33Var.n.R = l33Var;
        TypedArray typedArray = (TypedArray) jv3VarE.o;
        if (typedArray.hasValue(6)) {
            qtVar.setIconTintList(jv3VarE.b(6));
        } else {
            qtVar.setIconTintList(qtVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(jv3VarE.b(13));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            bc4 bc4VarA = bc4.c(context2, attributeSet, i, i2).a();
            fi2 fi2Var = new fi2();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fi2Var.m(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fi2Var.j(context2);
            fi2Var.setShapeAppearanceModel(bc4VarA);
            WeakHashMap weakHashMap = j65.a;
            setBackground(fi2Var);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(h12.r(context2, jv3VarE, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            qtVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(h12.r(context2, jv3VarE, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, ht3.I);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(h12.s(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(bc4.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            o33Var.o = true;
            getMenuInflater().inflate(resourceId3, l33Var);
            o33Var.o = false;
            o33Var.c(true);
        }
        jv3VarE.g();
        addView(qtVar);
        l33Var.e = new si1(12, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.q == null) {
            this.q = new no4(getContext());
        }
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
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r33)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r33 r33Var = (r33) parcelable;
        super.onRestoreInstanceState(r33Var.n);
        this.n.t(r33Var.p);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r33 r33Var = new r33(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        r33Var.p = bundle;
        this.n.v(bundle);
        return r33Var;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.o.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ji2.N(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.o.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.o.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.o.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.o.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(bc4 bc4Var) {
        this.o.setItemActiveIndicatorShapeAppearance(bc4Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.o.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.o.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.o.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.o.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.o.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.o.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.o.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.o.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.o.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.o.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.o.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.o.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        qt qtVar = this.o;
        if (qtVar.getLabelVisibilityMode() != i) {
            qtVar.setLabelVisibilityMode(i);
            this.p.c(false);
        }
    }

    public void setOnItemReselectedListener(p33 p33Var) {
    }

    public void setOnItemSelectedListener(q33 q33Var) {
        this.r = q33Var;
    }

    public void setSelectedItemId(int i) {
        l33 l33Var = this.n;
        MenuItem menuItemFindItem = l33Var.findItem(i);
        if (menuItemFindItem == null || l33Var.q(menuItemFindItem, this.p, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
