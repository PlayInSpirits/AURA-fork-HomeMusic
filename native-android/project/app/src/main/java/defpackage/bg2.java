package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 extends w1 {
    public final /* synthetic */ int n;
    public final ag2 o;

    public /* synthetic */ bg2(ag2 ag2Var, int i) {
        this.n = i;
        this.o = ag2Var;
    }

    @Override // defpackage.w1
    public final int a() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o.v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.n) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.n;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.n) {
            case 0:
                this.o.clear();
                break;
            default:
                this.o.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.n;
        ag2 ag2Var = this.o;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ag2Var.getClass();
                int iG = ag2Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = ag2Var.o;
                objArr.getClass();
                return h12.c(objArr[iG], entry.getValue());
            default:
                return ag2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.n) {
            case 0:
                collection.getClass();
                return this.o.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        ag2 ag2Var = this.o;
        switch (i) {
            case 0:
                ag2Var.getClass();
                return new xf2(ag2Var, 0);
            default:
                ag2Var.getClass();
                return new xf2(ag2Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.n;
        ag2 ag2Var = this.o;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ag2Var.getClass();
                    ag2Var.c();
                    int iG = ag2Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = ag2Var.o;
                        objArr.getClass();
                        if (h12.c(objArr[iG], entry.getValue())) {
                            ag2Var.k(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                ag2Var.c();
                int iG2 = ag2Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                ag2Var.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.n;
        ag2 ag2Var = this.o;
        collection.getClass();
        switch (i) {
            case 0:
                ag2Var.c();
                break;
            default:
                ag2Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.n;
        ag2 ag2Var = this.o;
        collection.getClass();
        switch (i) {
            case 0:
                ag2Var.c();
                break;
            default:
                ag2Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
