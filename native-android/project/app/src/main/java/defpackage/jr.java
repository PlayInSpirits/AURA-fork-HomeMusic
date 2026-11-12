package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr extends rr2 {
    public final ny4 c;

    public jr(ny4 r1) {
        r1.getClass();
        this.c = r1;
    }

    public static boolean Y(X509Certificate r2, X509Certificate r3, int r4) {
        if (h12.c(r2.getIssuerDN(), r3.getSubjectDN()) == true) goto L6;
        return false;
    L6:
        if (r3.getBasicConstraints() < r4) goto L16;
        r2.verify(r3.getPublicKey());     // Catch: GeneralSecurityException -> L13
        return true;
    L17:
        return false;
    L16:
        return false;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L6;
        return true;
    L6:
        if ((r3 instanceof jr) == true) goto L8;
        return false;
    L8:
        if (h12.c(((jr) r3).c, this.c) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.rr2
    public final List x(String r8, List r9) {
        r9.getClass();
        r8.getClass();
        ArrayDeque r10 = new ArrayDeque(r9);
        ArrayList r11 = new ArrayList();
        Object r0 = r10.removeFirst();
        r0.getClass();
        r11.add(r0);
        int r1 = 0;
        boolean r2 = false;
    L4:
        if (r1 >= 9) goto L28;
        Object r3 = r11.get(r11.size() - 1);
        r3.getClass();
        X509Certificate r4 = (X509Certificate) r3;
        X509Certificate r5 = this.c.a(r4);
        if (r5 != null) goto L8;
        Iterator r6 = r10.iterator();
        r6.getClass();
    L18:
        if (r6.hasNext() == false) goto L23;
        Object r7 = r6.next();
        r7.getClass();
        X509Certificate r12 = (X509Certificate) r7;
        if (Y(r4, r12, r11.size() - 1) == false) goto L18;
        r6.remove();
        r11.add(r12);
    L22:
        r1 = r1 + 1;
        goto L4
    L23:
        if (r2 == false) goto L26;
    L24:
        return r11;
    L26:
        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + r4);
    L8:
        if (r11.size() <= 1) goto L10;
    L11:
        r11.add(r5);
    L13:
        if (Y(r5, r5, r11.size() - 2) == true) goto L24;
        r2 = true;
        goto L22
    L10:
        if (r4.equals(r5) == true) goto L13;
    L28:
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + r11);
    }
}
