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

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new w7(this, searchView, 5));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_podcast_channel_catalogue, viewGroup, false);
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i = R.id.podcast_channel_catalogue_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.podcast_channel_catalogue_recycler_view);
            if (recyclerView != null) {
                i = R.id.podcast_channel_info_sector;
                ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.podcast_channel_info_sector);
                if (constraintLayout != null) {
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                    if (materialToolbar != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.l0 = new bq4(linearLayout, appBarLayout, recyclerView, constraintLayout, materialToolbar);
                        nc1 nc1VarX = X();
                        e75 e75VarD = nc1VarX.d();
                        b75 b75VarR = gh0.r(nc1VarX);
                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                        i30 i30VarA = kx3.a(wm3.class);
                        String strB = i30VarA.b();
                        if (strB == null) {
                            kf2.n("Local and anonymous classes can not be ViewModels");
                            return null;
                        }
                        this.n0 = (wm3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                        this.m0.o((MaterialToolbar) this.l0.q);
                        if (this.m0.n() != null) {
                            this.m0.n().f0(true);
                            this.m0.n().g0();
                        }
                        ((MaterialToolbar) this.l0.q).setNavigationOnClickListener(new bj3(11, this));
                        ((AppBarLayout) this.l0.n).a(new u7(9, this));
                        RecyclerView recyclerView2 = (RecyclerView) this.l0.o;
                        Z();
                        recyclerView2.setLayoutManager(new GridLayoutManager(2));
                        ((RecyclerView) this.l0.o).i(new ek1(2, 20));
                        ((RecyclerView) this.l0.o).setHasFixedSize(true);
                        ej ejVar = new ej(this);
                        this.o0 = ejVar;
                        ejVar.p = 2;
                        ejVar.n.g();
                        ((RecyclerView) this.l0.o).setAdapter(this.o0);
                        wm3 wm3Var = this.n0;
                        le1 le1VarV = v();
                        k03 k03Var = wm3Var.d;
                        if (k03Var.d() == null) {
                            wm3Var.c.getClass();
                            hh3.l(null, false).e(le1VarV, new g7(k03Var, 0));
                        }
                        k03Var.e(v(), new d8(22, this));
                        ((RecyclerView) this.l0.o).setOnTouchListener(new s7(8, this));
                        return linearLayout;
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void h0(View view) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelClick(Bundle bundle) {
        gb.x(a0()).m(R.id.podcastChannelPageFragment, bundle, null);
        h0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelLongClick(Bundle bundle) {
    }
}
