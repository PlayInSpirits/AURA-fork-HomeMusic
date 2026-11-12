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

    public ub2(Context r1) {
        this.n = r1;
        this.o = LayoutInflater.from(r1);
    }

    @Override // defpackage.gv2
    public final void a(qu2 r1, boolean r2) {
        fv2 r0 = this.r;
        if (r0 == null) goto L6;
        r0.a(r1, r2);
        return;
    }

    @Override // defpackage.gv2
    public final void c(boolean r1) {
        tb2 r0 = this.s;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r6) {
        boolean r0 = r6.hasVisibleItems();
        Context r1 = r6.a;
        if (r0 == true) goto L6;
        return false;
    L6:
        ru2 r2 = new ru2();
        r2.n = r6;
        e9 r3 = new e9(r1);
        ub2 r4 = new ub2(r3.getContext());
        r2.p = r4;
        r4.r = r2;
        r6.b(r4, r1);
        ub2 r5 = r2.p;
        if (r5.s != null) goto L9;
        r5.s = new tb2(r5);
    L9:
        tb2 r7 = r5.s;
        a9 r8 = r3.a;
        r8.q = r7;
        r8.r = r2;
        View r9 = r6.o;
        if (r9 == null) goto L12;
        r8.e = r9;
    L13:
        r8.o = r2;
        f9 r10 = r3.create();
        r2.o = r10;
        r10.setOnDismissListener(r2);
        WindowManager.LayoutParams r11 = r2.o.getWindow().getAttributes();
        r11.type = 1003;
        r11.flags |= 131072;
        r2.o.show();
        fv2 r12 = this.r;
        if (r12 == null) goto L18;
        r12.w(r6);
        return true;
    L18:
        return true;
    L12:
        r8.c = r6.n;
        r3.setTitle(r6.m);
        goto L13
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r2) {
        SparseArray<Parcelable> r3 = ((Bundle) r2).getSparseParcelableArray("android:menu:list");
        if (r3 == null) goto L6;
        this.q.restoreHierarchyState(r3);
        return;
    }

    @Override // defpackage.gv2
    public final void i(fv2 r1) {
        throw null;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context r2, qu2 r3) {
        if (this.n == null) goto L7;
        this.n = r2;
        if (this.o != null) goto L7;
        this.o = LayoutInflater.from(r2);
    L7:
        this.p = r3;
        tb2 r1 = this.s;
        if (r1 == null) goto L11;
        r1.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        if (this.q != null) goto L6;
        return null;
    L6:
        Bundle r0 = new Bundle();
        SparseArray<Parcelable> r1 = new SparseArray();
        ExpandedMenuView r2 = this.q;
        if (r2 == null) goto L9;
        r2.saveHierarchyState(r1);
    L9:
        r0.putSparseParcelableArray("android:menu:list", r1);
        return r0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        this.p.q(this.s.b(r3), this, 0);
    }
}
