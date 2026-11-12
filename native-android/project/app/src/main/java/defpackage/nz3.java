package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nz3 {
    public gr1 a;
    public String b;
    public sl1 c;
    public tz3 d;
    public Map e;

    public nz3() {
        this.e = v01.n;
        this.b = "GET";
        this.c = new sl1();
    }

    public final void a(String r1, String r2) {
        r2.getClass();
        sl1 r0 = this.c;
        r0.getClass();
        e35.G(r1);
        e35.H(r2, r1);
        r0.e(r1);
        e35.p(r0, r1, r2);
    }

    public final void b(String r3, tz3 r4) {
        r3.getClass();
        if (r3.length() > 0) goto L5;
        kf2.n("method.isEmpty() == true");
        return;
    L5:
        if (r4 != null) goto L20;
        if (r3.equals("POST") == false) goto L9;
    L17:
        kf2.e(xa3.h("method ", r3, " must have a request body."));
        return;
    L9:
        if (r3.equals("PUT") == true) goto L17;
        if (r3.equals("PATCH") == true) goto L17;
        if (r3.equals("PROPPATCH") == true) goto L17;
        if (r3.equals("REPORT") == true) goto L17;
    L21:
        this.b = r3;
        this.d = r4;
        return;
    L20:
        if (gb.T(r3) == true) goto L21;
        kf2.e(xa3.h("method ", r3, " must not have a request body."));
    }

    public final void c(Class r2, Object r3) {
        r2.getClass();
        i30 r4 = kx3.a(r2);
        Map r0 = this.e;
        if (r3 != null) goto L9;
        if (r0.isEmpty() == true) goto L14;
        Map r1 = this.e;
        r1.getClass();
        jz4.f(r1).remove(r4);
        return;
    L14:
        return;
    L9:
        if (r0.isEmpty() == false) goto L11;
        Map r5 = new LinkedHashMap();
        this.e = r5;
    L12:
        r5.put(r4, r3);
        return;
    L11:
        Map r6 = this.e;
        r6.getClass();
        r5 = jz4.f(r6);
        goto L12
    }

    public final void d(String r3) {
        r3.getClass();
        if (xm4.k0(r3, "ws:", true) == false) goto L6;
        r3 = "http:".concat(r3.substring(3));
    L8:
        fr1 r0 = new fr1();
        r0.e(null, r3);
        this.a = r0.b();
        return;
    L6:
        if (xm4.k0(r3, "wss:", true) == false) goto L8;
        r3 = "https:".concat(r3.substring(4));
        goto L8
    }
}
