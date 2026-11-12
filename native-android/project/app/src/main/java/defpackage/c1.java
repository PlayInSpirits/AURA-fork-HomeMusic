package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Iterator {
    public final Iterator n;
    public Object o;
    public Collection p;
    public Iterator q;
    public final /* synthetic */ q1 r;
    public final /* synthetic */ int s;

    public c1(q1 r1, int r2) {
        this.s = r2;
        this.r = r1;
        this.n = r1.r.entrySet().iterator();
        this.o = null;
        this.p = null;
        this.q = k22.n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n.hasNext() == false) goto L5;
        return true;
    L5:
        if (this.q.hasNext() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.q.hasNext() == true) goto L5;
        Map.Entry r0 = (Map.Entry) this.n.next();
        this.o = r0.getKey();
        Collection r1 = (Collection) r0.getValue();
        this.p = r1;
        this.q = r1.iterator();
    L5:
        Object r2 = this.o;
        Object r3 = this.q.next();
        switch(this.s) {
            case 0: goto L9;
            default: goto L8;
        };
    L9:
        return r3;
    L8:
        return new sw1(r2, r3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.q.remove();
        Collection r0 = this.p;
        Objects.requireNonNull(r0);
        if (r0.isEmpty() == false) goto L5;
        this.n.remove();
    L5:
        this.r.s--;
    }
}
