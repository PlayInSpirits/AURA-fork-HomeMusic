package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mn4 implements Collection, x32 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public mn4() {
        int i = fb3.a;
        this.o = new r03(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.n) {
            case 0:
                return ((r03) this.o).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.n) {
            case 0:
                ((r03) this.o).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                return ((r03) this.o).c(obj);
            default:
                return ((w03) this.o).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((r03) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((w03) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.n) {
            case 0:
                return ((r03) this.o).g == 0;
            default:
                return ((w03) this.o).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.n) {
            case 0:
                r03 r03Var = (r03) this.o;
                r03Var.getClass();
                return new bh1(new t03(r03Var));
            default:
                return si0.C(new q11(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.n) {
            case 0:
                return ((r03) this.o).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.n) {
            case 0:
                return ((r03) this.o).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.n) {
            case 0:
                return ((r03) this.o).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.n) {
            case 0:
                return ((r03) this.o).g;
            default:
                return ((w03) this.o).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.n) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return zz1.J(this, objArr);
    }

    public mn4(w03 w03Var) {
        w03Var.getClass();
        this.o = w03Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.n) {
            case 0:
                break;
        }
        return zz1.I(this);
    }
}
