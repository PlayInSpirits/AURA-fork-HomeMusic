package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 extends w1 {
    public final /* synthetic */ int n;
    public final ag2 o;

    public /* synthetic */ bg2(ag2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.w1
    public final int a() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.v;
    L7:
        return this.o.v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r1) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ((Map.Entry) r1).getClass();
        throw new UnsupportedOperationException();
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r1) {
        int r0 = this.n;
        r1.getClass();
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException();
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.o.clear();
        return;
    L6:
        this.o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        int r0 = this.n;
        ag2 r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.containsKey(r3);
    L7:
        if ((r3 instanceof Map.Entry) == false) goto L14;
        Map.Entry r4 = (Map.Entry) r3;
        r2.getClass();
        int r1 = r2.g(r4.getKey());
        if (r1 < 0) goto L15;
        Object[] r5 = r2.o;
        r5.getClass();
        return h12.c(r5[r1], r4.getValue());
    L15:
        return false;
    L14:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        r2.getClass();
        return this.o.e(r2);
    L5:
        return super.containsAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.isEmpty();
    L7:
        return this.o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int r0 = this.n;
        ag2 r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.getClass();
        return new xf2(r2, 1);
    L6:
        r2.getClass();
        return new xf2(r2, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r5) {
        int r0 = this.n;
        ag2 r4 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        r4.c();
        int r6 = r4.g(r5);
        if (r6 < 0) goto L20;
        r4.k(r6);
        return true;
    L20:
        return false;
    L10:
        if ((r5 instanceof Map.Entry) == false) goto L21;
        Map.Entry r7 = (Map.Entry) r5;
        r4.getClass();
        r4.c();
        int r1 = r4.g(r7.getKey());
        if (r1 < 0) goto L21;
        Object[] r3 = r4.o;
        r3.getClass();
        if (h12.c(r3[r1], r7.getValue()) == false) goto L21;
        r4.k(r1);
        return true;
    L21:
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r3) {
        int r0 = this.n;
        ag2 r1 = this.o;
        r3.getClass();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.c();
        return super.removeAll(r3);
    L6:
        r1.c();
        return super.removeAll(r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r3) {
        int r0 = this.n;
        ag2 r1 = this.o;
        r3.getClass();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.c();
        return super.retainAll(r3);
    L6:
        r1.c();
        return super.retainAll(r3);
    }
}
