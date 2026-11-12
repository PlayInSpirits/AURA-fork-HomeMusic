package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class br1 {
    static {
        yw r0 = yw.q;
        pa.t("\"\\");
        pa.t("\t ,=");
    }

    public static final boolean a(k14 r4) {
        if (h12.c(r4.n.b, "HEAD") == true) goto L26;
        int r0 = r4.q;
        if (r0 < 100) goto L10;
        if (r0 >= 200) goto L10;
    L15:
        if (ze5.e(r4) != (-1)) goto L24;
        String r5 = r4.s.a("Transfer-Encoding");
        if (r5 != null) goto L20;
        r5 = null;
    L20:
        if ("chunked".equalsIgnoreCase(r5) == true) goto L28;
        return false;
    L28:
        return true;
    L24:
        return true;
    L10:
        if (r0 == 204) goto L15;
        if (r0 == 304) goto L15;
        return true;
    L26:
        return false;
    }

    public static final void b(be0 r4, gr1 r5, tl1 r6) {
        r4.getClass();
        r5.getClass();
        r6.getClass();
        if (r4 == be0.g) goto L25;
        Pattern r0 = ae0.k;
        List r7 = r6.f("Set-Cookie");
        int r1 = r7.size();
        ArrayList r2 = null;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L14;
        ae0 r8 = l93.T(r5, (String) r7.get(r3));
        if (r8 == null) goto L13;
        if (r2 != null) goto L12;
        r2 = new ArrayList();
    L12:
        r2.add(r8);
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        if (r2 == null) goto L16;
        List r9 = Collections.unmodifiableList(r2);
        r9.getClass();
    L18:
        if (r9.isEmpty() == false) goto L20;
        return;
    L20:
        r4.p(r5, r9);
        return;
    L16:
        r9 = u01.n;
        goto L18
    }
}
