package defpackage;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class or implements ny4 {
    public final LinkedHashMap a;

    public or(X509Certificate... r7) {
        LinkedHashMap r0 = new LinkedHashMap();
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        X509Certificate r3 = r7[r2];
        X500Principal r4 = r3.getSubjectX500Principal();
        r4.getClass();
        Object r5 = r0.get(r4);
        if (r5 != null) goto L7;
        r5 = new LinkedHashSet();
        r0.put(r4, r5);
    L7:
        ((Set) r5).add(r3);
        r2 = r2 + 1;
        goto L3
    L8:
        this.a = r0;
    }

    @Override // defpackage.ny4
    public final X509Certificate a(X509Certificate r4) {
        X500Principal r0 = r4.getIssuerX500Principal();
        Set r3 = (Set) this.a.get(r0);
        Object r1 = null;
        if (r3 != null) goto L5;
        return null;
    L5:
        Iterator r5 = r3.iterator();
    L7:
        if (r5.hasNext() == false) goto L12;
        Object r2 = r5.next();
        r4.verify(((X509Certificate) r2).getPublicKey());     // Catch: Exception -> L13
        r1 = r2;
    L12:
        return (X509Certificate) r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof or) == true) goto L6;
        return false;
    L6:
        if (h12.c(((or) r2).a, this.a) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
