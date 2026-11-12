package defpackage;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends qg3 {
    public static final boolean d = false;
    public final Provider c;

    static {
        boolean r0 = false;
        Class.forName("org.conscrypt.Conscrypt$Version", false, za0.class.getClassLoader());     // Catch: Throwable -> L10
        if (Conscrypt.isAvailable() == false) goto L8;
        if (za0.a() == false) goto L8;
        r0 = true;
    L8:
        d = r0;
    }

    public bb0() {
        Provider r0 = Conscrypt.newProvider();
        r0.getClass();
        this.c = r0;
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r4, String r5, List r6) {
        r6.getClass();
        if (Conscrypt.isConscrypt(r4) == false) goto L21;
        Conscrypt.setUseSessionTickets(r4, true);
        ArrayList r3 = new ArrayList();
        Iterator r7 = r6.iterator();
    L6:
        if (r7.hasNext() == false) goto L10;
        Object r8 = r7.next();
        if (((pr3) r8) == pr3.p) goto L6;
        r3.add(r8);
        goto L6
    L10:
        ArrayList r9 = new ArrayList(r40.k0(r3, 10));
        int r10 = r3.size();
        int r1 = 0;
    L11:
        if (r1 >= r10) goto L13;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        r9.add(((pr3) r2).n);
        goto L11
    L13:
        Conscrypt.setApplicationProtocols(r4, (String[]) r9.toArray(new String[0]));
        return;
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r1) {
        if (Conscrypt.isConscrypt(r1) == true) goto L5;
        return null;
    L5:
        return Conscrypt.getApplicationProtocol(r1);
    }

    @Override // defpackage.qg3
    public final SSLContext k() {
        SSLContext r1 = SSLContext.getInstance("TLS", this.c);
        r1.getClass();
        return r1;
    }

    @Override // defpackage.qg3
    public final SSLSocketFactory l(X509TrustManager r3) {
        SSLContext r2 = k();
        r2.init(null, new TrustManager[]{r3}, null);
        SSLSocketFactory r4 = r2.getSocketFactory();
        r4.getClass();
        return r4;
    }

    @Override // defpackage.qg3
    public final X509TrustManager m() {
        TrustManagerFactory r3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        r3.init(null);
        TrustManager[] r4 = r3.getTrustManagers();
        r4.getClass();
        if (r4.length != 1) goto L8;
        TrustManager r1 = r4[0];
        if ((r1 instanceof X509TrustManager) == false) goto L8;
        r1.getClass();
        X509TrustManager r2 = (X509TrustManager) r1;
        Conscrypt.setHostnameVerifier(r2, ab0.a);
        return r2;
    L8:
        String r5 = Arrays.toString(r4);
        r5.getClass();
        nz2.f("Unexpected default trust managers: ".concat(r5));
        return null;
    }
}
