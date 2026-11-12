package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qc implements ny4 {
    public final X509TrustManager a;
    public final Method b;

    public qc(X509TrustManager r1, Method r2) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.ny4
    public final X509Certificate a(X509Certificate r2) {
        Object r1 = this.b.invoke(this.a, new Object[]{r2});     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
        r1.getClass();     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
        return ((TrustAnchor) r1).getTrustedCert();
    L6:
        e = move-exception;
        throw new AssertionError("unable to get issues and signature", e);
    L4:
        return null;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof qc) == false) goto L16;
        qc r4 = (qc) r3;
        if (h12.c(this.a, r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
