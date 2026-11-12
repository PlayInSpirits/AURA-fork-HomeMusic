package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends m1 implements List {
    public final /* synthetic */ q1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, Object obj, List list, m1 m1Var) {
        super(q1Var, obj, list, m1Var);
        this.s = q1Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.o.isEmpty();
        ((List) this.o).add(i, obj);
        this.s.s++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.o).addAll(i, collection);
        if (zAddAll) {
            this.s.s += this.o.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.o).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.o).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.o).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new n1(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.o).remove(i);
        this.s.s--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.o).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.o).subList(i, i2);
        m1 m1Var = this.p;
        if (m1Var == null) {
            m1Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        q1 q1Var = this.s;
        Object obj = this.n;
        return z ? new j1(q1Var, obj, listSubList, m1Var) : new o1(q1Var, obj, listSubList, m1Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new n1(this, i);
    }
}
