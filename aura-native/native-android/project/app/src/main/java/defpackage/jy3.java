package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jy3 extends jx1 {
    public final transient bx1 q;
    public final transient ky3 r;

    public jy3(bx1 bx1Var, ky3 ky3Var) {
        this.q = bx1Var;
        this.r = ky3Var;
    }

    @Override // defpackage.jx1, defpackage.rw1
    public final yw1 a() {
        return this.r;
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        return this.r.b(i, objArr);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.q.get(obj) != null;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return this.r.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.q.size();
    }
}
