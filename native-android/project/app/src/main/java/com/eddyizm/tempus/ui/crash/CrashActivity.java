package com.eddyizm.tempus.ui.crash;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
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

    public CrashActivity() {
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r9) {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        pz1 r0 = new tj4(this);
    L6:
        r0.v();
        ly0.a(this, new qr2(new gp3(7)));
        super.onCreate(r9);
        int r2 = 0;
        View r10 = getLayoutInflater().inflate(R.layout.activity_crash, null, false);
        BottomNavigationView r3 = (BottomNavigationView) uo.s(r10, R.id.crash_bottom_nav);
        int r4 = R.id.crash_content_frame;
        if (((FrameLayout) uo.s(r10, R.id.crash_content_frame)) == null) goto L23;
        DrawerLayout r5 = (DrawerLayout) r10;
        NavigationView r6 = (NavigationView) uo.s(r10, R.id.crash_nav_view);
        if (((Toolbar) uo.s(r10, R.id.crash_toolbar)) == null) goto L22;
        setContentView(r5);
        Intent r11 = getIntent();
        Application r7 = sg0.a;
        this.N = r11.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
        this.O = sg0.c(getIntent());
        xy0.a(this);
        setContentView(R.layout.activity_crash);
        Toolbar r12 = (Toolbar) findViewById(R.id.crash_toolbar);
        this.P = r12;
        o(r12);
        FrameLayout r13 = (FrameLayout) findViewById(R.id.crash_content_frame);
        this.Q = (BottomNavigationView) findViewById(R.id.crash_bottom_nav);
        this.R = (DrawerLayout) findViewById(R.id.crash_drawer_layout);
        this.S = (NavigationView) findViewById(R.id.crash_nav_view);
        BottomNavigationView r14 = this.Q;
        int r1 = 2;
        if (r14 == null) goto L13;
        r14.setOnNavigationItemSelectedListener(new cn(r1, this));
        p(new if0(), "Crash Landing");
        r14.getMenu().findItem(R.id.crash_nav_info).setChecked(true);
    L13:
        DrawerLayout r15 = this.R;
        if (r15 == null) goto L19;
        NavigationView r8 = this.S;
        if (r8 == null) goto L19;
        r8.setNavigationItemSelectedListener(new ef0(r2, this, r15));
        p(new if0(), getString(R.string.ca_info_title));
        r8.setCheckedItem(R.id.crash_nav_info);
    L19:
        if (getResources().getConfiguration().orientation != 2) goto L25;
        k4 r16 = new k4(this, this.R, this.P);
        this.R.a(r16);
        r16.e();
        return;
    L25:
        return;
    L22:
        r4 = R.id.crash_toolbar;
    L23:
        nz2.n("Missing required view with ID: ".concat(r10.getResources().getResourceName(r4)));
        return;
    L5:
        r0 = new pz1(24, this);
        goto L6
    }

    public final void p(kc1 r2, String r3) {
        l93 r0 = n();
        Objects.requireNonNull(r0);
        r0.k0(r3);
        md1 r1 = k();
        r1.getClass();
        po r4 = new po(r1);
        r4.j(R.id.crash_content_frame, r2, null);
        r4.p = true;
        r4.c(null);
        r4.e(false);
    }
}
