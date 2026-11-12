package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw4 implements Iterator {
    public final Iterator n;

    public yw4(Iterator r1) {
        r1.getClass();
        this.n = r1;
    }

    public abstract Object a(Object r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.n.remove();
    }
}
