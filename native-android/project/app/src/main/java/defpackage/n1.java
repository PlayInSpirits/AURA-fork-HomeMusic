package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends e1 implements ListIterator {
    public final /* synthetic */ o1 r;

    public n1(o1 r2, int r3) {
        this.r = r2;
        super(r2, ((List) r2.o).listIterator(r3));
    }

    @Override // java.util.ListIterator
    public final void add(Object r3) {
        o1 r0 = this.r;
        boolean r1 = r0.isEmpty();
        c().add(r3);
        r0.s.s++;
        if (r1 == false) goto L6;
        r0.a();
        return;
    }

    public final ListIterator c() {
        b();
        return (ListIterator) this.o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        c().set(r1);
    }

    public n1(o1 r1) {
        this.r = r1;
        super(r1);
    }
}
