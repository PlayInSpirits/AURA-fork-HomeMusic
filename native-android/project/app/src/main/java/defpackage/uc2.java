package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 extends yw4 implements ListIterator {
    public final /* synthetic */ int o;
    public final /* synthetic */ AbstractList p;

    public /* synthetic */ uc2(AbstractList r1, ListIterator r2, int r3) {
        this.o = r3;
        this.p = r1;
        super(r2);
    }

    @Override // defpackage.yw4
    public final Object a(Object r2) {
        int r0 = this.o;
        AbstractList r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((wc2) r1).o.mo77apply(r2);
    L7:
        return ((vc2) r1).o.mo77apply(r2);
    }

    @Override // java.util.ListIterator
    public final void add(Object r1) {
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
    public final void set(Object r1) {
        throw new UnsupportedOperationException();
    }
}
