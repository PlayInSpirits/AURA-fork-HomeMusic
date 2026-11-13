package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hs1 extends WebViewClient {
    public final /* synthetic */ HubFragment a;

    public hs1(HubFragment hubFragment) {
        this.a = hubFragment;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        List list = HubFragment.y0;
        String J = xl.J(str);
        if (J != null) {
            this.a.j0(J);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        if (!g12.C("DOCUMENT_START_SCRIPT")) {
            webView.evaluateJavascript("\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = 'nav[aria-label=\"Разделы\"]{display:none!important}' +\n            'main{padding-bottom:16px!important}';\n  function addStyle() {\n    if (document.getElementById('hm-embedded-style')) return;\n    var s = document.createElement('style');\n    s.id = 'hm-embedded-style';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add('hm-embedded');\n  }\n  if (document.head) addStyle(); else document.addEventListener('DOMContentLoaded', addStyle);\n  window.addEventListener('hm:unauthorized', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n", null);
        }
        List list = HubFragment.y0;
        HubFragment hubFragment = this.a;
        hubFragment.m0(false);
        MainActivity mainActivity = hubFragment.m0;
        if (mainActivity == null) {
            h12.Q("activity");
            throw null;
        }
        hw.c(mainActivity);
        String J = xl.J(str);
        if (J != null) {
            hubFragment.j0(J);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        if (!g12.C("DOCUMENT_START_SCRIPT")) {
            webView.evaluateJavascript("\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = 'nav[aria-label=\"Разделы\"]{display:none!important}' +\n            'main{padding-bottom:16px!important}';\n  function addStyle() {\n    if (document.getElementById('hm-embedded-style')) return;\n    var s = document.createElement('style');\n    s.id = 'hm-embedded-style';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add('hm-embedded');\n  }\n  if (document.head) addStyle(); else document.addEventListener('DOMContentLoaded', addStyle);\n  window.addEventListener('hm:unauthorized', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n", null);
        }
        if (xt1.h) {
            xt1.h = false;
            HubFragment hubFragment = this.a;
            List list = HubFragment.y0;
            hubFragment.l0(true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            List list = HubFragment.y0;
            HubFragment hubFragment = this.a;
            hubFragment.m0(false);
            hw.i = null;
            rr1.m();
            hubFragment.k0(hubFragment.s(R.string.homemusic_hub_unreachable) + "\n" + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri parse;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        HubFragment hubFragment = this.a;
        url.getClass();
        List list = HubFragment.y0;
        String str = hw.i;
        if (str != null && (parse = Uri.parse(str)) != null && h12.c(url.getScheme(), parse.getScheme()) && h12.c(url.getHost(), parse.getHost()) && url.getPort() == parse.getPort()) {
            return false;
        }
        try {
            hubFragment.g0(new Intent("android.intent.action.VIEW", url));
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(hubFragment.Z(), url.toString(), 0).show();
            return true;
        }
    }
}
