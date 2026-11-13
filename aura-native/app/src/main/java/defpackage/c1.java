package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c1 implements Iterator {
    public final Iterator n;
    public Object o = null;
    public Collection p = null;
    public Iterator q = k22.n;
    public final /* synthetic */ q1 r;
    public final /* synthetic */ int s;

    public c1(q1 q1Var, int i) {
        this.s = i;
        this.r = q1Var;
        this.n = q1Var.r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n.hasNext() || this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.q.hasNext()) {
            Map.Entry entry = (Map.Entry) this.n.next();
            this.o = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.p = collection;
            this.q = collection.iterator();
        }
        Object obj = this.o;
        Object next = this.q.next();
        switch (this.s) {
            case 0:
                return next;
            default:
                return new sw1(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.q.remove();
        Collection collection = this.p;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.n.remove();
        }
        q1 q1Var = this.r;
        q1Var.s--;
    }
}
