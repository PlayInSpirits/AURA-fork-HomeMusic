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
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final i4 P;
    public NavigationMenuView n;
    public LinearLayout o;
    public qu2 p;
    public int q;
    public d43 r;
    public LayoutInflater s;
    public int t;
    public ColorStateList u;
    public int v;
    public boolean w;
    public ColorStateList x;
    public ColorStateList y;
    public Drawable z;

    public l43() {
        this.t = 0;
        this.v = 0;
        this.w = true;
        this.K = true;
        this.O = -1;
        this.P = new i4(12, this);
    }

    @Override // defpackage.gv2
    public final void a(qu2 r1, boolean r2) {
    }

    @Override // defpackage.gv2
    public final void c(boolean r1) {
        d43 r0 = this.r;
        if (r0 == null) goto L6;
        r0.p();
        r0.d();
        return;
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r1) {
        return false;
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
        return this.q;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r10) {
        if ((r10 instanceof Bundle) == false) goto L48;
        Bundle r11 = (Bundle) r10;
        SparseArray<Parcelable> r0 = r11.getSparseParcelableArray("android:menu:list");
        if (r0 == null) goto L7;
        this.n.restoreHierarchyState(r0);
    L7:
        Bundle r1 = r11.getBundle("android:menu:adapter");
        if (r1 == null) goto L35;
        d43 r2 = this.r;
        ArrayList r3 = r2.q;
        int r4 = 0;
        int r5 = r1.getInt("android:menu:checked", 0);
        if (r5 == 0) goto L20;
        r2.s = true;
        int r6 = r3.size();
        int r7 = 0;
    L12:
        if (r7 >= r6) goto L19;
        f43 r8 = (f43) r3.get(r7);
        if ((r8 instanceof h43) == false) goto L18;
        tu2 r9 = ((h43) r8).a;
        if (r9.a != r5) goto L18;
        r2.q(r9);
    L18:
        r7 = r7 + 1;
    L19:
        r2.s = false;
        r2.p();
    L20:
        SparseArray r12 = r1.getSparseParcelableArray("android:menu:action_views");
        if (r12 == null) goto L35;
        int r13 = r3.size();
    L23:
        if (r4 >= r13) goto L35;
        f43 r14 = (f43) r3.get(r4);
        if ((r14 instanceof h43) == false) goto L34;
        tu2 r15 = ((h43) r14).a;
        View r16 = r15.getActionView();
        if (r16 == null) goto L34;
        ae3 r17 = (ae3) r12.get(r15.a);
        if (r17 == null) goto L34;
        r16.restoreHierarchyState(r17);
    L34:
        r4 = r4 + 1;
    L35:
        SparseArray<Parcelable> r18 = r11.getSparseParcelableArray("android:menu:header");
        if (r18 == null) goto L49;
        this.o.restoreHierarchyState(r18);
        return;
    L49:
        return;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context r2, qu2 r3) {
        this.s = LayoutInflater.from(r2);
        this.p = r3;
        this.N = r2.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        Bundle r0 = new Bundle();
        if (this.n == null) goto L5;
        SparseArray<Parcelable> r1 = new SparseArray();
        this.n.saveHierarchyState(r1);
        r0.putSparseParcelableArray("android:menu:list", r1);
    L5:
        d43 r2 = this.r;
        if (r2 == null) goto L20;
        ArrayList r3 = r2.q;
        Bundle r4 = new Bundle();
        tu2 r5 = r2.r;
        if (r5 == null) goto L10;
        r4.putInt("android:menu:checked", r5.a);
    L10:
        SparseArray<? extends Parcelable> r6 = new SparseArray();
        int r7 = r3.size();
        int r8 = 0;
    L11:
        if (r8 >= r7) goto L18;
        f43 r9 = (f43) r3.get(r8);
        if ((r9 instanceof h43) == false) goto L17;
        tu2 r10 = ((h43) r9).a;
        View r11 = r10.getActionView();
        if (r11 == null) goto L17;
        ae3 r12 = new ae3();
        r11.saveHierarchyState(r12);
        r6.put(r10.a, r12);
    L17:
        r8 = r8 + 1;
        goto L11
    L18:
        r4.putSparseParcelableArray("android:menu:action_views", r6);
        r0.putBundle("android:menu:adapter", r4);
    L20:
        if (this.o == null) goto L22;
        SparseArray<Parcelable> r13 = new SparseArray();
        this.o.saveHierarchyState(r13);
        r0.putSparseParcelableArray("android:menu:header", r13);
    L22:
        return r0;
    }
}
