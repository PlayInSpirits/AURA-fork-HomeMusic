package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n61 {
    public static long d;
    public static volatile mq e;
    public static volatile er1 g;
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public static synchronized void a(l61 l61Var) {
        if (l61Var == null) {
            return;
        }
        l61Var.d = true;
        l61Var.e = false;
        c(l61Var.a);
        b();
    }

    public static void b() {
        mq mqVar = e;
        if (mqVar != null) {
            mqVar.run();
        }
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (l61 l61Var = (l61) a.get(str); l61Var != null; l61Var = l61Var.c) {
            linkedHashMap.merge(l61Var.f, Boolean.valueOf(true ^ l61Var.e), new j61(0));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            k61 k61Var = (k61) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (zBooleanValue != k61Var.f) {
                k61Var.f = zBooleanValue;
                String str2 = k61Var.e;
                k61Var.e = UUID.randomUUID().toString();
                if (g != null) {
                    er1 er1Var = g;
                    int i = k61Var.a;
                    String str3 = k61Var.b;
                    boolean z = k61Var.c;
                    if (!zBooleanValue) {
                        z = !z;
                    }
                    String str4 = k61Var.e;
                    boolean z2 = !str2.equals(k61Var.d);
                    er1Var.getClass();
                    er1.p(i, str3, z, str4, str2, z2);
                }
            }
        }
    }

    public static synchronized long d() {
        return d;
    }

    public static String e(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            str2 = "SONG";
        } else if (i == 2) {
            str2 = "ALBUM";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "ARTIST";
        }
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        String string = sb.toString();
        while (true) {
            HashMap map = c;
            if (!map.containsKey(string)) {
                return string;
            }
            string = (String) map.get(string);
        }
    }

    public static synchronized boolean f(int i, String str, boolean z) {
        l61 l61Var;
        if (str != null) {
            try {
                l61Var = (l61) a.get(e(i, str));
                while (l61Var != null && l61Var.e) {
                    l61Var = l61Var.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            l61Var = null;
        }
        return l61Var != null ? l61Var.b : ((Boolean) b.getOrDefault(e(i, str), Boolean.valueOf(z))).booleanValue();
    }

    public static synchronized l61 g(int i, String str, boolean z) {
        return h(i, str, z, null, true);
    }

    public static synchronized l61 h(int i, String str, boolean z, String str2, boolean z2) {
        k61 k61Var;
        if (str == null) {
            return null;
        }
        try {
            String strE = e(i, str);
            HashMap map = a;
            l61 l61Var = (l61) map.get(strE);
            while (l61Var != null && l61Var.e) {
                l61Var = l61Var.c;
            }
            boolean z3 = l61Var == null || l61Var.b != z;
            if (z3) {
                k61Var = str2 == null ? new k61(str, i, UUID.randomUUID().toString(), z) : new k61(str, i, str2, z);
            } else {
                k61Var = l61Var.f;
            }
            l61 l61Var2 = new l61(strE, z, (l61) map.get(strE), k61Var);
            map.put(strE, l61Var2);
            b();
            if (z2 && z3 && g != null) {
                er1 er1Var = g;
                String str3 = k61Var.d;
                er1Var.getClass();
                er1.p(i, str, z, str3, null, false);
            }
            return l61Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void i(long j, List list) {
        try {
            if (j != d) {
                return;
            }
            b.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m61 m61Var = (m61) it.next();
                b.putIfAbsent(e(m61Var.a, m61Var.b), Boolean.valueOf(m61Var.c));
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void j(l61 l61Var) {
        if (l61Var == null) {
            return;
        }
        for (l61 l61Var2 = l61Var; l61Var2 != null; l61Var2 = l61Var2.c) {
            try {
                if (!l61Var2.e) {
                    if (l61Var2.d || l61Var2.b != l61Var.b) {
                        break;
                        break;
                    }
                    l61Var2.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(l61Var.a);
        b();
    }

    public static synchronized void k(int i, String str, boolean z) {
        if (str == null) {
            return;
        }
        try {
            for (l61 l61Var = (l61) a.get(e(i, str)); l61Var != null && !l61Var.d; l61Var = l61Var.c) {
                if (l61Var.b != z) {
                    l61Var.e = true;
                }
            }
            c(e(i, str));
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void l(l61 l61Var) {
        if (l61Var != null) {
            if (!l61Var.d) {
                l61Var.e = true;
                c(l61Var.a);
                b();
            }
        }
    }
}
