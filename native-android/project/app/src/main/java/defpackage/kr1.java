package defpackage;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 implements oi3 {
    @Override // defpackage.oi3
    public final void V(boolean z) {
        WebView webView;
        if (!z || (webView = hw.g) == null) {
            return;
        }
        webView.evaluateJavascript("window.dispatchEvent(new Event(" + rr1.c.j("hm:native-playing") + "));", null);
    }
}
