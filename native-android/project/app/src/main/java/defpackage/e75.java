package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e75 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapA0 = lg2.a0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapA0.values().iterator();
        while (it.hasNext()) {
            ((x65) it.next()).a();
        }
    }

    public final String toString() {
        String strC = kx3.a(e75.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        ya4.g(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + q40.T0(this.a.keySet()) + ")";
    }
}
