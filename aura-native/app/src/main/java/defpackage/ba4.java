package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ba4 implements Iterator, vd0, x32 {
    public ba4() {
        super();
    }

    public int n;
    public Object o;
    public Iterator p;
    public vd0 q;

    public final RuntimeException a() {
        int i = this.n;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.n);
    }

    public final void b(vd0 vd0Var, Object obj) {
        this.o = obj;
        this.n = 3;
        this.q = vd0Var;
        vd0Var.getClass();
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return q01.n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.n;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.p;
                it.getClass();
                if (it.hasNext()) {
                    this.n = 2;
                    return true;
                }
                this.p = null;
            }
            this.n = 5;
            vd0 vd0Var = this.q;
            vd0Var.getClass();
            this.q = null;
            vd0Var.resumeWith(j15.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            tb4.k();
            return null;
        }
        if (i == 2) {
            this.n = 1;
            Iterator it = this.p;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.n = 0;
        Object obj = this.o;
        this.o = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        kb4.X(obj);
        this.n = 4;
    }
}
