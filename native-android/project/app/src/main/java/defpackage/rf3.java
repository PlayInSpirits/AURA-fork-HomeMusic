package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf3 implements Iterator, x32 {
    public final /* synthetic */ int n = 1;
    public final Iterator o;

    public rf3(lf3 lf3Var) {
        yx4[] yx4VarArr = new yx4[8];
        for (int i = 0; i < 8; i++) {
            yx4VarArr[i] = new ay4(this);
        }
        this.o = new pf3(lf3Var, yx4VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.n) {
            case 0:
                return ((pf3) this.o).p;
            default:
                return this.o.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.n) {
            case 0:
                return (Map.Entry) ((pf3) this.o).next();
            default:
                return (d45) this.o.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                ((pf3) this.o).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rf3(b45 b45Var) {
        this.o = b45Var.w.iterator();
    }
}
