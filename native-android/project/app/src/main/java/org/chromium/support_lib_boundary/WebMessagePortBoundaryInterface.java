package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler r1);

    void setWebMessageCallback(InvocationHandler r1);

    void setWebMessageCallback(InvocationHandler r1, Handler r2);
}
