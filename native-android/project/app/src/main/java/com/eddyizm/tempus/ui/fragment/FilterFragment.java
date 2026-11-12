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

    public FilterFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        this.l0 = (MainActivity) l();
        View r14 = r11.inflate(R.layout.fragment_filter, r12, false);
        int r15 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r14, R.id.app_bar_layout);
        if (r3 == null) goto L25;
        r15 = R.id.filter_container;
        NestedScrollView r4 = (NestedScrollView) uo.s(r14, R.id.filter_container);
        if (r4 == null) goto L25;
        r15 = R.id.filters_chips_group;
        ChipGroup r5 = (ChipGroup) uo.s(r14, R.id.filters_chips_group);
        if (r5 == null) goto L25;
        r15 = R.id.finish_filtering_text_view_clickable;
        Button r6 = (Button) uo.s(r14, R.id.finish_filtering_text_view_clickable);
        if (r6 == null) goto L25;
        r15 = R.id.genre_filter_info_sector;
        ConstraintLayout r7 = (ConstraintLayout) uo.s(r14, R.id.genre_filter_info_sector);
        if (r7 == null) goto L25;
        r15 = R.id.loading_progress_bar;
        ProgressBar r8 = (ProgressBar) uo.s(r14, R.id.loading_progress_bar);
        if (r8 == null) goto L25;
        r15 = R.id.toolbar;
        MaterialToolbar r9 = (MaterialToolbar) uo.s(r14, R.id.toolbar);
        if (r9 == null) goto L25;
        LinearLayout r2 = (LinearLayout) r14;
        this.m0 = new lv4(r2, r3, r4, r5, r6, r7, r8, r9);
        nc1 r16 = X();
        e75 r17 = r16.d();
        b75 r1 = gh0.r(r16);
        bq4 r10 = new bq4(r17, r1, b11.e(r16, r1));
        i30 r18 = kx3.a(f71.class);
        String r19 = r18.b();
        if (r19 == null) goto L23;
        this.n0 = (f71) r10.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        Bundle r110 = b11.h("MEDIA_BY_GENRES", "MEDIA_BY_GENRES");
        r110.putStringArrayList("filters_list", this.n0.d);
        r110.putStringArrayList("filter_name_list", this.n0.e);
        ((Button) this.m0.q).setOnClickListener(new j8(9, this, r110));
        this.l0.o((MaterialToolbar) this.m0.t);
        if (this.l0.n() == null) goto L21;
        this.l0.n().f0(true);
        this.l0.n().g0();
    L21:
        ((MaterialToolbar) this.m0.t).setNavigationOnClickListener(new p6(14, this));
        ((AppBarLayout) this.m0.n).a(new u7(4, this));
        this.n0.c.getClass();
        y41.j(-1, false).e(v(), new d8(10, this));
        return r2;
    L23:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L25:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.m0 = null;
    }
}
