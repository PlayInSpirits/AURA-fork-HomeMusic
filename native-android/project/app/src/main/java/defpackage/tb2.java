package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends BaseAdapter {
    public int n;
    public final /* synthetic */ ub2 o;

    public tb2(ub2 r1) {
        this.o = r1;
        this.n = -1;
        a();
    }

    public final void a() {
        qu2 r0 = this.o.p;
        tu2 r1 = r0.v;
        if (r1 == null) goto L11;
        r0.i();
        ArrayList r2 = r0.j;
        int r3 = r2.size();
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L11;
        if (((tu2) r2.get(r4)) == r1) goto L8;
        r4 = r4 + 1;
        goto L5
    L8:
        this.n = r4;
        return;
    L11:
        this.n = -1;
    }

    public final tu2 b(int r3) {
        ub2 r0 = this.o;
        qu2 r1 = r0.p;
        r1.i();
        ArrayList r2 = r1.j;
        r0.getClass();
        int r4 = this.n;
        if (r4 < 0) goto L7;
        if (r3 < r4) goto L7;
        r3 = r3 + 1;
    L7:
        return (tu2) r2.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ub2 r0 = this.o;
        qu2 r1 = r0.p;
        r1.i();
        int r2 = r1.j.size();
        r0.getClass();
        if (this.n >= 0) goto L6;
        return r2;
    L6:
        return r2 - 1;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
        return r1;
    }

    @Override // android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        if (r4 != null) goto L4;
        r4 = this.o.o.inflate(R.layout.abc_list_menu_item_layout, r5, false);
    L4:
        ((hv2) r4).c(b(r3));
        return r4;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
