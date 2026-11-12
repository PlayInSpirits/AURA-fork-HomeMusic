package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import app.homemusic.R;
import defpackage.d34;
import defpackage.h91;
import defpackage.ht3;
import defpackage.j65;
import defpackage.l20;
import defpackage.m20;
import defpackage.n20;
import defpackage.o20;
import defpackage.su3;
import defpackage.t3;
import defpackage.uc5;
import defpackage.y10;
import defpackage.zg5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends h91 {
    public int r;
    public int s;
    public n20 t;
    public final y10 u;
    public final int v;
    public final o20 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        Context contextH = su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextH, attributeSet, i);
        this.p = false;
        TypedArray typedArrayObtainStyledAttributes = contextH.getTheme().obtainStyledAttributes(attributeSet, ht3.q, 0, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        y10 y10Var = new y10();
        this.u = y10Var;
        o20 o20Var = new o20(this);
        this.w = o20Var;
        TypedArray typedArrayD = uc5.D(getContext(), attributeSet, ht3.i, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        this.v = typedArrayD.getResourceId(0, -1);
        typedArrayD.recycle();
        y10Var.f = new zg5(this);
        super.setOnHierarchyChangeListener(o20Var);
        WeakHashMap weakHashMap = j65.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof l20);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new l20(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l20(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.u.f();
    }

    public List<Integer> getCheckedChipIds() {
        return this.u.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.r;
    }

    public int getChipSpacingVertical() {
        return this.s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.v;
        if (i != -1) {
            y10 y10Var = this.u;
            Chip chip = (Chip) ((HashMap) y10Var.d).get(Integer.valueOf(i));
            if (chip != null && y10Var.b(chip)) {
                y10Var.g();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t3.a(getRowCount(), this.p ? getVisibleChipCount() : -1, this.u.b ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.r != i) {
            this.r = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.s != i) {
            this.s = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(m20 m20Var) {
        if (m20Var == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new d34(14, this));
        }
    }

    public void setOnCheckedStateChangeListener(n20 n20Var) {
        this.t = n20Var;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w.n = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.u.c = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        y10 y10Var = this.u;
        if (y10Var.b != z) {
            y10Var.b = z;
            boolean zIsEmpty = ((HashSet) y10Var.e).isEmpty();
            Iterator it = ((HashMap) y10Var.d).values().iterator();
            while (it.hasNext()) {
                y10Var.m((Chip) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            y10Var.g();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new l20(layoutParams);
    }

    @Override // defpackage.h91
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
