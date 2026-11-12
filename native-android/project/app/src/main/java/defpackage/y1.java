package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends a1 {
    public abstract y1 b(int r1, Object r2);

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        if (indexOf(r1) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.y, java.util.Collection
    public final boolean containsAll(Collection r3) {
        Collection r4 = r3;
        if ((r4 instanceof Collection) == true) goto L5;
    L7:
        Iterator r5 = r4.iterator();
    L9:
        if (r5.hasNext() == false) goto L14;
        if (contains(r5.next()) == true) goto L9;
        return false;
    L14:
        return true;
    L5:
        if (r4.isEmpty() == false) goto L7;
        return true;
    }

    public abstract y1 d(Object r1);

    public y1 e(Collection r1) {
        xf3 r0 = f();
        r0.addAll(r1);
        return r0.d();
    }

    public abstract xf3 f();

    public abstract y1 g(x1 r1);

    public abstract y1 h(int r1);

    public abstract y1 i(int r1, Object r2);

    @Override // defpackage.a1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int r2, int r3) {
        return new xw1(this, r2, r3);
    }
}
