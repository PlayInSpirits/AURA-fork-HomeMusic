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

    public HomeFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r2, ViewGroup r3, Bundle r4) {
        MainActivity r5 = (MainActivity) l();
        this.m0 = r5;
        this.n0 = r5.U;
        View r6 = r2.inflate(R.layout.fragment_home, r3, false);
        ViewPager2 r7 = (ViewPager2) uo.s(r6, R.id.homeViewPager);
        if (r7 == null) goto L6;
        CoordinatorLayout r8 = (CoordinatorLayout) r6;
        this.l0 = new hd5(9, r8, r7);
        return r8;
    L6:
        nz2.n("Missing required view with ID: ".concat(r6.getResources().getResourceName(R.id.homeViewPager)));
        return null;
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
    public final void T(View r9, Bundle r10) {
        this.p0 = (AppBarLayout) ((CoordinatorLayout) this.l0.o).findViewById(R.id.toolbar_fragment);
        MaterialToolbar r11 = (MaterialToolbar) ((CoordinatorLayout) this.l0.o).findViewById(R.id.toolbar);
        this.o0 = r11;
        this.m0.o(r11);
        this.n0.n(this.m0, this.o0);
        Drawable r12 = this.o0.getOverflowIcon();
        Objects.requireNonNull(r12);
        r12.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        TabLayout r13 = new TabLayout(Z());
        this.q0 = r13;
        int r14 = 0;
        r13.setTabGravity(0);
        this.q0.setTabMode(1);
        this.p0.addView(this.q0);
        lo1 r15 = new lo1(this);
        r15.w(R.drawable.ic_home, new cp1(), s(R.string.home_section_music));
        App.b().getClass();
        if (App.c().getBoolean("podcast_section_visibility", true) == false) goto L6;
        r15.w(R.drawable.ic_graphic_eq, new gp1(), s(R.string.home_section_podcast));
    L6:
        if (xa3.u("radio_section_visibility", true) == false) goto L8;
        r15.w(R.drawable.ic_play_for_work, new hp1(), s(R.string.home_section_radio));
    L8:
        ((ViewPager2) this.l0.p).setAdapter(r15);
        ((ViewPager2) this.l0.p).setOffscreenPageLimit(3);
        ((ViewPager2) this.l0.p).setUserInputEnabled(false);
        new jw(this.q0, (ViewPager2) this.l0.p, new cn(15, r15)).l();
        TabLayout r16 = this.q0;
        if (xa3.u("podcast_section_visibility", true) == false) goto L11;
    L14:
        r16.setVisibility(r14);
        ViewPager2 r17 = (ViewPager2) this.l0.p;
        q80 r18 = new q80(2, this);
        ((ArrayList) r17.p.b).add(r18);
        return;
    L11:
        if (xa3.u("radio_section_visibility", true) == true) goto L14;
        r14 = 8;
        goto L14
    }
}
