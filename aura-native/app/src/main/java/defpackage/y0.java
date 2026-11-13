package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y0 extends x0 implements ListIterator {
    public final /* synthetic */ a1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, int i) {
        super(0, a1Var);
        this.q = a1Var;
        int a = a1Var.a();
        if (i < 0 || i > a) {
            kf2.h(xa3.e(i, a, "index: ", ", size: "));
            throw null;
        }
        this.o = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.o > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            tb4.k();
            return null;
        }
        int i = this.o - 1;
        this.o = i;
        return this.q.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
