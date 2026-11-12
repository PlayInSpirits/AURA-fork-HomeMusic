package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 {
    public final HashMap a;
    public final HashMap b;

    public j30(HashMap r5) {
        this.b = r5;
        this.a = new HashMap();
        Iterator r6 = r5.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        Map.Entry r0 = (Map.Entry) r6.next();
        q92 r1 = (q92) r0.getValue();
        List r2 = (List) this.a.get(r1);
        if (r2 != null) goto L8;
        r2 = new ArrayList();
        this.a.put(r1, r2);
    L8:
        r2.add((k30) r0.getKey());
        goto L4
    }

    public static void a(List r5, ba2 r6, q92 r7, Object r8) {
        if (r5 == null) goto L29;
        int r0 = r5.size() - 1;
    L4:
        if (r0 < 0) goto L30;
        k30 r2 = (k30) r5.get(r0);
        Method r3 = r2.b;
        int r4 = r2.a;     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        if (r4 == 0) goto L14;
        if (r4 != 1) goto L10;
        r3.invoke(r8, new Object[]{r6});     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
    L15:
        r0 = r0 - 1;
        goto L4
    L10:
        if (r4 != 2) goto L15;
        r3.invoke(r8, new Object[]{r6, r7});     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        goto L15
    L14:
        r3.invoke(r8, null);     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        goto L15
    L16:
        e = move-exception;
        er1.m(e);
        return;
    L19:
        e = move-exception;
        nz2.s("Failed to call observer method", e.getCause());
        return;
    L30:
        return;
    }
}
