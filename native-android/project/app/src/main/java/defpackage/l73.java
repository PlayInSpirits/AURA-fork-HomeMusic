package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l73 extends ProxySelector {
    public static final l73 a = null;

    static {
        a = new l73();
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI r1, SocketAddress r2, IOException r3) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI r1) {
        if (r1 != null) goto L4;
        kf2.n("uri must not be null");
        return null;
    L4:
        return gb.O(Proxy.NO_PROXY);
    }
}
