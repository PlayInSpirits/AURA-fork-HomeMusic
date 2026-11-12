package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l43 implements gv2 {
    public RippleDrawable A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int L;
    public int M;
    public int N;
    public NavigationMenuView n;
    public LinearLayout o;
    public qu2 p;
    public int q;
    public d43 r;
    public LayoutInflater s;
    public ColorStateList u;
    public ColorStateList x;
    public ColorStateList y;
    public Drawable z;
    public int t = 0;
    public int v = 0;
    public boolean w = true;
    public boolean K = true;
    public int O = -1;
    public final i4 P = new i4(12, this);

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        d43 d43Var = this.r;
        if (d43Var != null) {
            d43Var.p();
            d43Var.d();
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 tu2Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return this.q;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
        tu2 tu2Var;
        View actionView;
        ae3 ae3Var;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.n.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                d43 d43Var = this.r;
                ArrayList arrayList = d43Var.q;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    d43Var.s = true;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        f43 f43Var = (f43) arrayList.get(i2);
                        if (f43Var instanceof h43) {
                            tu2 tu2Var2 = ((h43) f43Var).a;
                            if (tu2Var2.a == i) {
                                d43Var.q(tu2Var2);
                                break;
                            }
                        }
                    }
                    d43Var.s = false;
                    d43Var.p();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        f43 f43Var2 = (f43) arrayList.get(i3);
                        if ((f43Var2 instanceof h43) && (actionView = (tu2Var = ((h43) f43Var2).a).getActionView()) != null && (ae3Var = (ae3) sparseParcelableArray2.get(tu2Var.a)) != null) {
                            actionView.restoreHierarchyState(ae3Var);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.o.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 tu2Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context context, qu2 qu2Var) {
        this.s = LayoutInflater.from(context);
        this.p = qu2Var;
        this.N = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        tu2 tu2Var;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.n != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.n.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        d43 d43Var = this.r;
        if (d43Var != null) {
            ArrayList arrayList = d43Var.q;
            Bundle bundle2 = new Bundle();
            tu2 tu2Var2 = d43Var.r;
            if (tu2Var2 != null) {
                bundle2.putInt("android:menu:checked", tu2Var2.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f43 f43Var = (f43) arrayList.get(i);
                if ((f43Var instanceof h43) && (actionView = (tu2Var = ((h43) f43Var).a).getActionView()) != null) {
                    ae3 ae3Var = new ae3();
                    actionView.saveHierarchyState(ae3Var);
                    sparseArray2.put(tu2Var.a, ae3Var);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.o != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.o.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }
}
