package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e75 {
    public final LinkedHashMap a;

    public e75() {
        this.a = new LinkedHashMap();
    }

    public final void a() {
        LinkedHashMap r1 = this.a;
        Map r0 = lg2.a0(r1);
        r1.clear();
        Iterator r2 = r0.values().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        ((x65) r2.next()).a();
        goto L4
    }

    public final String toString() {
        String r0 = kx3.a(e75.class).c();
        if (r0 != null) goto L5;
        r0 = "ViewModelStore";
    L5:
        int r1 = hashCode();
        ya4.g(16);
        String r2 = Integer.toString(r1, 16);
        r2.getClass();
        return r0 + "@" + r2 + "(keys=" + q40.T0(this.a.keySet()) + ")";
    }
}
