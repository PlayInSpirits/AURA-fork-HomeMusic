package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int r1, Collection<String> r2, int r3);

    boolean stop(OutputStream r1, Executor r2);
}
