package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import defpackage.a43;
import defpackage.a65;
import defpackage.ah2;
import defpackage.bc4;
import defpackage.cc4;
import defpackage.cn0;
import defpackage.d43;
import defpackage.f64;
import defpackage.fi2;
import defpackage.h12;
import defpackage.hi2;
import defpackage.ht3;
import defpackage.hw0;
import defpackage.i43;
import defpackage.j65;
import defpackage.ji2;
import defpackage.jv3;
import defpackage.kf2;
import defpackage.kw0;
import defpackage.l24;
import defpackage.l43;
import defpackage.lw0;
import defpackage.m;
import defpackage.mc4;
import defpackage.nc4;
import defpackage.no4;
import defpackage.o43;
import defpackage.oc4;
import defpackage.oo;
import defpackage.p43;
import defpackage.q43;
import defpackage.qp4;
import defpackage.r43;
import defpackage.sg;
import defpackage.su3;
import defpackage.tu2;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.zc1;
import defpackage.zg2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends f64 implements zg2 {
    public static final int[] I = {R.attr.state_checked};
    public static final int[] J = {-16842910};
    public final sg A;
    public boolean B;
    public boolean C;
    public final int D;
    public final mc4 E;
    public final hi2 F;
    public final qp4 G;
    public final o43 H;
    public final a43 u;
    public final l43 v;
    public q43 w;
    public final int x;
    public final int[] y;
    public no4 z;

    /* JADX WARN: Code duplicated, block: B:59:0x01bf A[PHI: r8
  0x01bf: PHI (r8v3 android.graphics.drawable.Drawable) = 
  (r8v2 android.graphics.drawable.Drawable)
  (r8v7 android.graphics.drawable.Drawable)
  (r8v2 android.graphics.drawable.Drawable)
 binds: [B:51:0x0181, B:57:0x01a7, B:55:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ?? r3;
        Context contextH = su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_Design_NavigationView);
        super(contextH, attributeSet, i);
        this.p = new Rect();
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        uc5.c(contextH, attributeSet, i, app.homemusic.R.style.Widget_Design_ScrimInsetsFrameLayout);
        int[] iArr = ht3.L;
        uc5.g(contextH, attributeSet, iArr, i, app.homemusic.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextH.obtainStyledAttributes(attributeSet, iArr, i, app.homemusic.R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.n = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        p43 p43Var = new p43(this);
        WeakHashMap weakHashMap = j65.a;
        a65.c(this, p43Var);
        l43 l43Var = new l43();
        this.v = l43Var;
        this.y = new int[2];
        this.B = true;
        this.C = true;
        this.D = 0;
        this.E = Build.VERSION.SDK_INT >= 33 ? new oc4(this) : new nc4(this);
        this.F = new hi2(this);
        this.G = new qp4(this, this);
        this.H = new o43(this);
        Context context2 = getContext();
        a43 a43Var = new a43(context2);
        this.u = a43Var;
        jv3 jv3VarE = uc5.E(context2, attributeSet, ht3.K, i, app.homemusic.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) jv3VarE.o;
        if (typedArray.hasValue(1)) {
            setBackground(jv3VarE.c(1));
        }
        this.D = typedArray.getDimensionPixelSize(7, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            bc4 bc4VarA = bc4.c(context2, attributeSet, i, app.homemusic.R.style.Widget_Design_NavigationView).a();
            Drawable background = getBackground();
            fi2 fi2Var = new fi2(bc4VarA);
            if (background instanceof ColorDrawable) {
                fi2Var.m(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fi2Var.j(context2);
            setBackground(fi2Var);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.x = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListB = typedArray.hasValue(31) ? jv3VarE.b(31) : null;
        int resourceId = typedArray.hasValue(34) ? typedArray.getResourceId(34, 0) : 0;
        if (resourceId == 0 && colorStateListB == null) {
            colorStateListB = e(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListB2 = typedArray.hasValue(14) ? jv3VarE.b(14) : e(R.attr.textColorSecondary);
        int resourceId2 = typedArray.hasValue(24) ? typedArray.getResourceId(24, 0) : 0;
        boolean z = typedArray.getBoolean(25, true);
        if (typedArray.hasValue(13)) {
            setItemIconSize(typedArray.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateListB3 = typedArray.hasValue(26) ? jv3VarE.b(26) : null;
        if (resourceId2 == 0 && colorStateListB3 == null) {
            colorStateListB3 = e(R.attr.textColorPrimary);
        }
        Drawable drawableC = jv3VarE.c(10);
        if (drawableC == null && (typedArray.hasValue(17) || typedArray.hasValue(18))) {
            drawableC = f(jv3VarE, h12.r(getContext(), jv3VarE, 19));
            ColorStateList colorStateListR = h12.r(context2, jv3VarE, 16);
            if (colorStateListR != null) {
                l43Var.A = new RippleDrawable(l24.c(colorStateListR), null, f(jv3VarE, null));
                r3 = 0;
                l43Var.c(false);
            } else {
                r3 = 0;
            }
        } else {
            r3 = 0;
        }
        if (typedArray.hasValue(11)) {
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(11, r3));
        }
        if (typedArray.hasValue(27)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(27, r3));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, r3));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, r3));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(33, r3));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(32, r3));
        setTopInsetScrimEnabled(typedArray.getBoolean(35, this.B));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.C));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(12, r3);
        setItemMaxLines(typedArray.getInt(15, 1));
        a43Var.e = new p43(this);
        l43Var.q = 1;
        l43Var.l(context2, a43Var);
        if (resourceId != 0) {
            l43Var.t = resourceId;
            l43Var.c(r3);
        }
        l43Var.u = colorStateListB;
        l43Var.c(r3);
        l43Var.y = colorStateListB2;
        l43Var.c(r3);
        int overScrollMode = getOverScrollMode();
        l43Var.O = overScrollMode;
        NavigationMenuView navigationMenuView = l43Var.n;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            l43Var.v = resourceId2;
            l43Var.c(r3);
        }
        l43Var.w = z;
        l43Var.c(r3);
        l43Var.x = colorStateListB3;
        l43Var.c(r3);
        l43Var.z = drawableC;
        l43Var.c(r3);
        l43Var.D = dimensionPixelSize;
        l43Var.c(r3);
        a43Var.b(l43Var, a43Var.a);
        if (l43Var.n == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) l43Var.s.inflate(app.homemusic.R.layout.design_navigation_menu, this, (boolean) r3);
            l43Var.n = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new i43(l43Var, l43Var.n));
            if (l43Var.r == null) {
                l43Var.r = new d43(l43Var);
            }
            int i2 = l43Var.O;
            if (i2 != -1) {
                l43Var.n.setOverScrollMode(i2);
            }
            LinearLayout linearLayout = (LinearLayout) l43Var.s.inflate(app.homemusic.R.layout.design_navigation_item_header, (ViewGroup) l43Var.n, false);
            l43Var.o = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            l43Var.n.setAdapter(l43Var.r);
        }
        addView(l43Var.n);
        if (typedArray.hasValue(28)) {
            int resourceId3 = typedArray.getResourceId(28, 0);
            d43 d43Var = l43Var.r;
            if (d43Var != null) {
                d43Var.s = true;
            }
            getMenuInflater().inflate(resourceId3, a43Var);
            d43 d43Var2 = l43Var.r;
            if (d43Var2 != null) {
                d43Var2.s = false;
            }
            l43Var.c(false);
        }
        if (typedArray.hasValue(9)) {
            l43Var.o.addView(l43Var.s.inflate(typedArray.getResourceId(9, 0), (ViewGroup) l43Var.o, false));
            NavigationMenuView navigationMenuView3 = l43Var.n;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        jv3VarE.g();
        this.A = new sg(5, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A);
    }

    private MenuInflater getMenuInflater() {
        if (this.z == null) {
            this.z = new no4(getContext());
        }
        return this.z;
    }

    @Override // defpackage.zg2
    public final void a() {
        Pair pairG = g();
        DrawerLayout drawerLayout = (DrawerLayout) pairG.first;
        hi2 hi2Var = this.F;
        oo ooVar = hi2Var.f;
        hi2Var.f = null;
        int i = 1;
        if (ooVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i2 = ((hw0) pairG.second).a;
        int i3 = lw0.a;
        hi2Var.c(ooVar, i2, new kw0(0, this, drawerLayout), new cn0(i, drawerLayout));
    }

    @Override // defpackage.zg2
    public final void b(oo ooVar) {
        int i = ((hw0) g().second).a;
        hi2 hi2Var = this.F;
        if (hi2Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        oo ooVar2 = hi2Var.f;
        hi2Var.f = ooVar;
        if (ooVar2 == null) {
            return;
        }
        hi2Var.d(ooVar.c, i, ooVar.d == 0);
    }

    @Override // defpackage.zg2
    public final void c(oo ooVar) {
        g();
        this.F.f = ooVar;
    }

    @Override // defpackage.zg2
    public final void d() {
        g();
        this.F.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mc4 mc4Var = this.E;
        Path path = mc4Var.e;
        if (!mc4Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListN = ud3.n(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(app.homemusic.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListN.getDefaultColor();
        int[] iArr = I;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = J;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListN.getColorForState(iArr3, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable f(jv3 jv3Var, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) jv3Var.o;
        fi2 fi2Var = new fi2(bc4.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0)).a());
        fi2Var.m(colorStateList);
        return new InsetDrawable((Drawable) fi2Var, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public final Pair g() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof hw0)) {
            return new Pair((DrawerLayout) parent, (hw0) layoutParams);
        }
        kf2.o("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    public hi2 getBackHelper() {
        return this.F;
    }

    public MenuItem getCheckedItem() {
        return this.v.r.r;
    }

    public int getDividerInsetEnd() {
        return this.v.G;
    }

    public int getDividerInsetStart() {
        return this.v.F;
    }

    public int getHeaderCount() {
        return this.v.o.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.v.z;
    }

    public int getItemHorizontalPadding() {
        return this.v.B;
    }

    public int getItemIconPadding() {
        return this.v.D;
    }

    public ColorStateList getItemIconTintList() {
        return this.v.y;
    }

    public int getItemMaxLines() {
        return this.v.L;
    }

    public ColorStateList getItemTextColor() {
        return this.v.x;
    }

    public int getItemVerticalPadding() {
        return this.v.C;
    }

    public Menu getMenu() {
        return this.u;
    }

    public int getSubheaderInsetEnd() {
        return this.v.I;
    }

    public int getSubheaderInsetStart() {
        return this.v.H;
    }

    @Override // defpackage.f64, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        ji2.P(this);
        ViewParent parent = getParent();
        if (!(parent instanceof DrawerLayout) || ((ah2) this.G.a) == null) {
            return;
        }
        DrawerLayout drawerLayout = (DrawerLayout) parent;
        o43 o43Var = this.H;
        if (o43Var != null && (arrayList = drawerLayout.F) != null) {
            arrayList.remove(o43Var);
        }
        drawerLayout.a(o43Var);
    }

    @Override // defpackage.f64, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            o43 o43Var = this.H;
            if (o43Var == null || (arrayList = drawerLayout.F) == null) {
                return;
            }
            arrayList.remove(o43Var);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.x;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r43)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r43 r43Var = (r43) parcelable;
        super.onRestoreInstanceState(r43Var.n);
        this.u.t(r43Var.p);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r43 r43Var = new r43(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        r43Var.p = bundle;
        this.u.v(bundle);
        return r43Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        bc4 bc4Var;
        bc4 bc4Var2;
        super.onSizeChanged(i, i2, i3, i4);
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof hw0) && (i5 = this.D) > 0 && (getBackground() instanceof fi2)) {
            int i6 = ((hw0) getLayoutParams()).a;
            WeakHashMap weakHashMap = j65.a;
            boolean z = Gravity.getAbsoluteGravity(i6, getLayoutDirection()) == 3;
            fi2 fi2Var = (fi2) getBackground();
            zc1 zc1VarG = fi2Var.n.a.g();
            zc1VarG.b(i5);
            if (z) {
                zc1VarG.e = new m(0.0f);
                zc1VarG.h = new m(0.0f);
            } else {
                zc1VarG.f = new m(0.0f);
                zc1VarG.g = new m(0.0f);
            }
            bc4 bc4VarA = zc1VarG.a();
            fi2Var.setShapeAppearanceModel(bc4VarA);
            mc4 mc4Var = this.E;
            mc4Var.c = bc4VarA;
            Path path = mc4Var.e;
            if (!mc4Var.d.isEmpty() && (bc4Var2 = mc4Var.c) != null) {
                cc4.a.d(bc4Var2, 1.0f, mc4Var.d, null, path);
            }
            mc4Var.a(this);
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            mc4Var.d = rectF;
            if (!rectF.isEmpty() && (bc4Var = mc4Var.c) != null) {
                cc4.a.d(bc4Var, 1.0f, mc4Var.d, null, path);
            }
            mc4Var.a(this);
            mc4Var.b = true;
            mc4Var.a(this);
        }
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.C = z;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.u.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            kf2.n("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.v.r.q((tu2) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        l43 l43Var = this.v;
        l43Var.G = i;
        l43Var.c(false);
    }

    public void setDividerInsetStart(int i) {
        l43 l43Var = this.v;
        l43Var.F = i;
        l43Var.c(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ji2.N(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z) {
        mc4 mc4Var = this.E;
        if (z != mc4Var.a) {
            mc4Var.a = z;
            mc4Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        l43 l43Var = this.v;
        l43Var.z = drawable;
        l43Var.c(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        l43 l43Var = this.v;
        l43Var.B = i;
        l43Var.c(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        l43 l43Var = this.v;
        l43Var.B = dimensionPixelSize;
        l43Var.c(false);
    }

    public void setItemIconPadding(int i) {
        l43 l43Var = this.v;
        l43Var.D = i;
        l43Var.c(false);
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        l43 l43Var = this.v;
        l43Var.D = dimensionPixelSize;
        l43Var.c(false);
    }

    public void setItemIconSize(int i) {
        l43 l43Var = this.v;
        if (l43Var.E != i) {
            l43Var.E = i;
            l43Var.J = true;
            l43Var.c(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        l43 l43Var = this.v;
        l43Var.y = colorStateList;
        l43Var.c(false);
    }

    public void setItemMaxLines(int i) {
        l43 l43Var = this.v;
        l43Var.L = i;
        l43Var.c(false);
    }

    public void setItemTextAppearance(int i) {
        l43 l43Var = this.v;
        l43Var.v = i;
        l43Var.c(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        l43 l43Var = this.v;
        l43Var.w = z;
        l43Var.c(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        l43 l43Var = this.v;
        l43Var.x = colorStateList;
        l43Var.c(false);
    }

    public void setItemVerticalPadding(int i) {
        l43 l43Var = this.v;
        l43Var.C = i;
        l43Var.c(false);
    }

    public void setItemVerticalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        l43 l43Var = this.v;
        l43Var.C = dimensionPixelSize;
        l43Var.c(false);
    }

    public void setNavigationItemSelectedListener(q43 q43Var) {
        this.w = q43Var;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        l43 l43Var = this.v;
        if (l43Var != null) {
            l43Var.O = i;
            NavigationMenuView navigationMenuView = l43Var.n;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(int i) {
        l43 l43Var = this.v;
        l43Var.I = i;
        l43Var.c(false);
    }

    public void setSubheaderInsetStart(int i) {
        l43 l43Var = this.v;
        l43Var.H = i;
        l43Var.c(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.B = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.u.findItem(i);
        if (menuItemFindItem != null) {
            this.v.r.q((tu2) menuItemFindItem);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
