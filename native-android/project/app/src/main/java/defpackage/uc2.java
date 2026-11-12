package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 extends yw4 implements ListIterator {
    public final /* synthetic */ int o;
    public final /* synthetic */ AbstractList p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc2(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.o = i;
        this.p = abstractList;
    }

    @Override // defpackage.yw4
    public final Object a(Object obj) {
        int i = this.o;
        AbstractList abstractList = this.p;
        switch (i) {
            case 0:
                return ((vc2) abstractList).o.mo77apply(obj);
            default:
                return ((wc2) abstractList).o.mo77apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.n).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.n).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.n).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.n).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
