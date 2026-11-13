package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s9 extends qg3 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = au0.J() && Build.VERSION.SDK_INT >= 29;
    }

    public s9() {
        int i = 0;
        ArrayList i0 = ti.i0(new uh4[]{(!au0.J() || Build.VERSION.SDK_INT < 29) ? null : new t9(), new wn0(uc.e), new wn0(db0.a), new wn0(eu.a)});
        ArrayList arrayList = new ArrayList();
        int size = i0.size();
        while (i < size) {
            Object obj = i0.get(i);
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((uh4) obj).b(sSLSocket)) {
                break;
            }
        }
        uh4 uh4Var = (uh4) obj;
        if (uh4Var != null) {
            uh4Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((uh4) obj).b(sSLSocket)) {
                break;
            }
        }
        uh4 uh4Var = (uh4) obj;
        if (uh4Var != null) {
            return uh4Var.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.qg3
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard k = l3.k();
        k.open("response.body().close()");
        return k;
    }

    @Override // defpackage.qg3
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.qg3
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(obj, str);
        } else {
            obj.getClass();
            l3.l(obj).warnIfOpen();
        }
    }
}
