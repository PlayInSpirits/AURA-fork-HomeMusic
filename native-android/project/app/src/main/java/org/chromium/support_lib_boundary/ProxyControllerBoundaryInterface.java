package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(Runnable r1, Executor r2);

    void setProxyOverride(String[][] r1, String[] r2, Runnable r3, Executor r4);

    void setProxyOverride(String[][] r1, String[] r2, Runnable r3, Executor r4, boolean r5);
}
