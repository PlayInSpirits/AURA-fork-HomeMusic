package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface WebViewClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(WebView r1, String r2);

    void onReceivedError(WebView r1, WebResourceRequest r2, InvocationHandler r3);

    void onReceivedHttpError(WebView r1, WebResourceRequest r2, WebResourceResponse r3);

    void onSafeBrowsingHit(WebView r1, WebResourceRequest r2, int r3, InvocationHandler r4);

    boolean shouldOverrideUrlLoading(WebView r1, WebResourceRequest r2);
}
