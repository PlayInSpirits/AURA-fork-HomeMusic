package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i44 implements Iterable {
    public f44 n;
    public f44 o;
    public final WeakHashMap p = new WeakHashMap();
    public int q = 0;

    public final Object a(Object obj, Object obj2) {
        f44 f44Var = this.n;
        while (f44Var != null && !f44Var.n.equals(obj)) {
            f44Var = f44Var.p;
        }
        if (f44Var != null) {
            return f44Var.o;
        }
        f44 f44Var2 = new f44(obj, obj2);
        this.q++;
        f44 f44Var3 = this.o;
        if (f44Var3 == null) {
            this.n = f44Var2;
            this.o = f44Var2;
            return null;
        }
        f44Var3.p = f44Var2;
        f44Var2.q = f44Var3;
        this.o = f44Var2;
        return null;
    }

    public final Object b(Object obj) {
        f44 f44Var = this.n;
        while (f44Var != null && !f44Var.n.equals(obj)) {
            f44Var = f44Var.p;
        }
        if (f44Var == null) {
            return null;
        }
        this.q--;
        WeakHashMap weakHashMap = this.p;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((h44) it.next()).a(f44Var);
            }
        }
        f44 f44Var2 = f44Var.q;
        f44 f44Var3 = f44Var.p;
        if (f44Var2 != null) {
            f44Var2.p = f44Var3;
        } else {
            this.n = f44Var3;
        }
        f44 f44Var4 = f44Var.p;
        if (f44Var4 != null) {
            f44Var4.q = f44Var2;
        } else {
            this.o = f44Var2;
        }
        f44Var.p = null;
        f44Var.q = null;
        return f44Var.o;
    }

    public final boolean equals(Object obj) {
        e44 e44Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i44)) {
            return false;
        }
        i44 i44Var = (i44) obj;
        if (this.q != i44Var.q) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = i44Var.iterator();
        while (true) {
            e44Var = (e44) it;
            if (!e44Var.hasNext()) {
                break;
            }
            e44 e44Var2 = (e44) it2;
            if (!e44Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) e44Var.next();
            Object next = e44Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (e44Var.hasNext() || ((e44) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            e44 e44Var = (e44) it;
            if (!e44Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) e44Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f44 f44Var = this.n;
        f44 f44Var2 = this.o;
        e44 e44Var = new e44();
        e44Var.n = f44Var2;
        e44Var.o = f44Var;
        this.p.put(e44Var, Boolean.FALSE);
        return e44Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e44 e44Var = (e44) it;
            if (!e44Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) e44Var.next()).toString());
            if (e44Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
