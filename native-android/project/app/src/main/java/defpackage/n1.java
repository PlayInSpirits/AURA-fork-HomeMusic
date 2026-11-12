package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends e1 implements ListIterator {
    public final /* synthetic */ o1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, int i) {
        super(o1Var, ((List) o1Var.o).listIterator(i));
        this.r = o1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        o1 o1Var = this.r;
        boolean zIsEmpty = o1Var.isEmpty();
        c().add(obj);
        o1Var.s.s++;
        if (zIsEmpty) {
            o1Var.a();
        }
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
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var) {
        super(o1Var);
        this.r = o1Var;
    }
}
