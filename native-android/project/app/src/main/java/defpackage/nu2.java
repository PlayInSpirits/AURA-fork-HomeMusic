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
    public int o;
    public boolean p;
    public final boolean q;
    public final LayoutInflater r;
    public final int s;

    public nu2(qu2 r2, LayoutInflater r3, boolean r4, int r5) {
        this.o = -1;
        this.q = r4;
        this.r = r3;
        this.n = r2;
        this.s = r5;
        a();
    }

    public final void a() {
        qu2 r0 = this.n;
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
        this.o = r4;
        return;
    L11:
        this.o = -1;
    }

    public final tu2 b(int r3) {
        boolean r0 = this.q;
        qu2 r1 = this.n;
        if (r0 == false) goto L5;
        r1.i();
        ArrayList r2 = r1.j;
    L6:
        int r4 = this.o;
        if (r4 < 0) goto L11;
        if (r3 < r4) goto L11;
        r3 = r3 + 1;
    L11:
        return (tu2) r2.get(r3);
    L5:
        r2 = r1.l();
        goto L6
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean r0 = this.q;
        qu2 r1 = this.n;
        if (r0 == false) goto L5;
        r1.i();
        ArrayList r2 = r1.j;
    L7:
        if (this.o >= 0) goto L11;
        return r2.size();
    L11:
        return r2.size() - 1;
    L5:
        r2 = r1.l();
        goto L7
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
    public final View getView(int r6, View r7, ViewGroup r8) {
        boolean r0 = false;
        if (r7 != null) goto L5;
        r7 = this.r.inflate(this.s, r8, false);
    L5:
        int r9 = b(r6).b;
        int r1 = r6 - 1;
        if (r1 < 0) goto L8;
        int r2 = b(r1).b;
    L9:
        ListMenuItemView r3 = (ListMenuItemView) r7;
        if (this.n.m() == false) goto L13;
        if (r9 == r2) goto L13;
        r0 = true;
    L13:
        r3.setGroupDividerEnabled(r0);
        hv2 r10 = (hv2) r7;
        if (this.p == false) goto L16;
        r3.setForceShowIcon(true);
    L16:
        r10.c(b(r6));
        return r7;
    L8:
        r2 = r9;
        goto L9
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
