package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends AbstractCollection implements Collection, y32 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ cg2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.n) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.n) {
            case 0:
                ((ag2) this.o).clear();
                break;
            default:
                ((lf3) this.o).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                return ((ag2) this.o).containsValue(obj);
            default:
                return ((lf3) this.o).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.n) {
            case 0:
                return ((ag2) this.o).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ag2 ag2Var = (ag2) obj;
                ag2Var.getClass();
                return new xf2(ag2Var, 2);
            default:
                lf3 lf3Var = (lf3) obj;
                yx4[] yx4VarArr = new yx4[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    yx4VarArr[i2] = new zx4(2);
                }
                return new sf3(lf3Var, yx4VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.n) {
            case 0:
                ag2 ag2Var = (ag2) this.o;
                ag2Var.c();
                int iH = ag2Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                ag2Var.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.n) {
            case 0:
                collection.getClass();
                ((ag2) this.o).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.n) {
            case 0:
                collection.getClass();
                ((ag2) this.o).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.n) {
            case 0:
                return ((ag2) this.o).v;
            default:
                return ((lf3) this.o).r;
        }
    }
}
