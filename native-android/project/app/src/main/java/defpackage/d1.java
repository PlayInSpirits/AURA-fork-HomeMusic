package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends jb4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ AbstractMap o;

    public /* synthetic */ d1(AbstractMap r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    public final boolean a(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L15;
        Map.Entry r4 = (Map.Entry) r3;
        Object r0 = r4.getKey();
        Map r1 = b();
        r1.getClass();
        Object r2 = r1.get(r0);     // Catch: Throwable -> L7
    L9:
        if (si0.s(r2, r4.getValue()) == false) goto L20;
        if (r2 == null) goto L12;
        return true;
    L12:
        if (b().containsKey(r0) == false) goto L21;
        return true;
    L21:
        return false;
    L20:
        return false;
    L7:
        r2 = null;
        goto L9
    L15:
        return false;
    }

    public final Map b() {
        int r0 = this.n;
        AbstractMap r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (kg2) r1;
    L7:
        return (f1) r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Set r1 = ((f1) this.o).p.entrySet();
        r1.getClass();
        return r1.contains(r2);
    L9:
        return false;
    L5:
        return a(r2);
    }

    public final boolean d(Object r2) {
        if (contains(r2) == true) goto L5;
        return false;
    L5:
        if ((r2 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return b().keySet().remove(((Map.Entry) r2).getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int r0 = this.n;
        AbstractMap r3 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        kg2 r4 = (kg2) r3;
        Iterator r1 = r4.n.entrySet().iterator();
        jg2 r5 = r4.o;
        r5.getClass();
        return new i22(r1, new pz1(3, r5));
    L7:
        return new e1((f1) r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return d(r2);
    L7:
        if (contains(r2) == true) goto L9;
        return false;
    L9:
        Map.Entry r3 = (Map.Entry) r2;
        Objects.requireNonNull(r3);
        q1 r1 = ((f1) this.o).q;
        Object r4 = r3.getKey();
        Map r0 = r1.r;
        r0.getClass();
        Object r5 = r0.remove(r4);     // Catch: Throwable -> L12
    L13:
        Collection r6 = (Collection) r5;
        if (r6 == null) goto L16;
        int r7 = r6.size();
        r6.clear();
        r1.s -= r7;
    L16:
        return true;
    L12:
        r5 = null;
        goto L13
    }

    @Override // defpackage.jb4, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r3) {
        r3.getClass();     // Catch: UnsupportedOperationException -> L4
        return j51.L(this, r3);
    L4:
        Iterator r4 = r3.iterator();
        boolean r0 = false;
    L6:
        if (r4.hasNext() == false) goto L8;
        r0 = r0 | remove(r4.next());
        goto L6
    L8:
        return r0;
    }

    @Override // defpackage.jb4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r7) {
        r7.getClass();     // Catch: UnsupportedOperationException -> L4
        return super.retainAll(r7);
    L4:
        int r0 = r7.size();
        if (r0 >= 3) goto L8;
        uc5.f(r0, "expectedSize");
        int r1 = r0 + 1;
    L11:
        HashSet r2 = new HashSet(r1);
        Iterator r8 = r7.iterator();
    L13:
        if (r8.hasNext() == false) goto L20;
        Object r3 = r8.next();
        if (contains(r3) == false) goto L13;
        if ((r3 instanceof Map.Entry) == false) goto L13;
        r2.add(((Map.Entry) r3).getKey());
        goto L13
    L20:
        return b().keySet().retainAll(r2);
    L8:
        if (r0 >= 1073741824) goto L10;
        r1 = (int) Math.ceil(((double) r0) / 0.75d);
        goto L11
    L10:
        r1 = Integer.MAX_VALUE;
        goto L11
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
