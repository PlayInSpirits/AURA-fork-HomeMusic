package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.bc4;
import defpackage.c51;
import defpackage.ce0;
import defpackage.d34;
import defpackage.d51;
import defpackage.de0;
import defpackage.dq;
import defpackage.e51;
import defpackage.ep0;
import defpackage.f34;
import defpackage.f51;
import defpackage.ge0;
import defpackage.hg3;
import defpackage.ht3;
import defpackage.j65;
import defpackage.kf2;
import defpackage.l4;
import defpackage.r00;
import defpackage.r20;
import defpackage.rm3;
import defpackage.su3;
import defpackage.uc5;
import defpackage.zh0;
import defpackage.zx2;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ce0 {
    public static final r00 V = new r00(Float.class, "width", 8);
    public static final r00 W = new r00(Float.class, "height", 9);
    public static final r00 a0 = new r00(Float.class, "paddingStart", 10);
    public static final r00 b0 = new r00(Float.class, "paddingEnd", 11);
    public int G;
    public final c51 H;
    public final c51 I;
    public final e51 J;
    public final d51 K;
    public final int L;
    public int M;
    public int N;
    public final ExtendedFloatingActionButtonBehavior O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ColorStateList S;
    public int T;
    public int U;

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        boolean z = false;
        this.G = 0;
        int i2 = 6;
        d34 d34Var = new d34(i2, z);
        e51 e51Var = new e51(this, d34Var);
        this.J = e51Var;
        d51 d51Var = new d51(this, d34Var);
        this.K = d51Var;
        this.P = true;
        this.Q = false;
        this.R = false;
        Context context2 = getContext();
        this.O = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.m, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        zx2 zx2VarA = zx2.a(context2, typedArrayD, 5);
        zx2 zx2VarA2 = zx2.a(context2, typedArrayD, 4);
        zx2 zx2VarA3 = zx2.a(context2, typedArrayD, 2);
        zx2 zx2VarA4 = zx2.a(context2, typedArrayD, 6);
        this.L = typedArrayD.getDimensionPixelSize(0, -1);
        int i3 = typedArrayD.getInt(3, 1);
        WeakHashMap weakHashMap = j65.a;
        this.M = getPaddingStart();
        this.N = getPaddingEnd();
        d34 d34Var2 = new d34(i2, z);
        f51 hg3Var = new hg3(17, this);
        rm3 rm3Var = new rm3(this, hg3Var);
        r20 r20Var = new r20(this, rm3Var, hg3Var, 5);
        boolean z2 = true;
        if (i3 != 1) {
            hg3Var = i3 != 2 ? r20Var : rm3Var;
            z2 = true;
        }
        c51 c51Var = new c51(this, d34Var2, hg3Var, z2);
        this.I = c51Var;
        c51 c51Var2 = new c51(this, d34Var2, new zh0(23, this), false);
        this.H = c51Var2;
        e51Var.f = zx2VarA;
        d51Var.f = zx2VarA2;
        c51Var.f = zx2VarA3;
        c51Var2.f = zx2VarA4;
        typedArrayD.recycle();
        setShapeAppearanceModel(bc4.d(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, bc4.m).a());
        this.S = getTextColors();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d A[LOOP:0: B:35:0x007b->B:36:0x007d, LOOP_END] */
    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        dq dqVar;
        int i2;
        AnimatorSet animatorSetA;
        ArrayList arrayList;
        int size;
        ViewGroup.LayoutParams layoutParams;
        if (i == 0) {
            dqVar = extendedFloatingActionButton.J;
        } else if (i == 1) {
            dqVar = extendedFloatingActionButton.K;
        } else if (i == 2) {
            dqVar = extendedFloatingActionButton.H;
        } else {
            if (i != 3) {
                kf2.o(f34.f(i, "Unknown strategy type: "));
                return;
            }
            dqVar = extendedFloatingActionButton.I;
        }
        if (dqVar.h()) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        if (!extendedFloatingActionButton.isLaidOut()) {
            int visibility = extendedFloatingActionButton.getVisibility();
            int i3 = extendedFloatingActionButton.G;
            if (visibility == 0 ? i3 == 1 : i3 != 2) {
                if (extendedFloatingActionButton.R) {
                    if (!extendedFloatingActionButton.isInEditMode()) {
                        if (i == 2) {
                            layoutParams = extendedFloatingActionButton.getLayoutParams();
                            if (layoutParams != null) {
                                extendedFloatingActionButton.T = layoutParams.width;
                                extendedFloatingActionButton.U = layoutParams.height;
                            } else {
                                extendedFloatingActionButton.T = extendedFloatingActionButton.getWidth();
                                extendedFloatingActionButton.U = extendedFloatingActionButton.getHeight();
                            }
                        }
                        i2 = 0;
                        extendedFloatingActionButton.measure(0, 0);
                        animatorSetA = dqVar.a();
                        animatorSetA.addListener(new l4(6, dqVar));
                        arrayList = dqVar.c;
                        size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            animatorSetA.addListener((Animator.AnimatorListener) obj);
                        }
                        animatorSetA.start();
                        return;
                    }
                }
            }
        } else if (!extendedFloatingActionButton.isInEditMode()) {
            if (i == 2) {
                layoutParams = extendedFloatingActionButton.getLayoutParams();
                if (layoutParams != null) {
                    extendedFloatingActionButton.T = layoutParams.width;
                    extendedFloatingActionButton.U = layoutParams.height;
                } else {
                    extendedFloatingActionButton.T = extendedFloatingActionButton.getWidth();
                    extendedFloatingActionButton.U = extendedFloatingActionButton.getHeight();
                }
            }
            i2 = 0;
            extendedFloatingActionButton.measure(0, 0);
            animatorSetA = dqVar.a();
            animatorSetA.addListener(new l4(6, dqVar));
            arrayList = dqVar.c;
            size = arrayList.size();
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                animatorSetA.addListener((Animator.AnimatorListener) obj2);
            }
            animatorSetA.start();
            return;
        }
        dqVar.g();
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // defpackage.ce0
    public de0 getBehavior() {
        return this.O;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        WeakHashMap weakHashMap = j65.a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public zx2 getExtendMotionSpec() {
        return this.I.f;
    }

    public zx2 getHideMotionSpec() {
        return this.K.f;
    }

    public zx2 getShowMotionSpec() {
        return this.J.f;
    }

    public zx2 getShrinkMotionSpec() {
        return this.H.f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.P && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.P = false;
            this.H.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.R = z;
    }

    public void setExtendMotionSpec(zx2 zx2Var) {
        this.I.f = zx2Var;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(zx2.b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.P == z) {
            return;
        }
        c51 c51Var = z ? this.I : this.H;
        if (c51Var.h()) {
            return;
        }
        c51Var.g();
    }

    public void setHideMotionSpec(zx2 zx2Var) {
        this.K.f = zx2Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(zx2.b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.P || this.Q) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        this.M = getPaddingStart();
        this.N = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.P || this.Q) {
            return;
        }
        this.M = i;
        this.N = i3;
    }

    public void setShowMotionSpec(zx2 zx2Var) {
        this.J.f = zx2Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(zx2.b(getContext(), i));
    }

    public void setShrinkMotionSpec(zx2 zx2Var) {
        this.H.f = zx2Var;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(zx2.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.S = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.S = getTextColors();
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends de0 {
        public Rect n;
        public final boolean o;
        public final boolean p;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.n);
            this.o = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // defpackage.de0
        public final /* bridge */ /* synthetic */ boolean e(View view, Rect rect) {
            return false;
        }

        @Override // defpackage.de0
        public final void g(ge0 ge0Var) {
            if (ge0Var.h == 0) {
                ge0Var.h = 80;
            }
        }

        @Override // defpackage.de0
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ge0 ? ((ge0) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.de0
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List listK = coordinatorLayout.k(extendedFloatingActionButton);
            int size = listK.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) listK.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof ge0 ? ((ge0) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            ge0 ge0Var = (ge0) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.o;
            boolean z2 = this.p;
            if ((!z && !z2) || ge0Var.f != appBarLayout.getId()) {
                return false;
            }
            if (this.n == null) {
                this.n = new Rect();
            }
            Rect rect = this.n;
            ep0.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            ge0 ge0Var = (ge0) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.o;
            boolean z2 = this.p;
            if ((!z && !z2) || ge0Var.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((ge0) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.o = false;
            this.p = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
