package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends u1 implements Serializable {
    public final transient Map r;
    public transient int s;

    public q1(Map map) {
        rr2.l(map.isEmpty());
        this.r = map;
    }

    @Override // defpackage.qz2
    public final void clear() {
        Map map = this.r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.s = 0;
    }

    @Override // defpackage.u1
    public Map e() {
        return new f1(this, this.r);
    }

    @Override // defpackage.u1
    public final Collection f() {
        return this instanceof nl1 ? new t1(0, this) : new s1(0, this);
    }

    @Override // defpackage.u1
    public Set g() {
        return new g1(this, this.r);
    }

    @Override // defpackage.qz2
    public Collection get(Object obj) {
        Collection collectionI = (Collection) this.r.get(obj);
        if (collectionI == null) {
            collectionI = i();
        }
        return k(obj, collectionI);
    }

    @Override // defpackage.u1
    public final Iterator h() {
        return new c1(this, 1);
    }

    public abstract Collection i();

    public boolean j(Object obj, Object obj2) {
        Map map = this.r;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.s++;
            return true;
        }
        Collection collectionI = i();
        if (!collectionI.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.s++;
        map.put(obj, collectionI);
        return true;
    }

    public abstract Collection k(Object obj, Collection collection);

    @Override // defpackage.qz2
    public final int size() {
        return this.s;
    }
}
