package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends o15 {
    public int o;
    public Object p;
    public final /* synthetic */ Iterator q;

    public ex1(o15 o15Var) {
        super(0);
        this.q = o15Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o > 0 || this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.o <= 0) {
            p73 p73Var = (p73) this.q.next();
            this.p = p73Var.a;
            this.o = p73Var.a();
        }
        this.o--;
        Object obj = this.p;
        Objects.requireNonNull(obj);
        return obj;
    }
}
