package com.eddyizm.tempus.ui.login;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import defpackage.a65;
import defpackage.cn;
import defpackage.df;
import defpackage.er1;
import defpackage.h12;
import defpackage.he2;
import defpackage.j65;
import defpackage.jw;
import defpackage.jz4;
import defpackage.na4;
import defpackage.nz2;
import defpackage.p6;
import defpackage.uo;
import defpackage.xy0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class LoginActivity extends df {
    public static final /* synthetic */ int R = 0;
    public na4 N;
    public boolean O;
    public boolean P = true;
    public int Q;

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jz4.r(this);
        super.onCreate(bundle);
        xy0.a(this);
        View inflate = getLayoutInflater().inflate(app.homemusic.R.layout.activity_login, (ViewGroup) null, false);
        int i = app.homemusic.R.id.appBarLayout;
        if (((AppBarLayout) uo.s(inflate, app.homemusic.R.id.appBarLayout)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = app.homemusic.R.id.tabLayout;
            TabLayout tabLayout = (TabLayout) uo.s(inflate, app.homemusic.R.id.tabLayout);
            if (tabLayout != null) {
                i = app.homemusic.R.id.topAppBar;
                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(inflate, app.homemusic.R.id.topAppBar);
                if (materialToolbar != null) {
                    i = app.homemusic.R.id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) uo.s(inflate, app.homemusic.R.id.viewPager);
                    if (viewPager2 != null) {
                        this.N = new na4(constraintLayout, constraintLayout, tabLayout, materialToolbar, viewPager2);
                        setContentView(constraintLayout);
                        this.O = getIntent().getBooleanExtra("HIDE_TAB_LAYOUT", false);
                        this.P = getIntent().getBooleanExtra("HIDE_TOPAPPBAR_LAYOUT", true);
                        this.Q = getIntent().getIntExtra("SELECT_FRAGMENT", 0);
                        na4 na4Var = this.N;
                        if (na4Var == null) {
                            h12.Q("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) na4Var.n;
                        er1 er1Var = new er1(15);
                        WeakHashMap weakHashMap = j65.a;
                        a65.c(constraintLayout2, er1Var);
                        boolean z = this.P;
                        na4 na4Var2 = this.N;
                        if (z) {
                            if (na4Var2 == null) {
                                h12.Q("binding");
                                throw null;
                            }
                            ((MaterialToolbar) na4Var2.p).setVisibility(8);
                        } else {
                            if (na4Var2 == null) {
                                h12.Q("binding");
                                throw null;
                            }
                            ((MaterialToolbar) na4Var2.p).setOnClickListener(new p6(23, this));
                        }
                        na4 na4Var3 = this.N;
                        if (na4Var3 == null) {
                            h12.Q("binding");
                            throw null;
                        }
                        ((ViewPager2) na4Var3.q).setAdapter(new he2(this, this));
                        na4 na4Var4 = this.N;
                        if (na4Var4 == null) {
                            h12.Q("binding");
                            throw null;
                        }
                        ((ViewPager2) na4Var4.q).c(this.Q, false);
                        if (this.O) {
                            na4 na4Var5 = this.N;
                            if (na4Var5 == null) {
                                h12.Q("binding");
                                throw null;
                            }
                            ((TabLayout) na4Var5.o).setVisibility(8);
                            na4 na4Var6 = this.N;
                            if (na4Var6 == null) {
                                h12.Q("binding");
                                throw null;
                            }
                            ((ViewPager2) na4Var6.q).setUserInputEnabled(false);
                        }
                        na4 na4Var7 = this.N;
                        if (na4Var7 != null) {
                            new jw((TabLayout) na4Var7.o, (ViewPager2) na4Var7.q, new cn(21, this)).l();
                            return;
                        } else {
                            h12.Q("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
