package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 implements gv2, AdapterView.OnItemClickListener {
    public Context n;
    public LayoutInflater o;
    public qu2 p;
    public ExpandedMenuView q;
    public fv2 r;
    public tb2 s;

    public ub2(Context context) {
        this.n = context;
        this.o = LayoutInflater.from(context);
    }

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
        fv2 fv2Var = this.r;
        if (fv2Var != null) {
            fv2Var.a(qu2Var, z);
        }
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        tb2 tb2Var = this.s;
        if (tb2Var != null) {
            tb2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        boolean zHasVisibleItems = en4Var.hasVisibleItems();
        Context context = en4Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        ru2 ru2Var = new ru2();
        ru2Var.n = en4Var;
        e9 e9Var = new e9(context);
        ub2 ub2Var = new ub2(e9Var.getContext());
        ru2Var.p = ub2Var;
        ub2Var.r = ru2Var;
        en4Var.b(ub2Var, context);
        ub2 ub2Var2 = ru2Var.p;
        if (ub2Var2.s == null) {
            ub2Var2.s = new tb2(ub2Var2);
        }
        tb2 tb2Var = ub2Var2.s;
        a9 a9Var = e9Var.a;
        a9Var.q = tb2Var;
        a9Var.r = ru2Var;
        View view = en4Var.o;
        if (view != null) {
            a9Var.e = view;
        } else {
            a9Var.c = en4Var.n;
            e9Var.setTitle(en4Var.m);
        }
        a9Var.o = ru2Var;
        f9 f9VarCreate = e9Var.create();
        ru2Var.o = f9VarCreate;
        f9VarCreate.setOnDismissListener(ru2Var);
        WindowManager.LayoutParams attributes = ru2Var.o.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ru2Var.o.show();
        fv2 fv2Var = this.r;
        if (fv2Var == null) {
            return true;
        }
        fv2Var.w(en4Var);
        return true;
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
        return 0;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.q.restoreHierarchyState(sparseParcelableArray);
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

    @Override // defpackage.gv2
    public final void l(Context context, qu2 qu2Var) {
        if (this.n != null) {
            this.n = context;
            if (this.o == null) {
                this.o = LayoutInflater.from(context);
            }
        }
        this.p = qu2Var;
        tb2 tb2Var = this.s;
        if (tb2Var != null) {
            tb2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        if (this.q == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.q;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.p.q(this.s.getItem(i), this, 0);
    }
}
