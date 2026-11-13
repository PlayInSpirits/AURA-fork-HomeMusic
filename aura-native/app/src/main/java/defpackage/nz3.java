package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nz3 {
    public gr1 a;
    public tz3 d;
    public Map e = v01.n;
    public String b = "GET";
    public sl1 c = new sl1();

    public final void a(String str, String str2) {
        str2.getClass();
        sl1 sl1Var = this.c;
        sl1Var.getClass();
        e35.G(str);
        e35.H(str2, str);
        sl1Var.e(str);
        e35.p(sl1Var, str, str2);
    }

    public final void b(String str, tz3 tz3Var) {
        str.getClass();
        if (str.length() <= 0) {
            kf2.n("method.isEmpty() == true");
            return;
        }
        if (tz3Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                kf2.e(xa3.h("method ", str, " must have a request body."));
                return;
            }
        } else if (!gb.T(str)) {
            kf2.e(xa3.h("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = tz3Var;
    }

    public final void c(Class cls, Object obj) {
        Map f;
        cls.getClass();
        i30 a = kx3.a(cls);
        Map map = this.e;
        if (obj == null) {
            if (map.isEmpty()) {
                return;
            }
            Map map2 = this.e;
            map2.getClass();
            jz4.f(map2).remove(a);
            return;
        }
        if (map.isEmpty()) {
            f = new LinkedHashMap();
            this.e = f;
        } else {
            Map map3 = this.e;
            map3.getClass();
            f = jz4.f(map3);
        }
        f.put(a, obj);
    }

    public final void d(String str) {
        str.getClass();
        if (xm4.k0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (xm4.k0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        fr1 fr1Var = new fr1();
        fr1Var.e(null, str);
        this.a = fr1Var.b();
    }
}
