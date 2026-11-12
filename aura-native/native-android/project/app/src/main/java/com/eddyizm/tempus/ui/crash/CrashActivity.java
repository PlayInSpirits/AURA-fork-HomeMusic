package com.eddyizm.tempus.ui.crash;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import app.homemusic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import defpackage.cn;
import defpackage.df;
import defpackage.ef0;
import defpackage.gp3;
import defpackage.if0;
import defpackage.k4;
import defpackage.kc1;
import defpackage.l93;
import defpackage.ly0;
import defpackage.md1;
import defpackage.nz2;
import defpackage.oz;
import defpackage.po;
import defpackage.pz1;
import defpackage.qr2;
import defpackage.sg0;
import defpackage.tj4;
import defpackage.uo;
import defpackage.xy0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CrashActivity extends df {
    public static final /* synthetic */ int T = 0;
    public String N;
    public oz O;
    public Toolbar P;
    public BottomNavigationView Q;
    public DrawerLayout R;
    public NavigationView S;

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        NavigationView navigationView;
        (Build.VERSION.SDK_INT >= 31 ? new tj4(this) : new pz1(24, this)).v();
        ly0.a(this, new qr2(new gp3(7)));
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_crash, (ViewGroup) null, false);
        int i2 = R.id.crash_content_frame;
        if (((FrameLayout) uo.s(viewInflate, R.id.crash_content_frame)) != null) {
            DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
            if (((Toolbar) uo.s(viewInflate, R.id.crash_toolbar)) != null) {
                setContentView(drawerLayout);
                Intent intent = getIntent();
                Application application = sg0.a;
                this.N = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
                this.O = sg0.c(getIntent());
                xy0.a(this);
                setContentView(R.layout.activity_crash);
                Toolbar toolbar = (Toolbar) findViewById(R.id.crash_toolbar);
                this.P = toolbar;
                o(toolbar);
                this.Q = (BottomNavigationView) findViewById(R.id.crash_bottom_nav);
                this.R = (DrawerLayout) findViewById(R.id.crash_drawer_layout);
                this.S = (NavigationView) findViewById(R.id.crash_nav_view);
                BottomNavigationView bottomNavigationView = this.Q;
                int i3 = 2;
                if (bottomNavigationView != null) {
                    bottomNavigationView.setOnNavigationItemSelectedListener(new cn(i3, this));
                    p(new if0(), "Crash Landing");
                    bottomNavigationView.getMenu().findItem(R.id.crash_nav_info).setChecked(true);
                }
                DrawerLayout drawerLayout2 = this.R;
                if (drawerLayout2 != null && (navigationView = this.S) != null) {
                    navigationView.setNavigationItemSelectedListener(new ef0(i, this, drawerLayout2));
                    p(new if0(), getString(R.string.ca_info_title));
                    navigationView.setCheckedItem(R.id.crash_nav_info);
                }
                if (getResources().getConfiguration().orientation == 2) {
                    k4 k4Var = new k4(this, this.R, this.P);
                    this.R.a(k4Var);
                    k4Var.e();
                    return;
                }
                return;
            }
            i2 = R.id.crash_toolbar;
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final void p(kc1 kc1Var, String str) {
        l93 l93VarN = n();
        Objects.requireNonNull(l93VarN);
        l93VarN.k0(str);
        md1 md1VarK = k();
        md1VarK.getClass();
        po poVar = new po(md1VarK);
        poVar.j(R.id.crash_content_frame, kc1Var, null);
        poVar.p = true;
        poVar.c(null);
        poVar.e(false);
    }
}
