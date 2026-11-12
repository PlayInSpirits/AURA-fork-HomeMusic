package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.drawerlayout.widget.DrawerLayout;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.bj3;
import defpackage.d34;
import defpackage.kc1;
import defpackage.ld1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.po;
import defpackage.ss0;
import defpackage.uo;
import defpackage.vb4;
import defpackage.xa3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SettingsFragment extends kc1 {
    public MainActivity l0;
    public d34 m0;
    public boolean n0;

    public SettingsFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r2) {
        super.F(r2);
        this.l0 = (MainActivity) l();
        if (r().getConfiguration().orientation != 2) goto L5;
        boolean r3 = true;
    L6:
        this.n0 = r3;
        return;
    L5:
        r3 = false;
        goto L6
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r3, ViewGroup r4, Bundle r5) {
        View r6 = r3.inflate(R.layout.fragment_settings, r4, false);
        int r7 = R.id.settings_container;
        if (((FrameLayout) uo.s(r6, R.id.settings_container)) == null) goto L16;
        r7 = R.id.settings_toolbar;
        MaterialToolbar r8 = (MaterialToolbar) uo.s(r6, R.id.settings_toolbar);
        if (r8 == null) goto L16;
        LinearLayout r9 = (LinearLayout) r6;
        this.m0 = new d34(r9, r8);
        r8.m(R.menu.settings_menu);
        MenuItem r10 = ((MaterialToolbar) this.m0.o).getMenu().findItem(R.id.action_search);
        if (r10 == null) goto L14;
        SearchView r11 = (SearchView) r10.getActionView();
        if (r11 == null) goto L14;
        r11.setMaxWidth(Integer.MAX_VALUE);
        r11.setIconifiedByDefault(false);
        r11.setQueryHint(s(R.string.settings_search_hint));
        ImageView r12 = (ImageView) r11.findViewById(R.id.search_mag_icon);
        if (r12 == null) goto L13;
        r12.setImageDrawable(null);
        r12.setVisibility(8);
    L13:
        r11.setOnQueryTextListener(new om1(25, this));
    L14:
        ((MaterialToolbar) this.m0.o).setNavigationOnClickListener(new bj3(14, this));
        return r9;
    L16:
        nz2.n("Missing required view with ID: ".concat(r6.getResources().getResourceName(r7)));
        return null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.l0.U.p(false);
        this.l0.I(false);
        ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(1);
        MainActivity r1 = this.l0;
        r1.U.q(r1, !this.n0);
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        this.l0.I(true);
        if (this.n0 == false) goto L7;
        ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(0);
        return;
    L7:
        if (xa3.u("enable_drawer_on_portrait", false) == false) goto L10;
        ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(0);
        return;
    }

    @Override // defpackage.kc1
    public final void T(View r2, Bundle r3) {
        if (r3 != null) goto L5;
        vb4 r4 = new vb4();
        ld1 r1 = m();
        r1.getClass();
        po r5 = new po(r1);
        r5.j(R.id.settings_container, r4, null);
        r5.p = true;
        r5.e(false);
        return;
    }
}
