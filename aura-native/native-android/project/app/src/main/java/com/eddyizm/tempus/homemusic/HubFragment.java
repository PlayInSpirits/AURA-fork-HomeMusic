package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import defpackage.as1;
import defpackage.bd1;
import defpackage.bl2;
import defpackage.bs1;
import defpackage.cn;
import defpackage.cs1;
import defpackage.dc1;
import defpackage.e35;
import defpackage.er1;
import defpackage.es1;
import defpackage.fs1;
import defpackage.g12;
import defpackage.gb;
import defpackage.gs1;
import defpackage.h12;
import defpackage.hs1;
import defpackage.hw;
import defpackage.io1;
import defpackage.is1;
import defpackage.j95;
import defpackage.jr1;
import defpackage.js1;
import defpackage.k03;
import defpackage.kb4;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kq4;
import defpackage.lr1;
import defpackage.m95;
import defpackage.nz2;
import defpackage.q5;
import defpackage.qm4;
import defpackage.qp4;
import defpackage.rr1;
import defpackage.ud3;
import defpackage.uo;
import defpackage.up0;
import defpackage.wd1;
import defpackage.wt;
import defpackage.xk0;
import defpackage.xl;
import defpackage.xm4;
import defpackage.xt1;
import defpackage.yr1;
import defpackage.zr1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubFragment extends kc1 {
    public static final List y0;
    public static final String[] z0;
    public up0 l0;
    public MainActivity m0;
    public WebView n0;
    public boolean p0;
    public long q0;
    public ValueCallback r0;
    public final dc1 s0;
    public final wt u0;
    public String o0 = "/search";
    public final bd1 t0 = new bd1(3, this);
    public final cs1 v0 = new cs1(0, this);
    public final hs1 w0 = new hs1(this);
    public final gs1 x0 = new gs1(this);

    static {
        List listP = gb.P(new fs1(R.string.homemusic_tab_catalog, "/search"), new fs1(R.string.homemusic_tab_downloads, "/downloads"), new fs1(R.string.homemusic_tab_assistant, "/assistant"), new fs1(R.string.homemusic_tab_files, "/library"));
        y0 = listP;
        z0 = new String[listP.size()];
    }

    public HubFragment() {
        int i = 2;
        this.s0 = W(new cn(16, this), new q5(i));
        this.u0 = new wt(i, this);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.m0 = (MainActivity) X();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_hub, viewGroup, false);
        int i = R.id.hub_error;
        LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.hub_error);
        if (linearLayout != null) {
            i = R.id.hub_error_text;
            TextView textView = (TextView) uo.s(viewInflate, R.id.hub_error_text);
            if (textView != null) {
                i = R.id.hub_menu_button;
                ImageButton imageButton = (ImageButton) uo.s(viewInflate, R.id.hub_menu_button);
                if (imageButton != null) {
                    i = R.id.hub_progress;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) uo.s(viewInflate, R.id.hub_progress);
                    if (linearProgressIndicator != null) {
                        i = R.id.hub_retry_button;
                        MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.hub_retry_button);
                        if (materialButton != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                            i = R.id.hub_settings_button;
                            MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.hub_settings_button);
                            if (materialButton2 != null) {
                                i = R.id.hub_tabs;
                                TabLayout tabLayout = (TabLayout) uo.s(viewInflate, R.id.hub_tabs);
                                if (tabLayout != null) {
                                    i = R.id.hub_web_container;
                                    FrameLayout frameLayout = (FrameLayout) uo.s(viewInflate, R.id.hub_web_container);
                                    if (frameLayout != null) {
                                        this.l0 = new up0(linearLayout2, linearLayout, textView, imageButton, linearProgressIndicator, materialButton, materialButton2, tabLayout, frameLayout);
                                        linearLayout2.getClass();
                                        return linearLayout2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        xt1.b = null;
        xt1.c = null;
        xt1.d = null;
        xt1.e = null;
        xt1.f = null;
        xt1.g = null;
        ValueCallback valueCallback = this.r0;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.r0 = null;
        WebView webView = this.n0;
        if (webView != null) {
            MainActivity mainActivity = this.m0;
            if (mainActivity == null) {
                h12.Q("activity");
                throw null;
            }
            Context applicationContext = mainActivity.getApplicationContext();
            applicationContext.getClass();
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
            MutableContextWrapper mutableContextWrapper = hw.h;
            if (mutableContextWrapper != null) {
                mutableContextWrapper.setBaseContext(applicationContext);
            }
        }
        this.n0 = null;
        this.l0 = null;
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        bundle.putString("hub_route", this.o0);
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        MainActivity mainActivity = this.m0;
        if (mainActivity == null) {
            h12.Q("activity");
            throw null;
        }
        mainActivity.J();
        MainActivity mainActivity2 = this.m0;
        if (mainActivity2 == null) {
            h12.Q("activity");
            throw null;
        }
        mainActivity2.I(!xt1.h);
        MainActivity mainActivity3 = this.m0;
        if (mainActivity3 == null) {
            h12.Q("activity");
            throw null;
        }
        mainActivity3.W.w(this.u0);
        MainActivity mainActivity4 = this.m0;
        if (mainActivity4 == null) {
            h12.Q("activity");
            throw null;
        }
        ((BottomNavigationView) mainActivity4.R.a).addOnLayoutChangeListener(this.v0);
        up0 up0Var = this.l0;
        up0Var.getClass();
        ((LinearLayout) up0Var.a).post(new as1(this, 1));
        WeakReference weakReference = lr1.a;
        MainActivity mainActivity5 = this.m0;
        if (mainActivity5 == null) {
            h12.Q("activity");
            throw null;
        }
        bl2 bl2Var = mainActivity5.P;
        if (bl2Var == null) {
            return;
        }
        bl2Var.f(new jr1(bl2Var, 0), ud3.w(mainActivity5));
    }

    @Override // defpackage.kc1
    public final void S() {
        MainActivity mainActivity = this.m0;
        if (mainActivity == null) {
            h12.Q("activity");
            throw null;
        }
        mainActivity.I(true);
        MainActivity mainActivity2 = this.m0;
        if (mainActivity2 == null) {
            h12.Q("activity");
            throw null;
        }
        BottomSheetBehavior bottomSheetBehavior = mainActivity2.W;
        bottomSheetBehavior.j0.remove(this.u0);
        MainActivity mainActivity3 = this.m0;
        if (mainActivity3 == null) {
            h12.Q("activity");
            throw null;
        }
        qp4 qp4Var = mainActivity3.R;
        if (qp4Var != null) {
            ((BottomNavigationView) qp4Var.a).removeOnLayoutChangeListener(this.v0);
        }
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        xk0 xk0Var;
        view.getClass();
        up0 up0Var = this.l0;
        up0Var.getClass();
        TabLayout tabLayout = (TabLayout) up0Var.g;
        Iterator it = y0.iterator();
        while (true) {
            final int i = 0;
            if (!it.hasNext()) {
                is1 is1Var = new is1(0, this);
                ArrayList arrayList = tabLayout.a0;
                if (!arrayList.contains(is1Var)) {
                    arrayList.add(is1Var);
                }
                final int i2 = 2;
                if (r().getConfiguration().orientation == 2) {
                    up0 up0Var2 = this.l0;
                    up0Var2.getClass();
                    ((ImageButton) up0Var2.i).setVisibility(0);
                    up0 up0Var3 = this.l0;
                    up0Var3.getClass();
                    ((ImageButton) up0Var3.i).setOnClickListener(new View.OnClickListener(this) { // from class: ds1
                        public final /* synthetic */ HubFragment o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i3 = i;
                            HubFragment hubFragment = this.o;
                            switch (i3) {
                                case 0:
                                    MainActivity mainActivity = hubFragment.m0;
                                    if (mainActivity == null) {
                                        h12.Q("activity");
                                        throw null;
                                    }
                                    DrawerLayout drawerLayout = (DrawerLayout) mainActivity.findViewById(R.id.drawer_layout);
                                    if (drawerLayout != null) {
                                        drawerLayout.q();
                                        return;
                                    }
                                    return;
                                case 1:
                                    hubFragment.h0(hubFragment.o0, true);
                                    return;
                                default:
                                    MainActivity mainActivity2 = hubFragment.m0;
                                    if (mainActivity2 != null) {
                                        mainActivity2.T.m(R.id.settingsFragment, null, null);
                                        return;
                                    } else {
                                        h12.Q("activity");
                                        throw null;
                                    }
                            }
                        }
                    });
                }
                up0 up0Var4 = this.l0;
                up0Var4.getClass();
                final int i3 = 1;
                ((MaterialButton) up0Var4.e).setOnClickListener(new View.OnClickListener(this) { // from class: ds1
                    public final /* synthetic */ HubFragment o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i3;
                        HubFragment hubFragment = this.o;
                        switch (i4) {
                            case 0:
                                MainActivity mainActivity = hubFragment.m0;
                                if (mainActivity == null) {
                                    h12.Q("activity");
                                    throw null;
                                }
                                DrawerLayout drawerLayout = (DrawerLayout) mainActivity.findViewById(R.id.drawer_layout);
                                if (drawerLayout != null) {
                                    drawerLayout.q();
                                    return;
                                }
                                return;
                            case 1:
                                hubFragment.h0(hubFragment.o0, true);
                                return;
                            default:
                                MainActivity mainActivity2 = hubFragment.m0;
                                if (mainActivity2 != null) {
                                    mainActivity2.T.m(R.id.settingsFragment, null, null);
                                    return;
                                } else {
                                    h12.Q("activity");
                                    throw null;
                                }
                        }
                    }
                });
                up0 up0Var5 = this.l0;
                up0Var5.getClass();
                ((MaterialButton) up0Var5.f).setOnClickListener(new View.OnClickListener(this) { // from class: ds1
                    public final /* synthetic */ HubFragment o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i2;
                        HubFragment hubFragment = this.o;
                        switch (i4) {
                            case 0:
                                MainActivity mainActivity = hubFragment.m0;
                                if (mainActivity == null) {
                                    h12.Q("activity");
                                    throw null;
                                }
                                DrawerLayout drawerLayout = (DrawerLayout) mainActivity.findViewById(R.id.drawer_layout);
                                if (drawerLayout != null) {
                                    drawerLayout.q();
                                    return;
                                }
                                return;
                            case 1:
                                hubFragment.h0(hubFragment.o0, true);
                                return;
                            default:
                                MainActivity mainActivity2 = hubFragment.m0;
                                if (mainActivity2 != null) {
                                    mainActivity2.T.m(R.id.settingsFragment, null, null);
                                    return;
                                } else {
                                    h12.Q("activity");
                                    throw null;
                                }
                        }
                    }
                });
                MainActivity mainActivity = this.m0;
                if (mainActivity == null) {
                    h12.Q("activity");
                    throw null;
                }
                WebView webView = hw.g;
                if (webView != null) {
                    MutableContextWrapper mutableContextWrapper = hw.h;
                    if (mutableContextWrapper != null) {
                        mutableContextWrapper.setBaseContext(mainActivity);
                    }
                    ViewParent parent = webView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    xk0Var = new xk0(webView, false);
                } else {
                    MutableContextWrapper mutableContextWrapper2 = new MutableContextWrapper(mainActivity);
                    WebView webView2 = new WebView(mutableContextWrapper2);
                    webView2.setBackgroundColor(Color.parseColor("#0B0B0B"));
                    WebSettings settings = webView2.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setDatabaseEnabled(true);
                    settings.setAllowFileAccess(false);
                    settings.setAllowContentAccess(true);
                    settings.setMediaPlaybackRequiresUserGesture(true);
                    settings.setMixedContentMode(1);
                    settings.setUserAgentString(settings.getUserAgentString() + " HomeMusicAndroid/1.14.7");
                    CookieManager.getInstance().setAcceptCookie(true);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView2, false);
                    webView2.addJavascriptInterface(xt1.a, "HomeMusicAndroid");
                    if (g12.C("DOCUMENT_START_SCRIPT")) {
                        Set setS = kb4.S("*");
                        int i4 = j95.a;
                        if (!m95.b.b()) {
                            er1.l("This method is not supported by the current version of the framework and the current WebView APK");
                            return;
                        }
                    }
                    hw.g = webView2;
                    hw.h = mutableContextWrapper2;
                    xk0Var = new xk0(webView2, true);
                }
                WebView webView3 = (WebView) xk0Var.p;
                this.n0 = webView3;
                up0 up0Var6 = this.l0;
                up0Var6.getClass();
                ((FrameLayout) up0Var6.h).addView(webView3, 0, new FrameLayout.LayoutParams(-1, -1));
                webView3.setWebViewClient(this.w0);
                webView3.setWebChromeClient(this.x0);
                xt1.b = new yr1(this, i3);
                xt1.c = new es1(this, 0);
                xt1.d = new es1(this, 1);
                xt1.e = new zr1(this, i2);
                xt1.f = new yr1(this, i);
                xt1.g = new zr1(this, i);
                MainActivity mainActivity2 = this.m0;
                if (mainActivity2 == null) {
                    h12.Q("activity");
                    throw null;
                }
                hw.c(mainActivity2);
                MainActivity mainActivity3 = this.m0;
                if (mainActivity3 == null) {
                    h12.Q("activity");
                    throw null;
                }
                mainActivity3.i().a(v(), this.t0);
                k03 k03Var = js1.a;
                String string = (String) k03Var.d();
                if (string != null) {
                    k03Var.k(null);
                }
                if (string == null) {
                    Bundle bundle2 = this.s;
                    if (bundle2 == null || (string = bundle2.getString("route")) == null) {
                        string = null;
                    } else {
                        Bundle bundle3 = this.s;
                        if (bundle3 != null) {
                            bundle3.remove("route");
                        }
                    }
                }
                String string2 = bundle != null ? bundle.getString("hub_route") : null;
                if (string != null) {
                    h0(string, false);
                } else if (xk0Var.o || hw.i == null) {
                    if (string2 == null && (string2 = z0[0]) == null) {
                        string2 = ((fs1) y0.get(0)).b;
                    }
                    if (AURAVersion.pendingSearch) {
                        AURAVersion.pendingSearch = false;
                        string2 = "/search";
                    }
                    h0(string2, false);
                } else {
                    String strJ = xl.J(webView3.getUrl());
                    if (strJ == null) {
                        strJ = this.o0;
                    }
                    if (AURAVersion.pendingSearch) {
                        AURAVersion.pendingSearch = false;
                        strJ = "/search";
                    }
                    j0(strJ);
                }
                k03Var.e(v(), new wd1(new zr1(this, i3), 4));
                return;
            }
            fs1 fs1Var = (fs1) it.next();
            kq4 kq4VarG = tabLayout.g();
            int i5 = fs1Var.a;
            TabLayout tabLayout2 = kq4VarG.d;
            if (tabLayout2 == null) {
                kf2.n("Tab not attached to a TabLayout");
                return;
            } else {
                kq4VarG.a(tabLayout2.getResources().getText(i5));
                tabLayout.a(kq4VarG, false);
                e35.S(kq4VarG.e, null);
            }
        }
    }

    public final void h0(String str, boolean z) {
        this.o0 = str;
        k0(null);
        m0(true);
        io1.a.execute(new bs1(this, z, str, 0));
    }

    public final void i0(String str) {
        WebView webView = this.n0;
        if (webView == null) {
            return;
        }
        if (hw.i == null) {
            h0(str, false);
            return;
        }
        if (h12.c(xl.J(webView.getUrl()), str)) {
            return;
        }
        webView.evaluateJavascript("window.location.hash = " + rr1.c.j(str) + ";", null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008a A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:31:0x006a, B:33:0x0070, B:35:0x0076, B:37:0x007a, B:38:0x007e, B:39:0x0085, B:43:0x008a), top: B:54:0x006a }] */
    public final void j0(String str) {
        int i;
        this.o0 = str;
        str.getClass();
        String strH0 = qm4.H0(str, '?');
        boolean z = false;
        if (xm4.k0(strH0, "/search", false) || xm4.k0(strH0, "/artist/", false) || xm4.k0(strH0, "/album/", false)) {
            i = 0;
        } else if (xm4.k0(strH0, "/downloads", false)) {
            i = 1;
        } else if (xm4.k0(strH0, "/assistant", false)) {
            i = 2;
        } else {
            i = (xm4.k0(strH0, "/library", false) || xm4.k0(strH0, "/upload", false) || xm4.k0(strH0, "/playlists", false)) ? 3 : -1;
        }
        if (i >= 0) {
            z0[i] = str;
        }
        up0 up0Var = this.l0;
        if (up0Var != null) {
            TabLayout tabLayout = (TabLayout) up0Var.g;
            this.p0 = true;
            if (i >= 0) {
                try {
                    if (tabLayout.getSelectedTabPosition() != i) {
                        kq4 kq4VarF = tabLayout.f(i);
                        if (kq4VarF != null) {
                            TabLayout tabLayout2 = kq4VarF.d;
                            if (tabLayout2 == null) {
                                throw new IllegalArgumentException("Tab not attached to a TabLayout");
                            }
                            tabLayout2.i(kq4VarF, true);
                        }
                    } else if (i < 0) {
                        tabLayout.i(null, true);
                    }
                } catch (Throwable th) {
                    this.p0 = false;
                    throw th;
                }
            } else if (i < 0) {
                tabLayout.i(null, true);
            }
            this.p0 = false;
            WebView webView = this.n0;
            if (webView != null && webView.canGoBack()) {
                z = true;
            }
            this.t0.c(z);
        }
    }

    public final void k0(String str) {
        up0 up0Var = this.l0;
        if (up0Var == null) {
            return;
        }
        up0Var.b.setVisibility(str == null ? 8 : 0);
        WebView webView = this.n0;
        if (webView != null) {
            webView.setVisibility(str != null ? 4 : 0);
        }
        if (str != null) {
            ((TextView) up0Var.c).setText(str);
        }
    }

    public final void l0(boolean z) {
        if (this.l0 == null) {
            return;
        }
        MainActivity mainActivity = this.m0;
        if (mainActivity == null) {
            h12.Q("activity");
            throw null;
        }
        mainActivity.I(z);
        up0 up0Var = this.l0;
        up0Var.getClass();
        ((LinearLayout) up0Var.a).post(new as1(this, 0));
    }

    public final void m0(boolean z) {
        up0 up0Var = this.l0;
        if (up0Var != null) {
            ((LinearProgressIndicator) up0Var.d).setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    public final void n0() {
        int i;
        up0 up0Var = this.l0;
        if (up0Var == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) up0Var.a;
        MainActivity mainActivity = this.m0;
        FrameLayout frameLayout = null;
        if (mainActivity == null) {
            h12.Q("activity");
            throw null;
        }
        qp4 qp4Var = mainActivity.R;
        if (qp4Var == null) {
            return;
        }
        BottomNavigationView bottomNavigationView = (BottomNavigationView) qp4Var.a;
        FrameLayout frameLayout2 = (FrameLayout) qp4Var.c;
        BottomSheetBehavior bottomSheetBehavior = mainActivity.W;
        boolean z = frameLayout2.getVisibility() == 0 && bottomSheetBehavior.Y != 5;
        boolean z2 = bottomNavigationView.getVisibility() == 0;
        if (!z || bottomSheetBehavior.Y == 4) {
            if (z) {
                frameLayout = frameLayout2;
            } else if (z2) {
                frameLayout = bottomNavigationView;
            }
            if (frameLayout == null) {
                i = 0;
            } else {
                linearLayout.getClass();
                int[] iArr = new int[2];
                linearLayout.getLocationInWindow(iArr);
                int height = linearLayout.getHeight() + iArr[1];
                int[] iArr2 = new int[2];
                frameLayout.getLocationInWindow(iArr2);
                i = height - iArr2[1];
                if (i < 0) {
                    i = 0;
                }
            }
            if (linearLayout.getPaddingBottom() != i) {
                linearLayout.setPadding(0, 0, 0, i);
            }
        }
    }
}
