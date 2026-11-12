package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ej;
import defpackage.ek1;
import defpackage.fh1;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gh1;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.ml3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.w7;
import defpackage.y41;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class GenreCatalogueFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public gh1 n0;
    public ej o0;
    public int p0;
    public int q0;

    public GenreCatalogueFragment() {
        this.p0 = 2;
        this.q0 = 20;
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.toolbar_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setOnQueryTextListener(new w7(this, r4, 2));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r10, ViewGroup r11, Bundle r12) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r13 = r10.inflate(R.layout.fragment_genre_catalogue, r11, false);
        int r14 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r13, R.id.app_bar_layout);
        if (r3 == null) goto L32;
        r14 = R.id.filter_genres_text_view_clickable;
        Button r4 = (Button) uo.s(r13, R.id.filter_genres_text_view_clickable);
        if (r4 == null) goto L32;
        r14 = R.id.genre_catalogue_recycler_view;
        RecyclerView r5 = (RecyclerView) uo.s(r13, R.id.genre_catalogue_recycler_view);
        if (r5 == null) goto L32;
        r14 = R.id.genre_info_sector;
        ConstraintLayout r6 = (ConstraintLayout) uo.s(r13, R.id.genre_info_sector);
        if (r6 == null) goto L32;
        r14 = R.id.genre_list_sort_image_view;
        Button r7 = (Button) uo.s(r13, R.id.genre_list_sort_image_view);
        if (r7 == null) goto L32;
        r14 = R.id.toolbar;
        MaterialToolbar r8 = (MaterialToolbar) uo.s(r13, R.id.toolbar);
        if (r8 == null) goto L32;
        LinearLayout r2 = (LinearLayout) r13;
        this.l0 = new ml3(r2, r3, r4, r5, r6, r7, r8);
        nc1 r15 = X();
        e75 r16 = r15.d();
        b75 r1 = gh0.r(r15);
        bq4 r9 = new bq4(r16, r1, b11.e(r15, r1));
        i30 r17 = kx3.a(gh1.class);
        String r18 = r17.b();
        if (r18 == null) goto L30;
        gh1 r19 = (gh1) r9.l(r17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r18));
        this.n0 = r19;
        if (r19.d != null) goto L19;
        r19.c.getClass();
        r19.d = y41.j(-1, false);
    L19:
        ut4.c().a(Z());
        ut4 r110 = ut4.c();
        Context r111 = Z();
        if (r110.i == true) goto L22;
        r110.a(r111);
    L22:
        this.p0 = r110.d;
        ut4 r112 = ut4.c();
        Context r113 = Z();
        if (r112.i == true) goto L25;
        r112.a(r113);
    L25:
        this.q0 = r112.e;
        final int r114 = 1;
        ((Button) this.l0.b).setOnClickListener(new fh1(this, r114));
        this.m0.o((MaterialToolbar) this.l0.f);
        if (this.m0.n() == null) goto L28;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L28:
        final int r20 = 2;
        ((MaterialToolbar) this.l0.f).setNavigationOnClickListener(new fh1(this, r20));
        int r21 = 5;
        ((AppBarLayout) this.l0.a).a(new u7(r21, this));
        RecyclerView r115 = (RecyclerView) this.l0.c;
        Z();
        r115.setLayoutManager(new GridLayoutManager(this.p0));
        ((RecyclerView) this.l0.c).i(new ek1(this.p0, this.q0));
        ((RecyclerView) this.l0.c).setHasFixedSize(true);
        ej r116 = new ej(this);
        this.o0 = r116;
        r116.p = 2;
        r116.n.g();
        ((RecyclerView) this.l0.c).setAdapter(this.o0);
        this.n0.d.e(v(), new d8(11, this));
        ((RecyclerView) this.l0.c).setOnTouchListener(new s7(r21, this));
        ((Button) this.l0.e).setOnClickListener(new fh1(this, r0));
        return r2;
    L30:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L32:
        nz2.n("Missing required view with ID: ".concat(r13.getResources().getResourceName(r14)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void h0(View r2) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onGenreClick(Bundle r4) {
        gb.x(a0()).m(R.id.songListPageFragment, r4, null);
        h0(a0());
    }
}
