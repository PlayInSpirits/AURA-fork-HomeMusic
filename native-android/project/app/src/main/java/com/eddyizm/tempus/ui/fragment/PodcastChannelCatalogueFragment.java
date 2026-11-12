package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import defpackage.bj3;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ej;
import defpackage.ek1;
import defpackage.g7;
import defpackage.gb;
import defpackage.gh0;
import defpackage.hh3;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.w7;
import defpackage.wm3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastChannelCatalogueFragment extends kc1 implements ClickCallback {
    public bq4 l0;
    public MainActivity m0;
    public wm3 n0;
    public ej o0;

    public PodcastChannelCatalogueFragment() {
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
        r4.setOnQueryTextListener(new w7(this, r4, 5));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r8, ViewGroup r9, Bundle r10) {
        this.m0 = (MainActivity) l();
        View r11 = r8.inflate(R.layout.fragment_podcast_channel_catalogue, r9, false);
        int r12 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r11, R.id.app_bar_layout);
        if (r3 == null) goto L22;
        r12 = R.id.podcast_channel_catalogue_recycler_view;
        RecyclerView r4 = (RecyclerView) uo.s(r11, R.id.podcast_channel_catalogue_recycler_view);
        if (r4 == null) goto L22;
        r12 = R.id.podcast_channel_info_sector;
        ConstraintLayout r5 = (ConstraintLayout) uo.s(r11, R.id.podcast_channel_info_sector);
        if (r5 == null) goto L22;
        r12 = R.id.toolbar;
        MaterialToolbar r6 = (MaterialToolbar) uo.s(r11, R.id.toolbar);
        if (r6 == null) goto L22;
        LinearLayout r2 = (LinearLayout) r11;
        this.l0 = new bq4(r2, r3, r4, r5, r6);
        nc1 r13 = X();
        e75 r14 = r13.d();
        b75 r1 = gh0.r(r13);
        bq4 r7 = new bq4(r14, r1, b11.e(r13, r1));
        i30 r15 = kx3.a(wm3.class);
        String r16 = r15.b();
        if (r16 == null) goto L20;
        this.n0 = (wm3) r7.l(r15, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r16));
        this.m0.o((MaterialToolbar) this.l0.q);
        if (this.m0.n() == null) goto L15;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L15:
        ((MaterialToolbar) this.l0.q).setNavigationOnClickListener(new bj3(11, this));
        ((AppBarLayout) this.l0.n).a(new u7(9, this));
        RecyclerView r17 = (RecyclerView) this.l0.o;
        Z();
        r17.setLayoutManager(new GridLayoutManager(2));
        ((RecyclerView) this.l0.o).i(new ek1(2, 20));
        ((RecyclerView) this.l0.o).setHasFixedSize(true);
        ej r18 = new ej(this);
        this.o0 = r18;
        r18.p = 2;
        r18.n.g();
        ((RecyclerView) this.l0.o).setAdapter(this.o0);
        wm3 r19 = this.n0;
        le1 r20 = v();
        k03 r21 = r19.d;
        if (r21.d() != null) goto L18;
        r19.c.getClass();
        hh3.l(null, false).e(r20, new g7(r21, 0));
    L18:
        r21.e(v(), new d8(22, this));
        ((RecyclerView) this.l0.o).setOnTouchListener(new s7(8, this));
        return r2;
    L20:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L22:
        nz2.n("Missing required view with ID: ".concat(r11.getResources().getResourceName(r12)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void h0(View r2) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelClick(Bundle r4) {
        gb.x(a0()).m(R.id.podcastChannelPageFragment, r4, null);
        h0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelLongClick(Bundle r1) {
    }
}
