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

    public q1(Map r2) {
        rr2.l(r2.isEmpty());
        this.r = r2;
    }

    @Override // defpackage.qz2
    public final void clear() {
        Map r0 = this.r;
        Iterator r1 = r0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((Collection) r1.next()).clear();
        goto L4
    L6:
        r0.clear();
        this.s = 0;
    }

    @Override // defpackage.u1
    public Map e() {
        return new f1(this, this.r);
    }

    @Override // defpackage.u1
    public final Collection f() {
        if ((this instanceof nl1) == false) goto L7;
        return new t1(0, this);
    L7:
        return new s1(0, this);
    }

    @Override // defpackage.u1
    public Set g() {
        return new g1(this, this.r);
    }

    @Override // defpackage.qz2
    public Collection get(Object r2) {
        Collection r0 = (Collection) this.r.get(r2);
        if (r0 != null) goto L6;
        r0 = i();
    L6:
        return k(r2, r0);
    }

    @Override // defpackage.u1
    public final Iterator h() {
        return new c1(this, 1);
    }

    public abstract Collection i();

    public boolean j(Object r4, Object r5) {
        Map r0 = this.r;
        Collection r1 = (Collection) r0.get(r4);
        if (r1 != null) goto L11;
        Collection r2 = i();
        if (r2.add(r5) == false) goto L9;
        this.s++;
        r0.put(r4, r2);
        return true;
    L9:
        throw new AssertionError("New Collection violated the Collection spec");
    L11:
        if (r1.add(r5) == false) goto L14;
        this.s++;
        return true;
    L14:
        return false;
    }

    public abstract Collection k(Object r1, Collection r2);

    @Override // defpackage.qz2
    public final int size() {
        return this.s;
    }
}
