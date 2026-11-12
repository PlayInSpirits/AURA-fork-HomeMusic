package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean r1);

    void setAllowFileAccess(boolean r1);

    void setBlockNetworkLoads(boolean r1);

    void setCacheMode(int r1);

    void setRequestedWithHeaderOriginAllowList(Set<String> r1);
}
