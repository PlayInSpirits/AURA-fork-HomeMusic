package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends m1 implements List {
    public final /* synthetic */ q1 s;

    public o1(q1 r1, Object r2, List r3, m1 r4) {
        this.s = r1;
        super(r1, r2, r3, r4);
    }

    @Override // java.util.List
    public final void add(int r3, Object r4) {
        b();
        boolean r0 = this.o.isEmpty();
        ((List) this.o).add(r3, r4);
        this.s.s++;
        if (r0 == false) goto L6;
        a();
        return;
    }

    @Override // java.util.List
    public final boolean addAll(int r4, Collection r5) {
        if (r5.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r6 = ((List) this.o).addAll(r4, r5);
        if (r6 == false) goto L11;
        this.s.s += this.o.size() - r0;
        if (r0 != 0) goto L11;
        a();
    L11:
        return r6;
    }

    @Override // java.util.List
    public final Object get(int r1) {
        b();
        return ((List) this.o).get(r1);
    }

    @Override // java.util.List
    public final int indexOf(Object r1) {
        b();
        return ((List) this.o).indexOf(r1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r1) {
        b();
        return ((List) this.o).lastIndexOf(r1);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new n1(this);
    }

    @Override // java.util.List
    public final Object remove(int r3) {
        b();
        Object r4 = ((List) this.o).remove(r3);
        this.s.s--;
        d();
        return r4;
    }

    @Override // java.util.List
    public final Object set(int r1, Object r2) {
        b();
        return ((List) this.o).set(r1, r2);
    }

    @Override // java.util.List
    public final List subList(int r3, int r4) {
        b();
        List r5 = ((List) this.o).subList(r3, r4);
        m1 r6 = this.p;
        if (r6 != null) goto L5;
        r6 = this;
    L5:
        boolean r0 = r5 instanceof RandomAccess;
        q1 r1 = this.s;
        Object r2 = this.n;
        if (r0 == false) goto L10;
        return new j1(r1, r2, r5, r6);
    L10:
        return new o1(r1, r2, r5, r6);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        b();
        return new n1(this, r2);
    }
}
