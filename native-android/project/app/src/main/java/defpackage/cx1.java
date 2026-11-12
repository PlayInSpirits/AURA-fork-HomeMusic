package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends o15 {
    public final o15 o;
    public Object p;
    public o15 q;

    public cx1(zw1 zw1Var) {
        super(0);
        ly3 ly3Var = zw1Var.r;
        jx1 jx1VarC = ly3Var.n;
        if (jx1VarC == null) {
            jx1VarC = ly3Var.c();
            ly3Var.n = jx1VarC;
        }
        this.o = jx1VarC.iterator();
        this.p = null;
        this.q = j22.r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext() || this.o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.q.hasNext()) {
            Map.Entry entry = (Map.Entry) this.o.next();
            this.p = entry.getKey();
            this.q = ((rw1) entry.getValue()).iterator();
        }
        Object obj = this.p;
        Objects.requireNonNull(obj);
        return new sw1(obj, this.q.next());
    }
}
