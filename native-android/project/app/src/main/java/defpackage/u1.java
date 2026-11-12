package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 implements qz2 {
    public transient Collection n;
    public transient Set o;
    public transient Collection p;
    public transient Map q;

    @Override // defpackage.qz2
    public Collection a() {
        Collection collection = this.n;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.n = collectionF;
        return collectionF;
    }

    @Override // defpackage.qz2
    public Map b() {
        Map map = this.q;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.q = mapE;
        return mapE;
    }

    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qz2) {
            return b().equals(((qz2) obj).b());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Set g();

    public abstract Iterator h();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // defpackage.qz2
    public Set keySet() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.o = setG;
        return setG;
    }

    @Override // defpackage.qz2
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
