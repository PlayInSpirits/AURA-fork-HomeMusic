package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l73 extends ProxySelector {
    public l73() {
        super();
    }

    public static final l73 a = new l73();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return gb.O(Proxy.NO_PROXY);
        }
        kf2.n("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
