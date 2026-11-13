package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qc implements ny4 {
    public final X509TrustManager a;
    public final Method b;

    public qc(X509TrustManager x509TrustManager, Method method) {
        x509TrustManager.getClass();
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // defpackage.ny4
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.b.invoke(this.a, x509Certificate);
            invoke.getClass();
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return h12.c(this.a, qcVar.a) && this.b.equals(qcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
