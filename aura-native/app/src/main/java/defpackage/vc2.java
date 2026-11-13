/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.eg1;
import defpackage.uc2;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class vc2
extends AbstractList
implements RandomAccess,
Serializable {
    public final List n;
    public final eg1 o;

    public vc2(eg1 eg12, List list) {
        list.getClass();
        this.n = list;
        this.o = eg12;
    }

    @Override
    public final Object get(int n16) {
        Object e16 = this.n.get(n16);
        return this.o.apply(e16);
    }

    @Override
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public final ListIterator listIterator(int n16) {
        return new uc2(this, this.n.listIterator(n16), 0);
    }

    @Override
    public final Object remove(int n16) {
        Object e16 = this.n.remove(n16);
        return this.o.apply(e16);
    }

    @Override
    public final void removeRange(int n16, int n17) {
        this.n.subList(n16, n17).clear();
    }

    @Override
    public final int size() {
        return this.n.size();
    }
}

