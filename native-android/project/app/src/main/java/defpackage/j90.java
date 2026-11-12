package defpackage;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        TreeMap r7 = new TreeMap();
        k90 r0 = k90.b;
        Iterator r1 = k90.c().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r7.put(((String) r1.next()).toUpperCase(Locale.ROOT), r0);
        goto L4
    L6:
        e1 r2 = new e1();
        ArrayList r3 = new ArrayList();
    L8:
        if (r2.a() == false) goto L10;
        r3.add(r2.next());
        goto L8
    L10:
        int r4 = r3.size();
        int r5 = 0;
    L11:
        if (r5 >= r4) goto L16;
        Object r6 = r3.get(r5);
        r5 = r5 + 1;
        k90 r8 = (k90) r6;
        r8.getClass();
        Iterator r9 = k90.c().iterator();
    L14:
        if (r9.hasNext() == false) goto L11;
        r7.put(((String) r9.next()).toUpperCase(Locale.ROOT), r8);
        goto L14
    L16:
        return r7;
    }
}
