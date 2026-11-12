package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public j30(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            q92 q92Var = (q92) entry.getValue();
            List arrayList = (List) this.a.get(q92Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(q92Var, arrayList);
            }
            arrayList.add((k30) entry.getKey());
        }
    }

    public static void a(List list, ba2 ba2Var, q92 q92Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                k30 k30Var = (k30) list.get(size);
                Method method = k30Var.b;
                try {
                    int i = k30Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, ba2Var);
                    } else if (i == 2) {
                        method.invoke(obj, ba2Var, q92Var);
                    }
                } catch (IllegalAccessException e) {
                    er1.m(e);
                    return;
                } catch (InvocationTargetException e2) {
                    nz2.s("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
