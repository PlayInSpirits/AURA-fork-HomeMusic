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
import app.homemusic.AURAVersion;
import app.homemusic.R;
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
import defpackage.ds1;
import defpackage.e35;
import defpackage.er1;
import defpackage.es1;
import defpackage.fs1;
import defpackage.fu;
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
import defpackage.n95;
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
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubFragment extends kc1 {
    public static final List y0 = null;
    public static final String[] z0 = null;
    public up0 l0;
    public MainActivity m0;
    public WebView n0;
    public String o0;
    public boolean p0;
    public long q0;
    public ValueCallback r0;
    public final dc1 s0;
    public final bd1 t0;
    public final wt u0;
    public final cs1 v0;
    public final hs1 w0;
    public final gs1 x0;

    static {
        List r0 = gb.P(new fs1[]{new fs1(R.string.homemusic_tab_catalog, "/search"), new fs1(R.string.homemusic_tab_downloads, "/downloads"), new fs1(R.string.homemusic_tab_assistant, "/assistant"), new fs1(R.string.homemusic_tab_files, "/library")});
        y0 = r0;
        z0 = new String[r0.size()];
    }

    public HubFragment() {
        this.o0 = "/search";
        int r1 = 2;
        q5 r0 = new q5(r1);
        this.s0 = W(new cn(16, this), r0);
        this.t0 = new bd1(3, this);
        this.u0 = new wt(r1, this);
        this.v0 = new cs1(0, this);
        this.w0 = new hs1(this);
        this.x0 = new gs1(this);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        r11.getClass();
        this.m0 = (MainActivity) X();
        View r14 = r11.inflate(R.layout.fragment_hub, r12, false);
        int r15 = R.id.hub_error;
        LinearLayout r2 = (LinearLayout) uo.s(r14, R.id.hub_error);
        if (r2 == null) goto L20;
        r15 = R.id.hub_error_text;
        TextView r3 = (TextView) uo.s(r14, R.id.hub_error_text);
        if (r3 == null) goto L20;
        r15 = R.id.hub_menu_button;
        ImageButton r4 = (ImageButton) uo.s(r14, R.id.hub_menu_button);
        if (r4 == null) goto L20;
        r15 = R.id.hub_progress;
        LinearProgressIndicator r5 = (LinearProgressIndicator) uo.s(r14, R.id.hub_progress);
        if (r5 == null) goto L20;
        r15 = R.id.hub_retry_button;
        MaterialButton r6 = (MaterialButton) uo.s(r14, R.id.hub_retry_button);
        if (r6 == null) goto L20;
        LinearLayout r1 = (LinearLayout) r14;
        r15 = R.id.hub_settings_button;
        MaterialButton r7 = (MaterialButton) uo.s(r14, R.id.hub_settings_button);
        if (r7 == null) goto L20;
        r15 = R.id.hub_tabs;
        TabLayout r8 = (TabLayout) uo.s(r14, R.id.hub_tabs);
        if (r8 == null) goto L20;
        r15 = R.id.hub_web_container;
        FrameLayout r9 = (FrameLayout) uo.s(r14, R.id.hub_web_container);
        if (r9 == null) goto L20;
        this.l0 = new up0(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r1.getClass();
        return r1;
    L20:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
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
        ValueCallback r1 = this.r0;
        if (r1 == null) goto L5;
        r1.onReceiveValue(null);
    L5:
        this.r0 = null;
        WebView r2 = this.n0;
        if (r2 == null) goto L20;
        MainActivity r3 = this.m0;
        if (r3 == null) goto L18;
        Context r4 = r3.getApplicationContext();
        r4.getClass();
        ViewParent r5 = r2.getParent();
        if ((r5 instanceof ViewGroup) == false) goto L12;
        ViewGroup r6 = (ViewGroup) r5;
    L13:
        if (r6 == null) goto L15;
        r6.removeView(r2);
    L15:
        r2.setWebViewClient(new WebViewClient());
        r2.setWebChromeClient(new WebChromeClient());
        MutableContextWrapper r7 = hw.h;
        if (r7 == null) goto L20;
        r7.setBaseContext(r4);
        goto L20
    L12:
        r6 = null;
        goto L13
    L18:
        h12.Q("activity");
        throw null;
    L20:
        this.n0 = null;
        this.l0 = null;
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle r2) {
        r2.putString("hub_route", this.o0);
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        MainActivity r1 = this.m0;
        if (r1 == null) goto L25;
        r1.J();
        MainActivity r2 = this.m0;
        if (r2 == null) goto L23;
        r2.I(!xt1.h);
        MainActivity r3 = this.m0;
        if (r3 == null) goto L21;
        r3.W.w(this.u0);
        MainActivity r4 = this.m0;
        if (r4 == null) goto L19;
        ((BottomNavigationView) r4.R.a).addOnLayoutChangeListener(this.v0);
        up0 r5 = this.l0;
        r5.getClass();
        ((LinearLayout) r5.a).post(new as1(this, 1));
        WeakReference r0 = lr1.a;
        MainActivity r6 = this.m0;
        if (r6 == null) goto L17;
        bl2 r7 = r6.P;
        if (r7 != null) goto L15;
        return;
    L15:
        r7.f(new jr1(r7, 0), ud3.w(r6));
        return;
    L17:
        h12.Q("activity");
        throw null;
    L19:
        h12.Q("activity");
        throw null;
    L21:
        h12.Q("activity");
        throw null;
    L23:
        h12.Q("activity");
        throw null;
    L25:
        h12.Q("activity");
        throw null;
    }

    @Override // defpackage.kc1
    public final void S() {
        MainActivity r0 = this.m0;
        if (r0 == null) goto L17;
        r0.I(true);
        MainActivity r1 = this.m0;
        if (r1 == null) goto L15;
        BottomSheetBehavior r2 = r1.W;
        wt r4 = this.u0;
        r2.j0.remove(r4);
        MainActivity r3 = this.m0;
        if (r3 == null) goto L13;
        qp4 r5 = r3.R;
        if (r5 == null) goto L11;
        ((BottomNavigationView) r5.a).removeOnLayoutChangeListener(this.v0);
    L11:
        this.R = true;
        return;
    L13:
        h12.Q("activity");
        throw null;
    L15:
        h12.Q("activity");
        throw null;
    L17:
        h12.Q("activity");
        throw null;
    }

    @Override // defpackage.kc1
    public final void T(View r10, Bundle r11) {
        r10.getClass();
        up0 r12 = this.l0;
        r12.getClass();
        TabLayout r13 = (TabLayout) r12.g;
        Iterator r0 = y0.iterator();
    L3:
        final int r2 = 0;
        String r3 = null;
        if (r0.hasNext() == false) goto L10;
        fs1 r1 = (fs1) r0.next();
        kq4 r4 = r13.g();
        int r5 = r1.a;
        TabLayout r6 = r4.d;
        if (r6 == null) goto L8;
        r4.a(r6.getResources().getText(r5));
        r13.a(r4, false);
        e35.S(r4.e, null);
        goto L3
    L8:
        kf2.n("Tab not attached to a TabLayout");
        return;
    L10:
        is1 r7 = new is1(0, this);
        ArrayList r14 = r13.a0;
        if (r14.contains(r7) == true) goto L13;
        r14.add(r7);
    L13:
        final int r8 = 2;
        if (r().getConfiguration().orientation != 2) goto L16;
        up0 r15 = this.l0;
        r15.getClass();
        ((ImageButton) r15.i).setVisibility(0);
        up0 r16 = this.l0;
        r16.getClass();
        ((ImageButton) r16.i).setOnClickListener(new ds1(this, r2));
    L16:
        up0 r17 = this.l0;
        r17.getClass();
        final int r9 = 1;
        ((MaterialButton) r17.e).setOnClickListener(new ds1(this, r9));
        up0 r18 = this.l0;
        r18.getClass();
        ((MaterialButton) r18.f).setOnClickListener(new ds1(this, r8));
        MainActivity r19 = this.m0;
        if (r19 == null) goto L83;
        WebView r20 = hw.g;
        if (r20 == null) goto L30;
        MutableContextWrapper r21 = hw.h;
        if (r21 == null) goto L23;
        r21.setBaseContext(r19);
    L23:
        ViewParent r110 = r20.getParent();
        if ((r110 instanceof ViewGroup) == false) goto L26;
        ViewGroup r111 = (ViewGroup) r110;
    L27:
        if (r111 == null) goto L29;
        r111.removeView(r20);
    L29:
        xk0 r112 = new xk0(r20, false);
    L38:
        WebView r22 = (WebView) r112.p;
        this.n0 = r22;
        up0 r23 = this.l0;
        r23.getClass();
        ((FrameLayout) r23.h).addView(r22, 0, new FrameLayout.LayoutParams(-1, -1));
        r22.setWebViewClient(this.w0);
        r22.setWebChromeClient(this.x0);
        xt1.b = new yr1(this, r9);
        xt1.c = new es1(this, 0);
        xt1.d = new es1(this, 1);
        xt1.e = new zr1(this, 2);
        xt1.f = new yr1(this, r2);
        xt1.g = new zr1(this, 0);
        MainActivity r24 = this.m0;
        if (r24 == null) goto L81;
        hw.c(r24);
        MainActivity r25 = this.m0;
        if (r25 == null) goto L79;
        r25.i().a(v(), this.t0);
        k03 r26 = js1.a;
        String r27 = (String) r26.d();
        if (r27 == null) goto L45;
        r26.k(null);
    L45:
        if (r27 != null) goto L54;
        Bundle r28 = this.s;
        if (r28 == null) goto L53;
        r27 = r28.getString("route");
        if (r27 == null) goto L53;
        Bundle r29 = this.s;
        if (r29 == null) goto L54;
        r29.remove("route");
    L53:
        r27 = null;
    L54:
        if (r11 == null) goto L56;
        r3 = r11.getString("hub_route");
    L56:
        if (r27 == null) goto L59;
        h0(r27, false);
    L77:
        r26.e(v(), new wd1(new zr1(this, 1), 4));
        return;
    L59:
        if (r112.o == false) goto L61;
    L69:
        if (r3 != null) goto L74;
        r3 = z0[0];
        if (r3 != null) goto L74;
        r3 = ((fs1) y0.get(0)).b;
    L74:
        if (AURAVersion.pendingSearch == false) goto L76;
        AURAVersion.pendingSearch = false;
        r3 = "/search";
    L76:
        h0(r3, false);
        goto L77
    L61:
        if (hw.i == null) goto L69;
        String r113 = xl.J(r22.getUrl());
        if (r113 != null) goto L66;
        r113 = this.o0;
    L66:
        if (AURAVersion.pendingSearch == false) goto L68;
        AURAVersion.pendingSearch = false;
        r113 = "/search";
    L68:
        j0(r113);
        goto L77
    L79:
        h12.Q("activity");
        throw null;
    L81:
        h12.Q("activity");
        throw null;
    L26:
        r111 = null;
        goto L27
    L30:
        MutableContextWrapper r30 = new MutableContextWrapper(r19);
        WebView r114 = new WebView(r30);
        r114.setBackgroundColor(Color.parseColor("#0B0B0B"));
        WebSettings r31 = r114.getSettings();
        r31.setJavaScriptEnabled(true);
        r31.setDomStorageEnabled(true);
        r31.setDatabaseEnabled(true);
        r31.setAllowFileAccess(false);
        r31.setAllowContentAccess(true);
        r31.setMediaPlaybackRequiresUserGesture(true);
        r31.setMixedContentMode(1);
        r31.setUserAgentString(r31.getUserAgentString() + " HomeMusicAndroid/1.14.7");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(r114, false);
        r114.addJavascriptInterface(xt1.a, "HomeMusicAndroid");
        if (g12.C("DOCUMENT_START_SCRIPT") == false) goto L37;
        Set r32 = kb4.S("*");
        int r33 = j95.a;
        if (m95.b.b() == false) goto L35;
        ScriptHandlerBoundaryInterface r34 = (ScriptHandlerBoundaryInterface) fu.j(ScriptHandlerBoundaryInterface.class, n95.a.createWebView(r114).addDocumentStartJavaScript("(function () {\n  if (window.__AURA_HUB_STYLE__) return;\n  window.__AURA_HUB_STYLE__ = true;\n  var css = [\n    ':root{color-scheme:dark;--aura-text:#f4f1ff;--aura-muted:#beb9d2;--aura-violet:#bdadff;--aura-cyan:#79d9df;--aura-line:rgba(189,173,255,.18)}',\n    'html,body{min-height:100%;background:radial-gradient(ellipse at 12% 0%,rgba(93,65,150,.22),transparent 42%),radial-gradient(ellipse at 92% 28%,rgba(30,132,145,.14),transparent 38%),#0d0e18!important;color:var(--aura-text)!important}',\n    'body{font-family:system-ui,-apple-system,Roboto,sans-serif!important;padding-bottom:calc(210px + env(safe-area-inset-bottom))!important}',\n    'main{padding:14px 14px calc(196px + env(safe-area-inset-bottom))!important;background:transparent!important;min-height:100vh}',\n    'nav[aria-label=\"Разделы\"]{display:flex!important;visibility:visible!important;opacity:1!important;position:sticky;top:0;z-index:15;gap:7px;max-width:100%;overflow-x:auto;white-space:nowrap;padding:9px 12px!important;background:rgba(17,18,34,.96)!important;border-bottom:1px solid var(--aura-line)!important;backdrop-filter:blur(16px)}',\n    'nav[aria-label=\"Разделы\"] a,nav[aria-label=\"Разделы\"] button,nav[aria-label=\"Разделы\"] [role=\"tab\"]{flex:0 0 auto;min-height:38px;padding:8px 13px!important;border:1px solid transparent!important;border-radius:14px!important;color:var(--aura-muted)!important;background:rgba(255,255,255,.035)!important;transition:background .22s ease,border-color .22s ease,color .22s ease,transform .22s ease}',\n    'nav[aria-label=\"Разделы\"] [aria-current=\"page\"],nav[aria-label=\"Разделы\"] [aria-selected=\"true\"],nav[aria-label=\"Разделы\"] .active{color:var(--aura-text)!important;background:linear-gradient(110deg,rgba(129,98,201,.34),rgba(38,139,150,.24))!important;border-color:rgba(189,173,255,.34)!important}',\n    'article,[data-slot=\"card\"],[class*=\"Card\"],[class*=\"rounded-xl\"],[class*=\"rounded-2xl\"],.card{background:linear-gradient(145deg,rgba(31,30,53,.92),rgba(17,28,42,.9))!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;box-shadow:0 10px 28px rgba(0,0,0,.2)!important;color:var(--aura-text)!important}',\n    'h1,h2,h3,h4,strong{color:#fff!important}p,label,small,li{color:var(--aura-muted)}',\n    'button,[role=\"button\"],a[data-slot=\"button\"]{border-radius:14px!important;transition:transform .2s ease,box-shadow .2s ease,background .2s ease,border-color .2s ease!important}',\n    'button:not(:disabled):hover,[role=\"button\"]:hover,a[data-slot=\"button\"]:hover{transform:translateY(-1px);box-shadow:0 7px 20px rgba(0,0,0,.22)}',\n    'input,select,textarea{background:rgba(10,12,24,.82)!important;color:var(--aura-text)!important;border-color:rgba(189,173,255,.25)!important;border-radius:13px!important;transition:border-color .2s ease,box-shadow .2s ease!important}',\n    'input:focus,select:focus,textarea:focus{border-color:var(--aura-violet)!important;box-shadow:0 0 0 3px rgba(189,173,255,.12)!important;outline:none!important}',\n    'a{color:var(--aura-cyan)}hr{border-color:var(--aura-line)!important}img{border-radius:12px}',\n    '::-webkit-scrollbar{width:7px;height:7px}::-webkit-scrollbar-thumb{background:rgba(189,173,255,.28);border-radius:8px}',\n    '.aura-hub-enter{animation:auraHubEnter .34s cubic-bezier(.2,.7,.25,1) both}',\n    '@keyframes auraHubEnter{from{opacity:.35;transform:translateY(7px)}to{opacity:1;transform:translateY(0)}}',\n    '.aura-assistant-composer{position:relative!important;bottom:auto!important;z-index:2!important;display:block!important;clear:both!important;margin:18px 0 14px!important;padding:12px!important;background:rgba(17,18,34,.94)!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;backdrop-filter:blur(18px)!important;box-shadow:0 8px 24px rgba(0,0,0,.25)!important}',\n    '.aura-assistant-action{display:inline-flex!important;align-items:center!important;justify-content:center!important;min-height:44px!important;padding:10px 16px!important;border:1px solid rgba(189,173,255,.34)!important;border-radius:14px!important;background:linear-gradient(110deg,#59458f,#176e79)!important;color:#fff!important;box-shadow:0 7px 20px rgba(0,0,0,.22)!important}',\n    '@media(prefers-reduced-motion:reduce){*,*::before,*::after{scroll-behavior:auto!important;animation-duration:.01ms!important;transition-duration:.01ms!important}}'\n  ].join('');\n  function routeText() {\n    return ((location.pathname || '') + ' ' + (location.hash || '')).toLowerCase();\n  }\n  function addStyle() {\n    if (document.getElementById('aura-hub-style')) return;\n    var style = document.createElement('style');\n    style.id = 'aura-hub-style';\n    style.textContent = css;\n    (document.head || document.documentElement).appendChild(style);\n  }\n  function animatePage() {\n    var main = document.querySelector('main');\n    if (!main || window.matchMedia('(prefers-reduced-motion: reduce)').matches) return;\n    main.classList.remove('aura-hub-enter');\n    void main.offsetWidth;\n    main.classList.add('aura-hub-enter');\n  }\n  function keepTabsVisible() {\n    var nav = document.querySelector('nav[aria-label=\"Разделы\"]');\n    if (!nav) return;\n    nav.style.setProperty('display','flex','important');\n    nav.style.setProperty('visibility','visible','important');\n    nav.style.setProperty('opacity','1','important');\n  }\n  function removeCatalogShortcuts() {\n    var labels = /^(моя волна|микс дня|my wave|daily mix)$/i;\n    document.querySelectorAll('button,a,[role=\"button\"],[role=\"tab\"],h1,h2,h3,span').forEach(function (el) {\n      var label = (el.innerText || el.textContent || '').replace(/\\s+/g,' ').trim();\n      if (!labels.test(label)) return;\n      var card = el.closest('article,[data-slot=\"card\"],.card,[class*=\"Card\"],[class*=\"card\"]') || el.parentElement || el;\n      card.style.setProperty('display','none','important');\n    });\n  }\n  function activeHubTab() {\n    var nav = document.querySelector('nav[aria-label=\"Разделы\"]');\n    if (!nav) return '';\n    var selected = nav.querySelector('[aria-current=\"page\"],[aria-selected=\"true\"],[data-state=\"active\"],.active');\n    return selected ? (selected.innerText || selected.textContent || '').replace(/\\\\s+/g,' ').trim().toLowerCase() : '';\n  }\n  function isAssistantTab() {\n    var tab = activeHubTab();\n    if (tab) return /(ассистент|assistant)/i.test(tab);\n    return /assistant/.test(routeText());\n  }\n  function setComposerVisible(node, visible) {\n    if (!node) return;\n    if (visible) node.style.removeProperty('display');\n    else node.style.setProperty('display','none','important');\n  }\n  function liftAssistantComposer() {\n    var assistantTab = isAssistantTab();\n    var candidates = [];\n    document.querySelectorAll('button,a,[role=\"button\"]').forEach(function (el) {\n      var label = (el.innerText || el.textContent || '').replace(/\\\\s+/g,' ').trim();\n      if (!/(сообщени[ея] ассистенту|написать ассистенту|send.*assistant|message.*assistant)/i.test(label)) return;\n      el.classList.add('aura-assistant-action');\n      var shell = el.closest('form,[class*=\"assistant\"],[class*=\"composer\"]') || el.parentElement;\n      if (!shell) return;\n      shell.classList.add('aura-assistant-composer');\n      if (candidates.indexOf(shell) === -1) candidates.push(shell);\n    });\n\n    var roots = Array.prototype.slice.call(document.querySelectorAll('.aura-assistant-composer'));\n    candidates.forEach(function (node) {\n      if (roots.indexOf(node) === -1) roots.push(node);\n    });\n    if (!assistantTab) {\n      roots.forEach(function (node) { setComposerVisible(node, false); });\n      return;\n    }\n\n    var topLevel = roots.filter(function (node) {\n      return !roots.some(function (other) { return other !== node && other.contains(node); });\n    });\n    var keeper = topLevel[0] || null;\n    roots.forEach(function (node) {\n      setComposerVisible(node, !!keeper && (node === keeper || keeper.contains(node)));\n    });\n  }\n  function recoverLayout() {\n    addStyle();\n    keepTabsVisible();\n    removeCatalogShortcuts();\n    liftAssistantComposer();\n  }\n  var pending = false;\n  function scheduleLayout() {\n    if (pending) return;\n    pending = true;\n    requestAnimationFrame(function () {\n      pending = false;\n      recoverLayout();\n      animatePage();\n    });\n  }\n  function start() {\n    recoverLayout();\n    animatePage();\n    if (document.documentElement && window.MutationObserver) {\n      var observer = new MutationObserver(function (records) {\n        var changed = records.some(function (record) {\n          return record.addedNodes && record.addedNodes.length;\n        });\n        if (changed) scheduleLayout();\n      });\n      observer.observe(document.documentElement,{childList:true,subtree:true});\n    }\n  }\n  if (document.readyState === 'loading') document.addEventListener('DOMContentLoaded',start,{once:true});\n  else start();\n  window.addEventListener('hashchange',scheduleLayout);\n  window.addEventListener('popstate',scheduleLayout);\n  window.addEventListener('pageshow',scheduleLayout);\n  window.addEventListener('focus',scheduleLayout);\n  document.addEventListener('visibilitychange',function () {\n    if (document.visibilityState === 'visible') scheduleLayout();\n  });\n  window.addEventListener('hm:unauthorized',function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();", (String[]) r32.toArray(new String[0])));
        goto L37
    L35:
        er1.l("This method is not supported by the current version of the framework and the current WebView APK");
        return;
    L37:
        hw.g = r114;
        hw.h = r30;
        r112 = new xk0(r114, true);
        goto L38
    L83:
        h12.Q("activity");
        throw null;
    }

    public final void h0(String r4, boolean r5) {
        this.o0 = r4;
        k0(null);
        m0(true);
        io1.a.execute(new bs1(this, r5, r4, 0));
    }

    public final void i0(String r3) {
        WebView r0 = this.n0;
        if (r0 != null) goto L6;
        return;
    L6:
        if (hw.i != null) goto L10;
        h0(r3, false);
        return;
    L10:
        if (h12.c(xl.J(r0.getUrl()), r3) == false) goto L12;
        return;
    L12:
        r0.evaluateJavascript("window.location.hash = " + rr1.c.j(r3) + ";", null);
    }

    public final void j0(String r5) {
        this.o0 = r5;
        r5.getClass();
        String r0 = qm4.H0(r5, '?');
        boolean r2 = false;
        if (xm4.k0(r0, "/search", false) == false) goto L5;
    L24:
        int r1 = 0;
    L25:
        if (r1 < 0) goto L27;
        z0[r1] = r5;
    L27:
        up0 r6 = this.l0;
        if (r6 == null) goto L55;
        TabLayout r7 = (TabLayout) r6.g;
        this.p0 = true;
        if (r1 >= 0) goto L54;
    L42:
        if (r1 >= 0) goto L47;
        r7.i(null, true);     // Catch: Throwable -> L40
    L47:
        this.p0 = false;
        WebView r8 = this.n0;
        if (r8 != null) goto L50;
    L52:
        this.t0.c(r2);
        return;
    L50:
        if (r8.canGoBack() != true) goto L52;
        r2 = true;
        goto L52
    L54:
    L40:
        th = move-exception;
        this.p0 = false;
        throw th;
    L32:
        if (r7.getSelectedTabPosition() == r1) goto L42;
        kq4 r9 = r7.f(r1);     // Catch: Throwable -> L40
        if (r9 == null) goto L47;
        TabLayout r3 = r9.d;     // Catch: Throwable -> L40
        if (r3 == null) goto L39;
        r3.i(r9, true);     // Catch: Throwable -> L40
        goto L47
    L39:
        throw new IllegalArgumentException("Tab not attached to a TabLayout");     // Catch: Throwable -> L40
    L55:
        return;
    L5:
        if (xm4.k0(r0, "/artist/", false) == true) goto L24;
        if (xm4.k0(r0, "/album/", false) == true) goto L24;
        if (xm4.k0(r0, "/downloads", false) == false) goto L13;
        r1 = 1;
        goto L25
    L13:
        if (xm4.k0(r0, "/assistant", false) == false) goto L16;
        r1 = 2;
        goto L25
    L16:
        if (xm4.k0(r0, "/library", false) == false) goto L18;
    L23:
        r1 = 3;
        goto L25
    L18:
        if (xm4.k0(r0, "/upload", false) == true) goto L23;
        if (xm4.k0(r0, "/playlists", false) == true) goto L23;
        r1 = -1;
        goto L25
    }

    public final void k0(String r5) {
        up0 r0 = this.l0;
        if (r0 == null) goto L19;
        LinearLayout r1 = r0.b;
        int r2 = 0;
        if (r5 != null) goto L8;
        int r3 = 8;
    L9:
        r1.setVisibility(r3);
        WebView r4 = this.n0;
        if (r4 == null) goto L15;
        if (r5 == null) goto L14;
        r2 = 4;
    L14:
        r4.setVisibility(r2);
    L15:
        if (r5 == null) goto L18;
        ((TextView) r0.c).setText(r5);
        return;
    L18:
        return;
    L8:
        r3 = 0;
        goto L9
    }

    public final void l0(boolean r3) {
        if (this.l0 != null) goto L5;
        return;
    L5:
        MainActivity r0 = this.m0;
        if (r0 == null) goto L9;
        r0.I(r3);
        up0 r4 = this.l0;
        r4.getClass();
        ((LinearLayout) r4.a).post(new as1(this, 0));
        return;
    L9:
        h12.Q("activity");
        throw null;
    }

    public final void m0(boolean r1) {
        up0 r0 = this.l0;
        if (r0 == null) goto L10;
        LinearProgressIndicator r2 = (LinearProgressIndicator) r0.d;
        if (r1 == false) goto L7;
        int r3 = 0;
    L8:
        r2.setVisibility(r3);
        return;
    L7:
        r3 = 8;
        goto L8
    }

    public final void n0() {
        up0 r0 = this.l0;
        if (r0 == null) goto L40;
        LinearLayout r1 = (LinearLayout) r0.a;
        MainActivity r9 = this.m0;
        FrameLayout r2 = null;
        if (r9 == null) goto L37;
        qp4 r3 = r9.R;
        if (r3 == null) goto L41;
        BottomNavigationView r4 = (BottomNavigationView) r3.a;
        FrameLayout r5 = (FrameLayout) r3.c;
        BottomSheetBehavior r10 = r9.W;
        if (r5.getVisibility() == 0) goto L13;
    L15:
        boolean r6 = false;
    L17:
        if (r4.getVisibility() != 0) goto L19;
        boolean r7 = true;
    L20:
        if (r6 == true) goto L22;
    L24:
        if (r6 == false) goto L26;
        r2 = r5;
    L28:
        if (r2 != null) goto L30;
    L29:
        int r8 = 0;
    L34:
        if (r1.getPaddingBottom() == r8) goto L39;
        r1.setPadding(0, 0, 0, r8);
        return;
    L39:
        return;
    L30:
        r1.getClass();
        int[] r11 = new int[2];
        r1.getLocationInWindow(r11);
        int r12 = r1.getHeight() + r11[1];
        int[] r13 = new int[2];
        r2.getLocationInWindow(r13);
        r8 = r12 - r13[1];
        if (r8 >= 0) goto L34;
    L26:
        if (r7 == false) goto L28;
        r2 = r4;
        goto L28
    L22:
        if (r10.Y == 4) goto L24;
        return;
    L19:
        r7 = false;
        goto L20
    L13:
        if (r10.Y == 5) goto L15;
        r6 = true;
        goto L17
    L41:
        return;
    L37:
        h12.Q("activity");
        throw null;
    }
}
