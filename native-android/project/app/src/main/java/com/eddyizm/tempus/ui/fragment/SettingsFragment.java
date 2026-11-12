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

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.l0 = (MainActivity) e();
        this.n0 = r().getConfiguration().orientation == 2;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SearchView searchView;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        int i = R.id.settings_container;
        if (((FrameLayout) uo.s(viewInflate, R.id.settings_container)) != null) {
            i = R.id.settings_toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.settings_toolbar);
            if (materialToolbar != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.m0 = new d34(linearLayout, materialToolbar);
                materialToolbar.m(R.menu.settings_menu);
                MenuItem menuItemFindItem = ((MaterialToolbar) this.m0.o).getMenu().findItem(R.id.action_search);
                if (menuItemFindItem != null && (searchView = (SearchView) menuItemFindItem.getActionView()) != null) {
                    searchView.setMaxWidth(Integer.MAX_VALUE);
                    searchView.setIconifiedByDefault(false);
                    searchView.setQueryHint(s(R.string.settings_search_hint));
                    ImageView imageView = (ImageView) searchView.findViewById(R.id.search_mag_icon);
                    if (imageView != null) {
                        imageView.setImageDrawable(null);
                        imageView.setVisibility(8);
                    }
                    searchView.setOnQueryTextListener(new om1(25, this));
                }
                ((MaterialToolbar) this.m0.o).setNavigationOnClickListener(new bj3(14, this));
                return linearLayout;
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.l0.U.p(false);
        this.l0.I(false);
        ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(1);
        MainActivity mainActivity = this.l0;
        mainActivity.U.q(mainActivity, !this.n0);
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        this.l0.I(true);
        if (this.n0) {
            ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(0);
        } else if (xa3.u("enable_drawer_on_portrait", false)) {
            ((DrawerLayout) ((ss0) this.l0.U.o).p).setDrawerLockMode(0);
        }
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        if (bundle == null) {
            vb4 vb4Var = new vb4();
            ld1 ld1VarM = m();
            ld1VarM.getClass();
            po poVar = new po(ld1VarM);
            poVar.j(R.id.settings_container, vb4Var, null);
            poVar.p = true;
            poVar.e(false);
        }
    }
}
