package defpackage;

import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cu extends qg3 {
    public static final boolean d = false;
    public final Provider c;

    static {
        boolean r0 = false;
        Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bu.class.getClassLoader());     // Catch: ClassNotFoundException -> L7
        r0 = true;
    L5:
        d = r0;
    }

    public cu() {
        this.c = new BouncyCastleJsseProvider();
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r1) {
        return null;
    }

    @Override // defpackage.qg3
    public final SSLContext k() {
        SSLContext r1 = SSLContext.getInstance("TLS", this.c);
        r1.getClass();
        return r1;
    }

    @Override // defpackage.qg3
    public final X509TrustManager m() {
        TrustManagerFactory r3 = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        r3.init(null);
        TrustManager[] r4 = r3.getTrustManagers();
        r4.getClass();
        if (r4.length != 1) goto L8;
        TrustManager r1 = r4[0];
        if ((r1 instanceof X509TrustManager) == false) goto L8;
        r1.getClass();
        return (X509TrustManager) r1;
    L8:
        String r5 = Arrays.toString(r4);
        r5.getClass();
        nz2.f("Unexpected default trust managers: ".concat(r5));
        return null;
    }
}
