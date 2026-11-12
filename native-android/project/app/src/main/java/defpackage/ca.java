package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends rr2 {
    public final X509TrustManager c;
    public final X509TrustManagerExtensions d;

    public ca(X509TrustManager r1, X509TrustManagerExtensions r2) {
        r1.getClass();
        this.c = r1;
        this.d = r2;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ca) == true) goto L5;
        return false;
    L5:
        if (((ca) r2).c != this.c) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.rr2
    public final List x(String r2, List r3) {
        r3.getClass();
        r2.getClass();
        X509Certificate[] r4 = (X509Certificate[]) r3.toArray(new X509Certificate[0]);
        List<X509Certificate> r1 = this.d.checkServerTrusted(r4, "RSA", r2);     // Catch: CertificateException -> L5
        r1.getClass();     // Catch: CertificateException -> L5
        return r1;
    L5:
        e = move-exception;
        SSLPeerUnverifiedException r5 = new SSLPeerUnverifiedException(e.getMessage());
        r5.initCause(e);
        throw r5;
    }
}
