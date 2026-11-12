package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context r1, ValueCallback<Boolean> r2);

    boolean isMultiProcessEnabled();

    void setSafeBrowsingAllowlist(Set<String> r1, ValueCallback<Boolean> r2);

    void setSafeBrowsingWhitelist(List<String> r1, ValueCallback<Boolean> r2);
}
