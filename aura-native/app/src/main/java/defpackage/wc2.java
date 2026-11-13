package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wc2 extends AbstractSequentialList implements Serializable {
    public final List n;
    public final eg1 o;

    public wc2(eg1 eg1Var, List list) {
        list.getClass();
        this.n = list;
        this.o = eg1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new uc2(this, this.n.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.n.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n.size();
    }
}
