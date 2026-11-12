package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m83 implements HostnameVerifier {
    public static final m83 a = null;

    static {
        a = new m83();
    }

    public static List a(X509Certificate r4, int r5) {
        Collection<List<?>> r6 = r4.getSubjectAlternativeNames();     // Catch: CertificateParsingException -> L23
        if (r6 == null) goto L22;
        ArrayList r0 = new ArrayList();     // Catch: CertificateParsingException -> L23
        Iterator<List<?>> r7 = r6.iterator();     // Catch: CertificateParsingException -> L23
    L7:
        if (r7.hasNext() == false) goto L20;
        List<?> r1 = r7.next();     // Catch: CertificateParsingException -> L23
        if (r1 == null) goto L7;
        if (r1.size() < 2) goto L7;
        if (h12.c(r1.get(0), Integer.valueOf(r5)) == false) goto L7;
        Object r2 = r1.get(1);     // Catch: CertificateParsingException -> L23
        if (r2 == null) goto L7;
        r0.add((String) r2);     // Catch: CertificateParsingException -> L23
    L20:
        return r0;
    L22:
        return u01.n;
    }

    public static boolean b(String r13) {
        int r0 = r13.length();
        int r1 = r13.length();
        if (r1 >= 0) goto L5;
        kf2.e(b11.j(r1, "endIndex < beginIndex: ", " < 0"));
        return false;
    L5:
        if (r1 > r13.length()) goto L39;
        long r3 = 0;
        int r5 = 0;
    L7:
        if (r5 >= r1) goto L35;
        char r6 = r13.charAt(r5);
        if (r6 < 128) goto L10;
        if (r6 < 2048) goto L14;
        if (r6 < 55296) goto L33;
        if (r6 > 57343) goto L33;
        int r10 = r5 + 1;
        if (r10 >= r1) goto L24;
        char r11 = r13.charAt(r10);
    L26:
        if (r6 > 56319) goto L32;
        if (r11 < 56320) goto L32;
        if (r11 > 57343) goto L32;
        r3 = r3 + 4;
        r5 = r5 + 2;
    L32:
        r3 = r3 + 1;
        r5 = r10;
        goto L7
    L24:
        r11 = 0;
    L33:
        long r7 = 3;
    L15:
        r3 = r3 + r7;
    L11:
        r5 = r5 + 1;
        goto L7
    L14:
        r7 = 2;
        goto L15
    L10:
        r3 = r3 + 1;
        goto L11
    L35:
        if (r0 != ((int) r3)) goto L38;
        return true;
    L38:
        return false;
    L39:
        StringBuilder r2 = f34.j(r1, "endIndex > string.length: ", " > ");
        r2.append(r13.length());
        throw new IllegalArgumentException(r2.toString().toString());
    }

    public static boolean c(String r9, X509Certificate r10) {
        r9.getClass();
        if (ue5.a.a(r9) == false) goto L14;
        String r11 = ue5.b(r9);
        List r12 = a(r10, 7);
        if (r12.isEmpty() == true) goto L74;
        Iterator r13 = r12.iterator();
    L9:
        if (r13.hasNext() == false) goto L74;
        if (h12.c(r11, ue5.b((String) r13.next())) == false) goto L9;
    L73:
        return true;
    L74:
        return false;
    L14:
        if (b(r9) == false) goto L16;
        Locale r0 = Locale.US;
        r0.getClass();
        r9 = r9.toLowerCase(r0);
        r9.getClass();
    L16:
        List r14 = a(r10, 2);
        if (r14.isEmpty() == true) goto L74;
        Iterator r15 = r14.iterator();
    L21:
        if (r15.hasNext() == false) goto L74;
        String r1 = (String) r15.next();
        if (r9.length() != 0) goto L26;
    L59:
        boolean r2 = false;
    L72:
        if (r2 == false) goto L21;
    L26:
        if (xm4.k0(r9, ".", false) == true) goto L59;
        if (xm4.e0(r9, "..", false) == true) goto L59;
        if (r1 == null) goto L59;
        if (r1.length() == 0) goto L59;
        if (xm4.k0(r1, ".", false) == true) goto L59;
        if (xm4.e0(r1, "..", false) == true) goto L59;
        if (xm4.e0(r9, ".", false) == true) goto L42;
        String r4 = r9.concat(".");
    L44:
        if (xm4.e0(r1, ".", false) == true) goto L47;
        r1 = r1.concat(".");
    L47:
        if (b(r1) == false) goto L50;
        Locale r3 = Locale.US;
        r3.getClass();
        r1 = r1.toLowerCase(r3);
        r1.getClass();
    L50:
        if (qm4.o0(r1, "*") == true) goto L53;
        r2 = r4.equals(r1);
        goto L72
    L53:
        if (xm4.k0(r1, "*.", false) == false) goto L59;
        if (qm4.r0(r1, '*', 1, 4) != (-1)) goto L59;
        if (r4.length() < r1.length()) goto L59;
        if ("*.".equals(r1) == true) goto L59;
        String r5 = r1.substring(1);
        if (xm4.e0(r4, r5, false) == false) goto L59;
        int r6 = r4.length() - r5.length();
        if (r6 > 0) goto L69;
    L71:
        r2 = true;
        goto L72
    L69:
        if (qm4.v0(r4, '.', r6 - 1, 4) == (-1)) goto L71;
    L42:
        r4 = r9;
        goto L44
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String r2, SSLSession r3) {
        r2.getClass();
        r3.getClass();
        if (b(r2) == true) goto L9;
    L7:
        return false;
    L9:
        Certificate r1 = r3.getPeerCertificates()[0];     // Catch: SSLException -> L8
        r1.getClass();     // Catch: SSLException -> L8
        return c(r2, (X509Certificate) r1);
    }
}
