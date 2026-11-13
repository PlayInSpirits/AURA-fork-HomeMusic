package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.ChipGroup;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f71;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j8;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.lv4;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.p6;
import defpackage.u7;
import defpackage.uo;
import defpackage.y41;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class FilterFragment extends kc1 {
    public MainActivity l0;
    public lv4 m0;
    public f71 n0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l0 = (MainActivity) e();
        View inflate = layoutInflater.inflate(app.homemusic.R.layout.fragment_filter, viewGroup, false);
        int i = app.homemusic.R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(inflate, app.homemusic.R.id.app_bar_layout);
        if (appBarLayout != null) {
            i = app.homemusic.R.id.filter_container;
            NestedScrollView nestedScrollView = (NestedScrollView) uo.s(inflate, app.homemusic.R.id.filter_container);
            if (nestedScrollView != null) {
                i = app.homemusic.R.id.filters_chips_group;
                ChipGroup chipGroup = (ChipGroup) uo.s(inflate, app.homemusic.R.id.filters_chips_group);
                if (chipGroup != null) {
                    i = app.homemusic.R.id.finish_filtering_text_view_clickable;
                    Button button = (Button) uo.s(inflate, app.homemusic.R.id.finish_filtering_text_view_clickable);
                    if (button != null) {
                        i = app.homemusic.R.id.genre_filter_info_sector;
                        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(inflate, app.homemusic.R.id.genre_filter_info_sector);
                        if (constraintLayout != null) {
                            i = app.homemusic.R.id.loading_progress_bar;
                            ProgressBar progressBar = (ProgressBar) uo.s(inflate, app.homemusic.R.id.loading_progress_bar);
                            if (progressBar != null) {
                                i = app.homemusic.R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(inflate, app.homemusic.R.id.toolbar);
                                if (materialToolbar != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    this.m0 = new lv4(linearLayout, appBarLayout, nestedScrollView, chipGroup, button, constraintLayout, progressBar, materialToolbar);
                                    nc1 X = X();
                                    e75 d = X.d();
                                    b75 r = gh0.r(X);
                                    bq4 bq4Var = new bq4(d, r, b11.e(X, r));
                                    i30 a = kx3.a(f71.class);
                                    String b = a.b();
                                    if (b == null) {
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                    this.n0 = (f71) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                                    Bundle h = b11.h("MEDIA_BY_GENRES", "MEDIA_BY_GENRES");
                                    h.putStringArrayList("filters_list", this.n0.d);
                                    h.putStringArrayList("filter_name_list", this.n0.e);
                                    ((Button) this.m0.q).setOnClickListener(new j8(9, this, h));
                                    this.l0.o((MaterialToolbar) this.m0.t);
                                    if (this.l0.n() != null) {
                                        this.l0.n().f0(true);
                                        this.l0.n().g0();
                                    }
                                    ((MaterialToolbar) this.m0.t).setNavigationOnClickListener(new p6(14, this));
                                    ((AppBarLayout) this.m0.n).a(new u7(4, this));
                                    this.n0.c.getClass();
                                    y41.j(-1, false).e(v(), new d8(10, this));
                                    return linearLayout;
                                }
                            }
                        }
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
        this.m0 = null;
    }
}
