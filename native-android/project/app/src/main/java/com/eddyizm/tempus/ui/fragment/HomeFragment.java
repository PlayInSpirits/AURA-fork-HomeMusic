package com.eddyizm.tempus.ui.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import defpackage.cn;
import defpackage.cp1;
import defpackage.gp1;
import defpackage.hd5;
import defpackage.hp1;
import defpackage.jw;
import defpackage.kc1;
import defpackage.lo1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.q80;
import defpackage.uo;
import defpackage.xa3;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class HomeFragment extends kc1 {
    public hd5 l0;
    public MainActivity m0;
    public om1 n0;
    public MaterialToolbar o0;
    public AppBarLayout p0;
    public TabLayout q0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainActivity mainActivity = (MainActivity) e();
        this.m0 = mainActivity;
        this.n0 = mainActivity.U;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        ViewPager2 viewPager2 = (ViewPager2) uo.s(viewInflate, R.id.homeViewPager);
        if (viewPager2 == null) {
            nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.homeViewPager)));
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        this.l0 = new hd5(9, coordinatorLayout, viewPager2);
        return coordinatorLayout;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.m0.J();
        this.m0.I(true);
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        this.p0 = (AppBarLayout) ((CoordinatorLayout) this.l0.o).findViewById(R.id.toolbar_fragment);
        MaterialToolbar materialToolbar = (MaterialToolbar) ((CoordinatorLayout) this.l0.o).findViewById(R.id.toolbar);
        this.o0 = materialToolbar;
        this.m0.o(materialToolbar);
        this.n0.n(this.m0, this.o0);
        Drawable overflowIcon = this.o0.getOverflowIcon();
        Objects.requireNonNull(overflowIcon);
        overflowIcon.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        TabLayout tabLayout = new TabLayout(Z());
        this.q0 = tabLayout;
        int i = 0;
        tabLayout.setTabGravity(0);
        this.q0.setTabMode(1);
        this.p0.addView(this.q0);
        lo1 lo1Var = new lo1(this);
        lo1Var.w(R.drawable.ic_home, new cp1(), s(R.string.home_section_music));
        App.b().getClass();
        if (App.c().getBoolean("podcast_section_visibility", true)) {
            lo1Var.w(R.drawable.ic_graphic_eq, new gp1(), s(R.string.home_section_podcast));
        }
        if (xa3.u("radio_section_visibility", true)) {
            lo1Var.w(R.drawable.ic_play_for_work, new hp1(), s(R.string.home_section_radio));
        }
        ((ViewPager2) this.l0.p).setAdapter(lo1Var);
        ((ViewPager2) this.l0.p).setOffscreenPageLimit(3);
        ((ViewPager2) this.l0.p).setUserInputEnabled(false);
        new jw(this.q0, (ViewPager2) this.l0.p, new cn(15, lo1Var)).l();
        TabLayout tabLayout2 = this.q0;
        if (!xa3.u("podcast_section_visibility", true) && !xa3.u("radio_section_visibility", true)) {
            i = 8;
        }
        tabLayout2.setVisibility(i);
        ViewPager2 viewPager2 = (ViewPager2) this.l0.p;
        ((ArrayList) viewPager2.p.b).add(new q80(2, this));
    }
}
