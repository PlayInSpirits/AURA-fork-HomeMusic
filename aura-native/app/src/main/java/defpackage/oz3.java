package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oz3 {
    public final gr1 a;
    public final String b;
    public final tl1 c;
    public final tz3 d;
    public final Map e;
    public ix f;

    public oz3(nz3 nz3Var) {
        gr1 gr1Var = nz3Var.a;
        if (gr1Var == null) {
            kf2.o("url == null");
            throw null;
        }
        this.a = gr1Var;
        this.b = nz3Var.b;
        this.c = nz3Var.c.c();
        this.d = nz3Var.d;
        this.e = lg2.a0(nz3Var.e);
    }

    public final nz3 a() {
        nz3 nz3Var = new nz3();
        Map map = v01.n;
        nz3Var.e = map;
        nz3Var.a = this.a;
        nz3Var.b = this.b;
        nz3Var.d = this.d;
        Map map2 = this.e;
        if (!map2.isEmpty()) {
            map = new LinkedHashMap(map2);
        }
        nz3Var.e = map;
        nz3Var.c = this.c.d();
        return nz3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        tl1 tl1Var = this.c;
        if (tl1Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = tl1Var.iterator();
            int i = 0;
            while (true) {
                x0 x0Var = (x0) it;
                if (!x0Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = x0Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    gb.c0();
                    throw null;
                }
                kd3 kd3Var = (kd3) next;
                String str = (String) kd3Var.n;
                String str2 = (String) kd3Var.o;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (xe5.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
