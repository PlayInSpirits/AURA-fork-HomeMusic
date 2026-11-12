package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends BaseAdapter {
    public int n = -1;
    public final /* synthetic */ ub2 o;

    public tb2(ub2 ub2Var) {
        this.o = ub2Var;
        a();
    }

    public final void a() {
        qu2 qu2Var = this.o.p;
        tu2 tu2Var = qu2Var.v;
        if (tu2Var != null) {
            qu2Var.i();
            ArrayList arrayList = qu2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((tu2) arrayList.get(i)) == tu2Var) {
                    this.n = i;
                    return;
                }
            }
        }
        this.n = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tu2 getItem(int i) {
        ub2 ub2Var = this.o;
        qu2 qu2Var = ub2Var.p;
        qu2Var.i();
        ArrayList arrayList = qu2Var.j;
        ub2Var.getClass();
        int i2 = this.n;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (tu2) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ub2 ub2Var = this.o;
        qu2 qu2Var = ub2Var.p;
        qu2Var.i();
        int size = qu2Var.j.size();
        ub2Var.getClass();
        return this.n < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.o.o.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((hv2) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
