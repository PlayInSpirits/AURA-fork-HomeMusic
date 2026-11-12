package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ProfileBoundaryInterface {
    void cancelPrefetch(String r1);

    void clearPrefetch(String r1, ValueCallback<InvocationHandler> r2);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrl(String r1, ValueCallback<InvocationHandler> r2);

    void prefetchUrl(String r1, InvocationHandler r2, ValueCallback<InvocationHandler> r3);
}
