package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements gv2 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public t4 G;
    public t4 H;
    public lg1 I;
    public u4 J;
    public int L;
    public final Context n;
    public Context o;
    public qu2 p;
    public final LayoutInflater q;
    public fv2 r;
    public iv2 u;
    public int v;
    public v4 w;
    public Drawable x;
    public boolean y;
    public boolean z;
    public final int s = R.layout.abc_action_menu_layout;
    public final int t = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray F = new SparseBooleanArray();
    public final zg5 K = new zg5(this);

    public y4(Context context) {
        this.n = context;
        this.q = LayoutInflater.from(context);
    }

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
        f();
        t4 t4Var = this.H;
        if (t4Var != null && t4Var.b()) {
            t4Var.i.dismiss();
        }
        fv2 fv2Var = this.r;
        if (fv2Var != null) {
            fv2Var.a(qu2Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(tu2 tu2Var, View view, ViewGroup viewGroup) {
        View actionView = tu2Var.getActionView();
        if (actionView == null || tu2Var.e()) {
            hv2 hv2Var = view instanceof hv2 ? (hv2) view : (hv2) this.q.inflate(this.t, viewGroup, false);
            hv2Var.c(tu2Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) hv2Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.u);
            if (this.J == null) {
                this.J = new u4(this);
            }
            actionMenuItemView.setPopupCallback(this.J);
            actionView = (View) hv2Var;
        }
        actionView.setVisibility(tu2Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof a5)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv2
    public final void c(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.u;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            qu2 qu2Var = this.p;
            if (qu2Var != null) {
                qu2Var.i();
                ArrayList arrayListL = this.p.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    tu2 tu2Var = (tu2) arrayListL.get(i2);
                    if ((tu2Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        tu2 itemData = childAt instanceof hv2 ? ((hv2) childAt).getItemData() : null;
                        View viewB = b(tu2Var, childAt, viewGroup);
                        if (tu2Var != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.u).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.w) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.u).requestLayout();
        qu2 qu2Var2 = this.p;
        if (qu2Var2 != null) {
            qu2Var2.i();
            ArrayList arrayList2 = qu2Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                e5 e5Var = ((tu2) arrayList2.get(i3)).A;
            }
        }
        qu2 qu2Var3 = this.p;
        if (qu2Var3 != null) {
            qu2Var3.i();
            arrayList = qu2Var3.j;
        }
        if (this.z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((tu2) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        v4 v4Var = this.w;
        if (z2) {
            if (v4Var == null) {
                this.w = new v4(this, this.n);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.w.getParent();
            if (viewGroup3 != this.u) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.u;
                v4 v4Var2 = this.w;
                actionMenuView.getClass();
                a5 a5VarJ = ActionMenuView.j();
                a5VarJ.a = true;
                actionMenuView.addView(v4Var2, a5VarJ);
            }
        } else if (v4Var != null) {
            Object parent = v4Var.getParent();
            Object obj = this.u;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.w);
            }
        }
        ((ActionMenuView) this.u).setOverflowReserved(this.z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        boolean z;
        if (en4Var.hasVisibleItems()) {
            en4 en4Var2 = en4Var;
            while (true) {
                qu2 qu2Var = en4Var2.z;
                if (qu2Var == this.p) {
                    break;
                }
                en4Var2 = (en4) qu2Var;
            }
            tu2 tu2Var = en4Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.u;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof hv2) && ((hv2) childAt).getItemData() == tu2Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.L = en4Var.A.a;
                int size = en4Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = en4Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                t4 t4Var = new t4(this, this.o, en4Var, view);
                this.H = t4Var;
                t4Var.g = z;
                yu2 yu2Var = t4Var.i;
                if (yu2Var != null) {
                    yu2Var.q(z);
                }
                t4 t4Var2 = this.H;
                if (!t4Var2.b()) {
                    if (t4Var2.e == null) {
                        kf2.o("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    t4Var2.d(0, 0, false, false);
                }
                fv2 fv2Var = this.r;
                if (fv2Var != null) {
                    fv2Var.w(en4Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        y4 y4Var = this;
        qu2 qu2Var = y4Var.p;
        if (qu2Var != null) {
            arrayListL = qu2Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = y4Var.D;
        int i3 = y4Var.C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) y4Var.u;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            tu2 tu2Var = (tu2) arrayListL.get(i4);
            int i7 = tu2Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (y4Var.E && tu2Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (y4Var.z && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = y4Var.F;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            tu2 tu2Var2 = (tu2) arrayListL.get(i9);
            int i11 = tu2Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = tu2Var2.b;
            if (z3) {
                View viewB = y4Var.b(tu2Var2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                tu2Var2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewB2 = y4Var.b(tu2Var2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            tu2 tu2Var3 = (tu2) arrayListL.get(i13);
                            if (tu2Var3.b == i12) {
                                if ((tu2Var3.x & 32) == 32) {
                                    i8++;
                                }
                                tu2Var3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    tu2Var2.g(z5);
                } else {
                    tu2Var2.g(false);
                }
                i9++;
                i = 2;
                y4Var = this;
                z = true;
            }
            i9++;
            i = 2;
            y4Var = this;
            z = true;
        }
        return z;
    }

    public final boolean f() {
        Object obj;
        lg1 lg1Var = this.I;
        if (lg1Var != null && (obj = this.u) != null) {
            ((View) obj).removeCallbacks(lg1Var);
            this.I = null;
            return true;
        }
        t4 t4Var = this.G;
        if (t4Var == null) {
            return false;
        }
        if (t4Var.b()) {
            t4Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 tu2Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return this.v;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof x4) && (i = ((x4) parcelable).n) > 0 && (menuItemFindItem = this.p.findItem(i)) != null) {
            d((en4) menuItemFindItem.getSubMenu());
        }
    }

    @Override // defpackage.gv2
    public final void i(fv2 fv2Var) {
        throw null;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 tu2Var) {
        return false;
    }

    public final boolean k() {
        t4 t4Var = this.G;
        return t4Var != null && t4Var.b();
    }

    @Override // defpackage.gv2
    public final void l(Context context, qu2 qu2Var) {
        this.o = context;
        LayoutInflater.from(context);
        this.p = qu2Var;
        Resources resources = context.getResources();
        if (!this.A) {
            this.z = true;
        }
        int i = 2;
        this.B = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.D = i;
        int measuredWidth = this.B;
        if (this.z) {
            if (this.w == null) {
                v4 v4Var = new v4(this, this.n);
                this.w = v4Var;
                if (this.y) {
                    v4Var.setImageDrawable(this.x);
                    this.x = null;
                    this.y = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.w.getMeasuredWidth();
        } else {
            this.w = null;
        }
        this.C = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        x4 x4Var = new x4();
        x4Var.n = this.L;
        return x4Var;
    }

    public final boolean n() {
        qu2 qu2Var;
        boolean z = false;
        if (this.z && !k() && (qu2Var = this.p) != null && this.u != null && this.I == null) {
            qu2Var.i();
            if (!qu2Var.j.isEmpty()) {
                lg1 lg1Var = new lg1(this, new t4(this, this.o, this.p, this.w), z, 1);
                this.I = lg1Var;
                ((View) this.u).post(lg1Var);
                return true;
            }
        }
        return false;
    }
}
