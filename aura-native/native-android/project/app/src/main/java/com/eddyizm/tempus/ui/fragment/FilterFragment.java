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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class FilterFragment extends kc1 {
    public MainActivity l0;
    public lv4 m0;
    public f71 n0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_filter, viewGroup, false);
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i = R.id.filter_container;
            NestedScrollView nestedScrollView = (NestedScrollView) uo.s(viewInflate, R.id.filter_container);
            if (nestedScrollView != null) {
                i = R.id.filters_chips_group;
                ChipGroup chipGroup = (ChipGroup) uo.s(viewInflate, R.id.filters_chips_group);
                if (chipGroup != null) {
                    i = R.id.finish_filtering_text_view_clickable;
                    Button button = (Button) uo.s(viewInflate, R.id.finish_filtering_text_view_clickable);
                    if (button != null) {
                        i = R.id.genre_filter_info_sector;
                        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.genre_filter_info_sector);
                        if (constraintLayout != null) {
                            i = R.id.loading_progress_bar;
                            ProgressBar progressBar = (ProgressBar) uo.s(viewInflate, R.id.loading_progress_bar);
                            if (progressBar != null) {
                                i = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                if (materialToolbar != null) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    this.m0 = new lv4(linearLayout, appBarLayout, nestedScrollView, chipGroup, button, constraintLayout, progressBar, materialToolbar);
                                    nc1 nc1VarX = X();
                                    e75 e75VarD = nc1VarX.d();
                                    b75 b75VarR = gh0.r(nc1VarX);
                                    bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                    i30 i30VarA = kx3.a(f71.class);
                                    String strB = i30VarA.b();
                                    if (strB == null) {
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                    this.n0 = (f71) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                    Bundle bundleH = b11.h("MEDIA_BY_GENRES", "MEDIA_BY_GENRES");
                                    bundleH.putStringArrayList("filters_list", this.n0.d);
                                    bundleH.putStringArrayList("filter_name_list", this.n0.e);
                                    ((Button) this.m0.q).setOnClickListener(new j8(9, this, bundleH));
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.m0 = null;
    }
}
