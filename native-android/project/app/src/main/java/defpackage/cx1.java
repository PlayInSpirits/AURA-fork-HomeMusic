package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends o15 {
    public final o15 o;
    public Object p;
    public o15 q;

    public cx1(zw1 r2) {
        super(0);
        ly3 r3 = r2.r;
        jx1 r0 = r3.n;
        if (r0 != null) goto L5;
        r0 = r3.c();
        r3.n = r0;
    L5:
        this.o = r0.h();
        this.p = null;
        this.q = j22.r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.q.hasNext() == false) goto L5;
        return true;
    L5:
        if (this.o.hasNext() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.q.hasNext() == true) goto L5;
        Map.Entry r0 = (Map.Entry) this.o.next();
        this.p = r0.getKey();
        this.q = ((rw1) r0.getValue()).h();
    L5:
        Object r1 = this.p;
        Objects.requireNonNull(r1);
        return new sw1(r1, this.q.next());
    }
}
