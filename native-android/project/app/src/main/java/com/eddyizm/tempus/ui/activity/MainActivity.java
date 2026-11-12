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
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import defpackage.a0;
import defpackage.a65;
import defpackage.a83;
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
import defpackage.e23;
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
import defpackage.rr1;
import defpackage.rr2;
import defpackage.rs1;
import defpackage.sc5;
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
    public bl2 P;
    public qp4 R;
    public vf2 S;
    public v23 T;
    public om1 U;
    public zg5 V;
    public BottomSheetBehavior W;
    public c12 Y;
    public ik Z;
    public v9 a0;
    public Intent b0;
    public String N = "";
    public boolean O = false;
    public k03 Q = null;
    public boolean X = false;
    public boolean c0 = false;
    public final wt d0 = new wt(4, this);

    public static void p(MainActivity mainActivity, float f) {
        if (f < 0.0f) {
            return;
        }
        float height = ((BottomNavigationView) mainActivity.R.a).getHeight();
        ((BottomNavigationView) mainActivity.R.a).setTranslationY(height - ((1.0f - f) * height));
    }

    public static boolean y() {
        if (ud3.y() == null) {
            return (ud3.J() == null || ud3.B() == null) ? false : true;
        }
        return true;
    }

    public final void A(Bundle bundle) {
        jz4.r(this);
        String strM = ud3.S() ? "DYNAMIC" : ud3.m();
        this.N = ud3.H() + "|" + String.valueOf(ud3.Q()) + "|" + strM;
        super.onCreate(bundle);
        try {
            HashMap map = vt0.v;
            startService(new Intent(this, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
        } catch (IllegalStateException unused) {
            HashMap map2 = vt0.v;
            Intent intentPutExtra = new Intent(this, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.INIT").putExtra("foreground", true);
            String str = f35.a;
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intentPutExtra);
            } else {
                startService(intentPutExtra);
            }
        }
        if (!((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName()) && xa3.u("battery_optimization", true)) {
            ExecutorService executorService = io1.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && ud3.c(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (i >= 37 && ud3.c(this, "android.permission.ACCESS_LOCAL_NETWORK") != 0) {
            arrayList.add("android.permission.ACCESS_LOCAL_NETWORK");
        }
        if (!arrayList.isEmpty()) {
            ud3.f0(this, (String[]) arrayList.toArray(new String[0]), 101);
            this.O = arrayList.contains("android.permission.ACCESS_LOCAL_NETWORK");
        }
        if (xa3.u("always_on_display", false)) {
            getWindow().addFlags(128);
        }
    }

    public final void B(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 101) {
            this.O = false;
        }
    }

    public final void C() {
        super.onResume();
        String strM = ud3.S() ? "DYNAMIC" : ud3.m();
        if ((ud3.H() + "|" + ud3.Q() + "|" + strM).equals(this.N)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            recreate();
        } else {
            new Handler(getMainLooper()).post(new a0(1, this));
        }
    }

    public final void D() {
        xc5 xc5Var;
        boolean zQ;
        cb4 cb4Var = new cb4(this, new ComponentName(this, (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(this)));
        } else {
            xc5Var = null;
        }
        b11.w(bl2Var, new bj2(this, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
        this.P = bl2Var;
        super.onStart();
        String strH = ud3.H();
        if ("dark".equals(strH)) {
            zQ = ud3.Q();
        } else {
            zQ = "default".equals(strH) && (getResources().getConfiguration().uiMode & 48) == 32 && ud3.Q();
        }
        if (zQ) {
            int color = getColor(R.color.black);
            getWindow().setNavigationBarColor(color);
            getWindow().setStatusBarColor(color);
        } else {
            int iA = new nz0(this).a(g12.s(this, app.homemusic.R.attr.colorSurface, 0), 8.0f);
            int iA2 = new nz0(this).a(g12.s(this, app.homemusic.R.attr.colorSurface, 0), 0.0f);
            getWindow().setNavigationBarColor(iA);
            getWindow().setStatusBarColor(iA2);
        }
    }

    public final void E() {
        sk2.Z0(this.P);
        super.onStop();
    }

    public final void F(ik ikVar, boolean z) {
        if (!y()) {
            this.Z = ikVar;
            return;
        }
        if (z) {
            ((au) this.V.n).d(true);
        }
        c12 c12Var = this.Y;
        if (c12Var != null) {
            c12Var.i(ikVar);
        }
    }

    public final void G() {
        String strD;
        String strV;
        if (ud3.J() == null && ud3.y() == null) {
            return;
        }
        if (this.O) {
            ra0.c = Long.MAX_VALUE;
            return;
        }
        AtomicInteger atomicInteger = ra0.a;
        ra0.b = SystemClock.elapsedRealtime();
        ra0.a.incrementAndGet();
        ra0.c = 0L;
        int i = 5;
        final int i2 = 0;
        if (h12.c(ud3.u(), ud3.v())) {
            this.S.c.getClass();
            pn4 pn4VarF = App.f(false);
            k03 k03Var = new k03();
            if (pn4VarF.c == null) {
                pn4VarF.c = new gp3(pn4VarF, 21);
            }
            pn4VarF.c.u().enqueue(new r8(k03Var, i));
            k03Var.e(this, new a83(this) { // from class: sf2
                public final /* synthetic */ MainActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i3 = i2;
                    MainActivity mainActivity = this.b;
                    SubsonicResponse subsonicResponse = (SubsonicResponse) obj;
                    switch (i3) {
                        case 0:
                            int i4 = MainActivity.e0;
                            if (subsonicResponse != null) {
                                ra0.a();
                                ud3.p0(subsonicResponse.getOpenSubsonic() != null && subsonicResponse.getOpenSubsonic().booleanValue());
                                io1.a(mainActivity);
                                break;
                            } else {
                                ra0.a();
                                if (h12.c(ud3.u(), ud3.v())) {
                                    ExecutorService executorService = io1.a;
                                    qp4 qp4Var = mainActivity.R;
                                    if (qp4Var != null) {
                                        TextView textView = (TextView) qp4Var.b;
                                        textView.setText(app.homemusic.R.string.homemusic_server_offline);
                                        textView.setVisibility(0);
                                    }
                                    String strD2 = ud3.D();
                                    if (strD2 == null || strD2.equals(ud3.v())) {
                                        App.b().getClass();
                                        if (App.c().getLong("server_unreachable", 0L) + 86400000 < System.currentTimeMillis()) {
                                            new sa4().m0(mainActivity.k(), null);
                                        }
                                    } else {
                                        App.b().getClass();
                                        App.c().edit().putLong("next_server_switch", System.currentTimeMillis()).apply();
                                        ud3.H0();
                                        App.p = App.d();
                                        mainActivity.G();
                                        mainActivity.d().a();
                                        v23 v23Var = (v23) ((ss0) mainActivity.U.o).q;
                                        int i5 = v23Var.g().u;
                                        v23Var.p(i5, true);
                                        v23Var.m(i5, null, null);
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            int i6 = MainActivity.e0;
                            ra0.a();
                            if (subsonicResponse != null) {
                                ud3.p0(subsonicResponse.getOpenSubsonic() != null && subsonicResponse.getOpenSubsonic().booleanValue());
                                io1.a(mainActivity);
                                break;
                            } else if (!h12.c(ud3.u(), ud3.v()) && mainActivity.Q == null) {
                                ExecutorService executorService2 = io1.a;
                                qp4 qp4Var2 = mainActivity.R;
                                if (qp4Var2 != null) {
                                    TextView textView2 = (TextView) qp4Var2.b;
                                    textView2.setText(app.homemusic.R.string.homemusic_server_offline);
                                    textView2.setVisibility(0);
                                }
                                App.b().getClass();
                                if (App.c().getLong("server_unreachable", 0L) + 86400000 < System.currentTimeMillis()) {
                                    new sa4().m0(mainActivity.k(), null);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (this.Q != null) {
            ra0.a();
            return;
        }
        App.b().getClass();
        if (App.c().getLong("next_server_switch", 0L) + 15000 >= System.currentTimeMillis() || (strD = ud3.D()) == null || strD.length() == 0 || (strV = ud3.v()) == null || strV.length() == 0) {
            this.S.c.getClass();
            pn4 pn4VarF2 = App.f(false);
            k03 k03Var2 = new k03();
            if (pn4VarF2.c == null) {
                pn4VarF2.c = new gp3(pn4VarF2, 21);
            }
            pn4VarF2.c.u().enqueue(new r8(k03Var2, i));
            final int i3 = 1;
            k03Var2.e(this, new a83(this) { // from class: sf2
                public final /* synthetic */ MainActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i4 = i3;
                    MainActivity mainActivity = this.b;
                    SubsonicResponse subsonicResponse = (SubsonicResponse) obj;
                    switch (i4) {
                        case 0:
                            int i5 = MainActivity.e0;
                            if (subsonicResponse != null) {
                                ra0.a();
                                ud3.p0(subsonicResponse.getOpenSubsonic() != null && subsonicResponse.getOpenSubsonic().booleanValue());
                                io1.a(mainActivity);
                                break;
                            } else {
                                ra0.a();
                                if (h12.c(ud3.u(), ud3.v())) {
                                    ExecutorService executorService = io1.a;
                                    qp4 qp4Var = mainActivity.R;
                                    if (qp4Var != null) {
                                        TextView textView = (TextView) qp4Var.b;
                                        textView.setText(app.homemusic.R.string.homemusic_server_offline);
                                        textView.setVisibility(0);
                                    }
                                    String strD2 = ud3.D();
                                    if (strD2 == null || strD2.equals(ud3.v())) {
                                        App.b().getClass();
                                        if (App.c().getLong("server_unreachable", 0L) + 86400000 < System.currentTimeMillis()) {
                                            new sa4().m0(mainActivity.k(), null);
                                        }
                                    } else {
                                        App.b().getClass();
                                        App.c().edit().putLong("next_server_switch", System.currentTimeMillis()).apply();
                                        ud3.H0();
                                        App.p = App.d();
                                        mainActivity.G();
                                        mainActivity.d().a();
                                        v23 v23Var = (v23) ((ss0) mainActivity.U.o).q;
                                        int i6 = v23Var.g().u;
                                        v23Var.p(i6, true);
                                        v23Var.m(i6, null, null);
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            int i7 = MainActivity.e0;
                            ra0.a();
                            if (subsonicResponse != null) {
                                ud3.p0(subsonicResponse.getOpenSubsonic() != null && subsonicResponse.getOpenSubsonic().booleanValue());
                                io1.a(mainActivity);
                                break;
                            } else if (!h12.c(ud3.u(), ud3.v()) && mainActivity.Q == null) {
                                ExecutorService executorService2 = io1.a;
                                qp4 qp4Var2 = mainActivity.R;
                                if (qp4Var2 != null) {
                                    TextView textView2 = (TextView) qp4Var2.b;
                                    textView2.setText(app.homemusic.R.string.homemusic_server_offline);
                                    textView2.setVisibility(0);
                                }
                                App.b().getClass();
                                if (App.c().getLong("server_unreachable", 0L) + 86400000 < System.currentTimeMillis()) {
                                    new sa4().m0(mainActivity.k(), null);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        String strV2 = ud3.v();
        this.S.c.getClass();
        pn4 pn4VarE = App.e(ud3.v());
        k03 k03Var3 = new k03();
        if (pn4VarE.c == null) {
            pn4VarE.c = new gp3(pn4VarE, 21);
        }
        pn4VarE.c.u().enqueue(new r8(k03Var3, i));
        this.Q = k03Var3;
        k03Var3.e(this, new z6(this, k03Var3, strV2));
    }

    public final void H() {
        u52.f();
        stopService(new Intent(this, (Class<?>) LanReceiverService.class));
        HashMap map = n61.a;
        synchronized (n61.class) {
            n61.a.clear();
            n61.b.clear();
            n61.c.clear();
            n61.d++;
            n61.b();
        }
        Context applicationContext = getApplicationContext();
        ExecutorService executorService = io1.a;
        applicationContext.getClass();
        xr1.a();
        WebView webView = hw.g;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.removeJavascriptInterface("HomeMusicAndroid");
            webView.destroy();
        }
        hw.g = null;
        hw.h = null;
        hw.i = null;
        rr1.m();
        applicationContext.getSharedPreferences("homemusic_notifier", 0).edit().clear().apply();
        try {
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
        } catch (Throwable th) {
            Log.w("HomeMusic", "Cannot clear Hub cookies", th);
        }
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
        bl2 bl2Var = this.P;
        WeakReference weakReference = bo2.a;
        if (bl2Var != null) {
            bl2Var.f(new jr1(bl2Var, 2), gq0.n);
        }
        d().a();
        x();
    }

    public final void I(boolean z) {
        View view = (View) ((au) this.V.n).c;
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void J() {
        float f = getResources().getDisplayMetrics().density;
        if (xa3.u("hide_bottom_navbar_on_portrait", false)) {
            this.U.p(false);
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((au) this.V.n).b;
            bottomSheetBehavior.A = false;
            bottomSheetBehavior.I((int) (56.0f * f));
            this.U.q(this, !this.X);
            return;
        }
        boolean z = this.X;
        zg5 zg5Var = this.V;
        if (!z) {
            BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) ((au) zg5Var.n).b;
            bottomSheetBehavior2.A = false;
            bottomSheetBehavior2.I((int) (136.0f * f));
            this.U.p(true);
            this.U.q(this, true);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior) ((au) zg5Var.n).b;
        bottomSheetBehavior3.A = false;
        bottomSheetBehavior3.I((int) (56.0f * f));
        BottomSheetBehavior bottomSheetBehavior4 = this.W;
        if (bottomSheetBehavior4 != null) {
            bottomSheetBehavior4.A = true;
        }
        this.U.p(false);
        this.U.q(this, false);
    }

    public final void K() {
        ss0 ss0Var = (ss0) this.U.o;
        int i = getResources().getConfiguration().orientation == 2 ? 1 : 0;
        boolean zU = xa3.u("enable_drawer_on_portrait", false);
        DrawerLayout drawerLayout = (DrawerLayout) ss0Var.p;
        if (zU) {
            drawerLayout.setDrawerLockMode(0);
        } else {
            drawerLayout.setDrawerLockMode(i ^ 1);
        }
    }

    @Override // defpackage.df, defpackage.k70, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (z52.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        NetworkInfo activeNetworkInfo;
        int i;
        int i2 = 24;
        (Build.VERSION.SDK_INT >= 31 ? new tj4(this) : new pz1(i2, this)).v();
        kb4.T(this);
        View viewFindViewById = findViewById(R.id.content);
        cn cnVar = new cn(i2, viewFindViewById);
        WeakHashMap weakHashMap = j65.a;
        a65.c(viewFindViewById, cnVar);
        A(bundle);
        char c = 0;
        View viewInflate = getLayoutInflater().inflate(app.homemusic.R.layout.activity_main, (ViewGroup) null, false);
        int i3 = app.homemusic.R.id.bottom_navigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) uo.s(viewInflate, app.homemusic.R.id.bottom_navigation);
        if (bottomNavigationView != null) {
            if (((FrameLayout) uo.s(viewInflate, app.homemusic.R.id.bottom_navigation_frame)) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
                if (((FragmentContainerView) uo.s(viewInflate, app.homemusic.R.id.nav_host_fragment)) == null) {
                    i3 = app.homemusic.R.id.nav_host_fragment;
                } else if (((NavigationView) uo.s(viewInflate, app.homemusic.R.id.nav_view)) != null) {
                    int i4 = app.homemusic.R.id.offline_mode_text_view;
                    TextView textView = (TextView) uo.s(viewInflate, app.homemusic.R.id.offline_mode_text_view);
                    if (textView != null) {
                        i4 = app.homemusic.R.id.player_bottom_sheet;
                        FrameLayout frameLayout = (FrameLayout) uo.s(viewInflate, app.homemusic.R.id.player_bottom_sheet);
                        if (frameLayout != null) {
                            this.R = new qp4(drawerLayout, bottomNavigationView, textView, frameLayout);
                            setContentView(drawerLayout);
                            e75 e75VarD = d();
                            b75 b75VarR = gh0.r(this);
                            tf0 tf0VarQ = gh0.q(this);
                            b75VarR.getClass();
                            tf0VarQ.getClass();
                            bq4 bq4Var = new bq4(e75VarD, b75VarR, tf0VarQ);
                            i30 i30VarA = kx3.a(vf2.class);
                            String strB = i30VarA.b();
                            if (strB == null) {
                                kf2.n("Local and anonymous classes can not be ViewModels");
                                return;
                            }
                            this.S = (vf2) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                            this.Y = new c12(this);
                            this.a0 = new v9(this);
                            registerReceiver(this.a0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            int i5 = 1;
                            this.X = getResources().getConfiguration().orientation == 2;
                            md1 md1VarK = k();
                            View viewFindViewById2 = findViewById(app.homemusic.R.id.player_bottom_sheet);
                            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(viewFindViewById2);
                            this.W = bottomSheetBehaviorC;
                            au auVar = new au(bottomSheetBehaviorC, viewFindViewById2, md1VarK);
                            zg5 zg5Var = new zg5();
                            zg5Var.n = auVar;
                            this.V = zg5Var;
                            ((BottomSheetBehavior) auVar.b).w(this.d0);
                            au auVar2 = (au) this.V.n;
                            ld1 ld1Var = (ld1) auVar2.d;
                            ld1Var.getClass();
                            po poVar = new po(ld1Var);
                            poVar.j(app.homemusic.R.id.player_bottom_sheet, (xi3) auVar2.e, "PlayerBottomSheet");
                            poVar.e(false);
                            zg5 zg5Var2 = this.V;
                            vf2 vf2Var = this.S;
                            au auVar3 = (au) zg5Var2.n;
                            Handler handler = (Handler) auVar3.f;
                            int i6 = 3;
                            if (!auVar3.a && (i = ((BottomSheetBehavior) auVar3.b).Y) != 3 && i != 2) {
                                Runnable runnable = (Runnable) auVar3.g;
                                if (runnable != null) {
                                    handler.removeCallbacks(runnable);
                                }
                                k6 k6Var = new k6(12, auVar3, vf2Var);
                                auVar3.g = k6Var;
                                handler.postDelayed(k6Var, 100L);
                            }
                            NavHostFragment navHostFragment = (NavHostFragment) k().C(app.homemusic.R.id.nav_host_fragment);
                            Objects.requireNonNull(navHostFragment);
                            this.T = navHostFragment.h0();
                            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) findViewById(app.homemusic.R.id.bottom_navigation);
                            FrameLayout frameLayout2 = (FrameLayout) findViewById(app.homemusic.R.id.bottom_navigation_frame);
                            DrawerLayout drawerLayout2 = (DrawerLayout) findViewById(app.homemusic.R.id.drawer_layout);
                            NavigationView navigationView = (NavigationView) findViewById(app.homemusic.R.id.nav_view);
                            v23 v23Var = this.T;
                            ss0 ss0Var = new ss0();
                            ss0Var.n = bottomNavigationView2;
                            ss0Var.o = frameLayout2;
                            ss0Var.p = drawerLayout2;
                            ss0Var.q = v23Var;
                            om1 om1Var = new om1(c, 13);
                            om1Var.o = ss0Var;
                            this.U = om1Var;
                            final BottomSheetBehavior bottomSheetBehavior = this.W;
                            v23Var.b(new e23() { // from class: z33
                                @Override // defpackage.e23
                                public final void a(v23 v23Var2, r23 r23Var) {
                                    int i7 = r23Var.u;
                                    boolean z = i7 == app.homemusic.R.id.homeFragment || i7 == app.homemusic.R.id.libraryFragment || i7 == app.homemusic.R.id.downloadFragment || i7 == app.homemusic.R.id.hubFragment || i7 == app.homemusic.R.id.albumCatalogueFragment || i7 == app.homemusic.R.id.artistCatalogueFragment || i7 == app.homemusic.R.id.genreCatalogueFragment || i7 == app.homemusic.R.id.playlistCatalogueFragment;
                                    BottomSheetBehavior bottomSheetBehavior2 = bottomSheetBehavior;
                                    int i8 = bottomSheetBehavior2.Y;
                                    if (z && i8 == 3) {
                                        bottomSheetBehavior2.J(4);
                                    }
                                }
                            });
                            bottomNavigationView2.getClass();
                            bottomNavigationView2.setOnItemSelectedListener(new ss2(6, v23Var));
                            v23Var.b(new n43(new WeakReference(bottomNavigationView2), v23Var, i5));
                            navigationView.getClass();
                            navigationView.setNavigationItemSelectedListener(new bt2(v23Var, navigationView));
                            v23Var.b(new n43(new WeakReference(navigationView), v23Var, c));
                            v83 bd1Var = new bd1(this, this.W.Y == 3);
                            i().a(this, bd1Var);
                            this.W.w(new wt(i6, bd1Var));
                            if (ud3.y() == null && (ud3.J() == null || ud3.B() == null)) {
                                x();
                            } else {
                                v();
                            }
                            K();
                            App.b().getClass();
                            if (App.c().getBoolean("wifi_only", false) && (activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1) {
                                new ca0().m0(k(), null);
                            }
                            if (ud3.J() != null || ud3.y() != null) {
                                this.S.c.getClass();
                                k03 k03Var = new k03();
                                pn4 pn4VarF = App.f(false);
                                if (pn4VarF.c == null) {
                                    pn4VarF.c = new gp3(pn4VarF, 21);
                                }
                                gp3 gp3Var = pn4VarF.c;
                                gp3Var.getClass();
                                Log.d("SystemClient", "getOpenSubsonicExtensions()");
                                ((gq4) gp3Var.p).a(((pn4) gp3Var.o).f()).enqueue(new ck(k03Var, 5));
                                k03Var.e(this, new lj(i5));
                            }
                            if (pt0.a.compareAndSet(false, true)) {
                                new Thread(new lf(getApplicationContext(), i6), "DownloadRepair").start();
                            }
                            if (x6.a.compareAndSet(false, true)) {
                                new Thread(new u6(c), "AlbumArtistBackfill").start();
                            }
                            z(getIntent());
                            String stringExtra = getIntent().getStringExtra("LOGIN_ACTIVITY_INTENT");
                            if ("open_legacy_login_fragment".equals(stringExtra)) {
                                x();
                            } else if ("open_legacy_settings_fragment".equals(stringExtra)) {
                                w();
                            }
                            if (Build.VERSION.SDK_INT >= 25) {
                                ShortcutManager shortcutManagerF = kz0.f(getSystemService(kz0.g()));
                                Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
                                intent.setAction("android.intent.action.VIEW");
                                ShortcutInfo shortcutInfoBuild = kz0.d(this).setShortLabel(getString(app.homemusic.R.string.la_shortcut_label)).setLongLabel(getString(app.homemusic.R.string.la_shortcut_label)).setIcon(Icon.createWithResource(this, app.homemusic.R.mipmap.ic_launcher)).setIntents(new Intent[]{intent}).build();
                                if (shortcutManagerF != null) {
                                    shortcutManagerF.setDynamicShortcuts(Collections.singletonList(shortcutInfoBuild));
                                }
                            }
                            ExecutorService executorService = io1.a;
                            ((BottomNavigationView) this.R.a).setLabelVisibilityMode(1);
                            gi1.m(this);
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            i93 i93Var = new i93(HubSyncWorker.class, 15L, TimeUnit.MINUTES);
                            ((dd5) i93Var.b).j = new mc0(new o53(null), 2, false, false, false, false, -1L, -1L, q40.T0(new LinkedHashSet()));
                            sc5.b(applicationContext).a("homemusic_hub_sync", (kf3) i93Var.b());
                            Context applicationContext2 = getApplicationContext();
                            applicationContext2.getClass();
                            gi1.W(applicationContext2);
                            rs1.g();
                            return;
                        }
                    }
                    i3 = i4;
                } else {
                    i3 = app.homemusic.R.id.nav_view;
                }
            } else {
                i3 = app.homemusic.R.id.bottom_navigation_frame;
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.a0);
        if (isFinishing()) {
            mm3.g = null;
        }
        if (!isChangingConfigurations() && ra0.c == Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            AtomicInteger atomicInteger = ra0.a;
            ra0.c = (((long) ud3.x()) * 1000) + 1000 + jElapsedRealtime;
        }
        this.R = null;
    }

    @Override // defpackage.l70, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        z(intent);
        s();
        r();
    }

    @Override // defpackage.nc1, defpackage.l70, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z = this.O;
        B(i, strArr, iArr);
        if (!z || this.O) {
            return;
        }
        if (this.n.h.compareTo(r92.r) >= 0) {
            G();
        }
    }

    @Override // defpackage.nc1, android.app.Activity
    public final void onResume() {
        C();
        G();
        K();
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            if (iDataSize > 409600) {
                Log.w("MainActivityLogs", "Saved instance state is " + iDataSize + " bytes (limit 409600); clearing it to avoid TransactionTooLargeException on background (#688)");
                bundle.clear();
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onStart() {
        D();
        G();
        gq0 gq0Var = gq0.n;
        bl2 bl2Var = this.P;
        WeakReference weakReference = bo2.a;
        if (bl2Var != null) {
            bl2Var.f(new jr1(bl2Var, 3), gq0Var);
        }
        this.P.f(new xs1(this, 2), gq0Var);
        s();
        r();
        ExecutorService executorService = io1.a;
        if (pt0.c()) {
            rs1 rs1Var = rs1.a;
            rs1.d.execute(new ns1(0, n61.d()));
            b00.a.e();
            boolean z = xr1.a;
            synchronized (xr1.class) {
                xr1.d = getApplicationContext();
                if (!xr1.a) {
                    xr1.a = true;
                    Thread thread = new Thread(new u6(5), "HubEvents");
                    thread.setDaemon(true);
                    thread.start();
                    xr1.c = thread;
                }
            }
            if (getSharedPreferences("homemusic_notifier", 0).getBoolean("pending_kept_sync", false)) {
                gi1.U(this);
            }
            HubUpdater.checkOnStart(this);
        }
    }

    @Override // defpackage.df, defpackage.nc1, android.app.Activity
    public final void onStop() {
        this.Q = null;
        ExecutorService executorService = io1.a;
        xr1.a();
        E();
    }

    public final void q() {
        au auVar = (au) this.V.n;
        Handler handler = (Handler) auVar.f;
        Runnable runnable = (Runnable) auVar.g;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        a0 a0Var = new a0(10, auVar);
        auVar.g = a0Var;
        handler.postDelayed(a0Var, 100L);
    }

    public final void r() {
        if (this.c0 && y()) {
            this.c0 = false;
            v23 v23Var = this.T;
            int i = 1;
            if (v23Var != null && v23Var.g() != null && this.T.g().u == app.homemusic.R.id.settingsFragment) {
                this.T.p(app.homemusic.R.id.settingsFragment, true);
            }
            View viewFindViewById = findViewById(app.homemusic.R.id.player_bottom_sheet);
            if (viewFindViewById == null || viewFindViewById.isLaidOut()) {
                t();
            } else {
                viewFindViewById.post(new xs1(this, i));
            }
        }
    }

    public final void s() {
        Intent intent = this.b0;
        if (intent == null) {
            return;
        }
        this.b0 = null;
        String stringExtra = intent.getStringExtra("EXTRA_DOWNLOAD_URI");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        Uri uri = Uri.parse(stringExtra);
        String stringExtra2 = intent.getStringExtra("EXTRA_DOWNLOAD_MEDIA_ID");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = uri.toString();
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_DOWNLOAD_TITLE");
        String stringExtra4 = intent.getStringExtra("EXTRA_DOWNLOAD_ARTIST");
        String stringExtra5 = intent.getStringExtra("EXTRA_DOWNLOAD_ALBUM");
        int intExtra = intent.getIntExtra("EXTRA_DOWNLOAD_DURATION", 0);
        Bundle bundle = new Bundle();
        bundle.putString("id", stringExtra2);
        bundle.putString("title", stringExtra3);
        bundle.putString("artist", stringExtra4);
        bundle.putString("album", stringExtra5);
        bundle.putString("uri", uri.toString());
        bundle.putString("type", "music");
        bundle.putInt("duration", intExtra);
        co2 co2Var = new co2();
        co2Var.H = bundle;
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        if (!TextUtils.isEmpty(stringExtra3)) {
            co2Var.a = stringExtra3;
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            co2Var.b = stringExtra4;
        }
        if (!TextUtils.isEmpty(stringExtra5)) {
            co2Var.c = stringExtra5;
        }
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        stringExtra2.getClass();
        do2 do2Var = new do2(co2Var);
        yc5 yc5Var = new yc5();
        yc5Var.n = uri;
        yc5Var.p = bundle;
        cn2 cn2Var2 = new cn2(yc5Var);
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        gn2 gn2Var = new gn2(stringExtra2, new wm2(um2Var), new bn2(uri, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2Var, cn2Var2);
        bl2 bl2Var = this.P;
        WeakReference weakReference = bo2.a;
        List listSingletonList = Collections.singletonList(gi1.N(gn2Var));
        Handler handler = u52.a;
        listSingletonList.getClass();
        if (u52.r(listSingletonList, "replace", 0, 0L) || bl2Var == null) {
            return;
        }
        bl2Var.f(new ws1(21, bl2Var, gn2Var), gq0.n);
    }

    public final void t() {
        zg5 zg5Var;
        if (isFinishing() || isDestroyed() || (zg5Var = this.V) == null) {
            return;
        }
        au auVar = (au) zg5Var.n;
        auVar.a = true;
        Runnable runnable = (Runnable) auVar.g;
        if (runnable != null) {
            ((Handler) auVar.f).removeCallbacks(runnable);
            auVar.g = null;
        }
        auVar.a(1.0f);
        ((BottomSheetBehavior) auVar.b).J(3);
    }

    public final FrameLayout u() {
        int i = this.W.Y;
        if (((FrameLayout) this.R.c).getVisibility() == 0 && i == 4) {
            return (FrameLayout) this.R.c;
        }
        if (i == 3 || this.X || ((BottomNavigationView) this.R.a).getVisibility() != 0) {
            return null;
        }
        return (BottomNavigationView) this.R.a;
    }

    public final void v() {
        c12 c12Var;
        this.S.getClass();
        ((au) this.V.n).d(vf2.c());
        new mm3().i(getApplicationContext());
        w();
        ik ikVar = this.Z;
        if (ikVar != null && (c12Var = this.Y) != null) {
            c12Var.i(ikVar);
            this.Z = null;
        }
        r();
        String str = io1.c;
        if (str == null) {
            return;
        }
        io1.c = null;
        js1.a(this, str);
    }

    public final void w() {
        this.U.p(true);
        v23 v23Var = (v23) ((ss0) this.U.o).q;
        int i = v23Var.g().u;
        if (i == app.homemusic.R.id.landingFragment) {
            v23Var.m(app.homemusic.R.id.action_landingFragment_to_homeFragment, null, null);
        } else if (i == app.homemusic.R.id.loginFragment) {
            v23Var.m(app.homemusic.R.id.action_loginFragment_to_homeFragment, null, null);
        }
    }

    public final void x() {
        this.W.J(5);
        this.U.p(false);
        I(false);
        v23 v23Var = (v23) ((ss0) this.U.o).q;
        int i = v23Var.g().u;
        if (i == app.homemusic.R.id.landingFragment) {
            v23Var.m(app.homemusic.R.id.action_landingFragment_to_loginFragment, null, null);
        } else if (i == app.homemusic.R.id.settingsFragment) {
            v23Var.m(app.homemusic.R.id.action_settingsFragment_to_loginFragment, null, null);
        } else if (i == app.homemusic.R.id.homeFragment) {
            v23Var.m(app.homemusic.R.id.action_homeFragment_to_loginFragment, null, null);
        }
    }

    public final void z(Intent intent) {
        if (intent == null) {
            return;
        }
        if ("com.eddyizm.tempus.action.OPEN_NOW_PLAYING".equals(intent.getAction())) {
            this.c0 = true;
            intent.setAction(null);
        }
        if ("com.eddyizm.tempus.action.PLAY_EXTERNAL_DOWNLOAD".equals(intent.getAction()) || intent.hasExtra("EXTRA_DOWNLOAD_URI")) {
            this.b0 = new Intent(intent);
        }
        ExecutorService executorService = io1.a;
        String stringExtra = intent.getStringExtra("homemusic_hub_route");
        if (stringExtra != null) {
            intent.removeExtra("homemusic_hub_route");
            if (pt0.c()) {
                js1.a(this, stringExtra);
                return;
            } else {
                io1.c = stringExtra;
                return;
            }
        }
        ik ikVarS = l93.S(intent.getData());
        if (ikVarS == null) {
            return;
        }
        if (!y()) {
            this.Z = ikVarS;
            intent.setData(null);
        } else {
            c12 c12Var = this.Y;
            if (c12Var != null) {
                c12Var.i(ikVarS);
            }
            intent.setData(null);
        }
    }
}
