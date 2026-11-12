package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i62 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] r1, String r2) {
        r1.getClass();
        r2.getClass();
        if (r1.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return;
    L8:
        kf2.n("Failed requirement.");
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] r1, String r2) {
        r1.getClass();
        r2.getClass();
        if (r1.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return;
    L8:
        kf2.n("Failed requirement.");
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
