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
    public static final int[] S = {R.attr.state_checked};
    public static final int[] T = {-16842910};
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

    public m33(Context context) {
        super(context);
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
        if (isInEditMode()) {
            this.n = null;
        } else {
            rn rnVar = new rn();
            this.n = rnVar;
            rnVar.I(0);
            rnVar.x(g12.N(getContext(), app.homemusic.R.attr.motionDurationMedium4, getResources().getInteger(app.homemusic.R.integer.material_motion_duration_long_1)));
            rnVar.z(g12.O(getContext(), app.homemusic.R.attr.motionEasingStandard, yd.b));
            rnVar.F(new us4());
        }
        this.o = new i4(11, (qt) this);
        WeakHashMap weakHashMap = j65.a;
        setImportantForAccessibility(1);
    }

    private k33 getNewItem() {
        k33 k33Var = (k33) this.p.b();
        return k33Var == null ? new pt(getContext()) : k33Var;
    }

    private void setBadgeIfNeeded(k33 k33Var) {
        yo yoVar;
        int id = k33Var.getId();
        if (id == -1 || (yoVar = (yo) this.F.get(id)) == null) {
            return;
        }
        k33Var.setBadge(yoVar);
    }

    public final void a() {
        removeAllViews();
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                if (k33Var != null) {
                    this.p.a(k33Var);
                    ImageView imageView = k33Var.A;
                    if (k33Var.S != null) {
                        if (imageView != null) {
                            k33Var.setClipChildren(true);
                            k33Var.setClipToPadding(true);
                            yo yoVar = k33Var.S;
                            if (yoVar != null) {
                                if (yoVar.d() != null) {
                                    yoVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(yoVar);
                                }
                            }
                        }
                        k33Var.S = null;
                    }
                    k33Var.G = null;
                    k33Var.M = 0.0f;
                    k33Var.n = false;
                }
            }
        }
        if (this.R.f.size() == 0) {
            this.t = 0;
            this.u = 0;
            this.s = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.R.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.R.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.F;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.s = new k33[this.R.f.size()];
        int i3 = this.r;
        boolean z = i3 != -1 ? i3 == 0 : this.R.l().size() > 3;
        for (int i4 = 0; i4 < this.R.f.size(); i4++) {
            this.Q.o = true;
            this.R.getItem(i4).setCheckable(true);
            this.Q.o = false;
            k33 newItem = getNewItem();
            this.s[i4] = newItem;
            newItem.setIconTintList(this.v);
            newItem.setIconSize(this.w);
            newItem.setTextColor(this.y);
            newItem.setTextAppearanceInactive(this.z);
            newItem.setTextAppearanceActive(this.A);
            newItem.setTextAppearanceActiveBoldEnabled(this.B);
            newItem.setTextColor(this.x);
            int i5 = this.G;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.H;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.I;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.K);
            newItem.setActiveIndicatorHeight(this.L);
            newItem.setActiveIndicatorMarginHorizontal(this.M);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.O);
            newItem.setActiveIndicatorEnabled(this.J);
            Drawable drawable = this.C;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.E);
            }
            newItem.setItemRippleColor(this.D);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.r);
            tu2 tu2Var = (tu2) this.R.getItem(i4);
            newItem.c(tu2Var);
            newItem.setItemPosition(i4);
            int i8 = tu2Var.a;
            newItem.setOnTouchListener((View.OnTouchListener) this.q.get(i8));
            newItem.setOnClickListener(this.o);
            int i9 = this.t;
            if (i9 != 0 && i8 == i9) {
                this.u = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.R.f.size() - 1, this.u);
        this.u = iMin;
        this.R.getItem(iMin).setChecked(true);
    }

    @Override // defpackage.iv2
    public final void b(qu2 qu2Var) {
        this.R = qu2Var;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListN = ud3.n(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(app.homemusic.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListN.getDefaultColor();
        int[] iArr = S;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = T;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListN.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final fi2 d() {
        if (this.N == null || this.P == null) {
            return null;
        }
        fi2 fi2Var = new fi2(this.N);
        fi2Var.m(this.P);
        return fi2Var;
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
        k33[] k33VarArr = this.s;
        return (k33VarArr == null || k33VarArr.length <= 0) ? this.C : k33VarArr[0].getBackground();
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
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t3.a(1, this.R.l().size(), 1).a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.I = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.J = z;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.L = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.M = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.O = z;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(bc4 bc4Var) {
        this.N = bc4Var;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.K = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.C = drawable;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.E = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.w = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.H = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.G = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.A = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.x;
                if (colorStateList != null) {
                    k33Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.B = z;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.z = i;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.x;
                if (colorStateList != null) {
                    k33Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.x = colorStateList;
        k33[] k33VarArr = this.s;
        if (k33VarArr != null) {
            for (k33 k33Var : k33VarArr) {
                k33Var.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.r = i;
    }

    public void setPresenter(o33 o33Var) {
        this.Q = o33Var;
    }
}
