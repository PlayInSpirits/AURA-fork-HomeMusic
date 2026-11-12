package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends qg3 {
    public static final boolean d = false;
    public final ArrayList c;

    static {
        boolean r1 = false;
        if (au0.J() == true) goto L6;
    L9:
        d = r1;
        return;
    L6:
        if (Build.VERSION.SDK_INT >= 30) goto L9;
        r1 = true;
        goto L9
    }

    public rc() {
        Class<?> r3 = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));     // Catch: Exception -> L5
        Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));     // Catch: Exception -> L5
        Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));     // Catch: Exception -> L5
        uk4 r0 = new uk4(r3);     // Catch: Exception -> L5
    L7:
        int r5 = 0;
        ArrayList r1 = ti.i0(new uh4[]{r0, new wn0(uc.e), new wn0(db0.a), new wn0(eu.a)});
        ArrayList r2 = new ArrayList();
        int r4 = r1.size();
    L8:
        if (r5 >= r4) goto L12;
        Object r6 = r1.get(r5);
        r5 = r5 + 1;
        if (((uh4) r6).a() == false) goto L8;
        r2.add(r6);
        goto L8
    L12:
        this.c = r2;
        return;
    L5:
        e = move-exception;
        CopyOnWriteArraySet r7 = dc.a;
        dc.a(o83.class.getName(), 5, "unable to load android socket classes", e);
        r0 = null;
        goto L7
    }

    @Override // defpackage.qg3
    public final rr2 b(X509TrustManager r3) {
        r3.getClass();
        ca r0 = null;
        X509TrustManagerExtensions r1 = new X509TrustManagerExtensions(r3);     // Catch: IllegalArgumentException -> L5
    L6:
        if (r1 == null) goto L8;
        r0 = new ca(r3, r1);
    L8:
        if (r0 == null) goto L11;
        return r0;
    L11:
        return super.b(r3);
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.qg3
    public final ny4 c(X509TrustManager r4) {
        r4.getClass();
        Method r0 = r4.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});     // Catch: NoSuchMethodException -> L5
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        return new qc(r4, r0);
    L6:
        return super.c(r4);
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r5, String r6, List r7) {
        r7.getClass();
        ArrayList r4 = this.c;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        if (((uh4) r2).b(r5) == false) goto L3;
    L8:
        uh4 r3 = (uh4) r2;
        if (r3 == null) goto L15;
        r3.d(r5, r6, r7);
        return;
    L15:
        return;
    L7:
        r2 = null;
        goto L8
    }

    @Override // defpackage.qg3
    public final void e(Socket r1, InetSocketAddress r2, int r3) {
        r2.getClass();
        r1.connect(r2, r3);     // Catch: ClassCastException -> L5
        return;
    L5:
        e = move-exception;
        if (Build.VERSION.SDK_INT == 26) goto L9;
        throw e;
    L9:
        throw new IOException("Exception in connect", e);
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r6) {
        ArrayList r5 = this.c;
        int r0 = r5.size();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L8;
        Object r3 = r5.get(r1);
        r1 = r1 + 1;
        if (((uh4) r3).b(r6) == false) goto L4;
    L9:
        uh4 r4 = (uh4) r3;
        if (r4 != null) goto L12;
        return null;
    L12:
        return r4.c(r6);
    L8:
        r3 = null;
        goto L9
    }

    @Override // defpackage.qg3
    public final boolean h(String r1) {
        r1.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(r1);
    }
}
