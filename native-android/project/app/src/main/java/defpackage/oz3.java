package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oz3 {
    public final gr1 a;
    public final String b;
    public final tl1 c;
    public final tz3 d;
    public final Map e;
    public ix f;

    public oz3(nz3 r2) {
        gr1 r0 = r2.a;
        if (r0 == null) goto L6;
        this.a = r0;
        this.b = r2.b;
        this.c = r2.c.c();
        this.d = r2.d;
        this.e = lg2.a0(r2.e);
        return;
    L6:
        kf2.o("url == null");
        throw null;
    }

    public final nz3 a() {
        nz3 r0 = new nz3();
        Map r1 = v01.n;
        r0.e = r1;
        r0.a = this.a;
        r0.b = this.b;
        r0.d = this.d;
        Map r2 = this.e;
        if (r2.isEmpty() == true) goto L6;
        r1 = new LinkedHashMap(r2);
    L6:
        r0.e = r1;
        r0.c = this.c.d();
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Request{method=");
        r0.append(this.b);
        r0.append(", url=");
        r0.append(this.a);
        tl1 r1 = this.c;
        if (r1.size() == 0) goto L19;
        r0.append(", headers=[");
        Iterator r2 = r1.iterator();
        int r3 = 0;
    L5:
        x0 r4 = (x0) r2;
        if (r4.hasNext() == false) goto L18;
        Object r5 = r4.next();
        int r6 = r3 + 1;
        if (r3 < 0) goto L16;
        kd3 r7 = (kd3) r5;
        String r8 = (String) r7.n;
        String r9 = (String) r7.o;
        if (r3 <= 0) goto L12;
        r0.append(", ");
    L12:
        r0.append(r8);
        r0.append(':');
        if (xe5.l(r8) == false) goto L15;
        r9 = "██";
    L15:
        r0.append(r9);
        r3 = r6;
        goto L5
    L16:
        gb.c0();
        throw null;
    L18:
        r0.append(']');
    L19:
        Map r10 = this.e;
        if (r10.isEmpty() == true) goto L22;
        r0.append(", tags=");
        r0.append(r10);
    L22:
        r0.append('}');
        return r0.toString();
    }
}
