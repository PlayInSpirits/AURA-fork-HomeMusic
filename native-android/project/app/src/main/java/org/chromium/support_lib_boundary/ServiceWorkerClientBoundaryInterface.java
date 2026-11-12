package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ServiceWorkerClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    WebResourceResponse shouldInterceptRequest(WebResourceRequest r1);
}
