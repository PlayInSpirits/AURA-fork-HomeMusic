package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e75 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map a0 = lg2.a0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = a0.values().iterator();
        while (it.hasNext()) {
            ((x65) it.next()).a();
        }
    }

    public final String toString() {
        String c = kx3.a(e75.class).c();
        if (c == null) {
            c = "ViewModelStore";
        }
        int hashCode = hashCode();
        ya4.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return c + "@" + num + "(keys=" + q40.T0(this.a.keySet()) + ")";
    }
}
