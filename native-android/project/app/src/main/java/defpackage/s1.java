package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class s1 extends AbstractCollection {
    public final /* synthetic */ int n;
    public final Object o;

    public s1(AbstractMap r2) {
        this.n = 3;
        this.o = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((AbstractMap) r1).clear();
        return;
    L6:
        ((p60) r1).clear();
        return;
    L8:
        ((q1) r1).clear();
        return;
    L10:
        ((u1) r1).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object r3) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L5;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.contains(r3);
    L7:
        return ((AbstractMap) r1).containsValue(r3);
    L9:
        return ((q1) r1).d(r3);
    L11:
        if ((r3 instanceof Map.Entry) == false) goto L13;
        Map.Entry r4 = (Map.Entry) r3;
        return ((u1) r1).c(r4.getKey(), r4.getValue());
    L13:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch(this.n) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.isEmpty();
    L7:
        return ((AbstractMap) this.o).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        p60 r3 = (p60) r2;
        Map r1 = r3.c();
        if (r1 == null) goto L10;
        return r1.values().iterator();
    L10:
        return new m60(r3, 2);
    L5:
        return new ig2(((AbstractMap) r2).entrySet().iterator());
    L12:
        return new c1((q1) r2, 0);
    L14:
        return ((u1) r2).h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object r5) {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L17;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        AbstractMap r3 = (AbstractMap) r2;
        return super.remove(r5);
    L9:
        Iterator r4 = r3.entrySet().iterator();
    L11:
        if (r4.hasNext() == false) goto L26;
        Map.Entry r1 = (Map.Entry) r4.next();
        if (si0.s(r5, r1.getValue()) == false) goto L11;
        r3.remove(r1.getKey());
        return true;
    L26:
        return false;
    L5:
        return super.remove(r5);
    L17:
        if ((r5 instanceof Map.Entry) == false) goto L27;
        Map.Entry r6 = (Map.Entry) r5;
        return ((u1) r2).remove(r6.getKey(), r6.getValue());
    L27:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection r5) {
        switch(this.n) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        AbstractMap r0 = (AbstractMap) this.o;
        r5.getClass();     // Catch: UnsupportedOperationException -> L9
        return super.removeAll(r5);
    L9:
        HashSet r4 = new HashSet();
        Iterator r1 = r0.entrySet().iterator();
    L11:
        if (r1.hasNext() == false) goto L16;
        Map.Entry r2 = (Map.Entry) r1.next();
        if (r5.contains(r2.getValue()) == false) goto L11;
        r4.add(r2.getKey());
        goto L11
    L16:
        return r0.keySet().removeAll(r4);
    L5:
        return super.removeAll(r5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection r5) {
        switch(this.n) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        AbstractMap r0 = (AbstractMap) this.o;
        r5.getClass();     // Catch: UnsupportedOperationException -> L9
        return super.retainAll(r5);
    L9:
        HashSet r4 = new HashSet();
        Iterator r1 = r0.entrySet().iterator();
    L11:
        if (r1.hasNext() == false) goto L16;
        Map.Entry r2 = (Map.Entry) r1.next();
        if (r5.contains(r2.getValue()) == false) goto L11;
        r4.add(r2.getKey());
        goto L11
    L16:
        return r0.keySet().retainAll(r4);
    L5:
        return super.retainAll(r5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return ((AbstractMap) r1).size();
    L7:
        return ((p60) r1).size();
    L9:
        return ((q1) r1).s;
    L11:
        return ((u1) r1).size();
    }

    public /* synthetic */ s1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
