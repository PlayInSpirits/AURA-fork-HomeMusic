package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends a1 {
    public abstract y1 b(int i, Object obj);

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.y, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract y1 d(Object obj);

    public y1 e(Collection collection) {
        xf3 xf3VarF = f();
        xf3VarF.addAll(collection);
        return xf3VarF.d();
    }

    public abstract xf3 f();

    public abstract y1 g(x1 x1Var);

    public abstract y1 h(int i);

    public abstract y1 i(int i, Object obj);

    @Override // defpackage.a1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int i, int i2) {
        return new xw1(this, i, i2);
    }
}
