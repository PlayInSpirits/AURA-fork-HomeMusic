package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface WebkitToCompatConverterBoundaryInterface {
    InvocationHandler convertCookieManager(Object r1);

    Object convertSafeBrowsingResponse(InvocationHandler r1);

    InvocationHandler convertSafeBrowsingResponse(Object r1);

    Object convertServiceWorkerSettings(InvocationHandler r1);

    InvocationHandler convertServiceWorkerSettings(Object r1);

    InvocationHandler convertSettings(WebSettings r1);

    Object convertWebMessagePort(InvocationHandler r1);

    InvocationHandler convertWebMessagePort(Object r1);

    Object convertWebResourceError(InvocationHandler r1);

    InvocationHandler convertWebResourceError(Object r1);

    InvocationHandler convertWebResourceRequest(WebResourceRequest r1);
}
