package defpackage;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r22 extends qg3 {
    public static final boolean c = false;
    public static final Integer d = null;

    static {
        String r0 = System.getProperty("java.specification.version");
        if (r0 == null) goto L5;
        Integer r1 = xm4.l0(r0);
    L6:
        d = r1;
        boolean r2 = false;
        if (r1 != null) goto L9;
        SSLSocket.class.getMethod("getApplicationProtocol", null);     // Catch: NoSuchMethodException -> L15
    L10:
        r2 = true;
    L13:
        c = r2;
        return;
    L9:
        if (r1.intValue() < 9) goto L13;
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r5, String r6, List r7) {
        r7.getClass();
        SSLParameters r4 = r5.getSSLParameters();
        ArrayList r8 = new ArrayList();
        Iterator r9 = r7.iterator();
    L4:
        if (r9.hasNext() == false) goto L8;
        Object r0 = r9.next();
        if (((pr3) r0) == pr3.p) goto L4;
        r8.add(r0);
        goto L4
    L8:
        ArrayList r10 = new ArrayList(r40.k0(r8, 10));
        int r1 = r8.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L11;
        Object r3 = r8.get(r2);
        r2 = r2 + 1;
        r10.add(((pr3) r3).n);
        goto L9
    L11:
        yj1.o(r4, (String[]) r10.toArray(new String[0]));
        r5.setSSLParameters(r4);
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r1) {
        String r0 = yj1.d(r1);     // Catch: UnsupportedOperationException -> L11
        if (r0 != null) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        return r0;
    L9:
        return null;
    L5:
        r2 = r0.equals("");     // Catch: UnsupportedOperationException -> L11
    L14:
        return null;
    }

    @Override // defpackage.qg3
    public final SSLContext k() {
        Integer r0 = d;
        if (r0 != null) goto L5;
    L13:
        SSLContext r2 = SSLContext.getInstance("TLSv1.3");     // Catch: NoSuchAlgorithmException -> L10
    L11:
        r2.getClass();
        return r2;
    L10:
        r2 = SSLContext.getInstance("TLS");
        goto L11
    L5:
        if (r0.intValue() < 9) goto L13;
        SSLContext r3 = SSLContext.getInstance("TLS");
        r3.getClass();
        return r3;
    }
}
