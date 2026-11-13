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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        menuInflater.inflate(app.homemusic.R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(app.homemusic.R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new w7(this, searchView, 5));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        View inflate = layoutInflater.inflate(app.homemusic.R.layout.fragment_podcast_channel_catalogue, viewGroup, false);
        int i = app.homemusic.R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(inflate, app.homemusic.R.id.app_bar_layout);
        if (appBarLayout != null) {
            i = app.homemusic.R.id.podcast_channel_catalogue_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(inflate, app.homemusic.R.id.podcast_channel_catalogue_recycler_view);
            if (recyclerView != null) {
                i = app.homemusic.R.id.podcast_channel_info_sector;
                ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(inflate, app.homemusic.R.id.podcast_channel_info_sector);
                if (constraintLayout != null) {
                    i = app.homemusic.R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(inflate, app.homemusic.R.id.toolbar);
                    if (materialToolbar != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        this.l0 = new bq4(linearLayout, appBarLayout, recyclerView, constraintLayout, materialToolbar);
                        nc1 X = X();
                        e75 d = X.d();
                        b75 r = gh0.r(X);
                        bq4 bq4Var = new bq4(d, r, b11.e(X, r));
                        i30 a = kx3.a(wm3.class);
                        String b = a.b();
                        if (b == null) {
                            kf2.n("Local and anonymous classes can not be ViewModels");
                            return null;
                        }
                        this.n0 = (wm3) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
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
                        le1 v = v();
                        k03 k03Var = wm3Var.d;
                        if (k03Var.d() == null) {
                            wm3Var.c.getClass();
                            hh3.l(null, false).e(v, new g7(k03Var, 0));
                        }
                        k03Var.e(v(), new d8(22, this));
                        ((RecyclerView) this.l0.o).setOnTouchListener(new s7(8, this));
                        return linearLayout;
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
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
        gb.x(a0()).m(app.homemusic.R.id.podcastChannelPageFragment, bundle, null);
        h0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelLongClick(Bundle bundle) {
    }
}
