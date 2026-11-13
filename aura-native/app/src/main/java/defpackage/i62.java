package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i62 implements X509TrustManager {
    public i62() {
        super();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        x509CertificateArr.getClass();
        str.getClass();
        if (x509CertificateArr.length == 0) {
            kf2.n("Failed requirement.");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        x509CertificateArr.getClass();
        str.getClass();
        if (x509CertificateArr.length == 0) {
            kf2.n("Failed requirement.");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
