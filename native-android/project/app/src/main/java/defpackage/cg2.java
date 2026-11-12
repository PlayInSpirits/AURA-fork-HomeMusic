package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends AbstractCollection implements Collection, y32 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ cg2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException();
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        r2.getClass();
        throw new UnsupportedOperationException();
    L5:
        return super.addAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((lf3) this.o).clear();
        return;
    L6:
        ((ag2) this.o).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((lf3) this.o).containsValue(r2);
    L7:
        return ((ag2) this.o).containsValue(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.isEmpty();
    L7:
        return ((ag2) this.o).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int r0 = this.n;
        Object r6 = this.o;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        lf3 r7 = (lf3) r6;
        yx4[] r3 = new yx4[8];
        int r4 = 0;
    L5:
        if (r4 >= 8) goto L8;
        r3[r4] = new zx4(2);
        r4 = r4 + 1;
        goto L5
    L8:
        return new sf3(r7, r3);
    L9:
        ag2 r8 = (ag2) r6;
        r8.getClass();
        return new xf2(r8, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ag2 r1 = (ag2) this.o;
        r1.c();
        int r3 = r1.h(r2);
        if (r3 >= 0) goto L9;
        return false;
    L9:
        r1.k(r3);
        return true;
    L5:
        return super.remove(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        r2.getClass();
        ((ag2) this.o).c();
        return super.removeAll(r2);
    L5:
        return super.removeAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        r2.getClass();
        ((ag2) this.o).c();
        return super.retainAll(r2);
    L5:
        return super.retainAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L7;
        };
    L7:
        return ((lf3) this.o).r;
    L6:
        return ((ag2) this.o).v;
    }
}
