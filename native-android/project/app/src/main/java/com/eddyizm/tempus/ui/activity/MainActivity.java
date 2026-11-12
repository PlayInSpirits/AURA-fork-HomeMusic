package com.eddyizm.tempus.ui.activity;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubSyncWorker;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import defpackage.a0;
import defpackage.a65;
import defpackage.aj2;
import defpackage.an2;
import defpackage.au;
import defpackage.b00;
import defpackage.b11;
import defpackage.b75;
import defpackage.bd1;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bn2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.bt2;
import defpackage.c12;
import defpackage.ca0;
import defpackage.cb4;
import defpackage.ck;
import defpackage.cn;
import defpackage.cn2;
import defpackage.co2;
import defpackage.dd5;
import defpackage.df;
import defpackage.do2;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.g12;
import defpackage.gh0;
import defpackage.gi1;
import defpackage.gn2;
import defpackage.gp3;
import defpackage.gq0;
import defpackage.gq4;
import defpackage.gy3;
import defpackage.h12;
import defpackage.hw;
import defpackage.i30;
import defpackage.i93;
import defpackage.ik;
import defpackage.io1;
import defpackage.j65;
import defpackage.jr1;
import defpackage.js1;
import defpackage.jz4;
import defpackage.k03;
import defpackage.k6;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.kf3;
import defpackage.kx3;
import defpackage.kz0;
import defpackage.l93;
import defpackage.ld1;
import defpackage.lf;
import defpackage.lj;
import defpackage.mc0;
import defpackage.md1;
import defpackage.mm3;
import defpackage.n43;
import defpackage.n61;
import defpackage.ns1;
import defpackage.nz0;
import defpackage.nz2;
import defpackage.o53;
import defpackage.om1;
import defpackage.pn4;
import defpackage.po;
import defpackage.pt0;
import defpackage.pz1;
import defpackage.q40;
import defpackage.qp4;
import defpackage.r8;
import defpackage.r92;
import defpackage.ra0;
import defpackage.rg3;
import defpackage.rr1;
import defpackage.rr2;
import defpackage.rs1;
import defpackage.sc5;
import defpackage.sf2;
import defpackage.sk2;
import defpackage.ss0;
import defpackage.ss2;
import defpackage.tf0;
import defpackage.tj4;
import defpackage.u52;
import defpackage.u6;
import defpackage.ud3;
import defpackage.um2;
import defpackage.uo;
import defpackage.v23;
import defpackage.v83;
import defpackage.v9;
import defpackage.vf2;
import defpackage.vt0;
import defpackage.wm2;
import defpackage.ws1;
import defpackage.wt;
import defpackage.x6;
import defpackage.x7;
import defpackage.xa3;
import defpackage.xc5;
import defpackage.xi3;
import defpackage.xm2;
import defpackage.xr1;
import defpackage.xs1;
import defpackage.yc5;
import defpackage.ym2;
import defpackage.z33;
import defpackage.z52;
import defpackage.z6;
import defpackage.zg5;
import defpackage.zm2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends df {
    public static final /* synthetic */ int e0 = 0;
    public String N;
    public boolean O;
    public bl2 P;
    public k03 Q;
    public qp4 R;
    public vf2 S;
    public v23 T;
    public om1 U;
    public zg5 V;
    public BottomSheetBehavior W;
    public boolean X;
    public c12 Y;
    public ik Z;
    public v9 a0;
    public Intent b0;
    public boolean c0;
    public final wt d0;

    public MainActivity() {
        this.N = "";
        this.O = false;
        this.Q = null;
        this.X = false;
        this.c0 = false;
        this.d0 = new wt(4, this);
    }

    public static void p(MainActivity r2, float r3) {
        if (r3 >= 0.0f) goto L5;
        return;
    L5:
        float r0 = ((BottomNavigationView) r2.R.a).getHeight();
        ((BottomNavigationView) r2.R.a).setTranslationY(r0 - ((1.0f - r3) * r0));
    }

    public static boolean y() {
        if (ud3.y() == null) goto L5;
        return true;
    L5:
        if (ud3.J() != null) goto L7;
        return false;
    L7:
        if (ud3.B() != null) goto L14;
        return false;
    L14:
        return true;
    }

    public final void A(Bundle r6) {
        jz4.r(this);
        if (ud3.S() == false) goto L5;
        String r1 = "DYNAMIC";
    L6:
        this.N = ud3.H() + "|" + String.valueOf(ud3.Q()) + "|" + r1;
        super.onCreate(r6);
        HashMap r2 = vt0.v;     // Catch: IllegalStateException -> L9
        startService(new Intent(this, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));     // Catch: IllegalStateException -> L9
    L14:
        if (((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName()) == false) goto L16;
    L18:
        ArrayList r7 = new ArrayList();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 33) goto L24;
        if (ud3.c(this, "android.permission.POST_NOTIFICATIONS") == 0) goto L24;
        r7.add("android.permission.POST_NOTIFICATIONS");
    L24:
        if (r0 < 37) goto L29;
        if (ud3.c(this, "android.permission.ACCESS_LOCAL_NETWORK") == 0) goto L29;
        r7.add("android.permission.ACCESS_LOCAL_NETWORK");
    L29:
        if (r7.isEmpty() == true) goto L32;
        ud3.f0(this, (String[]) r7.toArray(new String[0]), 101);
        this.O = r7.contains("android.permission.ACCESS_LOCAL_NETWORK");
    L32:
        if (xa3.u("always_on_display", false) == false) goto L37;
        getWindow().addFlags(128);
        return;
    L37:
        return;
    L16:
        if (xa3.u("battery_optimization", true) == false) goto L18;
        ExecutorService r8 = io1.a;
    L9:
        HashMap r3 = vt0.v;
        Intent r9 = new Intent(this, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.INIT").putExtra("foreground", true);
        String r4 = f35.a;
        if (Build.VERSION.SDK_INT < 26) goto L12;
        rg3.a(this, r9);
        goto L14
    L12:
        startService(r9);
        goto L14
    L5:
        r1 = ud3.m();
        goto L6
    }

    public final void B(int r1, String[] r2, int[] r3) {
        super.onRequestPermissionsResult(r1, r2, r3);
        if (r1 != 101) goto L6;
        this.O = false;
        return;
    }

    public final void C() {
        super.onResume();
        if (ud3.S() == false) goto L5;
        String r0 = "DYNAMIC";
    L7:
        if ((ud3.H() + "|" + ud3.Q() + "|" + r0).equals(this.N) == false) goto L9;
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L12;
        recreate();
        return;
    L12:
        new Handler(getMainLooper()).post(new a0(1, this));
        return;
    L5:
        r0 = ud3.m();
        goto L7
    }

    public final void D() {
        cb4 r2 = new cb4(this, new ComponentName(this, MediaService.class));
        Bundle r3 = Bundle.EMPTY;
        aj2 r4 = new aj2();
        Looper r5 = f35.x();
        bl2 r6 = new bl2(r5);
        if (r2.a.e() == false) goto L6;
        xc5 r0 = new xc5(4, new fi0(new x7(this)));
    L7:
        b11.w(r6, new bj2(this, r2, r3, r4, r5, r6, r0), new Handler(r5));
        this.P = r6;
        super.onStart();
        String r8 = ud3.H();
        if ("dark".equals(r8) == false) goto L11;
        boolean r9 = ud3.Q();
    L18:
        if (r9 == false) goto L21;
        int r10 = getColor(R.color.black);
        getWindow().setNavigationBarColor(r10);
        getWindow().setStatusBarColor(r10);
        return;
    L21:
        int r11 = new nz0(this).a(g12.s(this, app.homemusic.R.attr.colorSurface, 0), 8.0f);
        int r1 = new nz0(this).a(g12.s(this, app.homemusic.R.attr.colorSurface, 0), 0.0f);
        getWindow().setNavigationBarColor(r11);
        getWindow().setStatusBarColor(r1);
        return;
    L11:
        if ("default".equals(r8) == true) goto L13;
    L17:
        r9 = false;
        goto L18
    L13:
        if ((getResources().getConfiguration().uiMode & 48) != 32) goto L17;
        if (ud3.Q() == false) goto L17;
        r9 = true;
        goto L18
    L6:
        r0 = null;
        goto L7
    }

    public final void E() {
        sk2.Z0(this.P);
        super.onStop();
    }

    public final void F(ik r2, boolean r3) {
        if (y() == true) goto L6;
        this.Z = r2;
        return;
    L6:
        if (r3 == false) goto L8;
        ((au) this.V.n).d(true);
    L8:
        c12 r1 = this.Y;
        if (r1 == null) goto L12;
        r1.i(r2);
        return;
    }

    public final void G() {
        if (ud3.J() != null) goto L8;
        if (ud3.y() != null) goto L8;
        return;
    L8:
        if (this.O == false) goto L11;
        ra0.c = Long.MAX_VALUE;
        return;
    L11:
        AtomicInteger r0 = ra0.a;
        ra0.b = SystemClock.elapsedRealtime();
        ra0.a.incrementAndGet();
        ra0.c = 0;
        int r3 = 5;
        final int r5 = 0;
        if (h12.c(ud3.u(), ud3.v()) == false) goto L19;
        this.S.c.getClass();
        pn4 r1 = App.f(false);
        k03 r2 = new k03();
        if (r1.c != null) goto L16;
        r1.c = new gp3(r1, 21);
    L16:
        r1.c.u().enqueue(new r8(r2, r3));
        r2.e(this, new sf2(this, r5));
        return;
    L19:
        if (this.Q == null) goto L22;
        ra0.a();
        return;
    L22:
        App.b().getClass();
        if ((App.c().getLong("next_server_switch", 0) + 15000) >= System.currentTimeMillis()) goto L39;
        String r4 = ud3.D();
        if (r4 == null) goto L39;
        if (r4.length() == 0) goto L39;
        String r6 = ud3.v();
        if (r6 == null) goto L39;
        if (r6.length() == 0) goto L39;
        String r7 = ud3.v();
        this.S.c.getClass();
        pn4 r8 = App.e(ud3.v());
        k03 r9 = new k03();
        if (r8.c != null) goto L37;
        r8.c = new gp3(r8, 21);
    L37:
        r8.c.u().enqueue(new r8(r9, r3));
        this.Q = r9;
        r9.e(this, new z6(this, r9, r7));
        return;
    L39:
        this.S.c.getClass();
        pn4 r10 = App.f(false);
        k03 r11 = new k03();
        if (r10.c != null) goto L42;
        r10.c = new gp3(r10, 21);
    L42:
        r10.c.u().enqueue(new r8(r11, r3));
        final int r12 = 1;
        r11.e(this, new sf2(this, r12));
    }

    public final void H() {
        u52.f();
        stopService(new Intent(this, LanReceiverService.class));
        HashMap r0 = n61.a;
        monitor-enter(n61.class);
        n61.a.clear();     // Catch: Throwable -> L25
        n61.b.clear();     // Catch: Throwable -> L25
        n61.c.clear();     // Catch: Throwable -> L25
        n61.d++;     // Catch: Throwable -> L25
        n61.b();     // Catch: Throwable -> L25
        monitor-exit(n61.class);
        Context r1 = getApplicationContext();
        ExecutorService r2 = io1.a;
        r1.getClass();
        xr1.a();
        WebView r3 = hw.g;
        if (r3 == null) goto L15;
        ViewParent r4 = r3.getParent();
        if ((r4 instanceof ViewGroup) == false) goto L11;
        ViewGroup r5 = (ViewGroup) r4;
    L12:
        if (r5 == null) goto L14;
        r5.removeView(r3);
    L14:
        r3.removeJavascriptInterface("HomeMusicAndroid");
        r3.destroy();
        goto L15
    L11:
        r5 = null;
    L15:
        hw.g = null;
        hw.h = null;
        hw.i = null;
        rr1.m();
        r1.getSharedPreferences("homemusic_notifier", 0).edit().clear().apply();
        CookieManager.getInstance().removeAllCookies(null);     // Catch: Throwable -> L18
        CookieManager.getInstance().flush();     // Catch: Throwable -> L18
    L20:
        mm3.g = null;
        ud3.w0(null);
        ud3.u0(null);
        ud3.C0(null);
        ud3.q0(null);
        ud3.v0(null);
        ud3.n0(null);
        ud3.D0(null);
        ud3.h0(null);
        ud3.p0(false);
        ud3.r0(1.0f);
        App.b().getClass();
        App.c().edit().putBoolean("skip_silence", false).apply();
        App.b().getClass();
        App.c().edit().putBoolean("data_saving_mode", false).apply();
        ud3.A0(false);
        ud3.z0(false);
        u52.f();
        bl2 r6 = this.P;
        WeakReference r7 = bo2.a;
        if (r6 == null) goto L23;
        r6.f(new jr1(r6, 2), gq0.n);
    L23:
        d().a();
        x();
        return;
    L18:
        th = move-exception;
        Log.w("HomeMusic", "Cannot clear Hub cookies", th);
    L25:
        th = move-exception;
        throw th;
    }

    public final void I(boolean r1) {
        View r0 = (View) ((au) this.V.n).c;
        if (r1 == false) goto L6;
        r0.setVisibility(0);
        return;
    L6:
        r0.setVisibility(8);
    }

    public final void J() {
        float r0 = getResources().getDisplayMetrics().density;
        if (xa3.u("hide_bottom_navbar_on_portrait", false) == false) goto L6;
        this.U.p(false);
        BottomSheetBehavior r1 = (BottomSheetBehavior) ((au) this.V.n).b;
        r1.A = false;
        r1.I((int) (56.0f * r0));
        this.U.q(this, !this.X);
        return;
    L6:
        boolean r2 = this.X;
        zg5 r5 = this.V;
        if (r2 == true) goto L10;
        BottomSheetBehavior r3 = (BottomSheetBehavior) ((au) r5.n).b;
        r3.A = false;
        r3.I((int) (136.0f * r0));
        this.U.p(true);
        this.U.q(this, true);
        return;
    L10:
        BottomSheetBehavior r4 = (BottomSheetBehavior) ((au) r5.n).b;
        r4.A = false;
        r4.I((int) (56.0f * r0));
        BottomSheetBehavior r6 = this.W;
        if (r6 == null) goto L13;
        r6.A = true;
    L13:
        this.U.p(false);
        this.U.q(this, false);
    }

    public final void K() {
        ss0 r0 = (ss0) this.U.o;
        if (getResources().getConfiguration().orientation != 2) goto L5;
        int r4 = 1;
    L6:
        boolean r1 = xa3.u("enable_drawer_on_portrait", false);
        DrawerLayout r2 = (DrawerLayout) r0.p;
        if (r1 == false) goto L10;
        r2.setDrawerLockMode(0);
        return;
    L10:
        r2.setDrawerLockMode(r4 ^ 1);
        return;
    L5:
        r4 = 0;
        goto L6
    }

    @Override // defpackage.df, defpackage.k70, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (z52.a(r2) == false) goto L7;
        return true;
    L7:
        return super.dispatchKeyEvent(r2);
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r18) {
        int r3 = 24;
        if (Build.VERSION.SDK_INT < 31) goto L5;
        pz1 r1 = new tj4(this);
    L6:
        r1.v();
        kb4.T(this);
        View r2 = findViewById(R.id.content);
        cn r4 = new cn(r3, r2);
        WeakHashMap r5 = j65.a;
        a65.c(r2, r4);
        A(r18);
        char r6 = 0;
        View r7 = getLayoutInflater().inflate(app.homemusic.R.layout.activity_main, null, false);
        int r8 = app.homemusic.R.id.bottom_navigation;
        BottomNavigationView r9 = (BottomNavigationView) uo.s(r7, app.homemusic.R.id.bottom_navigation);
        if (r9 != null) goto L9;
    L89:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(r8)));
        return;
    L9:
        if (((FrameLayout) uo.s(r7, app.homemusic.R.id.bottom_navigation_frame)) == null) goto L88;
        DrawerLayout r10 = (DrawerLayout) r7;
        if (((FragmentContainerView) uo.s(r7, app.homemusic.R.id.nav_host_fragment)) != null) goto L13;
        r8 = app.homemusic.R.id.nav_host_fragment;
        goto L89
    L13:
        if (((NavigationView) uo.s(r7, app.homemusic.R.id.nav_view)) == null) goto L86;
        int r11 = app.homemusic.R.id.offline_mode_text_view;
        TextView r12 = (TextView) uo.s(r7, app.homemusic.R.id.offline_mode_text_view);
        if (r12 == null) goto L85;
        r11 = app.homemusic.R.id.player_bottom_sheet;
        FrameLayout r13 = (FrameLayout) uo.s(r7, app.homemusic.R.id.player_bottom_sheet);
        if (r13 == null) goto L85;
        this.R = new qp4(r10, r9, r12, r13);
        setContentView(r10);
        e75 r14 = d();
        b75 r15 = gh0.r(this);
        tf0 r16 = gh0.q(this);
        r15.getClass();
        r16.getClass();
        bq4 r17 = new bq4(r14, r15, r16);
        i30 r19 = kx3.a(vf2.class);
        String r20 = r19.b();
        if (r20 == null) goto L83;
        this.S = (vf2) r17.l(r19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r20));
        this.Y = new c12(this);
        this.a0 = new v9(this);
        registerReceiver(this.a0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        int r21 = 1;
        if (getResources().getConfiguration().orientation != 2) goto L23;
        boolean r22 = true;
    L24:
        this.X = r22;
        md1 r23 = k();
        View r110 = findViewById(app.homemusic.R.id.player_bottom_sheet);
        BottomSheetBehavior r111 = BottomSheetBehavior.C(r110);
        this.W = r111;
        au r112 = new au(r111, r110, r23);
        zg5 r24 = new zg5();
        r24.n = r112;
        this.V = r24;
        ((BottomSheetBehavior) r112.b).w(this.d0);
        au r25 = (au) this.V.n;
        ld1 r113 = (ld1) r25.d;
        r113.getClass();
        po r114 = new po(r113);
        r114.j(app.homemusic.R.id.player_bottom_sheet, (xi3) r25.e, "PlayerBottomSheet");
        r114.e(false);
        zg5 r26 = this.V;
        vf2 r115 = this.S;
        au r27 = (au) r26.n;
        Handler r116 = (Handler) r27.f;
        int r117 = 3;
        if (r27.a == true) goto L34;
        int r118 = ((BottomSheetBehavior) r27.b).Y;
        if (r118 == 3) goto L34;
        if (r118 == 2) goto L34;
        Runnable r28 = (Runnable) r27.g;
        if (r28 == null) goto L33;
        r116.removeCallbacks(r28);
    L33:
        k6 r29 = new k6(12, r27, r115);
        r27.g = r29;
        r116.postDelayed(r29, 100);
    L34:
        NavHostFragment r30 = (NavHostFragment) k().C(app.homemusic.R.id.nav_host_fragment);
        Objects.requireNonNull(r30);
        this.T = r30.h0();
        BottomNavigationView r31 = (BottomNavigationView) findViewById(app.homemusic.R.id.bottom_navigation);
        FrameLayout r32 = (FrameLayout) findViewById(app.homemusic.R.id.bottom_navigation_frame);
        DrawerLayout r33 = (DrawerLayout) findViewById(app.homemusic.R.id.drawer_layout);
        NavigationView r34 = (NavigationView) findViewById(app.homemusic.R.id.nav_view);
        v23 r35 = this.T;
        ss0 r36 = new ss0();
        r36.n = r31;
        r36.o = r32;
        r36.p = r33;
        r36.q = r35;
        om1 r37 = new om1(r6, 13);
        r37.o = r36;
        this.U = r37;
        final BottomSheetBehavior r38 = this.W;
        r35.b(new z33(r38));
        r31.getClass();
        r31.setOnItemSelectedListener(new ss2(6, r35));
        r35.b(new n43(new WeakReference(r31), r35, r21));
        r34.getClass();
        r34.setNavigationItemSelectedListener(new bt2(r35, r34));
        r35.b(new n43(new WeakReference(r34), r35, r6));
        if (this.W.Y != 3) goto L37;
        boolean r39 = true;
    L38:
        v83 r40 = new bd1(this, r39);
        i().a(this, r40);
        this.W.w(new wt(r117, r40));
        if (ud3.y() == null) goto L41;
    L46:
        v();
    L47:
        K();
        App.b().getClass();
        if (App.c().getBoolean("wifi_only", false) == false) goto L55;
        NetworkInfo r41 = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        if (r41 == null) goto L55;
        if (r41.getType() == 1) goto L55;
        new ca0().m0(k(), null);
    L55:
        if (ud3.J() == null) goto L57;
    L58:
        this.S.c.getClass();
        k03 r42 = new k03();
        pn4 r43 = App.f(false);
        if (r43.c != null) goto L61;
        r43.c = new gp3(r43, 21);
    L61:
        gp3 r44 = r43.c;
        r44.getClass();
        Log.d("SystemClient", "getOpenSubsonicExtensions()");
        ((gq4) r44.p).a(((pn4) r44.o).f()).enqueue(new ck(r42, 5));
        r42.e(this, new lj(r21));
    L63:
        if (pt0.a.compareAndSet(false, true) == false) goto L67;
        new Thread(new lf(getApplicationContext(), r117), "DownloadRepair").start();
    L67:
        if (x6.a.compareAndSet(false, true) == false) goto L70;
        new Thread(new u6(r6), "AlbumArtistBackfill").start();
    L70:
        z(getIntent());
        String r45 = getIntent().getStringExtra("LOGIN_ACTIVITY_INTENT");
        if ("open_legacy_login_fragment".equals(r45) == false) goto L74;
        x();
    L77:
        if (Build.VERSION.SDK_INT < 25) goto L81;
        ShortcutManager r46 = kz0.f(getSystemService(kz0.g()));
        Intent r47 = new Intent(this, LoginActivity.class);
        r47.setAction("android.intent.action.VIEW");
        ShortcutInfo r48 = kz0.e(kz0.c(kz0.a(kz0.k(kz0.b(kz0.d(this), getString(app.homemusic.R.string.la_shortcut_label)), getString(app.homemusic.R.string.la_shortcut_label)), Icon.createWithResource(this, app.homemusic.R.mipmap.ic_launcher)), new Intent[]{r47}));
        if (r46 == null) goto L81;
        kz0.h(r46, Collections.singletonList(r48));
    L81:
        ExecutorService r49 = io1.a;
        ((BottomNavigationView) this.R.a).setLabelVisibilityMode(1);
        gi1.m(this);
        Context r50 = getApplicationContext();
        r50.getClass();
        i93 r51 = new i93(HubSyncWorker.class, 15, TimeUnit.MINUTES);
        ((dd5) r51.b).j = new mc0(new o53(null), 2, false, false, false, false, -1, -1, q40.T0(new LinkedHashSet()));
        sc5.b(r50).a("homemusic_hub_sync", (kf3) r51.b());
        Context r0 = getApplicationContext();
        r0.getClass();
        gi1.W(r0);
        rs1.g();
        return;
    L74:
        if ("open_legacy_settings_fragment".equals(r45) == false) goto L77;
        w();
        goto L77
    L57:
        if (ud3.y() == null) goto L63;
    L41:
        if (ud3.J() != null) goto L43;
    L45:
        x();
        goto L47
    L43:
        if (ud3.B() == null) goto L45;
    L37:
        r39 = false;
        goto L38
    L23:
        r22 = false;
        goto L24
    L83:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return;
    L85:
        r8 = r11;
        goto L89
    L86:
        r8 = app.homemusic.R.id.nav_view;
        goto L89
    L88:
        r8 = app.homemusic.R.id.bottom_navigation_frame;
        goto L89
    L5:
        r1 = new pz1(r3, this);
        goto L6
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.a0);
        if (isFinishing() == false) goto L6;
        mm3.g = null;
    L6:
        if (isChangingConfigurations() == false) goto L8;
    L10:
        this.R = null;
        return;
    L8:
        if (ra0.c != Long.MAX_VALUE) goto L10;
        long r2 = SystemClock.elapsedRealtime();
        AtomicInteger r0 = ra0.a;
        ra0.c = ((((long) ud3.x()) * 1000) + 1000) + r2;
        goto L10
    }

    @Override // defpackage.l70, android.app.Activity
    public final void onNewIntent(Intent r1) {
        super.onNewIntent(r1);
        setIntent(r1);
        z(r1);
        s();
        r();
    }

    @Override // defpackage.nc1, defpackage.l70, android.app.Activity
    public final void onRequestPermissionsResult(int r2, String[] r3, int[] r4) {
        boolean r0 = this.O;
        B(r2, r3, r4);
        if (r0 == true) goto L5;
        return;
    L5:
        if (this.O == false) goto L7;
        return;
    L7:
        if (this.n.h.compareTo(r92.r) < 0) goto L9;
        boolean r5 = true;
    L10:
        if (r5 == false) goto L15;
        G();
        return;
    L15:
        return;
    L9:
        r5 = false;
        goto L10
    }

    @Override // defpackage.nc1, android.app.Activity
    public final void onResume() {
        C();
        G();
        K();
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public final void onSaveInstanceState(Bundle r6) {
        super.onSaveInstanceState(r6);
        Parcel r5 = Parcel.obtain();
        r5.writeBundle(r6);     // Catch: Throwable -> L7
        int r2 = r5.dataSize();     // Catch: Throwable -> L7
        if (r2 <= 409600) goto L9;
        Log.w("MainActivityLogs", "Saved instance state is " + r2 + " bytes (limit 409600); clearing it to avoid TransactionTooLargeException on background (#688)");     // Catch: Throwable -> L7
        r6.clear();     // Catch: Throwable -> L7
    L9:
        r5.recycle();
        return;
    L7:
        th = move-exception;
        r5.recycle();
        throw th;
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onStart() {
        D();
        G();
        gq0 r0 = gq0.n;
        bl2 r1 = this.P;
        WeakReference r2 = bo2.a;
        if (r1 == null) goto L5;
        r1.f(new jr1(r1, 3), r0);
    L5:
        this.P.f(new xs1(this, 2), r0);
        s();
        r();
        ExecutorService r3 = io1.a;
        if (pt0.c() == true) goto L8;
        return;
    L8:
        rs1 r4 = rs1.a;
        long r5 = n61.d();
        rs1.d.execute(new ns1(0, r5));
        b00.a.e();
        boolean r6 = xr1.a;
        monitor-enter(xr1.class);
        xr1.d = getApplicationContext();     // Catch: Throwable -> L22
        if (xr1.a == false) goto L15;
        monitor-exit(xr1.class);
    L18:
        if (getSharedPreferences("homemusic_notifier", 0).getBoolean("pending_kept_sync", false) == false) goto L20;
        gi1.U(this);
    L20:
        HubUpdater.checkOnStart(this);
        return;
    L15:
        xr1.a = true;     // Catch: Throwable -> L22
        Thread r7 = new Thread(new u6(5), "HubEvents");     // Catch: Throwable -> L22
        r7.setDaemon(true);     // Catch: Throwable -> L22
        r7.start();     // Catch: Throwable -> L22
        xr1.c = r7;     // Catch: Throwable -> L22
        monitor-exit(xr1.class);
    L22:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onStop() {
        this.Q = null;
        ExecutorService r0 = io1.a;
        xr1.a();
        E();
    }

    public final void q() {
        au r4 = (au) this.V.n;
        Handler r0 = (Handler) r4.f;
        Runnable r1 = (Runnable) r4.g;
        if (r1 == null) goto L5;
        r0.removeCallbacks(r1);
    L5:
        a0 r2 = new a0(10, r4);
        r4.g = r2;
        r0.postDelayed(r2, 100);
    }

    public final void r() {
        if (this.c0 == true) goto L6;
        return;
    L6:
        if (y() == true) goto L8;
        return;
    L8:
        this.c0 = false;
        v23 r0 = this.T;
        int r1 = 1;
        if (r0 != null) goto L11;
    L15:
        View r2 = findViewById(app.homemusic.R.id.player_bottom_sheet);
        if (r2 != null) goto L18;
    L21:
        t();
        return;
    L18:
        if (r2.isLaidOut() == true) goto L21;
        r2.post(new xs1(this, r1));
        return;
    L11:
        if (r0.g() == null) goto L15;
        if (this.T.g().u != app.homemusic.R.id.settingsFragment) goto L15;
        this.T.p(app.homemusic.R.id.settingsFragment, true);
        goto L15
    }

    public final void s() {
        Intent r1 = this.b0;
        if (r1 == null) goto L37;
        ym2 r2 = null;
        this.b0 = null;
        String r3 = r1.getStringExtra("EXTRA_DOWNLOAD_URI");
        if (TextUtils.isEmpty(r3) == true) goto L38;
        Uri r6 = Uri.parse(r3);
        String r4 = r1.getStringExtra("EXTRA_DOWNLOAD_MEDIA_ID");
        if (TextUtils.isEmpty(r4) == false) goto L11;
        r4 = r6.toString();
    L11:
        String r5 = r1.getStringExtra("EXTRA_DOWNLOAD_TITLE");
        String r7 = r1.getStringExtra("EXTRA_DOWNLOAD_ARTIST");
        String r8 = r1.getStringExtra("EXTRA_DOWNLOAD_ALBUM");
        int r9 = r1.getIntExtra("EXTRA_DOWNLOAD_DURATION", 0);
        Bundle r10 = new Bundle();
        r10.putString("id", r4);
        r10.putString("title", r5);
        r10.putString("artist", r7);
        r10.putString("album", r8);
        r10.putString("uri", r6.toString());
        r10.putString("type", "music");
        r10.putInt("duration", r9);
        co2 r11 = new co2();
        r11.H = r10;
        r11.q = Boolean.FALSE;
        r11.r = Boolean.TRUE;
        if (TextUtils.isEmpty(r5) == true) goto L15;
        r11.a = r5;
    L15:
        if (TextUtils.isEmpty(r7) == true) goto L18;
        r11.b = r7;
    L18:
        if (TextUtils.isEmpty(r8) == true) goto L20;
        r11.c = r8;
    L20:
        um2 r12 = new um2();
        xm2 r13 = new xm2();
        List r14 = Collections.EMPTY_LIST;
        gy3 r15 = gy3.r;
        zm2 r16 = new zm2();
        cn2 r17 = cn2.d;
        r4.getClass();
        do2 r18 = new do2(r11);
        yc5 r19 = new yc5();
        r19.n = r6;
        r19.p = r10;
        cn2 r20 = new cn2(r19);
        if (((Uri) r13.e) != null) goto L23;
    L26:
        boolean r21 = true;
    L27:
        rr2.w(r21);
        if (((UUID) r13.d) == null) goto L30;
        r2 = new ym2(r13);
    L30:
        String r22 = r4;
        gn2 r23 = new gn2(r22, new wm2(r12), new bn2(r6, "audio", r2, null, r14, null, r15, -9223372036854775807L), new an2(r16), r18, r20);
        bl2 r0 = this.P;
        WeakReference r24 = bo2.a;
        List r25 = Collections.singletonList(gi1.N(r23));
        Handler r26 = u52.a;
        r25.getClass();
        if (u52.r(r25, "replace", 0, 0) == true) goto L39;
        if (r0 == null) goto L36;
        r0.f(new ws1(21, r0, r23), gq0.n);
        return;
    L36:
        return;
    L39:
        return;
    L23:
        if (((UUID) r13.d) != null) goto L26;
        r21 = false;
        goto L27
    L38:
        return;
    }

    public final void t() {
        if (isFinishing() == false) goto L5;
        return;
    L5:
        if (isDestroyed() == true) goto L16;
        zg5 r2 = this.V;
        if (r2 == null) goto L15;
        au r3 = (au) r2.n;
        r3.a = true;
        Runnable r0 = (Runnable) r3.g;
        if (r0 == null) goto L12;
        ((Handler) r3.f).removeCallbacks(r0);
        r3.g = null;
    L12:
        r3.a(1.0f);
        ((BottomSheetBehavior) r3.b).J(3);
        return;
    L15:
        return;
    }

    public final FrameLayout u() {
        int r0 = this.W.Y;
        if (((FrameLayout) this.R.c).getVisibility() != 0) goto L9;
        if (r0 != 4) goto L9;
        return (FrameLayout) this.R.c;
    L9:
        if (r0 != 3) goto L11;
        return null;
    L11:
        if (this.X == false) goto L13;
        return null;
    L13:
        if (((BottomNavigationView) this.R.a).getVisibility() == 0) goto L15;
        return null;
    L15:
        return (BottomNavigationView) this.R.a;
    }

    public final void v() {
        this.S.getClass();
        boolean r0 = vf2.c();
        ((au) this.V.n).d(r0);
        new mm3().i(getApplicationContext());
        w();
        ik r1 = this.Z;
        if (r1 == null) goto L8;
        c12 r2 = this.Y;
        if (r2 == null) goto L8;
        r2.i(r1);
        this.Z = null;
    L8:
        r();
        String r3 = io1.c;
        if (r3 != null) goto L11;
        return;
    L11:
        io1.c = null;
        js1.a(this, r3);
    }

    public final void w() {
        this.U.p(true);
        v23 r3 = (v23) ((ss0) this.U.o).q;
        int r0 = r3.g().u;
        if (r0 != app.homemusic.R.id.landingFragment) goto L7;
        r3.m(app.homemusic.R.id.action_landingFragment_to_homeFragment, null, null);
        return;
    L7:
        if (r0 != app.homemusic.R.id.loginFragment) goto L10;
        r3.m(app.homemusic.R.id.action_loginFragment_to_homeFragment, null, null);
        return;
    }

    public final void x() {
        this.W.J(5);
        this.U.p(false);
        I(false);
        v23 r3 = (v23) ((ss0) this.U.o).q;
        int r0 = r3.g().u;
        if (r0 != app.homemusic.R.id.landingFragment) goto L7;
        r3.m(app.homemusic.R.id.action_landingFragment_to_loginFragment, null, null);
        return;
    L7:
        if (r0 != app.homemusic.R.id.settingsFragment) goto L11;
        r3.m(app.homemusic.R.id.action_settingsFragment_to_loginFragment, null, null);
        return;
    L11:
        if (r0 != app.homemusic.R.id.homeFragment) goto L14;
        r3.m(app.homemusic.R.id.action_homeFragment_to_loginFragment, null, null);
        return;
    }

    public final void z(Intent r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if ("com.eddyizm.tempus.action.OPEN_NOW_PLAYING".equals(r4.getAction()) == false) goto L8;
        this.c0 = true;
        r4.setAction(null);
    L8:
        if ("com.eddyizm.tempus.action.PLAY_EXTERNAL_DOWNLOAD".equals(r4.getAction()) == false) goto L10;
    L11:
        this.b0 = new Intent(r4);
    L12:
        ExecutorService r0 = io1.a;
        String r2 = r4.getStringExtra("homemusic_hub_route");
        if (r2 != null) goto L26;
        ik r1 = l93.S(r4.getData());
        if (r1 != null) goto L18;
        return;
    L18:
        if (y() == true) goto L21;
        this.Z = r1;
        r4.setData(null);
        return;
    L21:
        c12 r3 = this.Y;
        if (r3 == null) goto L24;
        r3.i(r1);
    L24:
        r4.setData(null);
        return;
    L26:
        r4.removeExtra("homemusic_hub_route");
        if (pt0.c() == true) goto L30;
        io1.c = r2;
        return;
    L30:
        js1.a(this, r2);
        return;
    L10:
        if (r4.hasExtra("EXTRA_DOWNLOAD_URI") == false) goto L12;
        goto L11
    }
}
