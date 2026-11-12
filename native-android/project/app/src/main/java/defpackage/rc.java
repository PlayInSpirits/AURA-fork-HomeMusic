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
    public static final boolean d;
    public final ArrayList c;

    static {
        boolean z = false;
        if (au0.J() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        d = z;
    }

    public rc() {
        uk4 uk4Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            uk4Var = new uk4(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = dc.a;
            dc.a(o83.class.getName(), 5, "unable to load android socket classes", e);
            uk4Var = null;
        }
        int i = 0;
        ArrayList arrayListI0 = ti.i0(new uh4[]{uk4Var, new wn0(uc.e), new wn0(db0.a), new wn0(eu.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        while (i < size) {
            Object obj = arrayListI0.get(i);
            i++;
            if (((uh4) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.qg3
    public final rr2 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ca caVar = x509TrustManagerExtensions != null ? new ca(x509TrustManager, x509TrustManagerExtensions) : null;
        return caVar != null ? caVar : super.b(x509TrustManager);
    }

    @Override // defpackage.qg3
    public final ny4 c(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new qc(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((uh4) obj).b(sSLSocket));
        uh4 uh4Var = (uh4) obj;
        if (uh4Var != null) {
            uh4Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.qg3
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((uh4) obj).b(sSLSocket));
        uh4 uh4Var = (uh4) obj;
        if (uh4Var != null) {
            return uh4Var.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.qg3
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
