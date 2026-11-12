package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nu2 extends BaseAdapter {
    public final qu2 n;
    public int o = -1;
    public boolean p;
    public final boolean q;
    public final LayoutInflater r;
    public final int s;

    public nu2(qu2 qu2Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.q = z;
        this.r = layoutInflater;
        this.n = qu2Var;
        this.s = i;
        a();
    }

    public final void a() {
        qu2 qu2Var = this.n;
        tu2 tu2Var = qu2Var.v;
        if (tu2Var != null) {
            qu2Var.i();
            ArrayList arrayList = qu2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((tu2) arrayList.get(i)) == tu2Var) {
                    this.o = i;
                    return;
                }
            }
        }
        this.o = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tu2 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.q;
        qu2 qu2Var = this.n;
        if (z) {
            qu2Var.i();
            arrayListL = qu2Var.j;
        } else {
            arrayListL = qu2Var.l();
        }
        int i2 = this.o;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (tu2) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.q;
        qu2 qu2Var = this.n;
        if (z) {
            qu2Var.i();
            arrayListL = qu2Var.j;
        } else {
            arrayListL = qu2Var.l();
        }
        return this.o < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.r.inflate(this.s, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.n.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        hv2 hv2Var = (hv2) view;
        if (this.p) {
            listMenuItemView.setForceShowIcon(true);
        }
        hv2Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
