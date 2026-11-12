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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends WebViewClient {
    public final /* synthetic */ HubFragment a;

    public hs1(HubFragment r1) {
        this.a = r1;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView r1, String r2, boolean r3) {
        r1.getClass();
        List r4 = HubFragment.y0;
        String r5 = xl.J(r2);
        if (r5 == null) goto L6;
        this.a.j0(r5);
        return;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView r3, String r4) {
        r3.getClass();
        if (g12.C("DOCUMENT_START_SCRIPT") == true) goto L5;
        r3.evaluateJavascript("\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = 'nav[aria-label=\"Разделы\"]{display:none!important}' +\n            'main{padding-bottom:16px!important}';\n  function addStyle() {\n    if (document.getElementById('hm-embedded-style')) return;\n    var s = document.createElement('style');\n    s.id = 'hm-embedded-style';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add('hm-embedded');\n  }\n  if (document.head) addStyle(); else document.addEventListener('DOMContentLoaded', addStyle);\n  window.addEventListener('hm:unauthorized', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n", null);
    L5:
        List r5 = HubFragment.y0;
        HubFragment r2 = this.a;
        r2.m0(false);
        MainActivity r6 = r2.m0;
        if (r6 == null) goto L11;
        hw.c(r6);
        String r7 = xl.J(r4);
        if (r7 == null) goto L13;
        r2.j0(r7);
        return;
    L13:
        return;
    L11:
        h12.Q("activity");
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView r1, String r2, Bitmap r3) {
        r1.getClass();
        if (g12.C("DOCUMENT_START_SCRIPT") == true) goto L6;
        r1.evaluateJavascript("\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = 'nav[aria-label=\"Разделы\"]{display:none!important}' +\n            'main{padding-bottom:16px!important}';\n  function addStyle() {\n    if (document.getElementById('hm-embedded-style')) return;\n    var s = document.createElement('style');\n    s.id = 'hm-embedded-style';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add('hm-embedded');\n  }\n  if (document.head) addStyle(); else document.addEventListener('DOMContentLoaded', addStyle);\n  window.addEventListener('hm:unauthorized', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n", null);
    L6:
        if (xt1.h == false) goto L9;
        xt1.h = false;
        HubFragment r0 = this.a;
        List r4 = HubFragment.y0;
        r0.l0(true);
        return;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView r1, WebResourceRequest r2, WebResourceError r3) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        if (r2.isForMainFrame() == true) goto L5;
        return;
    L5:
        List r4 = HubFragment.y0;
        HubFragment r0 = this.a;
        r0.m0(false);
        hw.i = null;
        rr1.m();
        r0.k0(r0.s(R.string.homemusic_hub_unreachable) + "\n" + r3.getDescription());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView r4, WebResourceRequest r5) {
        r4.getClass();
        r5.getClass();
        Uri r6 = r5.getUrl();
        HubFragment r3 = this.a;
        r6.getClass();
        List r7 = HubFragment.y0;
        String r8 = hw.i;
        if (r8 == null) goto L19;
        Uri r9 = Uri.parse(r8);
        if (r9 == null) goto L19;
        if (h12.c(r6.getScheme(), r9.getScheme()) == false) goto L19;
        if (h12.c(r6.getHost(), r9.getHost()) == false) goto L19;
        if (r6.getPort() != r9.getPort()) goto L19;
        return false;
    L19:
        r3.g0(new Intent("android.intent.action.VIEW", r6));     // Catch: ActivityNotFoundException -> L16
        return true;
    L16:
        Toast.makeText(r3.Z(), r6.toString(), 0).show();
        return true;
    }
}
