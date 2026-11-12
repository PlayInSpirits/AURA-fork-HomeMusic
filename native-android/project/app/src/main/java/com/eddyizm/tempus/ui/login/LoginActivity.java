package com.eddyizm.tempus.ui.login;

import android.os.Bundle;
import android.view.View;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LoginActivity extends df {
    public static final /* synthetic */ int R = 0;
    public na4 N;
    public boolean O;
    public boolean P;
    public int Q;

    public LoginActivity() {
        this.P = true;
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r11) {
        jz4.r(this);
        super.onCreate(r11);
        xy0.a(this);
        View r12 = getLayoutInflater().inflate(R.layout.activity_login, null, false);
        int r0 = R.id.appBarLayout;
        if (((AppBarLayout) uo.s(r12, R.id.appBarLayout)) == null) goto L49;
        ConstraintLayout r5 = (ConstraintLayout) r12;
        r0 = R.id.tabLayout;
        TabLayout r7 = (TabLayout) uo.s(r12, R.id.tabLayout);
        if (r7 == null) goto L49;
        r0 = R.id.topAppBar;
        MaterialToolbar r8 = (MaterialToolbar) uo.s(r12, R.id.topAppBar);
        if (r8 == null) goto L49;
        r0 = R.id.viewPager;
        ViewPager2 r9 = (ViewPager2) uo.s(r12, R.id.viewPager);
        if (r9 == null) goto L49;
        this.N = new na4(r5, r5, r7, r8, r9);
        setContentView(r5);
        this.O = getIntent().getBooleanExtra("HIDE_TAB_LAYOUT", false);
        this.P = getIntent().getBooleanExtra("HIDE_TOPAPPBAR_LAYOUT", true);
        this.Q = getIntent().getIntExtra("SELECT_FRAGMENT", 0);
        na4 r13 = this.N;
        if (r13 == null) goto L47;
        ConstraintLayout r14 = (ConstraintLayout) r13.n;
        er1 r3 = new er1(15);
        WeakHashMap r4 = j65.a;
        a65.c(r14, r3);
        boolean r15 = this.P;
        na4 r6 = this.N;
        if (r15 == false) goto L18;
        if (r6 == null) goto L16;
        ((MaterialToolbar) r6.p).setVisibility(8);
    L20:
        na4 r16 = this.N;
        if (r16 == null) goto L43;
        ((ViewPager2) r16.q).setAdapter(new he2(this, this));
        na4 r17 = this.N;
        if (r17 == null) goto L41;
        ((ViewPager2) r17.q).c(this.Q, false);
        if (this.O == false) goto L35;
        na4 r18 = this.N;
        if (r18 == null) goto L33;
        ((TabLayout) r18.o).setVisibility(8);
        na4 r19 = this.N;
        if (r19 == null) goto L31;
        ((ViewPager2) r19.q).setUserInputEnabled(false);
        goto L35
    L31:
        h12.Q("binding");
        throw null;
    L33:
        h12.Q("binding");
        throw null;
    L35:
        na4 r2 = this.N;
        if (r2 == null) goto L39;
        new jw((TabLayout) r2.o, (ViewPager2) r2.q, new cn(21, this)).l();
        return;
    L39:
        h12.Q("binding");
        throw null;
    L41:
        h12.Q("binding");
        throw null;
    L43:
        h12.Q("binding");
        throw null;
    L16:
        h12.Q("binding");
        throw null;
    L18:
        if (r6 == null) goto L45;
        ((MaterialToolbar) r6.p).setOnClickListener(new p6(23, this));
        goto L20
    L45:
        h12.Q("binding");
        throw null;
    L47:
        h12.Q("binding");
        throw null;
    L49:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r0)));
    }
}
