package defpackage;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j90 implements PrivilegedAction {
    public j90() {
        super();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        TreeMap treeMap = new TreeMap();
        k90 k90Var = k90.b;
        Iterator it = k90.c().iterator();
        while (it.hasNext()) {
            treeMap.put(((String) it.next()).toUpperCase(Locale.ROOT), k90Var);
        }
        e1 e1Var = new e1();
        ArrayList arrayList = new ArrayList();
        while (e1Var.a()) {
            arrayList.add(e1Var.next());
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k90 k90Var2 = (k90) obj;
            k90Var2.getClass();
            Iterator it2 = k90.c().iterator();
            while (it2.hasNext()) {
                treeMap.put(((String) it2.next()).toUpperCase(Locale.ROOT), k90Var2);
            }
        }
        return treeMap;
    }
}
